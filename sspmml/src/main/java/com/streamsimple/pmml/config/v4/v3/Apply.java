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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}EXPRESSION" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="function" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mapMissingTo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="invalidValueTreatment" type="{http://www.dmg.org/PMML-4_3}INVALID-VALUE-TREATMENT-METHOD" default="returnInvalid" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "expression"})
@XmlRootElement(name = "Apply")
public class Apply
{
  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElements( {
      @XmlElement(name = "Constant", type = Constant.class),
      @XmlElement(name = "FieldRef", type = FieldRef.class),
      @XmlElement(name = "NormContinuous", type = NormContinuous.class),
      @XmlElement(name = "NormDiscrete", type = NormDiscrete.class),
      @XmlElement(name = "Discretize", type = Discretize.class),
      @XmlElement(name = "MapValues", type = MapValues.class),
      @XmlElement(name = "TextIndex", type = TextIndex.class),
      @XmlElement(name = "Apply", type = Apply.class),
      @XmlElement(name = "Aggregate", type = Aggregate.class),
      @XmlElement(name = "Lag", type = Lag.class)})
  protected List<Object> expression;
  @XmlAttribute(name = "function", required = true)
  protected String function;
  @XmlAttribute(name = "mapMissingTo")
  protected String mapMissingTo;
  @XmlAttribute(name = "defaultValue")
  protected String defaultValue;
  @XmlAttribute(name = "invalidValueTreatment")
  protected INVALIDVALUETREATMENTMETHOD invalidValueTreatment;

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
   * Gets the value of the expression property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the expression property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEXPRESSION().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Constant }
   * {@link FieldRef }
   * {@link NormContinuous }
   * {@link NormDiscrete }
   * {@link Discretize }
   * {@link MapValues }
   * {@link TextIndex }
   * {@link Apply }
   * {@link Aggregate }
   * {@link Lag }
   */
  public List<Object> getEXPRESSION()
  {
    if (expression == null) {
      expression = new ArrayList<Object>();
    }
    return this.expression;
  }

  /**
   * Gets the value of the function property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getFunction()
  {
    return function;
  }

  /**
   * Sets the value of the function property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setFunction(String value)
  {
    this.function = value;
  }

  /**
   * Gets the value of the mapMissingTo property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getMapMissingTo()
  {
    return mapMissingTo;
  }

  /**
   * Sets the value of the mapMissingTo property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setMapMissingTo(String value)
  {
    this.mapMissingTo = value;
  }

  /**
   * Gets the value of the defaultValue property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * Sets the value of the defaultValue property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDefaultValue(String value)
  {
    this.defaultValue = value;
  }

  /**
   * Gets the value of the invalidValueTreatment property.
   *
   * @return possible object is
   * {@link INVALIDVALUETREATMENTMETHOD }
   */
  public INVALIDVALUETREATMENTMETHOD getInvalidValueTreatment()
  {
    if (invalidValueTreatment == null) {
      return INVALIDVALUETREATMENTMETHOD.RETURN_INVALID;
    } else {
      return invalidValueTreatment;
    }
  }

  /**
   * Sets the value of the invalidValueTreatment property.
   *
   * @param value allowed object is
   *              {@link INVALIDVALUETREATMENTMETHOD }
   */
  public void setInvalidValueTreatment(INVALIDVALUETREATMENTMETHOD value)
  {
    this.invalidValueTreatment = value;
  }

}
