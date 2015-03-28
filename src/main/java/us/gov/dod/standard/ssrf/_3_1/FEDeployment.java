package us.gov.dod.standard.ssrf._3_1;

import us.gov.dod.standard.ssrf._3_1.*;
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
FEDeployment describes the deployment of a force element to a location. Each deployment has a period of time for which the deployment is valid described by the start and end date/time.

Sub-Elements are {@link AtWayPoint}, {@link Project}

Example: <pre>
* &lt;FEDeployment cls="U"&gt;
*   &lt;Serial cls="U"&gt;NLD::FD:123&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;FERef cls="U"&gt;NLD::FE:222&lt;/FERef&gt;
*   &lt;Type cls="U"&gt;Location-Current&lt;/Type&gt;
*   &lt;Months cls="U"&gt;1-2&lt;/Months&gt;
*   &lt;Years cls="U"&gt;2012&lt;/Years&gt;
*   &lt;LocationRef cls="U"&gt;NLD::LO:333&lt;/LocationRef&gt;
* &lt;/FEDeployment&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEDeployment", propOrder = {
    "feRef",
    "type",
    "num",
    "seconds",
    "minutes",
    "hours",
    "daysOfMonth",
    "months",
    "daysOfWeek",
    "years",
    "duration",
    "locationRef",
    "project",
    "atWaypoint"
})
public class FEDeployment
    extends Common
{

/**
FERef  - Force Element Serial (Required) 

The dataset identifier of the ForceElement being deployed.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "FERef", required = true)
      private  Serial feRef;
/**
Type  - Deployment Type (Required) 

The type of deployment.

Format is L:CFD
@since 3.1.0
*/
    @XmlElement(name = "Type", required = true)
      private  TString type;
/**
Num  - Number of deployed Force Elements (Optional) 

The quantity of Force Element referenced in FERef.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "Num", required = false)
    private UN6 num;
/**
Seconds  - Seconds  (Optional) 

The seconds of hour [0-59] that the Force element is planned for deployment.

Format is pattern (S40)

Attribute group TimeFrame (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Seconds", required = false)
    private MinSec seconds;
/**
Minutes  - Minutes  (Optional) 

The minutes of an hour [0-59] that the Force element is planned for deployment.

Format is pattern (S40)

Attribute group TimeFrame (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Minutes", required = false)
    private MinSec minutes;
/**
Hours  - Hours  (Optional) 

The hours of a day [0-23] (UTC time) that the Force element is planned for deployment.

Format is pattern (S40)

Attribute group TimeFrame (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Hours", required = false)
    private Hours hours;
/**
DaysOfMonth - Days Of Month  (Optional) 

The day of month [1-31] that the Force element is planned for deployment.

Format is pattern (S40)

Attribute group TimeFrame (Optional)
@since 3.1.0
*/
    @XmlElement(name = "DaysOfMonth", required = false)
    private DaysOfMonth daysOfMonth;
/**
Months  - Months  (Optional) 

The month of year [1-12] that the Force element is planned for deployment.

Format is pattern (S40)

Attribute group TimeFrame (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Months", required = false)
    private Months months;
/**
DaysOfWeek  - Days Of Week (Optional) 

The weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc] that the Force element is planned for deployment.

Format is pattern (S40)

Attribute group TimeFrame (Optional)
@since 3.1.0
*/
    @XmlElement(name = "DaysOfWeek", required = false)
    private DaysOfWeek daysOfWeek;
/**
Years  - Years  (Optional) 

The 4-digit year [1900..2100] that the Force element is planned for deployment.

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
Hours data item: 
8 = one value: 08h00Z
5,6,9 = multiple values: 05h00Z, 06h00Z, 09h00Z
5-8 = range between 05h00Z and 08h00Z, inclusive
star/2 = every 2nd hour, starting at midnight: 00h00Z, 02h00Z, 04h00Z, etc.
3-12/3 = every 3rd hour between 0300 and 1200, inclusive: 03h00Z, 06h00Z, 09h00Z, and 12h00Z 

Transmission for 2 minutes every 10 minutes from 0900 to 1700 every weekday for the year 2007: 
%lt;Minutes%gt;star/10%lt;/Minutes%gt; 
%lt;Hours%gt;9-17%lt;/Hours%gt; 
%lt;DaysofWeek%gt;0-4%lt;/DaysofWeek%gt; 
%lt;Years%gt;2007%lt;/Years%gt; 
%lt;Duration%gt;2%lt;/Duration%gt; 

On the 5-minute mark, every 3rd hour, Monday-Friday
%lt;Minutes%gt;5%lt;/Minutes%gt; 
%lt;Hours%gt;star/3%lt;/Hours%gt; 
%lt;DaysofWeek%gt;1-5%lt;/DaysofWeek%gt; 

On the 20 and 50-minute marks, every hour, every month except June, Monday-Friday
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
LocationRef  - Location Reference (Optional) 

The serial of the referenced Location.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "LocationRef", required = false)
    private Serial locationRef;
/**
Project (Optional)

Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other project name associated to the dataset.
@since 3.1.0
*/
    @XmlElement(name = "Project")
      private  Set<Project> project;
/**
AtWayPoint (Optional)

AtWayPoint defines a point in time at which a Force Element is at a given waypoint along a route.
@since 3.1.0
*/
    @XmlElement(name = "AtWaypoint")
      private  Set<AtWaypoint> atWaypoint;

/**
Get the dataset identifier of the ForceElement being deployed.

@return the FERef value in a {@link Serial} data type
@since 3.1.0
*/
public Serial getFERef() {
        return feRef;
    }

/**
Set the dataset identifier of the ForceElement being deployed.

@param value the FERef value in a {@link Serial} data type
@since 3.1.0
*/
public void setFERef(Serial value) {
        this.feRef = value;
    }

/**
Determine if the FERef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFERef() {
        return (this.feRef!= null);
    }

/**
Get the type of deployment.

@return the Type value in a {@link TString} data type
@since 3.1.0
*/
public TString getType() {
        return type;
    }

/**
Set the type of deployment.

@param value the Type value in a {@link TString} data type
@since 3.1.0
*/
public void setType(TString value) {
        this.type = value;
    }

/**
Determine if the Type is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetType() {
return (this.type!= null ? this.type.isSetValue() : false);
    }

/**
Get the quantity of Force Element referenced in FERef.

@return the Num value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNum() {
        return num;
    }

/**
Set the quantity of Force Element referenced in FERef.

@param value the Num value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNum(UN6 value) {
        this.num = value;
    }

/**
Determine if the Num is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNum() {
        return (this.num!= null);
    }

/**
Get the seconds of hour [0-59] that the Force element is planned for deployment.

@return the Seconds value in a {@link TMinSec} data type
@since 3.1.0
*/
public MinSec getSeconds() {
        return seconds;
    }

/**
Set the seconds of hour [0-59] that the Force element is planned for deployment.

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
Get the minutes of an hour [0-59] that the Force element is planned for deployment.

@return the Minutes value in a {@link TMinSec} data type
@since 3.1.0
*/
public MinSec getMinutes() {
        return minutes;
    }

/**
Set the minutes of an hour [0-59] that the Force element is planned for deployment.

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
Get the hours of a day [0-23] (UTC time) that the Force element is planned for deployment.

@return the Hours value in a {@link THours} data type
@since 3.1.0
*/
public Hours getHours() {
        return hours;
    }

/**
Set the hours of a day [0-23] (UTC time) that the Force element is planned for deployment.

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
Get the day of month [1-31] that the Force element is planned for deployment.

@return the DaysOfMonth value in a {@link TDaysOfMonth} data type
@since 3.1.0
*/
public DaysOfMonth getDaysOfMonth() {
        return daysOfMonth;
    }

/**
Set the day of month [1-31] that the Force element is planned for deployment.

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
Get the month of year [1-12] that the Force element is planned for deployment.

@return the Months value in a {@link TMonths} data type
@since 3.1.0
*/
public Months getMonths() {
        return months;
    }

/**
Set the month of year [1-12] that the Force element is planned for deployment.

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
Get the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc] that the Force element is planned for deployment.

@return the DaysOfWeek value in a {@link TDaysOfWeek} data type
@since 3.1.0
*/
public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

/**
Set the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc] that the Force element is planned for deployment.

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
Get the 4-digit year [1900..2100] that the Force element is planned for deployment.

@return the Years value in a {@link TYears} data type
@since 3.1.0
*/
public Years getYears() {
        return years;
    }

/**
Set the 4-digit year [1900..2100] that the Force element is planned for deployment.

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
Hours data item: 
8 = one value: 08h00Z
5,6,9 = multiple values: 05h00Z, 06h00Z, 09h00Z
5-8 = range between 05h00Z and 08h00Z, inclusive
star/2 = every 2nd hour, starting at midnight: 00h00Z, 02h00Z, 04h00Z, etc.
3-12/3 = every 3rd hour between 0300 and 1200, inclusive: 03h00Z, 06h00Z, 09h00Z, and 12h00Z 

Transmission for 2 minutes every 10 minutes from 0900 to 1700 every weekday for the year 2007: 
<Minutes>star/10</Minutes> 
<Hours>9-17</Hours> 
<DaysofWeek>0-4</DaysofWeek> 
<Years>2007</Years> 
<Duration>2</Duration> 

On the 5-minute mark, every 3rd hour, Monday-Friday
<Minutes>5</Minutes> 
<Hours>star/3</Hours> 
<DaysofWeek>1-5</DaysofWeek> 

On the 20 and 50-minute marks, every hour, every month except June, Monday-Friday
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
Hours data item: 
8 = one value: 08h00Z
5,6,9 = multiple values: 05h00Z, 06h00Z, 09h00Z
5-8 = range between 05h00Z and 08h00Z, inclusive
star/2 = every 2nd hour, starting at midnight: 00h00Z, 02h00Z, 04h00Z, etc.
3-12/3 = every 3rd hour between 0300 and 1200, inclusive: 03h00Z, 06h00Z, 09h00Z, and 12h00Z 

Transmission for 2 minutes every 10 minutes from 0900 to 1700 every weekday for the year 2007: 
<Minutes>star/10</Minutes> 
<Hours>9-17</Hours> 
<DaysofWeek>0-4</DaysofWeek> 
<Years>2007</Years> 
<Duration>2</Duration> 

On the 5-minute mark, every 3rd hour, Monday-Friday
<Minutes>5</Minutes> 
<Hours>star/3</Hours> 
<DaysofWeek>1-5</DaysofWeek> 

On the 20 and 50-minute marks, every hour, every month except June, Monday-Friday
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
Get the serial of the referenced Location.

@return the LocationRef value in a {@link Serial} data type
@since 3.1.0
*/
public Serial getLocationRef() {
        return locationRef;
    }

/**
Set the serial of the referenced Location.

@param value the LocationRef value in a {@link Serial} data type
@since 3.1.0
*/
public void setLocationRef(Serial value) {
        this.locationRef = value;
    }

/**
Determine if the LocationRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLocationRef() {
        return (this.locationRef!= null);
    }

/**
Get the Project

Complex element Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other project name associated to the dataset.

@return  a {@link Project} instance
@since 3.1.0
*/
    public Set<Project> getProject() {
        if (project == null) {
            project = new HashSet<Project>();
        }
        return this.project;
    }

/**
Determine if the Project is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetProject() {
        return ((this.project!= null)&&(!this.project.isEmpty()));
    }

/**
  Clear the Project field. This sets the field to null.
 */
    public void unsetProject() {
        this.project = null;
    }

/**
Get the AtWayPoint

Complex element AtWayPoint defines a point in time at which a Force Element is at a given waypoint along a route.

@return  a {@link AtWaypoint} instance
@since 3.1.0
*/
    public Set<AtWaypoint> getAtWaypoint() {
        if (atWaypoint == null) {
            atWaypoint = new HashSet<AtWaypoint>();
        }
        return this.atWaypoint;
    }

/**
Determine if the AtWaypoint is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAtWaypoint() {
        return ((this.atWaypoint!= null)&&(!this.atWaypoint.isEmpty()));
    }

/**
  Clear the AtWaypoint field. This sets the field to null.
 */
    public void unsetAtWaypoint() {
        this.atWaypoint = null;
    }

/**
Set the dataset identifier of the ForceElement being deployed.

@param value  An instances of type {@link Serial}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withFERef(TSerial value) {
        return this;
    }

/**
Set the type of deployment.

@param value  An instances of type {@link ListCFD}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withType(ListCFD value) {
        setType(new TString(value.value()));
        return this;
    }

/**
Set the quantity of Force Element referenced in FERef.

@param value  An instances of type {@link Integer}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withNum(Integer value) {
           setNum(new UN6(value));
        return this;
    }

/**
Set the seconds of hour [0-59] that the Force element is planned for deployment.

@param value  An instances of type {@link String}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withSeconds(String value) {
           setSeconds(new MinSec(value));
        return this;
    }

/**
Set the minutes of an hour [0-59] that the Force element is planned for deployment.

@param value  An instances of type {@link String}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withMinutes(String value) {
           setMinutes(new MinSec(value));
        return this;
    }

/**
Set the hours of a day [0-23] (UTC time) that the Force element is planned for deployment.

@param value  An instances of type {@link String}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withHours(String value) {
           setHours(new Hours(value));
        return this;
    }

/**
Set the day of month [1-31] that the Force element is planned for deployment.

@param value  An instances of type {@link String}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withDaysOfMonth(String value) {
           setDaysOfMonth(new DaysOfMonth(value));
        return this;
    }

/**
Set the month of year [1-12] that the Force element is planned for deployment.

@param value  An instances of type {@link String}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withMonths(String value) {
           setMonths(new Months(value));
        return this;
    }

/**
Set the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc] that the Force element is planned for deployment.

@param value  An instances of type {@link String}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withDaysOfWeek(String value) {
           setDaysOfWeek(new DaysOfWeek(value));
        return this;
    }

/**
Set the 4-digit year [1900..2100] that the Force element is planned for deployment.

@param value  An instances of type {@link String}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withYears(String value) {
           setYears(new Years(value));
        return this;
    }

/**
Set the number of minutes for which an event will live.
Examples:
Hours data item: 
8 = one value: 08h00Z
5,6,9 = multiple values: 05h00Z, 06h00Z, 09h00Z
5-8 = range between 05h00Z and 08h00Z, inclusive
star/2 = every 2nd hour, starting at midnight: 00h00Z, 02h00Z, 04h00Z, etc.
3-12/3 = every 3rd hour between 0300 and 1200, inclusive: 03h00Z, 06h00Z, 09h00Z, and 12h00Z 

Transmission for 2 minutes every 10 minutes from 0900 to 1700 every weekday for the year 2007: 
<Minutes>star/10</Minutes> 
<Hours>9-17</Hours> 
<DaysofWeek>0-4</DaysofWeek> 
<Years>2007</Years> 
<Duration>2</Duration> 

On the 5-minute mark, every 3rd hour, Monday-Friday
<Minutes>5</Minutes> 
<Hours>star/3</Hours> 
<DaysofWeek>1-5</DaysofWeek> 

On the 20 and 50-minute marks, every hour, every month except June, Monday-Friday
<Minutes>20,50</Minutes>
<Months>1-5,7-12</Months> 
<DaysofWeek>1-5</DaysofWeek>

@param value  An instances of type {@link Integer}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withDuration(Integer value) {
           setDuration(new Duration_UN4(value));
        return this;
    }

/**
Set the serial of the referenced Location.

@param value  An instances of type {@link Serial}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withLocationRef(Serial value) {
           setLocationRef(value);
        return this;
    }

/**
Set the Project

Complex element Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other project name associated to the dataset.

@param values  One or more instances of type {@link Project...}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withProject(Project... values) {
        if (values!= null) {
            for (Project value: values) {
                getProject().add(value);
            }
        }
        return this;
    }

/**
Set the Project

Complex element Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other project name associated to the dataset.

@param values  A collection of {@link Project} instances
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withProject(Collection<Project> values) {
        if (values!= null) {
            getProject().addAll(values);
        }
        return this;
    }

/**
Set the AtWayPoint

Complex element AtWayPoint defines a point in time at which a Force Element is at a given waypoint along a route.

@param values  One or more instances of type {@link AtWaypoint...}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withAtWaypoint(AtWaypoint... values) {
        if (values!= null) {
            for (AtWaypoint value: values) {
                getAtWaypoint().add(value);
            }
        }
        return this;
    }

/**
Set the AtWayPoint

Complex element AtWayPoint defines a point in time at which a Force Element is at a given waypoint along a route.

@param values  A collection of {@link AtWaypoint} instances
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withAtWaypoint(Collection<AtWaypoint> values) {
        if (values!= null) {
            getAtWaypoint().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withCaseNum(CaseNum... values) {
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
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withRemarks(Remarks... values) {
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
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withReleasability(ListCCY... values) {
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
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withRemarkRef(BigInteger... values) {
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
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withExtReferences(BigInteger... values) {
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
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current FEDeployment object instance
@since 3.1.0
*/
    public FEDeployment withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this FEDeployment instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "FEDeployment {"
 + (atWaypoint !=null? " atWaypoint [" + atWaypoint +"]" : "") 
 + (daysOfMonth !=null? " daysOfMonth [" + daysOfMonth +"]" : "") 
 + (daysOfWeek !=null? " daysOfWeek [" + daysOfWeek +"]" : "") 
 + (duration !=null? " duration [" + duration +"]" : "") 
 + (feRef !=null? " feRef [" + feRef +"]" : "") 
 + (hours !=null? " hours [" + hours +"]" : "") 
 + (locationRef !=null? " locationRef [" + locationRef +"]" : "") 
 + (minutes !=null? " minutes [" + minutes +"]" : "") 
 + (months !=null? " months [" + months +"]" : "") 
 + (num !=null? " num [" + num +"]" : "") 
 + (project !=null? " project [" + project +"]" : "") 
 + (seconds !=null? " seconds [" + seconds +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") 
 + (years !=null? " years [" + years +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link FEDeployment} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link Serial FERef}, {@link TString Type}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetFERef() &&  isSetType();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
FERef  - Force Element Serial (Required) 

The dataset identifier of the ForceElement being deployed.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private ForceElement forceElement;

/**
Get the dataset identifier of the ForceElement being deployed.

@return  a {@link ForceElement} instance
@since 3.1.0
*/
public ForceElement getForceElement(){
return forceElement;
}
/**
 Determine if the forceElement field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetForceElement() {
    return this.forceElement != null ;
}

/**
Set the dataset identifier of the ForceElement being deployed.

@param value  An instances of type {@link ForceElement}
@return The current FEDeployment object instance
@since 3.1.0
*/
public FEDeployment withForceElement(ForceElement value) {
this.forceElement = value;
return this;
}

  /**
   * Update the SSRF data type references in this FEDeployment record.
   * <p>
 */
  @Override
public void prepare() {
super.prepare();
this.feRef = forceElement !=null? forceElement.getSerial() : null;
}

/**
   * Update the SSRF data type references in this FEDeployment record after loading from XML.

   * This method builds the transient {@link #forceElement} with values
   * from the imported {@link #feRef} field. This method should
   * typically be called after the FEDeployment is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (feRef==null || !feRef.isSetValue() ) {return;}
for(ForceElement instance : root.getForceElement()) {
if(feRef.equals(instance.getSerial())){
forceElement = instance;
return;}
}}//</editor-fold>

}
