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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}STRING-ARRAY"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.dmg.org/PMML-4_3}ELEMENT-ID" />
 *       &lt;attribute name="field" use="required" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="operator" type="{http://www.w3.org/2001/XMLSchema}string" fixed="supersetOf" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "array"})
@XmlRootElement(name = "SetPredicate")
public class SetPredicate
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "Array")
  protected ArrayType array;
  @XmlAttribute(name = "id", required = true)
  protected String id;
  @XmlAttribute(name = "field", required = true)
  protected String field;
  @XmlAttribute(name = "operator")
  protected String operator;

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
   * Gets the value of the array property.
   *
   * @return possible object is
   * {@link ArrayType }
   */
  public ArrayType getArray()
  {
    return array;
  }

  /**
   * Sets the value of the array property.
   *
   * @param value allowed object is
   *              {@link ArrayType }
   */
  public void setArray(ArrayType value)
  {
    this.array = value;
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
   * Gets the value of the operator property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getOperator()
  {
    if (operator == null) {
      return "supersetOf";
    } else {
      return operator;
    }
  }

  /**
   * Sets the value of the operator property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setOperator(String value)
  {
    this.operator = value;
  }

}