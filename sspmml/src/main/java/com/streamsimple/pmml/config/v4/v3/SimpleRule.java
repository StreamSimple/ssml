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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}PREDICATE"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ScoreDistribution" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="score" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recordCount" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="nbCorrect" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="confidence" type="{http://www.dmg.org/PMML-4_3}NUMBER" default="1" />
 *       &lt;attribute name="weight" type="{http://www.dmg.org/PMML-4_3}NUMBER" default="1" />
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
    "scoreDistribution"})
@XmlRootElement(name = "SimpleRule")
public class SimpleRule
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
  @XmlElement(name = "ScoreDistribution")
  protected List<ScoreDistribution> scoreDistribution;
  @XmlAttribute(name = "id")
  protected String id;
  @XmlAttribute(name = "score", required = true)
  protected String score;
  @XmlAttribute(name = "recordCount")
  protected Double recordCount;
  @XmlAttribute(name = "nbCorrect")
  protected Double nbCorrect;
  @XmlAttribute(name = "confidence")
  protected Double confidence;
  @XmlAttribute(name = "weight")
  protected Double weight;

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
   * Gets the value of the scoreDistribution property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the scoreDistribution property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getScoreDistribution().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link ScoreDistribution }
   */
  public List<ScoreDistribution> getScoreDistribution()
  {
    if (scoreDistribution == null) {
      scoreDistribution = new ArrayList<ScoreDistribution>();
    }
    return this.scoreDistribution;
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
   * Gets the value of the score property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getScore()
  {
    return score;
  }

  /**
   * Sets the value of the score property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setScore(String value)
  {
    this.score = value;
  }

  /**
   * Gets the value of the recordCount property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getRecordCount()
  {
    return recordCount;
  }

  /**
   * Sets the value of the recordCount property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setRecordCount(Double value)
  {
    this.recordCount = value;
  }

  /**
   * Gets the value of the nbCorrect property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getNbCorrect()
  {
    return nbCorrect;
  }

  /**
   * Sets the value of the nbCorrect property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setNbCorrect(Double value)
  {
    this.nbCorrect = value;
  }

  /**
   * Gets the value of the confidence property.
   *
   * @return possible object is
   * {@link Double }
   */
  public double getConfidence()
  {
    if (confidence == null) {
      return 1.0D;
    } else {
      return confidence;
    }
  }

  /**
   * Sets the value of the confidence property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setConfidence(Double value)
  {
    this.confidence = value;
  }

  /**
   * Gets the value of the weight property.
   *
   * @return possible object is
   * {@link Double }
   */
  public double getWeight()
  {
    if (weight == null) {
      return 1.0D;
    } else {
      return weight;
    }
  }

  /**
   * Sets the value of the weight property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setWeight(Double value)
  {
    this.weight = value;
  }

}
