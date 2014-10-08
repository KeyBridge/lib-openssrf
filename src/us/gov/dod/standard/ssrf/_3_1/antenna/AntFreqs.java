/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf._3_1.antenna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
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
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * FreqMin - Nominal or Minimum Frequency (Required)
   * <p>
   * The nominal frequency or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Required)
   */
  @XmlElement(name = "FreqMin", required = true)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
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
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * Bandwidth, as an alternative to FreqMin/FreqMax, enter the total operating
   * bandwidth of the Antenna centered around FreqMin.
   */
  @XmlElement(name = "Bandwidth", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal bandwidth;
  /**
   * FreqUse - Frequency Use (Optional)
   * <p>
   * If the frequency range is used for transmit, receive, or both transmit and
   * receive.
   * <p>
   * Format is L:CAU
   */
  @XmlElement(name = "FreqUse", required = false)
  private TString freqUse;

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
   * Get Bandwidth, as an alternative to FreqMin/FreqMax, enter the total
   * operating bandwidth of the Antenna centered around FreqMin.
   * <p>
   * @return the Bandwidth value in a {@link TDecimal} data type
   */
  public TDecimal getBandwidth() {
    return bandwidth;
  }

  /**
   * Set Bandwidth, as an alternative to FreqMin/FreqMax, enter the total
   * operating bandwidth of the Antenna centered around FreqMin.
   * <p>
   * @param value the Bandwidth value in a {@link TDecimal} data type
   */
  public void setBandwidth(TDecimal value) {
    this.bandwidth = value;
  }

  /**
   * Determine if the Bandwidth is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBandwidth() {
    return (this.bandwidth != null ? this.bandwidth.isSetValue() : false);
  }

  /**
   * Get if the frequency range is used for transmit, receive, or both transmit
   * and receive.
   * <p>
   * @return the FreqUse value in a {@link TString} data type
   */
  public TString getFreqUse() {
    return freqUse;
  }

  /**
   * Set if the frequency range is used for transmit, receive, or both transmit
   * and receive.
   * <p>
   * @param value the FreqUse value in a {@link TString} data type
   */
  public void setFreqUse(TString value) {
    this.freqUse = value;
  }

  /**
   * Determine if the FreqUse is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqUse() {
    return (this.freqUse != null ? this.freqUse.isSetValue() : false);
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntFreqs object instance
   */
  public AntFreqs withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntFreqs object instance
   */
  public AntFreqs withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set Bandwidth, as an alternative to FreqMin/FreqMax, enter the total
   * operating bandwidth of the Antenna centered around FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntFreqs object instance
   */
  public AntFreqs withBandwidth(Double value) {
    setBandwidth(new TDecimal(value));
    return this;
  }

  /**
   * Set if the frequency range is used for transmit, receive, or both transmit
   * and receive.
   * <p>
   * @param value An instances of type {@link ListCAU}
   * @return The current AntFreqs object instance
   */
  public AntFreqs withFreqUse(ListCAU value) {
    setFreqUse(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this AntFreqs instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AntFreqs {"
      + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
      + (freqUse != null ? " freqUse [" + freqUse + "]" : "")
      + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
      + (bandwidth != null ? " bandwidth [" + bandwidth + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntFreqs} requires {@link TDecimal FreqMin}.
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
