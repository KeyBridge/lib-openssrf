package us.gov.dod.standard.ssrf._3_1.antenna;

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
Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

Element of {@link Antenna}, {@link ForceElement}, {@link RFSystem}, {@link Receiver}, {@link SSRequest}, {@link Satellite}, {@link Transmitter}

Sub-Element is {@link Manufacturer}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nomenclature", propOrder = {
    "type",
    "level",
    "name",
    "physicalUsage",
    "manufacturer"
})
public class Nomenclature {

/**
Type  - Type (Optional) 

The type of nomenclature (commercial, military, etc).

Format is L:CTO
@since 3.1.0
*/
    @XmlElement(name = "Type", required = false)
    private TString type;
/**
Level  - Level (Optional) 

The level of nomenclature (primary, nickname, etc).

Format is L:CNU
@since 3.1.0
*/
    @XmlElement(name = "Level", required = false)
    private TString level;
/**
Name  - Name (Required) 

The standard military nomenclature. If the unit does not have a military nomenclature, enter the manufacturer model number, or a short description.

Format is S100

Divergence from SMADEF: When exchanging data with NATO Antennas must contain at least one Nomenclature
@since 3.1.0
*/
    @XmlElement(name = "Name", required = true)
      private  S100 name;
/**
In Data Item PhysicalUsage (US), indicate the type of vehicle or other entity that uses the equipment, or from which the subject signal emanates.
@since 3.1.0
*/
    @XmlElement(name = "PhysicalUsage", required = false)
    private TString physicalUsage;
/**
Manufacturer (Optional)

Manufacturer contains the manufacturer name of the equipment listed in the corresponding data entry in data element Nomenclature. Additionally the country in which the equipment is manufactured may be included.
@since 3.1.0
*/
    @XmlElement(name = "Manufacturer")
      private  Set<Manufacturer> manufacturer;

/**
Get the type of nomenclature (commercial, military, etc).

@return the Type value in a {@link TString} data type
@since 3.1.0
*/
public TString getType() {
        return type;
    }

/**
Set the type of nomenclature (commercial, military, etc).

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
Get the level of nomenclature (primary, nickname, etc).

@return the Level value in a {@link TString} data type
@since 3.1.0
*/
public TString getLevel() {
        return level;
    }

/**
Set the level of nomenclature (primary, nickname, etc).

@param value the Level value in a {@link TString} data type
@since 3.1.0
*/
public void setLevel(TString value) {
        this.level = value;
    }

/**
Determine if the Level is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLevel() {
return (this.level!= null ? this.level.isSetValue() : false);
    }

/**
Get the standard military nomenclature. If the unit does not have a military nomenclature, enter the manufacturer model number, or a short description.

@return the Name value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getName() {
        return name;
    }

/**
Set the standard military nomenclature. If the unit does not have a military nomenclature, enter the manufacturer model number, or a short description.

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
Get In Data Item PhysicalUsage (US), indicate the type of vehicle or other entity that uses the equipment, or from which the subject signal emanates.

@return the PhysicalUsage value in a {@link TString} data type
@since 3.1.0
*/
public TString getPhysicalUsage() {
        return physicalUsage;
    }

/**
Set In Data Item PhysicalUsage (US), indicate the type of vehicle or other entity that uses the equipment, or from which the subject signal emanates.

@param value the PhysicalUsage value in a {@link TString} data type
@since 3.1.0
*/
public void setPhysicalUsage(TString value) {
        this.physicalUsage = value;
    }

/**
Determine if the PhysicalUsage is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPhysicalUsage() {
return (this.physicalUsage!= null ? this.physicalUsage.isSetValue() : false);
    }

/**
Get the Manufacturer

Complex element Manufacturer contains the manufacturer name of the equipment listed in the corresponding data entry in data element Nomenclature. Additionally the country in which the equipment is manufactured may be included.

@return  a {@link Manufacturer} instance
@since 3.1.0
*/
    public Set<Manufacturer> getManufacturer() {
        if (manufacturer == null) {
            manufacturer = new HashSet<Manufacturer>();
        }
        return this.manufacturer;
    }

/**
Determine if the Manufacturer is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetManufacturer() {
        return ((this.manufacturer!= null)&&(!this.manufacturer.isEmpty()));
    }

/**
  Clear the Manufacturer field. This sets the field to null.
 */
    public void unsetManufacturer() {
        this.manufacturer = null;
    }

/**
Set the type of nomenclature (commercial, military, etc).

@param value  An instances of type {@link ListCTO}
@return The current Nomenclature object instance
@since 3.1.0
*/
    public Nomenclature withType(ListCTO value) {
           setType(new TString(value.value()));
        return this;
    }

/**
Set the level of nomenclature (primary, nickname, etc).

@param value  An instances of type {@link ListCNU}
@return The current Nomenclature object instance
@since 3.1.0
*/
    public Nomenclature withLevel(ListCNU value) {
           setLevel(new TString(value.value()));
        return this;
    }

/**
Set the standard military nomenclature. If the unit does not have a military nomenclature, enter the manufacturer model number, or a short description.

@param value  An instances of type {@link TS100}
@return The current Nomenclature object instance
@since 3.1.0
*/
    public Nomenclature withName(TS100 value) {
        return this;
    }

/**
Set In Data Item PhysicalUsage (US), indicate the type of vehicle or other entity that uses the equipment, or from which the subject signal emanates.

@param value  An instances of type {@link ListUS5}
@return The current Nomenclature object instance
@since 3.1.0
*/
    public Nomenclature withPhysicalUsage(ListUS5 value) {
           setPhysicalUsage(new TString(value.value()));
        return this;
    }

/**
Set the Manufacturer

Complex element Manufacturer contains the manufacturer name of the equipment listed in the corresponding data entry in data element Nomenclature. Additionally the country in which the equipment is manufactured may be included.

@param values  One or more instances of type {@link Manufacturer...}
@return The current Nomenclature object instance
@since 3.1.0
*/
    public Nomenclature withManufacturer(Manufacturer... values) {
        if (values!= null) {
            for (Manufacturer value: values) {
                getManufacturer().add(value);
            }
        }
        return this;
    }

/**
Set the Manufacturer

Complex element Manufacturer contains the manufacturer name of the equipment listed in the corresponding data entry in data element Nomenclature. Additionally the country in which the equipment is manufactured may be included.

@param values  A collection of {@link Manufacturer} instances
@return The current Nomenclature object instance
@since 3.1.0
*/
    public Nomenclature withManufacturer(Collection<Manufacturer> values) {
        if (values!= null) {
            getManufacturer().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this Nomenclature instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Nomenclature {"
 + (level !=null? " level [" + level +"]" : "") 
 + (manufacturer !=null? " manufacturer [" + manufacturer +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") 
 + (physicalUsage !=null? " physicalUsage [" + physicalUsage +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Nomenclature} requires {@link S100 Name}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetName();
}

}
