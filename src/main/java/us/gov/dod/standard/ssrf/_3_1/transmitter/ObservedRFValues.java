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
import us.gov.dod.standard.ssrf._3_1.metadata.domains.US_Percent3;

/**
 * ObservedRFValues (US) contains details of actual RF observations.
 * <p>
 * Element of {@link ObservedRFAnalysis}
 * <p>
 * Example: See {@link ObservedRFAnalysis}.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedRFValues", propOrder = {
  "rfValue",
  "statisticalIndicator"
})
public class ObservedRFValues {

  /**
   * US:RFValue - RF Value (Optional)
   * <p>
   * The observed signals values
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFValue", required = false)
  private FreqM rfValue;
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
   * Get the observed signals values.
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getRFValue() {
    return rfValue;
  }

  /**
   * Set the observed signals values.
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setRFValue(FreqM value) {
    this.rfValue = value;
  }

  /**
   * Determine if the RFValue is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFValue() {
    return (this.rfValue != null ? this.rfValue.isSetValue() : false);
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
   * Set the observed signals values
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFValues object instance.
   * @since 3.1.0
   */
  public ObservedRFValues withRFValue(Double value) {
    setRFValue(new FreqM(value));
    return this;
  }

  /**
   * Set In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was collected (e.g., 95% of the observed values). If this
   * element is empty, then the value is assumed to be part of the 100% sample.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFValues object instance.
   * @since 3.1.0
   */
  public ObservedRFValues withStatisticalIndicator(Double value) {
    setStatisticalIndicator(new US_Percent3(value));
    return this;
  }

  /**
   * Get a string representation of this ObservedRFValues instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  ObservedRFValues {"
           + (rfValue != null ? " rfValue [" + rfValue + "]" : "")
           + (statisticalIndicator != null ? " statisticalIndicator [" + statisticalIndicator + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedRFValues} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
