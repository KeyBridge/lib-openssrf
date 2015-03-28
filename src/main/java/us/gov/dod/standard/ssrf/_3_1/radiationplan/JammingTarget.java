package us.gov.dod.standard.ssrf._3_1.radiationplan;

import us.gov.dod.standard.ssrf._3_1.*;
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
JammingTarget (US) describes the target location and identifies the jamming loadset to be used.

Element of {@link JammingPlan}

Sub-Element is {@link JammingPerformance}

Example: See {@link RadiationPlan}.
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JammingTarget", propOrder = {
    "antStabilisation",
    "bearing",
    "freqMax",
    "freqMin",
    "lat",
    "loadsetRef",
    "locationRef",
    "lon",
    "polarisationType",
    "power",
    "targetID",
    "jammingPerformance"
})
public class JammingTarget {

/**
US:AntStabilisation -  Antenna Stabilisation Type (Optional) 

The method by which the jamming antenna beam is focused.

Format is L:UWG
@since 3.1.0
*/
    @XmlElement(name = "AntStabilisation", required = false)
    private TString antStabilisation;
/**
US:Bearing - Target Bearing (Optional) 

The bearing of the target in degrees referenced to the "boresight" of the jammer equipment or the platform that the jammer equipment is mounted on.

Format is UN(5,2) [0..360] (deg)
@since 3.1.0
*/
    @XmlElement(name = "Bearing", required = false)
    private Az bearing;
/**
US:FreqMax - Maximum Frequency (Optional) 

The frequency range maximum value planned for denial of use.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "FreqMax", required = false)
    private FreqM freqMax;
/**
US:FreqMin -  Minimum Frequency (Required) 

The discrete frequency, or frequency range minimum value, planned for denial of use.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "FreqMin", required = true)
      private  FreqM freqMin;
/**
US:Lat - Latitude (Optional) 

The geographic latitude of the target location, including hemisphere (H). The format for Lat is ddmmss[.hh]H (where H = N or S). Seconds may have a decimal point followed by up to two numerals. If seconds are not known, use 00, except in the case of navigation aid systems, geostationary satellites, and microwave facilities, where seconds MUST be entered. Degrees latitude requires two digits and should not exceed 90 degrees; enter N or S immediately following the seconds. Use leading zeros.

Format is pattern (S10) (deg)
@since 3.1.0
*/
    @XmlElement(name = "Lat", required = false)
    private Lat lat;
/**
In Data Item LoadsetRef (US), the serial of a Loadset dataset that contains the details to be used for this jamming instance.
@since 3.1.0
*/
    @XmlElement(name = "LoadsetRef", required = false)
    private Serial loadsetRef;
/**
US:LocationRef - Target Location  Serial (Optional) 

The unique reference of an existing Location dataset that describes the target location. 

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "LocationRef", required = false)
    private Serial locationRef;
/**
US:Lon - Longitude (Optional) 

The geographical longitude of the target location, including hemisphere (H). The format for Lon is dddmmss[.hh]H (where H = E or W). Seconds may have a decimal point followed by up to two numerals. If seconds are not known, use 00, except in the case of navigation aid systems, geostationary satellites, and microwave facilities, where seconds MUST be entered. Degrees longitude requires three digits and should not exceed 180 degrees; enter E or W immediately following the seconds. Use leading zeros.

Format is pattern (S11) (deg)
@since 3.1.0
*/
    @XmlElement(name = "Lon", required = false)
    private Lon lon;
/**
US:PolarisationType - Polarisation (Optional) 

The antenna polarisation planned for the desired jamming instance.

Format is L:CPO
@since 3.1.0
*/
    @XmlElement(name = "PolarisationType", required = false)
    private TString polarisationType;
/**
US:Power - Power (Optional) 

The desired power value planned to be directed at the target.

Format is SN(10,7) (dBW)
@since 3.1.0
*/
    @XmlElement(name = "Power", required = false)
    private dBW power;
/**
US:TargetID - Taget ID (Optional) 

A unique (within the parent JammingPlan) numeric identifier to distinguish one target from another.

Format is UN(5)
@since 3.1.0
*/
    @XmlElement(name = "TargetID", required = false)
    private UN5 targetID;
/**
US:JammingPerformance (Optional)

JammingPerformance (US) describes Electronic Attack effectiveness and how severely a target's use of the spectrum is expected to be impacted and/or how well it actually was impacted, for a specific jamming mission.
@since 3.1.0
*/
    @XmlElement(name = "JammingPerformance")
      private  Set<JammingPerformance> jammingPerformance;

/**
Get the method by which the jamming antenna beam is focused.

@return the AntStabilisation value in a {@link TString} data type
@since 3.1.0
*/
public TString getAntStabilisation() {
        return antStabilisation;
    }

/**
Set the method by which the jamming antenna beam is focused.

@param value the AntStabilisation value in a {@link TString} data type
@since 3.1.0
*/
public void setAntStabilisation(TString value) {
        this.antStabilisation = value;
    }

/**
Determine if the AntStabilisation is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAntStabilisation() {
return (this.antStabilisation!= null ? this.antStabilisation.isSetValue() : false);
    }

/**
Get the bearing of the target in degrees referenced to the "boresight" of the jammer equipment or the platform that the jammer equipment is mounted on.

@return the Bearing value in a {@link TAz} data type
@since 3.1.0
*/
public Az getBearing() {
        return bearing;
    }

/**
Set the bearing of the target in degrees referenced to the "boresight" of the jammer equipment or the platform that the jammer equipment is mounted on.

@param value the Bearing value in a {@link TAz} data type
@since 3.1.0
*/
public void setBearing(Az value) {
        this.bearing = value;
    }

/**
Determine if the Bearing is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetBearing() {
        return (this.bearing!= null);
    }

/**
Get the frequency range maximum value planned for denial of use.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

@return the FreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMax() {
        return freqMax;
    }

/**
Set the frequency range maximum value planned for denial of use.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

@param value the FreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setFreqMax(FreqM value) {
        this.freqMax = value;
    }

/**
Determine if the FreqMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqMax() {
        return (this.freqMax!= null);
    }

/**
Get the discrete frequency, or frequency range minimum value, planned for denial of use.

@return the FreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMin() {
        return freqMin;
    }

/**
Set the discrete frequency, or frequency range minimum value, planned for denial of use.

@param value the FreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setFreqMin(FreqM value) {
        this.freqMin = value;
    }

/**
Determine if the FreqMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqMin() {
        return (this.freqMin!= null);
    }

/**
Get the geographic latitude of the target location, including hemisphere (H). The format for Lat is ddmmss[.hh]H (where H = N or S). Seconds may have a decimal point followed by up to two numerals. If seconds are not known, use 00, except in the case of navigation aid systems, geostationary satellites, and microwave facilities, where seconds MUST be entered. Degrees latitude requires two digits and should not exceed 90 degrees; enter N or S immediately following the seconds. Use leading zeros.

@return the Lat value in a {@link TLat} data type
@since 3.1.0
*/
public Lat getLat() {
        return lat;
    }

/**
Set the geographic latitude of the target location, including hemisphere (H). The format for Lat is ddmmss[.hh]H (where H = N or S). Seconds may have a decimal point followed by up to two numerals. If seconds are not known, use 00, except in the case of navigation aid systems, geostationary satellites, and microwave facilities, where seconds MUST be entered. Degrees latitude requires two digits and should not exceed 90 degrees; enter N or S immediately following the seconds. Use leading zeros.

@param value the Lat value in a {@link TLat} data type
@since 3.1.0
*/
public void setLat(Lat value) {
        this.lat = value;
    }

/**
Determine if the Lat is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLat() {
        return (this.lat!= null);
    }

/**
Get In Data Item LoadsetRef (US), the serial of a Loadset dataset that contains the details to be used for this jamming instance.

@return the LoadsetRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getLoadset()} instead.
*/
@Deprecated
public Serial getLoadsetRef() {
        return loadsetRef;
    }

/**
Set In Data Item LoadsetRef (US), the serial of a Loadset dataset that contains the details to be used for this jamming instance.

@param value the LoadsetRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setLoadset(Loadset)} instead.
*/
@Deprecated
public void setLoadsetRef(Serial value) {
        this.loadsetRef = value;
    }

/**
Determine if the LoadsetRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLoadsetRef() {
        return (this.loadsetRef!= null);
    }

/**
Get the unique reference of an existing Location dataset that describes the target location. 

@return the LocationRef value in a {@link Serial} data type
@since 3.1.0
*/
public Serial getLocationRef() {
        return locationRef;
    }

/**
Set the unique reference of an existing Location dataset that describes the target location. 

@param value the LocationRef value in a {@link Serial} data type
@since 3.1.0
*/
public void setLocationRef(Serial value) {
        this.locationRef = value;
    }

/**
Determine if the LocationRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLocationRef() {
        return (this.locationRef!= null);
    }

/**
Get the geographical longitude of the target location, including hemisphere (H). The format for Lon is dddmmss[.hh]H (where H = E or W). Seconds may have a decimal point followed by up to two numerals. If seconds are not known, use 00, except in the case of navigation aid systems, geostationary satellites, and microwave facilities, where seconds MUST be entered. Degrees longitude requires three digits and should not exceed 180 degrees; enter E or W immediately following the seconds. Use leading zeros.

@return the Lon value in a {@link TLon} data type
@since 3.1.0
*/
public Lon getLon() {
        return lon;
    }

/**
Set the geographical longitude of the target location, including hemisphere (H). The format for Lon is dddmmss[.hh]H (where H = E or W). Seconds may have a decimal point followed by up to two numerals. If seconds are not known, use 00, except in the case of navigation aid systems, geostationary satellites, and microwave facilities, where seconds MUST be entered. Degrees longitude requires three digits and should not exceed 180 degrees; enter E or W immediately following the seconds. Use leading zeros.

@param value the Lon value in a {@link TLon} data type
@since 3.1.0
*/
public void setLon(Lon value) {
        this.lon = value;
    }

/**
Determine if the Lon is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLon() {
        return (this.lon!= null);
    }

/**
Get the antenna polarisation planned for the desired jamming instance.

@return the PolarisationType value in a {@link TString} data type
@since 3.1.0
*/
public TString getPolarisationType() {
        return polarisationType;
    }

/**
Set the antenna polarisation planned for the desired jamming instance.

@param value the PolarisationType value in a {@link TString} data type
@since 3.1.0
*/
public void setPolarisationType(TString value) {
        this.polarisationType = value;
    }

/**
Determine if the PolarisationType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPolarisationType() {
return (this.polarisationType!= null ? this.polarisationType.isSetValue() : false);
    }

/**
Get the desired power value planned to be directed at the target.

@return the Power value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getPower() {
        return power;
    }

/**
Set the desired power value planned to be directed at the target.

@param value the Power value in a {@link TdBW} data type
@since 3.1.0
*/
public void setPower(dBW value) {
        this.power = value;
    }

/**
Determine if the Power is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPower() {
        return (this.power!= null);
    }

/**
Get a unique (within the parent JammingPlan) numeric identifier to distinguish one target from another.

@return the TargetID value in a {@link TUN5} data type
@since 3.1.0
*/
public UN5 getTargetID() {
        return targetID;
    }

/**
Set a unique (within the parent JammingPlan) numeric identifier to distinguish one target from another.

@param value the TargetID value in a {@link TUN5} data type
@since 3.1.0
*/
public void setTargetID(UN5 value) {
        this.targetID = value;
    }

/**
Determine if the TargetID is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTargetID() {
        return (this.targetID!= null);
    }

/**
Get the US:JammingPerformance

Complex element JammingPerformance (US) describes Electronic Attack effectiveness and how severely a target's use of the spectrum is expected to be impacted and/or how well it actually was impacted, for a specific jamming mission.

@return  a {@link JammingPerformance} instance
@since 3.1.0
*/
    public Set<JammingPerformance> getJammingPerformance() {
        if (jammingPerformance == null) {
            jammingPerformance = new HashSet<JammingPerformance>();
        }
        return this.jammingPerformance;
    }

/**
Determine if the JammingPerformance is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetJammingPerformance() {
        return ((this.jammingPerformance!= null)&&(!this.jammingPerformance.isEmpty()));
    }

/**
  Clear the JammingPerformance field. This sets the field to null.
 */
    public void unsetJammingPerformance() {
        this.jammingPerformance = null;
    }

/**
Set the method by which the jamming antenna beam is focused.

@param value  An instances of type {@link ListUWG}
@return The current JammingTarget object instance
@since 3.1.0
*/
    public JammingTarget withAntStabilisation(ListUWG value) {
           setAntStabilisation(new TString(value.value()));
        return this;
    }

/**
Set the bearing of the target in degrees referenced to the "boresight" of the jammer equipment or the platform that the jammer equipment is mounted on.

@param value  An instances of type {@link Double}
@return The current JammingTarget object instance
@since 3.1.0
*/
    public JammingTarget withBearing(Double value) {
           setBearing(new Az(value));
        return this;
    }

/**
Set the frequency range maximum value planned for denial of use.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

@param value  An instances of type {@link Double}
@return The current JammingTarget object instance
@since 3.1.0
*/
    public JammingTarget withFreqMax(Double value) {
           setFreqMax(new FreqM(value));
        return this;
    }

/**
Set the discrete frequency, or frequency range minimum value, planned for denial of use.

@param value  An instances of type {@link TFreqM}
@return The current JammingTarget object instance
@since 3.1.0
*/
    public JammingTarget withFreqMin(TFreqM value) {
        return this;
    }

/**
Set the geographic latitude of the target location, including hemisphere (H). The format for Lat is ddmmss[.hh]H (where H = N or S). Seconds may have a decimal point followed by up to two numerals. If seconds are not known, use 00, except in the case of navigation aid systems, geostationary satellites, and microwave facilities, where seconds MUST be entered. Degrees latitude requires two digits and should not exceed 90 degrees; enter N or S immediately following the seconds. Use leading zeros.

@param value  An instances of type {@link String}
@return The current JammingTarget object instance
@since 3.1.0
*/
    public JammingTarget withLat(String value) {
           setLat(new Lat(value));
        return this;
    }

/**
Set In Data Item LoadsetRef (US), the serial of a Loadset dataset that contains the details to be used for this jamming instance.

@param value  An instances of type {@link Serial}
@return The current JammingTarget object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withLoadset(Loadset)} instead.
*/
@Deprecated
    public JammingTarget withLoadsetRef(Serial value) {
           setLoadsetRef(value);
        return this;
    }

/**
Set the unique reference of an existing Location dataset that describes the target location. 

@param value  An instances of type {@link Serial}
@return The current JammingTarget object instance
@since 3.1.0
*/
    public JammingTarget withLocationRef(Serial value) {
           setLocationRef(value);
        return this;
    }

/**
Set the geographical longitude of the target location, including hemisphere (H). The format for Lon is dddmmss[.hh]H (where H = E or W). Seconds may have a decimal point followed by up to two numerals. If seconds are not known, use 00, except in the case of navigation aid systems, geostationary satellites, and microwave facilities, where seconds MUST be entered. Degrees longitude requires three digits and should not exceed 180 degrees; enter E or W immediately following the seconds. Use leading zeros.

@param value  An instances of type {@link String}
@return The current JammingTarget object instance
@since 3.1.0
*/
    public JammingTarget withLon(String value) {
           setLon(new Lon(value));
        return this;
    }

/**
Set the antenna polarisation planned for the desired jamming instance.

@param value  An instances of type {@link ListCPO}
@return The current JammingTarget object instance
@since 3.1.0
*/
    public JammingTarget withPolarisationType(ListCPO value) {
           setPolarisationType(new TString(value.value()));
        return this;
    }

/**
Set the desired power value planned to be directed at the target.

@param value  An instances of type {@link Double}
@return The current JammingTarget object instance
@since 3.1.0
*/
    public JammingTarget withPower(Double value) {
           setPower(new dBW(value));
        return this;
    }

/**
Set a unique (within the parent JammingPlan) numeric identifier to distinguish one target from another.

@param value  An instances of type {@link Integer}
@return The current JammingTarget object instance
@since 3.1.0
*/
    public JammingTarget withTargetID(Integer value) {
           setTargetID(new UN5(value));
        return this;
    }

/**
Set the US:JammingPerformance

Complex element JammingPerformance (US) describes Electronic Attack effectiveness and how severely a target's use of the spectrum is expected to be impacted and/or how well it actually was impacted, for a specific jamming mission.

@param values  One or more instances of type {@link JammingPerformance...}
@return The current JammingTarget object instance
@since 3.1.0
*/
    public JammingTarget withJammingPerformance(JammingPerformance... values) {
        if (values!= null) {
            for (JammingPerformance value: values) {
                getJammingPerformance().add(value);
            }
        }
        return this;
    }

/**
Set the US:JammingPerformance

Complex element JammingPerformance (US) describes Electronic Attack effectiveness and how severely a target's use of the spectrum is expected to be impacted and/or how well it actually was impacted, for a specific jamming mission.

@param values  A collection of {@link JammingPerformance} instances
@return The current JammingTarget object instance
@since 3.1.0
*/
    public JammingTarget withJammingPerformance(Collection<JammingPerformance> values) {
        if (values!= null) {
            getJammingPerformance().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this JammingTarget instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "JammingTarget {"
 + (antStabilisation !=null? " antStabilisation [" + antStabilisation +"]" : "") 
 + (bearing !=null? " bearing [" + bearing +"]" : "") 
 + (freqMax !=null? " freqMax [" + freqMax +"]" : "") 
 + (freqMin !=null? " freqMin [" + freqMin +"]" : "") 
 + (jammingPerformance !=null? " jammingPerformance [" + jammingPerformance +"]" : "") 
 + (lat !=null? " lat [" + lat +"]" : "") 
 + (loadsetRef !=null? " loadsetRef [" + loadsetRef +"]" : "") 
 + (locationRef !=null? " locationRef [" + locationRef +"]" : "") 
 + (lon !=null? " lon [" + lon +"]" : "") 
 + (polarisationType !=null? " polarisationType [" + polarisationType +"]" : "") 
 + (power !=null? " power [" + power +"]" : "") 
 + (targetID !=null? " targetID [" + targetID +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link JammingTarget} requires {@link FreqM FreqMin}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetFreqMin();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
In Data Item LoadsetRef (US), the serial of a Loadset dataset that contains the details to be used for this jamming instance.
@since 3.1.0
*/
@XmlTransient
private Loadset loadset;

/**
Get In Data Item LoadsetRef (US), the serial of a Loadset dataset that contains the details to be used for this jamming instance.

@return  a {@link Loadset} instance
@since 3.1.0
*/
public Loadset getLoadset(){
return loadset;
}
/**
 Determine if the loadset field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetLoadset() {
    return this.loadset != null ;
}

/**
Set In Data Item LoadsetRef (US), the serial of a Loadset dataset that contains the details to be used for this jamming instance.

@param value  An instances of type {@link Loadset}
@return The current JammingTarget object instance
@since 3.1.0
*/
public JammingTarget withLoadset(Loadset value) {
this.loadset = value;
return this;
}

  /**
   * Update the SSRF data type references in this JammingTarget record.
   * <p>
 */
public void prepare() {
this.loadsetRef = loadset !=null? loadset.getSerial() : null;
}

/**
   * Update the SSRF data type references in this JammingTarget record after loading from XML.

   * This method builds the transient {@link #loadset} with values
   * from the imported {@link #loadsetRef} field. This method should
   * typically be called after the JammingTarget is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (loadsetRef==null || !loadsetRef.isSetValue() ) {return;}
for(Loadset instance : root.getLoadset()) {
if(loadsetRef.equals(instance.getSerial())){
loadset = instance;
return;}
}}//</editor-fold>

}
