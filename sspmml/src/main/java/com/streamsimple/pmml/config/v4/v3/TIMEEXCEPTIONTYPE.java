/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.pmml.config.v4.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIME-EXCEPTION-TYPE.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TIME-EXCEPTION-TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="exclude"/>
 *     &lt;enumeration value="include"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "TIME-EXCEPTION-TYPE")
@XmlEnum
public enum TIMEEXCEPTIONTYPE
{

  @XmlEnumValue("exclude")
  EXCLUDE("exclude"),
  @XmlEnumValue("include")
  INCLUDE("include");
  private final String value;

  TIMEEXCEPTIONTYPE(String v)
  {
    value = v;
  }

  public String value()
  {
    return value;
  }

  public static TIMEEXCEPTIONTYPE fromValue(String v)
  {
    for (TIMEEXCEPTIONTYPE c : TIMEEXCEPTIONTYPE.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
