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

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * ObservedMOPValues (US) contains specific data artifacts that describe the
 * Amplitude (AM), Phase (PM), Frequency (FM) and/or Continuous Wave (CW)
 * features of a signal impressed on a Pulse.
 * <p>
 * Element of {@link ObservedMOPBits}
 * <p>
 * Example: See {@link ObservedMOPAnalysis}.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
   * US:MOPValueAM (US), enter specific data that describes the Amplitude (AM)
   * features of a signal impressed on a Pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPValueAM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSIGNED_DB_5_2.class)
  private TDecimal mopValueAM;
  /**
   * US:MOPValueCW (US), enter specific data that describes the Continuous Wave
   * (CW) features of a signal impressed on a Pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPValueCW", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal mopValueCW;
  /**
   * US:MOPValueFM (US), enter specific data that describes the Frequency (FM)
   * features of a signal impressed on a Pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPValueFM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal mopValueFM;
  /**
   * US:MOPValuePM (US), enter specific data that describes the Phase
   * (PM)features of a signal impressed on a Pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPValuePM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEGREES.class)
  private TDecimal mopValuePM;
  /**
   * StatisticalIndicator (US), indicate how this specific data observation was
   * collected (e.g., 95% of the observed values). If this element is empty,
   * then the value is assumed to be part of the 100% sample.
   */
  @XmlElement(name = "StatisticalIndicator", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_PERCENT3.class)
  private TDecimal statisticalIndicator;

  /**
   * Get US:MOPValueAM (US), enter specific data that describes the Amplitude
   * (AM) features of a signal impressed on a Pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPValueAM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPValueAM() {
    return mopValueAM;
  }

  /**
   * Set US:MOPValueAM (US), enter specific data that describes the Amplitude
   * (AM) features of a signal impressed on a Pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPValueAM value in a {@link TDecimal} data type
   */
  public void setMOPValueAM(TDecimal value) {
    this.mopValueAM = value;
  }

  /**
   * Determine if the MOPValueAM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueAM() {
    return (this.mopValueAM != null ? this.mopValueAM.isSetValue() : false);
  }

  /**
   * Get US:MOPValueCW (US), enter specific data that describes the Continuous
   * Wave (CW) features of a signal impressed on a Pulse. Use of this element
   * should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPValueCW value in a {@link TDecimal} data type
   */
  public TDecimal getMOPValueCW() {
    return mopValueCW;
  }

  /**
   * Set US:MOPValueCW (US), enter specific data that describes the Continuous
   * Wave (CW) features of a signal impressed on a Pulse. Use of this element
   * should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPValueCW value in a {@link TDecimal} data type
   */
  public void setMOPValueCW(TDecimal value) {
    this.mopValueCW = value;
  }

  /**
   * Determine if the MOPValueCW is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueCW() {
    return (this.mopValueCW != null ? this.mopValueCW.isSetValue() : false);
  }

  /**
   * Get US:MOPValueFM (US), enter specific data that describes the Frequency
   * (FM) features of a signal impressed on a Pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPValueFM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPValueFM() {
    return mopValueFM;
  }

  /**
   * Set US:MOPValueFM (US), enter specific data that describes the Frequency
   * (FM) features of a signal impressed on a Pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPValueFM value in a {@link TDecimal} data type
   */
  public void setMOPValueFM(TDecimal value) {
    this.mopValueFM = value;
  }

  /**
   * Determine if the MOPValueFM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueFM() {
    return (this.mopValueFM != null ? this.mopValueFM.isSetValue() : false);
  }

  /**
   * Get US:MOPValuePM (US), enter specific data that describes the Phase
   * (PM)features of a signal impressed on a Pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPValuePM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPValuePM() {
    return mopValuePM;
  }

  /**
   * Set US:MOPValuePM (US), enter specific data that describes the Phase
   * (PM)features of a signal impressed on a Pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPValuePM value in a {@link TDecimal} data type
   */
  public void setMOPValuePM(TDecimal value) {
    this.mopValuePM = value;
  }

  /**
   * Determine if the MOPValuePM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValuePM() {
    return (this.mopValuePM != null ? this.mopValuePM.isSetValue() : false);
  }

  /**
   * Get StatisticalIndicator (US), indicate how this specific data observation
   * was collected (e.g., 95% of the observed values). If this element is empty,
   * then the value is assumed to be part of the 100% sample.
   * <p>
   * @return the StatisticalIndicator value in a {@link TDecimal} data type
   */
  public TDecimal getStatisticalIndicator() {
    return statisticalIndicator;
  }

  /**
   * Set StatisticalIndicator (US), indicate how this specific data observation
   * was collected (e.g., 95% of the observed values). If this element is empty,
   * then the value is assumed to be part of the 100% sample.
   * <p>
   * @param value the StatisticalIndicator value in a {@link TDecimal} data type
   */
  public void setStatisticalIndicator(TDecimal value) {
    this.statisticalIndicator = value;
  }

  /**
   * Determine if the StatisticalIndicator is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStatisticalIndicator() {
    return (this.statisticalIndicator != null ? this.statisticalIndicator.isSetValue() : false);
  }

  /**
   * Set US:MOPValueAM (US), enter specific data that describes the Amplitude
   * (AM) features of a signal impressed on a Pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPValues object instance
   */
  public ObservedMOPValues withMOPValueAM(Double value) {
    setMOPValueAM(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPValueCW (US), enter specific data that describes the Continuous
   * Wave (CW) features of a signal impressed on a Pulse. Use of this element
   * should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPValues object instance
   */
  public ObservedMOPValues withMOPValueCW(Double value) {
    setMOPValueCW(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPValueFM (US), enter specific data that describes the Frequency
   * (FM) features of a signal impressed on a Pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPValues object instance
   */
  public ObservedMOPValues withMOPValueFM(Double value) {
    setMOPValueFM(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPValuePM (US), enter specific data that describes the Phase
   * (PM)features of a signal impressed on a Pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPValues object instance
   */
  public ObservedMOPValues withMOPValuePM(Double value) {
    setMOPValuePM(new TDecimal(value));
    return this;
  }

  /**
   * Set StatisticalIndicator (US), indicate how this specific data observation
   * was collected (e.g., 95% of the observed values). If this element is empty,
   * then the value is assumed to be part of the 100% sample.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPValues object instance
   */
  public ObservedMOPValues withStatisticalIndicator(Double value) {
    setStatisticalIndicator(new TDecimal(value));
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
    return "ObservedMOPValues {"
      + (statisticalIndicator != null ? " statisticalIndicator [" + statisticalIndicator + "]" : "")
      + (mopValueAM != null ? " mopValueAM [" + mopValueAM + "]" : "")
      + (mopValuePM != null ? " mopValuePM [" + mopValuePM + "]" : "")
      + (mopValueFM != null ? " mopValueFM [" + mopValueFM + "]" : "")
      + (mopValueCW != null ? " mopValueCW [" + mopValueCW + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedMOPValues} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
