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
package us.gov.dod.standard.ssrf._3_0.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.contact.POCInformation;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * Java class for Station complex type.
 * <p>
 * Data element Station defines the station, or one of the stations, within the
 * current Assignment dataset. A station is one or more transmitters or
 * receivers or a combination of transmitters and receivers, including the
 * accessory equipment necessary at one location for carrying on a
 * radiocommunication, radiolocation, or other spectrum dependent functions.
 * <p>
 * It may indicate the international call sign assigned to the transmitting
 * station. It also identifies the Location of the Station, and the service
 * volume of an air/ground/air assignment defined as a circle (point location
 * with radius), an ellipse or a polygon, plus a height. For navigational aids,
 * this data item is used for the NAVAIDS identifier instead of a call sign.
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
  "pocInformation",
  "stationLoc"
})
public class Station {

  /**
   * StationID: Enter the nickname for the station; this name should be a
   * meaningful identification of the station, but it can also be automatically
   * generated in some systems. The station identifier may be reflective of the
   * location, such as "ANNAPOLIS 20" which could mean within 20 kilometres of
   * some point in Annapolis, MD. In other instances the identifier could be
   * organisationally related. The identifier MUST be unique within the dataset
   * and SHOULD NOT be modified during the entire lifetime of the dataset.
   * <p>
   * [XSD ERR UNIQUE] Each value of this data item MUST be unique within the
   * parent element.
   */
  @XmlElement(name = "StationID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString stationID;
  /**
   * CallSign: Enter the call sign assigned to the transmitting station. It can
   * be an internationally allocated call sign or the tactical call sign
   * assigned by the operational authority when the Station is used within a
   * Net. For navigational aids, enter the NAVAIDS identifier.
   */
  @XmlElement(name = "CallSign", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString callSign;
  /**
   * CositeSep: This item identifies the minimum required frequency separation
   * between the equipment for which the assignment is being made and any other
   * equipment operating at the same location.
   * <p>
   * For a fixed frequency assignment, the required frequency separation in MHz
   * (without unit), between this equipment and other equipment operated at one
   * location. If the frequency separation is unknown use the NATO recommended
   * frequency separation requirements are listed below. 0.5 (MHz) for a
   * transmitter power below 24.8 dBW (300 watts); 2 (MHz) for a transmitter
   * power above 24.8 dBW (300 watts); 2.0 through 9.9 (MHz) for exceptionally
   * high transmitter powers or difficult cosite constraints.
   * <p>
   * For a HAVE QUICK II or SATURN frequency hopping assignments, one of the
   * following values: <ul>
   * <li>0 - Instantaneous separation may be as small as 25 kHz;</li>
   * <li>4 - Minimum separation is 4 MHz;</li>
   * <li>8 - Minimum separation is 8 MHz;</li>
   * <li>12 - Minimum separation is 12 MHz</li></ul>
   */
  @XmlElement(name = "CositeSep", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal cositeSep;
  /**
   * CositeSepDescription: Enter the minimum frequency separation between a
   * number of transmitters or between a transmitter and a receiver in radio
   * relay frequency requests.
   */
  @XmlElement(name = "CositeSepDescription", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString cositeSepDescription;
  /**
   * NumMobileUnits: Enter the number of mobile units. These units do not
   * necessarily operate simultaneously in the same electromagnetic environment.
   */
  @XmlElement(name = "NumMobileUnits", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numMobileUnits;
  /**
   * NumAreaUnits: Enter the maximum number of units (equipment) that will be
   * operating simultaneously in the same area of operation. An area is
   * generally defined as a country. Enter the number of land mobile stations,
   * ship stations, and transportable stations associated with the current
   * Assignment or SSRequest dataset.
   * <p>
   * Within an Assignment (but not under SSRequest), the number entered shall
   * represent either the exact number of stations or a range of numbers as
   * follows: 10, 30, 100, 300, 1000, 3000, or a multiple of 10000.
   * <p>
   * If the exact number is to be recorded, and it is 10, 30, 100, 300, 1000,
   * 3000, or a multiple of 10000, add one to the number to distinguish it from
   * a figure that represents a range of numbers.
   */
  @XmlElement(name = "NumAreaUnits", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numAreaUnits;
  /**
   * NumCositedUnits: Enter the maximum number of units (equipment) that will be
   * operating simultaneously in the same cosite environment. A cosite situation
   * occurs when several antennas are within the near field of each other.
   */
  @XmlElement(name = "NumCositedUnits", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numCositedUnits;
  /**
   * TSDF: this item contains the time slot duty factor assigned to stations of
   * a time division multiple access (TDMA) system. It is applicable in
   * particular to the MIDS/JTIDS systems as explained in the notes below. For
   * NATO MIDS/JTIDS assignments, enter in value the time slot duty factor
   * expressed as NNN/nn where NNN is the maximum percentage of time that may be
   * used by MIDS/JTIDS users in an operational area (a circle with a 100
   * nautical mile (183.2 km) radius) and nn is the maximum percentage of time
   * that any individual user may be using MIDS/JTIDS. Optionally, use a Remark
   * to add any amplifying information. Notes:
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
   */
  @XmlElement(name = "TSDF", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterTSDFVALUE.class)
  private TString tsdf;
  /**
   * UserCode: Enter a code (nationally determined) identifying the user of the
   * station.
   */
  @XmlElement(name = "UserCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS6.class)
  private TString userCode;
  /**
   * AntStructureHeight (US): Enter the overall height, in meters, of the
   * antenna support structure above ground level.
   */
  @XmlElement(name = "AntStructureHeight", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN3.class)
  private TInteger antStructureHeight;
  /**
   * StationName (US): Enter a short descriptive name for the station. This must
   * be unique within the dataset.
   */
  @XmlElement(name = "StationName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString stationName;
  /**
   * StationControl (US): Enter the operating unit that controls, either
   * electrically or administratively, the station when it is different from the
   * user of the assignment.
   */
  @XmlElement(name = "StationControl", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS18.class)
  private TString stationControl;
  /**
   * Data element POC contains a reference to a Contact, Organisation or Role
   * dataset.
   */
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  /**
   * A list of location references associated with this station.
   * <p>
   * Developer note: At least ONE StationLoc entry is required, and that
   * stationLoc instance must contain either a satellite (locSatRef) or
   * terrestrial location (serviceVolumeLocRef) reference.
   */
  @XmlElement(name = "StationLoc", required = true)
  private List<StationLoc> stationLoc;

  /**
   * Construct a new station with the indicated Station ID.
   * <p>
   * @param stationID this name should be a meaningful identification of the
   *                  station, but it can also be automatically generated
   */
  public Station(String stationID) {
    this.stationID = new TString(stationID);
  }

  /**
   * Construct a new station. You must set the Station ID.
   */
  public Station() {
  }

  /**
   * Gets the value of the stationID property.
   * <p>
   * @return
   */
  public TString getStationID() {
    return stationID;
  }

  /**
   * Sets the value of the stationID property.
   * <p>
   * @param value
   */
  public void setStationID(TString value) {
    this.stationID = value;
  }

  public boolean isSetStationID() {
    return (this.stationID != null);
  }

  /**
   * Gets the value of the callSign property.
   * <p>
   * @return
   */
  public TString getCallSign() {
    return callSign;
  }

  /**
   * Sets the value of the callSign property.
   * <p>
   * @param value
   */
  public void setCallSign(TString value) {
    this.callSign = value;
  }

  public boolean isSetCallSign() {
    return (this.callSign != null);
  }

  /**
   * Gets the value of the cositeSep property.
   * <p>
   * @return
   */
  public TDecimal getCositeSep() {
    return cositeSep;
  }

  /**
   * Sets the value of the cositeSep property.
   * <p>
   * @param value
   */
  public void setCositeSep(TDecimal value) {
    this.cositeSep = value;
  }

  public boolean isSetCositeSep() {
    return (this.cositeSep != null);
  }

  /**
   * Gets the value of the cositeSepDescription property.
   * <p>
   * @return
   */
  public TString getCositeSepDescription() {
    return cositeSepDescription;
  }

  /**
   * Sets the value of the cositeSepDescription property.
   * <p>
   * @param value
   */
  public void setCositeSepDescription(TString value) {
    this.cositeSepDescription = value;
  }

  public boolean isSetCositeSepDescription() {
    return (this.cositeSepDescription != null);
  }

  /**
   * Gets the value of the numMobileUnits property.
   * <p>
   * @return
   */
  public TInteger getNumMobileUnits() {
    return numMobileUnits;
  }

  /**
   * Sets the value of the numMobileUnits property.
   * <p>
   * @param value
   */
  public void setNumMobileUnits(TInteger value) {
    this.numMobileUnits = value;
  }

  public boolean isSetNumMobileUnits() {
    return (this.numMobileUnits != null);
  }

  /**
   * Gets the value of the numAreaUnits property.
   * <p>
   * @return
   */
  public TInteger getNumAreaUnits() {
    return numAreaUnits;
  }

  /**
   * Sets the value of the numAreaUnits property.
   * <p>
   * @param value
   */
  public void setNumAreaUnits(TInteger value) {
    this.numAreaUnits = value;
  }

  public boolean isSetNumAreaUnits() {
    return (this.numAreaUnits != null);
  }

  /**
   * Gets the value of the numCositedUnits property.
   * <p>
   * @return
   */
  public TInteger getNumCositedUnits() {
    return numCositedUnits;
  }

  /**
   * Sets the value of the numCositedUnits property.
   * <p>
   * @param value
   */
  public void setNumCositedUnits(TInteger value) {
    this.numCositedUnits = value;
  }

  public boolean isSetNumCositedUnits() {
    return (this.numCositedUnits != null);
  }

  /**
   * Gets the value of the tsdf property.
   * <p>
   * @return
   */
  public TString getTSDF() {
    return tsdf;
  }

  /**
   * Sets the value of the tsdf property.
   * <p>
   * @param value
   */
  public void setTSDF(TString value) {
    this.tsdf = value;
  }

  public boolean isSetTSDF() {
    return (this.tsdf != null);
  }

  /**
   * Gets the value of the userCode property.
   * <p>
   * @return
   */
  public TString getUserCode() {
    return userCode;
  }

  /**
   * Sets the value of the userCode property.
   * <p>
   * @param value
   */
  public void setUserCode(TString value) {
    this.userCode = value;
  }

  public boolean isSetUserCode() {
    return (this.userCode != null);
  }

  /**
   * Gets the value of the antStructureHeight property.
   * <p>
   * @return
   */
  public TInteger getAntStructureHeight() {
    return antStructureHeight;
  }

  /**
   * Sets the value of the antStructureHeight property.
   * <p>
   * @param value
   */
  public void setAntStructureHeight(TInteger value) {
    this.antStructureHeight = value;
  }

  public boolean isSetAntStructureHeight() {
    return (this.antStructureHeight != null);
  }

  /**
   * Gets the value of the stationName property.
   * <p>
   * @return
   */
  public TString getStationName() {
    return stationName;
  }

  /**
   * Sets the value of the stationName property.
   * <p>
   * @param value
   */
  public void setStationName(TString value) {
    this.stationName = value;
  }

  public boolean isSetStationName() {
    return (this.stationName != null);
  }

  /**
   * Gets the value of the stationControl property.
   * <p>
   * @return
   */
  public TString getStationControl() {
    return stationControl;
  }

  /**
   * Sets the value of the stationControl property.
   * <p>
   * @param value
   */
  public void setStationControl(TString value) {
    this.stationControl = value;
  }

  public boolean isSetStationControl() {
    return (this.stationControl != null);
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
   * Gets the value of the stationLoc property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the stationLoc property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStationLoc().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<StationLoc> getStationLoc() {
    if (stationLoc == null) {
      stationLoc = new ArrayList<>();
    }
    return this.stationLoc;
  }

  public boolean isSetStationLoc() {
    return ((this.stationLoc != null) && (!this.stationLoc.isEmpty()));
  }

  public void unsetStationLoc() {
    this.stationLoc = null;
  }

  public Station withStationID(String value) {
    setStationID(new TString(value));
    return this;
  }

  public Station withCallSign(String value) {
    setCallSign(new TString(value));
    return this;
  }

  public Station withCositeSep(Double value) {
    setCositeSep(new TDecimal(value));
    return this;
  }

  public Station withCositeSepDescription(String value) {
    setCositeSepDescription(new TString(value));
    return this;
  }

  public Station withNumMobileUnits(Integer value) {
    setNumMobileUnits(new TInteger(value));
    return this;
  }

  public Station withNumAreaUnits(Integer value) {
    setNumAreaUnits(new TInteger(value));
    return this;
  }

  public Station withNumCositedUnits(Integer value) {
    setNumCositedUnits(new TInteger(value));
    return this;
  }

  public Station withTSDF(String value) {
    setTSDF(new TString(value));
    return this;
  }

  public Station withUserCode(String value) {
    setUserCode(new TString(value));
    return this;
  }

  public Station withAntStructureHeight(Number value) {
    setAntStructureHeight(new TInteger(value.intValue()));
    return this;
  }

  public Station withStationName(String value) {
    setStationName(new TString(value));
    return this;
  }

  public Station withStationControl(String value) {
    setStationControl(new TString(value));
    return this;
  }

  public Station withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Station withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  public Station withStationLoc(StationLoc... values) {
    if (values != null) {
      getStationLoc().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Station withStationLoc(Collection<StationLoc> values) {
    if (values != null) {
      getStationLoc().addAll(values);
    }
    return this;
  }

}
