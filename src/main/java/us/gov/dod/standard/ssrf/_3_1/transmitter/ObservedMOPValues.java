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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.FreqM;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.Signed_DB_5_2;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.US_Degrees;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.US_Percent3;

/**
 * ObservedMOPValues (US) contains specific data artifacts that describe the
 * Amplitude (AM), Phase (PM), Frequency (FM) and/or Continuous Wave (CW)
 * features of a signal impressed on a Pulse.
 * <p>
 * Element of {@link ObservedMOPBits}
 * <p>
 * Example: See {@link ObservedMOPAnalysis}.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedMOPValues", propOrder = {
  "mopValueAM",
  "mopValueCW",
  "mopValueFM",
  "mopValuePM",
  "statisticalIndicator"
})
public class ObservedMOPValues {

  /**
   * In Data Item US:MOPValueAM (US), enter specific data that describes the
   * Amplitude (AM) features of a signal impressed on a Pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPValueAM", required = false)
  private Signed_DB_5_2 mopValueAM;
  /**
   * In Data Item US:MOPValueCW (US), enter specific data that describes the
   * Continuous Wave (CW) features of a signal impressed on a Pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPValueCW", required = false)
  private FreqM mopValueCW;
  /**
   * In Data Item US:MOPValueFM (US), enter specific data that describes the
   * Frequency (FM) features of a signal impressed on a Pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPValueFM", required = false)
  private FreqM mopValueFM;
  /**
   * In Data Item US:MOPValuePM (US), enter specific data that describes the
   * Phase (PM)features of a signal impressed on a Pulse. Use of this element
   * should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPValuePM", required = false)
  private US_Degrees mopValuePM;
  /**
   * In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was collected (e.g., 95% of the observed values). If this
   * element is empty, then the value is assumed to be part of the 100% sample.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StatisticalIndicator", required = false)
  private US_Percent3 statisticalIndicator;

  /**
   * Get In Data Item US:MOPValueAM (US), enter specific data that describes the
   * Amplitude (AM) features of a signal impressed on a Pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link Signed_DB_5_2} instance
   * @since 3.1.0
   */
  public Signed_DB_5_2 getMOPValueAM() {
    return mopValueAM;
  }

  /**
   * Set In Data Item US:MOPValueAM (US), enter specific data that describes the
   * Amplitude (AM) features of a signal impressed on a Pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link Signed_DB_5_2} instance
   * @since 3.1.0
   */
  public void setMOPValueAM(Signed_DB_5_2 value) {
    this.mopValueAM = value;
  }

  /**
   * Determine if the MOPValueAM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueAM() {
    return (this.mopValueAM != null ? this.mopValueAM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueCW (US), enter specific data that describes the
   * Continuous Wave (CW) features of a signal impressed on a Pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getMOPValueCW() {
    return mopValueCW;
  }

  /**
   * Set In Data Item US:MOPValueCW (US), enter specific data that describes the
   * Continuous Wave (CW) features of a signal impressed on a Pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setMOPValueCW(FreqM value) {
    this.mopValueCW = value;
  }

  /**
   * Determine if the MOPValueCW is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueCW() {
    return (this.mopValueCW != null ? this.mopValueCW.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueFM (US), enter specific data that describes the
   * Frequency (FM) features of a signal impressed on a Pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getMOPValueFM() {
    return mopValueFM;
  }

  /**
   * Set In Data Item US:MOPValueFM (US), enter specific data that describes the
   * Frequency (FM) features of a signal impressed on a Pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setMOPValueFM(FreqM value) {
    this.mopValueFM = value;
  }

  /**
   * Determine if the MOPValueFM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueFM() {
    return (this.mopValueFM != null ? this.mopValueFM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValuePM (US), enter specific data that describes the
   * Phase (PM)features of a signal impressed on a Pulse. Use of this element
   * should agree with the selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_Degrees} instance
   * @since 3.1.0
   */
  public US_Degrees getMOPValuePM() {
    return mopValuePM;
  }

  /**
   * Set In Data Item US:MOPValuePM (US), enter specific data that describes the
   * Phase (PM)features of a signal impressed on a Pulse. Use of this element
   * should agree with the selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_Degrees} instance
   * @since 3.1.0
   */
  public void setMOPValuePM(US_Degrees value) {
    this.mopValuePM = value;
  }

  /**
   * Determine if the MOPValuePM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValuePM() {
    return (this.mopValuePM != null ? this.mopValuePM.isSetValue() : false);
  }

  /**
   * Get In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was collected (e.g., 95% of the observed values). If this
   * element is empty, then the value is assumed to be part of the 100% sample..
   * <p>
   * @return a {@link US_Percent3} instance
   * @since 3.1.0
   */
  public US_Percent3 getStatisticalIndicator() {
    return statisticalIndicator;
  }

  /**
   * Set In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was collected (e.g., 95% of the observed values). If this
   * element is empty, then the value is assumed to be part of the 100% sample..
   * <p>
   * @param value a {@link US_Percent3} instance
   * @since 3.1.0
   */
  public void setStatisticalIndicator(US_Percent3 value) {
    this.statisticalIndicator = value;
  }

  /**
   * Determine if the StatisticalIndicator is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStatisticalIndicator() {
    return (this.statisticalIndicator != null ? this.statisticalIndicator.isSetValue() : false);
  }

  /**
   * Set In Data Item US:MOPValueAM (US), enter specific data that describes the
   * Amplitude (AM) features of a signal impressed on a Pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPValues object instance.
   * @since 3.1.0
   */
  public ObservedMOPValues withMOPValueAM(Double value) {
    setMOPValueAM(new Signed_DB_5_2(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueCW (US), enter specific data that describes the
   * Continuous Wave (CW) features of a signal impressed on a Pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPValues object instance.
   * @since 3.1.0
   */
  public ObservedMOPValues withMOPValueCW(Double value) {
    setMOPValueCW(new FreqM(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueFM (US), enter specific data that describes the
   * Frequency (FM) features of a signal impressed on a Pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPValues object instance.
   * @since 3.1.0
   */
  public ObservedMOPValues withMOPValueFM(Double value) {
    setMOPValueFM(new FreqM(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValuePM (US), enter specific data that describes the
   * Phase (PM)features of a signal impressed on a Pulse. Use of this element
   * should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPValues object instance.
   * @since 3.1.0
   */
  public ObservedMOPValues withMOPValuePM(Double value) {
    setMOPValuePM(new US_Degrees(value));
    return this;
  }

  /**
   * Set In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was collected (e.g., 95% of the observed values). If this
   * element is empty, then the value is assumed to be part of the 100% sample.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPValues object instance.
   * @since 3.1.0
   */
  public ObservedMOPValues withStatisticalIndicator(Double value) {
    setStatisticalIndicator(new US_Percent3(value));
    return this;
  }

  /**
   * Get a string representation of this ObservedMOPValues instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  ObservedMOPValues {"
           + (mopValueAM != null ? " mopValueAM [" + mopValueAM + "]" : "")
           + (mopValueCW != null ? " mopValueCW [" + mopValueCW + "]" : "")
           + (mopValueFM != null ? " mopValueFM [" + mopValueFM + "]" : "")
           + (mopValuePM != null ? " mopValuePM [" + mopValuePM + "]" : "")
           + (statisticalIndicator != null ? " statisticalIndicator [" + statisticalIndicator + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedMOPValues} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
