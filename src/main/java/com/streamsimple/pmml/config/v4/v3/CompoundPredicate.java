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
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;sequence maxOccurs="unbounded" minOccurs="2">
 *           &lt;group ref="{http://www.dmg.org/PMML-4_3}PREDICATE"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="booleanOperator" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="or"/>
 *             &lt;enumeration value="and"/>
 *             &lt;enumeration value="xor"/>
 *             &lt;enumeration value="surrogate"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "simplePredicateOrCompoundPredicateOrSimpleSetPredicate"})
@XmlRootElement(name = "CompoundPredicate")
public class CompoundPredicate
{
  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElements( {
      @XmlElement(name = "SimplePredicate", type = SimplePredicate.class),
      @XmlElement(name = "CompoundPredicate", type = CompoundPredicate.class),
      @XmlElement(name = "SimpleSetPredicate", type = SimpleSetPredicate.class),
      @XmlElement(name = "True", type = True.class),
      @XmlElement(name = "False", type = False.class)})
  protected List<Object> simplePredicateOrCompoundPredicateOrSimpleSetPredicate;
  @XmlAttribute(name = "booleanOperator", required = true)
  protected String booleanOperator;

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
   * Gets the value of the simplePredicateOrCompoundPredicateOrSimpleSetPredicate property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the simplePredicateOrCompoundPredicateOrSimpleSetPredicate property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSimplePredicateOrCompoundPredicateOrSimpleSetPredicate().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link SimplePredicate }
   * {@link CompoundPredicate }
   * {@link SimpleSetPredicate }
   * {@link True }
   * {@link False }
   */
  public List<Object> getSimplePredicateOrCompoundPredicateOrSimpleSetPredicate()
  {
    if (simplePredicateOrCompoundPredicateOrSimpleSetPredicate == null) {
      simplePredicateOrCompoundPredicateOrSimpleSetPredicate = new ArrayList<Object>();
    }
    return this.simplePredicateOrCompoundPredicateOrSimpleSetPredicate;
  }

  /**
   * Gets the value of the booleanOperator property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getBooleanOperator()
  {
    return booleanOperator;
  }

  /**
   * Sets the value of the booleanOperator property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setBooleanOperator(String value)
  {
    this.booleanOperator = value;
  }

}
