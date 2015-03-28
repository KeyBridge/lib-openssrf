package us.gov.dod.standard.ssrf._3_1;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
JRFL is the XML root for all parameters of a JRFL. It inherits attributes and sub-elements from element Common.

Sub-Element is {@link JRFLEntry}

Example: <pre>
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
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
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
public class JRFL
    extends Common
{

/**
EffectiveDateTime  - Effective Date/Time (Optional) 

The width of the range (or band) of restricted frequency(s).

Format is DT
@since 3.1.0
*/
    @XmlElement(name = "EffectiveDateTime", required = false)
    private DT effectiveDateTime;
/**
In Data Item ExpirationDateTime, In Data Item ExpirationDateTime, enter the date at which the dataset will expire, formatted as yyyy-mmddThh: mm:ssZ (year-month-day, "T" for time, hour:minute:seconds Zulu). To indicate a real effective time, use values 00:00:01Z to 24:00:00Z. The value 00:00:00Z is reserved to indicate that time is not an issue.  The Expiration date should be less than five years from the effective date.
@since 3.1.0
*/
    @XmlElement(name = "ExpirationDateTime", required = false)
    private DT expirationDateTime;
/**
ReviewDate  - Review Date (Optional) 

A description of the justification of why the JRFL entry is required, to support the spectrum manager.

Format is DT

Attribute group ExpireReviewDT (Required)
@since 3.1.0
*/
    @XmlElement(name = "ReviewDate", required = false)
    private D reviewDate;
/**
In Data Item Seconds,enter the seconds of hour [0-59]
@since 3.1.0
*/
    @XmlElement(name = "Seconds", required = false)
    private MinSec seconds;
/**
Minutes  - Minutes  (Optional) 

The minutes of an hour [0-59].

Format is pattern (S40)

Attribute group TimeFrame (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Minutes", required = false)
    private MinSec minutes;
/**
Hours  - Hours  (Optional) 

The hours of a day [0-23] (UTC time).

Format is pattern (S40)

Attribute group TimeFrame (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Hours", required = false)
    private Hours hours;
/**
DaysOfMonth  - Days Of Month (Optional) 

The day of month [1-31].

Format is pattern (S40)

Attribute group TimeFrame (Optional)
@since 3.1.0
*/
    @XmlElement(name = "DaysOfMonth", required = false)
    private DaysOfMonth daysOfMonth;
/**
Months  - Months  (Optional) 

The month of year [1-12].

Format is pattern (S40)

Attribute group TimeFrame (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Months", required = false)
    private Months months;
/**
DaysOfWeek - Days of Week  (Optional) 

The weekday [0-7 where 0 and 7 are for Sunday, 1 for
Monday, etc].

Format is pattern (S40)

Attribute group TimeFrame (Optional)
@since 3.1.0
*/
    @XmlElement(name = "DaysOfWeek", required = false)
    private DaysOfWeek daysOfWeek;
/**
Years  - Years  (Optional) 

The 4-digit year [1900..2100].

Format is pattern (S40)

Attribute group TimeFrame (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Years", required = false)
    private Years years;
/**
Duration  - Duration (Optional) 

The number of minutes for which an event will live.
Examples:
possible values for the Hours item:
8 one value: 08h00Z
5,6,9 multiple values: 05h00Z, 06h00Z, 09h00Z
5-8 range between 05h00Z and 08h00Z inclusive
star/2 stepped, every other hour. 00h00Z (midnight),
02h00Z, 04h00Z, etc
3-12/3 stepped range, every third hour: 03h00Z, 06h00Z,
09h00Z, and 12h00Z
Transmission for 2 minutes every 10 minutes from 9am to 5pm every weekday for 2007:
%lt;Minutes%gt;star/10%lt;/Minutes%gt;
%lt;Hours%gt;9-17%lt;/Hours%gt;
%lt;DaysofWeek%gt;0-4%lt;/DaysofWeek%gt;
%lt;Years%gt;2007%lt;/Years%gt;
%lt;Duration%gt;2%lt;/Duration%gt;
On the 5-minute mark, every third hour, only on days of the work week (Mon-Fri)
%lt;Minutes%gt;5%lt;/Minutes%gt;
%lt;Hours%gt;star/3%lt;/Hours%gt;
%lt;DaysofWeek%gt;1-5%lt;/DaysofWeek%gt;
On the 20 and 50-minute marks every hour, every month except June, only on days of the work week (Mon-Fri)
%lt;Minutes%gt;20,50%lt;/Minutes%gt;
%lt;Months%gt;1-5,7-12%lt;/Months%gt;
%lt;DaysofWeek%gt;1-5%lt;/DaysofWeek%gt;

Format is UN(4) (min)

Attribute group TimeFrame (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Duration", required = false)
    private Duration_UN4 duration;
/**
This data element defines the protection and priority codes for those nets (frequencies) that are listed in the Joint Restricted Frequency List (JRFL). A JRFL entry may either refer to an existing Assignment/Allotment (in this case, use the sub-element AsgnAllotRef) or to an arbitrary set of frequencies (in this case describe the frequency/range, its user, location and duration). In the case of an arbitrary set of frequencies, if multiple organisations are listed they will all use the same set of frequencies; if it is not the case, split the JRFL entry into several entries.
@since 3.1.0
*/
    @XmlElement(name = "JRFLEntry", required = true)
      private  Set<JRFLEntry> jrflEntry;

/**
Get the width of the range (or band) of restricted frequency(s).

@return the EffectiveDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public DT getEffectiveDateTime() {
        return effectiveDateTime;
    }

/**
Set the width of the range (or band) of restricted frequency(s).

@param value the EffectiveDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public void setEffectiveDateTime(DT value) {
        this.effectiveDateTime = value;
    }

/**
Determine if the EffectiveDateTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEffectiveDateTime() {
        return (this.effectiveDateTime!= null);
    }

/**
Get In Data Item ExpirationDateTime, In Data Item ExpirationDateTime, enter the date at which the dataset will expire, formatted as yyyy-mmddThh: mm:ssZ (year-month-day, "T" for time, hour:minute:seconds Zulu). To indicate a real effective time, use values 00:00:01Z to 24:00:00Z. The value 00:00:00Z is reserved to indicate that time is not an issue.  The Expiration date should be less than five years from the effective date.

@return the ExpirationDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public DT getExpirationDateTime() {
        return expirationDateTime;
    }

/**
Set In Data Item ExpirationDateTime, In Data Item ExpirationDateTime, enter the date at which the dataset will expire, formatted as yyyy-mmddThh: mm:ssZ (year-month-day, "T" for time, hour:minute:seconds Zulu). To indicate a real effective time, use values 00:00:01Z to 24:00:00Z. The value 00:00:00Z is reserved to indicate that time is not an issue.  The Expiration date should be less than five years from the effective date.

@param value the ExpirationDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public void setExpirationDateTime(DT value) {
        this.expirationDateTime = value;
    }

/**
Determine if the ExpirationDateTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetExpirationDateTime() {
        return (this.expirationDateTime!= null);
    }

/**
Get a description of the justification of why the JRFL entry is required, to support the spectrum manager.

@return the ReviewDate value in a {@link TD} data type
@since 3.1.0
*/
public D getReviewDate() {
        return reviewDate;
    }

/**
Set a description of the justification of why the JRFL entry is required, to support the spectrum manager.

@param value the ReviewDate value in a {@link TD} data type
@since 3.1.0
*/
public void setReviewDate(D value) {
        this.reviewDate = value;
    }

/**
Determine if the ReviewDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetReviewDate() {
        return (this.reviewDate!= null);
    }

/**
Get In Data Item Seconds,enter the seconds of hour [0-59]

@return the Seconds value in a {@link TMinSec} data type
@since 3.1.0
*/
public MinSec getSeconds() {
        return seconds;
    }

/**
Set In Data Item Seconds,enter the seconds of hour [0-59]

@param value the Seconds value in a {@link TMinSec} data type
@since 3.1.0
*/
public void setSeconds(MinSec value) {
        this.seconds = value;
    }

/**
Determine if the Seconds is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSeconds() {
        return (this.seconds!= null);
    }

/**
Get the minutes of an hour [0-59].

@return the Minutes value in a {@link TMinSec} data type
@since 3.1.0
*/
public MinSec getMinutes() {
        return minutes;
    }

/**
Set the minutes of an hour [0-59].

@param value the Minutes value in a {@link TMinSec} data type
@since 3.1.0
*/
public void setMinutes(MinSec value) {
        this.minutes = value;
    }

/**
Determine if the Minutes is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMinutes() {
        return (this.minutes!= null);
    }

/**
Get the hours of a day [0-23] (UTC time).

@return the Hours value in a {@link THours} data type
@since 3.1.0
*/
public Hours getHours() {
        return hours;
    }

/**
Set the hours of a day [0-23] (UTC time).

@param value the Hours value in a {@link THours} data type
@since 3.1.0
*/
public void setHours(Hours value) {
        this.hours = value;
    }

/**
Determine if the Hours is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetHours() {
        return (this.hours!= null);
    }

/**
Get the day of month [1-31].

@return the DaysOfMonth value in a {@link TDaysOfMonth} data type
@since 3.1.0
*/
public DaysOfMonth getDaysOfMonth() {
        return daysOfMonth;
    }

/**
Set the day of month [1-31].

@param value the DaysOfMonth value in a {@link TDaysOfMonth} data type
@since 3.1.0
*/
public void setDaysOfMonth(DaysOfMonth value) {
        this.daysOfMonth = value;
    }

/**
Determine if the DaysOfMonth is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDaysOfMonth() {
        return (this.daysOfMonth!= null);
    }

/**
Get the month of year [1-12].

@return the Months value in a {@link TMonths} data type
@since 3.1.0
*/
public Months getMonths() {
        return months;
    }

/**
Set the month of year [1-12].

@param value the Months value in a {@link TMonths} data type
@since 3.1.0
*/
public void setMonths(Months value) {
        this.months = value;
    }

/**
Determine if the Months is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMonths() {
        return (this.months!= null);
    }

/**
Get the weekday [0-7 where 0 and 7 are for Sunday, 1 for
Monday, etc].

@return the DaysOfWeek value in a {@link TDaysOfWeek} data type
@since 3.1.0
*/
public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

/**
Set the weekday [0-7 where 0 and 7 are for Sunday, 1 for
Monday, etc].

@param value the DaysOfWeek value in a {@link TDaysOfWeek} data type
@since 3.1.0
*/
public void setDaysOfWeek(DaysOfWeek value) {
        this.daysOfWeek = value;
    }

/**
Determine if the DaysOfWeek is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDaysOfWeek() {
        return (this.daysOfWeek!= null);
    }

/**
Get the 4-digit year [1900..2100].

@return the Years value in a {@link TYears} data type
@since 3.1.0
*/
public Years getYears() {
        return years;
    }

/**
Set the 4-digit year [1900..2100].

@param value the Years value in a {@link TYears} data type
@since 3.1.0
*/
public void setYears(Years value) {
        this.years = value;
    }

/**
Determine if the Years is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetYears() {
        return (this.years!= null);
    }

/**
Get the number of minutes for which an event will live.
Examples:
possible values for the Hours item:
8 one value: 08h00Z
5,6,9 multiple values: 05h00Z, 06h00Z, 09h00Z
5-8 range between 05h00Z and 08h00Z inclusive
star/2 stepped, every other hour. 00h00Z (midnight),
02h00Z, 04h00Z, etc
3-12/3 stepped range, every third hour: 03h00Z, 06h00Z,
09h00Z, and 12h00Z
Transmission for 2 minutes every 10 minutes from 9am to 5pm every weekday for 2007:
<Minutes>star/10</Minutes>
<Hours>9-17</Hours>
<DaysofWeek>0-4</DaysofWeek>
<Years>2007</Years>
<Duration>2</Duration>
On the 5-minute mark, every third hour, only on days of the work week (Mon-Fri)
<Minutes>5</Minutes>
<Hours>star/3</Hours>
<DaysofWeek>1-5</DaysofWeek>
On the 20 and 50-minute marks every hour, every month except June, only on days of the work week (Mon-Fri)
<Minutes>20,50</Minutes>
<Months>1-5,7-12</Months>
<DaysofWeek>1-5</DaysofWeek>

@return the Duration value in a {@link TDuration_UN4} data type
@since 3.1.0
*/
public Duration_UN4 getDuration() {
        return duration;
    }

/**
Set the number of minutes for which an event will live.
Examples:
possible values for the Hours item:
8 one value: 08h00Z
5,6,9 multiple values: 05h00Z, 06h00Z, 09h00Z
5-8 range between 05h00Z and 08h00Z inclusive
star/2 stepped, every other hour. 00h00Z (midnight),
02h00Z, 04h00Z, etc
3-12/3 stepped range, every third hour: 03h00Z, 06h00Z,
09h00Z, and 12h00Z
Transmission for 2 minutes every 10 minutes from 9am to 5pm every weekday for 2007:
<Minutes>star/10</Minutes>
<Hours>9-17</Hours>
<DaysofWeek>0-4</DaysofWeek>
<Years>2007</Years>
<Duration>2</Duration>
On the 5-minute mark, every third hour, only on days of the work week (Mon-Fri)
<Minutes>5</Minutes>
<Hours>star/3</Hours>
<DaysofWeek>1-5</DaysofWeek>
On the 20 and 50-minute marks every hour, every month except June, only on days of the work week (Mon-Fri)
<Minutes>20,50</Minutes>
<Months>1-5,7-12</Months>
<DaysofWeek>1-5</DaysofWeek>

@param value the Duration value in a {@link TDuration_UN4} data type
@since 3.1.0
*/
public void setDuration(Duration_UN4 value) {
        this.duration = value;
    }

/**
Determine if the Duration is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDuration() {
        return (this.duration!= null);
    }

/**
Get the JRFLEntry

This data element defines the protection and priority codes for those nets (frequencies) that are listed in the Joint Restricted Frequency List (JRFL). A JRFL entry may either refer to an existing Assignment/Allotment (in this case, use the sub-element AsgnAllotRef) or to an arbitrary set of frequencies (in this case describe the frequency/range, its user, location and duration). In the case of an arbitrary set of frequencies, if multiple organisations are listed they will all use the same set of frequencies; if it is not the case, split the JRFL entry into several entries.

@return  a {@link JRFLEntry} instance
@since 3.1.0
*/
    public Set<JRFLEntry> getJRFLEntry() {
        if (jrflEntry == null) {
            jrflEntry = new HashSet<JRFLEntry>();
        }
        return this.jrflEntry;
    }

/**
Determine if the JRFLEntry is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetJRFLEntry() {
        return ((this.jrflEntry!= null)&&(!this.jrflEntry.isEmpty()));
    }

/**
  Clear the JRFLEntry field. This sets the field to null.
 */
    public void unsetJRFLEntry() {
        this.jrflEntry = null;
    }

/**
Set the width of the range (or band) of restricted frequency(s).

@param value  An instances of type {@link Calendar}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withEffectiveDateTime(Calendar value) {
           setEffectiveDateTime(new DT(value));
        return this;
    }
/**
Set the width of the range (or band) of restricted frequency(s).

@param value  An instances of type {@link Date}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withEffectiveDateTime(Date value) {
           setEffectiveDateTime(new DT(value));
        return this;
    }

/**
Set In Data Item ExpirationDateTime, In Data Item ExpirationDateTime, enter the date at which the dataset will expire, formatted as yyyy-mmddThh: mm:ssZ (year-month-day, "T" for time, hour:minute:seconds Zulu). To indicate a real effective time, use values 00:00:01Z to 24:00:00Z. The value 00:00:00Z is reserved to indicate that time is not an issue.  The Expiration date should be less than five years from the effective date.

@param value  An instances of type {@link Calendar}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withExpirationDateTime(Calendar value) {
           setExpirationDateTime(new DT(value));
        return this;
    }
/**
Set In Data Item ExpirationDateTime, In Data Item ExpirationDateTime, enter the date at which the dataset will expire, formatted as yyyy-mmddThh: mm:ssZ (year-month-day, "T" for time, hour:minute:seconds Zulu). To indicate a real effective time, use values 00:00:01Z to 24:00:00Z. The value 00:00:00Z is reserved to indicate that time is not an issue.  The Expiration date should be less than five years from the effective date.

@param value  An instances of type {@link Date}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withExpirationDateTime(Date value) {
           setExpirationDateTime(new DT(value));
        return this;
    }

/**
Set a description of the justification of why the JRFL entry is required, to support the spectrum manager.

@param value  An instances of type {@link Calendar}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withReviewDate(Calendar value) {
           setReviewDate(new D(value));
        return this;
    }
/**
Set a description of the justification of why the JRFL entry is required, to support the spectrum manager.

@param value  An instances of type {@link Date}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withReviewDate(Date value) {
           setReviewDate(new D(value));
        return this;
    }

/**
Set In Data Item Seconds,enter the seconds of hour [0-59]

@param value  An instances of type {@link String}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withSeconds(String value) {
           setSeconds(new MinSec(value));
        return this;
    }

/**
Set the minutes of an hour [0-59].

@param value  An instances of type {@link String}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withMinutes(String value) {
           setMinutes(new MinSec(value));
        return this;
    }

/**
Set the hours of a day [0-23] (UTC time).

@param value  An instances of type {@link String}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withHours(String value) {
           setHours(new Hours(value));
        return this;
    }

/**
Set the day of month [1-31].

@param value  An instances of type {@link String}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withDaysOfMonth(String value) {
           setDaysOfMonth(new DaysOfMonth(value));
        return this;
    }

/**
Set the month of year [1-12].

@param value  An instances of type {@link String}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withMonths(String value) {
           setMonths(new Months(value));
        return this;
    }

/**
Set the weekday [0-7 where 0 and 7 are for Sunday, 1 for
Monday, etc].

@param value  An instances of type {@link String}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withDaysOfWeek(String value) {
           setDaysOfWeek(new DaysOfWeek(value));
        return this;
    }

/**
Set the 4-digit year [1900..2100].

@param value  An instances of type {@link String}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withYears(String value) {
           setYears(new Years(value));
        return this;
    }

/**
Set the number of minutes for which an event will live.
Examples:
possible values for the Hours item:
8 one value: 08h00Z
5,6,9 multiple values: 05h00Z, 06h00Z, 09h00Z
5-8 range between 05h00Z and 08h00Z inclusive
star/2 stepped, every other hour. 00h00Z (midnight),
02h00Z, 04h00Z, etc
3-12/3 stepped range, every third hour: 03h00Z, 06h00Z,
09h00Z, and 12h00Z
Transmission for 2 minutes every 10 minutes from 9am to 5pm every weekday for 2007:
<Minutes>star/10</Minutes>
<Hours>9-17</Hours>
<DaysofWeek>0-4</DaysofWeek>
<Years>2007</Years>
<Duration>2</Duration>
On the 5-minute mark, every third hour, only on days of the work week (Mon-Fri)
<Minutes>5</Minutes>
<Hours>star/3</Hours>
<DaysofWeek>1-5</DaysofWeek>
On the 20 and 50-minute marks every hour, every month except June, only on days of the work week (Mon-Fri)
<Minutes>20,50</Minutes>
<Months>1-5,7-12</Months>
<DaysofWeek>1-5</DaysofWeek>

@param value  An instances of type {@link Integer}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withDuration(Integer value) {
           setDuration(new Duration_UN4(value));
        return this;
    }

/**
Set the JRFLEntry

This data element defines the protection and priority codes for those nets (frequencies) that are listed in the Joint Restricted Frequency List (JRFL). A JRFL entry may either refer to an existing Assignment/Allotment (in this case, use the sub-element AsgnAllotRef) or to an arbitrary set of frequencies (in this case describe the frequency/range, its user, location and duration). In the case of an arbitrary set of frequencies, if multiple organisations are listed they will all use the same set of frequencies; if it is not the case, split the JRFL entry into several entries.

@param values  One or more instances of type {@link JRFLEntry...}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withJRFLEntry(JRFLEntry... values) {
        if (values!= null) {
            for (JRFLEntry value: values) {
                getJRFLEntry().add(value);
            }
        }
        return this;
    }

/**
Set the JRFLEntry

This data element defines the protection and priority codes for those nets (frequencies) that are listed in the Joint Restricted Frequency List (JRFL). A JRFL entry may either refer to an existing Assignment/Allotment (in this case, use the sub-element AsgnAllotRef) or to an arbitrary set of frequencies (in this case describe the frequency/range, its user, location and duration). In the case of an arbitrary set of frequencies, if multiple organisations are listed they will all use the same set of frequencies; if it is not the case, split the JRFL entry into several entries.

@param values  A collection of {@link JRFLEntry} instances
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withJRFLEntry(Collection<JRFLEntry> values) {
        if (values!= null) {
            getJRFLEntry().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set the serial of the referenced Location.

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "LO".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"

@param value  An instances of type {@link Serial}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withCaseNum(CaseNum... values) {
        if (values!= null) {
            for (CaseNum value: values) {
                getCaseNum().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set 

@param values  A collection of {@link CaseNum} instances
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withExtReferenceRef(ExtReferenceRef... values) {
        if (values!= null) {
            for (ExtReferenceRef value: values) {
                getExtReferenceRef().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set 

@param values  A collection of {@link ExtReferenceRef} instances
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withRemarks(Remarks... values) {
        if (values!= null) {
            for (Remarks value: values) {
                getRemarks().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  A collection of {@link Remarks} instances
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withReleasability(ListCCY... values) {
        if (values!= null) {
            for (ListCCY value: values) {
                getReleasability().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  A collection of {@link Releasability} instances
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withRemarkRef(BigInteger... values) {
        if (values!= null) {
            for (BigInteger value: values) {
                getRemarkRef().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set 

@param values  A collection of {@link RemarkRef} instances
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withExtReferences(BigInteger... values) {
        if (values!= null) {
            for (BigInteger value: values) {
                getExtReferences().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  A collection of {@link ExtReferences} instances
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current JRFL object instance
@since 3.1.0
*/
    public JRFL withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this JRFL instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "JRFL {"
 + (daysOfMonth !=null? " daysOfMonth [" + daysOfMonth +"]" : "") 
 + (daysOfWeek !=null? " daysOfWeek [" + daysOfWeek +"]" : "") 
 + (duration !=null? " duration [" + duration +"]" : "") 
 + (effectiveDateTime !=null? " effectiveDateTime [" + effectiveDateTime +"]" : "") 
 + (expirationDateTime !=null? " expirationDateTime [" + expirationDateTime +"]" : "") 
 + (hours !=null? " hours [" + hours +"]" : "") 
 + (jrflEntry !=null? " jrflEntry [" + jrflEntry +"]" : "") 
 + (minutes !=null? " minutes [" + minutes +"]" : "") 
 + (months !=null? " months [" + months +"]" : "") 
 + (reviewDate !=null? " reviewDate [" + reviewDate +"]" : "") 
 + (seconds !=null? " seconds [" + seconds +"]" : "") 
 + (years !=null? " years [" + years +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link JRFL} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link Set<JRFLEntry> JRFLEntry}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetJRFLEntry();
}

}
