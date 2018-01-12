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
import us.gov.dod.standard.ssrf._3_1.metadata.domains.FreqM;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAU;

/**
 * AntFreqs contains the antenna's designed tuning range, or the discrete
 * operating frequency.
 * <p>
 * Element of {@link AntMode}
 * <p>
 * Example: Both examples reflect the same operating range:
 * <pre>
 * &lt;AntFreqs&gt;
 *   &lt;FreqMin cls="U"&gt;30&lt;/FreqMin&gt;
 *   &lt;FreqMax cls="U"&gt;90&lt;/FreqMax&gt;
 * &lt;/AntFreqs&gt;
 * A bandwidth of 60 MHz is +/-30 MHz around FreqMin:* &lt;AntFreqs&gt;
 *   &lt;FreqMin cls="U"&gt;60&lt;/FreqMin&gt;
 *   &lt;Bandwidth cls="U"&gt;60&lt;/Bandwidth&gt;
 * &lt;/AntFreqs&gt;
 * </pre>
 *
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
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
   * FreqMin - Nominal or Minimum Frequency (Required) * The nominal frequency
   * or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Required)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMin", required = true)
  private FreqM freqMin;
  /**
   * FreqMax - Maximum Frequency (Optional) * The maximum value of the
   * frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Required)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMax", required = false)
  private FreqM freqMax;
  /**
   * In Data Item Bandwidth, as an alternative to FreqMin/FreqMax, enter the
   * total operating bandwidth of the Antenna centered around FreqMin.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Bandwidth", required = false)
  private FreqM bandwidth;
  /**
   * FreqUse - Frequency Use (Optional) * If the frequency range is used for
   * transmit, receive, or both transmit and receive.
   * <p>
   * Format is L:CAU
   *
   * @since 3.1.0
   */
  @XmlElement(name = "FreqUse", required = false)
  private TString freqUse;

  /**
   * Get the nominal frequency or minimum value of the frequency range..
   *
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMin() {
    return freqMin;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range..
   *
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMin(FreqM value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin..
   *
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMax() {
    return freqMax;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin..
   *
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMax(FreqM value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get In Data Item Bandwidth, as an alternative to FreqMin/FreqMax, enter the
   * total operating bandwidth of the Antenna centered around FreqMin..
   *
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getBandwidth() {
    return bandwidth;
  }

  /**
   * Set In Data Item Bandwidth, as an alternative to FreqMin/FreqMax, enter the
   * total operating bandwidth of the Antenna centered around FreqMin..
   *
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setBandwidth(FreqM value) {
    this.bandwidth = value;
  }

  /**
   * Determine if the Bandwidth is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBandwidth() {
    return (this.bandwidth != null ? this.bandwidth.isSetValue() : false);
  }

  /**
   * Get if the frequency range is used for transmit, receive, or both transmit
   * and receive..
   *
   * @return the FreqUse value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getFreqUse() {
    return freqUse;
  }

  /**
   * Set if the frequency range is used for transmit, receive, or both transmit
   * and receive..
   *
   * @param value the FreqUse value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setFreqUse(TString value) {
    this.freqUse = value;
  }

  /**
   * Determine if the FreqUse is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqUse() {
    return (this.freqUse != null ? this.freqUse.isSetValue() : false);
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntFreqs object instance.
   * @since 3.1.0
   */
  public AntFreqs withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntFreqs object instance.
   * @since 3.1.0
   */
  public AntFreqs withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set In Data Item Bandwidth, as an alternative to FreqMin/FreqMax, enter the
   * total operating bandwidth of the Antenna centered around FreqMin.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntFreqs object instance.
   * @since 3.1.0
   */
  public AntFreqs withBandwidth(Double value) {
    setBandwidth(new FreqM(value));
    return this;
  }

  /**
   * Set if the frequency range is used for transmit, receive, or both transmit
   * and receive.
   *
   * @param value An instances of type {@link ListCAU}.
   * @return The current AntFreqs object instance.
   * @since 3.1.0
   */
  public AntFreqs withFreqUse(ListCAU value) {
    setFreqUse(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this AntFreqs instance configuration.
   *
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  AntFreqs {"
           + (bandwidth != null ? " bandwidth [" + bandwidth + "]" : "")
           + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
           + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
           + (freqUse != null ? " freqUse [" + freqUse + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntFreqs} requires {@link FreqM FreqMin}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   *
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetFreqMin();
  }

}
