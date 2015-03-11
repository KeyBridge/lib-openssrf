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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.allotment.POCInformation;
import us.gov.dod.standard.ssrf._3_1.allotment.Project;
import us.gov.dod.standard.ssrf._3_1.antenna.Nomenclature;
import us.gov.dod.standard.ssrf._3_1.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_1.assignment.StatusLog;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCSG;
import us.gov.dod.standard.ssrf._3_1.ssrequest.*;

/**
 * SSRequest contains all parameters describing the system and its usage, for
 * which Spectrum Supportability is being requested.
 * <p>
 * Sub-Elements are
 * {@link Configuration}, {@link DiagramEndpoint}, {@link DiagramLine}, {@link HostNation}, {@link Nomenclature}, {@link POCInformation}, {@link Project}, {@link RelatedSupportability}, {@link Stage}, {@link StatusLog}, {@link Time}, {@link Trunking}
 * <p>
 * Example:
 * <pre>
 * &lt;SSRequest cls="U"&gt;
 *   &lt;Serial cls="U"&gt;USA::SR:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Title cls="U"&gt;MIDS LVT&lt;/Title&gt;
 *   &lt;Configuration&gt;
 *     &lt;ConfigID cls="U"&gt;LOW VOLUME&lt;/ConfigID&gt;
 *     &lt;TxRef&gt;
 *       &lt;Serial cls="U"&gt;USA::TX:555&lt;/Serial&gt;
 *     &lt;/TxRef&gt;
 *   &lt;/Configuration&gt;
 * &lt;/SSRequest&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSRequest", propOrder = {
  "title",
  "currentStage",
  "requirement",
  "emergency",
  "numMobileUnits",
  "numAreaUnits",
  "numCositedUnits",
  "applicationDate",
  "dateResponseRequired",
  "replacementInfo",
  "applicationSPSNumber",
  "coordinationNum",
  "infoTransferRequirement",
  "initialCost",
  "initialCostDesc",
  "ituWaiver",
  "ntiaCoordinationRequired",
  "ntiaSpaceData",
  "operInvIntent",
  "originatingAgency",
  "requestType",
  "relatedAnalysisAndTestData",
  "sysRelationEssential",
  "tspr",
  "wartimeUse",
  "project",
  "stage",
  "nomenclature",
  "pocInformation",
  "relatedSupportability",
  "hostNation",
  "time",
  "diagramEndpoint",
  "diagramLine",
  "configuration",
  "statusLog",
  "trunking"
})
public class SSRequest extends Common<SSRequest> {

  /**
   * Title - Application Title (Required)
   * <p>
   * The title of the Spectrum Supportability application. Each application
   * title should be unique.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Title", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString title;
  /**
   * CurrentStage - Current Stage (Optional)
   * <p>
   * The current stage of the system.
   * <p>
   * Format is L:CSG
   */
  @XmlElement(name = "CurrentStage", required = false)
  private TString currentStage;
  /**
   * Requirement - Requirement Description (Optional)
   * <p>
   * A description of the types and forms of information to be transmitted or
   * received. The requirement should describe: - The general purpose of the
   * system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft
   * system to protect fixed facilities); - Each significant capability of the
   * system (e.g., in the PATRIOT system: search, acquisition and tracking
   * radar, TT&C, C2 links, etc); - Any related supportability documents should
   * be listed in the ExtReferenceRef element.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "Requirement", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString requirement;
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
   * NumMobileUnits - Number of Mobile Units (Optional)
   * <p>
   * The number of mobile units. These units do not necessarily operate
   * simultaneously in the same electromagnetic environment.
   * <p>
   * Format is UN(9)
   * <p>
   * Attribute group NumUnits (Optional)
   */
  @XmlElement(name = "NumMobileUnits", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numMobileUnits;
  /**
   * NumAreaUnits - Number of Units in Area (Optional)
   * <p>
   * The maximum number of units (equipment) that will be operating
   * simultaneously in the same area of operation. An area is generally defined
   * as a country. enter the number of land mobile stations, ship stations, and
   * transportable stations associated with the current Assignment or SSRequest
   * dataset. Within an Assignment (but not under SSRequest), the number entered
   * shall represent either the exact number of stations or a range of numbers
   * as follows: Number of Stations Enter 1-10 10 11-30 30 31-100 100 101-300
   * 300 301-1000 1000 1001-3000 3000 3001-10000 10000 Above 10000 Nearest 10000
   * If the exact number is to be recorded, and it is 10, 30, 100, 300, 1000,
   * 3000, or a multiple of 10000, add one to the number to distinguish it from
   * a figure that represents a range of numbers.
   * <p>
   * Format is UN(9)
   * <p>
   * Attribute group NumUnits (Optional)
   */
  @XmlElement(name = "NumAreaUnits", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numAreaUnits;
  /**
   * NumCositedUnits - Number of Cosited Units (Optional)
   * <p>
   * The maximum number of units (equipment) that will be operating
   * simultaneously in the same cosite environment. A cosite situation occurs
   * when several antennas are within the near field of each other.
   * <p>
   * Format is UN(9)
   * <p>
   * Attribute group NumUnits (Optional)
   */
  @XmlElement(name = "NumCositedUnits", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numCositedUnits;
  /**
   * ApplicationDate - Application Date (Optional)
   * <p>
   * The date on which the application will be submitted to the appropriate
   * spectrum management office.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "ApplicationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar applicationDate;
  /**
   * DateResponseRequired - Date Response Required (Optional)
   * <p>
   * The date by which the frequency assignment or Spectrum Supportability Reply
   * is required by the user in order to complete necessary advanced operation
   * coordination.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "DateResponseRequired", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar dateResponseRequired;
  /**
   * ReplacementInfo - Replacement Info (Optional)
   * <p>
   * The name of the systems that are likely to be replaced by this system.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "ReplacementInfo", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString replacementInfo;
  /**
   * US:ApplicationSPSNumber - Application SPS Number (Optional)
   * <p>
   * The application Spectrum Planning Subcommittee (SPS) document identifier
   * assigned by NTIA. This is not the same as the Certification of Spectrum
   * Support SPS number.
   * <p>
   * Format is S11
   */
  @XmlElement(name = "ApplicationSPSNumber", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS11.class)
  private TString applicationSPSNumber;
  /**
   * US:CoordinationNum - Coordination Number (Optional)
   * <p>
   * The US Military Communications-Electronics Board (MCEB) identifier assigned
   * to the equipment or system. (e.g., J/F 12/12345). An SSRequest coordination
   * number usually ends with an even digit (e.g., /2, /4), while an SSReply
   * coordination number usually ends with an odd digit (e.g., /3, /5). When
   * certifying equipment, both SSRequest and SSReply SHOULD have a coordination
   * number.
   * <p>
   * Format is S15
   */
  @XmlElement(name = "CoordinationNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS15.class)
  private TString coordinationNum;
  /**
   * US:InfoTransferRequirement - Info Transfer Requirement (Optional)
   * <p>
   * The required character rates, data rates, and circuit quality/reliability
   * of the system.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "InfoTransferRequirement", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString infoTransferRequirement;
  /**
   * US:InitialCost - Initial Cost (Optional)
   * <p>
   * The estimated initial cost, in US dollars, of the system/equipment.
   * <p>
   * Format is S70
   */
  @XmlElement(name = "InitialCost", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS70.class)
  private TString initialCost;
  /**
   * US:InitialCostDesc - Initial Cost Description (Optional)
   * <p>
   * The explanation of how the estimated initial cost for the system was
   * calculated.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "InitialCostDesc", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString initialCostDesc;
  /**
   * US:ITUWaiver - ITU Waiver (Optional)
   * <p>
   * If this is a satellite system that is exempt from submitting notification
   * to the Radiocommunication Bureau.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "ITUWaiver", required = false)
  private TString ituWaiver;
  /**
   * US:NTIACoordinationRequired - NTIA Coordination Required (Optional)
   * <p>
   * If this application requires coordination with the National Authority for
   * approval. For US records, the National Authority is NTIA and this should be
   * Yes, unless the record does not require coordination with NTIA for
   * approval.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "NTIACoordinationRequired", required = false)
  private TString ntiaCoordinationRequired;
  /**
   * US:NTIASpaceData - NTIA Space Data (Optional)
   * <p>
   * The Space and terrestrial information as defined by section 10.8 of the
   * NTIA Manual and not captured in other more specific data fields.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "NTIASpaceData", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString ntiaSpaceData;
  /**
   * US:OperInvIntent - Operational Inventory Intent (Optional)
   * <p>
   * If the system is intended for the DoD operational inventory.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "OperInvIntent", required = false)
  private TString operInvIntent;
  /**
   * US:OriginatingAgency - Originating Agency (Optional)
   * <p>
   * The agency that originated the application.
   * <p>
   * Format is S80
   */
  @XmlElement(name = "OriginatingAgency", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS80.class)
  private TString originatingAgency;
  /**
   * US:RequestType - Request Type (Optional)
   * <p>
   * The request type. Possible values may include, but are not limited to, DoD
   * Certification, NTIA Certification, and Foreign Coordination.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "RequestType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString requestType;
  /**
   * RelatedAnalysisAndTestData (US), describe electromagnetic compatibility
   * studies, testing or analyses relevant to this system, including documents
   * currently in progress. Use the ExtReference attribute of this element as
   * appropriate.
   */
  @XmlElement(name = "RelatedAnalysisAndTestData", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString relatedAnalysisAndTestData;

  @XmlElement(name = "SysRelationEssential", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString sysRelationEssential;
  /**
   * US:TSPR - TSPR (Optional)
   * <p>
   * The telecommunications service priority applicable to a spectrum-dependent
   * radiocommunications system intended to be used in direct support of a
   * national emergency declared under Section 706 of the Communications Act of
   * 1934, as amended.
   * <p>
   * Format is S10
   */
  @XmlElement(name = "TSPR", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString tspr;
  /**
   * US:WartimeUse - Wartime Use (Optional)
   * <p>
   * If the system is used in a wartime environment.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "WartimeUse", required = false)
  private TString wartimeUse;
  /**
   * Project (Optional)
   * <p>
   * Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other
   * project name associated to the dataset.
   */
  @XmlElement(name = "Project")
  private Set<Project> project;
  /**
   * CurrentStage - Current Stage (Optional)
   * <p>
   * The current stage of the system.
   * <p>
   * Format is L:CSG
   */
  @XmlElement(name = "Stage")
  private Set<Stage> stage;
  /**
   * Nomenclature (Optional)
   * <p>
   * Nomenclature identifies either the standard military, government,
   * nomenclature or the commercial model number of an equipment. Each device or
   * group of devices may have several types of nomenclatures, e.g. both a
   * military nomenclature and a commercial model number.
   */
  @XmlElement(name = "Nomenclature")
  private Set<Nomenclature> nomenclature;
  /**
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
   */
  @XmlElement(name = "POCInformation")
  private Set<POCInformation> pocInformation;
  /**
   * RelatedSupportability (Optional)
   * <p>
   * RelatedSupportability refers to a SSRequest with which the current dataset
   * has a dependency.
   */
  @XmlElement(name = "RelatedSupportability")
  private Set<RelatedSupportability> relatedSupportability;
  /**
   * HostNation (Optional)
   * <p>
   * HostNation indicates the host nations from which supportability is
   * requested. If a SSRequest received by NATO has no HostNation entry, it will
   * be assumed that this SSRequest is for all NATO Nations plus AUS and NZL (in
   * accordance with the FMSC agreement).
   */
  @XmlElement(name = "HostNation", nillable = true)
  private Set<HostNation> hostNation;
  /**
   * US:WartimeUse - Wartime Use (Optional)
   * <p>
   * If the system is used in a wartime environment.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Time")
  private Set<Time> time;
  /**
   * DiagramEndpoint (Optional)
   * <p>
   * DiagramEndpoint defines an instance of an icon on the diagram.
   */
  @XmlElement(name = "DiagramEndpoint")
  private Set<DiagramEndpoint> diagramEndpoint;
  /**
   * DiagramLine (Optional)
   * <p>
   * DiagramLine defines a line between two endpoints on the diagram.
   */
  @XmlElement(name = "DiagramLine")
  private Set<DiagramLine> diagramLine;
  /**
   * Configuration (Optional)
   * <p>
   * Configuration identifies each operational configuration that is required in
   * a SSRequest, granted by a Host Nation in a SSReply, or authorised in a
   * frequency Assignment or Allotment dataset. It also identifies the
   * functional use of the assigned frequency at a particular transmitting
   * station.
   * <p>
   * Divergence from SMADEF: Mandatory [1..n] when exchanging with NATO /
   */
  @XmlElement(name = "Configuration")
  private Set<Configuration> configuration;
  /**
   * US:StatusLog (Optional)
   * <p>
   * StatusLog (US) contains the transactional processing information related to
   * spectrum supportability requests.
   */
  @XmlElement(name = "StatusLog")
  private Set<StatusLog> statusLog;
  /**
   * US:Trunking (Optional)
   * <p>
   * Trunking (US) defines Radiotelephony using standard land mobile principles
   * where multiple baseband signals are bounded within one physical channel.
   */
  @XmlElement(name = "Trunking")
  private Trunking trunking;

  /**
   * Get the title of the Spectrum Supportability application. Each application
   * title should be unique.
   * <p>
   * @return the Title value in a {@link TString} data type
   */
  public TString getTitle() {
    return title;
  }

  /**
   * Set the title of the Spectrum Supportability application. Each application
   * title should be unique.
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
   * Get the current stage of the system.
   * <p>
   * @return the CurrentStage value in a {@link TString} data type
   */
  public TString getCurrentStage() {
    return currentStage;
  }

  /**
   * Set the current stage of the system.
   * <p>
   * @param value the CurrentStage value in a {@link TString} data type
   */
  public void setCurrentStage(TString value) {
    this.currentStage = value;
  }

  /**
   * Determine if the CurrentStage is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCurrentStage() {
    return (this.currentStage != null ? this.currentStage.isSetValue() : false);
  }

  /**
   * Get a description of the types and forms of information to be transmitted
   * or received. The requirement should describe: - The general purpose of the
   * system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft
   * system to protect fixed facilities); - Each significant capability of the
   * system (e.g., in the PATRIOT system: search, acquisition and tracking
   * radar, TT&C, C2 links, etc); - Any related supportability documents should
   * be listed in the ExtReferenceRef element.
   * <p>
   * @return the Requirement value in a {@link TString} data type
   */
  public TString getRequirement() {
    return requirement;
  }

  /**
   * Set a description of the types and forms of information to be transmitted
   * or received. The requirement should describe: - The general purpose of the
   * system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft
   * system to protect fixed facilities); - Each significant capability of the
   * system (e.g., in the PATRIOT system: search, acquisition and tracking
   * radar, TT&C, C2 links, etc); - Any related supportability documents should
   * be listed in the ExtReferenceRef element.
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
   * Get the number of mobile units. These units do not necessarily operate
   * simultaneously in the same electromagnetic environment.
   * <p>
   * @return the NumMobileUnits value in a {@link TInteger} data type
   */
  public TInteger getNumMobileUnits() {
    return numMobileUnits;
  }

  /**
   * Set the number of mobile units. These units do not necessarily operate
   * simultaneously in the same electromagnetic environment.
   * <p>
   * @param value the NumMobileUnits value in a {@link TInteger} data type
   */
  public void setNumMobileUnits(TInteger value) {
    this.numMobileUnits = value;
  }

  /**
   * Determine if the NumMobileUnits is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumMobileUnits() {
    return (this.numMobileUnits != null ? this.numMobileUnits.isSetValue() : false);
  }

  /**
   * Get the maximum number of units (equipment) that will be operating
   * simultaneously in the same area of operation. An area is generally defined
   * as a country. enter the number of land mobile stations, ship stations, and
   * transportable stations associated with the current Assignment or SSRequest
   * dataset. Within an Assignment (but not under SSRequest), the number entered
   * shall represent either the exact number of stations or a range of numbers
   * as follows: Number of Stations Enter 1-10 10 11-30 30 31-100 100 101-300
   * 300 301-1000 1000 1001-3000 3000 3001-10000 10000 Above 10000 Nearest 10000
   * If the exact number is to be recorded, and it is 10, 30, 100, 300, 1000,
   * 3000, or a multiple of 10000, add one to the number to distinguish it from
   * a figure that represents a range of numbers.
   * <p>
   * @return the NumAreaUnits value in a {@link TInteger} data type
   */
  public TInteger getNumAreaUnits() {
    return numAreaUnits;
  }

  /**
   * Set the maximum number of units (equipment) that will be operating
   * simultaneously in the same area of operation. An area is generally defined
   * as a country. enter the number of land mobile stations, ship stations, and
   * transportable stations associated with the current Assignment or SSRequest
   * dataset. Within an Assignment (but not under SSRequest), the number entered
   * shall represent either the exact number of stations or a range of numbers
   * as follows: Number of Stations Enter 1-10 10 11-30 30 31-100 100 101-300
   * 300 301-1000 1000 1001-3000 3000 3001-10000 10000 Above 10000 Nearest 10000
   * If the exact number is to be recorded, and it is 10, 30, 100, 300, 1000,
   * 3000, or a multiple of 10000, add one to the number to distinguish it from
   * a figure that represents a range of numbers.
   * <p>
   * @param value the NumAreaUnits value in a {@link TInteger} data type
   */
  public void setNumAreaUnits(TInteger value) {
    this.numAreaUnits = value;
  }

  /**
   * Determine if the NumAreaUnits is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumAreaUnits() {
    return (this.numAreaUnits != null ? this.numAreaUnits.isSetValue() : false);
  }

  /**
   * Get the maximum number of units (equipment) that will be operating
   * simultaneously in the same cosite environment. A cosite situation occurs
   * when several antennas are within the near field of each other.
   * <p>
   * @return the NumCositedUnits value in a {@link TInteger} data type
   */
  public TInteger getNumCositedUnits() {
    return numCositedUnits;
  }

  /**
   * Set the maximum number of units (equipment) that will be operating
   * simultaneously in the same cosite environment. A cosite situation occurs
   * when several antennas are within the near field of each other.
   * <p>
   * @param value the NumCositedUnits value in a {@link TInteger} data type
   */
  public void setNumCositedUnits(TInteger value) {
    this.numCositedUnits = value;
  }

  /**
   * Determine if the NumCositedUnits is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumCositedUnits() {
    return (this.numCositedUnits != null ? this.numCositedUnits.isSetValue() : false);
  }

  /**
   * Get the date on which the application will be submitted to the appropriate
   * spectrum management office.
   * <p>
   * @return the ApplicationDate value in a {@link TCalendar} data type
   */
  public TCalendar getApplicationDate() {
    return applicationDate;
  }

  /**
   * Set the date on which the application will be submitted to the appropriate
   * spectrum management office.
   * <p>
   * @param value the ApplicationDate value in a {@link TCalendar} data type
   */
  public void setApplicationDate(TCalendar value) {
    this.applicationDate = value;
  }

  /**
   * Determine if the ApplicationDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetApplicationDate() {
    return (this.applicationDate != null ? this.applicationDate.isSetValue() : false);
  }

  /**
   * Get the date by which the frequency assignment or Spectrum Supportability
   * Reply is required by the user in order to complete necessary advanced
   * operation coordination.
   * <p>
   * @return the DateResponseRequired value in a {@link TCalendar} data type
   */
  public TCalendar getDateResponseRequired() {
    return dateResponseRequired;
  }

  /**
   * Set the date by which the frequency assignment or Spectrum Supportability
   * Reply is required by the user in order to complete necessary advanced
   * operation coordination.
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
   * Get the name of the systems that are likely to be replaced by this system.
   * <p>
   * @return the ReplacementInfo value in a {@link TString} data type
   */
  public TString getReplacementInfo() {
    return replacementInfo;
  }

  /**
   * Set the name of the systems that are likely to be replaced by this system.
   * <p>
   * @param value the ReplacementInfo value in a {@link TString} data type
   */
  public void setReplacementInfo(TString value) {
    this.replacementInfo = value;
  }

  /**
   * Determine if the ReplacementInfo is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReplacementInfo() {
    return (this.replacementInfo != null ? this.replacementInfo.isSetValue() : false);
  }

  /**
   * Get the application Spectrum Planning Subcommittee (SPS) document
   * identifier assigned by NTIA. This is not the same as the Certification of
   * Spectrum Support SPS number.
   * <p>
   * @return the ApplicationSPSNumber value in a {@link TString} data type
   */
  public TString getApplicationSPSNumber() {
    return applicationSPSNumber;
  }

  /**
   * Set the application Spectrum Planning Subcommittee (SPS) document
   * identifier assigned by NTIA. This is not the same as the Certification of
   * Spectrum Support SPS number.
   * <p>
   * @param value the ApplicationSPSNumber value in a {@link TString} data type
   */
  public void setApplicationSPSNumber(TString value) {
    this.applicationSPSNumber = value;
  }

  /**
   * Determine if the ApplicationSPSNumber is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetApplicationSPSNumber() {
    return (this.applicationSPSNumber != null ? this.applicationSPSNumber.isSetValue() : false);
  }

  /**
   * Get the US Military Communications-Electronics Board (MCEB) identifier
   * assigned to the equipment or system. (e.g., J/F 12/12345). An SSRequest
   * coordination number usually ends with an even digit (e.g., /2, /4), while
   * an SSReply coordination number usually ends with an odd digit (e.g., /3,
   * /5). When certifying equipment, both SSRequest and SSReply SHOULD have a
   * coordination number.
   * <p>
   * @return the CoordinationNum value in a {@link TString} data type
   */
  public TString getCoordinationNum() {
    return coordinationNum;
  }

  /**
   * Set the US Military Communications-Electronics Board (MCEB) identifier
   * assigned to the equipment or system. (e.g., J/F 12/12345). An SSRequest
   * coordination number usually ends with an even digit (e.g., /2, /4), while
   * an SSReply coordination number usually ends with an odd digit (e.g., /3,
   * /5). When certifying equipment, both SSRequest and SSReply SHOULD have a
   * coordination number.
   * <p>
   * @param value the CoordinationNum value in a {@link TString} data type
   */
  public void setCoordinationNum(TString value) {
    this.coordinationNum = value;
  }

  /**
   * Determine if the CoordinationNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCoordinationNum() {
    return (this.coordinationNum != null ? this.coordinationNum.isSetValue() : false);
  }

  /**
   * Get the required character rates, data rates, and circuit
   * quality/reliability of the system.
   * <p>
   * @return the InfoTransferRequirement value in a {@link TString} data type
   */
  public TString getInfoTransferRequirement() {
    return infoTransferRequirement;
  }

  /**
   * Set the required character rates, data rates, and circuit
   * quality/reliability of the system.
   * <p>
   * @param value the InfoTransferRequirement value in a {@link TString} data
   *              type
   */
  public void setInfoTransferRequirement(TString value) {
    this.infoTransferRequirement = value;
  }

  /**
   * Determine if the InfoTransferRequirement is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInfoTransferRequirement() {
    return (this.infoTransferRequirement != null ? this.infoTransferRequirement.isSetValue() : false);
  }

  /**
   * Get the estimated initial cost, in US dollars, of the system/equipment.
   * <p>
   * @return the InitialCost value in a {@link TString} data type
   */
  public TString getInitialCost() {
    return initialCost;
  }

  /**
   * Set the estimated initial cost, in US dollars, of the system/equipment.
   * <p>
   * @param value the InitialCost value in a {@link TString} data type
   */
  public void setInitialCost(TString value) {
    this.initialCost = value;
  }

  /**
   * Determine if the InitialCost is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInitialCost() {
    return (this.initialCost != null ? this.initialCost.isSetValue() : false);
  }

  /**
   * Get the explanation of how the estimated initial cost for the system was
   * calculated.
   * <p>
   * @return the InitialCostDesc value in a {@link TString} data type
   */
  public TString getInitialCostDesc() {
    return initialCostDesc;
  }

  /**
   * Set the explanation of how the estimated initial cost for the system was
   * calculated.
   * <p>
   * @param value the InitialCostDesc value in a {@link TString} data type
   */
  public void setInitialCostDesc(TString value) {
    this.initialCostDesc = value;
  }

  /**
   * Determine if the InitialCostDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInitialCostDesc() {
    return (this.initialCostDesc != null ? this.initialCostDesc.isSetValue() : false);
  }

  /**
   * Get if this is a satellite system that is exempt from submitting
   * notification to the Radiocommunication Bureau.
   * <p>
   * @return the ITUWaiver value in a {@link TString} data type
   */
  public TString getITUWaiver() {
    return ituWaiver;
  }

  /**
   * Set if this is a satellite system that is exempt from submitting
   * notification to the Radiocommunication Bureau.
   * <p>
   * @param value the ITUWaiver value in a {@link TString} data type
   */
  public void setITUWaiver(TString value) {
    this.ituWaiver = value;
  }

  /**
   * Determine if the ITUWaiver is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetITUWaiver() {
    return (this.ituWaiver != null ? this.ituWaiver.isSetValue() : false);
  }

  /**
   * Get if this application requires coordination with the National Authority
   * for approval. For US records, the National Authority is NTIA and this
   * should be Yes, unless the record does not require coordination with NTIA
   * for approval.
   * <p>
   * @return the NTIACoordinationRequired value in a {@link TString} data type
   */
  public TString getNTIACoordinationRequired() {
    return ntiaCoordinationRequired;
  }

  /**
   * Set if this application requires coordination with the National Authority
   * for approval. For US records, the National Authority is NTIA and this
   * should be Yes, unless the record does not require coordination with NTIA
   * for approval.
   * <p>
   * @param value the NTIACoordinationRequired value in a {@link TString} data
   *              type
   */
  public void setNTIACoordinationRequired(TString value) {
    this.ntiaCoordinationRequired = value;
  }

  /**
   * Determine if the NTIACoordinationRequired is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNTIACoordinationRequired() {
    return (this.ntiaCoordinationRequired != null ? this.ntiaCoordinationRequired.isSetValue() : false);
  }

  /**
   * Get the Space and terrestrial information as defined by section 10.8 of the
   * NTIA Manual and not captured in other more specific data fields.
   * <p>
   * @return the NTIASpaceData value in a {@link TString} data type
   */
  public TString getNTIASpaceData() {
    return ntiaSpaceData;
  }

  /**
   * Set the Space and terrestrial information as defined by section 10.8 of the
   * NTIA Manual and not captured in other more specific data fields.
   * <p>
   * @param value the NTIASpaceData value in a {@link TString} data type
   */
  public void setNTIASpaceData(TString value) {
    this.ntiaSpaceData = value;
  }

  /**
   * Determine if the NTIASpaceData is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNTIASpaceData() {
    return (this.ntiaSpaceData != null ? this.ntiaSpaceData.isSetValue() : false);
  }

  /**
   * Get if the system is intended for the DoD operational inventory.
   * <p>
   * @return the OperInvIntent value in a {@link TString} data type
   */
  public TString getOperInvIntent() {
    return operInvIntent;
  }

  /**
   * Set if the system is intended for the DoD operational inventory.
   * <p>
   * @param value the OperInvIntent value in a {@link TString} data type
   */
  public void setOperInvIntent(TString value) {
    this.operInvIntent = value;
  }

  /**
   * Determine if the OperInvIntent is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOperInvIntent() {
    return (this.operInvIntent != null ? this.operInvIntent.isSetValue() : false);
  }

  /**
   * Get the agency that originated the application.
   * <p>
   * @return the OriginatingAgency value in a {@link TString} data type
   */
  public TString getOriginatingAgency() {
    return originatingAgency;
  }

  /**
   * Set the agency that originated the application.
   * <p>
   * @param value the OriginatingAgency value in a {@link TString} data type
   */
  public void setOriginatingAgency(TString value) {
    this.originatingAgency = value;
  }

  /**
   * Determine if the OriginatingAgency is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOriginatingAgency() {
    return (this.originatingAgency != null ? this.originatingAgency.isSetValue() : false);
  }

  /**
   * Get the request type. Possible values may include, but are not limited to,
   * DoD Certification, NTIA Certification, and Foreign Coordination.
   * <p>
   * @return the RequestType value in a {@link TString} data type
   */
  public TString getRequestType() {
    return requestType;
  }

  /**
   * Set the request type. Possible values may include, but are not limited to,
   * DoD Certification, NTIA Certification, and Foreign Coordination.
   * <p>
   * @param value the RequestType value in a {@link TString} data type
   */
  public void setRequestType(TString value) {
    this.requestType = value;
  }

  /**
   * Determine if the RequestType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRequestType() {
    return (this.requestType != null ? this.requestType.isSetValue() : false);
  }

  /**
   * Get RelatedAnalysisAndTestData (US), describe electromagnetic compatibility
   * studies, testing or analyses relevant to this system, including documents
   * currently in progress. Use the ExtReference attribute of this element as
   * appropriate.
   * <p>
   * @return the RelatedAnalysisAndTestData value in a {@link TString} data type
   */
  public TString getRelatedAnalysisAndTestData() {
    return relatedAnalysisAndTestData;
  }

  /**
   * Set RelatedAnalysisAndTestData (US), describe electromagnetic compatibility
   * studies, testing or analyses relevant to this system, including documents
   * currently in progress. Use the ExtReference attribute of this element as
   * appropriate.
   * <p>
   * @param value the RelatedAnalysisAndTestData value in a {@link TString} data
   *              type
   */
  public void setRelatedAnalysisAndTestData(TString value) {
    this.relatedAnalysisAndTestData = value;
  }

  /**
   * Determine if the RelatedAnalysisAndTestData is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRelatedAnalysisAndTestData() {
    return (this.relatedAnalysisAndTestData != null ? this.relatedAnalysisAndTestData.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return the SysRelationEssential value in a {@link TString} data type
   */
  public TString getSysRelationEssential() {
    return sysRelationEssential;
  }

  /**
   * Set
   * <p>
   * @param value the SysRelationEssential value in a {@link TString} data type
   */
  public void setSysRelationEssential(TString value) {
    this.sysRelationEssential = value;
  }

  /**
   * Determine if the SysRelationEssential is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSysRelationEssential() {
    return (this.sysRelationEssential != null ? this.sysRelationEssential.isSetValue() : false);
  }

  /**
   * Get the telecommunications service priority applicable to a
   * spectrum-dependent radiocommunications system intended to be used in direct
   * support of a national emergency declared under Section 706 of the
   * Communications Act of 1934, as amended.
   * <p>
   * @return the TSPR value in a {@link TString} data type
   */
  public TString getTSPR() {
    return tspr;
  }

  /**
   * Set the telecommunications service priority applicable to a
   * spectrum-dependent radiocommunications system intended to be used in direct
   * support of a national emergency declared under Section 706 of the
   * Communications Act of 1934, as amended.
   * <p>
   * @param value the TSPR value in a {@link TString} data type
   */
  public void setTSPR(TString value) {
    this.tspr = value;
  }

  /**
   * Determine if the TSPR is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTSPR() {
    return (this.tspr != null ? this.tspr.isSetValue() : false);
  }

  /**
   * Get if the system is used in a wartime environment.
   * <p>
   * @return the WartimeUse value in a {@link TString} data type
   */
  public TString getWartimeUse() {
    return wartimeUse;
  }

  /**
   * Set if the system is used in a wartime environment.
   * <p>
   * @param value the WartimeUse value in a {@link TString} data type
   */
  public void setWartimeUse(TString value) {
    this.wartimeUse = value;
  }

  /**
   * Determine if the WartimeUse is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetWartimeUse() {
    return (this.wartimeUse != null ? this.wartimeUse.isSetValue() : false);
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
   * Get the current stage of the system.
   * <p>
   * @return a non-null but possibly empty list of {@link Stage} instances
   */
  public Set<Stage> getStage() {
    if (stage == null) {
      stage = new HashSet<>();
    }
    return this.stage;
  }

  /**
   * Determine if the Stage is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStage() {
    return ((this.stage != null) && (!this.stage.isEmpty()));
  }

  /**
   * Clear the Stage field. This sets the field to null.
   */
  public void unsetStage() {
    this.stage = null;
  }

  /**
   * Get the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @return a non-null but possibly empty list of {@link Nomenclature}
   *         instances
   */
  public Set<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new HashSet<>();
    }
    return this.nomenclature;
  }

  /**
   * Determine if the Nomenclature is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNomenclature() {
    return ((this.nomenclature != null) && (!this.nomenclature.isEmpty()));
  }

  /**
   * Clear the Nomenclature field. This sets the field to null.
   */
  public void unsetNomenclature() {
    this.nomenclature = null;
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
   * Get the RelatedSupportability
   * <p>
   * Complex element RelatedSupportability refers to a SSRequest with which the
   * current dataset has a dependency.
   * <p>
   * @return a non-null but possibly empty list of {@link RelatedSupportability}
   *         instances
   */
  public Set<RelatedSupportability> getRelatedSupportability() {
    if (relatedSupportability == null) {
      relatedSupportability = new HashSet<>();
    }
    return this.relatedSupportability;
  }

  /**
   * Determine if the RelatedSupportability is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRelatedSupportability() {
    return ((this.relatedSupportability != null) && (!this.relatedSupportability.isEmpty()));
  }

  /**
   * Clear the RelatedSupportability field. This sets the field to null.
   */
  public void unsetRelatedSupportability() {
    this.relatedSupportability = null;
  }

  /**
   * Get the HostNation
   * <p>
   * Complex element HostNation indicates the host nations from which
   * supportability is requested. If a SSRequest received by NATO has no
   * HostNation entry, it will be assumed that this SSRequest is for all NATO
   * Nations plus AUS and NZL (in accordance with the FMSC agreement).
   * <p>
   * @return a non-null but possibly empty list of {@link HostNation} instances
   */
  public Set<HostNation> getHostNation() {
    if (hostNation == null) {
      hostNation = new HashSet<>();
    }
    return this.hostNation;
  }

  /**
   * Determine if the HostNation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHostNation() {
    return ((this.hostNation != null) && (!this.hostNation.isEmpty()));
  }

  /**
   * Clear the HostNation field. This sets the field to null.
   */
  public void unsetHostNation() {
    this.hostNation = null;
  }

  /**
   * Get if the system is used in a wartime environment.
   * <p>
   * @return a non-null but possibly empty list of {@link Time} instances
   */
  public Set<Time> getTime() {
    if (time == null) {
      time = new HashSet<>();
    }
    return this.time;
  }

  /**
   * Determine if the Time is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTime() {
    return ((this.time != null) && (!this.time.isEmpty()));
  }

  /**
   * Clear the Time field. This sets the field to null.
   */
  public void unsetTime() {
    this.time = null;
  }

  /**
   * Get the DiagramEndpoint
   * <p>
   * Complex element DiagramEndpoint defines an instance of an icon on the
   * diagram.
   * <p>
   * @return a non-null but possibly empty list of {@link DiagramEndpoint}
   *         instances
   */
  public Set<DiagramEndpoint> getDiagramEndpoint() {
    if (diagramEndpoint == null) {
      diagramEndpoint = new HashSet<>();
    }
    return this.diagramEndpoint;
  }

  /**
   * Determine if the DiagramEndpoint is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDiagramEndpoint() {
    return ((this.diagramEndpoint != null) && (!this.diagramEndpoint.isEmpty()));
  }

  /**
   * Clear the DiagramEndpoint field. This sets the field to null.
   */
  public void unsetDiagramEndpoint() {
    this.diagramEndpoint = null;
  }

  /**
   * Get the DiagramLine
   * <p>
   * Complex element DiagramLine defines a line between two endpoints on the
   * diagram.
   * <p>
   * @return a non-null but possibly empty list of {@link DiagramLine} instances
   */
  public Set<DiagramLine> getDiagramLine() {
    if (diagramLine == null) {
      diagramLine = new HashSet<>();
    }
    return this.diagramLine;
  }

  /**
   * Determine if the DiagramLine is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDiagramLine() {
    return ((this.diagramLine != null) && (!this.diagramLine.isEmpty()));
  }

  /**
   * Clear the DiagramLine field. This sets the field to null.
   */
  public void unsetDiagramLine() {
    this.diagramLine = null;
  }

  /**
   * Get the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station.
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
   * Get the US:StatusLog
   * <p>
   * Complex element StatusLog (US) contains the transactional processing
   * information related to spectrum supportability requests.
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
   * Get the US:Trunking
   * <p>
   * Complex element Trunking (US) defines Radiotelephony using standard land
   * mobile principles where multiple baseband signals are bounded within one
   * physical channel.
   * <p>
   * @return the Trunking value in a {@link Trunking} data type
   */
  public Trunking getTrunking() {
    return trunking;
  }

  /**
   * Set the US:Trunking
   * <p>
   * Complex element Trunking (US) defines Radiotelephony using standard land
   * mobile principles where multiple baseband signals are bounded within one
   * physical channel.
   * <p>
   * @param value the Trunking value in a {@link Trunking} data type
   */
  public void setTrunking(Trunking value) {
    this.trunking = value;
  }

  /**
   * Determine if the Trunking is configured.
   * <p>
   * If configured this method also inspects the {@link Trunking} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTrunking() {
    return (this.trunking != null);
  }

  /**
   * Set the title of the Spectrum Supportability application. Each application
   * title should be unique.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSRequest object instance
   */
  public SSRequest withTitle(String value) {
    setTitle(new TString(value));
    return this;
  }

  /**
   * Set the current stage of the system.
   * <p>
   * @param value An instances of type {@link ListCSG}
   * @return The current SSRequest object instance
   */
  public SSRequest withCurrentStage(ListCSG value) {
    setCurrentStage(new TString(value.value()));
    return this;
  }

  /**
   * Set a description of the types and forms of information to be transmitted
   * or received. The requirement should describe: - The general purpose of the
   * system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft
   * system to protect fixed facilities); - Each significant capability of the
   * system (e.g., in the PATRIOT system: search, acquisition and tracking
   * radar, TT&C, C2 links, etc); - Any related supportability documents should
   * be listed in the ExtReferenceRef element.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSRequest object instance
   */
  public SSRequest withRequirement(String value) {
    setRequirement(new TString(value));
    return this;
  }

  /**
   * Set "Yes" if the system may be used in a case of emergency.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current SSRequest object instance
   */
  public SSRequest withEmergency(ListCBO value) {
    setEmergency(new TString(value.value()));
    return this;
  }

  /**
   * Set the number of mobile units. These units do not necessarily operate
   * simultaneously in the same electromagnetic environment.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current SSRequest object instance
   */
  public SSRequest withNumMobileUnits(Integer value) {
    setNumMobileUnits(new TInteger(value));
    return this;
  }

  /**
   * Set the maximum number of units (equipment) that will be operating
   * simultaneously in the same area of operation. An area is generally defined
   * as a country. enter the number of land mobile stations, ship stations, and
   * transportable stations associated with the current Assignment or SSRequest
   * dataset. Within an Assignment (but not under SSRequest), the number entered
   * shall represent either the exact number of stations or a range of numbers
   * as follows: Number of Stations Enter 1-10 10 11-30 30 31-100 100 101-300
   * 300 301-1000 1000 1001-3000 3000 3001-10000 10000 Above 10000 Nearest 10000
   * If the exact number is to be recorded, and it is 10, 30, 100, 300, 1000,
   * 3000, or a multiple of 10000, add one to the number to distinguish it from
   * a figure that represents a range of numbers.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current SSRequest object instance
   */
  public SSRequest withNumAreaUnits(Integer value) {
    setNumAreaUnits(new TInteger(value));
    return this;
  }

  /**
   * Set the maximum number of units (equipment) that will be operating
   * simultaneously in the same cosite environment. A cosite situation occurs
   * when several antennas are within the near field of each other.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current SSRequest object instance
   */
  public SSRequest withNumCositedUnits(Integer value) {
    setNumCositedUnits(new TInteger(value));
    return this;
  }

  /**
   * Set the date on which the application will be submitted to the appropriate
   * spectrum management office.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current SSRequest object instance
   */
  public SSRequest withApplicationDate(Calendar value) {
    setApplicationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date on which the application will be submitted to the appropriate
   * spectrum management office.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current SSRequest object instance
   */
  public SSRequest withApplicationDate(Date value) {
    setApplicationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the frequency assignment or Spectrum Supportability
   * Reply is required by the user in order to complete necessary advanced
   * operation coordination.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current SSRequest object instance
   */
  public SSRequest withDateResponseRequired(Calendar value) {
    setDateResponseRequired(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the frequency assignment or Spectrum Supportability
   * Reply is required by the user in order to complete necessary advanced
   * operation coordination.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current SSRequest object instance
   */
  public SSRequest withDateResponseRequired(Date value) {
    setDateResponseRequired(new TCalendar(value));
    return this;
  }

  /**
   * Set the name of the systems that are likely to be replaced by this system.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSRequest object instance
   */
  public SSRequest withReplacementInfo(String value) {
    setReplacementInfo(new TString(value));
    return this;
  }

  /**
   * Set the application Spectrum Planning Subcommittee (SPS) document
   * identifier assigned by NTIA. This is not the same as the Certification of
   * Spectrum Support SPS number.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSRequest object instance
   */
  public SSRequest withApplicationSPSNumber(String value) {
    setApplicationSPSNumber(new TString(value));
    return this;
  }

  /**
   * Set the US Military Communications-Electronics Board (MCEB) identifier
   * assigned to the equipment or system. (e.g., J/F 12/12345). An SSRequest
   * coordination number usually ends with an even digit (e.g., /2, /4), while
   * an SSReply coordination number usually ends with an odd digit (e.g., /3,
   * /5). When certifying equipment, both SSRequest and SSReply SHOULD have a
   * coordination number.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSRequest object instance
   */
  public SSRequest withCoordinationNum(String value) {
    setCoordinationNum(new TString(value));
    return this;
  }

  /**
   * Set the required character rates, data rates, and circuit
   * quality/reliability of the system.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSRequest object instance
   */
  public SSRequest withInfoTransferRequirement(String value) {
    setInfoTransferRequirement(new TString(value));
    return this;
  }

  /**
   * Set the estimated initial cost, in US dollars, of the system/equipment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSRequest object instance
   */
  public SSRequest withInitialCost(String value) {
    setInitialCost(new TString(value));
    return this;
  }

  /**
   * Set the explanation of how the estimated initial cost for the system was
   * calculated.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSRequest object instance
   */
  public SSRequest withInitialCostDesc(String value) {
    setInitialCostDesc(new TString(value));
    return this;
  }

  /**
   * Set if this is a satellite system that is exempt from submitting
   * notification to the Radiocommunication Bureau.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current SSRequest object instance
   */
  public SSRequest withITUWaiver(ListCBO value) {
    setITUWaiver(new TString(value.value()));
    return this;
  }

  /**
   * Set if this application requires coordination with the National Authority
   * for approval. For US records, the National Authority is NTIA and this
   * should be Yes, unless the record does not require coordination with NTIA
   * for approval.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current SSRequest object instance
   */
  public SSRequest withNTIACoordinationRequired(ListCBO value) {
    setNTIACoordinationRequired(new TString(value.value()));
    return this;
  }

  /**
   * Set the Space and terrestrial information as defined by section 10.8 of the
   * NTIA Manual and not captured in other more specific data fields.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSRequest object instance
   */
  public SSRequest withNTIASpaceData(String value) {
    setNTIASpaceData(new TString(value));
    return this;
  }

  /**
   * Set if the system is intended for the DoD operational inventory.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current SSRequest object instance
   */
  public SSRequest withOperInvIntent(ListCBO value) {
    setOperInvIntent(new TString(value.value()));
    return this;
  }

  /**
   * Set the agency that originated the application.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSRequest object instance
   */
  public SSRequest withOriginatingAgency(String value) {
    setOriginatingAgency(new TString(value));
    return this;
  }

  /**
   * Set the request type. Possible values may include, but are not limited to,
   * DoD Certification, NTIA Certification, and Foreign Coordination.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSRequest object instance
   */
  public SSRequest withRequestType(String value) {
    setRequestType(new TString(value));
    return this;
  }

  /**
   * Set RelatedAnalysisAndTestData (US), describe electromagnetic compatibility
   * studies, testing or analyses relevant to this system, including documents
   * currently in progress. Use the ExtReference attribute of this element as
   * appropriate.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSRequest object instance
   */
  public SSRequest withRelatedAnalysisAndTestData(String value) {
    setRelatedAnalysisAndTestData(new TString(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSRequest object instance
   */
  public SSRequest withSysRelationEssential(String value) {
    setSysRelationEssential(new TString(value));
    return this;
  }

  /**
   * Set the telecommunications service priority applicable to a
   * spectrum-dependent radiocommunications system intended to be used in direct
   * support of a national emergency declared under Section 706 of the
   * Communications Act of 1934, as amended.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSRequest object instance
   */
  public SSRequest withTSPR(String value) {
    setTSPR(new TString(value));
    return this;
  }

  /**
   * Set if the system is used in a wartime environment.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current SSRequest object instance
   */
  public SSRequest withWartimeUse(ListCBO value) {
    setWartimeUse(new TString(value.value()));
    return this;
  }

  /**
   * Set the Project
   * <p>
   * Complex element Project provides the Project, OPLAN, COMPLAN or Exercise
   * name, or any other project name associated to the dataset.
   * <p>
   * @param values One or more instances of type {@link Project}
   * @return The current SSRequest object instance
   */
  public SSRequest withProject(Project... values) {
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
   * @return The current SSRequest object instance
   */
  public SSRequest withProject(Set<Project> values) {
    if (values != null) {
      getProject().addAll(values);
    }
    return this;
  }

  /**
   * Set the current stage of the system.
   * <p>
   * @param values One or more instances of type {@link Stage}
   * @return The current SSRequest object instance
   */
  public SSRequest withStage(Stage... values) {
    if (values != null) {
      getStage().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the current stage of the system.
   * <p>
   * @param values A collection of {@link Stage} instances
   * @return The current SSRequest object instance
   */
  public SSRequest withStage(Set<Stage> values) {
    if (values != null) {
      getStage().addAll(values);
    }
    return this;
  }

  /**
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @param values One or more instances of type {@link Nomenclature}
   * @return The current SSRequest object instance
   */
  public SSRequest withNomenclature(Nomenclature... values) {
    if (values != null) {
      getNomenclature().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @param values A collection of {@link Nomenclature} instances
   * @return The current SSRequest object instance
   */
  public SSRequest withNomenclature(Set<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
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
   * @return The current SSRequest object instance
   */
  public SSRequest withPOCInformation(POCInformation... values) {
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
   * @return The current SSRequest object instance
   */
  public SSRequest withPOCInformation(Set<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  /**
   * Set the RelatedSupportability
   * <p>
   * Complex element RelatedSupportability refers to a SSRequest with which the
   * current dataset has a dependency.
   * <p>
   * @param values One or more instances of type {@link RelatedSupportability}
   * @return The current SSRequest object instance
   */
  public SSRequest withRelatedSupportability(RelatedSupportability... values) {
    if (values != null) {
      getRelatedSupportability().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the RelatedSupportability
   * <p>
   * Complex element RelatedSupportability refers to a SSRequest with which the
   * current dataset has a dependency.
   * <p>
   * @param values A collection of {@link RelatedSupportability} instances
   * @return The current SSRequest object instance
   */
  public SSRequest withRelatedSupportability(Set<RelatedSupportability> values) {
    if (values != null) {
      getRelatedSupportability().addAll(values);
    }
    return this;
  }

  /**
   * Set the HostNation
   * <p>
   * Complex element HostNation indicates the host nations from which
   * supportability is requested. If a SSRequest received by NATO has no
   * HostNation entry, it will be assumed that this SSRequest is for all NATO
   * Nations plus AUS and NZL (in accordance with the FMSC agreement).
   * <p>
   * @param values One or more instances of type {@link HostNation}
   * @return The current SSRequest object instance
   */
  public SSRequest withHostNation(HostNation... values) {
    if (values != null) {
      getHostNation().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the HostNation
   * <p>
   * Complex element HostNation indicates the host nations from which
   * supportability is requested. If a SSRequest received by NATO has no
   * HostNation entry, it will be assumed that this SSRequest is for all NATO
   * Nations plus AUS and NZL (in accordance with the FMSC agreement).
   * <p>
   * @param values A collection of {@link HostNation} instances
   * @return The current SSRequest object instance
   */
  public SSRequest withHostNation(Set<HostNation> values) {
    if (values != null) {
      getHostNation().addAll(values);
    }
    return this;
  }

  /**
   * Set if the system is used in a wartime environment.
   * <p>
   * @param values One or more instances of type {@link Time}
   * @return The current SSRequest object instance
   */
  public SSRequest withTime(Time... values) {
    if (values != null) {
      getTime().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set if the system is used in a wartime environment.
   * <p>
   * @param values A collection of {@link Time} instances
   * @return The current SSRequest object instance
   */
  public SSRequest withTime(Set<Time> values) {
    if (values != null) {
      getTime().addAll(values);
    }
    return this;
  }

  /**
   * Set the DiagramEndpoint
   * <p>
   * Complex element DiagramEndpoint defines an instance of an icon on the
   * diagram.
   * <p>
   * @param values One or more instances of type {@link DiagramEndpoint}
   * @return The current SSRequest object instance
   */
  public SSRequest withDiagramEndpoint(DiagramEndpoint... values) {
    if (values != null) {
      getDiagramEndpoint().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the DiagramEndpoint
   * <p>
   * Complex element DiagramEndpoint defines an instance of an icon on the
   * diagram.
   * <p>
   * @param values A collection of {@link DiagramEndpoint} instances
   * @return The current SSRequest object instance
   */
  public SSRequest withDiagramEndpoint(Set<DiagramEndpoint> values) {
    if (values != null) {
      getDiagramEndpoint().addAll(values);
    }
    return this;
  }

  /**
   * Set the DiagramLine
   * <p>
   * Complex element DiagramLine defines a line between two endpoints on the
   * diagram.
   * <p>
   * @param values One or more instances of type {@link DiagramLine}
   * @return The current SSRequest object instance
   */
  public SSRequest withDiagramLine(DiagramLine... values) {
    if (values != null) {
      getDiagramLine().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the DiagramLine
   * <p>
   * Complex element DiagramLine defines a line between two endpoints on the
   * diagram.
   * <p>
   * @param values A collection of {@link DiagramLine} instances
   * @return The current SSRequest object instance
   */
  public SSRequest withDiagramLine(Set<DiagramLine> values) {
    if (values != null) {
      getDiagramLine().addAll(values);
    }
    return this;
  }

  /**
   * Set the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station.
   * <p>
   * @param values One or more instances of type {@link Configuration}
   * @return The current SSRequest object instance
   */
  public SSRequest withConfiguration(Configuration... values) {
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
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station.
   * <p>
   * @param values A collection of {@link Configuration} instances
   * @return The current SSRequest object instance
   */
  public SSRequest withConfiguration(Set<Configuration> values) {
    if (values != null) {
      getConfiguration().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:StatusLog
   * <p>
   * Complex element StatusLog (US) contains the transactional processing
   * information related to spectrum supportability requests.
   * <p>
   * @param values One or more instances of type {@link StatusLog}
   * @return The current SSRequest object instance
   */
  public SSRequest withStatusLog(StatusLog... values) {
    if (values != null) {
      getStatusLog().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:StatusLog
   * <p>
   * Complex element StatusLog (US) contains the transactional processing
   * information related to spectrum supportability requests.
   * <p>
   * @param values A collection of {@link StatusLog} instances
   * @return The current SSRequest object instance
   */
  public SSRequest withStatusLog(Set<StatusLog> values) {
    if (values != null) {
      getStatusLog().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:Trunking
   * <p>
   * Complex element Trunking (US) defines Radiotelephony using standard land
   * mobile principles where multiple baseband signals are bounded within one
   * physical channel.
   * <p>
   * @param value An instances of type {@link Trunking}
   * @return The current SSRequest object instance
   */
  public SSRequest withTrunking(Trunking value) {
    setTrunking(value);
    return this;
  }

  /**
   * Get a string representation of this SSRequest instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SSRequest {"
      + (relatedSupportability != null ? " relatedSupportability [" + relatedSupportability + "]" : "")
      + (nomenclature != null ? " nomenclature [" + nomenclature + "]" : "")
      + (numCositedUnits != null ? " numCositedUnits [" + numCositedUnits + "]" : "")
      + (emergency != null ? " emergency [" + emergency + "]" : "")
      + (stage != null ? " stage [" + stage + "]" : "")
      + (ntiaSpaceData != null ? " ntiaSpaceData [" + ntiaSpaceData + "]" : "")
      + (initialCostDesc != null ? " initialCostDesc [" + initialCostDesc + "]" : "")
      + (replacementInfo != null ? " replacementInfo [" + replacementInfo + "]" : "")
      + (time != null ? " time [" + time + "]" : "")
      + (title != null ? " title [" + title + "]" : "")
      + (sysRelationEssential != null ? " sysRelationEssential [" + sysRelationEssential + "]" : "")
      + (dateResponseRequired != null ? " dateResponseRequired [" + dateResponseRequired + "]" : "")
      + (originatingAgency != null ? " originatingAgency [" + originatingAgency + "]" : "")
      + (initialCost != null ? " initialCost [" + initialCost + "]" : "")
      + (ituWaiver != null ? " ituWaiver [" + ituWaiver + "]" : "")
      + (diagramLine != null ? " diagramLine [" + diagramLine + "]" : "")
      + (requirement != null ? " requirement [" + requirement + "]" : "")
      + (coordinationNum != null ? " coordinationNum [" + coordinationNum + "]" : "")
      + (applicationSPSNumber != null ? " applicationSPSNumber [" + applicationSPSNumber + "]" : "")
      + (pocInformation != null ? " pocInformation [" + pocInformation + "]" : "")
      + (currentStage != null ? " currentStage [" + currentStage + "]" : "")
      + (diagramEndpoint != null ? " diagramEndpoint [" + diagramEndpoint + "]" : "")
      + (relatedAnalysisAndTestData != null ? " relatedAnalysisAndTestData [" + relatedAnalysisAndTestData + "]" : "")
      + (tspr != null ? " tspr [" + tspr + "]" : "")
      + (requestType != null ? " requestType [" + requestType + "]" : "")
      + (numAreaUnits != null ? " numAreaUnits [" + numAreaUnits + "]" : "")
      + (operInvIntent != null ? " operInvIntent [" + operInvIntent + "]" : "")
      + (statusLog != null ? " statusLog [" + statusLog + "]" : "")
      + (ntiaCoordinationRequired != null ? " ntiaCoordinationRequired [" + ntiaCoordinationRequired + "]" : "")
      + (project != null ? " project [" + project + "]" : "")
      + (trunking != null ? " trunking [" + trunking + "]" : "")
      + (hostNation != null ? " hostNation [" + hostNation + "]" : "")
      + (numMobileUnits != null ? " numMobileUnits [" + numMobileUnits + "]" : "")
      + (wartimeUse != null ? " wartimeUse [" + wartimeUse + "]" : "")
      + (applicationDate != null ? " applicationDate [" + applicationDate + "]" : "")
      + (configuration != null ? " configuration [" + configuration + "]" : "")
      + (infoTransferRequirement != null ? " infoTransferRequirement [" + infoTransferRequirement + "]" : "")
      + "\n  SSRequest." + super.toString() + "\n"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SSRequest} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link TString Title}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetTitle();
  }

}
