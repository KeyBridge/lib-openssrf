package us.gov.dod.standard.ssrf._3_1.ssrequest;

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
Time indicates when the equipment or system will be used.

Element of {@link SSRequest}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Time", propOrder = {
    "period",
    "usageDescription"
})
public class Time {

/**
Period  - Period (Optional) 

The period of usage.

Format is L:CTI
@since 3.1.0
*/
    @XmlElement(name = "Period", required = false)
    private TString period;
    @XmlElement(name = "UsageDescription ", required = false)
    private MEMO usageDescription;

/**
Get the period of usage.

@return the Period value in a {@link TString} data type
@since 3.1.0
*/
public TString getPeriod() {
        return period;
    }

/**
Set the period of usage.

@param value the Period value in a {@link TString} data type
@since 3.1.0
*/
public void setPeriod(TString value) {
        this.period = value;
    }

/**
Determine if the Period is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPeriod() {
return (this.period!= null ? this.period.isSetValue() : false);
    }

/**
Get a description of the total amount of time a system/equipment is expected to be in operation.

@return the UsageDescription value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getUsageDescription() {
        return usageDescription;
    }

/**
Set a description of the total amount of time a system/equipment is expected to be in operation.

@param value the UsageDescription value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setUsageDescription(MEMO value) {
        this.usageDescription = value;
    }

/**
Determine if the UsageDescription is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetUsageDescription() {
        return (this.usageDescription != null);
    }

/**
Set the period of usage.

@param value  An instances of type {@link ListCTI}
@return The current Time object instance
@since 3.1.0
*/
    public Time withPeriod(ListCTI value) {
           setPeriod(new TString(value.value()));
        return this;
    }

/**
Set a description of the total amount of time a system/equipment is expected to be in operation.

@param value  An instances of type {@link String}
@return The current Time object instance
@since 3.1.0
*/
    public Time withUsageDescription(String value) {
           setUsageDescription(new MEMO(value));
        return this;
    }

/**
 Get a string representation of this Time instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Time {"
 + (period !=null? " period [" + period +"]" : "") 
 + (usageDescription !=null? " usageDescription [" + usageDescription +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Time} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
