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
package us.gov.dod.standard.ssrf._3_1;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.assignment.Freq;
import us.gov.dod.standard.ssrf._3_1.assignment.FreqOld;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAU;

/**
 * The SSRF AsgnFreqBase data type.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
@SuppressWarnings("unchecked")
public abstract class AsgnFreqBase {

  @XmlElement(name = "FreqMin", required = true)
  protected FreqM freqMin;

  @XmlElement(name = "FreqMax", required = false)
  protected FreqM freqMax;

  @XmlElement(name = "RefFreq", required = false)
  protected FreqM refFreq;

  @XmlElement(name = "FreqUse", required = false)
  protected TString freqUse;

  /**
   * Get .
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMin() {
    return freqMin;
  }

  /**
   * Set .
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMin(FreqM value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get .
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMax() {
    return freqMax;
  }

  /**
   * Set .
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMax(FreqM value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get .
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getRefFreq() {
    return refFreq;
  }

  /**
   * Set .
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setRefFreq(FreqM value) {
    this.refFreq = value;
  }

  /**
   * Determine if the RefFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRefFreq() {
    return (this.refFreq != null ? this.refFreq.isSetValue() : false);
  }

  /**
   * Get .
   * <p>
   * @return the FreqUse value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getFreqUse() {
    return freqUse;
  }

  /**
   * Set .
   * <p>
   * @param value the FreqUse value in a {@link TString} data type
   * @since 3.1.0
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
   * @param value An instances of type {@link Double}.
   * @return The current AsgnFreqBase object instance.
   * @since 3.1.0
   */
  public AsgnFreqBase withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current AsgnFreqBase object instance.
   * @since 3.1.0
   */
  public AsgnFreqBase withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current AsgnFreqBase object instance.
   * @since 3.1.0
   */
  public AsgnFreqBase withRefFreq(Double value) {
    setRefFreq(new FreqM(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListCAU}.
   * @return The current AsgnFreqBase object instance.
   * @since 3.1.0
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
    return "\n  AsgnFreqBase {"
           + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
           + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
           + (freqUse != null ? " freqUse [" + freqUse + "]" : "")
           + (refFreq != null ? " refFreq [" + refFreq + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AsgnFreqBase} requires {@link FreqM FreqMin}.
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
