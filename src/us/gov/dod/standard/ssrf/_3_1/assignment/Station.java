/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.assignment;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "StationID", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString stationID;
  /**
   * CallSign - Call Sign (Optional)
   * <p>
   * The call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * Format is S20
   */
  @XmlElement(name = "CallSign", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS20.class)
  private TString callSign;
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
   */
  @XmlElement(name = "CositeSep", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal cositeSep;
  /**
   * CositeSepDescription - Cosite Separation Description (Optional)
   * <p>
   * A free text description of the minimum required frequency separation
   * between a number of transmitters, or between a transmitter and a related
   * receiver in radio relay frequency requests.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "CositeSepDescription", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString cositeSepDescription;
  /**
   * NumMobileUnits - Number of Mobile Units (Optional)
   * <p>
   * The number of mobile units (equipment). These units do not necessarily
   * operate simultaneously in the same electromagnetic environment.
   * <p>
   * Format is UN(9)
   * <p>
   * Attribute group NumUnits (Optional)
   */
  @XmlElement(name = "NumMobileUnits", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN9.class)
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
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN9.class)
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
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numCositedUnits;
  /**
   * TSDF - Time Slot Duty Factor (Optional)
   * <p>
   * The time slot duty factor assigned to stations of a time division multiple
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
   * Format is S6
   */
  @XmlElement(name = "TSDF", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterTSDFVALUE.class)
  private TString tsdf;
  /**
   * UserCode - User Code (Optional)
   * <p>
   * A code identifying the user of the station.
   * <p>
   * Format is S6
   */
  @XmlElement(name = "UserCode", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS6.class)
  private TString userCode;
  /**
   * US:AntStructureHeight - Antenna Structure Height (Optional)
   * <p>
   * The overall height, of the antenna support structure above ground level.
   * <p>
   * Format is UN(3) (m)
   */
  @XmlElement(name = "AntStructureHeight", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterANTHEIGHT.class)
  private TInteger antStructureHeight;
  /**
   * US:StationName - Station Name (Optional)
   * <p>
   * A short descriptive name for the station. This must be unique within the
   * dataset.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "StationName", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString stationName;
  /**
   * US:StationControl - Station Control (Optional)
   * <p>
   * The operating unit that controls the station when different than the
   * assignment users.
   * <p>
   * Format is S18
   */
  @XmlElement(name = "StationControl", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS18.class)
  private TString stationControl;
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
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
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
   */
  @XmlElement(name = "StationLoc", required = true)
  private Set<StationLoc> stationLoc;

  /**
   * Get the unique identifier of one of the stations used by this Assignment at
   * this specific Station. A Station dataset may have more than one discrete
   * station.
   * <p>
   * @return the StationID value in a {@link TString} data type
   */
  public TString getStationID() {
    return stationID;
  }

  /**
   * Set the unique identifier of one of the stations used by this Assignment at
   * this specific Station. A Station dataset may have more than one discrete
   * station.
   * <p>
   * @param value the StationID value in a {@link TString} data type
   */
  public void setStationID(TString value) {
    this.stationID = value;
  }

  /**
   * Determine if the StationID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
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
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * @return the CallSign value in a {@link TString} data type
   */
  public TString getCallSign() {
    return callSign;
  }

  /**
   * Set the call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * @param value the CallSign value in a {@link TString} data type
   */
  public void setCallSign(TString value) {
    this.callSign = value;
  }

  /**
   * Determine if the CallSign is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
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
   * MHz; 12 - Minimum separation is 12 MHz
   * <p>
   * @return the CositeSep value in a {@link TDecimal} data type
   */
  public TDecimal getCositeSep() {
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
   * MHz; 12 - Minimum separation is 12 MHz
   * <p>
   * @param value the CositeSep value in a {@link TDecimal} data type
   */
  public void setCositeSep(TDecimal value) {
    this.cositeSep = value;
  }

  /**
   * Determine if the CositeSep is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCositeSep() {
    return (this.cositeSep != null ? this.cositeSep.isSetValue() : false);
  }

  /**
   * Get a free text description of the minimum required frequency separation
   * between a number of transmitters, or between a transmitter and a related
   * receiver in radio relay frequency requests.
   * <p>
   * @return the CositeSepDescription value in a {@link TString} data type
   */
  public TString getCositeSepDescription() {
    return cositeSepDescription;
  }

  /**
   * Set a free text description of the minimum required frequency separation
   * between a number of transmitters, or between a transmitter and a related
   * receiver in radio relay frequency requests.
   * <p>
   * @param value the CositeSepDescription value in a {@link TString} data type
   */
  public void setCositeSepDescription(TString value) {
    this.cositeSepDescription = value;
  }

  /**
   * Determine if the CositeSepDescription is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCositeSepDescription() {
    return (this.cositeSepDescription != null ? this.cositeSepDescription.isSetValue() : false);
  }

  /**
   * Get the number of mobile units (equipment). These units do not necessarily
   * operate simultaneously in the same electromagnetic environment.
   * <p>
   * @return the NumMobileUnits value in a {@link TInteger} data type
   */
  public TInteger getNumMobileUnits() {
    return numMobileUnits;
  }

  /**
   * Set the number of mobile units (equipment). These units do not necessarily
   * operate simultaneously in the same electromagnetic environment.
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
   * Get
   * <p>
   * @return the TSDF value in a {@link TString} data type
   */
  public TString getTSDF() {
    return tsdf;
  }

  /**
   * Set
   * <p>
   * @param value the TSDF value in a {@link TString} data type
   */
  public void setTSDF(TString value) {
    this.tsdf = value;
  }

  /**
   * Determine if the TSDF is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTSDF() {
    return (this.tsdf != null ? this.tsdf.isSetValue() : false);
  }

  /**
   * Get a code identifying the user of the station.
   * <p>
   * @return the UserCode value in a {@link TString} data type
   */
  public TString getUserCode() {
    return userCode;
  }

  /**
   * Set a code identifying the user of the station.
   * <p>
   * @param value the UserCode value in a {@link TString} data type
   */
  public void setUserCode(TString value) {
    this.userCode = value;
  }

  /**
   * Determine if the UserCode is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUserCode() {
    return (this.userCode != null ? this.userCode.isSetValue() : false);
  }

  /**
   * Get the overall height, of the antenna support structure above ground
   * level.
   * <p>
   * @return the AntStructureHeight value in a {@link TInteger} data type
   */
  public TInteger getAntStructureHeight() {
    return antStructureHeight;
  }

  /**
   * Set the overall height, of the antenna support structure above ground
   * level.
   * <p>
   * @param value the AntStructureHeight value in a {@link TInteger} data type
   */
  public void setAntStructureHeight(TInteger value) {
    this.antStructureHeight = value;
  }

  /**
   * Determine if the AntStructureHeight is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntStructureHeight() {
    return (this.antStructureHeight != null ? this.antStructureHeight.isSetValue() : false);
  }

  /**
   * Get a short descriptive name for the station. This must be unique within
   * the dataset.
   * <p>
   * @return the StationName value in a {@link TString} data type
   */
  public TString getStationName() {
    return stationName;
  }

  /**
   * Set a short descriptive name for the station. This must be unique within
   * the dataset.
   * <p>
   * @param value the StationName value in a {@link TString} data type
   */
  public void setStationName(TString value) {
    this.stationName = value;
  }

  /**
   * Determine if the StationName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStationName() {
    return (this.stationName != null ? this.stationName.isSetValue() : false);
  }

  /**
   * Get the operating unit that controls the station when different than the
   * assignment users.
   * <p>
   * @return the StationControl value in a {@link TString} data type
   */
  public TString getStationControl() {
    return stationControl;
  }

  /**
   * Set the operating unit that controls the station when different than the
   * assignment users.
   * <p>
   * @param value the StationControl value in a {@link TString} data type
   */
  public void setStationControl(TString value) {
    this.stationControl = value;
  }

  /**
   * Determine if the StationControl is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStationControl() {
    return (this.stationControl != null ? this.stationControl.isSetValue() : false);
  }

  /**
   * Get whether this station is the station of primary regulatory interest.
   * <p>
   * @return the PrimaryStation value in a {@link TString} data type
   */
  public TString getPrimaryStation() {
    return primaryStation;
  }

  /**
   * Set whether this station is the station of primary regulatory interest.
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
   * Get the US:StationLoc
   * <p>
   * Complex element Station (US) defines one or more transmitters or receivers
   * or a combination of transmitters and receivers, including the accessory
   * equipment necessary at one location for carrying on a radiocommunication,
   * radiolocation, or other spectrum dependent function.
   * <p>
   * @return a non-null but possibly empty list of {@link StationLoc} instances
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
   * @param value An instances of type {@link String}
   * @return The current Station object instance
   */
  public Station withStationID(String value) {
    setStationID(new TString(value));
    return this;
  }

  /**
   * Set the call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Station object instance
   */
  public Station withCallSign(String value) {
    setCallSign(new TString(value));
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
   * @param value An instances of type {@link Double}
   * @return The current Station object instance
   */
  public Station withCositeSep(Double value) {
    setCositeSep(new TDecimal(value));
    return this;
  }

  /**
   * Set a free text description of the minimum required frequency separation
   * between a number of transmitters, or between a transmitter and a related
   * receiver in radio relay frequency requests.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Station object instance
   */
  public Station withCositeSepDescription(String value) {
    setCositeSepDescription(new TString(value));
    return this;
  }

  /**
   * Set the number of mobile units (equipment). These units do not necessarily
   * operate simultaneously in the same electromagnetic environment.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Station object instance
   */
  public Station withNumMobileUnits(Integer value) {
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
   * @return The current Station object instance
   */
  public Station withNumAreaUnits(Integer value) {
    setNumAreaUnits(new TInteger(value));
    return this;
  }

  /**
   * Set the maximum number of units (equipment) that will be operating
   * simultaneously in the same cosite environment. A cosite situation occurs
   * when several antennas are within the near field of each other.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Station object instance
   */
  public Station withNumCositedUnits(Integer value) {
    setNumCositedUnits(new TInteger(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Station object instance
   */
  public Station withTSDF(String value) {
    setTSDF(new TString(value));
    return this;
  }

  /**
   * Set a code identifying the user of the station.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Station object instance
   */
  public Station withUserCode(String value) {
    setUserCode(new TString(value));
    return this;
  }

  /**
   * Set the overall height, of the antenna support structure above ground
   * level.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Station object instance
   */
  public Station withAntStructureHeight(Integer value) {
    setAntStructureHeight(new TInteger(value));
    return this;
  }

  /**
   * Set a short descriptive name for the station. This must be unique within
   * the dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Station object instance
   */
  public Station withStationName(String value) {
    setStationName(new TString(value));
    return this;
  }

  /**
   * Set the operating unit that controls the station when different than the
   * assignment users.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Station object instance
   */
  public Station withStationControl(String value) {
    setStationControl(new TString(value));
    return this;
  }

  /**
   * Set whether this station is the station of primary regulatory interest.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Station object instance
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
   * @param values One or more instances of type {@link POCInformation}
   * @return The current Station object instance
   */
  public Station withPOCInformation(POCInformation... values) {
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
   * @return The current Station object instance
   */
  public Station withPOCInformation(Set<POCInformation> values) {
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
   * @param values One or more instances of type {@link StationLoc}
   * @return The current Station object instance
   */
  public Station withStationLoc(StationLoc... values) {
    if (values != null) {
      getStationLoc().addAll(new HashSet<>(Arrays.asList(values)));
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
   * @return The current Station object instance
   */
  public Station withStationLoc(Set<StationLoc> values) {
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
      + (stationLoc != null ? " stationLoc [" + stationLoc + "]" : "")
      + (antStructureHeight != null ? " antStructureHeight [" + antStructureHeight + "]" : "")
      + (primaryStation != null ? " primaryStation [" + primaryStation + "]" : "")
      + (numMobileUnits != null ? " numMobileUnits [" + numMobileUnits + "]" : "")
      + (pocInformation != null ? " pocInformation [" + pocInformation + "]" : "")
      + (userCode != null ? " userCode [" + userCode + "]" : "")
      + (numCositedUnits != null ? " numCositedUnits [" + numCositedUnits + "]" : "")
      + (callSign != null ? " callSign [" + callSign + "]" : "")
      + (stationControl != null ? " stationControl [" + stationControl + "]" : "")
      + (cositeSepDescription != null ? " cositeSepDescription [" + cositeSepDescription + "]" : "")
      + (numAreaUnits != null ? " numAreaUnits [" + numAreaUnits + "]" : "")
      + (stationID != null ? " stationID [" + stationID + "]" : "")
      + (stationName != null ? " stationName [" + stationName + "]" : "")
      + (cositeSep != null ? " cositeSep [" + cositeSep + "]" : "")
      + (tsdf != null ? " tsdf [" + tsdf + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Station} requires
   * {@link TString StationID}, {@link StationLoc StationLoc}.
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
