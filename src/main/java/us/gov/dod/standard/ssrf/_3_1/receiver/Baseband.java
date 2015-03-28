package us.gov.dod.standard.ssrf._3_1.receiver;

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
Baseband defines the parameters of the modulating or received signal.

Element of {@link RxMode}, {@link TxMode}

Example: <pre>
* &lt;Baseband&gt;
*   &lt;ModFreqMin cls="U"&gt;0.0003&lt;/ModFreqMin&gt;
*   &lt;ModFreqMax cls="U"&gt;0.0034&lt;/ModFreqMax&gt;
*   &lt;SignalType cls="U"&gt;FM Clear Voice&lt;/SignalType&gt;
* &lt;/Baseband&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Baseband", propOrder = {
    "modFreqMin",
    "modFreqMax",
    "signalType",
    "bitDuration",
    "ookPattern",
    "signalDurationMax",
    "signalDurationMin",
    "signalSequenceDesc",
    "signalShape"
})
public class Baseband {

/**
ModFreqMin  - Minimum Modulating Frequency (Optional) 

The minimum modulating frequency measured:
- for a transmitter, on the low side of the spectrum signature at the -3 dB point before the baseband signal begins the up-conversion process;
- for a receiver, at the -3 dB point on the low frequency side of the receiver baseband, after detection but prior to de-multiplexing or demodulation.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "ModFreqMin", required = false)
    private FreqM modFreqMin;
/**
ModFreqMax  - Maximum Modulating Frequency (Optional) 

The maximum modulating frequency:
- for a transmitter, measured on the high side of the spectrum signature at the -3 dB point before the baseband signal begins the up-conversion process;
- for a receiver, frequency that can be recovered and demodulated by the receiver. Typically, this frequency should have 3-dB attenuation relative to the least attenuated demodulated or multiplexed signal.

[XSL ERR MINMAX] If ModFreqMax is used, it MUST be greater than ModFreqMin.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "ModFreqMax", required = false)
    private FreqM modFreqMax;
/**
SignalType  - Signal Type (Optional) 

The type of modulation.

Format is L:CMO
@since 3.1.0
*/
    @XmlElement(name = "SignalType", required = false)
    private TString signalType;
/**
BitDuration - Bit Duration (Optional) 

The period of elapsed time, per bit instance, before change of states.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "BitDuration", required = false)
    private microsecs bitDuration;
/**
OOKPattern -  On-Off Key Pattern (Optional) 

A text description of the on-off keying (OOK) pattern. Example: (3 on, 3 off, 3 on, 4 off,...)

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "OOKPattern", required = false)
    private S100 ookPattern;
/**
US:SignalDurationMax - Maximum Signal Duration (Optional) 

The maximum time value for how long the tone persists in the baseband.

[XSL ERR MINMAX] If US:SignalDurationMax is used, it MUST be greater than US:SignalDurationMin.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "SignalDurationMax", required = false)
    private microsecs signalDurationMax;
/**
US:SignalDurationMin - Minimum Signal Duration (Optional) 

The minimum time value for how long the tone persists in the baseband.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "SignalDurationMin", required = false)
    private microsecs signalDurationMin;
/**
US:SignalSequenceDesc - Signal Sequence Description (Optional) 

The pattern of occurrence of sub-signals. (Example: beep, beep, pause, bip, pause...) If using SignalDuration, entries in ToneName MUST match the descriptive names used here.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "SignalSequenceDesc", required = false)
    private S100 signalSequenceDesc;
/**
US:SignalShape - Signal Shape (Optional) 

The basic shape of the signal.

Format is L:USS
@since 3.1.0
*/
    @XmlElement(name = "SignalShape", required = false)
    private TString signalShape;

/**
Get the minimum modulating frequency measured:
- for a transmitter, on the low side of the spectrum signature at the -3 dB point before the baseband signal begins the up-conversion process;
- for a receiver, at the -3 dB point on the low frequency side of the receiver baseband, after detection but prior to de-multiplexing or demodulation.

@return the ModFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getModFreqMin() {
        return modFreqMin;
    }

/**
Set the minimum modulating frequency measured:
- for a transmitter, on the low side of the spectrum signature at the -3 dB point before the baseband signal begins the up-conversion process;
- for a receiver, at the -3 dB point on the low frequency side of the receiver baseband, after detection but prior to de-multiplexing or demodulation.

@param value the ModFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setModFreqMin(FreqM value) {
        this.modFreqMin = value;
    }

/**
Determine if the ModFreqMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetModFreqMin() {
        return (this.modFreqMin!= null);
    }

/**
Get the maximum modulating frequency:
- for a transmitter, measured on the high side of the spectrum signature at the -3 dB point before the baseband signal begins the up-conversion process;
- for a receiver, frequency that can be recovered and demodulated by the receiver. Typically, this frequency should have 3-dB attenuation relative to the least attenuated demodulated or multiplexed signal.

[XSL ERR MINMAX] If ModFreqMax is used, it MUST be greater than ModFreqMin.

@return the ModFreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getModFreqMax() {
        return modFreqMax;
    }

/**
Set the maximum modulating frequency:
- for a transmitter, measured on the high side of the spectrum signature at the -3 dB point before the baseband signal begins the up-conversion process;
- for a receiver, frequency that can be recovered and demodulated by the receiver. Typically, this frequency should have 3-dB attenuation relative to the least attenuated demodulated or multiplexed signal.

[XSL ERR MINMAX] If ModFreqMax is used, it MUST be greater than ModFreqMin.

@param value the ModFreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setModFreqMax(FreqM value) {
        this.modFreqMax = value;
    }

/**
Determine if the ModFreqMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetModFreqMax() {
        return (this.modFreqMax!= null);
    }

/**
Get the type of modulation.

@return the SignalType value in a {@link TString} data type
@since 3.1.0
*/
public TString getSignalType() {
        return signalType;
    }

/**
Set the type of modulation.

@param value the SignalType value in a {@link TString} data type
@since 3.1.0
*/
public void setSignalType(TString value) {
        this.signalType = value;
    }

/**
Determine if the SignalType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSignalType() {
return (this.signalType!= null ? this.signalType.isSetValue() : false);
    }

/**
Get the period of elapsed time, per bit instance, before change of states.

@return the BitDuration value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getBitDuration() {
        return bitDuration;
    }

/**
Set the period of elapsed time, per bit instance, before change of states.

@param value the BitDuration value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setBitDuration(microsecs value) {
        this.bitDuration = value;
    }

/**
Determine if the BitDuration is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetBitDuration() {
        return (this.bitDuration!= null);
    }

/**
Get a text description of the on-off keying (OOK) pattern. Example: (3 on, 3 off, 3 on, 4 off,...)

@return the OOKPattern value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getOOKPattern() {
        return ookPattern;
    }

/**
Set a text description of the on-off keying (OOK) pattern. Example: (3 on, 3 off, 3 on, 4 off,...)

@param value the OOKPattern value in a {@link TS100} data type
@since 3.1.0
*/
public void setOOKPattern(S100 value) {
        this.ookPattern = value;
    }

/**
Determine if the OOKPattern is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOOKPattern() {
        return (this.ookPattern!= null);
    }

/**
Get the maximum time value for how long the tone persists in the baseband.

[XSL ERR MINMAX] If US:SignalDurationMax is used, it MUST be greater than US:SignalDurationMin.

@return the SignalDurationMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getSignalDurationMax() {
        return signalDurationMax;
    }

/**
Set the maximum time value for how long the tone persists in the baseband.

[XSL ERR MINMAX] If US:SignalDurationMax is used, it MUST be greater than US:SignalDurationMin.

@param value the SignalDurationMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setSignalDurationMax(microsecs value) {
        this.signalDurationMax = value;
    }

/**
Determine if the SignalDurationMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSignalDurationMax() {
        return (this.signalDurationMax!= null);
    }

/**
Get the minimum time value for how long the tone persists in the baseband.

@return the SignalDurationMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getSignalDurationMin() {
        return signalDurationMin;
    }

/**
Set the minimum time value for how long the tone persists in the baseband.

@param value the SignalDurationMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setSignalDurationMin(microsecs value) {
        this.signalDurationMin = value;
    }

/**
Determine if the SignalDurationMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSignalDurationMin() {
        return (this.signalDurationMin!= null);
    }

/**
Get the pattern of occurrence of sub-signals. (Example: beep, beep, pause, bip, pause...) If using SignalDuration, entries in ToneName MUST match the descriptive names used here.

@return the SignalSequenceDesc value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getSignalSequenceDesc() {
        return signalSequenceDesc;
    }

/**
Set the pattern of occurrence of sub-signals. (Example: beep, beep, pause, bip, pause...) If using SignalDuration, entries in ToneName MUST match the descriptive names used here.

@param value the SignalSequenceDesc value in a {@link TS100} data type
@since 3.1.0
*/
public void setSignalSequenceDesc(S100 value) {
        this.signalSequenceDesc = value;
    }

/**
Determine if the SignalSequenceDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSignalSequenceDesc() {
        return (this.signalSequenceDesc!= null);
    }

/**
Get the basic shape of the signal.

@return the SignalShape value in a {@link TString} data type
@since 3.1.0
*/
public TString getSignalShape() {
        return signalShape;
    }

/**
Set the basic shape of the signal.

@param value the SignalShape value in a {@link TString} data type
@since 3.1.0
*/
public void setSignalShape(TString value) {
        this.signalShape = value;
    }

/**
Determine if the SignalShape is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSignalShape() {
return (this.signalShape!= null ? this.signalShape.isSetValue() : false);
    }

/**
Set the minimum modulating frequency measured:
- for a transmitter, on the low side of the spectrum signature at the -3 dB point before the baseband signal begins the up-conversion process;
- for a receiver, at the -3 dB point on the low frequency side of the receiver baseband, after detection but prior to de-multiplexing or demodulation.

@param value  An instances of type {@link Double}
@return The current Baseband object instance
@since 3.1.0
*/
    public Baseband withModFreqMin(Double value) {
           setModFreqMin(new FreqM(value));
        return this;
    }

/**
Set the maximum modulating frequency:
- for a transmitter, measured on the high side of the spectrum signature at the -3 dB point before the baseband signal begins the up-conversion process;
- for a receiver, frequency that can be recovered and demodulated by the receiver. Typically, this frequency should have 3-dB attenuation relative to the least attenuated demodulated or multiplexed signal.

[XSL ERR MINMAX] If ModFreqMax is used, it MUST be greater than ModFreqMin.

@param value  An instances of type {@link Double}
@return The current Baseband object instance
@since 3.1.0
*/
    public Baseband withModFreqMax(Double value) {
           setModFreqMax(new FreqM(value));
        return this;
    }

/**
Set the type of modulation.

@param value  An instances of type {@link ListCMO}
@return The current Baseband object instance
@since 3.1.0
*/
    public Baseband withSignalType(ListCMO value) {
           setSignalType(new TString(value.value()));
        return this;
    }

/**
Set the period of elapsed time, per bit instance, before change of states.

@param value  An instances of type {@link Double}
@return The current Baseband object instance
@since 3.1.0
*/
    public Baseband withBitDuration(Double value) {
           setBitDuration(new microsecs(value));
        return this;
    }

/**
Set a text description of the on-off keying (OOK) pattern. Example: (3 on, 3 off, 3 on, 4 off,...)

@param value  An instances of type {@link String}
@return The current Baseband object instance
@since 3.1.0
*/
    public Baseband withOOKPattern(String value) {
           setOOKPattern(new S100(value));
        return this;
    }

/**
Set the maximum time value for how long the tone persists in the baseband.

[XSL ERR MINMAX] If US:SignalDurationMax is used, it MUST be greater than US:SignalDurationMin.

@param value  An instances of type {@link Double}
@return The current Baseband object instance
@since 3.1.0
*/
    public Baseband withSignalDurationMax(Double value) {
           setSignalDurationMax(new microsecs(value));
        return this;
    }

/**
Set the minimum time value for how long the tone persists in the baseband.

@param value  An instances of type {@link Double}
@return The current Baseband object instance
@since 3.1.0
*/
    public Baseband withSignalDurationMin(Double value) {
           setSignalDurationMin(new microsecs(value));
        return this;
    }

/**
Set the pattern of occurrence of sub-signals. (Example: beep, beep, pause, bip, pause...) If using SignalDuration, entries in ToneName MUST match the descriptive names used here.

@param value  An instances of type {@link String}
@return The current Baseband object instance
@since 3.1.0
*/
    public Baseband withSignalSequenceDesc(String value) {
           setSignalSequenceDesc(new S100(value));
        return this;
    }

/**
Set the basic shape of the signal.

@param value  An instances of type {@link ListUSS}
@return The current Baseband object instance
@since 3.1.0
*/
    public Baseband withSignalShape(ListUSS value) {
           setSignalShape(new TString(value.value()));
        return this;
    }

/**
 Get a string representation of this Baseband instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Baseband {"
 + (bitDuration !=null? " bitDuration [" + bitDuration +"]" : "") 
 + (modFreqMax !=null? " modFreqMax [" + modFreqMax +"]" : "") 
 + (modFreqMin !=null? " modFreqMin [" + modFreqMin +"]" : "") 
 + (ookPattern !=null? " ookPattern [" + ookPattern +"]" : "") 
 + (signalDurationMax !=null? " signalDurationMax [" + signalDurationMax +"]" : "") 
 + (signalDurationMin !=null? " signalDurationMin [" + signalDurationMin +"]" : "") 
 + (signalSequenceDesc !=null? " signalSequenceDesc [" + signalSequenceDesc +"]" : "") 
 + (signalShape !=null? " signalShape [" + signalShape +"]" : "") 
 + (signalType !=null? " signalType [" + signalType +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Baseband} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
