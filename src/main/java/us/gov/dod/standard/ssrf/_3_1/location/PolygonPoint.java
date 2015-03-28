package us.gov.dod.standard.ssrf._3_1.location;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
PolygonPoint contains the coordinates (WGS 84) of point(s) that represent a vertex of the polygon. Polygon points are described in a clockwise direction. If the last point is different from the first point, it is assumed that they are connected to complete the boundary of the polygon.

Element of {@link Polygon}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolygonPoint", propOrder = {
    "lon",
    "lat"
})
public class PolygonPoint {

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
sequence - Sequence index (Required) 

A unique, sequenced, index for each point describing the current polygon.

Format is UN(6)
@since 3.1.0
*/
    @XmlAttribute(name = "sequence", required = true)
      private  BigInteger sequence;

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
Get a unique, sequenced, index for each point describing the current polygon.

@return  a {@link BigInteger} instance
@since 3.1.0
*/
public BigInteger getSequence() {
        return sequence;
    }

/**
Set a unique, sequenced, index for each point describing the current polygon.

@param value  a {@link BigInteger} instance
@since 3.1.0
*/
public void setSequence(BigInteger value) {
        this.sequence = value;
    }

/**
Determine if the Sequence is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSequence() {
        return (this.sequence!= null);
    }

/**
Set the geographical longitude (degrees, minutes, seconds, and hemisphere E or W) of the Point or center of the Ellipse. If the seconds are not known, use 00, except in the case of navigation aid systems, geostationary satellites, and microwave facilities where seconds are required. Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees longitude require three digits. Seconds may have a decimal point followed by up to two decimals. enter E or W immediately following the seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or W).

@param value  An instances of type {@link String}
@return The current PolygonPoint object instance
@since 3.1.0
*/
    public PolygonPoint withLon(String value) {
        setLon(new Lon(value));
        return this;
    }

/**
Set the geographical latitude (degrees, minutes, seconds and hemisphere N or S) of the Point or center of the Ellipse. Same remarks for seconds and leading zeros. enter N or S immediately following the seconds. The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).

@param value  An instances of type {@link String}
@return The current PolygonPoint object instance
@since 3.1.0
*/
    public PolygonPoint withLat(String value) {
        setLat(new Lat(value));
        return this;
    }

/**
Set a unique, sequenced, index for each point describing the current polygon.

@param value  An instances of type {@link BigInteger}
@return The current PolygonPoint object instance
@since 3.1.0
*/
    public PolygonPoint withSequence(BigInteger value) {
        return this;
    }

/**
 Get a string representation of this PolygonPoint instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "PolygonPoint {"
 + (lat !=null? " lat [" + lat +"]" : "") 
 + (lon !=null? " lon [" + lon +"]" : "") 
 + (sequence !=null? " sequence [" + sequence +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link PolygonPoint} requires {@link Lat Lat}, {@link Lon Lon}, {@link BigInteger sequence}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetLat() &&  isSetLon() &&  isSetSequence();
}

}
