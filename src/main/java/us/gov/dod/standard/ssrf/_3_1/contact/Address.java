package us.gov.dod.standard.ssrf._3_1.contact;

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
Address contains the address of a Contact, Organisation or Role.

Element of {@link Contact}, {@link Organisation}, {@link Role}

Example: <pre>
* &lt;Address&gt;
*   &lt;CityArea  cls="U"&gt;Annapolis&lt;/CityArea &gt;
*   &lt;Country  cls="U"&gt;USA&lt;/Country &gt;
*   &lt;Description  cls="U"&gt;Engineering Services Organization&lt;/Description &gt;
*   &lt;PostCode  cls="U"&gt;21402&lt;/PostCode &gt;
*   &lt;StateCounty  cls="U"&gt;Maryland&lt;/StateCounty &gt;
*   &lt;Street  cls="U"&gt;Turbot&lt;/Street &gt;
* &lt;/Address&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "description",
    "street",
    "cityArea",
    "stateCounty",
    "postCode",
    "country"
})
public class Address {

/**
Description  - Address Title (Optional) 

The title for the address; for an Organisation, it can be the name of the specific Branch or office; for a Contact or a Role, it can be the job title associated to the address.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Description", required = false)
    private S100 description;
/**
Street  - Street Address (Optional) 

The street address.

Format is S255

Attribute group Address Information (Required)
@since 3.1.0
*/
    @XmlElement(name = "Street", required = false)
    private S255 street;
/**
CityArea  - City or Area (Optional) 

The city of the address or an operational area name.

Format is S50

Attribute group Address Information (Required)
@since 3.1.0
*/
    @XmlElement(name = "CityArea", required = false)
    private S50 cityArea;
/**
StateCounty  - State or County (Optional) 

The state or other sub-national political area.

Format is S50

Attribute group Address Information (Required)
@since 3.1.0
*/
    @XmlElement(name = "StateCounty", required = false)
    private S50 stateCounty;
/**
PostCode  - Zip Code or Post Code (Optional) 

The zip code or postal code portion of the address.

Format is S15

Attribute group Address Information (Required)
@since 3.1.0
*/
    @XmlElement(name = "PostCode", required = false)
    private S15 postCode;
/**
Country  - Country or Area (Required) 

The country or area code. Use a one to six alphabetic characters representing either an official country code, a regional body, a group of countries or a NATO Command.

Format is L:CAO

Attribute group Address Information (Required)
@since 3.1.0
*/
    @XmlElement(name = "Country", required = true)
      private  TString country;

/**
Get the title for the address; for an Organisation, it can be the name of the specific Branch or office; for a Contact or a Role, it can be the job title associated to the address.

@return the Description value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getDescription() {
        return description;
    }

/**
Set the title for the address; for an Organisation, it can be the name of the specific Branch or office; for a Contact or a Role, it can be the job title associated to the address.

@param value the Description value in a {@link TS100} data type
@since 3.1.0
*/
public void setDescription(S100 value) {
        this.description = value;
    }

/**
Determine if the Description is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDescription() {
        return (this.description!= null);
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
Set the title for the address; for an Organisation, it can be the name of the specific Branch or office; for a Contact or a Role, it can be the job title associated to the address.

@param value  An instances of type {@link String}
@return The current Address object instance
@since 3.1.0
*/
    public Address withDescription(String value) {
           setDescription(new S100(value));
        return this;
    }

/**
Set the street address.

@param value  An instances of type {@link String}
@return The current Address object instance
@since 3.1.0
*/
    public Address withStreet(String value) {
           setStreet(new S255(value));
        return this;
    }

/**
Set the city of the address or an operational area name.

@param value  An instances of type {@link String}
@return The current Address object instance
@since 3.1.0
*/
    public Address withCityArea(String value) {
           setCityArea(new S50(value));
        return this;
    }

/**
Set the state or other sub-national political area.

@param value  An instances of type {@link String}
@return The current Address object instance
@since 3.1.0
*/
    public Address withStateCounty(String value) {
           setStateCounty(new S50(value));
        return this;
    }

/**
Set the zip code or postal code portion of the address.

@param value  An instances of type {@link String}
@return The current Address object instance
@since 3.1.0
*/
    public Address withPostCode(String value) {
           setPostCode(new S15(value));
        return this;
    }

/**
Set the country or area code. Use a one to six alphabetic characters representing either an official country code, a regional body, a group of countries or a NATO Command.

@param value  An instances of type {@link ListCAO}
@return The current Address object instance
@since 3.1.0
*/
    public Address withCountry(ListCAO value) {
        setCountry(new TString(value.value()));
        return this;
    }

/**
 Get a string representation of this Address instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Address {"
 + (cityArea !=null? " cityArea [" + cityArea +"]" : "") 
 + (country !=null? " country [" + country +"]" : "") 
 + (description !=null? " description [" + description +"]" : "") 
 + (postCode !=null? " postCode [" + postCode +"]" : "") 
 + (stateCounty !=null? " stateCounty [" + stateCounty +"]" : "") 
 + (street !=null? " street [" + street +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Address} requires {@link TString Country}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetCountry();
}

}
