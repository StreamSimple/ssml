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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}CONTINUOUS-DISTRIBUTION-TYPES"/>
 *       &lt;/sequence>
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"content"})
@XmlRootElement(name = "TargetValueStat")
public class TargetValueStat
{
  @XmlElementRefs( {
      @XmlElementRef(name = "GaussianDistribution", namespace = "http://www.dmg.org/PMML-4_3", type = GaussianDistribution.class, required = false),
      @XmlElementRef(name = "AnyDistribution", namespace = "http://www.dmg.org/PMML-4_3", type = AnyDistribution.class, required = false),
      @XmlElementRef(name = "Extension", namespace = "http://www.dmg.org/PMML-4_3", type = Extension.class, required = false),
      @XmlElementRef(name = "PoissonDistribution", namespace = "http://www.dmg.org/PMML-4_3", type = PoissonDistribution.class, required = false),
      @XmlElementRef(name = "UniformDistribution", namespace = "http://www.dmg.org/PMML-4_3", type = UniformDistribution.class, required = false)})
  protected List<Object> content;
  @XmlAttribute(name = "value", required = true)
  protected String value;

  /**
   * Gets the rest of the content model.
   * <p>
   * <p>
   * You are getting this "catch-all" property because of the following reason:
   * The field name "Extension" is used by two different parts of a schema. See:
   * line 148 of file:/Users/tfarkas/dev/sspmml/src/main/resources/pmml-4-3.xsd
   * line 1988 of file:/Users/tfarkas/dev/sspmml/src/main/resources/pmml-4-3.xsd
   * <p>
   * To get rid of this property, apply a property customization to one
   * of both of the following declarations to change their names:
   * Gets the value of the content property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the content property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getContent().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link GaussianDistribution }
   * {@link Extension }
   * {@link AnyDistribution }
   * {@link UniformDistribution }
   * {@link PoissonDistribution }
   */
  public List<Object> getContent()
  {
    if (content == null) {
      content = new ArrayList<Object>();
    }
    return this.content;
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

}
