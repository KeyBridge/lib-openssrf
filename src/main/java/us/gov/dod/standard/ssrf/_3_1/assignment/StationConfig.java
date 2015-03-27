/* 
 * Copyright 2014 Key Bridge LLC.
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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAU;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCO;

/**
 * StationConfig describes one couple (station, configuration) used for
 * transmitting and/or receiving in the current Link. It may also contain
 * additional antenna pointing/blanking parameters.
 * <p>
 * Element of {@link Link}
 * <p>
 * Sub-Element is {@link Blanking}
 * <p>
 * Example:
 * <pre>
 * &lt;StationConfig&gt;
 *   &lt;Type cls="U"&gt;Transmit-Receive&lt;/Type&gt;
 *   &lt;ConfigID cls="U"&gt;CONFIG 1&lt;/ConfigID&gt;
 *   &lt;StationID cls="U"&gt;STATION 1&lt;/StationID&gt;
 * &lt;/StationConfig&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationConfig", propOrder = {
  "type",
  "configID",
  "stationID",
  "eirpMin",
  "eirpMax",
  "antFeedpointHeight",
  "feedlineLength",
  "feedlineLoss",
  "earthCoverage",
  "pointingAzMin",
  "pointingAzMax",
  "pointingElevMin",
  "pointingElevMax",
  "coordinationNum",
  "blanking"
})
public class StationConfig {

  /**
   * Type - Station Type (Required)
   * <p>
   * Whether the StationConfig is acting as a transmitter, receiver or
   * transceiver.
   * <p>
   * Format is L:CAU
   */
  @XmlElement(name = "Type", required = true)
  private TString type;
  /**
   * ConfigID - Configuration Reference (Required)
   * <p>
   * The unique identifier of one the configurations used by this Assignment at
   * this specific Station.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "ConfigID", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString configID;
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
   * EIRPMin - Minimum or Nominal EIRP (Optional)
   * <p>
   * The minimum or nominal effective isotropic radiated power (EIRP) radiated
   * from the transmitter antenna. It is the sum of the power supplied to the
   * antenna and the gain of the antenna, less the line loss.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * Attribute group EIRP (Optional)
   */
  @XmlElement(name = "EIRPMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal eirpMin;
  /**
   * EIRPMax - Maximum EIRP (Optional)
   * <p>
   * The maximum effective isotropic radiated power (EIRP) radiated from the
   * transmitter antenna. It is the sum of the power supplied to the antenna and
   * the gain of the antenna, less the line loss.
   * <p>
   * [XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * Attribute group EIRP (Optional)
   */
  @XmlElement(name = "EIRPMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal eirpMax;
  /**
   * AntFeedpointHeight - Antenna Feedpoint Height (Optional)
   * <p>
   * The antenna feed point height above the terrain, in metres. In Data Item
   * the case where the antenna is mounted pointing vertically to a reflector on
   * the same structure, enter the height of the reflector above ground. If the
   * Station is a flying object, this data represents the maximum altitude of
   * the object above ground.
   * <p>
   * Format is UN(5) (m)
   */
  @XmlElement(name = "AntFeedpointHeight", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterHEIGHT_UN4.class)
  private TInteger antFeedpointHeight;
  /**
   * FeedlineLength - Feedline length (Optional)
   * <p>
   * The length of the antenna feed line.
   * <p>
   * Format is SN(7,2) (m)
   */
  @XmlElement(name = "FeedlineLength", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal feedlineLength;
  /**
   * FeedlineLoss - Feedline total loss (Optional)
   * <p>
   * The total loss of the antenna feed line.
   * <p>
   * Format is SN(6,3) (dB)
   */
  @XmlElement(name = "FeedlineLoss", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal feedlineLoss;
  /**
   * EarthCoverage - Satellite Earth Coverage (Optional)
   * <p>
   * The area of earth coverage.
   * <p>
   * Format is L:CCO
   */
  @XmlElement(name = "EarthCoverage", required = false)
  private TString earthCoverage;
  /**
   * PointingAzMin - Pointing Minimum/Nominal Azimuth (Optional)
   * <p>
   * The starting azimuth if an azimuth range is reported; otherwise, enter a
   * single azimuth. This is considered the left limit of an azimuth range when
   * an azimuth range is entered.
   * <p>
   * Format is UN(5,2) (deg)
   */
  @XmlElement(name = "PointingAzMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal pointingAzMin;
  /**
   * PointingAzMax - Pointing Maximum Azimuth (Optional)
   * <p>
   * The maximum antenna azimuth angle. A range can be used to identify a scan
   * or automated or manual adjustment range. Use "0" or "360" for true north.
   * <p>
   * [XSL ERR MINMAX] If PointingAzMax is used, it MUST be greater than
   * PointingAzMin.
   * <p>
   * Format is UN(5,2) (deg)
   */
  @XmlElement(name = "PointingAzMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal pointingAzMax;
  /**
   * PointingElevMin - Pointing Minimum/Nominal Elevation (Optional)
   * <p>
   * The minimum antenna elevation angle. Use "-90" for straight down and "90"
   * for directly overhead. A range can be used to identify a scan or automated
   * or manual adjustment range.
   * <p>
   * Format is SN(4,2) (deg)
   */
  @XmlElement(name = "PointingElevMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal pointingElevMin;
  /**
   * PointingElevMax - Pointing Maximum Elevation (Optional)
   * <p>
   * The maximum antenna elevation angle. Use "-90" for straight down and "90"
   * for directly overhead. A range can be used to identify a scan or automated
   * or manual adjustment range.
   * <p>
   * [XSL ERR MINMAX] If PointingElevMax is used, it MUST be greater than
   * PointingElevMin.
   * <p>
   * Format is SN(4,2) (deg)
   */
  @XmlElement(name = "PointingElevMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal pointingElevMax;
  /**
   * US:CoordinationNum - Coordination Number (Optional)
   * <p>
   * The US Military Communications-Electronics Board (MCEB) identifier assigned
   * to the equipment or system. (e.g., "J/F 12/12345")
   * <p>
   * Format is S15
   */
  @XmlElement(name = "CoordinationNum", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS15.class)
  private TString coordinationNum;
  /**
   * Blanking (Optional)
   * <p>
   * Blanking contains the start and stop angles of a horizontal and/or vertical
   * sector that is blanked.
   */
  @XmlElement(name = "Blanking")
  private Set<Blanking> blanking;

  /**
   * Get whether the StationConfig is acting as a transmitter, receiver or
   * transceiver.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set whether the StationConfig is acting as a transmitter, receiver or
   * transceiver.
   * <p>
   * @param value the Type value in a {@link TString} data type
   */
  public void setType(TString value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

  /**
   * Get the unique identifier of one the configurations used by this Assignment
   * at this specific Station.
   * <p>
   * @return the ConfigID value in a {@link TString} data type
   */
  public TString getConfigID() {
    return configID;
  }

  /**
   * Set the unique identifier of one the configurations used by this Assignment
   * at this specific Station.
   * <p>
   * @param value the ConfigID value in a {@link TString} data type
   */
  public void setConfigID(TString value) {
    this.configID = value;
  }

  /**
   * Determine if the ConfigID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfigID() {
    return (this.configID != null ? this.configID.isSetValue() : false);
  }

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
   * Get the minimum or nominal effective isotropic radiated power (EIRP)
   * radiated from the transmitter antenna. It is the sum of the power supplied
   * to the antenna and the gain of the antenna, less the line loss.
   * <p>
   * @return the EIRPMin value in a {@link TDecimal} data type
   */
  public TDecimal getEIRPMin() {
    return eirpMin;
  }

  /**
   * Set the minimum or nominal effective isotropic radiated power (EIRP)
   * radiated from the transmitter antenna. It is the sum of the power supplied
   * to the antenna and the gain of the antenna, less the line loss.
   * <p>
   * @param value the EIRPMin value in a {@link TDecimal} data type
   */
  public void setEIRPMin(TDecimal value) {
    this.eirpMin = value;
  }

  /**
   * Determine if the EIRPMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEIRPMin() {
    return (this.eirpMin != null ? this.eirpMin.isSetValue() : false);
  }

  /**
   * Get the maximum effective isotropic radiated power (EIRP) radiated from the
   * transmitter antenna. It is the sum of the power supplied to the antenna and
   * the gain of the antenna, less the line loss.
   * <p>
   * [XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.
   * <p>
   * @return the EIRPMax value in a {@link TDecimal} data type
   */
  public TDecimal getEIRPMax() {
    return eirpMax;
  }

  /**
   * Set the maximum effective isotropic radiated power (EIRP) radiated from the
   * transmitter antenna. It is the sum of the power supplied to the antenna and
   * the gain of the antenna, less the line loss.
   * <p>
   * [XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.
   * <p>
   * @param value the EIRPMax value in a {@link TDecimal} data type
   */
  public void setEIRPMax(TDecimal value) {
    this.eirpMax = value;
  }

  /**
   * Determine if the EIRPMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEIRPMax() {
    return (this.eirpMax != null ? this.eirpMax.isSetValue() : false);
  }

  /**
   * Get the antenna feed point height above the terrain, in metres. In Data
   * Item the case where the antenna is mounted pointing vertically to a
   * reflector on the same structure, enter the height of the reflector above
   * ground. If the Station is a flying object, this data represents the maximum
   * altitude of the object above ground.
   * <p>
   * @return the AntFeedpointHeight value in a {@link TInteger} data type
   */
  public TInteger getAntFeedpointHeight() {
    return antFeedpointHeight;
  }

  /**
   * Set the antenna feed point height above the terrain, in metres. In Data
   * Item the case where the antenna is mounted pointing vertically to a
   * reflector on the same structure, enter the height of the reflector above
   * ground. If the Station is a flying object, this data represents the maximum
   * altitude of the object above ground.
   * <p>
   * @param value the AntFeedpointHeight value in a {@link TInteger} data type
   */
  public void setAntFeedpointHeight(TInteger value) {
    this.antFeedpointHeight = value;
  }

  /**
   * Determine if the AntFeedpointHeight is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntFeedpointHeight() {
    return (this.antFeedpointHeight != null ? this.antFeedpointHeight.isSetValue() : false);
  }

  /**
   * Get the length of the antenna feed line.
   * <p>
   * @return the FeedlineLength value in a {@link TDecimal} data type
   */
  public TDecimal getFeedlineLength() {
    return feedlineLength;
  }

  /**
   * Set the length of the antenna feed line.
   * <p>
   * @param value the FeedlineLength value in a {@link TDecimal} data type
   */
  public void setFeedlineLength(TDecimal value) {
    this.feedlineLength = value;
  }

  /**
   * Determine if the FeedlineLength is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFeedlineLength() {
    return (this.feedlineLength != null ? this.feedlineLength.isSetValue() : false);
  }

  /**
   * Get the total loss of the antenna feed line.
   * <p>
   * @return the FeedlineLoss value in a {@link TDecimal} data type
   */
  public TDecimal getFeedlineLoss() {
    return feedlineLoss;
  }

  /**
   * Set the total loss of the antenna feed line.
   * <p>
   * @param value the FeedlineLoss value in a {@link TDecimal} data type
   */
  public void setFeedlineLoss(TDecimal value) {
    this.feedlineLoss = value;
  }

  /**
   * Determine if the FeedlineLoss is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFeedlineLoss() {
    return (this.feedlineLoss != null ? this.feedlineLoss.isSetValue() : false);
  }

  /**
   * Get the area of earth coverage.
   * <p>
   * @return the EarthCoverage value in a {@link TString} data type
   */
  public TString getEarthCoverage() {
    return earthCoverage;
  }

  /**
   * Set the area of earth coverage.
   * <p>
   * @param value the EarthCoverage value in a {@link TString} data type
   */
  public void setEarthCoverage(TString value) {
    this.earthCoverage = value;
  }

  /**
   * Determine if the EarthCoverage is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEarthCoverage() {
    return (this.earthCoverage != null ? this.earthCoverage.isSetValue() : false);
  }

  /**
   * Get the starting azimuth if an azimuth range is reported; otherwise, enter
   * a single azimuth. This is considered the left limit of an azimuth range
   * when an azimuth range is entered.
   * <p>
   * @return the PointingAzMin value in a {@link TDecimal} data type
   */
  public TDecimal getPointingAzMin() {
    return pointingAzMin;
  }

  /**
   * Set the starting azimuth if an azimuth range is reported; otherwise, enter
   * a single azimuth. This is considered the left limit of an azimuth range
   * when an azimuth range is entered.
   * <p>
   * @param value the PointingAzMin value in a {@link TDecimal} data type
   */
  public void setPointingAzMin(TDecimal value) {
    this.pointingAzMin = value;
  }

  /**
   * Determine if the PointingAzMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPointingAzMin() {
    return (this.pointingAzMin != null ? this.pointingAzMin.isSetValue() : false);
  }

  /**
   * Get the maximum antenna azimuth angle. A range can be used to identify a
   * scan or automated or manual adjustment range. Use "0" or "360" for true
   * north.
   * <p>
   * [XSL ERR MINMAX] If PointingAzMax is used, it MUST be greater than
   * PointingAzMin.
   * <p>
   * @return the PointingAzMax value in a {@link TDecimal} data type
   */
  public TDecimal getPointingAzMax() {
    return pointingAzMax;
  }

  /**
   * Set the maximum antenna azimuth angle. A range can be used to identify a
   * scan or automated or manual adjustment range. Use "0" or "360" for true
   * north.
   * <p>
   * [XSL ERR MINMAX] If PointingAzMax is used, it MUST be greater than
   * PointingAzMin.
   * <p>
   * @param value the PointingAzMax value in a {@link TDecimal} data type
   */
  public void setPointingAzMax(TDecimal value) {
    this.pointingAzMax = value;
  }

  /**
   * Determine if the PointingAzMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPointingAzMax() {
    return (this.pointingAzMax != null ? this.pointingAzMax.isSetValue() : false);
  }

  /**
   * Get the minimum antenna elevation angle. Use "-90" for straight down and
   * "90" for directly overhead. A range can be used to identify a scan or
   * automated or manual adjustment range.
   * <p>
   * @return the PointingElevMin value in a {@link TDecimal} data type
   */
  public TDecimal getPointingElevMin() {
    return pointingElevMin;
  }

  /**
   * Set the minimum antenna elevation angle. Use "-90" for straight down and
   * "90" for directly overhead. A range can be used to identify a scan or
   * automated or manual adjustment range.
   * <p>
   * @param value the PointingElevMin value in a {@link TDecimal} data type
   */
  public void setPointingElevMin(TDecimal value) {
    this.pointingElevMin = value;
  }

  /**
   * Determine if the PointingElevMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPointingElevMin() {
    return (this.pointingElevMin != null ? this.pointingElevMin.isSetValue() : false);
  }

  /**
   * Get the maximum antenna elevation angle. Use "-90" for straight down and
   * "90" for directly overhead. A range can be used to identify a scan or
   * automated or manual adjustment range.
   * <p>
   * [XSL ERR MINMAX] If PointingElevMax is used, it MUST be greater than
   * PointingElevMin.
   * <p>
   * @return the PointingElevMax value in a {@link TDecimal} data type
   */
  public TDecimal getPointingElevMax() {
    return pointingElevMax;
  }

  /**
   * Set the maximum antenna elevation angle. Use "-90" for straight down and
   * "90" for directly overhead. A range can be used to identify a scan or
   * automated or manual adjustment range.
   * <p>
   * [XSL ERR MINMAX] If PointingElevMax is used, it MUST be greater than
   * PointingElevMin.
   * <p>
   * @param value the PointingElevMax value in a {@link TDecimal} data type
   */
  public void setPointingElevMax(TDecimal value) {
    this.pointingElevMax = value;
  }

  /**
   * Determine if the PointingElevMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPointingElevMax() {
    return (this.pointingElevMax != null ? this.pointingElevMax.isSetValue() : false);
  }

  /**
   * Get the US Military Communications-Electronics Board (MCEB) identifier
   * assigned to the equipment or system. (e.g., "J/F 12/12345")
   * <p>
   * @return the CoordinationNum value in a {@link TString} data type
   */
  public TString getCoordinationNum() {
    return coordinationNum;
  }

  /**
   * Set the US Military Communications-Electronics Board (MCEB) identifier
   * assigned to the equipment or system. (e.g., "J/F 12/12345")
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
   * Get the Blanking
   * <p>
   * Complex element Blanking contains the start and stop angles of a horizontal
   * and/or vertical sector that is blanked.
   * <p>
   * @return a non-null but possibly empty list of {@link Blanking} instances
   */
  public Set<Blanking> getBlanking() {
    if (blanking == null) {
      blanking = new HashSet<>();
    }
    return this.blanking;
  }

  /**
   * Determine if the Blanking is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBlanking() {
    return ((this.blanking != null) && (!this.blanking.isEmpty()));
  }

  /**
   * Clear the Blanking field. This sets the field to null.
   */
  public void unsetBlanking() {
    this.blanking = null;
  }

  /**
   * Set whether the StationConfig is acting as a transmitter, receiver or
   * transceiver.
   * <p>
   * @param value An instances of type {@link ListCAU}
   * @return The current StationConfig object instance
   */
  public StationConfig withType(ListCAU value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the unique identifier of one the configurations used by this Assignment
   * at this specific Station.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current StationConfig object instance
   */
  public StationConfig withConfigID(String value) {
    setConfigID(new TString(value));
    return this;
  }

  /**
   * Set the unique identifier of one of the stations used by this Assignment at
   * this specific Station. A Station dataset may have more than one discrete
   * station.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current StationConfig object instance
   */
  public StationConfig withStationID(String value) {
    setStationID(new TString(value));
    return this;
  }

  /**
   * Set the minimum or nominal effective isotropic radiated power (EIRP)
   * radiated from the transmitter antenna. It is the sum of the power supplied
   * to the antenna and the gain of the antenna, less the line loss.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current StationConfig object instance
   */
  public StationConfig withEIRPMin(Double value) {
    setEIRPMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum effective isotropic radiated power (EIRP) radiated from the
   * transmitter antenna. It is the sum of the power supplied to the antenna and
   * the gain of the antenna, less the line loss.
   * <p>
   * [XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current StationConfig object instance
   */
  public StationConfig withEIRPMax(Double value) {
    setEIRPMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the antenna feed point height above the terrain, in metres. In Data
   * Item the case where the antenna is mounted pointing vertically to a
   * reflector on the same structure, enter the height of the reflector above
   * ground. If the Station is a flying object, this data represents the maximum
   * altitude of the object above ground.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current StationConfig object instance
   */
  public StationConfig withAntFeedpointHeight(Integer value) {
    setAntFeedpointHeight(new TInteger(value));
    return this;
  }

  /**
   * Set the antenna feed point height above the terrain, in metres. In Data
   * Item the case where the antenna is mounted pointing vertically to a
   * reflector on the same structure, enter the height of the reflector above
   * ground. If the Station is a flying object, this data represents the maximum
   * altitude of the object above ground.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current StationConfig object instance
   */
  public StationConfig withAntFeedpointHeight(Double value) {
    setAntFeedpointHeight(new TInteger(value));
    return this;
  }

  /**
   * Set the length of the antenna feed line.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current StationConfig object instance
   */
  public StationConfig withFeedlineLength(Double value) {
    setFeedlineLength(new TDecimal(value));
    return this;
  }

  /**
   * Set the total loss of the antenna feed line.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current StationConfig object instance
   */
  public StationConfig withFeedlineLoss(Double value) {
    setFeedlineLoss(new TDecimal(value));
    return this;
  }

  /**
   * Set the area of earth coverage.
   * <p>
   * @param value An instances of type {@link ListCCO}
   * @return The current StationConfig object instance
   */
  public StationConfig withEarthCoverage(ListCCO value) {
    setEarthCoverage(new TString(value.value()));
    return this;
  }

  /**
   * Set the starting azimuth if an azimuth range is reported; otherwise, enter
   * a single azimuth. This is considered the left limit of an azimuth range
   * when an azimuth range is entered.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current StationConfig object instance
   */
  public StationConfig withPointingAzMin(Double value) {
    setPointingAzMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum antenna azimuth angle. A range can be used to identify a
   * scan or automated or manual adjustment range. Use "0" or "360" for true
   * north.
   * <p>
   * [XSL ERR MINMAX] If PointingAzMax is used, it MUST be greater than
   * PointingAzMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current StationConfig object instance
   */
  public StationConfig withPointingAzMax(Double value) {
    setPointingAzMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum antenna elevation angle. Use "-90" for straight down and
   * "90" for directly overhead. A range can be used to identify a scan or
   * automated or manual adjustment range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current StationConfig object instance
   */
  public StationConfig withPointingElevMin(Double value) {
    setPointingElevMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum antenna elevation angle. Use "-90" for straight down and
   * "90" for directly overhead. A range can be used to identify a scan or
   * automated or manual adjustment range.
   * <p>
   * [XSL ERR MINMAX] If PointingElevMax is used, it MUST be greater than
   * PointingElevMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current StationConfig object instance
   */
  public StationConfig withPointingElevMax(Double value) {
    setPointingElevMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the US Military Communications-Electronics Board (MCEB) identifier
   * assigned to the equipment or system. (e.g., "J/F 12/12345")
   * <p>
   * @param value An instances of type {@link String}
   * @return The current StationConfig object instance
   */
  public StationConfig withCoordinationNum(String value) {
    setCoordinationNum(new TString(value));
    return this;
  }

  /**
   * Set the Blanking
   * <p>
   * Complex element Blanking contains the start and stop angles of a horizontal
   * and/or vertical sector that is blanked.
   * <p>
   * @param values One or more instances of type {@link Blanking}
   * @return The current StationConfig object instance
   */
  public StationConfig withBlanking(Blanking... values) {
    if (values != null) {
      getBlanking().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the Blanking
   * <p>
   * Complex element Blanking contains the start and stop angles of a horizontal
   * and/or vertical sector that is blanked.
   * <p>
   * @param values A collection of {@link Blanking} instances
   * @return The current StationConfig object instance
   */
  public StationConfig withBlanking(Set<Blanking> values) {
    if (values != null) {
      getBlanking().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this StationConfig instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "StationConfig {"
      + (eirpMin != null ? " eirpMin [" + eirpMin + "]" : "")
      + (coordinationNum != null ? " coordinationNum [" + coordinationNum + "]" : "")
      + (eirpMax != null ? " eirpMax [" + eirpMax + "]" : "")
      + (feedlineLength != null ? " feedlineLength [" + feedlineLength + "]" : "")
      + (stationID != null ? " stationID [" + stationID + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + (configID != null ? " configID [" + configID + "]" : "")
      + (antFeedpointHeight != null ? " antFeedpointHeight [" + antFeedpointHeight + "]" : "")
      + (pointingAzMax != null ? " pointingAzMax [" + pointingAzMax + "]" : "")
      + (feedlineLoss != null ? " feedlineLoss [" + feedlineLoss + "]" : "")
      + (pointingElevMin != null ? " pointingElevMin [" + pointingElevMin + "]" : "")
      + (pointingElevMax != null ? " pointingElevMax [" + pointingElevMax + "]" : "")
      + (earthCoverage != null ? " earthCoverage [" + earthCoverage + "]" : "")
      + (blanking != null ? " blanking [" + blanking + "]" : "")
      + (pointingAzMin != null ? " pointingAzMin [" + pointingAzMin + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link StationConfig} requires
   * {@link TString ConfigID}, {@link TString StationID}, {@link TString Type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetConfigID() && isSetStationID() && isSetType();
  }

}
