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
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.allotment.Project;
import us.gov.dod.standard.ssrf._3_1.fedeployment.AtWaypoint;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCFD;

/**
 * FEDeployment describes the deployment of a force element to a location. Each
 * deployment has a period of time for which the deployment is valid described
 * by the start and end date/time.
 * <p>
 * Sub-Elements are {@link AtWayPoint}, {@link Project}
 * <p>
 * Example:
 * <pre>
 * &lt;FEDeployment cls="U"&gt;
 *   &lt;Serial cls="U"&gt;NLD::FD:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;FERef cls="U"&gt;NLD::FE:222&lt;/FERef&gt;
 *   &lt;Type cls="U"&gt;Location-Current&lt;/Type&gt;
 *   &lt;Months cls="U"&gt;1-2&lt;/Months&gt;
 *   &lt;Years cls="U"&gt;2012&lt;/Years&gt;
 *   &lt;LocationRef cls="U"&gt;NLD::LO:333&lt;/LocationRef&gt;
 * &lt;/FEDeployment&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
public class FEDeployment extends Common<FEDeployment> {

  /**
   * FERef - Force Element Serial (Required)
   * <p>
   * The dataset identifier of the ForceElement being deployed.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FERef", required = true)
  private Serial feRef;
  /**
   * Type - Deployment Type (Required)
   * <p>
   * The type of deployment.
   * <p>
   * Format is L:CFD
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = true)
  private TString type;
  /**
   * Num - Number of deployed Force Elements (Optional)
   * <p>
   * The quantity of Force Element referenced in FERef.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Num", required = false)
  private UN6 num;
  /**
   * Seconds - Seconds (Optional)
   * <p>
   * The seconds of hour [0-59] that the Force element is planned for
   * deployment.
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Seconds", required = false)
  private MinSec seconds;
  /**
   * Minutes - Minutes (Optional)
   * <p>
   * The minutes of an hour [0-59] that the Force element is planned for
   * deployment.
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
   * The hours of a day [0-23] (UTC time) that the Force element is planned for
   * deployment.
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
   * The day of month [1-31] that the Force element is planned for deployment.
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
   * The month of year [1-12] that the Force element is planned for deployment.
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
   * DaysOfWeek - Days Of Week (Optional)
   * <p>
   * The weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc] that the
   * Force element is planned for deployment.
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
   * The 4-digit year [1900..2100] that the Force element is planned for
   * deployment.
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
   * The number of minutes for which an event will live. Examples: Hours data
   * item: 8 = one value: 08h00Z 5,6,9 = multiple values: 05h00Z, 06h00Z, 09h00Z
   * 5-8 = range between 05h00Z and 08h00Z, inclusive star/2 = every 2nd hour,
   * starting at midnight: 00h00Z, 02h00Z, 04h00Z, etc. 3-12/3 = every 3rd hour
   * between 0300 and 1200, inclusive: 03h00Z, 06h00Z, 09h00Z, and 12h00Z
   * <p>
   * Transmission for 2 minutes every 10 minutes from 0900 to 1700 every weekday
   * for the year 2007: %lt;Minutes%gt;star/10%lt;/Minutes%gt;
   * %lt;Hours%gt;9-17%lt;/Hours%gt; %lt;DaysofWeek%gt;0-4%lt;/DaysofWeek%gt;
   * %lt;Years%gt;2007%lt;/Years%gt; %lt;Duration%gt;2%lt;/Duration%gt;
   * <p>
   * On the 5-minute mark, every 3rd hour, Monday-Friday
   * %lt;Minutes%gt;5%lt;/Minutes%gt; %lt;Hours%gt;star/3%lt;/Hours%gt;
   * %lt;DaysofWeek%gt;1-5%lt;/DaysofWeek%gt;
   * <p>
   * On the 20 and 50-minute marks, every hour, every month except June,
   * Monday-Friday %lt;Minutes%gt;20,50%lt;/Minutes%gt;
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
   * LocationRef - Location Reference (Optional)
   * <p>
   * The serial of the referenced Location.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LocationRef", required = false)
  private Serial locationRef;
  /**
   * Project (Optional)
   * <p>
   * Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other
   * project name associated to the dataset.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Project")
  private Set<Project> project;
  /**
   * AtWayPoint (Optional)
   * <p>
   * AtWayPoint defines a point in time at which a Force Element is at a given
   * waypoint along a route.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AtWaypoint")
  private Set<AtWaypoint> atWaypoint;

  /**
   * No arg constructor. Initializes the Common required fields.
   */
  public FEDeployment() {
    super();
  }

  /**
   * Get the dataset identifier of the ForceElement being deployed..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   */
  public Serial getFERef() {
    return feRef;
  }

  /**
   * Set the dataset identifier of the ForceElement being deployed..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   */
  public void setFERef(Serial value) {
    this.feRef = value;
  }

  /**
   * Determine if the FERef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFERef() {
    return (this.feRef != null ? this.feRef.isSetValue() : false);
  }

  /**
   * Get the type of deployment..
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of deployment..
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
   * Get the quantity of Force Element referenced in FERef..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getNum() {
    return num;
  }

  /**
   * Set the quantity of Force Element referenced in FERef..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setNum(UN6 value) {
    this.num = value;
  }

  /**
   * Determine if the Num is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNum() {
    return (this.num != null ? this.num.isSetValue() : false);
  }

  /**
   * Get the seconds of hour [0-59] that the Force element is planned for
   * deployment..
   * <p>
   * @return a {@link MinSec} instance
   * @since 3.1.0
   */
  public MinSec getSeconds() {
    return seconds;
  }

  /**
   * Set the seconds of hour [0-59] that the Force element is planned for
   * deployment..
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
   * Get the minutes of an hour [0-59] that the Force element is planned for
   * deployment..
   * <p>
   * @return a {@link MinSec} instance
   * @since 3.1.0
   */
  public MinSec getMinutes() {
    return minutes;
  }

  /**
   * Set the minutes of an hour [0-59] that the Force element is planned for
   * deployment..
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
   * Get the hours of a day [0-23] (UTC time) that the Force element is planned
   * for deployment..
   * <p>
   * @return a {@link Hours} instance
   * @since 3.1.0
   */
  public Hours getHours() {
    return hours;
  }

  /**
   * Set the hours of a day [0-23] (UTC time) that the Force element is planned
   * for deployment..
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
   * Get the day of month [1-31] that the Force element is planned for
   * deployment..
   * <p>
   * @return a {@link DaysOfMonth} instance
   * @since 3.1.0
   */
  public DaysOfMonth getDaysOfMonth() {
    return daysOfMonth;
  }

  /**
   * Set the day of month [1-31] that the Force element is planned for
   * deployment..
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
   * Get the month of year [1-12] that the Force element is planned for
   * deployment..
   * <p>
   * @return a {@link Months} instance
   * @since 3.1.0
   */
  public Months getMonths() {
    return months;
  }

  /**
   * Set the month of year [1-12] that the Force element is planned for
   * deployment..
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
   * Get the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc] that
   * the Force element is planned for deployment..
   * <p>
   * @return a {@link DaysOfWeek} instance
   * @since 3.1.0
   */
  public DaysOfWeek getDaysOfWeek() {
    return daysOfWeek;
  }

  /**
   * Set the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc] that
   * the Force element is planned for deployment..
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
   * Get the 4-digit year [1900..2100] that the Force element is planned for
   * deployment..
   * <p>
   * @return a {@link Years} instance
   * @since 3.1.0
   */
  public Years getYears() {
    return years;
  }

  /**
   * Set the 4-digit year [1900..2100] that the Force element is planned for
   * deployment..
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
   * Get the number of minutes for which an event will live. Examples: Hours
   * data item: 8 = one value: 08h00Z 5,6,9 = multiple values: 05h00Z, 06h00Z,
   * 09h00Z 5-8 = range between 05h00Z and 08h00Z, inclusive star/2 = every 2nd
   * hour, starting at midnight: 00h00Z, 02h00Z, 04h00Z, etc. 3-12/3 = every 3rd
   * hour between 0300 and 1200, inclusive: 03h00Z, 06h00Z, 09h00Z, and 12h00Z
   * <p>
   * Transmission for 2 minutes every 10 minutes from 0900 to 1700 every weekday
   * for the year 2007:
   * <Minutes>star/10</Minutes>
   * <Hours>9-17</Hours>
   * <DaysofWeek>0-4</DaysofWeek>
   * <Years>2007</Years>
   * <Duration>2</Duration>
   * <p>
   * On the 5-minute mark, every 3rd hour, Monday-Friday
   * <Minutes>5</Minutes>
   * <Hours>star/3</Hours>
   * <DaysofWeek>1-5</DaysofWeek>
   * <p>
   * On the 20 and 50-minute marks, every hour, every month except June,
   * Monday-Friday
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
   * Set the number of minutes for which an event will live. Examples: Hours
   * data item: 8 = one value: 08h00Z 5,6,9 = multiple values: 05h00Z, 06h00Z,
   * 09h00Z 5-8 = range between 05h00Z and 08h00Z, inclusive star/2 = every 2nd
   * hour, starting at midnight: 00h00Z, 02h00Z, 04h00Z, etc. 3-12/3 = every 3rd
   * hour between 0300 and 1200, inclusive: 03h00Z, 06h00Z, 09h00Z, and 12h00Z
   * <p>
   * Transmission for 2 minutes every 10 minutes from 0900 to 1700 every weekday
   * for the year 2007:
   * <Minutes>star/10</Minutes>
   * <Hours>9-17</Hours>
   * <DaysofWeek>0-4</DaysofWeek>
   * <Years>2007</Years>
   * <Duration>2</Duration>
   * <p>
   * On the 5-minute mark, every 3rd hour, Monday-Friday
   * <Minutes>5</Minutes>
   * <Hours>star/3</Hours>
   * <DaysofWeek>1-5</DaysofWeek>
   * <p>
   * On the 20 and 50-minute marks, every hour, every month except June,
   * Monday-Friday
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
   * Get the serial of the referenced Location..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   */
  public Serial getLocationRef() {
    return locationRef;
  }

  /**
   * Set the serial of the referenced Location..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   */
  public void setLocationRef(Serial value) {
    this.locationRef = value;
  }

  /**
   * Determine if the LocationRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocationRef() {
    return (this.locationRef != null ? this.locationRef.isSetValue() : false);
  }

  /**
   * Get the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset..
   * <p>
   * @return a {@link Project} instance
   * @since 3.1.0
   */
  public Set<Project> getProject() {
    if (project == null) {
      project = new HashSet<>();
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
   * Get the AtWayPoint
   * <p>
   * Complex element AtWayPoint defines a point in time at which a Force Element
   * is at a given waypoint along a route..
   * <p>
   * @return a {@link AtWaypoint} instance
   * @since 3.1.0
   */
  public Set<AtWaypoint> getAtWaypoint() {
    if (atWaypoint == null) {
      atWaypoint = new HashSet<>();
    }
    return this.atWaypoint;
  }

  /**
   * Determine if the AtWaypoint is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAtWaypoint() {
    return ((this.atWaypoint != null) && (!this.atWaypoint.isEmpty()));
  }

  /**
   * Clear the AtWaypoint field. This sets the field to null.
   */
  public void unsetAtWaypoint() {
    this.atWaypoint = null;
  }

  /**
   * Set the dataset identifier of the ForceElement being deployed.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withFERef(Serial value) {
    setFERef(value);
    return this;
  }

  /**
   * Set the type of deployment.
   * <p>
   * @param value An instances of type {@link ListCFD}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withType(ListCFD value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the quantity of Force Element referenced in FERef.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withNum(Integer value) {
    setNum(new UN6(value));
    return this;
  }

  /**
   * Set the seconds of hour [0-59] that the Force element is planned for
   * deployment.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withSeconds(String value) {
    setSeconds(new MinSec(value));
    return this;
  }

  /**
   * Set the minutes of an hour [0-59] that the Force element is planned for
   * deployment.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withMinutes(String value) {
    setMinutes(new MinSec(value));
    return this;
  }

  /**
   * Set the hours of a day [0-23] (UTC time) that the Force element is planned
   * for deployment.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withHours(String value) {
    setHours(new Hours(value));
    return this;
  }

  /**
   * Set the day of month [1-31] that the Force element is planned for
   * deployment.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withDaysOfMonth(String value) {
    setDaysOfMonth(new DaysOfMonth(value));
    return this;
  }

  /**
   * Set the month of year [1-12] that the Force element is planned for
   * deployment.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withMonths(String value) {
    setMonths(new Months(value));
    return this;
  }

  /**
   * Set the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc] that
   * the Force element is planned for deployment.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withDaysOfWeek(String value) {
    setDaysOfWeek(new DaysOfWeek(value));
    return this;
  }

  /**
   * Set the 4-digit year [1900..2100] that the Force element is planned for
   * deployment.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withYears(String value) {
    setYears(new Years(value));
    return this;
  }

  /**
   * Set the number of minutes for which an event will live. Examples: Hours
   * data item: 8 = one value: 08h00Z 5,6,9 = multiple values: 05h00Z, 06h00Z,
   * 09h00Z 5-8 = range between 05h00Z and 08h00Z, inclusive star/2 = every 2nd
   * hour, starting at midnight: 00h00Z, 02h00Z, 04h00Z, etc. 3-12/3 = every 3rd
   * hour between 0300 and 1200, inclusive: 03h00Z, 06h00Z, 09h00Z, and 12h00Z
   * <p>
   * Transmission for 2 minutes every 10 minutes from 0900 to 1700 every weekday
   * for the year 2007:
   * <Minutes>star/10</Minutes>
   * <Hours>9-17</Hours>
   * <DaysofWeek>0-4</DaysofWeek>
   * <Years>2007</Years>
   * <Duration>2</Duration>
   * <p>
   * On the 5-minute mark, every 3rd hour, Monday-Friday
   * <Minutes>5</Minutes>
   * <Hours>star/3</Hours>
   * <DaysofWeek>1-5</DaysofWeek>
   * <p>
   * On the 20 and 50-minute marks, every hour, every month except June,
   * Monday-Friday
   * <Minutes>20,50</Minutes>
   * <Months>1-5,7-12</Months>
   * <DaysofWeek>1-5</DaysofWeek>
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withDuration(Integer value) {
    setDuration(new Duration_UN4(value));
    return this;
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withLocationRef(Serial value) {
    setLocationRef(value);
    return this;
  }

  /**
   * Set the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset.
   * <p>
   * @param values One or more instances of type {@link Project...}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withProject(Project... values) {
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
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withProject(Collection<Project> values) {
    if (values != null) {
      getProject().addAll(values);
    }
    return this;
  }

  /**
   * Set the AtWayPoint
   * <p>
   * Complex element AtWayPoint defines a point in time at which a Force Element
   * is at a given waypoint along a route.
   * <p>
   * @param values One or more instances of type {@link AtWaypoint...}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withAtWaypoint(AtWaypoint... values) {
    if (values != null) {
      getAtWaypoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AtWayPoint
   * <p>
   * Complex element AtWayPoint defines a point in time at which a Force Element
   * is at a given waypoint along a route.
   * <p>
   * @param values A collection of {@link AtWaypoint} instances
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withAtWaypoint(Collection<AtWaypoint> values) {
    if (values != null) {
      getAtWaypoint().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this FEDeployment instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  FEDeployment {"
           + (atWaypoint != null ? " atWaypoint [" + atWaypoint + "]" : "")
           + (daysOfMonth != null ? " daysOfMonth [" + daysOfMonth + "]" : "")
           + (daysOfWeek != null ? " daysOfWeek [" + daysOfWeek + "]" : "")
           + (duration != null ? " duration [" + duration + "]" : "")
           + (feRef != null ? " feRef [" + feRef + "]" : "")
           + (hours != null ? " hours [" + hours + "]" : "")
           + (locationRef != null ? " locationRef [" + locationRef + "]" : "")
           + (minutes != null ? " minutes [" + minutes + "]" : "")
           + (months != null ? " months [" + months + "]" : "")
           + (num != null ? " num [" + num + "]" : "")
           + (project != null ? " project [" + project + "]" : "")
           + (seconds != null ? " seconds [" + seconds + "]" : "")
           + (type != null ? " type [" + type + "]" : "")
           + (years != null ? " years [" + years + "]" : "")
           + super.toString();
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link FEDeployment} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link Serial FERef}, {@link TString Type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetFERef() && isSetType();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * FERef - Force Element Serial (Required)
   * <p>
   * The dataset identifier of the ForceElement being deployed.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private ForceElement forceElement;

  /**
   * Get the dataset identifier of the ForceElement being deployed..
   * <p>
   * @return a {@link ForceElement} instance
   * @since 3.1.0
   */
  public ForceElement getForceElement() {
    return forceElement;
  }

  /**
   * Determine if the forceElement field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetForceElement() {
    return this.forceElement != null;
  }

  /**
   * Set the dataset identifier of the ForceElement being deployed.
   * <p>
   * @param value An instances of type {@link ForceElement}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withForceElement(ForceElement value) {
    this.forceElement = value;
    return this;
  }

  /**
   * US:LocationRef - Plan Location Serial (Optional)
   * <p>
   * The unique reference serial of an existing Location dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Location location;

  /**
   * Get the unique reference serial of an existing Location dataset..
   * <p>
   * @return a {@link Location} instance
   * @since 3.1.0
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Determine if the location field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocation() {
    return this.location != null;
  }

  /**
   * Set the unique reference serial of an existing Location dataset.
   * <p>
   * @param value An instances of type {@link Location}.
   * @return The current FEDeployment object instance.
   * @since 3.1.0
   */
  public FEDeployment withLocation(Location value) {
    this.location = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this FEDeployment record.
   * <p>
   * This method builds the exported {@link #feRef} field with values from the
   * transient {@link #forceElement} field. This method should typically be
   * called after the FEDeployment is configured and (optionally) before
   * exporting an SSRF message.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void prepare() {
    super.prepare();
    this.feRef = forceElement != null ? forceElement.getSerial() : this.feRef;
    this.locationRef = location != null ? location.getSerial() : this.locationRef;
  }

  /**
   * Update the SSRF data type references in this FEDeployment record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #forceElement} with values from the
   * imported {@link #feRef} field. This method should typically be called after
   * the FEDeployment is imported from XML. * @param root the SSRF root
   * instance.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (feRef == null || !feRef.isSetValue()) {
      return;
    }
    for (ForceElement instance : root.getForceElement()) {
      if (feRef.equals(instance.getSerial())) {
        forceElement = instance;
        return;
      }
    }
    if (locationRef == null || !locationRef.isSetValue()) {
      return;
    }
    for (Location instance : root.getLocation()) {
      if (locationRef.equals(instance.getSerial())) {
        location = instance;
        return;
      }
    }
  }//</editor-fold>

}
