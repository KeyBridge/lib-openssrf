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
package us.gov.dod.standard.ssrf._3_1.ssrequest;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.SSRequest;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCTI;

/**
 * Time indicates when the equipment or system will be used.
 * <p>
 * Element of {@link SSRequest}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Time", propOrder = {
  "period",
  "usageDescription"
})
public class Time {

  /**
   * Period - Period (Optional)    * <p>
   * The period of usage.
   * <p>
   * Format is L:CTI
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Period", required = false)
  private TString period;
  @XmlElement(name = "UsageDescription", required = false)
  private MEMO usageDescription;

  /**
   * Get the period of usage..
   * <p>
   * @return the Period value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPeriod() {
    return period;
  }

  /**
   * Set the period of usage..
   * <p>
   * @param value the Period value in a {@link TString} data type
   * @since 3.1.0
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
   * expected to be in operation..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getUsageDescription() {
    return usageDescription;
  }

  /**
   * Set a description of the total amount of time a system/equipment is
   * expected to be in operation..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setUsageDescription(MEMO value) {
    this.usageDescription = value;
  }

  /**
   * Determine if the UsageDescription is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUsageDescription() {
    return (this.usageDescription != null ? this.usageDescription.isSetValue() : false);
  }

  /**
   * Set the period of usage.
   * <p>
   * @param value An instances of type {@link ListCTI}.
   * @return The current Time object instance.
   * @since 3.1.0
   */
  public Time withPeriod(ListCTI value) {
    setPeriod(new TString(value.value()));
    return this;
  }

  /**
   * Set a description of the total amount of time a system/equipment is
   * expected to be in operation.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Time object instance.
   * @since 3.1.0
   */
  public Time withUsageDescription(String value) {
    setUsageDescription(new MEMO(value));
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
           + (period != null ? "\n period [" + period + "]" : "")
           + (usageDescription != null ? "\n usageDescription [" + usageDescription + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Time} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
