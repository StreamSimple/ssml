/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsimple.pmml.config.v4.v3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}MiningSchema"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Output" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ModelStats" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ModelExplanation" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Targets" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}LocalTransformations" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ParameterList"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}FactorList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}CovariateList" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}PPMatrix"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}PCovMatrix" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ParamMatrix"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}EventValues" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}BaseCumHazardTables" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ModelVerification" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="targetVariableName" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="modelType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="regression"/>
 *             &lt;enumeration value="generalLinear"/>
 *             &lt;enumeration value="multinomialLogistic"/>
 *             &lt;enumeration value="ordinalMultinomial"/>
 *             &lt;enumeration value="generalizedLinear"/>
 *             &lt;enumeration value="CoxRegression"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_3}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="targetReferenceCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cumulativeLink" type="{http://www.dmg.org/PMML-4_3}CUMULATIVE-LINK-FUNCTION" />
 *       &lt;attribute name="linkFunction" type="{http://www.dmg.org/PMML-4_3}LINK-FUNCTION" />
 *       &lt;attribute name="linkParameter" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="trialsVariable" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="trialsValue" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="distribution">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="binomial"/>
 *             &lt;enumeration value="gamma"/>
 *             &lt;enumeration value="igauss"/>
 *             &lt;enumeration value="negbin"/>
 *             &lt;enumeration value="normal"/>
 *             &lt;enumeration value="poisson"/>
 *             &lt;enumeration value="tweedie"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="distParameter" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="offsetVariable" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="offsetValue" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="modelDF" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="endTimeVariable" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="startTimeVariable" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="subjectIDVariable" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="statusVariable" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="baselineStrataVariable" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="isScorable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"})
@XmlRootElement(name = "GeneralRegressionModel")
public class GeneralRegressionModel
{
  @XmlElementRefs( {
      @XmlElementRef(name = "EventValues", namespace = "http://www.dmg.org/PMML-4_3", type = EventValues.class, required = false),
      @XmlElementRef(name = "MiningSchema", namespace = "http://www.dmg.org/PMML-4_3", type = MiningSchema.class, required = false),
      @XmlElementRef(name = "ParamMatrix", namespace = "http://www.dmg.org/PMML-4_3", type = ParamMatrix.class, required = false),
      @XmlElementRef(name = "Targets", namespace = "http://www.dmg.org/PMML-4_3", type = Targets.class, required = false),
      @XmlElementRef(name = "ModelVerification", namespace = "http://www.dmg.org/PMML-4_3", type = ModelVerification.class, required = false),
      @XmlElementRef(name = "ModelExplanation", namespace = "http://www.dmg.org/PMML-4_3", type = ModelExplanation.class, required = false),
      @XmlElementRef(name = "CovariateList", namespace = "http://www.dmg.org/PMML-4_3", type = CovariateList.class, required = false),
      @XmlElementRef(name = "BaseCumHazardTables", namespace = "http://www.dmg.org/PMML-4_3", type = BaseCumHazardTables.class, required = false),
      @XmlElementRef(name = "PPMatrix", namespace = "http://www.dmg.org/PMML-4_3", type = PPMatrix.class, required = false),
      @XmlElementRef(name = "PCovMatrix", namespace = "http://www.dmg.org/PMML-4_3", type = PCovMatrix.class, required = false),
      @XmlElementRef(name = "LocalTransformations", namespace = "http://www.dmg.org/PMML-4_3", type = LocalTransformations.class, required = false),
      @XmlElementRef(name = "Extension", namespace = "http://www.dmg.org/PMML-4_3", type = Extension.class, required = false),
      @XmlElementRef(name = "ModelStats", namespace = "http://www.dmg.org/PMML-4_3", type = ModelStats.class, required = false),
      @XmlElementRef(name = "ParameterList", namespace = "http://www.dmg.org/PMML-4_3", type = ParameterList.class, required = false),
      @XmlElementRef(name = "FactorList", namespace = "http://www.dmg.org/PMML-4_3", type = FactorList.class, required = false),
      @XmlElementRef(name = "Output", namespace = "http://www.dmg.org/PMML-4_3", type = Output.class, required = false)})
  protected List<Object> content;
  @XmlAttribute(name = "targetVariableName")
  protected String targetVariableName;
  @XmlAttribute(name = "modelType", required = true)
  protected String modelType;
  @XmlAttribute(name = "modelName")
  protected String modelName;
  @XmlAttribute(name = "functionName", required = true)
  protected MININGFUNCTION functionName;
  @XmlAttribute(name = "algorithmName")
  protected String algorithmName;
  @XmlAttribute(name = "targetReferenceCategory")
  protected String targetReferenceCategory;
  @XmlAttribute(name = "cumulativeLink")
  protected CUMULATIVELINKFUNCTION cumulativeLink;
  @XmlAttribute(name = "linkFunction")
  protected LINKFUNCTION linkFunction;
  @XmlAttribute(name = "linkParameter")
  protected Double linkParameter;
  @XmlAttribute(name = "trialsVariable")
  protected String trialsVariable;
  @XmlAttribute(name = "trialsValue")
  protected BigInteger trialsValue;
  @XmlAttribute(name = "distribution")
  protected String distribution;
  @XmlAttribute(name = "distParameter")
  protected Double distParameter;
  @XmlAttribute(name = "offsetVariable")
  protected String offsetVariable;
  @XmlAttribute(name = "offsetValue")
  protected Double offsetValue;
  @XmlAttribute(name = "modelDF")
  protected Double modelDF;
  @XmlAttribute(name = "endTimeVariable")
  protected String endTimeVariable;
  @XmlAttribute(name = "startTimeVariable")
  protected String startTimeVariable;
  @XmlAttribute(name = "subjectIDVariable")
  protected String subjectIDVariable;
  @XmlAttribute(name = "statusVariable")
  protected String statusVariable;
  @XmlAttribute(name = "baselineStrataVariable")
  protected String baselineStrataVariable;
  @XmlAttribute(name = "isScorable")
  protected Boolean isScorable;

  /**
   * Gets the rest of the content model.
   * <p>
   * <p>
   * You are getting this "catch-all" property because of the following reason:
   * The field name "Extension" is used by two different parts of a schema. See:
   * line 889 of file:/Users/tfarkas/dev/sspmml/src/main/resources/pmml-4-3.xsd
   * line 873 of file:/Users/tfarkas/dev/sspmml/src/main/resources/pmml-4-3.xsd
   * <p>
   * To get rid of this property, apply a property customization to one
   * of both of the following declarations to change their names:
   * Gets the value of the content property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the content property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getContent().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link EventValues }
   * {@link MiningSchema }
   * {@link ParamMatrix }
   * {@link Targets }
   * {@link ModelVerification }
   * {@link ModelExplanation }
   * {@link CovariateList }
   * {@link BaseCumHazardTables }
   * {@link PPMatrix }
   * {@link PCovMatrix }
   * {@link LocalTransformations }
   * {@link ModelStats }
   * {@link Extension }
   * {@link ParameterList }
   * {@link FactorList }
   * {@link Output }
   */
  public List<Object> getContent()
  {
    if (content == null) {
      content = new ArrayList<Object>();
    }
    return this.content;
  }

  /**
   * Gets the value of the targetVariableName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getTargetVariableName()
  {
    return targetVariableName;
  }

  /**
   * Sets the value of the targetVariableName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setTargetVariableName(String value)
  {
    this.targetVariableName = value;
  }

  /**
   * Gets the value of the modelType property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getModelType()
  {
    return modelType;
  }

  /**
   * Sets the value of the modelType property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setModelType(String value)
  {
    this.modelType = value;
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
   * Gets the value of the targetReferenceCategory property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getTargetReferenceCategory()
  {
    return targetReferenceCategory;
  }

  /**
   * Sets the value of the targetReferenceCategory property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setTargetReferenceCategory(String value)
  {
    this.targetReferenceCategory = value;
  }

  /**
   * Gets the value of the cumulativeLink property.
   *
   * @return possible object is
   * {@link CUMULATIVELINKFUNCTION }
   */
  public CUMULATIVELINKFUNCTION getCumulativeLink()
  {
    return cumulativeLink;
  }

  /**
   * Sets the value of the cumulativeLink property.
   *
   * @param value allowed object is
   *              {@link CUMULATIVELINKFUNCTION }
   */
  public void setCumulativeLink(CUMULATIVELINKFUNCTION value)
  {
    this.cumulativeLink = value;
  }

  /**
   * Gets the value of the linkFunction property.
   *
   * @return possible object is
   * {@link LINKFUNCTION }
   */
  public LINKFUNCTION getLinkFunction()
  {
    return linkFunction;
  }

  /**
   * Sets the value of the linkFunction property.
   *
   * @param value allowed object is
   *              {@link LINKFUNCTION }
   */
  public void setLinkFunction(LINKFUNCTION value)
  {
    this.linkFunction = value;
  }

  /**
   * Gets the value of the linkParameter property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getLinkParameter()
  {
    return linkParameter;
  }

  /**
   * Sets the value of the linkParameter property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setLinkParameter(Double value)
  {
    this.linkParameter = value;
  }

  /**
   * Gets the value of the trialsVariable property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getTrialsVariable()
  {
    return trialsVariable;
  }

  /**
   * Sets the value of the trialsVariable property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setTrialsVariable(String value)
  {
    this.trialsVariable = value;
  }

  /**
   * Gets the value of the trialsValue property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getTrialsValue()
  {
    return trialsValue;
  }

  /**
   * Sets the value of the trialsValue property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setTrialsValue(BigInteger value)
  {
    this.trialsValue = value;
  }

  /**
   * Gets the value of the distribution property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDistribution()
  {
    return distribution;
  }

  /**
   * Sets the value of the distribution property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDistribution(String value)
  {
    this.distribution = value;
  }

  /**
   * Gets the value of the distParameter property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getDistParameter()
  {
    return distParameter;
  }

  /**
   * Sets the value of the distParameter property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setDistParameter(Double value)
  {
    this.distParameter = value;
  }

  /**
   * Gets the value of the offsetVariable property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getOffsetVariable()
  {
    return offsetVariable;
  }

  /**
   * Sets the value of the offsetVariable property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setOffsetVariable(String value)
  {
    this.offsetVariable = value;
  }

  /**
   * Gets the value of the offsetValue property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getOffsetValue()
  {
    return offsetValue;
  }

  /**
   * Sets the value of the offsetValue property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setOffsetValue(Double value)
  {
    this.offsetValue = value;
  }

  /**
   * Gets the value of the modelDF property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getModelDF()
  {
    return modelDF;
  }

  /**
   * Sets the value of the modelDF property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setModelDF(Double value)
  {
    this.modelDF = value;
  }

  /**
   * Gets the value of the endTimeVariable property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getEndTimeVariable()
  {
    return endTimeVariable;
  }

  /**
   * Sets the value of the endTimeVariable property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setEndTimeVariable(String value)
  {
    this.endTimeVariable = value;
  }

  /**
   * Gets the value of the startTimeVariable property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getStartTimeVariable()
  {
    return startTimeVariable;
  }

  /**
   * Sets the value of the startTimeVariable property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setStartTimeVariable(String value)
  {
    this.startTimeVariable = value;
  }

  /**
   * Gets the value of the subjectIDVariable property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getSubjectIDVariable()
  {
    return subjectIDVariable;
  }

  /**
   * Sets the value of the subjectIDVariable property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setSubjectIDVariable(String value)
  {
    this.subjectIDVariable = value;
  }

  /**
   * Gets the value of the statusVariable property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getStatusVariable()
  {
    return statusVariable;
  }

  /**
   * Sets the value of the statusVariable property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setStatusVariable(String value)
  {
    this.statusVariable = value;
  }

  /**
   * Gets the value of the baselineStrataVariable property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getBaselineStrataVariable()
  {
    return baselineStrataVariable;
  }

  /**
   * Sets the value of the baselineStrataVariable property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setBaselineStrataVariable(String value)
  {
    this.baselineStrataVariable = value;
  }

  /**
   * Gets the value of the isScorable property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public boolean isIsScorable()
  {
    if (isScorable == null) {
      return true;
    } else {
      return isScorable;
    }
  }

  /**
   * Sets the value of the isScorable property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsScorable(Boolean value)
  {
    this.isScorable = value;
  }

}
