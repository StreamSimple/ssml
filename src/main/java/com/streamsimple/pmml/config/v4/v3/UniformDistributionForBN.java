/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.pmml.config.v4.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Lower"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Upper"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "lower",
    "upper"})
@XmlRootElement(name = "UniformDistributionForBN")
public class UniformDistributionForBN
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "Lower", required = true)
  protected Lower lower;
  @XmlElement(name = "Upper", required = true)
  protected Upper upper;

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
   * Gets the value of the lower property.
   *
   * @return possible object is
   * {@link Lower }
   */
  public Lower getLower()
  {
    return lower;
  }

  /**
   * Sets the value of the lower property.
   *
   * @param value allowed object is
   *              {@link Lower }
   */
  public void setLower(Lower value)
  {
    this.lower = value;
  }

  /**
   * Gets the value of the upper property.
   *
   * @return possible object is
   * {@link Upper }
   */
  public Upper getUpper()
  {
    return upper;
  }

  /**
   * Sets the value of the upper property.
   *
   * @param value allowed object is
   *              {@link Upper }
   */
  public void setUpper(Upper value)
  {
    this.upper = value;
  }

}
