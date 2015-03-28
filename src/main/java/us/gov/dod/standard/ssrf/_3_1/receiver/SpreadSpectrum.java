package us.gov.dod.standard.ssrf._3_1.receiver;

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
SpreadSpectrum contains characteristics of systems using spread spectrum techniques.

Element of {@link RxMode}, {@link TxMode}

Example: <pre>
* &lt;SpreadSpectrum&gt;
*   &lt;ChipRate  cls="U"&gt;4000&lt;/ChipRate &gt;
*   &lt;CodeRate  cls="U"&gt;1987&lt;/CodeRate &gt;
*   &lt;FreqBlocking  cls="U"&gt;Yes&lt;/FreqBlocking &gt;
*   &lt;FreqMax  cls="U"&gt;3107.56&lt;/FreqMax &gt;
*   &lt;FreqMin  cls="U"&gt;2999.753&lt;/FreqMin &gt;
*   &lt;HopDwell  cls="U"&gt;82.46&lt;/HopDwell &gt;
*   &lt;HopRate  cls="U"&gt;64&lt;/HopRate &gt;
*   &lt;InfoDataRate  cls="U"&gt;6400&lt;/InfoDataRate &gt;
*   &lt;MaxGain cls="U"&gt;87.89&lt;/MaxGain&gt;
*   &lt;NumFreqsPerHopset  cls="U"&gt;7843&lt;/NumFreqsPerHopset &gt;
*   &lt;NumHopsets  cls="U"&gt;12&lt;/NumHopsets &gt;
*   &lt;PulseChirpDurationMin cls="U"&gt;300&lt;/PulseChirpDurationMin&gt;
*   &lt;PulseChirpDurationMax cls="U"&gt;400&lt;/PulseChirpDurationMax&gt;
*   &lt;PulseChirpFreqShift cls="U"&gt;47.98&lt;/PulseChirpFreqShift&gt;
*   &lt;PulseChirpRate cls="U"&gt;800&lt;/PulseChirpRate&gt;
*   &lt;PulseFreqDev cls="U"&gt;25.1&lt;/PulseFreqDev&gt;
*   &lt;TimeHopNumSlots  cls="U"&gt;346&lt;/TimeHopNumSlots &gt;
*   &lt;TimeHopPulsesPerDwell  cls="U"&gt;679&lt;/TimeHopPulsesPerDwell &gt;
*   &lt;Type  cls="U"&gt;Direct sequence + Frequency hopped&lt;/Type &gt;
*   &lt;ChipRate  cls="U"&gt;8954&lt;/ChipRate &gt;
*   &lt;CodeRate  cls="U"&gt;236&lt;/CodeRate &gt;
*   &lt;FreqBlocking  cls="U"&gt;Yes&lt;/FreqBlocking &gt;
*   &lt;FreqMax  cls="U"&gt;3107.56&lt;/FreqMax &gt;
*   &lt;FreqMin  cls="U"&gt;2999.753&lt;/FreqMin &gt;
*   &lt;HopDwell  cls="U"&gt;79.235&lt;/HopDwell &gt;
*   &lt;HopRate  cls="U"&gt;5000&lt;/HopRate &gt;
*   &lt;InfoDataRate  cls="U"&gt;800&lt;/InfoDataRate &gt;
*   &lt;MaxGain  cls="U"&gt;34&lt;/MaxGain &gt;
*   &lt;NumFreqsPerHopset  cls="U"&gt;35&lt;/NumFreqsPerHopset &gt;
*   &lt;NumHopsets  cls="U"&gt;23&lt;/NumHopsets &gt;
*   &lt;PulseChirpDurationMin cls="U"&gt;100&lt;/PulseChirpDurationMin&gt;
*   &lt;PulseChirpFreqShift cls="U"&gt;47.98&lt;/PulseChirpFreqShift&gt;
*   &lt;PulseChirpRate cls="U"&gt;500&lt;/PulseChirpRate&gt;
*   &lt;PulseFreqDev cls="U"&gt;347&lt;/PulseFreqDev&gt;
*   &lt;TimeHopNumSlots  cls="U"&gt;890&lt;/TimeHopNumSlots &gt;
*   &lt;TimeHopPulsesPerDwell  cls="U"&gt;679&lt;/TimeHopPulsesPerDwell &gt;
*   &lt;Type  cls="U"&gt;Direct sequence + Frequency hopped&lt;/Type &gt;
* &lt;/SpreadSpectrum&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpreadSpectrum", propOrder = {
    "type",
    "freqMin",
    "freqMax",
    "maxGain",
    "pulseFreqDev",
    "infoDataRate",
    "chipRate",
    "codeRate",
    "pulseChirpRate",
    "pulseChirpFreqShift",
    "pulseChirpDurationMin",
    "pulseChirpDurationMax",
    "timeHopNumSlots",
    "timeHopPulsesPerDwell",
    "hopRate",
    "hopDwell",
    "numFreqsPerHopset",
    "numHopsets",
    "freqBlocking"
})
public class SpreadSpectrum {

/**
Type  - Spread Spectrum Type (Optional) 

The type of spread spectrum system being used.

Format is L:CSS
@since 3.1.0
*/
    @XmlElement(name = "Type", required = false)
    private TString type;
/**
FreqMin  - Nominal or Minimum Frequency (Required) 

The nominal frequency or minimum value of the frequency range.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group FreqRangeGrp (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FreqMin")
      private  FreqM freqMin;
/**
FreqMax  - Maximum Frequency (Optional) 

The maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group FreqRangeGrp (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FreqMax", required = false)
    private FreqM freqMax;
/**
MaxGain - Spread Spectrum Processing Gain (Optional) 

The processing gain.

Format is SN(6,3) (dB)
@since 3.1.0
*/
    @XmlElement(name = "MaxGain", required = false)
    private dB maxGain;
/**
In Data Item PulseFreqDev, Enter, for FM pulse radars, the total frequency shift during the pulse width.
@since 3.1.0
*/
    @XmlElement(name = "PulseFreqDev", required = false)
    private FreqM pulseFreqDev;
/**
InfoDataRate  - Information Data Rate (Optional) 

The information data rate.

Format is UN(10,3) (bits/sec)
@since 3.1.0
*/
    @XmlElement(name = "InfoDataRate", required = false)
    private InfoDataRate infoDataRate;
/**
ChipRate  - Direct Sequence Chip Rate (Optional) 

The maximum generator rate used to encode/decode a Direct Sequence spread spectrum signal.

Format is UN(16,9) (Mchips/sec)
@since 3.1.0
*/
    @XmlElement(name = "ChipRate", required = false)
    private MChips chipRate;
/**
CodeRate  - Code Rate (Optional) 

The post encryption number of symbols per bit for a digital data stream. This does not refer to modulation symbols in a format such as quadrature amplitude modulation (QAM).

Format is UN(10,3) (symbols/bit)
@since 3.1.0
*/
    @XmlElement(name = "CodeRate", required = false)
    private CodeRate codeRate;
/**
PulseChirpRate - Chirp Rate (Optional) 

For linear frequency modulation, the constant rate at which the radio frequency of a pulse is increased throughout the width of the pulse.

Format is UN(9,6)
(Hz/sec)
@since 3.1.0
*/
    @XmlElement(name = "PulseChirpRate", required = false)
    private RFChgRate pulseChirpRate;
/**
PulseChirpFreqShift - Chirp Frequency Shift (Optional) 

The difference between the starting and stopping frequency of a chirped pulse signal.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "PulseChirpFreqShift", required = false)
    private FreqM pulseChirpFreqShift;
/**
PulseChirpDurationMin - Minimum Chirp Duration (Optional) 

The duration (pulsewidth) of the chirp signal.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PulseChirpDurationMin", required = false)
    private microsecs pulseChirpDurationMin;
/**
PulseChirpDurationMax - Maximum Chirp Duration (Optional) 

The maximum duration (pulsewidth) of the chirp signal.

[XSL ERR MINMAX] If PulseChirpDurationMax is used, it MUST be greater than PulseChirpDurationMin.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PulseChirpDurationMax", required = false)
    private microsecs pulseChirpDurationMax;
/**
TimeHopNumSlots  - Number of Time Hop Slots (Optional) 

The number of time slots.

Format is UN(5)

Attribute group TimeHop (Optional)
@since 3.1.0
*/
    @XmlElement(name = "TimeHopNumSlots", required = false)
    private UN5 timeHopNumSlots;
/**
TimeHopPulsesPerDwell  - Number of Pulses Per Dwell (Optional) 

The number of pulses transmitted during each dwell.

Format is UN(12)

Attribute group TimeHop (Optional)
@since 3.1.0
*/
    @XmlElement(name = "TimeHopPulsesPerDwell", required = false)
    private UN12 timeHopPulsesPerDwell;
/**
HopRate  - Hopping Rate (Optional) 

The rate at which the frequency hopping system hops from one frequency to another frequency.

Format is UN(9,3) (hops/sec)

Attribute group Hopset (Optional)
@since 3.1.0
*/
    @XmlElement(name = "HopRate", required = false)
    private hops hopRate;
/**
HopDwell  - Hop Dwell Time (Optional) 

The length of time the frequency hopping system dwells on a frequency.

Format is UN(12,6) (μsec)

Attribute group Hopset (Optional)
@since 3.1.0
*/
    @XmlElement(name = "HopDwell", required = false)
    private microsecs hopDwell;
/**
NumFreqsPerHopset  - Number of Frequencies in the
Hopset (Optional) 

The number of frequencies contained in a hop set.

Format is UN(4)

Attribute group Hopset (Optional)
@since 3.1.0
*/
    @XmlElement(name = "NumFreqsPerHopset", required = false)
    private UN4 numFreqsPerHopset;
/**
NumHopsets  - Number of Hopsets (Optional) 

The number of frequency hopsets employed when a system uses frequency hopping spread spectrum modulation techniques, including hybrid direct sequence and frequency hopping.

Format is UN(4)

Attribute group Hopset (Optional)
@since 3.1.0
*/
    @XmlElement(name = "NumHopsets", required = false)
    private UN4 numHopsets;
/**
FreqBlocking  - Hopset Frequency Blocking
Indicator (Optional) 

If the frequency hopping system is capable of blocking certain frequencies.

Format is L:CBO

Attribute group Hopset (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FreqBlocking", required = false)
    private TString freqBlocking;

/**
Get the type of spread spectrum system being used.

@return the Type value in a {@link TString} data type
@since 3.1.0
*/
public TString getType() {
        return type;
    }

/**
Set the type of spread spectrum system being used.

@param value the Type value in a {@link TString} data type
@since 3.1.0
*/
public void setType(TString value) {
        this.type = value;
    }

/**
Determine if the Type is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetType() {
return (this.type!= null ? this.type.isSetValue() : false);
    }

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
Get the processing gain.

@return the MaxGain value in a {@link TdB} data type
@since 3.1.0
*/
public dB getMaxGain() {
        return maxGain;
    }

/**
Set the processing gain.

@param value the MaxGain value in a {@link TdB} data type
@since 3.1.0
*/
public void setMaxGain(dB value) {
        this.maxGain = value;
    }

/**
Determine if the MaxGain is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMaxGain() {
        return (this.maxGain!= null);
    }

/**
Get In Data Item PulseFreqDev, Enter, for FM pulse radars, the total frequency shift during the pulse width.

@return the PulseFreqDev value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getPulseFreqDev() {
        return pulseFreqDev;
    }

/**
Set In Data Item PulseFreqDev, Enter, for FM pulse radars, the total frequency shift during the pulse width.

@param value the PulseFreqDev value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setPulseFreqDev(FreqM value) {
        this.pulseFreqDev = value;
    }

/**
Determine if the PulseFreqDev is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPulseFreqDev() {
        return (this.pulseFreqDev!= null);
    }

/**
Get the information data rate.

@return the InfoDataRate value in a {@link TInfoDataRate} data type
@since 3.1.0
*/
public InfoDataRate getInfoDataRate() {
        return infoDataRate;
    }

/**
Set the information data rate.

@param value the InfoDataRate value in a {@link TInfoDataRate} data type
@since 3.1.0
*/
public void setInfoDataRate(InfoDataRate value) {
        this.infoDataRate = value;
    }

/**
Determine if the InfoDataRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetInfoDataRate() {
        return (this.infoDataRate!= null);
    }

/**
Get the maximum generator rate used to encode/decode a Direct Sequence spread spectrum signal.

@return the ChipRate value in a {@link TMChips} data type
@since 3.1.0
*/
public MChips getChipRate() {
        return chipRate;
    }

/**
Set the maximum generator rate used to encode/decode a Direct Sequence spread spectrum signal.

@param value the ChipRate value in a {@link TMChips} data type
@since 3.1.0
*/
public void setChipRate(MChips value) {
        this.chipRate = value;
    }

/**
Determine if the ChipRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetChipRate() {
        return (this.chipRate!= null);
    }

/**
Get the post encryption number of symbols per bit for a digital data stream. This does not refer to modulation symbols in a format such as quadrature amplitude modulation (QAM).

@return the CodeRate value in a {@link TCodeRate} data type
@since 3.1.0
*/
public CodeRate getCodeRate() {
        return codeRate;
    }

/**
Set the post encryption number of symbols per bit for a digital data stream. This does not refer to modulation symbols in a format such as quadrature amplitude modulation (QAM).

@param value the CodeRate value in a {@link TCodeRate} data type
@since 3.1.0
*/
public void setCodeRate(CodeRate value) {
        this.codeRate = value;
    }

/**
Determine if the CodeRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCodeRate() {
        return (this.codeRate!= null);
    }

/**
Get for linear frequency modulation, the constant rate at which the radio frequency of a pulse is increased throughout the width of the pulse.

@return the PulseChirpRate value in a {@link TRFChgRate} data type
@since 3.1.0
*/
public RFChgRate getPulseChirpRate() {
        return pulseChirpRate;
    }

/**
Set for linear frequency modulation, the constant rate at which the radio frequency of a pulse is increased throughout the width of the pulse.

@param value the PulseChirpRate value in a {@link TRFChgRate} data type
@since 3.1.0
*/
public void setPulseChirpRate(RFChgRate value) {
        this.pulseChirpRate = value;
    }

/**
Determine if the PulseChirpRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPulseChirpRate() {
        return (this.pulseChirpRate!= null);
    }

/**
Get the difference between the starting and stopping frequency of a chirped pulse signal.

@return the PulseChirpFreqShift value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getPulseChirpFreqShift() {
        return pulseChirpFreqShift;
    }

/**
Set the difference between the starting and stopping frequency of a chirped pulse signal.

@param value the PulseChirpFreqShift value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setPulseChirpFreqShift(FreqM value) {
        this.pulseChirpFreqShift = value;
    }

/**
Determine if the PulseChirpFreqShift is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPulseChirpFreqShift() {
        return (this.pulseChirpFreqShift!= null);
    }

/**
Get the duration (pulsewidth) of the chirp signal.

@return the PulseChirpDurationMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPulseChirpDurationMin() {
        return pulseChirpDurationMin;
    }

/**
Set the duration (pulsewidth) of the chirp signal.

@param value the PulseChirpDurationMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPulseChirpDurationMin(microsecs value) {
        this.pulseChirpDurationMin = value;
    }

/**
Determine if the PulseChirpDurationMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPulseChirpDurationMin() {
        return (this.pulseChirpDurationMin!= null);
    }

/**
Get the maximum duration (pulsewidth) of the chirp signal.

[XSL ERR MINMAX] If PulseChirpDurationMax is used, it MUST be greater than PulseChirpDurationMin.

@return the PulseChirpDurationMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPulseChirpDurationMax() {
        return pulseChirpDurationMax;
    }

/**
Set the maximum duration (pulsewidth) of the chirp signal.

[XSL ERR MINMAX] If PulseChirpDurationMax is used, it MUST be greater than PulseChirpDurationMin.

@param value the PulseChirpDurationMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPulseChirpDurationMax(microsecs value) {
        this.pulseChirpDurationMax = value;
    }

/**
Determine if the PulseChirpDurationMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPulseChirpDurationMax() {
        return (this.pulseChirpDurationMax!= null);
    }

/**
Get the number of time slots.

@return the TimeHopNumSlots value in a {@link TUN5} data type
@since 3.1.0
*/
public UN5 getTimeHopNumSlots() {
        return timeHopNumSlots;
    }

/**
Set the number of time slots.

@param value the TimeHopNumSlots value in a {@link TUN5} data type
@since 3.1.0
*/
public void setTimeHopNumSlots(UN5 value) {
        this.timeHopNumSlots = value;
    }

/**
Determine if the TimeHopNumSlots is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTimeHopNumSlots() {
        return (this.timeHopNumSlots!= null);
    }

/**
Get the number of pulses transmitted during each dwell.

@return the TimeHopPulsesPerDwell value in a {@link TUN12} data type
@since 3.1.0
*/
public UN12 getTimeHopPulsesPerDwell() {
        return timeHopPulsesPerDwell;
    }

/**
Set the number of pulses transmitted during each dwell.

@param value the TimeHopPulsesPerDwell value in a {@link TUN12} data type
@since 3.1.0
*/
public void setTimeHopPulsesPerDwell(UN12 value) {
        this.timeHopPulsesPerDwell = value;
    }

/**
Determine if the TimeHopPulsesPerDwell is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTimeHopPulsesPerDwell() {
        return (this.timeHopPulsesPerDwell!= null);
    }

/**
Get the rate at which the frequency hopping system hops from one frequency to another frequency.

@return the HopRate value in a {@link Thops} data type
@since 3.1.0
*/
public hops getHopRate() {
        return hopRate;
    }

/**
Set the rate at which the frequency hopping system hops from one frequency to another frequency.

@param value the HopRate value in a {@link Thops} data type
@since 3.1.0
*/
public void setHopRate(hops value) {
        this.hopRate = value;
    }

/**
Determine if the HopRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetHopRate() {
        return (this.hopRate!= null);
    }

/**
Get the length of time the frequency hopping system dwells on a frequency.

@return the HopDwell value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getHopDwell() {
        return hopDwell;
    }

/**
Set the length of time the frequency hopping system dwells on a frequency.

@param value the HopDwell value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setHopDwell(microsecs value) {
        this.hopDwell = value;
    }

/**
Determine if the HopDwell is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetHopDwell() {
        return (this.hopDwell!= null);
    }

/**
Get the number of frequencies contained in a hop set.

@return the NumFreqsPerHopset value in a {@link TUN4} data type
@since 3.1.0
*/
public UN4 getNumFreqsPerHopset() {
        return numFreqsPerHopset;
    }

/**
Set the number of frequencies contained in a hop set.

@param value the NumFreqsPerHopset value in a {@link TUN4} data type
@since 3.1.0
*/
public void setNumFreqsPerHopset(UN4 value) {
        this.numFreqsPerHopset = value;
    }

/**
Determine if the NumFreqsPerHopset is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumFreqsPerHopset() {
        return (this.numFreqsPerHopset!= null);
    }

/**
Get the number of frequency hopsets employed when a system uses frequency hopping spread spectrum modulation techniques, including hybrid direct sequence and frequency hopping.

@return the NumHopsets value in a {@link TUN4} data type
@since 3.1.0
*/
public UN4 getNumHopsets() {
        return numHopsets;
    }

/**
Set the number of frequency hopsets employed when a system uses frequency hopping spread spectrum modulation techniques, including hybrid direct sequence and frequency hopping.

@param value the NumHopsets value in a {@link TUN4} data type
@since 3.1.0
*/
public void setNumHopsets(UN4 value) {
        this.numHopsets = value;
    }

/**
Determine if the NumHopsets is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumHopsets() {
        return (this.numHopsets!= null);
    }

/**
Get if the frequency hopping system is capable of blocking certain frequencies.

@return the FreqBlocking value in a {@link TString} data type
@since 3.1.0
*/
public TString getFreqBlocking() {
        return freqBlocking;
    }

/**
Set if the frequency hopping system is capable of blocking certain frequencies.

@param value the FreqBlocking value in a {@link TString} data type
@since 3.1.0
*/
public void setFreqBlocking(TString value) {
        this.freqBlocking = value;
    }

/**
Determine if the FreqBlocking is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqBlocking() {
return (this.freqBlocking!= null ? this.freqBlocking.isSetValue() : false);
    }

/**
Set the type of spread spectrum system being used.

@param value  An instances of type {@link ListCSS}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withType(ListCSS value) {
           setType(new TString(value.value()));
        return this;
    }

/**
Set the nominal frequency or minimum value of the frequency range.

@param value  An instances of type {@link TFreqM}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withFreqMin(TFreqM value) {
        return this;
    }

/**
Set the maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

@param value  An instances of type {@link Double}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withFreqMax(Double value) {
           setFreqMax(new FreqM(value));
        return this;
    }

/**
Set the processing gain.

@param value  An instances of type {@link Double}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withMaxGain(Double value) {
           setMaxGain(new dB(value));
        return this;
    }

/**
Set In Data Item PulseFreqDev, Enter, for FM pulse radars, the total frequency shift during the pulse width.

@param value  An instances of type {@link Double}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withPulseFreqDev(Double value) {
           setPulseFreqDev(new FreqM(value));
        return this;
    }

/**
Set the information data rate.

@param value  An instances of type {@link Double}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withInfoDataRate(Double value) {
           setInfoDataRate(new InfoDataRate(value));
        return this;
    }

/**
Set the maximum generator rate used to encode/decode a Direct Sequence spread spectrum signal.

@param value  An instances of type {@link Double}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withChipRate(Double value) {
           setChipRate(new MChips(value));
        return this;
    }

/**
Set the post encryption number of symbols per bit for a digital data stream. This does not refer to modulation symbols in a format such as quadrature amplitude modulation (QAM).

@param value  An instances of type {@link Double}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withCodeRate(Double value) {
           setCodeRate(new CodeRate(value));
        return this;
    }

/**
Set for linear frequency modulation, the constant rate at which the radio frequency of a pulse is increased throughout the width of the pulse.

@param value  An instances of type {@link Double}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withPulseChirpRate(Double value) {
           setPulseChirpRate(new RFChgRate(value));
        return this;
    }

/**
Set the difference between the starting and stopping frequency of a chirped pulse signal.

@param value  An instances of type {@link Double}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withPulseChirpFreqShift(Double value) {
           setPulseChirpFreqShift(new FreqM(value));
        return this;
    }

/**
Set the duration (pulsewidth) of the chirp signal.

@param value  An instances of type {@link Double}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withPulseChirpDurationMin(Double value) {
           setPulseChirpDurationMin(new microsecs(value));
        return this;
    }

/**
Set the maximum duration (pulsewidth) of the chirp signal.

[XSL ERR MINMAX] If PulseChirpDurationMax is used, it MUST be greater than PulseChirpDurationMin.

@param value  An instances of type {@link Double}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withPulseChirpDurationMax(Double value) {
           setPulseChirpDurationMax(new microsecs(value));
        return this;
    }

/**
Set the number of time slots.

@param value  An instances of type {@link Integer}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withTimeHopNumSlots(Integer value) {
           setTimeHopNumSlots(new UN5(value));
        return this;
    }

/**
Set the number of pulses transmitted during each dwell.

@param value  An instances of type {@link Integer}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withTimeHopPulsesPerDwell(Integer value) {
           setTimeHopPulsesPerDwell(new UN12(value));
        return this;
    }

/**
Set the rate at which the frequency hopping system hops from one frequency to another frequency.

@param value  An instances of type {@link Double}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withHopRate(Double value) {
           setHopRate(new hops(value));
        return this;
    }

/**
Set the length of time the frequency hopping system dwells on a frequency.

@param value  An instances of type {@link Double}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withHopDwell(Double value) {
           setHopDwell(new microsecs(value));
        return this;
    }

/**
Set the number of frequencies contained in a hop set.

@param value  An instances of type {@link Integer}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withNumFreqsPerHopset(Integer value) {
           setNumFreqsPerHopset(new UN4(value));
        return this;
    }

/**
Set the number of frequency hopsets employed when a system uses frequency hopping spread spectrum modulation techniques, including hybrid direct sequence and frequency hopping.

@param value  An instances of type {@link Integer}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withNumHopsets(Integer value) {
           setNumHopsets(new UN4(value));
        return this;
    }

/**
Set if the frequency hopping system is capable of blocking certain frequencies.

@param value  An instances of type {@link ListCBO}
@return The current SpreadSpectrum object instance
@since 3.1.0
*/
    public SpreadSpectrum withFreqBlocking(ListCBO value) {
           setFreqBlocking(new TString(value.value()));
        return this;
    }

/**
 Get a string representation of this SpreadSpectrum instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "SpreadSpectrum {"
 + (chipRate !=null? " chipRate [" + chipRate +"]" : "") 
 + (codeRate !=null? " codeRate [" + codeRate +"]" : "") 
 + (freqBlocking !=null? " freqBlocking [" + freqBlocking +"]" : "") 
 + (freqMax !=null? " freqMax [" + freqMax +"]" : "") 
 + (freqMin !=null? " freqMin [" + freqMin +"]" : "") 
 + (hopDwell !=null? " hopDwell [" + hopDwell +"]" : "") 
 + (hopRate !=null? " hopRate [" + hopRate +"]" : "") 
 + (infoDataRate !=null? " infoDataRate [" + infoDataRate +"]" : "") 
 + (maxGain !=null? " maxGain [" + maxGain +"]" : "") 
 + (numFreqsPerHopset !=null? " numFreqsPerHopset [" + numFreqsPerHopset +"]" : "") 
 + (numHopsets !=null? " numHopsets [" + numHopsets +"]" : "") 
 + (pulseChirpDurationMax !=null? " pulseChirpDurationMax [" + pulseChirpDurationMax +"]" : "") 
 + (pulseChirpDurationMin !=null? " pulseChirpDurationMin [" + pulseChirpDurationMin +"]" : "") 
 + (pulseChirpFreqShift !=null? " pulseChirpFreqShift [" + pulseChirpFreqShift +"]" : "") 
 + (pulseChirpRate !=null? " pulseChirpRate [" + pulseChirpRate +"]" : "") 
 + (pulseFreqDev !=null? " pulseFreqDev [" + pulseFreqDev +"]" : "") 
 + (timeHopNumSlots !=null? " timeHopNumSlots [" + timeHopNumSlots +"]" : "") 
 + (timeHopPulsesPerDwell !=null? " timeHopPulsesPerDwell [" + timeHopPulsesPerDwell +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link SpreadSpectrum} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
