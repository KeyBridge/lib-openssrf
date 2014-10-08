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
package us.gov.dod.standard.ssrf._3_1.antenna;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * ObservedPolarisationValues (US) contains data describing the parametric
 * information for the polarization tilt angle specific values.
 * <p>
 * Element of {@link ObservedPolarisationAnalysis}
 * <p>
 * Example: See {@link ObservedPolarisationAnalysis}.
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedPolarisationValues", propOrder = {
  "statisticalIndicator",
  "tiltAngleValue"
})
public class ObservedPolarisationValues {

  /**
   * StatisticalIndicator (US), indicate how this specific data observation was
   * collected (e.g., 95% of the observed values). If this element is empty,
   * then the value is assumed to be part of the 100% sample.
   */
  @XmlElement(name = "StatisticalIndicator", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_PERCENT3.class)
  private TDecimal statisticalIndicator;
  /**
   * US:TiltAngleValue - Tilt Angle Value (Optional)
   * <p>
   * The observed Tilt Angle which provided the base data set used for
   * statistical study.
   * <p>
   * Format is SN(5,2) (deg)
   */
  @XmlElement(name = "TiltAngleValue", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_DEG_SIGNED.class)
  private TDecimal tiltAngleValue;

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
   * Get the observed Tilt Angle which provided the base data set used for
   * statistical study.
   * <p>
   * @return the TiltAngleValue value in a {@link TDecimal} data type
   */
  public TDecimal getTiltAngleValue() {
    return tiltAngleValue;
  }

  /**
   * Set the observed Tilt Angle which provided the base data set used for
   * statistical study.
   * <p>
   * @param value the TiltAngleValue value in a {@link TDecimal} data type
   */
  public void setTiltAngleValue(TDecimal value) {
    this.tiltAngleValue = value;
  }

  /**
   * Determine if the TiltAngleValue is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleValue() {
    return (this.tiltAngleValue != null ? this.tiltAngleValue.isSetValue() : false);
  }

  /**
   * Set StatisticalIndicator (US), indicate how this specific data observation
   * was collected (e.g., 95% of the observed values). If this element is empty,
   * then the value is assumed to be part of the 100% sample.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPolarisationValues object instance
   */
  public ObservedPolarisationValues withStatisticalIndicator(Double value) {
    setStatisticalIndicator(new TDecimal(value));
    return this;
  }

  /**
   * Set the observed Tilt Angle which provided the base data set used for
   * statistical study.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPolarisationValues object instance
   */
  public ObservedPolarisationValues withTiltAngleValue(Double value) {
    setTiltAngleValue(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this ObservedPolarisationValues instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ObservedPolarisationValues {"
      + (statisticalIndicator != null ? " statisticalIndicator [" + statisticalIndicator + "]" : "")
      + (tiltAngleValue != null ? " tiltAngleValue [" + tiltAngleValue + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedPolarisationValues} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
