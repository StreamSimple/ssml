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
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="predictorName" use="required" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="parameterName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="targetCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension"})
@XmlRootElement(name = "PPCell")
public class PPCell
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlAttribute(name = "value", required = true)
  protected String value;
  @XmlAttribute(name = "predictorName", required = true)
  protected String predictorName;
  @XmlAttribute(name = "parameterName", required = true)
  protected String parameterName;
  @XmlAttribute(name = "targetCategory")
  protected String targetCategory;

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
   * Gets the value of the predictorName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getPredictorName()
  {
    return predictorName;
  }

  /**
   * Sets the value of the predictorName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setPredictorName(String value)
  {
    this.predictorName = value;
  }

  /**
   * Gets the value of the parameterName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getParameterName()
  {
    return parameterName;
  }

  /**
   * Sets the value of the parameterName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setParameterName(String value)
  {
    this.parameterName = value;
  }

  /**
   * Gets the value of the targetCategory property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getTargetCategory()
  {
    return targetCategory;
  }

  /**
   * Sets the value of the targetCategory property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setTargetCategory(String value)
  {
    this.targetCategory = value;
  }

}
