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
package us.gov.dod.standard.ssrf._3_1.ssrequest;

import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
   * US:IsRelinquished - Is Relinquished (Required)
   * <p>
   * The Yes if this is an existing assignment to be relinquished by the trunked
   * land mobile system. If No, the existing assignment will be used by
   * (incorporated into) the system.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "IsRelinquished", required = true)
  private TString isRelinquished;
  /**
   * US:AgencySerialNum - Agency Serial Number (Optional)
   * <p>
   * The externally-assigned unique identifier of a frequency assignment.
   * <p>
   * Format is S12
   */
  @XmlElement(name = "AgencySerialNum", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS12.class)
  private TString agencySerialNum;
  /**
   * US:FreqMax - Frequency Maximum (Optional)
   * <p>
   * The upper frequency of band.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * US:FreqMin - Frequency Minimum (Optional)
   * <p>
   * The lower frequency of band or discrete frequency.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * US:RelinquishmentDate - Relinquishment Date (Optional)
   * <p>
   * The expected date the existing assignment will be relinquished by the
   * trunked land mobile system.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "RelinquishmentDate", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar relinquishmentDate;

  /**
   * Get the Yes if this is an existing assignment to be relinquished by the
   * trunked land mobile system. If No, the existing assignment will be used by
   * (incorporated into) the system.
   * <p>
   * @return the IsRelinquished value in a {@link TString} data type
   */
  public TString getIsRelinquished() {
    return isRelinquished;
  }

  /**
   * Set the Yes if this is an existing assignment to be relinquished by the
   * trunked land mobile system. If No, the existing assignment will be used by
   * (incorporated into) the system.
   * <p>
   * @param value the IsRelinquished value in a {@link TString} data type
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
   * Get the externally-assigned unique identifier of a frequency assignment.
   * <p>
   * @return the AgencySerialNum value in a {@link TString} data type
   */
  public TString getAgencySerialNum() {
    return agencySerialNum;
  }

  /**
   * Set the externally-assigned unique identifier of a frequency assignment.
   * <p>
   * @param value the AgencySerialNum value in a {@link TString} data type
   */
  public void setAgencySerialNum(TString value) {
    this.agencySerialNum = value;
  }

  /**
   * Determine if the AgencySerialNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAgencySerialNum() {
    return (this.agencySerialNum != null ? this.agencySerialNum.isSetValue() : false);
  }

  /**
   * Get the upper frequency of band.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @return the FreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Set the upper frequency of band.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @param value the FreqMax value in a {@link TDecimal} data type
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get the lower frequency of band or discrete frequency.
   * <p>
   * @return the FreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Set the lower frequency of band or discrete frequency.
   * <p>
   * @param value the FreqMin value in a {@link TDecimal} data type
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get the expected date the existing assignment will be relinquished by the
   * trunked land mobile system.
   * <p>
   * @return the RelinquishmentDate value in a {@link TCalendar} data type
   */
  public TCalendar getRelinquishmentDate() {
    return relinquishmentDate;
  }

  /**
   * Set the expected date the existing assignment will be relinquished by the
   * trunked land mobile system.
   * <p>
   * @param value the RelinquishmentDate value in a {@link TCalendar} data type
   */
  public void setRelinquishmentDate(TCalendar value) {
    this.relinquishmentDate = value;
  }

  /**
   * Determine if the RelinquishmentDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
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
   * @param value An instances of type {@link ListCBO}
   * @return The current TrunkingAssignment object instance
   */
  public TrunkingAssignment withIsRelinquished(ListCBO value) {
    setIsRelinquished(new TString(value.value()));
    return this;
  }

  /**
   * Set the externally-assigned unique identifier of a frequency assignment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TrunkingAssignment object instance
   */
  public TrunkingAssignment withAgencySerialNum(String value) {
    setAgencySerialNum(new TString(value));
    return this;
  }

  /**
   * Set the upper frequency of band.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TrunkingAssignment object instance
   */
  public TrunkingAssignment withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the lower frequency of band or discrete frequency.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TrunkingAssignment object instance
   */
  public TrunkingAssignment withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the expected date the existing assignment will be relinquished by the
   * trunked land mobile system.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current TrunkingAssignment object instance
   */
  public TrunkingAssignment withRelinquishmentDate(Calendar value) {
    setRelinquishmentDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the expected date the existing assignment will be relinquished by the
   * trunked land mobile system.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current TrunkingAssignment object instance
   */
  public TrunkingAssignment withRelinquishmentDate(Date value) {
    setRelinquishmentDate(new TCalendar(value));
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
      + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
      + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
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
