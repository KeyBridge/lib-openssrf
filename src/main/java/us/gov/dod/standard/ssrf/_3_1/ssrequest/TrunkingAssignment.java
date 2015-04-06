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

import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;

/**
 * TrunkingAssignment (US) refers to the Agency Serial Number of the existing
 * assignment to be relinquished or used in the trunked land mobile system.
 * <p>
 * Element of {@link Trunking}
 * <p>
 * Example:
 * <pre>
 * &lt;TrunkingAssignment&gt;
 *   &lt;AgencySerialNum  cls="U"&gt;USA::AL:123&lt;/AgencySerialNum &gt;
 *   &lt;FreqMax  cls="U"&gt;3350&lt;/FreqMax &gt;
 *   &lt;FreqMin  cls="U"&gt;3150&lt;/FreqMin &gt;
 *   &lt;IsRelinquished  cls="U"&gt;Yes&lt;/IsRelinquished &gt;
 *   &lt;RelinquishmentDate  cls="U"&gt;2014-01-23&lt;/RelinquishmentDate &gt;
 * &lt;/TrunkingAssignment&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrunkingAssignment", propOrder = {
  "isRelinquished",
  "agencySerialNum",
  "freqMax",
  "freqMin",
  "relinquishmentDate"
})
public class TrunkingAssignment {

  /**
   * US:IsRelinquished - Is Relinquished (Required)    * <p>
   * The Yes if this is an existing assignment to be relinquished by the trunked
   * land mobile system. If No, the existing assignment will be used by
   * (incorporated into) the system.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "IsRelinquished", required = true)
  private TString isRelinquished;
  /**
   * US:AgencySerialNum - Agency Serial Number (Optional)    * <p>
   * The externally-assigned unique identifier of a frequency assignment.
   * <p>
   * Format is S12
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AgencySerialNum", required = false)
  private S12 agencySerialNum;
  /**
   * US:FreqMax - Frequency Maximum (Optional)    * <p>
   * The upper frequency of band.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMax", required = false)
  private FreqM freqMax;
  /**
   * US:FreqMin - Frequency Minimum (Optional)    * <p>
   * The lower frequency of band or discrete frequency.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMin", required = false)
  private FreqM freqMin;
  /**
   * US:RelinquishmentDate - Relinquishment Date (Optional)    * <p>
   * The expected date the existing assignment will be relinquished by the
   * trunked land mobile system.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RelinquishmentDate", required = false)
  private D relinquishmentDate;

  /**
   * Get the Yes if this is an existing assignment to be relinquished by the
   * trunked land mobile system. If No, the existing assignment will be used by
   * (incorporated into) the system..
   * <p>
   * @return the IsRelinquished value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getIsRelinquished() {
    return isRelinquished;
  }

  /**
   * Set the Yes if this is an existing assignment to be relinquished by the
   * trunked land mobile system. If No, the existing assignment will be used by
   * (incorporated into) the system..
   * <p>
   * @param value the IsRelinquished value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setIsRelinquished(TString value) {
    this.isRelinquished = value;
  }

  /**
   * Determine if the IsRelinquished is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIsRelinquished() {
    return (this.isRelinquished != null ? this.isRelinquished.isSetValue() : false);
  }

  /**
   * Get the externally-assigned unique identifier of a frequency assignment..
   * <p>
   * @return a {@link S12} instance
   * @since 3.1.0
   */
  public S12 getAgencySerialNum() {
    return agencySerialNum;
  }

  /**
   * Set the externally-assigned unique identifier of a frequency assignment..
   * <p>
   * @param value a {@link S12} instance
   * @since 3.1.0
   */
  public void setAgencySerialNum(S12 value) {
    this.agencySerialNum = value;
  }

  /**
   * Determine if the AgencySerialNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAgencySerialNum() {
    return (this.agencySerialNum != null ? this.agencySerialNum.isSetValue() : false);
  }

  /**
   * Get the upper frequency of band.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than
   * US:FreqMin..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMax() {
    return freqMax;
  }

  /**
   * Set the upper frequency of band.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than
   * US:FreqMin..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMax(FreqM value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get the lower frequency of band or discrete frequency..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMin() {
    return freqMin;
  }

  /**
   * Set the lower frequency of band or discrete frequency..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMin(FreqM value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get the expected date the existing assignment will be relinquished by the
   * trunked land mobile system..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getRelinquishmentDate() {
    return relinquishmentDate;
  }

  /**
   * Set the expected date the existing assignment will be relinquished by the
   * trunked land mobile system..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setRelinquishmentDate(D value) {
    this.relinquishmentDate = value;
  }

  /**
   * Determine if the RelinquishmentDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRelinquishmentDate() {
    return (this.relinquishmentDate != null ? this.relinquishmentDate.isSetValue() : false);
  }

  /**
   * Set the Yes if this is an existing assignment to be relinquished by the
   * trunked land mobile system. If No, the existing assignment will be used by
   * (incorporated into) the system.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current TrunkingAssignment object instance.
   * @since 3.1.0
   */
  public TrunkingAssignment withIsRelinquished(ListCBO value) {
    setIsRelinquished(new TString(value.value()));
    return this;
  }

  /**
   * Set the externally-assigned unique identifier of a frequency assignment.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current TrunkingAssignment object instance.
   * @since 3.1.0
   */
  public TrunkingAssignment withAgencySerialNum(String value) {
    setAgencySerialNum(new S12(value));
    return this;
  }

  /**
   * Set the upper frequency of band.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TrunkingAssignment object instance.
   * @since 3.1.0
   */
  public TrunkingAssignment withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the lower frequency of band or discrete frequency.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TrunkingAssignment object instance.
   * @since 3.1.0
   */
  public TrunkingAssignment withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the expected date the existing assignment will be relinquished by the
   * trunked land mobile system.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current TrunkingAssignment object instance.
   * @since 3.1.0
   */
  public TrunkingAssignment withRelinquishmentDate(Calendar value) {
    setRelinquishmentDate(new D(value));
    return this;
  }

  /**
   * Set the expected date the existing assignment will be relinquished by the
   * trunked land mobile system.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current TrunkingAssignment object instance.
   * @since 3.1.0
   */
  public TrunkingAssignment withRelinquishmentDate(Date value) {
    setRelinquishmentDate(new D(value));
    return this;
  }

  /**
   * Get a string representation of this TrunkingAssignment instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TrunkingAssignment {"
           + (agencySerialNum != null ? " agencySerialNum [" + agencySerialNum + "]" : "")
           + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
           + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
           + (isRelinquished != null ? " isRelinquished [" + isRelinquished + "]" : "")
           + (relinquishmentDate != null ? " relinquishmentDate [" + relinquishmentDate + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TrunkingAssignment} requires {@link TString IsRelinquished}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetIsRelinquished();
  }

}
