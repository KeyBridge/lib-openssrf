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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
