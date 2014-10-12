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
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * ObservedRFValues (US) contains details of actual RF observations.
 * <p>
 * Element of {@link ObservedRFAnalysis}
 * <p>
 * Example: See {@link ObservedRFAnalysis}.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "RFValue", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal rfValue;
  /**
   * StatisticalIndicator (US), indicate how this specific data observation was
   * collected (e.g., 95% of the observed values). If this element is empty,
   * then the value is assumed to be part of the 100% sample.
   */
  @XmlElement(name = "StatisticalIndicator", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_PERCENT3.class)
  private TDecimal statisticalIndicator;

  /**
   * Get the observed signals values
   * <p>
   * @return the RFValue value in a {@link TDecimal} data type
   */
  public TDecimal getRFValue() {
    return rfValue;
  }

  /**
   * Set the observed signals values
   * <p>
   * @param value the RFValue value in a {@link TDecimal} data type
   */
  public void setRFValue(TDecimal value) {
    this.rfValue = value;
  }

  /**
   * Determine if the RFValue is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFValue() {
    return (this.rfValue != null ? this.rfValue.isSetValue() : false);
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
   * Set the observed signals values
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFValues object instance
   */
  public ObservedRFValues withRFValue(Double value) {
    setRFValue(new TDecimal(value));
    return this;
  }

  /**
   * Set StatisticalIndicator (US), indicate how this specific data observation
   * was collected (e.g., 95% of the observed values). If this element is empty,
   * then the value is assumed to be part of the 100% sample.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFValues object instance
   */
  public ObservedRFValues withStatisticalIndicator(Double value) {
    setStatisticalIndicator(new TDecimal(value));
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
    return "ObservedRFValues {"
      + (statisticalIndicator != null ? " statisticalIndicator [" + statisticalIndicator + "]" : "")
      + (rfValue != null ? " rfValue [" + rfValue + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedRFValues} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
