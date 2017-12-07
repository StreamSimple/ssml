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
 * <p>Java class for SVM-CLASSIFICATION-METHOD.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SVM-CLASSIFICATION-METHOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OneAgainstAll"/>
 *     &lt;enumeration value="OneAgainstOne"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "SVM-CLASSIFICATION-METHOD")
@XmlEnum
public enum SVMCLASSIFICATIONMETHOD
{

  @XmlEnumValue("OneAgainstAll")
  ONE_AGAINST_ALL("OneAgainstAll"),
  @XmlEnumValue("OneAgainstOne")
  ONE_AGAINST_ONE("OneAgainstOne");
  private final String value;

  SVMCLASSIFICATIONMETHOD(String v)
  {
    value = v;
  }

  public String value()
  {
    return value;
  }

  public static SVMCLASSIFICATIONMETHOD fromValue(String v)
  {
    for (SVMCLASSIFICATIONMETHOD c : SVMCLASSIFICATIONMETHOD.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
