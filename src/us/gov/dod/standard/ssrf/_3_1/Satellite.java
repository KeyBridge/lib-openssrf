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
import us.gov.dod.standard.ssrf._3_1.antenna.Nomenclature;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCLS;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCSP;
import us.gov.dod.standard.ssrf._3_1.satellite.EarthStation;
import us.gov.dod.standard.ssrf._3_1.satellite.ServiceArea;

/**
 * Satellite contains station information related to the space service.
 * <p>
 * Sub-Elements are
 * {@link EarthStation}, {@link Nomenclature}, {@link ServiceArea}
 * <p>
 * Example:
 * <pre>
 * &lt;Satellite cls="U"&gt;
 *   &lt;Serial cls="U"&gt;GBR::SA:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;OrbitType cls="U"&gt;GEO Stationary&lt;/OrbitType&gt;
 *   &lt;LaunchStatus cls="U"&gt;Operational&lt;/LaunchStatus&gt;
 *   &lt;GeoNominalLon cls="U"&gt;0053000E&lt;/GeoNominalLon&gt;
 *   &lt;NetworkName cls="U"&gt;SKYNET 4&lt;/NetworkName&gt;
 * &lt;/Satellite&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Satellite", propOrder = {
  "reviewDate",
  "callSign",
  "orbitType",
  "launchStatus",
  "launchLocRef",
  "launchDate",
  "geoNominalLon",
  "geoAltitude",
  "nonGeoPeriod",
  "nonGeoNumSatellites",
  "nonGeoApogee",
  "nonGeoPerigee",
  "nonGeoInclination",
  "internationalDesignator",
  "objectNum",
  "administration",
  "networkName",
  "rfSystemRef",
  "earthStation",
  "serviceArea",
  "nomenclature"
})
public class Satellite extends Common<Satellite> {

  /**
   * ReviewDate - Review Date (Optional)
   * <p>
   * The date by which the dataset is to be reviewed. The Review date should be
   * less than five years from the effective date. Spectrum Supportability
   * datasets, this date indicate when the organisation responsible for
   * re-initiating host coordination plans to resubmit a Spectrum Supportability
   * request to the host nation for continued use of the equipment.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "ReviewDate", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
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
   * OrbitType - Orbit Type (Optional)
   * <p>
   * The type of orbit.
   * <p>
   * Format is L:CSP
   */
  @XmlElement(name = "OrbitType", required = false)
  private TString orbitType;
  /**
   * LaunchStatus - Launch Status (Optional)
   * <p>
   * The status of the satellite.
   * <p>
   * Format is L:CLS
   */
  @XmlElement(name = "LaunchStatus", required = false)
  private TString launchStatus;
  /**
   * LaunchLocRef - Launch Location Serial (Optional)
   * <p>
   * A reference to a Location that identifies the satellite launch location.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "LaunchLocRef", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString launchLocRef;
  /**
   * LaunchDate - Launch Date (Optional)
   * <p>
   * The date of the satellite launch.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "LaunchDate", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar launchDate;
  /**
   * GeoNominalLon - Geostationary Nominal Longitude (Optional)
   * <p>
   * The longitude of the geostationary satellite in the following format:
   * dddmmss[.hh]H, where H represents "E" for East or "W" for West.
   * <p>
   * Format is pattern (S11) (deg)
   */
  @XmlElement(name = "GeoNominalLon", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterLON.class)
  private TString geoNominalLon;
  /**
   * GeoAltitude - Geostationary Altitude (Optional)
   * <p>
   * The altitude of the geostationary satellite, relative to Mean Sea Level
   * (MSL).
   * <p>
   * Format is UN(9,4) (km)
   */
  @XmlElement(name = "GeoAltitude", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDISTSPACE.class)
  private TDecimal geoAltitude;
  /**
   * NonGeoPeriod - Non-Geostationary Period (Optional)
   * <p>
   * The time required for the non-geostationary satellite to make one complete
   * orbit around the earth.
   * <p>
   * Format is UN(10,4) (min)
   */
  @XmlElement(name = "NonGeoPeriod", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMINUTES.class)
  private TDecimal nonGeoPeriod;
  /**
   * NonGeoNumSatellites - Number of Non-Geostationary Satellites (Optional)
   * <p>
   * The number of non-geostationary satellites in a system having similar
   * orbital characteristics.
   * <p>
   * Format is UN(4)
   */
  @XmlElement(name = "NonGeoNumSatellites", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger nonGeoNumSatellites;
  /**
   * NonGeoApogee - Non-Geostationary Apogee (Optional)
   * <p>
   * The maximum altitude of the non-geostationary satellite relative to Mean
   * Sea Level (MSL).
   * <p>
   * Format is UN(9,4) (km)
   */
  @XmlElement(name = "NonGeoApogee", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDISTSPACE.class)
  private TDecimal nonGeoApogee;
  /**
   * NonGeoPerigee - Non-Geostationary Perigee (Optional)
   * <p>
   * The minimum altitude of the non-geostationary satellite relative to Mean
   * Sea Level (MSL).
   * <p>
   * Format is UN(9,4) (km)
   */
  @XmlElement(name = "NonGeoPerigee", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDISTSPACE.class)
  private TDecimal nonGeoPerigee;
  /**
   * NonGeoInclination - Non-Geostationary Inclination (Optional)
   * <p>
   * The angle determined by the plane containing the orbit of the
   * non-geostationary satellite and the equatorial plane of the earth.
   * <p>
   * Format is SN(4,2) [-90..90] (deg)
   */
  @XmlElement(name = "NonGeoInclination", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal nonGeoInclination;
  /**
   * InternationalDesignator - International Designator (Optional)
   * <p>
   * The externally-assigned International Designator for the satellite.
   * <p>
   * Format is S20
   */
  @XmlElement(name = "InternationalDesignator", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS20.class)
  private TString internationalDesignator;
  /**
   * ObjectNum - Object Number (Optional)
   * <p>
   * The USSPACECOM-assigned space object identification number.
   * <p>
   * Format is S20
   */
  @XmlElement(name = "ObjectNum", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS20.class)
  private TString objectNum;
  /**
   * Administration - Notifying Administration (Optional)
   * <p>
   * The country and/or administration which registered the satellite.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Administration", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString administration;
  /**
   * NetworkName - Network Name (Optional)
   * <p>
   * The name of the network to which the satellite belongs.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "NetworkName", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString networkName;
  /**
   * RFSystemRef (Optional)
   * <p>
   * RFSystemRef contains a reference to a RF System used on the satellite.
   */
  @XmlElement(name = "RFSystemRef", nillable = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private Set<TString> rfSystemRef;
  /**
   * EarthStation (Optional)
   * <p>
   * EarthStation contains the name and type of an earth station used in a
   * satellite network.
   */
  @XmlElement(name = "EarthStation")
  private Set<EarthStation> earthStation;
  /**
   * ServiceArea (Optional)
   * <p>
   * ServiceArea contains the geographic area serviced by the satellite.
   */
  @XmlElement(name = "ServiceArea", nillable = true)
  private Set<ServiceArea> serviceArea;
  /**
   * Nomenclature (Optional)
   * <p>
   * Nomenclature identifies either the standard military, government,
   * nomenclature or the commercial model number of an equipment. Each device or
   * group of devices may have several types of nomenclatures, e.g. both a
   * military nomenclature and a commercial model number.
   * <p>
   * Divergence from SMADEF: SMADEF requires (1..n) Nomenclatures
   */
  @XmlElement(name = "Nomenclature")
  private Set<Nomenclature> nomenclature;

  /**
   * Get the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. Spectrum Supportability
   * datasets, this date indicate when the organisation responsible for
   * re-initiating host coordination plans to resubmit a Spectrum Supportability
   * request to the host nation for continued use of the equipment.
   * <p>
   * @return the ReviewDate value in a {@link TCalendar} data type
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. Spectrum Supportability
   * datasets, this date indicate when the organisation responsible for
   * re-initiating host coordination plans to resubmit a Spectrum Supportability
   * request to the host nation for continued use of the equipment.
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
   * Get the type of orbit.
   * <p>
   * @return the OrbitType value in a {@link TString} data type
   */
  public TString getOrbitType() {
    return orbitType;
  }

  /**
   * Set the type of orbit.
   * <p>
   * @param value the OrbitType value in a {@link TString} data type
   */
  public void setOrbitType(TString value) {
    this.orbitType = value;
  }

  /**
   * Determine if the OrbitType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOrbitType() {
    return (this.orbitType != null ? this.orbitType.isSetValue() : false);
  }

  /**
   * Get the status of the satellite.
   * <p>
   * @return the LaunchStatus value in a {@link TString} data type
   */
  public TString getLaunchStatus() {
    return launchStatus;
  }

  /**
   * Set the status of the satellite.
   * <p>
   * @param value the LaunchStatus value in a {@link TString} data type
   */
  public void setLaunchStatus(TString value) {
    this.launchStatus = value;
  }

  /**
   * Determine if the LaunchStatus is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLaunchStatus() {
    return (this.launchStatus != null ? this.launchStatus.isSetValue() : false);
  }

  /**
   * Get a reference to a Location that identifies the satellite launch
   * location.
   * <p>
   * @return the LaunchLocRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLaunchLoc()} instead.
   */
  @Deprecated
  public TString getLaunchLocRef() {
    return launchLocRef;
  }

  /**
   * Set a reference to a Location that identifies the satellite launch
   * location.
   * <p>
   * @param value the LaunchLocRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLaunchLoc(Location)} instead.
   */
  @Deprecated
  public void setLaunchLocRef(TString value) {
    this.launchLocRef = value;
  }

  /**
   * Determine if the LaunchLocRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLaunchLocRef() {
    return (this.launchLocRef != null ? this.launchLocRef.isSetValue() : false);
  }

  /**
   * Get the date of the satellite launch.
   * <p>
   * @return the LaunchDate value in a {@link TCalendar} data type
   */
  public TCalendar getLaunchDate() {
    return launchDate;
  }

  /**
   * Set the date of the satellite launch.
   * <p>
   * @param value the LaunchDate value in a {@link TCalendar} data type
   */
  public void setLaunchDate(TCalendar value) {
    this.launchDate = value;
  }

  /**
   * Determine if the LaunchDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLaunchDate() {
    return (this.launchDate != null ? this.launchDate.isSetValue() : false);
  }

  /**
   * Get the longitude of the geostationary satellite in the following format:
   * dddmmss[.hh]H, where H represents "E" for East or "W" for West.
   * <p>
   * @return the GeoNominalLon value in a {@link TString} data type
   */
  public TString getGeoNominalLon() {
    return geoNominalLon;
  }

  /**
   * Set the longitude of the geostationary satellite in the following format:
   * dddmmss[.hh]H, where H represents "E" for East or "W" for West.
   * <p>
   * @param value the GeoNominalLon value in a {@link TString} data type
   */
  public void setGeoNominalLon(TString value) {
    this.geoNominalLon = value;
  }

  /**
   * Determine if the GeoNominalLon is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGeoNominalLon() {
    return (this.geoNominalLon != null ? this.geoNominalLon.isSetValue() : false);
  }

  /**
   * Get the altitude of the geostationary satellite, relative to Mean Sea Level
   * (MSL).
   * <p>
   * @return the GeoAltitude value in a {@link TDecimal} data type
   */
  public TDecimal getGeoAltitude() {
    return geoAltitude;
  }

  /**
   * Set the altitude of the geostationary satellite, relative to Mean Sea Level
   * (MSL).
   * <p>
   * @param value the GeoAltitude value in a {@link TDecimal} data type
   */
  public void setGeoAltitude(TDecimal value) {
    this.geoAltitude = value;
  }

  /**
   * Determine if the GeoAltitude is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGeoAltitude() {
    return (this.geoAltitude != null ? this.geoAltitude.isSetValue() : false);
  }

  /**
   * Get the time required for the non-geostationary satellite to make one
   * complete orbit around the earth.
   * <p>
   * @return the NonGeoPeriod value in a {@link TDecimal} data type
   */
  public TDecimal getNonGeoPeriod() {
    return nonGeoPeriod;
  }

  /**
   * Set the time required for the non-geostationary satellite to make one
   * complete orbit around the earth.
   * <p>
   * @param value the NonGeoPeriod value in a {@link TDecimal} data type
   */
  public void setNonGeoPeriod(TDecimal value) {
    this.nonGeoPeriod = value;
  }

  /**
   * Determine if the NonGeoPeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNonGeoPeriod() {
    return (this.nonGeoPeriod != null ? this.nonGeoPeriod.isSetValue() : false);
  }

  /**
   * Get the number of non-geostationary satellites in a system having similar
   * orbital characteristics.
   * <p>
   * @return the NonGeoNumSatellites value in a {@link TInteger} data type
   */
  public TInteger getNonGeoNumSatellites() {
    return nonGeoNumSatellites;
  }

  /**
   * Set the number of non-geostationary satellites in a system having similar
   * orbital characteristics.
   * <p>
   * @param value the NonGeoNumSatellites value in a {@link TInteger} data type
   */
  public void setNonGeoNumSatellites(TInteger value) {
    this.nonGeoNumSatellites = value;
  }

  /**
   * Determine if the NonGeoNumSatellites is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNonGeoNumSatellites() {
    return (this.nonGeoNumSatellites != null ? this.nonGeoNumSatellites.isSetValue() : false);
  }

  /**
   * Get the maximum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL).
   * <p>
   * @return the NonGeoApogee value in a {@link TDecimal} data type
   */
  public TDecimal getNonGeoApogee() {
    return nonGeoApogee;
  }

  /**
   * Set the maximum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL).
   * <p>
   * @param value the NonGeoApogee value in a {@link TDecimal} data type
   */
  public void setNonGeoApogee(TDecimal value) {
    this.nonGeoApogee = value;
  }

  /**
   * Determine if the NonGeoApogee is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNonGeoApogee() {
    return (this.nonGeoApogee != null ? this.nonGeoApogee.isSetValue() : false);
  }

  /**
   * Get the minimum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL).
   * <p>
   * @return the NonGeoPerigee value in a {@link TDecimal} data type
   */
  public TDecimal getNonGeoPerigee() {
    return nonGeoPerigee;
  }

  /**
   * Set the minimum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL).
   * <p>
   * @param value the NonGeoPerigee value in a {@link TDecimal} data type
   */
  public void setNonGeoPerigee(TDecimal value) {
    this.nonGeoPerigee = value;
  }

  /**
   * Determine if the NonGeoPerigee is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNonGeoPerigee() {
    return (this.nonGeoPerigee != null ? this.nonGeoPerigee.isSetValue() : false);
  }

  /**
   * Get the angle determined by the plane containing the orbit of the
   * non-geostationary satellite and the equatorial plane of the earth.
   * <p>
   * @return the NonGeoInclination value in a {@link TDecimal} data type
   */
  public TDecimal getNonGeoInclination() {
    return nonGeoInclination;
  }

  /**
   * Set the angle determined by the plane containing the orbit of the
   * non-geostationary satellite and the equatorial plane of the earth.
   * <p>
   * @param value the NonGeoInclination value in a {@link TDecimal} data type
   */
  public void setNonGeoInclination(TDecimal value) {
    this.nonGeoInclination = value;
  }

  /**
   * Determine if the NonGeoInclination is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNonGeoInclination() {
    return (this.nonGeoInclination != null ? this.nonGeoInclination.isSetValue() : false);
  }

  /**
   * Get the externally-assigned International Designator for the satellite.
   * <p>
   * @return the InternationalDesignator value in a {@link TString} data type
   */
  public TString getInternationalDesignator() {
    return internationalDesignator;
  }

  /**
   * Set the externally-assigned International Designator for the satellite.
   * <p>
   * @param value the InternationalDesignator value in a {@link TString} data
   *              type
   */
  public void setInternationalDesignator(TString value) {
    this.internationalDesignator = value;
  }

  /**
   * Determine if the InternationalDesignator is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInternationalDesignator() {
    return (this.internationalDesignator != null ? this.internationalDesignator.isSetValue() : false);
  }

  /**
   * Get the USSPACECOM-assigned space object identification number.
   * <p>
   * @return the ObjectNum value in a {@link TString} data type
   */
  public TString getObjectNum() {
    return objectNum;
  }

  /**
   * Set the USSPACECOM-assigned space object identification number.
   * <p>
   * @param value the ObjectNum value in a {@link TString} data type
   */
  public void setObjectNum(TString value) {
    this.objectNum = value;
  }

  /**
   * Determine if the ObjectNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObjectNum() {
    return (this.objectNum != null ? this.objectNum.isSetValue() : false);
  }

  /**
   * Get the country and/or administration which registered the satellite.
   * <p>
   * @return the Administration value in a {@link TString} data type
   */
  public TString getAdministration() {
    return administration;
  }

  /**
   * Set the country and/or administration which registered the satellite.
   * <p>
   * @param value the Administration value in a {@link TString} data type
   */
  public void setAdministration(TString value) {
    this.administration = value;
  }

  /**
   * Determine if the Administration is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAdministration() {
    return (this.administration != null ? this.administration.isSetValue() : false);
  }

  /**
   * Get the name of the network to which the satellite belongs.
   * <p>
   * @return the NetworkName value in a {@link TString} data type
   */
  public TString getNetworkName() {
    return networkName;
  }

  /**
   * Set the name of the network to which the satellite belongs.
   * <p>
   * @param value the NetworkName value in a {@link TString} data type
   */
  public void setNetworkName(TString value) {
    this.networkName = value;
  }

  /**
   * Determine if the NetworkName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNetworkName() {
    return (this.networkName != null ? this.networkName.isSetValue() : false);
  }

  /**
   * Get the RFSystemRef
   * <p>
   * Complex element RFSystemRef contains a reference to a RF System used on the
   * satellite.
   * <p>
   * @return a non-null but possibly empty list of {@link TString} instances
   */
  public Set<TString> getRFSystemRef() {
    if (rfSystemRef == null) {
      rfSystemRef = new HashSet<>();
    }
    return this.rfSystemRef;
  }

  /**
   * Determine if the RFSystemRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFSystemRef() {
    return ((this.rfSystemRef != null) && (!this.rfSystemRef.isEmpty()));
  }

  /**
   * Clear the RFSystemRef field. This sets the field to null.
   */
  public void unsetRFSystemRef() {
    this.rfSystemRef = null;
  }

  /**
   * Get the EarthStation
   * <p>
   * Complex element EarthStation contains the name and type of an earth station
   * used in a satellite network.
   * <p>
   * @return a non-null but possibly empty list of {@link EarthStation}
   *         instances
   */
  public Set<EarthStation> getEarthStation() {
    if (earthStation == null) {
      earthStation = new HashSet<>();
    }
    return this.earthStation;
  }

  /**
   * Determine if the EarthStation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEarthStation() {
    return ((this.earthStation != null) && (!this.earthStation.isEmpty()));
  }

  /**
   * Clear the EarthStation field. This sets the field to null.
   */
  public void unsetEarthStation() {
    this.earthStation = null;
  }

  /**
   * Get the ServiceArea
   * <p>
   * Complex element ServiceArea contains the geographic area serviced by the
   * satellite.
   * <p>
   * @return a non-null but possibly empty list of {@link ServiceArea} instances
   */
  public Set<ServiceArea> getServiceArea() {
    if (serviceArea == null) {
      serviceArea = new HashSet<>();
    }
    return this.serviceArea;
  }

  /**
   * Determine if the ServiceArea is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetServiceArea() {
    return ((this.serviceArea != null) && (!this.serviceArea.isEmpty()));
  }

  /**
   * Clear the ServiceArea field. This sets the field to null.
   */
  public void unsetServiceArea() {
    this.serviceArea = null;
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
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. Spectrum Supportability
   * datasets, this date indicate when the organisation responsible for
   * re-initiating host coordination plans to resubmit a Spectrum Supportability
   * request to the host nation for continued use of the equipment.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Satellite object instance
   */
  public Satellite withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. Spectrum Supportability
   * datasets, this date indicate when the organisation responsible for
   * re-initiating host coordination plans to resubmit a Spectrum Supportability
   * request to the host nation for continued use of the equipment.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Satellite object instance
   */
  public Satellite withReviewDate(Date value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   */
  public Satellite withCallSign(String value) {
    setCallSign(new TString(value));
    return this;
  }

  /**
   * Set the type of orbit.
   * <p>
   * @param value An instances of type {@link ListCSP}
   * @return The current Satellite object instance
   */
  public Satellite withOrbitType(ListCSP value) {
    setOrbitType(new TString(value.value()));
    return this;
  }

  /**
   * Set the status of the satellite.
   * <p>
   * @param value An instances of type {@link ListCLS}
   * @return The current Satellite object instance
   */
  public Satellite withLaunchStatus(ListCLS value) {
    setLaunchStatus(new TString(value.value()));
    return this;
  }

  /**
   * Set a reference to a Location that identifies the satellite launch
   * location.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLaunchLoc(Location)} instead.
   */
  @Deprecated
  public Satellite withLaunchLocRef(String value) {
    setLaunchLocRef(new TString(value));
    return this;
  }

  /**
   * Set the date of the satellite launch.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Satellite object instance
   */
  public Satellite withLaunchDate(Calendar value) {
    setLaunchDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date of the satellite launch.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Satellite object instance
   */
  public Satellite withLaunchDate(Date value) {
    setLaunchDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the longitude of the geostationary satellite in the following format:
   * dddmmss[.hh]H, where H represents "E" for East or "W" for West.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   */
  public Satellite withGeoNominalLon(String value) {
    setGeoNominalLon(new TString(value));
    return this;
  }

  /**
   * Set the altitude of the geostationary satellite, relative to Mean Sea Level
   * (MSL).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Satellite object instance
   */
  public Satellite withGeoAltitude(Double value) {
    setGeoAltitude(new TDecimal(value));
    return this;
  }

  /**
   * Set the time required for the non-geostationary satellite to make one
   * complete orbit around the earth.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Satellite object instance
   */
  public Satellite withNonGeoPeriod(Double value) {
    setNonGeoPeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of non-geostationary satellites in a system having similar
   * orbital characteristics.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Satellite object instance
   */
  public Satellite withNonGeoNumSatellites(Integer value) {
    setNonGeoNumSatellites(new TInteger(value));
    return this;
  }

  /**
   * Set the maximum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Satellite object instance
   */
  public Satellite withNonGeoApogee(Double value) {
    setNonGeoApogee(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Satellite object instance
   */
  public Satellite withNonGeoPerigee(Double value) {
    setNonGeoPerigee(new TDecimal(value));
    return this;
  }

  /**
   * Set the angle determined by the plane containing the orbit of the
   * non-geostationary satellite and the equatorial plane of the earth.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Satellite object instance
   */
  public Satellite withNonGeoInclination(Double value) {
    setNonGeoInclination(new TDecimal(value));
    return this;
  }

  /**
   * Set the externally-assigned International Designator for the satellite.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   */
  public Satellite withInternationalDesignator(String value) {
    setInternationalDesignator(new TString(value));
    return this;
  }

  /**
   * Set the USSPACECOM-assigned space object identification number.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   */
  public Satellite withObjectNum(String value) {
    setObjectNum(new TString(value));
    return this;
  }

  /**
   * Set the country and/or administration which registered the satellite.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   */
  public Satellite withAdministration(String value) {
    setAdministration(new TString(value));
    return this;
  }

  /**
   * Set the name of the network to which the satellite belongs.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Satellite object instance
   */
  public Satellite withNetworkName(String value) {
    setNetworkName(new TString(value));
    return this;
  }

  /**
   * Set the RFSystemRef
   * <p>
   * Complex element RFSystemRef contains a reference to a RF System used on the
   * satellite.
   * <p>
   * @param values One or more instances of type {@link TString}
   * @return The current Satellite object instance
   */
  public Satellite withRFSystemRef(TString... values) {
    if (values != null) {
      getRFSystemRef().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the RFSystemRef
   * <p>
   * Complex element RFSystemRef contains a reference to a RF System used on the
   * satellite.
   * <p>
   * @param values A collection of {@link TString} instances
   * @return The current Satellite object instance
   */
  public Satellite withRFSystemRef(Set<TString> values) {
    if (values != null) {
      getRFSystemRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the EarthStation
   * <p>
   * Complex element EarthStation contains the name and type of an earth station
   * used in a satellite network.
   * <p>
   * @param values One or more instances of type {@link EarthStation}
   * @return The current Satellite object instance
   */
  public Satellite withEarthStation(EarthStation... values) {
    if (values != null) {
      getEarthStation().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the EarthStation
   * <p>
   * Complex element EarthStation contains the name and type of an earth station
   * used in a satellite network.
   * <p>
   * @param values A collection of {@link EarthStation} instances
   * @return The current Satellite object instance
   */
  public Satellite withEarthStation(Set<EarthStation> values) {
    if (values != null) {
      getEarthStation().addAll(values);
    }
    return this;
  }

  /**
   * Set the ServiceArea
   * <p>
   * Complex element ServiceArea contains the geographic area serviced by the
   * satellite.
   * <p>
   * @param values One or more instances of type {@link ServiceArea}
   * @return The current Satellite object instance
   */
  public Satellite withServiceArea(ServiceArea... values) {
    if (values != null) {
      getServiceArea().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the ServiceArea
   * <p>
   * Complex element ServiceArea contains the geographic area serviced by the
   * satellite.
   * <p>
   * @param values A collection of {@link ServiceArea} instances
   * @return The current Satellite object instance
   */
  public Satellite withServiceArea(Set<ServiceArea> values) {
    if (values != null) {
      getServiceArea().addAll(values);
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
   * @return The current Satellite object instance
   */
  public Satellite withNomenclature(Nomenclature... values) {
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
   * @return The current Satellite object instance
   */
  public Satellite withNomenclature(Set<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Satellite instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Satellite {"
      + (launchLocRef != null ? " launchLocRef [" + launchLocRef + "]" : "")
      + (nomenclature != null ? " nomenclature [" + nomenclature + "]" : "")
      + (geoAltitude != null ? " geoAltitude [" + geoAltitude + "]" : "")
      + (internationalDesignator != null ? " internationalDesignator [" + internationalDesignator + "]" : "")
      + (objectNum != null ? " objectNum [" + objectNum + "]" : "")
      + (reviewDate != null ? " reviewDate [" + reviewDate + "]" : "")
      + (orbitType != null ? " orbitType [" + orbitType + "]" : "")
      + (nonGeoInclination != null ? " nonGeoInclination [" + nonGeoInclination + "]" : "")
      + (nonGeoPeriod != null ? " nonGeoPeriod [" + nonGeoPeriod + "]" : "")
      + (nonGeoNumSatellites != null ? " nonGeoNumSatellites [" + nonGeoNumSatellites + "]" : "")
      + (rfSystemRef != null ? " rfSystemRef [" + rfSystemRef + "]" : "")
      + (nonGeoApogee != null ? " nonGeoApogee [" + nonGeoApogee + "]" : "")
      + (earthStation != null ? " earthStation [" + earthStation + "]" : "")
      + (callSign != null ? " callSign [" + callSign + "]" : "")
      + (launchStatus != null ? " launchStatus [" + launchStatus + "]" : "")
      + (geoNominalLon != null ? " geoNominalLon [" + geoNominalLon + "]" : "")
      + (networkName != null ? " networkName [" + networkName + "]" : "")
      + (serviceArea != null ? " serviceArea [" + serviceArea + "]" : "")
      + (launchDate != null ? " launchDate [" + launchDate + "]" : "")
      + (administration != null ? " administration [" + administration + "]" : "")
      + (nonGeoPerigee != null ? " nonGeoPerigee [" + nonGeoPerigee + "]" : "")
      + "\n  Satellite." + super.toString() + "\n"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Satellite} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * LaunchLocRef - Launch Location Serial (Optional)
   * <p>
   * A reference to a Location that identifies the satellite launch location.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Location launchLoc;

  /**
   * Get a reference to a Location that identifies the satellite launch
   * location.
   * <p>
   * @return a {@link Location} instance
   * @since 3.1.0
   */
  public Location getLaunchLoc() {
    return launchLoc;
  }

  /**
   * Determine if the launchLoc field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLaunchLoc() {
    return this.launchLoc != null;
  }

  /**
   * Set a reference to a Location that identifies the satellite launch
   * location.
   * <p>
   * @param value An instances of type {@link Location}
   * @return The current Satellite object instance
   * @since 3.1.0
   */
  public Satellite withLaunchLoc(Location value) {
    this.launchLoc = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this Satellite record.
   * <p>
   * This method builds the exported {@link #launchLocRef} field with values
   * from the transient {@link #launchLoc} field. This method should typically
   * be called after the Satellite is configured and (optionally) before
   * exporting an SSRF message.
   */
  @Override
  public void prepare() {
    super.prepare();
    this.launchLocRef = launchLoc != null ? launchLoc.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this Satellite record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #launchLoc} with values from the
   * imported {@link #launchLocRef} field. This method should typically be
   * called after the Satellite is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (launchLocRef == null || !launchLocRef.isSetValue()) {
      return;
    }
    for (Location instance : root.getLocation()) {
      if (launchLocRef.equals(instance.getSerial())) {
        launchLoc = instance;
        return;
      }
    }
  }//</editor-fold>

}
