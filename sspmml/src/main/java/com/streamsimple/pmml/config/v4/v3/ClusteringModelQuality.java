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
 *       &lt;attribute name="dataName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SSE" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *       &lt;attribute name="SSB" type="{http://www.dmg.org/PMML-4_3}NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ClusteringModelQuality")
public class ClusteringModelQuality
{

  @XmlAttribute(name = "dataName")
  protected String dataName;
  @XmlAttribute(name = "SSE")
  protected Double sse;
  @XmlAttribute(name = "SSB")
  protected Double ssb;

  /**
   * Gets the value of the dataName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDataName()
  {
    return dataName;
  }

  /**
   * Sets the value of the dataName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDataName(String value)
  {
    this.dataName = value;
  }

  /**
   * Gets the value of the sse property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getSSE()
  {
    return sse;
  }

  /**
   * Sets the value of the sse property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setSSE(Double value)
  {
    this.sse = value;
  }

  /**
   * Gets the value of the ssb property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getSSB()
  {
    return ssb;
  }

  /**
   * Sets the value of the ssb property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setSSB(Double value)
  {
    this.ssb = value;
  }

}
