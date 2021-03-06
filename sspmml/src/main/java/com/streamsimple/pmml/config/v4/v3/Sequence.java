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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}SetReference"/>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;group ref="{http://www.dmg.org/PMML-4_3}FOLLOW-SET"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Time" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.dmg.org/PMML-4_3}ELEMENT-ID" />
 *       &lt;attribute name="numberOfSets" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="occurrence" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="support" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "setReference",
    "extensionAndDelimiterAndTime",
    "time"})
@XmlRootElement(name = "Sequence")
public class Sequence
{
  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "SetReference", required = true)
  protected SetReference setReference;
  @XmlElements( {
      @XmlElement(name = "Extension", type = Extension.class),
      @XmlElement(name = "Delimiter", type = Delimiter.class),
      @XmlElement(name = "Time", type = Time.class),
      @XmlElement(name = "SetReference", type = SetReference.class)})
  protected List<Object> extensionAndDelimiterAndTime;
  @XmlElement(name = "Time")
  protected Time time;
  @XmlAttribute(name = "id", required = true)
  protected String id;
  @XmlAttribute(name = "numberOfSets")
  protected BigInteger numberOfSets;
  @XmlAttribute(name = "occurrence")
  protected BigInteger occurrence;
  @XmlAttribute(name = "support")
  protected Double support;

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
   * Gets the value of the setReference property.
   *
   * @return possible object is
   * {@link SetReference }
   */
  public SetReference getSetReference()
  {
    return setReference;
  }

  /**
   * Sets the value of the setReference property.
   *
   * @param value allowed object is
   *              {@link SetReference }
   */
  public void setSetReference(SetReference value)
  {
    this.setReference = value;
  }

  /**
   * Gets the value of the extensionAndDelimiterAndTime property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the extensionAndDelimiterAndTime property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getExtensionAndDelimiterAndTime().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Extension }
   * {@link Delimiter }
   * {@link Time }
   * {@link SetReference }
   */
  public List<Object> getExtensionAndDelimiterAndTime()
  {
    if (extensionAndDelimiterAndTime == null) {
      extensionAndDelimiterAndTime = new ArrayList<Object>();
    }
    return this.extensionAndDelimiterAndTime;
  }

  /**
   * Gets the value of the time property.
   *
   * @return possible object is
   * {@link Time }
   */
  public Time getTime()
  {
    return time;
  }

  /**
   * Sets the value of the time property.
   *
   * @param value allowed object is
   *              {@link Time }
   */
  public void setTime(Time value)
  {
    this.time = value;
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

  /**
   * Gets the value of the numberOfSets property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getNumberOfSets()
  {
    return numberOfSets;
  }

  /**
   * Sets the value of the numberOfSets property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setNumberOfSets(BigInteger value)
  {
    this.numberOfSets = value;
  }

  /**
   * Gets the value of the occurrence property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getOccurrence()
  {
    return occurrence;
  }

  /**
   * Sets the value of the occurrence property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setOccurrence(BigInteger value)
  {
    this.occurrence = value;
  }

  /**
   * Gets the value of the support property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getSupport()
  {
    return support;
  }

  /**
   * Sets the value of the support property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setSupport(Double value)
  {
    this.support = value;
  }

}
