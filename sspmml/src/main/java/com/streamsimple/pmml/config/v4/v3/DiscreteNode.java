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
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}DerivedField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}DiscreteConditionalProbability"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}ValueProbability" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="count" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "derivedField",
    "discreteConditionalProbabilityOrValueProbability"})
@XmlRootElement(name = "DiscreteNode")
public class DiscreteNode
{
  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "DerivedField")
  protected List<DerivedField> derivedField;
  @XmlElements( {
      @XmlElement(name = "DiscreteConditionalProbability", type = DiscreteConditionalProbability.class),
      @XmlElement(name = "ValueProbability", type = ValueProbability.class)})
  protected List<Object> discreteConditionalProbabilityOrValueProbability;
  @XmlAttribute(name = "name", required = true)
  protected String name;
  @XmlAttribute(name = "count")
  protected Double count;

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
   * Gets the value of the derivedField property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the derivedField property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDerivedField().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link DerivedField }
   */
  public List<DerivedField> getDerivedField()
  {
    if (derivedField == null) {
      derivedField = new ArrayList<DerivedField>();
    }
    return this.derivedField;
  }

  /**
   * Gets the value of the discreteConditionalProbabilityOrValueProbability property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the discreteConditionalProbabilityOrValueProbability property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDiscreteConditionalProbabilityOrValueProbability().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link DiscreteConditionalProbability }
   * {@link ValueProbability }
   */
  public List<Object> getDiscreteConditionalProbabilityOrValueProbability()
  {
    if (discreteConditionalProbabilityOrValueProbability == null) {
      discreteConditionalProbabilityOrValueProbability = new ArrayList<Object>();
    }
    return this.discreteConditionalProbabilityOrValueProbability;
  }

  /**
   * Gets the value of the name property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getName()
  {
    return name;
  }

  /**
   * Sets the value of the name property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setName(String value)
  {
    this.name = value;
  }

  /**
   * Gets the value of the count property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getCount()
  {
    return count;
  }

  /**
   * Sets the value of the count property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setCount(Double value)
  {
    this.count = value;
  }

}
