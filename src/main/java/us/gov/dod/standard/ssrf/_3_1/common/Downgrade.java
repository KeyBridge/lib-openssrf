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
Downgrade (US) contains the downgrade security classification from one or more data information sources.

Element of {@link SecurityClass}

Example: <pre>
* &lt;Downgrade&gt;
*   &lt;DownCls&gt;C&lt;/DownCls&gt;
*   &lt;Date&gt;1999-11-05&lt;/Date&gt;
* &lt;/Downgrade&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Downgrade", propOrder = {
    "downcls",
    "date",
    "downgradeInfo"
})
public class Downgrade {

/**
US:Downcls  - Downgrading Classification (Required) 

The classification level of the dataset after downgrading.

Format is L:CCL
@since 3.1.0
*/
    @XmlElement(name = "Downcls", required = true)
      private  TString downcls;
/**
US:Date  - Downgrading Date (Required) 

The date of the permitted downgrading.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "Date", required = true)
      private  D date;
/**
US:DowngradeInfo  - Downgrading Information (Optional) 

Additional downgrading information, if any.

Format is S200
@since 3.1.0
*/
    @XmlElement(name = "DowngradeInfo", required = false)
    private S200 downgradeInfo;

/**
Get the classification level of the dataset after downgrading.

@return the Downcls value in a {@link TString} data type
@since 3.1.0
*/
public TString getDowncls() {
        return downcls;
    }

/**
Set the classification level of the dataset after downgrading.

@param value the Downcls value in a {@link TString} data type
@since 3.1.0
*/
public void setDowncls(TString value) {
        this.downcls = value;
    }

/**
Determine if the Downcls is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDowncls() {
return (this.downcls!= null ? this.downcls.isSetValue() : false);
    }

/**
Get the date of the permitted downgrading.

@return the Date value in a {@link TD} data type
@since 3.1.0
*/
public D getDate() {
        return date;
    }

/**
Set the date of the permitted downgrading.

@param value the Date value in a {@link TD} data type
@since 3.1.0
*/
public void setDate(D value) {
        this.date = value;
    }

/**
Determine if the Date is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDate() {
        return (this.date!= null);
    }

/**
Get additional downgrading information, if any.

@return the DowngradeInfo value in a {@link TS200} data type
@since 3.1.0
*/
public S200 getDowngradeInfo() {
        return downgradeInfo;
    }

/**
Set additional downgrading information, if any.

@param value the DowngradeInfo value in a {@link TS200} data type
@since 3.1.0
*/
public void setDowngradeInfo(S200 value) {
        this.downgradeInfo = value;
    }

/**
Determine if the DowngradeInfo is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDowngradeInfo() {
        return (this.downgradeInfo!= null);
    }

/**
Set the classification level of the dataset after downgrading.

@param value  An instances of type {@link ListCCL}
@return The current Downgrade object instance
@since 3.1.0
*/
    public Downgrade withDowncls(ListCCL value) {
        setDowncls(new TString(value.value()));
        return this;
    }

/**
Set the date of the permitted downgrading.

@param value  An instances of type {@link TD}
@return The current Downgrade object instance
@since 3.1.0
*/
    public Downgrade withDate(TD value) {
        return this;
    }

/**
Set additional downgrading information, if any.

@param value  An instances of type {@link String}
@return The current Downgrade object instance
@since 3.1.0
*/
    public Downgrade withDowngradeInfo(String value) {
           setDowngradeInfo(new S200(value));
        return this;
    }

/**
 Get a string representation of this Downgrade instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Downgrade {"
 + (date !=null? " date [" + date +"]" : "") 
 + (downcls !=null? " downcls [" + downcls +"]" : "") 
 + (downgradeInfo !=null? " downgradeInfo [" + downgradeInfo +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Downgrade} requires {@link D Date}, {@link TString Downcls}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetDate() &&  isSetDowncls();
}

}
