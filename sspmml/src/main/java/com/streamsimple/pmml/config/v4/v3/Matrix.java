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

import java.math.BigInteger;
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
 *       &lt;choice minOccurs="0">
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}NUM-ARRAY" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}MatCell" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attribute name="kind" default="any">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="diagonal"/>
 *             &lt;enumeration value="symmetric"/>
 *             &lt;enumeration value="any"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="nbRows" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="nbCols" type="{http://www.dmg.org/PMML-4_3}INT-NUMBER" />
 *       &lt;attribute name="diagDefault" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *       &lt;attribute name="offDiagDefault" type="{http://www.dmg.org/PMML-4_3}REAL-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numarray",
    "matCell"})
@XmlRootElement(name = "Matrix")
public class Matrix
{

  @XmlElement(name = "Array")
  protected List<ArrayType> numarray;
  @XmlElement(name = "MatCell")
  protected List<MatCell> matCell;
  @XmlAttribute(name = "kind")
  protected String kind;
  @XmlAttribute(name = "nbRows")
  protected BigInteger nbRows;
  @XmlAttribute(name = "nbCols")
  protected BigInteger nbCols;
  @XmlAttribute(name = "diagDefault")
  protected Double diagDefault;
  @XmlAttribute(name = "offDiagDefault")
  protected Double offDiagDefault;

  /**
   * Gets the value of the numarray property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the numarray property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getNUMARRAY().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link ArrayType }
   */
  public List<ArrayType> getNUMARRAY()
  {
    if (numarray == null) {
      numarray = new ArrayList<ArrayType>();
    }
    return this.numarray;
  }

  /**
   * Gets the value of the matCell property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the matCell property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getMatCell().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link MatCell }
   */
  public List<MatCell> getMatCell()
  {
    if (matCell == null) {
      matCell = new ArrayList<MatCell>();
    }
    return this.matCell;
  }

  /**
   * Gets the value of the kind property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKind()
  {
    if (kind == null) {
      return "any";
    } else {
      return kind;
    }
  }

  /**
   * Sets the value of the kind property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKind(String value)
  {
    this.kind = value;
  }

  /**
   * Gets the value of the nbRows property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getNbRows()
  {
    return nbRows;
  }

  /**
   * Sets the value of the nbRows property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setNbRows(BigInteger value)
  {
    this.nbRows = value;
  }

  /**
   * Gets the value of the nbCols property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getNbCols()
  {
    return nbCols;
  }

  /**
   * Sets the value of the nbCols property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setNbCols(BigInteger value)
  {
    this.nbCols = value;
  }

  /**
   * Gets the value of the diagDefault property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getDiagDefault()
  {
    return diagDefault;
  }

  /**
   * Sets the value of the diagDefault property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setDiagDefault(Double value)
  {
    this.diagDefault = value;
  }

  /**
   * Gets the value of the offDiagDefault property.
   *
   * @return possible object is
   * {@link Double }
   */
  public Double getOffDiagDefault()
  {
    return offDiagDefault;
  }

  /**
   * Sets the value of the offDiagDefault property.
   *
   * @param value allowed object is
   *              {@link Double }
   */
  public void setOffDiagDefault(Double value)
  {
    this.offDiagDefault = value;
  }

}
