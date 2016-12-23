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
import us.gov.dod.standard.ssrf._3_1.metadata.domains.Percent;

/**
 * AntEfficiency describes the antenna efficiency at various frequencies within
 * the frequency range of the antenna.
 * <p>
 * Element of {@link AntMode}
 * <p>
 * Example:
 * <pre>
 * &lt;AntEfficiency&gt;
 *   &lt;FreqMin cls="U"&gt;225&lt;/FreqMin&gt;
 *   &lt;FreqMax cls="U"&gt;400&lt;/FreqMax&gt;
 *   &lt;Efficiency cls="U"&gt;60.4&lt;/Efficiency&gt;
 * &lt;/AntEfficiency&gt;
 * </pre>
 *
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntEfficiency", propOrder = {
  "freqMin",
  "freqMax",
  "efficiency"
})
public class AntEfficiency {

  /**
   * FreqMin - Nominal or Minimum Frequency (Required) * The nominal frequency
   * or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMin")
  private FreqM freqMin;
  /**
   * FreqMax - Maximum Frequency (Optional) * The maximum value of the
   * frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMax", required = false)
  private FreqM freqMax;
  /**
   * Efficiency - Efficiency (Required) * The efficiency of the antenna within
   * the frequency range which is being reported.
   * <p>
   * Format is UN(4,2) [0..100] (%)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Efficiency", required = true)
  private Percent efficiency;

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
   * Get the efficiency of the antenna within the frequency range which is being
   * reported..
   *
   * @return a {@link Percent} instance
   * @since 3.1.0
   */
  public Percent getEfficiency() {
    return efficiency;
  }

  /**
   * Set the efficiency of the antenna within the frequency range which is being
   * reported..
   *
   * @param value a {@link Percent} instance
   * @since 3.1.0
   */
  public void setEfficiency(Percent value) {
    this.efficiency = value;
  }

  /**
   * Determine if the Efficiency is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEfficiency() {
    return (this.efficiency != null ? this.efficiency.isSetValue() : false);
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntEfficiency object instance.
   * @since 3.1.0
   */
  public AntEfficiency withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntEfficiency object instance.
   * @since 3.1.0
   */
  public AntEfficiency withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the efficiency of the antenna within the frequency range which is being
   * reported.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntEfficiency object instance.
   * @since 3.1.0
   */
  public AntEfficiency withEfficiency(Double value) {
    setEfficiency(new Percent(value));
    return this;
  }

  /**
   * Get a string representation of this AntEfficiency instance configuration.
   *
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  AntEfficiency {"
           + (efficiency != null ? " efficiency [" + efficiency + "]" : "")
           + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
           + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntEfficiency} requires {@link Percent Efficiency}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   *
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetEfficiency();
  }

}
