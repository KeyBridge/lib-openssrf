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

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * ObservedPulseValues (US) contains data describing the distinct Pulse values
 * related to the Modulation Type.
 * <p>
 * Element of {@link ObservedPulseAnalysis}
 * <p>
 * Example: See {@link ObservedPulseAnalysis}.
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedPulseValues", propOrder = {
  "observedPDValue",
  "observedPRFValue",
  "observedPRIValue",
  "statisticalIndicator"
})
public class ObservedPulseValues {

  /**
   * ObservedPDValue - Observed PD Value (Optional)
   * <p>
   * The observed PD data believed to be valid.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "ObservedPDValue", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal observedPDValue;
  /**
   * US:ObservedPRFValue - Observed PRF Value (Optional)
   * <p>
   * The observed PRF data believed to be valid.
   * <p>
   * Format is UN(7,2) (pps)
   */
  @XmlElement(name = "ObservedPRFValue", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_PPS.class)
  private TDecimal observedPRFValue;
  /**
   * US:ObservedPRIValue - Observed PRI Value (Optional)
   * <p>
   * The observed PRI data believed to be valid.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "ObservedPRIValue", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal observedPRIValue;
  /**
   * In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was collected (e.g., 95% of the observed values). If this
   * element is empty, then the value is assumed to be part of the 100% sample.
   */
  @XmlElement(name = "StatisticalIndicator", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_PERCENT3.class)
  private TDecimal statisticalIndicator;

  /**
   * Get the observed PD data believed to be valid.
   * <p>
   * @return the ObservedPDValue value in a {@link TDecimal} data type
   */
  public TDecimal getObservedPDValue() {
    return observedPDValue;
  }

  /**
   * Set the observed PD data believed to be valid.
   * <p>
   * @param value the ObservedPDValue value in a {@link TDecimal} data type
   */
  public void setObservedPDValue(TDecimal value) {
    this.observedPDValue = value;
  }

  /**
   * Determine if the ObservedPDValue is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedPDValue() {
    return (this.observedPDValue != null ? this.observedPDValue.isSetValue() : false);
  }

  /**
   * Get the observed PRF data believed to be valid.
   * <p>
   * @return the ObservedPRFValue value in a {@link TDecimal} data type
   */
  public TDecimal getObservedPRFValue() {
    return observedPRFValue;
  }

  /**
   * Set the observed PRF data believed to be valid.
   * <p>
   * @param value the ObservedPRFValue value in a {@link TDecimal} data type
   */
  public void setObservedPRFValue(TDecimal value) {
    this.observedPRFValue = value;
  }

  /**
   * Determine if the ObservedPRFValue is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedPRFValue() {
    return (this.observedPRFValue != null ? this.observedPRFValue.isSetValue() : false);
  }

  /**
   * Get the observed PRI data believed to be valid.
   * <p>
   * @return the ObservedPRIValue value in a {@link TDecimal} data type
   */
  public TDecimal getObservedPRIValue() {
    return observedPRIValue;
  }

  /**
   * Set the observed PRI data believed to be valid.
   * <p>
   * @param value the ObservedPRIValue value in a {@link TDecimal} data type
   */
  public void setObservedPRIValue(TDecimal value) {
    this.observedPRIValue = value;
  }

  /**
   * Determine if the ObservedPRIValue is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedPRIValue() {
    return (this.observedPRIValue != null ? this.observedPRIValue.isSetValue() : false);
  }

  /**
   * Get In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was collected (e.g., 95% of the observed values). If this
   * element is empty, then the value is assumed to be part of the 100% sample.
   * <p>
   * @return the StatisticalIndicator value in a {@link TDecimal} data type
   */
  public TDecimal getStatisticalIndicator() {
    return statisticalIndicator;
  }

  /**
   * Set In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was collected (e.g., 95% of the observed values). If this
   * element is empty, then the value is assumed to be part of the 100% sample.
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
   * Set the observed PD data believed to be valid.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseValues object instance
   */
  public ObservedPulseValues withObservedPDValue(Double value) {
    setObservedPDValue(new TDecimal(value));
    return this;
  }

  /**
   * Set the observed PRF data believed to be valid.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseValues object instance
   */
  public ObservedPulseValues withObservedPRFValue(Double value) {
    setObservedPRFValue(new TDecimal(value));
    return this;
  }

  /**
   * Set the observed PRI data believed to be valid.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseValues object instance
   */
  public ObservedPulseValues withObservedPRIValue(Double value) {
    setObservedPRIValue(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was collected (e.g., 95% of the observed values). If this
   * element is empty, then the value is assumed to be part of the 100% sample.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseValues object instance
   */
  public ObservedPulseValues withStatisticalIndicator(Double value) {
    setStatisticalIndicator(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this ObservedPulseValues instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ObservedPulseValues {"
      + " observedPRFValue [" + observedPRFValue + "]"
      + " statisticalIndicator [" + statisticalIndicator + "]"
      + " observedPDValue [" + observedPDValue + "]"
      + " observedPRIValue [" + observedPRIValue + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedPulseValues} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
