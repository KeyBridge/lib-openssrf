package us.gov.dod.standard.ssrf._3_1.loadset;

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
TimingDeconflictionProtocol (US) defines algorithm(s) used for synchronising Electronic Warfare jamming information.

Element of {@link JammingChannelProfile}

Example: See {@link Loadset}.
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimingDeconflictionProtocol", propOrder = {
    "description",
    "name",
    "period",
    "ranking",
    "required",
    "syncMethod",
    "triggerOff",
    "triggerOn"
})
public class TimingDeconflictionProtocol {

/**
US:Description - Protocol Description (Optional) 

A description of the timing deconfliction protocol.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "Description", required = false)
    private MEMO description;
/**
US:Name - Protocol Name (Optional) 

The identifying term for the timing deconfliction protocol

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "Name", required = false)
    private S50 name;
/**
US:Period - Period (Optional) 

The enter the elapsed time between On and Off Triggers (i.e., Operations).

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "Period", required = false)
    private microsecs period;
/**
US:Ranking - Ranking Level (Optional) 

The ranking level of the timing deconfliction protocol.

Format is L:UTM
@since 3.1.0
*/
    @XmlElement(name = "Ranking", required = false)
    private TString ranking;
/**
US:Required - Deconfliction Required (Required) 

If a common timing deconfliction protocol is required for processing the subject signal. Enter "˜No" if only entering Jamming Frequencies without timing deconfliction.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Required", required = true)
      private  TString required;
/**
US:SyncMethod - Synchronisation Method (Optional) 

A description of the timing synchronisation method used by the timing deconfliction protocol.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "SyncMethod", required = false)
    private MEMO syncMethod;
/**
US:TriggerOff - Off Trigger (Optional) 

The time that the jammer is off (listening).

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "TriggerOff", required = false)
    private microsecs triggerOff;
/**
US:TriggerOn - On Trigger (Optional) 

The time that the jammer is on (jamming).

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "TriggerOn", required = false)
    private microsecs triggerOn;

/**
Get a description of the timing deconfliction protocol.

@return the Description value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getDescription() {
        return description;
    }

/**
Set a description of the timing deconfliction protocol.

@param value the Description value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setDescription(MEMO value) {
        this.description = value;
    }

/**
Determine if the Description is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDescription() {
        return (this.description!= null);
    }

/**
Get the identifying term for the timing deconfliction protocol

@return the Name value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getName() {
        return name;
    }

/**
Set the identifying term for the timing deconfliction protocol

@param value the Name value in a {@link TS50} data type
@since 3.1.0
*/
public void setName(S50 value) {
        this.name = value;
    }

/**
Determine if the Name is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetName() {
        return (this.name!= null);
    }

/**
Get the enter the elapsed time between On and Off Triggers (i.e., Operations).

@return the Period value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPeriod() {
        return period;
    }

/**
Set the enter the elapsed time between On and Off Triggers (i.e., Operations).

@param value the Period value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPeriod(microsecs value) {
        this.period = value;
    }

/**
Determine if the Period is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPeriod() {
        return (this.period!= null);
    }

/**
Get the ranking level of the timing deconfliction protocol.

@return the Ranking value in a {@link TString} data type
@since 3.1.0
*/
public TString getRanking() {
        return ranking;
    }

/**
Set the ranking level of the timing deconfliction protocol.

@param value the Ranking value in a {@link TString} data type
@since 3.1.0
*/
public void setRanking(TString value) {
        this.ranking = value;
    }

/**
Determine if the Ranking is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRanking() {
return (this.ranking!= null ? this.ranking.isSetValue() : false);
    }

/**
Get if a common timing deconfliction protocol is required for processing the subject signal. Enter "˜No" if only entering Jamming Frequencies without timing deconfliction.

@return the Required value in a {@link TString} data type
@since 3.1.0
*/
public TString getRequired() {
        return required;
    }

/**
Set if a common timing deconfliction protocol is required for processing the subject signal. Enter "˜No" if only entering Jamming Frequencies without timing deconfliction.

@param value the Required value in a {@link TString} data type
@since 3.1.0
*/
public void setRequired(TString value) {
        this.required = value;
    }

/**
Determine if the Required is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRequired() {
return (this.required!= null ? this.required.isSetValue() : false);
    }

/**
Get a description of the timing synchronisation method used by the timing deconfliction protocol.

@return the SyncMethod value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getSyncMethod() {
        return syncMethod;
    }

/**
Set a description of the timing synchronisation method used by the timing deconfliction protocol.

@param value the SyncMethod value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setSyncMethod(MEMO value) {
        this.syncMethod = value;
    }

/**
Determine if the SyncMethod is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSyncMethod() {
        return (this.syncMethod!= null);
    }

/**
Get the time that the jammer is off (listening).

@return the TriggerOff value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getTriggerOff() {
        return triggerOff;
    }

/**
Set the time that the jammer is off (listening).

@param value the TriggerOff value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setTriggerOff(microsecs value) {
        this.triggerOff = value;
    }

/**
Determine if the TriggerOff is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTriggerOff() {
        return (this.triggerOff!= null);
    }

/**
Get the time that the jammer is on (jamming).

@return the TriggerOn value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getTriggerOn() {
        return triggerOn;
    }

/**
Set the time that the jammer is on (jamming).

@param value the TriggerOn value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setTriggerOn(microsecs value) {
        this.triggerOn = value;
    }

/**
Determine if the TriggerOn is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTriggerOn() {
        return (this.triggerOn!= null);
    }

/**
Set a description of the timing deconfliction protocol.

@param value  An instances of type {@link String}
@return The current TimingDeconflictionProtocol object instance
@since 3.1.0
*/
    public TimingDeconflictionProtocol withDescription(String value) {
           setDescription(new MEMO(value));
        return this;
    }

/**
Set the identifying term for the timing deconfliction protocol

@param value  An instances of type {@link String}
@return The current TimingDeconflictionProtocol object instance
@since 3.1.0
*/
    public TimingDeconflictionProtocol withName(String value) {
           setName(new S50(value));
        return this;
    }

/**
Set the enter the elapsed time between On and Off Triggers (i.e., Operations).

@param value  An instances of type {@link Double}
@return The current TimingDeconflictionProtocol object instance
@since 3.1.0
*/
    public TimingDeconflictionProtocol withPeriod(Double value) {
           setPeriod(new microsecs(value));
        return this;
    }

/**
Set the ranking level of the timing deconfliction protocol.

@param value  An instances of type {@link ListUTM}
@return The current TimingDeconflictionProtocol object instance
@since 3.1.0
*/
    public TimingDeconflictionProtocol withRanking(ListUTM value) {
           setRanking(new TString(value.value()));
        return this;
    }

/**
Set if a common timing deconfliction protocol is required for processing the subject signal. Enter "˜No" if only entering Jamming Frequencies without timing deconfliction.

@param value  An instances of type {@link ListCBO}
@return The current TimingDeconflictionProtocol object instance
@since 3.1.0
*/
    public TimingDeconflictionProtocol withRequired(ListCBO value) {
        setRequired(new TString(value.value()));
        return this;
    }

/**
Set a description of the timing synchronisation method used by the timing deconfliction protocol.

@param value  An instances of type {@link String}
@return The current TimingDeconflictionProtocol object instance
@since 3.1.0
*/
    public TimingDeconflictionProtocol withSyncMethod(String value) {
           setSyncMethod(new MEMO(value));
        return this;
    }

/**
Set the time that the jammer is off (listening).

@param value  An instances of type {@link Double}
@return The current TimingDeconflictionProtocol object instance
@since 3.1.0
*/
    public TimingDeconflictionProtocol withTriggerOff(Double value) {
           setTriggerOff(new microsecs(value));
        return this;
    }

/**
Set the time that the jammer is on (jamming).

@param value  An instances of type {@link Double}
@return The current TimingDeconflictionProtocol object instance
@since 3.1.0
*/
    public TimingDeconflictionProtocol withTriggerOn(Double value) {
           setTriggerOn(new microsecs(value));
        return this;
    }

/**
 Get a string representation of this TimingDeconflictionProtocol instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "TimingDeconflictionProtocol {"
 + (description !=null? " description [" + description +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") 
 + (period !=null? " period [" + period +"]" : "") 
 + (ranking !=null? " ranking [" + ranking +"]" : "") 
 + (required !=null? " required [" + required +"]" : "") 
 + (syncMethod !=null? " syncMethod [" + syncMethod +"]" : "") 
 + (triggerOff !=null? " triggerOff [" + triggerOff +"]" : "") 
 + (triggerOn !=null? " triggerOn [" + triggerOn +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link TimingDeconflictionProtocol} requires {@link TString Required}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetRequired();
}

}
