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
TxSignalTuning indicates the tuning capabilities, the specific frequency or range of frequencies within which the equipment may tune, and the tuning increments of the equipment.

Element of {@link TxMode}

Example: <pre>
* &lt;TxSignalTuning&gt;
*   &lt;FreqMax  cls="U"&gt;3107.56&lt;/FreqMax &gt;
*   &lt;FreqMin  cls="U"&gt;2999.753&lt;/FreqMin &gt;
*   &lt;NumPresetChannels cls="U"&gt;500&lt;/NumPresetChannels&gt;
*   &lt;TuningStep  cls="U"&gt;0.001&lt;/TuningStep &gt;
*   &lt;LowestUsableChannel cls="U"&gt;176.345&lt;/LowestUsableChannel&gt;
*   &lt;MinSeparation  cls="U"&gt;500&lt;/MinSeparation &gt;
* &lt;/TxSignalTuning&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxSignalTuning", propOrder = {
    "freqMin",
    "freqMax",
    "tuningStep",
    "numPresetChannels",
    "lowestUsableChannel",
    "minSeparation"
})
public class TxSignalTuning {

/**
FreqMin  - Nominal or Minimum Frequency (Required) 

The nominal frequency or minimum value of the frequency range.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group FreqRangeGrp (Required)
@since 3.1.0
*/
    @XmlElement(name = "FreqMin", required = true)
      private  FreqM freqMin;
/**
FreqMax  - Maximum Frequency (Optional) 

The maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group FreqRangeGrp (Required)
@since 3.1.0
*/
    @XmlElement(name = "FreqMax", required = false)
    private FreqM freqMax;
/**
TuningStep  - Tuning Step (Optional) 

The tuning increment.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "TuningStep", required = false)
    private FreqM tuningStep;
/**
NumPresetChannels - Number of Preset Channels (Optional) 

The number of preset channels available.

Format is UN(8)
@since 3.1.0
*/
    @XmlElement(name = "NumPresetChannels", required = false)
    private UN8 numPresetChannels;
/**
US:LowestUsableChannel - Lowest Usable Channel (Optional) 

The center frequency of the lowest channel usable within this transmitter frequency range.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "LowestUsableChannel", required = false)
    private FreqM lowestUsableChannel;
/**
US:MinSeparation  - Minimum Separation (Optional) 

The minimum frequency separation required at one transmitter or receiver location.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "MinSeparation", required = false)
    private FreqM minSeparation;

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
Get the tuning increment.

@return the TuningStep value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getTuningStep() {
        return tuningStep;
    }

/**
Set the tuning increment.

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
Get the number of preset channels available.

@return the NumPresetChannels value in a {@link TUN8} data type
@since 3.1.0
*/
public UN8 getNumPresetChannels() {
        return numPresetChannels;
    }

/**
Set the number of preset channels available.

@param value the NumPresetChannels value in a {@link TUN8} data type
@since 3.1.0
*/
public void setNumPresetChannels(UN8 value) {
        this.numPresetChannels = value;
    }

/**
Determine if the NumPresetChannels is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumPresetChannels() {
        return (this.numPresetChannels!= null);
    }

/**
Get the center frequency of the lowest channel usable within this transmitter frequency range.

@return the LowestUsableChannel value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getLowestUsableChannel() {
        return lowestUsableChannel;
    }

/**
Set the center frequency of the lowest channel usable within this transmitter frequency range.

@param value the LowestUsableChannel value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setLowestUsableChannel(FreqM value) {
        this.lowestUsableChannel = value;
    }

/**
Determine if the LowestUsableChannel is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLowestUsableChannel() {
        return (this.lowestUsableChannel!= null);
    }

/**
Get the minimum frequency separation required at one transmitter or receiver location.

@return the MinSeparation value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getMinSeparation() {
        return minSeparation;
    }

/**
Set the minimum frequency separation required at one transmitter or receiver location.

@param value the MinSeparation value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setMinSeparation(FreqM value) {
        this.minSeparation = value;
    }

/**
Determine if the MinSeparation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMinSeparation() {
        return (this.minSeparation!= null);
    }

/**
Set the nominal frequency or minimum value of the frequency range.

@param value  An instances of type {@link TFreqM}
@return The current TxSignalTuning object instance
@since 3.1.0
*/
    public TxSignalTuning withFreqMin(TFreqM value) {
        return this;
    }

/**
Set the maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

@param value  An instances of type {@link Double}
@return The current TxSignalTuning object instance
@since 3.1.0
*/
    public TxSignalTuning withFreqMax(Double value) {
           setFreqMax(new FreqM(value));
        return this;
    }

/**
Set the tuning increment.

@param value  An instances of type {@link Double}
@return The current TxSignalTuning object instance
@since 3.1.0
*/
    public TxSignalTuning withTuningStep(Double value) {
           setTuningStep(new FreqM(value));
        return this;
    }

/**
Set the number of preset channels available.

@param value  An instances of type {@link Integer}
@return The current TxSignalTuning object instance
@since 3.1.0
*/
    public TxSignalTuning withNumPresetChannels(Integer value) {
           setNumPresetChannels(new UN8(value));
        return this;
    }

/**
Set the center frequency of the lowest channel usable within this transmitter frequency range.

@param value  An instances of type {@link Double}
@return The current TxSignalTuning object instance
@since 3.1.0
*/
    public TxSignalTuning withLowestUsableChannel(Double value) {
           setLowestUsableChannel(new FreqM(value));
        return this;
    }

/**
Set the minimum frequency separation required at one transmitter or receiver location.

@param value  An instances of type {@link Double}
@return The current TxSignalTuning object instance
@since 3.1.0
*/
    public TxSignalTuning withMinSeparation(Double value) {
           setMinSeparation(new FreqM(value));
        return this;
    }

/**
 Get a string representation of this TxSignalTuning instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "TxSignalTuning {"
 + (freqMax !=null? " freqMax [" + freqMax +"]" : "") 
 + (freqMin !=null? " freqMin [" + freqMin +"]" : "") 
 + (lowestUsableChannel !=null? " lowestUsableChannel [" + lowestUsableChannel +"]" : "") 
 + (minSeparation !=null? " minSeparation [" + minSeparation +"]" : "") 
 + (numPresetChannels !=null? " numPresetChannels [" + numPresetChannels +"]" : "") 
 + (tuningStep !=null? " tuningStep [" + tuningStep +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link TxSignalTuning} requires {@link FreqM FreqMin}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetFreqMin();
}

}
