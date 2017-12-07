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
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="optype" type="{http://www.dmg.org/PMML-4_3}OPTYPE" />
 *       &lt;attribute name="dataType" type="{http://www.dmg.org/PMML-4_3}DATATYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ParameterField")
public class ParameterField
{

  @XmlAttribute(name = "name", required = true)
  protected String name;
  @XmlAttribute(name = "optype")
  protected OPTYPE optype;
  @XmlAttribute(name = "dataType")
  protected DATATYPE dataType;

  /**
   * Gets the value of the name property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getName()
  {
    return name;
  }

  /**
   * Sets the value of the name property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setName(String value)
  {
    this.name = value;
  }

  /**
   * Gets the value of the optype property.
   *
   * @return possible object is
   * {@link OPTYPE }
   */
  public OPTYPE getOptype()
  {
    return optype;
  }

  /**
   * Sets the value of the optype property.
   *
   * @param value allowed object is
   *              {@link OPTYPE }
   */
  public void setOptype(OPTYPE value)
  {
    this.optype = value;
  }

  /**
   * Gets the value of the dataType property.
   *
   * @return possible object is
   * {@link DATATYPE }
   */
  public DATATYPE getDataType()
  {
    return dataType;
  }

  /**
   * Sets the value of the dataType property.
   *
   * @param value allowed object is
   *              {@link DATATYPE }
   */
  public void setDataType(DATATYPE value)
  {
    this.dataType = value;
  }

}
