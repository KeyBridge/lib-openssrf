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
package us.gov.dod.standard.ssrf._3_1.assignment;

import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * NarrowBandPlanning (US) describes a reduced bandwidth assignment for a single
 * frequency or a range of frequencies.
 * <p>
 * Element of {@link Freq}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NarrowBandPlanning", propOrder = {
  "changeDate",
  "nbFreq"
})
public class NarrowBandPlanning {

  /**
   * US:ChangeDate - Change Date (Optional)    * <p>
   * The date this record is expected to be updated to comply with narrow band
   * transition plans.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ChangeDate", required = false)
  private D changeDate;
  /**
   * US:NBFreq - Narrow Band Frequency (Optional)    * <p>
   * The transition frequency to comply with narrow band transition plans.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NBFreq", required = false)
  private FreqM nbFreq;

  /**
   * Get the date this record is expected to be updated to comply with narrow
   * band transition plans..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getChangeDate() {
    return changeDate;
  }

  /**
   * Set the date this record is expected to be updated to comply with narrow
   * band transition plans..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setChangeDate(D value) {
    this.changeDate = value;
  }

  /**
   * Determine if the ChangeDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChangeDate() {
    return (this.changeDate != null ? this.changeDate.isSetValue() : false);
  }

  /**
   * Get the transition frequency to comply with narrow band transition plans..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getNBFreq() {
    return nbFreq;
  }

  /**
   * Set the transition frequency to comply with narrow band transition plans..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setNBFreq(FreqM value) {
    this.nbFreq = value;
  }

  /**
   * Determine if the NBFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNBFreq() {
    return (this.nbFreq != null ? this.nbFreq.isSetValue() : false);
  }

  /**
   * Set the date this record is expected to be updated to comply with narrow
   * band transition plans.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current NarrowBandPlanning object instance.
   * @since 3.1.0
   */
  public NarrowBandPlanning withChangeDate(Calendar value) {
    setChangeDate(new D(value));
    return this;
  }

  /**
   * Set the date this record is expected to be updated to comply with narrow
   * band transition plans.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current NarrowBandPlanning object instance.
   * @since 3.1.0
   */
  public NarrowBandPlanning withChangeDate(Date value) {
    setChangeDate(new D(value));
    return this;
  }

  /**
   * Set the transition frequency to comply with narrow band transition plans.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current NarrowBandPlanning object instance.
   * @since 3.1.0
   */
  public NarrowBandPlanning withNBFreq(Double value) {
    setNBFreq(new FreqM(value));
    return this;
  }

  /**
   * Get a string representation of this NarrowBandPlanning instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  NarrowBandPlanning {"
           + (changeDate != null ? " changeDate [" + changeDate + "]" : "")
           + (nbFreq != null ? " nbFreq [" + nbFreq + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link NarrowBandPlanning} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
