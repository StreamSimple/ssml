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
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Model"/>
 *             &lt;enumeration value="Error"/>
 *             &lt;enumeration value="Total"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="sumOfSquares" use="required" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="degreesOfFreedom" use="required" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="meanOfSquares" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="fValue" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="pValue" type="{http://www.dmg.org/PMML-4_3}PROB-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension"})
@XmlRootElement(name = "AnovaRow")
public class AnovaRow
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlAttribute(name = "type", required = true)
  protected String type;
  @XmlAttribute(name = "sumOfSquares", required = true)
  protected double sumOfSquares;
  @XmlAttribute(name = "degreesOfFreedom", required = true)
  protected double degreesOfFreedom;
  @XmlAttribute(name = "meanOfSquares")
  protected Double meanOfSquares;
  @XmlAttribute(name = "fValue")
  protected Double fValue;
  @XmlAttribute(name = "pValue")
  protected Double pValue;

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
   * Gets the value of the type property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getType()
  {
    return type;
  }

  /**
   * Sets the value of the type property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setType(String value)
  {
    this.type = value;
  }

  /**
   * Gets the value of the sumOfSquares property.
   */
  public double getSumOfSquares()
  {
    return sumOfSquares;
  }

  /**
   * Sets the value of the sumOfSquares property.
   */
  public void setSumOfSquares(double value)
  {
    this.sumOfSquares = value;
  }

  /**
   * Gets the value of the degreesOfFreedom property.
   */
  public double getDegreesOfFreedom()
  {
    return degreesOfFreedom;
  }

  /**
   * Sets the value of the degreesOfFreedom property.
   */
  public void setDegreesOfFreedom(double value)
  {
    this.degreesOfFreedom = value;
  }

  /**
   * Gets the value of the meanOfSquares property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getMeanOfSquares()
  {
    return meanOfSquares;
  }

  /**
   * Sets the value of the meanOfSquares property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setMeanOfSquares(Double value)
  {
    this.meanOfSquares = value;
  }

  /**
   * Gets the value of the fValue property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getFValue()
  {
    return fValue;
  }

  /**
   * Sets the value of the fValue property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setFValue(Double value)
  {
    this.fValue = value;
  }

  /**
   * Gets the value of the pValue property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getPValue()
  {
    return pValue;
  }

  /**
   * Sets the value of the pValue property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setPValue(Double value)
  {
    this.pValue = value;
  }

}
