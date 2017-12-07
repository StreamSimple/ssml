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
 * <p>Java class for REGRESSIONNORMALIZATIONMETHOD.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="REGRESSIONNORMALIZATIONMETHOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="simplemax"/>
 *     &lt;enumeration value="softmax"/>
 *     &lt;enumeration value="logit"/>
 *     &lt;enumeration value="probit"/>
 *     &lt;enumeration value="cloglog"/>
 *     &lt;enumeration value="exp"/>
 *     &lt;enumeration value="loglog"/>
 *     &lt;enumeration value="cauchit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "REGRESSIONNORMALIZATIONMETHOD")
@XmlEnum
public enum REGRESSIONNORMALIZATIONMETHOD
{

  @XmlEnumValue("none")
  NONE("none"),
  @XmlEnumValue("simplemax")
  SIMPLEMAX("simplemax"),
  @XmlEnumValue("softmax")
  SOFTMAX("softmax"),
  @XmlEnumValue("logit")
  LOGIT("logit"),
  @XmlEnumValue("probit")
  PROBIT("probit"),
  @XmlEnumValue("cloglog")
  CLOGLOG("cloglog"),
  @XmlEnumValue("exp")
  EXP("exp"),
  @XmlEnumValue("loglog")
  LOGLOG("loglog"),
  @XmlEnumValue("cauchit")
  CAUCHIT("cauchit");
  private final String value;

  REGRESSIONNORMALIZATIONMETHOD(String v)
  {
    value = v;
  }

  public String value()
  {
    return value;
  }

  public static REGRESSIONNORMALIZATIONMETHOD fromValue(String v)
  {
    for (REGRESSIONNORMALIZATIONMETHOD c : REGRESSIONNORMALIZATIONMETHOD.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
