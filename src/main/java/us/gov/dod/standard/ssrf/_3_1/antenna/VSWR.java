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
package us.gov.dod.standard.ssrf._3_1.antenna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VSWR", propOrder = {
  "freq",
  "ratio"
})
public class VSWR {

  /**
   * Freq - Frequency (Optional)
   * <p>
   * The specific frequency at which the VSWR measurement was taken. If multiple
   * points are described, Freq MUST be filled in.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "Freq", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freq;
  /**
   * Ratio - Ratio (Required)
   * <p>
   * The standing wave ratio referenced to the specific frequency, as a number
   * without unit (e.g., enter "2" to represent a ratio of 2:1).
   * <p>
   * Format is UN(2,1)
   */
  @XmlElement(name = "Ratio", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN2_1.class)
  private TDecimal ratio;

  /**
   * Get the specific frequency at which the VSWR measurement was taken. If
   * multiple points are described, Freq MUST be filled in.
   * <p>
   * @return the Freq value in a {@link TDecimal} data type
   */
  public TDecimal getFreq() {
    return freq;
  }

  /**
   * Set the specific frequency at which the VSWR measurement was taken. If
   * multiple points are described, Freq MUST be filled in.
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
   * Get the standing wave ratio referenced to the specific frequency, as a
   * number without unit (e.g., enter "2" to represent a ratio of 2:1).
   * <p>
   * @return the Ratio value in a {@link TDecimal} data type
   */
  public TDecimal getRatio() {
    return ratio;
  }

  /**
   * Set the standing wave ratio referenced to the specific frequency, as a
   * number without unit (e.g., enter "2" to represent a ratio of 2:1).
   * <p>
   * @param value the Ratio value in a {@link TDecimal} data type
   */
  public void setRatio(TDecimal value) {
    this.ratio = value;
  }

  /**
   * Determine if the Ratio is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * @param value An instances of type {@link Double}
   * @return The current VSWR object instance
   */
  public VSWR withFreq(Double value) {
    setFreq(new TDecimal(value));
    return this;
  }

  /**
   * Set the standing wave ratio referenced to the specific frequency, as a
   * number without unit (e.g., enter "2" to represent a ratio of 2:1).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current VSWR object instance
   */
  public VSWR withRatio(Double value) {
    setRatio(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this VSWR instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "VSWR {"
      + (ratio != null ? " ratio [" + ratio + "]" : "")
      + (freq != null ? " freq [" + freq + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link VSWR} requires {@link TDecimal Ratio}.
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
