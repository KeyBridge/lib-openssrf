/* 
 * Copyright 2014 Key Bridge Global LLC.
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
   * FreqMin - Nominal or Minimum Frequency (Required)
   * <p>
   * The nominal frequency or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Required)
   */
  @XmlElement(name = "FreqMin", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * FreqMax - Maximum Frequency (Optional)
   * <p>
   * The maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Required)
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * TuningStep - Tuning Step (Optional)
   * <p>
   * The tuning increment.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "TuningStep", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal tuningStep;
  /**
   * NumPresetChannels - Number of Preset Channels (Optional)
   * <p>
   * The number of preset channels available.
   * <p>
   * Format is UN(8)
   */
  @XmlElement(name = "NumPresetChannels", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN8.class)
  private TInteger numPresetChannels;
  /**
   * US:LowestUsableChannel - Lowest Usable Channel (Optional)
   * <p>
   * The center frequency of the lowest channel usable within this transmitter
   * frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "LowestUsableChannel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal lowestUsableChannel;
  /**
   * US:MinSeparation - Minimum Separation (Optional)
   * <p>
   * The minimum frequency separation required at one transmitter or receiver
   * location.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "MinSeparation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal minSeparation;

  /**
   * Get the nominal frequency or minimum value of the frequency range.
   * <p>
   * @return the FreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value the FreqMin value in a {@link TDecimal} data type
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @return the FreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value the FreqMax value in a {@link TDecimal} data type
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get the tuning increment.
   * <p>
   * @return the TuningStep value in a {@link TDecimal} data type
   */
  public TDecimal getTuningStep() {
    return tuningStep;
  }

  /**
   * Set the tuning increment.
   * <p>
   * @param value the TuningStep value in a {@link TDecimal} data type
   */
  public void setTuningStep(TDecimal value) {
    this.tuningStep = value;
  }

  /**
   * Determine if the TuningStep is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTuningStep() {
    return (this.tuningStep != null ? this.tuningStep.isSetValue() : false);
  }

  /**
   * Get the number of preset channels available.
   * <p>
   * @return the NumPresetChannels value in a {@link TInteger} data type
   */
  public TInteger getNumPresetChannels() {
    return numPresetChannels;
  }

  /**
   * Set the number of preset channels available.
   * <p>
   * @param value the NumPresetChannels value in a {@link TInteger} data type
   */
  public void setNumPresetChannels(TInteger value) {
    this.numPresetChannels = value;
  }

  /**
   * Determine if the NumPresetChannels is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumPresetChannels() {
    return (this.numPresetChannels != null ? this.numPresetChannels.isSetValue() : false);
  }

  /**
   * Get the center frequency of the lowest channel usable within this
   * transmitter frequency range.
   * <p>
   * @return the LowestUsableChannel value in a {@link TDecimal} data type
   */
  public TDecimal getLowestUsableChannel() {
    return lowestUsableChannel;
  }

  /**
   * Set the center frequency of the lowest channel usable within this
   * transmitter frequency range.
   * <p>
   * @param value the LowestUsableChannel value in a {@link TDecimal} data type
   */
  public void setLowestUsableChannel(TDecimal value) {
    this.lowestUsableChannel = value;
  }

  /**
   * Determine if the LowestUsableChannel is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLowestUsableChannel() {
    return (this.lowestUsableChannel != null ? this.lowestUsableChannel.isSetValue() : false);
  }

  /**
   * Get the minimum frequency separation required at one transmitter or
   * receiver location.
   * <p>
   * @return the MinSeparation value in a {@link TDecimal} data type
   */
  public TDecimal getMinSeparation() {
    return minSeparation;
  }

  /**
   * Set the minimum frequency separation required at one transmitter or
   * receiver location.
   * <p>
   * @param value the MinSeparation value in a {@link TDecimal} data type
   */
  public void setMinSeparation(TDecimal value) {
    this.minSeparation = value;
  }

  /**
   * Determine if the MinSeparation is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMinSeparation() {
    return (this.minSeparation != null ? this.minSeparation.isSetValue() : false);
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxSignalTuning object instance
   */
  public TxSignalTuning withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxSignalTuning object instance
   */
  public TxSignalTuning withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the tuning increment.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxSignalTuning object instance
   */
  public TxSignalTuning withTuningStep(Double value) {
    setTuningStep(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of preset channels available.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current TxSignalTuning object instance
   */
  public TxSignalTuning withNumPresetChannels(Integer value) {
    setNumPresetChannels(new TInteger(value));
    return this;
  }

  /**
   * Set the center frequency of the lowest channel usable within this
   * transmitter frequency range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxSignalTuning object instance
   */
  public TxSignalTuning withLowestUsableChannel(Double value) {
    setLowestUsableChannel(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum frequency separation required at one transmitter or
   * receiver location.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxSignalTuning object instance
   */
  public TxSignalTuning withMinSeparation(Double value) {
    setMinSeparation(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this TxSignalTuning instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TxSignalTuning {"
      + (lowestUsableChannel != null ? " lowestUsableChannel [" + lowestUsableChannel + "]" : "")
      + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
      + (tuningStep != null ? " tuningStep [" + tuningStep + "]" : "")
      + (minSeparation != null ? " minSeparation [" + minSeparation + "]" : "")
      + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
      + (numPresetChannels != null ? " numPresetChannels [" + numPresetChannels + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxSignalTuning} requires {@link TDecimal FreqMin}.
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
