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

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * SubcarrierFreq describes the secondary channel that
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Sub-Element is {@link SubcarrierTone}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubcarrierFreq", propOrder = {
  "freq",
  "freqOffset",
  "freqRest",
  "subcarrierTone"
})
public class SubcarrierFreq {

  @XmlElement(name = "Freq ", required = true)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freq;
  /**
   * FreqOffset - Subcarrier Frequency Offset (Optional)
   * <p>
   * The frequency differential from the subcarrier frequency.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqOffset", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqOffset;
  /**
   * FreqRest - Rest Frequency (Optional)
   * <p>
   * The dwell or pause frequency utilised while processing the subcarrier.
   * Typically provided for improvement of the baseband S/N noise ratio.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqRest", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqRest;
  /**
   * SubcarrierTone (Optional)
   * <p>
   * SubcarrierTone describes the sidetone frequency used to modulate the
   * subcarrier.
   */
  @XmlElement(name = "SubcarrierTone")
  private Set<SubcarrierTone> subcarrierTone;

  /**
   * Get the subcarrier frequency.
   * <p>
   * @return the Freq value in a {@link TDecimal} data type
   */
  public TDecimal getFreq() {
    return freq;
  }

  /**
   * Set the subcarrier frequency.
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
   * Get the frequency differential from the subcarrier frequency.
   * <p>
   * @return a {@link TDecimal} instance
   */
  public TDecimal getFreqOffset() {
    return freqOffset;
  }

  /**
   * Set the frequency differential from the subcarrier frequency.
   * <p>
   * @param value a {@link TDecimal} instance
   */
  public void setFreqOffset(TDecimal value) {
    this.freqOffset = value;
  }

  /**
   * Determine if the FreqOffset is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqOffset() {
    return (this.freqOffset != null ? this.freqOffset.isSetValue() : false);
  }

  /**
   * Get the dwell or pause frequency utilised while processing the subcarrier.
   * Typically provided for improvement of the baseband S/N noise ratio.
   * <p>
   * @return the FreqRest value in a {@link TDecimal} data type
   */
  public TDecimal getFreqRest() {
    return freqRest;
  }

  /**
   * Set the dwell or pause frequency utilised while processing the subcarrier.
   * Typically provided for improvement of the baseband S/N noise ratio.
   * <p>
   * @param value the FreqRest value in a {@link TDecimal} data type
   */
  public void setFreqRest(TDecimal value) {
    this.freqRest = value;
  }

  /**
   * Determine if the FreqRest is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * modulate the subcarrier.
   * <p>
   * @return a non-null but possibly empty list of {@link SubcarrierTone}
   *         instances
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
   * @param value An instances of type {@link Double}
   * @return The current SubcarrierFreq object instance
   */
  public SubcarrierFreq withFreq(Double value) {
    setFreq(new TDecimal(value));
    return this;
  }

  /**
   * Set the frequency differential from the subcarrier frequency.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SubcarrierFreq object instance
   */
  public SubcarrierFreq withFreqOffset(Double value) {
    setFreqOffset(new TDecimal(value));
    return this;
  }

  /**
   * Set the dwell or pause frequency utilised while processing the subcarrier.
   * Typically provided for improvement of the baseband S/N noise ratio.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SubcarrierFreq object instance
   */
  public SubcarrierFreq withFreqRest(Double value) {
    setFreqRest(new TDecimal(value));
    return this;
  }

  /**
   * Set the SubcarrierTone
   * <p>
   * Complex element SubcarrierTone describes the sidetone frequency used to
   * modulate the subcarrier.
   * <p>
   * @param values One or more instances of type {@link SubcarrierTone}
   * @return The current SubcarrierFreq object instance
   */
  public SubcarrierFreq withSubcarrierTone(SubcarrierTone... values) {
    if (values != null) {
      getSubcarrierTone().addAll(new HashSet<>(Arrays.asList(values)));
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
   * @return The current SubcarrierFreq object instance
   */
  public SubcarrierFreq withSubcarrierTone(Set<SubcarrierTone> values) {
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
      + (subcarrierTone != null ? " subcarrierTone [" + subcarrierTone + "]" : "")
      + (freqRest != null ? " freqRest [" + freqRest + "]" : "")
      + (freq != null ? " freq [" + freq + "]" : "")
      + (freqOffset != null ? " freqOffset [" + freqOffset + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SubcarrierFreq} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
