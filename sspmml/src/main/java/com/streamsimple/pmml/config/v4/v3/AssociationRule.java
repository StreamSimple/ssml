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
 *       &lt;/sequence>
 *       &lt;attribute name="antecedent" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consequent" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="support" use="required" type="{http://www.dmg.org/PMML-4_3}PROB-NUMBER" />
 *       &lt;attribute name="confidence" use="required" type="{http://www.dmg.org/PMML-4_3}PROB-NUMBER" />
 *       &lt;attribute name="lift" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="leverage" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="affinity" type="{http://www.dmg.org/PMML-4_3}PROB-NUMBER" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension"})
@XmlRootElement(name = "AssociationRule")
public class AssociationRule
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlAttribute(name = "antecedent", required = true)
  protected String antecedent;
  @XmlAttribute(name = "consequent", required = true)
  protected String consequent;
  @XmlAttribute(name = "support", required = true)
  protected double support;
  @XmlAttribute(name = "confidence", required = true)
  protected double confidence;
  @XmlAttribute(name = "lift")
  protected Float lift;
  @XmlAttribute(name = "leverage")
  protected Float leverage;
  @XmlAttribute(name = "affinity")
  protected Double affinity;
  @XmlAttribute(name = "id")
  protected String id;

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
   * Gets the value of the antecedent property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getAntecedent()
  {
    return antecedent;
  }

  /**
   * Sets the value of the antecedent property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setAntecedent(String value)
  {
    this.antecedent = value;
  }

  /**
   * Gets the value of the consequent property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getConsequent()
  {
    return consequent;
  }

  /**
   * Sets the value of the consequent property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setConsequent(String value)
  {
    this.consequent = value;
  }

  /**
   * Gets the value of the support property.
   */
  public double getSupport()
  {
    return support;
  }

  /**
   * Sets the value of the support property.
   */
  public void setSupport(double value)
  {
    this.support = value;
  }

  /**
   * Gets the value of the confidence property.
   */
  public double getConfidence()
  {
    return confidence;
  }

  /**
   * Sets the value of the confidence property.
   */
  public void setConfidence(double value)
  {
    this.confidence = value;
  }

  /**
   * Gets the value of the lift property.
   *
   * @return possible object is
   * {@link Float }
   */
  public Float getLift()
  {
    return lift;
  }

  /**
   * Sets the value of the lift property.
   *
   * @param value allowed object is
   *              {@link Float }
   */
  public void setLift(Float value)
  {
    this.lift = value;
  }

  /**
   * Gets the value of the leverage property.
   *
   * @return possible object is
   * {@link Float }
   */
  public Float getLeverage()
  {
    return leverage;
  }

  /**
   * Sets the value of the leverage property.
   *
   * @param value allowed object is
   *              {@link Float }
   */
  public void setLeverage(Float value)
  {
    this.leverage = value;
  }

  /**
   * Gets the value of the affinity property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getAffinity()
  {
    return affinity;
  }

  /**
   * Sets the value of the affinity property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setAffinity(Double value)
  {
    this.affinity = value;
  }

  /**
   * Gets the value of the id property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getId()
  {
    return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setId(String value)
  {
    this.id = value;
  }

}
