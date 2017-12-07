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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}ParameterField" maxOccurs="unbounded"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}EXPRESSION"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="optype" use="required" type="{http://www.dmg.org/PMML-4_3}OPTYPE" />
 *       &lt;attribute name="dataType" type="{http://www.dmg.org/PMML-4_3}DATATYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "parameterField",
    "constant",
    "fieldRef",
    "normContinuous",
    "normDiscrete",
    "discretize",
    "mapValues",
    "textIndex",
    "apply",
    "aggregate",
    "lag"})
@XmlRootElement(name = "DefineFunction")
public class DefineFunction
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "ParameterField", required = true)
  protected List<ParameterField> parameterField;
  @XmlElement(name = "Constant")
  protected Constant constant;
  @XmlElement(name = "FieldRef")
  protected FieldRef fieldRef;
  @XmlElement(name = "NormContinuous")
  protected NormContinuous normContinuous;
  @XmlElement(name = "NormDiscrete")
  protected NormDiscrete normDiscrete;
  @XmlElement(name = "Discretize")
  protected Discretize discretize;
  @XmlElement(name = "MapValues")
  protected MapValues mapValues;
  @XmlElement(name = "TextIndex")
  protected TextIndex textIndex;
  @XmlElement(name = "Apply")
  protected Apply apply;
  @XmlElement(name = "Aggregate")
  protected Aggregate aggregate;
  @XmlElement(name = "Lag")
  protected Lag lag;
  @XmlAttribute(name = "name", required = true)
  protected String name;
  @XmlAttribute(name = "optype", required = true)
  protected OPTYPE optype;
  @XmlAttribute(name = "dataType")
  protected DATATYPE dataType;

  /**
   * Gets the value of the extension property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the extension property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getExtension().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Extension }
   */
  public List<Extension> getExtension()
  {
    if (extension == null) {
      extension = new ArrayList<Extension>();
    }
    return this.extension;
  }

  /**
   * Gets the value of the parameterField property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the parameterField property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getParameterField().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link ParameterField }
   */
  public List<ParameterField> getParameterField()
  {
    if (parameterField == null) {
      parameterField = new ArrayList<ParameterField>();
    }
    return this.parameterField;
  }

  /**
   * Gets the value of the constant property.
   *
   * @return possible object is
   * {@link Constant }
   */
  public Constant getConstant()
  {
    return constant;
  }

  /**
   * Sets the value of the constant property.
   *
   * @param value allowed object is
   *              {@link Constant }
   */
  public void setConstant(Constant value)
  {
    this.constant = value;
  }

  /**
   * Gets the value of the fieldRef property.
   *
   * @return possible object is
   * {@link FieldRef }
   */
  public FieldRef getFieldRef()
  {
    return fieldRef;
  }

  /**
   * Sets the value of the fieldRef property.
   *
   * @param value allowed object is
   *              {@link FieldRef }
   */
  public void setFieldRef(FieldRef value)
  {
    this.fieldRef = value;
  }

  /**
   * Gets the value of the normContinuous property.
   *
   * @return possible object is
   * {@link NormContinuous }
   */
  public NormContinuous getNormContinuous()
  {
    return normContinuous;
  }

  /**
   * Sets the value of the normContinuous property.
   *
   * @param value allowed object is
   *              {@link NormContinuous }
   */
  public void setNormContinuous(NormContinuous value)
  {
    this.normContinuous = value;
  }

  /**
   * Gets the value of the normDiscrete property.
   *
   * @return possible object is
   * {@link NormDiscrete }
   */
  public NormDiscrete getNormDiscrete()
  {
    return normDiscrete;
  }

  /**
   * Sets the value of the normDiscrete property.
   *
   * @param value allowed object is
   *              {@link NormDiscrete }
   */
  public void setNormDiscrete(NormDiscrete value)
  {
    this.normDiscrete = value;
  }

  /**
   * Gets the value of the discretize property.
   *
   * @return possible object is
   * {@link Discretize }
   */
  public Discretize getDiscretize()
  {
    return discretize;
  }

  /**
   * Sets the value of the discretize property.
   *
   * @param value allowed object is
   *              {@link Discretize }
   */
  public void setDiscretize(Discretize value)
  {
    this.discretize = value;
  }

  /**
   * Gets the value of the mapValues property.
   *
   * @return possible object is
   * {@link MapValues }
   */
  public MapValues getMapValues()
  {
    return mapValues;
  }

  /**
   * Sets the value of the mapValues property.
   *
   * @param value allowed object is
   *              {@link MapValues }
   */
  public void setMapValues(MapValues value)
  {
    this.mapValues = value;
  }

  /**
   * Gets the value of the textIndex property.
   *
   * @return possible object is
   * {@link TextIndex }
   */
  public TextIndex getTextIndex()
  {
    return textIndex;
  }

  /**
   * Sets the value of the textIndex property.
   *
   * @param value allowed object is
   *              {@link TextIndex }
   */
  public void setTextIndex(TextIndex value)
  {
    this.textIndex = value;
  }

  /**
   * Gets the value of the apply property.
   *
   * @return possible object is
   * {@link Apply }
   */
  public Apply getApply()
  {
    return apply;
  }

  /**
   * Sets the value of the apply property.
   *
   * @param value allowed object is
   *              {@link Apply }
   */
  public void setApply(Apply value)
  {
    this.apply = value;
  }

  /**
   * Gets the value of the aggregate property.
   *
   * @return possible object is
   * {@link Aggregate }
   */
  public Aggregate getAggregate()
  {
    return aggregate;
  }

  /**
   * Sets the value of the aggregate property.
   *
   * @param value allowed object is
   *              {@link Aggregate }
   */
  public void setAggregate(Aggregate value)
  {
    this.aggregate = value;
  }

  /**
   * Gets the value of the lag property.
   *
   * @return possible object is
   * {@link Lag }
   */
  public Lag getLag()
  {
    return lag;
  }

  /**
   * Sets the value of the lag property.
   *
   * @param value allowed object is
   *              {@link Lag }
   */
  public void setLag(Lag value)
  {
    this.lag = value;
  }

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
