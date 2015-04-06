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

/**
 * Complex Element VSWR stores the Voltage Standing Wave Ratio information for
 * an Antenna Mode; it may be used to describe the VSWR curve as a function of
 * frequency.
 * <p>
 * Element of {@link AntMode}
 * <p>
 * Example:
 * <pre>
 * &lt;VSWR&gt;
 *   &lt;Freq cls="U"&gt;225&lt;/Freq&gt;
 *   &lt;Ratio cls="U"&gt;1.2&lt;/Ratio&gt;
 * &lt;/VSWR&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VSWR", propOrder = {
  "freq",
  "ratio"
})
public class VSWR {

  /**
   * Freq - Frequency (Optional)    * <p>
   * The specific frequency at which the VSWR measurement was taken. If multiple
   * points are described, Freq MUST be filled in.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Freq", required = false)
  private FreqM freq;
  /**
   * Ratio - Ratio (Required)    * <p>
   * The standing wave ratio referenced to the specific frequency, as a number
   * without unit (e.g., enter "2" to represent a ratio of 2:1).
   * <p>
   * Format is UN(2,1)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Ratio", required = true)
  private UN2_1 ratio;

  /**
   * Get the specific frequency at which the VSWR measurement was taken. If
   * multiple points are described, Freq MUST be filled in..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreq() {
    return freq;
  }

  /**
   * Set the specific frequency at which the VSWR measurement was taken. If
   * multiple points are described, Freq MUST be filled in..
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
   * Get the standing wave ratio referenced to the specific frequency, as a
   * number without unit (e.g., enter "2" to represent a ratio of 2:1)..
   * <p>
   * @return a {@link UN2_1} instance
   * @since 3.1.0
   */
  public UN2_1 getRatio() {
    return ratio;
  }

  /**
   * Set the standing wave ratio referenced to the specific frequency, as a
   * number without unit (e.g., enter "2" to represent a ratio of 2:1)..
   * <p>
   * @param value a {@link UN2_1} instance
   * @since 3.1.0
   */
  public void setRatio(UN2_1 value) {
    this.ratio = value;
  }

  /**
   * Determine if the Ratio is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRatio() {
    return (this.ratio != null ? this.ratio.isSetValue() : false);
  }

  /**
   * Set the specific frequency at which the VSWR measurement was taken. If
   * multiple points are described, Freq MUST be filled in.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current VSWR object instance.
   * @since 3.1.0
   */
  public VSWR withFreq(Double value) {
    setFreq(new FreqM(value));
    return this;
  }

  /**
   * Set the standing wave ratio referenced to the specific frequency, as a
   * number without unit (e.g., enter "2" to represent a ratio of 2:1).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current VSWR object instance.
   * @since 3.1.0
   */
  public VSWR withRatio(Double value) {
    setRatio(new UN2_1(value));
    return this;
  }

  /**
   * Get a string representation of this VSWR instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  VSWR {"
           + (freq != null ? " freq [" + freq + "]" : "")
           + (ratio != null ? " ratio [" + ratio + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link VSWR} requires {@link UN2_1 Ratio}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetRatio();
  }

}
