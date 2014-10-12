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
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * SubcarrierTone describes the sidetone frequency used to modulate the
 * subcarrier.
 * <p>
 * Element of {@link SubcarrierFreq}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "FreqMin")
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
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
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * Duration - Subcarrier Tone Dwell (Optional)
   * <p>
   * The period of dwell for the baseband audio frequency, before it is disabled
   * or switched.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "Duration", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal duration;
  /**
   * Name - Tone Name (Optional)
   * <p>
   * The name of the tone. Tone names MUST match entries in
   * Baseband/US:SignalSequenceDesc.
   * <p>
   * Format is S10
   */
  @XmlElement(name = "Name", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS10.class)
  private TString name;

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
   * Get the period of dwell for the baseband audio frequency, before it is
   * disabled or switched.
   * <p>
   * @return the Duration value in a {@link TDecimal} data type
   */
  public TDecimal getDuration() {
    return duration;
  }

  /**
   * Set the period of dwell for the baseband audio frequency, before it is
   * disabled or switched.
   * <p>
   * @param value the Duration value in a {@link TDecimal} data type
   */
  public void setDuration(TDecimal value) {
    this.duration = value;
  }

  /**
   * Determine if the Duration is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDuration() {
    return (this.duration != null ? this.duration.isSetValue() : false);
  }

  /**
   * Get the name of the tone. Tone names MUST match entries in
   * Baseband/US:SignalSequenceDesc.
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set the name of the tone. Tone names MUST match entries in
   * Baseband/US:SignalSequenceDesc.
   * <p>
   * @param value the Name value in a {@link TString} data type
   */
  public void setName(TString value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SubcarrierTone object instance
   */
  public SubcarrierTone withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SubcarrierTone object instance
   */
  public SubcarrierTone withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the period of dwell for the baseband audio frequency, before it is
   * disabled or switched.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SubcarrierTone object instance
   */
  public SubcarrierTone withDuration(Double value) {
    setDuration(new TDecimal(value));
    return this;
  }

  /**
   * Set the name of the tone. Tone names MUST match entries in
   * Baseband/US:SignalSequenceDesc.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SubcarrierTone object instance
   */
  public SubcarrierTone withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this SubcarrierTone instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SubcarrierTone {"
      + (duration != null ? " duration [" + duration + "]" : "")
      + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
      + (name != null ? " name [" + name + "]" : "")
      + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SubcarrierTone} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
