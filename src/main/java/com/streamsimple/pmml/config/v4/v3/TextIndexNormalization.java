/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.pmml.config.v4.v3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}TableLocator"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}InlineTable"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="inField" type="{http://www.w3.org/2001/XMLSchema}string" default="string" />
 *       &lt;attribute name="outField" type="{http://www.w3.org/2001/XMLSchema}string" default="stem" />
 *       &lt;attribute name="regexField" type="{http://www.w3.org/2001/XMLSchema}string" default="regex" />
 *       &lt;attribute name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isCaseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maxLevenshteinDistance" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="wordSeparatorCharacterRE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tokenize" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "tableLocator",
    "inlineTable"})
@XmlRootElement(name = "TextIndexNormalization")
public class TextIndexNormalization
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "TableLocator")
  protected TableLocator tableLocator;
  @XmlElement(name = "InlineTable")
  protected InlineTable inlineTable;
  @XmlAttribute(name = "inField")
  protected String inField;
  @XmlAttribute(name = "outField")
  protected String outField;
  @XmlAttribute(name = "regexField")
  protected String regexField;
  @XmlAttribute(name = "recursive")
  protected Boolean recursive;
  @XmlAttribute(name = "isCaseSensitive")
  protected Boolean isCaseSensitive;
  @XmlAttribute(name = "maxLevenshteinDistance")
  protected BigInteger maxLevenshteinDistance;
  @XmlAttribute(name = "wordSeparatorCharacterRE")
  protected String wordSeparatorCharacterRE;
  @XmlAttribute(name = "tokenize")
  protected Boolean tokenize;

  /**
   * Gets the value of the extension property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the extension property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getExtension().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Extension }
   */
  public List<Extension> getExtension()
  {
    if (extension == null) {
      extension = new ArrayList<Extension>();
    }
    return this.extension;
  }

  /**
   * Gets the value of the tableLocator property.
   *
   * @return possible object is
   * {@link TableLocator }
   */
  public TableLocator getTableLocator()
  {
    return tableLocator;
  }

  /**
   * Sets the value of the tableLocator property.
   *
   * @param value allowed object is
   *              {@link TableLocator }
   */
  public void setTableLocator(TableLocator value)
  {
    this.tableLocator = value;
  }

  /**
   * Gets the value of the inlineTable property.
   *
   * @return possible object is
   * {@link InlineTable }
   */
  public InlineTable getInlineTable()
  {
    return inlineTable;
  }

  /**
   * Sets the value of the inlineTable property.
   *
   * @param value allowed object is
   *              {@link InlineTable }
   */
  public void setInlineTable(InlineTable value)
  {
    this.inlineTable = value;
  }

  /**
   * Gets the value of the inField property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getInField()
  {
    if (inField == null) {
      return "string";
    } else {
      return inField;
    }
  }

  /**
   * Sets the value of the inField property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setInField(String value)
  {
    this.inField = value;
  }

  /**
   * Gets the value of the outField property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getOutField()
  {
    if (outField == null) {
      return "stem";
    } else {
      return outField;
    }
  }

  /**
   * Sets the value of the outField property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setOutField(String value)
  {
    this.outField = value;
  }

  /**
   * Gets the value of the regexField property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getRegexField()
  {
    if (regexField == null) {
      return "regex";
    } else {
      return regexField;
    }
  }

  /**
   * Sets the value of the regexField property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setRegexField(String value)
  {
    this.regexField = value;
  }

  /**
   * Gets the value of the recursive property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public boolean isRecursive()
  {
    if (recursive == null) {
      return false;
    } else {
      return recursive;
    }
  }

  /**
   * Sets the value of the recursive property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setRecursive(Boolean value)
  {
    this.recursive = value;
  }

  /**
   * Gets the value of the isCaseSensitive property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsCaseSensitive()
  {
    return isCaseSensitive;
  }

  /**
   * Sets the value of the isCaseSensitive property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsCaseSensitive(Boolean value)
  {
    this.isCaseSensitive = value;
  }

  /**
   * Gets the value of the maxLevenshteinDistance property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getMaxLevenshteinDistance()
  {
    return maxLevenshteinDistance;
  }

  /**
   * Sets the value of the maxLevenshteinDistance property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setMaxLevenshteinDistance(BigInteger value)
  {
    this.maxLevenshteinDistance = value;
  }

  /**
   * Gets the value of the wordSeparatorCharacterRE property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getWordSeparatorCharacterRE()
  {
    return wordSeparatorCharacterRE;
  }

  /**
   * Sets the value of the wordSeparatorCharacterRE property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setWordSeparatorCharacterRE(String value)
  {
    this.wordSeparatorCharacterRE = value;
  }

  /**
   * Gets the value of the tokenize property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isTokenize()
  {
    return tokenize;
  }

  /**
   * Sets the value of the tokenize property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setTokenize(Boolean value)
  {
    this.tokenize = value;
  }

}
