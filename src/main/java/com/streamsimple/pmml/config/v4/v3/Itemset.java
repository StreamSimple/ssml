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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ItemRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="support" type="{http://www.dmg.org/PMML-4_3}PROB-NUMBER" />
 *       &lt;attribute name="numberOfItems" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "itemRef"})
@XmlRootElement(name = "Itemset")
public class Itemset
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "ItemRef")
  protected List<ItemRef> itemRef;
  @XmlAttribute(name = "id", required = true)
  protected String id;
  @XmlAttribute(name = "support")
  protected Double support;
  @XmlAttribute(name = "numberOfItems")
  @XmlSchemaType(name = "nonNegativeInteger")
  protected BigInteger numberOfItems;

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
   * Gets the value of the itemRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the itemRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getItemRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link ItemRef }
   */
  public List<ItemRef> getItemRef()
  {
    if (itemRef == null) {
      itemRef = new ArrayList<ItemRef>();
    }
    return this.itemRef;
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

  /**
   * Gets the value of the numberOfItems property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getNumberOfItems()
  {
    return numberOfItems;
  }

  /**
   * Sets the value of the numberOfItems property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setNumberOfItems(BigInteger value)
  {
    this.numberOfItems = value;
  }

}
