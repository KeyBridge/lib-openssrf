/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.antenna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;

/**
 * AntGain indicates the antenna gain, in decibels with reference to an
 * isotropic source (dBi), in the direction of maximum radiation.
 * <p>
 * Element of {@link AntMode}
 * <p>
 * Example: A basic gain, regardless of the frequency:
 * <pre>
 * &lt;AntGain&gt;
 *   &lt;Gain cls="U"&gt;0&lt;/Gain&gt;
 * &lt;/AntGain&gt;
 * </pre> A complete entry:
 * <pre>
 * &lt;AntGain&gt;
 *   &lt;Gain cls="U"&gt;6.1&lt;/Gain&gt;
 *   &lt;Freq cls="U"&gt;230.525&lt;/Freq&gt;
 *   &lt;FrontToBackRatio cls="U"&gt;2&lt;/FrontToBackRatio&gt;
 * &lt;/AntGain&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * Calculated - Calculated Data Indicator (Optional)
   * <p>
   * Yes to indicate that the data was calculated, or "No" if the data is issued
   * from measurement. Leave blank if the origin of the data is not known.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Calculated", required = false)
  private TString calculated;
  /**
   * Gain - Gain (Required)
   * <p>
   * The antenna gain (in dBi - dB with reference to an isotropic source) in the
   * direction of maximum radiation. For a negative gain (earth and space
   * stations only), enter a dash before the value of the gain.
   * <p>
   * Format is SN(6.3) (dBi)
   */
  @XmlElement(name = "Gain", required = true)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDBI.class)
  private TDecimal gain;
  /**
   * Freq - Frequency (Optional)
   * <p>
   * The frequency at which the gain is expressed.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "Freq", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freq;
  /**
   * FrontToBackRatio - Front-to-back Ratio (Optional)
   * <p>
   * The front-to-back ratio of the main beam to the back lobe.
   * <p>
   * Format is UN(5,2) (dB)
   */
  @XmlElement(name = "FrontToBackRatio", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUNSIGNED_DB_5_2.class)
  private TDecimal frontToBackRatio;

  /**
   * Get Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known.
   * <p>
   * @return the Calculated value in a {@link TString} data type
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known.
   * <p>
   * @param value the Calculated value in a {@link TString} data type
   */
  public void setCalculated(TString value) {
    this.calculated = value;
  }

  /**
   * Determine if the Calculated is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCalculated() {
    return (this.calculated != null ? this.calculated.isSetValue() : false);
  }

  /**
   * Get the antenna gain (in dBi - dB with reference to an isotropic source) in
   * the direction of maximum radiation. For a negative gain (earth and space
   * stations only), enter a dash before the value of the gain.
   * <p>
   * @return the Gain value in a {@link TDecimal} data type
   */
  public TDecimal getGain() {
    return gain;
  }

  /**
   * Set the antenna gain (in dBi - dB with reference to an isotropic source) in
   * the direction of maximum radiation. For a negative gain (earth and space
   * stations only), enter a dash before the value of the gain.
   * <p>
   * @param value the Gain value in a {@link TDecimal} data type
   */
  public void setGain(TDecimal value) {
    this.gain = value;
  }

  /**
   * Determine if the Gain is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGain() {
    return (this.gain != null ? this.gain.isSetValue() : false);
  }

  /**
   * Get the frequency at which the gain is expressed.
   * <p>
   * @return the Freq value in a {@link TDecimal} data type
   */
  public TDecimal getFreq() {
    return freq;
  }

  /**
   * Set the frequency at which the gain is expressed.
   * <p>
   * @param value the Freq value in a {@link TDecimal} data type
   */
  public void setFreq(TDecimal value) {
    this.freq = value;
  }

  /**
   * Determine if the Freq is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreq() {
    return (this.freq != null ? this.freq.isSetValue() : false);
  }

  /**
   * Get the front-to-back ratio of the main beam to the back lobe.
   * <p>
   * @return the FrontToBackRatio value in a {@link TDecimal} data type
   */
  public TDecimal getFrontToBackRatio() {
    return frontToBackRatio;
  }

  /**
   * Set the front-to-back ratio of the main beam to the back lobe.
   * <p>
   * @param value the FrontToBackRatio value in a {@link TDecimal} data type
   */
  public void setFrontToBackRatio(TDecimal value) {
    this.frontToBackRatio = value;
  }

  /**
   * Determine if the FrontToBackRatio is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFrontToBackRatio() {
    return (this.frontToBackRatio != null ? this.frontToBackRatio.isSetValue() : false);
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current AntGain object instance
   */
  public AntGain withCalculated(ListCBO value) {
    setCalculated(new TString(value.value()));
    return this;
  }

  /**
   * Set the antenna gain (in dBi - dB with reference to an isotropic source) in
   * the direction of maximum radiation. For a negative gain (earth and space
   * stations only), enter a dash before the value of the gain.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntGain object instance
   */
  public AntGain withGain(Double value) {
    setGain(new TDecimal(value));
    return this;
  }

  /**
   * Set the frequency at which the gain is expressed.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntGain object instance
   */
  public AntGain withFreq(Double value) {
    setFreq(new TDecimal(value));
    return this;
  }

  /**
   * Set the front-to-back ratio of the main beam to the back lobe.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntGain object instance
   */
  public AntGain withFrontToBackRatio(Double value) {
    setFrontToBackRatio(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this AntGain instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AntGain {"
      + (freq != null ? " freq [" + freq + "]" : "")
      + (frontToBackRatio != null ? " frontToBackRatio [" + frontToBackRatio + "]" : "")
      + (calculated != null ? " calculated [" + calculated + "]" : "")
      + (gain != null ? " gain [" + gain + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntGain} requires {@link TDecimal Gain}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetGain();
  }

}
