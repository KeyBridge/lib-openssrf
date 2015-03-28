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
Location is used to describe a geographical location, polygonal or ellipse area, or a set of those.

Sub-Elements are {@link Ellipse}, {@link POCInformation}, {@link Point}, {@link Polygon}

Example: A simple fixed location:<pre>
* &lt;Location cls="U"&gt;
*   &lt;Serial cls="U"&gt;BEL::LO:111&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;Name cls="U"&gt;Brussels National Airpt&lt;/Name&gt;
*   &lt;Country cls="U"&gt;BEL&lt;/Country&gt;
*   &lt;Point idx="1"&gt;
*     &lt;Lon cls="U"&gt;0050000E&lt;/Lon&gt;
*     &lt;Lat cls="U"&gt;503600N&lt;/Lat&gt;
*     &lt;TerrainElevation cls="U"&gt;50&lt;/TerrainElevation&gt;
*   &lt;/Point&gt;
* &lt;/Location&gt;
A triangle* &lt;Location cls="U"&gt;
*   &lt;Serial cls="U"&gt;BEL::LO:222&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;Name cls="U"&gt;Melsbroek Approach&lt;/Name&gt;
*   &lt;Country cls="U"&gt;BEL&lt;/Country&gt;
*   &lt;Polygon idx="1"&gt;
*     &lt;PolygonPoint sequence="1"&gt;
*       &lt;Lon cls="U"&gt;0050000E&lt;/Lon&gt;
*       &lt;Lat cls="U"&gt;503600N&lt;/Lat&gt;
*     &lt;/PolygonPoint&gt;
*     &lt;PolygonPoint sequence="2"&gt;
*       &lt;Lon cls="U"&gt;0053000E&lt;/Lon&gt;
*       &lt;Lat cls="U"&gt;503600N&lt;/Lat&gt;
*     &lt;/PolygonPoint&gt;
*     &lt;PolygonPoint sequence="3"&gt;
*       &lt;Lon cls="U"&gt;0053000E&lt;/Lon&gt;
*       &lt;Lat cls="U"&gt;504000N&lt;/Lat&gt;
*     &lt;/PolygonPoint&gt;
*   &lt;/Polygon&gt;
* &lt;/Location&gt;
A composite area with a hole (doughnut):* &lt;Location cls="U"&gt;
*   &lt;Serial cls="U"&gt;BEL::LO:333&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;Name cls="U"&gt;BEL AF Training North&lt;/Name&gt;
*   &lt;Country cls="U"&gt;BEL&lt;/Country&gt;
*   &lt;Ellipse idx="1"&gt;
*     &lt;Excluded cls="U"&gt;Yes&lt;/Excluded&gt;
*     &lt;Lon cls="U"&gt;0050000E&lt;/Lon&gt;
*     &lt;Lat cls="U"&gt;503600N&lt;/Lat&gt;
*     &lt;SemiMajorAxis cls="U"&gt;10&lt;/SemiMajorAxis&gt;
*     &lt;SemiMinorAxis cls="U"&gt;10&lt;/SemiMinorAxis&gt;
*     &lt;Azimuth cls="U"&gt;0&lt;/Azimuth&gt;
*   &lt;/Ellipse&gt;
*   &lt;LocationRef cls="U"&gt;BEL::LO:222&lt;/LocationRef&gt;
* &lt;/Location&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "effectiveDate",
    "expirationDate",
    "reviewDate",
    "name",
    "street",
    "cityArea",
    "stateCounty",
    "postCode",
    "country",
    "pocInformation",
    "point",
    "polygon",
    "ellipse",
    "locationRef"
})
public class Location
    extends Common
{

/**
EffectiveDate  - Effective Date (Optional) 

The date by which the dataset is to be operational or effective.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "EffectiveDate", required = false)
    private D effectiveDate;
/**
ExpirationDate  - Expiration Date (Optional) 

The date at which the dataset will expire. The Expiration date should be less than five years from current date.

Format is Date

Attribute group ExpireReview (Optional)
@since 3.1.0
*/
    @XmlElement(name = "ExpirationDate", required = false)
    private D expirationDate;
/**
ReviewDate  - Review Date (Optional) 

The date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

Format is Date

Attribute group ExpireReview (Optional)
@since 3.1.0
*/
    @XmlElement(name = "ReviewDate", required = false)
    private D reviewDate;
/**
Name  - Location Name (Required) 

The name of the location.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Name", required = true)
      private  S100 name;
/**
Street  - Street Address (Optional) 

The street address.

Format is S255

Attribute group Address (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Street", required = false)
    private S255 street;
/**
CityArea  - City or Area (Optional) 

The city of the address or an operational area name.

Format is S50

Attribute group Address (Optional)
@since 3.1.0
*/
    @XmlElement(name = "CityArea", required = false)
    private S50 cityArea;
/**
StateCounty  - State/County (Optional) 

The state or other sub-national political area.

Format is S50

Attribute group Address (Optional)
@since 3.1.0
*/
    @XmlElement(name = "StateCounty", required = false)
    private S50 stateCounty;
/**
PostCode  - Zip Code/Post Code (Optional) 

The zip code or postal code portion of the address.

Format is S15

Attribute group Address (Optional)
@since 3.1.0
*/
    @XmlElement(name = "PostCode", required = false)
    private S15 postCode;
/**
Country  - Country/Area (Optional) 

The country or area code. Use a one to six alphabetic characters representing either an official country code, a regional body, a group of countries or a NATO Command.

Format is L:CAO

Attribute group Address (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Country")
      private  TString country;
/**
POCInformation (Optional)

POCInformation contains a reference to a Contact, Organisation or Role dataset.
@since 3.1.0
*/
    @XmlElement(name = "POCInformation")
      private  Set<POCInformation> pocInformation;
/**
AntFeedpointHeight  - Antenna Feedpoint Height (Optional) 

The antenna feed point height above the terrain, in metres. In the case where the antenna is mounted pointing vertically to a reflector on the same structure, enter the height of the reflector above ground. If the Station is a flying object, this data represents the maximum altitude of the object above ground.

Format is SN(7,2) (m)
@since 3.1.0
*/
    @XmlElement(name = "Point")
      private  Set<Point> point;
/**
Polygon (Optional)

Polygon is a closed geometric shape on the surface of the Earth, defined by at least three points, used to describe an operational area or an excluded area.
@since 3.1.0
*/
    @XmlElement(name = "Polygon")
      private  Set<Polygon> polygon;
/**
Ellipse (Optional)

Ellipse on the horizontal plane, defined by its semi-major and semi-minor axis, and by the orientation (azimuth) of the semi-major axis.  This element SHALL NOT be used to describe a satellite orbit.
@since 3.1.0
*/
    @XmlElement(name = "Ellipse")
      private  Set<Ellipse> ellipse;
/**
LocationRef - Element Content (Required) 

The serial of the referenced Location.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "LocationRef", nillable = true)
      private  Set<Serial> locationRef;

/**
Get the date by which the dataset is to be operational or effective.

@return the EffectiveDate value in a {@link TD} data type
@since 3.1.0
*/
public D getEffectiveDate() {
        return effectiveDate;
    }

/**
Set the date by which the dataset is to be operational or effective.

@param value the EffectiveDate value in a {@link TD} data type
@since 3.1.0
*/
public void setEffectiveDate(D value) {
        this.effectiveDate = value;
    }

/**
Determine if the EffectiveDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEffectiveDate() {
        return (this.effectiveDate!= null);
    }

/**
Get the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@return the ExpirationDate value in a {@link TD} data type
@since 3.1.0
*/
public D getExpirationDate() {
        return expirationDate;
    }

/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value the ExpirationDate value in a {@link TD} data type
@since 3.1.0
*/
public void setExpirationDate(D value) {
        this.expirationDate = value;
    }

/**
Determine if the ExpirationDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetExpirationDate() {
        return (this.expirationDate!= null);
    }

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
Get the name of the location.

@return the Name value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getName() {
        return name;
    }

/**
Set the name of the location.

@param value the Name value in a {@link TS100} data type
@since 3.1.0
*/
public void setName(S100 value) {
        this.name = value;
    }

/**
Determine if the Name is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetName() {
        return (this.name!= null);
    }

/**
Get the street address.

@return the Street value in a {@link TS255} data type
@since 3.1.0
*/
public S255 getStreet() {
        return street;
    }

/**
Set the street address.

@param value the Street value in a {@link TS255} data type
@since 3.1.0
*/
public void setStreet(S255 value) {
        this.street = value;
    }

/**
Determine if the Street is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStreet() {
        return (this.street!= null);
    }

/**
Get the city of the address or an operational area name.

@return the CityArea value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getCityArea() {
        return cityArea;
    }

/**
Set the city of the address or an operational area name.

@param value the CityArea value in a {@link TS50} data type
@since 3.1.0
*/
public void setCityArea(S50 value) {
        this.cityArea = value;
    }

/**
Determine if the CityArea is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCityArea() {
        return (this.cityArea!= null);
    }

/**
Get the state or other sub-national political area.

@return the StateCounty value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getStateCounty() {
        return stateCounty;
    }

/**
Set the state or other sub-national political area.

@param value the StateCounty value in a {@link TS50} data type
@since 3.1.0
*/
public void setStateCounty(S50 value) {
        this.stateCounty = value;
    }

/**
Determine if the StateCounty is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStateCounty() {
        return (this.stateCounty!= null);
    }

/**
Get the zip code or postal code portion of the address.

@return the PostCode value in a {@link TS15} data type
@since 3.1.0
*/
public S15 getPostCode() {
        return postCode;
    }

/**
Set the zip code or postal code portion of the address.

@param value the PostCode value in a {@link TS15} data type
@since 3.1.0
*/
public void setPostCode(S15 value) {
        this.postCode = value;
    }

/**
Determine if the PostCode is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPostCode() {
        return (this.postCode!= null);
    }

/**
Get the country or area code. Use a one to six alphabetic characters representing either an official country code, a regional body, a group of countries or a NATO Command.

@return the Country value in a {@link TString} data type
@since 3.1.0
*/
public TString getCountry() {
        return country;
    }

/**
Set the country or area code. Use a one to six alphabetic characters representing either an official country code, a regional body, a group of countries or a NATO Command.

@param value the Country value in a {@link TString} data type
@since 3.1.0
*/
public void setCountry(TString value) {
        this.country = value;
    }

/**
Determine if the Country is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCountry() {
return (this.country!= null ? this.country.isSetValue() : false);
    }

/**
Get the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@return  a {@link POCInformation} instance
@since 3.1.0
*/
    public Set<POCInformation> getPOCInformation() {
        if (pocInformation == null) {
            pocInformation = new HashSet<POCInformation>();
        }
        return this.pocInformation;
    }

/**
Determine if the POCInformation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPOCInformation() {
        return ((this.pocInformation!= null)&&(!this.pocInformation.isEmpty()));
    }

/**
  Clear the POCInformation field. This sets the field to null.
 */
    public void unsetPOCInformation() {
        this.pocInformation = null;
    }

/**
Get the antenna feed point height above the terrain, in metres. In the case where the antenna is mounted pointing vertically to a reflector on the same structure, enter the height of the reflector above ground. If the Station is a flying object, this data represents the maximum altitude of the object above ground.

@return  a {@link Point} instance
@since 3.1.0
*/
    public Set<Point> getPoint() {
        if (point == null) {
            point = new HashSet<Point>();
        }
        return this.point;
    }

/**
Determine if the Point is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPoint() {
        return ((this.point!= null)&&(!this.point.isEmpty()));
    }

/**
  Clear the Point field. This sets the field to null.
 */
    public void unsetPoint() {
        this.point = null;
    }

/**
Get the Polygon

Complex element Polygon is a closed geometric shape on the surface of the Earth, defined by at least three points, used to describe an operational area or an excluded area.

@return  a {@link Polygon} instance
@since 3.1.0
*/
    public Set<Polygon> getPolygon() {
        if (polygon == null) {
            polygon = new HashSet<Polygon>();
        }
        return this.polygon;
    }

/**
Determine if the Polygon is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPolygon() {
        return ((this.polygon!= null)&&(!this.polygon.isEmpty()));
    }

/**
  Clear the Polygon field. This sets the field to null.
 */
    public void unsetPolygon() {
        this.polygon = null;
    }

/**
Get the Ellipse

Complex element Ellipse on the horizontal plane, defined by its semi-major and semi-minor axis, and by the orientation (azimuth) of the semi-major axis.  This element SHALL NOT be used to describe a satellite orbit.

@return  a {@link Ellipse} instance
@since 3.1.0
*/
    public Set<Ellipse> getEllipse() {
        if (ellipse == null) {
            ellipse = new HashSet<Ellipse>();
        }
        return this.ellipse;
    }

/**
Determine if the Ellipse is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEllipse() {
        return ((this.ellipse!= null)&&(!this.ellipse.isEmpty()));
    }

/**
  Clear the Ellipse field. This sets the field to null.
 */
    public void unsetEllipse() {
        this.ellipse = null;
    }

/**
Get the serial of the referenced Location.

@return  a {@link Serial} instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getLocation()} instead.
*/
@Deprecated
    public Set<Serial> getLocationRef() {
        if (locationRef == null) {
            locationRef = new HashSet<Serial>();
        }
        return this.locationRef;
    }

/**
Determine if the LocationRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLocationRef() {
        return ((this.locationRef!= null)&&(!this.locationRef.isEmpty()));
    }

/**
  Clear the LocationRef field. This sets the field to null.
 */
    public void unsetLocationRef() {
        this.locationRef = null;
    }

/**
Set the date by which the dataset is to be operational or effective.

@param value  An instances of type {@link Calendar}
@return The current Location object instance
@since 3.1.0
*/
    public Location withEffectiveDate(Calendar value) {
           setEffectiveDate(new D(value));
        return this;
    }
/**
Set the date by which the dataset is to be operational or effective.

@param value  An instances of type {@link Date}
@return The current Location object instance
@since 3.1.0
*/
    public Location withEffectiveDate(Date value) {
           setEffectiveDate(new D(value));
        return this;
    }

/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value  An instances of type {@link Calendar}
@return The current Location object instance
@since 3.1.0
*/
    public Location withExpirationDate(Calendar value) {
           setExpirationDate(new D(value));
        return this;
    }
/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value  An instances of type {@link Date}
@return The current Location object instance
@since 3.1.0
*/
    public Location withExpirationDate(Date value) {
           setExpirationDate(new D(value));
        return this;
    }

/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Calendar}
@return The current Location object instance
@since 3.1.0
*/
    public Location withReviewDate(Calendar value) {
           setReviewDate(new D(value));
        return this;
    }
/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Date}
@return The current Location object instance
@since 3.1.0
*/
    public Location withReviewDate(Date value) {
           setReviewDate(new D(value));
        return this;
    }

/**
Set the name of the location.

@param value  An instances of type {@link TS100}
@return The current Location object instance
@since 3.1.0
*/
    public Location withName(TS100 value) {
        return this;
    }

/**
Set the street address.

@param value  An instances of type {@link String}
@return The current Location object instance
@since 3.1.0
*/
    public Location withStreet(String value) {
           setStreet(new S255(value));
        return this;
    }

/**
Set the city of the address or an operational area name.

@param value  An instances of type {@link String}
@return The current Location object instance
@since 3.1.0
*/
    public Location withCityArea(String value) {
           setCityArea(new S50(value));
        return this;
    }

/**
Set the state or other sub-national political area.

@param value  An instances of type {@link String}
@return The current Location object instance
@since 3.1.0
*/
    public Location withStateCounty(String value) {
           setStateCounty(new S50(value));
        return this;
    }

/**
Set the zip code or postal code portion of the address.

@param value  An instances of type {@link String}
@return The current Location object instance
@since 3.1.0
*/
    public Location withPostCode(String value) {
           setPostCode(new S15(value));
        return this;
    }

/**
Set the country or area code. Use a one to six alphabetic characters representing either an official country code, a regional body, a group of countries or a NATO Command.

@param value  An instances of type {@link ListCAO}
@return The current Location object instance
@since 3.1.0
*/
    public Location withCountry(ListCAO value) {
        setCountry(new TString(value.value()));
        return this;
    }

/**
Set the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@param values  One or more instances of type {@link POCInformation...}
@return The current Location object instance
@since 3.1.0
*/
    public Location withPOCInformation(POCInformation... values) {
        if (values!= null) {
            for (POCInformation value: values) {
                getPOCInformation().add(value);
            }
        }
        return this;
    }

/**
Set the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@param values  A collection of {@link POCInformation} instances
@return The current Location object instance
@since 3.1.0
*/
    public Location withPOCInformation(Collection<POCInformation> values) {
        if (values!= null) {
            getPOCInformation().addAll(values);
        }
        return this;
    }

/**
Set the antenna feed point height above the terrain, in metres. In the case where the antenna is mounted pointing vertically to a reflector on the same structure, enter the height of the reflector above ground. If the Station is a flying object, this data represents the maximum altitude of the object above ground.

@param values  One or more instances of type {@link Point...}
@return The current Location object instance
@since 3.1.0
*/
    public Location withPoint(Point... values) {
        if (values!= null) {
            for (Point value: values) {
                getPoint().add(value);
            }
        }
        return this;
    }

/**
Set the antenna feed point height above the terrain, in metres. In the case where the antenna is mounted pointing vertically to a reflector on the same structure, enter the height of the reflector above ground. If the Station is a flying object, this data represents the maximum altitude of the object above ground.

@param values  A collection of {@link Point} instances
@return The current Location object instance
@since 3.1.0
*/
    public Location withPoint(Collection<Point> values) {
        if (values!= null) {
            getPoint().addAll(values);
        }
        return this;
    }

/**
Set the Polygon

Complex element Polygon is a closed geometric shape on the surface of the Earth, defined by at least three points, used to describe an operational area or an excluded area.

@param values  One or more instances of type {@link Polygon...}
@return The current Location object instance
@since 3.1.0
*/
    public Location withPolygon(Polygon... values) {
        if (values!= null) {
            for (Polygon value: values) {
                getPolygon().add(value);
            }
        }
        return this;
    }

/**
Set the Polygon

Complex element Polygon is a closed geometric shape on the surface of the Earth, defined by at least three points, used to describe an operational area or an excluded area.

@param values  A collection of {@link Polygon} instances
@return The current Location object instance
@since 3.1.0
*/
    public Location withPolygon(Collection<Polygon> values) {
        if (values!= null) {
            getPolygon().addAll(values);
        }
        return this;
    }

/**
Set the Ellipse

Complex element Ellipse on the horizontal plane, defined by its semi-major and semi-minor axis, and by the orientation (azimuth) of the semi-major axis.  This element SHALL NOT be used to describe a satellite orbit.

@param values  One or more instances of type {@link Ellipse...}
@return The current Location object instance
@since 3.1.0
*/
    public Location withEllipse(Ellipse... values) {
        if (values!= null) {
            for (Ellipse value: values) {
                getEllipse().add(value);
            }
        }
        return this;
    }

/**
Set the Ellipse

Complex element Ellipse on the horizontal plane, defined by its semi-major and semi-minor axis, and by the orientation (azimuth) of the semi-major axis.  This element SHALL NOT be used to describe a satellite orbit.

@param values  A collection of {@link Ellipse} instances
@return The current Location object instance
@since 3.1.0
*/
    public Location withEllipse(Collection<Ellipse> values) {
        if (values!= null) {
            getEllipse().addAll(values);
        }
        return this;
    }

/**
Set the serial of the referenced Location.

@param values  One or more instances of type {@link LocationRef...}
@return The current Location object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withLocation(Location...)} instead.
*/
@Deprecated
    public Location withLocationRef(Serial... values) {
        if (values!= null) {
            for (LocationRef value: values) {
                getLocationRef().add(value);
            }
        }
        return this;
    }

/**
Set the serial of the referenced Location.

@param values  A collection of {@link Serial} instances
@return The current Location object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withLocation(Location...)} instead.
*/
@Deprecated
    public Location withLocationRef(Collection<Serial> values) {
        if (values!= null) {
            getLocationRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Location object instance
@since 3.1.0
*/
    public Location withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Location object instance
@since 3.1.0
*/
    public Location withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Location object instance
@since 3.1.0
*/
    public Location withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Location object instance
@since 3.1.0
*/
    public Location withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Location object instance
@since 3.1.0
*/
    public Location withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Location object instance
@since 3.1.0
*/
    public Location withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Location object instance
@since 3.1.0
*/
    public Location withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Location object instance
@since 3.1.0
*/
    public Location withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current Location object instance
@since 3.1.0
*/
    public Location withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set the serial of the referenced Location.

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "LO".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"

@param value  An instances of type {@link Serial}
@return The current Location object instance
@since 3.1.0
*/
    public Location withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current Location object instance
@since 3.1.0
*/
    public Location withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Location object instance
@since 3.1.0
*/
    public Location withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Location object instance
@since 3.1.0
*/
    public Location withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Location object instance
@since 3.1.0
*/
    public Location withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Location object instance
@since 3.1.0
*/
    public Location withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Location object instance
@since 3.1.0
*/
    public Location withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Location object instance
@since 3.1.0
*/
    public Location withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Location object instance
@since 3.1.0
*/
    public Location withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Location object instance
@since 3.1.0
*/
    public Location withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Location object instance
@since 3.1.0
*/
    public Location withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set the state or other sub-national political area.

@param value  An instances of type {@link ListCSU}
@return The current Location object instance
@since 3.1.0
*/
    public Location withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Location object instance
@since 3.1.0
*/
    public Location withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current Location object instance
@since 3.1.0
*/
    public Location withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current Location object instance
@since 3.1.0
*/
    public Location withCaseNum(CaseNum... values) {
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
@return The current Location object instance
@since 3.1.0
*/
    public Location withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current Location object instance
@since 3.1.0
*/
    public Location withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current Location object instance
@since 3.1.0
*/
    public Location withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current Location object instance
@since 3.1.0
*/
    public Location withRemarks(Remarks... values) {
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
@return The current Location object instance
@since 3.1.0
*/
    public Location withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current Location object instance
@since 3.1.0
*/
    public Location withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current Location object instance
@since 3.1.0
*/
    public Location withReleasability(ListCCY... values) {
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
@return The current Location object instance
@since 3.1.0
*/
    public Location withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current Location object instance
@since 3.1.0
*/
    public Location withRemarkRef(BigInteger... values) {
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
@return The current Location object instance
@since 3.1.0
*/
    public Location withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current Location object instance
@since 3.1.0
*/
    public Location withExtReferences(BigInteger... values) {
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
@return The current Location object instance
@since 3.1.0
*/
    public Location withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current Location object instance
@since 3.1.0
*/
    public Location withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current Location object instance
@since 3.1.0
*/
    public Location withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current Location object instance
@since 3.1.0
*/
    public Location withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current Location object instance
@since 3.1.0
*/
    public Location withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this Location instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Location {"
 + (cityArea !=null? " cityArea [" + cityArea +"]" : "") 
 + (country !=null? " country [" + country +"]" : "") 
 + (effectiveDate !=null? " effectiveDate [" + effectiveDate +"]" : "") 
 + (ellipse !=null? " ellipse [" + ellipse +"]" : "") 
 + (expirationDate !=null? " expirationDate [" + expirationDate +"]" : "") 
 + (locationRef !=null? " locationRef [" + locationRef +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") 
 + (pocInformation !=null? " pocInformation [" + pocInformation +"]" : "") 
 + (point !=null? " point [" + point +"]" : "") 
 + (polygon !=null? " polygon [" + polygon +"]" : "") 
 + (postCode !=null? " postCode [" + postCode +"]" : "") 
 + (reviewDate !=null? " reviewDate [" + reviewDate +"]" : "") 
 + (stateCounty !=null? " stateCounty [" + stateCounty +"]" : "") 
 + (street !=null? " street [" + street +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Location} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link S100 Name}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetName();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
LocationRef - Element Content (Required) 

The serial of the referenced Location.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Set<Location> location;

/**
Get the serial of the referenced Location.

@return  a {@link Location} instance
@since 3.1.0
*/
public Set<Location> getLocation(){
if(location == null){
location = new HashSet<>();
}
 return location;
}
/**
 Determine if the location field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetLocation() {
return this.location !=null  && !this.location.isEmpty();
}

/**
Set the serial of the referenced Location.

@param values  An instances of type {@link Location}
@return The current Location object instance
@since 3.1.0
*/
public Location withLocation(Location... values) {
return  withLocation(Arrays.asList(values));
}

/**
Set the serial of the referenced Location.

@param values  An instances of type {@link Location}
@return The current Location object instance
@since 3.1.0
*/
public Location withLocation(Collection<Location> values) {
getLocation().addAll(values);
return this;
}
  /**
   * Update the SSRF data type references in this Location record.
   * <p>
 @since 3.1.0 */
  @Override
public void prepare() {
super.prepare();
this.locationRef= new ArrayList<>();
for (Location instance :  getLocation()) {
this.locationRef.add(instance.getSerial());
}

/**
   * Update the SSRF data type references in this Location record after loading from XML.

   * This method builds the transient {@link #location} with values
   * from the imported {@link #locationRef} field. This method should
   * typically be called after the Location is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (locationRef==null || locationRef.isEmpty() ) {return;}
for(Location instance : root.getLocation()) {
if(locationRef.contains(instance.getSerial())){
location.add(instance);
}
}}//</editor-fold>

}
