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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ModelStats" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}LocalTransformations" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Constraints" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Itemset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}SetPredicate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Sequence" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}SequenceRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_3}MINING-FUNCTION" />
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numberOfTransactions" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="maxNumberOfItemsPerTransaction" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="avgNumberOfItemsPerTransaction" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="numberOfTransactionGroups" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="maxNumberOfTAsPerTAGroup" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="avgNumberOfTAsPerTAGroup" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="isScorable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"content"})
@XmlRootElement(name = "SequenceModel")
public class SequenceModel
{
  @XmlElementRefs( {
      @XmlElementRef(name = "LocalTransformations", namespace = "http://www.dmg.org/PMML-4_3", type = LocalTransformations.class, required = false),
      @XmlElementRef(name = "ModelStats", namespace = "http://www.dmg.org/PMML-4_3", type = ModelStats.class, required = false),
      @XmlElementRef(name = "MiningSchema", namespace = "http://www.dmg.org/PMML-4_3", type = MiningSchema.class, required = false),
      @XmlElementRef(name = "Extension", namespace = "http://www.dmg.org/PMML-4_3", type = Extension.class, required = false),
      @XmlElementRef(name = "Sequence", namespace = "http://www.dmg.org/PMML-4_3", type = Sequence.class, required = false),
      @XmlElementRef(name = "Itemset", namespace = "http://www.dmg.org/PMML-4_3", type = Itemset.class, required = false),
      @XmlElementRef(name = "Constraints", namespace = "http://www.dmg.org/PMML-4_3", type = Constraints.class, required = false),
      @XmlElementRef(name = "SetPredicate", namespace = "http://www.dmg.org/PMML-4_3", type = SetPredicate.class, required = false),
      @XmlElementRef(name = "SequenceRule", namespace = "http://www.dmg.org/PMML-4_3", type = SequenceRule.class, required = false),
      @XmlElementRef(name = "Item", namespace = "http://www.dmg.org/PMML-4_3", type = Item.class, required = false)})
  protected List<Object> content;
  @XmlAttribute(name = "modelName")
  protected String modelName;
  @XmlAttribute(name = "functionName", required = true)
  protected MININGFUNCTION functionName;
  @XmlAttribute(name = "algorithmName")
  protected String algorithmName;
  @XmlAttribute(name = "numberOfTransactions")
  protected BigInteger numberOfTransactions;
  @XmlAttribute(name = "maxNumberOfItemsPerTransaction")
  protected BigInteger maxNumberOfItemsPerTransaction;
  @XmlAttribute(name = "avgNumberOfItemsPerTransaction")
  protected Double avgNumberOfItemsPerTransaction;
  @XmlAttribute(name = "numberOfTransactionGroups")
  protected BigInteger numberOfTransactionGroups;
  @XmlAttribute(name = "maxNumberOfTAsPerTAGroup")
  protected BigInteger maxNumberOfTAsPerTAGroup;
  @XmlAttribute(name = "avgNumberOfTAsPerTAGroup")
  protected Double avgNumberOfTAsPerTAGroup;
  @XmlAttribute(name = "isScorable")
  protected Boolean isScorable;

  /**
   * Gets the rest of the content model.
   * <p>
   * <p>
   * You are getting this "catch-all" property because of the following reason:
   * The field name "Extension" is used by two different parts of a schema. See:
   * line 2545 of file:/Users/tfarkas/dev/sspmml/src/main/resources/pmml-4-3.xsd
   * line 2535 of file:/Users/tfarkas/dev/sspmml/src/main/resources/pmml-4-3.xsd
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
   * {@link LocalTransformations }
   * {@link Extension }
   * {@link MiningSchema }
   * {@link ModelStats }
   * {@link Sequence }
   * {@link Constraints }
   * {@link Itemset }
   * {@link SetPredicate }
   * {@link Item }
   * {@link SequenceRule }
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
   * Gets the value of the numberOfTransactions property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getNumberOfTransactions()
  {
    return numberOfTransactions;
  }

  /**
   * Sets the value of the numberOfTransactions property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setNumberOfTransactions(BigInteger value)
  {
    this.numberOfTransactions = value;
  }

  /**
   * Gets the value of the maxNumberOfItemsPerTransaction property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getMaxNumberOfItemsPerTransaction()
  {
    return maxNumberOfItemsPerTransaction;
  }

  /**
   * Sets the value of the maxNumberOfItemsPerTransaction property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setMaxNumberOfItemsPerTransaction(BigInteger value)
  {
    this.maxNumberOfItemsPerTransaction = value;
  }

  /**
   * Gets the value of the avgNumberOfItemsPerTransaction property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getAvgNumberOfItemsPerTransaction()
  {
    return avgNumberOfItemsPerTransaction;
  }

  /**
   * Sets the value of the avgNumberOfItemsPerTransaction property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setAvgNumberOfItemsPerTransaction(Double value)
  {
    this.avgNumberOfItemsPerTransaction = value;
  }

  /**
   * Gets the value of the numberOfTransactionGroups property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getNumberOfTransactionGroups()
  {
    return numberOfTransactionGroups;
  }

  /**
   * Sets the value of the numberOfTransactionGroups property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setNumberOfTransactionGroups(BigInteger value)
  {
    this.numberOfTransactionGroups = value;
  }

  /**
   * Gets the value of the maxNumberOfTAsPerTAGroup property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getMaxNumberOfTAsPerTAGroup()
  {
    return maxNumberOfTAsPerTAGroup;
  }

  /**
   * Sets the value of the maxNumberOfTAsPerTAGroup property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setMaxNumberOfTAsPerTAGroup(BigInteger value)
  {
    this.maxNumberOfTAsPerTAGroup = value;
  }

  /**
   * Gets the value of the avgNumberOfTAsPerTAGroup property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getAvgNumberOfTAsPerTAGroup()
  {
    return avgNumberOfTAsPerTAGroup;
  }

  /**
   * Sets the value of the avgNumberOfTAsPerTAGroup property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setAvgNumberOfTAsPerTAGroup(Double value)
  {
    this.avgNumberOfTAsPerTAGroup = value;
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
