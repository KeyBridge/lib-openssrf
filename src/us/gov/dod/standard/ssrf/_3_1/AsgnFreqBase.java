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
package us.gov.dod.standard.ssrf._3_1;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.assignment.Freq;
import us.gov.dod.standard.ssrf._3_1.assignment.FreqOld;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAU;

/**
 * AsgnFreqBase
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsgnFreqBase", propOrder = {
  "freqMin",
  "freqMax",
  "refFreq",
  "freqUse"
})
@XmlSeeAlso({
  FreqOld.class,
  Freq.class
})
public abstract class AsgnFreqBase {

  @XmlElement(name = "FreqMin", required = true)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;

  @XmlElement(name = "FreqMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;

  @XmlElement(name = "RefFreq", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal refFreq;

  @XmlElement(name = "FreqUse", required = false)
  private TString freqUse;

  /**
   * Get
   * <p>
   * @return the FreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Set
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
   * Get
   * <p>
   * @return the FreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Set
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
   * Get
   * <p>
   * @return the RefFreq value in a {@link TDecimal} data type
   */
  public TDecimal getRefFreq() {
    return refFreq;
  }

  /**
   * Set
   * <p>
   * @param value the RefFreq value in a {@link TDecimal} data type
   */
  public void setRefFreq(TDecimal value) {
    this.refFreq = value;
  }

  /**
   * Determine if the RefFreq is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRefFreq() {
    return (this.refFreq != null ? this.refFreq.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return the FreqUse value in a {@link TString} data type
   */
  public TString getFreqUse() {
    return freqUse;
  }

  /**
   * Set
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
   * Set
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AsgnFreqBase object instance
   */
  public AsgnFreqBase withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AsgnFreqBase object instance
   */
  public AsgnFreqBase withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AsgnFreqBase object instance
   */
  public AsgnFreqBase withRefFreq(Double value) {
    setRefFreq(new TDecimal(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListCAU}
   * @return The current AsgnFreqBase object instance
   */
  public AsgnFreqBase withFreqUse(ListCAU value) {
    setFreqUse(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this AsgnFreqBase instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AsgnFreqBase {"
      + (refFreq != null ? " refFreq [" + refFreq + "]" : "")
      + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
      + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
      + (freqUse != null ? " freqUse [" + freqUse + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AsgnFreqBase} requires {@link TDecimal FreqMin}.
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
