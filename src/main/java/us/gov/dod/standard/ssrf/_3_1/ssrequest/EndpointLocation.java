package us.gov.dod.standard.ssrf._3_1.ssrequest;

import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
EndpointLocation defines locations where the diagram endpoint is allowed or forbidden from use.

Element of {@link DiagramEndpoint}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointLocation", propOrder = {
    "antennaHeight",
    "excluded",
    "locSatRef",
    "minPointAngle",
    "siteElevation"
})
public class EndpointLocation {

/**
AntennaHeight  - Antenna Height (Optional) 

The antenna height above the ground level. 

Format is SN(7,2) (m)
@since 3.1.0
*/
    @XmlElement(name = "AntennaHeight", required = false)
    private Altitude antennaHeight;
/**
Excluded  - Exclude Location (Optional) 

Whether the referenced Location is included or excluded at this diagram endpoint.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Excluded", required = false)
    private TString excluded;
/**
LocSatRef - Location or Satellite Reference (Optional) 

A reference to a geographic location or satellite associated with this diagram endpoint.
Note for the USA: When coordinating with NTIA, a location is required for base stations and repeaters of trunking systems and satellite ground stations, and satellite orbital characteristics are required for space systems.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "LocSatRef", required = false)
    private Serial locSatRef;
/**
MinPointAngle  - Minimum Pointing Angle (Optional) 

The minimum vertical pointing angle for satellite ground station antennas.

Format is UN(5,2) [0..180] (deg)
@since 3.1.0
*/
    @XmlElement(name = "MinPointAngle", required = false)
    private Az180 minPointAngle;
/**
SiteElevation  - Site Elevation (Optional) 

The site elevation of each base station and repeater in a trunking system.

Format is SN(7,2) (m)
@since 3.1.0
*/
    @XmlElement(name = "SiteElevation", required = false)
    private Altitude siteElevation;

/**
Get the antenna height above the ground level. 

@return the AntennaHeight value in a {@link TAltitude} data type
@since 3.1.0
*/
public Altitude getAntennaHeight() {
        return antennaHeight;
    }

/**
Set the antenna height above the ground level. 

@param value the AntennaHeight value in a {@link TAltitude} data type
@since 3.1.0
*/
public void setAntennaHeight(Altitude value) {
        this.antennaHeight = value;
    }

/**
Determine if the AntennaHeight is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAntennaHeight() {
        return (this.antennaHeight!= null);
    }

/**
Get whether the referenced Location is included or excluded at this diagram endpoint.

@return the Excluded value in a {@link TString} data type
@since 3.1.0
*/
public TString getExcluded() {
        return excluded;
    }

/**
Set whether the referenced Location is included or excluded at this diagram endpoint.

@param value the Excluded value in a {@link TString} data type
@since 3.1.0
*/
public void setExcluded(TString value) {
        this.excluded = value;
    }

/**
Determine if the Excluded is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetExcluded() {
return (this.excluded!= null ? this.excluded.isSetValue() : false);
    }

/**
Get a reference to a geographic location or satellite associated with this diagram endpoint.
Note for the USA: When coordinating with NTIA, a location is required for base stations and repeaters of trunking systems and satellite ground stations, and satellite orbital characteristics are required for space systems.

@return the LocSatRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getLocSat()} instead.
*/
@Deprecated
public Serial getLocSatRef() {
        return locSatRef;
    }

/**
Set a reference to a geographic location or satellite associated with this diagram endpoint.
Note for the USA: When coordinating with NTIA, a location is required for base stations and repeaters of trunking systems and satellite ground stations, and satellite orbital characteristics are required for space systems.

@param value the LocSatRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setLocSat(Common)} instead.
*/
@Deprecated
public void setLocSatRef(Serial value) {
        this.locSatRef = value;
    }

/**
Determine if the LocSatRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLocSatRef() {
        return (this.locSatRef!= null);
    }

/**
Get the minimum vertical pointing angle for satellite ground station antennas.

@return the MinPointAngle value in a {@link TAz180} data type
@since 3.1.0
*/
public Az180 getMinPointAngle() {
        return minPointAngle;
    }

/**
Set the minimum vertical pointing angle for satellite ground station antennas.

@param value the MinPointAngle value in a {@link TAz180} data type
@since 3.1.0
*/
public void setMinPointAngle(Az180 value) {
        this.minPointAngle = value;
    }

/**
Determine if the MinPointAngle is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMinPointAngle() {
        return (this.minPointAngle!= null);
    }

/**
Get the site elevation of each base station and repeater in a trunking system.

@return the SiteElevation value in a {@link TAltitude} data type
@since 3.1.0
*/
public Altitude getSiteElevation() {
        return siteElevation;
    }

/**
Set the site elevation of each base station and repeater in a trunking system.

@param value the SiteElevation value in a {@link TAltitude} data type
@since 3.1.0
*/
public void setSiteElevation(Altitude value) {
        this.siteElevation = value;
    }

/**
Determine if the SiteElevation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSiteElevation() {
        return (this.siteElevation!= null);
    }

/**
Set the antenna height above the ground level. 

@param value  An instances of type {@link Double}
@return The current EndpointLocation object instance
@since 3.1.0
*/
    public EndpointLocation withAntennaHeight(Double value) {
           setAntennaHeight(new Altitude(value));
        return this;
    }

/**
Set whether the referenced Location is included or excluded at this diagram endpoint.

@param value  An instances of type {@link ListCBO}
@return The current EndpointLocation object instance
@since 3.1.0
*/
    public EndpointLocation withExcluded(ListCBO value) {
           setExcluded(new TString(value.value()));
        return this;
    }

/**
Set a reference to a geographic location or satellite associated with this diagram endpoint.
Note for the USA: When coordinating with NTIA, a location is required for base stations and repeaters of trunking systems and satellite ground stations, and satellite orbital characteristics are required for space systems.

@param value  An instances of type {@link Serial}
@return The current EndpointLocation object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withLocSat(Common)} instead.
*/
@Deprecated
    public EndpointLocation withLocSatRef(Serial value) {
           setLocSatRef(value);
        return this;
    }

/**
Set the minimum vertical pointing angle for satellite ground station antennas.

@param value  An instances of type {@link Double}
@return The current EndpointLocation object instance
@since 3.1.0
*/
    public EndpointLocation withMinPointAngle(Double value) {
           setMinPointAngle(new Az180(value));
        return this;
    }

/**
Set the site elevation of each base station and repeater in a trunking system.

@param value  An instances of type {@link Double}
@return The current EndpointLocation object instance
@since 3.1.0
*/
    public EndpointLocation withSiteElevation(Double value) {
           setSiteElevation(new Altitude(value));
        return this;
    }

/**
 Get a string representation of this EndpointLocation instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "EndpointLocation {"
 + (antennaHeight !=null? " antennaHeight [" + antennaHeight +"]" : "") 
 + (excluded !=null? " excluded [" + excluded +"]" : "") 
 + (locSatRef !=null? " locSatRef [" + locSatRef +"]" : "") 
 + (minPointAngle !=null? " minPointAngle [" + minPointAngle +"]" : "") 
 + (siteElevation !=null? " siteElevation [" + siteElevation +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link EndpointLocation} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
LocSatRef - Location or Satellite Reference (Optional) 

A reference to a geographic location or satellite associated with this diagram endpoint.
Note for the USA: When coordinating with NTIA, a location is required for base stations and repeaters of trunking systems and satellite ground stations, and satellite orbital characteristics are required for space systems.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Common<?> locSat;

/**
Get a reference to a geographic location or satellite associated with this diagram endpoint.
Note for the USA: When coordinating with NTIA, a location is required for base stations and repeaters of trunking systems and satellite ground stations, and satellite orbital characteristics are required for space systems.

@return  a {@link Common} instance
@since 3.1.0
*/
public Common<?> getLocSat(){
return locSat;
}
/**
 Determine if the locSat field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetLocSat() {
    return this.locSat != null ;
}

/**
Set a reference to a geographic location or satellite associated with this diagram endpoint.
Note for the USA: When coordinating with NTIA, a location is required for base stations and repeaters of trunking systems and satellite ground stations, and satellite orbital characteristics are required for space systems.

@param value  An instances of type {@link Common<?>}
@return The current EndpointLocation object instance
@since 3.1.0
*/
public EndpointLocation withLocSat(Common<?> value) {
this.locSat = value;
return this;
}

  /**
   * Update the SSRF data type references in this EndpointLocation record.
   * <p>
 */
public void prepare() {
this.locSatRef = locSat !=null? locSat.getSerial() : null;
}

/**
   * Update the SSRF data type references in this EndpointLocation record after loading from XML.

   * This method builds the transient {@link #locSat} with values
   * from the imported {@link #locSatRef} field. This method should
   * typically be called after the EndpointLocation is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (locSatRef==null || !locSatRef.isSetValue() ) {return;}
for(Location instance : root.getLocation()) {
if(locSatRef.equals(instance.getSerial())){
locSat = instance;
return;}
}for( Satellite instance : root.getSatellite()) {
if(locSatRef.equals(instance.getSerial())){
locSat = instance;
return;}
}}//</editor-fold>

}
