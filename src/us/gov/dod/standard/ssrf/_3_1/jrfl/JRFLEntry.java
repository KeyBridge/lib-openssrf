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
package us.gov.dod.standard.ssrf._3_1.jrfl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.JRFL;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.allotment.POCInformation;
import us.gov.dod.standard.ssrf._3_1.allotment.Project;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAU;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCPC;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCTS;

/**
 * This data element defines the protection and priority codes for those nets
 * (frequencies) that are listed in the Joint Restricted Frequency List (JRFL).
 * A JRFL entry may either refer to an existing Assignment/Allotment (in this
 * case, use the sub-element AsgnAllotRef) or to an arbitrary set of frequencies
 * (in this case describe the frequency/range, its user, location and duration).
 * In the case of an arbitrary set of frequencies, if multiple organisations are
 * listed they will all use the same set of frequencies; if it is not the case,
 * split the JRFL entry into several entries.
 * <p>
 * Element of {@link JRFL}
 * <p>
 * Sub-Elements are
 * {@link JRFLEntryLocation}, {@link POCInformation}, {@link Project}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JRFLEntry", propOrder = {
  "protectionCode",
  "priority",
  "justification",
  "approvalLevel",
  "seconds",
  "minutes",
  "hours",
  "daysOfMonth",
  "months",
  "daysOfWeek",
  "years",
  "duration",
  "asgnAllotRef",
  "freqMin",
  "freqMax",
  "bandwidth",
  "freqUse",
  "project",
  "pocInformation",
  "jrflEntryLocation"
})
public class JRFLEntry {

  /**
   * ProtectionCode, indicate the type of JRFL entry.
   */
  @XmlElement(name = "ProtectionCode", required = true)
  private TString protectionCode;
  /**
   * Priority - Priority (Optional)
   * <p>
   * The assigned priority code consisting of a letter followed by a number in
   * the range A1 through Z9, with A1 being the highest priority (all Taboo nets
   * should be assigned an A1 priority code). This code is set at the local
   * command level.
   * <p>
   * Format is US2
   */
  @XmlElement(name = "Priority", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterUS2.class)
  private TString priority;
  /**
   * Justification - Justification (Required)
   * <p>
   * A description of the justification of why the JRFL entry is required, to
   * support the spectrum manager.
   * <p>
   * Format is s255
   */
  @XmlElement(name = "Justification", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString justification;
  /**
   * ApprovalLevel - Approval Level (Optional)
   * <p>
   * The approval status of the JRFL entry.
   * <p>
   * Format is L:CTS
   */
  @XmlElement(name = "ApprovalLevel", required = false)
  private TString approvalLevel;
  /**
   * Seconds,enter the seconds of hour [0-59]
   */
  @XmlElement(name = "Seconds", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMINSEC.class)
  private TString seconds;
  /**
   * Minutes - Minutes (Optional)
   * <p>
   * The minutes of an hour [0-59].
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   */
  @XmlElement(name = "Minutes", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMINSEC.class)
  private TString minutes;
  /**
   * Hours - Hours (Optional)
   * <p>
   * The hours of a day [0-23] (UTC time).
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   */
  @XmlElement(name = "Hours", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterHOURS.class)
  private TString hours;
  /**
   * DaysOfMonth - Days Of Month (Optional)
   * <p>
   * The day of month [1-31].
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   */
  @XmlElement(name = "DaysOfMonth", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterDAYSOFMONTH.class)
  private TString daysOfMonth;
  /**
   * Months - Months (Optional)
   * <p>
   * The month of year [1-12].
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   */
  @XmlElement(name = "Months", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMONTHS.class)
  private TString months;
  /**
   * DaysOfWeek - Days of Week (Optional)
   * <p>
   * The weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc].
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   */
  @XmlElement(name = "DaysOfWeek", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterDAYSOFWEEK.class)
  private TString daysOfWeek;
  /**
   * Years - Years (Optional)
   * <p>
   * The 4-digit year [1900..2100].
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   */
  @XmlElement(name = "Years", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterYEARS.class)
  private TString years;
  /**
   * Duration - Duration (Optional)
   * <p>
   * The number of minutes for which an event will live. Examples: possible
   * values for the Hours item: 8 one value: 08h00Z 5,6,9 multiple values:
   * 05h00Z, 06h00Z, 09h00Z 5-8 range between 05h00Z and 08h00Z inclusive star/2
   * stepped, every other hour. 00h00Z (midnight), 02h00Z, 04h00Z, etc 3-12/3
   * stepped range, every third hour: 03h00Z, 06h00Z, 09h00Z, and 12h00Z
   * Transmission for 2 minutes every 10 minutes from 9am to 5pm every weekday
   * for 2007: %lt;Minutes%gt;star/10%lt;/Minutes%gt;
   * %lt;Hours%gt;9-17%lt;/Hours%gt; %lt;DaysofWeek%gt;0-4%lt;/DaysofWeek%gt;
   * %lt;Years%gt;2007%lt;/Years%gt; %lt;Duration%gt;2%lt;/Duration%gt; On the
   * 5-minute mark, every third hour, only on days of the work week (Mon-Fri)
   * %lt;Minutes%gt;5%lt;/Minutes%gt; %lt;Hours%gt;star/3%lt;/Hours%gt;
   * %lt;DaysofWeek%gt;1-5%lt;/DaysofWeek%gt; On the 20 and 50-minute marks
   * every hour, every month except June, only on days of the work week
   * (Mon-Fri) %lt;Minutes%gt;20,50%lt;/Minutes%gt;
   * %lt;Months%gt;1-5,7-12%lt;/Months%gt;
   * %lt;DaysofWeek%gt;1-5%lt;/DaysofWeek%gt;
   * <p>
   * Format is UN(4) (min)
   * <p>
   * Attribute group TimeFrame (Optional)
   */
  @XmlElement(name = "Duration", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterDURATION_UN4.class)
  private TInteger duration;
  /**
   * AsgnAllotRef - Assignment or Allotment Serial (Optional)
   * <p>
   * The Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "AsgnAllotRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString asgnAllotRef;
  /**
   * FreqMin - Nominal or Minimum Frequency (Optional)
   * <p>
   * The nominal frequency or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Optional)
   */
  @XmlElement(name = "FreqMin")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * FreqMax - Maximum Frequency (Optional)
   * <p>
   * The maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Optional)
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * Bandwidth - Bandwidth (Optional)
   * <p>
   * The width of the range (or band) of restricted frequency(s).
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   */
  @XmlElement(name = "Bandwidth", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal bandwidth;
  /**
   * FreqUse - Frequency Use (Optional)
   * <p>
   * The intended usage of the frequency.
   * <p>
   * Format is L:CAU
   */
  @XmlElement(name = "FreqUse", required = false)
  private TString freqUse;
  /**
   * Project (Optional)
   * <p>
   * Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other
   * project name associated to the dataset.
   */
  @XmlElement(name = "Project")
  private List<Project> project;
  /**
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
   */
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  /**
   * JRFLEntryLocation (Optional)
   * <p>
   * JRFLEntryLocation defines the location where the use of a specific
   * frequency or frequency range(s) is restricted in use.
   */
  @XmlElement(name = "JRFLEntryLocation")
  private List<JRFLEntryLocation> jrflEntryLocation;

  /**
   * Get ProtectionCode, indicate the type of JRFL entry.
   * <p>
   * @return the ProtectionCode value in a {@link TString} data type
   */
  public TString getProtectionCode() {
    return protectionCode;
  }

  /**
   * Set ProtectionCode, indicate the type of JRFL entry.
   * <p>
   * @param value the ProtectionCode value in a {@link TString} data type
   */
  public void setProtectionCode(TString value) {
    this.protectionCode = value;
  }

  /**
   * Determine if the ProtectionCode is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetProtectionCode() {
    return (this.protectionCode != null ? this.protectionCode.isSetValue() : false);
  }

  /**
   * Get the assigned priority code consisting of a letter followed by a number
   * in the range A1 through Z9, with A1 being the highest priority (all Taboo
   * nets should be assigned an A1 priority code). This code is set at the local
   * command level.
   * <p>
   * @return the Priority value in a {@link TString} data type
   */
  public TString getPriority() {
    return priority;
  }

  /**
   * Set the assigned priority code consisting of a letter followed by a number
   * in the range A1 through Z9, with A1 being the highest priority (all Taboo
   * nets should be assigned an A1 priority code). This code is set at the local
   * command level.
   * <p>
   * @param value the Priority value in a {@link TString} data type
   */
  public void setPriority(TString value) {
    this.priority = value;
  }

  /**
   * Determine if the Priority is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPriority() {
    return (this.priority != null ? this.priority.isSetValue() : false);
  }

  /**
   * Get a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager.
   * <p>
   * @return the Justification value in a {@link TString} data type
   */
  public TString getJustification() {
    return justification;
  }

  /**
   * Set a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager.
   * <p>
   * @param value the Justification value in a {@link TString} data type
   */
  public void setJustification(TString value) {
    this.justification = value;
  }

  /**
   * Determine if the Justification is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJustification() {
    return (this.justification != null ? this.justification.isSetValue() : false);
  }

  /**
   * Get the approval status of the JRFL entry.
   * <p>
   * @return the ApprovalLevel value in a {@link TString} data type
   */
  public TString getApprovalLevel() {
    return approvalLevel;
  }

  /**
   * Set the approval status of the JRFL entry.
   * <p>
   * @param value the ApprovalLevel value in a {@link TString} data type
   */
  public void setApprovalLevel(TString value) {
    this.approvalLevel = value;
  }

  /**
   * Determine if the ApprovalLevel is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetApprovalLevel() {
    return (this.approvalLevel != null ? this.approvalLevel.isSetValue() : false);
  }

  /**
   * Get Seconds,enter the seconds of hour [0-59]
   * <p>
   * @return the Seconds value in a {@link TString} data type
   */
  public TString getSeconds() {
    return seconds;
  }

  /**
   * Set Seconds,enter the seconds of hour [0-59]
   * <p>
   * @param value the Seconds value in a {@link TString} data type
   */
  public void setSeconds(TString value) {
    this.seconds = value;
  }

  /**
   * Determine if the Seconds is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSeconds() {
    return (this.seconds != null ? this.seconds.isSetValue() : false);
  }

  /**
   * Get the minutes of an hour [0-59].
   * <p>
   * @return the Minutes value in a {@link TString} data type
   */
  public TString getMinutes() {
    return minutes;
  }

  /**
   * Set the minutes of an hour [0-59].
   * <p>
   * @param value the Minutes value in a {@link TString} data type
   */
  public void setMinutes(TString value) {
    this.minutes = value;
  }

  /**
   * Determine if the Minutes is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMinutes() {
    return (this.minutes != null ? this.minutes.isSetValue() : false);
  }

  /**
   * Get the hours of a day [0-23] (UTC time).
   * <p>
   * @return the Hours value in a {@link TString} data type
   */
  public TString getHours() {
    return hours;
  }

  /**
   * Set the hours of a day [0-23] (UTC time).
   * <p>
   * @param value the Hours value in a {@link TString} data type
   */
  public void setHours(TString value) {
    this.hours = value;
  }

  /**
   * Determine if the Hours is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHours() {
    return (this.hours != null ? this.hours.isSetValue() : false);
  }

  /**
   * Get the day of month [1-31].
   * <p>
   * @return the DaysOfMonth value in a {@link TString} data type
   */
  public TString getDaysOfMonth() {
    return daysOfMonth;
  }

  /**
   * Set the day of month [1-31].
   * <p>
   * @param value the DaysOfMonth value in a {@link TString} data type
   */
  public void setDaysOfMonth(TString value) {
    this.daysOfMonth = value;
  }

  /**
   * Determine if the DaysOfMonth is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDaysOfMonth() {
    return (this.daysOfMonth != null ? this.daysOfMonth.isSetValue() : false);
  }

  /**
   * Get the month of year [1-12].
   * <p>
   * @return the Months value in a {@link TString} data type
   */
  public TString getMonths() {
    return months;
  }

  /**
   * Set the month of year [1-12].
   * <p>
   * @param value the Months value in a {@link TString} data type
   */
  public void setMonths(TString value) {
    this.months = value;
  }

  /**
   * Determine if the Months is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMonths() {
    return (this.months != null ? this.months.isSetValue() : false);
  }

  /**
   * Get the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc].
   * <p>
   * @return the DaysOfWeek value in a {@link TString} data type
   */
  public TString getDaysOfWeek() {
    return daysOfWeek;
  }

  /**
   * Set the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc].
   * <p>
   * @param value the DaysOfWeek value in a {@link TString} data type
   */
  public void setDaysOfWeek(TString value) {
    this.daysOfWeek = value;
  }

  /**
   * Determine if the DaysOfWeek is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDaysOfWeek() {
    return (this.daysOfWeek != null ? this.daysOfWeek.isSetValue() : false);
  }

  /**
   * Get the 4-digit year [1900..2100].
   * <p>
   * @return the Years value in a {@link TString} data type
   */
  public TString getYears() {
    return years;
  }

  /**
   * Set the 4-digit year [1900..2100].
   * <p>
   * @param value the Years value in a {@link TString} data type
   */
  public void setYears(TString value) {
    this.years = value;
  }

  /**
   * Determine if the Years is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetYears() {
    return (this.years != null ? this.years.isSetValue() : false);
  }

  /**
   * Get the number of minutes for which an event will live. Examples: possible
   * values for the Hours item: 8 one value: 08h00Z 5,6,9 multiple values:
   * 05h00Z, 06h00Z, 09h00Z 5-8 range between 05h00Z and 08h00Z inclusive star/2
   * stepped, every other hour. 00h00Z (midnight), 02h00Z, 04h00Z, etc 3-12/3
   * stepped range, every third hour: 03h00Z, 06h00Z, 09h00Z, and 12h00Z
   * Transmission for 2 minutes every 10 minutes from 9am to 5pm every weekday
   * for 2007:
   * <Minutes>star/10</Minutes>
   * <Hours>9-17</Hours>
   * <DaysofWeek>0-4</DaysofWeek>
   * <Years>2007</Years>
   * <Duration>2</Duration>
   * On the 5-minute mark, every third hour, only on days of the work week
   * (Mon-Fri)
   * <Minutes>5</Minutes>
   * <Hours>star/3</Hours>
   * <DaysofWeek>1-5</DaysofWeek>
   * On the 20 and 50-minute marks every hour, every month except June, only on
   * days of the work week (Mon-Fri)
   * <Minutes>20,50</Minutes>
   * <Months>1-5,7-12</Months>
   * <DaysofWeek>1-5</DaysofWeek>
   * <p>
   * @return the Duration value in a {@link TInteger} data type
   */
  public TInteger getDuration() {
    return duration;
  }

  /**
   * Set the number of minutes for which an event will live. Examples: possible
   * values for the Hours item: 8 one value: 08h00Z 5,6,9 multiple values:
   * 05h00Z, 06h00Z, 09h00Z 5-8 range between 05h00Z and 08h00Z inclusive star/2
   * stepped, every other hour. 00h00Z (midnight), 02h00Z, 04h00Z, etc 3-12/3
   * stepped range, every third hour: 03h00Z, 06h00Z, 09h00Z, and 12h00Z
   * Transmission for 2 minutes every 10 minutes from 9am to 5pm every weekday
   * for 2007:
   * <Minutes>star/10</Minutes>
   * <Hours>9-17</Hours>
   * <DaysofWeek>0-4</DaysofWeek>
   * <Years>2007</Years>
   * <Duration>2</Duration>
   * On the 5-minute mark, every third hour, only on days of the work week
   * (Mon-Fri)
   * <Minutes>5</Minutes>
   * <Hours>star/3</Hours>
   * <DaysofWeek>1-5</DaysofWeek>
   * On the 20 and 50-minute marks every hour, every month except June, only on
   * days of the work week (Mon-Fri)
   * <Minutes>20,50</Minutes>
   * <Months>1-5,7-12</Months>
   * <DaysofWeek>1-5</DaysofWeek>
   * <p>
   * @param value the Duration value in a {@link TInteger} data type
   */
  public void setDuration(TInteger value) {
    this.duration = value;
  }

  /**
   * Determine if the Duration is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDuration() {
    return (this.duration != null ? this.duration.isSetValue() : false);
  }

  /**
   * Get the Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @return the AsgnAllotRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getAssignmentAllotment()} instead.
   */
  @Deprecated
  public TString getAsgnAllotRef() {
    return asgnAllotRef;
  }

  /**
   * Set the Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @param value the AsgnAllotRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setAssignmentAllotment(Common)} instead.
   */
  @Deprecated
  public void setAsgnAllotRef(TString value) {
    this.asgnAllotRef = value;
  }

  /**
   * Determine if the AsgnAllotRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAsgnAllotRef() {
    return (this.asgnAllotRef != null ? this.asgnAllotRef.isSetValue() : false);
  }

  /**
   * Get the nominal frequency or minimum value of the frequency range.
   * <p>
   * @return the FreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
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
   * Get the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @return the FreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
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
   * Get the width of the range (or band) of restricted frequency(s).
   * <p>
   * @return the Bandwidth value in a {@link TDecimal} data type
   */
  public TDecimal getBandwidth() {
    return bandwidth;
  }

  /**
   * Set the width of the range (or band) of restricted frequency(s).
   * <p>
   * @param value the Bandwidth value in a {@link TDecimal} data type
   */
  public void setBandwidth(TDecimal value) {
    this.bandwidth = value;
  }

  /**
   * Determine if the Bandwidth is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBandwidth() {
    return (this.bandwidth != null ? this.bandwidth.isSetValue() : false);
  }

  /**
   * Get the intended usage of the frequency.
   * <p>
   * @return the FreqUse value in a {@link TString} data type
   */
  public TString getFreqUse() {
    return freqUse;
  }

  /**
   * Set the intended usage of the frequency.
   * <p>
   * @param value the FreqUse value in a {@link TString} data type
   */
  public void setFreqUse(TString value) {
    this.freqUse = value;
  }

  /**
   * Determine if the FreqUse is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqUse() {
    return (this.freqUse != null ? this.freqUse.isSetValue() : false);
  }

  /**
   * Get the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset.
   * <p>
   * @return a non-null but possibly empty list of {@link Project} instances
   */
  public List<Project> getProject() {
    if (project == null) {
      project = new ArrayList<>();
    }
    return this.project;
  }

  /**
   * Determine if the Project is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetProject() {
    return ((this.project != null) && (!this.project.isEmpty()));
  }

  /**
   * Clear the Project field. This sets the field to null.
   */
  public void unsetProject() {
    this.project = null;
  }

  /**
   * Get the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @return a non-null but possibly empty list of {@link POCInformation}
   *         instances
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
  }

  /**
   * Determine if the POCInformation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPOCInformation() {
    return ((this.pocInformation != null) && (!this.pocInformation.isEmpty()));
  }

  /**
   * Clear the POCInformation field. This sets the field to null.
   */
  public void unsetPOCInformation() {
    this.pocInformation = null;
  }

  /**
   * Get the JRFLEntryLocation
   * <p>
   * Complex element JRFLEntryLocation defines the location where the use of a
   * specific frequency or frequency range(s) is restricted in use.
   * <p>
   * @return a non-null but possibly empty list of {@link JRFLEntryLocation}
   *         instances
   */
  public List<JRFLEntryLocation> getJRFLEntryLocation() {
    if (jrflEntryLocation == null) {
      jrflEntryLocation = new ArrayList<>();
    }
    return this.jrflEntryLocation;
  }

  /**
   * Determine if the JRFLEntryLocation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJRFLEntryLocation() {
    return ((this.jrflEntryLocation != null) && (!this.jrflEntryLocation.isEmpty()));
  }

  /**
   * Clear the JRFLEntryLocation field. This sets the field to null.
   */
  public void unsetJRFLEntryLocation() {
    this.jrflEntryLocation = null;
  }

  /**
   * Set ProtectionCode, indicate the type of JRFL entry.
   * <p>
   * @param value An instances of type {@link ListCPC}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withProtectionCode(ListCPC value) {
    setProtectionCode(new TString(value.value()));
    return this;
  }

  /**
   * Set the assigned priority code consisting of a letter followed by a number
   * in the range A1 through Z9, with A1 being the highest priority (all Taboo
   * nets should be assigned an A1 priority code). This code is set at the local
   * command level.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withPriority(String value) {
    setPriority(new TString(value));
    return this;
  }

  /**
   * Set a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withJustification(String value) {
    setJustification(new TString(value));
    return this;
  }

  /**
   * Set the approval status of the JRFL entry.
   * <p>
   * @param value An instances of type {@link ListCTS}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withApprovalLevel(ListCTS value) {
    setApprovalLevel(new TString(value.value()));
    return this;
  }

  /**
   * Set Seconds,enter the seconds of hour [0-59]
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withSeconds(String value) {
    setSeconds(new TString(value));
    return this;
  }

  /**
   * Set the minutes of an hour [0-59].
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withMinutes(String value) {
    setMinutes(new TString(value));
    return this;
  }

  /**
   * Set the hours of a day [0-23] (UTC time).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withHours(String value) {
    setHours(new TString(value));
    return this;
  }

  /**
   * Set the day of month [1-31].
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withDaysOfMonth(String value) {
    setDaysOfMonth(new TString(value));
    return this;
  }

  /**
   * Set the month of year [1-12].
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withMonths(String value) {
    setMonths(new TString(value));
    return this;
  }

  /**
   * Set the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc].
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withDaysOfWeek(String value) {
    setDaysOfWeek(new TString(value));
    return this;
  }

  /**
   * Set the 4-digit year [1900..2100].
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withYears(String value) {
    setYears(new TString(value));
    return this;
  }

  /**
   * Set the number of minutes for which an event will live. Examples: possible
   * values for the Hours item: 8 one value: 08h00Z 5,6,9 multiple values:
   * 05h00Z, 06h00Z, 09h00Z 5-8 range between 05h00Z and 08h00Z inclusive star/2
   * stepped, every other hour. 00h00Z (midnight), 02h00Z, 04h00Z, etc 3-12/3
   * stepped range, every third hour: 03h00Z, 06h00Z, 09h00Z, and 12h00Z
   * Transmission for 2 minutes every 10 minutes from 9am to 5pm every weekday
   * for 2007:
   * <Minutes>star/10</Minutes>
   * <Hours>9-17</Hours>
   * <DaysofWeek>0-4</DaysofWeek>
   * <Years>2007</Years>
   * <Duration>2</Duration>
   * On the 5-minute mark, every third hour, only on days of the work week
   * (Mon-Fri)
   * <Minutes>5</Minutes>
   * <Hours>star/3</Hours>
   * <DaysofWeek>1-5</DaysofWeek>
   * On the 20 and 50-minute marks every hour, every month except June, only on
   * days of the work week (Mon-Fri)
   * <Minutes>20,50</Minutes>
   * <Months>1-5,7-12</Months>
   * <DaysofWeek>1-5</DaysofWeek>
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withDuration(Integer value) {
    setDuration(new TInteger(value));
    return this;
  }

  /**
   * Set the Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withAssignmentAllotment(Common)} instead.
   */
  @Deprecated
  public JRFLEntry withAsgnAllotRef(String value) {
    setAsgnAllotRef(new TString(value));
    return this;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the width of the range (or band) of restricted frequency(s).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withBandwidth(Double value) {
    setBandwidth(new TDecimal(value));
    return this;
  }

  /**
   * Set the intended usage of the frequency.
   * <p>
   * @param value An instances of type {@link ListCAU}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withFreqUse(ListCAU value) {
    setFreqUse(new TString(value.value()));
    return this;
  }

  /**
   * Set the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset.
   * <p>
   * @param values One or more instances of type {@link Project}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withProject(Project... values) {
    if (values != null) {
      getProject().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset.
   * <p>
   * @param values A collection of {@link Project} instances
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withProject(Collection<Project> values) {
    if (values != null) {
      getProject().addAll(values);
    }
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values One or more instances of type {@link POCInformation}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values A collection of {@link POCInformation} instances
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  /**
   * Set the JRFLEntryLocation
   * <p>
   * Complex element JRFLEntryLocation defines the location where the use of a
   * specific frequency or frequency range(s) is restricted in use.
   * <p>
   * @param values One or more instances of type {@link JRFLEntryLocation}
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withJRFLEntryLocation(JRFLEntryLocation... values) {
    if (values != null) {
      getJRFLEntryLocation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the JRFLEntryLocation
   * <p>
   * Complex element JRFLEntryLocation defines the location where the use of a
   * specific frequency or frequency range(s) is restricted in use.
   * <p>
   * @param values A collection of {@link JRFLEntryLocation} instances
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry withJRFLEntryLocation(Collection<JRFLEntryLocation> values) {
    if (values != null) {
      getJRFLEntryLocation().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this JRFLEntry instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "JRFLEntry {"
      + (jrflEntryLocation != null ? " jrflEntryLocation [" + jrflEntryLocation + "]" : "")
      + (minutes != null ? " minutes [" + minutes + "]" : "")
      + (pocInformation != null ? " pocInformation [" + pocInformation + "]" : "")
      + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
      + (hours != null ? " hours [" + hours + "]" : "")
      + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
      + (justification != null ? " justification [" + justification + "]" : "")
      + (daysOfMonth != null ? " daysOfMonth [" + daysOfMonth + "]" : "")
      + (daysOfWeek != null ? " daysOfWeek [" + daysOfWeek + "]" : "")
      + (bandwidth != null ? " bandwidth [" + bandwidth + "]" : "")
      + (asgnAllotRef != null ? " asgnAllotRef [" + asgnAllotRef + "]" : "")
      + (approvalLevel != null ? " approvalLevel [" + approvalLevel + "]" : "")
      + (project != null ? " project [" + project + "]" : "")
      + (months != null ? " months [" + months + "]" : "")
      + (duration != null ? " duration [" + duration + "]" : "")
      + (protectionCode != null ? " protectionCode [" + protectionCode + "]" : "")
      + (seconds != null ? " seconds [" + seconds + "]" : "")
      + (priority != null ? " priority [" + priority + "]" : "")
      + (freqUse != null ? " freqUse [" + freqUse + "]" : "")
      + (years != null ? " years [" + years + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JRFLEntry} requires
   * {@link TString Justification}, {@link TString ProtectionCode}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetJustification() && isSetProtectionCode();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * AsgnAllotRef - Assignment or Allotment Serial (Optional)
   * <p>
   * The Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Common<?> assignmentAllotment;

  /**
   * Get the Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @return a {@link Common} instance
   * @since 3.1.0
   */
  public Common<?> getAssignmentAllotment() {
    return assignmentAllotment;
  }

  /**
   * Determine if the assignmentAllotment field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAssignmentAllotment() {
    return this.assignmentAllotment != null;
  }

  /**
   * Set the Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @param value An instances of type {@link Common<?>}
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withAssignmentAllotment(Common<?> value) {
    this.assignmentAllotment = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this JRFLEntry record.
   * <p>
   * This method builds the exported {@link #asgnAllotRef} field with values
   * from the transient {@link #assignmentAllotment} field. This method should
   * typically be called after the JRFLEntry is configured and (optionally)
   * before exporting an SSRF message.
   * <p>
   * @return The current JRFLEntry object instance
   */
  public JRFLEntry build() {
    this.asgnAllotRef = assignmentAllotment != null ? assignmentAllotment.getSerial() : null;
    return this;
  }//</editor-fold>

}
