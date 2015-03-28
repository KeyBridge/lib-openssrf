package us.gov.dod.standard.ssrf._3_1.assignment;

import us.gov.dod.standard.ssrf._3_1.*;
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
StatusLog (US) contains the transactional processing information related to frequency assignments.

Element of {@link Assignment}, {@link SSRequest}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusLog", propOrder = {
    "dateTime",
    "state",
    "agencyCode",
    "comment",
    "pocRef"
})
public class StatusLog {

/**
US:DateTime  - DateTime (Required) 

The date and UTC time of this status log entry.

Format is DateTime
@since 3.1.0
*/
    @XmlElement(name = "DateTime", required = true)
      private  DT dateTime;
/**
US:State  - State (Required) 

The action performed for this status log entry.

Format is L:UST
@since 3.1.0
*/
    @XmlElement(name = "State", required = true)
      private  S50 state;
/**
US:AgencyCode  - Agency Code (Optional) 

The agency responsible for this status log entry.

Format is S80
@since 3.1.0
*/
    @XmlElement(name = "AgencyCode", required = false)
    private S80 agencyCode;
/**
US:Comment  - Comment (Optional) 

Amplifying information to describe the Status of the Assignment.

Format is S255
@since 3.1.0
*/
    @XmlElement(name = "Comment", required = false)
    private S255 comment;
/**
US:POCRef  - Point Of Contact Reference (Optional) 

The reference to a Contact, Organisation, or Role responsible for this status log entry or the recipient of the action.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "POCRef", required = false)
    private Serial pocRef;

/**
Get the date and UTC time of this status log entry.

@return the DateTime value in a {@link TDT} data type
@since 3.1.0
*/
public DT getDateTime() {
        return dateTime;
    }

/**
Set the date and UTC time of this status log entry.

@param value the DateTime value in a {@link TDT} data type
@since 3.1.0
*/
public void setDateTime(DT value) {
        this.dateTime = value;
    }

/**
Determine if the DateTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDateTime() {
        return (this.dateTime!= null);
    }

/**
Get the action performed for this status log entry.

@return the State value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getState() {
        return state;
    }

/**
Set the action performed for this status log entry.

@param value the State value in a {@link TS50} data type
@since 3.1.0
*/
public void setState(S50 value) {
        this.state = value;
    }

/**
Determine if the State is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetState() {
        return (this.state!= null);
    }

/**
Get the agency responsible for this status log entry.

@return the AgencyCode value in a {@link TS80} data type
@since 3.1.0
*/
public S80 getAgencyCode() {
        return agencyCode;
    }

/**
Set the agency responsible for this status log entry.

@param value the AgencyCode value in a {@link TS80} data type
@since 3.1.0
*/
public void setAgencyCode(S80 value) {
        this.agencyCode = value;
    }

/**
Determine if the AgencyCode is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAgencyCode() {
        return (this.agencyCode!= null);
    }

/**
Get amplifying information to describe the Status of the Assignment.

@return the Comment value in a {@link TS255} data type
@since 3.1.0
*/
public S255 getComment() {
        return comment;
    }

/**
Set amplifying information to describe the Status of the Assignment.

@param value the Comment value in a {@link TS255} data type
@since 3.1.0
*/
public void setComment(S255 value) {
        this.comment = value;
    }

/**
Determine if the Comment is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetComment() {
        return (this.comment!= null);
    }

/**
Get the reference to a Contact, Organisation, or Role responsible for this status log entry or the recipient of the action.

@return the POCRef value in a {@link Serial} data type
@since 3.1.0
*/
public Serial getPOCRef() {
        return pocRef;
    }

/**
Set the reference to a Contact, Organisation, or Role responsible for this status log entry or the recipient of the action.

@param value the POCRef value in a {@link Serial} data type
@since 3.1.0
*/
public void setPOCRef(Serial value) {
        this.pocRef = value;
    }

/**
Determine if the POCRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPOCRef() {
        return (this.pocRef!= null);
    }

/**
Set the date and UTC time of this status log entry.

@param value  An instances of type {@link TDT}
@return The current StatusLog object instance
@since 3.1.0
*/
    public StatusLog withDateTime(TDT value) {
        return this;
    }

/**
Set the action performed for this status log entry.

@param value  An instances of type {@link TS50}
@return The current StatusLog object instance
@since 3.1.0
*/
    public StatusLog withState(TS50 value) {
        return this;
    }

/**
Set the agency responsible for this status log entry.

@param value  An instances of type {@link String}
@return The current StatusLog object instance
@since 3.1.0
*/
    public StatusLog withAgencyCode(String value) {
           setAgencyCode(new S80(value));
        return this;
    }

/**
Set amplifying information to describe the Status of the Assignment.

@param value  An instances of type {@link String}
@return The current StatusLog object instance
@since 3.1.0
*/
    public StatusLog withComment(String value) {
           setComment(new S255(value));
        return this;
    }

/**
Set the reference to a Contact, Organisation, or Role responsible for this status log entry or the recipient of the action.

@param value  An instances of type {@link Serial}
@return The current StatusLog object instance
@since 3.1.0
*/
    public StatusLog withPOCRef(Serial value) {
           setPOCRef(value);
        return this;
    }

/**
 Get a string representation of this StatusLog instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "StatusLog {"
 + (agencyCode !=null? " agencyCode [" + agencyCode +"]" : "") 
 + (comment !=null? " comment [" + comment +"]" : "") 
 + (dateTime !=null? " dateTime [" + dateTime +"]" : "") 
 + (pocRef !=null? " pocRef [" + pocRef +"]" : "") 
 + (state !=null? " state [" + state +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link StatusLog} requires {@link DT DateTime}, {@link S50 State}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetDateTime() &&  isSetState();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
US:POCRef  - Point Of Contact Reference (Optional) 

The reference to a Contact, Organisation, or Role responsible for this status log entry or the recipient of the action.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Common<?> poc;

/**
Get the reference to a Contact, Organisation, or Role responsible for this status log entry or the recipient of the action.

@return  a {@link Common} instance
@since 3.1.0
*/
public Common<?> getPoc(){
return poc;
}
/**
 Determine if the poc field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetPoc() {
    return this.poc != null ;
}

/**
Set the reference to a Contact, Organisation, or Role responsible for this status log entry or the recipient of the action.

@param value  An instances of type {@link Common<?>}
@return The current StatusLog object instance
@since 3.1.0
*/
public StatusLog withPoc(Common<?> value) {
this.poc = value;
return this;
}

  /**
   * Update the SSRF data type references in this StatusLog record.
   * <p>
 */
public void prepare() {
this.pocRef = poc !=null? poc.getSerial() : null;
}

/**
   * Update the SSRF data type references in this StatusLog record after loading from XML.

   * This method builds the transient {@link #poc} with values
   * from the imported {@link #pocRef} field. This method should
   * typically be called after the StatusLog is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (pocRef==null || !pocRef.isSetValue() ) {return;}
for(Contact instance : root.getContact()) {
if(pocRef.equals(instance.getSerial())){
poc = instance;
return;}
}for( Organisation instance : root.getOrganisation()) {
if(pocRef.equals(instance.getSerial())){
poc = instance;
return;}
}for(  Role instance : root.getRole()) {
if(pocRef.equals(instance.getSerial())){
poc = instance;
return;}
}}//</editor-fold>

}
