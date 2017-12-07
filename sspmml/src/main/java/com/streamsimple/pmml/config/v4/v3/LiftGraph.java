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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}XCoordinates"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}YCoordinates"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}BoundaryValues" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}BoundaryValueMeans" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "xCoordinates",
    "yCoordinates",
    "boundaryValues",
    "boundaryValueMeans"})
@XmlRootElement(name = "LiftGraph")
public class LiftGraph
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "XCoordinates", required = true)
  protected XCoordinates xCoordinates;
  @XmlElement(name = "YCoordinates", required = true)
  protected YCoordinates yCoordinates;
  @XmlElement(name = "BoundaryValues")
  protected BoundaryValues boundaryValues;
  @XmlElement(name = "BoundaryValueMeans")
  protected BoundaryValueMeans boundaryValueMeans;

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
   * Gets the value of the xCoordinates property.
   *
   * @return possible object is
   * {@link XCoordinates }
   */
  public XCoordinates getXCoordinates()
  {
    return xCoordinates;
  }

  /**
   * Sets the value of the xCoordinates property.
   *
   * @param value allowed object is
   *              {@link XCoordinates }
   */
  public void setXCoordinates(XCoordinates value)
  {
    this.xCoordinates = value;
  }

  /**
   * Gets the value of the yCoordinates property.
   *
   * @return possible object is
   * {@link YCoordinates }
   */
  public YCoordinates getYCoordinates()
  {
    return yCoordinates;
  }

  /**
   * Sets the value of the yCoordinates property.
   *
   * @param value allowed object is
   *              {@link YCoordinates }
   */
  public void setYCoordinates(YCoordinates value)
  {
    this.yCoordinates = value;
  }

  /**
   * Gets the value of the boundaryValues property.
   *
   * @return possible object is
   * {@link BoundaryValues }
   */
  public BoundaryValues getBoundaryValues()
  {
    return boundaryValues;
  }

  /**
   * Sets the value of the boundaryValues property.
   *
   * @param value allowed object is
   *              {@link BoundaryValues }
   */
  public void setBoundaryValues(BoundaryValues value)
  {
    this.boundaryValues = value;
  }

  /**
   * Gets the value of the boundaryValueMeans property.
   *
   * @return possible object is
   * {@link BoundaryValueMeans }
   */
  public BoundaryValueMeans getBoundaryValueMeans()
  {
    return boundaryValueMeans;
  }

  /**
   * Sets the value of the boundaryValueMeans property.
   *
   * @param value allowed object is
   *              {@link BoundaryValueMeans }
   */
  public void setBoundaryValueMeans(BoundaryValueMeans value)
  {
    this.boundaryValueMeans = value;
  }

}
