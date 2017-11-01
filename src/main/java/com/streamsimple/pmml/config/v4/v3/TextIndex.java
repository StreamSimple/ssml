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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_3}TextIndexNormalization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_3}EXPRESSION"/>
 *       &lt;/sequence>
 *       &lt;attribute name="textField" use="required" type="{http://www.dmg.org/PMML-4_3}FIELD-NAME" />
 *       &lt;attribute name="localTermWeights" default="termFrequency">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="termFrequency"/>
 *             &lt;enumeration value="binary"/>
 *             &lt;enumeration value="logarithmic"/>
 *             &lt;enumeration value="augmentedNormalizedTermFrequency"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isCaseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="maxLevenshteinDistance" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="countHits" default="allHits">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="allHits"/>
 *             &lt;enumeration value="bestHits"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="wordSeparatorCharacterRE" type="{http://www.w3.org/2001/XMLSchema}string" default="\s" />
 *       &lt;attribute name="tokenize" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension",
    "textIndexNormalization",
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
@XmlRootElement(name = "TextIndex")
public class TextIndex
{

  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  @XmlElement(name = "TextIndexNormalization")
  protected List<TextIndexNormalization> textIndexNormalization;
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
  @XmlAttribute(name = "textField", required = true)
  protected String textField;
  @XmlAttribute(name = "localTermWeights")
  protected String localTermWeights;
  @XmlAttribute(name = "isCaseSensitive")
  protected Boolean isCaseSensitive;
  @XmlAttribute(name = "maxLevenshteinDistance")
  protected BigInteger maxLevenshteinDistance;
  @XmlAttribute(name = "countHits")
  protected String countHits;
  @XmlAttribute(name = "wordSeparatorCharacterRE")
  protected String wordSeparatorCharacterRE;
  @XmlAttribute(name = "tokenize")
  protected Boolean tokenize;

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
   * Gets the value of the textIndexNormalization property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the textIndexNormalization property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTextIndexNormalization().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link TextIndexNormalization }
   */
  public List<TextIndexNormalization> getTextIndexNormalization()
  {
    if (textIndexNormalization == null) {
      textIndexNormalization = new ArrayList<TextIndexNormalization>();
    }
    return this.textIndexNormalization;
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
   * Gets the value of the textField property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getTextField()
  {
    return textField;
  }

  /**
   * Sets the value of the textField property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setTextField(String value)
  {
    this.textField = value;
  }

  /**
   * Gets the value of the localTermWeights property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getLocalTermWeights()
  {
    if (localTermWeights == null) {
      return "termFrequency";
    } else {
      return localTermWeights;
    }
  }

  /**
   * Sets the value of the localTermWeights property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setLocalTermWeights(String value)
  {
    this.localTermWeights = value;
  }

  /**
   * Gets the value of the isCaseSensitive property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public boolean isIsCaseSensitive()
  {
    if (isCaseSensitive == null) {
      return false;
    } else {
      return isCaseSensitive;
    }
  }

  /**
   * Sets the value of the isCaseSensitive property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsCaseSensitive(Boolean value)
  {
    this.isCaseSensitive = value;
  }

  /**
   * Gets the value of the maxLevenshteinDistance property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getMaxLevenshteinDistance()
  {
    if (maxLevenshteinDistance == null) {
      return new BigInteger("0");
    } else {
      return maxLevenshteinDistance;
    }
  }

  /**
   * Sets the value of the maxLevenshteinDistance property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setMaxLevenshteinDistance(BigInteger value)
  {
    this.maxLevenshteinDistance = value;
  }

  /**
   * Gets the value of the countHits property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getCountHits()
  {
    if (countHits == null) {
      return "allHits";
    } else {
      return countHits;
    }
  }

  /**
   * Sets the value of the countHits property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setCountHits(String value)
  {
    this.countHits = value;
  }

  /**
   * Gets the value of the wordSeparatorCharacterRE property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getWordSeparatorCharacterRE()
  {
    if (wordSeparatorCharacterRE == null) {
      return "\\s";
    } else {
      return wordSeparatorCharacterRE;
    }
  }

  /**
   * Sets the value of the wordSeparatorCharacterRE property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setWordSeparatorCharacterRE(String value)
  {
    this.wordSeparatorCharacterRE = value;
  }

  /**
   * Gets the value of the tokenize property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public boolean isTokenize()
  {
    if (tokenize == null) {
      return true;
    } else {
      return tokenize;
    }
  }

  /**
   * Sets the value of the tokenize property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setTokenize(Boolean value)
  {
    this.tokenize = value;
  }

}
