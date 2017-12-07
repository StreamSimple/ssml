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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACTIVATION-FUNCTION.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ACTIVATION-FUNCTION">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="threshold"/>
 *     &lt;enumeration value="logistic"/>
 *     &lt;enumeration value="tanh"/>
 *     &lt;enumeration value="identity"/>
 *     &lt;enumeration value="exponential"/>
 *     &lt;enumeration value="reciprocal"/>
 *     &lt;enumeration value="square"/>
 *     &lt;enumeration value="Gauss"/>
 *     &lt;enumeration value="sine"/>
 *     &lt;enumeration value="cosine"/>
 *     &lt;enumeration value="Elliott"/>
 *     &lt;enumeration value="arctan"/>
 *     &lt;enumeration value="rectifier"/>
 *     &lt;enumeration value="radialBasis"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ACTIVATION-FUNCTION")
@XmlEnum
public enum ACTIVATIONFUNCTION
{

  @XmlEnumValue("threshold")
  THRESHOLD("threshold"),
  @XmlEnumValue("logistic")
  LOGISTIC("logistic"),
  @XmlEnumValue("tanh")
  TANH("tanh"),
  @XmlEnumValue("identity")
  IDENTITY("identity"),
  @XmlEnumValue("exponential")
  EXPONENTIAL("exponential"),
  @XmlEnumValue("reciprocal")
  RECIPROCAL("reciprocal"),
  @XmlEnumValue("square")
  SQUARE("square"),
  @XmlEnumValue("Gauss")
  GAUSS("Gauss"),
  @XmlEnumValue("sine")
  SINE("sine"),
  @XmlEnumValue("cosine")
  COSINE("cosine"),
  @XmlEnumValue("Elliott")
  ELLIOTT("Elliott"),
  @XmlEnumValue("arctan")
  ARCTAN("arctan"),
  @XmlEnumValue("rectifier")
  RECTIFIER("rectifier"),
  @XmlEnumValue("radialBasis")
  RADIAL_BASIS("radialBasis");
  private final String value;

  ACTIVATIONFUNCTION(String v)
  {
    value = v;
  }

  public String value()
  {
    return value;
  }

  public static ACTIVATIONFUNCTION fromValue(String v)
  {
    for (ACTIVATIONFUNCTION c : ACTIVATIONFUNCTION.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
