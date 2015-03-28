package us.gov.dod.standard.ssrf._3_1.multiple;

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
NotationTimeline (US) provides history information for a specific notation or signal.

Element of {@link Notation}

Example: See {@link Notation}.
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotationTimeline", propOrder = {
    "code",
    "status",
    "statusChangeDateTime",
    "type"
})
public class NotationTimeline {

/**
US:Code - Notation Code (Required) 

An alphanumeric combination that is used to identify a particular Notation/Signal.

Format is US(20)
@since 3.1.0
*/
    @XmlElement(name = "Code", required = true)
      private  US20 code;
/**
US:Status - Notation Status (Optional) 

The status of the future, prior, or associated, Notation.

Format is L:UNT
@since 3.1.0
*/
    @XmlElement(name = "Status", required = false)
    private TString status;
/**
US:StatusChangeDateTime - Notation Status Timestamp (Optional) 

The timestamp when the prior, or associated, Notation achieved this Status.

Format is DateTime
@since 3.1.0
*/
    @XmlElement(name = "StatusChangeDateTime", required = false)
    private DT statusChangeDateTime;
/**
US:Type - Notation Type (Optional) 

The type of Notation.

Format is L:CEN
@since 3.1.0
*/
    @XmlElement(name = "Type", required = false)
    private TString type;

/**
Get an alphanumeric combination that is used to identify a particular Notation/Signal.

@return the Code value in a {@link TUS20} data type
@since 3.1.0
*/
public US20 getCode() {
        return code;
    }

/**
Set an alphanumeric combination that is used to identify a particular Notation/Signal.

@param value the Code value in a {@link TUS20} data type
@since 3.1.0
*/
public void setCode(US20 value) {
        this.code = value;
    }

/**
Determine if the Code is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCode() {
        return (this.code!= null);
    }

/**
Get the status of the future, prior, or associated, Notation.

@return the Status value in a {@link TString} data type
@since 3.1.0
*/
public TString getStatus() {
        return status;
    }

/**
Set the status of the future, prior, or associated, Notation.

@param value the Status value in a {@link TString} data type
@since 3.1.0
*/
public void setStatus(TString value) {
        this.status = value;
    }

/**
Determine if the Status is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStatus() {
return (this.status!= null ? this.status.isSetValue() : false);
    }

/**
Get the timestamp when the prior, or associated, Notation achieved this Status.

@return the StatusChangeDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public DT getStatusChangeDateTime() {
        return statusChangeDateTime;
    }

/**
Set the timestamp when the prior, or associated, Notation achieved this Status.

@param value the StatusChangeDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public void setStatusChangeDateTime(DT value) {
        this.statusChangeDateTime = value;
    }

/**
Determine if the StatusChangeDateTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStatusChangeDateTime() {
        return (this.statusChangeDateTime!= null);
    }

/**
Get the type of Notation.

@return the Type value in a {@link TString} data type
@since 3.1.0
*/
public TString getType() {
        return type;
    }

/**
Set the type of Notation.

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
Set an alphanumeric combination that is used to identify a particular Notation/Signal.

@param value  An instances of type {@link TUS20}
@return The current NotationTimeline object instance
@since 3.1.0
*/
    public NotationTimeline withCode(TUS20 value) {
        return this;
    }

/**
Set the status of the future, prior, or associated, Notation.

@param value  An instances of type {@link ListUNT}
@return The current NotationTimeline object instance
@since 3.1.0
*/
    public NotationTimeline withStatus(ListUNT value) {
           setStatus(new TString(value.value()));
        return this;
    }

/**
Set the timestamp when the prior, or associated, Notation achieved this Status.

@param value  An instances of type {@link Calendar}
@return The current NotationTimeline object instance
@since 3.1.0
*/
    public NotationTimeline withStatusChangeDateTime(Calendar value) {
           setStatusChangeDateTime(new DT(value));
        return this;
    }
/**
Set the timestamp when the prior, or associated, Notation achieved this Status.

@param value  An instances of type {@link Date}
@return The current NotationTimeline object instance
@since 3.1.0
*/
    public NotationTimeline withStatusChangeDateTime(Date value) {
           setStatusChangeDateTime(new DT(value));
        return this;
    }

/**
Set the type of Notation.

@param value  An instances of type {@link ListCEN}
@return The current NotationTimeline object instance
@since 3.1.0
*/
    public NotationTimeline withType(ListCEN value) {
           setType(new TString(value.value()));
        return this;
    }

/**
 Get a string representation of this NotationTimeline instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "NotationTimeline {"
 + (code !=null? " code [" + code +"]" : "") 
 + (status !=null? " status [" + status +"]" : "") 
 + (statusChangeDateTime !=null? " statusChangeDateTime [" + statusChangeDateTime +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link NotationTimeline} requires {@link US20 Code}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetCode();
}

}
