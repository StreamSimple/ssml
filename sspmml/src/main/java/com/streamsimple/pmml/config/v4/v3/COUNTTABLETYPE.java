/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.pmml.config.v4.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COUNT-TABLE-TYPE complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="COUNT-TABLE-TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}FieldValue" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}FieldValueCount" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="sample" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COUNT-TABLE-TYPE", propOrder = {
    "extension",
    "fieldValue",
    "fieldValueCount"})
public class COUNTTABLETYPE
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "FieldValue")
  protected List<FieldValue> fieldValue;
  @XmlElement(name = "FieldValueCount")
  protected List<FieldValueCount> fieldValueCount;
  @XmlAttribute(name = "sample")
  protected Double sample;

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
   * Gets the value of the fieldValue property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the fieldValue property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFieldValue().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link FieldValue }
   */
  public List<FieldValue> getFieldValue()
  {
    if (fieldValue == null) {
      fieldValue = new ArrayList<FieldValue>();
    }
    return this.fieldValue;
  }

  /**
   * Gets the value of the fieldValueCount property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the fieldValueCount property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFieldValueCount().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link FieldValueCount }
   */
  public List<FieldValueCount> getFieldValueCount()
  {
    if (fieldValueCount == null) {
      fieldValueCount = new ArrayList<FieldValueCount>();
    }
    return this.fieldValueCount;
  }

  /**
   * Gets the value of the sample property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getSample()
  {
    return sample;
  }

  /**
   * Sets the value of the sample property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setSample(Double value)
  {
    this.sample = value;
  }

}
