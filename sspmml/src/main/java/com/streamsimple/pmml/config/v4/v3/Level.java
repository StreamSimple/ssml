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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="alpha" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="smoothedValue" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Level")
public class Level
{

  @XmlAttribute(name = "alpha")
  protected Double alpha;
  @XmlAttribute(name = "smoothedValue")
  protected Double smoothedValue;

  /**
   * Gets the value of the alpha property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getAlpha()
  {
    return alpha;
  }

  /**
   * Sets the value of the alpha property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setAlpha(Double value)
  {
    this.alpha = value;
  }

  /**
   * Gets the value of the smoothedValue property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getSmoothedValue()
  {
    return smoothedValue;
  }

  /**
   * Sets the value of the smoothedValue property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setSmoothedValue(Double value)
  {
    this.smoothedValue = value;
  }

}
