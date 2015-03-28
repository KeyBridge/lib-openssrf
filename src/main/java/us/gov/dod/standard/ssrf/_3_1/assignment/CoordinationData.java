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
CoordinationData (US) contains Host Nation coordination information.

Element of {@link Assignment}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinationData", propOrder = {
    "coordIndicator",
    "hostComments"
})
public class CoordinationData {

/**
US:CoordIndicator  - Coordination Indicator (Required) 

The coordinating entity.

Format is L:UCJ
@since 3.1.0
*/
    @XmlElement(name = "CoordIndicator", required = true)
      private  TString coordIndicator;
/**
US:HostComments  - Host Comments (Optional) 

The Comments from the coordinating entity.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "HostComments", required = false)
    private MEMO hostComments;

/**
Get the coordinating entity.

@return the CoordIndicator value in a {@link TString} data type
@since 3.1.0
*/
public TString getCoordIndicator() {
        return coordIndicator;
    }

/**
Set the coordinating entity.

@param value the CoordIndicator value in a {@link TString} data type
@since 3.1.0
*/
public void setCoordIndicator(TString value) {
        this.coordIndicator = value;
    }

/**
Determine if the CoordIndicator is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCoordIndicator() {
return (this.coordIndicator!= null ? this.coordIndicator.isSetValue() : false);
    }

/**
Get the Comments from the coordinating entity.

@return the HostComments value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getHostComments() {
        return hostComments;
    }

/**
Set the Comments from the coordinating entity.

@param value the HostComments value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setHostComments(MEMO value) {
        this.hostComments = value;
    }

/**
Determine if the HostComments is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetHostComments() {
        return (this.hostComments!= null);
    }

/**
Set the coordinating entity.

@param value  An instances of type {@link ListUCJ}
@return The current CoordinationData object instance
@since 3.1.0
*/
    public CoordinationData withCoordIndicator(ListUCJ value) {
        setCoordIndicator(new TString(value.value()));
        return this;
    }

/**
Set the Comments from the coordinating entity.

@param value  An instances of type {@link String}
@return The current CoordinationData object instance
@since 3.1.0
*/
    public CoordinationData withHostComments(String value) {
           setHostComments(new MEMO(value));
        return this;
    }

/**
 Get a string representation of this CoordinationData instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "CoordinationData {"
 + (coordIndicator !=null? " coordIndicator [" + coordIndicator +"]" : "") 
 + (hostComments !=null? " hostComments [" + hostComments +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link CoordinationData} requires {@link TString CoordIndicator}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetCoordIndicator();
}

}
