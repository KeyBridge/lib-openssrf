package us.gov.dod.standard.ssrf._3_1.assignment;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
NarrowBandPlanning (US) describes a reduced bandwidth assignment for a single frequency or a range of frequencies.

Element of {@link Freq}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NarrowBandPlanning", propOrder = {
    "changeDate",
    "nbFreq"
})
public class NarrowBandPlanning {

/**
US:ChangeDate  - Change Date (Optional) 

The date this record is expected to be updated to comply with narrow band transition plans.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "ChangeDate", required = false)
    private D changeDate;
/**
US:NBFreq  - Narrow Band Frequency (Optional) 

The transition frequency to comply with narrow band transition plans.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "NBFreq", required = false)
    private FreqM nbFreq;

/**
Get the date this record is expected to be updated to comply with narrow band transition plans.

@return the ChangeDate value in a {@link TD} data type
@since 3.1.0
*/
public D getChangeDate() {
        return changeDate;
    }

/**
Set the date this record is expected to be updated to comply with narrow band transition plans.

@param value the ChangeDate value in a {@link TD} data type
@since 3.1.0
*/
public void setChangeDate(D value) {
        this.changeDate = value;
    }

/**
Determine if the ChangeDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetChangeDate() {
        return (this.changeDate!= null);
    }

/**
Get the transition frequency to comply with narrow band transition plans.

@return the NBFreq value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getNBFreq() {
        return nbFreq;
    }

/**
Set the transition frequency to comply with narrow band transition plans.

@param value the NBFreq value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setNBFreq(FreqM value) {
        this.nbFreq = value;
    }

/**
Determine if the NBFreq is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNBFreq() {
        return (this.nbFreq!= null);
    }

/**
Set the date this record is expected to be updated to comply with narrow band transition plans.

@param value  An instances of type {@link Calendar}
@return The current NarrowBandPlanning object instance
@since 3.1.0
*/
    public NarrowBandPlanning withChangeDate(Calendar value) {
           setChangeDate(new D(value));
        return this;
    }
/**
Set the date this record is expected to be updated to comply with narrow band transition plans.

@param value  An instances of type {@link Date}
@return The current NarrowBandPlanning object instance
@since 3.1.0
*/
    public NarrowBandPlanning withChangeDate(Date value) {
           setChangeDate(new D(value));
        return this;
    }

/**
Set the transition frequency to comply with narrow band transition plans.

@param value  An instances of type {@link Double}
@return The current NarrowBandPlanning object instance
@since 3.1.0
*/
    public NarrowBandPlanning withNBFreq(Double value) {
           setNBFreq(new FreqM(value));
        return this;
    }

/**
 Get a string representation of this NarrowBandPlanning instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "NarrowBandPlanning {"
 + (changeDate !=null? " changeDate [" + changeDate +"]" : "") 
 + (nbFreq !=null? " nbFreq [" + nbFreq +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link NarrowBandPlanning} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
