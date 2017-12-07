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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ArrayType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="n" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="int"/>
 *             &lt;enumeration value="real"/>
 *             &lt;enumeration value="string"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayType", propOrder = {
    "content"})
public class ArrayType
{

  @XmlValue
  protected String content;
  @XmlAttribute(name = "n")
  protected BigInteger n;
  @XmlAttribute(name = "type", required = true)
  protected String type;

  /**
   * Gets the value of the content property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getContent()
  {
    return content;
  }

  /**
   * Sets the value of the content property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setContent(String value)
  {
    this.content = value;
  }

  /**
   * Gets the value of the n property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getN()
  {
    return n;
  }

  /**
   * Sets the value of the n property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setN(BigInteger value)
  {
    this.n = value;
  }

  /**
   * Gets the value of the type property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getType()
  {
    return type;
  }

  /**
   * Sets the value of the type property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setType(String value)
  {
    this.type = value;
  }

}
