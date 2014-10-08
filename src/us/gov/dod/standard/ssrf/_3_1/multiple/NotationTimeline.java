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
package us.gov.dod.standard.ssrf._3_1.multiple;

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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
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
   * US:Code - Notation Code (Required)
   * <p>
   * An alphanumeric combination that is used to identify a particular
   * Notation/Signal.
   * <p>
   * Format is US(20)
   */
  @XmlElement(name = "Code", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterUS20.class)
  private TString code;
  /**
   * US:Status - Notation Status (Optional)
   * <p>
   * The status of the future, prior, or associated, Notation.
   * <p>
   * Format is L:UNT
   */
  @XmlElement(name = "Status", required = false)
  private TString status;
  /**
   * US:StatusChangeDateTime - Notation Status Timestamp (Optional)
   * <p>
   * The timestamp when the prior, or associated, Notation achieved this Status.
   * <p>
   * Format is DateTime
   */
  @XmlElement(name = "StatusChangeDateTime", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar statusChangeDateTime;
  /**
   * US:Type - Notation Type (Optional)
   * <p>
   * The type of Notation.
   * <p>
   * Format is L:CEN
   */
  @XmlElement(name = "Type", required = false)
  private TString type;

  /**
   * Get an alphanumeric combination that is used to identify a particular
   * Notation/Signal.
   * <p>
   * @return the Code value in a {@link TString} data type
   */
  public TString getCode() {
    return code;
  }

  /**
   * Set an alphanumeric combination that is used to identify a particular
   * Notation/Signal.
   * <p>
   * @param value the Code value in a {@link TString} data type
   */
  public void setCode(TString value) {
    this.code = value;
  }

  /**
   * Determine if the Code is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCode() {
    return (this.code != null ? this.code.isSetValue() : false);
  }

  /**
   * Get the status of the future, prior, or associated, Notation.
   * <p>
   * @return the Status value in a {@link TString} data type
   */
  public TString getStatus() {
    return status;
  }

  /**
   * Set the status of the future, prior, or associated, Notation.
   * <p>
   * @param value the Status value in a {@link TString} data type
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
   * Status.
   * <p>
   * @return the StatusChangeDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getStatusChangeDateTime() {
    return statusChangeDateTime;
  }

  /**
   * Set the timestamp when the prior, or associated, Notation achieved this
   * Status.
   * <p>
   * @param value the StatusChangeDateTime value in a {@link TCalendar} data
   *              type
   */
  public void setStatusChangeDateTime(TCalendar value) {
    this.statusChangeDateTime = value;
  }

  /**
   * Determine if the StatusChangeDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStatusChangeDateTime() {
    return (this.statusChangeDateTime != null ? this.statusChangeDateTime.isSetValue() : false);
  }

  /**
   * Get the type of Notation.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of Notation.
   * <p>
   * @param value the Type value in a {@link TString} data type
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
   * @param value An instances of type {@link String}
   * @return The current NotationTimeline object instance
   */
  public NotationTimeline withCode(String value) {
    setCode(new TString(value));
    return this;
  }

  /**
   * Set the status of the future, prior, or associated, Notation.
   * <p>
   * @param value An instances of type {@link ListUNT}
   * @return The current NotationTimeline object instance
   */
  public NotationTimeline withStatus(ListUNT value) {
    setStatus(new TString(value.value()));
    return this;
  }

  /**
   * Set the timestamp when the prior, or associated, Notation achieved this
   * Status.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current NotationTimeline object instance
   */
  public NotationTimeline withStatusChangeDateTime(Calendar value) {
    setStatusChangeDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the timestamp when the prior, or associated, Notation achieved this
   * Status.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current NotationTimeline object instance
   */
  public NotationTimeline withStatusChangeDateTime(Date value) {
    setStatusChangeDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the type of Notation.
   * <p>
   * @param value An instances of type {@link ListCEN}
   * @return The current NotationTimeline object instance
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
      + (status != null ? " status [" + status + "]" : "")
      + (code != null ? " code [" + code + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + (statusChangeDateTime != null ? " statusChangeDateTime [" + statusChangeDateTime + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link NotationTimeline} requires {@link TString Code}.
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
