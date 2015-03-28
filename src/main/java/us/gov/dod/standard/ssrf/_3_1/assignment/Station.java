package us.gov.dod.standard.ssrf._3_1.assignment;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
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
Station defines the station, or one of the stations, within the current Assignment dataset.

Element of {@link Assignment}

Sub-Elements are {@link POCInformation}, {@link StationLoc}

Example: <pre>
* &lt;Station&gt;
*   &lt;Name cls="U"&gt;Base Station&lt;/Name&gt;
*   &lt;CallSign cls="U"&gt;WUH55&lt;/CallSign&gt;
*   &lt;sub-elements/&gt;
*   &lt;/Station&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Station", propOrder = {
    "stationID",
    "callSign",
    "cositeSep",
    "cositeSepDescription",
    "numMobileUnits",
    "numAreaUnits",
    "numCositedUnits",
    "tsdf",
    "userCode",
    "antStructureHeight",
    "stationName",
    "stationControl",
    "primaryStation",
    "pocInformation",
    "stationLoc"
})
public class Station {

/**
StationID  - Station Reference (Required) 

The unique identifier of one of the stations used by this Assignment at this specific Station. A Station dataset may have more than one discrete station.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "StationID", required = true)
      private  S100 stationID;
/**
CallSign  - Call Sign (Optional) 

The call sign assigned to the transmitting station. It can be an internationally allocated call sign or the tactical call sign assigned by the operational authority when the Station is used within a Net. For navigational aids, enter the NAVAIDS identifier.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "CallSign", required = false)
    private S20 callSign;
/**
CositeSep  - Cosite Separation (Optional) 

The minimum required frequency separation between the equipment for which the assignment is being made and any other equipment operating at the same location. Enter:
- For a fixed frequency assignment, the required frequency separation in MHz (without unit), between this equipment and other equipment operated at one location. If the frequency separation is unknown use the NATO recommended frequency separation requirements are listed below.
0.5 (MHz) for a transmitter power below 24.8 dBW (300 watts);
2 (MHz) for a transmitter power above 24.8 dBW (300 watts);
2.0 through 9.9 (MHz) for exceptionally high transmitter powers or difficult cosite constraints.
- For a HAVE QUICK II or SATURN frequency hopping assignments, one of the following values:
0 - Instantaneous separation may be as small as 25 kHz;
4 - Minimum separation is 4 MHz;
8 - Minimum separation is 8 MHz;
12 - Minimum separation is 12 MHz

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "CositeSep", required = false)
    private FreqM cositeSep;
/**
CositeSepDescription  - Cosite Separation Description (Optional) 

A free text description of the minimum required frequency separation between a number of transmitters, or between a transmitter and a related receiver in radio relay frequency requests.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "CositeSepDescription", required = false)
    private MEMO cositeSepDescription;
/**
NumMobileUnits  - Number of Mobile Units (Optional) 

The number of mobile units (equipment). These units do not necessarily operate simultaneously in the same electromagnetic environment.

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

    @XmlElement(name = "TSDF", required = false)
    private TSDFValue tsdf;
/**
UserCode  - User Code (Optional) 

A code identifying the user of the station.

Format is S6
@since 3.1.0
*/
    @XmlElement(name = "UserCode", required = false)
    private S6 userCode;
/**
US:AntStructureHeight  - Antenna Structure Height (Optional) 

The overall height, of the antenna support structure above ground level.

Format is UN(3) (m)
@since 3.1.0
*/
    @XmlElement(name = "AntStructureHeight", required = false)
    private AntHeight antStructureHeight;
/**
US:StationName - Station Name (Optional) 

A short descriptive name for the station. This must be unique within the dataset.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "StationName", required = false)
    private S100 stationName;
/**
US:StationControl  - Station Control (Optional) 

The operating unit that controls the station when different than the assignment users.

Format is S18
@since 3.1.0
*/
    @XmlElement(name = "StationControl", required = false)
    private S18 stationControl;
/**
US:PrimaryStation  - Primary Station (Optional) 

Whether this station is the station of primary regulatory interest.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "PrimaryStation", required = false)
    private TString primaryStation;
/**
POCInformation (Optional)

POCInformation contains a reference to a Contact, Organisation or Role dataset.
@since 3.1.0
*/
    @XmlElement(name = "POCInformation")
      private  Set<POCInformation> pocInformation;
/**
US:StationLoc (Required)

Station (US) defines one or more transmitters or receivers or a combination of transmitters and receivers, including the accessory

Divergence from SMADEF: When exchanging data with NATO, only one Stat
@since 3.1.0
*/
    @XmlElement(name = "StationLoc", required = true)
      private  Set<StationLoc> stationLoc;

/**
Get the unique identifier of one of the stations used by this Assignment at this specific Station. A Station dataset may have more than one discrete station.

@return the StationID value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getStationID() {
        return stationID;
    }

/**
Set the unique identifier of one of the stations used by this Assignment at this specific Station. A Station dataset may have more than one discrete station.

@param value the StationID value in a {@link TS100} data type
@since 3.1.0
*/
public void setStationID(S100 value) {
        this.stationID = value;
    }

/**
Determine if the StationID is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStationID() {
        return (this.stationID!= null);
    }

/**
Get the call sign assigned to the transmitting station. It can be an internationally allocated call sign or the tactical call sign assigned by the operational authority when the Station is used within a Net. For navigational aids, enter the NAVAIDS identifier.

@return the CallSign value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getCallSign() {
        return callSign;
    }

/**
Set the call sign assigned to the transmitting station. It can be an internationally allocated call sign or the tactical call sign assigned by the operational authority when the Station is used within a Net. For navigational aids, enter the NAVAIDS identifier.

@param value the CallSign value in a {@link TS20} data type
@since 3.1.0
*/
public void setCallSign(S20 value) {
        this.callSign = value;
    }

/**
Determine if the CallSign is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCallSign() {
        return (this.callSign!= null);
    }

/**
Get the minimum required frequency separation between the equipment for which the assignment is being made and any other equipment operating at the same location. Enter:
- For a fixed frequency assignment, the required frequency separation in MHz (without unit), between this equipment and other equipment operated at one location. If the frequency separation is unknown use the NATO recommended frequency separation requirements are listed below.
0.5 (MHz) for a transmitter power below 24.8 dBW (300 watts);
2 (MHz) for a transmitter power above 24.8 dBW (300 watts);
2.0 through 9.9 (MHz) for exceptionally high transmitter powers or difficult cosite constraints.
- For a HAVE QUICK II or SATURN frequency hopping assignments, one of the following values:
0 - Instantaneous separation may be as small as 25 kHz;
4 - Minimum separation is 4 MHz;
8 - Minimum separation is 8 MHz;
12 - Minimum separation is 12 MHz

@return the CositeSep value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getCositeSep() {
        return cositeSep;
    }

/**
Set the minimum required frequency separation between the equipment for which the assignment is being made and any other equipment operating at the same location. Enter:
- For a fixed frequency assignment, the required frequency separation in MHz (without unit), between this equipment and other equipment operated at one location. If the frequency separation is unknown use the NATO recommended frequency separation requirements are listed below.
0.5 (MHz) for a transmitter power below 24.8 dBW (300 watts);
2 (MHz) for a transmitter power above 24.8 dBW (300 watts);
2.0 through 9.9 (MHz) for exceptionally high transmitter powers or difficult cosite constraints.
- For a HAVE QUICK II or SATURN frequency hopping assignments, one of the following values:
0 - Instantaneous separation may be as small as 25 kHz;
4 - Minimum separation is 4 MHz;
8 - Minimum separation is 8 MHz;
12 - Minimum separation is 12 MHz

@param value the CositeSep value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setCositeSep(FreqM value) {
        this.cositeSep = value;
    }

/**
Determine if the CositeSep is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCositeSep() {
        return (this.cositeSep!= null);
    }

/**
Get a free text description of the minimum required frequency separation between a number of transmitters, or between a transmitter and a related receiver in radio relay frequency requests.

@return the CositeSepDescription value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getCositeSepDescription() {
        return cositeSepDescription;
    }

/**
Set a free text description of the minimum required frequency separation between a number of transmitters, or between a transmitter and a related receiver in radio relay frequency requests.

@param value the CositeSepDescription value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setCositeSepDescription(MEMO value) {
        this.cositeSepDescription = value;
    }

/**
Determine if the CositeSepDescription is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCositeSepDescription() {
        return (this.cositeSepDescription!= null);
    }

/**
Get the number of mobile units (equipment). These units do not necessarily operate simultaneously in the same electromagnetic environment.

@return the NumMobileUnits value in a {@link TUN9} data type
@since 3.1.0
*/
public UN9 getNumMobileUnits() {
        return numMobileUnits;
    }

/**
Set the number of mobile units (equipment). These units do not necessarily operate simultaneously in the same electromagnetic environment.

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
Get 

@return the TSDF value in a {@link TTSDFValue} data type
@since 3.1.0
*/
public TSDFValue getTSDF() {
        return tsdf;
    }

/**
Set 

@param value the TSDF value in a {@link TTSDFValue} data type
@since 3.1.0
*/
public void setTSDF(TSDFValue value) {
        this.tsdf = value;
    }

/**
Determine if the TSDF is configured.

If configured this method also inspects the {@link TSDFValue} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTSDF() {
        return (this.tsdf!= null);
    }

/**
Get a code identifying the user of the station.

@return the UserCode value in a {@link TS6} data type
@since 3.1.0
*/
public S6 getUserCode() {
        return userCode;
    }

/**
Set a code identifying the user of the station.

@param value the UserCode value in a {@link TS6} data type
@since 3.1.0
*/
public void setUserCode(S6 value) {
        this.userCode = value;
    }

/**
Determine if the UserCode is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetUserCode() {
        return (this.userCode!= null);
    }

/**
Get the overall height, of the antenna support structure above ground level.

@return the AntStructureHeight value in a {@link TAntHeight} data type
@since 3.1.0
*/
public AntHeight getAntStructureHeight() {
        return antStructureHeight;
    }

/**
Set the overall height, of the antenna support structure above ground level.

@param value the AntStructureHeight value in a {@link TAntHeight} data type
@since 3.1.0
*/
public void setAntStructureHeight(AntHeight value) {
        this.antStructureHeight = value;
    }

/**
Determine if the AntStructureHeight is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAntStructureHeight() {
        return (this.antStructureHeight!= null);
    }

/**
Get a short descriptive name for the station. This must be unique within the dataset.

@return the StationName value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getStationName() {
        return stationName;
    }

/**
Set a short descriptive name for the station. This must be unique within the dataset.

@param value the StationName value in a {@link TS100} data type
@since 3.1.0
*/
public void setStationName(S100 value) {
        this.stationName = value;
    }

/**
Determine if the StationName is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStationName() {
        return (this.stationName!= null);
    }

/**
Get the operating unit that controls the station when different than the assignment users.

@return the StationControl value in a {@link TS18} data type
@since 3.1.0
*/
public S18 getStationControl() {
        return stationControl;
    }

/**
Set the operating unit that controls the station when different than the assignment users.

@param value the StationControl value in a {@link TS18} data type
@since 3.1.0
*/
public void setStationControl(S18 value) {
        this.stationControl = value;
    }

/**
Determine if the StationControl is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStationControl() {
        return (this.stationControl!= null);
    }

/**
Get whether this station is the station of primary regulatory interest.

@return the PrimaryStation value in a {@link TString} data type
@since 3.1.0
*/
public TString getPrimaryStation() {
        return primaryStation;
    }

/**
Set whether this station is the station of primary regulatory interest.

@param value the PrimaryStation value in a {@link TString} data type
@since 3.1.0
*/
public void setPrimaryStation(TString value) {
        this.primaryStation = value;
    }

/**
Determine if the PrimaryStation is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPrimaryStation() {
return (this.primaryStation!= null ? this.primaryStation.isSetValue() : false);
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
Get the US:StationLoc

Complex element Station (US) defines one or more transmitters or receivers or a combination of transmitters and receivers, including the accessory
equipment necessary at one location for carrying on a radiocommunication, radiolocation, or other spectrum
dependent function.

@return  a {@link StationLoc} instance
@since 3.1.0
*/
    public Set<StationLoc> getStationLoc() {
        if (stationLoc == null) {
            stationLoc = new HashSet<StationLoc>();
        }
        return this.stationLoc;
    }

/**
Determine if the StationLoc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStationLoc() {
        return ((this.stationLoc!= null)&&(!this.stationLoc.isEmpty()));
    }

/**
  Clear the StationLoc field. This sets the field to null.
 */
    public void unsetStationLoc() {
        this.stationLoc = null;
    }

/**
Set the unique identifier of one of the stations used by this Assignment at this specific Station. A Station dataset may have more than one discrete station.

@param value  An instances of type {@link TS100}
@return The current Station object instance
@since 3.1.0
*/
    public Station withStationID(TS100 value) {
        return this;
    }

/**
Set the call sign assigned to the transmitting station. It can be an internationally allocated call sign or the tactical call sign assigned by the operational authority when the Station is used within a Net. For navigational aids, enter the NAVAIDS identifier.

@param value  An instances of type {@link String}
@return The current Station object instance
@since 3.1.0
*/
    public Station withCallSign(String value) {
           setCallSign(new S20(value));
        return this;
    }

/**
Set the minimum required frequency separation between the equipment for which the assignment is being made and any other equipment operating at the same location. Enter:
- For a fixed frequency assignment, the required frequency separation in MHz (without unit), between this equipment and other equipment operated at one location. If the frequency separation is unknown use the NATO recommended frequency separation requirements are listed below.
0.5 (MHz) for a transmitter power below 24.8 dBW (300 watts);
2 (MHz) for a transmitter power above 24.8 dBW (300 watts);
2.0 through 9.9 (MHz) for exceptionally high transmitter powers or difficult cosite constraints.
- For a HAVE QUICK II or SATURN frequency hopping assignments, one of the following values:
0 - Instantaneous separation may be as small as 25 kHz;
4 - Minimum separation is 4 MHz;
8 - Minimum separation is 8 MHz;
12 - Minimum separation is 12 MHz

@param value  An instances of type {@link Double}
@return The current Station object instance
@since 3.1.0
*/
    public Station withCositeSep(Double value) {
           setCositeSep(new FreqM(value));
        return this;
    }

/**
Set a free text description of the minimum required frequency separation between a number of transmitters, or between a transmitter and a related receiver in radio relay frequency requests.

@param value  An instances of type {@link String}
@return The current Station object instance
@since 3.1.0
*/
    public Station withCositeSepDescription(String value) {
           setCositeSepDescription(new MEMO(value));
        return this;
    }

/**
Set the number of mobile units (equipment). These units do not necessarily operate simultaneously in the same electromagnetic environment.

@param value  An instances of type {@link Integer}
@return The current Station object instance
@since 3.1.0
*/
    public Station withNumMobileUnits(Integer value) {
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
@return The current Station object instance
@since 3.1.0
*/
    public Station withNumAreaUnits(Integer value) {
           setNumAreaUnits(new UN9(value));
        return this;
    }

/**
Set the maximum number of units (equipment) that will be operating simultaneously in the same cosite environment. A cosite situation occurs when several antennas are within the near field of each other.

@param value  An instances of type {@link Integer}
@return The current Station object instance
@since 3.1.0
*/
    public Station withNumCositedUnits(Integer value) {
           setNumCositedUnits(new UN9(value));
        return this;
    }

/**
Set 

@param value  An instances of type {@link String}
@return The current Station object instance
@since 3.1.0
*/
    public Station withTSDF(String value) {
           setTSDF(new TSDFValue(value));
        return this;
    }

/**
Set a code identifying the user of the station.

@param value  An instances of type {@link String}
@return The current Station object instance
@since 3.1.0
*/
    public Station withUserCode(String value) {
           setUserCode(new S6(value));
        return this;
    }

/**
Set the overall height, of the antenna support structure above ground level.

@param value  An instances of type {@link Integer}
@return The current Station object instance
@since 3.1.0
*/
    public Station withAntStructureHeight(Integer value) {
           setAntStructureHeight(new AntHeight(value));
        return this;
    }

/**
Set a short descriptive name for the station. This must be unique within the dataset.

@param value  An instances of type {@link String}
@return The current Station object instance
@since 3.1.0
*/
    public Station withStationName(String value) {
           setStationName(new S100(value));
        return this;
    }

/**
Set the operating unit that controls the station when different than the assignment users.

@param value  An instances of type {@link String}
@return The current Station object instance
@since 3.1.0
*/
    public Station withStationControl(String value) {
           setStationControl(new S18(value));
        return this;
    }

/**
Set whether this station is the station of primary regulatory interest.

@param value  An instances of type {@link ListCBO}
@return The current Station object instance
@since 3.1.0
*/
    public Station withPrimaryStation(ListCBO value) {
           setPrimaryStation(new TString(value.value()));
        return this;
    }

/**
Set the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@param values  One or more instances of type {@link POCInformation...}
@return The current Station object instance
@since 3.1.0
*/
    public Station withPOCInformation(POCInformation... values) {
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
@return The current Station object instance
@since 3.1.0
*/
    public Station withPOCInformation(Collection<POCInformation> values) {
        if (values!= null) {
            getPOCInformation().addAll(values);
        }
        return this;
    }

/**
Set the US:StationLoc

Complex element Station (US) defines one or more transmitters or receivers or a combination of transmitters and receivers, including the accessory
equipment necessary at one location for carrying on a radiocommunication, radiolocation, or other spectrum
dependent function.

@param values  One or more instances of type {@link StationLoc...}
@return The current Station object instance
@since 3.1.0
*/
    public Station withStationLoc(StationLoc... values) {
        if (values!= null) {
            for (StationLoc value: values) {
                getStationLoc().add(value);
            }
        }
        return this;
    }

/**
Set the US:StationLoc

Complex element Station (US) defines one or more transmitters or receivers or a combination of transmitters and receivers, including the accessory
equipment necessary at one location for carrying on a radiocommunication, radiolocation, or other spectrum
dependent function.

@param values  A collection of {@link StationLoc} instances
@return The current Station object instance
@since 3.1.0
*/
    public Station withStationLoc(Collection<StationLoc> values) {
        if (values!= null) {
            getStationLoc().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this Station instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Station {"
 + (antStructureHeight !=null? " antStructureHeight [" + antStructureHeight +"]" : "") 
 + (callSign !=null? " callSign [" + callSign +"]" : "") 
 + (cositeSep !=null? " cositeSep [" + cositeSep +"]" : "") 
 + (cositeSepDescription !=null? " cositeSepDescription [" + cositeSepDescription +"]" : "") 
 + (numAreaUnits !=null? " numAreaUnits [" + numAreaUnits +"]" : "") 
 + (numCositedUnits !=null? " numCositedUnits [" + numCositedUnits +"]" : "") 
 + (numMobileUnits !=null? " numMobileUnits [" + numMobileUnits +"]" : "") 
 + (pocInformation !=null? " pocInformation [" + pocInformation +"]" : "") 
 + (primaryStation !=null? " primaryStation [" + primaryStation +"]" : "") 
 + (stationControl !=null? " stationControl [" + stationControl +"]" : "") 
 + (stationID !=null? " stationID [" + stationID +"]" : "") 
 + (stationLoc !=null? " stationLoc [" + stationLoc +"]" : "") 
 + (stationName !=null? " stationName [" + stationName +"]" : "") 
 + (tsdf !=null? " tsdf [" + tsdf +"]" : "") 
 + (userCode !=null? " userCode [" + userCode +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Station} requires {@link S100 StationID}, {@link Set<StationLoc> StationLoc}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetStationID() &&  isSetStationLoc();
}

}
