package us.gov.dod.standard.ssrf._3_1.location;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
Ellipse on the horizontal plane, defined by its semi-major and semi-minor axis, and by the orientation (azimuth) of the semi-major axis.  This element SHALL NOT be used to describe a satellite orbit.

Element of {@link Location}

Example: <pre>
* &lt;Ellipse&gt;
*   &lt;AltitudeMax  cls="U"&gt;20000&lt;/AltitudeMax &gt;
*   &lt;AltitudeMin  cls="U"&gt;3896.45&lt;/AltitudeMin &gt;
*   &lt;Azimuth  cls="U"&gt;357.8&lt;/Azimuth &gt;
*   &lt;Excluded  cls="U"&gt;No&lt;/Excluded &gt;
*   &lt;idx cls="U"&gt;23&lt;/idx&gt;
*   &lt;Lat  cls="U"&gt;394217.12N&lt;/Lat &gt;
*   &lt;Lon  cls="U"&gt;792823.5W&lt;/Lon &gt;
*   &lt;SemiMajorAxis  cls="U"&gt;87.87&lt;/SemiMajorAxis &gt;
*   &lt;SemiMinorAxis  cls="U"&gt;67.89&lt;/SemiMinorAxis &gt;
* &lt;/Ellipse&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ellipse", propOrder = {
    "excluded",
    "lon",
    "lat",
    "semiMajorAxis",
    "semiMinorAxis",
    "azimuth",
    "altitudeMin",
    "altitudeMax"
})
public class Ellipse {

/**
Excluded  - Shape is Excluded (Optional) 

"Yes" to indicate that the shape is to be excluded from the set. If omitted, a "No" SHOULD be assumed by processing applications, meaning that the shape is included by default.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Excluded", required = false)
    private TString excluded;
/**
Lon  - Longitude (Required) 

The geographical longitude (degrees, minutes, seconds, and hemisphere E or W) of the Point or center of the Ellipse. If the seconds are not known, use 00, except in the case of navigation aid systems, geostationary satellites, and microwave facilities where seconds are required. Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees longitude require three digits. Seconds may have a decimal point followed by up to two decimals. enter E or W immediately following the seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or W).

Format is pattern (S11) (deg)

Attribute group Coord (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Lon", required = true)
      private  Lon lon;
/**
Lat  - Latitude (Required) 

The geographical latitude (degrees, minutes, seconds and hemisphere N or S) of the Point or center of the Ellipse. Same remarks for seconds and leading zeros. enter N or S immediately following the seconds. The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).

Format is pattern (S10) (deg)

Attribute group Coord (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Lat", required = true)
      private  Lat lat;
/**
SemiMajorAxis  - Semi Major Axis (Required) 

The length of the semi-major axis of the ellipse.

[XSL ERR MINMAX] SemiMajorAxis it MUST be greater than or equal to SemiMinorAxis.

Format is UN(9,4) [0..10000] (km)
@since 3.1.0
*/
    @XmlElement(name = "SemiMajorAxis", required = true)
      private  DistEarth semiMajorAxis;
/**
SemiMinorAxis  - Semi Minor Axis (Required) 

The length of the semi-minor axis of the ellipse.

Format is UN(9,4) [0..10000] (km)
@since 3.1.0
*/
    @XmlElement(name = "SemiMinorAxis", required = true)
      private  DistEarth semiMinorAxis;
/**
Azimuth  - Azimuth of the Major Axis (Required) 

The angle of the semi-major axis in the horizontal plane, measured from true North.

Format is UN(5,2) [0..360] (deg)
@since 3.1.0
*/
    @XmlElement(name = "Azimuth", required = true)
      private  Az azimuth;
/**
AltitudeMin  - Minimum Altitude Above Ground
Level (Optional) 

The minimum or nominal height of the point above the terrain (also known as "above ground level" AGL).

Format is SN(7,2) (m)

Attribute group Altitude (Optional)
@since 3.1.0
*/
    @XmlElement(name = "AltitudeMin", required = false)
    private Altitude altitudeMin;
/**
AltitudeMax  - Maximum Altitude Above Ground
Level (Optional) 

The minimum or nominal height of the point above the terrain (also known as "above ground level" AGL).

[XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than AltitudeMin.

Format is SN(7,2) (m)

Attribute group Altitude (Optional)
@since 3.1.0
*/
    @XmlElement(name = "AltitudeMax", required = false)
    private Altitude altitudeMax;
/**
idx - Index (Required) 

A unique integer index for the current ellipse within the geometric shape.

Format is UN(6)
@since 3.1.0
*/
    @XmlAttribute(name = "idx", required = true)
      private  BigInteger idx;

/**
Get "Yes" to indicate that the shape is to be excluded from the set. If omitted, a "No" SHOULD be assumed by processing applications, meaning that the shape is included by default.

@return the Excluded value in a {@link TString} data type
@since 3.1.0
*/
public TString getExcluded() {
        return excluded;
    }

/**
Set "Yes" to indicate that the shape is to be excluded from the set. If omitted, a "No" SHOULD be assumed by processing applications, meaning that the shape is included by default.

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
Get the geographical longitude (degrees, minutes, seconds, and hemisphere E or W) of the Point or center of the Ellipse. If the seconds are not known, use 00, except in the case of navigation aid systems, geostationary satellites, and microwave facilities where seconds are required. Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees longitude require three digits. Seconds may have a decimal point followed by up to two decimals. enter E or W immediately following the seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or W).

@return the Lon value in a {@link TLon} data type
@since 3.1.0
*/
public Lon getLon() {
        return lon;
    }

/**
Set the geographical longitude (degrees, minutes, seconds, and hemisphere E or W) of the Point or center of the Ellipse. If the seconds are not known, use 00, except in the case of navigation aid systems, geostationary satellites, and microwave facilities where seconds are required. Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees longitude require three digits. Seconds may have a decimal point followed by up to two decimals. enter E or W immediately following the seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or W).

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
Get the geographical latitude (degrees, minutes, seconds and hemisphere N or S) of the Point or center of the Ellipse. Same remarks for seconds and leading zeros. enter N or S immediately following the seconds. The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).

@return the Lat value in a {@link TLat} data type
@since 3.1.0
*/
public Lat getLat() {
        return lat;
    }

/**
Set the geographical latitude (degrees, minutes, seconds and hemisphere N or S) of the Point or center of the Ellipse. Same remarks for seconds and leading zeros. enter N or S immediately following the seconds. The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).

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
Get the length of the semi-major axis of the ellipse.

[XSL ERR MINMAX] SemiMajorAxis it MUST be greater than or equal to SemiMinorAxis.

@return the SemiMajorAxis value in a {@link TDistEarth} data type
@since 3.1.0
*/
public DistEarth getSemiMajorAxis() {
        return semiMajorAxis;
    }

/**
Set the length of the semi-major axis of the ellipse.

[XSL ERR MINMAX] SemiMajorAxis it MUST be greater than or equal to SemiMinorAxis.

@param value the SemiMajorAxis value in a {@link TDistEarth} data type
@since 3.1.0
*/
public void setSemiMajorAxis(DistEarth value) {
        this.semiMajorAxis = value;
    }

/**
Determine if the SemiMajorAxis is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSemiMajorAxis() {
        return (this.semiMajorAxis!= null);
    }

/**
Get the length of the semi-minor axis of the ellipse.

@return the SemiMinorAxis value in a {@link TDistEarth} data type
@since 3.1.0
*/
public DistEarth getSemiMinorAxis() {
        return semiMinorAxis;
    }

/**
Set the length of the semi-minor axis of the ellipse.

@param value the SemiMinorAxis value in a {@link TDistEarth} data type
@since 3.1.0
*/
public void setSemiMinorAxis(DistEarth value) {
        this.semiMinorAxis = value;
    }

/**
Determine if the SemiMinorAxis is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSemiMinorAxis() {
        return (this.semiMinorAxis!= null);
    }

/**
Get the angle of the semi-major axis in the horizontal plane, measured from true North.

@return the Azimuth value in a {@link TAz} data type
@since 3.1.0
*/
public Az getAzimuth() {
        return azimuth;
    }

/**
Set the angle of the semi-major axis in the horizontal plane, measured from true North.

@param value the Azimuth value in a {@link TAz} data type
@since 3.1.0
*/
public void setAzimuth(Az value) {
        this.azimuth = value;
    }

/**
Determine if the Azimuth is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAzimuth() {
        return (this.azimuth!= null);
    }

/**
Get the minimum or nominal height of the point above the terrain (also known as "above ground level" AGL).

@return the AltitudeMin value in a {@link TAltitude} data type
@since 3.1.0
*/
public Altitude getAltitudeMin() {
        return altitudeMin;
    }

/**
Set the minimum or nominal height of the point above the terrain (also known as "above ground level" AGL).

@param value the AltitudeMin value in a {@link TAltitude} data type
@since 3.1.0
*/
public void setAltitudeMin(Altitude value) {
        this.altitudeMin = value;
    }

/**
Determine if the AltitudeMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAltitudeMin() {
        return (this.altitudeMin!= null);
    }

/**
Get the minimum or nominal height of the point above the terrain (also known as "above ground level" AGL).

[XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than AltitudeMin.

@return the AltitudeMax value in a {@link TAltitude} data type
@since 3.1.0
*/
public Altitude getAltitudeMax() {
        return altitudeMax;
    }

/**
Set the minimum or nominal height of the point above the terrain (also known as "above ground level" AGL).

[XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than AltitudeMin.

@param value the AltitudeMax value in a {@link TAltitude} data type
@since 3.1.0
*/
public void setAltitudeMax(Altitude value) {
        this.altitudeMax = value;
    }

/**
Determine if the AltitudeMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAltitudeMax() {
        return (this.altitudeMax!= null);
    }

/**
Get a unique integer index for the current ellipse within the geometric shape.

@return  a {@link BigInteger} instance
@since 3.1.0
*/
public BigInteger getIdx() {
        return idx;
    }

/**
Set a unique integer index for the current ellipse within the geometric shape.

@param value  a {@link BigInteger} instance
@since 3.1.0
*/
public void setIdx(BigInteger value) {
        this.idx = value;
    }

/**
Determine if the Idx is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIdx() {
        return (this.idx!= null);
    }

/**
Set "Yes" to indicate that the shape is to be excluded from the set. If omitted, a "No" SHOULD be assumed by processing applications, meaning that the shape is included by default.

@param value  An instances of type {@link ListCBO}
@return The current Ellipse object instance
@since 3.1.0
*/
    public Ellipse withExcluded(ListCBO value) {
           setExcluded(new TString(value.value()));
        return this;
    }

/**
Set the geographical longitude (degrees, minutes, seconds, and hemisphere E or W) of the Point or center of the Ellipse. If the seconds are not known, use 00, except in the case of navigation aid systems, geostationary satellites, and microwave facilities where seconds are required. Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees longitude require three digits. Seconds may have a decimal point followed by up to two decimals. enter E or W immediately following the seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or W).

@param value  An instances of type {@link String}
@return The current Ellipse object instance
@since 3.1.0
*/
    public Ellipse withLon(String value) {
        setLon(new Lon(value));
        return this;
    }

/**
Set the geographical latitude (degrees, minutes, seconds and hemisphere N or S) of the Point or center of the Ellipse. Same remarks for seconds and leading zeros. enter N or S immediately following the seconds. The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).

@param value  An instances of type {@link String}
@return The current Ellipse object instance
@since 3.1.0
*/
    public Ellipse withLat(String value) {
        setLat(new Lat(value));
        return this;
    }

/**
Set the length of the semi-major axis of the ellipse.

[XSL ERR MINMAX] SemiMajorAxis it MUST be greater than or equal to SemiMinorAxis.

@param value  An instances of type {@link TDistEarth}
@return The current Ellipse object instance
@since 3.1.0
*/
    public Ellipse withSemiMajorAxis(TDistEarth value) {
        return this;
    }

/**
Set the length of the semi-minor axis of the ellipse.

@param value  An instances of type {@link TDistEarth}
@return The current Ellipse object instance
@since 3.1.0
*/
    public Ellipse withSemiMinorAxis(TDistEarth value) {
        return this;
    }

/**
Set the angle of the semi-major axis in the horizontal plane, measured from true North.

@param value  An instances of type {@link TAz}
@return The current Ellipse object instance
@since 3.1.0
*/
    public Ellipse withAzimuth(TAz value) {
        return this;
    }

/**
Set the minimum or nominal height of the point above the terrain (also known as "above ground level" AGL).

@param value  An instances of type {@link Double}
@return The current Ellipse object instance
@since 3.1.0
*/
    public Ellipse withAltitudeMin(Double value) {
           setAltitudeMin(new Altitude(value));
        return this;
    }

/**
Set the minimum or nominal height of the point above the terrain (also known as "above ground level" AGL).

[XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than AltitudeMin.

@param value  An instances of type {@link Double}
@return The current Ellipse object instance
@since 3.1.0
*/
    public Ellipse withAltitudeMax(Double value) {
           setAltitudeMax(new Altitude(value));
        return this;
    }

/**
Set a unique integer index for the current ellipse within the geometric shape.

@param value  An instances of type {@link BigInteger}
@return The current Ellipse object instance
@since 3.1.0
*/
    public Ellipse withIdx(BigInteger value) {
        return this;
    }

/**
 Get a string representation of this Ellipse instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Ellipse {"
 + (altitudeMax !=null? " altitudeMax [" + altitudeMax +"]" : "") 
 + (altitudeMin !=null? " altitudeMin [" + altitudeMin +"]" : "") 
 + (azimuth !=null? " azimuth [" + azimuth +"]" : "") 
 + (excluded !=null? " excluded [" + excluded +"]" : "") 
 + (idx !=null? " idx [" + idx +"]" : "") 
 + (lat !=null? " lat [" + lat +"]" : "") 
 + (lon !=null? " lon [" + lon +"]" : "") 
 + (semiMajorAxis !=null? " semiMajorAxis [" + semiMajorAxis +"]" : "") 
 + (semiMinorAxis !=null? " semiMinorAxis [" + semiMinorAxis +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Ellipse} requires {@link Az Azimuth}, {@link Lat Lat}, {@link Lon Lon}, {@link DistEarth SemiMajorAxis}, {@link DistEarth SemiMinorAxis}, {@link BigInteger idx}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetAzimuth() &&  isSetLat() &&  isSetLon() &&  isSetSemiMajorAxis() &&  isSetSemiMinorAxis() &&  isSetIdx();
}

}
