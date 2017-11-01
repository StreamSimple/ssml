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
 *       &lt;/sequence>
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gamma" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" default="1" />
 *       &lt;attribute name="coef0" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" default="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension"})
@XmlRootElement(name = "SigmoidKernelType")
public class SigmoidKernelType
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlAttribute(name = "description")
  protected String description;
  @XmlAttribute(name = "gamma")
  protected Double gamma;
  @XmlAttribute(name = "coef0")
  protected Double coef0;

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
   * Gets the value of the description property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * Sets the value of the description property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDescription(String value)
  {
    this.description = value;
  }

  /**
   * Gets the value of the gamma property.
   *
   * @return possible object is
   * {@link Double }
   */
  public double getGamma()
  {
    if (gamma == null) {
      return 1.0D;
    } else {
      return gamma;
    }
  }

  /**
   * Sets the value of the gamma property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setGamma(Double value)
  {
    this.gamma = value;
  }

  /**
   * Gets the value of the coef0 property.
   *
   * @return possible object is
   * {@link Double }
   */
  public double getCoef0()
  {
    if (coef0 == null) {
      return 1.0D;
    } else {
      return coef0;
    }
  }

  /**
   * Sets the value of the coef0 property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setCoef0(Double value)
  {
    this.coef0 = value;
  }

}