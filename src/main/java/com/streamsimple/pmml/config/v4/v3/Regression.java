/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.pmml.config.v4.v3;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Output" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ModelStats" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Targets" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}LocalTransformations" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ResultField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}RegressionTable" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_3}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="normalizationMethod" type="{http://www.dmg.org/PMML-4_3}REGRESSIONNORMALIZATIONMETHOD" default="none" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "output",
    "modelStats",
    "targets",
    "localTransformations",
    "resultField",
    "regressionTable"})
@XmlRootElement(name = "Regression")
public class Regression
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "Output")
  protected Output output;
  @XmlElement(name = "ModelStats")
  protected ModelStats modelStats;
  @XmlElement(name = "Targets")
  protected Targets targets;
  @XmlElement(name = "LocalTransformations")
  protected LocalTransformations localTransformations;
  @XmlElement(name = "ResultField")
  protected List<ResultField> resultField;
  @XmlElement(name = "RegressionTable", required = true)
  protected List<RegressionTable> regressionTable;
  @XmlAttribute(name = "modelName")
  protected String modelName;
  @XmlAttribute(name = "functionName", required = true)
  protected MININGFUNCTION functionName;
  @XmlAttribute(name = "algorithmName")
  protected String algorithmName;
  @XmlAttribute(name = "normalizationMethod")
  protected REGRESSIONNORMALIZATIONMETHOD normalizationMethod;

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
   * Gets the value of the output property.
   *
   * @return possible object is
   * {@link Output }
   */
  public Output getOutput()
  {
    return output;
  }

  /**
   * Sets the value of the output property.
   *
   * @param value allowed object is
   *              {@link Output }
   */
  public void setOutput(Output value)
  {
    this.output = value;
  }

  /**
   * Gets the value of the modelStats property.
   *
   * @return possible object is
   * {@link ModelStats }
   */
  public ModelStats getModelStats()
  {
    return modelStats;
  }

  /**
   * Sets the value of the modelStats property.
   *
   * @param value allowed object is
   *              {@link ModelStats }
   */
  public void setModelStats(ModelStats value)
  {
    this.modelStats = value;
  }

  /**
   * Gets the value of the targets property.
   *
   * @return possible object is
   * {@link Targets }
   */
  public Targets getTargets()
  {
    return targets;
  }

  /**
   * Sets the value of the targets property.
   *
   * @param value allowed object is
   *              {@link Targets }
   */
  public void setTargets(Targets value)
  {
    this.targets = value;
  }

  /**
   * Gets the value of the localTransformations property.
   *
   * @return possible object is
   * {@link LocalTransformations }
   */
  public LocalTransformations getLocalTransformations()
  {
    return localTransformations;
  }

  /**
   * Sets the value of the localTransformations property.
   *
   * @param value allowed object is
   *              {@link LocalTransformations }
   */
  public void setLocalTransformations(LocalTransformations value)
  {
    this.localTransformations = value;
  }

  /**
   * Gets the value of the resultField property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the resultField property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getResultField().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link ResultField }
   */
  public List<ResultField> getResultField()
  {
    if (resultField == null) {
      resultField = new ArrayList<ResultField>();
    }
    return this.resultField;
  }

  /**
   * Gets the value of the regressionTable property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the regressionTable property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRegressionTable().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link RegressionTable }
   */
  public List<RegressionTable> getRegressionTable()
  {
    if (regressionTable == null) {
      regressionTable = new ArrayList<RegressionTable>();
    }
    return this.regressionTable;
  }

  /**
   * Gets the value of the modelName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getModelName()
  {
    return modelName;
  }

  /**
   * Sets the value of the modelName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setModelName(String value)
  {
    this.modelName = value;
  }

  /**
   * Gets the value of the functionName property.
   *
   * @return possible object is
   * {@link MININGFUNCTION }
   */
  public MININGFUNCTION getFunctionName()
  {
    return functionName;
  }

  /**
   * Sets the value of the functionName property.
   *
   * @param value allowed object is
   *              {@link MININGFUNCTION }
   */
  public void setFunctionName(MININGFUNCTION value)
  {
    this.functionName = value;
  }

  /**
   * Gets the value of the algorithmName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getAlgorithmName()
  {
    return algorithmName;
  }

  /**
   * Sets the value of the algorithmName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setAlgorithmName(String value)
  {
    this.algorithmName = value;
  }

  /**
   * Gets the value of the normalizationMethod property.
   *
   * @return possible object is
   * {@link REGRESSIONNORMALIZATIONMETHOD }
   */
  public REGRESSIONNORMALIZATIONMETHOD getNormalizationMethod()
  {
    if (normalizationMethod == null) {
      return REGRESSIONNORMALIZATIONMETHOD.NONE;
    } else {
      return normalizationMethod;
    }
  }

  /**
   * Sets the value of the normalizationMethod property.
   *
   * @param value allowed object is
   *              {@link REGRESSIONNORMALIZATIONMETHOD }
   */
  public void setNormalizationMethod(REGRESSIONNORMALIZATIONMETHOD value)
  {
    this.normalizationMethod = value;
  }

}
