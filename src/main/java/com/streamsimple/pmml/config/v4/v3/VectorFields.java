/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
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
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}FieldRef"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}CategoricalPredictor"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="numberOfFields" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "fieldRefOrCategoricalPredictor"})
@XmlRootElement(name = "VectorFields")
public class VectorFields
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElements( {
      @XmlElement(name = "FieldRef", type = FieldRef.class),
      @XmlElement(name = "CategoricalPredictor", type = CategoricalPredictor.class)})
  protected List<Object> fieldRefOrCategoricalPredictor;
  @XmlAttribute(name = "numberOfFields")
  protected BigInteger numberOfFields;

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
   * Gets the value of the fieldRefOrCategoricalPredictor property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the fieldRefOrCategoricalPredictor property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFieldRefOrCategoricalPredictor().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link FieldRef }
   * {@link CategoricalPredictor }
   */
  public List<Object> getFieldRefOrCategoricalPredictor()
  {
    if (fieldRefOrCategoricalPredictor == null) {
      fieldRefOrCategoricalPredictor = new ArrayList<Object>();
    }
    return this.fieldRefOrCategoricalPredictor;
  }

  /**
   * Gets the value of the numberOfFields property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getNumberOfFields()
  {
    return numberOfFields;
  }

  /**
   * Sets the value of the numberOfFields property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setNumberOfFields(BigInteger value)
  {
    this.numberOfFields = value;
  }

}
