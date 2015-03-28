package us.gov.dod.standard.ssrf._3_1.transmitter;

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
SubcarrierTone describes the sidetone frequency used to modulate the subcarrier.

Element of {@link SubcarrierFreq}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubcarrierTone", propOrder = {
    "freqMin",
    "freqMax",
    "duration",
    "name"
})
public class SubcarrierTone {

/**
FreqMin - Minimum SubcarrierTone Frequency (Optional) 

The nominal frequency or minimum value of the frequency range.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group FreqRangeGrp (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FreqMin")
      private  FreqM freqMin;
/**
FreqMax - Maximum Subcarrier Tone Frequency (Optional) 

The maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group FreqRangeGrp (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FreqMax", required = false)
    private FreqM freqMax;
/**
Duration - Subcarrier Tone Dwell (Optional) 

The period of dwell for the baseband audio frequency, before it is disabled or switched.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "Duration", required = false)
    private microsecs duration;
/**
Name - Tone Name (Optional) 

The name of the tone. Tone names MUST match entries in Baseband/US:SignalSequenceDesc.

Format is S10
@since 3.1.0
*/
    @XmlElement(name = "Name", required = false)
    private S10 name;

/**
Get the nominal frequency or minimum value of the frequency range.

@return the FreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMin() {
        return freqMin;
    }

/**
Set the nominal frequency or minimum value of the frequency range.

@param value the FreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setFreqMin(FreqM value) {
        this.freqMin = value;
    }

/**
Determine if the FreqMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqMin() {
        return (this.freqMin!= null);
    }

/**
Get the maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

@return the FreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMax() {
        return freqMax;
    }

/**
Set the maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

@param value the FreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setFreqMax(FreqM value) {
        this.freqMax = value;
    }

/**
Determine if the FreqMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqMax() {
        return (this.freqMax!= null);
    }

/**
Get the period of dwell for the baseband audio frequency, before it is disabled or switched.

@return the Duration value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getDuration() {
        return duration;
    }

/**
Set the period of dwell for the baseband audio frequency, before it is disabled or switched.

@param value the Duration value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setDuration(microsecs value) {
        this.duration = value;
    }

/**
Determine if the Duration is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDuration() {
        return (this.duration!= null);
    }

/**
Get the name of the tone. Tone names MUST match entries in Baseband/US:SignalSequenceDesc.

@return the Name value in a {@link TS10} data type
@since 3.1.0
*/
public S10 getName() {
        return name;
    }

/**
Set the name of the tone. Tone names MUST match entries in Baseband/US:SignalSequenceDesc.

@param value the Name value in a {@link TS10} data type
@since 3.1.0
*/
public void setName(S10 value) {
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
Set the nominal frequency or minimum value of the frequency range.

@param value  An instances of type {@link TFreqM}
@return The current SubcarrierTone object instance
@since 3.1.0
*/
    public SubcarrierTone withFreqMin(TFreqM value) {
        return this;
    }

/**
Set the maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

@param value  An instances of type {@link Double}
@return The current SubcarrierTone object instance
@since 3.1.0
*/
    public SubcarrierTone withFreqMax(Double value) {
           setFreqMax(new FreqM(value));
        return this;
    }

/**
Set the period of dwell for the baseband audio frequency, before it is disabled or switched.

@param value  An instances of type {@link Double}
@return The current SubcarrierTone object instance
@since 3.1.0
*/
    public SubcarrierTone withDuration(Double value) {
           setDuration(new microsecs(value));
        return this;
    }

/**
Set the name of the tone. Tone names MUST match entries in Baseband/US:SignalSequenceDesc.

@param value  An instances of type {@link String}
@return The current SubcarrierTone object instance
@since 3.1.0
*/
    public SubcarrierTone withName(String value) {
           setName(new S10(value));
        return this;
    }

/**
 Get a string representation of this SubcarrierTone instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "SubcarrierTone {"
 + (duration !=null? " duration [" + duration +"]" : "") 
 + (freqMax !=null? " freqMax [" + freqMax +"]" : "") 
 + (freqMin !=null? " freqMin [" + freqMin +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link SubcarrierTone} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
