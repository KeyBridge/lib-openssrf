package us.gov.dod.standard.ssrf._3_1.transmitter;

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
SubcarrierFreq describes the secondary channel that

Element of {@link TxMode}

Sub-Element is {@link SubcarrierTone}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubcarrierFreq", propOrder = {
    "freq",
    "freqOffset",
    "freqRest",
    "subcarrierTone"
})
public class SubcarrierFreq {

    @XmlElement(name = "Freq ", required = true)
      private  FreqM freq;
/**
FreqOffset - Subcarrier Frequency Offset (Optional) 

The frequency differential from the subcarrier frequency.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "FreqOffset", required = false)
    private FreqM freqOffset;
/**
FreqRest - Rest Frequency (Optional) 

The dwell or pause frequency utilised while processing the subcarrier. Typically provided for improvement of the baseband S/N noise ratio.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "FreqRest", required = false)
    private FreqM freqRest;
/**
SubcarrierTone (Optional)

SubcarrierTone describes the sidetone frequency used to modulate the subcarrier.
@since 3.1.0
*/
    @XmlElement(name = "SubcarrierTone")
      private  Set<SubcarrierTone> subcarrierTone;

/**
Get the subcarrier frequency.

@return the Freq value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreq() {
        return freq;
    }

/**
Set the subcarrier frequency.

@param value the Freq value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setFreq(FreqM value) {
        this.freq = value;
    }

/**
Determine if the Freq is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreq() {
        return (this.freq != null);
    }

/**
Get the frequency differential from the subcarrier frequency.

@return the FreqOffset value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqOffset() {
        return freqOffset;
    }

/**
Set the frequency differential from the subcarrier frequency.

@param value the FreqOffset value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setFreqOffset(FreqM value) {
        this.freqOffset = value;
    }

/**
Determine if the FreqOffset is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqOffset() {
        return (this.freqOffset!= null);
    }

/**
Get the dwell or pause frequency utilised while processing the subcarrier. Typically provided for improvement of the baseband S/N noise ratio.

@return the FreqRest value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqRest() {
        return freqRest;
    }

/**
Set the dwell or pause frequency utilised while processing the subcarrier. Typically provided for improvement of the baseband S/N noise ratio.

@param value the FreqRest value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setFreqRest(FreqM value) {
        this.freqRest = value;
    }

/**
Determine if the FreqRest is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqRest() {
        return (this.freqRest!= null);
    }

/**
Get the SubcarrierTone

Complex element SubcarrierTone describes the sidetone frequency used to modulate the subcarrier.

@return  a {@link SubcarrierTone} instance
@since 3.1.0
*/
    public Set<SubcarrierTone> getSubcarrierTone() {
        if (subcarrierTone == null) {
            subcarrierTone = new HashSet<SubcarrierTone>();
        }
        return this.subcarrierTone;
    }

/**
Determine if the SubcarrierTone is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSubcarrierTone() {
        return ((this.subcarrierTone!= null)&&(!this.subcarrierTone.isEmpty()));
    }

/**
  Clear the SubcarrierTone field. This sets the field to null.
 */
    public void unsetSubcarrierTone() {
        this.subcarrierTone = null;
    }

/**
Set the subcarrier frequency.

@param value  An instances of type {@link TFreqM}
@return The current SubcarrierFreq object instance
@since 3.1.0
*/
    public SubcarrierFreq withFreq(TFreqM value) {
        return this;
    }

/**
Set the frequency differential from the subcarrier frequency.

@param value  An instances of type {@link Double}
@return The current SubcarrierFreq object instance
@since 3.1.0
*/
    public SubcarrierFreq withFreqOffset(Double value) {
           setFreqOffset(new FreqM(value));
        return this;
    }

/**
Set the dwell or pause frequency utilised while processing the subcarrier. Typically provided for improvement of the baseband S/N noise ratio.

@param value  An instances of type {@link Double}
@return The current SubcarrierFreq object instance
@since 3.1.0
*/
    public SubcarrierFreq withFreqRest(Double value) {
           setFreqRest(new FreqM(value));
        return this;
    }

/**
Set the SubcarrierTone

Complex element SubcarrierTone describes the sidetone frequency used to modulate the subcarrier.

@param values  One or more instances of type {@link SubcarrierTone...}
@return The current SubcarrierFreq object instance
@since 3.1.0
*/
    public SubcarrierFreq withSubcarrierTone(SubcarrierTone... values) {
        if (values!= null) {
            for (SubcarrierTone value: values) {
                getSubcarrierTone().add(value);
            }
        }
        return this;
    }

/**
Set the SubcarrierTone

Complex element SubcarrierTone describes the sidetone frequency used to modulate the subcarrier.

@param values  A collection of {@link SubcarrierTone} instances
@return The current SubcarrierFreq object instance
@since 3.1.0
*/
    public SubcarrierFreq withSubcarrierTone(Collection<SubcarrierTone> values) {
        if (values!= null) {
            getSubcarrierTone().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this SubcarrierFreq instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "SubcarrierFreq {"
 + (freq !=null? " freq [" + freq +"]" : "") 
 + (freqOffset !=null? " freqOffset [" + freqOffset +"]" : "") 
 + (freqRest !=null? " freqRest [" + freqRest +"]" : "") 
 + (subcarrierTone !=null? " subcarrierTone [" + subcarrierTone +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link SubcarrierFreq} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
