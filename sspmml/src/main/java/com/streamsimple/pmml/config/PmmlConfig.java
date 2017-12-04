/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.pmml.config;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.streamsimple.javautil.err.ReturnError;
import com.streamsimple.javautil.err.ReturnErrorImpl;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.commons.lang3.tuple.Pair;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class PmmlConfig
{
  private com.streamsimple.pmml.config.v4.v3.PMML pmml;

  protected PmmlConfig(com.streamsimple.pmml.config.v4.v3.PMML pmml)
  {
    this.pmml = Preconditions.checkNotNull(pmml);
  }

  public enum Version
  {
    V4_3("4.3", "schema/pmmlv4v3.xsd", com.streamsimple.pmml.config.v4.v3.PMML.class);

    private final String version;
    private final String xsdPath;
    private final Class configClass;

    Version(final String version, final String xsdPath, final Class configClass)
    {
      this.version = Preconditions.checkNotNull(version);
      this.xsdPath = Preconditions.checkNotNull(xsdPath);
      this.configClass = Preconditions.checkNotNull(configClass);
    }

    public String getVersion()
    {
      return version;
    }

    public Class getConfigClass()
    {
      return configClass;
    }

    public static Version getVersion(final String versionString)
    {
      for (final Version version : Version.values()) {
        if (version.getVersion().equals(versionString)) {
          return version;
        }
      }

      return null;
    }

    public static List<String> getVersionStrings()
    {
      List<String> versionStrings = Lists.newArrayList();

      for (Version version : Version.values()) {
        versionStrings.add(version.getVersion());
      }

      return versionStrings;
    }

    public String getXsdPath()
    {
      return xsdPath;
    }
  }

  public static class Builder
  {
    public static final String XML_NODE_PMML = "PMML";
    public static final String XML_ATTRIBUTE_VERSION = "version";

    public Builder()
    {
    }

    public Pair<PmmlConfig, ReturnError> build(File xmlFile)
    {
      final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      final DocumentBuilder dBuilder;

      try {
        dBuilder = dbFactory.newDocumentBuilder();
      } catch (ParserConfigurationException e) {
        // This should never happens
        throw new RuntimeException(e);
      }

      final Document doc;

      try {
        doc = dBuilder.parse(xmlFile);
      } catch (SAXException e) {
        final String message = String.format("Error parsing xml in %s:\n%s", xmlFile.getAbsolutePath(), e.getMessage());
        return Pair.of(null, (ReturnError)new ReturnErrorImpl(message));
      } catch (IOException e) {
        final String message = String.format("Error reading file %s:\n%s", xmlFile.getAbsolutePath(), e.getMessage());
        return Pair.of(null, (ReturnError)new ReturnErrorImpl(message));
      }

      // Getting the version of PMML

      final Element rootElement = doc.getDocumentElement();
      final String rootName = rootElement.getNodeName();
      rootElement.normalize();

      if (!rootElement.getNodeName().equals(XML_NODE_PMML)) {
        final String message = String.format("Expected the root element to be (%s) but found (%s)",
            XML_NODE_PMML, rootName);
        return Pair.of(null, (ReturnError)new ReturnErrorImpl(message));
      }

      final String versionString = rootElement.getAttribute(XML_ATTRIBUTE_VERSION);
      final Version version = PmmlConfig.Version.getVersion(versionString);

      if (version == null) {
        final String message = String.format("The version found (%s) is not one of our supported versions: %s",
            versionString, Version.getVersionStrings());
        return Pair.of(null, (ReturnError)new ReturnErrorImpl(message));
      }

      // Validating the given XML

      final SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
      final Schema schema;

      try {
        schema = factory.newSchema(PmmlConfig.class
            .getClassLoader()
            .getResource(version.getXsdPath()));
      } catch (SAXException e) {
        // This should never happen
        throw new RuntimeException(e);
      }

      final Validator validator = schema.newValidator();
      final ValidationErrorHandler errorHandler = new ValidationErrorHandler();
      validator.setErrorHandler(errorHandler);

      try {
        validator.validate(new StreamSource(new FileReader(xmlFile)));
      } catch (SAXException e) {
        final String message = String.format("Error validating pmml in %s:\n%s",
            xmlFile.getAbsolutePath(), e.getMessage());
        return Pair.of(null, (ReturnError)new ReturnErrorImpl(message));
      } catch (IOException e) {
        final String message = String.format("Error reading file %s:\n%s",
            xmlFile.getAbsolutePath(), e.getMessage());
        return Pair.of(null, (ReturnError)new ReturnErrorImpl(message));
      }

      if (errorHandler.hasErrors()) {
        return Pair.of(null, (ReturnError)new ReturnErrorImpl(errorHandler.getErrorString()));
      }

      // Reading XML data

      final PMMLData pmmlData;

      try {
        JAXBContext jaxbContext = JAXBContext.newInstance(version.getConfigClass());
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        pmmlData = (PMMLData)jaxbUnmarshaller.unmarshal(xmlFile);
      } catch (JAXBException e) {
        final String message = String.format("Xml error when parsing the contents of %s:\n%s",
            xmlFile.getAbsolutePath(), e.getMessage());
        return Pair.of(null, (ReturnError)new ReturnErrorImpl(message));
      }

      // Upgrade to mode recent version

      PMMLData currentPMMData = pmmlData;
      PMMLData tmpPMMLData;

      while ((tmpPMMLData = currentPMMData.upgrade()) != null) {
        currentPMMData = tmpPMMLData;
      }

      return Pair.of(new PmmlConfig((com.streamsimple.pmml.config.v4.v3.PMML)currentPMMData), null);
    }

    private static class ValidationErrorHandler implements ErrorHandler
    {
      private List<SAXParseException> exceptions = Lists.newArrayList();

      @Override
      public void warning(SAXParseException exception) throws SAXException
      {
        // Do nothing
      }

      @Override
      public void error(SAXParseException exception) throws SAXException
      {
        exceptions.add(exception);
      }

      @Override
      public void fatalError(SAXParseException exception) throws SAXException
      {
        exceptions.add(exception);
      }

      public boolean hasErrors()
      {
        return !exceptions.isEmpty();
      }

      public String getErrorString()
      {
        Preconditions.checkState(hasErrors());

        final StringBuilder sb = new StringBuilder();
        sb.append("Validation errors:");

        for (SAXParseException parseException: exceptions) {
          sb.append("\n");
          sb.append(parseException.getMessage());
        }

        return sb.toString();
      }
    }
  }
}
