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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCLO;

/**
 * <p>
 * Java class for FreqConversion complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="FreqConversion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StageNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TIFNum" minOccurs="0"/>
 *         &lt;element name="OscillatorTuning" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCLO" minOccurs="0"/>
 *         &lt;element name="LOFreqMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="LOFreqMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="IFMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="IFMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreqConversion", propOrder = {
  "stageNum",
  "oscillatorTuning",
  "loFreqMin",
  "loFreqMax",
  "ifMin",
  "ifMax"
})
public class FreqConversion {

  @XmlElement(name = "StageNum", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterIFNUM.class)
  private TInteger stageNum;
  @XmlElement(name = "OscillatorTuning", required = false)
  private TString oscillatorTuning;
  @XmlElement(name = "LOFreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal loFreqMin;
  @XmlElement(name = "LOFreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal loFreqMax;
  @XmlElement(name = "IFMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal ifMin;
  @XmlElement(name = "IFMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal ifMax;

  /**
   * Gets the value of the stageNum property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TInteger getStageNum() {
    return stageNum;
  }

  /**
   * Sets the value of the stageNum property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setStageNum(TInteger value) {
    this.stageNum = value;
  }

  public boolean isSetStageNum() {
    return (this.stageNum != null);
  }

  /**
   * Gets the value of the oscillatorTuning property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getOscillatorTuning() {
    return oscillatorTuning;
  }

  /**
   * Sets the value of the oscillatorTuning property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setOscillatorTuning(TString value) {
    this.oscillatorTuning = value;
  }

  public boolean isSetOscillatorTuning() {
    return (this.oscillatorTuning != null);
  }

  /**
   * Gets the value of the loFreqMin property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getLOFreqMin() {
    return loFreqMin;
  }

  /**
   * Sets the value of the loFreqMin property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setLOFreqMin(TDecimal value) {
    this.loFreqMin = value;
  }

  public boolean isSetLOFreqMin() {
    return (this.loFreqMin != null);
  }

  /**
   * Gets the value of the loFreqMax property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getLOFreqMax() {
    return loFreqMax;
  }

  /**
   * Sets the value of the loFreqMax property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setLOFreqMax(TDecimal value) {
    this.loFreqMax = value;
  }

  public boolean isSetLOFreqMax() {
    return (this.loFreqMax != null);
  }

  /**
   * Gets the value of the ifMin property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getIFMin() {
    return ifMin;
  }

  /**
   * Sets the value of the ifMin property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setIFMin(TDecimal value) {
    this.ifMin = value;
  }

  public boolean isSetIFMin() {
    return (this.ifMin != null);
  }

  /**
   * Gets the value of the ifMax property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getIFMax() {
    return ifMax;
  }

  /**
   * Sets the value of the ifMax property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setIFMax(TDecimal value) {
    this.ifMax = value;
  }

  public boolean isSetIFMax() {
    return (this.ifMax != null);
  }

  public FreqConversion withStageNum(Integer value) {
    setStageNum(new TInteger(value));
    return this;
  }

  public FreqConversion withOscillatorTuning(ListCLO value) {
    setOscillatorTuning(new TString(value.value()));
    return this;
  }

  public FreqConversion withLOFreqMin(Double value) {
    setLOFreqMin(new TDecimal(value));
    return this;
  }

  public FreqConversion withLOFreqMax(Double value) {
    setLOFreqMax(new TDecimal(value));
    return this;
  }

  public FreqConversion withIFMin(Double value) {
    setIFMin(new TDecimal(value));
    return this;
  }

  public FreqConversion withIFMax(Double value) {
    setIFMax(new TDecimal(value));
    return this;
  }

}
