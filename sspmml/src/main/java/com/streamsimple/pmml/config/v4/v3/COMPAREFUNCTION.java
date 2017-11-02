/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.pmml.config.v4.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COMPARE-FUNCTION.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="COMPARE-FUNCTION">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="absDiff"/>
 *     &lt;enumeration value="gaussSim"/>
 *     &lt;enumeration value="delta"/>
 *     &lt;enumeration value="equal"/>
 *     &lt;enumeration value="table"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "COMPARE-FUNCTION")
@XmlEnum
public enum COMPAREFUNCTION
{

  @XmlEnumValue("absDiff")
  ABS_DIFF("absDiff"),
  @XmlEnumValue("gaussSim")
  GAUSS_SIM("gaussSim"),
  @XmlEnumValue("delta")
  DELTA("delta"),
  @XmlEnumValue("equal")
  EQUAL("equal"),
  @XmlEnumValue("table")
  TABLE("table");
  private final String value;

  COMPAREFUNCTION(String v)
  {
    value = v;
  }

  public String value()
  {
    return value;
  }

  public static COMPAREFUNCTION fromValue(String v)
  {
    for (COMPAREFUNCTION c : COMPAREFUNCTION.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
