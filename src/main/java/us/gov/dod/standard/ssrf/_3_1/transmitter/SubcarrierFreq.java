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

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * SubcarrierFreq describes the secondary channel that
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Sub-Element is {@link SubcarrierTone}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubcarrierFreq", propOrder = {
  "freq",
  "freqOffset",
  "freqRest",
  "subcarrierTone"
})
public class SubcarrierFreq {

  @XmlElement(name = "Freq", required = true)
  private FreqM freq;
  /**
   * FreqOffset - Subcarrier Frequency Offset (Optional)    * <p>
   * The frequency differential from the subcarrier frequency.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqOffset", required = false)
  private FreqM freqOffset;
  /**
   * FreqRest - Rest Frequency (Optional)    * <p>
   * The dwell or pause frequency utilised while processing the subcarrier.
   * Typically provided for improvement of the baseband S/N noise ratio.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqRest", required = false)
  private FreqM freqRest;
  /**
   * SubcarrierTone (Optional)
   * <p>
   * SubcarrierTone describes the sidetone frequency used to modulate the
   * subcarrier.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SubcarrierTone")
  private Set<SubcarrierTone> subcarrierTone;

  /**
   * Get the subcarrier frequency..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreq() {
    return freq;
  }

  /**
   * Set the subcarrier frequency..
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
   * Get the frequency differential from the subcarrier frequency..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqOffset() {
    return freqOffset;
  }

  /**
   * Set the frequency differential from the subcarrier frequency..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqOffset(FreqM value) {
    this.freqOffset = value;
  }

  /**
   * Determine if the FreqOffset is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqOffset() {
    return (this.freqOffset != null ? this.freqOffset.isSetValue() : false);
  }

  /**
   * Get the dwell or pause frequency utilised while processing the subcarrier.
   * Typically provided for improvement of the baseband S/N noise ratio..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqRest() {
    return freqRest;
  }

  /**
   * Set the dwell or pause frequency utilised while processing the subcarrier.
   * Typically provided for improvement of the baseband S/N noise ratio..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqRest(FreqM value) {
    this.freqRest = value;
  }

  /**
   * Determine if the FreqRest is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqRest() {
    return (this.freqRest != null ? this.freqRest.isSetValue() : false);
  }

  /**
   * Get the SubcarrierTone
   * <p>
   * Complex element SubcarrierTone describes the sidetone frequency used to
   * modulate the subcarrier..
   * <p>
   * @return a {@link SubcarrierTone} instance
   * @since 3.1.0
   */
  public Set<SubcarrierTone> getSubcarrierTone() {
    if (subcarrierTone == null) {
      subcarrierTone = new HashSet<>();
    }
    return this.subcarrierTone;
  }

  /**
   * Determine if the SubcarrierTone is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSubcarrierTone() {
    return ((this.subcarrierTone != null) && (!this.subcarrierTone.isEmpty()));
  }

  /**
   * Clear the SubcarrierTone field. This sets the field to null.
   */
  public void unsetSubcarrierTone() {
    this.subcarrierTone = null;
  }

  /**
   * Set the subcarrier frequency.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SubcarrierFreq object instance.
   * @since 3.1.0
   */
  public SubcarrierFreq withFreq(Double value) {
    setFreq(new FreqM(value));
    return this;
  }

  /**
   * Set the frequency differential from the subcarrier frequency.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SubcarrierFreq object instance.
   * @since 3.1.0
   */
  public SubcarrierFreq withFreqOffset(Double value) {
    setFreqOffset(new FreqM(value));
    return this;
  }

  /**
   * Set the dwell or pause frequency utilised while processing the subcarrier.
   * Typically provided for improvement of the baseband S/N noise ratio.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SubcarrierFreq object instance.
   * @since 3.1.0
   */
  public SubcarrierFreq withFreqRest(Double value) {
    setFreqRest(new FreqM(value));
    return this;
  }

  /**
   * Set the SubcarrierTone
   * <p>
   * Complex element SubcarrierTone describes the sidetone frequency used to
   * modulate the subcarrier.
   * <p>
   * @param values One or more instances of type {@link SubcarrierTone...}.
   * @return The current SubcarrierFreq object instance.
   * @since 3.1.0
   */
  public SubcarrierFreq withSubcarrierTone(SubcarrierTone... values) {
    if (values != null) {
      getSubcarrierTone().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the SubcarrierTone
   * <p>
   * Complex element SubcarrierTone describes the sidetone frequency used to
   * modulate the subcarrier.
   * <p>
   * @param values A collection of {@link SubcarrierTone} instances
   * @return The current SubcarrierFreq object instance.
   * @since 3.1.0
   */
  public SubcarrierFreq withSubcarrierTone(Collection<SubcarrierTone> values) {
    if (values != null) {
      getSubcarrierTone().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this SubcarrierFreq instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SubcarrierFreq {"
           + (freq != null ? "\n freq [" + freq + "]" : "")
           + (freqOffset != null ? "\n freqOffset [" + freqOffset + "]" : "")
           + (freqRest != null ? "\n freqRest [" + freqRest + "]" : "")
           + (subcarrierTone != null ? "\n subcarrierTone [" + subcarrierTone + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SubcarrierFreq} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
