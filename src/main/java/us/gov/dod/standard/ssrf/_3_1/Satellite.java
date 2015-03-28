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
Satellite contains station information related to the space service.

Sub-Elements are {@link EarthStation}, {@link Nomenclature}, {@link ServiceArea}

Example: <pre>
* &lt;Satellite cls="U"&gt;
*   &lt;Serial cls="U"&gt;GBR::SA:123&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;OrbitType cls="U"&gt;GEO Stationary&lt;/OrbitType&gt;
*   &lt;LaunchStatus cls="U"&gt;Operational&lt;/LaunchStatus&gt;
*   &lt;GeoNominalLon cls="U"&gt;0053000E&lt;/GeoNominalLon&gt;
*   &lt;NetworkName cls="U"&gt;SKYNET 4&lt;/NetworkName&gt;
* &lt;/Satellite&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
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
public class Satellite
    extends Common
{

/**
ReviewDate  - Review Date (Optional) 

The date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "ReviewDate", required = false)
    private D reviewDate;
/**
CallSign - Call Sign (Optional) 

The call sign assigned to the transmitting station. It can be an internationally allocated call sign or the tactical call sign assigned by the operational authority when the Station is used within a Net. For navigational aids, enter the NAVAIDS identifier.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "CallSign", required = false)
    private S20 callSign;
/**
OrbitType - Orbit Type (Optional) 

The type of orbit.

Format is L:CSP
@since 3.1.0
*/
    @XmlElement(name = "OrbitType", required = false)
    private TString orbitType;
/**
LaunchStatus - Launch Status (Optional) 

The status of the satellite.

Format is L:CLS
@since 3.1.0
*/
    @XmlElement(name = "LaunchStatus", required = false)
    private TString launchStatus;
/**
LaunchLocRef - Launch Location Serial (Optional) 

A reference to a Location that identifies the satellite launch location.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "LaunchLocRef", required = false)
    private Serial launchLocRef;
/**
LaunchDate - Launch Date (Optional) 

The date of the satellite launch.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "LaunchDate", required = false)
    private D launchDate;
/**
GeoNominalLon - Geostationary Nominal Longitude (Optional) 

The longitude of the geostationary satellite in the following format: dddmmss[.hh]H, where H represents "E" for East or "W" for West.

Format is pattern (S11) (deg)
@since 3.1.0
*/
    @XmlElement(name = "GeoNominalLon", required = false)
    private Lon geoNominalLon;
/**
GeoAltitude - Geostationary Altitude (Optional) 

The altitude of the geostationary satellite, relative to Mean Sea Level (MSL).

Format is UN(9,4) (km)
@since 3.1.0
*/
    @XmlElement(name = "GeoAltitude", required = false)
    private DistSpace geoAltitude;
/**
NonGeoPeriod - Non-Geostationary Period (Optional) 

The time required for the non-geostationary satellite to make one complete orbit around the earth.

Format is UN(10,4) (min)
@since 3.1.0
*/
    @XmlElement(name = "NonGeoPeriod", required = false)
    private minutes nonGeoPeriod;
/**
NonGeoNumSatellites - Number of Non-Geostationary Satellites (Optional) 

The number of non-geostationary satellites in a system having similar orbital characteristics.

Format is UN(4)
@since 3.1.0
*/
    @XmlElement(name = "NonGeoNumSatellites", required = false)
    private UN4 nonGeoNumSatellites;
/**
NonGeoApogee - Non-Geostationary Apogee (Optional) 

The maximum altitude of the non-geostationary satellite relative to Mean Sea Level (MSL).

Format is UN(9,4) (km)
@since 3.1.0
*/
    @XmlElement(name = "NonGeoApogee", required = false)
    private DistSpace nonGeoApogee;
/**
NonGeoPerigee - Non-Geostationary Perigee (Optional) 

The minimum altitude of the non-geostationary satellite relative to Mean Sea Level (MSL).

Format is UN(9,4) (km)
@since 3.1.0
*/
    @XmlElement(name = "NonGeoPerigee", required = false)
    private DistSpace nonGeoPerigee;
/**
NonGeoInclination - Non-Geostationary Inclination (Optional) 

The angle determined by the plane containing the orbit of the non-geostationary satellite and the equatorial plane of the earth.

Format is SN(4,2) [-90..90] (deg)
@since 3.1.0
*/
    @XmlElement(name = "NonGeoInclination", required = false)
    private Elev nonGeoInclination;
/**
InternationalDesignator - International Designator (Optional) 

The externally-assigned International Designator for the satellite.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "InternationalDesignator", required = false)
    private S20 internationalDesignator;
/**
ObjectNum - Object Number (Optional) 

The USSPACECOM-assigned space object identification number.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "ObjectNum", required = false)
    private S20 objectNum;
/**
Administration - Notifying Administration (Optional) 

The country and/or administration which registered the satellite.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Administration", required = false)
    private S100 administration;
/**
NetworkName - Network Name (Optional) 

The name of the network to which the satellite belongs.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "NetworkName", required = false)
    private S50 networkName;
/**
RFSystemRef (Optional)

RFSystemRef contains a reference to a RF System used on the satellite.
@since 3.1.0
*/
    @XmlElement(name = "RFSystemRef", nillable = true)
      private  Set<Serial> rfSystemRef;
/**
EarthStation (Optional)

EarthStation contains the name and type of an earth station used in a satellite network.
@since 3.1.0
*/
    @XmlElement(name = "EarthStation")
      private  Set<EarthStation> earthStation;
/**
ServiceArea (Optional)

ServiceArea contains the geographic area serviced by the satellite.
@since 3.1.0
*/
    @XmlElement(name = "ServiceArea", nillable = true)
      private  Set<ServiceArea> serviceArea;
/**
Nomenclature (Optional)

Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

Divergence from SMADEF: SMADEF requires (1..n) Nomenclatures
@since 3.1.0
*/
    @XmlElement(name = "Nomenclature")
      private  Set<Nomenclature> nomenclature;

/**
Get the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@return the ReviewDate value in a {@link TD} data type
@since 3.1.0
*/
public D getReviewDate() {
        return reviewDate;
    }

/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value the ReviewDate value in a {@link TD} data type
@since 3.1.0
*/
public void setReviewDate(D value) {
        this.reviewDate = value;
    }

/**
Determine if the ReviewDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetReviewDate() {
        return (this.reviewDate!= null);
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
Get the type of orbit.

@return the OrbitType value in a {@link TString} data type
@since 3.1.0
*/
public TString getOrbitType() {
        return orbitType;
    }

/**
Set the type of orbit.

@param value the OrbitType value in a {@link TString} data type
@since 3.1.0
*/
public void setOrbitType(TString value) {
        this.orbitType = value;
    }

/**
Determine if the OrbitType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOrbitType() {
return (this.orbitType!= null ? this.orbitType.isSetValue() : false);
    }

/**
Get the status of the satellite.

@return the LaunchStatus value in a {@link TString} data type
@since 3.1.0
*/
public TString getLaunchStatus() {
        return launchStatus;
    }

/**
Set the status of the satellite.

@param value the LaunchStatus value in a {@link TString} data type
@since 3.1.0
*/
public void setLaunchStatus(TString value) {
        this.launchStatus = value;
    }

/**
Determine if the LaunchStatus is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLaunchStatus() {
return (this.launchStatus!= null ? this.launchStatus.isSetValue() : false);
    }

/**
Get a reference to a Location that identifies the satellite launch location.

@return the LaunchLocRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getLaunchLoc()} instead.
*/
@Deprecated
public Serial getLaunchLocRef() {
        return launchLocRef;
    }

/**
Set a reference to a Location that identifies the satellite launch location.

@param value the LaunchLocRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setLaunchLoc(Location)} instead.
*/
@Deprecated
public void setLaunchLocRef(Serial value) {
        this.launchLocRef = value;
    }

/**
Determine if the LaunchLocRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLaunchLocRef() {
        return (this.launchLocRef!= null);
    }

/**
Get the date of the satellite launch.

@return the LaunchDate value in a {@link TD} data type
@since 3.1.0
*/
public D getLaunchDate() {
        return launchDate;
    }

/**
Set the date of the satellite launch.

@param value the LaunchDate value in a {@link TD} data type
@since 3.1.0
*/
public void setLaunchDate(D value) {
        this.launchDate = value;
    }

/**
Determine if the LaunchDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLaunchDate() {
        return (this.launchDate!= null);
    }

/**
Get the longitude of the geostationary satellite in the following format: dddmmss[.hh]H, where H represents "E" for East or "W" for West.

@return the GeoNominalLon value in a {@link TLon} data type
@since 3.1.0
*/
public Lon getGeoNominalLon() {
        return geoNominalLon;
    }

/**
Set the longitude of the geostationary satellite in the following format: dddmmss[.hh]H, where H represents "E" for East or "W" for West.

@param value the GeoNominalLon value in a {@link TLon} data type
@since 3.1.0
*/
public void setGeoNominalLon(Lon value) {
        this.geoNominalLon = value;
    }

/**
Determine if the GeoNominalLon is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetGeoNominalLon() {
        return (this.geoNominalLon!= null);
    }

/**
Get the altitude of the geostationary satellite, relative to Mean Sea Level (MSL).

@return the GeoAltitude value in a {@link TDistSpace} data type
@since 3.1.0
*/
public DistSpace getGeoAltitude() {
        return geoAltitude;
    }

/**
Set the altitude of the geostationary satellite, relative to Mean Sea Level (MSL).

@param value the GeoAltitude value in a {@link TDistSpace} data type
@since 3.1.0
*/
public void setGeoAltitude(DistSpace value) {
        this.geoAltitude = value;
    }

/**
Determine if the GeoAltitude is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetGeoAltitude() {
        return (this.geoAltitude!= null);
    }

/**
Get the time required for the non-geostationary satellite to make one complete orbit around the earth.

@return the NonGeoPeriod value in a {@link Tminutes} data type
@since 3.1.0
*/
public minutes getNonGeoPeriod() {
        return nonGeoPeriod;
    }

/**
Set the time required for the non-geostationary satellite to make one complete orbit around the earth.

@param value the NonGeoPeriod value in a {@link Tminutes} data type
@since 3.1.0
*/
public void setNonGeoPeriod(minutes value) {
        this.nonGeoPeriod = value;
    }

/**
Determine if the NonGeoPeriod is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNonGeoPeriod() {
        return (this.nonGeoPeriod!= null);
    }

/**
Get the number of non-geostationary satellites in a system having similar orbital characteristics.

@return the NonGeoNumSatellites value in a {@link TUN4} data type
@since 3.1.0
*/
public UN4 getNonGeoNumSatellites() {
        return nonGeoNumSatellites;
    }

/**
Set the number of non-geostationary satellites in a system having similar orbital characteristics.

@param value the NonGeoNumSatellites value in a {@link TUN4} data type
@since 3.1.0
*/
public void setNonGeoNumSatellites(UN4 value) {
        this.nonGeoNumSatellites = value;
    }

/**
Determine if the NonGeoNumSatellites is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNonGeoNumSatellites() {
        return (this.nonGeoNumSatellites!= null);
    }

/**
Get the maximum altitude of the non-geostationary satellite relative to Mean Sea Level (MSL).

@return the NonGeoApogee value in a {@link TDistSpace} data type
@since 3.1.0
*/
public DistSpace getNonGeoApogee() {
        return nonGeoApogee;
    }

/**
Set the maximum altitude of the non-geostationary satellite relative to Mean Sea Level (MSL).

@param value the NonGeoApogee value in a {@link TDistSpace} data type
@since 3.1.0
*/
public void setNonGeoApogee(DistSpace value) {
        this.nonGeoApogee = value;
    }

/**
Determine if the NonGeoApogee is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNonGeoApogee() {
        return (this.nonGeoApogee!= null);
    }

/**
Get the minimum altitude of the non-geostationary satellite relative to Mean Sea Level (MSL).

@return the NonGeoPerigee value in a {@link TDistSpace} data type
@since 3.1.0
*/
public DistSpace getNonGeoPerigee() {
        return nonGeoPerigee;
    }

/**
Set the minimum altitude of the non-geostationary satellite relative to Mean Sea Level (MSL).

@param value the NonGeoPerigee value in a {@link TDistSpace} data type
@since 3.1.0
*/
public void setNonGeoPerigee(DistSpace value) {
        this.nonGeoPerigee = value;
    }

/**
Determine if the NonGeoPerigee is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNonGeoPerigee() {
        return (this.nonGeoPerigee!= null);
    }

/**
Get the angle determined by the plane containing the orbit of the non-geostationary satellite and the equatorial plane of the earth.

@return the NonGeoInclination value in a {@link TElev} data type
@since 3.1.0
*/
public Elev getNonGeoInclination() {
        return nonGeoInclination;
    }

/**
Set the angle determined by the plane containing the orbit of the non-geostationary satellite and the equatorial plane of the earth.

@param value the NonGeoInclination value in a {@link TElev} data type
@since 3.1.0
*/
public void setNonGeoInclination(Elev value) {
        this.nonGeoInclination = value;
    }

/**
Determine if the NonGeoInclination is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNonGeoInclination() {
        return (this.nonGeoInclination!= null);
    }

/**
Get the externally-assigned International Designator for the satellite.

@return the InternationalDesignator value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getInternationalDesignator() {
        return internationalDesignator;
    }

/**
Set the externally-assigned International Designator for the satellite.

@param value the InternationalDesignator value in a {@link TS20} data type
@since 3.1.0
*/
public void setInternationalDesignator(S20 value) {
        this.internationalDesignator = value;
    }

/**
Determine if the InternationalDesignator is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetInternationalDesignator() {
        return (this.internationalDesignator!= null);
    }

/**
Get the USSPACECOM-assigned space object identification number.

@return the ObjectNum value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getObjectNum() {
        return objectNum;
    }

/**
Set the USSPACECOM-assigned space object identification number.

@param value the ObjectNum value in a {@link TS20} data type
@since 3.1.0
*/
public void setObjectNum(S20 value) {
        this.objectNum = value;
    }

/**
Determine if the ObjectNum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetObjectNum() {
        return (this.objectNum!= null);
    }

/**
Get the country and/or administration which registered the satellite.

@return the Administration value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getAdministration() {
        return administration;
    }

/**
Set the country and/or administration which registered the satellite.

@param value the Administration value in a {@link TS100} data type
@since 3.1.0
*/
public void setAdministration(S100 value) {
        this.administration = value;
    }

/**
Determine if the Administration is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAdministration() {
        return (this.administration!= null);
    }

/**
Get the name of the network to which the satellite belongs.

@return the NetworkName value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getNetworkName() {
        return networkName;
    }

/**
Set the name of the network to which the satellite belongs.

@param value the NetworkName value in a {@link TS50} data type
@since 3.1.0
*/
public void setNetworkName(S50 value) {
        this.networkName = value;
    }

/**
Determine if the NetworkName is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNetworkName() {
        return (this.networkName!= null);
    }

/**
Get the RFSystemRef

Complex element RFSystemRef contains a reference to a RF System used on the satellite.

@return  a {@link Serial} instance
@since 3.1.0
*/
    public Set<Serial> getRFSystemRef() {
        if (rfSystemRef == null) {
            rfSystemRef = new HashSet<Serial>();
        }
        return this.rfSystemRef;
    }

/**
Determine if the RFSystemRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFSystemRef() {
        return ((this.rfSystemRef!= null)&&(!this.rfSystemRef.isEmpty()));
    }

/**
  Clear the RFSystemRef field. This sets the field to null.
 */
    public void unsetRFSystemRef() {
        this.rfSystemRef = null;
    }

/**
Get the EarthStation

Complex element EarthStation contains the name and type of an earth station used in a satellite network.

@return  a {@link EarthStation} instance
@since 3.1.0
*/
    public Set<EarthStation> getEarthStation() {
        if (earthStation == null) {
            earthStation = new HashSet<EarthStation>();
        }
        return this.earthStation;
    }

/**
Determine if the EarthStation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEarthStation() {
        return ((this.earthStation!= null)&&(!this.earthStation.isEmpty()));
    }

/**
  Clear the EarthStation field. This sets the field to null.
 */
    public void unsetEarthStation() {
        this.earthStation = null;
    }

/**
Get the ServiceArea

Complex element ServiceArea contains the geographic area serviced by the satellite.

@return  a {@link ServiceArea} instance
@since 3.1.0
*/
    public Set<ServiceArea> getServiceArea() {
        if (serviceArea == null) {
            serviceArea = new HashSet<ServiceArea>();
        }
        return this.serviceArea;
    }

/**
Determine if the ServiceArea is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetServiceArea() {
        return ((this.serviceArea!= null)&&(!this.serviceArea.isEmpty()));
    }

/**
  Clear the ServiceArea field. This sets the field to null.
 */
    public void unsetServiceArea() {
        this.serviceArea = null;
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
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Calendar}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withReviewDate(Calendar value) {
           setReviewDate(new D(value));
        return this;
    }
/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Date}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withReviewDate(Date value) {
           setReviewDate(new D(value));
        return this;
    }

/**
Set the call sign assigned to the transmitting station. It can be an internationally allocated call sign or the tactical call sign assigned by the operational authority when the Station is used within a Net. For navigational aids, enter the NAVAIDS identifier.

@param value  An instances of type {@link String}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withCallSign(String value) {
           setCallSign(new S20(value));
        return this;
    }

/**
Set the type of orbit.

@param value  An instances of type {@link ListCSP}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withOrbitType(ListCSP value) {
           setOrbitType(new TString(value.value()));
        return this;
    }

/**
Set the status of the satellite.

@param value  An instances of type {@link ListCLS}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withLaunchStatus(ListCLS value) {
           setLaunchStatus(new TString(value.value()));
        return this;
    }

/**
Set a reference to a Location that identifies the satellite launch location.

@param value  An instances of type {@link Serial}
@return The current Satellite object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withLaunchLoc(Location)} instead.
*/
@Deprecated
    public Satellite withLaunchLocRef(Serial value) {
           setLaunchLocRef(value);
        return this;
    }

/**
Set the date of the satellite launch.

@param value  An instances of type {@link Calendar}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withLaunchDate(Calendar value) {
           setLaunchDate(new D(value));
        return this;
    }
/**
Set the date of the satellite launch.

@param value  An instances of type {@link Date}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withLaunchDate(Date value) {
           setLaunchDate(new D(value));
        return this;
    }

/**
Set the longitude of the geostationary satellite in the following format: dddmmss[.hh]H, where H represents "E" for East or "W" for West.

@param value  An instances of type {@link String}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withGeoNominalLon(String value) {
           setGeoNominalLon(new Lon(value));
        return this;
    }

/**
Set the altitude of the geostationary satellite, relative to Mean Sea Level (MSL).

@param value  An instances of type {@link Double}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withGeoAltitude(Double value) {
           setGeoAltitude(new DistSpace(value));
        return this;
    }

/**
Set the time required for the non-geostationary satellite to make one complete orbit around the earth.

@param value  An instances of type {@link Double}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withNonGeoPeriod(Double value) {
           setNonGeoPeriod(new minutes(value));
        return this;
    }

/**
Set the number of non-geostationary satellites in a system having similar orbital characteristics.

@param value  An instances of type {@link Integer}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withNonGeoNumSatellites(Integer value) {
           setNonGeoNumSatellites(new UN4(value));
        return this;
    }

/**
Set the maximum altitude of the non-geostationary satellite relative to Mean Sea Level (MSL).

@param value  An instances of type {@link Double}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withNonGeoApogee(Double value) {
           setNonGeoApogee(new DistSpace(value));
        return this;
    }

/**
Set the minimum altitude of the non-geostationary satellite relative to Mean Sea Level (MSL).

@param value  An instances of type {@link Double}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withNonGeoPerigee(Double value) {
           setNonGeoPerigee(new DistSpace(value));
        return this;
    }

/**
Set the angle determined by the plane containing the orbit of the non-geostationary satellite and the equatorial plane of the earth.

@param value  An instances of type {@link Double}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withNonGeoInclination(Double value) {
           setNonGeoInclination(new Elev(value));
        return this;
    }

/**
Set the externally-assigned International Designator for the satellite.

@param value  An instances of type {@link String}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withInternationalDesignator(String value) {
           setInternationalDesignator(new S20(value));
        return this;
    }

/**
Set the USSPACECOM-assigned space object identification number.

@param value  An instances of type {@link String}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withObjectNum(String value) {
           setObjectNum(new S20(value));
        return this;
    }

/**
Set the country and/or administration which registered the satellite.

@param value  An instances of type {@link String}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withAdministration(String value) {
           setAdministration(new S100(value));
        return this;
    }

/**
Set the name of the network to which the satellite belongs.

@param value  An instances of type {@link String}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withNetworkName(String value) {
           setNetworkName(new S50(value));
        return this;
    }

/**
Set the RFSystemRef

Complex element RFSystemRef contains a reference to a RF System used on the satellite.

@param values  One or more instances of type {@link RFSystemRef...}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withRFSystemRef(Serial... values) {
        if (values!= null) {
            for (RFSystemRef value: values) {
                getRFSystemRef().add(value);
            }
        }
        return this;
    }

/**
Set the RFSystemRef

Complex element RFSystemRef contains a reference to a RF System used on the satellite.

@param values  A collection of {@link Serial} instances
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withRFSystemRef(Collection<Serial> values) {
        if (values!= null) {
            getRFSystemRef().addAll(values);
        }
        return this;
    }

/**
Set the EarthStation

Complex element EarthStation contains the name and type of an earth station used in a satellite network.

@param values  One or more instances of type {@link EarthStation...}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withEarthStation(EarthStation... values) {
        if (values!= null) {
            for (EarthStation value: values) {
                getEarthStation().add(value);
            }
        }
        return this;
    }

/**
Set the EarthStation

Complex element EarthStation contains the name and type of an earth station used in a satellite network.

@param values  A collection of {@link EarthStation} instances
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withEarthStation(Collection<EarthStation> values) {
        if (values!= null) {
            getEarthStation().addAll(values);
        }
        return this;
    }

/**
Set the ServiceArea

Complex element ServiceArea contains the geographic area serviced by the satellite.

@param values  One or more instances of type {@link ServiceArea...}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withServiceArea(ServiceArea... values) {
        if (values!= null) {
            for (ServiceArea value: values) {
                getServiceArea().add(value);
            }
        }
        return this;
    }

/**
Set the ServiceArea

Complex element ServiceArea contains the geographic area serviced by the satellite.

@param values  A collection of {@link ServiceArea} instances
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withServiceArea(Collection<ServiceArea> values) {
        if (values!= null) {
            getServiceArea().addAll(values);
        }
        return this;
    }

/**
Set the Nomenclature

Complex element Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

@param values  One or more instances of type {@link Nomenclature...}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withNomenclature(Nomenclature... values) {
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
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withNomenclature(Collection<Nomenclature> values) {
        if (values!= null) {
            getNomenclature().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withCaseNum(CaseNum... values) {
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
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withRemarks(Remarks... values) {
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
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withReleasability(ListCCY... values) {
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
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withRemarkRef(BigInteger... values) {
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
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withExtReferences(BigInteger... values) {
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
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current Satellite object instance
@since 3.1.0
*/
    public Satellite withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this Satellite instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Satellite {"
 + (administration !=null? " administration [" + administration +"]" : "") 
 + (callSign !=null? " callSign [" + callSign +"]" : "") 
 + (earthStation !=null? " earthStation [" + earthStation +"]" : "") 
 + (geoAltitude !=null? " geoAltitude [" + geoAltitude +"]" : "") 
 + (geoNominalLon !=null? " geoNominalLon [" + geoNominalLon +"]" : "") 
 + (internationalDesignator !=null? " internationalDesignator [" + internationalDesignator +"]" : "") 
 + (launchDate !=null? " launchDate [" + launchDate +"]" : "") 
 + (launchLocRef !=null? " launchLocRef [" + launchLocRef +"]" : "") 
 + (launchStatus !=null? " launchStatus [" + launchStatus +"]" : "") 
 + (networkName !=null? " networkName [" + networkName +"]" : "") 
 + (nomenclature !=null? " nomenclature [" + nomenclature +"]" : "") 
 + (nonGeoApogee !=null? " nonGeoApogee [" + nonGeoApogee +"]" : "") 
 + (nonGeoInclination !=null? " nonGeoInclination [" + nonGeoInclination +"]" : "") 
 + (nonGeoNumSatellites !=null? " nonGeoNumSatellites [" + nonGeoNumSatellites +"]" : "") 
 + (nonGeoPerigee !=null? " nonGeoPerigee [" + nonGeoPerigee +"]" : "") 
 + (nonGeoPeriod !=null? " nonGeoPeriod [" + nonGeoPeriod +"]" : "") 
 + (objectNum !=null? " objectNum [" + objectNum +"]" : "") 
 + (orbitType !=null? " orbitType [" + orbitType +"]" : "") 
 + (reviewDate !=null? " reviewDate [" + reviewDate +"]" : "") 
 + (rfSystemRef !=null? " rfSystemRef [" + rfSystemRef +"]" : "") 
 + (serviceArea !=null? " serviceArea [" + serviceArea +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Satellite} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return true;
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
LaunchLocRef - Launch Location Serial (Optional) 

A reference to a Location that identifies the satellite launch location.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Location launchLoc;

/**
Get a reference to a Location that identifies the satellite launch location.

@return  a {@link Location} instance
@since 3.1.0
*/
public Location getLaunchLoc(){
return launchLoc;
}
/**
 Determine if the launchLoc field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetLaunchLoc() {
    return this.launchLoc != null ;
}

/**
Set a reference to a Location that identifies the satellite launch location.

@param value  An instances of type {@link Location}
@return The current Satellite object instance
@since 3.1.0
*/
public Satellite withLaunchLoc(Location value) {
this.launchLoc = value;
return this;
}

  /**
   * Update the SSRF data type references in this Satellite record.
   * <p>
 */
  @Override
public void prepare() {
super.prepare();
this.launchLocRef = launchLoc !=null? launchLoc.getSerial() : null;
}

/**
   * Update the SSRF data type references in this Satellite record after loading from XML.

   * This method builds the transient {@link #launchLoc} with values
   * from the imported {@link #launchLocRef} field. This method should
   * typically be called after the Satellite is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (launchLocRef==null || !launchLocRef.isSetValue() ) {return;}
for(Location instance : root.getLocation()) {
if(launchLocRef.equals(instance.getSerial())){
launchLoc = instance;
return;}
}}//</editor-fold>

}
