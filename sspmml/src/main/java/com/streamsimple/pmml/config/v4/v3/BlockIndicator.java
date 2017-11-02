/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.pmml.config.v4.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="field" use="required" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BlockIndicator")
public class BlockIndicator
{

  @XmlAttribute(name = "field", required = true)
  protected String field;

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

}
