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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was used (e.g., 95% of the observed values). If this element is
   * empty, then the value is assumed to be part of the 100% sample size.
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
   * Get In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was used (e.g., 95% of the observed values). If this element is
   * empty, then the value is assumed to be part of the 100% sample size.
   * <p>
   * @return the StatisticalIndicator value in a {@link TDecimal} data type
   */
  public TDecimal getStatisticalIndicator() {
    return statisticalIndicator;
  }

  /**
   * Set In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was used (e.g., 95% of the observed values). If this element is
   * empty, then the value is assumed to be part of the 100% sample size.
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
   * Set In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was used (e.g., 95% of the observed values). If this element is
   * empty, then the value is assumed to be part of the 100% sample size.
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
      + " erpValue [" + erpValue + "]"
      + " erpDwell [" + erpDwell + "]"
      + " statisticalIndicator [" + statisticalIndicator + "]"
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
