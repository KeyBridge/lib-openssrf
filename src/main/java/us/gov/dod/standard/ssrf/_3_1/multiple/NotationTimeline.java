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
package us.gov.dod.standard.ssrf._3_1.multiple;

import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCEN;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUNT;

/**
 * NotationTimeline (US) provides history information for a specific notation or
 * signal.
 * <p>
 * Element of {@link Notation}
 * <p>
 * Example: See {@link Notation}.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotationTimeline", propOrder = {
  "code",
  "status",
  "statusChangeDateTime",
  "type"
})
public class NotationTimeline {

  /**
   * US:Code - Notation Code (Required)    * <p>
   * An alphanumeric combination that is used to identify a particular
   * Notation/Signal.
   * <p>
   * Format is US(20)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Code", required = true)
  private US20 code;
  /**
   * US:Status - Notation Status (Optional)    * <p>
   * The status of the future, prior, or associated, Notation.
   * <p>
   * Format is L:UNT
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Status", required = false)
  private TString status;
  /**
   * US:StatusChangeDateTime - Notation Status Timestamp (Optional)    * <p>
   * The timestamp when the prior, or associated, Notation achieved this Status.
   * <p>
   * Format is DateTime
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StatusChangeDateTime", required = false)
  private DT statusChangeDateTime;
  /**
   * US:Type - Notation Type (Optional)    * <p>
   * The type of Notation.
   * <p>
   * Format is L:CEN
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = false)
  private TString type;

  /**
   * Get an alphanumeric combination that is used to identify a particular
   * Notation/Signal..
   * <p>
   * @return a {@link US20} instance
   * @since 3.1.0
   */
  public US20 getCode() {
    return code;
  }

  /**
   * Set an alphanumeric combination that is used to identify a particular
   * Notation/Signal..
   * <p>
   * @param value a {@link US20} instance
   * @since 3.1.0
   */
  public void setCode(US20 value) {
    this.code = value;
  }

  /**
   * Determine if the Code is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCode() {
    return (this.code != null ? this.code.isSetValue() : false);
  }

  /**
   * Get the status of the future, prior, or associated, Notation..
   * <p>
   * @return the Status value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getStatus() {
    return status;
  }

  /**
   * Set the status of the future, prior, or associated, Notation..
   * <p>
   * @param value the Status value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setStatus(TString value) {
    this.status = value;
  }

  /**
   * Determine if the Status is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStatus() {
    return (this.status != null ? this.status.isSetValue() : false);
  }

  /**
   * Get the timestamp when the prior, or associated, Notation achieved this
   * Status..
   * <p>
   * @return a {@link DT} instance
   * @since 3.1.0
   */
  public DT getStatusChangeDateTime() {
    return statusChangeDateTime;
  }

  /**
   * Set the timestamp when the prior, or associated, Notation achieved this
   * Status..
   * <p>
   * @param value a {@link DT} instance
   * @since 3.1.0
   */
  public void setStatusChangeDateTime(DT value) {
    this.statusChangeDateTime = value;
  }

  /**
   * Determine if the StatusChangeDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStatusChangeDateTime() {
    return (this.statusChangeDateTime != null ? this.statusChangeDateTime.isSetValue() : false);
  }

  /**
   * Get the type of Notation..
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of Notation..
   * <p>
   * @param value the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setType(TString value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

  /**
   * Set an alphanumeric combination that is used to identify a particular
   * Notation/Signal.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current NotationTimeline object instance.
   * @since 3.1.0
   */
  public NotationTimeline withCode(String value) {
    setCode(new US20(value));
    return this;
  }

  /**
   * Set the status of the future, prior, or associated, Notation.
   * <p>
   * @param value An instances of type {@link ListUNT}.
   * @return The current NotationTimeline object instance.
   * @since 3.1.0
   */
  public NotationTimeline withStatus(ListUNT value) {
    setStatus(new TString(value.value()));
    return this;
  }

  /**
   * Set the timestamp when the prior, or associated, Notation achieved this
   * Status.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current NotationTimeline object instance.
   * @since 3.1.0
   */
  public NotationTimeline withStatusChangeDateTime(Calendar value) {
    setStatusChangeDateTime(new DT(value));
    return this;
  }

  /**
   * Set the timestamp when the prior, or associated, Notation achieved this
   * Status.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current NotationTimeline object instance.
   * @since 3.1.0
   */
  public NotationTimeline withStatusChangeDateTime(Date value) {
    setStatusChangeDateTime(new DT(value));
    return this;
  }

  /**
   * Set the type of Notation.
   * <p>
   * @param value An instances of type {@link ListCEN}.
   * @return The current NotationTimeline object instance.
   * @since 3.1.0
   */
  public NotationTimeline withType(ListCEN value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this NotationTimeline instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "NotationTimeline {"
           + (code != null ? "\n code [" + code + "]" : "")
           + (status != null ? "\n status [" + status + "]" : "")
           + (statusChangeDateTime != null ? "\n statusChangeDateTime [" + statusChangeDateTime + "]" : "")
           + (type != null ? "\n type [" + type + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link NotationTimeline} requires {@link US20 Code}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCode();
  }

}
