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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Segment" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="multipleModelMethod" use="required" type="{http://www.dmg.org/PMML-4_3}MULTIPLE-MODEL-METHOD" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "segment"})
@XmlRootElement(name = "Segmentation")
public class Segmentation
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "Segment", required = true)
  protected List<Segment> segment;
  @XmlAttribute(name = "multipleModelMethod", required = true)
  protected MULTIPLEMODELMETHOD multipleModelMethod;

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
   * Gets the value of the segment property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the segment property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSegment().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Segment }
   */
  public List<Segment> getSegment()
  {
    if (segment == null) {
      segment = new ArrayList<Segment>();
    }
    return this.segment;
  }

  /**
   * Gets the value of the multipleModelMethod property.
   *
   * @return possible object is
   * {@link MULTIPLEMODELMETHOD }
   */
  public MULTIPLEMODELMETHOD getMultipleModelMethod()
  {
    return multipleModelMethod;
  }

  /**
   * Sets the value of the multipleModelMethod property.
   *
   * @param value allowed object is
   *              {@link MULTIPLEMODELMETHOD }
   */
  public void setMultipleModelMethod(MULTIPLEMODELMETHOD value)
  {
    this.multipleModelMethod = value;
  }

}
