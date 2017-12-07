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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}PREDICATE"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_3}Partition" minOccurs="0"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_3}ScoreDistribution" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_3}Node" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;group ref="{http://www.dmg.org/PMML-4_3}EmbeddedModel"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="score" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recordCount" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="defaultChild" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"content"})
@XmlRootElement(name = "Node")
public class Node
{
  @XmlElementRefs( {
      @XmlElementRef(name = "SimplePredicate", namespace = "http://www.dmg.org/PMML-4_3", type = SimplePredicate.class, required = false),
      @XmlElementRef(name = "Extension", namespace = "http://www.dmg.org/PMML-4_3", type = Extension.class, required = false),
      @XmlElementRef(name = "ScoreDistribution", namespace = "http://www.dmg.org/PMML-4_3", type = ScoreDistribution.class, required = false),
      @XmlElementRef(name = "True", namespace = "http://www.dmg.org/PMML-4_3", type = True.class, required = false),
      @XmlElementRef(name = "SimpleSetPredicate", namespace = "http://www.dmg.org/PMML-4_3", type = SimpleSetPredicate.class, required = false),
      @XmlElementRef(name = "False", namespace = "http://www.dmg.org/PMML-4_3", type = False.class, required = false),
      @XmlElementRef(name = "DecisionTree", namespace = "http://www.dmg.org/PMML-4_3", type = DecisionTree.class, required = false),
      @XmlElementRef(name = "Node", namespace = "http://www.dmg.org/PMML-4_3", type = Node.class, required = false),
      @XmlElementRef(name = "CompoundPredicate", namespace = "http://www.dmg.org/PMML-4_3", type = CompoundPredicate.class, required = false),
      @XmlElementRef(name = "Partition", namespace = "http://www.dmg.org/PMML-4_3", type = Partition.class, required = false),
      @XmlElementRef(name = "Regression", namespace = "http://www.dmg.org/PMML-4_3", type = Regression.class, required = false)})
  protected List<Object> content;
  @XmlAttribute(name = "id")
  protected String id;
  @XmlAttribute(name = "score")
  protected String score;
  @XmlAttribute(name = "recordCount")
  protected Double recordCount;
  @XmlAttribute(name = "defaultChild")
  protected String defaultChild;

  /**
   * Gets the rest of the content model.
   * <p>
   * <p>
   * You are getting this "catch-all" property because of the following reason:
   * The field name "Extension" is used by two different parts of a schema. See:
   * line 1858 of file:/Users/tfarkas/dev/sspmml/src/main/resources/pmml-4-3.xsd
   * line 3788 of file:/Users/tfarkas/dev/sspmml/src/main/resources/pmml-4-3.xsd
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
   * {@link Extension }
   * {@link SimplePredicate }
   * {@link SimpleSetPredicate }
   * {@link True }
   * {@link ScoreDistribution }
   * {@link False }
   * {@link DecisionTree }
   * {@link CompoundPredicate }
   * {@link Node }
   * {@link Partition }
   * {@link Regression }
   */
  public List<Object> getContent()
  {
    if (content == null) {
      content = new ArrayList<Object>();
    }
    return this.content;
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
   * Gets the value of the defaultChild property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDefaultChild()
  {
    return defaultChild;
  }

  /**
   * Sets the value of the defaultChild property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDefaultChild(String value)
  {
    this.defaultChild = value;
  }

}
