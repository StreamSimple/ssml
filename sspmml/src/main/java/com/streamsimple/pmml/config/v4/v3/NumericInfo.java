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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Quantile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="minimum" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="maximum" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="mean" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="standardDeviation" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="median" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="interQuartileRange" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "quantile"})
@XmlRootElement(name = "NumericInfo")
public class NumericInfo
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "Quantile")
  protected List<Quantile> quantile;
  @XmlAttribute(name = "minimum")
  protected Double minimum;
  @XmlAttribute(name = "maximum")
  protected Double maximum;
  @XmlAttribute(name = "mean")
  protected Double mean;
  @XmlAttribute(name = "standardDeviation")
  protected Double standardDeviation;
  @XmlAttribute(name = "median")
  protected Double median;
  @XmlAttribute(name = "interQuartileRange")
  protected Double interQuartileRange;

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
   * Gets the value of the quantile property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the quantile property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getQuantile().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Quantile }
   */
  public List<Quantile> getQuantile()
  {
    if (quantile == null) {
      quantile = new ArrayList<Quantile>();
    }
    return this.quantile;
  }

  /**
   * Gets the value of the minimum property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getMinimum()
  {
    return minimum;
  }

  /**
   * Sets the value of the minimum property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setMinimum(Double value)
  {
    this.minimum = value;
  }

  /**
   * Gets the value of the maximum property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getMaximum()
  {
    return maximum;
  }

  /**
   * Sets the value of the maximum property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setMaximum(Double value)
  {
    this.maximum = value;
  }

  /**
   * Gets the value of the mean property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getMean()
  {
    return mean;
  }

  /**
   * Sets the value of the mean property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setMean(Double value)
  {
    this.mean = value;
  }

  /**
   * Gets the value of the standardDeviation property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getStandardDeviation()
  {
    return standardDeviation;
  }

  /**
   * Sets the value of the standardDeviation property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setStandardDeviation(Double value)
  {
    this.standardDeviation = value;
  }

  /**
   * Gets the value of the median property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getMedian()
  {
    return median;
  }

  /**
   * Sets the value of the median property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setMedian(Double value)
  {
    this.median = value;
  }

  /**
   * Gets the value of the interQuartileRange property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getInterQuartileRange()
  {
    return interQuartileRange;
  }

  /**
   * Sets the value of the interQuartileRange property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setInterQuartileRange(Double value)
  {
    this.interQuartileRange = value;
  }

}
