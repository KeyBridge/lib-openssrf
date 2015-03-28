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
Email contains the email address of the Contact or Role.

Element of {@link Contact}, {@link Organisation}, {@link Role}

Example: <pre>
* &lt;EMail&gt;
*   &lt;Preferred cls="U"&gt;Yes&lt;/Preferred&gt;
*   &lt;Type cls="U"&gt;Internet&lt;/Type&gt;
*   &lt;MaxCls cls="U"&gt;U&lt;/MaxCls&gt;
*   &lt;Address&gt;john.doe@abc.com&lt;/Address&gt;
* &lt;/EMail&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMail", propOrder = {
    "preferred",
    "type",
    "maxCls",
    "address"
})
public class EMail {

/**
Preferred  - Preferred Address (Optional) 

A code "Yes" for the preferred address(es) and a code "No" for the others. Automated tools SHOULD send all mails to this Contact to all its preferred addresses.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Preferred", required = false)
    private TString preferred;
/**
Type  - System or Network (Optional) 

The type of network hosting the e-mail address.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "Type", required = false)
    private S20 type;
/**
MaxCls  - System Maximum Classification (Optional) 

The highest classification that can be used for the email address.

Format is L:CCL
@since 3.1.0
*/
    @XmlElement(name = "MaxCls", required = false)
    private TString maxCls;
/**
Address  - Email Address (Required) 

The e-mail address.

Format is S255
@since 3.1.0
*/
    @XmlElement(name = "Address", required = true)
      private  S255 address;

/**
Get a code "Yes" for the preferred address(es) and a code "No" for the others. Automated tools SHOULD send all mails to this Contact to all its preferred addresses.

@return the Preferred value in a {@link TString} data type
@since 3.1.0
*/
public TString getPreferred() {
        return preferred;
    }

/**
Set a code "Yes" for the preferred address(es) and a code "No" for the others. Automated tools SHOULD send all mails to this Contact to all its preferred addresses.

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
Get the type of network hosting the e-mail address.

@return the Type value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getType() {
        return type;
    }

/**
Set the type of network hosting the e-mail address.

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
Get the highest classification that can be used for the email address.

@return the MaxCls value in a {@link TString} data type
@since 3.1.0
*/
public TString getMaxCls() {
        return maxCls;
    }

/**
Set the highest classification that can be used for the email address.

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
Get the e-mail address.

@return the Address value in a {@link TS255} data type
@since 3.1.0
*/
public S255 getAddress() {
        return address;
    }

/**
Set the e-mail address.

@param value the Address value in a {@link TS255} data type
@since 3.1.0
*/
public void setAddress(S255 value) {
        this.address = value;
    }

/**
Determine if the Address is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAddress() {
        return (this.address!= null);
    }

/**
Set a code "Yes" for the preferred address(es) and a code "No" for the others. Automated tools SHOULD send all mails to this Contact to all its preferred addresses.

@param value  An instances of type {@link ListCBO}
@return The current EMail object instance
@since 3.1.0
*/
    public EMail withPreferred(ListCBO value) {
           setPreferred(new TString(value.value()));
        return this;
    }

/**
Set the type of network hosting the e-mail address.

@param value  An instances of type {@link String}
@return The current EMail object instance
@since 3.1.0
*/
    public EMail withType(String value) {
           setType(new S20(value));
        return this;
    }

/**
Set the highest classification that can be used for the email address.

@param value  An instances of type {@link ListCCL}
@return The current EMail object instance
@since 3.1.0
*/
    public EMail withMaxCls(ListCCL value) {
           setMaxCls(new TString(value.value()));
        return this;
    }

/**
Set the e-mail address.

@param value  An instances of type {@link TS255}
@return The current EMail object instance
@since 3.1.0
*/
    public EMail withAddress(TS255 value) {
        return this;
    }

/**
 Get a string representation of this EMail instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "EMail {"
 + (address !=null? " address [" + address +"]" : "") 
 + (maxCls !=null? " maxCls [" + maxCls +"]" : "") 
 + (preferred !=null? " preferred [" + preferred +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link EMail} requires {@link S255 Address}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetAddress();
}

}
