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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}VectorFields"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}VectorInstance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="numberOfVectors" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "vectorFields",
    "vectorInstance"})
@XmlRootElement(name = "VectorDictionary")
public class VectorDictionary
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "VectorFields", required = true)
  protected VectorFields vectorFields;
  @XmlElement(name = "VectorInstance")
  protected List<VectorInstance> vectorInstance;
  @XmlAttribute(name = "numberOfVectors")
  protected BigInteger numberOfVectors;

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
   * Gets the value of the vectorFields property.
   *
   * @return possible object is
   * {@link VectorFields }
   */
  public VectorFields getVectorFields()
  {
    return vectorFields;
  }

  /**
   * Sets the value of the vectorFields property.
   *
   * @param value allowed object is
   *              {@link VectorFields }
   */
  public void setVectorFields(VectorFields value)
  {
    this.vectorFields = value;
  }

  /**
   * Gets the value of the vectorInstance property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the vectorInstance property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getVectorInstance().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link VectorInstance }
   */
  public List<VectorInstance> getVectorInstance()
  {
    if (vectorInstance == null) {
      vectorInstance = new ArrayList<VectorInstance>();
    }
    return this.vectorInstance;
  }

  /**
   * Gets the value of the numberOfVectors property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getNumberOfVectors()
  {
    return numberOfVectors;
  }

  /**
   * Sets the value of the numberOfVectors property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setNumberOfVectors(BigInteger value)
  {
    this.numberOfVectors = value;
  }

}
