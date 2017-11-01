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
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}DiscreteNode"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}ContinuousNode"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "discreteNodeOrContinuousNode"})
@XmlRootElement(name = "BayesianNetworkNodes")
public class BayesianNetworkNodes
{
  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElements( {
      @XmlElement(name = "DiscreteNode", type = DiscreteNode.class),
      @XmlElement(name = "ContinuousNode", type = ContinuousNode.class)})
  protected List<Object> discreteNodeOrContinuousNode;

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
   * Gets the value of the discreteNodeOrContinuousNode property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the discreteNodeOrContinuousNode property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDiscreteNodeOrContinuousNode().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link DiscreteNode }
   * {@link ContinuousNode }
   */
  public List<Object> getDiscreteNodeOrContinuousNode()
  {
    if (discreteNodeOrContinuousNode == null) {
      discreteNodeOrContinuousNode = new ArrayList<Object>();
    }
    return this.discreteNodeOrContinuousNode;
  }

}
