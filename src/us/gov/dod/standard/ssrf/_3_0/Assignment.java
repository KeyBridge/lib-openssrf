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
import us.gov.dod.standard.ssrf._3_0.metadata.lists.*;
import us.gov.dod.standard.ssrf._3_0.system.configuration.Configuration;

/**
 * Java class for Assignment complex type.
 * <p>
 * This element is the XML root for all parameters of a system of assignments.
 * It inherits attributes and sub-elements from element Common.
 * <p>
 * [XSL ERR DSTYPE] Part 3 of the Serial reference (dataset type) MUST be "AS".
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

  /**
   * Title: Enter an identifying name for this Allotment or Assignment.
   */
  @XmlElement(name = "Title", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString title;
  /**
   * UsageType: Enter the type of assignment request or approved
   * assignment/allotment. In case of a rejected or cancelled
   * assignment/allotment, use an associated Remarks to indicate the reason.
   * <p>
   * Recommend values from Code List CUT
   */
  @XmlElement(name = "UsageType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString usageType;
  /**
   * DateResponseRequired: Enter the date by which the frequency assignment or
   * Spectrum Supportability Reply is required by the user in order to complete
   * necessary advanced operation coordination.
   */
  @XmlElement(name = "DateResponseRequired", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar dateResponseRequired;
  /**
   * EffectiveDateTime: This data element indicates the date/time by which the
   * dataset is to be operational or effective, formatted as
   * yyyy-mm-ddThh:mm:ssZ (year-month-day, "T" for time, hour:minute:seconds
   * Zulu). To indicate a real effective time, use values 00:00:01Z to
   * 24:00:00Z. The value 00:00:00Z is reserved to indicate that time is not an
   * issue.
   */
  @XmlElement(name = "EffectiveDateTime", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar effectiveDateTime;
  /**
   * ExpirationDateTime: Enter the date at which the dataset will expire,
   * formatted as yyyy-mm- ddThh:mm:ssZ (year-month-day, "T" for time,
   * hour:minute:seconds Zulu). To indicate a real effective time, use values
   * 00:00:01Z to 24:00:00Z. The value 00:00:00Z is reserved to indicate that
   * time is not an issue. The Expiration date should be less than five years
   * from the effective date.
   */
  @XmlElement(name = "ExpirationDateTime", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar expirationDateTime;
  /**
   * ReviewDate: Enter the date by which the dataset is to be reviewed,
   * formatted as yyyy-mm-dd (year-month- day). The Review date should be less
   * than five years from the effective date. In Spectrum Supportability
   * datasets, this date indicate when the organisation responsible for
   * re-initiating host coordination plans to resubmit a Spectrum Supportability
   * request to the host nation for continued use of the equipment.
   */
  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  /**
   * Period: Indicate the general period on a daily basis when the frequency
   * assignment's frequencies will be either guarded (monitored) or used for
   * transmission.
   * <p>
   * Recommend values from Code List CTI
   */
  @XmlElement(name = "Period", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString period;
  /**
   * Time Frame: This group is OPTIONAL. This group defines a schedule of
   * operation for time-related datasets. Each item (except duration) may
   * contain:
   * <ul><li> A single number; </li>
   * <li> A range (start and stop, separated with an hyphen "-"); optionally, a
   * range may be followed by a step</li>
   * (oblique stroke "/" followed by a number); the full range may be
   * represented by the asterisk "*";</li>
   * <li> A list of numbers and/or ranges, separated by commas ",";</li>
   * <li> An attribute with value "*" may be omitted.</li></ul>
   * <p>
   * Seconds: Enter the seconds of hour [0-59]
   */
  @XmlElement(name = "Seconds", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMINSEC.class)
  private TString seconds;
  /**
   * Minutes: Enter the minutes of hour [0-59]
   * <p>
   * @see #seconds
   */
  @XmlElement(name = "Minutes", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMINSEC.class)
  private TString minutes;
  /**
   * Hours: Enter the hours of day [0-23] (UTC time)
   * <p>
   * @see #seconds
   */
  @XmlElement(name = "Hours", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterHOURS.class)
  private TString hours;
  /**
   * DaysOfMonth: Enter the day of month [1-31]
   * <p>
   * @see #seconds
   */
  @XmlElement(name = "DaysOfMonth", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterDAYSOFMONTH.class)
  private TString daysOfMonth;
  /**
   * Months: Enter the month of year [1-12]
   * <p>
   * @see #seconds
   */
  @XmlElement(name = "Months", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMONTHS.class)
  private TString months;
  /**
   * DaysOfWeek: Enter the weekday [0-7 where 0 and 7 are for Sunday, 1 for
   * Monday, etc]
   * <p>
   * @see #seconds
   */
  @XmlElement(name = "DaysOfWeek", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterDAYSOFWEEK.class)
  private TString daysOfWeek;
  /**
   * Years: Enter the 4-digit year [1900..2100]
   * <p>
   * @see #seconds
   */
  @XmlElement(name = "Years", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterYEARS.class)
  private TString years;
  /**
   * Duration: Enter the number of minutes for which an event will live.
   * <p>
   * @see #seconds
   */
  @XmlElement(name = "Duration", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger duration;
  /**
   * Processing: Indicate if the frequency assignment is to be processed to
   * national or international level for approval, or neither.
   * <p>
   * Recommend values from Code List CPI:
   */
  @XmlElement(name = "Processing", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString processing;
  /**
   * Emergency: Enter "Yes" if the assignment may be used in a case of
   * emergency.
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CBO: Code Yes No
   */
  @XmlElement(name = "Emergency", required = false)
  private TString emergency;
  /**
   * AssignmentAuthority: Indicate the user's acceptance of host-nation or NATO
   * HQ frequency nominations.
   * <p>
   * Recommend values from Code List CHN
   */
  @XmlElement(name = "AssignmentAuthority", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString assignmentAuthority;
  /**
   * Requirement:
   * <p>
   * NATO: Enter any amplifying information on the requirement.
   * <p>
   * USA: Enter Agency remarks which, while pertinent to the frequency
   * assignment, are not intended to be part of the application processed
   * through the Interdepartment Radio Advisory Committee (IRAC). These remarks,
   * therefore, will be excluded from the Government Master File (GMF).
   */
  @XmlElement(name = "Requirement", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString requirement;
  /**
   * NumSystems: Enter the number of systems that are expected to use this
   * frequency assignment.
   */
  @XmlElement(name = "NumSystems", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numSystems;
  /**
   * AgencyActionNum (US): Enter the An identifier used to track transactions.
   */
  @XmlElement(name = "AgencyActionNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS12.class)
  private TString agencyActionNum;
  /**
   * AgencyComments (US): Enter the Agency remarks in the applications processed
   * through the Interdepartment Radio Advisory Committee (IRAC). These remarks
   * will be included in the Government Master File (GMF).
   */
  @XmlElement(name = "AgencyComments", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString agencyComments;
  /**
   * AgencySerialNum (US): Enter the externally-assigned unique identifier of a
   * frequency assignment..
   */
  @XmlElement(name = "AgencySerialNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS12.class)
  private TString agencySerialNum;
  /**
   * AssignmentDate (US): Enter the date the assignment was most recently
   * authorized.
   */
  @XmlElement(name = "AssignmentDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar assignmentDate;
  /**
   * COCOMGroup (US): Enter the In the PACOM area, identifies a grouping of
   * frequencies having a like or similar use. In the EUCOM area, identifies the
   * function number(s) used by the Frequency Management Sub-Committee (FMSC) to
   * specify the operational use of frequencies.
   */
  @XmlElement(name = "COCOMGroup", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS8.class)
  private TString cocomGroup;
  /**
   * ControlRequestNum (US): Enter the control/request identifier that allows
   * subordinate organizations to track specific frequency applications.
   */
  @XmlElement(name = "ControlRequestNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS15.class)
  private TString controlRequestNum;
  /**
   * CoordinationComments (US): Enter the Comments related to the external
   * coordination of a frequency assignment.
   */
  @XmlElement(name = "CoordinationComments", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString coordinationComments;
  /**
   * DataSource (US): Indicate the source or organization from which the data
   * record was received.
   * <p>
   * Recommend values from Code List UDA
   */
  @XmlElement(name = "DataSource", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS60.class)
  private TString dataSource;
  /**
   * FCCFileNum (US): Enter the file number assigned by the Federal
   * Communications Commission (FCC), issued to non-government stations
   * operating on government frequencies or government stations operating on
   * non- government frequencies, which is unique to each FCC license.
   */
  @XmlElement(name = "FCCFileNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS22.class)
  private TString fccFileNum;
  /**
   * FMSCNum (US): Enter the assignment serial number as registered in the
   * Frequency Management Sub- committee (FMSC) Master Radio Frequency List
   * (MRFL).
   */
  @XmlElement(name = "FMSCNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS14.class)
  private TString fmscNum;
  /**
   * FrequencyActionOfficer (US): Enter the A MILDEP code identifying the person
   * or group responsible for the frequency assignment.
   */
  @XmlElement(name = "FrequencyActionOfficer", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS3.class)
  private TString frequencyActionOfficer;
  /**
   * ListSerialNum (US): Enter the agency list serial number of a Government
   * Master File (GMF) record representing a group or area assignment. It brings
   * into use, by a particular station or stations, a frequency authorized under
   * a group assignment or authorized for communications with nongovernment
   * stations.
   */
  @XmlElement(name = "ListSerialNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS12.class)
  private TString listSerialNum;
  /**
   * NATOPooledFrequencyCode (US): Indicate the Type Special Assignment for the
   * frequency assignment.
   * <p>
   * Recommend values from Code List UPF: Air/ground/air Air to air
   * Air/ground/air pool
   */
  @XmlElement(name = "NATOPooledFrequencyCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString natoPooledFrequencyCode;
  /**
   * NATOPooledFrequencyNum (US): Enter the a Frequency Management Sub-committee
   * (FMSC) assigned code number identifying the type and nationality of a
   * frequency pool.
   */
  @XmlElement(name = "NATOPooledFrequencyNum", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger natoPooledFrequencyNum;
  /**
   * OriginalAssignmentDate (US): Enter the date the frequency assignment was
   * originally authorized.
   */
  @XmlElement(name = "OriginalAssignmentDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar originalAssignmentDate;
  /**
   * RoutineAgendaItem (US): Enter the Indicates the type of National
   * Telecommunications and Information Administration (NTIA) Frequency
   * Assignment Subcommittee (FAS) agenda on which the application will be
   * processed. This value is computer-generated by NTIA for its internal
   * processing of frequency assignment applications. It is an output data item
   * only. Possible values include: R - Routine Application A - AAG Application
   * M - MAG Application If this XML element does not exist, the application is
   * a “Regular Application”.
   * <p>
   * Recommend values from Code List URI:
   */
  @XmlElement(name = "RoutineAgendaItem", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString routineAgendaItem;
  /**
   * SupplementaryDetails (US): Enter the Additional amplifying information that
   * would facilitate processing. This includes, but is not limited to, the
   * following items: 1) doppler shift, if a significant factor in the
   * particular system, 2) a general description of the assignment requirement
   * (applies to experimental stations), 3) sounder justification, 4)
   * coordination data, and 5) refer to National Telecommunications and
   * Information Administration (NTIA) manual, Chapter 9, for further details.
   */
  @XmlElement(name = "SupplementaryDetails", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString supplementaryDetails;
  /**
   * TypeOfService (US): Enter the Indicates the type of service/circuit
   * involved.
   * <p>
   * Recommend values from Code List UTY
   */
  @XmlElement(name = "TypeOfService", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString typeOfService;
  /**
   * UsageCode (US): Indicate the usage and category of circuits.
   * <p>
   * Recommend values from Code List UUC
   */
  @XmlElement(name = "UsageCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS150.class)
  private TString usageCode;
  /**
   * UsageFrequency (US): Indicate the general amount of time when the frequency
   * assignment's frequencies will be either guarded (monitored) or used for
   * transmission.
   * <p>
   * Recommend values from Code List UUF
   */
  @XmlElement(name = "UsageFrequency", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString usageFrequency;
  /**
   * UsagePercentage (US): Enter the percentage of time the transmitter
   * equipment is in use during the scheduled hours of operation.
   */
  @XmlElement(name = "UsagePercentage", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUS_PERCENT.class)
  private TInteger usagePercentage;
  /**
   * UserNetCode (US): Enter a unique code that identifies the specific user of
   * the frequency, i.e., the command, activity, unit, project, etc.
   */
  @XmlElement(name = "UserNetCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS6.class)
  private TString userNetCode;
  /**
   * Data element Project provides the Project, OPLAN, COMPLAN or Exercise name,
   * or any other project name associated to the dataset. Project includes a
   * type, name and description.
   */
  @XmlElement(name = "Project")
  private List<Project> project;
  /**
   * Data element POC contains a reference to a Contact, Organisation or Role
   * dataset.
   */
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  /**
   * Data element SysOfStation defines the name of the system that this
   * assignment belongs and whether or not the assignment provides assets to or
   * uses another assignment resources. It also describes linkages to or from
   * other datasets.
   */
  @XmlElement(name = "SysOfStation")
  private List<SysOfStation> sysOfStation;
  /**
   * This element contains the serial of a referenced Assignment, Allotment,
   * SSReply, ForceElement or FEDeployment.
   * <p>
   * It MAY be used to link several assignments which are related to each other,
   * or to refer to the Supportability documentation on which the assignment is
   * based. It MAY also be used to indicate that the assignment concerns a
   * specific force element, or a deployed force element. It SHOULD be used when
   * an assignment is produced out of an allotment.
   */
  @XmlElement(name = "RelatedRef", nillable = true)
  private List<RelatedRef> relatedRef;
  /**
   * Data element Configuration identifies each operational configuration that
   * is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station. Finally, it may indicate if the receiver station is
   * used primarily as a repeater. A direct coupling between the station's
   * receiver and the station's transmitter allows the incoming signal to be
   * retransmitted exactly as received.
   */
  @XmlElement(name = "Configuration", required = true)
  private List<Configuration> configuration;
  /**
   * Data element Station defines the station, or one of the stations, within
   * the current Assignment dataset. A station is one or more transmitters or
   * receivers or a combination of transmitters and receivers, including the
   * accessory equipment necessary at one location for carrying on a
   * radiocommunication, radiolocation, or other spectrum dependent functions.
   * It may indicate the international call sign assigned to the transmitting
   * station. It also identifies the Location of the Station, and the service
   * volume of an air/ground/air assignment defined as a circle (point location
   * with radius), an ellipse or a polygon, plus a height. For navigational
   * aids, this data item is used for the NAVAIDS identifier instead of a call
   * sign.
   */
  @XmlElement(name = "Station", required = true)
  private List<Station> station;
  /**
   * Data element Link identifies each link in a system of assignments. This is
   * the top element of each Link. The exact definition of a link is very
   * flexible and depends on the degree of accuracy needed for the assignment. A
   * link can be very generic (one or several base stations serving an area or a
   * volume with non-defined mobiles) to very accurate (such as one link for
   * each radio-relay hop).
   */
  @XmlElement(name = "Link", required = true)
  private List<Link> link;
  /**
   * A log of the state of the record or action performed
   */
  @XmlElement(name = "StatusLog")
  private List<StatusLog> statusLog;
  /**
   * The name of an individual or organization related to the frequency
   * assignment.
   */
  @XmlElement(name = "AsgnAllotOwner")
  private List<AsgnAllotOwner> asgnAllotOwner;
  /**
   * Enter the Any additional data to be submitted by the applicant that cannot
   * be accommodated in any of the other data items in the Government Master
   * File (GMF).
   */
  @XmlElement(name = "CircuitRemarks")
  private List<CircuitRemarks> circuitRemarks;
  /**
   * The coordinating entity and Comments from the coordinating entity.
   */
  @XmlElement(name = "CoordinationData")
  private List<CoordinationData> coordinationData;
  /**
   * DocketNum: Enter the reference number assigned by the Interdepartment Radio
   * Advisory Committee (IRAC) to frequency applications submitted to the
   * Frequency Assignment Subcommittee (FAS).
   */
  @XmlElement(name = "DocketNum")
  private List<DocketNum> docketNum;
  /**
   * HostDocketNum: Enter the docket number assigned by the host (soil) country
   * to the frequency authorization.
   */
  @XmlElement(name = "HostDocketNum")
  private List<HostDocketNum> hostDocketNum;
  /**
   * Indicate a specialized type of system/equipment used in the frequency
   * assignment, as defined by the following choices: LMS, VOR1A, VOR1B, VOR2A,
   * VOR2B, ILSLOC, or ILSGS.
   */
  @XmlElement(name = "OffTheShelfEquipment")
  private List<OffTheShelfEquipment> offTheShelfEquipment;
  /**
   * The AgencySerialNum refers to the frequency assignment's previous
   * Government Master File (GMF) authorization agency serial number.
   * <p>
   * The frequency assignment's previous Government Master File (GMF)
   * authorization docket number.
   */
  @XmlElement(name = "PreviousAuthorization")
  private List<PreviousAuthorization> previousAuthorization;
  /**
   * Enter a reference to the Note dataset that describes the note identified in
   * NoteCode.
   */
  @XmlElement(name = "RecordNote")
  private List<RecordNote> recordNote;

  public Assignment(ListCCY snCountry, String snOrganization, String snSerial, Calendar entryDateTime) {
    super(snCountry, snOrganization, snSerial, entryDateTime);
  }

  public Assignment(ListCCY snCountry, String snOrganization, String snSerial, Date entryDateTime) {
    super(snCountry, snOrganization, snSerial, entryDateTime);
  }

  public Assignment() {
  }

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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the project property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getProject().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pocInformation property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPOCInformation().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the sysOfStation property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSysOfStation().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the relatedRef property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRelatedRef().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the configuration property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getConfiguration().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the station property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStation().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the link property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLink().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the statusLog property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStatusLog().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the asgnAllotOwner property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAsgnAllotOwner().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the circuitRemarks property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCircuitRemarks().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the coordinationData property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCoordinationData().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the docketNum property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDocketNum().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the hostDocketNum property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getHostDocketNum().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the offTheShelfEquipment property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getOffTheShelfEquipment().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the previousAuthorization property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPreviousAuthorization().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the recordNote property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRecordNote().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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

  public Assignment withUsageType(ListCUT value) {
    setUsageType(new TString(value.name()));
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

  public Assignment withExpirationDateTime(Date value) {
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

  public Assignment withDataSource(ListUDA value) {
    setDataSource(new TString(value.name()));
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

  public Assignment withOriginalAssignmentDate(Date value) {
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

  public Assignment withTypeOfService(ListUTY value) {
    setTypeOfService(new TString(value.name()));
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
