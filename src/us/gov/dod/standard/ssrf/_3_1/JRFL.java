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
package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.jrfl.JRFLEntry;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * JRFL is the XML root for all parameters of a JRFL. It inherits attributes and
 * sub-elements from element Common.
 * <p>
 * Sub-Element is {@link JRFLEntry}
 * <p>
 * Example:
 * <pre>
 * &lt;JRFL cls="U"&gt;
 *   &lt;Serial cls="U"&gt;NLD::JR:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;JRFLEntry&gt;
 *     &lt;ProtectionCode cls="U"&gt;Protected&lt;/ProtectionCode&gt;
 *     &lt;Justification cls="U"&gt;distress frequency&lt;/Justification&gt;
 *     &lt;FreqMin cls="U"&gt;243&lt;/FreqMin&gt;
 *     &lt;Bandwidth cls="U"&gt;0.1&lt;/Bandwidth&gt;
 *   &lt;/JRFLEntry&gt;
 * &lt;/JRFL&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JRFL", propOrder = {
  "effectiveDateTime",
  "expirationDateTime",
  "reviewDate",
  "seconds",
  "minutes",
  "hours",
  "daysOfMonth",
  "months",
  "daysOfWeek",
  "years",
  "duration",
  "jrflEntry"
})
public class JRFL extends Common<JRFL> {

  /**
   * EffectiveDateTime - Effective Date/Time (Optional)
   * <p>
   * The width of the range (or band) of restricted frequency(s).
   * <p>
   * Format is DT
   */
  @XmlElement(name = "EffectiveDateTime", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar effectiveDateTime;
  /**
   * ExpirationDateTime - Expiration Date/Time (Optional)
   * <p>
   * The date at which the dataset will expire, formatted as yyyy-mmddThh:
   * mm:ssZ (year-month-day, "T" for time, hour:minute:seconds Zulu). To
   * indicate a real effective time, use values 00:00:01Z to 24:00:00Z. The
   * value 00:00:00Z is reserved to indicate that time is not an issue. The
   * Expiration date should be less than five years from the effective date.
   */
  @XmlElement(name = "ExpirationDateTime", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar expirationDateTime;
  /**
   * ReviewDate - Review Date (Optional)
   * <p>
   * A description of the justification of why the JRFL entry is required, to
   * support the spectrum manager.
   * <p>
   * Format is DT
   * <p>
   * Attribute group ExpireReviewDT (Required)
   */
  @XmlElement(name = "ReviewDate", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  /**
   * Seconds - Seconds (Optionsl)
   * <p>
   * The seconds of hour [0-59]
   */
  @XmlElement(name = "Seconds", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMINSEC.class)
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
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMINSEC.class)
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
  @XmlTypeValidator(type = TString.class, value = XmlAdapterHOURS.class)
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
  @XmlTypeValidator(type = TString.class, value = XmlAdapterDAYSOFMONTH.class)
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
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMONTHS.class)
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
  @XmlTypeValidator(type = TString.class, value = XmlAdapterDAYSOFWEEK.class)
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
  @XmlTypeValidator(type = TString.class, value = XmlAdapterYEARS.class)
  private TString years;
  /**
   * Duration - Duration (Optional)
   * <p>
   * The number of minutes for which an event will live. Examples: possible
   * values for the Hours item:
   * <pre>
   * 8 one value: 08h00Z
   * 5,6,9 multiple values: 05h00Z, 06h00Z, 09h00Z
   * 5-8 range between 05h00Z and 08h00Z inclusive
   * star/2 stepped, every other hour. 00h00Z (midnight),
   * 02h00Z, 04h00Z, etc
   * 3-12/3 stepped range, every third hour: 03h00Z, 06h00Z,
   * 09h00Z, and 12h00Z
   * Transmission for 2 minutes every 10 minutes from 9am to 5pm every weekday for 2007:
   * %lt;Minutes%gt;star/10%lt;/Minutes%gt;
   * %lt;Hours%gt;9-17%lt;/Hours%gt;
   * %lt;DaysofWeek%gt;0-4%lt;/DaysofWeek%gt;
   * %lt;Years%gt;2007%lt;/Years%gt;
   * %lt;Duration%gt;2%lt;/Duration%gt;
   * On the 5-minute mark, every third hour, only on days of the work week (Mon-Fri)
   * %lt;Minutes%gt;5%lt;/Minutes%gt;
   * %lt;Hours%gt;star/3%lt;/Hours%gt;
   * %lt;DaysofWeek%gt;1-5%lt;/DaysofWeek%gt;
   * On the 20 and 50-minute marks every hour, every month except June, only on days of the work week (Mon-Fri)
   * %lt;Minutes%gt;20,50%lt;/Minutes%gt;
   * %lt;Months%gt;1-5,7-12%lt;/Months%gt;
   * %lt;DaysofWeek%gt;1-5%lt;/DaysofWeek%gt;
   * </pre> Format is UN(4) (min)
   * <p>
   * Attribute group TimeFrame (Optional)
   */
  @XmlElement(name = "Duration", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterDURATION_UN4.class)
  private TInteger duration;
  /**
   * JRFLEntryLocation (Optional)
   * <p>
   * JRFLEntryLocation defines the location where the use of a specific
   * frequency or frequency range(s) is restricted in use.
   */
  @XmlElement(name = "JRFLEntry", required = true)
  private Set<JRFLEntry> jrflEntry;

  /**
   * Get the width of the range (or band) of restricted frequency(s).
   * <p>
   * @return the EffectiveDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getEffectiveDateTime() {
    return effectiveDateTime;
  }

  /**
   * Set the width of the range (or band) of restricted frequency(s).
   * <p>
   * @param value the EffectiveDateTime value in a {@link TCalendar} data type
   */
  public void setEffectiveDateTime(TCalendar value) {
    this.effectiveDateTime = value;
  }

  /**
   * Determine if the EffectiveDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDateTime() {
    return (this.effectiveDateTime != null ? this.effectiveDateTime.isSetValue() : false);
  }

  /**
   * Get the date at which the dataset will expire. The Expiration date should
   * be less than five years from the effective date.
   * <p>
   * @return the ExpirationDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getExpirationDateTime() {
    return expirationDateTime;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from the effective date.
   * <p>
   * @param value the ExpirationDateTime value in a {@link TCalendar} data type
   */
  public void setExpirationDateTime(TCalendar value) {
    this.expirationDateTime = value;
  }

  /**
   * Determine if the ExpirationDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExpirationDateTime() {
    return (this.expirationDateTime != null ? this.expirationDateTime.isSetValue() : false);
  }

  /**
   * Get a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager.
   * <p>
   * @return the ReviewDate value in a {@link TCalendar} data type
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Set a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager.
   * <p>
   * @param value the ReviewDate value in a {@link TCalendar} data type
   */
  public void setReviewDate(TCalendar value) {
    this.reviewDate = value;
  }

  /**
   * Determine if the ReviewDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReviewDate() {
    return (this.reviewDate != null ? this.reviewDate.isSetValue() : false);
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
   * Get the number of minutes for which an event will live.
   * <p>
   * @return the Duration value in a {@link TInteger} data type
   */
  public TInteger getDuration() {
    return duration;
  }

  /**
   * Set the number of minutes for which an event will live.
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
   * Get the JRFLEntryLocation
   * <p>
   * Complex element JRFLEntryLocation defines the location where the use of a
   * specific frequency or frequency range(s) is restricted in use.
   * <p>
   * @return a non-null but possibly empty list of {@link JRFLEntry} instances
   */
  public Set<JRFLEntry> getJRFLEntry() {
    if (jrflEntry == null) {
      jrflEntry = new HashSet<>();
    }
    return this.jrflEntry;
  }

  /**
   * Determine if the JRFLEntry is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJRFLEntry() {
    return ((this.jrflEntry != null) && (!this.jrflEntry.isEmpty()));
  }

  /**
   * Clear the JRFLEntry field. This sets the field to null.
   */
  public void unsetJRFLEntry() {
    this.jrflEntry = null;
  }

  /**
   * Set the width of the range (or band) of restricted frequency(s).
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current JRFL object instance
   */
  public JRFL withEffectiveDateTime(Calendar value) {
    setEffectiveDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the width of the range (or band) of restricted frequency(s).
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current JRFL object instance
   */
  public JRFL withEffectiveDateTime(Date value) {
    setEffectiveDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current JRFL object instance
   */
  public JRFL withExpirationDateTime(Calendar value) {
    setExpirationDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current JRFL object instance
   */
  public JRFL withExpirationDateTime(Date value) {
    setExpirationDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current JRFL object instance
   */
  public JRFL withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current JRFL object instance
   */
  public JRFL withReviewDate(Date value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set Seconds,enter the seconds of hour [0-59]
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFL object instance
   */
  public JRFL withSeconds(String value) {
    setSeconds(new TString(value));
    return this;
  }

  /**
   * Set the minutes of an hour [0-59].
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFL object instance
   */
  public JRFL withMinutes(String value) {
    setMinutes(new TString(value));
    return this;
  }

  /**
   * Set the hours of a day [0-23] (UTC time).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFL object instance
   */
  public JRFL withHours(String value) {
    setHours(new TString(value));
    return this;
  }

  /**
   * Set the day of month [1-31].
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFL object instance
   */
  public JRFL withDaysOfMonth(String value) {
    setDaysOfMonth(new TString(value));
    return this;
  }

  /**
   * Set the month of year [1-12].
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFL object instance
   */
  public JRFL withMonths(String value) {
    setMonths(new TString(value));
    return this;
  }

  /**
   * Set the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc].
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFL object instance
   */
  public JRFL withDaysOfWeek(String value) {
    setDaysOfWeek(new TString(value));
    return this;
  }

  /**
   * Set the 4-digit year [1900..2100].
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFL object instance
   */
  public JRFL withYears(String value) {
    setYears(new TString(value));
    return this;
  }

  /**
   * Set the number of minutes for which an event will live.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current JRFL object instance
   */
  public JRFL withDuration(Integer value) {
    setDuration(new TInteger(value));
    return this;
  }

  /**
   * Set the JRFLEntryLocation
   * <p>
   * Complex element JRFLEntryLocation defines the location where the use of a
   * specific frequency or frequency range(s) is restricted in use.
   * <p>
   * @param values One or more instances of type {@link JRFLEntry}
   * @return The current JRFL object instance
   */
  public JRFL withJRFLEntry(JRFLEntry... values) {
    if (values != null) {
      getJRFLEntry().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the JRFLEntryLocation
   * <p>
   * Complex element JRFLEntryLocation defines the location where the use of a
   * specific frequency or frequency range(s) is restricted in use.
   * <p>
   * @param values A collection of {@link JRFLEntry} instances
   * @return The current JRFL object instance
   */
  public JRFL withJRFLEntry(Set<JRFLEntry> values) {
    if (values != null) {
      getJRFLEntry().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this JRFL instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "JRFL {"
      + (duration != null ? " duration [" + duration + "]" : "")
      + (months != null ? " months [" + months + "]" : "")
      + (jrflEntry != null ? " jrflEntry [" + jrflEntry + "]" : "")
      + (minutes != null ? " minutes [" + minutes + "]" : "")
      + (effectiveDateTime != null ? " effectiveDateTime [" + effectiveDateTime + "]" : "")
      + (seconds != null ? " seconds [" + seconds + "]" : "")
      + (hours != null ? " hours [" + hours + "]" : "")
      + (reviewDate != null ? " reviewDate [" + reviewDate + "]" : "")
      + (years != null ? " years [" + years + "]" : "")
      + (expirationDateTime != null ? " expirationDateTime [" + expirationDateTime + "]" : "")
      + (daysOfWeek != null ? " daysOfWeek [" + daysOfWeek + "]" : "")
      + (daysOfMonth != null ? " daysOfMonth [" + daysOfMonth + "]" : "")
      + "\n  JRFL." + super.toString() + "\n"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JRFL} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link JRFLEntry JRFLEntry}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetJRFLEntry();
  }

}
