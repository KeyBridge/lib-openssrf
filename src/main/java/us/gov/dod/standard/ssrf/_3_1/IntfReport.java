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
IntfReport contains information on a source and victim of an interference incident.

Sub-Element is {@link POCInformation}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntfReport", propOrder = {
    "helpRequired",
    "intfPeriod",
    "intfStartDateTime",
    "intfStopDateTime",
    "intfDescr",
    "affectedEquipment",
    "sourceFieldStrength",
    "sourceLon",
    "sourceLat",
    "sourceAz",
    "sourceLocDescr",
    "sourceFreqMin",
    "sourceFreqMax",
    "sourceEmsClass",
    "sourceEmsBw",
    "victimAsgnRef",
    "victimSystem",
    "victimCountry",
    "victimLon",
    "victimLat",
    "victimLocDescr",
    "victimFreqMin",
    "victimFreqMax",
    "satelliteName",
    "satelliteChannel",
    "satelliteUplinkFreq",
    "performanceEffects",
    "evaluation",
    "solution",
    "affectedCSA",
    "characteristics",
    "gpsAffected",
    "localEventID",
    "netCircuitsAffected",
    "netsAffected",
    "satcomPriority",
    "satelliteAffected",
    "satelliteDownlinkPolarisation",
    "satelliteHemisphere",
    "satelliteLongitude",
    "satelliteTransponderID",
    "satelliteUplinkPolarisation",
    "pocInformation"
})
public class IntfReport
    extends Common
{

/**
HelpRequired  - Help Required (Optional) 

Whether the user needs technical assistance from another organisation to solve the interference. If not used, consider as "No".

Format is L:CBO 
@since 3.1.0
*/
    @XmlElement(name = "HelpRequired", required = false)
    private TString helpRequired;
/**
IntfPeriod  - Interference Period (Optional) 

How often the interference is experienced.

Format is L:CTI 
@since 3.1.0
*/
    @XmlElement(name = "IntfPeriod", required = false)
    private TString intfPeriod;
/**
IntfStartDateTime  - Interference Start Date/Time (Required) 

The date/time the interference was first perceived.

Format is DT
@since 3.1.0
*/
    @XmlElement(name = "IntfStartDateTime", required = true)
      private  DT intfStartDateTime;
/**
IntfStopDateTime  - Interference Stop Date/Time (Optional) 

The date/time the interference ceased.

Format is DT
@since 3.1.0
*/
    @XmlElement(name = "IntfStopDateTime", required = false)
    private DT intfStopDateTime;
/**
In Data Item IntfDescr, describe the interference. Provide as much information as possible. State what actions you have
taken so far to resolve the interference.
@since 3.1.0
*/
    @XmlElement(name = "IntfDescr", required = false)
    private MEMO intfDescr;
/**
AffectedEquipment  - Victim Equipment Description (Optional) 

The nomenclature or description of equipment experiencing the interference.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "AffectedEquipment", required = false)
    private S100 affectedEquipment;
/**
SourceFieldStrength  - Field Strength (Optional) 

The measured electromagnetic field strength.

Format is UN(6,1) (dB)
@since 3.1.0
*/
    @XmlElement(name = "SourceFieldStrength", required = false)
    private FieldStrength sourceFieldStrength;
/**
SourceLon  - Longitude of the Source (Optional) 

The geographical longitude (degrees, minutes, seconds, and hemisphere E or W) of the source of the interference. If the seconds are not known, use 00. Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees longitude require three digits. Seconds may have a decimal point followed by up to two decimals. Enter E or W immediately following the seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or W).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5]
[0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"

Format is pattern (S11)
@since 3.1.0
*/
    @XmlElement(name = "SourceLon", required = false)
    private Lon sourceLon;
/**
SourceLat  - Latitude of the Source (Optional) 

The geographical latitude (degrees, minutes, seconds and  hemisphere N or S) of the source of the interference. Same remarks for seconds and leading zeros. Enter N or S immediately following the seconds. The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"

Format is pattern (S10)
@since 3.1.0
*/
    @XmlElement(name = "SourceLat", required = false)
    private Lat sourceLat;
/**
SourceAz  - Source Azimuth (Optional) 

The measured azimuth of the source from the victim.

Format is UN(5,2) [0..360] (deg)
@since 3.1.0
*/
    @XmlElement(name = "SourceAz", required = false)
    private Az sourceAz;
/**
SourceLocDescr  - Location Description of the Source (Optional) 

The approximate position the source, if exact coordinates are not known.

Format is S255
@since 3.1.0
*/
    @XmlElement(name = "SourceLocDescr", required = false)
    private S255 sourceLocDescr;
/**
SourceFreqMin  - Minimum Source Frequency (Optional) 

The nominal frequency of the interference, or the minimum frequency in case of a range.

Format is UN(16,9) 
[0..1.0E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "SourceFreqMin", required = false)
    private FreqM sourceFreqMin;
/**
SourceFreqMax  - Maximum Source Frequency (Optional) 

The maximum frequency of the interference, in case of a range.

Format is UN(16,9) 
[0..1.0E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "SourceFreqMax", required = false)
    private FreqM sourceFreqMax;
/**
In Data Item SourceEmsClass, In Data Item EmsClass, enter a three to five characters code, derived from the table below, representing the emission classification. If an "X" is used in any of the symbols, Remarks SHOULD be used to explain the nature of the signal.
First Symbol - Designates Type of Modulation of the Main Carrier
Unmodulated
N - Emission of unmodulated carrier
Amplitude Modulated
A - Double sideband
H - Single sideband, full carrier
R - Single sideband, reduced or variable level carrier
J - Single sideband, suppressed carrier
B - Independent sidebands
C - Vestigial sidebands
Angle-Modulated
F - Frequency modulation
G - Phase modulation
Amplitude and Angle-Modulated
D - Main carrier is amplitude-modulated and angle-modulated simultaneously or in a preestablished sequence
Pulse
P - Sequence of unmodulated pulses
K - Modulated in amplitude
L - Modulated in width/duration
M - Modulated in position phase
Q - Carrier is angle-modulated during the period of the pulse
V - Combination of the foregoing or is produced by other means
Combination
W - Cases not covered above in which an emission consists of the main carrier being modulated, either
simultaneously or in a preestablished sequence, in a combination of two or more of the following modes:
amplitude, angle, pulse
Other
X - Cases not otherwise covered
- : Unknown (to be used only by legacy data)
Second Symbol - Designates the Nature of Signal(s) Modulating the Main Carrier
0 - No modulating signal
1 - A single channel containing quantised or digital information, not using a modulating subcarrier. (Excludes
time-division multiplex)
2 - A single channel containing quantised or digital information, using a modulating subcarrier
3 - A single channel containing analogue information
7 - Two or more channels containing quantised or digital information
8 - Two or more channels containing analogue information
9 - Composite system with one or more channels containing quantised or digital information, together with one
or more channels containing analogue information
X - Cases not otherwise covered
- : Unknown (to be used only by legacy data)
Third Symbol - Type of Information to be Transmitted a
N - No information transmitted
A - Telegraphy - for aural reception
B - Telegraphy - for automatic reception
C - Facsimile
D - Data transmission, telemetry, telecommand
E - Telephony (including sound broadcasting)
F - Television (video)
W - Combination of the above
X - Cases not otherwise covered.
- : Unknown (to be used only by legacy data)
a In this context, the word "information" does not include information of a constant, unvarying, nature such as that provided by standard frequency emissions, continuous wave, pulse radars, etc.
b A full explanation for the selection of the letter X shall be provided in Information unless the application is for a non-directional beacon in the bands 190-435 and 510-535 kHz.
Fourth Symbol - Designates the Details of Signal(s)
A - Two-condition code with elements of differing numbers and/or durations
B - Two-condition code with elements of the same number and duration without error correction
C - Two-condition code with elements of the same number and duration with error correction
D - Four-condition code in which each condition represents a signal element of one or more bits
E - Multi-condition code in which each condition represents a signal element of one or more bits
F - Multi-condition code in which each condition or combination of conditions represents a character
G - Sound of broadcasting quality (monophonic)
H - Sound of broadcasting quality (stereophonic or quadraphonic)
J - Sound of commercial quality (excluding categories defined for symbol K and L below)
K - Sound of commercial quality with the use of frequency inversion or band splitting
L - Sound of commercial quality with separate frequency modulated signals to control the level of demodulated signal
M - Monochrome
N - Color
W - Combination of the above
X - Cases not otherwise covered
Fifth Symbol - Designates the Nature of Multiplexing
N - None
C - Code-division multiplex (includes bandwidth expansion techniques)
F - Frequency-division multiplex
T - Time-division multiplex
W - Combination of frequency-division multiplex and time-division multiplex
X - Other types of multiplexing

[XSD ERR REGEX] This data item MUST comply to the regular expression: "(A|B|C|D|F|G|H|J|K|L|M|N|P|Q|R|V|
W|X|-)(0|1|2|3|7|8|9|X|-)(A|B|C|D|E|F|N|W|X|-)(A|B|C|D|E|F|G|H|J|K|L|M|N|W|X)?(C|F|N|T|W|X)?"
@since 3.1.0
*/
    @XmlElement(name = "SourceEmsClass", required = false)
    private EmsDes sourceEmsClass;
/**
SourceEmsBw  - Emission Bandwidth of the interference
source (Optional) 

The calculated or measured bandwidth of the interference source.

Format is UN(16,9) 
[0..1.0E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "SourceEmsBw", required = false)
    private FreqM sourceEmsBw;
/**
In Data Item VictimAsgnRef, Enter the serial number of the assignment victim of the interference.

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
@since 3.1.0
*/
    @XmlElement(name = "VictimAsgnRef", required = false)
    private Serial victimAsgnRef;
/**
VictimSystem  - Victim System (Optional) 

The nomenclature or other identifier of equipment experiencing the interference.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "VictimSystem", required = false)
    private S100 victimSystem;
/**
VictimCountry  - Country/Area of the Victim (Optional) 

The country or area where the victim of the interference is located.

Format is L:CAO 
@since 3.1.0
*/
    @XmlElement(name = "VictimCountry", required = false)
    private TString victimCountry;
/**
VictimLon  - Longitude of the Victim (Optional) 

The geographical longitude (degrees, minutes, seconds, and hemisphere E or W) of the 
victim of the interference. If the seconds are not known, use 00. Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees longitude require three digits. Seconds may have a decimal point followed by up to two decimals. Enter E or W immediately following the seconds. The format is: dddmmss.hhH (where ".hh" is 
optional and H = E or W).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"

Format is pattern (S11)
@since 3.1.0
*/
    @XmlElement(name = "VictimLon", required = false)
    private Lon victimLon;
/**
VictimLat  - Latitude of the Victim (Optional) 

The geographical latitude (degrees, minutes, seconds and hemisphere N or S) of the victim of the interference. Same remarks for seconds and leading zeros. Enter N or S immediately following the seconds.  The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"

Format is pattern (S10)
@since 3.1.0
*/
    @XmlElement(name = "VictimLat", required = false)
    private Lat victimLat;
/**
VictimLocDescr  - Location Description of the Victim (Optional) 

The approximate position the victim of the interference, if exact coordinates are not known.

Format is S255
@since 3.1.0
*/
    @XmlElement(name = "VictimLocDescr", required = false)
    private S255 victimLocDescr;
/**
VictimFreqMin  - Minimum Victim Frequency (Required) 

The nominal or lower frequency used by the victim of the interference.

Format is UN(16,9) 
[0..1.0E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "VictimFreqMin", required = true)
      private  FreqM victimFreqMin;
/**
VictimFreqMax  - Maximum Victim Frequency (Optional) 

The upper frequency of the range, in case of an assignment over a frequency range.

Format is UN(16,9) 
[0..1.0E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "VictimFreqMax", required = false)
    private FreqM victimFreqMax;
/**
SatelliteName  - Victim Satellite Name (Optional) 

The name of the satellite experiencing the interference.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "SatelliteName", required = false)
    private S50 satelliteName;
/**
SatelliteChannel  - Victim Satellite Channel (Optional) 

The identifier of satellite channel experiencing the interference.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "SatelliteChannel", required = false)
    private S50 satelliteChannel;
/**
SatelliteUplinkFreq  - Victim Satellite Uplink Freq (Optional) 

The satellite uplink frequency experiencing the interference

Format is UN(16,9) 
[0..1.0E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "SatelliteUplinkFreq", required = false)
    private FreqM satelliteUplinkFreq;
/**
PerformanceEffects  - Effects On Performance (Optional) 

The effect the interference has on normal operations.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "PerformanceEffects", required = false)
    private MEMO performanceEffects;
/**
Evaluation  - Evaluation  (Optional) 

Your best guess as to the cause of the interference.

Format is L:CJ1 
@since 3.1.0
*/
    @XmlElement(name = "Evaluation", required = false)
    private TString evaluation;
/**
Solution  - Description of the Solution (Optional) 

What actions were taken to resolve the interference.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "Solution", required = false)
    private MEMO solution;
/**
US:AffectedCSA  - Affected CSA (Optional) 

The responsible Combatant Commander for the geographic area where the interference occurred and/or the victim's organization.

Format is L:UAG 
@since 3.1.0
*/
    @XmlElement(name = "AffectedCSA", required = false)
    private TString affectedCSA;
/**
US:Characteristics  - Characteristics (Optional) 

The interference characteristics.

Format is L:UCH 
@since 3.1.0
*/
    @XmlElement(name = "Characteristics", required = false)
    private TString characteristics;
/**
US:GPSAffected  - GPS Affected (Optional) 

Whether the interference affects GPS reception.

Format is L:CBO 
@since 3.1.0
*/
    @XmlElement(name = "GPSAffected", required = false)
    private TString gpsAffected;
/**
US:LocalEventID  - Local Event ID (Optional) 

The local event ID.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "LocalEventID", required = false)
    private S20 localEventID;
/**
US:NetCircuitsAffected  - Net Circuits Affected (Optional) 

The network circuits affected by the interference.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "NetCircuitsAffected", required = false)
    private MEMO netCircuitsAffected;
/**
US:NetsAffected  - Nets Affected (Optional) 

The networks affected by the interference.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "NetsAffected", required = false)
    private MEMO netsAffected;
/**
US:SATCOMPriority  - SATCOM Priority (Optional) 

The satellite communication priority.

Format is L:UPR 
@since 3.1.0
*/
    @XmlElement(name = "SATCOMPriority", required = false)
    private TString satcomPriority;
/**
US:SatelliteAffected  - Satellite Affected (Optional) 

Whether the interference affects satellite reception.

Format is L:CBO 
@since 3.1.0
*/
    @XmlElement(name = "SatelliteAffected", required = false)
    private TString satelliteAffected;
/**
US:SatelliteDownlinkPolarisation  - Satellite Downlink Polarisation (Optional) 

The polarisation of the satellite downlink signal.

Format is L:CPO 
@since 3.1.0
*/
    @XmlElement(name = "SatelliteDownlinkPolarisation", required = false)
    private TString satelliteDownlinkPolarisation;
/**
US:SatelliteHemisphere  - Satellite Hemisphere (Optional) 

The satellite hemisphere.

Format is L:CCO 
@since 3.1.0
*/
    @XmlElement(name = "SatelliteHemisphere", required = false)
    private TString satelliteHemisphere;
/**
US:SatelliteLongitude  - Satellite Longitude (Optional) 

The satellite longitude.

[XSD ERR REGEX] This data item MUST comply to the regular expression: "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1 (US),2})?)|1800000)(E|W))|X"

Format is pattern (S11)
@since 3.1.0
*/
    @XmlElement(name = "SatelliteLongitude", required = false)
    private Lon satelliteLongitude;
/**
US:SatelliteTransponderID  - Satellite Transponder ID (Optional) 

The satellite transponder ID.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "SatelliteTransponderID", required = false)
    private S50 satelliteTransponderID;
/**
US:SatelliteUplinkPolarisation  - Satellite Uplink Polarisation (Optional) 

The polarisation of the satellite uplink signal.

Format is L:CPO 
@since 3.1.0
*/
    @XmlElement(name = "SatelliteUplinkPolarisation", required = false)
    private TString satelliteUplinkPolarisation;
/**
POCInformation (Optional)

POCInformation contains a reference to a Contact, Organisation or Role dataset.
@since 3.1.0
*/
    @XmlElement(name = "POCInformation")
      private  Set<POCInformation> pocInformation;

/**
Get whether the user needs technical assistance from another organisation to solve the interference. If not used, consider as "No".

@return the HelpRequired value in a {@link TString} data type
@since 3.1.0
*/
public TString getHelpRequired() {
        return helpRequired;
    }

/**
Set whether the user needs technical assistance from another organisation to solve the interference. If not used, consider as "No".

@param value the HelpRequired value in a {@link TString} data type
@since 3.1.0
*/
public void setHelpRequired(TString value) {
        this.helpRequired = value;
    }

/**
Determine if the HelpRequired is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetHelpRequired() {
return (this.helpRequired!= null ? this.helpRequired.isSetValue() : false);
    }

/**
Get how often the interference is experienced.

@return the IntfPeriod value in a {@link TString} data type
@since 3.1.0
*/
public TString getIntfPeriod() {
        return intfPeriod;
    }

/**
Set how often the interference is experienced.

@param value the IntfPeriod value in a {@link TString} data type
@since 3.1.0
*/
public void setIntfPeriod(TString value) {
        this.intfPeriod = value;
    }

/**
Determine if the IntfPeriod is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIntfPeriod() {
return (this.intfPeriod!= null ? this.intfPeriod.isSetValue() : false);
    }

/**
Get the date/time the interference was first perceived.

@return the IntfStartDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public DT getIntfStartDateTime() {
        return intfStartDateTime;
    }

/**
Set the date/time the interference was first perceived.

@param value the IntfStartDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public void setIntfStartDateTime(DT value) {
        this.intfStartDateTime = value;
    }

/**
Determine if the IntfStartDateTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIntfStartDateTime() {
        return (this.intfStartDateTime!= null);
    }

/**
Get the date/time the interference ceased.

@return the IntfStopDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public DT getIntfStopDateTime() {
        return intfStopDateTime;
    }

/**
Set the date/time the interference ceased.

@param value the IntfStopDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public void setIntfStopDateTime(DT value) {
        this.intfStopDateTime = value;
    }

/**
Determine if the IntfStopDateTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIntfStopDateTime() {
        return (this.intfStopDateTime!= null);
    }

/**
Get In Data Item IntfDescr, describe the interference. Provide as much information as possible. State what actions you have
taken so far to resolve the interference.

@return the IntfDescr value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getIntfDescr() {
        return intfDescr;
    }

/**
Set In Data Item IntfDescr, describe the interference. Provide as much information as possible. State what actions you have
taken so far to resolve the interference.

@param value the IntfDescr value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setIntfDescr(MEMO value) {
        this.intfDescr = value;
    }

/**
Determine if the IntfDescr is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIntfDescr() {
        return (this.intfDescr!= null);
    }

/**
Get the nomenclature or description of equipment experiencing the interference.

@return the AffectedEquipment value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getAffectedEquipment() {
        return affectedEquipment;
    }

/**
Set the nomenclature or description of equipment experiencing the interference.

@param value the AffectedEquipment value in a {@link TS100} data type
@since 3.1.0
*/
public void setAffectedEquipment(S100 value) {
        this.affectedEquipment = value;
    }

/**
Determine if the AffectedEquipment is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAffectedEquipment() {
        return (this.affectedEquipment!= null);
    }

/**
Get the measured electromagnetic field strength.

@return the SourceFieldStrength value in a {@link TFieldStrength} data type
@since 3.1.0
*/
public FieldStrength getSourceFieldStrength() {
        return sourceFieldStrength;
    }

/**
Set the measured electromagnetic field strength.

@param value the SourceFieldStrength value in a {@link TFieldStrength} data type
@since 3.1.0
*/
public void setSourceFieldStrength(FieldStrength value) {
        this.sourceFieldStrength = value;
    }

/**
Determine if the SourceFieldStrength is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSourceFieldStrength() {
        return (this.sourceFieldStrength!= null);
    }

/**
Get the geographical longitude (degrees, minutes, seconds, and hemisphere E or W) of the source of the interference. If the seconds are not known, use 00. Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees longitude require three digits. Seconds may have a decimal point followed by up to two decimals. Enter E or W immediately following the seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or W).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5]
[0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"

@return the SourceLon value in a {@link TLon} data type
@since 3.1.0
*/
public Lon getSourceLon() {
        return sourceLon;
    }

/**
Set the geographical longitude (degrees, minutes, seconds, and hemisphere E or W) of the source of the interference. If the seconds are not known, use 00. Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees longitude require three digits. Seconds may have a decimal point followed by up to two decimals. Enter E or W immediately following the seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or W).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5]
[0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"

@param value the SourceLon value in a {@link TLon} data type
@since 3.1.0
*/
public void setSourceLon(Lon value) {
        this.sourceLon = value;
    }

/**
Determine if the SourceLon is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSourceLon() {
        return (this.sourceLon!= null);
    }

/**
Get the geographical latitude (degrees, minutes, seconds and  hemisphere N or S) of the source of the interference. Same remarks for seconds and leading zeros. Enter N or S immediately following the seconds. The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"

@return the SourceLat value in a {@link TLat} data type
@since 3.1.0
*/
public Lat getSourceLat() {
        return sourceLat;
    }

/**
Set the geographical latitude (degrees, minutes, seconds and  hemisphere N or S) of the source of the interference. Same remarks for seconds and leading zeros. Enter N or S immediately following the seconds. The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"

@param value the SourceLat value in a {@link TLat} data type
@since 3.1.0
*/
public void setSourceLat(Lat value) {
        this.sourceLat = value;
    }

/**
Determine if the SourceLat is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSourceLat() {
        return (this.sourceLat!= null);
    }

/**
Get the measured azimuth of the source from the victim.

@return the SourceAz value in a {@link TAz} data type
@since 3.1.0
*/
public Az getSourceAz() {
        return sourceAz;
    }

/**
Set the measured azimuth of the source from the victim.

@param value the SourceAz value in a {@link TAz} data type
@since 3.1.0
*/
public void setSourceAz(Az value) {
        this.sourceAz = value;
    }

/**
Determine if the SourceAz is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSourceAz() {
        return (this.sourceAz!= null);
    }

/**
Get the approximate position the source, if exact coordinates are not known.

@return the SourceLocDescr value in a {@link TS255} data type
@since 3.1.0
*/
public S255 getSourceLocDescr() {
        return sourceLocDescr;
    }

/**
Set the approximate position the source, if exact coordinates are not known.

@param value the SourceLocDescr value in a {@link TS255} data type
@since 3.1.0
*/
public void setSourceLocDescr(S255 value) {
        this.sourceLocDescr = value;
    }

/**
Determine if the SourceLocDescr is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSourceLocDescr() {
        return (this.sourceLocDescr!= null);
    }

/**
Get the nominal frequency of the interference, or the minimum frequency in case of a range.

@return the SourceFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getSourceFreqMin() {
        return sourceFreqMin;
    }

/**
Set the nominal frequency of the interference, or the minimum frequency in case of a range.

@param value the SourceFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setSourceFreqMin(FreqM value) {
        this.sourceFreqMin = value;
    }

/**
Determine if the SourceFreqMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSourceFreqMin() {
        return (this.sourceFreqMin!= null);
    }

/**
Get the maximum frequency of the interference, in case of a range.

@return the SourceFreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getSourceFreqMax() {
        return sourceFreqMax;
    }

/**
Set the maximum frequency of the interference, in case of a range.

@param value the SourceFreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setSourceFreqMax(FreqM value) {
        this.sourceFreqMax = value;
    }

/**
Determine if the SourceFreqMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSourceFreqMax() {
        return (this.sourceFreqMax!= null);
    }

/**
Get In Data Item SourceEmsClass, In Data Item EmsClass, enter a three to five characters code, derived from the table below, representing the emission classification. If an "X" is used in any of the symbols, Remarks SHOULD be used to explain the nature of the signal.
First Symbol - Designates Type of Modulation of the Main Carrier
Unmodulated
N - Emission of unmodulated carrier
Amplitude Modulated
A - Double sideband
H - Single sideband, full carrier
R - Single sideband, reduced or variable level carrier
J - Single sideband, suppressed carrier
B - Independent sidebands
C - Vestigial sidebands
Angle-Modulated
F - Frequency modulation
G - Phase modulation
Amplitude and Angle-Modulated
D - Main carrier is amplitude-modulated and angle-modulated simultaneously or in a preestablished sequence
Pulse
P - Sequence of unmodulated pulses
K - Modulated in amplitude
L - Modulated in width/duration
M - Modulated in position phase
Q - Carrier is angle-modulated during the period of the pulse
V - Combination of the foregoing or is produced by other means
Combination
W - Cases not covered above in which an emission consists of the main carrier being modulated, either
simultaneously or in a preestablished sequence, in a combination of two or more of the following modes:
amplitude, angle, pulse
Other
X - Cases not otherwise covered
- : Unknown (to be used only by legacy data)
Second Symbol - Designates the Nature of Signal(s) Modulating the Main Carrier
0 - No modulating signal
1 - A single channel containing quantised or digital information, not using a modulating subcarrier. (Excludes
time-division multiplex)
2 - A single channel containing quantised or digital information, using a modulating subcarrier
3 - A single channel containing analogue information
7 - Two or more channels containing quantised or digital information
8 - Two or more channels containing analogue information
9 - Composite system with one or more channels containing quantised or digital information, together with one
or more channels containing analogue information
X - Cases not otherwise covered
- : Unknown (to be used only by legacy data)
Third Symbol - Type of Information to be Transmitted a
N - No information transmitted
A - Telegraphy - for aural reception
B - Telegraphy - for automatic reception
C - Facsimile
D - Data transmission, telemetry, telecommand
E - Telephony (including sound broadcasting)
F - Television (video)
W - Combination of the above
X - Cases not otherwise covered.
- : Unknown (to be used only by legacy data)
a In this context, the word "information" does not include information of a constant, unvarying, nature such as that provided by standard frequency emissions, continuous wave, pulse radars, etc.
b A full explanation for the selection of the letter X shall be provided in Information unless the application is for a non-directional beacon in the bands 190-435 and 510-535 kHz.
Fourth Symbol - Designates the Details of Signal(s)
A - Two-condition code with elements of differing numbers and/or durations
B - Two-condition code with elements of the same number and duration without error correction
C - Two-condition code with elements of the same number and duration with error correction
D - Four-condition code in which each condition represents a signal element of one or more bits
E - Multi-condition code in which each condition represents a signal element of one or more bits
F - Multi-condition code in which each condition or combination of conditions represents a character
G - Sound of broadcasting quality (monophonic)
H - Sound of broadcasting quality (stereophonic or quadraphonic)
J - Sound of commercial quality (excluding categories defined for symbol K and L below)
K - Sound of commercial quality with the use of frequency inversion or band splitting
L - Sound of commercial quality with separate frequency modulated signals to control the level of demodulated signal
M - Monochrome
N - Color
W - Combination of the above
X - Cases not otherwise covered
Fifth Symbol - Designates the Nature of Multiplexing
N - None
C - Code-division multiplex (includes bandwidth expansion techniques)
F - Frequency-division multiplex
T - Time-division multiplex
W - Combination of frequency-division multiplex and time-division multiplex
X - Other types of multiplexing

[XSD ERR REGEX] This data item MUST comply to the regular expression: "(A|B|C|D|F|G|H|J|K|L|M|N|P|Q|R|V|
W|X|-)(0|1|2|3|7|8|9|X|-)(A|B|C|D|E|F|N|W|X|-)(A|B|C|D|E|F|G|H|J|K|L|M|N|W|X)?(C|F|N|T|W|X)?"

@return the SourceEmsClass value in a {@link TEmsDes} data type
@since 3.1.0
*/
public EmsDes getSourceEmsClass() {
        return sourceEmsClass;
    }

/**
Set In Data Item SourceEmsClass, In Data Item EmsClass, enter a three to five characters code, derived from the table below, representing the emission classification. If an "X" is used in any of the symbols, Remarks SHOULD be used to explain the nature of the signal.
First Symbol - Designates Type of Modulation of the Main Carrier
Unmodulated
N - Emission of unmodulated carrier
Amplitude Modulated
A - Double sideband
H - Single sideband, full carrier
R - Single sideband, reduced or variable level carrier
J - Single sideband, suppressed carrier
B - Independent sidebands
C - Vestigial sidebands
Angle-Modulated
F - Frequency modulation
G - Phase modulation
Amplitude and Angle-Modulated
D - Main carrier is amplitude-modulated and angle-modulated simultaneously or in a preestablished sequence
Pulse
P - Sequence of unmodulated pulses
K - Modulated in amplitude
L - Modulated in width/duration
M - Modulated in position phase
Q - Carrier is angle-modulated during the period of the pulse
V - Combination of the foregoing or is produced by other means
Combination
W - Cases not covered above in which an emission consists of the main carrier being modulated, either
simultaneously or in a preestablished sequence, in a combination of two or more of the following modes:
amplitude, angle, pulse
Other
X - Cases not otherwise covered
- : Unknown (to be used only by legacy data)
Second Symbol - Designates the Nature of Signal(s) Modulating the Main Carrier
0 - No modulating signal
1 - A single channel containing quantised or digital information, not using a modulating subcarrier. (Excludes
time-division multiplex)
2 - A single channel containing quantised or digital information, using a modulating subcarrier
3 - A single channel containing analogue information
7 - Two or more channels containing quantised or digital information
8 - Two or more channels containing analogue information
9 - Composite system with one or more channels containing quantised or digital information, together with one
or more channels containing analogue information
X - Cases not otherwise covered
- : Unknown (to be used only by legacy data)
Third Symbol - Type of Information to be Transmitted a
N - No information transmitted
A - Telegraphy - for aural reception
B - Telegraphy - for automatic reception
C - Facsimile
D - Data transmission, telemetry, telecommand
E - Telephony (including sound broadcasting)
F - Television (video)
W - Combination of the above
X - Cases not otherwise covered.
- : Unknown (to be used only by legacy data)
a In this context, the word "information" does not include information of a constant, unvarying, nature such as that provided by standard frequency emissions, continuous wave, pulse radars, etc.
b A full explanation for the selection of the letter X shall be provided in Information unless the application is for a non-directional beacon in the bands 190-435 and 510-535 kHz.
Fourth Symbol - Designates the Details of Signal(s)
A - Two-condition code with elements of differing numbers and/or durations
B - Two-condition code with elements of the same number and duration without error correction
C - Two-condition code with elements of the same number and duration with error correction
D - Four-condition code in which each condition represents a signal element of one or more bits
E - Multi-condition code in which each condition represents a signal element of one or more bits
F - Multi-condition code in which each condition or combination of conditions represents a character
G - Sound of broadcasting quality (monophonic)
H - Sound of broadcasting quality (stereophonic or quadraphonic)
J - Sound of commercial quality (excluding categories defined for symbol K and L below)
K - Sound of commercial quality with the use of frequency inversion or band splitting
L - Sound of commercial quality with separate frequency modulated signals to control the level of demodulated signal
M - Monochrome
N - Color
W - Combination of the above
X - Cases not otherwise covered
Fifth Symbol - Designates the Nature of Multiplexing
N - None
C - Code-division multiplex (includes bandwidth expansion techniques)
F - Frequency-division multiplex
T - Time-division multiplex
W - Combination of frequency-division multiplex and time-division multiplex
X - Other types of multiplexing

[XSD ERR REGEX] This data item MUST comply to the regular expression: "(A|B|C|D|F|G|H|J|K|L|M|N|P|Q|R|V|
W|X|-)(0|1|2|3|7|8|9|X|-)(A|B|C|D|E|F|N|W|X|-)(A|B|C|D|E|F|G|H|J|K|L|M|N|W|X)?(C|F|N|T|W|X)?"

@param value the SourceEmsClass value in a {@link TEmsDes} data type
@since 3.1.0
*/
public void setSourceEmsClass(EmsDes value) {
        this.sourceEmsClass = value;
    }

/**
Determine if the SourceEmsClass is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSourceEmsClass() {
        return (this.sourceEmsClass!= null);
    }

/**
Get the calculated or measured bandwidth of the interference source.

@return the SourceEmsBw value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getSourceEmsBw() {
        return sourceEmsBw;
    }

/**
Set the calculated or measured bandwidth of the interference source.

@param value the SourceEmsBw value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setSourceEmsBw(FreqM value) {
        this.sourceEmsBw = value;
    }

/**
Determine if the SourceEmsBw is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSourceEmsBw() {
        return (this.sourceEmsBw!= null);
    }

/**
Get In Data Item VictimAsgnRef, Enter the serial number of the assignment victim of the interference.

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"

@return the VictimAsgnRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getVictimAssignment()} instead.
*/
@Deprecated
public Serial getVictimAsgnRef() {
        return victimAsgnRef;
    }

/**
Set In Data Item VictimAsgnRef, Enter the serial number of the assignment victim of the interference.

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"

@param value the VictimAsgnRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setVictimAssignment(Assignment)} instead.
*/
@Deprecated
public void setVictimAsgnRef(Serial value) {
        this.victimAsgnRef = value;
    }

/**
Determine if the VictimAsgnRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVictimAsgnRef() {
        return (this.victimAsgnRef!= null);
    }

/**
Get the nomenclature or other identifier of equipment experiencing the interference.

@return the VictimSystem value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getVictimSystem() {
        return victimSystem;
    }

/**
Set the nomenclature or other identifier of equipment experiencing the interference.

@param value the VictimSystem value in a {@link TS100} data type
@since 3.1.0
*/
public void setVictimSystem(S100 value) {
        this.victimSystem = value;
    }

/**
Determine if the VictimSystem is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVictimSystem() {
        return (this.victimSystem!= null);
    }

/**
Get the country or area where the victim of the interference is located.

@return the VictimCountry value in a {@link TString} data type
@since 3.1.0
*/
public TString getVictimCountry() {
        return victimCountry;
    }

/**
Set the country or area where the victim of the interference is located.

@param value the VictimCountry value in a {@link TString} data type
@since 3.1.0
*/
public void setVictimCountry(TString value) {
        this.victimCountry = value;
    }

/**
Determine if the VictimCountry is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVictimCountry() {
return (this.victimCountry!= null ? this.victimCountry.isSetValue() : false);
    }

/**
Get the geographical longitude (degrees, minutes, seconds, and hemisphere E or W) of the 
victim of the interference. If the seconds are not known, use 00. Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees longitude require three digits. Seconds may have a decimal point followed by up to two decimals. Enter E or W immediately following the seconds. The format is: dddmmss.hhH (where ".hh" is 
optional and H = E or W).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"

@return the VictimLon value in a {@link TLon} data type
@since 3.1.0
*/
public Lon getVictimLon() {
        return victimLon;
    }

/**
Set the geographical longitude (degrees, minutes, seconds, and hemisphere E or W) of the 
victim of the interference. If the seconds are not known, use 00. Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees longitude require three digits. Seconds may have a decimal point followed by up to two decimals. Enter E or W immediately following the seconds. The format is: dddmmss.hhH (where ".hh" is 
optional and H = E or W).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"

@param value the VictimLon value in a {@link TLon} data type
@since 3.1.0
*/
public void setVictimLon(Lon value) {
        this.victimLon = value;
    }

/**
Determine if the VictimLon is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVictimLon() {
        return (this.victimLon!= null);
    }

/**
Get the geographical latitude (degrees, minutes, seconds and hemisphere N or S) of the victim of the interference. Same remarks for seconds and leading zeros. Enter N or S immediately following the seconds.  The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"

@return the VictimLat value in a {@link TLat} data type
@since 3.1.0
*/
public Lat getVictimLat() {
        return victimLat;
    }

/**
Set the geographical latitude (degrees, minutes, seconds and hemisphere N or S) of the victim of the interference. Same remarks for seconds and leading zeros. Enter N or S immediately following the seconds.  The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"

@param value the VictimLat value in a {@link TLat} data type
@since 3.1.0
*/
public void setVictimLat(Lat value) {
        this.victimLat = value;
    }

/**
Determine if the VictimLat is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVictimLat() {
        return (this.victimLat!= null);
    }

/**
Get the approximate position the victim of the interference, if exact coordinates are not known.

@return the VictimLocDescr value in a {@link TS255} data type
@since 3.1.0
*/
public S255 getVictimLocDescr() {
        return victimLocDescr;
    }

/**
Set the approximate position the victim of the interference, if exact coordinates are not known.

@param value the VictimLocDescr value in a {@link TS255} data type
@since 3.1.0
*/
public void setVictimLocDescr(S255 value) {
        this.victimLocDescr = value;
    }

/**
Determine if the VictimLocDescr is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVictimLocDescr() {
        return (this.victimLocDescr!= null);
    }

/**
Get the nominal or lower frequency used by the victim of the interference.

@return the VictimFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getVictimFreqMin() {
        return victimFreqMin;
    }

/**
Set the nominal or lower frequency used by the victim of the interference.

@param value the VictimFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setVictimFreqMin(FreqM value) {
        this.victimFreqMin = value;
    }

/**
Determine if the VictimFreqMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVictimFreqMin() {
        return (this.victimFreqMin!= null);
    }

/**
Get the upper frequency of the range, in case of an assignment over a frequency range.

@return the VictimFreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getVictimFreqMax() {
        return victimFreqMax;
    }

/**
Set the upper frequency of the range, in case of an assignment over a frequency range.

@param value the VictimFreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setVictimFreqMax(FreqM value) {
        this.victimFreqMax = value;
    }

/**
Determine if the VictimFreqMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVictimFreqMax() {
        return (this.victimFreqMax!= null);
    }

/**
Get the name of the satellite experiencing the interference.

@return the SatelliteName value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getSatelliteName() {
        return satelliteName;
    }

/**
Set the name of the satellite experiencing the interference.

@param value the SatelliteName value in a {@link TS50} data type
@since 3.1.0
*/
public void setSatelliteName(S50 value) {
        this.satelliteName = value;
    }

/**
Determine if the SatelliteName is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSatelliteName() {
        return (this.satelliteName!= null);
    }

/**
Get the identifier of satellite channel experiencing the interference.

@return the SatelliteChannel value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getSatelliteChannel() {
        return satelliteChannel;
    }

/**
Set the identifier of satellite channel experiencing the interference.

@param value the SatelliteChannel value in a {@link TS50} data type
@since 3.1.0
*/
public void setSatelliteChannel(S50 value) {
        this.satelliteChannel = value;
    }

/**
Determine if the SatelliteChannel is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSatelliteChannel() {
        return (this.satelliteChannel!= null);
    }

/**
Get the satellite uplink frequency experiencing the interference

@return the SatelliteUplinkFreq value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getSatelliteUplinkFreq() {
        return satelliteUplinkFreq;
    }

/**
Set the satellite uplink frequency experiencing the interference

@param value the SatelliteUplinkFreq value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setSatelliteUplinkFreq(FreqM value) {
        this.satelliteUplinkFreq = value;
    }

/**
Determine if the SatelliteUplinkFreq is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSatelliteUplinkFreq() {
        return (this.satelliteUplinkFreq!= null);
    }

/**
Get the effect the interference has on normal operations.

@return the PerformanceEffects value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getPerformanceEffects() {
        return performanceEffects;
    }

/**
Set the effect the interference has on normal operations.

@param value the PerformanceEffects value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setPerformanceEffects(MEMO value) {
        this.performanceEffects = value;
    }

/**
Determine if the PerformanceEffects is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPerformanceEffects() {
        return (this.performanceEffects!= null);
    }

/**
Get your best guess as to the cause of the interference.

@return the Evaluation value in a {@link TString} data type
@since 3.1.0
*/
public TString getEvaluation() {
        return evaluation;
    }

/**
Set your best guess as to the cause of the interference.

@param value the Evaluation value in a {@link TString} data type
@since 3.1.0
*/
public void setEvaluation(TString value) {
        this.evaluation = value;
    }

/**
Determine if the Evaluation is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEvaluation() {
return (this.evaluation!= null ? this.evaluation.isSetValue() : false);
    }

/**
Get what actions were taken to resolve the interference.

@return the Solution value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getSolution() {
        return solution;
    }

/**
Set what actions were taken to resolve the interference.

@param value the Solution value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setSolution(MEMO value) {
        this.solution = value;
    }

/**
Determine if the Solution is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSolution() {
        return (this.solution!= null);
    }

/**
Get the responsible Combatant Commander for the geographic area where the interference occurred and/or the victim's organization.

@return the AffectedCSA value in a {@link TString} data type
@since 3.1.0
*/
public TString getAffectedCSA() {
        return affectedCSA;
    }

/**
Set the responsible Combatant Commander for the geographic area where the interference occurred and/or the victim's organization.

@param value the AffectedCSA value in a {@link TString} data type
@since 3.1.0
*/
public void setAffectedCSA(TString value) {
        this.affectedCSA = value;
    }

/**
Determine if the AffectedCSA is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAffectedCSA() {
return (this.affectedCSA!= null ? this.affectedCSA.isSetValue() : false);
    }

/**
Get the interference characteristics.

@return the Characteristics value in a {@link TString} data type
@since 3.1.0
*/
public TString getCharacteristics() {
        return characteristics;
    }

/**
Set the interference characteristics.

@param value the Characteristics value in a {@link TString} data type
@since 3.1.0
*/
public void setCharacteristics(TString value) {
        this.characteristics = value;
    }

/**
Determine if the Characteristics is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCharacteristics() {
return (this.characteristics!= null ? this.characteristics.isSetValue() : false);
    }

/**
Get whether the interference affects GPS reception.

@return the GPSAffected value in a {@link TString} data type
@since 3.1.0
*/
public TString getGPSAffected() {
        return gpsAffected;
    }

/**
Set whether the interference affects GPS reception.

@param value the GPSAffected value in a {@link TString} data type
@since 3.1.0
*/
public void setGPSAffected(TString value) {
        this.gpsAffected = value;
    }

/**
Determine if the GPSAffected is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetGPSAffected() {
return (this.gpsAffected!= null ? this.gpsAffected.isSetValue() : false);
    }

/**
Get the local event ID.

@return the LocalEventID value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getLocalEventID() {
        return localEventID;
    }

/**
Set the local event ID.

@param value the LocalEventID value in a {@link TS20} data type
@since 3.1.0
*/
public void setLocalEventID(S20 value) {
        this.localEventID = value;
    }

/**
Determine if the LocalEventID is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLocalEventID() {
        return (this.localEventID!= null);
    }

/**
Get the network circuits affected by the interference.

@return the NetCircuitsAffected value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getNetCircuitsAffected() {
        return netCircuitsAffected;
    }

/**
Set the network circuits affected by the interference.

@param value the NetCircuitsAffected value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setNetCircuitsAffected(MEMO value) {
        this.netCircuitsAffected = value;
    }

/**
Determine if the NetCircuitsAffected is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNetCircuitsAffected() {
        return (this.netCircuitsAffected!= null);
    }

/**
Get the networks affected by the interference.

@return the NetsAffected value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getNetsAffected() {
        return netsAffected;
    }

/**
Set the networks affected by the interference.

@param value the NetsAffected value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setNetsAffected(MEMO value) {
        this.netsAffected = value;
    }

/**
Determine if the NetsAffected is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNetsAffected() {
        return (this.netsAffected!= null);
    }

/**
Get the satellite communication priority.

@return the SATCOMPriority value in a {@link TString} data type
@since 3.1.0
*/
public TString getSATCOMPriority() {
        return satcomPriority;
    }

/**
Set the satellite communication priority.

@param value the SATCOMPriority value in a {@link TString} data type
@since 3.1.0
*/
public void setSATCOMPriority(TString value) {
        this.satcomPriority = value;
    }

/**
Determine if the SATCOMPriority is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSATCOMPriority() {
return (this.satcomPriority!= null ? this.satcomPriority.isSetValue() : false);
    }

/**
Get whether the interference affects satellite reception.

@return the SatelliteAffected value in a {@link TString} data type
@since 3.1.0
*/
public TString getSatelliteAffected() {
        return satelliteAffected;
    }

/**
Set whether the interference affects satellite reception.

@param value the SatelliteAffected value in a {@link TString} data type
@since 3.1.0
*/
public void setSatelliteAffected(TString value) {
        this.satelliteAffected = value;
    }

/**
Determine if the SatelliteAffected is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSatelliteAffected() {
return (this.satelliteAffected!= null ? this.satelliteAffected.isSetValue() : false);
    }

/**
Get the polarisation of the satellite downlink signal.

@return the SatelliteDownlinkPolarisation value in a {@link TString} data type
@since 3.1.0
*/
public TString getSatelliteDownlinkPolarisation() {
        return satelliteDownlinkPolarisation;
    }

/**
Set the polarisation of the satellite downlink signal.

@param value the SatelliteDownlinkPolarisation value in a {@link TString} data type
@since 3.1.0
*/
public void setSatelliteDownlinkPolarisation(TString value) {
        this.satelliteDownlinkPolarisation = value;
    }

/**
Determine if the SatelliteDownlinkPolarisation is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSatelliteDownlinkPolarisation() {
return (this.satelliteDownlinkPolarisation!= null ? this.satelliteDownlinkPolarisation.isSetValue() : false);
    }

/**
Get the satellite hemisphere.

@return the SatelliteHemisphere value in a {@link TString} data type
@since 3.1.0
*/
public TString getSatelliteHemisphere() {
        return satelliteHemisphere;
    }

/**
Set the satellite hemisphere.

@param value the SatelliteHemisphere value in a {@link TString} data type
@since 3.1.0
*/
public void setSatelliteHemisphere(TString value) {
        this.satelliteHemisphere = value;
    }

/**
Determine if the SatelliteHemisphere is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSatelliteHemisphere() {
return (this.satelliteHemisphere!= null ? this.satelliteHemisphere.isSetValue() : false);
    }

/**
Get the satellite longitude.

[XSD ERR REGEX] This data item MUST comply to the regular expression: "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1 (US),2})?)|1800000)(E|W))|X"

@return the SatelliteLongitude value in a {@link TLon} data type
@since 3.1.0
*/
public Lon getSatelliteLongitude() {
        return satelliteLongitude;
    }

/**
Set the satellite longitude.

[XSD ERR REGEX] This data item MUST comply to the regular expression: "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1 (US),2})?)|1800000)(E|W))|X"

@param value the SatelliteLongitude value in a {@link TLon} data type
@since 3.1.0
*/
public void setSatelliteLongitude(Lon value) {
        this.satelliteLongitude = value;
    }

/**
Determine if the SatelliteLongitude is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSatelliteLongitude() {
        return (this.satelliteLongitude!= null);
    }

/**
Get the satellite transponder ID.

@return the SatelliteTransponderID value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getSatelliteTransponderID() {
        return satelliteTransponderID;
    }

/**
Set the satellite transponder ID.

@param value the SatelliteTransponderID value in a {@link TS50} data type
@since 3.1.0
*/
public void setSatelliteTransponderID(S50 value) {
        this.satelliteTransponderID = value;
    }

/**
Determine if the SatelliteTransponderID is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSatelliteTransponderID() {
        return (this.satelliteTransponderID!= null);
    }

/**
Get the polarisation of the satellite uplink signal.

@return the SatelliteUplinkPolarisation value in a {@link TString} data type
@since 3.1.0
*/
public TString getSatelliteUplinkPolarisation() {
        return satelliteUplinkPolarisation;
    }

/**
Set the polarisation of the satellite uplink signal.

@param value the SatelliteUplinkPolarisation value in a {@link TString} data type
@since 3.1.0
*/
public void setSatelliteUplinkPolarisation(TString value) {
        this.satelliteUplinkPolarisation = value;
    }

/**
Determine if the SatelliteUplinkPolarisation is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSatelliteUplinkPolarisation() {
return (this.satelliteUplinkPolarisation!= null ? this.satelliteUplinkPolarisation.isSetValue() : false);
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
Set whether the user needs technical assistance from another organisation to solve the interference. If not used, consider as "No".

@param value  An instances of type {@link ListCBO}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withHelpRequired(ListCBO value) {
           setHelpRequired(new TString(value.value()));
        return this;
    }

/**
Set how often the interference is experienced.

@param value  An instances of type {@link ListCTI}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withIntfPeriod(ListCTI value) {
           setIntfPeriod(new TString(value.value()));
        return this;
    }

/**
Set the date/time the interference was first perceived.

@param value  An instances of type {@link TDT}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withIntfStartDateTime(TDT value) {
        return this;
    }

/**
Set the date/time the interference ceased.

@param value  An instances of type {@link Calendar}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withIntfStopDateTime(Calendar value) {
           setIntfStopDateTime(new DT(value));
        return this;
    }
/**
Set the date/time the interference ceased.

@param value  An instances of type {@link Date}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withIntfStopDateTime(Date value) {
           setIntfStopDateTime(new DT(value));
        return this;
    }

/**
Set In Data Item IntfDescr, describe the interference. Provide as much information as possible. State what actions you have
taken so far to resolve the interference.

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withIntfDescr(String value) {
           setIntfDescr(new MEMO(value));
        return this;
    }

/**
Set the nomenclature or description of equipment experiencing the interference.

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withAffectedEquipment(String value) {
           setAffectedEquipment(new S100(value));
        return this;
    }

/**
Set the measured electromagnetic field strength.

@param value  An instances of type {@link Double}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSourceFieldStrength(Double value) {
           setSourceFieldStrength(new FieldStrength(value));
        return this;
    }

/**
Set the geographical longitude (degrees, minutes, seconds, and hemisphere E or W) of the source of the interference. If the seconds are not known, use 00. Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees longitude require three digits. Seconds may have a decimal point followed by up to two decimals. Enter E or W immediately following the seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or W).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5]
[0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSourceLon(String value) {
           setSourceLon(new Lon(value));
        return this;
    }

/**
Set the geographical latitude (degrees, minutes, seconds and  hemisphere N or S) of the source of the interference. Same remarks for seconds and leading zeros. Enter N or S immediately following the seconds. The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSourceLat(String value) {
           setSourceLat(new Lat(value));
        return this;
    }

/**
Set the measured azimuth of the source from the victim.

@param value  An instances of type {@link Double}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSourceAz(Double value) {
           setSourceAz(new Az(value));
        return this;
    }

/**
Set the approximate position the source, if exact coordinates are not known.

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSourceLocDescr(String value) {
           setSourceLocDescr(new S255(value));
        return this;
    }

/**
Set the nominal frequency of the interference, or the minimum frequency in case of a range.

@param value  An instances of type {@link Double}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSourceFreqMin(Double value) {
           setSourceFreqMin(new FreqM(value));
        return this;
    }

/**
Set the maximum frequency of the interference, in case of a range.

@param value  An instances of type {@link Double}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSourceFreqMax(Double value) {
           setSourceFreqMax(new FreqM(value));
        return this;
    }

/**
Set In Data Item SourceEmsClass, In Data Item EmsClass, enter a three to five characters code, derived from the table below, representing the emission classification. If an "X" is used in any of the symbols, Remarks SHOULD be used to explain the nature of the signal.
First Symbol - Designates Type of Modulation of the Main Carrier
Unmodulated
N - Emission of unmodulated carrier
Amplitude Modulated
A - Double sideband
H - Single sideband, full carrier
R - Single sideband, reduced or variable level carrier
J - Single sideband, suppressed carrier
B - Independent sidebands
C - Vestigial sidebands
Angle-Modulated
F - Frequency modulation
G - Phase modulation
Amplitude and Angle-Modulated
D - Main carrier is amplitude-modulated and angle-modulated simultaneously or in a preestablished sequence
Pulse
P - Sequence of unmodulated pulses
K - Modulated in amplitude
L - Modulated in width/duration
M - Modulated in position phase
Q - Carrier is angle-modulated during the period of the pulse
V - Combination of the foregoing or is produced by other means
Combination
W - Cases not covered above in which an emission consists of the main carrier being modulated, either
simultaneously or in a preestablished sequence, in a combination of two or more of the following modes:
amplitude, angle, pulse
Other
X - Cases not otherwise covered
- : Unknown (to be used only by legacy data)
Second Symbol - Designates the Nature of Signal(s) Modulating the Main Carrier
0 - No modulating signal
1 - A single channel containing quantised or digital information, not using a modulating subcarrier. (Excludes
time-division multiplex)
2 - A single channel containing quantised or digital information, using a modulating subcarrier
3 - A single channel containing analogue information
7 - Two or more channels containing quantised or digital information
8 - Two or more channels containing analogue information
9 - Composite system with one or more channels containing quantised or digital information, together with one
or more channels containing analogue information
X - Cases not otherwise covered
- : Unknown (to be used only by legacy data)
Third Symbol - Type of Information to be Transmitted a
N - No information transmitted
A - Telegraphy - for aural reception
B - Telegraphy - for automatic reception
C - Facsimile
D - Data transmission, telemetry, telecommand
E - Telephony (including sound broadcasting)
F - Television (video)
W - Combination of the above
X - Cases not otherwise covered.
- : Unknown (to be used only by legacy data)
a In this context, the word "information" does not include information of a constant, unvarying, nature such as that provided by standard frequency emissions, continuous wave, pulse radars, etc.
b A full explanation for the selection of the letter X shall be provided in Information unless the application is for a non-directional beacon in the bands 190-435 and 510-535 kHz.
Fourth Symbol - Designates the Details of Signal(s)
A - Two-condition code with elements of differing numbers and/or durations
B - Two-condition code with elements of the same number and duration without error correction
C - Two-condition code with elements of the same number and duration with error correction
D - Four-condition code in which each condition represents a signal element of one or more bits
E - Multi-condition code in which each condition represents a signal element of one or more bits
F - Multi-condition code in which each condition or combination of conditions represents a character
G - Sound of broadcasting quality (monophonic)
H - Sound of broadcasting quality (stereophonic or quadraphonic)
J - Sound of commercial quality (excluding categories defined for symbol K and L below)
K - Sound of commercial quality with the use of frequency inversion or band splitting
L - Sound of commercial quality with separate frequency modulated signals to control the level of demodulated signal
M - Monochrome
N - Color
W - Combination of the above
X - Cases not otherwise covered
Fifth Symbol - Designates the Nature of Multiplexing
N - None
C - Code-division multiplex (includes bandwidth expansion techniques)
F - Frequency-division multiplex
T - Time-division multiplex
W - Combination of frequency-division multiplex and time-division multiplex
X - Other types of multiplexing

[XSD ERR REGEX] This data item MUST comply to the regular expression: "(A|B|C|D|F|G|H|J|K|L|M|N|P|Q|R|V|
W|X|-)(0|1|2|3|7|8|9|X|-)(A|B|C|D|E|F|N|W|X|-)(A|B|C|D|E|F|G|H|J|K|L|M|N|W|X)?(C|F|N|T|W|X)?"

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSourceEmsClass(String value) {
           setSourceEmsClass(new EmsDes(value));
        return this;
    }

/**
Set the calculated or measured bandwidth of the interference source.

@param value  An instances of type {@link Double}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSourceEmsBw(Double value) {
           setSourceEmsBw(new FreqM(value));
        return this;
    }

/**
Set In Data Item VictimAsgnRef, Enter the serial number of the assignment victim of the interference.

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"

@param value  An instances of type {@link Serial}
@return The current IntfReport object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withVictimAssignment(Assignment)} instead.
*/
@Deprecated
    public IntfReport withVictimAsgnRef(Serial value) {
           setVictimAsgnRef(value);
        return this;
    }

/**
Set the nomenclature or other identifier of equipment experiencing the interference.

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withVictimSystem(String value) {
           setVictimSystem(new S100(value));
        return this;
    }

/**
Set the country or area where the victim of the interference is located.

@param value  An instances of type {@link ListCAO}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withVictimCountry(ListCAO value) {
           setVictimCountry(new TString(value.value()));
        return this;
    }

/**
Set the geographical longitude (degrees, minutes, seconds, and hemisphere E or W) of the 
victim of the interference. If the seconds are not known, use 00. Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees longitude require three digits. Seconds may have a decimal point followed by up to two decimals. Enter E or W immediately following the seconds. The format is: dddmmss.hhH (where ".hh" is 
optional and H = E or W).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withVictimLon(String value) {
           setVictimLon(new Lon(value));
        return this;
    }

/**
Set the geographical latitude (degrees, minutes, seconds and hemisphere N or S) of the victim of the interference. Same remarks for seconds and leading zeros. Enter N or S immediately following the seconds.  The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).

[XSD ERR REGEX] This data item MUST comply to the regular expression: "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withVictimLat(String value) {
           setVictimLat(new Lat(value));
        return this;
    }

/**
Set the approximate position the victim of the interference, if exact coordinates are not known.

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withVictimLocDescr(String value) {
           setVictimLocDescr(new S255(value));
        return this;
    }

/**
Set the nominal or lower frequency used by the victim of the interference.

@param value  An instances of type {@link TFreqM}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withVictimFreqMin(TFreqM value) {
        return this;
    }

/**
Set the upper frequency of the range, in case of an assignment over a frequency range.

@param value  An instances of type {@link Double}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withVictimFreqMax(Double value) {
           setVictimFreqMax(new FreqM(value));
        return this;
    }

/**
Set the name of the satellite experiencing the interference.

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSatelliteName(String value) {
           setSatelliteName(new S50(value));
        return this;
    }

/**
Set the identifier of satellite channel experiencing the interference.

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSatelliteChannel(String value) {
           setSatelliteChannel(new S50(value));
        return this;
    }

/**
Set the satellite uplink frequency experiencing the interference

@param value  An instances of type {@link Double}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSatelliteUplinkFreq(Double value) {
           setSatelliteUplinkFreq(new FreqM(value));
        return this;
    }

/**
Set the effect the interference has on normal operations.

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withPerformanceEffects(String value) {
           setPerformanceEffects(new MEMO(value));
        return this;
    }

/**
Set your best guess as to the cause of the interference.

@param value  An instances of type {@link ListCJ1}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withEvaluation(ListCJ1 value) {
           setEvaluation(new TString(value.value()));
        return this;
    }

/**
Set what actions were taken to resolve the interference.

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSolution(String value) {
           setSolution(new MEMO(value));
        return this;
    }

/**
Set the responsible Combatant Commander for the geographic area where the interference occurred and/or the victim's organization.

@param value  An instances of type {@link ListUAG}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withAffectedCSA(ListUAG value) {
           setAffectedCSA(new TString(value.value()));
        return this;
    }

/**
Set the interference characteristics.

@param value  An instances of type {@link ListUCH}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withCharacteristics(ListUCH value) {
           setCharacteristics(new TString(value.value()));
        return this;
    }

/**
Set whether the interference affects GPS reception.

@param value  An instances of type {@link ListCBO}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withGPSAffected(ListCBO value) {
           setGPSAffected(new TString(value.value()));
        return this;
    }

/**
Set the local event ID.

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withLocalEventID(String value) {
           setLocalEventID(new S20(value));
        return this;
    }

/**
Set the network circuits affected by the interference.

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withNetCircuitsAffected(String value) {
           setNetCircuitsAffected(new MEMO(value));
        return this;
    }

/**
Set the networks affected by the interference.

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withNetsAffected(String value) {
           setNetsAffected(new MEMO(value));
        return this;
    }

/**
Set the satellite communication priority.

@param value  An instances of type {@link ListUPR}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSATCOMPriority(ListUPR value) {
           setSATCOMPriority(new TString(value.value()));
        return this;
    }

/**
Set whether the interference affects satellite reception.

@param value  An instances of type {@link ListCBO}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSatelliteAffected(ListCBO value) {
           setSatelliteAffected(new TString(value.value()));
        return this;
    }

/**
Set the polarisation of the satellite downlink signal.

@param value  An instances of type {@link ListCPO}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSatelliteDownlinkPolarisation(ListCPO value) {
           setSatelliteDownlinkPolarisation(new TString(value.value()));
        return this;
    }

/**
Set the satellite hemisphere.

@param value  An instances of type {@link ListCCO}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSatelliteHemisphere(ListCCO value) {
           setSatelliteHemisphere(new TString(value.value()));
        return this;
    }

/**
Set the satellite longitude.

[XSD ERR REGEX] This data item MUST comply to the regular expression: "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1 (US),2})?)|1800000)(E|W))|X"

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSatelliteLongitude(String value) {
           setSatelliteLongitude(new Lon(value));
        return this;
    }

/**
Set the satellite transponder ID.

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSatelliteTransponderID(String value) {
           setSatelliteTransponderID(new S50(value));
        return this;
    }

/**
Set the polarisation of the satellite uplink signal.

@param value  An instances of type {@link ListCPO}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSatelliteUplinkPolarisation(ListCPO value) {
           setSatelliteUplinkPolarisation(new TString(value.value()));
        return this;
    }

/**
Set the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@param values  One or more instances of type {@link POCInformation...}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withPOCInformation(POCInformation... values) {
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
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withPOCInformation(Collection<POCInformation> values) {
        if (values!= null) {
            getPOCInformation().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withCaseNum(CaseNum... values) {
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
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withRemarks(Remarks... values) {
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
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withReleasability(ListCCY... values) {
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
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withRemarkRef(BigInteger... values) {
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
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withExtReferences(BigInteger... values) {
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
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current IntfReport object instance
@since 3.1.0
*/
    public IntfReport withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this IntfReport instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "IntfReport {"
 + (affectedCSA !=null? " affectedCSA [" + affectedCSA +"]" : "") 
 + (affectedEquipment !=null? " affectedEquipment [" + affectedEquipment +"]" : "") 
 + (characteristics !=null? " characteristics [" + characteristics +"]" : "") 
 + (evaluation !=null? " evaluation [" + evaluation +"]" : "") 
 + (gpsAffected !=null? " gpsAffected [" + gpsAffected +"]" : "") 
 + (helpRequired !=null? " helpRequired [" + helpRequired +"]" : "") 
 + (intfDescr !=null? " intfDescr [" + intfDescr +"]" : "") 
 + (intfPeriod !=null? " intfPeriod [" + intfPeriod +"]" : "") 
 + (intfStartDateTime !=null? " intfStartDateTime [" + intfStartDateTime +"]" : "") 
 + (intfStopDateTime !=null? " intfStopDateTime [" + intfStopDateTime +"]" : "") 
 + (localEventID !=null? " localEventID [" + localEventID +"]" : "") 
 + (netCircuitsAffected !=null? " netCircuitsAffected [" + netCircuitsAffected +"]" : "") 
 + (netsAffected !=null? " netsAffected [" + netsAffected +"]" : "") 
 + (performanceEffects !=null? " performanceEffects [" + performanceEffects +"]" : "") 
 + (pocInformation !=null? " pocInformation [" + pocInformation +"]" : "") 
 + (satcomPriority !=null? " satcomPriority [" + satcomPriority +"]" : "") 
 + (satelliteAffected !=null? " satelliteAffected [" + satelliteAffected +"]" : "") 
 + (satelliteChannel !=null? " satelliteChannel [" + satelliteChannel +"]" : "") 
 + (satelliteDownlinkPolarisation !=null? " satelliteDownlinkPolarisation [" + satelliteDownlinkPolarisation +"]" : "") 
 + (satelliteHemisphere !=null? " satelliteHemisphere [" + satelliteHemisphere +"]" : "") 
 + (satelliteLongitude !=null? " satelliteLongitude [" + satelliteLongitude +"]" : "") 
 + (satelliteName !=null? " satelliteName [" + satelliteName +"]" : "") 
 + (satelliteTransponderID !=null? " satelliteTransponderID [" + satelliteTransponderID +"]" : "") 
 + (satelliteUplinkFreq !=null? " satelliteUplinkFreq [" + satelliteUplinkFreq +"]" : "") 
 + (satelliteUplinkPolarisation !=null? " satelliteUplinkPolarisation [" + satelliteUplinkPolarisation +"]" : "") 
 + (solution !=null? " solution [" + solution +"]" : "") 
 + (sourceAz !=null? " sourceAz [" + sourceAz +"]" : "") 
 + (sourceEmsBw !=null? " sourceEmsBw [" + sourceEmsBw +"]" : "") 
 + (sourceEmsClass !=null? " sourceEmsClass [" + sourceEmsClass +"]" : "") 
 + (sourceFieldStrength !=null? " sourceFieldStrength [" + sourceFieldStrength +"]" : "") 
 + (sourceFreqMax !=null? " sourceFreqMax [" + sourceFreqMax +"]" : "") 
 + (sourceFreqMin !=null? " sourceFreqMin [" + sourceFreqMin +"]" : "") 
 + (sourceLat !=null? " sourceLat [" + sourceLat +"]" : "") 
 + (sourceLocDescr !=null? " sourceLocDescr [" + sourceLocDescr +"]" : "") 
 + (sourceLon !=null? " sourceLon [" + sourceLon +"]" : "") 
 + (victimAsgnRef !=null? " victimAsgnRef [" + victimAsgnRef +"]" : "") 
 + (victimCountry !=null? " victimCountry [" + victimCountry +"]" : "") 
 + (victimFreqMax !=null? " victimFreqMax [" + victimFreqMax +"]" : "") 
 + (victimFreqMin !=null? " victimFreqMin [" + victimFreqMin +"]" : "") 
 + (victimLat !=null? " victimLat [" + victimLat +"]" : "") 
 + (victimLocDescr !=null? " victimLocDescr [" + victimLocDescr +"]" : "") 
 + (victimLon !=null? " victimLon [" + victimLon +"]" : "") 
 + (victimSystem !=null? " victimSystem [" + victimSystem +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link IntfReport} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link DT IntfStartDateTime}, {@link FreqM VictimFreqMin}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetIntfStartDateTime() &&  isSetVictimFreqMin();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
In Data Item VictimAsgnRef, Enter the serial number of the assignment victim of the interference.

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
@since 3.1.0
*/
@XmlTransient
private Assignment victimAssignment;

/**
Get In Data Item VictimAsgnRef, Enter the serial number of the assignment victim of the interference.

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"

@return  a {@link Assignment} instance
@since 3.1.0
*/
public Assignment getVictimAssignment(){
return victimAssignment;
}
/**
 Determine if the victimAssignment field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetVictimAssignment() {
    return this.victimAssignment != null ;
}

/**
Set In Data Item VictimAsgnRef, Enter the serial number of the assignment victim of the interference.

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"

@param value  An instances of type {@link Assignment}
@return The current IntfReport object instance
@since 3.1.0
*/
public IntfReport withVictimAssignment(Assignment value) {
this.victimAssignment = value;
return this;
}

  /**
   * Update the SSRF data type references in this IntfReport record.
   * <p>
 */
  @Override
public void prepare() {
super.prepare();
this.victimAsgnRef = victimAssignment !=null? victimAssignment.getSerial() : null;
}

/**
   * Update the SSRF data type references in this IntfReport record after loading from XML.

   * This method builds the transient {@link #victimAssignment} with values
   * from the imported {@link #victimAsgnRef} field. This method should
   * typically be called after the IntfReport is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (victimAsgnRef==null || !victimAsgnRef.isSetValue() ) {return;}
for(Assignment instance : root.getAssignment()) {
if(victimAsgnRef.equals(instance.getSerial())){
victimAssignment = instance;
return;}
}}//</editor-fold>

}
