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
package us.gov.dod.standard.ssrf._3_1.assignment;

import java.util.Calendar;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.SSRequest;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUST;

/**
 * StatusLog (US) contains the transactional processing information related to
 * frequency assignments.
 * <p>
 * Element of {@link Assignment}, {@link SSRequest}
 * <p>
 * Example:
 * <pre>
 * &lt;StatusLog&gt;
 *   &lt;AgencyCode cls="U"&gt;DISA&lt;/AgencyCode&gt;
 *   &lt;Comment cls="U"&gt;Validated by independent review&lt;/Comment&gt;
 *   &lt;DateTime cls="U"&gt;2011-12-25T01:23:001Z&lt;/DateTime&gt;
 *   &lt;POCRef cls="U"&gt;USA:DISA:CN:123&lt;/POCRef&gt;
 *   &lt;State cls="U"&gt;ASSIGNED_BY&lt;/State&gt;
 * &lt;/StatusLog&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * US:DateTime - DateTime (Required)
   * <p>
   * The date and UTC time of this status log entry.
   * <p>
   * Format is DateTime
   */
  @XmlElement(name = "DateTime", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar dateTime;
  /**
   * US:State - State (Required)
   * <p>
   * The action performed for this status log entry.
   * <p>
   * Format is L:UST
   */
  @XmlElement(name = "State", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString state;
  /**
   * US:AgencyCode - Agency Code (Optional)
   * <p>
   * The agency responsible for this status log entry.
   * <p>
   * Format is S80
   */
  @XmlElement(name = "AgencyCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS80.class)
  private TString agencyCode;
  /**
   * US:Comment - Comment (Optional)
   * <p>
   * Amplifying information to describe the Status of the Assignment.
   * <p>
   * Format is S255
   */
  @XmlElement(name = "Comment", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString comment;
  /**
   * US:POCRef - Point Of Contact Reference (Optional)
   * <p>
   * The reference to a Contact, Organisation, or Role responsible for this
   * status log entry or the recipient of the action.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "POCRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString pocRef;

  /**
   * Get the date and UTC time of this status log entry.
   * <p>
   * @return the DateTime value in a {@link TCalendar} data type
   */
  public TCalendar getDateTime() {
    return dateTime;
  }

  /**
   * Set the date and UTC time of this status log entry.
   * <p>
   * @param value the DateTime value in a {@link TCalendar} data type
   */
  public void setDateTime(TCalendar value) {
    this.dateTime = value;
  }

  /**
   * Determine if the DateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDateTime() {
    return (this.dateTime != null ? this.dateTime.isSetValue() : false);
  }

  /**
   * Get the action performed for this status log entry.
   * <p>
   * @return the State value in a {@link TString} data type
   */
  public TString getState() {
    return state;
  }

  /**
   * Set the action performed for this status log entry.
   * <p>
   * @param value the State value in a {@link TString} data type
   */
  public void setState(TString value) {
    this.state = value;
  }

  /**
   * Determine if the State is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetState() {
    return (this.state != null ? this.state.isSetValue() : false);
  }

  /**
   * Get the agency responsible for this status log entry.
   * <p>
   * @return the AgencyCode value in a {@link TString} data type
   */
  public TString getAgencyCode() {
    return agencyCode;
  }

  /**
   * Set the agency responsible for this status log entry.
   * <p>
   * @param value the AgencyCode value in a {@link TString} data type
   */
  public void setAgencyCode(TString value) {
    this.agencyCode = value;
  }

  /**
   * Determine if the AgencyCode is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAgencyCode() {
    return (this.agencyCode != null ? this.agencyCode.isSetValue() : false);
  }

  /**
   * Get amplifying information to describe the Status of the Assignment.
   * <p>
   * @return the Comment value in a {@link TString} data type
   */
  public TString getComment() {
    return comment;
  }

  /**
   * Set amplifying information to describe the Status of the Assignment.
   * <p>
   * @param value the Comment value in a {@link TString} data type
   */
  public void setComment(TString value) {
    this.comment = value;
  }

  /**
   * Determine if the Comment is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetComment() {
    return (this.comment != null ? this.comment.isSetValue() : false);
  }

  /**
   * Get the reference to a Contact, Organisation, or Role responsible for this
   * status log entry or the recipient of the action.
   * <p>
   * @return the POCRef value in a {@link TString} data type
   */
  public TString getPOCRef() {
    return pocRef;
  }

  /**
   * Set the reference to a Contact, Organisation, or Role responsible for this
   * status log entry or the recipient of the action.
   * <p>
   * @param value the POCRef value in a {@link TString} data type
   */
  public void setPOCRef(TString value) {
    this.pocRef = value;
  }

  /**
   * Determine if the POCRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPOCRef() {
    return (this.pocRef != null ? this.pocRef.isSetValue() : false);
  }

  /**
   * Set the date and UTC time of this status log entry.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current StatusLog object instance
   */
  public StatusLog withDateTime(Calendar value) {
    setDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the action performed for this status log entry.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current StatusLog object instance
   */
  public StatusLog withState(ListUST value) {
    setState(new TString(value.value()));
    return this;
  }

  /**
   * Set the agency responsible for this status log entry.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current StatusLog object instance
   */
  public StatusLog withAgencyCode(String value) {
    setAgencyCode(new TString(value));
    return this;
  }

  /**
   * Set amplifying information to describe the Status of the Assignment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current StatusLog object instance
   */
  public StatusLog withComment(String value) {
    setComment(new TString(value));
    return this;
  }

  /**
   * Set the reference to a Contact, Organisation, or Role responsible for this
   * status log entry or the recipient of the action.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current StatusLog object instance
   */
  public StatusLog withPOCRef(String value) {
    setPOCRef(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this StatusLog instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "StatusLog {"
      + (dateTime != null ? " dateTime [" + dateTime + "]" : "")
      + (pocRef != null ? " pocRef [" + pocRef + "]" : "")
      + (agencyCode != null ? " agencyCode [" + agencyCode + "]" : "")
      + (state != null ? " state [" + state + "]" : "")
      + (comment != null ? " comment [" + comment + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link StatusLog} requires
   * {@link TCalendar DateTime}, {@link TString State}.
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
   * US:POCRef - Point Of Contact Reference (Optional)
   * <p>
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
   * status log entry or the recipient of the action.
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
   * @param value An instances of type {@link Common<?>}
   * @return The current StatusLog object instance
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
   * @return The current StatusLog object instance
   */
  public StatusLog build() {
    this.pocRef = poc != null ? poc.getSerial() : null;
    return this;
  }//</editor-fold>

}
