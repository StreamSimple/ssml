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
 *         &lt;sequence>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}Interval" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}Value" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="optype" use="required" type="{http://www.dmg.org/PMML-4_3}OPTYPE" />
 *       &lt;attribute name="dataType" use="required" type="{http://www.dmg.org/PMML-4_3}DATATYPE" />
 *       &lt;attribute name="taxonomy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isCyclic" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "interval",
    "value"})
@XmlRootElement(name = "DataField")
public class DataField
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "Interval")
  protected List<Interval> interval;
  @XmlElement(name = "Value")
  protected List<Value> value;
  @XmlAttribute(name = "name", required = true)
  protected String name;
  @XmlAttribute(name = "displayName")
  protected String displayName;
  @XmlAttribute(name = "optype", required = true)
  protected OPTYPE optype;
  @XmlAttribute(name = "dataType", required = true)
  protected DATATYPE dataType;
  @XmlAttribute(name = "taxonomy")
  protected String taxonomy;
  @XmlAttribute(name = "isCyclic")
  protected String isCyclic;

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
   * Gets the value of the interval property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the interval property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getInterval().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Interval }
   */
  public List<Interval> getInterval()
  {
    if (interval == null) {
      interval = new ArrayList<Interval>();
    }
    return this.interval;
  }

  /**
   * Gets the value of the value property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the value property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getValue().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Value }
   */
  public List<Value> getValue()
  {
    if (value == null) {
      value = new ArrayList<Value>();
    }
    return this.value;
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
   * Gets the value of the displayName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDisplayName()
  {
    return displayName;
  }

  /**
   * Sets the value of the displayName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDisplayName(String value)
  {
    this.displayName = value;
  }

  /**
   * Gets the value of the optype property.
   *
   * @return possible object is
   * {@link OPTYPE }
   */
  public OPTYPE getOptype()
  {
    return optype;
  }

  /**
   * Sets the value of the optype property.
   *
   * @param value allowed object is
   *              {@link OPTYPE }
   */
  public void setOptype(OPTYPE value)
  {
    this.optype = value;
  }

  /**
   * Gets the value of the dataType property.
   *
   * @return possible object is
   * {@link DATATYPE }
   */
  public DATATYPE getDataType()
  {
    return dataType;
  }

  /**
   * Sets the value of the dataType property.
   *
   * @param value allowed object is
   *              {@link DATATYPE }
   */
  public void setDataType(DATATYPE value)
  {
    this.dataType = value;
  }

  /**
   * Gets the value of the taxonomy property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getTaxonomy()
  {
    return taxonomy;
  }

  /**
   * Sets the value of the taxonomy property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setTaxonomy(String value)
  {
    this.taxonomy = value;
  }

  /**
   * Gets the value of the isCyclic property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getIsCyclic()
  {
    if (isCyclic == null) {
      return "0";
    } else {
      return isCyclic;
    }
  }

  /**
   * Sets the value of the isCyclic property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setIsCyclic(String value)
  {
    this.isCyclic = value;
  }

}
