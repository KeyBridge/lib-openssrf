package us.gov.dod.standard.ssrf._3_1.jrfl;

import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
JRFLEntryLocation defines the location where the use of a specific frequency or frequency range(s) is restricted in use.

Element of {@link JRFLEntry}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JRFLEntryLocation", propOrder = {
    "serial",
    "antFeedpointHeight"
})
public class JRFLEntryLocation {

/**
Serial  - Location Reference (Required) 

The serial of the referenced Location.

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "LO".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "Serial", required = true)
      private  Serial serial;
/**
AntFeedpointHeight  - Antenna Feedpoint Height (Optional) 

The antenna feed point height above the terrain, in metres. In the case where the antenna is mounted pointing vertically to a reflector on the same structure, enter the height of the reflector above ground. If the Station is a flying object, this data represents the maximum altitude of the object above ground.

Format is SN(7,2) (m)
@since 3.1.0
*/
    @XmlElement(name = "AntFeedpointHeight", required = false)
    private Height_UN4 antFeedpointHeight;

/**
Get the serial of the referenced Location.

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "LO".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"

@return the Serial value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getLocation()} instead.
*/
@Deprecated
public Serial getSerial() {
        return serial;
    }

/**
Set the serial of the referenced Location.

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "LO".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"

@param value the Serial value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setLocation(Location)} instead.
*/
@Deprecated
public void setSerial(Serial value) {
        this.serial = value;
    }

/**
Determine if the Serial is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSerial() {
        return (this.serial!= null);
    }

/**
Get the antenna feed point height above the terrain, in metres. In the case where the antenna is mounted pointing vertically to a reflector on the same structure, enter the height of the reflector above ground. If the Station is a flying object, this data represents the maximum altitude of the object above ground.

@return the AntFeedpointHeight value in a {@link THeight_UN4} data type
@since 3.1.0
*/
public Height_UN4 getAntFeedpointHeight() {
        return antFeedpointHeight;
    }

/**
Set the antenna feed point height above the terrain, in metres. In the case where the antenna is mounted pointing vertically to a reflector on the same structure, enter the height of the reflector above ground. If the Station is a flying object, this data represents the maximum altitude of the object above ground.

@param value the AntFeedpointHeight value in a {@link THeight_UN4} data type
@since 3.1.0
*/
public void setAntFeedpointHeight(Height_UN4 value) {
        this.antFeedpointHeight = value;
    }

/**
Determine if the AntFeedpointHeight is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAntFeedpointHeight() {
        return (this.antFeedpointHeight!= null);
    }

/**
Set the serial of the referenced Location.

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "LO".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"

@param value  An instances of type {@link Serial}
@return The current JRFLEntryLocation object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withLocation(Location)} instead.
*/
@Deprecated
    public JRFLEntryLocation withSerial(Serial value) {
        setSerial(value);
        return this;
    }

/**
Set the antenna feed point height above the terrain, in metres. In the case where the antenna is mounted pointing vertically to a reflector on the same structure, enter the height of the reflector above ground. If the Station is a flying object, this data represents the maximum altitude of the object above ground.

@param value  An instances of type {@link Integer}
@return The current JRFLEntryLocation object instance
@since 3.1.0
*/
    public JRFLEntryLocation withAntFeedpointHeight(Integer value) {
           setAntFeedpointHeight(new Height_UN4(value));
        return this;
    }

/**
 Get a string representation of this JRFLEntryLocation instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "JRFLEntryLocation {"
 + (antFeedpointHeight !=null? " antFeedpointHeight [" + antFeedpointHeight +"]" : "") 
 + (serial !=null? " serial [" + serial +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link JRFLEntryLocation} requires {@link Serial Serial}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetSerial();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
Serial  - Location Reference (Required) 

The serial of the referenced Location.

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "LO".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Location location;

/**
Get the serial of the referenced Location.

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "LO".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"

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

[XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "LO".
[XSD ERR REGEX] This data item MUST comply to the regular expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"

@param value  An instances of type {@link Location}
@return The current JRFLEntryLocation object instance
@since 3.1.0
*/
public JRFLEntryLocation withLocation(Location value) {
this.location = value;
return this;
}

  /**
   * Update the SSRF data type references in this JRFLEntryLocation record.
   * <p>
 */
public void prepare() {
this.serial = location !=null? location.getSerial() : null;
}

/**
   * Update the SSRF data type references in this JRFLEntryLocation record after loading from XML.

   * This method builds the transient {@link #location} with values
   * from the imported {@link #serial} field. This method should
   * typically be called after the JRFLEntryLocation is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (serial==null || !serial.isSetValue() ) {return;}
for(Location instance : root.getLocation()) {
if(serial.equals(instance.getSerial())){
location = instance;
return;}
}}//</editor-fold>

}
