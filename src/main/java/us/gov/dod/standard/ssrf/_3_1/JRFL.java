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
package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EffectiveDateTime", required = false)
  private DT effectiveDateTime;
  /**
   * In Data Item ExpirationDateTime, In Data Item ExpirationDateTime, enter the
   * date at which the dataset will expire, formatted as yyyy-mmddThh: mm:ssZ
   * (year-month-day, "T" for time, hour:minute:seconds Zulu). To indicate a
   * real effective time, use values 00:00:01Z to 24:00:00Z. The value 00:00:00Z
   * is reserved to indicate that time is not an issue. The Expiration date
   * should be less than five years from the effective date.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ExpirationDateTime", required = false)
  private DT expirationDateTime;
  /**
   * ReviewDate - Review Date (Optional)
   * <p>
   * A description of the justification of why the JRFL entry is required, to
   * support the spectrum manager.
   * <p>
   * Format is DT
   * <p>
   * Attribute group ExpireReviewDT (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ReviewDate", required = false)
  private D reviewDate;
  /**
   * In Data Item Seconds,enter the seconds of hour [0-59]
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Seconds", required = false)
  private MinSec seconds;
  /**
   * Minutes - Minutes (Optional)
   * <p>
   * The minutes of an hour [0-59].
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Minutes", required = false)
  private MinSec minutes;
  /**
   * Hours - Hours (Optional)
   * <p>
   * The hours of a day [0-23] (UTC time).
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Hours", required = false)
  private Hours hours;
  /**
   * DaysOfMonth - Days Of Month (Optional)
   * <p>
   * The day of month [1-31].
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DaysOfMonth", required = false)
  private DaysOfMonth daysOfMonth;
  /**
   * Months - Months (Optional)
   * <p>
   * The month of year [1-12].
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Months", required = false)
  private Months months;
  /**
   * DaysOfWeek - Days of Week (Optional)
   * <p>
   * The weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc].
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DaysOfWeek", required = false)
  private DaysOfWeek daysOfWeek;
  /**
   * Years - Years (Optional)
   * <p>
   * The 4-digit year [1900..2100].
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Years", required = false)
  private Years years;
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Duration", required = false)
  private Duration_UN4 duration;
  /**
   * This data element defines the protection and priority codes for those nets
   * (frequencies) that are listed in the Joint Restricted Frequency List
   * (JRFL). A JRFL entry may either refer to an existing Assignment/Allotment
   * (in this case, use the sub-element AsgnAllotRef) or to an arbitrary set of
   * frequencies (in this case describe the frequency/range, its user, location
   * and duration). In the case of an arbitrary set of frequencies, if multiple
   * organisations are listed they will all use the same set of frequencies; if
   * it is not the case, split the JRFL entry into several entries.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JRFLEntry", required = true)
  private Set<JRFLEntry> jrflEntry;

  /**
   * No arg constructor. Initializes the Common required fields.
   */
  public JRFL() {
    super();
  }

  /**
   * Get the width of the range (or band) of restricted frequency(s)..
   * <p>
   * @return a {@link DT} instance
   * @since 3.1.0
   */
  public DT getEffectiveDateTime() {
    return effectiveDateTime;
  }

  /**
   * Set the width of the range (or band) of restricted frequency(s)..
   * <p>
   * @param value a {@link DT} instance
   * @since 3.1.0
   */
  public void setEffectiveDateTime(DT value) {
    this.effectiveDateTime = value;
  }

  /**
   * Determine if the EffectiveDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDateTime() {
    return (this.effectiveDateTime != null ? this.effectiveDateTime.isSetValue() : false);
  }

  /**
   * Get In Data Item ExpirationDateTime, In Data Item ExpirationDateTime, enter
   * the date at which the dataset will expire, formatted as yyyy-mmddThh:
   * mm:ssZ (year-month-day, "T" for time, hour:minute:seconds Zulu). To
   * indicate a real effective time, use values 00:00:01Z to 24:00:00Z. The
   * value 00:00:00Z is reserved to indicate that time is not an issue. The
   * Expiration date should be less than five years from the effective date..
   * <p>
   * @return a {@link DT} instance
   * @since 3.1.0
   */
  public DT getExpirationDateTime() {
    return expirationDateTime;
  }

  /**
   * Set In Data Item ExpirationDateTime, In Data Item ExpirationDateTime, enter
   * the date at which the dataset will expire, formatted as yyyy-mmddThh:
   * mm:ssZ (year-month-day, "T" for time, hour:minute:seconds Zulu). To
   * indicate a real effective time, use values 00:00:01Z to 24:00:00Z. The
   * value 00:00:00Z is reserved to indicate that time is not an issue. The
   * Expiration date should be less than five years from the effective date..
   * <p>
   * @param value a {@link DT} instance
   * @since 3.1.0
   */
  public void setExpirationDateTime(DT value) {
    this.expirationDateTime = value;
  }

  /**
   * Determine if the ExpirationDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExpirationDateTime() {
    return (this.expirationDateTime != null ? this.expirationDateTime.isSetValue() : false);
  }

  /**
   * Get a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getReviewDate() {
    return reviewDate;
  }

  /**
   * Set a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setReviewDate(D value) {
    this.reviewDate = value;
  }

  /**
   * Determine if the ReviewDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReviewDate() {
    return (this.reviewDate != null ? this.reviewDate.isSetValue() : false);
  }

  /**
   * Get In Data Item Seconds,enter the seconds of hour [0-59].
   * <p>
   * @return a {@link MinSec} instance
   * @since 3.1.0
   */
  public MinSec getSeconds() {
    return seconds;
  }

  /**
   * Set In Data Item Seconds,enter the seconds of hour [0-59].
   * <p>
   * @param value a {@link MinSec} instance
   * @since 3.1.0
   */
  public void setSeconds(MinSec value) {
    this.seconds = value;
  }

  /**
   * Determine if the Seconds is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSeconds() {
    return (this.seconds != null ? this.seconds.isSetValue() : false);
  }

  /**
   * Get the minutes of an hour [0-59]..
   * <p>
   * @return a {@link MinSec} instance
   * @since 3.1.0
   */
  public MinSec getMinutes() {
    return minutes;
  }

  /**
   * Set the minutes of an hour [0-59]..
   * <p>
   * @param value a {@link MinSec} instance
   * @since 3.1.0
   */
  public void setMinutes(MinSec value) {
    this.minutes = value;
  }

  /**
   * Determine if the Minutes is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMinutes() {
    return (this.minutes != null ? this.minutes.isSetValue() : false);
  }

  /**
   * Get the hours of a day [0-23] (UTC time)..
   * <p>
   * @return a {@link Hours} instance
   * @since 3.1.0
   */
  public Hours getHours() {
    return hours;
  }

  /**
   * Set the hours of a day [0-23] (UTC time)..
   * <p>
   * @param value a {@link Hours} instance
   * @since 3.1.0
   */
  public void setHours(Hours value) {
    this.hours = value;
  }

  /**
   * Determine if the Hours is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHours() {
    return (this.hours != null ? this.hours.isSetValue() : false);
  }

  /**
   * Get the day of month [1-31]..
   * <p>
   * @return a {@link DaysOfMonth} instance
   * @since 3.1.0
   */
  public DaysOfMonth getDaysOfMonth() {
    return daysOfMonth;
  }

  /**
   * Set the day of month [1-31]..
   * <p>
   * @param value a {@link DaysOfMonth} instance
   * @since 3.1.0
   */
  public void setDaysOfMonth(DaysOfMonth value) {
    this.daysOfMonth = value;
  }

  /**
   * Determine if the DaysOfMonth is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDaysOfMonth() {
    return (this.daysOfMonth != null ? this.daysOfMonth.isSetValue() : false);
  }

  /**
   * Get the month of year [1-12]..
   * <p>
   * @return a {@link Months} instance
   * @since 3.1.0
   */
  public Months getMonths() {
    return months;
  }

  /**
   * Set the month of year [1-12]..
   * <p>
   * @param value a {@link Months} instance
   * @since 3.1.0
   */
  public void setMonths(Months value) {
    this.months = value;
  }

  /**
   * Determine if the Months is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMonths() {
    return (this.months != null ? this.months.isSetValue() : false);
  }

  /**
   * Get the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc]..
   * <p>
   * @return a {@link DaysOfWeek} instance
   * @since 3.1.0
   */
  public DaysOfWeek getDaysOfWeek() {
    return daysOfWeek;
  }

  /**
   * Set the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc]..
   * <p>
   * @param value a {@link DaysOfWeek} instance
   * @since 3.1.0
   */
  public void setDaysOfWeek(DaysOfWeek value) {
    this.daysOfWeek = value;
  }

  /**
   * Determine if the DaysOfWeek is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDaysOfWeek() {
    return (this.daysOfWeek != null ? this.daysOfWeek.isSetValue() : false);
  }

  /**
   * Get the 4-digit year [1900..2100]..
   * <p>
   * @return a {@link Years} instance
   * @since 3.1.0
   */
  public Years getYears() {
    return years;
  }

  /**
   * Set the 4-digit year [1900..2100]..
   * <p>
   * @param value a {@link Years} instance
   * @since 3.1.0
   */
  public void setYears(Years value) {
    this.years = value;
  }

  /**
   * Determine if the Years is configured.
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
   * <DaysofWeek>1-5</DaysofWeek>.
   * <p>
   * @return a {@link Duration_UN4} instance
   * @since 3.1.0
   */
  public Duration_UN4 getDuration() {
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
   * <DaysofWeek>1-5</DaysofWeek>.
   * <p>
   * @param value a {@link Duration_UN4} instance
   * @since 3.1.0
   */
  public void setDuration(Duration_UN4 value) {
    this.duration = value;
  }

  /**
   * Determine if the Duration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDuration() {
    return (this.duration != null ? this.duration.isSetValue() : false);
  }

  /**
   * Get the JRFLEntry
   * <p>
   * This data element defines the protection and priority codes for those nets
   * (frequencies) that are listed in the Joint Restricted Frequency List
   * (JRFL). A JRFL entry may either refer to an existing Assignment/Allotment
   * (in this case, use the sub-element AsgnAllotRef) or to an arbitrary set of
   * frequencies (in this case describe the frequency/range, its user, location
   * and duration). In the case of an arbitrary set of frequencies, if multiple
   * organisations are listed they will all use the same set of frequencies; if
   * it is not the case, split the JRFL entry into several entries..
   * <p>
   * @return a {@link JRFLEntry} instance
   * @since 3.1.0
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
   * @param value An instances of type {@link Calendar}.
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withEffectiveDateTime(Calendar value) {
    setEffectiveDateTime(new DT(value));
    return this;
  }

  /**
   * Set the width of the range (or band) of restricted frequency(s).
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withEffectiveDateTime(Date value) {
    setEffectiveDateTime(new DT(value));
    return this;
  }

  /**
   * Set In Data Item ExpirationDateTime, In Data Item ExpirationDateTime, enter
   * the date at which the dataset will expire, formatted as yyyy-mmddThh:
   * mm:ssZ (year-month-day, "T" for time, hour:minute:seconds Zulu). To
   * indicate a real effective time, use values 00:00:01Z to 24:00:00Z. The
   * value 00:00:00Z is reserved to indicate that time is not an issue. The
   * Expiration date should be less than five years from the effective date.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withExpirationDateTime(Calendar value) {
    setExpirationDateTime(new DT(value));
    return this;
  }

  /**
   * Set In Data Item ExpirationDateTime, In Data Item ExpirationDateTime, enter
   * the date at which the dataset will expire, formatted as yyyy-mmddThh:
   * mm:ssZ (year-month-day, "T" for time, hour:minute:seconds Zulu). To
   * indicate a real effective time, use values 00:00:01Z to 24:00:00Z. The
   * value 00:00:00Z is reserved to indicate that time is not an issue. The
   * Expiration date should be less than five years from the effective date.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withExpirationDateTime(Date value) {
    setExpirationDateTime(new DT(value));
    return this;
  }

  /**
   * Set a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withReviewDate(Calendar value) {
    setReviewDate(new D(value));
    return this;
  }

  /**
   * Set a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withReviewDate(Date value) {
    setReviewDate(new D(value));
    return this;
  }

  /**
   * Set In Data Item Seconds,enter the seconds of hour [0-59]
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withSeconds(String value) {
    setSeconds(new MinSec(value));
    return this;
  }

  /**
   * Set the minutes of an hour [0-59].
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withMinutes(String value) {
    setMinutes(new MinSec(value));
    return this;
  }

  /**
   * Set the hours of a day [0-23] (UTC time).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withHours(String value) {
    setHours(new Hours(value));
    return this;
  }

  /**
   * Set the day of month [1-31].
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withDaysOfMonth(String value) {
    setDaysOfMonth(new DaysOfMonth(value));
    return this;
  }

  /**
   * Set the month of year [1-12].
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withMonths(String value) {
    setMonths(new Months(value));
    return this;
  }

  /**
   * Set the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc].
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withDaysOfWeek(String value) {
    setDaysOfWeek(new DaysOfWeek(value));
    return this;
  }

  /**
   * Set the 4-digit year [1900..2100].
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withYears(String value) {
    setYears(new Years(value));
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
   * @param value An instances of type {@link Integer}.
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withDuration(Integer value) {
    setDuration(new Duration_UN4(value));
    return this;
  }

  /**
   * Set the JRFLEntry
   * <p>
   * This data element defines the protection and priority codes for those nets
   * (frequencies) that are listed in the Joint Restricted Frequency List
   * (JRFL). A JRFL entry may either refer to an existing Assignment/Allotment
   * (in this case, use the sub-element AsgnAllotRef) or to an arbitrary set of
   * frequencies (in this case describe the frequency/range, its user, location
   * and duration). In the case of an arbitrary set of frequencies, if multiple
   * organisations are listed they will all use the same set of frequencies; if
   * it is not the case, split the JRFL entry into several entries.
   * <p>
   * @param values One or more instances of type {@link JRFLEntry...}.
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withJRFLEntry(JRFLEntry... values) {
    if (values != null) {
      getJRFLEntry().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the JRFLEntry
   * <p>
   * This data element defines the protection and priority codes for those nets
   * (frequencies) that are listed in the Joint Restricted Frequency List
   * (JRFL). A JRFL entry may either refer to an existing Assignment/Allotment
   * (in this case, use the sub-element AsgnAllotRef) or to an arbitrary set of
   * frequencies (in this case describe the frequency/range, its user, location
   * and duration). In the case of an arbitrary set of frequencies, if multiple
   * organisations are listed they will all use the same set of frequencies; if
   * it is not the case, split the JRFL entry into several entries.
   * <p>
   * @param values A collection of {@link JRFLEntry} instances
   * @return The current JRFL object instance.
   * @since 3.1.0
   */
  public JRFL withJRFLEntry(Collection<JRFLEntry> values) {
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
    return "\n  JRFL {"
           + (daysOfMonth != null ? " daysOfMonth [" + daysOfMonth + "]" : "")
           + (daysOfWeek != null ? " daysOfWeek [" + daysOfWeek + "]" : "")
           + (duration != null ? " duration [" + duration + "]" : "")
           + (effectiveDateTime != null ? " effectiveDateTime [" + effectiveDateTime + "]" : "")
           + (expirationDateTime != null ? " expirationDateTime [" + expirationDateTime + "]" : "")
           + (hours != null ? " hours [" + hours + "]" : "")
           + (minutes != null ? " minutes [" + minutes + "]" : "")
           + (months != null ? " months [" + months + "]" : "")
           + (reviewDate != null ? " reviewDate [" + reviewDate + "]" : "")
           + (seconds != null ? " seconds [" + seconds + "]" : "")
           + (years != null ? " years [" + years + "]" : "")
           + (jrflEntry != null ? " jrflEntry [" + jrflEntry + "]" : "")
           + super.toString();
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JRFL} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link Set<JRFLEntry> JRFLEntry}.
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
