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
Point contains the coordinates (WGS 84) of point(s) that represent a fixed site. It contains also the terrain elevation, in metres above mean sea level (MSL) of this point. If the antenna installed at this point is located on a structure such as a tower or a building, the site elevation is specified as the ground elevation at the base of the structure.

Element of {@link Location}

Example: <pre>
* &lt;Point idx="1"&gt;
*   &lt;Lon cls="U"&gt;0792823.5W&lt;/Lon&gt;
*   &lt;Lat cls="U"&gt;394217.12N&lt;/Lat&gt;
* &lt;/Point&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Point", propOrder = {
    "excluded",
    "lon",
    "lat",
    "terrainElevation",
    "altitudeMin",
    "altitudeMax"
})
public class Point {

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
TerrainElevation  - Terrain Elevation (Optional) 

The elevation of the base of the transmitting antenna structure above Mean Sea Level (MSL).

Format is SN(7,2) (m)
@since 3.1.0
*/
    @XmlElement(name = "TerrainElevation", required = false)
    private Altitude terrainElevation;
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
WayPointIdx  - Waypoint Index (Required) 

The sequential index of a Point within the referenced Location. Some points of the Location may be omitted, and are not necessarily visited in the order they are defined in the Location. For example a Location might have 10 Points; however, a Force Element may use a route passing successively by points 3, 1, 10, and 7.

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
Get the elevation of the base of the transmitting antenna structure above Mean Sea Level (MSL).

@return the TerrainElevation value in a {@link TAltitude} data type
@since 3.1.0
*/
public Altitude getTerrainElevation() {
        return terrainElevation;
    }

/**
Set the elevation of the base of the transmitting antenna structure above Mean Sea Level (MSL).

@param value the TerrainElevation value in a {@link TAltitude} data type
@since 3.1.0
*/
public void setTerrainElevation(Altitude value) {
        this.terrainElevation = value;
    }

/**
Determine if the TerrainElevation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTerrainElevation() {
        return (this.terrainElevation!= null);
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
Get the sequential index of a Point within the referenced Location. Some points of the Location may be omitted, and are not necessarily visited in the order they are defined in the Location. For example a Location might have 10 Points; however, a Force Element may use a route passing successively by points 3, 1, 10, and 7.

@return  a {@link BigInteger} instance
@since 3.1.0
*/
public BigInteger getIdx() {
        return idx;
    }

/**
Set the sequential index of a Point within the referenced Location. Some points of the Location may be omitted, and are not necessarily visited in the order they are defined in the Location. For example a Location might have 10 Points; however, a Force Element may use a route passing successively by points 3, 1, 10, and 7.

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
@return The current Point object instance
@since 3.1.0
*/
    public Point withExcluded(ListCBO value) {
           setExcluded(new TString(value.value()));
        return this;
    }

/**
Set the geographical longitude (degrees, minutes, seconds, and hemisphere E or W) of the Point or center of the Ellipse. If the seconds are not known, use 00, except in the case of navigation aid systems, geostationary satellites, and microwave facilities where seconds are required. Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees longitude require three digits. Seconds may have a decimal point followed by up to two decimals. enter E or W immediately following the seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or W).

@param value  An instances of type {@link String}
@return The current Point object instance
@since 3.1.0
*/
    public Point withLon(String value) {
        setLon(new Lon(value));
        return this;
    }

/**
Set the geographical latitude (degrees, minutes, seconds and hemisphere N or S) of the Point or center of the Ellipse. Same remarks for seconds and leading zeros. enter N or S immediately following the seconds. The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).

@param value  An instances of type {@link String}
@return The current Point object instance
@since 3.1.0
*/
    public Point withLat(String value) {
        setLat(new Lat(value));
        return this;
    }

/**
Set the elevation of the base of the transmitting antenna structure above Mean Sea Level (MSL).

@param value  An instances of type {@link Double}
@return The current Point object instance
@since 3.1.0
*/
    public Point withTerrainElevation(Double value) {
           setTerrainElevation(new Altitude(value));
        return this;
    }

/**
Set the minimum or nominal height of the point above the terrain (also known as "above ground level" AGL).

@param value  An instances of type {@link Double}
@return The current Point object instance
@since 3.1.0
*/
    public Point withAltitudeMin(Double value) {
           setAltitudeMin(new Altitude(value));
        return this;
    }

/**
Set the minimum or nominal height of the point above the terrain (also known as "above ground level" AGL).

[XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than AltitudeMin.

@param value  An instances of type {@link Double}
@return The current Point object instance
@since 3.1.0
*/
    public Point withAltitudeMax(Double value) {
           setAltitudeMax(new Altitude(value));
        return this;
    }

/**
Set the sequential index of a Point within the referenced Location. Some points of the Location may be omitted, and are not necessarily visited in the order they are defined in the Location. For example a Location might have 10 Points; however, a Force Element may use a route passing successively by points 3, 1, 10, and 7.

@param value  An instances of type {@link BigInteger}
@return The current Point object instance
@since 3.1.0
*/
    public Point withIdx(BigInteger value) {
        return this;
    }

/**
 Get a string representation of this Point instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Point {"
 + (altitudeMax !=null? " altitudeMax [" + altitudeMax +"]" : "") 
 + (altitudeMin !=null? " altitudeMin [" + altitudeMin +"]" : "") 
 + (excluded !=null? " excluded [" + excluded +"]" : "") 
 + (idx !=null? " idx [" + idx +"]" : "") 
 + (lat !=null? " lat [" + lat +"]" : "") 
 + (lon !=null? " lon [" + lon +"]" : "") 
 + (terrainElevation !=null? " terrainElevation [" + terrainElevation +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Point} requires {@link Lat Lat}, {@link Lon Lon}, {@link BigInteger idx}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetLat() &&  isSetLon() &&  isSetIdx();
}

}
