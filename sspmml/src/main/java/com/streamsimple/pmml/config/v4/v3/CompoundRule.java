/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}PREDICATE"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}Rule" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "simplePredicate",
    "compoundPredicate",
    "simpleSetPredicate",
    "_true",
    "_false",
    "rule"})
@XmlRootElement(name = "CompoundRule")
public class CompoundRule
{
  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "SimplePredicate")
  protected SimplePredicate simplePredicate;
  @XmlElement(name = "CompoundPredicate")
  protected CompoundPredicate compoundPredicate;
  @XmlElement(name = "SimpleSetPredicate")
  protected SimpleSetPredicate simpleSetPredicate;
  @XmlElement(name = "True")
  protected True _true;
  @XmlElement(name = "False")
  protected False _false;
  @XmlElements( {
      @XmlElement(name = "SimpleRule", type = SimpleRule.class),
      @XmlElement(name = "CompoundRule", type = CompoundRule.class)})
  protected List<Object> rule;

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
   * Gets the value of the simplePredicate property.
   *
   * @return possible object is
   * {@link SimplePredicate }
   */
  public SimplePredicate getSimplePredicate()
  {
    return simplePredicate;
  }

  /**
   * Sets the value of the simplePredicate property.
   *
   * @param value allowed object is
   *              {@link SimplePredicate }
   */
  public void setSimplePredicate(SimplePredicate value)
  {
    this.simplePredicate = value;
  }

  /**
   * Gets the value of the compoundPredicate property.
   *
   * @return possible object is
   * {@link CompoundPredicate }
   */
  public CompoundPredicate getCompoundPredicate()
  {
    return compoundPredicate;
  }

  /**
   * Sets the value of the compoundPredicate property.
   *
   * @param value allowed object is
   *              {@link CompoundPredicate }
   */
  public void setCompoundPredicate(CompoundPredicate value)
  {
    this.compoundPredicate = value;
  }

  /**
   * Gets the value of the simpleSetPredicate property.
   *
   * @return possible object is
   * {@link SimpleSetPredicate }
   */
  public SimpleSetPredicate getSimpleSetPredicate()
  {
    return simpleSetPredicate;
  }

  /**
   * Sets the value of the simpleSetPredicate property.
   *
   * @param value allowed object is
   *              {@link SimpleSetPredicate }
   */
  public void setSimpleSetPredicate(SimpleSetPredicate value)
  {
    this.simpleSetPredicate = value;
  }

  /**
   * Gets the value of the true property.
   *
   * @return possible object is
   * {@link True }
   */
  public True getTrue()
  {
    return _true;
  }

  /**
   * Sets the value of the true property.
   *
   * @param value allowed object is
   *              {@link True }
   */
  public void setTrue(True value)
  {
    this._true = value;
  }

  /**
   * Gets the value of the false property.
   *
   * @return possible object is
   * {@link False }
   */
  public False getFalse()
  {
    return _false;
  }

  /**
   * Sets the value of the false property.
   *
   * @param value allowed object is
   *              {@link False }
   */
  public void setFalse(False value)
  {
    this._false = value;
  }

  /**
   * Gets the value of the rule property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the rule property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRule().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link SimpleRule }
   * {@link CompoundRule }
   */
  public List<Object> getRule()
  {
    if (rule == null) {
      rule = new ArrayList<Object>();
    }
    return this.rule;
  }

}
