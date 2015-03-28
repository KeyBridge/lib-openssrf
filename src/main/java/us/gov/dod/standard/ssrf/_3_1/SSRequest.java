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
SSRequest contains all parameters describing the system and its usage, for which Spectrum Supportability is being requested.

Sub-Elements are {@link Configuration}, {@link DiagramEndpoint}, {@link DiagramLine}, {@link HostNation}, {@link Nomenclature}, {@link POCInformation}, {@link Project}, {@link RelatedSupportability}, {@link Stage}, {@link StatusLog}, {@link Time}, {@link Trunking}

Example: <pre>
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
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
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
public class SSRequest
    extends Common
{

/**
Title  - Application Title (Required) 

The title of the Spectrum Supportability application. Each application title should be unique.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Title", required = true)
      private  S100 title;
/**
CurrentStage  - Current Stage (Optional) 

The current stage of the system.

Format is L:CSG
@since 3.1.0
*/
    @XmlElement(name = "CurrentStage", required = false)
    private TString currentStage;
/**
Requirement  - Requirement Description (Optional) 

A description of the types and forms of information to be transmitted or received. The requirement should describe:
- The general purpose of the system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft system to protect fixed facilities);
- Each significant capability of the system (e.g., in the PATRIOT system: search, acquisition and tracking radar, TT&C, C2 links, etc);
- Any related supportability documents should be listed in the ExtReferenceRef element.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "Requirement", required = false)
    private MEMO requirement;
/**
Emergency - Emergency Indicator (Optional) 

"Yes" if the system may be used in a case of emergency.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Emergency", required = false)
    private TString emergency;
/**
NumMobileUnits  - Number of Mobile Units (Optional) 

The number of mobile units. These units do not necessarily operate simultaneously in the same electromagnetic environment.

Format is UN(9)

Attribute group NumUnits (Optional)
@since 3.1.0
*/
    @XmlElement(name = "NumMobileUnits", required = false)
    private UN9 numMobileUnits;
/**
NumAreaUnits  - Number of Units in Area (Optional) 

The maximum number of units (equipment) that will be operating simultaneously in the same area of operation. An area is generally defined as a country. enter the number of land mobile stations, ship stations, and transportable stations associated with the current Assignment or SSRequest dataset. Within an Assignment (but not under SSRequest), the number entered shall represent either the exact number of stations or a range of numbers as follows:
Number of Stations Enter
1-10  10
11-30  30
31-100  100
101-300  300
301-1000  1000
1001-3000  3000
3001-10000  10000
Above 10000  Nearest 10000
If the exact number is to be recorded, and it is 10, 30, 100, 300, 1000, 3000, or a multiple of 10000, add one to the number to distinguish it from a figure that represents a range of numbers.

Format is UN(9)

Attribute group NumUnits (Optional)
@since 3.1.0
*/
    @XmlElement(name = "NumAreaUnits", required = false)
    private UN9 numAreaUnits;
/**
NumCositedUnits  - Number of Cosited Units (Optional) 

The maximum number of units (equipment) that will be operating simultaneously in the same cosite environment. A cosite situation occurs when several antennas are within the near field of each other.

Format is UN(9)

Attribute group NumUnits (Optional)
@since 3.1.0
*/
    @XmlElement(name = "NumCositedUnits", required = false)
    private UN9 numCositedUnits;
/**
ApplicationDate  - Application Date (Optional) 

The date on which the application will be submitted to the appropriate spectrum management office.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "ApplicationDate", required = false)
    private D applicationDate;
/**
DateResponseRequired  - Date Response Required (Optional) 

The date by which the frequency assignment or Spectrum Supportability Reply is required by the user in order to complete necessary advanced operation coordination.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "DateResponseRequired", required = false)
    private D dateResponseRequired;
/**
ReplacementInfo  - Replacement Info (Optional) 

The name of the systems that are likely to be replaced by this system.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "ReplacementInfo", required = false)
    private MEMO replacementInfo;
/**
US:ApplicationSPSNumber  - Application SPS Number (Optional) 

The application Spectrum Planning Subcommittee (SPS) document identifier assigned by NTIA. This is not the same as the Certification of Spectrum Support SPS number.

Format is S11
@since 3.1.0
*/
    @XmlElement(name = "ApplicationSPSNumber", required = false)
    private S11 applicationSPSNumber;
/**
US:CoordinationNum  - Coordination Number (Optional) 

The US Military Communications-Electronics Board (MCEB) identifier assigned to the equipment or system. (e.g., J/F  12/12345).  An SSRequest coordination number usually ends with an even digit (e.g., /2, /4), while an SSReply coordination number usually ends with an odd digit (e.g., /3, /5).  When certifying equipment, both SSRequest and SSReply SHOULD have a coordination number.

Format is S15
@since 3.1.0
*/
    @XmlElement(name = "CoordinationNum", required = false)
    private S15 coordinationNum;
/**
US:InfoTransferRequirement  - Info Transfer Requirement (Optional) 

The required character rates, data rates, and circuit quality/reliability of the system.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "InfoTransferRequirement", required = false)
    private MEMO infoTransferRequirement;
/**
US:InitialCost  - Initial Cost (Optional) 

The estimated initial cost, in US dollars, of the system/equipment.

Format is S70
@since 3.1.0
*/
    @XmlElement(name = "InitialCost", required = false)
    private S70 initialCost;
/**
US:InitialCostDesc  - Initial Cost Description (Optional) 

The explanation of how the estimated initial cost for the system was calculated.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "InitialCostDesc", required = false)
    private MEMO initialCostDesc;
/**
US:ITUWaiver  - ITU Waiver (Optional) 

If this is a satellite system that is exempt from submitting notification to the Radiocommunication Bureau.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "ITUWaiver", required = false)
    private TString ituWaiver;
/**
US:NTIACoordinationRequired  - NTIA Coordination Required (Optional) 

If this application requires coordination with the National Authority for approval. For US records, the National Authority is NTIA and this should be Yes, unless the record does not require coordination with NTIA for approval.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "NTIACoordinationRequired", required = false)
    private TString ntiaCoordinationRequired;
/**
US:NTIASpaceData  - NTIA Space Data (Optional) 

The Space and terrestrial information as defined by section 10.8 of the NTIA Manual and not captured in other more specific data fields.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "NTIASpaceData", required = false)
    private MEMO ntiaSpaceData;
/**
US:OperInvIntent  - Operational Inventory Intent (Optional) 

If the system is intended for the DoD operational inventory.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "OperInvIntent", required = false)
    private TString operInvIntent;
/**
US:OriginatingAgency  - Originating Agency (Optional) 

The agency that originated the application.

Format is S80
@since 3.1.0
*/
    @XmlElement(name = "OriginatingAgency", required = false)
    private S80 originatingAgency;
/**
US:RequestType - Request Type (Optional) 

The request type. Possible values may include, but are not limited to, DoD Certification, NTIA Certification, and Foreign Coordination.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "RequestType", required = false)
    private S50 requestType;
/**
In Data Item RelatedAnalysisAndTestData (US), describe electromagnetic compatibility studies, testing or analyses relevant to this system, including documents currently in progress. Use the ExtReference attribute of this element as appropriate.
@since 3.1.0
*/
    @XmlElement(name = "RelatedAnalysisAndTestData", required = false)
    private MEMO relatedAnalysisAndTestData;

    @XmlElement(name = "SysRelationEssential", required = false)
    private MEMO sysRelationEssential;
/**
US:TSPR  - TSPR (Optional) 

The telecommunications service priority applicable to a spectrum-dependent radiocommunications system intended to be used in direct support of a national emergency declared under Section 706 of the Communications Act of 1934, as amended.

Format is S10
@since 3.1.0
*/
    @XmlElement(name = "TSPR", required = false)
    private S10 tspr;
/**
US:WartimeUse  - Wartime Use (Optional) 

If the system is used in a wartime environment.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "WartimeUse", required = false)
    private TString wartimeUse;
/**
Project (Optional)

Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other project name associated to the dataset.
@since 3.1.0
*/
    @XmlElement(name = "Project")
      private  Set<Project> project;
/**
CurrentStage  - Current Stage (Optional) 

The current stage of the system.

Format is L:CSG
@since 3.1.0
*/
    @XmlElement(name = "Stage")
      private  Set<Stage> stage;
/**
Nomenclature (Optional)

Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.
@since 3.1.0
*/
    @XmlElement(name = "Nomenclature")
      private  Set<Nomenclature> nomenclature;
/**
POCInformation (Optional)

POCInformation contains a reference to a Contact, Organisation or Role dataset.
@since 3.1.0
*/
    @XmlElement(name = "POCInformation")
      private  Set<POCInformation> pocInformation;
/**
RelatedSupportability (Optional)

RelatedSupportability refers to a SSRequest with which the current dataset has a dependency.
@since 3.1.0
*/
    @XmlElement(name = "RelatedSupportability")
      private  Set<RelatedSupportability> relatedSupportability;
/**
HostNation (Optional)

HostNation indicates the host nations from which supportability is requested. If a SSRequest received by NATO has no HostNation entry, it will be assumed that this SSRequest is for all NATO Nations plus AUS and NZL (in accordance with the FMSC agreement).
@since 3.1.0
*/
    @XmlElement(name = "HostNation", nillable = true)
      private  Set<HostNation> hostNation;
/**
US:WartimeUse  - Wartime Use (Optional) 

If the system is used in a wartime environment.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Time")
      private  Set<Time> time;
/**
DiagramEndpoint (Optional)

DiagramEndpoint defines an instance of an icon on the diagram.
@since 3.1.0
*/
    @XmlElement(name = "DiagramEndpoint")
      private  Set<DiagramEndpoint> diagramEndpoint;
/**
DiagramLine (Optional)

DiagramLine defines a line between two endpoints on the diagram.
@since 3.1.0
*/
    @XmlElement(name = "DiagramLine")
      private  Set<DiagramLine> diagramLine;
/**
Configuration (Optional)

Configuration identifies each operational configuration that is required in a SSRequest, granted by a Host Nation in a SSReply, or authorised in a frequency Assignment or Allotment dataset. It also identifies the functional use of the assigned frequency at a particular transmitting station.

Divergence from SMADEF: Mandatory [1..n] when exchanging with NATO / 
@since 3.1.0
*/
    @XmlElement(name = "Configuration")
      private  Set<Configuration> configuration;
/**
US:StatusLog (Optional)

StatusLog (US) contains the transactional processing information related to spectrum supportability requests.
@since 3.1.0
*/
    @XmlElement(name = "StatusLog")
      private  Set<StatusLog> statusLog;
/**
US:Trunking (Optional)

Trunking (US) defines Radiotelephony using standard land mobile principles where multiple baseband signals are bounded within one physical channel.
@since 3.1.0
*/
    @XmlElement(name = "Trunking")
      private  Trunking trunking;

/**
Get the title of the Spectrum Supportability application. Each application title should be unique.

@return the Title value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getTitle() {
        return title;
    }

/**
Set the title of the Spectrum Supportability application. Each application title should be unique.

@param value the Title value in a {@link TS100} data type
@since 3.1.0
*/
public void setTitle(S100 value) {
        this.title = value;
    }

/**
Determine if the Title is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTitle() {
        return (this.title!= null);
    }

/**
Get the current stage of the system.

@return the CurrentStage value in a {@link TString} data type
@since 3.1.0
*/
public TString getCurrentStage() {
        return currentStage;
    }

/**
Set the current stage of the system.

@param value the CurrentStage value in a {@link TString} data type
@since 3.1.0
*/
public void setCurrentStage(TString value) {
        this.currentStage = value;
    }

/**
Determine if the CurrentStage is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCurrentStage() {
return (this.currentStage!= null ? this.currentStage.isSetValue() : false);
    }

/**
Get a description of the types and forms of information to be transmitted or received. The requirement should describe:
- The general purpose of the system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft system to protect fixed facilities);
- Each significant capability of the system (e.g., in the PATRIOT system: search, acquisition and tracking radar, TT&C, C2 links, etc);
- Any related supportability documents should be listed in the ExtReferenceRef element.

@return the Requirement value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getRequirement() {
        return requirement;
    }

/**
Set a description of the types and forms of information to be transmitted or received. The requirement should describe:
- The general purpose of the system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft system to protect fixed facilities);
- Each significant capability of the system (e.g., in the PATRIOT system: search, acquisition and tracking radar, TT&C, C2 links, etc);
- Any related supportability documents should be listed in the ExtReferenceRef element.

@param value the Requirement value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setRequirement(MEMO value) {
        this.requirement = value;
    }

/**
Determine if the Requirement is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRequirement() {
        return (this.requirement!= null);
    }

/**
Get "Yes" if the system may be used in a case of emergency.

@return the Emergency value in a {@link TString} data type
@since 3.1.0
*/
public TString getEmergency() {
        return emergency;
    }

/**
Set "Yes" if the system may be used in a case of emergency.

@param value the Emergency value in a {@link TString} data type
@since 3.1.0
*/
public void setEmergency(TString value) {
        this.emergency = value;
    }

/**
Determine if the Emergency is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEmergency() {
return (this.emergency!= null ? this.emergency.isSetValue() : false);
    }

/**
Get the number of mobile units. These units do not necessarily operate simultaneously in the same electromagnetic environment.

@return the NumMobileUnits value in a {@link TUN9} data type
@since 3.1.0
*/
public UN9 getNumMobileUnits() {
        return numMobileUnits;
    }

/**
Set the number of mobile units. These units do not necessarily operate simultaneously in the same electromagnetic environment.

@param value the NumMobileUnits value in a {@link TUN9} data type
@since 3.1.0
*/
public void setNumMobileUnits(UN9 value) {
        this.numMobileUnits = value;
    }

/**
Determine if the NumMobileUnits is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumMobileUnits() {
        return (this.numMobileUnits!= null);
    }

/**
Get the maximum number of units (equipment) that will be operating simultaneously in the same area of operation. An area is generally defined as a country. enter the number of land mobile stations, ship stations, and transportable stations associated with the current Assignment or SSRequest dataset. Within an Assignment (but not under SSRequest), the number entered shall represent either the exact number of stations or a range of numbers as follows:
Number of Stations Enter
1-10  10
11-30  30
31-100  100
101-300  300
301-1000  1000
1001-3000  3000
3001-10000  10000
Above 10000  Nearest 10000
If the exact number is to be recorded, and it is 10, 30, 100, 300, 1000, 3000, or a multiple of 10000, add one to the number to distinguish it from a figure that represents a range of numbers.

@return the NumAreaUnits value in a {@link TUN9} data type
@since 3.1.0
*/
public UN9 getNumAreaUnits() {
        return numAreaUnits;
    }

/**
Set the maximum number of units (equipment) that will be operating simultaneously in the same area of operation. An area is generally defined as a country. enter the number of land mobile stations, ship stations, and transportable stations associated with the current Assignment or SSRequest dataset. Within an Assignment (but not under SSRequest), the number entered shall represent either the exact number of stations or a range of numbers as follows:
Number of Stations Enter
1-10  10
11-30  30
31-100  100
101-300  300
301-1000  1000
1001-3000  3000
3001-10000  10000
Above 10000  Nearest 10000
If the exact number is to be recorded, and it is 10, 30, 100, 300, 1000, 3000, or a multiple of 10000, add one to the number to distinguish it from a figure that represents a range of numbers.

@param value the NumAreaUnits value in a {@link TUN9} data type
@since 3.1.0
*/
public void setNumAreaUnits(UN9 value) {
        this.numAreaUnits = value;
    }

/**
Determine if the NumAreaUnits is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumAreaUnits() {
        return (this.numAreaUnits!= null);
    }

/**
Get the maximum number of units (equipment) that will be operating simultaneously in the same cosite environment. A cosite situation occurs when several antennas are within the near field of each other.

@return the NumCositedUnits value in a {@link TUN9} data type
@since 3.1.0
*/
public UN9 getNumCositedUnits() {
        return numCositedUnits;
    }

/**
Set the maximum number of units (equipment) that will be operating simultaneously in the same cosite environment. A cosite situation occurs when several antennas are within the near field of each other.

@param value the NumCositedUnits value in a {@link TUN9} data type
@since 3.1.0
*/
public void setNumCositedUnits(UN9 value) {
        this.numCositedUnits = value;
    }

/**
Determine if the NumCositedUnits is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumCositedUnits() {
        return (this.numCositedUnits!= null);
    }

/**
Get the date on which the application will be submitted to the appropriate spectrum management office.

@return the ApplicationDate value in a {@link TD} data type
@since 3.1.0
*/
public D getApplicationDate() {
        return applicationDate;
    }

/**
Set the date on which the application will be submitted to the appropriate spectrum management office.

@param value the ApplicationDate value in a {@link TD} data type
@since 3.1.0
*/
public void setApplicationDate(D value) {
        this.applicationDate = value;
    }

/**
Determine if the ApplicationDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetApplicationDate() {
        return (this.applicationDate!= null);
    }

/**
Get the date by which the frequency assignment or Spectrum Supportability Reply is required by the user in order to complete necessary advanced operation coordination.

@return the DateResponseRequired value in a {@link TD} data type
@since 3.1.0
*/
public D getDateResponseRequired() {
        return dateResponseRequired;
    }

/**
Set the date by which the frequency assignment or Spectrum Supportability Reply is required by the user in order to complete necessary advanced operation coordination.

@param value the DateResponseRequired value in a {@link TD} data type
@since 3.1.0
*/
public void setDateResponseRequired(D value) {
        this.dateResponseRequired = value;
    }

/**
Determine if the DateResponseRequired is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDateResponseRequired() {
        return (this.dateResponseRequired!= null);
    }

/**
Get the name of the systems that are likely to be replaced by this system.

@return the ReplacementInfo value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getReplacementInfo() {
        return replacementInfo;
    }

/**
Set the name of the systems that are likely to be replaced by this system.

@param value the ReplacementInfo value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setReplacementInfo(MEMO value) {
        this.replacementInfo = value;
    }

/**
Determine if the ReplacementInfo is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetReplacementInfo() {
        return (this.replacementInfo!= null);
    }

/**
Get the application Spectrum Planning Subcommittee (SPS) document identifier assigned by NTIA. This is not the same as the Certification of Spectrum Support SPS number.

@return the ApplicationSPSNumber value in a {@link TS11} data type
@since 3.1.0
*/
public S11 getApplicationSPSNumber() {
        return applicationSPSNumber;
    }

/**
Set the application Spectrum Planning Subcommittee (SPS) document identifier assigned by NTIA. This is not the same as the Certification of Spectrum Support SPS number.

@param value the ApplicationSPSNumber value in a {@link TS11} data type
@since 3.1.0
*/
public void setApplicationSPSNumber(S11 value) {
        this.applicationSPSNumber = value;
    }

/**
Determine if the ApplicationSPSNumber is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetApplicationSPSNumber() {
        return (this.applicationSPSNumber!= null);
    }

/**
Get the US Military Communications-Electronics Board (MCEB) identifier assigned to the equipment or system. (e.g., J/F  12/12345).  An SSRequest coordination number usually ends with an even digit (e.g., /2, /4), while an SSReply coordination number usually ends with an odd digit (e.g., /3, /5).  When certifying equipment, both SSRequest and SSReply SHOULD have a coordination number.

@return the CoordinationNum value in a {@link TS15} data type
@since 3.1.0
*/
public S15 getCoordinationNum() {
        return coordinationNum;
    }

/**
Set the US Military Communications-Electronics Board (MCEB) identifier assigned to the equipment or system. (e.g., J/F  12/12345).  An SSRequest coordination number usually ends with an even digit (e.g., /2, /4), while an SSReply coordination number usually ends with an odd digit (e.g., /3, /5).  When certifying equipment, both SSRequest and SSReply SHOULD have a coordination number.

@param value the CoordinationNum value in a {@link TS15} data type
@since 3.1.0
*/
public void setCoordinationNum(S15 value) {
        this.coordinationNum = value;
    }

/**
Determine if the CoordinationNum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCoordinationNum() {
        return (this.coordinationNum!= null);
    }

/**
Get the required character rates, data rates, and circuit quality/reliability of the system.

@return the InfoTransferRequirement value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getInfoTransferRequirement() {
        return infoTransferRequirement;
    }

/**
Set the required character rates, data rates, and circuit quality/reliability of the system.

@param value the InfoTransferRequirement value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setInfoTransferRequirement(MEMO value) {
        this.infoTransferRequirement = value;
    }

/**
Determine if the InfoTransferRequirement is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetInfoTransferRequirement() {
        return (this.infoTransferRequirement!= null);
    }

/**
Get the estimated initial cost, in US dollars, of the system/equipment.

@return the InitialCost value in a {@link TS70} data type
@since 3.1.0
*/
public S70 getInitialCost() {
        return initialCost;
    }

/**
Set the estimated initial cost, in US dollars, of the system/equipment.

@param value the InitialCost value in a {@link TS70} data type
@since 3.1.0
*/
public void setInitialCost(S70 value) {
        this.initialCost = value;
    }

/**
Determine if the InitialCost is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetInitialCost() {
        return (this.initialCost!= null);
    }

/**
Get the explanation of how the estimated initial cost for the system was calculated.

@return the InitialCostDesc value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getInitialCostDesc() {
        return initialCostDesc;
    }

/**
Set the explanation of how the estimated initial cost for the system was calculated.

@param value the InitialCostDesc value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setInitialCostDesc(MEMO value) {
        this.initialCostDesc = value;
    }

/**
Determine if the InitialCostDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetInitialCostDesc() {
        return (this.initialCostDesc!= null);
    }

/**
Get if this is a satellite system that is exempt from submitting notification to the Radiocommunication Bureau.

@return the ITUWaiver value in a {@link TString} data type
@since 3.1.0
*/
public TString getITUWaiver() {
        return ituWaiver;
    }

/**
Set if this is a satellite system that is exempt from submitting notification to the Radiocommunication Bureau.

@param value the ITUWaiver value in a {@link TString} data type
@since 3.1.0
*/
public void setITUWaiver(TString value) {
        this.ituWaiver = value;
    }

/**
Determine if the ITUWaiver is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetITUWaiver() {
return (this.ituWaiver!= null ? this.ituWaiver.isSetValue() : false);
    }

/**
Get if this application requires coordination with the National Authority for approval. For US records, the National Authority is NTIA and this should be Yes, unless the record does not require coordination with NTIA for approval.

@return the NTIACoordinationRequired value in a {@link TString} data type
@since 3.1.0
*/
public TString getNTIACoordinationRequired() {
        return ntiaCoordinationRequired;
    }

/**
Set if this application requires coordination with the National Authority for approval. For US records, the National Authority is NTIA and this should be Yes, unless the record does not require coordination with NTIA for approval.

@param value the NTIACoordinationRequired value in a {@link TString} data type
@since 3.1.0
*/
public void setNTIACoordinationRequired(TString value) {
        this.ntiaCoordinationRequired = value;
    }

/**
Determine if the NTIACoordinationRequired is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNTIACoordinationRequired() {
return (this.ntiaCoordinationRequired!= null ? this.ntiaCoordinationRequired.isSetValue() : false);
    }

/**
Get the Space and terrestrial information as defined by section 10.8 of the NTIA Manual and not captured in other more specific data fields.

@return the NTIASpaceData value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getNTIASpaceData() {
        return ntiaSpaceData;
    }

/**
Set the Space and terrestrial information as defined by section 10.8 of the NTIA Manual and not captured in other more specific data fields.

@param value the NTIASpaceData value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setNTIASpaceData(MEMO value) {
        this.ntiaSpaceData = value;
    }

/**
Determine if the NTIASpaceData is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNTIASpaceData() {
        return (this.ntiaSpaceData!= null);
    }

/**
Get if the system is intended for the DoD operational inventory.

@return the OperInvIntent value in a {@link TString} data type
@since 3.1.0
*/
public TString getOperInvIntent() {
        return operInvIntent;
    }

/**
Set if the system is intended for the DoD operational inventory.

@param value the OperInvIntent value in a {@link TString} data type
@since 3.1.0
*/
public void setOperInvIntent(TString value) {
        this.operInvIntent = value;
    }

/**
Determine if the OperInvIntent is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOperInvIntent() {
return (this.operInvIntent!= null ? this.operInvIntent.isSetValue() : false);
    }

/**
Get the agency that originated the application.

@return the OriginatingAgency value in a {@link TS80} data type
@since 3.1.0
*/
public S80 getOriginatingAgency() {
        return originatingAgency;
    }

/**
Set the agency that originated the application.

@param value the OriginatingAgency value in a {@link TS80} data type
@since 3.1.0
*/
public void setOriginatingAgency(S80 value) {
        this.originatingAgency = value;
    }

/**
Determine if the OriginatingAgency is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOriginatingAgency() {
        return (this.originatingAgency!= null);
    }

/**
Get the request type. Possible values may include, but are not limited to, DoD Certification, NTIA Certification, and Foreign Coordination.

@return the RequestType value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getRequestType() {
        return requestType;
    }

/**
Set the request type. Possible values may include, but are not limited to, DoD Certification, NTIA Certification, and Foreign Coordination.

@param value the RequestType value in a {@link TS50} data type
@since 3.1.0
*/
public void setRequestType(S50 value) {
        this.requestType = value;
    }

/**
Determine if the RequestType is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRequestType() {
        return (this.requestType!= null);
    }

/**
Get In Data Item RelatedAnalysisAndTestData (US), describe electromagnetic compatibility studies, testing or analyses relevant to this system, including documents currently in progress. Use the ExtReference attribute of this element as appropriate.

@return the RelatedAnalysisAndTestData value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getRelatedAnalysisAndTestData() {
        return relatedAnalysisAndTestData;
    }

/**
Set In Data Item RelatedAnalysisAndTestData (US), describe electromagnetic compatibility studies, testing or analyses relevant to this system, including documents currently in progress. Use the ExtReference attribute of this element as appropriate.

@param value the RelatedAnalysisAndTestData value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setRelatedAnalysisAndTestData(MEMO value) {
        this.relatedAnalysisAndTestData = value;
    }

/**
Determine if the RelatedAnalysisAndTestData is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRelatedAnalysisAndTestData() {
        return (this.relatedAnalysisAndTestData!= null);
    }

/**
Get 

@return the SysRelationEssential value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getSysRelationEssential() {
        return sysRelationEssential;
    }

/**
Set 

@param value the SysRelationEssential value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setSysRelationEssential(MEMO value) {
        this.sysRelationEssential = value;
    }

/**
Determine if the SysRelationEssential is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSysRelationEssential() {
        return (this.sysRelationEssential!= null);
    }

/**
Get the telecommunications service priority applicable to a spectrum-dependent radiocommunications system intended to be used in direct support of a national emergency declared under Section 706 of the Communications Act of 1934, as amended.

@return the TSPR value in a {@link TS10} data type
@since 3.1.0
*/
public S10 getTSPR() {
        return tspr;
    }

/**
Set the telecommunications service priority applicable to a spectrum-dependent radiocommunications system intended to be used in direct support of a national emergency declared under Section 706 of the Communications Act of 1934, as amended.

@param value the TSPR value in a {@link TS10} data type
@since 3.1.0
*/
public void setTSPR(S10 value) {
        this.tspr = value;
    }

/**
Determine if the TSPR is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTSPR() {
        return (this.tspr!= null);
    }

/**
Get if the system is used in a wartime environment.

@return the WartimeUse value in a {@link TString} data type
@since 3.1.0
*/
public TString getWartimeUse() {
        return wartimeUse;
    }

/**
Set if the system is used in a wartime environment.

@param value the WartimeUse value in a {@link TString} data type
@since 3.1.0
*/
public void setWartimeUse(TString value) {
        this.wartimeUse = value;
    }

/**
Determine if the WartimeUse is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetWartimeUse() {
return (this.wartimeUse!= null ? this.wartimeUse.isSetValue() : false);
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
Get the current stage of the system.

@return  a {@link Stage} instance
@since 3.1.0
*/
    public Set<Stage> getStage() {
        if (stage == null) {
            stage = new HashSet<Stage>();
        }
        return this.stage;
    }

/**
Determine if the Stage is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStage() {
        return ((this.stage!= null)&&(!this.stage.isEmpty()));
    }

/**
  Clear the Stage field. This sets the field to null.
 */
    public void unsetStage() {
        this.stage = null;
    }

/**
Get the Nomenclature

Complex element Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

@return  a {@link Nomenclature} instance
@since 3.1.0
*/
    public Set<Nomenclature> getNomenclature() {
        if (nomenclature == null) {
            nomenclature = new HashSet<Nomenclature>();
        }
        return this.nomenclature;
    }

/**
Determine if the Nomenclature is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNomenclature() {
        return ((this.nomenclature!= null)&&(!this.nomenclature.isEmpty()));
    }

/**
  Clear the Nomenclature field. This sets the field to null.
 */
    public void unsetNomenclature() {
        this.nomenclature = null;
    }

/**
Get the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@return  a {@link POCInformation} instance
@since 3.1.0
*/
    public Set<POCInformation> getPOCInformation() {
        if (pocInformation == null) {
            pocInformation = new HashSet<POCInformation>();
        }
        return this.pocInformation;
    }

/**
Determine if the POCInformation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPOCInformation() {
        return ((this.pocInformation!= null)&&(!this.pocInformation.isEmpty()));
    }

/**
  Clear the POCInformation field. This sets the field to null.
 */
    public void unsetPOCInformation() {
        this.pocInformation = null;
    }

/**
Get the RelatedSupportability

Complex element RelatedSupportability refers to a SSRequest with which the current dataset has a dependency.

@return  a {@link RelatedSupportability} instance
@since 3.1.0
*/
    public Set<RelatedSupportability> getRelatedSupportability() {
        if (relatedSupportability == null) {
            relatedSupportability = new HashSet<RelatedSupportability>();
        }
        return this.relatedSupportability;
    }

/**
Determine if the RelatedSupportability is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRelatedSupportability() {
        return ((this.relatedSupportability!= null)&&(!this.relatedSupportability.isEmpty()));
    }

/**
  Clear the RelatedSupportability field. This sets the field to null.
 */
    public void unsetRelatedSupportability() {
        this.relatedSupportability = null;
    }

/**
Get the HostNation

Complex element HostNation indicates the host nations from which supportability is requested. If a SSRequest received by NATO has no HostNation entry, it will be assumed that this SSRequest is for all NATO Nations plus AUS and NZL (in accordance with the FMSC agreement).

@return  a {@link HostNation} instance
@since 3.1.0
*/
    public Set<HostNation> getHostNation() {
        if (hostNation == null) {
            hostNation = new HashSet<HostNation>();
        }
        return this.hostNation;
    }

/**
Determine if the HostNation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetHostNation() {
        return ((this.hostNation!= null)&&(!this.hostNation.isEmpty()));
    }

/**
  Clear the HostNation field. This sets the field to null.
 */
    public void unsetHostNation() {
        this.hostNation = null;
    }

/**
Get if the system is used in a wartime environment.

@return  a {@link Time} instance
@since 3.1.0
*/
    public Set<Time> getTime() {
        if (time == null) {
            time = new HashSet<Time>();
        }
        return this.time;
    }

/**
Determine if the Time is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTime() {
        return ((this.time!= null)&&(!this.time.isEmpty()));
    }

/**
  Clear the Time field. This sets the field to null.
 */
    public void unsetTime() {
        this.time = null;
    }

/**
Get the DiagramEndpoint

Complex element DiagramEndpoint defines an instance of an icon on the diagram.

@return  a {@link DiagramEndpoint} instance
@since 3.1.0
*/
    public Set<DiagramEndpoint> getDiagramEndpoint() {
        if (diagramEndpoint == null) {
            diagramEndpoint = new HashSet<DiagramEndpoint>();
        }
        return this.diagramEndpoint;
    }

/**
Determine if the DiagramEndpoint is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDiagramEndpoint() {
        return ((this.diagramEndpoint!= null)&&(!this.diagramEndpoint.isEmpty()));
    }

/**
  Clear the DiagramEndpoint field. This sets the field to null.
 */
    public void unsetDiagramEndpoint() {
        this.diagramEndpoint = null;
    }

/**
Get the DiagramLine

Complex element DiagramLine defines a line between two endpoints on the diagram.

@return  a {@link DiagramLine} instance
@since 3.1.0
*/
    public Set<DiagramLine> getDiagramLine() {
        if (diagramLine == null) {
            diagramLine = new HashSet<DiagramLine>();
        }
        return this.diagramLine;
    }

/**
Determine if the DiagramLine is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDiagramLine() {
        return ((this.diagramLine!= null)&&(!this.diagramLine.isEmpty()));
    }

/**
  Clear the DiagramLine field. This sets the field to null.
 */
    public void unsetDiagramLine() {
        this.diagramLine = null;
    }

/**
Get the Configuration

Complex element Configuration identifies each operational configuration that is required in a SSRequest, granted by a Host Nation in a SSReply, or authorised in a frequency Assignment or Allotment dataset. It also identifies the functional use of the assigned frequency at a particular transmitting station.

@return  a {@link Configuration} instance
@since 3.1.0
*/
    public Set<Configuration> getConfiguration() {
        if (configuration == null) {
            configuration = new HashSet<Configuration>();
        }
        return this.configuration;
    }

/**
Determine if the Configuration is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetConfiguration() {
        return ((this.configuration!= null)&&(!this.configuration.isEmpty()));
    }

/**
  Clear the Configuration field. This sets the field to null.
 */
    public void unsetConfiguration() {
        this.configuration = null;
    }

/**
Get the US:StatusLog

Complex element StatusLog (US) contains the transactional processing information related to spectrum supportability requests.

@return  a {@link StatusLog} instance
@since 3.1.0
*/
    public Set<StatusLog> getStatusLog() {
        if (statusLog == null) {
            statusLog = new HashSet<StatusLog>();
        }
        return this.statusLog;
    }

/**
Determine if the StatusLog is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStatusLog() {
        return ((this.statusLog!= null)&&(!this.statusLog.isEmpty()));
    }

/**
  Clear the StatusLog field. This sets the field to null.
 */
    public void unsetStatusLog() {
        this.statusLog = null;
    }

/**
Get the US:Trunking

Complex element Trunking (US) defines Radiotelephony using standard land mobile principles where multiple baseband signals are bounded within one physical channel.

@return the Trunking value in a {@link Trunking} data type
@since 3.1.0
*/
public Trunking getTrunking() {
        return trunking;
    }

/**
Set the US:Trunking

Complex element Trunking (US) defines Radiotelephony using standard land mobile principles where multiple baseband signals are bounded within one physical channel.

@param value the Trunking value in a {@link Trunking} data type
@since 3.1.0
*/
public void setTrunking(Trunking value) {
        this.trunking = value;
    }

/**
Determine if the Trunking is configured.

If configured this method also inspects the {@link Trunking} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTrunking() {
        return (this.trunking!= null);
    }

/**
Set the title of the Spectrum Supportability application. Each application title should be unique.

@param value  An instances of type {@link TS100}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withTitle(TS100 value) {
        return this;
    }

/**
Set the current stage of the system.

@param value  An instances of type {@link ListCSG}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withCurrentStage(ListCSG value) {
           setCurrentStage(new TString(value.value()));
        return this;
    }

/**
Set a description of the types and forms of information to be transmitted or received. The requirement should describe:
- The general purpose of the system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft system to protect fixed facilities);
- Each significant capability of the system (e.g., in the PATRIOT system: search, acquisition and tracking radar, TT&C, C2 links, etc);
- Any related supportability documents should be listed in the ExtReferenceRef element.

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withRequirement(String value) {
           setRequirement(new MEMO(value));
        return this;
    }

/**
Set "Yes" if the system may be used in a case of emergency.

@param value  An instances of type {@link ListCBO}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withEmergency(ListCBO value) {
           setEmergency(new TString(value.value()));
        return this;
    }

/**
Set the number of mobile units. These units do not necessarily operate simultaneously in the same electromagnetic environment.

@param value  An instances of type {@link Integer}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withNumMobileUnits(Integer value) {
           setNumMobileUnits(new UN9(value));
        return this;
    }

/**
Set the maximum number of units (equipment) that will be operating simultaneously in the same area of operation. An area is generally defined as a country. enter the number of land mobile stations, ship stations, and transportable stations associated with the current Assignment or SSRequest dataset. Within an Assignment (but not under SSRequest), the number entered shall represent either the exact number of stations or a range of numbers as follows:
Number of Stations Enter
1-10  10
11-30  30
31-100  100
101-300  300
301-1000  1000
1001-3000  3000
3001-10000  10000
Above 10000  Nearest 10000
If the exact number is to be recorded, and it is 10, 30, 100, 300, 1000, 3000, or a multiple of 10000, add one to the number to distinguish it from a figure that represents a range of numbers.

@param value  An instances of type {@link Integer}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withNumAreaUnits(Integer value) {
           setNumAreaUnits(new UN9(value));
        return this;
    }

/**
Set the maximum number of units (equipment) that will be operating simultaneously in the same cosite environment. A cosite situation occurs when several antennas are within the near field of each other.

@param value  An instances of type {@link Integer}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withNumCositedUnits(Integer value) {
           setNumCositedUnits(new UN9(value));
        return this;
    }

/**
Set the date on which the application will be submitted to the appropriate spectrum management office.

@param value  An instances of type {@link Calendar}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withApplicationDate(Calendar value) {
           setApplicationDate(new D(value));
        return this;
    }
/**
Set the date on which the application will be submitted to the appropriate spectrum management office.

@param value  An instances of type {@link Date}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withApplicationDate(Date value) {
           setApplicationDate(new D(value));
        return this;
    }

/**
Set the date by which the frequency assignment or Spectrum Supportability Reply is required by the user in order to complete necessary advanced operation coordination.

@param value  An instances of type {@link Calendar}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withDateResponseRequired(Calendar value) {
           setDateResponseRequired(new D(value));
        return this;
    }
/**
Set the date by which the frequency assignment or Spectrum Supportability Reply is required by the user in order to complete necessary advanced operation coordination.

@param value  An instances of type {@link Date}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withDateResponseRequired(Date value) {
           setDateResponseRequired(new D(value));
        return this;
    }

/**
Set the name of the systems that are likely to be replaced by this system.

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withReplacementInfo(String value) {
           setReplacementInfo(new MEMO(value));
        return this;
    }

/**
Set the application Spectrum Planning Subcommittee (SPS) document identifier assigned by NTIA. This is not the same as the Certification of Spectrum Support SPS number.

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withApplicationSPSNumber(String value) {
           setApplicationSPSNumber(new S11(value));
        return this;
    }

/**
Set the US Military Communications-Electronics Board (MCEB) identifier assigned to the equipment or system. (e.g., J/F  12/12345).  An SSRequest coordination number usually ends with an even digit (e.g., /2, /4), while an SSReply coordination number usually ends with an odd digit (e.g., /3, /5).  When certifying equipment, both SSRequest and SSReply SHOULD have a coordination number.

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withCoordinationNum(String value) {
           setCoordinationNum(new S15(value));
        return this;
    }

/**
Set the required character rates, data rates, and circuit quality/reliability of the system.

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withInfoTransferRequirement(String value) {
           setInfoTransferRequirement(new MEMO(value));
        return this;
    }

/**
Set the estimated initial cost, in US dollars, of the system/equipment.

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withInitialCost(String value) {
           setInitialCost(new S70(value));
        return this;
    }

/**
Set the explanation of how the estimated initial cost for the system was calculated.

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withInitialCostDesc(String value) {
           setInitialCostDesc(new MEMO(value));
        return this;
    }

/**
Set if this is a satellite system that is exempt from submitting notification to the Radiocommunication Bureau.

@param value  An instances of type {@link ListCBO}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withITUWaiver(ListCBO value) {
           setITUWaiver(new TString(value.value()));
        return this;
    }

/**
Set if this application requires coordination with the National Authority for approval. For US records, the National Authority is NTIA and this should be Yes, unless the record does not require coordination with NTIA for approval.

@param value  An instances of type {@link ListCBO}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withNTIACoordinationRequired(ListCBO value) {
           setNTIACoordinationRequired(new TString(value.value()));
        return this;
    }

/**
Set the Space and terrestrial information as defined by section 10.8 of the NTIA Manual and not captured in other more specific data fields.

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withNTIASpaceData(String value) {
           setNTIASpaceData(new MEMO(value));
        return this;
    }

/**
Set if the system is intended for the DoD operational inventory.

@param value  An instances of type {@link ListCBO}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withOperInvIntent(ListCBO value) {
           setOperInvIntent(new TString(value.value()));
        return this;
    }

/**
Set the agency that originated the application.

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withOriginatingAgency(String value) {
           setOriginatingAgency(new S80(value));
        return this;
    }

/**
Set the request type. Possible values may include, but are not limited to, DoD Certification, NTIA Certification, and Foreign Coordination.

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withRequestType(String value) {
           setRequestType(new S50(value));
        return this;
    }

/**
Set In Data Item RelatedAnalysisAndTestData (US), describe electromagnetic compatibility studies, testing or analyses relevant to this system, including documents currently in progress. Use the ExtReference attribute of this element as appropriate.

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withRelatedAnalysisAndTestData(String value) {
           setRelatedAnalysisAndTestData(new MEMO(value));
        return this;
    }

/**
Set 

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withSysRelationEssential(String value) {
           setSysRelationEssential(new MEMO(value));
        return this;
    }

/**
Set the telecommunications service priority applicable to a spectrum-dependent radiocommunications system intended to be used in direct support of a national emergency declared under Section 706 of the Communications Act of 1934, as amended.

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withTSPR(String value) {
           setTSPR(new S10(value));
        return this;
    }

/**
Set if the system is used in a wartime environment.

@param value  An instances of type {@link ListCBO}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withWartimeUse(ListCBO value) {
           setWartimeUse(new TString(value.value()));
        return this;
    }

/**
Set the Project

Complex element Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other project name associated to the dataset.

@param values  One or more instances of type {@link Project...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withProject(Project... values) {
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
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withProject(Collection<Project> values) {
        if (values!= null) {
            getProject().addAll(values);
        }
        return this;
    }

/**
Set the current stage of the system.

@param values  One or more instances of type {@link Stage...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withStage(Stage... values) {
        if (values!= null) {
            for (Stage value: values) {
                getStage().add(value);
            }
        }
        return this;
    }

/**
Set the current stage of the system.

@param values  A collection of {@link Stage} instances
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withStage(Collection<Stage> values) {
        if (values!= null) {
            getStage().addAll(values);
        }
        return this;
    }

/**
Set the Nomenclature

Complex element Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

@param values  One or more instances of type {@link Nomenclature...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withNomenclature(Nomenclature... values) {
        if (values!= null) {
            for (Nomenclature value: values) {
                getNomenclature().add(value);
            }
        }
        return this;
    }

/**
Set the Nomenclature

Complex element Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

@param values  A collection of {@link Nomenclature} instances
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withNomenclature(Collection<Nomenclature> values) {
        if (values!= null) {
            getNomenclature().addAll(values);
        }
        return this;
    }

/**
Set the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@param values  One or more instances of type {@link POCInformation...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withPOCInformation(POCInformation... values) {
        if (values!= null) {
            for (POCInformation value: values) {
                getPOCInformation().add(value);
            }
        }
        return this;
    }

/**
Set the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@param values  A collection of {@link POCInformation} instances
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withPOCInformation(Collection<POCInformation> values) {
        if (values!= null) {
            getPOCInformation().addAll(values);
        }
        return this;
    }

/**
Set the RelatedSupportability

Complex element RelatedSupportability refers to a SSRequest with which the current dataset has a dependency.

@param values  One or more instances of type {@link RelatedSupportability...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withRelatedSupportability(RelatedSupportability... values) {
        if (values!= null) {
            for (RelatedSupportability value: values) {
                getRelatedSupportability().add(value);
            }
        }
        return this;
    }

/**
Set the RelatedSupportability

Complex element RelatedSupportability refers to a SSRequest with which the current dataset has a dependency.

@param values  A collection of {@link RelatedSupportability} instances
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withRelatedSupportability(Collection<RelatedSupportability> values) {
        if (values!= null) {
            getRelatedSupportability().addAll(values);
        }
        return this;
    }

/**
Set the HostNation

Complex element HostNation indicates the host nations from which supportability is requested. If a SSRequest received by NATO has no HostNation entry, it will be assumed that this SSRequest is for all NATO Nations plus AUS and NZL (in accordance with the FMSC agreement).

@param values  One or more instances of type {@link HostNation...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withHostNation(HostNation... values) {
        if (values!= null) {
            for (HostNation value: values) {
                getHostNation().add(value);
            }
        }
        return this;
    }

/**
Set the HostNation

Complex element HostNation indicates the host nations from which supportability is requested. If a SSRequest received by NATO has no HostNation entry, it will be assumed that this SSRequest is for all NATO Nations plus AUS and NZL (in accordance with the FMSC agreement).

@param values  A collection of {@link HostNation} instances
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withHostNation(Collection<HostNation> values) {
        if (values!= null) {
            getHostNation().addAll(values);
        }
        return this;
    }

/**
Set if the system is used in a wartime environment.

@param values  One or more instances of type {@link Time...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withTime(Time... values) {
        if (values!= null) {
            for (Time value: values) {
                getTime().add(value);
            }
        }
        return this;
    }

/**
Set if the system is used in a wartime environment.

@param values  A collection of {@link Time} instances
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withTime(Collection<Time> values) {
        if (values!= null) {
            getTime().addAll(values);
        }
        return this;
    }

/**
Set the DiagramEndpoint

Complex element DiagramEndpoint defines an instance of an icon on the diagram.

@param values  One or more instances of type {@link DiagramEndpoint...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withDiagramEndpoint(DiagramEndpoint... values) {
        if (values!= null) {
            for (DiagramEndpoint value: values) {
                getDiagramEndpoint().add(value);
            }
        }
        return this;
    }

/**
Set the DiagramEndpoint

Complex element DiagramEndpoint defines an instance of an icon on the diagram.

@param values  A collection of {@link DiagramEndpoint} instances
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withDiagramEndpoint(Collection<DiagramEndpoint> values) {
        if (values!= null) {
            getDiagramEndpoint().addAll(values);
        }
        return this;
    }

/**
Set the DiagramLine

Complex element DiagramLine defines a line between two endpoints on the diagram.

@param values  One or more instances of type {@link DiagramLine...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withDiagramLine(DiagramLine... values) {
        if (values!= null) {
            for (DiagramLine value: values) {
                getDiagramLine().add(value);
            }
        }
        return this;
    }

/**
Set the DiagramLine

Complex element DiagramLine defines a line between two endpoints on the diagram.

@param values  A collection of {@link DiagramLine} instances
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withDiagramLine(Collection<DiagramLine> values) {
        if (values!= null) {
            getDiagramLine().addAll(values);
        }
        return this;
    }

/**
Set the Configuration

Complex element Configuration identifies each operational configuration that is required in a SSRequest, granted by a Host Nation in a SSReply, or authorised in a frequency Assignment or Allotment dataset. It also identifies the functional use of the assigned frequency at a particular transmitting station.

@param values  One or more instances of type {@link Configuration...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withConfiguration(Configuration... values) {
        if (values!= null) {
            for (Configuration value: values) {
                getConfiguration().add(value);
            }
        }
        return this;
    }

/**
Set the Configuration

Complex element Configuration identifies each operational configuration that is required in a SSRequest, granted by a Host Nation in a SSReply, or authorised in a frequency Assignment or Allotment dataset. It also identifies the functional use of the assigned frequency at a particular transmitting station.

@param values  A collection of {@link Configuration} instances
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withConfiguration(Collection<Configuration> values) {
        if (values!= null) {
            getConfiguration().addAll(values);
        }
        return this;
    }

/**
Set the US:StatusLog

Complex element StatusLog (US) contains the transactional processing information related to spectrum supportability requests.

@param values  One or more instances of type {@link StatusLog...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withStatusLog(StatusLog... values) {
        if (values!= null) {
            for (StatusLog value: values) {
                getStatusLog().add(value);
            }
        }
        return this;
    }

/**
Set the US:StatusLog

Complex element StatusLog (US) contains the transactional processing information related to spectrum supportability requests.

@param values  A collection of {@link StatusLog} instances
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withStatusLog(Collection<StatusLog> values) {
        if (values!= null) {
            getStatusLog().addAll(values);
        }
        return this;
    }

/**
Set the US:Trunking

Complex element Trunking (US) defines Radiotelephony using standard land mobile principles where multiple baseband signals are bounded within one physical channel.

@param value  An instances of type {@link Trunking}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withTrunking(Trunking value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withCaseNum(CaseNum... values) {
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
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withRemarks(Remarks... values) {
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
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withReleasability(ListCCY... values) {
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
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withRemarkRef(BigInteger... values) {
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
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withExtReferences(BigInteger... values) {
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
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current SSRequest object instance
@since 3.1.0
*/
    public SSRequest withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this SSRequest instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "SSRequest {"
 + (applicationDate !=null? " applicationDate [" + applicationDate +"]" : "") 
 + (applicationSPSNumber !=null? " applicationSPSNumber [" + applicationSPSNumber +"]" : "") 
 + (configuration !=null? " configuration [" + configuration +"]" : "") 
 + (coordinationNum !=null? " coordinationNum [" + coordinationNum +"]" : "") 
 + (currentStage !=null? " currentStage [" + currentStage +"]" : "") 
 + (dateResponseRequired !=null? " dateResponseRequired [" + dateResponseRequired +"]" : "") 
 + (diagramEndpoint !=null? " diagramEndpoint [" + diagramEndpoint +"]" : "") 
 + (diagramLine !=null? " diagramLine [" + diagramLine +"]" : "") 
 + (emergency !=null? " emergency [" + emergency +"]" : "") 
 + (hostNation !=null? " hostNation [" + hostNation +"]" : "") 
 + (infoTransferRequirement !=null? " infoTransferRequirement [" + infoTransferRequirement +"]" : "") 
 + (initialCost !=null? " initialCost [" + initialCost +"]" : "") 
 + (initialCostDesc !=null? " initialCostDesc [" + initialCostDesc +"]" : "") 
 + (ituWaiver !=null? " ituWaiver [" + ituWaiver +"]" : "") 
 + (nomenclature !=null? " nomenclature [" + nomenclature +"]" : "") 
 + (ntiaCoordinationRequired !=null? " ntiaCoordinationRequired [" + ntiaCoordinationRequired +"]" : "") 
 + (ntiaSpaceData !=null? " ntiaSpaceData [" + ntiaSpaceData +"]" : "") 
 + (numAreaUnits !=null? " numAreaUnits [" + numAreaUnits +"]" : "") 
 + (numCositedUnits !=null? " numCositedUnits [" + numCositedUnits +"]" : "") 
 + (numMobileUnits !=null? " numMobileUnits [" + numMobileUnits +"]" : "") 
 + (operInvIntent !=null? " operInvIntent [" + operInvIntent +"]" : "") 
 + (originatingAgency !=null? " originatingAgency [" + originatingAgency +"]" : "") 
 + (pocInformation !=null? " pocInformation [" + pocInformation +"]" : "") 
 + (project !=null? " project [" + project +"]" : "") 
 + (relatedAnalysisAndTestData !=null? " relatedAnalysisAndTestData [" + relatedAnalysisAndTestData +"]" : "") 
 + (relatedSupportability !=null? " relatedSupportability [" + relatedSupportability +"]" : "") 
 + (replacementInfo !=null? " replacementInfo [" + replacementInfo +"]" : "") 
 + (requestType !=null? " requestType [" + requestType +"]" : "") 
 + (requirement !=null? " requirement [" + requirement +"]" : "") 
 + (stage !=null? " stage [" + stage +"]" : "") 
 + (statusLog !=null? " statusLog [" + statusLog +"]" : "") 
 + (sysRelationEssential !=null? " sysRelationEssential [" + sysRelationEssential +"]" : "") 
 + (time !=null? " time [" + time +"]" : "") 
 + (title !=null? " title [" + title +"]" : "") 
 + (trunking !=null? " trunking [" + trunking +"]" : "") 
 + (tspr !=null? " tspr [" + tspr +"]" : "") 
 + (wartimeUse !=null? " wartimeUse [" + wartimeUse +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link SSRequest} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link S100 Title}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetTitle();
}

}
