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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCAU;

/**
 * Java class for AntFreqs complex type.
 * <p>
 * This element contains the antenna's designed tuning range, or the discrete
 * operating frequency.
 * <p>
 * Sub-element of AntMode
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntFreqs", propOrder = {
  "freqMin",
  "freqMax",
  "bandwidth",
  "freqUse"
})
public class AntFreqs {

  /**
   * FreqMin: Enter the nominal frequency or minimum value of the frequency
   * range.
   */
  @XmlElement(name = "FreqMin", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * FreqMax: Enter the maximum value of the frequencies in the range.
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * Bandwidth: As an alternative to FreqMin/FreqMax, enter the total operating
   * bandwidth of the Antenna centered around FreqMin.
   */
  @XmlElement(name = "Bandwidth", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal bandwidth;
  /**
   * FreqUse: Indicate if the frequency range is used for transmit, receive or
   * both transmit and receive.
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CAU: Code Transmit Only Receive Only Transmit-Receive
   */
  @XmlElement(name = "FreqUse", required = false)
  private TString freqUse;

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
   * @param value   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  public boolean isSetFreqMax() {
    return (this.freqMax != null);
  }

  /**
   * Gets the value of the bandwidth property.
   * <p>
   * @return
   */
  public TDecimal getBandwidth() {
    return bandwidth;
  }

  /**
   * Sets the value of the bandwidth property.
   * <p>
   * @param value   */
  public void setBandwidth(TDecimal value) {
    this.bandwidth = value;
  }

  public boolean isSetBandwidth() {
    return (this.bandwidth != null);
  }

  /**
   * Gets the value of the freqUse property.
   * <p>
   * @return
   */
  public TString getFreqUse() {
    return freqUse;
  }

  /**
   * Sets the value of the freqUse property.
   * <p>
   * @param value   */
  public void setFreqUse(TString value) {
    this.freqUse = value;
  }

  public boolean isSetFreqUse() {
    return (this.freqUse != null);
  }

  public AntFreqs withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  public AntFreqs withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  public AntFreqs withBandwidth(Double value) {
    setBandwidth(new TDecimal(value));
    return this;
  }

  public AntFreqs withFreqUse(ListCAU value) {
    setFreqUse(new TString(value.value()));
    return this;
  }

}
