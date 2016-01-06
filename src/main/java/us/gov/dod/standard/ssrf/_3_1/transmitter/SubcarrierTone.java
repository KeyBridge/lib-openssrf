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
package us.gov.dod.standard.ssrf._3_1.transmitter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.FreqM;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.S10;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.microsecs;

/**
 * SubcarrierTone describes the sidetone frequency used to modulate the
 * subcarrier.
 * <p>
 * Element of {@link SubcarrierFreq}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubcarrierTone", propOrder = {
  "freqMin",
  "freqMax",
  "duration",
  "name"
})
public class SubcarrierTone {

  /**
   * FreqMin - Minimum SubcarrierTone Frequency (Optional)
   * <p>
   * The nominal frequency or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMin")
  private FreqM freqMin;
  /**
   * FreqMax - Maximum Subcarrier Tone Frequency (Optional)
   * <p>
   * The maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMax", required = false)
  private FreqM freqMax;
  /**
   * Duration - Subcarrier Tone Dwell (Optional)
   * <p>
   * The period of dwell for the baseband audio frequency, before it is disabled
   * or switched.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Duration", required = false)
  private microsecs duration;
  /**
   * Name - Tone Name (Optional)
   * <p>
   * The name of the tone. Tone names MUST match entries in
   * Baseband/US:SignalSequenceDesc.
   * <p>
   * Format is S10
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Name", required = false)
  private S10 name;

  /**
   * Get the nominal frequency or minimum value of the frequency range..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMin() {
    return freqMin;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMin(FreqM value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin..
   * <p>
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
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMax(FreqM value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get the period of dwell for the baseband audio frequency, before it is
   * disabled or switched..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getDuration() {
    return duration;
  }

  /**
   * Set the period of dwell for the baseband audio frequency, before it is
   * disabled or switched..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setDuration(microsecs value) {
    this.duration = value;
  }

  /**
   * Determine if the Duration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDuration() {
    return (this.duration != null ? this.duration.isSetValue() : false);
  }

  /**
   * Get the name of the tone. Tone names MUST match entries in
   * Baseband/US:SignalSequenceDesc..
   * <p>
   * @return a {@link S10} instance
   * @since 3.1.0
   */
  public S10 getName() {
    return name;
  }

  /**
   * Set the name of the tone. Tone names MUST match entries in
   * Baseband/US:SignalSequenceDesc..
   * <p>
   * @param value a {@link S10} instance
   * @since 3.1.0
   */
  public void setName(S10 value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SubcarrierTone object instance.
   * @since 3.1.0
   */
  public SubcarrierTone withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SubcarrierTone object instance.
   * @since 3.1.0
   */
  public SubcarrierTone withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the period of dwell for the baseband audio frequency, before it is
   * disabled or switched.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SubcarrierTone object instance.
   * @since 3.1.0
   */
  public SubcarrierTone withDuration(Double value) {
    setDuration(new microsecs(value));
    return this;
  }

  /**
   * Set the name of the tone. Tone names MUST match entries in
   * Baseband/US:SignalSequenceDesc.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current SubcarrierTone object instance.
   * @since 3.1.0
   */
  public SubcarrierTone withName(String value) {
    setName(new S10(value));
    return this;
  }

  /**
   * Get a string representation of this SubcarrierTone instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  SubcarrierTone {"
           + (duration != null ? " duration [" + duration + "]" : "")
           + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
           + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
           + (name != null ? " name [" + name + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SubcarrierTone} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
