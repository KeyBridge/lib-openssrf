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
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * StatusLog (US) contains the transactional processing information related to
 * frequency assignments.
 * <p>
 * Element of {@link Assignment}, {@link SSRequest}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusLog", propOrder = {
  "dateTime",
  "state",
  "agencyCode",
  "comment",
  "pocRef"
})
public class StatusLog {

  /**
   * US:DateTime - DateTime (Required)    * <p>
   * The date and UTC time of this status log entry.
   * <p>
   * Format is DateTime
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DateTime", required = true)
  private DT dateTime;
  /**
   * US:State - State (Required)    * <p>
   * The action performed for this status log entry.
   * <p>
   * Format is L:UST
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "State", required = true)
  private S50 state;
  /**
   * US:AgencyCode - Agency Code (Optional)    * <p>
   * The agency responsible for this status log entry.
   * <p>
   * Format is S80
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AgencyCode", required = false)
  private S80 agencyCode;
  /**
   * US:Comment - Comment (Optional)    * <p>
   * Amplifying information to describe the Status of the Assignment.
   * <p>
   * Format is S255
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Comment", required = false)
  private S255 comment;
  /**
   * US:POCRef - Point Of Contact Reference (Optional)    * <p>
   * The reference to a Contact, Organisation, or Role responsible for this
   * status log entry or the recipient of the action.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "POCRef", required = false)
  private Serial pocRef;

  /**
   * Get the date and UTC time of this status log entry..
   * <p>
   * @return a {@link DT} instance
   * @since 3.1.0
   */
  public DT getDateTime() {
    return dateTime;
  }

  /**
   * Set the date and UTC time of this status log entry..
   * <p>
   * @param value a {@link DT} instance
   * @since 3.1.0
   */
  public void setDateTime(DT value) {
    this.dateTime = value;
  }

  /**
   * Determine if the DateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDateTime() {
    return (this.dateTime != null ? this.dateTime.isSetValue() : false);
  }

  /**
   * Get the action performed for this status log entry..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getState() {
    return state;
  }

  /**
   * Set the action performed for this status log entry..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setState(S50 value) {
    this.state = value;
  }

  /**
   * Determine if the State is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetState() {
    return (this.state != null ? this.state.isSetValue() : false);
  }

  /**
   * Get the agency responsible for this status log entry..
   * <p>
   * @return a {@link S80} instance
   * @since 3.1.0
   */
  public S80 getAgencyCode() {
    return agencyCode;
  }

  /**
   * Set the agency responsible for this status log entry..
   * <p>
   * @param value a {@link S80} instance
   * @since 3.1.0
   */
  public void setAgencyCode(S80 value) {
    this.agencyCode = value;
  }

  /**
   * Determine if the AgencyCode is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAgencyCode() {
    return (this.agencyCode != null ? this.agencyCode.isSetValue() : false);
  }

  /**
   * Get amplifying information to describe the Status of the Assignment..
   * <p>
   * @return a {@link S255} instance
   * @since 3.1.0
   */
  public S255 getComment() {
    return comment;
  }

  /**
   * Set amplifying information to describe the Status of the Assignment..
   * <p>
   * @param value a {@link S255} instance
   * @since 3.1.0
   */
  public void setComment(S255 value) {
    this.comment = value;
  }

  /**
   * Determine if the Comment is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetComment() {
    return (this.comment != null ? this.comment.isSetValue() : false);
  }

  /**
   * Get the reference to a Contact, Organisation, or Role responsible for this
   * status log entry or the recipient of the action..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   */
  public Serial getPOCRef() {
    return pocRef;
  }

  /**
   * Set the reference to a Contact, Organisation, or Role responsible for this
   * status log entry or the recipient of the action..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   */
  public void setPOCRef(Serial value) {
    this.pocRef = value;
  }

  /**
   * Determine if the POCRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPOCRef() {
    return (this.pocRef != null ? this.pocRef.isSetValue() : false);
  }

  /**
   * Set the date and UTC time of this status log entry.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current StatusLog object instance.
   * @since 3.1.0
   */
  public StatusLog withDateTime(Calendar value) {
    setDateTime(new DT(value));
    return this;
  }

  /**
   * Set the date and UTC time of this status log entry.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current StatusLog object instance.
   * @since 3.1.0
   */
  public StatusLog withDateTime(Date value) {
    setDateTime(new DT(value));
    return this;
  }

  /**
   * Set the action performed for this status log entry.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current StatusLog object instance.
   * @since 3.1.0
   */
  public StatusLog withState(String value) {
    setState(new S50(value));
    return this;
  }

  /**
   * Set the agency responsible for this status log entry.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current StatusLog object instance.
   * @since 3.1.0
   */
  public StatusLog withAgencyCode(String value) {
    setAgencyCode(new S80(value));
    return this;
  }

  /**
   * Set amplifying information to describe the Status of the Assignment.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current StatusLog object instance.
   * @since 3.1.0
   */
  public StatusLog withComment(String value) {
    setComment(new S255(value));
    return this;
  }

  /**
   * Set the reference to a Contact, Organisation, or Role responsible for this
   * status log entry or the recipient of the action.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current StatusLog object instance.
   * @since 3.1.0
   */
  public StatusLog withPOCRef(Serial value) {
    setPOCRef(value);
    return this;
  }

  /**
   * Get a string representation of this StatusLog instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  StatusLog {"
           + (agencyCode != null ? " agencyCode [" + agencyCode + "]" : "")
           + (comment != null ? " comment [" + comment + "]" : "")
           + (dateTime != null ? " dateTime [" + dateTime + "]" : "")
           + (pocRef != null ? " pocRef [" + pocRef + "]" : "")
           + (state != null ? " state [" + state + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link StatusLog} requires {@link DT DateTime}, {@link S50 State}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDateTime() && isSetState();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * US:POCRef - Point Of Contact Reference (Optional)    * <p>
   * The reference to a Contact, Organisation, or Role responsible for this
   * status log entry or the recipient of the action.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Common<?> poc;

  /**
   * Get the reference to a Contact, Organisation, or Role responsible for this
   * status log entry or the recipient of the action..
   * <p>
   * @return a {@link Common} instance
   * @since 3.1.0
   */
  public Common<?> getPoc() {
    return poc;
  }

  /**
   * Determine if the poc field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPoc() {
    return this.poc != null;
  }

  /**
   * Set the reference to a Contact, Organisation, or Role responsible for this
   * status log entry or the recipient of the action.
   * <p>
   * @param value An instances of type {@link Common<?>}.
   * @return The current StatusLog object instance.
   * @since 3.1.0
   */
  public StatusLog withPoc(Common<?> value) {
    this.poc = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this StatusLog record.
   * <p>
   * This method builds the exported {@link #pocRef} field with values from the
   * transient {@link #poc} field. This method should typically be called after
   * the StatusLog is configured and (optionally) before exporting an SSRF
   * message.
   * <p>
   * @since 3.1.0
   */
  public void prepare() {
    this.pocRef = poc != null ? poc.getSerial() : this.pocRef;
  }

  /**
   * Update the SSRF data type references in this StatusLog record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #poc} with values from the imported
   * {@link #pocRef} field. This method should typically be called after the
   * StatusLog is imported from XML. * @param root the SSRF root instance.
   * <p>
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (pocRef == null || !pocRef.isSetValue()) {
      return;
    }
    for (Contact instance : root.getContact()) {
      if (pocRef.equals(instance.getSerial())) {
        poc = instance;
        return;
      }
    }
    for (Organisation instance : root.getOrganisation()) {
      if (pocRef.equals(instance.getSerial())) {
        poc = instance;
        return;
      }
    }
    for (Role instance : root.getRole()) {
      if (pocRef.equals(instance.getSerial())) {
        poc = instance;
        return;
      }
    }
  }//</editor-fold>

}
