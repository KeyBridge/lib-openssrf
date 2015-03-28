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
UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the Antenna.

Element of {@link Antenna}, {@link Notation}, {@link RFSystem}, {@link Receiver}, {@link Transmitter}

Example: <pre>
* &lt;UsingCountries&gt;
*   &lt;CountryName cls="U"&gt;UZB&lt;/CountryName&gt;
*   &lt;Role cls="U"&gt;Source&lt;/Role&gt;
* &lt;/UsingCountries&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsingCountries", propOrder = {
    "countryName",
    "role"
})
public class UsingCountries {

/**
US:CountryName - Country Name (Required) 

The designator for a specific country associated with the emitter that transmits the subject Notation/Signal. Emitters commonly have more than one user country associated with them.

Format is L:CAO
@since 3.1.0
*/
    @XmlElement(name = "CountryName", required = true)
      private  TString countryName;
/**
US:Role - Country Role (Optional) 

The role of the country associated with the emitter that transmits the subject Notation/Signal.

Format is L:US2
@since 3.1.0
*/
    @XmlElement(name = "Role", required = false)
    private TString role;

/**
Get the designator for a specific country associated with the emitter that transmits the subject Notation/Signal. Emitters commonly have more than one user country associated with them.

@return the CountryName value in a {@link TString} data type
@since 3.1.0
*/
public TString getCountryName() {
        return countryName;
    }

/**
Set the designator for a specific country associated with the emitter that transmits the subject Notation/Signal. Emitters commonly have more than one user country associated with them.

@param value the CountryName value in a {@link TString} data type
@since 3.1.0
*/
public void setCountryName(TString value) {
        this.countryName = value;
    }

/**
Determine if the CountryName is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCountryName() {
return (this.countryName!= null ? this.countryName.isSetValue() : false);
    }

/**
Get the role of the country associated with the emitter that transmits the subject Notation/Signal.

@return the Role value in a {@link TString} data type
@since 3.1.0
*/
public TString getRole() {
        return role;
    }

/**
Set the role of the country associated with the emitter that transmits the subject Notation/Signal.

@param value the Role value in a {@link TString} data type
@since 3.1.0
*/
public void setRole(TString value) {
        this.role = value;
    }

/**
Determine if the Role is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRole() {
return (this.role!= null ? this.role.isSetValue() : false);
    }

/**
Set the designator for a specific country associated with the emitter that transmits the subject Notation/Signal. Emitters commonly have more than one user country associated with them.

@param value  An instances of type {@link ListCAO}
@return The current UsingCountries object instance
@since 3.1.0
*/
    public UsingCountries withCountryName(ListCAO value) {
        setCountryName(new TString(value.value()));
        return this;
    }

/**
Set the role of the country associated with the emitter that transmits the subject Notation/Signal.

@param value  An instances of type {@link ListUS2}
@return The current UsingCountries object instance
@since 3.1.0
*/
    public UsingCountries withRole(ListUS2 value) {
           setRole(new TString(value.value()));
        return this;
    }

/**
 Get a string representation of this UsingCountries instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "UsingCountries {"
 + (countryName !=null? " countryName [" + countryName +"]" : "") 
 + (role !=null? " role [" + role +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link UsingCountries} requires {@link TString CountryName}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetCountryName();
}

}
