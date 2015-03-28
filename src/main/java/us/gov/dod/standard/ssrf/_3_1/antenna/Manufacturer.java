package us.gov.dod.standard.ssrf._3_1.antenna;

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
Manufacturer contains the manufacturer name of the equipment listed in the corresponding data entry in data element Nomenclature. Additionally the country in which the equipment is manufactured may be included.

Element of {@link Nomenclature}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Manufacturer", propOrder = {
    "country",
    "name"
})
public class Manufacturer {

/**
Country  - Country/Area (Optional) 

The country or area in which the Manufacturer has its Headquarters.

Format is L:CAO
@since 3.1.0
*/
    @XmlElement(name = "Country", required = false)
    private TString country;
/**
Name  - Manufacturer Name (Required) 

The name of the company that manufactured the equipment.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Name", required = true)
      private  S100 name;

/**
Get the country or area in which the Manufacturer has its Headquarters.

@return the Country value in a {@link TString} data type
@since 3.1.0
*/
public TString getCountry() {
        return country;
    }

/**
Set the country or area in which the Manufacturer has its Headquarters.

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
Get the name of the company that manufactured the equipment.

@return the Name value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getName() {
        return name;
    }

/**
Set the name of the company that manufactured the equipment.

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
Set the country or area in which the Manufacturer has its Headquarters.

@param value  An instances of type {@link ListCAO}
@return The current Manufacturer object instance
@since 3.1.0
*/
    public Manufacturer withCountry(ListCAO value) {
           setCountry(new TString(value.value()));
        return this;
    }

/**
Set the name of the company that manufactured the equipment.

@param value  An instances of type {@link TS100}
@return The current Manufacturer object instance
@since 3.1.0
*/
    public Manufacturer withName(TS100 value) {
        return this;
    }

/**
 Get a string representation of this Manufacturer instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Manufacturer {"
 + (country !=null? " country [" + country +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Manufacturer} requires {@link S100 Name}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetName();
}

}
