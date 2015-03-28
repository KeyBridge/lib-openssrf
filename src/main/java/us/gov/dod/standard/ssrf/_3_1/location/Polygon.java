package us.gov.dod.standard.ssrf._3_1.location;

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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
Polygon is a closed geometric shape on the surface of the Earth, defined by at least three points, used to describe an operational area or an excluded area.

Element of {@link Location}

Sub-Element is {@link PolygonPoint}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Polygon", propOrder = {
    "excluded",
    "altitudeMin",
    "altitudeMax",
    "polygonPoint"
})
public class Polygon {

/**
Excluded  - Shape is Excluded (Optional) 

"Yes" to indicate that the shape is to be excluded from the set. If omitted, a "No" SHOULD be assumed by processing applications, meaning that the shape is included by default.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Excluded", required = false)
    private TString excluded;

    @XmlElement(name = "AltitudeMin", required = false)
    private Altitude altitudeMin;

    @XmlElement(name = "AltitudeMax", required = false)
    private Altitude altitudeMax;
/**
PolygonPoint (Optional)

PolygonPoint contains the coordinates (WGS 84) of point(s) that represent a vertex of the polygon. Polygon points are described in a clockwise direction. If the last point is different from the first point, it is assumed that they are connected to complete the boundary of the polygon.
@since 3.1.0
*/
    @XmlElement(name = "PolygonPoint", required = true)
      private  Set<PolygonPoint> polygonPoint;
/**
idx - Index (Required) 

A unique integer index for the current ellipse within the Location.

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
Get 

@return the AltitudeMin value in a {@link TAltitude} data type
@since 3.1.0
*/
public Altitude getAltitudeMin() {
        return altitudeMin;
    }

/**
Set 

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
Get 

@return the AltitudeMax value in a {@link TAltitude} data type
@since 3.1.0
*/
public Altitude getAltitudeMax() {
        return altitudeMax;
    }

/**
Set 

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
Get the PolygonPoint

Complex element PolygonPoint contains the coordinates (WGS 84) of point(s) that represent a vertex of the polygon. Polygon points are described in a clockwise direction. If the last point is different from the first point, it is assumed that they are connected to complete the boundary of the polygon.

@return  a {@link PolygonPoint} instance
@since 3.1.0
*/
    public Set<PolygonPoint> getPolygonPoint() {
        if (polygonPoint == null) {
            polygonPoint = new HashSet<PolygonPoint>();
        }
        return this.polygonPoint;
    }

/**
Determine if the PolygonPoint is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPolygonPoint() {
        return ((this.polygonPoint!= null)&&(!this.polygonPoint.isEmpty()));
    }

/**
  Clear the PolygonPoint field. This sets the field to null.
 */
    public void unsetPolygonPoint() {
        this.polygonPoint = null;
    }

/**
Get a unique integer index for the current ellipse within the Location.

@return  a {@link BigInteger} instance
@since 3.1.0
*/
public BigInteger getIdx() {
        return idx;
    }

/**
Set a unique integer index for the current ellipse within the Location.

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
@return The current Polygon object instance
@since 3.1.0
*/
    public Polygon withExcluded(ListCBO value) {
           setExcluded(new TString(value.value()));
        return this;
    }

/**
Set 

@param value  An instances of type {@link Double}
@return The current Polygon object instance
@since 3.1.0
*/
    public Polygon withAltitudeMin(Double value) {
           setAltitudeMin(new Altitude(value));
        return this;
    }

/**
Set 

@param value  An instances of type {@link Double}
@return The current Polygon object instance
@since 3.1.0
*/
    public Polygon withAltitudeMax(Double value) {
           setAltitudeMax(new Altitude(value));
        return this;
    }

/**
Set the PolygonPoint

Complex element PolygonPoint contains the coordinates (WGS 84) of point(s) that represent a vertex of the polygon. Polygon points are described in a clockwise direction. If the last point is different from the first point, it is assumed that they are connected to complete the boundary of the polygon.

@param values  One or more instances of type {@link PolygonPoint...}
@return The current Polygon object instance
@since 3.1.0
*/
    public Polygon withPolygonPoint(PolygonPoint... values) {
        if (values!= null) {
            for (PolygonPoint value: values) {
                getPolygonPoint().add(value);
            }
        }
        return this;
    }

/**
Set the PolygonPoint

Complex element PolygonPoint contains the coordinates (WGS 84) of point(s) that represent a vertex of the polygon. Polygon points are described in a clockwise direction. If the last point is different from the first point, it is assumed that they are connected to complete the boundary of the polygon.

@param values  A collection of {@link PolygonPoint} instances
@return The current Polygon object instance
@since 3.1.0
*/
    public Polygon withPolygonPoint(Collection<PolygonPoint> values) {
        if (values!= null) {
            getPolygonPoint().addAll(values);
        }
        return this;
    }

/**
Set a unique integer index for the current ellipse within the Location.

@param value  An instances of type {@link BigInteger}
@return The current Polygon object instance
@since 3.1.0
*/
    public Polygon withIdx(BigInteger value) {
        return this;
    }

/**
 Get a string representation of this Polygon instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Polygon {"
 + (altitudeMax !=null? " altitudeMax [" + altitudeMax +"]" : "") 
 + (altitudeMin !=null? " altitudeMin [" + altitudeMin +"]" : "") 
 + (excluded !=null? " excluded [" + excluded +"]" : "") 
 + (idx !=null? " idx [" + idx +"]" : "") 
 + (polygonPoint !=null? " polygonPoint [" + polygonPoint +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Polygon} requires {@link Set<PolygonPoint> PolygonPoint}, {@link BigInteger idx}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetPolygonPoint() &&  isSetIdx();
}

}
