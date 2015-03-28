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
ObservedRFAnalysis (US) contains the statisical results of actual RF observations.

Element of {@link TxMode}

Sub-Element is {@link ObservedRFValues}

Example: <pre>
* &lt;ObservedRFAnalysis&gt;
*   &lt;ChipRate cls="U"&gt;346&lt;/ChipRate&gt;
*   &lt;DwellTime cls="U"&gt;78.98&lt;/DwellTime&gt;
*   &lt;FreqMax cls="U"&gt;3107.56&lt;/FreqMax&gt;
*   &lt;FreqMin cls="U"&gt;2999.753&lt;/FreqMin&gt;
*   &lt;GuardBand cls="U"&gt;2986&lt;/GuardBand&gt;
*   &lt;InstantRFBW03 cls="U"&gt;24.79&lt;/InstantRFBW03&gt;
*   &lt;InstantRFBW06 cls="U"&gt;45.64&lt;/InstantRFBW06&gt;
*   &lt;InstantRFBW10 cls="U"&gt;56.83&lt;/InstantRFBW10&gt;
*   &lt;InstantRFBW20 cls="U"&gt;99.76&lt;/InstantRFBW20&gt;
*   &lt;NumRFChannels cls="U"&gt;300&lt;/NumRFChannels&gt;
*   &lt;NumRFElements cls="U"&gt;355&lt;/NumRFElements&gt;
*   &lt;NumRFPositions cls="U"&gt;890&lt;/NumRFPositions&gt;
*   &lt;NumRFSimultaneous cls="U"&gt;248&lt;/NumRFSimultaneous&gt;
*   &lt;OperationalRFBW cls="U"&gt;87.9&lt;/OperationalRFBW&gt;
*   &lt;RFAdaptiveDriver cls="U"&gt;Target Motion Tracking&lt;/RFAdaptiveDriver&gt;
*   &lt;RFAdaptiveRule cls="U"&gt;Required Pattern Collection&lt;/RFAdaptiveRule&gt;
*   &lt;RFBasicClockPeriod cls="U"&gt;0.0001&lt;/RFBasicClockPeriod&gt;
*   &lt;RFChangeRate cls="U"&gt;84&lt;/RFChangeRate&gt;
*   &lt;RFChannelFreqMax cls="U"&gt;3107.56&lt;/RFChannelFreqMax&gt;
*   &lt;RFChannelFreqMin cls="U"&gt;2999.753&lt;/RFChannelFreqMin&gt;
*   &lt;RFCoherent cls="U"&gt;Non-Coherent&lt;/RFCoherent&gt;
*   &lt;RFContinuous cls="U"&gt;Yes&lt;/RFContinuous&gt;
*   &lt;RFFreqMax cls="U"&gt;3107.56&lt;/RFFreqMax&gt;
*   &lt;RFFreqMin cls="U"&gt;2999.753&lt;/RFFreqMin&gt;
*   &lt;RFMean cls="U"&gt;3094.56&lt;/RFMean&gt;
*   &lt;RFMedian cls="U"&gt;3097.54&lt;/RFMedian&gt;
*   &lt;RFPatternPeriod cls="U"&gt;0.001&lt;/RFPatternPeriod&gt;
*   &lt;RFPatternType cls="U"&gt;Non-Patterned&lt;/RFPatternType&gt;
*   &lt;RFRestFreq cls="U"&gt;3000.54&lt;/RFRestFreq&gt;
*   &lt;RFSequenceDesc cls="U"&gt;Required Pattern Collection set A35&lt;/RFSequenceDesc&gt;
*   &lt;RFSlotDuration cls="U"&gt;12.45&lt;/RFSlotDuration&gt;
*   &lt;RFStability cls="U"&gt;ppm&lt;/RFStability&gt;
*   &lt;RFStability cls="U"&gt;ppm&lt;/RFStability&gt;
*   &lt;RFStabilityInterval cls="U"&gt;.00034&lt;/RFStabilityInterval&gt;
*   &lt;RFStandardDeviation cls="U"&gt;.00023&lt;/RFStandardDeviation&gt;
*   &lt;RFTuningStep cls="U"&gt;0.025&lt;/RFTuningStep&gt;
*   &lt;TuningStep cls="U"&gt;0.025&lt;/TuningStep&gt;
*   &lt;ObservedRFValues&gt;
*     &lt;RFValue cls="U"&gt;3000&lt;/RFValue&gt;
*     &lt;StatisticalIndicator cls="U"&gt;97.2&lt;/StatisticalIndicator&gt;
*   &lt;/ObservedRFValues&gt;
* &lt;/ObservedRFAnalysis&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedRFAnalysis", propOrder = {
    "chipRate",
    "dwellTime",
    "freqMax",
    "freqMin",
    "guardBand",
    "instantRFBW03",
    "instantRFBW06",
    "instantRFBW10",
    "instantRFBW20",
    "numRFChannels",
    "numRFElements",
    "numRFPositions",
    "numRFSimultaneous",
    "operationalRFBW",
    "rfAdaptiveDriver",
    "rfAdaptiveRule",
    "rfBasicClockPeriod",
    "rfChangeRate",
    "rfChannelFreqMax",
    "rfChannelFreqMin",
    "rfCoherent",
    "rfContinuous",
    "rfFreqMax",
    "rfFreqMin",
    "rfMean",
    "rfMedian",
    "rfPatternPeriod",
    "rfPatternType",
    "rfRestFreq",
    "rfSequenceDesc",
    "rfSlotDuration",
    "rfFreqTolerance",
    "rfFreqToleranceUnit",
    "rfFreqToleranceInterval",
    "rfStandardDeviation",
    "rfTuningStep",
    "tuningStep",
    "observedRFValues"
})
public class ObservedRFAnalysis {

/**
US:ChipRate - Chip Rate (Optional) 

The chip rate. Pertains mostly to spread spectrum.

Format is UN(16,9) (MChip/s)
@since 3.1.0
*/
    @XmlElement(name = "ChipRate", required = false)
    private MChips chipRate;
/**
US:DwellTime - Dwell Time (Optional) 

The dwell time at any RF when the RF dwells at particular values for more than one pulse in a row.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "DwellTime", required = false)
    private microsecs dwellTime;
/**
US:FreqMax -  Maximum Frequency (Optional) 

The upper end of the range of RF values that represent 100% of observed signals.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "FreqMax", required = false)
    private FreqM freqMax;
/**
US:FreqMin -  Minimum Frequency (Optional) 

The lower end of the range of RF values that represent 100% of observed signals.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "FreqMin", required = false)
    private FreqM freqMin;
/**
US:GuardBand - Guard Band (Optional) 

The RF band between carriers which is not used. Pertains mostly to spread spectrum.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "GuardBand", required = false)
    private FreqM guardBand;
/**
US:InstantRFBW03 - Instant RF BW 03 (Optional) 

The transmitter pulse bandwidth (burst or instantaneous) measured at the 3 dB points (min)

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "InstantRFBW03", required = false)
    private FreqM instantRFBW03;
/**
US:InstantRFBW06 - Instant RF BW 06 (Optional) 

The transmitter pulse bandwidth (burst or instantaneous) measured at the 6 dB points (min)

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "InstantRFBW06", required = false)
    private FreqM instantRFBW06;
/**
US:InstantRFBW10 - Instant RF BW 10 (Optional) 

The transmitter pulse bandwidth (burst or instantaneous) measured at the 10 dB points (min)

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "InstantRFBW10", required = false)
    private FreqM instantRFBW10;
/**
US:InstantRFBW20 - Instant RF BW 20 (Optional) 

The transmitter pulse bandwidth (burst or instantaneous) measured at the 20 dB points (min)

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "InstantRFBW20", required = false)
    private FreqM instantRFBW20;
/**
US:NumRFChannels - Num RF Channels (Optional) 

The number of channels into which the RF range of the emitter is divided.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumRFChannels", required = false)
    private UN6 numRFChannels;
/**
US:NumRFElements - Num RF Elements (Optional) 

The number of discrete RFs (channels) a multiple RF signal contains.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumRFElements", required = false)
    private UN6 numRFElements;
/**
US:NumRFPositions - Num RF Positions (Optional) 

The number of RF values in a signal RF sequence before it repeats.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumRFPositions", required = false)
    private UN6 numRFPositions;
/**
US:NumRFSimultaneous - Num RF Simultaneous (Optional) 

The number of frequencies simultaneously used by the emitter.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumRFSimultaneous", required = false)
    private UN6 numRFSimultaneous;
/**
US:OperationalRFBW - Operational RF Bandwidth (Optional) 

The delta (aka. separation) from the signals lowest-min RF value to its highest-max RF value; only pertains to signals which have RF changes between pulses or groups of pulses (aka. RF agile signals) or signals which use a changing RF continuous waveform (CW); e.g., a CW signal with a sweeping RF. 

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "OperationalRFBW", required = false)
    private FreqM operationalRFBW;
/**
US:RFAdaptiveDriver - RF Adaptive Driver (Optional) 

The condition controlling the choice of RF for Adaptive RF variations (e.g., least jammed frequency)

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "RFAdaptiveDriver", required = false)
    private S500 rfAdaptiveDriver;
/**
In Data Item RFAdaptiveRule (US), indicate how the RF is chosen for Adaptive RF variations.
@since 3.1.0
*/
    @XmlElement(name = "RFAdaptiveRule", required = false)
    private S500 rfAdaptiveRule;
/**
US:RFBasicClockPeriod - RF Basic Clock Period (Optional) 

The frequency divisor common to all RF separations (not necessarily to all RF) RF crystal is not always the same as the RF channelization (min).

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "RFBasicClockPeriod", required = false)
    private FreqM rfBasicClockPeriod;
/**
US:RFChangeRate - RF Change Rate (Optional) 

The RF change per unit of time, measured over a significant portion of the waveform. Applies to Continuous RF variations.

Format is UN(16,9) (MHz/sec)
@since 3.1.0
*/
    @XmlElement(name = "RFChangeRate", required = false)
    private RFChgRate rfChangeRate;
/**
US:RFChannelFreqMax - Maximum RF Channel Frequency (Optional) 

The maximum RF channel values.

[XSL ERR MINMAX] If US:RFChannelFreqMax is used, it MUST be greater than US:RFChannelFreqMin.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "RFChannelFreqMax", required = false)
    private FreqM rfChannelFreqMax;
/**
US:RFChannelFreqMin - RF Channel Freq Min (Optional) 

The minimum RF channel values.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "RFChannelFreqMin", required = false)
    private FreqM rfChannelFreqMin;
/**
In Data Item RFCoherent (US), indicate if the observed RF signal is coherent, non-coherent, or unknown.
@since 3.1.0
*/
    @XmlElement(name = "RFCoherent", required = false)
    private TString rfCoherent;
/**
US:RFContinuous - Continuous RF Signal (Optional) 

Whether pulse-to-pulse RF variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "RFContinuous", required = false)
    private TString rfContinuous;
/**
US:RFFreqMax - Maximum RF Frequency (Optional) 

The typical highest RF value observed on a single intercept.

[XSL ERR MINMAX] If US:RFFreqMax is used, it MUST be greater than US:RFFreqMin.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "RFFreqMax", required = false)
    private FreqM rfFreqMax;
/**
US:RFFreqMin - Minimum RF Frequency (Optional) 

The typical lowest RF value observed on a single intercept.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "RFFreqMin", required = false)
    private FreqM rfFreqMin;
/**
US:RFMean - RF Mean (Optional) 

The average RF of a signal which changes RFs on a non-patterned basis.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "RFMean", required = false)
    private FreqM rfMean;
/**
US:RFMedian - RF Median (Optional) 

The most probable RF values.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "RFMedian", required = false)
    private FreqM rfMedian;
/**
US:RFPatternPeriod - RF Pattern Period (Optional) 

The duration of one cycle of the pattern for patterned RF variations.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "RFPatternPeriod", required = false)
    private microsecs rfPatternPeriod;
/**
In Data Item RFPatternType (US), Indicate whether RF is unmodulated or pulse-to-pulse RF variations are Patterned, Non-Patterned, or Adaptive.
@since 3.1.0
*/
    @XmlElement(name = "RFPatternType", required = false)
    private TString rfPatternType;
/**
US:RFRestFreq - RF Rest Freq (Optional) 

The observed carrier or rest frequency when the modulation is off. Applies mostly to Electronic Attack (EA) signals.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "RFRestFreq", required = false)
    private FreqM rfRestFreq;
/**
US:RFSequenceDesc - RF Sequence Description (Optional) 

A free text description of the RF Sequence.

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "RFSequenceDesc", required = false)
    private S500 rfSequenceDesc;
/**
US:RFSlotDuration - RF Slot Duration (Optional) 

The duration of a single time slot for the hop dwell. Applies mostly to spread spectrum.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "RFSlotDuration", required = false)
    private microsecs rfSlotDuration;
/**
US:RFFreqTolerance - RF Frequency Tolerance (Optional) 

The drift in Hz or in ppm using the formula: Frequency tolerance (ppm) = Maximum drift (Hz) / Center frequency (MHz). Enter the units (Hz or ppm) in FreqToleranceUnit.

Format is UN(18,6)
@since 3.1.0
*/
    @XmlElement(name = "RFFreqTolerance", required = false)
    private UN18_6 rfFreqTolerance;
/**
US:RFFreqToleranceUnit - Frequency Tolerance Units (Optional) 

The units in which the Frequency Tolerance is expressed.

Format is L:CFO
@since 3.1.0
*/
    @XmlElement(name = "RFFreqToleranceUnit", required = false)
    private TString rfFreqToleranceUnit;
/**
In Data Item:RFFreqToleranceInterval (US), enter the time interval over which the RF stability measurements were taken.
@since 3.1.0
*/
    @XmlElement(name = "RFFreqToleranceInterval", required = false)
    private microsecs rfFreqToleranceInterval;
/**
US:RFStandardDeviation - RF Standard Deviation (Optional) 

The standard deviation of the data set used to calculate RF Mean.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "RFStandardDeviation", required = false)
    private FreqM rfStandardDeviation;
/**
US:RFTuningStep - RF Tuning Step (Optional) 

The separation between the mean RF values of adjacent RFs in signal with discrete RF channels.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "RFTuningStep", required = false)
    private FreqM rfTuningStep;
/**
US:RFTuningStep - RF Tuning Step (Optional) 

The separation between the mean RF values of adjacent RFs in signal with discrete RF channels.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "TuningStep", required = false)
    private FreqM tuningStep;
/**
US:ObservedRFValues (Optional)

ObservedRFValues (US) contains details of actual RF observations.
@since 3.1.0
*/
    @XmlElement(name = "ObservedRFValues")
      private  Set<ObservedRFValues> observedRFValues;

/**
Get the chip rate. Pertains mostly to spread spectrum.

@return the ChipRate value in a {@link TMChips} data type
@since 3.1.0
*/
public MChips getChipRate() {
        return chipRate;
    }

/**
Set the chip rate. Pertains mostly to spread spectrum.

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
Get the dwell time at any RF when the RF dwells at particular values for more than one pulse in a row.

@return the DwellTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getDwellTime() {
        return dwellTime;
    }

/**
Set the dwell time at any RF when the RF dwells at particular values for more than one pulse in a row.

@param value the DwellTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setDwellTime(microsecs value) {
        this.dwellTime = value;
    }

/**
Determine if the DwellTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDwellTime() {
        return (this.dwellTime!= null);
    }

/**
Get the upper end of the range of RF values that represent 100% of observed signals.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

@return the FreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMax() {
        return freqMax;
    }

/**
Set the upper end of the range of RF values that represent 100% of observed signals.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

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
Get the lower end of the range of RF values that represent 100% of observed signals.

@return the FreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMin() {
        return freqMin;
    }

/**
Set the lower end of the range of RF values that represent 100% of observed signals.

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
Get the RF band between carriers which is not used. Pertains mostly to spread spectrum.

@return the GuardBand value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getGuardBand() {
        return guardBand;
    }

/**
Set the RF band between carriers which is not used. Pertains mostly to spread spectrum.

@param value the GuardBand value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setGuardBand(FreqM value) {
        this.guardBand = value;
    }

/**
Determine if the GuardBand is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetGuardBand() {
        return (this.guardBand!= null);
    }

/**
Get the transmitter pulse bandwidth (burst or instantaneous) measured at the 3 dB points (min)

@return the InstantRFBW03 value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getInstantRFBW03() {
        return instantRFBW03;
    }

/**
Set the transmitter pulse bandwidth (burst or instantaneous) measured at the 3 dB points (min)

@param value the InstantRFBW03 value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setInstantRFBW03(FreqM value) {
        this.instantRFBW03 = value;
    }

/**
Determine if the InstantRFBW03 is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetInstantRFBW03() {
        return (this.instantRFBW03 != null);
    }

/**
Get the transmitter pulse bandwidth (burst or instantaneous) measured at the 6 dB points (min)

@return the InstantRFBW06 value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getInstantRFBW06() {
        return instantRFBW06;
    }

/**
Set the transmitter pulse bandwidth (burst or instantaneous) measured at the 6 dB points (min)

@param value the InstantRFBW06 value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setInstantRFBW06(FreqM value) {
        this.instantRFBW06 = value;
    }

/**
Determine if the InstantRFBW06 is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetInstantRFBW06() {
        return (this.instantRFBW06 != null);
    }

/**
Get the transmitter pulse bandwidth (burst or instantaneous) measured at the 10 dB points (min)

@return the InstantRFBW10 value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getInstantRFBW10() {
        return instantRFBW10;
    }

/**
Set the transmitter pulse bandwidth (burst or instantaneous) measured at the 10 dB points (min)

@param value the InstantRFBW10 value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setInstantRFBW10(FreqM value) {
        this.instantRFBW10 = value;
    }

/**
Determine if the InstantRFBW10 is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetInstantRFBW10() {
        return (this.instantRFBW10 != null);
    }

/**
Get the transmitter pulse bandwidth (burst or instantaneous) measured at the 20 dB points (min)

@return the InstantRFBW20 value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getInstantRFBW20() {
        return instantRFBW20;
    }

/**
Set the transmitter pulse bandwidth (burst or instantaneous) measured at the 20 dB points (min)

@param value the InstantRFBW20 value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setInstantRFBW20(FreqM value) {
        this.instantRFBW20 = value;
    }

/**
Determine if the InstantRFBW20 is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetInstantRFBW20() {
        return (this.instantRFBW20 != null);
    }

/**
Get the number of channels into which the RF range of the emitter is divided.

@return the NumRFChannels value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumRFChannels() {
        return numRFChannels;
    }

/**
Set the number of channels into which the RF range of the emitter is divided.

@param value the NumRFChannels value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumRFChannels(UN6 value) {
        this.numRFChannels = value;
    }

/**
Determine if the NumRFChannels is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumRFChannels() {
        return (this.numRFChannels!= null);
    }

/**
Get the number of discrete RFs (channels) a multiple RF signal contains.

@return the NumRFElements value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumRFElements() {
        return numRFElements;
    }

/**
Set the number of discrete RFs (channels) a multiple RF signal contains.

@param value the NumRFElements value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumRFElements(UN6 value) {
        this.numRFElements = value;
    }

/**
Determine if the NumRFElements is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumRFElements() {
        return (this.numRFElements!= null);
    }

/**
Get the number of RF values in a signal RF sequence before it repeats.

@return the NumRFPositions value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumRFPositions() {
        return numRFPositions;
    }

/**
Set the number of RF values in a signal RF sequence before it repeats.

@param value the NumRFPositions value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumRFPositions(UN6 value) {
        this.numRFPositions = value;
    }

/**
Determine if the NumRFPositions is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumRFPositions() {
        return (this.numRFPositions!= null);
    }

/**
Get The number of frequencies simultaneously used by the emitter.

@return the NumRFSimultaneous value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumRFSimultaneous() {
        return numRFSimultaneous;
    }

/**
Set The number of frequencies simultaneously used by the emitter.

@param value the NumRFSimultaneous value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumRFSimultaneous(UN6 value) {
        this.numRFSimultaneous = value;
    }

/**
Determine if the NumRFSimultaneous is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumRFSimultaneous() {
        return (this.numRFSimultaneous!= null);
    }

/**
Get the delta (aka. separation) from the signals lowest-min RF value to its highest-max RF value; only pertains to signals which have RF changes between pulses or groups of pulses (aka. RF agile signals) or signals which use a changing RF continuous waveform (CW); e.g., a CW signal with a sweeping RF. 

@return the OperationalRFBW value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getOperationalRFBW() {
        return operationalRFBW;
    }

/**
Set the delta (aka. separation) from the signals lowest-min RF value to its highest-max RF value; only pertains to signals which have RF changes between pulses or groups of pulses (aka. RF agile signals) or signals which use a changing RF continuous waveform (CW); e.g., a CW signal with a sweeping RF. 

@param value the OperationalRFBW value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setOperationalRFBW(FreqM value) {
        this.operationalRFBW = value;
    }

/**
Determine if the OperationalRFBW is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOperationalRFBW() {
        return (this.operationalRFBW!= null);
    }

/**
Get the condition controlling the choice of RF for Adaptive RF variations (e.g., least jammed frequency)

@return the RFAdaptiveDriver value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getRFAdaptiveDriver() {
        return rfAdaptiveDriver;
    }

/**
Set the condition controlling the choice of RF for Adaptive RF variations (e.g., least jammed frequency)

@param value the RFAdaptiveDriver value in a {@link TS500} data type
@since 3.1.0
*/
public void setRFAdaptiveDriver(S500 value) {
        this.rfAdaptiveDriver = value;
    }

/**
Determine if the RFAdaptiveDriver is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFAdaptiveDriver() {
        return (this.rfAdaptiveDriver!= null);
    }

/**
Get In Data Item RFAdaptiveRule (US), indicate how the RF is chosen for Adaptive RF variations.

@return the RFAdaptiveRule value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getRFAdaptiveRule() {
        return rfAdaptiveRule;
    }

/**
Set In Data Item RFAdaptiveRule (US), indicate how the RF is chosen for Adaptive RF variations.

@param value the RFAdaptiveRule value in a {@link TS500} data type
@since 3.1.0
*/
public void setRFAdaptiveRule(S500 value) {
        this.rfAdaptiveRule = value;
    }

/**
Determine if the RFAdaptiveRule is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFAdaptiveRule() {
        return (this.rfAdaptiveRule!= null);
    }

/**
Get the frequency divisor common to all RF separations (not necessarily to all RF) RF crystal is not always the same as the RF channelization (min).

@return the RFBasicClockPeriod value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getRFBasicClockPeriod() {
        return rfBasicClockPeriod;
    }

/**
Set the frequency divisor common to all RF separations (not necessarily to all RF) RF crystal is not always the same as the RF channelization (min).

@param value the RFBasicClockPeriod value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setRFBasicClockPeriod(FreqM value) {
        this.rfBasicClockPeriod = value;
    }

/**
Determine if the RFBasicClockPeriod is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFBasicClockPeriod() {
        return (this.rfBasicClockPeriod!= null);
    }

/**
Get the RF change per unit of time, measured over a significant portion of the waveform. Applies to Continuous RF variations.

@return the RFChangeRate value in a {@link TRFChgRate} data type
@since 3.1.0
*/
public RFChgRate getRFChangeRate() {
        return rfChangeRate;
    }

/**
Set the RF change per unit of time, measured over a significant portion of the waveform. Applies to Continuous RF variations.

@param value the RFChangeRate value in a {@link TRFChgRate} data type
@since 3.1.0
*/
public void setRFChangeRate(RFChgRate value) {
        this.rfChangeRate = value;
    }

/**
Determine if the RFChangeRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFChangeRate() {
        return (this.rfChangeRate!= null);
    }

/**
Get the maximum RF channel values.

[XSL ERR MINMAX] If US:RFChannelFreqMax is used, it MUST be greater than US:RFChannelFreqMin.

@return the RFChannelFreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getRFChannelFreqMax() {
        return rfChannelFreqMax;
    }

/**
Set the maximum RF channel values.

[XSL ERR MINMAX] If US:RFChannelFreqMax is used, it MUST be greater than US:RFChannelFreqMin.

@param value the RFChannelFreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setRFChannelFreqMax(FreqM value) {
        this.rfChannelFreqMax = value;
    }

/**
Determine if the RFChannelFreqMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFChannelFreqMax() {
        return (this.rfChannelFreqMax!= null);
    }

/**
Get the minimum RF channel values.

@return the RFChannelFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getRFChannelFreqMin() {
        return rfChannelFreqMin;
    }

/**
Set the minimum RF channel values.

@param value the RFChannelFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setRFChannelFreqMin(FreqM value) {
        this.rfChannelFreqMin = value;
    }

/**
Determine if the RFChannelFreqMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFChannelFreqMin() {
        return (this.rfChannelFreqMin!= null);
    }

/**
Get In Data Item RFCoherent (US), indicate if the observed RF signal is coherent, non-coherent, or unknown.

@return the RFCoherent value in a {@link TString} data type
@since 3.1.0
*/
public TString getRFCoherent() {
        return rfCoherent;
    }

/**
Set In Data Item RFCoherent (US), indicate if the observed RF signal is coherent, non-coherent, or unknown.

@param value the RFCoherent value in a {@link TString} data type
@since 3.1.0
*/
public void setRFCoherent(TString value) {
        this.rfCoherent = value;
    }

/**
Determine if the RFCoherent is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFCoherent() {
return (this.rfCoherent!= null ? this.rfCoherent.isSetValue() : false);
    }

/**
Get whether pulse-to-pulse RF variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

@return the RFContinuous value in a {@link TString} data type
@since 3.1.0
*/
public TString getRFContinuous() {
        return rfContinuous;
    }

/**
Set whether pulse-to-pulse RF variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

@param value the RFContinuous value in a {@link TString} data type
@since 3.1.0
*/
public void setRFContinuous(TString value) {
        this.rfContinuous = value;
    }

/**
Determine if the RFContinuous is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFContinuous() {
return (this.rfContinuous!= null ? this.rfContinuous.isSetValue() : false);
    }

/**
Get the typical highest RF value observed on a single intercept.

[XSL ERR MINMAX] If US:RFFreqMax is used, it MUST be greater than US:RFFreqMin.

@return the RFFreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getRFFreqMax() {
        return rfFreqMax;
    }

/**
Set the typical highest RF value observed on a single intercept.

[XSL ERR MINMAX] If US:RFFreqMax is used, it MUST be greater than US:RFFreqMin.

@param value the RFFreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setRFFreqMax(FreqM value) {
        this.rfFreqMax = value;
    }

/**
Determine if the RFFreqMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFFreqMax() {
        return (this.rfFreqMax!= null);
    }

/**
Get the typical lowest RF value observed on a single intercept.

@return the RFFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getRFFreqMin() {
        return rfFreqMin;
    }

/**
Set the typical lowest RF value observed on a single intercept.

@param value the RFFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setRFFreqMin(FreqM value) {
        this.rfFreqMin = value;
    }

/**
Determine if the RFFreqMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFFreqMin() {
        return (this.rfFreqMin!= null);
    }

/**
Get the average RF of a signal which changes RFs on a non-patterned basis.

@return the RFMean value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getRFMean() {
        return rfMean;
    }

/**
Set the average RF of a signal which changes RFs on a non-patterned basis.

@param value the RFMean value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setRFMean(FreqM value) {
        this.rfMean = value;
    }

/**
Determine if the RFMean is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFMean() {
        return (this.rfMean!= null);
    }

/**
Get the most probable RF values.

@return the RFMedian value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getRFMedian() {
        return rfMedian;
    }

/**
Set the most probable RF values.

@param value the RFMedian value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setRFMedian(FreqM value) {
        this.rfMedian = value;
    }

/**
Determine if the RFMedian is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFMedian() {
        return (this.rfMedian!= null);
    }

/**
Get the duration of one cycle of the pattern for patterned RF variations.

@return the RFPatternPeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getRFPatternPeriod() {
        return rfPatternPeriod;
    }

/**
Set the duration of one cycle of the pattern for patterned RF variations.

@param value the RFPatternPeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setRFPatternPeriod(microsecs value) {
        this.rfPatternPeriod = value;
    }

/**
Determine if the RFPatternPeriod is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFPatternPeriod() {
        return (this.rfPatternPeriod!= null);
    }

/**
Get In Data Item RFPatternType (US), Indicate whether RF is unmodulated or pulse-to-pulse RF variations are Patterned, Non-Patterned, or Adaptive.

@return the RFPatternType value in a {@link TString} data type
@since 3.1.0
*/
public TString getRFPatternType() {
        return rfPatternType;
    }

/**
Set In Data Item RFPatternType (US), Indicate whether RF is unmodulated or pulse-to-pulse RF variations are Patterned, Non-Patterned, or Adaptive.

@param value the RFPatternType value in a {@link TString} data type
@since 3.1.0
*/
public void setRFPatternType(TString value) {
        this.rfPatternType = value;
    }

/**
Determine if the RFPatternType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFPatternType() {
return (this.rfPatternType!= null ? this.rfPatternType.isSetValue() : false);
    }

/**
Get the observed carrier or rest frequency when the modulation is off. Applies mostly to Electronic Attack (EA) signals.

@return the RFRestFreq value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getRFRestFreq() {
        return rfRestFreq;
    }

/**
Set the observed carrier or rest frequency when the modulation is off. Applies mostly to Electronic Attack (EA) signals.

@param value the RFRestFreq value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setRFRestFreq(FreqM value) {
        this.rfRestFreq = value;
    }

/**
Determine if the RFRestFreq is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFRestFreq() {
        return (this.rfRestFreq!= null);
    }

/**
Get a free text description of the RF Sequence.

@return the RFSequenceDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getRFSequenceDesc() {
        return rfSequenceDesc;
    }

/**
Set a free text description of the RF Sequence.

@param value the RFSequenceDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setRFSequenceDesc(S500 value) {
        this.rfSequenceDesc = value;
    }

/**
Determine if the RFSequenceDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFSequenceDesc() {
        return (this.rfSequenceDesc!= null);
    }

/**
Get the duration of a single time slot for the hop dwell. Applies mostly to spread spectrum.

@return the RFSlotDuration value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getRFSlotDuration() {
        return rfSlotDuration;
    }

/**
Set the duration of a single time slot for the hop dwell. Applies mostly to spread spectrum.

@param value the RFSlotDuration value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setRFSlotDuration(microsecs value) {
        this.rfSlotDuration = value;
    }

/**
Determine if the RFSlotDuration is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFSlotDuration() {
        return (this.rfSlotDuration!= null);
    }

/**
Get the drift in Hz or in ppm using the formula: Frequency tolerance (ppm) = Maximum drift (Hz) / Center frequency (MHz). Enter the units (Hz or ppm) in FreqToleranceUnit.

@return the RFFreqTolerance value in a {@link TUN18_6} data type
@since 3.1.0
*/
public UN18_6 getRFFreqTolerance() {
        return rfFreqTolerance;
    }

/**
Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm) = Maximum drift (Hz) / Center frequency (MHz). Enter the units (Hz or ppm) in FreqToleranceUnit.

@param value the RFFreqTolerance value in a {@link TUN18_6} data type
@since 3.1.0
*/
public void setRFFreqTolerance(UN18_6 value) {
        this.rfFreqTolerance = value;
    }

/**
Determine if the RFFreqTolerance is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFFreqTolerance() {
        return (this.rfFreqTolerance!= null);
    }

/**
Get the units in which the Frequency Tolerance is expressed.

@return the RFFreqToleranceUnit value in a {@link TString} data type
@since 3.1.0
*/
public TString getRFFreqToleranceUnit() {
        return rfFreqToleranceUnit;
    }

/**
Set the units in which the Frequency Tolerance is expressed.

@param value the RFFreqToleranceUnit value in a {@link TString} data type
@since 3.1.0
*/
public void setRFFreqToleranceUnit(TString value) {
        this.rfFreqToleranceUnit = value;
    }

/**
Determine if the RFFreqToleranceUnit is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFFreqToleranceUnit() {
return (this.rfFreqToleranceUnit!= null ? this.rfFreqToleranceUnit.isSetValue() : false);
    }

/**
Get In Data Item:RFFreqToleranceInterval (US), enter the time interval over which the RF stability measurements were taken.

@return the RFFreqToleranceInterval value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getRFFreqToleranceInterval() {
        return rfFreqToleranceInterval;
    }

/**
Set In Data Item:RFFreqToleranceInterval (US), enter the time interval over which the RF stability measurements were taken.

@param value the RFFreqToleranceInterval value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setRFFreqToleranceInterval(microsecs value) {
        this.rfFreqToleranceInterval = value;
    }

/**
Determine if the RFFreqToleranceInterval is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFFreqToleranceInterval() {
        return (this.rfFreqToleranceInterval!= null);
    }

/**
Get the standard deviation of the data set used to calculate RF Mean.

@return the RFStandardDeviation value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getRFStandardDeviation() {
        return rfStandardDeviation;
    }

/**
Set the standard deviation of the data set used to calculate RF Mean.

@param value the RFStandardDeviation value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setRFStandardDeviation(FreqM value) {
        this.rfStandardDeviation = value;
    }

/**
Determine if the RFStandardDeviation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFStandardDeviation() {
        return (this.rfStandardDeviation!= null);
    }

/**
Get the separation between the mean RF values of adjacent RFs in signal with discrete RF channels.

@return the RFTuningStep value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getRFTuningStep() {
        return rfTuningStep;
    }

/**
Set the separation between the mean RF values of adjacent RFs in signal with discrete RF channels.

@param value the RFTuningStep value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setRFTuningStep(FreqM value) {
        this.rfTuningStep = value;
    }

/**
Determine if the RFTuningStep is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFTuningStep() {
        return (this.rfTuningStep!= null);
    }

/**
Get the separation between the mean RF values of adjacent RFs in signal with discrete RF channels.

@return the TuningStep value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getTuningStep() {
        return tuningStep;
    }

/**
Set the separation between the mean RF values of adjacent RFs in signal with discrete RF channels.

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
Get the US:ObservedRFValues

Complex element ObservedRFValues (US) contains details of actual RF observations.

@return  a {@link ObservedRFValues} instance
@since 3.1.0
*/
    public Set<ObservedRFValues> getObservedRFValues() {
        if (observedRFValues == null) {
            observedRFValues = new HashSet<ObservedRFValues>();
        }
        return this.observedRFValues;
    }

/**
Determine if the ObservedRFValues is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetObservedRFValues() {
        return ((this.observedRFValues!= null)&&(!this.observedRFValues.isEmpty()));
    }

/**
  Clear the ObservedRFValues field. This sets the field to null.
 */
    public void unsetObservedRFValues() {
        this.observedRFValues = null;
    }

/**
Set the chip rate. Pertains mostly to spread spectrum.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withChipRate(Double value) {
           setChipRate(new MChips(value));
        return this;
    }

/**
Set the dwell time at any RF when the RF dwells at particular values for more than one pulse in a row.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withDwellTime(Double value) {
           setDwellTime(new microsecs(value));
        return this;
    }

/**
Set the upper end of the range of RF values that represent 100% of observed signals.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withFreqMax(Double value) {
           setFreqMax(new FreqM(value));
        return this;
    }

/**
Set the lower end of the range of RF values that represent 100% of observed signals.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withFreqMin(Double value) {
           setFreqMin(new FreqM(value));
        return this;
    }

/**
Set the RF band between carriers which is not used. Pertains mostly to spread spectrum.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withGuardBand(Double value) {
           setGuardBand(new FreqM(value));
        return this;
    }

/**
Set the transmitter pulse bandwidth (burst or instantaneous) measured at the 3 dB points (min)

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withInstantRFBW03(Double value) {
           setInstantRFBW03(new FreqM(value));
        return this;
    }

/**
Set the transmitter pulse bandwidth (burst or instantaneous) measured at the 6 dB points (min)

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withInstantRFBW06(Double value) {
           setInstantRFBW06(new FreqM(value));
        return this;
    }

/**
Set the transmitter pulse bandwidth (burst or instantaneous) measured at the 10 dB points (min)

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withInstantRFBW10(Double value) {
           setInstantRFBW10(new FreqM(value));
        return this;
    }

/**
Set the transmitter pulse bandwidth (burst or instantaneous) measured at the 20 dB points (min)

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withInstantRFBW20(Double value) {
           setInstantRFBW20(new FreqM(value));
        return this;
    }

/**
Set the number of channels into which the RF range of the emitter is divided.

@param value  An instances of type {@link Integer}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withNumRFChannels(Integer value) {
           setNumRFChannels(new UN6(value));
        return this;
    }

/**
Set the number of discrete RFs (channels) a multiple RF signal contains.

@param value  An instances of type {@link Integer}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withNumRFElements(Integer value) {
           setNumRFElements(new UN6(value));
        return this;
    }

/**
Set the number of RF values in a signal RF sequence before it repeats.

@param value  An instances of type {@link Integer}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withNumRFPositions(Integer value) {
           setNumRFPositions(new UN6(value));
        return this;
    }

/**
Set The number of frequencies simultaneously used by the emitter.

@param value  An instances of type {@link Integer}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withNumRFSimultaneous(Integer value) {
           setNumRFSimultaneous(new UN6(value));
        return this;
    }

/**
Set the delta (aka. separation) from the signals lowest-min RF value to its highest-max RF value; only pertains to signals which have RF changes between pulses or groups of pulses (aka. RF agile signals) or signals which use a changing RF continuous waveform (CW); e.g., a CW signal with a sweeping RF. 

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withOperationalRFBW(Double value) {
           setOperationalRFBW(new FreqM(value));
        return this;
    }

/**
Set the condition controlling the choice of RF for Adaptive RF variations (e.g., least jammed frequency)

@param value  An instances of type {@link String}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFAdaptiveDriver(String value) {
           setRFAdaptiveDriver(new S500(value));
        return this;
    }

/**
Set In Data Item RFAdaptiveRule (US), indicate how the RF is chosen for Adaptive RF variations.

@param value  An instances of type {@link String}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFAdaptiveRule(String value) {
           setRFAdaptiveRule(new S500(value));
        return this;
    }

/**
Set the frequency divisor common to all RF separations (not necessarily to all RF) RF crystal is not always the same as the RF channelization (min).

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFBasicClockPeriod(Double value) {
           setRFBasicClockPeriod(new FreqM(value));
        return this;
    }

/**
Set the RF change per unit of time, measured over a significant portion of the waveform. Applies to Continuous RF variations.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFChangeRate(Double value) {
           setRFChangeRate(new RFChgRate(value));
        return this;
    }

/**
Set the maximum RF channel values.

[XSL ERR MINMAX] If US:RFChannelFreqMax is used, it MUST be greater than US:RFChannelFreqMin.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFChannelFreqMax(Double value) {
           setRFChannelFreqMax(new FreqM(value));
        return this;
    }

/**
Set the minimum RF channel values.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFChannelFreqMin(Double value) {
           setRFChannelFreqMin(new FreqM(value));
        return this;
    }

/**
Set In Data Item RFCoherent (US), indicate if the observed RF signal is coherent, non-coherent, or unknown.

@param value  An instances of type {@link ListUSY}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFCoherent(ListUSY value) {
           setRFCoherent(new TString(value.value()));
        return this;
    }

/**
Set whether pulse-to-pulse RF variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

@param value  An instances of type {@link ListCBO}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFContinuous(ListCBO value) {
           setRFContinuous(new TString(value.value()));
        return this;
    }

/**
Set the typical highest RF value observed on a single intercept.

[XSL ERR MINMAX] If US:RFFreqMax is used, it MUST be greater than US:RFFreqMin.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFFreqMax(Double value) {
           setRFFreqMax(new FreqM(value));
        return this;
    }

/**
Set the typical lowest RF value observed on a single intercept.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFFreqMin(Double value) {
           setRFFreqMin(new FreqM(value));
        return this;
    }

/**
Set the average RF of a signal which changes RFs on a non-patterned basis.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFMean(Double value) {
           setRFMean(new FreqM(value));
        return this;
    }

/**
Set the most probable RF values.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFMedian(Double value) {
           setRFMedian(new FreqM(value));
        return this;
    }

/**
Set the duration of one cycle of the pattern for patterned RF variations.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFPatternPeriod(Double value) {
           setRFPatternPeriod(new microsecs(value));
        return this;
    }

/**
Set In Data Item RFPatternType (US), Indicate whether RF is unmodulated or pulse-to-pulse RF variations are Patterned, Non-Patterned, or Adaptive.

@param value  An instances of type {@link ListUS7}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFPatternType(ListUS7 value) {
           setRFPatternType(new TString(value.value()));
        return this;
    }

/**
Set the observed carrier or rest frequency when the modulation is off. Applies mostly to Electronic Attack (EA) signals.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFRestFreq(Double value) {
           setRFRestFreq(new FreqM(value));
        return this;
    }

/**
Set a free text description of the RF Sequence.

@param value  An instances of type {@link String}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFSequenceDesc(String value) {
           setRFSequenceDesc(new S500(value));
        return this;
    }

/**
Set the duration of a single time slot for the hop dwell. Applies mostly to spread spectrum.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFSlotDuration(Double value) {
           setRFSlotDuration(new microsecs(value));
        return this;
    }

/**
Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm) = Maximum drift (Hz) / Center frequency (MHz). Enter the units (Hz or ppm) in FreqToleranceUnit.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFFreqTolerance(Double value) {
           setRFFreqTolerance(new UN18_6(value));
        return this;
    }

/**
Set the units in which the Frequency Tolerance is expressed.

@param value  An instances of type {@link ListCFO}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFFreqToleranceUnit(ListCFO value) {
           setRFFreqToleranceUnit(new TString(value.value()));
        return this;
    }

/**
Set In Data Item:RFFreqToleranceInterval (US), enter the time interval over which the RF stability measurements were taken.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFFreqToleranceInterval(Double value) {
           setRFFreqToleranceInterval(new microsecs(value));
        return this;
    }

/**
Set the standard deviation of the data set used to calculate RF Mean.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFStandardDeviation(Double value) {
           setRFStandardDeviation(new FreqM(value));
        return this;
    }

/**
Set the separation between the mean RF values of adjacent RFs in signal with discrete RF channels.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withRFTuningStep(Double value) {
           setRFTuningStep(new FreqM(value));
        return this;
    }

/**
Set the separation between the mean RF values of adjacent RFs in signal with discrete RF channels.

@param value  An instances of type {@link Double}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withTuningStep(Double value) {
           setTuningStep(new FreqM(value));
        return this;
    }

/**
Set the US:ObservedRFValues

Complex element ObservedRFValues (US) contains details of actual RF observations.

@param values  One or more instances of type {@link ObservedRFValues...}
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withObservedRFValues(ObservedRFValues... values) {
        if (values!= null) {
            for (ObservedRFValues value: values) {
                getObservedRFValues().add(value);
            }
        }
        return this;
    }

/**
Set the US:ObservedRFValues

Complex element ObservedRFValues (US) contains details of actual RF observations.

@param values  A collection of {@link ObservedRFValues} instances
@return The current ObservedRFAnalysis object instance
@since 3.1.0
*/
    public ObservedRFAnalysis withObservedRFValues(Collection<ObservedRFValues> values) {
        if (values!= null) {
            getObservedRFValues().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this ObservedRFAnalysis instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ObservedRFAnalysis {"
 + (chipRate !=null? " chipRate [" + chipRate +"]" : "") 
 + (dwellTime !=null? " dwellTime [" + dwellTime +"]" : "") 
 + (freqMax !=null? " freqMax [" + freqMax +"]" : "") 
 + (freqMin !=null? " freqMin [" + freqMin +"]" : "") 
 + (guardBand !=null? " guardBand [" + guardBand +"]" : "") 
 + (instantRFBW03 !=null? " instantRFBW03 [" + instantRFBW03 +"]" : "") 
 + (instantRFBW06 !=null? " instantRFBW06 [" + instantRFBW06 +"]" : "") 
 + (instantRFBW10 !=null? " instantRFBW10 [" + instantRFBW10 +"]" : "") 
 + (instantRFBW20 !=null? " instantRFBW20 [" + instantRFBW20 +"]" : "") 
 + (numRFChannels !=null? " numRFChannels [" + numRFChannels +"]" : "") 
 + (numRFElements !=null? " numRFElements [" + numRFElements +"]" : "") 
 + (numRFPositions !=null? " numRFPositions [" + numRFPositions +"]" : "") 
 + (numRFSimultaneous !=null? " numRFSimultaneous [" + numRFSimultaneous +"]" : "") 
 + (observedRFValues !=null? " observedRFValues [" + observedRFValues +"]" : "") 
 + (operationalRFBW !=null? " operationalRFBW [" + operationalRFBW +"]" : "") 
 + (rfAdaptiveDriver !=null? " rfAdaptiveDriver [" + rfAdaptiveDriver +"]" : "") 
 + (rfAdaptiveRule !=null? " rfAdaptiveRule [" + rfAdaptiveRule +"]" : "") 
 + (rfBasicClockPeriod !=null? " rfBasicClockPeriod [" + rfBasicClockPeriod +"]" : "") 
 + (rfChangeRate !=null? " rfChangeRate [" + rfChangeRate +"]" : "") 
 + (rfChannelFreqMax !=null? " rfChannelFreqMax [" + rfChannelFreqMax +"]" : "") 
 + (rfChannelFreqMin !=null? " rfChannelFreqMin [" + rfChannelFreqMin +"]" : "") 
 + (rfCoherent !=null? " rfCoherent [" + rfCoherent +"]" : "") 
 + (rfContinuous !=null? " rfContinuous [" + rfContinuous +"]" : "") 
 + (rfFreqMax !=null? " rfFreqMax [" + rfFreqMax +"]" : "") 
 + (rfFreqMin !=null? " rfFreqMin [" + rfFreqMin +"]" : "") 
 + (rfFreqTolerance !=null? " rfFreqTolerance [" + rfFreqTolerance +"]" : "") 
 + (rfFreqToleranceInterval !=null? " rfFreqToleranceInterval [" + rfFreqToleranceInterval +"]" : "") 
 + (rfFreqToleranceUnit !=null? " rfFreqToleranceUnit [" + rfFreqToleranceUnit +"]" : "") 
 + (rfMean !=null? " rfMean [" + rfMean +"]" : "") 
 + (rfMedian !=null? " rfMedian [" + rfMedian +"]" : "") 
 + (rfPatternPeriod !=null? " rfPatternPeriod [" + rfPatternPeriod +"]" : "") 
 + (rfPatternType !=null? " rfPatternType [" + rfPatternType +"]" : "") 
 + (rfRestFreq !=null? " rfRestFreq [" + rfRestFreq +"]" : "") 
 + (rfSequenceDesc !=null? " rfSequenceDesc [" + rfSequenceDesc +"]" : "") 
 + (rfSlotDuration !=null? " rfSlotDuration [" + rfSlotDuration +"]" : "") 
 + (rfStandardDeviation !=null? " rfStandardDeviation [" + rfStandardDeviation +"]" : "") 
 + (rfTuningStep !=null? " rfTuningStep [" + rfTuningStep +"]" : "") 
 + (tuningStep !=null? " tuningStep [" + tuningStep +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ObservedRFAnalysis} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
