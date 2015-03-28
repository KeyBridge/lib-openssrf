package us.gov.dod.standard.ssrf._3_1.common;

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
CaseNum provides the capability to store multiple identifiers for a Dataset.

Element of {@link Common}, {@link Configuration}

Example: <pre>
* &lt;CaseNum&gt;
*   &lt;Country cls="U"&gt;NLD&lt;/Country&gt;
*   &lt;Identifier cls="U"&gt;JWID 2002&lt;/Identifier&gt;
* &lt;/CaseNum&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseNum", propOrder = {
    "country",
    "type",
    "identifier"
})
public class CaseNum {

/**
Country  - Country/Body issuing the case number (Optional) 

The nation or body who provided or assigned the case number.

Format is L:CAO
@since 3.1.0
*/
    @XmlElement(name = "Country", required = false)
    private TString country;
/**
Type  - Case Number Type (Optional) 

A text identifying the type of case number (national file, exercise name, etc).

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "Type", required = false)
    private S20 type;
/**
Identifier  - Case Number (Required) 

The case number.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "Identifier", required = true)
      private  S20 identifier;

/**
Get the nation or body who provided or assigned the case number.

@return the Country value in a {@link TString} data type
@since 3.1.0
*/
public TString getCountry() {
        return country;
    }

/**
Set the nation or body who provided or assigned the case number.

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
Get a text identifying the type of case number (national file, exercise name, etc).

@return the Type value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getType() {
        return type;
    }

/**
Set a text identifying the type of case number (national file, exercise name, etc).

@param value the Type value in a {@link TS20} data type
@since 3.1.0
*/
public void setType(S20 value) {
        this.type = value;
    }

/**
Determine if the Type is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetType() {
        return (this.type!= null);
    }

/**
Get the case number.

@return the Identifier value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getIdentifier() {
        return identifier;
    }

/**
Set the case number.

@param value the Identifier value in a {@link TS20} data type
@since 3.1.0
*/
public void setIdentifier(S20 value) {
        this.identifier = value;
    }

/**
Determine if the Identifier is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIdentifier() {
        return (this.identifier!= null);
    }

/**
Set the nation or body who provided or assigned the case number.

@param value  An instances of type {@link ListCAO}
@return The current CaseNum object instance
@since 3.1.0
*/
    public CaseNum withCountry(ListCAO value) {
           setCountry(new TString(value.value()));
        return this;
    }

/**
Set a text identifying the type of case number (national file, exercise name, etc).

@param value  An instances of type {@link String}
@return The current CaseNum object instance
@since 3.1.0
*/
    public CaseNum withType(String value) {
           setType(new S20(value));
        return this;
    }

/**
Set the case number.

@param value  An instances of type {@link TS20}
@return The current CaseNum object instance
@since 3.1.0
*/
    public CaseNum withIdentifier(TS20 value) {
        return this;
    }

/**
 Get a string representation of this CaseNum instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "CaseNum {"
 + (country !=null? " country [" + country +"]" : "") 
 + (identifier !=null? " identifier [" + identifier +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link CaseNum} requires {@link S20 Identifier}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetIdentifier();
}

}
