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
package us.gov.dod.standard.ssrf._3_1.ssrequest;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.SSRequest;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCTI;

/**
 * Time indicates when the equipment or system will be used.
 * <p>
 * Element of {@link SSRequest}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Time", propOrder = {
  "period",
  "usageDescription"
})
public class Time {

  /**
   * Period - Period (Optional)
   * <p>
   * The period of usage.
   * <p>
   * Format is L:CTI
   */
  @XmlElement(name = "Period", required = false)
  private TString period;
  @XmlElement(name = "UsageDescription ", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString usageDescription;

  /**
   * Get the period of usage.
   * <p>
   * @return the Period value in a {@link TString} data type
   */
  public TString getPeriod() {
    return period;
  }

  /**
   * Set the period of usage.
   * <p>
   * @param value the Period value in a {@link TString} data type
   */
  public void setPeriod(TString value) {
    this.period = value;
  }

  /**
   * Determine if the Period is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPeriod() {
    return (this.period != null ? this.period.isSetValue() : false);
  }

  /**
   * Get a description of the total amount of time a system/equipment is
   * expected to be in operation.
   * <p>
   * @return the UsageDescription value in a {@link TString} data type
   */
  public TString getUsageDescription() {
    return usageDescription;
  }

  /**
   * Set a description of the total amount of time a system/equipment is
   * expected to be in operation.
   * <p>
   * @param value the UsageDescription value in a {@link TString} data type
   */
  public void setUsageDescription(TString value) {
    this.usageDescription = value;
  }

  /**
   * Determine if the UsageDescription is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUsageDescription() {
    return (this.usageDescription != null ? this.usageDescription.isSetValue() : false);
  }

  /**
   * Set the period of usage.
   * <p>
   * @param value An instances of type {@link ListCTI}
   * @return The current Time object instance
   */
  public Time withPeriod(ListCTI value) {
    setPeriod(new TString(value.value()));
    return this;
  }

  /**
   * Set a description of the total amount of time a system/equipment is
   * expected to be in operation.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Time object instance
   */
  public Time withUsageDescription(String value) {
    setUsageDescription(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this Time instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Time {"
      + (period != null ? " period [" + period + "]" : "")
      + (usageDescription != null ? " usageDescription [" + usageDescription + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Time} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
