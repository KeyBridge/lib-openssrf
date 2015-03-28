package us.gov.dod.standard.ssrf._3_1.satellite;

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
EarthStation contains the name and type of an earth station used in a satellite network.

Element of {@link Satellite}

Example: <pre>
* &lt;EarthStation&gt;
*   &lt;Name cls="U"&gt;Kessler&lt;/Name&gt;
*   &lt;Type cls="U"&gt;Specific&lt;/Type&gt;
* &lt;/EarthStation&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarthStation", propOrder = {
    "name",
    "type",
    "locationRef"
})
public class EarthStation {

/**
Name - Station Name (Optional) 

The name of an associated earth station.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "Name", required = false)
    private S50 name;
/**
Type - Station Type (Optional) 

If this is a specific or typical earth station.

Format is L:CEA
@since 3.1.0
*/
    @XmlElement(name = "Type", required = false)
    private TString type;
/**
LocationRef - Location Serial (Optional) 

The serial of the referenced Location.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "LocationRef", required = false)
    private Serial locationRef;

/**
Get the name of an associated earth station.

@return the Name value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getName() {
        return name;
    }

/**
Set the name of an associated earth station.

@param value the Name value in a {@link TS50} data type
@since 3.1.0
*/
public void setName(S50 value) {
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
Get if this is a specific or typical earth station.

@return the Type value in a {@link TString} data type
@since 3.1.0
*/
public TString getType() {
        return type;
    }

/**
Set if this is a specific or typical earth station.

@param value the Type value in a {@link TString} data type
@since 3.1.0
*/
public void setType(TString value) {
        this.type = value;
    }

/**
Determine if the Type is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetType() {
return (this.type!= null ? this.type.isSetValue() : false);
    }

/**
Get the serial of the referenced Location.

@return the LocationRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getLocation()} instead.
*/
@Deprecated
public Serial getLocationRef() {
        return locationRef;
    }

/**
Set the serial of the referenced Location.

@param value the LocationRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setLocation(Location)} instead.
*/
@Deprecated
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
Set the name of an associated earth station.

@param value  An instances of type {@link String}
@return The current EarthStation object instance
@since 3.1.0
*/
    public EarthStation withName(String value) {
           setName(new S50(value));
        return this;
    }

/**
Set if this is a specific or typical earth station.

@param value  An instances of type {@link ListCEA}
@return The current EarthStation object instance
@since 3.1.0
*/
    public EarthStation withType(ListCEA value) {
           setType(new TString(value.value()));
        return this;
    }

/**
Set the serial of the referenced Location.

@param value  An instances of type {@link Serial}
@return The current EarthStation object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withLocation(Location)} instead.
*/
@Deprecated
    public EarthStation withLocationRef(Serial value) {
           setLocationRef(value);
        return this;
    }

/**
 Get a string representation of this EarthStation instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "EarthStation {"
 + (locationRef !=null? " locationRef [" + locationRef +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link EarthStation} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
LocationRef - Location Serial (Optional) 

The serial of the referenced Location.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Location location;

/**
Get the serial of the referenced Location.

@return  a {@link Location} instance
@since 3.1.0
*/
public Location getLocation(){
return location;
}
/**
 Determine if the location field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetLocation() {
    return this.location != null ;
}

/**
Set the serial of the referenced Location.

@param value  An instances of type {@link Location}
@return The current EarthStation object instance
@since 3.1.0
*/
public EarthStation withLocation(Location value) {
this.location = value;
return this;
}

  /**
   * Update the SSRF data type references in this EarthStation record.
   * <p>
 */
public void prepare() {
this.locationRef = location !=null? location.getSerial() : null;
}

/**
   * Update the SSRF data type references in this EarthStation record after loading from XML.

   * This method builds the transient {@link #location} with values
   * from the imported {@link #locationRef} field. This method should
   * typically be called after the EarthStation is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (locationRef==null || !locationRef.isSetValue() ) {return;}
for(Location instance : root.getLocation()) {
if(locationRef.equals(instance.getSerial())){
location = instance;
return;}
}}//</editor-fold>

}
