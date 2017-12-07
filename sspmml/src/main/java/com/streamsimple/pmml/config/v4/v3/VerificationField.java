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
 *       &lt;attribute name="field" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="precision" type="{http://www.w3.org/2001/XMLSchema}double" default="1E-6" />
 *       &lt;attribute name="zeroThreshold" type="{http://www.w3.org/2001/XMLSchema}double" default="1E-16" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension"})
@XmlRootElement(name = "VerificationField")
public class VerificationField
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlAttribute(name = "field", required = true)
  protected String field;
  @XmlAttribute(name = "column")
  protected String column;
  @XmlAttribute(name = "precision")
  protected Double precision;
  @XmlAttribute(name = "zeroThreshold")
  protected Double zeroThreshold;

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
   * Gets the value of the field property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getField()
  {
    return field;
  }

  /**
   * Sets the value of the field property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setField(String value)
  {
    this.field = value;
  }

  /**
   * Gets the value of the column property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getColumn()
  {
    return column;
  }

  /**
   * Sets the value of the column property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setColumn(String value)
  {
    this.column = value;
  }

  /**
   * Gets the value of the precision property.
   *
   * @return possible object is
   * {@link Double }
   */
  public double getPrecision()
  {
    if (precision == null) {
      return 1.0E-6D;
    } else {
      return precision;
    }
  }

  /**
   * Sets the value of the precision property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setPrecision(Double value)
  {
    this.precision = value;
  }

  /**
   * Gets the value of the zeroThreshold property.
   *
   * @return possible object is
   * {@link Double }
   */
  public double getZeroThreshold()
  {
    if (zeroThreshold == null) {
      return 1.0E-16D;
    } else {
      return zeroThreshold;
    }
  }

  /**
   * Sets the value of the zeroThreshold property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setZeroThreshold(Double value)
  {
    this.zeroThreshold = value;
  }

}
