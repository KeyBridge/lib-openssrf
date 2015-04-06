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
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * TxSignalTuning indicates the tuning capabilities, the specific frequency or
 * range of frequencies within which the equipment may tune, and the tuning
 * increments of the equipment.
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;TxSignalTuning&gt;
 *   &lt;FreqMax  cls="U"&gt;3107.56&lt;/FreqMax &gt;
 *   &lt;FreqMin  cls="U"&gt;2999.753&lt;/FreqMin &gt;
 *   &lt;NumPresetChannels cls="U"&gt;500&lt;/NumPresetChannels&gt;
 *   &lt;TuningStep  cls="U"&gt;0.001&lt;/TuningStep &gt;
 *   &lt;LowestUsableChannel cls="U"&gt;176.345&lt;/LowestUsableChannel&gt;
 *   &lt;MinSeparation  cls="U"&gt;500&lt;/MinSeparation &gt;
 * &lt;/TxSignalTuning&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxSignalTuning", propOrder = {
  "freqMin",
  "freqMax",
  "tuningStep",
  "numPresetChannels",
  "lowestUsableChannel",
  "minSeparation"
})
public class TxSignalTuning {

  /**
   * FreqMin - Nominal or Minimum Frequency (Required)    * <p>
   * The nominal frequency or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMin", required = true)
  private FreqM freqMin;
  /**
   * FreqMax - Maximum Frequency (Optional)    * <p>
   * The maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMax", required = false)
  private FreqM freqMax;
  /**
   * TuningStep - Tuning Step (Optional)    * <p>
   * The tuning increment.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TuningStep", required = false)
  private FreqM tuningStep;
  /**
   * NumPresetChannels - Number of Preset Channels (Optional)    * <p>
   * The number of preset channels available.
   * <p>
   * Format is UN(8)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumPresetChannels", required = false)
  private UN8 numPresetChannels;
  /**
   * US:LowestUsableChannel - Lowest Usable Channel (Optional)    * <p>
   * The center frequency of the lowest channel usable within this transmitter
   * frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LowestUsableChannel", required = false)
  private FreqM lowestUsableChannel;
  /**
   * US:MinSeparation - Minimum Separation (Optional)    * <p>
   * The minimum frequency separation required at one transmitter or receiver
   * location.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MinSeparation", required = false)
  private FreqM minSeparation;

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
   * Get the tuning increment..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getTuningStep() {
    return tuningStep;
  }

  /**
   * Set the tuning increment..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setTuningStep(FreqM value) {
    this.tuningStep = value;
  }

  /**
   * Determine if the TuningStep is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTuningStep() {
    return (this.tuningStep != null ? this.tuningStep.isSetValue() : false);
  }

  /**
   * Get the number of preset channels available..
   * <p>
   * @return a {@link UN8} instance
   * @since 3.1.0
   */
  public UN8 getNumPresetChannels() {
    return numPresetChannels;
  }

  /**
   * Set the number of preset channels available..
   * <p>
   * @param value a {@link UN8} instance
   * @since 3.1.0
   */
  public void setNumPresetChannels(UN8 value) {
    this.numPresetChannels = value;
  }

  /**
   * Determine if the NumPresetChannels is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumPresetChannels() {
    return (this.numPresetChannels != null ? this.numPresetChannels.isSetValue() : false);
  }

  /**
   * Get the center frequency of the lowest channel usable within this
   * transmitter frequency range..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getLowestUsableChannel() {
    return lowestUsableChannel;
  }

  /**
   * Set the center frequency of the lowest channel usable within this
   * transmitter frequency range..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setLowestUsableChannel(FreqM value) {
    this.lowestUsableChannel = value;
  }

  /**
   * Determine if the LowestUsableChannel is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLowestUsableChannel() {
    return (this.lowestUsableChannel != null ? this.lowestUsableChannel.isSetValue() : false);
  }

  /**
   * Get the minimum frequency separation required at one transmitter or
   * receiver location..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getMinSeparation() {
    return minSeparation;
  }

  /**
   * Set the minimum frequency separation required at one transmitter or
   * receiver location..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setMinSeparation(FreqM value) {
    this.minSeparation = value;
  }

  /**
   * Determine if the MinSeparation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMinSeparation() {
    return (this.minSeparation != null ? this.minSeparation.isSetValue() : false);
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxSignalTuning object instance.
   * @since 3.1.0
   */
  public TxSignalTuning withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxSignalTuning object instance.
   * @since 3.1.0
   */
  public TxSignalTuning withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the tuning increment.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxSignalTuning object instance.
   * @since 3.1.0
   */
  public TxSignalTuning withTuningStep(Double value) {
    setTuningStep(new FreqM(value));
    return this;
  }

  /**
   * Set the number of preset channels available.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current TxSignalTuning object instance.
   * @since 3.1.0
   */
  public TxSignalTuning withNumPresetChannels(Integer value) {
    setNumPresetChannels(new UN8(value));
    return this;
  }

  /**
   * Set the center frequency of the lowest channel usable within this
   * transmitter frequency range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxSignalTuning object instance.
   * @since 3.1.0
   */
  public TxSignalTuning withLowestUsableChannel(Double value) {
    setLowestUsableChannel(new FreqM(value));
    return this;
  }

  /**
   * Set the minimum frequency separation required at one transmitter or
   * receiver location.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxSignalTuning object instance.
   * @since 3.1.0
   */
  public TxSignalTuning withMinSeparation(Double value) {
    setMinSeparation(new FreqM(value));
    return this;
  }

  /**
   * Get a string representation of this TxSignalTuning instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  TxSignalTuning {"
           + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
           + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
           + (lowestUsableChannel != null ? " lowestUsableChannel [" + lowestUsableChannel + "]" : "")
           + (minSeparation != null ? " minSeparation [" + minSeparation + "]" : "")
           + (numPresetChannels != null ? " numPresetChannels [" + numPresetChannels + "]" : "")
           + (tuningStep != null ? " tuningStep [" + tuningStep + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxSignalTuning} requires {@link FreqM FreqMin}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetFreqMin();
  }

}
