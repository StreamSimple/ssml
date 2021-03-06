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
 *       &lt;choice>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}CONTINUOUS-DISTRIBUTION-TYPES"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}DISCRETE-DISTRIBUTION-TYPES"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "anyDistribution",
    "gaussianDistribution",
    "poissonDistribution",
    "uniformDistribution",
    "extension",
    "countTable",
    "normalizedCountTable",
    "fieldRef"})
@XmlRootElement(name = "Baseline")
public class Baseline
{

  @XmlElement(name = "AnyDistribution")
  protected AnyDistribution anyDistribution;
  @XmlElement(name = "GaussianDistribution")
  protected GaussianDistribution gaussianDistribution;
  @XmlElement(name = "PoissonDistribution")
  protected PoissonDistribution poissonDistribution;
  @XmlElement(name = "UniformDistribution")
  protected UniformDistribution uniformDistribution;
  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "CountTable")
  protected COUNTTABLETYPE countTable;
  @XmlElement(name = "NormalizedCountTable")
  protected COUNTTABLETYPE normalizedCountTable;
  @XmlElement(name = "FieldRef")
  protected List<FieldRef> fieldRef;

  /**
   * Gets the value of the anyDistribution property.
   *
   * @return possible object is
   * {@link AnyDistribution }
   */
  public AnyDistribution getAnyDistribution()
  {
    return anyDistribution;
  }

  /**
   * Sets the value of the anyDistribution property.
   *
   * @param value allowed object is
   *              {@link AnyDistribution }
   */
  public void setAnyDistribution(AnyDistribution value)
  {
    this.anyDistribution = value;
  }

  /**
   * Gets the value of the gaussianDistribution property.
   *
   * @return possible object is
   * {@link GaussianDistribution }
   */
  public GaussianDistribution getGaussianDistribution()
  {
    return gaussianDistribution;
  }

  /**
   * Sets the value of the gaussianDistribution property.
   *
   * @param value allowed object is
   *              {@link GaussianDistribution }
   */
  public void setGaussianDistribution(GaussianDistribution value)
  {
    this.gaussianDistribution = value;
  }

  /**
   * Gets the value of the poissonDistribution property.
   *
   * @return possible object is
   * {@link PoissonDistribution }
   */
  public PoissonDistribution getPoissonDistribution()
  {
    return poissonDistribution;
  }

  /**
   * Sets the value of the poissonDistribution property.
   *
   * @param value allowed object is
   *              {@link PoissonDistribution }
   */
  public void setPoissonDistribution(PoissonDistribution value)
  {
    this.poissonDistribution = value;
  }

  /**
   * Gets the value of the uniformDistribution property.
   *
   * @return possible object is
   * {@link UniformDistribution }
   */
  public UniformDistribution getUniformDistribution()
  {
    return uniformDistribution;
  }

  /**
   * Sets the value of the uniformDistribution property.
   *
   * @param value allowed object is
   *              {@link UniformDistribution }
   */
  public void setUniformDistribution(UniformDistribution value)
  {
    this.uniformDistribution = value;
  }

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
   * Gets the value of the countTable property.
   *
   * @return possible object is
   * {@link COUNTTABLETYPE }
   */
  public COUNTTABLETYPE getCountTable()
  {
    return countTable;
  }

  /**
   * Sets the value of the countTable property.
   *
   * @param value allowed object is
   *              {@link COUNTTABLETYPE }
   */
  public void setCountTable(COUNTTABLETYPE value)
  {
    this.countTable = value;
  }

  /**
   * Gets the value of the normalizedCountTable property.
   *
   * @return possible object is
   * {@link COUNTTABLETYPE }
   */
  public COUNTTABLETYPE getNormalizedCountTable()
  {
    return normalizedCountTable;
  }

  /**
   * Sets the value of the normalizedCountTable property.
   *
   * @param value allowed object is
   *              {@link COUNTTABLETYPE }
   */
  public void setNormalizedCountTable(COUNTTABLETYPE value)
  {
    this.normalizedCountTable = value;
  }

  /**
   * Gets the value of the fieldRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the fieldRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFieldRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link FieldRef }
   */
  public List<FieldRef> getFieldRef()
  {
    if (fieldRef == null) {
      fieldRef = new ArrayList<FieldRef>();
    }
    return this.fieldRef;
  }

}
