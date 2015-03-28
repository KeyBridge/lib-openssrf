package us.gov.dod.standard.ssrf._3_1.assignment;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
Tuning indicates the specific frequency or range of frequencies, tuning increment, and number of frequencies, required for an assignment.

Element of {@link Link}

Sub-Element is {@link RequestedFreq}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tuning", propOrder = {
    "tuningStep",
    "numFreq",
    "priority",
    "exclusive",
    "freqSep",
    "freqSepType",
    "requestedFreq"
})
public class Tuning {

/**
TuningStep  - Tuning Step (Required) 

The tuning increment expressed of the requested frequency range. This should be compatible with the tuning capability of the transmitters and/or receivers in the link.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "TuningStep", required = true)
      private  FreqM tuningStep;
/**
NumFreq  - Number of Frequencies (Required) 

The number of frequencies required.

Format is UN(4)
@since 3.1.0
*/
    @XmlElement(name = "NumFreq", required = true)
      private  UN4 numFreq;
/**
Priority  - Priority (Optional) 

A number from 0 to 9 that is used to influence the positioning of the Assignment in the ordering of the assignment process, where 9 represents the highest priority and 0 is the lowest priority.

Format is UN(1)
@since 3.1.0
*/
    @XmlElement(name = "Priority", required = false)
    private UN1 priority;
/**
Exclusive  - Exclusive Assignment (Optional) 

Yes if the assigned frequency should not be reused within the area of exercise/operation.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Exclusive", required = false)
    private TString exclusive;
/**
FreqSep  - Frequency Separation (Optional) 

The required minimum or exact frequency separation.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group FreqSep (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FreqSep")
      private  FreqM freqSep;
/**
FreqSepType  - Frequency Separation Type (Optional) 

If the stated frequency separation is an exact or minimum value.

Format is L:CDS

Attribute group FreqSep (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FreqSepType")
      private  TString freqSepType;
/**
RequestedFreq (Optional)

RequestedFreq indicates a single frequency or a range of frequencies.
@since 3.1.0
*/
    @XmlElement(name = "RequestedFreq")
      private  Set<AsgnFreqBase> requestedFreq;

/**
Get the tuning increment expressed of the requested frequency range. This should be compatible with the tuning capability of the transmitters and/or receivers in the link.

@return the TuningStep value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getTuningStep() {
        return tuningStep;
    }

/**
Set the tuning increment expressed of the requested frequency range. This should be compatible with the tuning capability of the transmitters and/or receivers in the link.

@param value the TuningStep value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setTuningStep(FreqM value) {
        this.tuningStep = value;
    }

/**
Determine if the TuningStep is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTuningStep() {
        return (this.tuningStep!= null);
    }

/**
Get the number of frequencies required.

@return the NumFreq value in a {@link TUN4} data type
@since 3.1.0
*/
public UN4 getNumFreq() {
        return numFreq;
    }

/**
Set the number of frequencies required.

@param value the NumFreq value in a {@link TUN4} data type
@since 3.1.0
*/
public void setNumFreq(UN4 value) {
        this.numFreq = value;
    }

/**
Determine if the NumFreq is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumFreq() {
        return (this.numFreq!= null);
    }

/**
Get a number from 0 to 9 that is used to influence the positioning of the Assignment in the ordering of the assignment process, where 9 represents the highest priority and 0 is the lowest priority.

@return the Priority value in a {@link TUN1} data type
@since 3.1.0
*/
public UN1 getPriority() {
        return priority;
    }

/**
Set a number from 0 to 9 that is used to influence the positioning of the Assignment in the ordering of the assignment process, where 9 represents the highest priority and 0 is the lowest priority.

@param value the Priority value in a {@link TUN1} data type
@since 3.1.0
*/
public void setPriority(UN1 value) {
        this.priority = value;
    }

/**
Determine if the Priority is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPriority() {
        return (this.priority!= null);
    }

/**
Get Yes if the assigned frequency should not be reused within the area of exercise/operation.

@return the Exclusive value in a {@link TString} data type
@since 3.1.0
*/
public TString getExclusive() {
        return exclusive;
    }

/**
Set Yes if the assigned frequency should not be reused within the area of exercise/operation.

@param value the Exclusive value in a {@link TString} data type
@since 3.1.0
*/
public void setExclusive(TString value) {
        this.exclusive = value;
    }

/**
Determine if the Exclusive is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetExclusive() {
return (this.exclusive!= null ? this.exclusive.isSetValue() : false);
    }

/**
Get the required minimum or exact frequency separation.

@return the FreqSep value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqSep() {
        return freqSep;
    }

/**
Set the required minimum or exact frequency separation.

@param value the FreqSep value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setFreqSep(FreqM value) {
        this.freqSep = value;
    }

/**
Determine if the FreqSep is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqSep() {
        return (this.freqSep!= null);
    }

/**
Get if the stated frequency separation is an exact or minimum value.

@return the FreqSepType value in a {@link TString} data type
@since 3.1.0
*/
public TString getFreqSepType() {
        return freqSepType;
    }

/**
Set if the stated frequency separation is an exact or minimum value.

@param value the FreqSepType value in a {@link TString} data type
@since 3.1.0
*/
public void setFreqSepType(TString value) {
        this.freqSepType = value;
    }

/**
Determine if the FreqSepType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqSepType() {
return (this.freqSepType!= null ? this.freqSepType.isSetValue() : false);
    }

/**
Get the RequestedFreq

Complex element RequestedFreq indicates a single frequency or a range of frequencies.

@return  a {@link AsgnFreqBase} instance
@since 3.1.0
*/
    public Set<AsgnFreqBase> getRequestedFreq() {
        if (requestedFreq == null) {
            requestedFreq = new HashSet<AsgnFreqBase>();
        }
        return this.requestedFreq;
    }

/**
Determine if the RequestedFreq is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRequestedFreq() {
        return ((this.requestedFreq!= null)&&(!this.requestedFreq.isEmpty()));
    }

/**
  Clear the RequestedFreq field. This sets the field to null.
 */
    public void unsetRequestedFreq() {
        this.requestedFreq = null;
    }

/**
Set the tuning increment expressed of the requested frequency range. This should be compatible with the tuning capability of the transmitters and/or receivers in the link.

@param value  An instances of type {@link TFreqM}
@return The current Tuning object instance
@since 3.1.0
*/
    public Tuning withTuningStep(TFreqM value) {
        return this;
    }

/**
Set the number of frequencies required.

@param value  An instances of type {@link TUN4}
@return The current Tuning object instance
@since 3.1.0
*/
    public Tuning withNumFreq(TUN4 value) {
        return this;
    }

/**
Set a number from 0 to 9 that is used to influence the positioning of the Assignment in the ordering of the assignment process, where 9 represents the highest priority and 0 is the lowest priority.

@param value  An instances of type {@link Integer}
@return The current Tuning object instance
@since 3.1.0
*/
    public Tuning withPriority(Integer value) {
           setPriority(new UN1(value));
        return this;
    }

/**
Set Yes if the assigned frequency should not be reused within the area of exercise/operation.

@param value  An instances of type {@link ListCBO}
@return The current Tuning object instance
@since 3.1.0
*/
    public Tuning withExclusive(ListCBO value) {
           setExclusive(new TString(value.value()));
        return this;
    }

/**
Set the required minimum or exact frequency separation.

@param value  An instances of type {@link TFreqM}
@return The current Tuning object instance
@since 3.1.0
*/
    public Tuning withFreqSep(TFreqM value) {
        return this;
    }

/**
Set if the stated frequency separation is an exact or minimum value.

@param value  An instances of type {@link ListCDS}
@return The current Tuning object instance
@since 3.1.0
*/
    public Tuning withFreqSepType(ListCDS value) {
        setFreqSepType(new TString(value.value()));
        return this;
    }

/**
Set the RequestedFreq

Complex element RequestedFreq indicates a single frequency or a range of frequencies.

@param values  One or more instances of type {@link AsgnFreqBase...}
@return The current Tuning object instance
@since 3.1.0
*/
    public Tuning withRequestedFreq(AsgnFreqBase... values) {
        if (values!= null) {
            for (AsgnFreqBase value: values) {
                getRequestedFreq().add(value);
            }
        }
        return this;
    }

/**
Set the RequestedFreq

Complex element RequestedFreq indicates a single frequency or a range of frequencies.

@param values  A collection of {@link RequestedFreq} instances
@return The current Tuning object instance
@since 3.1.0
*/
    public Tuning withRequestedFreq(Collection<AsgnFreqBase> values) {
        if (values!= null) {
            getRequestedFreq().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this Tuning instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Tuning {"
 + (exclusive !=null? " exclusive [" + exclusive +"]" : "") 
 + (freqSep !=null? " freqSep [" + freqSep +"]" : "") 
 + (freqSepType !=null? " freqSepType [" + freqSepType +"]" : "") 
 + (numFreq !=null? " numFreq [" + numFreq +"]" : "") 
 + (priority !=null? " priority [" + priority +"]" : "") 
 + (requestedFreq !=null? " requestedFreq [" + requestedFreq +"]" : "") 
 + (tuningStep !=null? " tuningStep [" + tuningStep +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Tuning} requires {@link UN4 NumFreq}, {@link FreqM TuningStep}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetNumFreq() &&  isSetTuningStep();
}

}
