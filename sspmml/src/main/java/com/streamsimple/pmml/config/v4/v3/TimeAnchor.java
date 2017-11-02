/**
 * Copyright (c) 2017 Simplifi.it, Inc.
 * All rights reserved.
 */

package com.streamsimple.pmml.config.v4.v3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}TimeCycle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}TimeException" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.dmg.org/PMML-4_3}TIME-ANCHOR" />
 *       &lt;attribute name="offset" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="stepsize" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "timeCycle",
    "timeException"})
@XmlRootElement(name = "TimeAnchor")
public class TimeAnchor
{

  @XmlElement(name = "TimeCycle")
  protected List<TimeCycle> timeCycle;
  @XmlElement(name = "TimeException")
  protected List<TimeException> timeException;
  @XmlAttribute(name = "type")
  protected Type type;
  @XmlAttribute(name = "offset")
  protected BigInteger offset;
  @XmlAttribute(name = "stepsize")
  protected BigInteger stepsize;
  @XmlAttribute(name = "displayName")
  @XmlSchemaType(name = "anySimpleType")
  protected String displayName;

  /**
   * Gets the value of the timeCycle property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the timeCycle property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTimeCycle().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link TimeCycle }
   */
  public List<TimeCycle> getTimeCycle()
  {
    if (timeCycle == null) {
      timeCycle = new ArrayList<TimeCycle>();
    }
    return this.timeCycle;
  }

  /**
   * Gets the value of the timeException property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the timeException property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTimeException().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link TimeException }
   */
  public List<TimeException> getTimeException()
  {
    if (timeException == null) {
      timeException = new ArrayList<TimeException>();
    }
    return this.timeException;
  }

  /**
   * Gets the value of the type property.
   *
   * @return possible object is
   * {@link Type }
   */
  public Type getType()
  {
    return type;
  }

  /**
   * Sets the value of the type property.
   *
   * @param value allowed object is
   *              {@link Type }
   */
  public void setType(Type value)
  {
    this.type = value;
  }

  /**
   * Gets the value of the offset property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getOffset()
  {
    return offset;
  }

  /**
   * Sets the value of the offset property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setOffset(BigInteger value)
  {
    this.offset = value;
  }

  /**
   * Gets the value of the stepsize property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getStepsize()
  {
    return stepsize;
  }

  /**
   * Sets the value of the stepsize property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setStepsize(BigInteger value)
  {
    this.stepsize = value;
  }

  /**
   * Gets the value of the displayName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDisplayName()
  {
    return displayName;
  }

  /**
   * Sets the value of the displayName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDisplayName(String value)
  {
    this.displayName = value;
  }

  @XmlType(name = "TIME-ANCHOR")
  @XmlEnum
  public enum Type
  {
    @XmlEnumValue("dateTimeMillisecondsSince[0]")
    DATE_TIME_MILLI_SECONDS_SINCE_0,
    @XmlEnumValue("dateTimeMillisecondsSince[1960]")
    DATE_TIME_MILLI_SECONDS_SINCE_1960,
    @XmlEnumValue("dateTimeMillisecondsSince[1970]")
    DATE_TIME_MILLI_SECONDS_SINCE_1970,
    @XmlEnumValue("dateTimeMillisecondsSince[1980]")
    DATE_TIME_MILLI_SECONDS_SINCE_1980,
    @XmlEnumValue("dateTimeSecondsSince[0]")
    DATE_TIME_SECONDS_SINCE_0,
    @XmlEnumValue("dateTimeSecondsSince[1960]")
    DATE_TIME_SECONDS_SINCE_1960,
    @XmlEnumValue("dateTimeSecondsSince[1970]")
    DATE_TIME_SECONDS_SINCE_1970,
    @XmlEnumValue("dateTimeSecondsSince[1980]")
    DATE_TIME_SECONDS_SINCE_1980,
    @XmlEnumValue("dateDaysSince[0]")
    DATE_DAYS_SINCE_0,
    @XmlEnumValue("dateDaysSince[1960]")
    DATE_DAYS_SINCE_1960,
    @XmlEnumValue("dateDaysSince[1970]")
    DATE_DAYS_SINCE_1970,
    @XmlEnumValue("dateDaysSince[1980]")
    DATE_DAYS_SINCE_1980,
    @XmlEnumValue("dateMonthsSince[0]")
    DATE_MONTHS_SINCE_0,
    @XmlEnumValue("dateMonthsSince[1960]")
    DATE_MONTHS_SINCE_1960,
    @XmlEnumValue("dateMonthsSince[1970]")
    DATE_MONTHS_SINCE_1970,
    @XmlEnumValue("dateMonthsSince[1980]")
    DATE_MONTHS_SINCE_1980,
    @XmlEnumValue("dateYearsSince[0]")
    DATE_YEARS_SINCE_0
  }
}
