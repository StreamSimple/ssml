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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ParentValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ContinuousDistribution" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "parentValue",
    "continuousDistribution"})
@XmlRootElement(name = "ContinuousConditionalProbability")
public class ContinuousConditionalProbability
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "ParentValue")
  protected List<ParentValue> parentValue;
  @XmlElement(name = "ContinuousDistribution", required = true)
  protected List<ContinuousDistribution> continuousDistribution;
  @XmlAttribute(name = "count")
  protected Double count;

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
   * Gets the value of the parentValue property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the parentValue property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getParentValue().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link ParentValue }
   */
  public List<ParentValue> getParentValue()
  {
    if (parentValue == null) {
      parentValue = new ArrayList<ParentValue>();
    }
    return this.parentValue;
  }

  /**
   * Gets the value of the continuousDistribution property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the continuousDistribution property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getContinuousDistribution().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link ContinuousDistribution }
   */
  public List<ContinuousDistribution> getContinuousDistribution()
  {
    if (continuousDistribution == null) {
      continuousDistribution = new ArrayList<ContinuousDistribution>();
    }
    return this.continuousDistribution;
  }

  /**
   * Gets the value of the count property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getCount()
  {
    return count;
  }

  /**
   * Sets the value of the count property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setCount(Double value)
  {
    this.count = value;
  }

}
