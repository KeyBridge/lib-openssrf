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
package us.gov.dod.standard.ssrf._3_1.multiple;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * ObservedERPValues (US) contains specific data artifacts that describe the
 * Effective Radiated Power (ERP) associated with an emitter or Notation.
 * <p>
 * Element of {@link ObservedERPAnalysis}
 * <p>
 * Example: See {@link ObservedERPAnalysis}.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedERPValues", propOrder = {
  "erpDwell",
  "erpValue",
  "statisticalIndicator"
})
public class ObservedERPValues {

  /**
   * US:ERPDwell - ERP Dwell (Optional)
   * <p>
   * The time duration for a complete dwell/group of pulses which all have the
   * same discrete ERP value, or for a continuous wave at a constant ERP value.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "ERPDwell", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal erpDwell;
  /**
   * US:ERPValue - Observed ERP Value (Required)
   * <p>
   * The ERP values that represent 95% of the signal observed ERP values for
   * each discrete ERP value which were obtained from a statistical study of a
   * data set.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "ERPValue", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal erpValue;
  /**
   * StatisticalIndicator (US), indicate how this specific data observation was
   * used (e.g., 95% of the observed values). If this element is empty, then the
   * value is assumed to be part of the 100% sample size.
   */
  @XmlElement(name = "StatisticalIndicator", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_PERCENT3.class)
  private TDecimal statisticalIndicator;

  /**
   * Get the time duration for a complete dwell/group of pulses which all have
   * the same discrete ERP value, or for a continuous wave at a constant ERP
   * value.
   * <p>
   * @return the ERPDwell value in a {@link TDecimal} data type
   */
  public TDecimal getERPDwell() {
    return erpDwell;
  }

  /**
   * Set the time duration for a complete dwell/group of pulses which all have
   * the same discrete ERP value, or for a continuous wave at a constant ERP
   * value.
   * <p>
   * @param value the ERPDwell value in a {@link TDecimal} data type
   */
  public void setERPDwell(TDecimal value) {
    this.erpDwell = value;
  }

  /**
   * Determine if the ERPDwell is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPDwell() {
    return (this.erpDwell != null ? this.erpDwell.isSetValue() : false);
  }

  /**
   * Get the ERP values that represent 95% of the signal observed ERP values for
   * each discrete ERP value which were obtained from a statistical study of a
   * data set.
   * <p>
   * @return the ERPValue value in a {@link TDecimal} data type
   */
  public TDecimal getERPValue() {
    return erpValue;
  }

  /**
   * Set the ERP values that represent 95% of the signal observed ERP values for
   * each discrete ERP value which were obtained from a statistical study of a
   * data set.
   * <p>
   * @param value the ERPValue value in a {@link TDecimal} data type
   */
  public void setERPValue(TDecimal value) {
    this.erpValue = value;
  }

  /**
   * Determine if the ERPValue is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPValue() {
    return (this.erpValue != null ? this.erpValue.isSetValue() : false);
  }

  /**
   * Get StatisticalIndicator (US), indicate how this specific data observation
   * was used (e.g., 95% of the observed values). If this element is empty, then
   * the value is assumed to be part of the 100% sample size.
   * <p>
   * @return the StatisticalIndicator value in a {@link TDecimal} data type
   */
  public TDecimal getStatisticalIndicator() {
    return statisticalIndicator;
  }

  /**
   * Set StatisticalIndicator (US), indicate how this specific data observation
   * was used (e.g., 95% of the observed values). If this element is empty, then
   * the value is assumed to be part of the 100% sample size.
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
   * Set the time duration for a complete dwell/group of pulses which all have
   * the same discrete ERP value, or for a continuous wave at a constant ERP
   * value.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedERPValues object instance
   */
  public ObservedERPValues withERPDwell(Double value) {
    setERPDwell(new TDecimal(value));
    return this;
  }

  /**
   * Set the ERP values that represent 95% of the signal observed ERP values for
   * each discrete ERP value which were obtained from a statistical study of a
   * data set.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedERPValues object instance
   */
  public ObservedERPValues withERPValue(Double value) {
    setERPValue(new TDecimal(value));
    return this;
  }

  /**
   * Set StatisticalIndicator (US), indicate how this specific data observation
   * was used (e.g., 95% of the observed values). If this element is empty, then
   * the value is assumed to be part of the 100% sample size.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedERPValues object instance
   */
  public ObservedERPValues withStatisticalIndicator(Double value) {
    setStatisticalIndicator(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this ObservedERPValues instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ObservedERPValues {"
      + (erpValue != null ? " erpValue [" + erpValue + "]" : "")
      + (erpDwell != null ? " erpDwell [" + erpDwell + "]" : "")
      + (statisticalIndicator != null ? " statisticalIndicator [" + statisticalIndicator + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedERPValues} requires {@link TDecimal ERPValue}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetERPValue();
  }

}
