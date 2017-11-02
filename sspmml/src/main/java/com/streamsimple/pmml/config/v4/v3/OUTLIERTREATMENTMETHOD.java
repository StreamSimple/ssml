/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.pmml.config.v4.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OUTLIER-TREATMENT-METHOD.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OUTLIER-TREATMENT-METHOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="asIs"/>
 *     &lt;enumeration value="asMissingValues"/>
 *     &lt;enumeration value="asExtremeValues"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "OUTLIER-TREATMENT-METHOD")
@XmlEnum
public enum OUTLIERTREATMENTMETHOD
{

  @XmlEnumValue("asIs")
  AS_IS("asIs"),
  @XmlEnumValue("asMissingValues")
  AS_MISSING_VALUES("asMissingValues"),
  @XmlEnumValue("asExtremeValues")
  AS_EXTREME_VALUES("asExtremeValues");
  private final String value;

  OUTLIERTREATMENTMETHOD(String v)
  {
    value = v;
  }

  public String value()
  {
    return value;
  }

  public static OUTLIERTREATMENTMETHOD fromValue(String v)
  {
    for (OUTLIERTREATMENTMETHOD c : OUTLIERTREATMENTMETHOD.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
