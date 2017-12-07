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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}TriangularDistributionForBN"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}NormalDistributionForBN"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}LognormalDistributionForBN"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_3}UniformDistributionForBN"/>
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
    "triangularDistributionForBN",
    "normalDistributionForBN",
    "lognormalDistributionForBN",
    "uniformDistributionForBN"})
@XmlRootElement(name = "ContinuousDistribution")
public class ContinuousDistribution
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "TriangularDistributionForBN")
  protected TriangularDistributionForBN triangularDistributionForBN;
  @XmlElement(name = "NormalDistributionForBN")
  protected NormalDistributionForBN normalDistributionForBN;
  @XmlElement(name = "LognormalDistributionForBN")
  protected LognormalDistributionForBN lognormalDistributionForBN;
  @XmlElement(name = "UniformDistributionForBN")
  protected UniformDistributionForBN uniformDistributionForBN;

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
   * Gets the value of the triangularDistributionForBN property.
   *
   * @return possible object is
   * {@link TriangularDistributionForBN }
   */
  public TriangularDistributionForBN getTriangularDistributionForBN()
  {
    return triangularDistributionForBN;
  }

  /**
   * Sets the value of the triangularDistributionForBN property.
   *
   * @param value allowed object is
   *              {@link TriangularDistributionForBN }
   */
  public void setTriangularDistributionForBN(TriangularDistributionForBN value)
  {
    this.triangularDistributionForBN = value;
  }

  /**
   * Gets the value of the normalDistributionForBN property.
   *
   * @return possible object is
   * {@link NormalDistributionForBN }
   */
  public NormalDistributionForBN getNormalDistributionForBN()
  {
    return normalDistributionForBN;
  }

  /**
   * Sets the value of the normalDistributionForBN property.
   *
   * @param value allowed object is
   *              {@link NormalDistributionForBN }
   */
  public void setNormalDistributionForBN(NormalDistributionForBN value)
  {
    this.normalDistributionForBN = value;
  }

  /**
   * Gets the value of the lognormalDistributionForBN property.
   *
   * @return possible object is
   * {@link LognormalDistributionForBN }
   */
  public LognormalDistributionForBN getLognormalDistributionForBN()
  {
    return lognormalDistributionForBN;
  }

  /**
   * Sets the value of the lognormalDistributionForBN property.
   *
   * @param value allowed object is
   *              {@link LognormalDistributionForBN }
   */
  public void setLognormalDistributionForBN(LognormalDistributionForBN value)
  {
    this.lognormalDistributionForBN = value;
  }

  /**
   * Gets the value of the uniformDistributionForBN property.
   *
   * @return possible object is
   * {@link UniformDistributionForBN }
   */
  public UniformDistributionForBN getUniformDistributionForBN()
  {
    return uniformDistributionForBN;
  }

  /**
   * Sets the value of the uniformDistributionForBN property.
   *
   * @param value allowed object is
   *              {@link UniformDistributionForBN }
   */
  public void setUniformDistributionForBN(UniformDistributionForBN value)
  {
    this.uniformDistributionForBN = value;
  }

}
