package us.gov.dod.standard.ssrf._3_1.assignment;

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
Previous Authorization (US) refers to the frequency assignment's previous Government Master File (GMF) authorization agency serial number.

Element of {@link Assignment}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousAuthorization", propOrder = {
    "docketNum",
    "date",
    "agencySerialNum"
})
public class PreviousAuthorization {

/**
US:DocketNum  - Docket Number (Required) 

The previous frequency assignment Government Master File (GMF) authorization docket number.

Format is S8
@since 3.1.0
*/
    @XmlElement(name = "DocketNum", required = true)
      private  S8 docketNum;
    @XmlElement(name = "Date ", required = false)
    private D date;
/**
US:AgencySerialNum  - Agency Serial Number (Optional) 

The externally-assigned unique identifier of a frequency assignment.

Format is S12
@since 3.1.0
*/
    @XmlElement(name = "AgencySerialNum", required = false)
    private S12 agencySerialNum;

/**
Get the previous frequency assignment Government Master File (GMF) authorization docket number.

@return the DocketNum value in a {@link TS8} data type
@since 3.1.0
*/
public S8 getDocketNum() {
        return docketNum;
    }

/**
Set the previous frequency assignment Government Master File (GMF) authorization docket number.

@param value the DocketNum value in a {@link TS8} data type
@since 3.1.0
*/
public void setDocketNum(S8 value) {
        this.docketNum = value;
    }

/**
Determine if the DocketNum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDocketNum() {
        return (this.docketNum!= null);
    }

/**
Get the previous frequency assignment Government Master File (GMF) authorization date.

@return the Date value in a {@link TD} data type
@since 3.1.0
*/
public D getDate() {
        return date;
    }

/**
Set the previous frequency assignment Government Master File (GMF) authorization date.

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
        return (this.date != null);
    }

/**
Get the externally-assigned unique identifier of a frequency assignment.

@return the AgencySerialNum value in a {@link TS12} data type
@since 3.1.0
*/
public S12 getAgencySerialNum() {
        return agencySerialNum;
    }

/**
Set the externally-assigned unique identifier of a frequency assignment.

@param value the AgencySerialNum value in a {@link TS12} data type
@since 3.1.0
*/
public void setAgencySerialNum(S12 value) {
        this.agencySerialNum = value;
    }

/**
Determine if the AgencySerialNum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAgencySerialNum() {
        return (this.agencySerialNum!= null);
    }

/**
Set the previous frequency assignment Government Master File (GMF) authorization docket number.

@param value  An instances of type {@link TS8}
@return The current PreviousAuthorization object instance
@since 3.1.0
*/
    public PreviousAuthorization withDocketNum(TS8 value) {
        return this;
    }

/**
Set the previous frequency assignment Government Master File (GMF) authorization date.

@param value  An instances of type {@link Calendar}
@return The current PreviousAuthorization object instance
@since 3.1.0
*/
    public PreviousAuthorization withDate(Calendar value) {
           setDate(new D(value));
        return this;
    }
/**
Set the previous frequency assignment Government Master File (GMF) authorization date.

@param value  An instances of type {@link Date}
@return The current PreviousAuthorization object instance
@since 3.1.0
*/
    public PreviousAuthorization withDate(Date value) {
           setDate(new D(value));
        return this;
    }

/**
Set the externally-assigned unique identifier of a frequency assignment.

@param value  An instances of type {@link String}
@return The current PreviousAuthorization object instance
@since 3.1.0
*/
    public PreviousAuthorization withAgencySerialNum(String value) {
           setAgencySerialNum(new S12(value));
        return this;
    }

/**
 Get a string representation of this PreviousAuthorization instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "PreviousAuthorization {"
 + (agencySerialNum !=null? " agencySerialNum [" + agencySerialNum +"]" : "") 
 + (date !=null? " date [" + date +"]" : "") 
 + (docketNum !=null? " docketNum [" + docketNum +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link PreviousAuthorization} requires {@link S8 DocketNum}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetDocketNum();
}

}
