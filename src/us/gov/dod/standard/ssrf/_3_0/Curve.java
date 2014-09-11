/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf._3_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * <p>
 * Java class for Curve complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Curve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25"/>
 *         &lt;element name="Calculated" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="FreqFactor" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN3_1"/>
 *         &lt;element name="FreqConst" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqOffset"/>
 *         &lt;element name="Bw" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="FreqMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="FreqMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="CurvePoint" type="{urn:us:gov:dod:standard:ssrf:3.0.0}CurvePoint" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="idx" use="required" type="{urn:us:gov:dod:standard:ssrf:3.0.0}UN6" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Curve", propOrder = {
  "type",
  "calculated",
  "freqFactor",
  "freqConst",
  "bw",
  "freqMin",
  "freqMax",
  "curvePoint"
})
public class Curve {

  @XmlElement(name = "Type", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString type;
  @XmlElement(name = "Calculated", required = false)
  private TString calculated;
  @XmlElement(name = "FreqFactor", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN3_1.class)
  private TDecimal freqFactor;
  @XmlElement(name = "FreqConst", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQOFFSET.class)
  private TDecimal freqConst;
  @XmlElement(name = "Bw", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal bw;
  @XmlElement(name = "FreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  @XmlElement(name = "CurvePoint", required = true)
  private List<CurvePoint> curvePoint;
  @XmlAttribute(name = "idx", required = true)
  protected BigInteger idx;

  /**
   * Gets the value of the type property.
   * <p>
   * @return 
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value 
   */
  public void setType(TString value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Gets the value of the calculated property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Sets the value of the calculated property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setCalculated(TString value) {
    this.calculated = value;
  }

  public boolean isSetCalculated() {
    return (this.calculated != null);
  }

  /**
   * Gets the value of the freqFactor property.
   * <p>
   * @return 
   */
  public TDecimal getFreqFactor() {
    return freqFactor;
  }

  /**
   * Sets the value of the freqFactor property.
   * <p>
   * @param value 
   */
  public void setFreqFactor(TDecimal value) {
    this.freqFactor = value;
  }

  public boolean isSetFreqFactor() {
    return (this.freqFactor != null);
  }

  /**
   * Gets the value of the freqConst property.
   * <p>
   * @return 
   */
  public TDecimal getFreqConst() {
    return freqConst;
  }

  /**
   * Sets the value of the freqConst property.
   * <p>
   * @param value 
   */
  public void setFreqConst(TDecimal value) {
    this.freqConst = value;
  }

  public boolean isSetFreqConst() {
    return (this.freqConst != null);
  }

  /**
   * Gets the value of the bw property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getBw() {
    return bw;
  }

  /**
   * Sets the value of the bw property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setBw(TDecimal value) {
    this.bw = value;
  }

  public boolean isSetBw() {
    return (this.bw != null);
  }

  /**
   * Gets the value of the freqMin property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Sets the value of the freqMin property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  public boolean isSetFreqMin() {
    return (this.freqMin != null);
  }

  /**
   * Gets the value of the freqMax property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Sets the value of the freqMax property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  public boolean isSetFreqMax() {
    return (this.freqMax != null);
  }

  /**
   * Gets the value of the curvePoint property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the curvePoint property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCurvePoint().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * 
   * <p>
   * <p>
   * @return
   */
  public List<CurvePoint> getCurvePoint() {
    if (curvePoint == null) {
      curvePoint = new ArrayList<>();
    }
    return this.curvePoint;
  }

  public boolean isSetCurvePoint() {
    return ((this.curvePoint != null) && (!this.curvePoint.isEmpty()));
  }

  public void unsetCurvePoint() {
    this.curvePoint = null;
  }

  /**
   * Gets the value of the idx property.
   * <p>
   * @return 
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Sets the value of the idx property.
   * <p>
   * @param value 
   */
  public void setIdx(BigInteger value) {
    this.idx = value;
  }

  public boolean isSetIdx() {
    return (this.idx != null);
  }

  public Curve withType(String value) {
    setType(new TString(value));
    return this;
  }

  public Curve withCalculated(ListCBO value) {
    setCalculated(new TString(value.value()));
    return this;
  }

  public Curve withFreqFactor(Double value) {
    setFreqFactor(new TDecimal(value));
    return this;
  }

  public Curve withFreqConst(Double value) {
    setFreqConst(new TDecimal(value));
    return this;
  }

  public Curve withBw(Double value) {
    setBw(new TDecimal(value));
    return this;
  }

  public Curve withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  public Curve withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  public Curve withCurvePoint(CurvePoint... values) {
    if (values != null) {
      getCurvePoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Curve withCurvePoint(Collection<CurvePoint> values) {
    if (values != null) {
      getCurvePoint().addAll(values);
    }
    return this;
  }

  public Curve withIdx(BigInteger value) {
    setIdx(value);
    return this;
  }

}
