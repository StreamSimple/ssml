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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}TextDictionary"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}TextCorpus"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}DocumentTermMatrix"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}TextModelNormalization" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}TextModelSimiliarity" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ModelVerification" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_3}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numberOfTerms" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="numberOfDocuments" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="isScorable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"content"})
@XmlRootElement(name = "TextModel")
public class TextModel
{
  @XmlElementRefs( {
      @XmlElementRef(name = "LocalTransformations", namespace = "http://www.dmg.org/PMML-4_3", type = LocalTransformations.class, required = false),
      @XmlElementRef(name = "TextDictionary", namespace = "http://www.dmg.org/PMML-4_3", type = TextDictionary.class, required = false),
      @XmlElementRef(name = "ModelStats", namespace = "http://www.dmg.org/PMML-4_3", type = ModelStats.class, required = false),
      @XmlElementRef(name = "MiningSchema", namespace = "http://www.dmg.org/PMML-4_3", type = MiningSchema.class, required = false),
      @XmlElementRef(name = "Extension", namespace = "http://www.dmg.org/PMML-4_3", type = Extension.class, required = false),
      @XmlElementRef(name = "TextModelSimiliarity", namespace = "http://www.dmg.org/PMML-4_3", type = TextModelSimiliarity.class, required = false),
      @XmlElementRef(name = "DocumentTermMatrix", namespace = "http://www.dmg.org/PMML-4_3", type = DocumentTermMatrix.class, required = false),
      @XmlElementRef(name = "Targets", namespace = "http://www.dmg.org/PMML-4_3", type = Targets.class, required = false),
      @XmlElementRef(name = "ModelVerification", namespace = "http://www.dmg.org/PMML-4_3", type = ModelVerification.class, required = false),
      @XmlElementRef(name = "Output", namespace = "http://www.dmg.org/PMML-4_3", type = Output.class, required = false),
      @XmlElementRef(name = "TextModelNormalization", namespace = "http://www.dmg.org/PMML-4_3", type = TextModelNormalization.class, required = false),
      @XmlElementRef(name = "TextCorpus", namespace = "http://www.dmg.org/PMML-4_3", type = TextCorpus.class, required = false),
      @XmlElementRef(name = "ModelExplanation", namespace = "http://www.dmg.org/PMML-4_3", type = ModelExplanation.class, required = false)})
  protected List<Object> content;
  @XmlAttribute(name = "modelName")
  protected String modelName;
  @XmlAttribute(name = "functionName", required = true)
  protected MININGFUNCTION functionName;
  @XmlAttribute(name = "algorithmName")
  protected String algorithmName;
  @XmlAttribute(name = "numberOfTerms", required = true)
  protected BigInteger numberOfTerms;
  @XmlAttribute(name = "numberOfDocuments", required = true)
  protected BigInteger numberOfDocuments;
  @XmlAttribute(name = "isScorable")
  protected Boolean isScorable;

  /**
   * Gets the rest of the content model.
   * <p>
   * <p>
   * You are getting this "catch-all" property because of the following reason:
   * The field name "Extension" is used by two different parts of a schema. See:
   * line 3202 of file:/Users/tfarkas/dev/sspmml/src/main/resources/pmml-4-3.xsd
   * line 3189 of file:/Users/tfarkas/dev/sspmml/src/main/resources/pmml-4-3.xsd
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
   * {@link TextDictionary }
   * {@link MiningSchema }
   * {@link DocumentTermMatrix }
   * {@link Targets }
   * {@link ModelVerification }
   * {@link ModelExplanation }
   * {@link LocalTransformations }
   * {@link ModelStats }
   * {@link Extension }
   * {@link TextModelSimiliarity }
   * {@link Output }
   * {@link TextModelNormalization }
   * {@link TextCorpus }
   */
  public List<Object> getContent()
  {
    if (content == null) {
      content = new ArrayList<Object>();
    }
    return this.content;
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
   * Gets the value of the numberOfTerms property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getNumberOfTerms()
  {
    return numberOfTerms;
  }

  /**
   * Sets the value of the numberOfTerms property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setNumberOfTerms(BigInteger value)
  {
    this.numberOfTerms = value;
  }

  /**
   * Gets the value of the numberOfDocuments property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getNumberOfDocuments()
  {
    return numberOfDocuments;
  }

  /**
   * Sets the value of the numberOfDocuments property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setNumberOfDocuments(BigInteger value)
  {
    this.numberOfDocuments = value;
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
