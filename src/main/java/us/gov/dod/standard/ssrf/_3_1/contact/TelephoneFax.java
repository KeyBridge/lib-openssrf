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
TelephoneFax reflects the telephone and/or telefax number(s) of the Contact, Organisation or Role.

Element of {@link Contact}, {@link Organisation}, {@link Role}

Example: <pre>
* &lt;TelephoneFax&gt;
*   &lt;Type cls="U"&gt;TEL-Civil&lt;/Type&gt;
*   &lt;Number cls="U"&gt;(202)281-3824x1234&lt;/Number&gt;
* &lt;/TelephoneFax&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneFax", propOrder = {
    "preferred",
    "type",
    "fax",
    "maxCls",
    "number"
})
public class TelephoneFax {

/**
Preferred  - Preferred Number (Optional) 

A code "Yes" for the preferred number(s) and a code "No" for the others.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Preferred", required = false)
    private TString preferred;
/**
Type  - System or Network (Optional) 

The name of the network on which this number can be dialed (e.g.,  DSN, IVSN, CORMORANT). Use "PUBLIC" for normal public telephone or GSM.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "Type", required = false)
    private S20 type;
/**
Fax  - Telefax Indicator (Optional) 

"Yes" if the number is for a telefax. If this item is empty, it SHOULD be considered as "No".

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Fax", required = false)
    private TString fax;
/**
MaxCls  - System Maximum Classification (Optional) 

The highest classification that can be used on the network. Note for the USA: The letter "R" MUST NOT be used in USA created datasets.

Format is L:CCL
@since 3.1.0
*/
    @XmlElement(name = "MaxCls", required = false)
    private TString maxCls;
/**
Number  - Tel or Fax Number (Required) 

The area code, telephone/telefax number (including the extension if necessary) of individual or contact organisation.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "Number", required = true)
      private  S50 number;

/**
Get a code "Yes" for the preferred number(s) and a code "No" for the others.

@return the Preferred value in a {@link TString} data type
@since 3.1.0
*/
public TString getPreferred() {
        return preferred;
    }

/**
Set a code "Yes" for the preferred number(s) and a code "No" for the others.

@param value the Preferred value in a {@link TString} data type
@since 3.1.0
*/
public void setPreferred(TString value) {
        this.preferred = value;
    }

/**
Determine if the Preferred is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPreferred() {
return (this.preferred!= null ? this.preferred.isSetValue() : false);
    }

/**
Get the name of the network on which this number can be dialed (e.g.,  DSN, IVSN, CORMORANT). Use "PUBLIC" for normal public telephone or GSM.

@return the Type value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getType() {
        return type;
    }

/**
Set the name of the network on which this number can be dialed (e.g.,  DSN, IVSN, CORMORANT). Use "PUBLIC" for normal public telephone or GSM.

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
Get "Yes" if the number is for a telefax. If this item is empty, it SHOULD be considered as "No".

@return the Fax value in a {@link TString} data type
@since 3.1.0
*/
public TString getFax() {
        return fax;
    }

/**
Set "Yes" if the number is for a telefax. If this item is empty, it SHOULD be considered as "No".

@param value the Fax value in a {@link TString} data type
@since 3.1.0
*/
public void setFax(TString value) {
        this.fax = value;
    }

/**
Determine if the Fax is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFax() {
return (this.fax!= null ? this.fax.isSetValue() : false);
    }

/**
Get the highest classification that can be used on the network. Note for the USA: The letter "R" MUST NOT be used in USA created datasets.

@return the MaxCls value in a {@link TString} data type
@since 3.1.0
*/
public TString getMaxCls() {
        return maxCls;
    }

/**
Set the highest classification that can be used on the network. Note for the USA: The letter "R" MUST NOT be used in USA created datasets.

@param value the MaxCls value in a {@link TString} data type
@since 3.1.0
*/
public void setMaxCls(TString value) {
        this.maxCls = value;
    }

/**
Determine if the MaxCls is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMaxCls() {
return (this.maxCls!= null ? this.maxCls.isSetValue() : false);
    }

/**
Get the area code, telephone/telefax number (including the extension if necessary) of individual or contact organisation.

@return the Number value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getNumber() {
        return number;
    }

/**
Set the area code, telephone/telefax number (including the extension if necessary) of individual or contact organisation.

@param value the Number value in a {@link TS50} data type
@since 3.1.0
*/
public void setNumber(S50 value) {
        this.number = value;
    }

/**
Determine if the Number is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumber() {
        return (this.number!= null);
    }

/**
Set a code "Yes" for the preferred number(s) and a code "No" for the others.

@param value  An instances of type {@link ListCBO}
@return The current TelephoneFax object instance
@since 3.1.0
*/
    public TelephoneFax withPreferred(ListCBO value) {
           setPreferred(new TString(value.value()));
        return this;
    }

/**
Set the name of the network on which this number can be dialed (e.g.,  DSN, IVSN, CORMORANT). Use "PUBLIC" for normal public telephone or GSM.

@param value  An instances of type {@link String}
@return The current TelephoneFax object instance
@since 3.1.0
*/
    public TelephoneFax withType(String value) {
           setType(new S20(value));
        return this;
    }

/**
Set "Yes" if the number is for a telefax. If this item is empty, it SHOULD be considered as "No".

@param value  An instances of type {@link ListCBO}
@return The current TelephoneFax object instance
@since 3.1.0
*/
    public TelephoneFax withFax(ListCBO value) {
           setFax(new TString(value.value()));
        return this;
    }

/**
Set the highest classification that can be used on the network. Note for the USA: The letter "R" MUST NOT be used in USA created datasets.

@param value  An instances of type {@link ListCCL}
@return The current TelephoneFax object instance
@since 3.1.0
*/
    public TelephoneFax withMaxCls(ListCCL value) {
           setMaxCls(new TString(value.value()));
        return this;
    }

/**
Set the area code, telephone/telefax number (including the extension if necessary) of individual or contact organisation.

@param value  An instances of type {@link TS50}
@return The current TelephoneFax object instance
@since 3.1.0
*/
    public TelephoneFax withNumber(TS50 value) {
        return this;
    }

/**
 Get a string representation of this TelephoneFax instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "TelephoneFax {"
 + (fax !=null? " fax [" + fax +"]" : "") 
 + (maxCls !=null? " maxCls [" + maxCls +"]" : "") 
 + (number !=null? " number [" + number +"]" : "") 
 + (preferred !=null? " preferred [" + preferred +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link TelephoneFax} requires {@link S50 Number}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetNumber();
}

}
