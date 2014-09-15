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
package us.gov.dod.standard.ssrf._3_0.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;

/**
 * Java class for RxSignalTuning complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;complexType name="RxSignalTuning"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;group
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqRangeGrp"/> &lt;element
 * name="TuningStep" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM"
 * minOccurs="0"/> &lt;element name="NumPresetChannels"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN8" minOccurs="0"/>
 * &lt;/sequence> &lt;/restriction> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxSignalTuning", propOrder = {
  "freqMin",
  "freqMax",
  "tuningStep",
  "numPresetChannels"
})
public class RxSignalTuning {

  @XmlElement(name = "FreqMin", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  @XmlElement(name = "TuningStep", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal tuningStep;
  @XmlElement(name = "NumPresetChannels", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN8.class)
  private TInteger numPresetChannels;

  /**
   * Gets the value of the freqMin property.
   * <p>
   * @return
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Sets the value of the freqMin property.
   * <p>
   * @param value
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
   * @return 
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Sets the value of the freqMax property.
   * <p>
   * @param value 
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  public boolean isSetFreqMax() {
    return (this.freqMax != null);
  }

  /**
   * Gets the value of the tuningStep property.
   * <p>
   * @return 
   */
  public TDecimal getTuningStep() {
    return tuningStep;
  }

  /**
   * Sets the value of the tuningStep property.
   * <p>
   * @param value 
   */
  public void setTuningStep(TDecimal value) {
    this.tuningStep = value;
  }

  public boolean isSetTuningStep() {
    return (this.tuningStep != null);
  }

  /**
   * Gets the value of the numPresetChannels property.
   * <p>
   * @return 
   */
  public TInteger getNumPresetChannels() {
    return numPresetChannels;
  }

  /**
   * Sets the value of the numPresetChannels property.
   * <p>
   * @param value 
   */
  public void setNumPresetChannels(TInteger value) {
    this.numPresetChannels = value;
  }

  public boolean isSetNumPresetChannels() {
    return (this.numPresetChannels != null);
  }

  public RxSignalTuning withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  public RxSignalTuning withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  public RxSignalTuning withTuningStep(Double value) {
    setTuningStep(new TDecimal(value));
    return this;
  }

  public RxSignalTuning withNumPresetChannels(Integer value) {
    setNumPresetChannels(new TInteger(value));
    return this;
  }

}
