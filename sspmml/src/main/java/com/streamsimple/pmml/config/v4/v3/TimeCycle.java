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

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}INT-ARRAY" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="length" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="type" type="{http://www.dmg.org/PMML-4_3}VALID-TIME-SPEC" />
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "array"})
@XmlRootElement(name = "TimeCycle")
public class TimeCycle
{

  @XmlElement(name = "Array")
  protected ArrayType array;
  @XmlAttribute(name = "length")
  protected BigInteger length;
  @XmlAttribute(name = "type")
  protected VALIDTIMESPEC type;
  @XmlAttribute(name = "displayName")
  @XmlSchemaType(name = "anySimpleType")
  protected String displayName;

  /**
   * Gets the value of the array property.
   *
   * @return possible object is
   * {@link ArrayType }
   */
  public ArrayType getArray()
  {
    return array;
  }

  /**
   * Sets the value of the array property.
   *
   * @param value allowed object is
   *              {@link ArrayType }
   */
  public void setArray(ArrayType value)
  {
    this.array = value;
  }

  /**
   * Gets the value of the length property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getLength()
  {
    return length;
  }

  /**
   * Sets the value of the length property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setLength(BigInteger value)
  {
    this.length = value;
  }

  /**
   * Gets the value of the type property.
   *
   * @return possible object is
   * {@link VALIDTIMESPEC }
   */
  public VALIDTIMESPEC getType()
  {
    return type;
  }

  /**
   * Sets the value of the type property.
   *
   * @param value allowed object is
   *              {@link VALIDTIMESPEC }
   */
  public void setType(VALIDTIMESPEC value)
  {
    this.type = value;
  }

  /**
   * Gets the value of the displayName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDisplayName()
  {
    return displayName;
  }

  /**
   * Sets the value of the displayName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDisplayName(String value)
  {
    this.displayName = value;
  }

}
