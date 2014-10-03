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
package us.gov.dod.standard.ssrf._3_1.transmitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * SubcarrierFreq describes the secondary channel that
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Sub-Element is {@link SubcarrierTone}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freq;
  /**
   * FreqOffset - Subcarrier Frequency Offset (Optional)
   * <p>
   * The frequency differential from the subcarrier frequency.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqOffset", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
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
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqRest;
  /**
   * SubcarrierTone (Optional)
   * <p>
   * SubcarrierTone describes the sidetone frequency used to modulate the
   * subcarrier.
   */
  @XmlElement(name = "SubcarrierTone")
  private List<SubcarrierTone> subcarrierTone;

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
  public List<SubcarrierTone> getSubcarrierTone() {
    if (subcarrierTone == null) {
      subcarrierTone = new ArrayList<>();
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
   * @return The current SubcarrierFreq object instance
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
