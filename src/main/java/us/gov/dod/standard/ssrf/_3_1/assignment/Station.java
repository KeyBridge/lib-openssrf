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
package us.gov.dod.standard.ssrf._3_1.assignment;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.allotment.POCInformation;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;

/**
 * Station defines the station, or one of the stations, within the current
 * Assignment dataset.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * Sub-Elements are {@link POCInformation}, {@link StationLoc}
 * <p>
 * Example:
 * <pre>
 * &lt;Station&gt;
 *   &lt;Name cls="U"&gt;Base Station&lt;/Name&gt;
 *   &lt;CallSign cls="U"&gt;WUH55&lt;/CallSign&gt;
 *   &lt;sub-elements/&gt;
 *   &lt;/Station&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
   * StationID - Station Reference (Required)
   * <p>
   * The unique identifier of one of the stations used by this Assignment at
   * this specific Station. A Station dataset may have more than one discrete
   * station.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StationID", required = true)
  private S100 stationID;
  /**
   * CallSign - Call Sign (Optional)
   * <p>
   * The call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CallSign", required = false)
  private S20 callSign;
  /**
   * CositeSep - Cosite Separation (Optional)
   * <p>
   * The minimum required frequency separation between the equipment for which
   * the assignment is being made and any other equipment operating at the same
   * location. Enter: - For a fixed frequency assignment, the required frequency
   * separation in MHz (without unit), between this equipment and other
   * equipment operated at one location. If the frequency separation is unknown
   * use the NATO recommended frequency separation requirements are listed
   * below. 0.5 (MHz) for a transmitter power below 24.8 dBW (300 watts); 2
   * (MHz) for a transmitter power above 24.8 dBW (300 watts); 2.0 through 9.9
   * (MHz) for exceptionally high transmitter powers or difficult cosite
   * constraints. - For a HAVE QUICK II or SATURN frequency hopping assignments,
   * one of the following values: 0 - Instantaneous separation may be as small
   * as 25 kHz; 4 - Minimum separation is 4 MHz; 8 - Minimum separation is 8
   * MHz; 12 - Minimum separation is 12 MHz
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CositeSep", required = false)
  private FreqM cositeSep;
  /**
   * CositeSepDescription - Cosite Separation Description (Optional)
   * <p>
   * A free text description of the minimum required frequency separation
   * between a number of transmitters, or between a transmitter and a related
   * receiver in radio relay frequency requests.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CositeSepDescription", required = false)
  private MEMO cositeSepDescription;
  /**
   * NumMobileUnits - Number of Mobile Units (Optional)
   * <p>
   * The number of mobile units (equipment). These units do not necessarily
   * operate simultaneously in the same electromagnetic environment.
   * <p>
   * Format is UN(9)
   * <p>
   * Attribute group NumUnits (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumMobileUnits", required = false)
  private UN9 numMobileUnits;
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumAreaUnits", required = false)
  private UN9 numAreaUnits;
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumCositedUnits", required = false)
  private UN9 numCositedUnits;
  /**
   * Time Slot Duty Factor.
   * <p>
   * the time slot duty factor assigned to stations of a time division multiple
   * access (TDMA) system. It is applicable in particular to the MIDS/JTIDS
   * systems as explained in the notes below. For NATO MIDS/JTIDS assignments,
   * enter in value the time slot duty factor expressed as NNN/nn where NNN is
   * the maximum percentage of time that may be used by MIDS/JTIDS users in an
   * operational area (a circle with a 100 nautical mile (183.2 km) radius) and
   * nn is the maximum percentage of time that any individual user may be using
   * MIDS/JTIDS. Optionally, use a Remark to add any amplifying information.
   * <p>
   * Notes:
   * <p>
   * 1. A JTIDS time slot is a 0.0078125 microsecond time interval during which
   * MIDS/JTIDS messages may be transmitted or received.
   * <p>
   * 2. The 40/20 notation specifies that the total MIDS/JTIDS community will
   * not be assigned more than 40% TSDF, with no more than 20% TSDF assigned to
   * a single user. Note that 100% TSDF corresponds to a maximum pulse
   * transmission rate of 396,288 pulses per 12 second period (an average of
   * 33,024 pulses per second). The total number of pulses allowed per 12 second
   * period is 158,515 for 40% TSDF and 79,257 for 20% TSDF. Using all 1536 time
   * slots in each 12 second period, with 258 pulses per time slot with no
   * contention or multinet overlap conditions results in a TSDF of 100%.
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "([0-9]{1,2}|100)/[0-9]{1,2}"
   * <p>
   * pattern (S6) e.g. 40/20
   */
  @XmlElement(name = "TSDF", required = false)
  private TSDFValue tsdf;
  /**
   * UserCode - User Code (Optional)
   * <p>
   * A code identifying the user of the station.
   * <p>
   * Format is S6
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "UserCode", required = false)
  private S6 userCode;
  /**
   * US:AntStructureHeight - Antenna Structure Height (Optional)
   * <p>
   * The overall height, of the antenna support structure above ground level.
   * <p>
   * Format is UN(3) (m)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AntStructureHeight", required = false)
  private AntHeight antStructureHeight;
  /**
   * US:StationName - Station Name (Optional)
   * <p>
   * A short descriptive name for the station. This must be unique within the
   * dataset.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StationName", required = false)
  private S100 stationName;
  /**
   * US:StationControl - Station Control (Optional)
   * <p>
   * The operating unit that controls the station when different than the
   * assignment users.
   * <p>
   * Format is S18
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StationControl", required = false)
  private S18 stationControl;
  /**
   * US:PrimaryStation - Primary Station (Optional)
   * <p>
   * Whether this station is the station of primary regulatory interest.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PrimaryStation", required = false)
  private TString primaryStation;
  /**
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "POCInformation")
  private Set<POCInformation> pocInformation;
  /**
   * US:StationLoc (Required)
   * <p>
   * Station (US) defines one or more transmitters or receivers or a combination
   * of transmitters and receivers, including the accessory
   * <p>
   * Divergence from SMADEF: When exchanging data with NATO, only one Stat
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StationLoc", required = true)
  private Set<StationLoc> stationLoc;

  /**
   * Get the unique identifier of one of the stations used by this Assignment at
   * this specific Station. A Station dataset may have more than one discrete
   * station..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getStationID() {
    return stationID;
  }

  /**
   * Set the unique identifier of one of the stations used by this Assignment at
   * this specific Station. A Station dataset may have more than one discrete
   * station..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setStationID(S100 value) {
    this.stationID = value;
  }

  /**
   * Determine if the StationID is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStationID() {
    return (this.stationID != null ? this.stationID.isSetValue() : false);
  }

  /**
   * Get the call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getCallSign() {
    return callSign;
  }

  /**
   * Set the call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier..
   * <p>
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setCallSign(S20 value) {
    this.callSign = value;
  }

  /**
   * Determine if the CallSign is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCallSign() {
    return (this.callSign != null ? this.callSign.isSetValue() : false);
  }

  /**
   * Get the minimum required frequency separation between the equipment for
   * which the assignment is being made and any other equipment operating at the
   * same location. Enter: - For a fixed frequency assignment, the required
   * frequency separation in MHz (without unit), between this equipment and
   * other equipment operated at one location. If the frequency separation is
   * unknown use the NATO recommended frequency separation requirements are
   * listed below. 0.5 (MHz) for a transmitter power below 24.8 dBW (300 watts);
   * 2 (MHz) for a transmitter power above 24.8 dBW (300 watts); 2.0 through 9.9
   * (MHz) for exceptionally high transmitter powers or difficult cosite
   * constraints. - For a HAVE QUICK II or SATURN frequency hopping assignments,
   * one of the following values: 0 - Instantaneous separation may be as small
   * as 25 kHz; 4 - Minimum separation is 4 MHz; 8 - Minimum separation is 8
   * MHz; 12 - Minimum separation is 12 MHz.
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getCositeSep() {
    return cositeSep;
  }

  /**
   * Set the minimum required frequency separation between the equipment for
   * which the assignment is being made and any other equipment operating at the
   * same location. Enter: - For a fixed frequency assignment, the required
   * frequency separation in MHz (without unit), between this equipment and
   * other equipment operated at one location. If the frequency separation is
   * unknown use the NATO recommended frequency separation requirements are
   * listed below. 0.5 (MHz) for a transmitter power below 24.8 dBW (300 watts);
   * 2 (MHz) for a transmitter power above 24.8 dBW (300 watts); 2.0 through 9.9
   * (MHz) for exceptionally high transmitter powers or difficult cosite
   * constraints. - For a HAVE QUICK II or SATURN frequency hopping assignments,
   * one of the following values: 0 - Instantaneous separation may be as small
   * as 25 kHz; 4 - Minimum separation is 4 MHz; 8 - Minimum separation is 8
   * MHz; 12 - Minimum separation is 12 MHz.
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setCositeSep(FreqM value) {
    this.cositeSep = value;
  }

  /**
   * Determine if the CositeSep is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCositeSep() {
    return (this.cositeSep != null ? this.cositeSep.isSetValue() : false);
  }

  /**
   * Get a free text description of the minimum required frequency separation
   * between a number of transmitters, or between a transmitter and a related
   * receiver in radio relay frequency requests..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getCositeSepDescription() {
    return cositeSepDescription;
  }

  /**
   * Set a free text description of the minimum required frequency separation
   * between a number of transmitters, or between a transmitter and a related
   * receiver in radio relay frequency requests..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setCositeSepDescription(MEMO value) {
    this.cositeSepDescription = value;
  }

  /**
   * Determine if the CositeSepDescription is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCositeSepDescription() {
    return (this.cositeSepDescription != null ? this.cositeSepDescription.isSetValue() : false);
  }

  /**
   * Get the number of mobile units (equipment). These units do not necessarily
   * operate simultaneously in the same electromagnetic environment..
   * <p>
   * @return a {@link UN9} instance
   * @since 3.1.0
   */
  public UN9 getNumMobileUnits() {
    return numMobileUnits;
  }

  /**
   * Set the number of mobile units (equipment). These units do not necessarily
   * operate simultaneously in the same electromagnetic environment..
   * <p>
   * @param value a {@link UN9} instance
   * @since 3.1.0
   */
  public void setNumMobileUnits(UN9 value) {
    this.numMobileUnits = value;
  }

  /**
   * Determine if the NumMobileUnits is configured.
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
   * a figure that represents a range of numbers..
   * <p>
   * @return a {@link UN9} instance
   * @since 3.1.0
   */
  public UN9 getNumAreaUnits() {
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
   * a figure that represents a range of numbers..
   * <p>
   * @param value a {@link UN9} instance
   * @since 3.1.0
   */
  public void setNumAreaUnits(UN9 value) {
    this.numAreaUnits = value;
  }

  /**
   * Determine if the NumAreaUnits is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumAreaUnits() {
    return (this.numAreaUnits != null ? this.numAreaUnits.isSetValue() : false);
  }

  /**
   * Get the maximum number of units (equipment) that will be operating
   * simultaneously in the same cosite environment. A cosite situation occurs
   * when several antennas are within the near field of each other..
   * <p>
   * @return a {@link UN9} instance
   * @since 3.1.0
   */
  public UN9 getNumCositedUnits() {
    return numCositedUnits;
  }

  /**
   * Set the maximum number of units (equipment) that will be operating
   * simultaneously in the same cosite environment. A cosite situation occurs
   * when several antennas are within the near field of each other..
   * <p>
   * @param value a {@link UN9} instance
   * @since 3.1.0
   */
  public void setNumCositedUnits(UN9 value) {
    this.numCositedUnits = value;
  }

  /**
   * Determine if the NumCositedUnits is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumCositedUnits() {
    return (this.numCositedUnits != null ? this.numCositedUnits.isSetValue() : false);
  }

  /**
   * Get .
   * <p>
   * @return the TSDF value in a {@link TSDFValue} data type
   * @since 3.1.0
   */
  public TSDFValue getTSDF() {
    return tsdf;
  }

  /**
   * Set .
   * <p>
   * @param value the TSDF value in a {@link TSDFValue} data type
   * @since 3.1.0
   */
  public void setTSDF(TSDFValue value) {
    this.tsdf = value;
  }

  /**
   * Determine if the TSDF is configured.
   * <p>
   * If configured this method also inspects the {@link TSDFValue} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTSDF() {
    return (this.tsdf != null ? this.tsdf.isSetValue() : false);
  }

  /**
   * Get a code identifying the user of the station..
   * <p>
   * @return a {@link S6} instance
   * @since 3.1.0
   */
  public S6 getUserCode() {
    return userCode;
  }

  /**
   * Set a code identifying the user of the station..
   * <p>
   * @param value a {@link S6} instance
   * @since 3.1.0
   */
  public void setUserCode(S6 value) {
    this.userCode = value;
  }

  /**
   * Determine if the UserCode is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUserCode() {
    return (this.userCode != null ? this.userCode.isSetValue() : false);
  }

  /**
   * Get the overall height, of the antenna support structure above ground
   * level..
   * <p>
   * @return a {@link AntHeight} instance
   * @since 3.1.0
   */
  public AntHeight getAntStructureHeight() {
    return antStructureHeight;
  }

  /**
   * Set the overall height, of the antenna support structure above ground
   * level..
   * <p>
   * @param value a {@link AntHeight} instance
   * @since 3.1.0
   */
  public void setAntStructureHeight(AntHeight value) {
    this.antStructureHeight = value;
  }

  /**
   * Determine if the AntStructureHeight is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntStructureHeight() {
    return (this.antStructureHeight != null ? this.antStructureHeight.isSetValue() : false);
  }

  /**
   * Get a short descriptive name for the station. This must be unique within
   * the dataset..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getStationName() {
    return stationName;
  }

  /**
   * Set a short descriptive name for the station. This must be unique within
   * the dataset..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setStationName(S100 value) {
    this.stationName = value;
  }

  /**
   * Determine if the StationName is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStationName() {
    return (this.stationName != null ? this.stationName.isSetValue() : false);
  }

  /**
   * Get the operating unit that controls the station when different than the
   * assignment users..
   * <p>
   * @return a {@link S18} instance
   * @since 3.1.0
   */
  public S18 getStationControl() {
    return stationControl;
  }

  /**
   * Set the operating unit that controls the station when different than the
   * assignment users..
   * <p>
   * @param value a {@link S18} instance
   * @since 3.1.0
   */
  public void setStationControl(S18 value) {
    this.stationControl = value;
  }

  /**
   * Determine if the StationControl is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStationControl() {
    return (this.stationControl != null ? this.stationControl.isSetValue() : false);
  }

  /**
   * Get whether this station is the station of primary regulatory interest..
   * <p>
   * @return the PrimaryStation value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPrimaryStation() {
    return primaryStation;
  }

  /**
   * Set whether this station is the station of primary regulatory interest..
   * <p>
   * @param value the PrimaryStation value in a {@link TString} data type
   * @since 3.1.0
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
   * Get the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset..
   * <p>
   * @return a {@link POCInformation} instance
   * @since 3.1.0
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
   * Get the US:StationLoc
   * <p>
   * Complex element Station (US) defines one or more transmitters or receivers
   * or a combination of transmitters and receivers, including the accessory
   * equipment necessary at one location for carrying on a radiocommunication,
   * radiolocation, or other spectrum dependent function..
   * <p>
   * @return a {@link StationLoc} instance
   * @since 3.1.0
   */
  public Set<StationLoc> getStationLoc() {
    if (stationLoc == null) {
      stationLoc = new HashSet<>();
    }
    return this.stationLoc;
  }

  /**
   * Determine if the StationLoc is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStationLoc() {
    return ((this.stationLoc != null) && (!this.stationLoc.isEmpty()));
  }

  /**
   * Clear the StationLoc field. This sets the field to null.
   */
  public void unsetStationLoc() {
    this.stationLoc = null;
  }

  /**
   * Set the unique identifier of one of the stations used by this Assignment at
   * this specific Station. A Station dataset may have more than one discrete
   * station.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withStationID(String value) {
    setStationID(new S100(value));
    return this;
  }

  /**
   * Set the call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withCallSign(String value) {
    setCallSign(new S20(value));
    return this;
  }

  /**
   * Set the minimum required frequency separation between the equipment for
   * which the assignment is being made and any other equipment operating at the
   * same location. Enter: - For a fixed frequency assignment, the required
   * frequency separation in MHz (without unit), between this equipment and
   * other equipment operated at one location. If the frequency separation is
   * unknown use the NATO recommended frequency separation requirements are
   * listed below. 0.5 (MHz) for a transmitter power below 24.8 dBW (300 watts);
   * 2 (MHz) for a transmitter power above 24.8 dBW (300 watts); 2.0 through 9.9
   * (MHz) for exceptionally high transmitter powers or difficult cosite
   * constraints. - For a HAVE QUICK II or SATURN frequency hopping assignments,
   * one of the following values: 0 - Instantaneous separation may be as small
   * as 25 kHz; 4 - Minimum separation is 4 MHz; 8 - Minimum separation is 8
   * MHz; 12 - Minimum separation is 12 MHz
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withCositeSep(Double value) {
    setCositeSep(new FreqM(value));
    return this;
  }

  /**
   * Set a free text description of the minimum required frequency separation
   * between a number of transmitters, or between a transmitter and a related
   * receiver in radio relay frequency requests.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withCositeSepDescription(String value) {
    setCositeSepDescription(new MEMO(value));
    return this;
  }

  /**
   * Set the number of mobile units (equipment). These units do not necessarily
   * operate simultaneously in the same electromagnetic environment.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withNumMobileUnits(Integer value) {
    setNumMobileUnits(new UN9(value));
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
   * @param value An instances of type {@link Integer}.
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withNumAreaUnits(Integer value) {
    setNumAreaUnits(new UN9(value));
    return this;
  }

  /**
   * Set the maximum number of units (equipment) that will be operating
   * simultaneously in the same cosite environment. A cosite situation occurs
   * when several antennas are within the near field of each other.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withNumCositedUnits(Integer value) {
    setNumCositedUnits(new UN9(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withTSDF(String value) {
    setTSDF(new TSDFValue(value));
    return this;
  }

  /**
   * Set a code identifying the user of the station.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withUserCode(String value) {
    setUserCode(new S6(value));
    return this;
  }

  /**
   * Set the overall height, of the antenna support structure above ground
   * level.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withAntStructureHeight(Integer value) {
    setAntStructureHeight(new AntHeight(value));
    return this;
  }

  /**
   * Set a short descriptive name for the station. This must be unique within
   * the dataset.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withStationName(String value) {
    setStationName(new S100(value));
    return this;
  }

  /**
   * Set the operating unit that controls the station when different than the
   * assignment users.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withStationControl(String value) {
    setStationControl(new S18(value));
    return this;
  }

  /**
   * Set whether this station is the station of primary regulatory interest.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withPrimaryStation(ListCBO value) {
    setPrimaryStation(new TString(value.value()));
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values One or more instances of type {@link POCInformation...}.
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
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
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:StationLoc
   * <p>
   * Complex element Station (US) defines one or more transmitters or receivers
   * or a combination of transmitters and receivers, including the accessory
   * equipment necessary at one location for carrying on a radiocommunication,
   * radiolocation, or other spectrum dependent function.
   * <p>
   * @param values One or more instances of type {@link StationLoc...}.
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withStationLoc(StationLoc... values) {
    if (values != null) {
      getStationLoc().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:StationLoc
   * <p>
   * Complex element Station (US) defines one or more transmitters or receivers
   * or a combination of transmitters and receivers, including the accessory
   * equipment necessary at one location for carrying on a radiocommunication,
   * radiolocation, or other spectrum dependent function.
   * <p>
   * @param values A collection of {@link StationLoc} instances
   * @return The current Station object instance.
   * @since 3.1.0
   */
  public Station withStationLoc(Collection<StationLoc> values) {
    if (values != null) {
      getStationLoc().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Station instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Station {"
           + (antStructureHeight != null ? " antStructureHeight [" + antStructureHeight + "]" : "")
           + (callSign != null ? " callSign [" + callSign + "]" : "")
           + (cositeSep != null ? " cositeSep [" + cositeSep + "]" : "")
           + (cositeSepDescription != null ? " cositeSepDescription [" + cositeSepDescription + "]" : "")
           + (numAreaUnits != null ? " numAreaUnits [" + numAreaUnits + "]" : "")
           + (numCositedUnits != null ? " numCositedUnits [" + numCositedUnits + "]" : "")
           + (numMobileUnits != null ? " numMobileUnits [" + numMobileUnits + "]" : "")
           + (pocInformation != null ? " pocInformation [" + pocInformation + "]" : "")
           + (primaryStation != null ? " primaryStation [" + primaryStation + "]" : "")
           + (stationControl != null ? " stationControl [" + stationControl + "]" : "")
           + (stationID != null ? " stationID [" + stationID + "]" : "")
           + (stationLoc != null ? " stationLoc [" + stationLoc + "]" : "")
           + (stationName != null ? " stationName [" + stationName + "]" : "")
           + (tsdf != null ? " tsdf [" + tsdf + "]" : "")
           + (userCode != null ? " userCode [" + userCode + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Station} requires {@link S100 StationID}, {@link Set<StationLoc>
   * StationLoc}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetStationID() && isSetStationLoc();
  }

}
