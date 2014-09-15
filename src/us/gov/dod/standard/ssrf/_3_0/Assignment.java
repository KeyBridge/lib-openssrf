/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
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
package us.gov.dod.standard.ssrf._3_0;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.assignment.*;
import us.gov.dod.standard.ssrf._3_0.contact.POCInformation;
import us.gov.dod.standard.ssrf._3_0.forceelement.Project;
import us.gov.dod.standard.ssrf._3_0.metadata.RelatedRef;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.system.configuration.Configuration;

/**
 * <p>
 * Java class for Assignment complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Assignment"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common"> &lt;sequence> &lt;element
 * name="Title" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/>
 * &lt;element name="UsageType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25"
 * minOccurs="0"/> &lt;element name="DateResponseRequired"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/> &lt;element
 * name="EffectiveDateTime" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDT"/>
 * &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ExpireReviewDT"/>
 * &lt;element name="Period" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}TimeFrame"
 * minOccurs="0"/> &lt;element name="Processing"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/> &lt;element
 * name="Emergency" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO"
 * minOccurs="0"/> &lt;element name="AssignmentAuthority"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/> &lt;element
 * name="Requirement" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO"
 * minOccurs="0"/> &lt;element name="NumSystems"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN9" minOccurs="0"/> &lt;element
 * name="AgencyActionNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS12"
 * minOccurs="0"/> &lt;element name="AgencyComments"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/> &lt;element
 * name="AgencySerialNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS12"
 * minOccurs="0"/> &lt;element name="AssignmentDate"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/> &lt;element
 * name="COCOMGroup" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS8"
 * minOccurs="0"/> &lt;element name="ControlRequestNum"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS15" minOccurs="0"/> &lt;element
 * name="CoordinationComments" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO"
 * minOccurs="0"/> &lt;element name="DataSource"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS60" minOccurs="0"/> &lt;element
 * name="FCCFileNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS22"
 * minOccurs="0"/> &lt;element name="FMSCNum"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS14" minOccurs="0"/> &lt;element
 * name="FrequencyActionOfficer" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS3"
 * minOccurs="0"/> &lt;element name="ListSerialNum"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS12" minOccurs="0"/> &lt;element
 * name="NATOPooledFrequencyCode"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25" minOccurs="0"/> &lt;element
 * name="NATOPooledFrequencyNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN4"
 * minOccurs="0"/> &lt;element name="OriginalAssignmentDate"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/> &lt;element
 * name="RoutineAgendaItem" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;element name="SupplementaryDetails"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/> &lt;element
 * name="TypeOfService" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;element name="UsageCode"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS150" minOccurs="0"/> &lt;element
 * name="UsageFrequency" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;element name="UsagePercentage"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS_Percent" minOccurs="0"/>
 * &lt;element name="UserNetCode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS6"
 * minOccurs="0"/> &lt;element name="Project"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Project" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="POCInformation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="SysOfStation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}SysOfStation" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="RelatedRef"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}RelatedRef" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="Configuration"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Configuration"
 * maxOccurs="unbounded"/> &lt;element name="Station"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Station" maxOccurs="unbounded"/>
 * &lt;element name="Link" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Link"
 * maxOccurs="unbounded"/> &lt;element name="StatusLog"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}StatusLog" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="AsgnAllotOwner"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}AsgnAllotOwner"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="CircuitRemarks"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}CircuitRemarks"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="CoordinationData"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}CoordinationData"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="DocketNum"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}DocketNum" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="HostDocketNum"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}HostDocketNum"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="OffTheShelfEquipment"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}OffTheShelfEquipment"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element
 * name="PreviousAuthorization"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}PreviousAuthorization"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="RecordNote"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}RecordNote" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;/extension> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assignment", propOrder = {
  "title",
  "usageType",
  "dateResponseRequired",
  "effectiveDateTime",
  "expirationDateTime",
  "reviewDate",
  "period",
  "seconds",
  "minutes",
  "hours",
  "daysOfMonth",
  "months",
  "daysOfWeek",
  "years",
  "duration",
  "processing",
  "emergency",
  "assignmentAuthority",
  "requirement",
  "numSystems",
  "agencyActionNum",
  "agencyComments",
  "agencySerialNum",
  "assignmentDate",
  "cocomGroup",
  "controlRequestNum",
  "coordinationComments",
  "dataSource",
  "fccFileNum",
  "fmscNum",
  "frequencyActionOfficer",
  "listSerialNum",
  "natoPooledFrequencyCode",
  "natoPooledFrequencyNum",
  "originalAssignmentDate",
  "routineAgendaItem",
  "supplementaryDetails",
  "typeOfService",
  "usageCode",
  "usageFrequency",
  "usagePercentage",
  "userNetCode",
  "project",
  "pocInformation",
  "sysOfStation",
  "relatedRef",
  "configuration",
  "station",
  "link",
  "statusLog",
  "asgnAllotOwner",
  "circuitRemarks",
  "coordinationData",
  "docketNum",
  "hostDocketNum",
  "offTheShelfEquipment",
  "previousAuthorization",
  "recordNote"
})
public class Assignment extends Common<Assignment> {

  @XmlElement(name = "Title", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString title;
  @XmlElement(name = "UsageType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString usageType;
  @XmlElement(name = "DateResponseRequired", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar dateResponseRequired;
  @XmlElement(name = "EffectiveDateTime", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar effectiveDateTime;
  @XmlElement(name = "ExpirationDateTime", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar expirationDateTime;
  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  @XmlElement(name = "Period", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString period;
  @XmlElement(name = "Seconds", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMINSEC.class)
  private TString seconds;
  @XmlElement(name = "Minutes", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMINSEC.class)
  private TString minutes;
  @XmlElement(name = "Hours", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterHOURS.class)
  private TString hours;
  @XmlElement(name = "DaysOfMonth", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterDAYSOFMONTH.class)
  private TString daysOfMonth;
  @XmlElement(name = "Months", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMONTHS.class)
  private TString months;
  @XmlElement(name = "DaysOfWeek", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterDAYSOFWEEK.class)
  private TString daysOfWeek;
  @XmlElement(name = "Years", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterYEARS.class)
  private TString years;
  @XmlElement(name = "Duration", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger duration;
  @XmlElement(name = "Processing", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString processing;
  @XmlElement(name = "Emergency", required = false)
  private TString emergency;
  @XmlElement(name = "AssignmentAuthority", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString assignmentAuthority;
  @XmlElement(name = "Requirement", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString requirement;
  @XmlElement(name = "NumSystems", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numSystems;
  @XmlElement(name = "AgencyActionNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS12.class)
  private TString agencyActionNum;
  @XmlElement(name = "AgencyComments", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString agencyComments;
  @XmlElement(name = "AgencySerialNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS12.class)
  private TString agencySerialNum;
  @XmlElement(name = "AssignmentDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar assignmentDate;
  @XmlElement(name = "COCOMGroup", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS8.class)
  private TString cocomGroup;
  @XmlElement(name = "ControlRequestNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS15.class)
  private TString controlRequestNum;
  @XmlElement(name = "CoordinationComments", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString coordinationComments;
  @XmlElement(name = "DataSource", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS60.class)
  private TString dataSource;
  @XmlElement(name = "FCCFileNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS22.class)
  private TString fccFileNum;
  @XmlElement(name = "FMSCNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS14.class)
  private TString fmscNum;
  @XmlElement(name = "FrequencyActionOfficer", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS3.class)
  private TString frequencyActionOfficer;
  @XmlElement(name = "ListSerialNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS12.class)
  private TString listSerialNum;
  @XmlElement(name = "NATOPooledFrequencyCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString natoPooledFrequencyCode;
  @XmlElement(name = "NATOPooledFrequencyNum", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger natoPooledFrequencyNum;
  @XmlElement(name = "OriginalAssignmentDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar originalAssignmentDate;
  @XmlElement(name = "RoutineAgendaItem", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString routineAgendaItem;
  @XmlElement(name = "SupplementaryDetails", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString supplementaryDetails;
  @XmlElement(name = "TypeOfService", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString typeOfService;
  @XmlElement(name = "UsageCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS150.class)
  private TString usageCode;
  @XmlElement(name = "UsageFrequency", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString usageFrequency;
  @XmlElement(name = "UsagePercentage", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUS_PERCENT.class)
  private TInteger usagePercentage;
  @XmlElement(name = "UserNetCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS6.class)
  private TString userNetCode;
  @XmlElement(name = "Project")
  private List<Project> project;
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  @XmlElement(name = "SysOfStation")
  private List<SysOfStation> sysOfStation;
  @XmlElement(name = "RelatedRef", nillable = true)
  private List<RelatedRef> relatedRef;
  @XmlElement(name = "Configuration", required = true)
  private List<Configuration> configuration;
  @XmlElement(name = "Station", required = true)
  private List<Station> station;
  @XmlElement(name = "Link", required = true)
  private List<Link> link;
  @XmlElement(name = "StatusLog")
  private List<StatusLog> statusLog;
  @XmlElement(name = "AsgnAllotOwner")
  private List<AsgnAllotOwner> asgnAllotOwner;
  @XmlElement(name = "CircuitRemarks")
  private List<CircuitRemarks> circuitRemarks;
  @XmlElement(name = "CoordinationData")
  private List<CoordinationData> coordinationData;
  @XmlElement(name = "DocketNum")
  private List<DocketNum> docketNum;
  @XmlElement(name = "HostDocketNum")
  private List<HostDocketNum> hostDocketNum;
  @XmlElement(name = "OffTheShelfEquipment")
  private List<OffTheShelfEquipment> offTheShelfEquipment;
  @XmlElement(name = "PreviousAuthorization")
  private List<PreviousAuthorization> previousAuthorization;
  @XmlElement(name = "RecordNote")
  private List<RecordNote> recordNote;

  /**
   * Gets the value of the title property.
   * <p>
   * @return 
   */
  public TString getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p>
   * @param value 
   */
  public void setTitle(TString value) {
    this.title = value;
  }

  public boolean isSetTitle() {
    return (this.title != null);
  }

  /**
   * Gets the value of the usageType property.
   * <p>
   * @return 
   */
  public TString getUsageType() {
    return usageType;
  }

  /**
   * Sets the value of the usageType property.
   * <p>
   * @param value 
   */
  public void setUsageType(TString value) {
    this.usageType = value;
  }

  public boolean isSetUsageType() {
    return (this.usageType != null);
  }

  /**
   * Gets the value of the dateResponseRequired property.
   * <p>
   * @return 
   */
  public TCalendar getDateResponseRequired() {
    return dateResponseRequired;
  }

  /**
   * Sets the value of the dateResponseRequired property.
   * <p>
   * @param value 
   */
  public void setDateResponseRequired(TCalendar value) {
    this.dateResponseRequired = value;
  }

  public boolean isSetDateResponseRequired() {
    return (this.dateResponseRequired != null);
  }

  /**
   * Gets the value of the effectiveDateTime property.
   * <p>
   * @return
   */
  public TCalendar getEffectiveDateTime() {
    return effectiveDateTime;
  }

  /**
   * Sets the value of the effectiveDateTime property.
   * <p>
   * @param value
   */
  public void setEffectiveDateTime(TCalendar value) {
    this.effectiveDateTime = value;
  }

  public boolean isSetEffectiveDateTime() {
    return (this.effectiveDateTime != null);
  }

  /**
   * Gets the value of the expirationDateTime property.
   * <p>
   * @return 
   */
  public TCalendar getExpirationDateTime() {
    return expirationDateTime;
  }

  /**
   * Sets the value of the expirationDateTime property.
   * <p>
   * @param value 
   */
  public void setExpirationDateTime(TCalendar value) {
    this.expirationDateTime = value;
  }

  public boolean isSetExpirationDateTime() {
    return (this.expirationDateTime != null);
  }

  /**
   * Gets the value of the reviewDate property.
   * <p>
   * @return 
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Sets the value of the reviewDate property.
   * <p>
   * @param value 
   */
  public void setReviewDate(TCalendar value) {
    this.reviewDate = value;
  }

  public boolean isSetReviewDate() {
    return (this.reviewDate != null);
  }

  /**
   * Gets the value of the period property.
   * <p>
   * @return 
   */
  public TString getPeriod() {
    return period;
  }

  /**
   * Sets the value of the period property.
   * <p>
   * @param value 
   */
  public void setPeriod(TString value) {
    this.period = value;
  }

  public boolean isSetPeriod() {
    return (this.period != null);
  }

  /**
   * Gets the value of the seconds property.
   * <p>
   * @return 
   */
  public TString getSeconds() {
    return seconds;
  }

  /**
   * Sets the value of the seconds property.
   * <p>
   * @param value 
   */
  public void setSeconds(TString value) {
    this.seconds = value;
  }

  public boolean isSetSeconds() {
    return (this.seconds != null);
  }

  /**
   * Gets the value of the minutes property.
   * <p>
   * @return 
   */
  public TString getMinutes() {
    return minutes;
  }

  /**
   * Sets the value of the minutes property.
   * <p>
   * @param value 
   */
  public void setMinutes(TString value) {
    this.minutes = value;
  }

  public boolean isSetMinutes() {
    return (this.minutes != null);
  }

  /**
   * Gets the value of the hours property.
   * <p>
   * @return 
   */
  public TString getHours() {
    return hours;
  }

  /**
   * Sets the value of the hours property.
   * <p>
   * @param value 
   */
  public void setHours(TString value) {
    this.hours = value;
  }

  public boolean isSetHours() {
    return (this.hours != null);
  }

  /**
   * Gets the value of the daysOfMonth property.
   * <p>
   * @return 
   */
  public TString getDaysOfMonth() {
    return daysOfMonth;
  }

  /**
   * Sets the value of the daysOfMonth property.
   * <p>
   * @param value 
   */
  public void setDaysOfMonth(TString value) {
    this.daysOfMonth = value;
  }

  public boolean isSetDaysOfMonth() {
    return (this.daysOfMonth != null);
  }

  /**
   * Gets the value of the months property.
   * <p>
   * @return 
   */
  public TString getMonths() {
    return months;
  }

  /**
   * Sets the value of the months property.
   * <p>
   * @param value 
   */
  public void setMonths(TString value) {
    this.months = value;
  }

  public boolean isSetMonths() {
    return (this.months != null);
  }

  /**
   * Gets the value of the daysOfWeek property.
   * <p>
   * @return 
   */
  public TString getDaysOfWeek() {
    return daysOfWeek;
  }

  /**
   * Sets the value of the daysOfWeek property.
   * <p>
   * @param value 
   */
  public void setDaysOfWeek(TString value) {
    this.daysOfWeek = value;
  }

  public boolean isSetDaysOfWeek() {
    return (this.daysOfWeek != null);
  }

  /**
   * Gets the value of the years property.
   * <p>
   * @return 
   */
  public TString getYears() {
    return years;
  }

  /**
   * Sets the value of the years property.
   * <p>
   * @param value 
   */
  public void setYears(TString value) {
    this.years = value;
  }

  public boolean isSetYears() {
    return (this.years != null);
  }

  /**
   * Gets the value of the duration property.
   * <p>
   * @return 
   */
  public TInteger getDuration() {
    return duration;
  }

  /**
   * Sets the value of the duration property.
   * <p>
   * @param value 
   */
  public void setDuration(TInteger value) {
    this.duration = value;
  }

  public boolean isSetDuration() {
    return (this.duration != null);
  }

  /**
   * Gets the value of the processing property.
   * <p>
   * @return 
   */
  public TString getProcessing() {
    return processing;
  }

  /**
   * Sets the value of the processing property.
   * <p>
   * @param value 
   */
  public void setProcessing(TString value) {
    this.processing = value;
  }

  public boolean isSetProcessing() {
    return (this.processing != null);
  }

  /**
   * Gets the value of the emergency property.
   * <p>
   * @return 
   */
  public TString getEmergency() {
    return emergency;
  }

  /**
   * Sets the value of the emergency property.
   * <p>
   * @param value 
   */
  public void setEmergency(TString value) {
    this.emergency = value;
  }

  public boolean isSetEmergency() {
    return (this.emergency != null);
  }

  /**
   * Gets the value of the assignmentAuthority property.
   * <p>
   * @return 
   */
  public TString getAssignmentAuthority() {
    return assignmentAuthority;
  }

  /**
   * Sets the value of the assignmentAuthority property.
   * <p>
   * @param value 
   */
  public void setAssignmentAuthority(TString value) {
    this.assignmentAuthority = value;
  }

  public boolean isSetAssignmentAuthority() {
    return (this.assignmentAuthority != null);
  }

  /**
   * Gets the value of the requirement property.
   * <p>
   * @return 
   */
  public TString getRequirement() {
    return requirement;
  }

  /**
   * Sets the value of the requirement property.
   * <p>
   * @param value 
   */
  public void setRequirement(TString value) {
    this.requirement = value;
  }

  public boolean isSetRequirement() {
    return (this.requirement != null);
  }

  /**
   * Gets the value of the numSystems property.
   * <p>
   * @return 
   */
  public TInteger getNumSystems() {
    return numSystems;
  }

  /**
   * Sets the value of the numSystems property.
   * <p>
   * @param value 
   */
  public void setNumSystems(TInteger value) {
    this.numSystems = value;
  }

  public boolean isSetNumSystems() {
    return (this.numSystems != null);
  }

  /**
   * Gets the value of the agencyActionNum property.
   * <p>
   * @return 
   */
  public TString getAgencyActionNum() {
    return agencyActionNum;
  }

  /**
   * Sets the value of the agencyActionNum property.
   * <p>
   * @param value 
   */
  public void setAgencyActionNum(TString value) {
    this.agencyActionNum = value;
  }

  public boolean isSetAgencyActionNum() {
    return (this.agencyActionNum != null);
  }

  /**
   * Gets the value of the agencyComments property.
   * <p>
   * @return 
   */
  public TString getAgencyComments() {
    return agencyComments;
  }

  /**
   * Sets the value of the agencyComments property.
   * <p>
   * @param value 
   */
  public void setAgencyComments(TString value) {
    this.agencyComments = value;
  }

  public boolean isSetAgencyComments() {
    return (this.agencyComments != null);
  }

  /**
   * Gets the value of the agencySerialNum property.
   * <p>
   * @return 
   */
  public TString getAgencySerialNum() {
    return agencySerialNum;
  }

  /**
   * Sets the value of the agencySerialNum property.
   * <p>
   * @param value 
   */
  public void setAgencySerialNum(TString value) {
    this.agencySerialNum = value;
  }

  public boolean isSetAgencySerialNum() {
    return (this.agencySerialNum != null);
  }

  /**
   * Gets the value of the assignmentDate property.
   * <p>
   * @return 
   */
  public TCalendar getAssignmentDate() {
    return assignmentDate;
  }

  /**
   * Sets the value of the assignmentDate property.
   * <p>
   * @param value 
   */
  public void setAssignmentDate(TCalendar value) {
    this.assignmentDate = value;
  }

  public boolean isSetAssignmentDate() {
    return (this.assignmentDate != null);
  }

  /**
   * Gets the value of the cocomGroup property.
   * <p>
   * @return 
   */
  public TString getCOCOMGroup() {
    return cocomGroup;
  }

  /**
   * Sets the value of the cocomGroup property.
   * <p>
   * @param value 
   */
  public void setCOCOMGroup(TString value) {
    this.cocomGroup = value;
  }

  public boolean isSetCOCOMGroup() {
    return (this.cocomGroup != null);
  }

  /**
   * Gets the value of the controlRequestNum property.
   * <p>
   * @return 
   */
  public TString getControlRequestNum() {
    return controlRequestNum;
  }

  /**
   * Sets the value of the controlRequestNum property.
   * <p>
   * @param value 
   */
  public void setControlRequestNum(TString value) {
    this.controlRequestNum = value;
  }

  public boolean isSetControlRequestNum() {
    return (this.controlRequestNum != null);
  }

  /**
   * Gets the value of the coordinationComments property.
   * <p>
   * @return 
   */
  public TString getCoordinationComments() {
    return coordinationComments;
  }

  /**
   * Sets the value of the coordinationComments property.
   * <p>
   * @param value 
   */
  public void setCoordinationComments(TString value) {
    this.coordinationComments = value;
  }

  public boolean isSetCoordinationComments() {
    return (this.coordinationComments != null);
  }

  /**
   * Gets the value of the dataSource property.
   * <p>
   * @return 
   */
  public TString getDataSource() {
    return dataSource;
  }

  /**
   * Sets the value of the dataSource property.
   * <p>
   * @param value 
   */
  public void setDataSource(TString value) {
    this.dataSource = value;
  }

  public boolean isSetDataSource() {
    return (this.dataSource != null);
  }

  /**
   * Gets the value of the fccFileNum property.
   * <p>
   * @return 
   */
  public TString getFCCFileNum() {
    return fccFileNum;
  }

  /**
   * Sets the value of the fccFileNum property.
   * <p>
   * @param value 
   */
  public void setFCCFileNum(TString value) {
    this.fccFileNum = value;
  }

  public boolean isSetFCCFileNum() {
    return (this.fccFileNum != null);
  }

  /**
   * Gets the value of the fmscNum property.
   * <p>
   * @return 
   */
  public TString getFMSCNum() {
    return fmscNum;
  }

  /**
   * Sets the value of the fmscNum property.
   * <p>
   * @param value 
   */
  public void setFMSCNum(TString value) {
    this.fmscNum = value;
  }

  public boolean isSetFMSCNum() {
    return (this.fmscNum != null);
  }

  /**
   * Gets the value of the frequencyActionOfficer property.
   * <p>
   * @return 
   */
  public TString getFrequencyActionOfficer() {
    return frequencyActionOfficer;
  }

  /**
   * Sets the value of the frequencyActionOfficer property.
   * <p>
   * @param value 
   */
  public void setFrequencyActionOfficer(TString value) {
    this.frequencyActionOfficer = value;
  }

  public boolean isSetFrequencyActionOfficer() {
    return (this.frequencyActionOfficer != null);
  }

  /**
   * Gets the value of the listSerialNum property.
   * <p>
   * @return 
   */
  public TString getListSerialNum() {
    return listSerialNum;
  }

  /**
   * Sets the value of the listSerialNum property.
   * <p>
   * @param value 
   */
  public void setListSerialNum(TString value) {
    this.listSerialNum = value;
  }

  public boolean isSetListSerialNum() {
    return (this.listSerialNum != null);
  }

  /**
   * Gets the value of the natoPooledFrequencyCode property.
   * <p>
   * @return 
   */
  public TString getNATOPooledFrequencyCode() {
    return natoPooledFrequencyCode;
  }

  /**
   * Sets the value of the natoPooledFrequencyCode property.
   * <p>
   * @param value 
   */
  public void setNATOPooledFrequencyCode(TString value) {
    this.natoPooledFrequencyCode = value;
  }

  public boolean isSetNATOPooledFrequencyCode() {
    return (this.natoPooledFrequencyCode != null);
  }

  /**
   * Gets the value of the natoPooledFrequencyNum property.
   * <p>
   * @return 
   */
  public TInteger getNATOPooledFrequencyNum() {
    return natoPooledFrequencyNum;
  }

  /**
   * Sets the value of the natoPooledFrequencyNum property.
   * <p>
   * @param value 
   */
  public void setNATOPooledFrequencyNum(TInteger value) {
    this.natoPooledFrequencyNum = value;
  }

  public boolean isSetNATOPooledFrequencyNum() {
    return (this.natoPooledFrequencyNum != null);
  }

  /**
   * Gets the value of the originalAssignmentDate property.
   * <p>
   * @return 
   */
  public TCalendar getOriginalAssignmentDate() {
    return originalAssignmentDate;
  }

  /**
   * Sets the value of the originalAssignmentDate property.
   * <p>
   * @param value 
   */
  public void setOriginalAssignmentDate(TCalendar value) {
    this.originalAssignmentDate = value;
  }

  public boolean isSetOriginalAssignmentDate() {
    return (this.originalAssignmentDate != null);
  }

  /**
   * Gets the value of the routineAgendaItem property.
   * <p>
   * @return 
   */
  public TString getRoutineAgendaItem() {
    return routineAgendaItem;
  }

  /**
   * Sets the value of the routineAgendaItem property.
   * <p>
   * @param value 
   */
  public void setRoutineAgendaItem(TString value) {
    this.routineAgendaItem = value;
  }

  public boolean isSetRoutineAgendaItem() {
    return (this.routineAgendaItem != null);
  }

  /**
   * Gets the value of the supplementaryDetails property.
   * <p>
   * @return 
   */
  public TString getSupplementaryDetails() {
    return supplementaryDetails;
  }

  /**
   * Sets the value of the supplementaryDetails property.
   * <p>
   * @param value 
   */
  public void setSupplementaryDetails(TString value) {
    this.supplementaryDetails = value;
  }

  public boolean isSetSupplementaryDetails() {
    return (this.supplementaryDetails != null);
  }

  /**
   * Gets the value of the typeOfService property.
   * <p>
   * @return 
   */
  public TString getTypeOfService() {
    return typeOfService;
  }

  /**
   * Sets the value of the typeOfService property.
   * <p>
   * @param value 
   */
  public void setTypeOfService(TString value) {
    this.typeOfService = value;
  }

  public boolean isSetTypeOfService() {
    return (this.typeOfService != null);
  }

  /**
   * Gets the value of the usageCode property.
   * <p>
   * @return 
   */
  public TString getUsageCode() {
    return usageCode;
  }

  /**
   * Sets the value of the usageCode property.
   * <p>
   * @param value 
   */
  public void setUsageCode(TString value) {
    this.usageCode = value;
  }

  public boolean isSetUsageCode() {
    return (this.usageCode != null);
  }

  /**
   * Gets the value of the usageFrequency property.
   * <p>
   * @return 
   */
  public TString getUsageFrequency() {
    return usageFrequency;
  }

  /**
   * Sets the value of the usageFrequency property.
   * <p>
   * @param value 
   */
  public void setUsageFrequency(TString value) {
    this.usageFrequency = value;
  }

  public boolean isSetUsageFrequency() {
    return (this.usageFrequency != null);
  }

  /**
   * Gets the value of the usagePercentage property.
   * <p>
   * @return 
   */
  public TInteger getUsagePercentage() {
    return usagePercentage;
  }

  /**
   * Sets the value of the usagePercentage property.
   * <p>
   * @param value 
   */
  public void setUsagePercentage(TInteger value) {
    this.usagePercentage = value;
  }

  public boolean isSetUsagePercentage() {
    return (this.usagePercentage != null);
  }

  /**
   * Gets the value of the userNetCode property.
   * <p>
   * @return 
   */
  public TString getUserNetCode() {
    return userNetCode;
  }

  /**
   * Sets the value of the userNetCode property.
   * <p>
   * @param value 
   */
  public void setUserNetCode(TString value) {
    this.userNetCode = value;
  }

  public boolean isSetUserNetCode() {
    return (this.userNetCode != null);
  }

  /**
   * Gets the value of the project property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the project property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getProject().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<Project> getProject() {
    if (project == null) {
      project = new ArrayList<>();
    }
    return this.project;
  }

  public boolean isSetProject() {
    return ((this.project != null) && (!this.project.isEmpty()));
  }

  public void unsetProject() {
    this.project = null;
  }

  /**
   * Gets the value of the pocInformation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pocInformation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPOCInformation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
  }

  public boolean isSetPOCInformation() {
    return ((this.pocInformation != null) && (!this.pocInformation.isEmpty()));
  }

  public void unsetPOCInformation() {
    this.pocInformation = null;
  }

  /**
   * Gets the value of the sysOfStation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the sysOfStation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSysOfStation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<SysOfStation> getSysOfStation() {
    if (sysOfStation == null) {
      sysOfStation = new ArrayList<>();
    }
    return this.sysOfStation;
  }

  public boolean isSetSysOfStation() {
    return ((this.sysOfStation != null) && (!this.sysOfStation.isEmpty()));
  }

  public void unsetSysOfStation() {
    this.sysOfStation = null;
  }

  /**
   * Gets the value of the relatedRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the relatedRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRelatedRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<RelatedRef> getRelatedRef() {
    if (relatedRef == null) {
      relatedRef = new ArrayList<>();
    }
    return this.relatedRef;
  }

  public boolean isSetRelatedRef() {
    return ((this.relatedRef != null) && (!this.relatedRef.isEmpty()));
  }

  public void unsetRelatedRef() {
    this.relatedRef = null;
  }

  /**
   * Gets the value of the configuration property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the configuration property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getConfiguration().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<Configuration> getConfiguration() {
    if (configuration == null) {
      configuration = new ArrayList<>();
    }
    return this.configuration;
  }

  public boolean isSetConfiguration() {
    return ((this.configuration != null) && (!this.configuration.isEmpty()));
  }

  public void unsetConfiguration() {
    this.configuration = null;
  }

  /**
   * Gets the value of the station property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the station property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<Station> getStation() {
    if (station == null) {
      station = new ArrayList<>();
    }
    return this.station;
  }

  public boolean isSetStation() {
    return ((this.station != null) && (!this.station.isEmpty()));
  }

  public void unsetStation() {
    this.station = null;
  }

  /**
   * Gets the value of the link property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the link property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLink().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<Link> getLink() {
    if (link == null) {
      link = new ArrayList<>();
    }
    return this.link;
  }

  public boolean isSetLink() {
    return ((this.link != null) && (!this.link.isEmpty()));
  }

  public void unsetLink() {
    this.link = null;
  }

  /**
   * Gets the value of the statusLog property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the statusLog property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStatusLog().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<StatusLog> getStatusLog() {
    if (statusLog == null) {
      statusLog = new ArrayList<>();
    }
    return this.statusLog;
  }

  public boolean isSetStatusLog() {
    return ((this.statusLog != null) && (!this.statusLog.isEmpty()));
  }

  public void unsetStatusLog() {
    this.statusLog = null;
  }

  /**
   * Gets the value of the asgnAllotOwner property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the asgnAllotOwner property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAsgnAllotOwner().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<AsgnAllotOwner> getAsgnAllotOwner() {
    if (asgnAllotOwner == null) {
      asgnAllotOwner = new ArrayList<>();
    }
    return this.asgnAllotOwner;
  }

  public boolean isSetAsgnAllotOwner() {
    return ((this.asgnAllotOwner != null) && (!this.asgnAllotOwner.isEmpty()));
  }

  public void unsetAsgnAllotOwner() {
    this.asgnAllotOwner = null;
  }

  /**
   * Gets the value of the circuitRemarks property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the circuitRemarks property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCircuitRemarks().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<CircuitRemarks> getCircuitRemarks() {
    if (circuitRemarks == null) {
      circuitRemarks = new ArrayList<>();
    }
    return this.circuitRemarks;
  }

  public boolean isSetCircuitRemarks() {
    return ((this.circuitRemarks != null) && (!this.circuitRemarks.isEmpty()));
  }

  public void unsetCircuitRemarks() {
    this.circuitRemarks = null;
  }

  /**
   * Gets the value of the coordinationData property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the coordinationData property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCoordinationData().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<CoordinationData> getCoordinationData() {
    if (coordinationData == null) {
      coordinationData = new ArrayList<>();
    }
    return this.coordinationData;
  }

  public boolean isSetCoordinationData() {
    return ((this.coordinationData != null) && (!this.coordinationData.isEmpty()));
  }

  public void unsetCoordinationData() {
    this.coordinationData = null;
  }

  /**
   * Gets the value of the docketNum property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the docketNum property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDocketNum().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<DocketNum> getDocketNum() {
    if (docketNum == null) {
      docketNum = new ArrayList<>();
    }
    return this.docketNum;
  }

  public boolean isSetDocketNum() {
    return ((this.docketNum != null) && (!this.docketNum.isEmpty()));
  }

  public void unsetDocketNum() {
    this.docketNum = null;
  }

  /**
   * Gets the value of the hostDocketNum property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the hostDocketNum property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getHostDocketNum().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<HostDocketNum> getHostDocketNum() {
    if (hostDocketNum == null) {
      hostDocketNum = new ArrayList<>();
    }
    return this.hostDocketNum;
  }

  public boolean isSetHostDocketNum() {
    return ((this.hostDocketNum != null) && (!this.hostDocketNum.isEmpty()));
  }

  public void unsetHostDocketNum() {
    this.hostDocketNum = null;
  }

  /**
   * Gets the value of the offTheShelfEquipment property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the offTheShelfEquipment property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getOffTheShelfEquipment().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<OffTheShelfEquipment> getOffTheShelfEquipment() {
    if (offTheShelfEquipment == null) {
      offTheShelfEquipment = new ArrayList<>();
    }
    return this.offTheShelfEquipment;
  }

  public boolean isSetOffTheShelfEquipment() {
    return ((this.offTheShelfEquipment != null) && (!this.offTheShelfEquipment.isEmpty()));
  }

  public void unsetOffTheShelfEquipment() {
    this.offTheShelfEquipment = null;
  }

  /**
   * Gets the value of the previousAuthorization property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the previousAuthorization property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPreviousAuthorization().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<PreviousAuthorization> getPreviousAuthorization() {
    if (previousAuthorization == null) {
      previousAuthorization = new ArrayList<>();
    }
    return this.previousAuthorization;
  }

  public boolean isSetPreviousAuthorization() {
    return ((this.previousAuthorization != null) && (!this.previousAuthorization.isEmpty()));
  }

  public void unsetPreviousAuthorization() {
    this.previousAuthorization = null;
  }

  /**
   * Gets the value of the recordNote property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the recordNote property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRecordNote().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<RecordNote> getRecordNote() {
    if (recordNote == null) {
      recordNote = new ArrayList<>();
    }
    return this.recordNote;
  }

  public boolean isSetRecordNote() {
    return ((this.recordNote != null) && (!this.recordNote.isEmpty()));
  }

  public void unsetRecordNote() {
    this.recordNote = null;
  }

  public Assignment withTitle(String value) {
    setTitle(new TString(value));
    return this;
  }

  public Assignment withUsageType(String value) {
    setUsageType(new TString(value));
    return this;
  }

  public Assignment withDateResponseRequired(Calendar value) {
    setDateResponseRequired(new TCalendar(value));
    return this;
  }

  public Assignment withEffectiveDateTime(Calendar value) {
    setEffectiveDateTime(new TCalendar(value));
    return this;
  }

  public Assignment withExpirationDateTime(Calendar value) {
    setExpirationDateTime(new TCalendar(value));
    return this;
  }

  public Assignment withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  public Assignment withPeriod(String value) {
    setPeriod(new TString(value));
    return this;
  }

  public Assignment withSeconds(String value) {
    setSeconds(new TString(value));
    return this;
  }

  public Assignment withMinutes(String value) {
    setMinutes(new TString(value));
    return this;
  }

  public Assignment withHours(String value) {
    setHours(new TString(value));
    return this;
  }

  public Assignment withDaysOfMonth(String value) {
    setDaysOfMonth(new TString(value));
    return this;
  }

  public Assignment withMonths(String value) {
    setMonths(new TString(value));
    return this;
  }

  public Assignment withDaysOfWeek(String value) {
    setDaysOfWeek(new TString(value));
    return this;
  }

  public Assignment withYears(String value) {
    setYears(new TString(value));
    return this;
  }

  public Assignment withDuration(Integer value) {
    setDuration(new TInteger(value));
    return this;
  }

  public Assignment withProcessing(String value) {
    setProcessing(new TString(value));
    return this;
  }

  public Assignment withEmergency(ListCBO value) {
    setEmergency(new TString(value.value()));
    return this;
  }

  public Assignment withAssignmentAuthority(String value) {
    setAssignmentAuthority(new TString(value));
    return this;
  }

  public Assignment withRequirement(String value) {
    setRequirement(new TString(value));
    return this;
  }

  public Assignment withNumSystems(Integer value) {
    setNumSystems(new TInteger(value));
    return this;
  }

  public Assignment withAgencyActionNum(String value) {
    setAgencyActionNum(new TString(value));
    return this;
  }

  public Assignment withAgencyComments(String value) {
    setAgencyComments(new TString(value));
    return this;
  }

  public Assignment withAgencySerialNum(String value) {
    setAgencySerialNum(new TString(value));
    return this;
  }

  public Assignment withAssignmentDate(Calendar value) {
    setAssignmentDate(new TCalendar(value));
    return this;
  }

  public Assignment withCOCOMGroup(String value) {
    setCOCOMGroup(new TString(value));
    return this;
  }

  public Assignment withControlRequestNum(String value) {
    setControlRequestNum(new TString(value));
    return this;
  }

  public Assignment withCoordinationComments(String value) {
    setCoordinationComments(new TString(value));
    return this;
  }

  public Assignment withDataSource(String value) {
    setDataSource(new TString(value));
    return this;
  }

  public Assignment withFCCFileNum(String value) {
    setFCCFileNum(new TString(value));
    return this;
  }

  public Assignment withFMSCNum(String value) {
    setFMSCNum(new TString(value));
    return this;
  }

  public Assignment withFrequencyActionOfficer(String value) {
    setFrequencyActionOfficer(new TString(value));
    return this;
  }

  public Assignment withListSerialNum(String value) {
    setListSerialNum(new TString(value));
    return this;
  }

  public Assignment withNATOPooledFrequencyCode(String value) {
    setNATOPooledFrequencyCode(new TString(value));
    return this;
  }

  public Assignment withNATOPooledFrequencyNum(Integer value) {
    setNATOPooledFrequencyNum(new TInteger(value));
    return this;
  }

  public Assignment withOriginalAssignmentDate(Calendar value) {
    setOriginalAssignmentDate(new TCalendar(value));
    return this;
  }

  public Assignment withRoutineAgendaItem(String value) {
    setRoutineAgendaItem(new TString(value));
    return this;
  }

  public Assignment withSupplementaryDetails(String value) {
    setSupplementaryDetails(new TString(value));
    return this;
  }

  public Assignment withTypeOfService(String value) {
    setTypeOfService(new TString(value));
    return this;
  }

  public Assignment withUsageCode(String value) {
    setUsageCode(new TString(value));
    return this;
  }

  public Assignment withUsageFrequency(String value) {
    setUsageFrequency(new TString(value));
    return this;
  }

  public Assignment withUsagePercentage(Integer value) {
    setUsagePercentage(new TInteger(value));
    return this;
  }

  public Assignment withUserNetCode(String value) {
    setUserNetCode(new TString(value));
    return this;
  }

  public Assignment withProject(Project... values) {
    if (values != null) {
      getProject().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withProject(Collection<Project> values) {
    if (values != null) {
      getProject().addAll(values);
    }
    return this;
  }

  public Assignment withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  public Assignment withSysOfStation(SysOfStation... values) {
    if (values != null) {
      getSysOfStation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withSysOfStation(Collection<SysOfStation> values) {
    if (values != null) {
      getSysOfStation().addAll(values);
    }
    return this;
  }

  public Assignment withRelatedRef(RelatedRef... values) {
    if (values != null) {
      getRelatedRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withRelatedRef(Collection<RelatedRef> values) {
    if (values != null) {
      getRelatedRef().addAll(values);
    }
    return this;
  }

  public Assignment withConfiguration(Configuration... values) {
    if (values != null) {
      getConfiguration().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withConfiguration(Collection<Configuration> values) {
    if (values != null) {
      getConfiguration().addAll(values);
    }
    return this;
  }

  public Assignment withStation(Station... values) {
    if (values != null) {
      getStation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withStation(Collection<Station> values) {
    if (values != null) {
      getStation().addAll(values);
    }
    return this;
  }

  public Assignment withLink(Link... values) {
    if (values != null) {
      getLink().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withLink(Collection<Link> values) {
    if (values != null) {
      getLink().addAll(values);
    }
    return this;
  }

  public Assignment withStatusLog(StatusLog... values) {
    if (values != null) {
      getStatusLog().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withStatusLog(Collection<StatusLog> values) {
    if (values != null) {
      getStatusLog().addAll(values);
    }
    return this;
  }

  public Assignment withAsgnAllotOwner(AsgnAllotOwner... values) {
    if (values != null) {
      getAsgnAllotOwner().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withAsgnAllotOwner(Collection<AsgnAllotOwner> values) {
    if (values != null) {
      getAsgnAllotOwner().addAll(values);
    }
    return this;
  }

  public Assignment withCircuitRemarks(CircuitRemarks... values) {
    if (values != null) {
      getCircuitRemarks().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withCircuitRemarks(Collection<CircuitRemarks> values) {
    if (values != null) {
      getCircuitRemarks().addAll(values);
    }
    return this;
  }

  public Assignment withCoordinationData(CoordinationData... values) {
    if (values != null) {
      getCoordinationData().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withCoordinationData(Collection<CoordinationData> values) {
    if (values != null) {
      getCoordinationData().addAll(values);
    }
    return this;
  }

  public Assignment withDocketNum(DocketNum... values) {
    if (values != null) {
      getDocketNum().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withDocketNum(Collection<DocketNum> values) {
    if (values != null) {
      getDocketNum().addAll(values);
    }
    return this;
  }

  public Assignment withHostDocketNum(HostDocketNum... values) {
    if (values != null) {
      getHostDocketNum().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withHostDocketNum(Collection<HostDocketNum> values) {
    if (values != null) {
      getHostDocketNum().addAll(values);
    }
    return this;
  }

  public Assignment withOffTheShelfEquipment(OffTheShelfEquipment... values) {
    if (values != null) {
      getOffTheShelfEquipment().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withOffTheShelfEquipment(Collection<OffTheShelfEquipment> values) {
    if (values != null) {
      getOffTheShelfEquipment().addAll(values);
    }
    return this;
  }

  public Assignment withPreviousAuthorization(PreviousAuthorization... values) {
    if (values != null) {
      getPreviousAuthorization().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withPreviousAuthorization(Collection<PreviousAuthorization> values) {
    if (values != null) {
      getPreviousAuthorization().addAll(values);
    }
    return this;
  }

  public Assignment withRecordNote(RecordNote... values) {
    if (values != null) {
      getRecordNote().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assignment withRecordNote(Collection<RecordNote> values) {
    if (values != null) {
      getRecordNote().addAll(values);
    }
    return this;
  }

}
