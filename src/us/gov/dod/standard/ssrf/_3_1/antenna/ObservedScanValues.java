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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * ObservedScanValues (US) contains data describing the discrete scan rate
 * values and supporting statistical information.
 * <p>
 * Element of {@link ObservedScanAnalysis}
 * <p>
 * Example: See {@link ObservedScanAnalysis}.
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedScanValues", propOrder = {
  "scanValue",
  "statisticalIndicator"
})
public class ObservedScanValues {

  /**
   * US:ScanValue - Observed Scan Values (Optional)
   * <p>
   * The observed scan rate values
   * <p>
   * Format is UN(6,2) (deg/sec)
   */
  @XmlElement(name = "ScanValue", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_SCANSPEED.class)
  private TDecimal scanValue;
  /**
   * In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was used (e.g., 95% of the observed values). If this element is
   * empty, then the value is assumed to be part of the 100% sample size.
   */
  @XmlElement(name = "StatisticalIndicator", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterPERCENT.class)
  private TDecimal statisticalIndicator;

  /**
   * Get the observed scan rate values
   * <p>
   * @return the ScanValue value in a {@link TDecimal} data type
   */
  public TDecimal getScanValue() {
    return scanValue;
  }

  /**
   * Set the observed scan rate values
   * <p>
   * @param value the ScanValue value in a {@link TDecimal} data type
   */
  public void setScanValue(TDecimal value) {
    this.scanValue = value;
  }

  /**
   * Determine if the ScanValue is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetScanValue() {
    return (this.scanValue != null ? this.scanValue.isSetValue() : false);
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
   * Set the observed scan rate values
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanValues object instance
   */
  public ObservedScanValues withScanValue(Double value) {
    setScanValue(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was used (e.g., 95% of the observed values). If this element is
   * empty, then the value is assumed to be part of the 100% sample size.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanValues object instance
   */
  public ObservedScanValues withStatisticalIndicator(Double value) {
    setStatisticalIndicator(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this ObservedScanValues instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ObservedScanValues {"
      + " statisticalIndicator [" + statisticalIndicator + "]"
      + " scanValue [" + scanValue + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedScanValues} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
