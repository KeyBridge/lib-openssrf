package us.gov.dod.standard.ssrf._3_1.multiple;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
ConfigFreq indicates the set of frequencies that a configuration uses, which may be a subset of the frequencies that the linked components (Transmitter, Receiver, Antenna) are capable of.

Element of {@link Configuration}

Example: <pre>
* &lt;ConfigFreq&gt;
*   &lt;FreqMax  cls="U"&gt;3126&lt;/FreqMax &gt;
*   &lt;FreqMin  cls="U"&gt;3000&lt;/FreqMin &gt;
*   &lt;idx cls="U"&gt;23&lt;/idx&gt;
*   &lt;InBand  cls="U"&gt;Yes&lt;/InBand &gt;
*   &lt;Priority  cls="U"&gt;Primary&lt;/Priority &gt;
*   &lt;ChannelSpacing cls="U"&gt;25&lt;/ChannelSpacing&gt;
*   &lt;Duration cls="U"&gt;.001&lt;/Duration&gt;
*   &lt;FreqUse cls="U"&gt;TRANSMIT&lt;/FreqUse&gt;
*   &lt;Period cls="U"&gt;23.6&lt;/Period&gt;
*   &lt;PulseWidth cls="U"&gt;347&lt;/PulseWidth&gt;
* &lt;/ConfigFreq&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigFreq", propOrder = {
    "freqMin",
    "freqMax",
    "inBand",
    "priority",
    "channelSpacing",
    "duration",
    "configFreqUse",
    "period",
    "pulseWidth"
})
public class ConfigFreq {

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
InBand  - In Band Indicator (Optional) 

"Yes" if this frequency range is in compliance with the applicable Frequency Allocation Table. Enter “No” if any portion of the frequency range is not in compliance.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "InBand", required = false)
    private TString inBand;
/**
Priority  - Priority (Optional) 

If this spectrum use is Primary, Secondary or Permitted, as defined by the system use and the appropriate Administration Frequency Allocation Table/guidance.

Format is L:CPS
@since 3.1.0
*/
    @XmlElement(name = "Priority", required = false)
    private TString priority;
/**
In Data Item ChannelSpacing (US)- enter the amount of bandwidth allotted to each channel, measured as the spacing between center frequencies (or wavelengths) of adjacent channels.
@since 3.1.0
*/
    @XmlElement(name = "ChannelSpacing", required = false)
    private FreqM channelSpacing;
/**
US:Duration - Frequency Dwell (Optional) 

The amount of time the frequency is being monitored or jammed.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "Duration", required = false)
    private microsecs duration;

    @XmlElement(name = "ConfigFreqUse", required = false)
    private TString configFreqUse;
/**
In Data Item Period (US),- enter how often the frequency is being monitored or jammed.
@since 3.1.0
*/
    @XmlElement(name = "Period", required = false)
    private microsecs period;
/**
US:PulseWidth - Pulse Width (Optional) 

The collected EW channel dwell for the Chirped Signal.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PulseWidth", required = false)
    private microsecs pulseWidth;

    @XmlAttribute(name = "idx", required = true)
      private  BigInteger idx;

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
Get "Yes" if this frequency range is in compliance with the applicable Frequency Allocation Table. Enter “No” if any portion of the frequency range is not in compliance.

@return the InBand value in a {@link TString} data type
@since 3.1.0
*/
public TString getInBand() {
        return inBand;
    }

/**
Set "Yes" if this frequency range is in compliance with the applicable Frequency Allocation Table. Enter “No” if any portion of the frequency range is not in compliance.

@param value the InBand value in a {@link TString} data type
@since 3.1.0
*/
public void setInBand(TString value) {
        this.inBand = value;
    }

/**
Determine if the InBand is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetInBand() {
return (this.inBand!= null ? this.inBand.isSetValue() : false);
    }

/**
Get if this spectrum use is Primary, Secondary or Permitted, as defined by the system use and the appropriate Administration Frequency Allocation Table/guidance.

@return the Priority value in a {@link TString} data type
@since 3.1.0
*/
public TString getPriority() {
        return priority;
    }

/**
Set if this spectrum use is Primary, Secondary or Permitted, as defined by the system use and the appropriate Administration Frequency Allocation Table/guidance.

@param value the Priority value in a {@link TString} data type
@since 3.1.0
*/
public void setPriority(TString value) {
        this.priority = value;
    }

/**
Determine if the Priority is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPriority() {
return (this.priority!= null ? this.priority.isSetValue() : false);
    }

/**
Get In Data Item ChannelSpacing (US)- enter the amount of bandwidth allotted to each channel, measured as the spacing between center frequencies (or wavelengths) of adjacent channels.

@return the ChannelSpacing value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getChannelSpacing() {
        return channelSpacing;
    }

/**
Set In Data Item ChannelSpacing (US)- enter the amount of bandwidth allotted to each channel, measured as the spacing between center frequencies (or wavelengths) of adjacent channels.

@param value the ChannelSpacing value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setChannelSpacing(FreqM value) {
        this.channelSpacing = value;
    }

/**
Determine if the ChannelSpacing is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetChannelSpacing() {
        return (this.channelSpacing!= null);
    }

/**
Get the amount of time the frequency is being monitored or jammed.

@return the Duration value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getDuration() {
        return duration;
    }

/**
Set the amount of time the frequency is being monitored or jammed.

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
Get 

@return the ConfigFreqUse value in a {@link TString} data type
@since 3.1.0
*/
public TString getConfigFreqUse() {
        return configFreqUse;
    }

/**
Set 

@param value the ConfigFreqUse value in a {@link TString} data type
@since 3.1.0
*/
public void setConfigFreqUse(TString value) {
        this.configFreqUse = value;
    }

/**
Determine if the ConfigFreqUse is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetConfigFreqUse() {
return (this.configFreqUse!= null ? this.configFreqUse.isSetValue() : false);
    }

/**
Get In Data Item Period (US),- enter how often the frequency is being monitored or jammed.

@return the Period value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPeriod() {
        return period;
    }

/**
Set In Data Item Period (US),- enter how often the frequency is being monitored or jammed.

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
Get the collected EW channel dwell for the Chirped Signal.

@return the PulseWidth value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPulseWidth() {
        return pulseWidth;
    }

/**
Set the collected EW channel dwell for the Chirped Signal.

@param value the PulseWidth value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPulseWidth(microsecs value) {
        this.pulseWidth = value;
    }

/**
Determine if the PulseWidth is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPulseWidth() {
        return (this.pulseWidth!= null);
    }

/**
Get 

@return  a {@link BigInteger} instance
@since 3.1.0
*/
public BigInteger getIdx() {
        return idx;
    }

/**
Set 

@param value  a {@link BigInteger} instance
@since 3.1.0
*/
public void setIdx(BigInteger value) {
        this.idx = value;
    }

/**
Determine if the Idx is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIdx() {
        return (this.idx!= null);
    }

/**
Set the nominal frequency or minimum value of the frequency range.

@param value  An instances of type {@link TFreqM}
@return The current ConfigFreq object instance
@since 3.1.0
*/
    public ConfigFreq withFreqMin(TFreqM value) {
        return this;
    }

/**
Set the maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

@param value  An instances of type {@link Double}
@return The current ConfigFreq object instance
@since 3.1.0
*/
    public ConfigFreq withFreqMax(Double value) {
           setFreqMax(new FreqM(value));
        return this;
    }

/**
Set "Yes" if this frequency range is in compliance with the applicable Frequency Allocation Table. Enter “No” if any portion of the frequency range is not in compliance.

@param value  An instances of type {@link ListCBO}
@return The current ConfigFreq object instance
@since 3.1.0
*/
    public ConfigFreq withInBand(ListCBO value) {
           setInBand(new TString(value.value()));
        return this;
    }

/**
Set if this spectrum use is Primary, Secondary or Permitted, as defined by the system use and the appropriate Administration Frequency Allocation Table/guidance.

@param value  An instances of type {@link ListCPS}
@return The current ConfigFreq object instance
@since 3.1.0
*/
    public ConfigFreq withPriority(ListCPS value) {
           setPriority(new TString(value.value()));
        return this;
    }

/**
Set In Data Item ChannelSpacing (US)- enter the amount of bandwidth allotted to each channel, measured as the spacing between center frequencies (or wavelengths) of adjacent channels.

@param value  An instances of type {@link Double}
@return The current ConfigFreq object instance
@since 3.1.0
*/
    public ConfigFreq withChannelSpacing(Double value) {
           setChannelSpacing(new FreqM(value));
        return this;
    }

/**
Set the amount of time the frequency is being monitored or jammed.

@param value  An instances of type {@link Double}
@return The current ConfigFreq object instance
@since 3.1.0
*/
    public ConfigFreq withDuration(Double value) {
           setDuration(new microsecs(value));
        return this;
    }

/**
Set 

@param value  An instances of type {@link ListUFU}
@return The current ConfigFreq object instance
@since 3.1.0
*/
    public ConfigFreq withConfigFreqUse(ListUFU value) {
           setConfigFreqUse(new TString(value.value()));
        return this;
    }

/**
Set In Data Item Period (US),- enter how often the frequency is being monitored or jammed.

@param value  An instances of type {@link Double}
@return The current ConfigFreq object instance
@since 3.1.0
*/
    public ConfigFreq withPeriod(Double value) {
           setPeriod(new microsecs(value));
        return this;
    }

/**
Set the collected EW channel dwell for the Chirped Signal.

@param value  An instances of type {@link Double}
@return The current ConfigFreq object instance
@since 3.1.0
*/
    public ConfigFreq withPulseWidth(Double value) {
           setPulseWidth(new microsecs(value));
        return this;
    }

/**
Set 

@param value  An instances of type {@link BigInteger}
@return The current ConfigFreq object instance
@since 3.1.0
*/
    public ConfigFreq withIdx(BigInteger value) {
        return this;
    }

/**
 Get a string representation of this ConfigFreq instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ConfigFreq {"
 + (channelSpacing !=null? " channelSpacing [" + channelSpacing +"]" : "") 
 + (configFreqUse !=null? " configFreqUse [" + configFreqUse +"]" : "") 
 + (duration !=null? " duration [" + duration +"]" : "") 
 + (freqMax !=null? " freqMax [" + freqMax +"]" : "") 
 + (freqMin !=null? " freqMin [" + freqMin +"]" : "") 
 + (idx !=null? " idx [" + idx +"]" : "") 
 + (inBand !=null? " inBand [" + inBand +"]" : "") 
 + (period !=null? " period [" + period +"]" : "") 
 + (priority !=null? " priority [" + priority +"]" : "") 
 + (pulseWidth !=null? " pulseWidth [" + pulseWidth +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ConfigFreq} requires {@link FreqM FreqMin}, {@link BigInteger idx}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetFreqMin() &&  isSetIdx();
}

}
