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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Partition" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="displayValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="priorProbability" type="{http://www.dmg.org/PMML-4_3}PROB-NUMBER" />
 *       &lt;attribute name="defaultValue" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "partition"})
@XmlRootElement(name = "TargetValue")
public class TargetValue
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "Partition")
  protected Partition partition;
  @XmlAttribute(name = "value")
  protected String value;
  @XmlAttribute(name = "displayValue")
  protected String displayValue;
  @XmlAttribute(name = "priorProbability")
  protected Double priorProbability;
  @XmlAttribute(name = "defaultValue")
  protected Double defaultValue;

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
   * Gets the value of the partition property.
   *
   * @return possible object is
   * {@link Partition }
   */
  public Partition getPartition()
  {
    return partition;
  }

  /**
   * Sets the value of the partition property.
   *
   * @param value allowed object is
   *              {@link Partition }
   */
  public void setPartition(Partition value)
  {
    this.partition = value;
  }

  /**
   * Gets the value of the value property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getValue()
  {
    return value;
  }

  /**
   * Sets the value of the value property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setValue(String value)
  {
    this.value = value;
  }

  /**
   * Gets the value of the displayValue property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDisplayValue()
  {
    return displayValue;
  }

  /**
   * Sets the value of the displayValue property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDisplayValue(String value)
  {
    this.displayValue = value;
  }

  /**
   * Gets the value of the priorProbability property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getPriorProbability()
  {
    return priorProbability;
  }

  /**
   * Sets the value of the priorProbability property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setPriorProbability(Double value)
  {
    this.priorProbability = value;
  }

  /**
   * Gets the value of the defaultValue property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * Sets the value of the defaultValue property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setDefaultValue(Double value)
  {
    this.defaultValue = value;
  }

}