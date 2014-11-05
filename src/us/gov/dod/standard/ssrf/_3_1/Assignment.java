/* 
 * Copyright 2014 Key Bridge Global LLC.
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
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.allotment.POCInformation;
import us.gov.dod.standard.ssrf._3_1.allotment.Project;
import us.gov.dod.standard.ssrf._3_1.assignment.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.*;

/**
 * Assignment is the XML root for all parameters of a system of assignments.
 * <p>
 * Sub-Elements are
 * {@link AsgnAllotOwner}, {@link CircuitRemarks}, {@link Configuration}, {@link CoordinationData}, {@link DocketNum}, {@link HostDocketNum}, {@link Link}, {@link OffTheShelfEquipment}, {@link POCInformation}, {@link PreviousAuthorization}, {@link Project}, {@link RecordNote}, {@link Station}, {@link StatusLog}, {@link SysOfStation}
 * <p>
 * Example:
 * <pre>
 * &lt;Assignment cls="U"&gt;
 *   &lt;Serial cls="U"&gt;NLD::AS:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;EffectiveDateTime cls="U"&gt;2011-12-28T00:00:00Z&lt;/EffectiveDateTime&gt;
 *   &lt;Function cls="U"&gt;AIR OPS&lt;/Function&gt;
 *   &lt;Configuration&gt;
 *     &lt;ConfigID cls="U"&gt;CONFIG1&lt;/ConfigID&gt;
 *     &lt;TxRef&gt;
 *       &lt;Serial cls="U"&gt;NLD::TX:444&lt;/Serial&gt;
 *     &lt;/TxRef&gt;
 *   &lt;/Configuration&gt;
 *   &lt;Station&gt;
 *     &lt;StationID cls="U"&gt;STATION1&lt;/StationID&gt;
 *     &lt;LocSatRef cls="U"&gt;NLD::LO:111&lt;/LocSatRef&gt;
 *     &lt;ServiceVolumeLocRef cls="U"&gt;NLD::LO:222&lt;/ServiceVolumeLocRef&gt;
 *     &lt;ServiceVolumeHeight cls="U"&gt;10000&lt;/ServiceVolumeHeight&gt;
 *   &lt;/Station&gt;
 *   &lt;Link&gt;
 *     &lt;LinkID cls="U"&gt;LINK1&lt;/LinkID&gt;
 *     &lt;StationConfig&gt;
 *       &lt;Type cls="U"&gt;Transmit-Receive&lt;/Type&gt;
 *       &lt;ConfigID cls="U"&gt;CONFIG1&lt;/ConfigID&gt;
 *       &lt;StationID cls="U"&gt;STATION1&lt;/StationID&gt;
 *     &lt;/StationConfig&gt;
 *     &lt;Assigned&gt;
 *       &lt;Freq&gt;
 *         &lt;FreqMin cls="U"&gt;256.275&lt;/FreqMin&gt;
 *       &lt;/Freq&gt;
 *     &lt;/Assigned&gt;
 *   &lt;/Link&gt;
 * &lt;/Assignment&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
  "primaryStation",
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
   * Title - Title (Optional)
   * <p>
   * An identifying name for this Allotment or Assignment.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Title", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString title;
  /**
   * UsageType - Type of Usage (Optional)
   * <p>
   * The type of assignment request or approved assignment or allotment. In Data
   * Item case of a rejected or cancelled assignment or allotment, indicate the
   * reason in a Remark.
   * <p>
   * Format is L:CUT
   */
  @XmlElement(name = "UsageType", required = false)
  private TString usageType;
  /**
   * DateResponseRequired - Date Response Required (Optional)
   * <p>
   * The date by which the Assignment or SSReply is required by the requestor.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "DateResponseRequired", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar dateResponseRequired;
  /**
   * EffectiveDateTime - Effective Date/Time (Required)
   * <p>
   * The date and UTC time when the Assignment will be operational.
   * <p>
   * Format is DateTime
   */
  @XmlElement(name = "EffectiveDateTime", required = true)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar effectiveDateTime;
  /**
   * ExpirationDateTime - Expiration Date/Time (Optional)
   * <p>
   * The date and UTC time that this Assignment will expire. The Expiration date
   * should be less than five years from the effective date.
   * <p>
   * Format is DateTime
   * <p>
   * Attribute group ExpireReviewDT (Required)
   */
  @XmlElement(name = "ExpirationDateTime", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar expirationDateTime;
  /**
   * ReviewDate - Review Date (Optional)
   * <p>
   * The date by which the dataset is to be reviewed. The Review date should be
   * less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the request should be
   * resubmitted to the host nation for continued equipment use.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReviewDT (Required)
   */
  @XmlElement(name = "ReviewDate", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  /**
   * Period - Periodicity of Use (Optional)
   * <p>
   * The general period on a daily basis when the frequency assignment
   * frequencies will be either guarded (monitored) or used for transmission.
   * <p>
   * Format is L:CTI
   */
  @XmlElement(name = "Period", required = false)
  private TString period;
  /**
   * Seconds - Seconds (Optional)
   * <p>
   * The seconds of hour [0-59] when the Assignment will be guarded (monitored)
   * or used for transmission.
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   */
  @XmlElement(name = "Seconds", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMINSEC.class)
  private TString seconds;
  /**
   * Minutes - Minutes (Optional)
   * <p>
   * The minutes of an hour (0-59) when the Assignment will be guarded
   * (monitored) or used for transmission.
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
   * The hours of day [0-23] (UTC time) when the Assignment will be guarded
   * (monitored) or used for transmission.
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   */
  @XmlElement(name = "Hours", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterHOURS.class)
  private TString hours;
  /**
   * DaysofMonth - Days Of Month (Optional)
   * <p>
   * The day of month [1-31] when the Assignment will be guarded (monitored) or
   * used for transmission.
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
   * The month of year [1-12] when the Assignment will be guarded (monitored) or
   * used for transmission.
   * <p>
   * Format is pattern (S40)
   * <p>
   * Attribute group TimeFrame (Optional)
   */
  @XmlElement(name = "Months", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMONTHS.class)
  private TString months;
  /**
   * DaysofWeek - Days Of Week (Optional)
   * <p>
   * The weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc] when the
   * Assignment will be guarded (monitored) or used for transmission.
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
   * The 4-digit year [1900..2100] when the Assignment will be guarded
   * (monitored) or used for transmission.
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
   */
  @XmlElement(name = "Duration", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterDURATION_UN4.class)
  private TInteger duration;
  /**
   * Processing - Processing (Optional)
   * <p>
   * If the frequency assignment is to be approved at the national or
   * international level.
   * <p>
   * Format is L:CPI
   */
  @XmlElement(name = "Processing", required = false)
  private TString processing;
  /**
   * Emergency - Emergency Indicator (Optional)
   * <p>
   * "Yes" if the system may be used in a case of emergency.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Emergency", required = false)
  private TString emergency;
  /**
   * AssignmentAuthority - Assigning Authority (Optional)
   * <p>
   * The user acceptance of host-nation or NATO HQ frequency nominations.
   * <p>
   * Format is L:CHN
   */
  @XmlElement(name = "AssignmentAuthority", required = false)
  private TString assignmentAuthority;
  /**
   * Requirement - Requirement (Optional)
   * <p>
   * Any amplifying information about the requirement.
   * <p>
   * USA: Enter Agency remarks which, while pertinent to the frequency
   * assignment, are not intended to be part of the application processed
   * through the Interdepartment Radio Advisory Committee (IRAC). These remarks,
   * therefore, will be excluded from the Government Master File (GMF).
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "Requirement", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString requirement;
  /**
   * NumSystems - Number of Using Systems (Optional)
   * <p>
   * The total number of systems that are expected to use this Assignment.
   * <p>
   * Format is UN(9)
   */
  @XmlElement(name = "NumSystems", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numSystems;
  /**
   * US:AgencyActionNum - Agency Action Number (Optional)
   * <p>
   * The "An" identifier used to track transactions.
   * <p>
   * Format is S12
   */
  @XmlElement(name = "AgencyActionNum", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS12.class)
  private TString agencyActionNum;
  /**
   * US:AgencyComments - Agency Comments (Optional)
   * <p>
   * The Agency remarks in the applications processed through the
   * Interdepartment Radio Advisory Committee (IRAC). These remarks will be
   * included in the Government Master File (GMF).
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "AgencyComments", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString agencyComments;
  /**
   * US:AgencySerialNum - Agency Serial Number (Optional)
   * <p>
   * The externally-assigned unique identifier of a frequency assignment.
   * <p>
   * Format is S12
   */
  @XmlElement(name = "AgencySerialNum", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS12.class)
  private TString agencySerialNum;
  /**
   * US:AssignmentDate - Assignment Date (Optional)
   * <p>
   * The date the assignment was most recently authorized.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "AssignmentDate", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar assignmentDate;
  /**
   * US:COCOMGroup - COCOM Group (Optional)
   * <p>
   * PACOM to identify a grouping of frequencies having a like or similar use.
   * Enter EUCOM to identify the function number(s) used by the Frequency
   * Management Sub-Committee (FMSC) to specify the operational use of
   * frequencies.
   * <p>
   * Format is S8
   */
  @XmlElement(name = "COCOMGroup", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS8.class)
  private TString cocomGroup;
  /**
   * US:ControlRequestNum - Control Request Number (Optional)
   * <p>
   * The control or request identifier that allows subordinate organizations to
   * track specific frequency applications.
   * <p>
   * Format is S15
   */
  @XmlElement(name = "ControlRequestNum", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS15.class)
  private TString controlRequestNum;
  /**
   * US:CoordinationComments - Coordination Comments (Optional)
   * <p>
   * The Comments related to the external coordination of a frequency
   * assignment.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "CoordinationComments", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString coordinationComments;
  /**
   * US:DataSource - Data Source (Optional)
   * <p>
   * The source or organization from which the data record was received.
   * <p>
   * Format is L:UDA
   */
  @XmlElement(name = "DataSource", required = false)
  private TString dataSource;
  /**
   * US:FCCFileNum - FCC File Number (Optional)
   * <p>
   * The file number assigned by the Federal Communications Commission (FCC),
   * issued to non-government stations operating on government frequencies or
   * government stations operating on nongovernment frequencies, which is unique
   * to each FCC license.
   * <p>
   * Format is S22
   */
  @XmlElement(name = "FCCFileNum", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS22.class)
  private TString fccFileNum;
  /**
   * US:FMSCNum - FMSC Number (Optional)
   * <p>
   * The assignment serial number as registered in the Frequency Management
   * Subcommittee (FMSC) Master Radio Frequency List (MRFL).
   * <p>
   * Format is S14
   */
  @XmlElement(name = "FMSCNum", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS14.class)
  private TString fmscNum;
  /**
   * US:FrequencyActionOfficer - Frequency Action Officer (Optional)
   * <p>
   * A MILDEP code identifying the person or group responsible for the frequency
   * assignment.
   * <p>
   * Format is S3
   */
  @XmlElement(name = "FrequencyActionOfficer", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS3.class)
  private TString frequencyActionOfficer;
  /**
   * US:ListSerialNum - List Serial Number (Optional)
   * <p>
   * The agency list serial number of a Government Master File (GMF) record
   * representing a group or area assignment. It brings into use, by a
   * particular station or stations, a frequency authorised under a group
   * assignment or authorised for communications with nongovernment stations.
   * <p>
   * Format is S12
   */
  @XmlElement(name = "ListSerialNum", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS12.class)
  private TString listSerialNum;
  /**
   * US:NATOPooledFrequencyCode - NATO Pooled Frequency Code (Optional)
   * <p>
   * The Type Special Assignment for the frequency assignment.
   * <p>
   * Format is L:UPF
   */
  @XmlElement(name = "NATOPooledFrequencyCode", required = false)
  private TString natoPooledFrequencyCode;
  /**
   * US:NATOPooledFrequencyNum - NATO Pooled Frequency Number (Optional)
   * <p>
   * The a Frequency Management Sub-committee (FMSC) assigned code number
   * identifying the type and nationality of a frequency pool.
   * <p>
   * Format is UN(4)
   */
  @XmlElement(name = "NATOPooledFrequencyNum", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger natoPooledFrequencyNum;
  /**
   * US:OriginalAssignmentDate - Original Assignment Date (Optional)
   * <p>
   * The date the frequency assignment was originally authorized.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "OriginalAssignmentDate", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar originalAssignmentDate;
  /**
   * US:RoutineAgendaItem - Routine Agenda Item (Optional)
   * <p>
   * The type of National Telecommunications and Information Administration
   * (NTIA) Frequency Assignment Subcommittee (FAS) agenda on which the
   * application will be processed. This value is computer-generated by NTIA for
   * its internal processing of frequency assignment applications. It is an
   * output data item only.
   * <p>
   * Format is L:URI
   */
  @XmlElement(name = "RoutineAgendaItem", required = false)
  private TString routineAgendaItem;
  /**
   * US:SupplementaryDetails - Supplementary Details (Optional)
   * <p>
   * Amplifying information that would facilitate processing. This includes, but
   * is not limited to, the following items: (1) Doppler shift, if a significant
   * factor in the particular system, (2) a general description of the
   * assignment requirement (applies to experimental stations), (3) sounder
   * justification, (4) coordination data, and (5) refer to National
   * Telecommunications and Information Administration (NTIA) manual, Chapter 9,
   * for further details.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "SupplementaryDetails", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString supplementaryDetails;
  /**
   * US:TypeOfService - Type Of Service (Optional)
   * <p>
   * The type of service or circuit involved.
   * <p>
   * Format is L:UTY
   */
  @XmlElement(name = "TypeOfService", required = false)
  private TString typeOfService;
  /**
   * US:UsageCode - Usage Code (Optional)
   * <p>
   * The usage and category of circuits.
   * <p>
   * Format is L:UUC
   */
  @XmlElement(name = "UsageCode", required = false)
  private TString usageCode;
  /**
   * US:UsageFrequency - Usage Frequency (Optional)
   * <p>
   * The general amount of time when the frequency assignment frequencies will
   * be either guarded (monitored) or used for transmission.
   * <p>
   * Format is L:UUF
   */
  @XmlElement(name = "UsageFrequency", required = false)
  private TString usageFrequency;
  /**
   * US:UsagePercentage - Usage Percentage (Optional)
   * <p>
   * The percentage of time the transmitter equipment is in use during the
   * scheduled hours of operation.
   * <p>
   * Format is UN(3) [0..100] (%)
   */
  @XmlElement(name = "UsagePercentage", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUS_PERCENT.class)
  private TInteger usagePercentage;
  /**
   * US:UserNetCode - User Net Code (Optional)
   * <p>
   * A unique code that identifies the specific user of the frequency, i.e., the
   * command, activity, unit, project, etc.
   * <p>
   * Format is S6
   */
  @XmlElement(name = "UserNetCode", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS6.class)
  private TString userNetCode;
  /**
   * US:PrimaryStation - Primary Station (Optional)
   * <p>
   * Whether this station is the station of primary regulatory interest.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "PrimaryStation", required = false)
  private TString primaryStation;
  /**
   * Project (Optional)
   * <p>
   * Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other
   * project name associated to the dataset.
   */
  @XmlElement(name = "Project")
  private Set<Project> project;
  /**
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
   */
  @XmlElement(name = "POCInformation")
  private Set<POCInformation> pocInformation;
  /**
   * SysofStation (Optional)
   * <p>
   * SysOfStation defines the name of the system that this assignment belongs
   * and whether or not the assignment provides assets to or uses another
   * assignment resources. It also describes linkages to or from other datasets.
   */
  @XmlElement(name = "SysOfStation")
  private Set<SysOfStation> sysOfStation;
  /**
   * RelatedRef (Optional)
   * <p>
   * RelatedRef contains the serial of a referenced Assignment, Allotment,
   * SSReply, ForceElement or FEDeployment.
   */
  @XmlElement(name = "RelatedRef", nillable = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private Set<TSerial> relatedRef;
  /**
   * Configuration (Required)
   * <p>
   * Configuration identifies each operational configuration that is required in
   * a SSRequest, granted by a Host Nation in a SSReply, or authorised in a
   * frequency Assignment or Allotment dataset.
   */
  @XmlElement(name = "Configuration", required = true)
  private Set<Configuration> configuration;
  /**
   * Station (Required)
   * <p>
   * Station defines the station, or one of the stations, within the current
   * Assignment dataset.
   */
  @XmlElement(name = "Station", required = true)
  private Set<Station> station;
  /**
   * Link (Required)
   * <p>
   * Link identifies each link in a system of assignments. This is the top
   * element of each Link. The exact definition of a link is very flexible and
   * depends on the degree of accuracy needed for the assignment. A link can be
   * very generic (one or several base stations serving an area or a volume with
   * non-defined mobiles) to very accurate (such as one link for each
   * radio-relay hop).
   */
  @XmlElement(name = "Link", required = true)
  private Set<Link> link;
  /**
   * US:StatusLog (Optional)
   * <p>
   * StatusLog (US) contains the transactional processing information related to
   * frequency assignments.
   */
  @XmlElement(name = "StatusLog")
  private Set<StatusLog> statusLog;
  /**
   * US:AsgnAllotOwner (Optional)
   * <p>
   * AsgnAllotOwner (US) contains the serial of the owning, or originating,
   * organisation.
   */
  @XmlElement(name = "AsgnAllotOwner")
  private Set<AsgnAllotOwner> asgnAllotOwner;
  /**
   * US:CircuitRemarks (Optional)
   * <p>
   * CircuitRemarks (US) contains general information about the network and
   * equipment used to support a specific frequency assignment or assignments.
   */
  @XmlElement(name = "CircuitRemarks", nillable = true)
  private Set<CircuitRemarks> circuitRemarks;
  /**
   * US:CoordinationData (Optional)
   * <p>
   * CoordinationData (US) contains Host Nation coordination information.
   */
  @XmlElement(name = "CoordinationData")
  private Set<CoordinationData> coordinationData;
  /**
   * US:DocketNum (Optional)
   * <p>
   * DocketNum (US) contains the docket number from a prior data repository.
   */
  @XmlElement(name = "DocketNum", nillable = true)
  private Set<DocketNum> docketNum;
  /**
   * US:HostDocketNum (Optional)
   * <p>
   * HostDocketNum (US) contains the Host Nation docket number from a prior data
   * repository.
   */
  @XmlElement(name = "HostDocketNum", nillable = true)
  private Set<HostDocketNum> hostDocketNum;
  /**
   * US:OffTheShelfEquipment (Optional)
   * <p>
   * OffTheShelfEquipment (US) defines the function of readily available
   * equipment. It is often commercial equipment that provides a compatible
   * function to DoD or government equipment.
   */
  @XmlElement(name = "OffTheShelfEquipment", nillable = true)
  private Set<OffTheShelfEquipment> offTheShelfEquipment;
  /**
   * US:PreviousAuthorization (Optional)
   * <p>
   * Previous Authorization (US) refers to the frequency assignment's previous
   * Government Master File (GMF) authorization agency serial number.
   */
  @XmlElement(name = "PreviousAuthorization")
  private Set<PreviousAuthorization> previousAuthorization;
  /**
   * US:RecordNote (Optional)
   * <p>
   * RecordNote (US) contains a reference to a formal host nation "note" and
   * specific comments.
   */
  @XmlElement(name = "RecordNote")
  private Set<RecordNote> recordNote;

  /**
   * Get an identifying name for this Allotment or Assignment.
   * <p>
   * @return the Title value in a {@link TString} data type
   */
  public TString getTitle() {
    return title;
  }

  /**
   * Set an identifying name for this Allotment or Assignment.
   * <p>
   * @param value the Title value in a {@link TString} data type
   */
  public void setTitle(TString value) {
    this.title = value;
  }

  /**
   * Determine if the Title is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTitle() {
    return (this.title != null ? this.title.isSetValue() : false);
  }

  /**
   * Get the type of assignment request or approved assignment or allotment. In
   * Data Item case of a rejected or cancelled assignment or allotment, indicate
   * the reason in a Remark.
   * <p>
   * @return the UsageType value in a {@link TString} data type
   */
  public TString getUsageType() {
    return usageType;
  }

  /**
   * Set the type of assignment request or approved assignment or allotment. In
   * Data Item case of a rejected or cancelled assignment or allotment, indicate
   * the reason in a Remark.
   * <p>
   * @param value the UsageType value in a {@link TString} data type
   */
  public void setUsageType(TString value) {
    this.usageType = value;
  }

  /**
   * Determine if the UsageType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUsageType() {
    return (this.usageType != null ? this.usageType.isSetValue() : false);
  }

  /**
   * Get the date by which the Assignment or SSReply is required by the
   * requestor.
   * <p>
   * @return the DateResponseRequired value in a {@link TCalendar} data type
   */
  public TCalendar getDateResponseRequired() {
    return dateResponseRequired;
  }

  /**
   * Set the date by which the Assignment or SSReply is required by the
   * requestor.
   * <p>
   * @param value the DateResponseRequired value in a {@link TCalendar} data
   *              type
   */
  public void setDateResponseRequired(TCalendar value) {
    this.dateResponseRequired = value;
  }

  /**
   * Determine if the DateResponseRequired is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDateResponseRequired() {
    return (this.dateResponseRequired != null ? this.dateResponseRequired.isSetValue() : false);
  }

  /**
   * Get the date and UTC time when the Assignment will be operational.
   * <p>
   * @return the EffectiveDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getEffectiveDateTime() {
    return effectiveDateTime;
  }

  /**
   * Set the date and UTC time when the Assignment will be operational.
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
   * Get the date and UTC time that this Assignment will expire. The Expiration
   * date should be less than five years from the effective date.
   * <p>
   * @return the ExpirationDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getExpirationDateTime() {
    return expirationDateTime;
  }

  /**
   * Set the date and UTC time that this Assignment will expire. The Expiration
   * date should be less than five years from the effective date.
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
   * Get the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the request should be
   * resubmitted to the host nation for continued equipment use.
   * <p>
   * @return the ReviewDate value in a {@link TCalendar} data type
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the request should be
   * resubmitted to the host nation for continued equipment use.
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
   * Get the general period on a daily basis when the frequency assignment
   * frequencies will be either guarded (monitored) or used for transmission.
   * <p>
   * @return the Period value in a {@link TString} data type
   */
  public TString getPeriod() {
    return period;
  }

  /**
   * Set the general period on a daily basis when the frequency assignment
   * frequencies will be either guarded (monitored) or used for transmission.
   * <p>
   * @param value the Period value in a {@link TString} data type
   */
  public void setPeriod(TString value) {
    this.period = value;
  }

  /**
   * Determine if the Period is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPeriod() {
    return (this.period != null ? this.period.isSetValue() : false);
  }

  /**
   * Get the seconds of hour [0-59] when the Assignment will be guarded
   * (monitored) or used for transmission.
   * <p>
   * @return the Seconds value in a {@link TString} data type
   */
  public TString getSeconds() {
    return seconds;
  }

  /**
   * Set the seconds of hour [0-59] when the Assignment will be guarded
   * (monitored) or used for transmission.
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
   * Get the minutes of an hour (0-59) when the Assignment will be guarded
   * (monitored) or used for transmission.
   * <p>
   * @return the Minutes value in a {@link TString} data type
   */
  public TString getMinutes() {
    return minutes;
  }

  /**
   * Set the minutes of an hour (0-59) when the Assignment will be guarded
   * (monitored) or used for transmission.
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
   * Get the hours of day [0-23] (UTC time) when the Assignment will be guarded
   * (monitored) or used for transmission.
   * <p>
   * @return the Hours value in a {@link TString} data type
   */
  public TString getHours() {
    return hours;
  }

  /**
   * Set the hours of day [0-23] (UTC time) when the Assignment will be guarded
   * (monitored) or used for transmission.
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
   * Get the day of month [1-31] when the Assignment will be guarded (monitored)
   * or used for transmission.
   * <p>
   * @return the DaysOfMonth value in a {@link TString} data type
   */
  public TString getDaysOfMonth() {
    return daysOfMonth;
  }

  /**
   * Set the day of month [1-31] when the Assignment will be guarded (monitored)
   * or used for transmission.
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
   * Get the month of year [1-12] when the Assignment will be guarded
   * (monitored) or used for transmission.
   * <p>
   * @return the Months value in a {@link TString} data type
   */
  public TString getMonths() {
    return months;
  }

  /**
   * Set the month of year [1-12] when the Assignment will be guarded
   * (monitored) or used for transmission.
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
   * Get the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc] when
   * the Assignment will be guarded (monitored) or used for transmission.
   * <p>
   * @return the DaysOfWeek value in a {@link TString} data type
   */
  public TString getDaysOfWeek() {
    return daysOfWeek;
  }

  /**
   * Set the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc] when
   * the Assignment will be guarded (monitored) or used for transmission.
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
   * Get the 4-digit year [1900..2100] when the Assignment will be guarded
   * (monitored) or used for transmission.
   * <p>
   * @return the Years value in a {@link TString} data type
   */
  public TString getYears() {
    return years;
  }

  /**
   * Set the 4-digit year [1900..2100] when the Assignment will be guarded
   * (monitored) or used for transmission.
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
   * <DaysofWeek>1-5</DaysofWeek>
   * <p>
   * @return the Duration value in a {@link TInteger} data type
   */
  public TInteger getDuration() {
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
   * Get if the frequency assignment is to be approved at the national or
   * international level.
   * <p>
   * @return the Processing value in a {@link TString} data type
   */
  public TString getProcessing() {
    return processing;
  }

  /**
   * Set if the frequency assignment is to be approved at the national or
   * international level.
   * <p>
   * @param value the Processing value in a {@link TString} data type
   */
  public void setProcessing(TString value) {
    this.processing = value;
  }

  /**
   * Determine if the Processing is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetProcessing() {
    return (this.processing != null ? this.processing.isSetValue() : false);
  }

  /**
   * Get "Yes" if the system may be used in a case of emergency.
   * <p>
   * @return the Emergency value in a {@link TString} data type
   */
  public TString getEmergency() {
    return emergency;
  }

  /**
   * Set "Yes" if the system may be used in a case of emergency.
   * <p>
   * @param value the Emergency value in a {@link TString} data type
   */
  public void setEmergency(TString value) {
    this.emergency = value;
  }

  /**
   * Determine if the Emergency is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEmergency() {
    return (this.emergency != null ? this.emergency.isSetValue() : false);
  }

  /**
   * Get the user acceptance of host-nation or NATO HQ frequency nominations.
   * <p>
   * @return the AssignmentAuthority value in a {@link TString} data type
   */
  public TString getAssignmentAuthority() {
    return assignmentAuthority;
  }

  /**
   * Set the user acceptance of host-nation or NATO HQ frequency nominations.
   * <p>
   * @param value the AssignmentAuthority value in a {@link TString} data type
   */
  public void setAssignmentAuthority(TString value) {
    this.assignmentAuthority = value;
  }

  /**
   * Determine if the AssignmentAuthority is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAssignmentAuthority() {
    return (this.assignmentAuthority != null ? this.assignmentAuthority.isSetValue() : false);
  }

  /**
   * Get any amplifying information about the requirement.
   * <p>
   * USA: Enter Agency remarks which, while pertinent to the frequency
   * assignment, are not intended to be part of the application processed
   * through the Interdepartment Radio Advisory Committee (IRAC). These remarks,
   * therefore, will be excluded from the Government Master File (GMF).
   * <p>
   * @return the Requirement value in a {@link TString} data type
   */
  public TString getRequirement() {
    return requirement;
  }

  /**
   * Set any amplifying information about the requirement.
   * <p>
   * USA: Enter Agency remarks which, while pertinent to the frequency
   * assignment, are not intended to be part of the application processed
   * through the Interdepartment Radio Advisory Committee (IRAC). These remarks,
   * therefore, will be excluded from the Government Master File (GMF).
   * <p>
   * @param value the Requirement value in a {@link TString} data type
   */
  public void setRequirement(TString value) {
    this.requirement = value;
  }

  /**
   * Determine if the Requirement is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRequirement() {
    return (this.requirement != null ? this.requirement.isSetValue() : false);
  }

  /**
   * Get the total number of systems that are expected to use this Assignment.
   * <p>
   * @return the NumSystems value in a {@link TInteger} data type
   */
  public TInteger getNumSystems() {
    return numSystems;
  }

  /**
   * Set the total number of systems that are expected to use this Assignment.
   * <p>
   * @param value the NumSystems value in a {@link TInteger} data type
   */
  public void setNumSystems(TInteger value) {
    this.numSystems = value;
  }

  /**
   * Determine if the NumSystems is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumSystems() {
    return (this.numSystems != null ? this.numSystems.isSetValue() : false);
  }

  /**
   * Get the "An" identifier used to track transactions.
   * <p>
   * @return the AgencyActionNum value in a {@link TString} data type
   */
  public TString getAgencyActionNum() {
    return agencyActionNum;
  }

  /**
   * Set the "An" identifier used to track transactions.
   * <p>
   * @param value the AgencyActionNum value in a {@link TString} data type
   */
  public void setAgencyActionNum(TString value) {
    this.agencyActionNum = value;
  }

  /**
   * Determine if the AgencyActionNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAgencyActionNum() {
    return (this.agencyActionNum != null ? this.agencyActionNum.isSetValue() : false);
  }

  /**
   * Get the Agency remarks in the applications processed through the
   * Interdepartment Radio Advisory Committee (IRAC). These remarks will be
   * included in the Government Master File (GMF).
   * <p>
   * @return the AgencyComments value in a {@link TString} data type
   */
  public TString getAgencyComments() {
    return agencyComments;
  }

  /**
   * Set the Agency remarks in the applications processed through the
   * Interdepartment Radio Advisory Committee (IRAC). These remarks will be
   * included in the Government Master File (GMF).
   * <p>
   * @param value the AgencyComments value in a {@link TString} data type
   */
  public void setAgencyComments(TString value) {
    this.agencyComments = value;
  }

  /**
   * Determine if the AgencyComments is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAgencyComments() {
    return (this.agencyComments != null ? this.agencyComments.isSetValue() : false);
  }

  /**
   * Get the externally-assigned unique identifier of a frequency assignment.
   * <p>
   * @return the AgencySerialNum value in a {@link TString} data type
   */
  public TString getAgencySerialNum() {
    return agencySerialNum;
  }

  /**
   * Set the externally-assigned unique identifier of a frequency assignment.
   * <p>
   * @param value the AgencySerialNum value in a {@link TString} data type
   */
  public void setAgencySerialNum(TString value) {
    this.agencySerialNum = value;
  }

  /**
   * Determine if the AgencySerialNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAgencySerialNum() {
    return (this.agencySerialNum != null ? this.agencySerialNum.isSetValue() : false);
  }

  /**
   * Get the date the assignment was most recently authorized.
   * <p>
   * @return the AssignmentDate value in a {@link TCalendar} data type
   */
  public TCalendar getAssignmentDate() {
    return assignmentDate;
  }

  /**
   * Set the date the assignment was most recently authorized.
   * <p>
   * @param value the AssignmentDate value in a {@link TCalendar} data type
   */
  public void setAssignmentDate(TCalendar value) {
    this.assignmentDate = value;
  }

  /**
   * Determine if the AssignmentDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAssignmentDate() {
    return (this.assignmentDate != null ? this.assignmentDate.isSetValue() : false);
  }

  /**
   * Get PACOM to identify a grouping of frequencies having a like or similar
   * use. Enter EUCOM to identify the function number(s) used by the Frequency
   * Management Sub-Committee (FMSC) to specify the operational use of
   * frequencies.
   * <p>
   * @return the COCOMGroup value in a {@link TString} data type
   */
  public TString getCOCOMGroup() {
    return cocomGroup;
  }

  /**
   * Set PACOM to identify a grouping of frequencies having a like or similar
   * use. Enter EUCOM to identify the function number(s) used by the Frequency
   * Management Sub-Committee (FMSC) to specify the operational use of
   * frequencies.
   * <p>
   * @param value the COCOMGroup value in a {@link TString} data type
   */
  public void setCOCOMGroup(TString value) {
    this.cocomGroup = value;
  }

  /**
   * Determine if the COCOMGroup is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCOCOMGroup() {
    return (this.cocomGroup != null ? this.cocomGroup.isSetValue() : false);
  }

  /**
   * Get the control or request identifier that allows subordinate organizations
   * to track specific frequency applications.
   * <p>
   * @return the ControlRequestNum value in a {@link TString} data type
   */
  public TString getControlRequestNum() {
    return controlRequestNum;
  }

  /**
   * Set the control or request identifier that allows subordinate organizations
   * to track specific frequency applications.
   * <p>
   * @param value the ControlRequestNum value in a {@link TString} data type
   */
  public void setControlRequestNum(TString value) {
    this.controlRequestNum = value;
  }

  /**
   * Determine if the ControlRequestNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetControlRequestNum() {
    return (this.controlRequestNum != null ? this.controlRequestNum.isSetValue() : false);
  }

  /**
   * Get the Comments related to the external coordination of a frequency
   * assignment.
   * <p>
   * @return the CoordinationComments value in a {@link TString} data type
   */
  public TString getCoordinationComments() {
    return coordinationComments;
  }

  /**
   * Set the Comments related to the external coordination of a frequency
   * assignment.
   * <p>
   * @param value the CoordinationComments value in a {@link TString} data type
   */
  public void setCoordinationComments(TString value) {
    this.coordinationComments = value;
  }

  /**
   * Determine if the CoordinationComments is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCoordinationComments() {
    return (this.coordinationComments != null ? this.coordinationComments.isSetValue() : false);
  }

  /**
   * Get the source or organization from which the data record was received.
   * <p>
   * @return the DataSource value in a {@link TString} data type
   */
  public TString getDataSource() {
    return dataSource;
  }

  /**
   * Set the source or organization from which the data record was received.
   * <p>
   * @param value the DataSource value in a {@link TString} data type
   */
  public void setDataSource(TString value) {
    this.dataSource = value;
  }

  /**
   * Determine if the DataSource is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDataSource() {
    return (this.dataSource != null ? this.dataSource.isSetValue() : false);
  }

  /**
   * Get the file number assigned by the Federal Communications Commission
   * (FCC), issued to non-government stations operating on government
   * frequencies or government stations operating on nongovernment frequencies,
   * which is unique to each FCC license.
   * <p>
   * @return the FCCFileNum value in a {@link TString} data type
   */
  public TString getFCCFileNum() {
    return fccFileNum;
  }

  /**
   * Set the file number assigned by the Federal Communications Commission
   * (FCC), issued to non-government stations operating on government
   * frequencies or government stations operating on nongovernment frequencies,
   * which is unique to each FCC license.
   * <p>
   * @param value the FCCFileNum value in a {@link TString} data type
   */
  public void setFCCFileNum(TString value) {
    this.fccFileNum = value;
  }

  /**
   * Determine if the FCCFileNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFCCFileNum() {
    return (this.fccFileNum != null ? this.fccFileNum.isSetValue() : false);
  }

  /**
   * Get the assignment serial number as registered in the Frequency Management
   * Subcommittee (FMSC) Master Radio Frequency List (MRFL).
   * <p>
   * @return the FMSCNum value in a {@link TString} data type
   */
  public TString getFMSCNum() {
    return fmscNum;
  }

  /**
   * Set the assignment serial number as registered in the Frequency Management
   * Subcommittee (FMSC) Master Radio Frequency List (MRFL).
   * <p>
   * @param value the FMSCNum value in a {@link TString} data type
   */
  public void setFMSCNum(TString value) {
    this.fmscNum = value;
  }

  /**
   * Determine if the FMSCNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFMSCNum() {
    return (this.fmscNum != null ? this.fmscNum.isSetValue() : false);
  }

  /**
   * Get a MILDEP code identifying the person or group responsible for the
   * frequency assignment.
   * <p>
   * @return the FrequencyActionOfficer value in a {@link TString} data type
   */
  public TString getFrequencyActionOfficer() {
    return frequencyActionOfficer;
  }

  /**
   * Set a MILDEP code identifying the person or group responsible for the
   * frequency assignment.
   * <p>
   * @param value the FrequencyActionOfficer value in a {@link TString} data
   *              type
   */
  public void setFrequencyActionOfficer(TString value) {
    this.frequencyActionOfficer = value;
  }

  /**
   * Determine if the FrequencyActionOfficer is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFrequencyActionOfficer() {
    return (this.frequencyActionOfficer != null ? this.frequencyActionOfficer.isSetValue() : false);
  }

  /**
   * Get the agency list serial number of a Government Master File (GMF) record
   * representing a group or area assignment. It brings into use, by a
   * particular station or stations, a frequency authorised under a group
   * assignment or authorised for communications with nongovernment stations.
   * <p>
   * @return the ListSerialNum value in a {@link TString} data type
   */
  public TString getListSerialNum() {
    return listSerialNum;
  }

  /**
   * Set the agency list serial number of a Government Master File (GMF) record
   * representing a group or area assignment. It brings into use, by a
   * particular station or stations, a frequency authorised under a group
   * assignment or authorised for communications with nongovernment stations.
   * <p>
   * @param value the ListSerialNum value in a {@link TString} data type
   */
  public void setListSerialNum(TString value) {
    this.listSerialNum = value;
  }

  /**
   * Determine if the ListSerialNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetListSerialNum() {
    return (this.listSerialNum != null ? this.listSerialNum.isSetValue() : false);
  }

  /**
   * Get the Type Special Assignment for the frequency assignment.
   * <p>
   * @return the NATOPooledFrequencyCode value in a {@link TString} data type
   */
  public TString getNATOPooledFrequencyCode() {
    return natoPooledFrequencyCode;
  }

  /**
   * Set the Type Special Assignment for the frequency assignment.
   * <p>
   * @param value the NATOPooledFrequencyCode value in a {@link TString} data
   *              type
   */
  public void setNATOPooledFrequencyCode(TString value) {
    this.natoPooledFrequencyCode = value;
  }

  /**
   * Determine if the NATOPooledFrequencyCode is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNATOPooledFrequencyCode() {
    return (this.natoPooledFrequencyCode != null ? this.natoPooledFrequencyCode.isSetValue() : false);
  }

  /**
   * Get the a Frequency Management Sub-committee (FMSC) assigned code number
   * identifying the type and nationality of a frequency pool.
   * <p>
   * @return the NATOPooledFrequencyNum value in a {@link TInteger} data type
   */
  public TInteger getNATOPooledFrequencyNum() {
    return natoPooledFrequencyNum;
  }

  /**
   * Set the a Frequency Management Sub-committee (FMSC) assigned code number
   * identifying the type and nationality of a frequency pool.
   * <p>
   * @param value the NATOPooledFrequencyNum value in a {@link TInteger} data
   *              type
   */
  public void setNATOPooledFrequencyNum(TInteger value) {
    this.natoPooledFrequencyNum = value;
  }

  /**
   * Determine if the NATOPooledFrequencyNum is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNATOPooledFrequencyNum() {
    return (this.natoPooledFrequencyNum != null ? this.natoPooledFrequencyNum.isSetValue() : false);
  }

  /**
   * Get the date the frequency assignment was originally authorized.
   * <p>
   * @return the OriginalAssignmentDate value in a {@link TCalendar} data type
   */
  public TCalendar getOriginalAssignmentDate() {
    return originalAssignmentDate;
  }

  /**
   * Set the date the frequency assignment was originally authorized.
   * <p>
   * @param value the OriginalAssignmentDate value in a {@link TCalendar} data
   *              type
   */
  public void setOriginalAssignmentDate(TCalendar value) {
    this.originalAssignmentDate = value;
  }

  /**
   * Determine if the OriginalAssignmentDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOriginalAssignmentDate() {
    return (this.originalAssignmentDate != null ? this.originalAssignmentDate.isSetValue() : false);
  }

  /**
   * Get the type of National Telecommunications and Information Administration
   * (NTIA) Frequency Assignment Subcommittee (FAS) agenda on which the
   * application will be processed. This value is computer-generated by NTIA for
   * its internal processing of frequency assignment applications. It is an
   * output data item only.
   * <p>
   * @return the RoutineAgendaItem value in a {@link TString} data type
   */
  public TString getRoutineAgendaItem() {
    return routineAgendaItem;
  }

  /**
   * Set the type of National Telecommunications and Information Administration
   * (NTIA) Frequency Assignment Subcommittee (FAS) agenda on which the
   * application will be processed. This value is computer-generated by NTIA for
   * its internal processing of frequency assignment applications. It is an
   * output data item only.
   * <p>
   * @param value the RoutineAgendaItem value in a {@link TString} data type
   */
  public void setRoutineAgendaItem(TString value) {
    this.routineAgendaItem = value;
  }

  /**
   * Determine if the RoutineAgendaItem is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRoutineAgendaItem() {
    return (this.routineAgendaItem != null ? this.routineAgendaItem.isSetValue() : false);
  }

  /**
   * Get amplifying information that would facilitate processing. This includes,
   * but is not limited to, the following items: (1) Doppler shift, if a
   * significant factor in the particular system, (2) a general description of
   * the assignment requirement (applies to experimental stations), (3) sounder
   * justification, (4) coordination data, and (5) refer to National
   * Telecommunications and Information Administration (NTIA) manual, Chapter 9,
   * for further details.
   * <p>
   * @return the SupplementaryDetails value in a {@link TString} data type
   */
  public TString getSupplementaryDetails() {
    return supplementaryDetails;
  }

  /**
   * Set amplifying information that would facilitate processing. This includes,
   * but is not limited to, the following items: (1) Doppler shift, if a
   * significant factor in the particular system, (2) a general description of
   * the assignment requirement (applies to experimental stations), (3) sounder
   * justification, (4) coordination data, and (5) refer to National
   * Telecommunications and Information Administration (NTIA) manual, Chapter 9,
   * for further details.
   * <p>
   * @param value the SupplementaryDetails value in a {@link TString} data type
   */
  public void setSupplementaryDetails(TString value) {
    this.supplementaryDetails = value;
  }

  /**
   * Determine if the SupplementaryDetails is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSupplementaryDetails() {
    return (this.supplementaryDetails != null ? this.supplementaryDetails.isSetValue() : false);
  }

  /**
   * Get the type of service or circuit involved.
   * <p>
   * @return the TypeOfService value in a {@link TString} data type
   */
  public TString getTypeOfService() {
    return typeOfService;
  }

  /**
   * Set the type of service or circuit involved.
   * <p>
   * @param value the TypeOfService value in a {@link TString} data type
   */
  public void setTypeOfService(TString value) {
    this.typeOfService = value;
  }

  /**
   * Determine if the TypeOfService is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTypeOfService() {
    return (this.typeOfService != null ? this.typeOfService.isSetValue() : false);
  }

  /**
   * Get the usage and category of circuits.
   * <p>
   * @return the UsageCode value in a {@link TString} data type
   */
  public TString getUsageCode() {
    return usageCode;
  }

  /**
   * Set the usage and category of circuits.
   * <p>
   * @param value the UsageCode value in a {@link TString} data type
   */
  public void setUsageCode(TString value) {
    this.usageCode = value;
  }

  /**
   * Determine if the UsageCode is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUsageCode() {
    return (this.usageCode != null ? this.usageCode.isSetValue() : false);
  }

  /**
   * Get the general amount of time when the frequency assignment frequencies
   * will be either guarded (monitored) or used for transmission.
   * <p>
   * @return the UsageFrequency value in a {@link TString} data type
   */
  public TString getUsageFrequency() {
    return usageFrequency;
  }

  /**
   * Set the general amount of time when the frequency assignment frequencies
   * will be either guarded (monitored) or used for transmission.
   * <p>
   * @param value the UsageFrequency value in a {@link TString} data type
   */
  public void setUsageFrequency(TString value) {
    this.usageFrequency = value;
  }

  /**
   * Determine if the UsageFrequency is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUsageFrequency() {
    return (this.usageFrequency != null ? this.usageFrequency.isSetValue() : false);
  }

  /**
   * Get the percentage of time the transmitter equipment is in use during the
   * scheduled hours of operation.
   * <p>
   * @return the UsagePercentage value in a {@link TInteger} data type
   */
  public TInteger getUsagePercentage() {
    return usagePercentage;
  }

  /**
   * Set the percentage of time the transmitter equipment is in use during the
   * scheduled hours of operation.
   * <p>
   * @param value the UsagePercentage value in a {@link TInteger} data type
   */
  public void setUsagePercentage(TInteger value) {
    this.usagePercentage = value;
  }

  /**
   * Determine if the UsagePercentage is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUsagePercentage() {
    return (this.usagePercentage != null ? this.usagePercentage.isSetValue() : false);
  }

  /**
   * Get a unique code that identifies the specific user of the frequency, i.e.,
   * the command, activity, unit, project, etc.
   * <p>
   * @return the UserNetCode value in a {@link TString} data type
   */
  public TString getUserNetCode() {
    return userNetCode;
  }

  /**
   * Set a unique code that identifies the specific user of the frequency, i.e.,
   * the command, activity, unit, project, etc.
   * <p>
   * @param value the UserNetCode value in a {@link TString} data type
   */
  public void setUserNetCode(TString value) {
    this.userNetCode = value;
  }

  /**
   * Determine if the UserNetCode is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUserNetCode() {
    return (this.userNetCode != null ? this.userNetCode.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return the PrimaryStation value in a {@link TString} data type
   */
  public TString getPrimaryStation() {
    return primaryStation;
  }

  /**
   * Set
   * <p>
   * @param value the PrimaryStation value in a {@link TString} data type
   */
  public void setPrimaryStation(TString value) {
    this.primaryStation = value;
  }

  /**
   * Determine if the PrimaryStation is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPrimaryStation() {
    return (this.primaryStation != null ? this.primaryStation.isSetValue() : false);
  }

  /**
   * Get the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset.
   * <p>
   * @return a non-null but possibly empty list of {@link Project} instances
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
   * Get the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @return a non-null but possibly empty list of {@link POCInformation}
   *         instances
   */
  public Set<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new HashSet<>();
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
   * Get the SysofStation
   * <p>
   * Complex element SysOfStation defines the name of the system that this
   * assignment belongs and whether or not the assignment provides assets to or
   * uses another assignment resources. It also describes linkages to or from
   * other datasets.
   * <p>
   * @return a non-null but possibly empty list of {@link SysOfStation}
   *         instances
   */
  public Set<SysOfStation> getSysOfStation() {
    if (sysOfStation == null) {
      sysOfStation = new HashSet<>();
    }
    return this.sysOfStation;
  }

  /**
   * Determine if the SysOfStation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSysOfStation() {
    return ((this.sysOfStation != null) && (!this.sysOfStation.isEmpty()));
  }

  /**
   * Clear the SysOfStation field. This sets the field to null.
   */
  public void unsetSysOfStation() {
    this.sysOfStation = null;
  }

  /**
   * Get the RelatedRef
   * <p>
   * Complex element RelatedRef contains the serial of a referenced Assignment,
   * Allotment, SSReply, ForceElement or FEDeployment.
   * <p>
   * @return a non-null but possibly empty list of {@link TString} instances
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getRelated()} instead.
   */
  @Deprecated
  public Set<TSerial> getRelatedRef() {
    if (relatedRef == null) {
      relatedRef = new HashSet<>();
    }
    return this.relatedRef;
  }

  /**
   * Determine if the RelatedRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRelatedRef() {
    return ((this.relatedRef != null) && (!this.relatedRef.isEmpty()));
  }

  /**
   * Clear the RelatedRef field. This sets the field to null.
   */
  public void unsetRelatedRef() {
    this.relatedRef = null;
  }

  /**
   * Get the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset.
   * <p>
   * @return a non-null but possibly empty list of {@link Configuration}
   *         instances
   */
  public Set<Configuration> getConfiguration() {
    if (configuration == null) {
      configuration = new HashSet<>();
    }
    return this.configuration;
  }

  /**
   * Determine if the Configuration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfiguration() {
    return ((this.configuration != null) && (!this.configuration.isEmpty()));
  }

  /**
   * Clear the Configuration field. This sets the field to null.
   */
  public void unsetConfiguration() {
    this.configuration = null;
  }

  /**
   * Get the Station
   * <p>
   * Complex element Station defines the station, or one of the stations, within
   * the current Assignment dataset.
   * <p>
   * @return a non-null but possibly empty list of {@link Station} instances
   */
  public Set<Station> getStation() {
    if (station == null) {
      station = new HashSet<>();
    }
    return this.station;
  }

  /**
   * Determine if the Station is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStation() {
    return ((this.station != null) && (!this.station.isEmpty()));
  }

  /**
   * Clear the Station field. This sets the field to null.
   */
  public void unsetStation() {
    this.station = null;
  }

  /**
   * Get the Link
   * <p>
   * Complex element Link identifies each link in a system of assignments. This
   * is the top element of each Link. The exact definition of a link is very
   * flexible and depends on the degree of accuracy needed for the assignment. A
   * link can be very generic (one or several base stations serving an area or a
   * volume with non-defined mobiles) to very accurate (such as one link for
   * each radio-relay hop).
   * <p>
   * @return a non-null but possibly empty list of {@link Link} instances
   */
  public Set<Link> getLink() {
    if (link == null) {
      link = new HashSet<>();
    }
    return this.link;
  }

  /**
   * Determine if the Link is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLink() {
    return ((this.link != null) && (!this.link.isEmpty()));
  }

  /**
   * Clear the Link field. This sets the field to null.
   */
  public void unsetLink() {
    this.link = null;
  }

  /**
   * Get the US:StatusLog
   * <p>
   * Complex element StatusLog (US) contains the transactional processing
   * information related to frequency assignments.
   * <p>
   * @return a non-null but possibly empty list of {@link StatusLog} instances
   */
  public Set<StatusLog> getStatusLog() {
    if (statusLog == null) {
      statusLog = new HashSet<>();
    }
    return this.statusLog;
  }

  /**
   * Determine if the StatusLog is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStatusLog() {
    return ((this.statusLog != null) && (!this.statusLog.isEmpty()));
  }

  /**
   * Clear the StatusLog field. This sets the field to null.
   */
  public void unsetStatusLog() {
    this.statusLog = null;
  }

  /**
   * Get the US:AsgnAllotOwner
   * <p>
   * Complex element AsgnAllotOwner (US) contains the serial of the owning, or
   * originating, organisation.
   * <p>
   * @return a non-null but possibly empty list of {@link AsgnAllotOwner}
   *         instances
   */
  public Set<AsgnAllotOwner> getAsgnAllotOwner() {
    if (asgnAllotOwner == null) {
      asgnAllotOwner = new HashSet<>();
    }
    return this.asgnAllotOwner;
  }

  /**
   * Determine if the AsgnAllotOwner is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAsgnAllotOwner() {
    return ((this.asgnAllotOwner != null) && (!this.asgnAllotOwner.isEmpty()));
  }

  /**
   * Clear the AsgnAllotOwner field. This sets the field to null.
   */
  public void unsetAsgnAllotOwner() {
    this.asgnAllotOwner = null;
  }

  /**
   * Get the US:CircuitRemarks
   * <p>
   * Complex element CircuitRemarks (US) contains general information about the
   * network and equipment used to support a specific frequency assignment or
   * assignments.
   * <p>
   * @return a non-null but possibly empty list of {@link CircuitRemarks}
   *         instances
   */
  public Set<CircuitRemarks> getCircuitRemarks() {
    if (circuitRemarks == null) {
      circuitRemarks = new HashSet<>();
    }
    return this.circuitRemarks;
  }

  /**
   * Determine if the CircuitRemarks is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCircuitRemarks() {
    return ((this.circuitRemarks != null) && (!this.circuitRemarks.isEmpty()));
  }

  /**
   * Clear the CircuitRemarks field. This sets the field to null.
   */
  public void unsetCircuitRemarks() {
    this.circuitRemarks = null;
  }

  /**
   * Get the US:CoordinationData
   * <p>
   * Complex element CoordinationData (US) contains Host Nation coordination
   * information.
   * <p>
   * @return a non-null but possibly empty list of {@link CoordinationData}
   *         instances
   */
  public Set<CoordinationData> getCoordinationData() {
    if (coordinationData == null) {
      coordinationData = new HashSet<>();
    }
    return this.coordinationData;
  }

  /**
   * Determine if the CoordinationData is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCoordinationData() {
    return ((this.coordinationData != null) && (!this.coordinationData.isEmpty()));
  }

  /**
   * Clear the CoordinationData field. This sets the field to null.
   */
  public void unsetCoordinationData() {
    this.coordinationData = null;
  }

  /**
   * Get the US:DocketNum
   * <p>
   * Complex element DocketNum (US) contains the docket number from a prior data
   * repository.
   * <p>
   * @return a non-null but possibly empty list of {@link DocketNum} instances
   */
  public Set<DocketNum> getDocketNum() {
    if (docketNum == null) {
      docketNum = new HashSet<>();
    }
    return this.docketNum;
  }

  /**
   * Determine if the DocketNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDocketNum() {
    return ((this.docketNum != null) && (!this.docketNum.isEmpty()));
  }

  /**
   * Clear the DocketNum field. This sets the field to null.
   */
  public void unsetDocketNum() {
    this.docketNum = null;
  }

  /**
   * Get the US:HostDocketNum
   * <p>
   * Complex element HostDocketNum (US) contains the Host Nation docket number
   * from a prior data repository.
   * <p>
   * @return a non-null but possibly empty list of {@link HostDocketNum}
   *         instances
   */
  public Set<HostDocketNum> getHostDocketNum() {
    if (hostDocketNum == null) {
      hostDocketNum = new HashSet<>();
    }
    return this.hostDocketNum;
  }

  /**
   * Determine if the HostDocketNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHostDocketNum() {
    return ((this.hostDocketNum != null) && (!this.hostDocketNum.isEmpty()));
  }

  /**
   * Clear the HostDocketNum field. This sets the field to null.
   */
  public void unsetHostDocketNum() {
    this.hostDocketNum = null;
  }

  /**
   * Get the US:OffTheShelfEquipment
   * <p>
   * Complex element OffTheShelfEquipment (US) defines the function of readily
   * available equipment. It is often commercial equipment that provides a
   * compatible function to DoD or government equipment.
   * <p>
   * @return a non-null but possibly empty list of {@link OffTheShelfEquipment}
   *         instances
   */
  public Set<OffTheShelfEquipment> getOffTheShelfEquipment() {
    if (offTheShelfEquipment == null) {
      offTheShelfEquipment = new HashSet<>();
    }
    return this.offTheShelfEquipment;
  }

  /**
   * Determine if the OffTheShelfEquipment is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOffTheShelfEquipment() {
    return ((this.offTheShelfEquipment != null) && (!this.offTheShelfEquipment.isEmpty()));
  }

  /**
   * Clear the OffTheShelfEquipment field. This sets the field to null.
   */
  public void unsetOffTheShelfEquipment() {
    this.offTheShelfEquipment = null;
  }

  /**
   * Get the US:PreviousAuthorization
   * <p>
   * Complex element Previous Authorization (US) refers to the frequency
   * assignment's previous Government Master File (GMF) authorization agency
   * serial number.
   * <p>
   * @return a non-null but possibly empty list of {@link PreviousAuthorization}
   *         instances
   */
  public Set<PreviousAuthorization> getPreviousAuthorization() {
    if (previousAuthorization == null) {
      previousAuthorization = new HashSet<>();
    }
    return this.previousAuthorization;
  }

  /**
   * Determine if the PreviousAuthorization is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPreviousAuthorization() {
    return ((this.previousAuthorization != null) && (!this.previousAuthorization.isEmpty()));
  }

  /**
   * Clear the PreviousAuthorization field. This sets the field to null.
   */
  public void unsetPreviousAuthorization() {
    this.previousAuthorization = null;
  }

  /**
   * Get the US:RecordNote
   * <p>
   * Complex element RecordNote (US) contains a reference to a formal host
   * nation "note" and specific comments.
   * <p>
   * @return a non-null but possibly empty list of {@link RecordNote} instances
   */
  public Set<RecordNote> getRecordNote() {
    if (recordNote == null) {
      recordNote = new HashSet<>();
    }
    return this.recordNote;
  }

  /**
   * Determine if the RecordNote is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRecordNote() {
    return ((this.recordNote != null) && (!this.recordNote.isEmpty()));
  }

  /**
   * Clear the RecordNote field. This sets the field to null.
   */
  public void unsetRecordNote() {
    this.recordNote = null;
  }

  /**
   * Set an identifying name for this Allotment or Assignment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withTitle(String value) {
    setTitle(new TString(value));
    return this;
  }

  /**
   * Set the type of assignment request or approved assignment or allotment. In
   * Data Item case of a rejected or cancelled assignment or allotment, indicate
   * the reason in a Remark.
   * <p>
   * @param value An instances of type {@link ListCUT}
   * @return The current Assignment object instance
   */
  public Assignment withUsageType(ListCUT value) {
    setUsageType(new TString(value.value()));
    return this;
  }

  /**
   * Set the date by which the Assignment or SSReply is required by the
   * requestor.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Assignment object instance
   */
  public Assignment withDateResponseRequired(Calendar value) {
    setDateResponseRequired(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the Assignment or SSReply is required by the
   * requestor.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Assignment object instance
   */
  public Assignment withDateResponseRequired(Date value) {
    setDateResponseRequired(new TCalendar(value));
    return this;
  }

  /**
   * Set the date and UTC time when the Assignment will be operational.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Assignment object instance
   */
  public Assignment withEffectiveDateTime(Calendar value) {
    setEffectiveDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the date and UTC time when the Assignment will be operational.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Assignment object instance
   */
  public Assignment withEffectiveDateTime(Date value) {
    setEffectiveDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the date and UTC time that this Assignment will expire. The Expiration
   * date should be less than five years from the effective date.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Assignment object instance
   */
  public Assignment withExpirationDateTime(Calendar value) {
    setExpirationDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the date and UTC time that this Assignment will expire. The Expiration
   * date should be less than five years from the effective date.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Assignment object instance
   */
  public Assignment withExpirationDateTime(Date value) {
    setExpirationDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the request should be
   * resubmitted to the host nation for continued equipment use.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Assignment object instance
   */
  public Assignment withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the request should be
   * resubmitted to the host nation for continued equipment use.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Assignment object instance
   */
  public Assignment withReviewDate(Date value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the general period on a daily basis when the frequency assignment
   * frequencies will be either guarded (monitored) or used for transmission.
   * <p>
   * @param value An instances of type {@link ListCTI}
   * @return The current Assignment object instance
   */
  public Assignment withPeriod(ListCTI value) {
    setPeriod(new TString(value.value()));
    return this;
  }

  /**
   * Set the seconds of hour [0-59] when the Assignment will be guarded
   * (monitored) or used for transmission.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withSeconds(String value) {
    setSeconds(new TString(value));
    return this;
  }

  /**
   * Set the minutes of an hour (0-59) when the Assignment will be guarded
   * (monitored) or used for transmission.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withMinutes(String value) {
    setMinutes(new TString(value));
    return this;
  }

  /**
   * Set the hours of day [0-23] (UTC time) when the Assignment will be guarded
   * (monitored) or used for transmission.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withHours(String value) {
    setHours(new TString(value));
    return this;
  }

  /**
   * Set the day of month [1-31] when the Assignment will be guarded (monitored)
   * or used for transmission.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withDaysOfMonth(String value) {
    setDaysOfMonth(new TString(value));
    return this;
  }

  /**
   * Set the month of year [1-12] when the Assignment will be guarded
   * (monitored) or used for transmission.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withMonths(String value) {
    setMonths(new TString(value));
    return this;
  }

  /**
   * Set the weekday [0-7 where 0 and 7 are for Sunday, 1 for Monday, etc] when
   * the Assignment will be guarded (monitored) or used for transmission.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withDaysOfWeek(String value) {
    setDaysOfWeek(new TString(value));
    return this;
  }

  /**
   * Set the 4-digit year [1900..2100] when the Assignment will be guarded
   * (monitored) or used for transmission.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withYears(String value) {
    setYears(new TString(value));
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
   * @param value An instances of type {@link Integer}
   * @return The current Assignment object instance
   */
  public Assignment withDuration(Integer value) {
    setDuration(new TInteger(value));
    return this;
  }

  /**
   * Set if the frequency assignment is to be approved at the national or
   * international level.
   * <p>
   * @param value An instances of type {@link ListCPI}
   * @return The current Assignment object instance
   */
  public Assignment withProcessing(ListCPI value) {
    setProcessing(new TString(value.value()));
    return this;
  }

  /**
   * Set "Yes" if the system may be used in a case of emergency.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Assignment object instance
   */
  public Assignment withEmergency(ListCBO value) {
    setEmergency(new TString(value.value()));
    return this;
  }

  /**
   * Set the user acceptance of host-nation or NATO HQ frequency nominations.
   * <p>
   * @param value An instances of type {@link ListCHN}
   * @return The current Assignment object instance
   */
  public Assignment withAssignmentAuthority(ListCHN value) {
    setAssignmentAuthority(new TString(value.value()));
    return this;
  }

  /**
   * Set any amplifying information about the requirement.
   * <p>
   * USA: Enter Agency remarks which, while pertinent to the frequency
   * assignment, are not intended to be part of the application processed
   * through the Interdepartment Radio Advisory Committee (IRAC). These remarks,
   * therefore, will be excluded from the Government Master File (GMF).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withRequirement(String value) {
    setRequirement(new TString(value));
    return this;
  }

  /**
   * Set the total number of systems that are expected to use this Assignment.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Assignment object instance
   */
  public Assignment withNumSystems(Integer value) {
    setNumSystems(new TInteger(value));
    return this;
  }

  /**
   * Set the "An" identifier used to track transactions.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withAgencyActionNum(String value) {
    setAgencyActionNum(new TString(value));
    return this;
  }

  /**
   * Set the Agency remarks in the applications processed through the
   * Interdepartment Radio Advisory Committee (IRAC). These remarks will be
   * included in the Government Master File (GMF).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withAgencyComments(String value) {
    setAgencyComments(new TString(value));
    return this;
  }

  /**
   * Set the externally-assigned unique identifier of a frequency assignment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withAgencySerialNum(String value) {
    setAgencySerialNum(new TString(value));
    return this;
  }

  /**
   * Set the date the assignment was most recently authorized.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Assignment object instance
   */
  public Assignment withAssignmentDate(Calendar value) {
    setAssignmentDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date the assignment was most recently authorized.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Assignment object instance
   */
  public Assignment withAssignmentDate(Date value) {
    setAssignmentDate(new TCalendar(value));
    return this;
  }

  /**
   * Set PACOM to identify a grouping of frequencies having a like or similar
   * use. Enter EUCOM to identify the function number(s) used by the Frequency
   * Management Sub-Committee (FMSC) to specify the operational use of
   * frequencies.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withCOCOMGroup(String value) {
    setCOCOMGroup(new TString(value));
    return this;
  }

  /**
   * Set the control or request identifier that allows subordinate organizations
   * to track specific frequency applications.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withControlRequestNum(String value) {
    setControlRequestNum(new TString(value));
    return this;
  }

  /**
   * Set the Comments related to the external coordination of a frequency
   * assignment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withCoordinationComments(String value) {
    setCoordinationComments(new TString(value));
    return this;
  }

  /**
   * Set the source or organization from which the data record was received.
   * <p>
   * @param value An instances of type {@link ListUDA}
   * @return The current Assignment object instance
   */
  public Assignment withDataSource(ListUDA value) {
    setDataSource(new TString(value.value()));
    return this;
  }

  /**
   * Set the file number assigned by the Federal Communications Commission
   * (FCC), issued to non-government stations operating on government
   * frequencies or government stations operating on nongovernment frequencies,
   * which is unique to each FCC license.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withFCCFileNum(String value) {
    setFCCFileNum(new TString(value));
    return this;
  }

  /**
   * Set the assignment serial number as registered in the Frequency Management
   * Subcommittee (FMSC) Master Radio Frequency List (MRFL).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withFMSCNum(String value) {
    setFMSCNum(new TString(value));
    return this;
  }

  /**
   * Set a MILDEP code identifying the person or group responsible for the
   * frequency assignment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withFrequencyActionOfficer(String value) {
    setFrequencyActionOfficer(new TString(value));
    return this;
  }

  /**
   * Set the agency list serial number of a Government Master File (GMF) record
   * representing a group or area assignment. It brings into use, by a
   * particular station or stations, a frequency authorised under a group
   * assignment or authorised for communications with nongovernment stations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withListSerialNum(String value) {
    setListSerialNum(new TString(value));
    return this;
  }

  /**
   * Set the Type Special Assignment for the frequency assignment.
   * <p>
   * @param value An instances of type {@link ListUPF}
   * @return The current Assignment object instance
   */
  public Assignment withNATOPooledFrequencyCode(ListUPF value) {
    setNATOPooledFrequencyCode(new TString(value.value()));
    return this;
  }

  /**
   * Set the a Frequency Management Sub-committee (FMSC) assigned code number
   * identifying the type and nationality of a frequency pool.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Assignment object instance
   */
  public Assignment withNATOPooledFrequencyNum(Integer value) {
    setNATOPooledFrequencyNum(new TInteger(value));
    return this;
  }

  /**
   * Set the date the frequency assignment was originally authorized.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Assignment object instance
   */
  public Assignment withOriginalAssignmentDate(Calendar value) {
    setOriginalAssignmentDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date the frequency assignment was originally authorized.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Assignment object instance
   */
  public Assignment withOriginalAssignmentDate(Date value) {
    setOriginalAssignmentDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the type of National Telecommunications and Information Administration
   * (NTIA) Frequency Assignment Subcommittee (FAS) agenda on which the
   * application will be processed. This value is computer-generated by NTIA for
   * its internal processing of frequency assignment applications. It is an
   * output data item only.
   * <p>
   * @param value An instances of type {@link ListURI}
   * @return The current Assignment object instance
   */
  public Assignment withRoutineAgendaItem(ListURI value) {
    setRoutineAgendaItem(new TString(value.value()));
    return this;
  }

  /**
   * Set amplifying information that would facilitate processing. This includes,
   * but is not limited to, the following items: (1) Doppler shift, if a
   * significant factor in the particular system, (2) a general description of
   * the assignment requirement (applies to experimental stations), (3) sounder
   * justification, (4) coordination data, and (5) refer to National
   * Telecommunications and Information Administration (NTIA) manual, Chapter 9,
   * for further details.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withSupplementaryDetails(String value) {
    setSupplementaryDetails(new TString(value));
    return this;
  }

  /**
   * Set the type of service or circuit involved.
   * <p>
   * @param value An instances of type {@link ListUTY}
   * @return The current Assignment object instance
   */
  public Assignment withTypeOfService(ListUTY value) {
    setTypeOfService(new TString(value.value()));
    return this;
  }

  /**
   * Set the usage and category of circuits.
   * <p>
   * @param value An instances of type {@link ListUUC}
   * @return The current Assignment object instance
   */
  public Assignment withUsageCode(ListUUC value) {
    setUsageCode(new TString(value.value()));
    return this;
  }

  /**
   * Set the general amount of time when the frequency assignment frequencies
   * will be either guarded (monitored) or used for transmission.
   * <p>
   * @param value An instances of type {@link ListUUF}
   * @return The current Assignment object instance
   */
  public Assignment withUsageFrequency(ListUUF value) {
    setUsageFrequency(new TString(value.value()));
    return this;
  }

  /**
   * Set the percentage of time the transmitter equipment is in use during the
   * scheduled hours of operation.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Assignment object instance
   */
  public Assignment withUsagePercentage(Integer value) {
    setUsagePercentage(new TInteger(value));
    return this;
  }

  /**
   * Set a unique code that identifies the specific user of the frequency, i.e.,
   * the command, activity, unit, project, etc.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assignment object instance
   */
  public Assignment withUserNetCode(String value) {
    setUserNetCode(new TString(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Assignment object instance
   */
  public Assignment withPrimaryStation(ListCBO value) {
    setPrimaryStation(new TString(value.value()));
    return this;
  }

  /**
   * Set the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset.
   * <p>
   * @param values One or more instances of type {@link Project}
   * @return The current Assignment object instance
   */
  public Assignment withProject(Project... values) {
    if (values != null) {
      getProject().addAll(new HashSet<>(Arrays.asList(values)));
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
   * @return The current Assignment object instance
   */
  public Assignment withProject(Set<Project> values) {
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
   * @return The current Assignment object instance
   */
  public Assignment withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(new HashSet<>(Arrays.asList(values)));
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
   * @return The current Assignment object instance
   */
  public Assignment withPOCInformation(Set<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  /**
   * Set the SysofStation
   * <p>
   * Complex element SysOfStation defines the name of the system that this
   * assignment belongs and whether or not the assignment provides assets to or
   * uses another assignment resources. It also describes linkages to or from
   * other datasets.
   * <p>
   * @param values One or more instances of type {@link SysOfStation}
   * @return The current Assignment object instance
   */
  public Assignment withSysOfStation(SysOfStation... values) {
    if (values != null) {
      getSysOfStation().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the SysofStation
   * <p>
   * Complex element SysOfStation defines the name of the system that this
   * assignment belongs and whether or not the assignment provides assets to or
   * uses another assignment resources. It also describes linkages to or from
   * other datasets.
   * <p>
   * @param values A collection of {@link SysOfStation} instances
   * @return The current Assignment object instance
   */
  public Assignment withSysOfStation(Set<SysOfStation> values) {
    if (values != null) {
      getSysOfStation().addAll(values);
    }
    return this;
  }

  /**
   * Set the RelatedRef
   * <p>
   * Complex element RelatedRef contains the serial of a referenced Assignment,
   * Allotment, SSReply, ForceElement or FEDeployment.
   * <p>
   * @param values One or more instances of type {@link TString}
   * @return The current Assignment object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withRelated(Common...)} instead.
   */
  @Deprecated
  public Assignment withRelatedRef(TSerial... values) {
    if (values != null) {
      getRelatedRef().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the RelatedRef
   * <p>
   * Complex element RelatedRef contains the serial of a referenced Assignment,
   * Allotment, SSReply, ForceElement or FEDeployment.
   * <p>
   * @param values A collection of {@link TString} instances
   * @return The current Assignment object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withRelated(Common...)} instead.
   */
  @Deprecated
  public Assignment withRelatedRef(Set<TSerial> values) {
    if (values != null) {
      getRelatedRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset.
   * <p>
   * @param values One or more instances of type {@link Configuration}
   * @return The current Assignment object instance
   */
  public Assignment withConfiguration(Configuration... values) {
    if (values != null) {
      getConfiguration().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset.
   * <p>
   * @param values A collection of {@link Configuration} instances
   * @return The current Assignment object instance
   */
  public Assignment withConfiguration(Set<Configuration> values) {
    if (values != null) {
      getConfiguration().addAll(values);
    }
    return this;
  }

  /**
   * Set the Station
   * <p>
   * Complex element Station defines the station, or one of the stations, within
   * the current Assignment dataset.
   * <p>
   * @param values One or more instances of type {@link Station}
   * @return The current Assignment object instance
   */
  public Assignment withStation(Station... values) {
    if (values != null) {
      getStation().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the Station
   * <p>
   * Complex element Station defines the station, or one of the stations, within
   * the current Assignment dataset.
   * <p>
   * @param values A collection of {@link Station} instances
   * @return The current Assignment object instance
   */
  public Assignment withStation(Set<Station> values) {
    if (values != null) {
      getStation().addAll(values);
    }
    return this;
  }

  /**
   * Set the Link
   * <p>
   * Complex element Link identifies each link in a system of assignments. This
   * is the top element of each Link. The exact definition of a link is very
   * flexible and depends on the degree of accuracy needed for the assignment. A
   * link can be very generic (one or several base stations serving an area or a
   * volume with non-defined mobiles) to very accurate (such as one link for
   * each radio-relay hop).
   * <p>
   * @param values One or more instances of type {@link Link}
   * @return The current Assignment object instance
   */
  public Assignment withLink(Link... values) {
    if (values != null) {
      getLink().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the Link
   * <p>
   * Complex element Link identifies each link in a system of assignments. This
   * is the top element of each Link. The exact definition of a link is very
   * flexible and depends on the degree of accuracy needed for the assignment. A
   * link can be very generic (one or several base stations serving an area or a
   * volume with non-defined mobiles) to very accurate (such as one link for
   * each radio-relay hop).
   * <p>
   * @param values A collection of {@link Link} instances
   * @return The current Assignment object instance
   */
  public Assignment withLink(Set<Link> values) {
    if (values != null) {
      getLink().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:StatusLog
   * <p>
   * Complex element StatusLog (US) contains the transactional processing
   * information related to frequency assignments.
   * <p>
   * @param values One or more instances of type {@link StatusLog}
   * @return The current Assignment object instance
   */
  public Assignment withStatusLog(StatusLog... values) {
    if (values != null) {
      getStatusLog().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:StatusLog
   * <p>
   * Complex element StatusLog (US) contains the transactional processing
   * information related to frequency assignments.
   * <p>
   * @param values A collection of {@link StatusLog} instances
   * @return The current Assignment object instance
   */
  public Assignment withStatusLog(Set<StatusLog> values) {
    if (values != null) {
      getStatusLog().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:AsgnAllotOwner
   * <p>
   * Complex element AsgnAllotOwner (US) contains the serial of the owning, or
   * originating, organisation.
   * <p>
   * @param values One or more instances of type {@link AsgnAllotOwner}
   * @return The current Assignment object instance
   */
  public Assignment withAsgnAllotOwner(AsgnAllotOwner... values) {
    if (values != null) {
      getAsgnAllotOwner().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:AsgnAllotOwner
   * <p>
   * Complex element AsgnAllotOwner (US) contains the serial of the owning, or
   * originating, organisation.
   * <p>
   * @param values A collection of {@link AsgnAllotOwner} instances
   * @return The current Assignment object instance
   */
  public Assignment withAsgnAllotOwner(Set<AsgnAllotOwner> values) {
    if (values != null) {
      getAsgnAllotOwner().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:CircuitRemarks
   * <p>
   * Complex element CircuitRemarks (US) contains general information about the
   * network and equipment used to support a specific frequency assignment or
   * assignments.
   * <p>
   * @param values One or more instances of type {@link CircuitRemarks}
   * @return The current Assignment object instance
   */
  public Assignment withCircuitRemarks(CircuitRemarks... values) {
    if (values != null) {
      getCircuitRemarks().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:CircuitRemarks
   * <p>
   * Complex element CircuitRemarks (US) contains general information about the
   * network and equipment used to support a specific frequency assignment or
   * assignments.
   * <p>
   * @param values A collection of {@link CircuitRemarks} instances
   * @return The current Assignment object instance
   */
  public Assignment withCircuitRemarks(Set<CircuitRemarks> values) {
    if (values != null) {
      getCircuitRemarks().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:CoordinationData
   * <p>
   * Complex element CoordinationData (US) contains Host Nation coordination
   * information.
   * <p>
   * @param values One or more instances of type {@link CoordinationData}
   * @return The current Assignment object instance
   */
  public Assignment withCoordinationData(CoordinationData... values) {
    if (values != null) {
      getCoordinationData().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:CoordinationData
   * <p>
   * Complex element CoordinationData (US) contains Host Nation coordination
   * information.
   * <p>
   * @param values A collection of {@link CoordinationData} instances
   * @return The current Assignment object instance
   */
  public Assignment withCoordinationData(Set<CoordinationData> values) {
    if (values != null) {
      getCoordinationData().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:DocketNum
   * <p>
   * Complex element DocketNum (US) contains the docket number from a prior data
   * repository.
   * <p>
   * @param values One or more instances of type {@link DocketNum}
   * @return The current Assignment object instance
   */
  public Assignment withDocketNum(DocketNum... values) {
    if (values != null) {
      getDocketNum().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:DocketNum
   * <p>
   * Complex element DocketNum (US) contains the docket number from a prior data
   * repository.
   * <p>
   * @param values A collection of {@link DocketNum} instances
   * @return The current Assignment object instance
   */
  public Assignment withDocketNum(Set<DocketNum> values) {
    if (values != null) {
      getDocketNum().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:HostDocketNum
   * <p>
   * Complex element HostDocketNum (US) contains the Host Nation docket number
   * from a prior data repository.
   * <p>
   * @param values One or more instances of type {@link HostDocketNum}
   * @return The current Assignment object instance
   */
  public Assignment withHostDocketNum(HostDocketNum... values) {
    if (values != null) {
      getHostDocketNum().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:HostDocketNum
   * <p>
   * Complex element HostDocketNum (US) contains the Host Nation docket number
   * from a prior data repository.
   * <p>
   * @param values A collection of {@link HostDocketNum} instances
   * @return The current Assignment object instance
   */
  public Assignment withHostDocketNum(Set<HostDocketNum> values) {
    if (values != null) {
      getHostDocketNum().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:OffTheShelfEquipment
   * <p>
   * Complex element OffTheShelfEquipment (US) defines the function of readily
   * available equipment. It is often commercial equipment that provides a
   * compatible function to DoD or government equipment.
   * <p>
   * @param values One or more instances of type {@link OffTheShelfEquipment}
   * @return The current Assignment object instance
   */
  public Assignment withOffTheShelfEquipment(OffTheShelfEquipment... values) {
    if (values != null) {
      getOffTheShelfEquipment().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:OffTheShelfEquipment
   * <p>
   * Complex element OffTheShelfEquipment (US) defines the function of readily
   * available equipment. It is often commercial equipment that provides a
   * compatible function to DoD or government equipment.
   * <p>
   * @param values A collection of {@link OffTheShelfEquipment} instances
   * @return The current Assignment object instance
   */
  public Assignment withOffTheShelfEquipment(Set<OffTheShelfEquipment> values) {
    if (values != null) {
      getOffTheShelfEquipment().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:PreviousAuthorization
   * <p>
   * Complex element Previous Authorization (US) refers to the frequency
   * assignment's previous Government Master File (GMF) authorization agency
   * serial number.
   * <p>
   * @param values One or more instances of type {@link PreviousAuthorization}
   * @return The current Assignment object instance
   */
  public Assignment withPreviousAuthorization(PreviousAuthorization... values) {
    if (values != null) {
      getPreviousAuthorization().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:PreviousAuthorization
   * <p>
   * Complex element Previous Authorization (US) refers to the frequency
   * assignment's previous Government Master File (GMF) authorization agency
   * serial number.
   * <p>
   * @param values A collection of {@link PreviousAuthorization} instances
   * @return The current Assignment object instance
   */
  public Assignment withPreviousAuthorization(Set<PreviousAuthorization> values) {
    if (values != null) {
      getPreviousAuthorization().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:RecordNote
   * <p>
   * Complex element RecordNote (US) contains a reference to a formal host
   * nation "note" and specific comments.
   * <p>
   * @param values One or more instances of type {@link RecordNote}
   * @return The current Assignment object instance
   */
  public Assignment withRecordNote(RecordNote... values) {
    if (values != null) {
      getRecordNote().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:RecordNote
   * <p>
   * Complex element RecordNote (US) contains a reference to a formal host
   * nation "note" and specific comments.
   * <p>
   * @param values A collection of {@link RecordNote} instances
   * @return The current Assignment object instance
   */
  public Assignment withRecordNote(Set<RecordNote> values) {
    if (values != null) {
      getRecordNote().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Assignment instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Assignment {"
      + (offTheShelfEquipment != null ? " offTheShelfEquipment [" + offTheShelfEquipment + "]" : "")
      + (emergency != null ? " emergency [" + emergency + "]" : "")
      + (usageType != null ? " usageType [" + usageType + "]" : "")
      + (listSerialNum != null ? " listSerialNum [" + listSerialNum + "]" : "")
      + (agencySerialNum != null ? " agencySerialNum [" + agencySerialNum + "]" : "")
      + (frequencyActionOfficer != null ? " frequencyActionOfficer [" + frequencyActionOfficer + "]" : "")
      + (sysOfStation != null ? " sysOfStation [" + sysOfStation + "]" : "")
      + (asgnAllotOwner != null ? " asgnAllotOwner [" + asgnAllotOwner + "]" : "")
      + (processing != null ? " processing [" + processing + "]" : "")
      + (assignmentDate != null ? " assignmentDate [" + assignmentDate + "]" : "")
      + (natoPooledFrequencyNum != null ? " natoPooledFrequencyNum [" + natoPooledFrequencyNum + "]" : "")
      + (docketNum != null ? " docketNum [" + docketNum + "]" : "")
      + (pocInformation != null ? " pocInformation [" + pocInformation + "]" : "")
      + (station != null ? " station [" + station + "]" : "")
      + (hours != null ? " hours [" + hours + "]" : "")
      + (cocomGroup != null ? " cocomGroup [" + cocomGroup + "]" : "")
      + (typeOfService != null ? " typeOfService [" + typeOfService + "]" : "")
      + (natoPooledFrequencyCode != null ? " natoPooledFrequencyCode [" + natoPooledFrequencyCode + "]" : "")
      + (period != null ? " period [" + period + "]" : "")
      + (statusLog != null ? " statusLog [" + statusLog + "]" : "")
      + (numSystems != null ? " numSystems [" + numSystems + "]" : "")
      + (agencyComments != null ? " agencyComments [" + agencyComments + "]" : "")
      + (relatedRef != null ? " relatedRef [" + relatedRef + "]" : "")
      + (project != null ? " project [" + project + "]" : "")
      + (routineAgendaItem != null ? " routineAgendaItem [" + routineAgendaItem + "]" : "")
      + (coordinationData != null ? " coordinationData [" + coordinationData + "]" : "")
      + (years != null ? " years [" + years + "]" : "")
      + (supplementaryDetails != null ? " supplementaryDetails [" + supplementaryDetails + "]" : "")
      + (usageFrequency != null ? " usageFrequency [" + usageFrequency + "]" : "")
      + (coordinationComments != null ? " coordinationComments [" + coordinationComments + "]" : "")
      + (dataSource != null ? " dataSource [" + dataSource + "]" : "")
      + (usagePercentage != null ? " usagePercentage [" + usagePercentage + "]" : "")
      + (link != null ? " link [" + link + "]" : "")
      + (controlRequestNum != null ? " controlRequestNum [" + controlRequestNum + "]" : "")
      + (usageCode != null ? " usageCode [" + usageCode + "]" : "")
      + (previousAuthorization != null ? " previousAuthorization [" + previousAuthorization + "]" : "")
      + (expirationDateTime != null ? " expirationDateTime [" + expirationDateTime + "]" : "")
      + (circuitRemarks != null ? " circuitRemarks [" + circuitRemarks + "]" : "")
      + (title != null ? " title [" + title + "]" : "")
      + (primaryStation != null ? " primaryStation [" + primaryStation + "]" : "")
      + (hostDocketNum != null ? " hostDocketNum [" + hostDocketNum + "]" : "")
      + (dateResponseRequired != null ? " dateResponseRequired [" + dateResponseRequired + "]" : "")
      + (effectiveDateTime != null ? " effectiveDateTime [" + effectiveDateTime + "]" : "")
      + (fccFileNum != null ? " fccFileNum [" + fccFileNum + "]" : "")
      + (requirement != null ? " requirement [" + requirement + "]" : "")
      + (minutes != null ? " minutes [" + minutes + "]" : "")
      + (reviewDate != null ? " reviewDate [" + reviewDate + "]" : "")
      + (recordNote != null ? " recordNote [" + recordNote + "]" : "")
      + (daysOfWeek != null ? " daysOfWeek [" + daysOfWeek + "]" : "")
      + (daysOfMonth != null ? " daysOfMonth [" + daysOfMonth + "]" : "")
      + (fmscNum != null ? " fmscNum [" + fmscNum + "]" : "")
      + (assignmentAuthority != null ? " assignmentAuthority [" + assignmentAuthority + "]" : "")
      + (duration != null ? " duration [" + duration + "]" : "")
      + (months != null ? " months [" + months + "]" : "")
      + (originalAssignmentDate != null ? " originalAssignmentDate [" + originalAssignmentDate + "]" : "")
      + (seconds != null ? " seconds [" + seconds + "]" : "")
      + (userNetCode != null ? " userNetCode [" + userNetCode + "]" : "")
      + (agencyActionNum != null ? " agencyActionNum [" + agencyActionNum + "]" : "")
      + (configuration != null ? " configuration [" + configuration + "]" : "")
      + "\n  Assignment." + super.toString() + "\n"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Assignment} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and
   * {@link Configuration Configuration}, {@link TCalendar EffectiveDateTime}, {@link Link Link}, {@link Station Station}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetConfiguration() && isSetEffectiveDateTime() && isSetLink() && isSetStation();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * RelatedRef (Optional)
   * <p>
   * RelatedRef contains the serial of a referenced Assignment, Allotment,
   * SSReply, ForceElement or FEDeployment.
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Set<Common<?>> related;

  /**
   * Get the RelatedRef
   * <p>
   * Complex element RelatedRef contains the serial of a referenced Assignment,
   * Allotment, SSReply, ForceElement or FEDeployment.
   * <p>
   * @return a {@link Common} instance
   * @since 3.1.0
   */
  public Set<Common<?>> getRelated() {
    if (related == null) {
      related = new HashSet<>();
    }
    return related;
  }

  /**
   * Determine if the related field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRelated() {
    return this.related != null && !this.related.isEmpty();
  }

  /**
   * Set the RelatedRef
   * <p>
   * Complex element RelatedRef contains the serial of a referenced Assignment,
   * Allotment, SSReply, ForceElement or FEDeployment.
   * <p>
   * @param values An instances of type {@link Common}
   * @return The current Assignment object instance
   * @since 3.1.0
   */
  public Assignment withRelated(Common<?>... values) {
    return withRelated(new HashSet<>(new HashSet<>(Arrays.asList(values))));
  }

  /**
   * Set the RelatedRef
   * <p>
   * Complex element RelatedRef contains the serial of a referenced Assignment,
   * Allotment, SSReply, ForceElement or FEDeployment.
   * <p>
   * @param values An instances of type {@link Common}
   * @return The current Assignment object instance
   * @since 3.1.0
   */
  public Assignment withRelated(Set<Common<?>> values) {
    getRelated().addAll(values);
    return this;
  }

  /**
   * Update the SSRF data type references in this Assignment record.
   * <p>
   * This method builds the exported {@link #relatedRef} field with values from
   * the transient {@link #related} field. This method should typically be
   * called after the Assignment is configured and (optionally) before exporting
   * an SSRF message.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void prepare() {
    super.prepare();
    this.relatedRef = new HashSet<>();
    for (Common<?> instance : getRelated()) {
      this.relatedRef.add(instance.getSerial());
    }
  }

  /**
   * Update the SSRF data type references in this Assignment record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #related} with values from the
   * imported {@link #relatedRef} field. This method should typically be called
   * after the Assignment is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    super.postLoad(root);
    if (relatedRef == null || relatedRef.isEmpty()) {
      return;
    }
    for (Assignment instance : root.getAssignment()) {
      if (relatedRef.contains(instance.getSerial())) {
        related.add(instance);
      }
    }
    for (Allotment instance : root.getAllotment()) {
      if (relatedRef.contains(instance.getSerial())) {
        related.add(instance);
      }
    }
    for (SSReply instance : root.getSSReply()) {
      if (relatedRef.contains(instance.getSerial())) {
        related.add(instance);
      }
    }
    for (ForceElement instance : root.getForceElement()) {
      if (relatedRef.contains(instance.getSerial())) {
        related.add(instance);
      }
    }
    for (FEDeployment instance : root.getFEDeployment()) {
      if (relatedRef.contains(instance.getSerial())) {
        related.add(instance);
      }
    }
  }//</editor-fold>

}
