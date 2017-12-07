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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}INT-ARRAY"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.dmg.org/PMML-4_3}TIME-EXCEPTION-TYPE" />
 *       &lt;attribute name="count" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "array"})
@XmlRootElement(name = "TimeException")
public class TimeException
{

  @XmlElement(name = "Array")
  protected ArrayType array;
  @XmlAttribute(name = "type")
  protected TIMEEXCEPTIONTYPE type;
  @XmlAttribute(name = "count")
  protected BigInteger count;

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
   * Gets the value of the type property.
   *
   * @return possible object is
   * {@link TIMEEXCEPTIONTYPE }
   */
  public TIMEEXCEPTIONTYPE getType()
  {
    return type;
  }

  /**
   * Sets the value of the type property.
   *
   * @param value allowed object is
   *              {@link TIMEEXCEPTIONTYPE }
   */
  public void setType(TIMEEXCEPTIONTYPE value)
  {
    this.type = value;
  }

  /**
   * Gets the value of the count property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getCount()
  {
    return count;
  }

  /**
   * Sets the value of the count property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setCount(BigInteger value)
  {
    this.count = value;
  }

}
