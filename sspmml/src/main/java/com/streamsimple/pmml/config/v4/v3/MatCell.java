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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="row" use="required" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="col" use="required" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"})
@XmlRootElement(name = "MatCell")
public class MatCell
{

  @XmlValue
  protected String value;
  @XmlAttribute(name = "row", required = true)
  protected BigInteger row;
  @XmlAttribute(name = "col", required = true)
  protected BigInteger col;

  /**
   * Gets the value of the value property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getValue()
  {
    return value;
  }

  /**
   * Sets the value of the value property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setValue(String value)
  {
    this.value = value;
  }

  /**
   * Gets the value of the row property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getRow()
  {
    return row;
  }

  /**
   * Sets the value of the row property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setRow(BigInteger value)
  {
    this.row = value;
  }

  /**
   * Gets the value of the col property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getCol()
  {
    return col;
  }

  /**
   * Sets the value of the col property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setCol(BigInteger value)
  {
    this.col = value;
  }

}
