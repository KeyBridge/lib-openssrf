package us.gov.dod.standard.ssrf._3_1.transmitter;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
TxMode and its sub-elements define all the technical parameters for a mode of operation of the Transmitter.

Element of {@link Transmitter}

Sub-Elements are {@link Baseband}, {@link EmsClass}, {@link ObservedMOPAnalysis}, {@link ObservedPulseAnalysis}, {@link ObservedRFAnalysis}, {@link Power}, {@link Pulse}, {@link SpreadSpectrum}, {@link SubcarrierFreq}, {@link TxModulation}, {@link TxSignalTuning}

Example: <pre>
* &lt;TxMode&gt;
*   &lt;BurstDuration  cls="U"&gt;.001&lt;/BurstDuration &gt;
*   &lt;BurstNumPulses  cls="U"&gt;458&lt;/BurstNumPulses &gt;
*   &lt;BurstOffTime  cls="U"&gt;.13&lt;/BurstOffTime &gt;
*   &lt;BurstRate  cls="U"&gt;5984&lt;/BurstRate &gt;
*   &lt;ChannelDwell cls="U"&gt;.2387&lt;/ChannelDwell&gt;
*   &lt;curves cls="U"&gt;34&lt;/curves&gt;
*   &lt;Description  cls="U"&gt;Targets 893 and 569&lt;/Description &gt;
*   &lt;FreqTolerance  cls="U"&gt;.0001&lt;/FreqTolerance &gt;
*   &lt;FreqToleranceUnit cls="U"&gt;ppm&lt;/FreqToleranceUnit&gt;
*   &lt;IntermodulationEffect cls="U"&gt;Friendly receivers performance degraded by 12 percent&lt;/IntermodulationEffect&gt;
*   &lt;IntermodulationPct  cls="U"&gt;17&lt;/IntermodulationPct &gt;
*   &lt;ModeID  cls="U"&gt;Narrowband Pulse&lt;/ModeID &gt;
*   &lt;NecessaryBw  cls="U"&gt;3123.67&lt;/NecessaryBw &gt;
*   &lt;NumSideTones  cls="U"&gt;16&lt;/NumSideTones &gt;
*   &lt;NumSubCarriers  cls="U"&gt;16&lt;/NumSubCarriers &gt;
*   &lt;OccBw cls="U"&gt;3363.67&lt;/OccBw&gt;
*   &lt;OccBwCalculated cls="U"&gt;Yes&lt;/OccBwCalculated&gt;
*   &lt;OtherHarmonicLevel  cls="U"&gt;106&lt;/OtherHarmonicLevel &gt;
*   &lt;RadarType  cls="U"&gt;FM Pulse&lt;/RadarType &gt;
*   &lt;SecondHarmonicLevel  cls="U"&gt;89&lt;/SecondHarmonicLevel &gt;
*   &lt;SpuriousLevel  cls="U"&gt;90&lt;/SpuriousLevel &gt;
*   &lt;ThirdHarmonicLevel  cls="U"&gt;93&lt;/ThirdHarmonicLevel &gt;
*   &lt;Tunability  cls="U"&gt;Fixed+Stepped&lt;/Tunability &gt;
*   &lt;TuningMethod  cls="U"&gt;Synthesizer Microprocessor Controlled&lt;/TuningMethod &gt;
*   &lt;GpsNBL1Level  cls="U"&gt;46.95&lt;/GpsNBL1Level &gt;
*   &lt;GpsNBL2Level  cls="U"&gt;66.98&lt;/GpsNBL2Level &gt;
*   &lt;GpsWBL1Level  cls="U"&gt;12.89&lt;/GpsWBL1Level &gt;
*   &lt;GpsWBL2Level  cls="U"&gt;16.975&lt;/GpsWBL2Level &gt;
*   &lt;JitterCapable cls="U"&gt;Yes&lt;/JitterCapable&gt;
*   &lt;ModeName  cls="U"&gt;Broadband Sweep Jamming&lt;/ModeName &gt;
*   &lt;ModulationType  cls="U"&gt;Pulse&lt;/ModulationType &gt;
* &lt;/TxMode&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxMode", propOrder = {
    "modeID",
    "description",
    "necessaryBw",
    "tunability",
    "tuningMethod",
    "intermodPct",
    "intermodEffect",
    "burstRate",
    "burstDuration",
    "burstNumPulses",
    "burstOffTime",
    "occBw",
    "occBwCalculated",
    "secondHarmonicLevel",
    "thirdHarmonicLevel",
    "otherHarmonicLevel",
    "spuriousLevel",
    "freqTolerance",
    "freqToleranceUnit",
    "radarType",
    "channelDwell",
    "numSubCarriers",
    "numSideTones",
    "gpsNBL1Level",
    "gpsNBL2Level",
    "gpsWBL1Level",
    "gpsWBL2Level",
    "modulationType",
    "modeName",
    "jitterCapable",
    "emsClass",
    "power",
    "txSignalTuning",
    "txModulation",
    "baseband",
    "pulse",
    "subcarrierFreq",
    "spreadSpectrum",
    "observedMOPAnalysis",
    "observedRFAnalysis",
    "observedPulseAnalysis"
})
public class TxMode {

/**
ModeID  - Mode Identifier (Required) 

The unique identifier of a TxMode of the transmitter in this configuration. This mode is from the transmitter specified in the Serial field of the parent TxRef element.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "ModeID", required = true)
      private  S20 modeID;
/**
Description  - Mode Description (Optional) 

A description of the operational mode; this description should be a meaningful explanation of the mode main characteristics.

Format is S100

Attribute group ModeInfo (Required)
@since 3.1.0
*/
    @XmlElement(name = "Description", required = false)
    private S100 description;
/**
NecessaryBw  - Necessary Bandwidth (Optional) 

The necessary bandwidth which is defined as the minimum width of the frequency band sufficient to ensure the transmission of information at the required rate and quality. This is approximately at the -20 dB level on an emission curve.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "NecessaryBw", required = false)
    private FreqM necessaryBw;
/**
Tunability  - Tunability (Optional) 

The tuning capability.

Format is L:CTU

Attribute group Tunability (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Tunability", required = false)
    private TString tunability;
/**
TuningMethod  - Tuning Method (Optional) 

The device or process used to tune the equipment through the RF spectrum.

Format is L:CTN

Attribute group Tunability (Optional)
@since 3.1.0
*/
    @XmlElement(name = "TuningMethod", required = false)
    private TString tuningMethod;

    @XmlElement(name = "IntermodPct", required = false)
    private Percent intermodPct;

    @XmlElement(name = "IntermodEffect", required = false)
    private MEMO intermodEffect;
/**
BurstRate  - Burst Rate (Optional) 

The number of pulse bursts per second.

Format is UN(12,3)

Attribute group Burst (Optional)
@since 3.1.0
*/
    @XmlElement(name = "BurstRate", required = false)
    private BurstRate burstRate;
/**
BurstDuration  - Burst Duration (Optional) 

The pulse burst duration.

Format is UN(12,6) (μsec)

Attribute group Burst (Optional)
@since 3.1.0
*/
    @XmlElement(name = "BurstDuration", required = false)
    private microsecs burstDuration;
/**
BurstNumPulses  - Number of Pulses in Burst (Optional) 

The number of pulses in a single pulse burst.

Format is UN(8)

Attribute group Burst (Optional)
@since 3.1.0
*/
    @XmlElement(name = "BurstNumPulses", required = false)
    private UN8 burstNumPulses;
/**
BurstOffTime  - Burst Off-Time (Optional) 

The pulse burst off time in microseconds (duration of time between the end of one pulse burst to the start of the next pulse burst).

Format is UN(12,6) (μsec)

Attribute group Burst (Optional)
@since 3.1.0
*/
    @XmlElement(name = "BurstOffTime", required = false)
    private microsecs burstOffTime;
/**
OccBw - Occupied Bandwidth (Optional) 

The minimum bandwidth utilized to process 99.5% of the emission spectra.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group OccupiedBw (Optional)
@since 3.1.0
*/
    @XmlElement(name = "OccBw")
      private  FreqM occBw;
/**
OccBwCalculated - Calculated Occupied Bandwidth
Indicator (Optional) 

Yes to indicate that the data was calculated, or "No" if the data is issued from measurement.

Format is L:CBO

Attribute group OccupiedBw (Optional)
@since 3.1.0
*/
    @XmlElement(name = "OccBwCalculated", required = false)
    private TString occBwCalculated;
/**
SecondHarmonicLevel  - Second Harmonic Level (Optional) 

The out-of-band emission level at the frequency that is two times the fundamental frequency. The value is expressed as the power level in decibels relative to the peak output power of the carrier signal.

Format is SN(6,3) (dB)

Attribute group Spurious (Optional)
@since 3.1.0
*/
    @XmlElement(name = "SecondHarmonicLevel", required = false)
    private dB secondHarmonicLevel;
/**
ThirdHarmonicLevel  - Third Harmonic Level (Optional) 

The out-of-band emission level at the frequency that is three times the fundamental frequency. The value is the ratio of the power level to peak output power of the carrier signal.

Format is SN(6,3) (dB)

Attribute group Spurious (Optional)
@since 3.1.0
*/
    @XmlElement(name = "ThirdHarmonicLevel", required = false)
    private dB thirdHarmonicLevel;
/**
OtherHarmonicLevel  - Other Harmonic Level (Optional) 

The greatest out-of-band emission level at harmonic frequencies greater than three times the fundamental frequency. The value is expressed as the power level in decibels relative to the peak output power of the carrier signal.

Format is SN(6,3) (dB)

Attribute group Spurious (Optional)
@since 3.1.0
*/
    @XmlElement(name = "OtherHarmonicLevel", required = false)
    private dB otherHarmonicLevel;
/**
SpuriousLevel  - Spurious Emissions Level (Optional) 

The maximum of all emission levels which occur outside the bandwidth of the fundamental emission and not at a harmonic frequency. The value is expressed as the power level in decibels relative to the peak output power of the carrier signal.

Format is SN(6,3) (dB)

Attribute group Spurious (Optional)
@since 3.1.0
*/
    @XmlElement(name = "SpuriousLevel", required = false)
    private dB spuriousLevel;
/**
FreqTolerance  - Frequency Tolerance (Optional) 

The drift in Hz or in ppm using the formula: Frequency tolerance (ppm) = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm) in FreqToleranceUnit.

Format is UN(18,6)

Attribute group FreqTolerance (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FreqTolerance")
      private  UN18_6 freqTolerance;
/**
FreqToleranceUnit - Frequency Tolerance Unit (Optional) 

The units in which the Frequency Tolerance is expressed.

Format is L:CFO

Attribute group FreqTolerance (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FreqToleranceUnit")
      private  TString freqToleranceUnit;
/**
RadarType  - Radar Modulation Type (Optional) 

The type of radar.

Format is L:CRA
@since 3.1.0
*/
    @XmlElement(name = "RadarType", required = false)
    private TString radarType;
/**
ChannelDwell - Channel Duration (Optional) 

The time the transmitter is on.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "ChannelDwell", required = false)
    private microsecs channelDwell;
/**
NumSubCarriers  - Number of Subcarriers (Optional) 

The number of subcarrier frequencies for the subcarriers modulating the carrier individually.

Format is UN(5)
@since 3.1.0
*/
    @XmlElement(name = "NumSubCarriers", required = false)
    private UN5 numSubCarriers;
/**
NumSideTones  - Number of Side Tones (Optional) 

The number of side tone frequencies for the sidetones modulating the carrier individually.

Format is UN(5)
@since 3.1.0
*/
    @XmlElement(name = "NumSideTones", required = false)
    private UN5 numSideTones;
/**
US:GpsNBL1Level  - GPS NBL1 Level (Optional) 

The narrowband levels emitted by this system in the Navstar Global Positioning System (GPS) 1164-1240 MHz band.

Format is SN(5,3) (dBW)

Attribute group   (Optional)
@since 3.1.0
*/
    @XmlElement(name = "GpsNBL1Level", required = false)
    private US_dBW gpsNBL1Level;
/**
US:GpsNBL2Level  - GPS NBL2 Level (Optional) 

The narrowband levels emitted by this system in the Navstar Global Positioning System (GPS) 1559-1610 MHz band.

Format is SN(5,3) (dBW)

Attribute group   (Optional)
@since 3.1.0
*/
    @XmlElement(name = "GpsNBL2Level", required = false)
    private US_dBW gpsNBL2Level;
/**
US:GpsWBL1Level  - GpsWBL1Level (Optional) 

The wideband levels emitted by this system in the Navstar Global Positioning System (GPS) 1164-1240 MHz band.

Format is SN(9,6) (dBW/Hz)

Attribute group   (Optional)
@since 3.1.0
*/
    @XmlElement(name = "GpsWBL1Level", required = false)
    private US_dBWHz gpsWBL1Level;
/**
US:GpsWBL2Level  - GpsWBL1Level (Optional) 

The wideband levels emitted by this system in the Navstar Global Positioning System (GPS) 1559-1610 MHz band.

Format is SN(9,6) (dBW/Hz)

Attribute group   (Optional)
@since 3.1.0
*/
    @XmlElement(name = "GpsWBL2Level", required = false)
    private US_dBWHz gpsWBL2Level;
/**
US:ModulationType  - Modulation Type (Optional) 

The type of modulation.

Format is L:UMD
@since 3.1.0
*/
    @XmlElement(name = "ModulationType", required = false)
    private TString modulationType;
/**
US:ModeName  - Mode Name (Optional) 

A short name for the mode.

Format is S40
@since 3.1.0
*/
    @XmlElement(name = "ModeName", required = false)
    private S40 modeName;
/**
In Data Item JitterCapable (US), indicate whether the mode of the pulse stream is jitter capable.
@since 3.1.0
*/
    @XmlElement(name = "JitterCapable", required = false)
    private TString jitterCapable;
/**
EmsClass (Optional)

EmsClass identifies the emission classification symbols that define the baseband modulating characteristics of the emission designator. The emission classification consists of the three required symbols and the two optional symbols.
@since 3.1.0
*/
    @XmlElement(name = "EmsClass", nillable = true)
      private  Set<EmsClass> emsClass;
/**
PowerLimit  - Power Limit (Optional) 

The power limit of this transmitter mode when in this configuration.

Format is SN(10,7) (dBW)
@since 3.1.0
*/
    @XmlElement(name = "Power")
      private  Set<Power> power;
/**
TxSignalTuning (Optional)

TxSignalTuning indicates the tuning capabilities, the specific frequency or range of frequencies within which the equipment may tune, and the tuning increments of the equipment.
@since 3.1.0
*/
    @XmlElement(name = "TxSignalTuning")
      private  Set<TxSignalTuning> txSignalTuning;
/**
TxModulation (Optional)

TxModulation contains the detailed characteristics of the modulation on the transmitter side.
@since 3.1.0
*/
    @XmlElement(name = "TxModulation")
      private  Set<TxModulation> txModulation;
/**
Baseband (Optional)

Baseband defines the parameters of the modulating or received signal.
@since 3.1.0
*/
    @XmlElement(name = "Baseband")
      private  Set<Baseband> baseband;
/**
BurstNumPulses  - Number of Pulses in Burst (Optional) 

The number of pulses in a single pulse burst.

Format is UN(8)

Attribute group Burst (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Pulse")
      private  Set<Pulse> pulse;
/**
SubcarrierFreq (Optional)

SubcarrierFreq describes the secondary channel that
@since 3.1.0
*/
    @XmlElement(name = "SubcarrierFreq")
      private  Set<SubcarrierFreq> subcarrierFreq;
/**
Spread Spectrum (Optional)

SpreadSpectrum contains characteristics of systems using spread spectrum techniques.
@since 3.1.0
*/
    @XmlElement(name = "SpreadSpectrum")
      private  SpreadSpectrum spreadSpectrum;
/**
US:ObservedMOPAnalysis (Optional)

ObservedMOPAnalysis (US) contains data describing the characteristic and pattern information for the Modulation impressed On the Pulse (MOP).
@since 3.1.0
*/
    @XmlElement(name = "ObservedMOPAnalysis")
      private  Set<ObservedMOPAnalysis> observedMOPAnalysis;
/**
US:ObservedRFAnalysis (Optional)

ObservedRFAnalysis (US) contains the statisical results of actual RF observations.
@since 3.1.0
*/
    @XmlElement(name = "ObservedRFAnalysis")
      private  Set<ObservedRFAnalysis> observedRFAnalysis;
/**
US:ObservedPulseAnalysis (Optional)

ObservedPulseAnalysis (US) contains data describing the specific characteristics of the pulse group, pulse sequence, and distinct pulse information.
@since 3.1.0
*/
    @XmlElement(name = "ObservedPulseAnalysis")
      private  Set<ObservedPulseAnalysis> observedPulseAnalysis;
/**
curves - Links to Curves (Optional) 

The list of indices referring to Curves applicable to the data item.

Format is List of UN(6)
@since 3.1.0
*/
    @XmlAttribute(name = "curves")
      private  Set<BigInteger> curves;

/**
Get the unique identifier of a TxMode of the transmitter in this configuration. This mode is from the transmitter specified in the Serial field of the parent TxRef element.

@return the ModeID value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getModeID() {
        return modeID;
    }

/**
Set the unique identifier of a TxMode of the transmitter in this configuration. This mode is from the transmitter specified in the Serial field of the parent TxRef element.

@param value the ModeID value in a {@link TS20} data type
@since 3.1.0
*/
public void setModeID(S20 value) {
        this.modeID = value;
    }

/**
Determine if the ModeID is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetModeID() {
        return (this.modeID!= null);
    }

/**
Get a description of the operational mode; this description should be a meaningful explanation of the mode main characteristics.

@return the Description value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getDescription() {
        return description;
    }

/**
Set a description of the operational mode; this description should be a meaningful explanation of the mode main characteristics.

@param value the Description value in a {@link TS100} data type
@since 3.1.0
*/
public void setDescription(S100 value) {
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
Get the necessary bandwidth which is defined as the minimum width of the frequency band sufficient to ensure the transmission of information at the required rate and quality. This is approximately at the -20 dB level on an emission curve.

@return the NecessaryBw value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getNecessaryBw() {
        return necessaryBw;
    }

/**
Set the necessary bandwidth which is defined as the minimum width of the frequency band sufficient to ensure the transmission of information at the required rate and quality. This is approximately at the -20 dB level on an emission curve.

@param value the NecessaryBw value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setNecessaryBw(FreqM value) {
        this.necessaryBw = value;
    }

/**
Determine if the NecessaryBw is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNecessaryBw() {
        return (this.necessaryBw!= null);
    }

/**
Get the tuning capability.

@return the Tunability value in a {@link TString} data type
@since 3.1.0
*/
public TString getTunability() {
        return tunability;
    }

/**
Set the tuning capability.

@param value the Tunability value in a {@link TString} data type
@since 3.1.0
*/
public void setTunability(TString value) {
        this.tunability = value;
    }

/**
Determine if the Tunability is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTunability() {
return (this.tunability!= null ? this.tunability.isSetValue() : false);
    }

/**
Get the device or process used to tune the equipment through the RF spectrum.

@return the TuningMethod value in a {@link TString} data type
@since 3.1.0
*/
public TString getTuningMethod() {
        return tuningMethod;
    }

/**
Set the device or process used to tune the equipment through the RF spectrum.

@param value the TuningMethod value in a {@link TString} data type
@since 3.1.0
*/
public void setTuningMethod(TString value) {
        this.tuningMethod = value;
    }

/**
Determine if the TuningMethod is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTuningMethod() {
return (this.tuningMethod!= null ? this.tuningMethod.isSetValue() : false);
    }

/**
Get 

@return the IntermodPct value in a {@link TPercent} data type
@since 3.1.0
*/
public Percent getIntermodPct() {
        return intermodPct;
    }

/**
Set 

@param value the IntermodPct value in a {@link TPercent} data type
@since 3.1.0
*/
public void setIntermodPct(Percent value) {
        this.intermodPct = value;
    }

/**
Determine if the IntermodPct is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIntermodPct() {
        return (this.intermodPct!= null);
    }

/**
Get 

@return the IntermodEffect value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getIntermodEffect() {
        return intermodEffect;
    }

/**
Set 

@param value the IntermodEffect value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setIntermodEffect(MEMO value) {
        this.intermodEffect = value;
    }

/**
Determine if the IntermodEffect is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIntermodEffect() {
        return (this.intermodEffect!= null);
    }

/**
Get the number of pulse bursts per second.

@return the BurstRate value in a {@link TBurstRate} data type
@since 3.1.0
*/
public BurstRate getBurstRate() {
        return burstRate;
    }

/**
Set the number of pulse bursts per second.

@param value the BurstRate value in a {@link TBurstRate} data type
@since 3.1.0
*/
public void setBurstRate(BurstRate value) {
        this.burstRate = value;
    }

/**
Determine if the BurstRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetBurstRate() {
        return (this.burstRate!= null);
    }

/**
Get the pulse burst duration.

@return the BurstDuration value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getBurstDuration() {
        return burstDuration;
    }

/**
Set the pulse burst duration.

@param value the BurstDuration value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setBurstDuration(microsecs value) {
        this.burstDuration = value;
    }

/**
Determine if the BurstDuration is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetBurstDuration() {
        return (this.burstDuration!= null);
    }

/**
Get the number of pulses in a single pulse burst.

@return the BurstNumPulses value in a {@link TUN8} data type
@since 3.1.0
*/
public UN8 getBurstNumPulses() {
        return burstNumPulses;
    }

/**
Set the number of pulses in a single pulse burst.

@param value the BurstNumPulses value in a {@link TUN8} data type
@since 3.1.0
*/
public void setBurstNumPulses(UN8 value) {
        this.burstNumPulses = value;
    }

/**
Determine if the BurstNumPulses is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetBurstNumPulses() {
        return (this.burstNumPulses!= null);
    }

/**
Get the pulse burst off time in microseconds (duration of time between the end of one pulse burst to the start of the next pulse burst).

@return the BurstOffTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getBurstOffTime() {
        return burstOffTime;
    }

/**
Set the pulse burst off time in microseconds (duration of time between the end of one pulse burst to the start of the next pulse burst).

@param value the BurstOffTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setBurstOffTime(microsecs value) {
        this.burstOffTime = value;
    }

/**
Determine if the BurstOffTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetBurstOffTime() {
        return (this.burstOffTime!= null);
    }

/**
Get the minimum bandwidth utilized to process 99.5% of the emission spectra.

@return the OccBw value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getOccBw() {
        return occBw;
    }

/**
Set the minimum bandwidth utilized to process 99.5% of the emission spectra.

@param value the OccBw value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setOccBw(FreqM value) {
        this.occBw = value;
    }

/**
Determine if the OccBw is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOccBw() {
        return (this.occBw!= null);
    }

/**
Get Yes to indicate that the data was calculated, or "No" if the data is issued from measurement.

@return the OccBwCalculated value in a {@link TString} data type
@since 3.1.0
*/
public TString getOccBwCalculated() {
        return occBwCalculated;
    }

/**
Set Yes to indicate that the data was calculated, or "No" if the data is issued from measurement.

@param value the OccBwCalculated value in a {@link TString} data type
@since 3.1.0
*/
public void setOccBwCalculated(TString value) {
        this.occBwCalculated = value;
    }

/**
Determine if the OccBwCalculated is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOccBwCalculated() {
return (this.occBwCalculated!= null ? this.occBwCalculated.isSetValue() : false);
    }

/**
Get the out-of-band emission level at the frequency that is two times the fundamental frequency. The value is expressed as the power level in decibels relative to the peak output power of the carrier signal.

@return the SecondHarmonicLevel value in a {@link TdB} data type
@since 3.1.0
*/
public dB getSecondHarmonicLevel() {
        return secondHarmonicLevel;
    }

/**
Set the out-of-band emission level at the frequency that is two times the fundamental frequency. The value is expressed as the power level in decibels relative to the peak output power of the carrier signal.

@param value the SecondHarmonicLevel value in a {@link TdB} data type
@since 3.1.0
*/
public void setSecondHarmonicLevel(dB value) {
        this.secondHarmonicLevel = value;
    }

/**
Determine if the SecondHarmonicLevel is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSecondHarmonicLevel() {
        return (this.secondHarmonicLevel!= null);
    }

/**
Get the out-of-band emission level at the frequency that is three times the fundamental frequency. The value is the ratio of the power level to peak output power of the carrier signal.

@return the ThirdHarmonicLevel value in a {@link TdB} data type
@since 3.1.0
*/
public dB getThirdHarmonicLevel() {
        return thirdHarmonicLevel;
    }

/**
Set the out-of-band emission level at the frequency that is three times the fundamental frequency. The value is the ratio of the power level to peak output power of the carrier signal.

@param value the ThirdHarmonicLevel value in a {@link TdB} data type
@since 3.1.0
*/
public void setThirdHarmonicLevel(dB value) {
        this.thirdHarmonicLevel = value;
    }

/**
Determine if the ThirdHarmonicLevel is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetThirdHarmonicLevel() {
        return (this.thirdHarmonicLevel!= null);
    }

/**
Get the greatest out-of-band emission level at harmonic frequencies greater than three times the fundamental frequency. The value is expressed as the power level in decibels relative to the peak output power of the carrier signal.

@return the OtherHarmonicLevel value in a {@link TdB} data type
@since 3.1.0
*/
public dB getOtherHarmonicLevel() {
        return otherHarmonicLevel;
    }

/**
Set the greatest out-of-band emission level at harmonic frequencies greater than three times the fundamental frequency. The value is expressed as the power level in decibels relative to the peak output power of the carrier signal.

@param value the OtherHarmonicLevel value in a {@link TdB} data type
@since 3.1.0
*/
public void setOtherHarmonicLevel(dB value) {
        this.otherHarmonicLevel = value;
    }

/**
Determine if the OtherHarmonicLevel is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOtherHarmonicLevel() {
        return (this.otherHarmonicLevel!= null);
    }

/**
Get the maximum of all emission levels which occur outside the bandwidth of the fundamental emission and not at a harmonic frequency. The value is expressed as the power level in decibels relative to the peak output power of the carrier signal.

@return the SpuriousLevel value in a {@link TdB} data type
@since 3.1.0
*/
public dB getSpuriousLevel() {
        return spuriousLevel;
    }

/**
Set the maximum of all emission levels which occur outside the bandwidth of the fundamental emission and not at a harmonic frequency. The value is expressed as the power level in decibels relative to the peak output power of the carrier signal.

@param value the SpuriousLevel value in a {@link TdB} data type
@since 3.1.0
*/
public void setSpuriousLevel(dB value) {
        this.spuriousLevel = value;
    }

/**
Determine if the SpuriousLevel is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSpuriousLevel() {
        return (this.spuriousLevel!= null);
    }

/**
Get the drift in Hz or in ppm using the formula: Frequency tolerance (ppm) = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm) in FreqToleranceUnit.

@return the FreqTolerance value in a {@link TUN18_6} data type
@since 3.1.0
*/
public UN18_6 getFreqTolerance() {
        return freqTolerance;
    }

/**
Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm) = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm) in FreqToleranceUnit.

@param value the FreqTolerance value in a {@link TUN18_6} data type
@since 3.1.0
*/
public void setFreqTolerance(UN18_6 value) {
        this.freqTolerance = value;
    }

/**
Determine if the FreqTolerance is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqTolerance() {
        return (this.freqTolerance!= null);
    }

/**
Get the units in which the Frequency Tolerance is expressed.

@return the FreqToleranceUnit value in a {@link TString} data type
@since 3.1.0
*/
public TString getFreqToleranceUnit() {
        return freqToleranceUnit;
    }

/**
Set the units in which the Frequency Tolerance is expressed.

@param value the FreqToleranceUnit value in a {@link TString} data type
@since 3.1.0
*/
public void setFreqToleranceUnit(TString value) {
        this.freqToleranceUnit = value;
    }

/**
Determine if the FreqToleranceUnit is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqToleranceUnit() {
return (this.freqToleranceUnit!= null ? this.freqToleranceUnit.isSetValue() : false);
    }

/**
Get the type of radar.

@return the RadarType value in a {@link TString} data type
@since 3.1.0
*/
public TString getRadarType() {
        return radarType;
    }

/**
Set the type of radar.

@param value the RadarType value in a {@link TString} data type
@since 3.1.0
*/
public void setRadarType(TString value) {
        this.radarType = value;
    }

/**
Determine if the RadarType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRadarType() {
return (this.radarType!= null ? this.radarType.isSetValue() : false);
    }

/**
Get the time the transmitter is on.

@return the ChannelDwell value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getChannelDwell() {
        return channelDwell;
    }

/**
Set the time the transmitter is on.

@param value the ChannelDwell value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setChannelDwell(microsecs value) {
        this.channelDwell = value;
    }

/**
Determine if the ChannelDwell is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetChannelDwell() {
        return (this.channelDwell!= null);
    }

/**
Get the number of subcarrier frequencies for the subcarriers modulating the carrier individually.

@return the NumSubCarriers value in a {@link TUN5} data type
@since 3.1.0
*/
public UN5 getNumSubCarriers() {
        return numSubCarriers;
    }

/**
Set the number of subcarrier frequencies for the subcarriers modulating the carrier individually.

@param value the NumSubCarriers value in a {@link TUN5} data type
@since 3.1.0
*/
public void setNumSubCarriers(UN5 value) {
        this.numSubCarriers = value;
    }

/**
Determine if the NumSubCarriers is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumSubCarriers() {
        return (this.numSubCarriers!= null);
    }

/**
Get the number of side tone frequencies for the sidetones modulating the carrier individually.

@return the NumSideTones value in a {@link TUN5} data type
@since 3.1.0
*/
public UN5 getNumSideTones() {
        return numSideTones;
    }

/**
Set the number of side tone frequencies for the sidetones modulating the carrier individually.

@param value the NumSideTones value in a {@link TUN5} data type
@since 3.1.0
*/
public void setNumSideTones(UN5 value) {
        this.numSideTones = value;
    }

/**
Determine if the NumSideTones is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumSideTones() {
        return (this.numSideTones!= null);
    }

/**
Get the narrowband levels emitted by this system in the Navstar Global Positioning System (GPS) 1164-1240 MHz band.

@return the GpsNBL1Level value in a {@link TUS_DBW} data type
@since 3.1.0
*/
public US_dBW getGpsNBL1Level() {
        return gpsNBL1Level;
    }

/**
Set the narrowband levels emitted by this system in the Navstar Global Positioning System (GPS) 1164-1240 MHz band.

@param value the GpsNBL1Level value in a {@link TUS_DBW} data type
@since 3.1.0
*/
public void setGpsNBL1Level(US_dBW value) {
        this.gpsNBL1Level = value;
    }

/**
Determine if the GpsNBL1Level is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetGpsNBL1Level() {
        return (this.gpsNBL1Level!= null);
    }

/**
Get the narrowband levels emitted by this system in the Navstar Global Positioning System (GPS) 1559-1610 MHz band.

@return the GpsNBL2Level value in a {@link TUS_DBW} data type
@since 3.1.0
*/
public US_dBW getGpsNBL2Level() {
        return gpsNBL2Level;
    }

/**
Set the narrowband levels emitted by this system in the Navstar Global Positioning System (GPS) 1559-1610 MHz band.

@param value the GpsNBL2Level value in a {@link TUS_DBW} data type
@since 3.1.0
*/
public void setGpsNBL2Level(US_dBW value) {
        this.gpsNBL2Level = value;
    }

/**
Determine if the GpsNBL2Level is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetGpsNBL2Level() {
        return (this.gpsNBL2Level!= null);
    }

/**
Get the wideband levels emitted by this system in the Navstar Global Positioning System (GPS) 1164-1240 MHz band.

@return the GpsWBL1Level value in a {@link TUS_DBWHz} data type
@since 3.1.0
*/
public US_dBWHz getGpsWBL1Level() {
        return gpsWBL1Level;
    }

/**
Set the wideband levels emitted by this system in the Navstar Global Positioning System (GPS) 1164-1240 MHz band.

@param value the GpsWBL1Level value in a {@link TUS_DBWHz} data type
@since 3.1.0
*/
public void setGpsWBL1Level(US_dBWHz value) {
        this.gpsWBL1Level = value;
    }

/**
Determine if the GpsWBL1Level is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetGpsWBL1Level() {
        return (this.gpsWBL1Level!= null);
    }

/**
Get the wideband levels emitted by this system in the Navstar Global Positioning System (GPS) 1559-1610 MHz band.

@return the GpsWBL2Level value in a {@link TUS_DBWHz} data type
@since 3.1.0
*/
public US_dBWHz getGpsWBL2Level() {
        return gpsWBL2Level;
    }

/**
Set the wideband levels emitted by this system in the Navstar Global Positioning System (GPS) 1559-1610 MHz band.

@param value the GpsWBL2Level value in a {@link TUS_DBWHz} data type
@since 3.1.0
*/
public void setGpsWBL2Level(US_dBWHz value) {
        this.gpsWBL2Level = value;
    }

/**
Determine if the GpsWBL2Level is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetGpsWBL2Level() {
        return (this.gpsWBL2Level!= null);
    }

/**
Get the type of modulation.

@return the ModulationType value in a {@link TString} data type
@since 3.1.0
*/
public TString getModulationType() {
        return modulationType;
    }

/**
Set the type of modulation.

@param value the ModulationType value in a {@link TString} data type
@since 3.1.0
*/
public void setModulationType(TString value) {
        this.modulationType = value;
    }

/**
Determine if the ModulationType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetModulationType() {
return (this.modulationType!= null ? this.modulationType.isSetValue() : false);
    }

/**
Get a short name for the mode.

@return the ModeName value in a {@link TS40} data type
@since 3.1.0
*/
public S40 getModeName() {
        return modeName;
    }

/**
Set a short name for the mode.

@param value the ModeName value in a {@link TS40} data type
@since 3.1.0
*/
public void setModeName(S40 value) {
        this.modeName = value;
    }

/**
Determine if the ModeName is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetModeName() {
        return (this.modeName!= null);
    }

/**
Get In Data Item JitterCapable (US), indicate whether the mode of the pulse stream is jitter capable.

@return the JitterCapable value in a {@link TString} data type
@since 3.1.0
*/
public TString getJitterCapable() {
        return jitterCapable;
    }

/**
Set In Data Item JitterCapable (US), indicate whether the mode of the pulse stream is jitter capable.

@param value the JitterCapable value in a {@link TString} data type
@since 3.1.0
*/
public void setJitterCapable(TString value) {
        this.jitterCapable = value;
    }

/**
Determine if the JitterCapable is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetJitterCapable() {
return (this.jitterCapable!= null ? this.jitterCapable.isSetValue() : false);
    }

/**
Get the EmsClass

Complex element EmsClass identifies the emission classification symbols that define the baseband modulating characteristics of the emission designator. The emission classification consists of the three required symbols and the two optional symbols.

@return  a {@link EmsClass} instance
@since 3.1.0
*/
    public Set<EmsClass> getEmsClass() {
        if (emsClass == null) {
            emsClass = new HashSet<EmsClass>();
        }
        return this.emsClass;
    }

/**
Determine if the EmsClass is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEmsClass() {
        return ((this.emsClass!= null)&&(!this.emsClass.isEmpty()));
    }

/**
  Clear the EmsClass field. This sets the field to null.
 */
    public void unsetEmsClass() {
        this.emsClass = null;
    }

/**
Get the power limit of this transmitter mode when in this configuration.

@return  a {@link Power} instance
@since 3.1.0
*/
    public Set<Power> getPower() {
        if (power == null) {
            power = new HashSet<Power>();
        }
        return this.power;
    }

/**
Determine if the Power is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPower() {
        return ((this.power!= null)&&(!this.power.isEmpty()));
    }

/**
  Clear the Power field. This sets the field to null.
 */
    public void unsetPower() {
        this.power = null;
    }

/**
Get the TxSignalTuning

Complex element TxSignalTuning indicates the tuning capabilities, the specific frequency or range of frequencies within which the equipment may tune, and the tuning increments of the equipment.

@return  a {@link TxSignalTuning} instance
@since 3.1.0
*/
    public Set<TxSignalTuning> getTxSignalTuning() {
        if (txSignalTuning == null) {
            txSignalTuning = new HashSet<TxSignalTuning>();
        }
        return this.txSignalTuning;
    }

/**
Determine if the TxSignalTuning is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTxSignalTuning() {
        return ((this.txSignalTuning!= null)&&(!this.txSignalTuning.isEmpty()));
    }

/**
  Clear the TxSignalTuning field. This sets the field to null.
 */
    public void unsetTxSignalTuning() {
        this.txSignalTuning = null;
    }

/**
Get the TxModulation

Complex element TxModulation contains the detailed characteristics of the modulation on the transmitter side.

@return  a {@link TxModulation} instance
@since 3.1.0
*/
    public Set<TxModulation> getTxModulation() {
        if (txModulation == null) {
            txModulation = new HashSet<TxModulation>();
        }
        return this.txModulation;
    }

/**
Determine if the TxModulation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTxModulation() {
        return ((this.txModulation!= null)&&(!this.txModulation.isEmpty()));
    }

/**
  Clear the TxModulation field. This sets the field to null.
 */
    public void unsetTxModulation() {
        this.txModulation = null;
    }

/**
Get the Baseband

Complex element Baseband defines the parameters of the modulating or received signal.

@return  a {@link Baseband} instance
@since 3.1.0
*/
    public Set<Baseband> getBaseband() {
        if (baseband == null) {
            baseband = new HashSet<Baseband>();
        }
        return this.baseband;
    }

/**
Determine if the Baseband is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetBaseband() {
        return ((this.baseband!= null)&&(!this.baseband.isEmpty()));
    }

/**
  Clear the Baseband field. This sets the field to null.
 */
    public void unsetBaseband() {
        this.baseband = null;
    }

/**
Get the number of pulses in a single pulse burst.

@return  a {@link Pulse} instance
@since 3.1.0
*/
    public Set<Pulse> getPulse() {
        if (pulse == null) {
            pulse = new HashSet<Pulse>();
        }
        return this.pulse;
    }

/**
Determine if the Pulse is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPulse() {
        return ((this.pulse!= null)&&(!this.pulse.isEmpty()));
    }

/**
  Clear the Pulse field. This sets the field to null.
 */
    public void unsetPulse() {
        this.pulse = null;
    }

/**
Get the SubcarrierFreq

Complex element SubcarrierFreq describes the secondary channel that
resides within the main channel (a carrier within a carrier). A type of multiplexing, the subcarrier is a modulated signal at a lower frequency that is combined with the main carrier signal operating at a higher frequency.

@return  a {@link SubcarrierFreq} instance
@since 3.1.0
*/
    public Set<SubcarrierFreq> getSubcarrierFreq() {
        if (subcarrierFreq == null) {
            subcarrierFreq = new HashSet<SubcarrierFreq>();
        }
        return this.subcarrierFreq;
    }

/**
Determine if the SubcarrierFreq is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSubcarrierFreq() {
        return ((this.subcarrierFreq!= null)&&(!this.subcarrierFreq.isEmpty()));
    }

/**
  Clear the SubcarrierFreq field. This sets the field to null.
 */
    public void unsetSubcarrierFreq() {
        this.subcarrierFreq = null;
    }

/**
Get the Spread Spectrum

Complex element SpreadSpectrum contains characteristics of systems using spread spectrum techniques.

@return  a {@link SpreadSpectrum} instance
@since 3.1.0
*/
public SpreadSpectrum getSpreadSpectrum() {
        return spreadSpectrum;
    }

/**
Set the Spread Spectrum

Complex element SpreadSpectrum contains characteristics of systems using spread spectrum techniques.

@param value  a {@link SpreadSpectrum} instance
@since 3.1.0
*/
public void setSpreadSpectrum(SpreadSpectrum value) {
        this.spreadSpectrum = value;
    }

/**
Determine if the SpreadSpectrum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSpreadSpectrum() {
        return (this.spreadSpectrum!= null);
    }

/**
Get the US:ObservedMOPAnalysis

Complex element ObservedMOPAnalysis (US) contains data describing the characteristic and pattern information for the Modulation impressed On the Pulse (MOP).

@return  a {@link ObservedMOPAnalysis} instance
@since 3.1.0
*/
    public Set<ObservedMOPAnalysis> getObservedMOPAnalysis() {
        if (observedMOPAnalysis == null) {
            observedMOPAnalysis = new HashSet<ObservedMOPAnalysis>();
        }
        return this.observedMOPAnalysis;
    }

/**
Determine if the ObservedMOPAnalysis is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetObservedMOPAnalysis() {
        return ((this.observedMOPAnalysis!= null)&&(!this.observedMOPAnalysis.isEmpty()));
    }

/**
  Clear the ObservedMOPAnalysis field. This sets the field to null.
 */
    public void unsetObservedMOPAnalysis() {
        this.observedMOPAnalysis = null;
    }

/**
Get the US:ObservedRFAnalysis

Complex element ObservedRFAnalysis (US) contains the statisical results of actual RF observations.

@return  a {@link ObservedRFAnalysis} instance
@since 3.1.0
*/
    public Set<ObservedRFAnalysis> getObservedRFAnalysis() {
        if (observedRFAnalysis == null) {
            observedRFAnalysis = new HashSet<ObservedRFAnalysis>();
        }
        return this.observedRFAnalysis;
    }

/**
Determine if the ObservedRFAnalysis is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetObservedRFAnalysis() {
        return ((this.observedRFAnalysis!= null)&&(!this.observedRFAnalysis.isEmpty()));
    }

/**
  Clear the ObservedRFAnalysis field. This sets the field to null.
 */
    public void unsetObservedRFAnalysis() {
        this.observedRFAnalysis = null;
    }

/**
Get the US:ObservedPulseAnalysis

Complex element ObservedPulseAnalysis (US) contains data describing the specific characteristics of the pulse group, pulse sequence, and distinct pulse information.

@return  a {@link ObservedPulseAnalysis} instance
@since 3.1.0
*/
    public Set<ObservedPulseAnalysis> getObservedPulseAnalysis() {
        if (observedPulseAnalysis == null) {
            observedPulseAnalysis = new HashSet<ObservedPulseAnalysis>();
        }
        return this.observedPulseAnalysis;
    }

/**
Determine if the ObservedPulseAnalysis is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetObservedPulseAnalysis() {
        return ((this.observedPulseAnalysis!= null)&&(!this.observedPulseAnalysis.isEmpty()));
    }

/**
  Clear the ObservedPulseAnalysis field. This sets the field to null.
 */
    public void unsetObservedPulseAnalysis() {
        this.observedPulseAnalysis = null;
    }

/**
Get the list of indices referring to Curves applicable to the data item.

@return  a {@link BigInteger} instance
@since 3.1.0
*/
    public Set<BigInteger> getCurves() {
        if (curves == null) {
            curves = new HashSet<BigInteger>();
        }
        return this.curves;
    }

/**
Determine if the Curves is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCurves() {
        return ((this.curves!= null)&&(!this.curves.isEmpty()));
    }

/**
  Clear the Curves field. This sets the field to null.
 */
    public void unsetCurves() {
        this.curves = null;
    }

/**
Set the unique identifier of a TxMode of the transmitter in this configuration. This mode is from the transmitter specified in the Serial field of the parent TxRef element.

@param value  An instances of type {@link TS20}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withModeID(TS20 value) {
        return this;
    }

/**
Set a description of the operational mode; this description should be a meaningful explanation of the mode main characteristics.

@param value  An instances of type {@link String}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withDescription(String value) {
           setDescription(new S100(value));
        return this;
    }

/**
Set the necessary bandwidth which is defined as the minimum width of the frequency band sufficient to ensure the transmission of information at the required rate and quality. This is approximately at the -20 dB level on an emission curve.

@param value  An instances of type {@link Double}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withNecessaryBw(Double value) {
           setNecessaryBw(new FreqM(value));
        return this;
    }

/**
Set the tuning capability.

@param value  An instances of type {@link ListCTU}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withTunability(ListCTU value) {
           setTunability(new TString(value.value()));
        return this;
    }

/**
Set the device or process used to tune the equipment through the RF spectrum.

@param value  An instances of type {@link ListCTN}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withTuningMethod(ListCTN value) {
           setTuningMethod(new TString(value.value()));
        return this;
    }

/**
Set 

@param value  An instances of type {@link Double}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withIntermodPct(Double value) {
           setIntermodPct(new Percent(value));
        return this;
    }

/**
Set 

@param value  An instances of type {@link String}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withIntermodEffect(String value) {
           setIntermodEffect(new MEMO(value));
        return this;
    }

/**
Set the number of pulse bursts per second.

@param value  An instances of type {@link Double}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withBurstRate(Double value) {
           setBurstRate(new BurstRate(value));
        return this;
    }

/**
Set the pulse burst duration.

@param value  An instances of type {@link Double}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withBurstDuration(Double value) {
           setBurstDuration(new microsecs(value));
        return this;
    }

/**
Set the number of pulses in a single pulse burst.

@param value  An instances of type {@link Integer}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withBurstNumPulses(Integer value) {
           setBurstNumPulses(new UN8(value));
        return this;
    }

/**
Set the pulse burst off time in microseconds (duration of time between the end of one pulse burst to the start of the next pulse burst).

@param value  An instances of type {@link Double}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withBurstOffTime(Double value) {
           setBurstOffTime(new microsecs(value));
        return this;
    }

/**
Set the minimum bandwidth utilized to process 99.5% of the emission spectra.

@param value  An instances of type {@link TFreqM}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withOccBw(TFreqM value) {
        return this;
    }

/**
Set Yes to indicate that the data was calculated, or "No" if the data is issued from measurement.

@param value  An instances of type {@link ListCBO}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withOccBwCalculated(ListCBO value) {
           setOccBwCalculated(new TString(value.value()));
        return this;
    }

/**
Set the out-of-band emission level at the frequency that is two times the fundamental frequency. The value is expressed as the power level in decibels relative to the peak output power of the carrier signal.

@param value  An instances of type {@link Double}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withSecondHarmonicLevel(Double value) {
           setSecondHarmonicLevel(new dB(value));
        return this;
    }

/**
Set the out-of-band emission level at the frequency that is three times the fundamental frequency. The value is the ratio of the power level to peak output power of the carrier signal.

@param value  An instances of type {@link Double}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withThirdHarmonicLevel(Double value) {
           setThirdHarmonicLevel(new dB(value));
        return this;
    }

/**
Set the greatest out-of-band emission level at harmonic frequencies greater than three times the fundamental frequency. The value is expressed as the power level in decibels relative to the peak output power of the carrier signal.

@param value  An instances of type {@link Double}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withOtherHarmonicLevel(Double value) {
           setOtherHarmonicLevel(new dB(value));
        return this;
    }

/**
Set the maximum of all emission levels which occur outside the bandwidth of the fundamental emission and not at a harmonic frequency. The value is expressed as the power level in decibels relative to the peak output power of the carrier signal.

@param value  An instances of type {@link Double}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withSpuriousLevel(Double value) {
           setSpuriousLevel(new dB(value));
        return this;
    }

/**
Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm) = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm) in FreqToleranceUnit.

@param value  An instances of type {@link TUN18_6}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withFreqTolerance(TUN18_6 value) {
        return this;
    }

/**
Set the units in which the Frequency Tolerance is expressed.

@param value  An instances of type {@link ListCFO}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withFreqToleranceUnit(ListCFO value) {
        setFreqToleranceUnit(new TString(value.value()));
        return this;
    }

/**
Set the type of radar.

@param value  An instances of type {@link ListCRA}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withRadarType(ListCRA value) {
           setRadarType(new TString(value.value()));
        return this;
    }

/**
Set the time the transmitter is on.

@param value  An instances of type {@link Double}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withChannelDwell(Double value) {
           setChannelDwell(new microsecs(value));
        return this;
    }

/**
Set the number of subcarrier frequencies for the subcarriers modulating the carrier individually.

@param value  An instances of type {@link Integer}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withNumSubCarriers(Integer value) {
           setNumSubCarriers(new UN5(value));
        return this;
    }

/**
Set the number of side tone frequencies for the sidetones modulating the carrier individually.

@param value  An instances of type {@link Integer}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withNumSideTones(Integer value) {
           setNumSideTones(new UN5(value));
        return this;
    }

/**
Set the narrowband levels emitted by this system in the Navstar Global Positioning System (GPS) 1164-1240 MHz band.

@param value  An instances of type {@link Double}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withGpsNBL1Level(Double value) {
           setGpsNBL1Level(new US_dBW(value));
        return this;
    }

/**
Set the narrowband levels emitted by this system in the Navstar Global Positioning System (GPS) 1559-1610 MHz band.

@param value  An instances of type {@link Double}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withGpsNBL2Level(Double value) {
           setGpsNBL2Level(new US_dBW(value));
        return this;
    }

/**
Set the wideband levels emitted by this system in the Navstar Global Positioning System (GPS) 1164-1240 MHz band.

@param value  An instances of type {@link Double}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withGpsWBL1Level(Double value) {
           setGpsWBL1Level(new US_dBWHz(value));
        return this;
    }

/**
Set the wideband levels emitted by this system in the Navstar Global Positioning System (GPS) 1559-1610 MHz band.

@param value  An instances of type {@link Double}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withGpsWBL2Level(Double value) {
           setGpsWBL2Level(new US_dBWHz(value));
        return this;
    }

/**
Set the type of modulation.

@param value  An instances of type {@link ListUMD}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withModulationType(ListUMD value) {
           setModulationType(new TString(value.value()));
        return this;
    }

/**
Set a short name for the mode.

@param value  An instances of type {@link String}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withModeName(String value) {
           setModeName(new S40(value));
        return this;
    }

/**
Set In Data Item JitterCapable (US), indicate whether the mode of the pulse stream is jitter capable.

@param value  An instances of type {@link ListCBO}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withJitterCapable(ListCBO value) {
           setJitterCapable(new TString(value.value()));
        return this;
    }

/**
Set the EmsClass

Complex element EmsClass identifies the emission classification symbols that define the baseband modulating characteristics of the emission designator. The emission classification consists of the three required symbols and the two optional symbols.

@param values  One or more instances of type {@link EmsClass...}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withEmsClass(EmsClass... values) {
        if (values!= null) {
            for (EmsClass value: values) {
                getEmsClass().add(value);
            }
        }
        return this;
    }

/**
Set the EmsClass

Complex element EmsClass identifies the emission classification symbols that define the baseband modulating characteristics of the emission designator. The emission classification consists of the three required symbols and the two optional symbols.

@param values  A collection of {@link EmsClass} instances
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withEmsClass(Collection<EmsClass> values) {
        if (values!= null) {
            getEmsClass().addAll(values);
        }
        return this;
    }

/**
Set the power limit of this transmitter mode when in this configuration.

@param values  One or more instances of type {@link Power...}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withPower(Power... values) {
        if (values!= null) {
            for (Power value: values) {
                getPower().add(value);
            }
        }
        return this;
    }

/**
Set the power limit of this transmitter mode when in this configuration.

@param values  A collection of {@link Power} instances
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withPower(Collection<Power> values) {
        if (values!= null) {
            getPower().addAll(values);
        }
        return this;
    }

/**
Set the TxSignalTuning

Complex element TxSignalTuning indicates the tuning capabilities, the specific frequency or range of frequencies within which the equipment may tune, and the tuning increments of the equipment.

@param values  One or more instances of type {@link TxSignalTuning...}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withTxSignalTuning(TxSignalTuning... values) {
        if (values!= null) {
            for (TxSignalTuning value: values) {
                getTxSignalTuning().add(value);
            }
        }
        return this;
    }

/**
Set the TxSignalTuning

Complex element TxSignalTuning indicates the tuning capabilities, the specific frequency or range of frequencies within which the equipment may tune, and the tuning increments of the equipment.

@param values  A collection of {@link TxSignalTuning} instances
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withTxSignalTuning(Collection<TxSignalTuning> values) {
        if (values!= null) {
            getTxSignalTuning().addAll(values);
        }
        return this;
    }

/**
Set the TxModulation

Complex element TxModulation contains the detailed characteristics of the modulation on the transmitter side.

@param values  One or more instances of type {@link TxModulation...}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withTxModulation(TxModulation... values) {
        if (values!= null) {
            for (TxModulation value: values) {
                getTxModulation().add(value);
            }
        }
        return this;
    }

/**
Set the TxModulation

Complex element TxModulation contains the detailed characteristics of the modulation on the transmitter side.

@param values  A collection of {@link TxModulation} instances
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withTxModulation(Collection<TxModulation> values) {
        if (values!= null) {
            getTxModulation().addAll(values);
        }
        return this;
    }

/**
Set the Baseband

Complex element Baseband defines the parameters of the modulating or received signal.

@param values  One or more instances of type {@link Baseband...}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withBaseband(Baseband... values) {
        if (values!= null) {
            for (Baseband value: values) {
                getBaseband().add(value);
            }
        }
        return this;
    }

/**
Set the Baseband

Complex element Baseband defines the parameters of the modulating or received signal.

@param values  A collection of {@link Baseband} instances
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withBaseband(Collection<Baseband> values) {
        if (values!= null) {
            getBaseband().addAll(values);
        }
        return this;
    }

/**
Set the number of pulses in a single pulse burst.

@param values  One or more instances of type {@link Pulse...}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withPulse(Pulse... values) {
        if (values!= null) {
            for (Pulse value: values) {
                getPulse().add(value);
            }
        }
        return this;
    }

/**
Set the number of pulses in a single pulse burst.

@param values  A collection of {@link Pulse} instances
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withPulse(Collection<Pulse> values) {
        if (values!= null) {
            getPulse().addAll(values);
        }
        return this;
    }

/**
Set the SubcarrierFreq

Complex element SubcarrierFreq describes the secondary channel that
resides within the main channel (a carrier within a carrier). A type of multiplexing, the subcarrier is a modulated signal at a lower frequency that is combined with the main carrier signal operating at a higher frequency.

@param values  One or more instances of type {@link SubcarrierFreq...}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withSubcarrierFreq(SubcarrierFreq... values) {
        if (values!= null) {
            for (SubcarrierFreq value: values) {
                getSubcarrierFreq().add(value);
            }
        }
        return this;
    }

/**
Set the SubcarrierFreq

Complex element SubcarrierFreq describes the secondary channel that
resides within the main channel (a carrier within a carrier). A type of multiplexing, the subcarrier is a modulated signal at a lower frequency that is combined with the main carrier signal operating at a higher frequency.

@param values  A collection of {@link SubcarrierFreq} instances
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withSubcarrierFreq(Collection<SubcarrierFreq> values) {
        if (values!= null) {
            getSubcarrierFreq().addAll(values);
        }
        return this;
    }

/**
Set the Spread Spectrum

Complex element SpreadSpectrum contains characteristics of systems using spread spectrum techniques.

@param value  An instances of type {@link SpreadSpectrum}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withSpreadSpectrum(SpreadSpectrum value) {
        return this;
    }

/**
Set the US:ObservedMOPAnalysis

Complex element ObservedMOPAnalysis (US) contains data describing the characteristic and pattern information for the Modulation impressed On the Pulse (MOP).

@param values  One or more instances of type {@link ObservedMOPAnalysis...}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withObservedMOPAnalysis(ObservedMOPAnalysis... values) {
        if (values!= null) {
            for (ObservedMOPAnalysis value: values) {
                getObservedMOPAnalysis().add(value);
            }
        }
        return this;
    }

/**
Set the US:ObservedMOPAnalysis

Complex element ObservedMOPAnalysis (US) contains data describing the characteristic and pattern information for the Modulation impressed On the Pulse (MOP).

@param values  A collection of {@link ObservedMOPAnalysis} instances
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withObservedMOPAnalysis(Collection<ObservedMOPAnalysis> values) {
        if (values!= null) {
            getObservedMOPAnalysis().addAll(values);
        }
        return this;
    }

/**
Set the US:ObservedRFAnalysis

Complex element ObservedRFAnalysis (US) contains the statisical results of actual RF observations.

@param values  One or more instances of type {@link ObservedRFAnalysis...}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withObservedRFAnalysis(ObservedRFAnalysis... values) {
        if (values!= null) {
            for (ObservedRFAnalysis value: values) {
                getObservedRFAnalysis().add(value);
            }
        }
        return this;
    }

/**
Set the US:ObservedRFAnalysis

Complex element ObservedRFAnalysis (US) contains the statisical results of actual RF observations.

@param values  A collection of {@link ObservedRFAnalysis} instances
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withObservedRFAnalysis(Collection<ObservedRFAnalysis> values) {
        if (values!= null) {
            getObservedRFAnalysis().addAll(values);
        }
        return this;
    }

/**
Set the US:ObservedPulseAnalysis

Complex element ObservedPulseAnalysis (US) contains data describing the specific characteristics of the pulse group, pulse sequence, and distinct pulse information.

@param values  One or more instances of type {@link ObservedPulseAnalysis...}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withObservedPulseAnalysis(ObservedPulseAnalysis... values) {
        if (values!= null) {
            for (ObservedPulseAnalysis value: values) {
                getObservedPulseAnalysis().add(value);
            }
        }
        return this;
    }

/**
Set the US:ObservedPulseAnalysis

Complex element ObservedPulseAnalysis (US) contains data describing the specific characteristics of the pulse group, pulse sequence, and distinct pulse information.

@param values  A collection of {@link ObservedPulseAnalysis} instances
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withObservedPulseAnalysis(Collection<ObservedPulseAnalysis> values) {
        if (values!= null) {
            getObservedPulseAnalysis().addAll(values);
        }
        return this;
    }

/**
Set the list of indices referring to Curves applicable to the data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withCurves(BigInteger... values) {
        if (values!= null) {
            for (BigInteger value: values) {
                getCurves().add(value);
            }
        }
        return this;
    }

/**
Set the list of indices referring to Curves applicable to the data item.

@param values  A collection of {@link Curves} instances
@return The current TxMode object instance
@since 3.1.0
*/
    public TxMode withCurves(Collection<BigInteger> values) {
        if (values!= null) {
            getCurves().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this TxMode instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "TxMode {"
 + (baseband !=null? " baseband [" + baseband +"]" : "") 
 + (burstDuration !=null? " burstDuration [" + burstDuration +"]" : "") 
 + (burstNumPulses !=null? " burstNumPulses [" + burstNumPulses +"]" : "") 
 + (burstOffTime !=null? " burstOffTime [" + burstOffTime +"]" : "") 
 + (burstRate !=null? " burstRate [" + burstRate +"]" : "") 
 + (channelDwell !=null? " channelDwell [" + channelDwell +"]" : "") 
 + (curves !=null? " curves [" + curves +"]" : "") 
 + (description !=null? " description [" + description +"]" : "") 
 + (emsClass !=null? " emsClass [" + emsClass +"]" : "") 
 + (freqTolerance !=null? " freqTolerance [" + freqTolerance +"]" : "") 
 + (freqToleranceUnit !=null? " freqToleranceUnit [" + freqToleranceUnit +"]" : "") 
 + (gpsNBL1Level !=null? " gpsNBL1Level [" + gpsNBL1Level +"]" : "") 
 + (gpsNBL2Level !=null? " gpsNBL2Level [" + gpsNBL2Level +"]" : "") 
 + (gpsWBL1Level !=null? " gpsWBL1Level [" + gpsWBL1Level +"]" : "") 
 + (gpsWBL2Level !=null? " gpsWBL2Level [" + gpsWBL2Level +"]" : "") 
 + (intermodEffect !=null? " intermodEffect [" + intermodEffect +"]" : "") 
 + (intermodPct !=null? " intermodPct [" + intermodPct +"]" : "") 
 + (jitterCapable !=null? " jitterCapable [" + jitterCapable +"]" : "") 
 + (modeID !=null? " modeID [" + modeID +"]" : "") 
 + (modeName !=null? " modeName [" + modeName +"]" : "") 
 + (modulationType !=null? " modulationType [" + modulationType +"]" : "") 
 + (necessaryBw !=null? " necessaryBw [" + necessaryBw +"]" : "") 
 + (numSideTones !=null? " numSideTones [" + numSideTones +"]" : "") 
 + (numSubCarriers !=null? " numSubCarriers [" + numSubCarriers +"]" : "") 
 + (observedMOPAnalysis !=null? " observedMOPAnalysis [" + observedMOPAnalysis +"]" : "") 
 + (observedPulseAnalysis !=null? " observedPulseAnalysis [" + observedPulseAnalysis +"]" : "") 
 + (observedRFAnalysis !=null? " observedRFAnalysis [" + observedRFAnalysis +"]" : "") 
 + (occBw !=null? " occBw [" + occBw +"]" : "") 
 + (occBwCalculated !=null? " occBwCalculated [" + occBwCalculated +"]" : "") 
 + (otherHarmonicLevel !=null? " otherHarmonicLevel [" + otherHarmonicLevel +"]" : "") 
 + (power !=null? " power [" + power +"]" : "") 
 + (pulse !=null? " pulse [" + pulse +"]" : "") 
 + (radarType !=null? " radarType [" + radarType +"]" : "") 
 + (secondHarmonicLevel !=null? " secondHarmonicLevel [" + secondHarmonicLevel +"]" : "") 
 + (spreadSpectrum !=null? " spreadSpectrum [" + spreadSpectrum +"]" : "") 
 + (spuriousLevel !=null? " spuriousLevel [" + spuriousLevel +"]" : "") 
 + (subcarrierFreq !=null? " subcarrierFreq [" + subcarrierFreq +"]" : "") 
 + (thirdHarmonicLevel !=null? " thirdHarmonicLevel [" + thirdHarmonicLevel +"]" : "") 
 + (tunability !=null? " tunability [" + tunability +"]" : "") 
 + (tuningMethod !=null? " tuningMethod [" + tuningMethod +"]" : "") 
 + (txModulation !=null? " txModulation [" + txModulation +"]" : "") 
 + (txSignalTuning !=null? " txSignalTuning [" + txSignalTuning +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link TxMode} requires {@link S20 ModeID}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetModeID();
}

}
