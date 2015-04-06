/* 
 * Copyright 2015 Key Bridge LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1.antenna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * A complete entry:* &lt;AntGain&gt;
 *   &lt;Gain cls="U"&gt;6.1&lt;/Gain&gt;
 *   &lt;Freq cls="U"&gt;230.525&lt;/Freq&gt;
 *   &lt;FrontToBackRatio cls="U"&gt;2&lt;/FrontToBackRatio&gt;
 * &lt;/AntGain&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
   * Calculated - Calculated Data Indicator (Optional)    * <p>
   * Yes to indicate that the data was calculated, or "No" if the data is issued
   * from measurement. Leave blank if the origin of the data is not known.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Calculated", required = false)
  private TString calculated;
  /**
   * Gain - Gain (Required)    * <p>
   * The antenna gain (in dBi - dB with reference to an isotropic source) in the
   * direction of maximum radiation. For a negative gain (earth and space
   * stations only), enter a dash before the value of the gain.
   * <p>
   * Format is SN(6.3) (dBi)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Gain", required = true)
  private dBi gain;
  /**
   * Freq - Frequency (Optional)    * <p>
   * The frequency at which the gain is expressed.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Freq", required = false)
  private FreqM freq;
  /**
   * FrontToBackRatio - Front-to-back Ratio (Optional)    * <p>
   * The front-to-back ratio of the main beam to the back lobe.
   * <p>
   * Format is UN(5,2) (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FrontToBackRatio", required = false)
  private Unsigned_DB_5_2 frontToBackRatio;

  /**
   * Get Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known..
   * <p>
   * @return the Calculated value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known..
   * <p>
   * @param value the Calculated value in a {@link TString} data type
   * @since 3.1.0
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
   * stations only), enter a dash before the value of the gain..
   * <p>
   * @return a {@link dBi} instance
   * @since 3.1.0
   */
  public dBi getGain() {
    return gain;
  }

  /**
   * Set the antenna gain (in dBi - dB with reference to an isotropic source) in
   * the direction of maximum radiation. For a negative gain (earth and space
   * stations only), enter a dash before the value of the gain..
   * <p>
   * @param value a {@link dBi} instance
   * @since 3.1.0
   */
  public void setGain(dBi value) {
    this.gain = value;
  }

  /**
   * Determine if the Gain is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGain() {
    return (this.gain != null ? this.gain.isSetValue() : false);
  }

  /**
   * Get the frequency at which the gain is expressed..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreq() {
    return freq;
  }

  /**
   * Set the frequency at which the gain is expressed..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreq(FreqM value) {
    this.freq = value;
  }

  /**
   * Determine if the Freq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreq() {
    return (this.freq != null ? this.freq.isSetValue() : false);
  }

  /**
   * Get the front-to-back ratio of the main beam to the back lobe..
   * <p>
   * @return a {@link Unsigned_DB_5_2} instance
   * @since 3.1.0
   */
  public Unsigned_DB_5_2 getFrontToBackRatio() {
    return frontToBackRatio;
  }

  /**
   * Set the front-to-back ratio of the main beam to the back lobe..
   * <p>
   * @param value a {@link Unsigned_DB_5_2} instance
   * @since 3.1.0
   */
  public void setFrontToBackRatio(Unsigned_DB_5_2 value) {
    this.frontToBackRatio = value;
  }

  /**
   * Determine if the FrontToBackRatio is configured.
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
   * @param value An instances of type {@link ListCBO}.
   * @return The current AntGain object instance.
   * @since 3.1.0
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
   * @param value An instances of type {@link Double}.
   * @return The current AntGain object instance.
   * @since 3.1.0
   */
  public AntGain withGain(Double value) {
    setGain(new dBi(value));
    return this;
  }

  /**
   * Set the frequency at which the gain is expressed.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current AntGain object instance.
   * @since 3.1.0
   */
  public AntGain withFreq(Double value) {
    setFreq(new FreqM(value));
    return this;
  }

  /**
   * Set the front-to-back ratio of the main beam to the back lobe.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current AntGain object instance.
   * @since 3.1.0
   */
  public AntGain withFrontToBackRatio(Double value) {
    setFrontToBackRatio(new Unsigned_DB_5_2(value));
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
           + (calculated != null ? " calculated [" + calculated + "]" : "")
           + (freq != null ? " freq [" + freq + "]" : "")
           + (frontToBackRatio != null ? " frontToBackRatio [" + frontToBackRatio + "]" : "")
           + (gain != null ? " gain [" + gain + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntGain} requires {@link dBi Gain}.
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
