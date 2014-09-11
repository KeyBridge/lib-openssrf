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
import us.gov.dod.standard.ssrf._3_0.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.lists.ListCBO;

/**
 * Java class for AntGain complex type.
 * <p>
 * This element indicates the antenna gain, in decibels with reference to an
 * isotropic source (dBi), in the direction of maximum radiation. It can also
 * contain the gain measured 180 degrees from the direction of maximum main beam
 * gain.
 * <p>
 * This element is REQUIRED and repeatable. For a gain included in a range use
 * two occurrences with no frequencies if the points where these gains occur are
 * not known. Use several occurrences of Gain, including frequencies, to express
 * the gain as a function of the frequency.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntGain", propOrder = {
  "calculated",
  "gain",
  "freq",
  "frontToBackRatio"
})
public class AntGain {

  /**
   * Calculated: Enter Yes to indicate that the data was calculated, or "No" if
   * the data is issued from measurement. Leave blank if the origin of the data
   * is not known.
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CBO: Code Yes No
   */
  @XmlElement(name = "Calculated", required = false)
  private TString calculated;
  /**
   * Gain: Enter the antenna gain (in dBi - dB with reference to an isotropic
   * source) in the direction of maximum radiation. For a negative gain (earth
   * and space stations only), enter a dash before the value of the gain.
   * <p>
   * Notes: In order to be able to accommodate legacy data, a value of "-999.99"
   * MAY be used in attribute gain as a gap filler, but only for legacy data
   * which do not contain this information. The real value SHOULD always be used
   * for new datasets and during the review of old datasets.
   */
  @XmlElement(name = "Gain", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSN5_2.class)
  private TDecimal gain;
  /**
   * Freq: Enter the frequency at which the gain is expressed if known.
   */
  @XmlElement(name = "Freq", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freq;
  /**
   * FrontToBackRatio: Enter the front-to-back ratio of the main beam to the
   * back lobe in dB.
   */
  @XmlElement(name = "FrontToBackRatio", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN5_2.class)
  private TDecimal frontToBackRatio;

  /**
   * Gets the value of the calculated property.
   * <p>
   * @return
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Sets the value of the calculated property.
   * <p>
   * @param value
   */
  public void setCalculated(TString value) {
    this.calculated = value;
  }

  public boolean isSetCalculated() {
    return (this.calculated != null);
  }

  /**
   * Gets the value of the gain property.
   * <p>
   * @return
   */
  public TDecimal getGain() {
    return gain;
  }

  /**
   * Sets the value of the gain property.
   * <p>
   * @param value
   */
  public void setGain(TDecimal value) {
    this.gain = value;
  }

  public boolean isSetGain() {
    return (this.gain != null);
  }

  /**
   * Gets the value of the freq property.
   * <p>
   * @return
   */
  public TDecimal getFreq() {
    return freq;
  }

  /**
   * Sets the value of the freq property.
   * <p>
   * @param value
   */
  public void setFreq(TDecimal value) {
    this.freq = value;
  }

  public boolean isSetFreq() {
    return (this.freq != null);
  }

  /**
   * Gets the value of the frontToBackRatio property.
   * <p>
   * @return
   */
  public TDecimal getFrontToBackRatio() {
    return frontToBackRatio;
  }

  /**
   * Sets the value of the frontToBackRatio property.
   * <p>
   * @param value
   */
  public void setFrontToBackRatio(TDecimal value) {
    this.frontToBackRatio = value;
  }

  public boolean isSetFrontToBackRatio() {
    return (this.frontToBackRatio != null);
  }

  public AntGain withCalculated(ListCBO value) {
    setCalculated(new TString(value.value()));
    return this;
  }

  public AntGain withGain(Double value) {
    setGain(new TDecimal(value));
    return this;
  }

  public AntGain withFreq(Double value) {
    setFreq(new TDecimal(value));
    return this;
  }

  public AntGain withFrontToBackRatio(Double value) {
    setFrontToBackRatio(new TDecimal(value));
    return this;
  }

}
