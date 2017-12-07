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
 * <p>Java class for MULTIPLE-MODEL-METHOD.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MULTIPLE-MODEL-METHOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="majorityVote"/>
 *     &lt;enumeration value="weightedMajorityVote"/>
 *     &lt;enumeration value="average"/>
 *     &lt;enumeration value="weightedAverage"/>
 *     &lt;enumeration value="median"/>
 *     &lt;enumeration value="max"/>
 *     &lt;enumeration value="sum"/>
 *     &lt;enumeration value="selectFirst"/>
 *     &lt;enumeration value="selectAll"/>
 *     &lt;enumeration value="modelChain"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "MULTIPLE-MODEL-METHOD")
@XmlEnum
public enum MULTIPLEMODELMETHOD
{

  @XmlEnumValue("majorityVote")
  MAJORITY_VOTE("majorityVote"),
  @XmlEnumValue("weightedMajorityVote")
  WEIGHTED_MAJORITY_VOTE("weightedMajorityVote"),
  @XmlEnumValue("average")
  AVERAGE("average"),
  @XmlEnumValue("weightedAverage")
  WEIGHTED_AVERAGE("weightedAverage"),
  @XmlEnumValue("median")
  MEDIAN("median"),
  @XmlEnumValue("max")
  MAX("max"),
  @XmlEnumValue("sum")
  SUM("sum"),
  @XmlEnumValue("selectFirst")
  SELECT_FIRST("selectFirst"),
  @XmlEnumValue("selectAll")
  SELECT_ALL("selectAll"),
  @XmlEnumValue("modelChain")
  MODEL_CHAIN("modelChain");
  private final String value;

  MULTIPLEMODELMETHOD(String v)
  {
    value = v;
  }

  public String value()
  {
    return value;
  }

  public static MULTIPLEMODELMETHOD fromValue(String v)
  {
    for (MULTIPLEMODELMETHOD c : MULTIPLEMODELMETHOD.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
