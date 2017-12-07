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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}CorrelationFields"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}CorrelationValues"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}CorrelationMethods" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "correlationFields",
    "correlationValues",
    "correlationMethods"})
@XmlRootElement(name = "Correlations")
public class Correlations
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "CorrelationFields", required = true)
  protected CorrelationFields correlationFields;
  @XmlElement(name = "CorrelationValues", required = true)
  protected CorrelationValues correlationValues;
  @XmlElement(name = "CorrelationMethods")
  protected CorrelationMethods correlationMethods;

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
   * Gets the value of the correlationFields property.
   *
   * @return possible object is
   * {@link CorrelationFields }
   */
  public CorrelationFields getCorrelationFields()
  {
    return correlationFields;
  }

  /**
   * Sets the value of the correlationFields property.
   *
   * @param value allowed object is
   *              {@link CorrelationFields }
   */
  public void setCorrelationFields(CorrelationFields value)
  {
    this.correlationFields = value;
  }

  /**
   * Gets the value of the correlationValues property.
   *
   * @return possible object is
   * {@link CorrelationValues }
   */
  public CorrelationValues getCorrelationValues()
  {
    return correlationValues;
  }

  /**
   * Sets the value of the correlationValues property.
   *
   * @param value allowed object is
   *              {@link CorrelationValues }
   */
  public void setCorrelationValues(CorrelationValues value)
  {
    this.correlationValues = value;
  }

  /**
   * Gets the value of the correlationMethods property.
   *
   * @return possible object is
   * {@link CorrelationMethods }
   */
  public CorrelationMethods getCorrelationMethods()
  {
    return correlationMethods;
  }

  /**
   * Sets the value of the correlationMethods property.
   *
   * @param value allowed object is
   *              {@link CorrelationMethods }
   */
  public void setCorrelationMethods(CorrelationMethods value)
  {
    this.correlationMethods = value;
  }

}
