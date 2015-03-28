package us.gov.dod.standard.ssrf._3_1.receiver;

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
RxMode and sub-elements define all the technical parameters for a mode of operation of the Receiver.

Element of {@link Receiver}

Sub-Elements are {@link Baseband}, {@link EmsClass}, {@link FreqConversion}, {@link RxModulation}, {@link RxSignalTuning}, {@link SpreadSpectrum}

Example: <pre>
* &lt;SensitivityLevel&gt;-92&lt;/SensitivityLevel&gt; 
* &lt;NoiseFigure&gt;9&lt;/NoiseFigure&gt; 
* &lt;NoiseTemp&gt;850&lt;/NoiseTemp&gt; 
* &lt;SensitivityCriteriaType&gt;SINAD&lt;/SensitivityCriteriaType&gt;
*  &lt;SensitivityCriteriaText&gt;10 dB at 30 kHz BW&lt;/SensitivityCriteriaText&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxMode", propOrder = {
    "modeID",
    "description",
    "rxType",
    "necessaryBw",
    "tunability",
    "tuningMethod",
    "intermodPct",
    "intermodEffect",
    "sensitivityLevel",
    "noiseFigure",
    "noiseTemp",
    "sensitivityCriteriaType",
    "sensitivityCriteriaLevel",
    "sensitivityCriteriaText",
    "postDetectionFreqMin",
    "postDetectionFreqMax",
    "processingGainMin",
    "processingGainMax",
    "spuriousRejection",
    "imageRejection",
    "intermodRejection",
    "adjacentChannelSelectivity",
    "freqTolerance",
    "freqToleranceUnit",
    "modeName",
    "emsClass",
    "rxSignalTuning",
    "rxModulation",
    "baseband",
    "freqConversion",
    "spreadSpectrum"
})
public class RxMode {

/**
ModeID  - Mode Identifier (Required) 

A short name for the mode; this name should be a meaningful identification of the mode, but it can also be automatically generated. The Name MUST be unique within the dataset and SHOULD NOT be modified during the lifetime of the Dataset.

Format is S20

Attribute group ModeInfo (Required)
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
RxType  - Receiver Type (Optional) 

The type of receiver. If there is no suitable entry in the code list, use Other and indicate the type in a Remark.

Format is L:CRT
@since 3.1.0
*/
    @XmlElement(name = "RxType", required = false)
    private TString rxType;
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
SensitivityLevel  - Sensitivity Level (Optional) 

The minimum RF signal power level as it relates to one of the four Sensitivity Criteria Types: PWOP, SINAD, S/N or S+N/N indicated in item SensitivityCriteriaType. Note, for MDS and MTR criteria, the RF signal power level is zero and this item may be left blank in those instances.

Format is SN(6,3) (dBm)

Attribute group Sensitivity (Optional)
@since 3.1.0
*/
    @XmlElement(name = "SensitivityLevel", required = false)
    private dBm sensitivityLevel;
/**
NoiseFigure  - Noise Figure (Optional) 

The ratio of the output noise power to the portion of noise power attributable to thermal noise in the input termination at 290 Kelvins. Noise Figure is related to Noise Temperature by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).

Format is SN(6,3) (dB)

Attribute group Sensitivity (Optional)
@since 3.1.0
*/
    @XmlElement(name = "NoiseFigure", required = false)
    private dB noiseFigure;
/**
NoiseTemp  - Noise Temperature (Optional) 

The absolute temperature of a passive system having an available noise power per unit bandwidth at a specified frequency equal to that of the actual terminals of a network. Noise Figure is related to Noise Temperature by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).

Format is UN(7,1) (kelvins)

Attribute group Sensitivity (Optional)
@since 3.1.0
*/
    @XmlElement(name = "NoiseTemp", required = false)
    private Kelvins noiseTemp;
/**
SensitivityCriteriaType  - Type of Sensitivity Criteria (Optional) 

The criteria used to determine the minimum RF signal power present at the input terminals that ensures acceptable detection and demodulation of the desired signal.

Format is L:CSE

Attribute group Sensitivity (Optional)
@since 3.1.0
*/
    @XmlElement(name = "SensitivityCriteriaType", required = false)
    private TString sensitivityCriteriaType;
/**
SensitivityCriteriaLevel - Sensitivity Criteria Level (Optional) 

The value of the criteria; the meaning and unit of this value depends on the Sensitivity Criteria Type selected.

Format is SN(16,15) (dBm) 

Attribute group Sensitivity (Optional)
@since 3.1.0
*/
    @XmlElement(name = "SensitivityCriteriaLevel", required = false)
    private SCLevel sensitivityCriteriaLevel;
/**
SensitivityCriteriaText - Sensitivity Criteria Description (Optional) 

The value of the criteria when it cannot be expressed as a number.

Format is S50

Attribute group Sensitivity (Optional)
@since 3.1.0
*/
    @XmlElement(name = "SensitivityCriteriaText", required = false)
    private S50 sensitivityCriteriaText;
/**
PostDetectionFreqMin  - Minimum Post Detection Frequency (Optional) 

The maximum post detection frequency at the baseband half-power point.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group PostDetection (Optional)
@since 3.1.0
*/
    @XmlElement(name = "PostDetectionFreqMin", required = false)
    private FreqM postDetectionFreqMin;
/**
PostDetectionFreqMax  - Maximum Post Detection Frequency (Optional) 

The maximum post detection frequency at the baseband half-power point.

[XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than PostDetectionFreqMin.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group PostDetection (Optional)
@since 3.1.0
*/
    @XmlElement(name = "PostDetectionFreqMax", required = false)
    private FreqM postDetectionFreqMax;
    @XmlElement(name = "ProcessingGainMin ", required = false)
    private dB processingGainMin;
/**
ProcessingGainMax -  Maximum Processing Gain (Optional) 

The maximum ratio of the post processing signal-to-noise ratio to the received signal-to-noise ratio.

[XSL ERR MINMAX] If ProcessingGainMax is used, it MUST be greater than ProcessingGainMin.

Format is SN(6,3) (dB)
@since 3.1.0
*/
    @XmlElement(name = "ProcessingGainMax", required = false)
    private dB processingGainMax;
/**
SpuriousRejection  - Rejection of Spurious Emissions (Optional) 

The spurious receiver responses that arise when strong undesired signals and the receiver local oscillator (LO) combine in the mixer to produce a frequency on or near the intermediate frequency. The rejection is the ratio in dB of a particular out-of-band frequency (outside the fundamental IF bandwidth) signal level required to produce a specified output, to the signal level required to produce the same output.

Format is UN(5,2) [0..150] (dB)
@since 3.1.0
*/
    @XmlElement(name = "SpuriousRejection", required = false)
    private Rejection_dB1 spuriousRejection;
/**
ImageRejection  - Rejection on Image Frequency (Optional) 

The ratio of the image frequency signal level required to produce a specified output, to the desired signal level required to produce the same output. This applies to superheterodyne receivers. For example, if a receiver has a sensitivity of -100 dBm and could receive an image signal with a maximum power of -20 dBm without causing the standard response, then the receive image rejection would be 80 dB.

Format is UN(5,2) [0..150] (dB)
@since 3.1.0
*/
    @XmlElement(name = "ImageRejection", required = false)
    private Rejection_dB1 imageRejection;
/**
IntermodRejection  - Rejection of Intermodulation (Optional) 

The rejection of spurious emissions involving the mixing of two or more signals. Spurious emissions are emissions on a frequency or frequencies that are outside the necessary bandwidth and the level of which may be reduced without affecting the related transmission of information.

Format is UN(5,2) [0..200] (dB)
@since 3.1.0
*/
    @XmlElement(name = "IntermodRejection", required = false)
    private Rejection_dB2 intermodRejection;
/**
AdjacentChannelSelectivity  - Adjacent Channel Selectivity (Optional) 

The ratio in dB between the wanted signal and the maximum level of an unwanted signal in the adjacent channel which still allows correct reception of the wanted signal.

Format is SN(6,3) (dBm)
@since 3.1.0
*/
    @XmlElement(name = "AdjacentChannelSelectivity", required = false)
    private dB adjacentChannelSelectivity;
/**
FreqTolerance  - Frequency Tolerance  (Required) 

The drift in Hz or in ppm using the formula: Frequency tolerance (ppm) = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm) in FreqToleranceUnit.

Format is UN(18,6)

Attribute group FreqTolerance (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FreqTolerance")
      private  UN18_6 freqTolerance;
/**
FreqToleranceUnit  - Frequency Tolerance Unit  (Required) 

The units in which the Frequency Tolerance is expressed.

Format is L:CFO

Attribute group FreqTolerance (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FreqToleranceUnit")
      private  TString freqToleranceUnit;
/**
US:ModeName  - Mode Name (Optional) 

A short name for the mode.

Format is S40
@since 3.1.0
*/
    @XmlElement(name = "ModeName", required = false)
    private S40 modeName;
/**
EmsClass (Optional)

EmsClass identifies the emission classification symbols that define the baseband modulating characteristics of the emission designator. The emission classification consists of the three required symbols and the two optional symbols.
@since 3.1.0
*/
    @XmlElement(name = "EmsClass", nillable = true)
      private  Set<EmsClass> emsClass;
/**
RxSignalTuning (Optional)

RxSignalTuning indicates the tuning capabilities, the specific frequency or range of frequencies within which the equipment may tune, and the tuning increments of the equipment.
@since 3.1.0
*/
    @XmlElement(name = "RxSignalTuning")
      private  Set<RxSignalTuning> rxSignalTuning;
/**
RxModulation (Optional)

RxModulation contains the detailed characteristics of the modulation on the receiver side.
@since 3.1.0
*/
    @XmlElement(name = "RxModulation")
      private  Set<RxModulation> rxModulation;
/**
Baseband (Optional)

Baseband defines the parameters of the modulating or received signal.
@since 3.1.0
*/
    @XmlElement(name = "Baseband")
      private  Set<Baseband> baseband;
/**
FreqConversion (Optional)

FreqConversion contains the characteristics of a frequency conversion stage: intermediate frequency (IF) and local oscillator (LO) parameters.
@since 3.1.0
*/
    @XmlElement(name = "FreqConversion")
      private  Set<FreqConversion> freqConversion;
/**
Spread Spectrum (Optional)

SpreadSpectrum contains characteristics of systems using spread spectrum techniques.
@since 3.1.0
*/
    @XmlElement(name = "SpreadSpectrum")
      private  SpreadSpectrum spreadSpectrum;
/**
curves - Links to Curves (Optional) 

The list of indices referring to Curves applicable to the data item.

Format is List of UN(6)
@since 3.1.0
*/
    @XmlAttribute(name = "curves")
      private  Set<BigInteger> curves;

/**
Get a short name for the mode; this name should be a meaningful identification of the mode, but it can also be automatically generated. The Name MUST be unique within the dataset and SHOULD NOT be modified during the lifetime of the Dataset.

@return the ModeID value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getModeID() {
        return modeID;
    }

/**
Set a short name for the mode; this name should be a meaningful identification of the mode, but it can also be automatically generated. The Name MUST be unique within the dataset and SHOULD NOT be modified during the lifetime of the Dataset.

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
Get the type of receiver. If there is no suitable entry in the code list, use Other and indicate the type in a Remark.

@return the RxType value in a {@link TString} data type
@since 3.1.0
*/
public TString getRxType() {
        return rxType;
    }

/**
Set the type of receiver. If there is no suitable entry in the code list, use Other and indicate the type in a Remark.

@param value the RxType value in a {@link TString} data type
@since 3.1.0
*/
public void setRxType(TString value) {
        this.rxType = value;
    }

/**
Determine if the RxType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRxType() {
return (this.rxType!= null ? this.rxType.isSetValue() : false);
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
Get the minimum RF signal power level as it relates to one of the four Sensitivity Criteria Types: PWOP, SINAD, S/N or S+N/N indicated in item SensitivityCriteriaType. Note, for MDS and MTR criteria, the RF signal power level is zero and this item may be left blank in those instances.

@return the SensitivityLevel value in a {@link TdBm} data type
@since 3.1.0
*/
public dBm getSensitivityLevel() {
        return sensitivityLevel;
    }

/**
Set the minimum RF signal power level as it relates to one of the four Sensitivity Criteria Types: PWOP, SINAD, S/N or S+N/N indicated in item SensitivityCriteriaType. Note, for MDS and MTR criteria, the RF signal power level is zero and this item may be left blank in those instances.

@param value the SensitivityLevel value in a {@link TdBm} data type
@since 3.1.0
*/
public void setSensitivityLevel(dBm value) {
        this.sensitivityLevel = value;
    }

/**
Determine if the SensitivityLevel is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSensitivityLevel() {
        return (this.sensitivityLevel!= null);
    }

/**
Get the ratio of the output noise power to the portion of noise power attributable to thermal noise in the input termination at 290 Kelvins. Noise Figure is related to Noise Temperature by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).

@return the NoiseFigure value in a {@link TdB} data type
@since 3.1.0
*/
public dB getNoiseFigure() {
        return noiseFigure;
    }

/**
Set the ratio of the output noise power to the portion of noise power attributable to thermal noise in the input termination at 290 Kelvins. Noise Figure is related to Noise Temperature by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).

@param value the NoiseFigure value in a {@link TdB} data type
@since 3.1.0
*/
public void setNoiseFigure(dB value) {
        this.noiseFigure = value;
    }

/**
Determine if the NoiseFigure is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNoiseFigure() {
        return (this.noiseFigure!= null);
    }

/**
Get the absolute temperature of a passive system having an available noise power per unit bandwidth at a specified frequency equal to that of the actual terminals of a network. Noise Figure is related to Noise Temperature by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).

@return the NoiseTemp value in a {@link TKelvins} data type
@since 3.1.0
*/
public Kelvins getNoiseTemp() {
        return noiseTemp;
    }

/**
Set the absolute temperature of a passive system having an available noise power per unit bandwidth at a specified frequency equal to that of the actual terminals of a network. Noise Figure is related to Noise Temperature by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).

@param value the NoiseTemp value in a {@link TKelvins} data type
@since 3.1.0
*/
public void setNoiseTemp(Kelvins value) {
        this.noiseTemp = value;
    }

/**
Determine if the NoiseTemp is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNoiseTemp() {
        return (this.noiseTemp!= null);
    }

/**
Get the criteria used to determine the minimum RF signal power present at the input terminals that ensures acceptable detection and demodulation of the desired signal.

@return the SensitivityCriteriaType value in a {@link TString} data type
@since 3.1.0
*/
public TString getSensitivityCriteriaType() {
        return sensitivityCriteriaType;
    }

/**
Set the criteria used to determine the minimum RF signal power present at the input terminals that ensures acceptable detection and demodulation of the desired signal.

@param value the SensitivityCriteriaType value in a {@link TString} data type
@since 3.1.0
*/
public void setSensitivityCriteriaType(TString value) {
        this.sensitivityCriteriaType = value;
    }

/**
Determine if the SensitivityCriteriaType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSensitivityCriteriaType() {
return (this.sensitivityCriteriaType!= null ? this.sensitivityCriteriaType.isSetValue() : false);
    }

/**
Get the value of the criteria; the meaning and unit of this value depends on the Sensitivity Criteria Type selected.

@return the SensitivityCriteriaLevel value in a {@link TSCLevel} data type
@since 3.1.0
*/
public SCLevel getSensitivityCriteriaLevel() {
        return sensitivityCriteriaLevel;
    }

/**
Set the value of the criteria; the meaning and unit of this value depends on the Sensitivity Criteria Type selected.

@param value the SensitivityCriteriaLevel value in a {@link TSCLevel} data type
@since 3.1.0
*/
public void setSensitivityCriteriaLevel(SCLevel value) {
        this.sensitivityCriteriaLevel = value;
    }

/**
Determine if the SensitivityCriteriaLevel is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSensitivityCriteriaLevel() {
        return (this.sensitivityCriteriaLevel!= null);
    }

/**
Get the value of the criteria when it cannot be expressed as a number.

@return the SensitivityCriteriaText value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getSensitivityCriteriaText() {
        return sensitivityCriteriaText;
    }

/**
Set the value of the criteria when it cannot be expressed as a number.

@param value the SensitivityCriteriaText value in a {@link TS50} data type
@since 3.1.0
*/
public void setSensitivityCriteriaText(S50 value) {
        this.sensitivityCriteriaText = value;
    }

/**
Determine if the SensitivityCriteriaText is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSensitivityCriteriaText() {
        return (this.sensitivityCriteriaText!= null);
    }

/**
Get the maximum post detection frequency at the baseband half-power point.

@return the PostDetectionFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getPostDetectionFreqMin() {
        return postDetectionFreqMin;
    }

/**
Set the maximum post detection frequency at the baseband half-power point.

@param value the PostDetectionFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setPostDetectionFreqMin(FreqM value) {
        this.postDetectionFreqMin = value;
    }

/**
Determine if the PostDetectionFreqMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPostDetectionFreqMin() {
        return (this.postDetectionFreqMin!= null);
    }

/**
Get the maximum post detection frequency at the baseband half-power point.

[XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than PostDetectionFreqMin.

@return the PostDetectionFreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getPostDetectionFreqMax() {
        return postDetectionFreqMax;
    }

/**
Set the maximum post detection frequency at the baseband half-power point.

[XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than PostDetectionFreqMin.

@param value the PostDetectionFreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setPostDetectionFreqMax(FreqM value) {
        this.postDetectionFreqMax = value;
    }

/**
Determine if the PostDetectionFreqMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPostDetectionFreqMax() {
        return (this.postDetectionFreqMax!= null);
    }

/**
Get the minimum ratio of the post processing signal-to-noise ratio to the received signal-to-noise ratio.

@return the ProcessingGainMin value in a {@link TdB} data type
@since 3.1.0
*/
public dB getProcessingGainMin() {
        return processingGainMin;
    }

/**
Set the minimum ratio of the post processing signal-to-noise ratio to the received signal-to-noise ratio.

@param value the ProcessingGainMin value in a {@link TdB} data type
@since 3.1.0
*/
public void setProcessingGainMin(dB value) {
        this.processingGainMin = value;
    }

/**
Determine if the ProcessingGainMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetProcessingGainMin() {
        return (this.processingGainMin != null);
    }

/**
Get the maximum ratio of the post processing signal-to-noise ratio to the received signal-to-noise ratio.

[XSL ERR MINMAX] If ProcessingGainMax is used, it MUST be greater than ProcessingGainMin.

@return the ProcessingGainMax value in a {@link TdB} data type
@since 3.1.0
*/
public dB getProcessingGainMax() {
        return processingGainMax;
    }

/**
Set the maximum ratio of the post processing signal-to-noise ratio to the received signal-to-noise ratio.

[XSL ERR MINMAX] If ProcessingGainMax is used, it MUST be greater than ProcessingGainMin.

@param value the ProcessingGainMax value in a {@link TdB} data type
@since 3.1.0
*/
public void setProcessingGainMax(dB value) {
        this.processingGainMax = value;
    }

/**
Determine if the ProcessingGainMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetProcessingGainMax() {
        return (this.processingGainMax!= null);
    }

/**
Get the spurious receiver responses that arise when strong undesired signals and the receiver local oscillator (LO) combine in the mixer to produce a frequency on or near the intermediate frequency. The rejection is the ratio in dB of a particular out-of-band frequency (outside the fundamental IF bandwidth) signal level required to produce a specified output, to the signal level required to produce the same output.

@return the SpuriousRejection value in a {@link TRejection_DB1} data type
@since 3.1.0
*/
public Rejection_dB1 getSpuriousRejection() {
        return spuriousRejection;
    }

/**
Set the spurious receiver responses that arise when strong undesired signals and the receiver local oscillator (LO) combine in the mixer to produce a frequency on or near the intermediate frequency. The rejection is the ratio in dB of a particular out-of-band frequency (outside the fundamental IF bandwidth) signal level required to produce a specified output, to the signal level required to produce the same output.

@param value the SpuriousRejection value in a {@link TRejection_DB1} data type
@since 3.1.0
*/
public void setSpuriousRejection(Rejection_dB1 value) {
        this.spuriousRejection = value;
    }

/**
Determine if the SpuriousRejection is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSpuriousRejection() {
        return (this.spuriousRejection!= null);
    }

/**
Get the ratio of the image frequency signal level required to produce a specified output, to the desired signal level required to produce the same output. This applies to superheterodyne receivers. For example, if a receiver has a sensitivity of -100 dBm and could receive an image signal with a maximum power of -20 dBm without causing the standard response, then the receive image rejection would be 80 dB.

@return the ImageRejection value in a {@link TRejection_DB1} data type
@since 3.1.0
*/
public Rejection_dB1 getImageRejection() {
        return imageRejection;
    }

/**
Set the ratio of the image frequency signal level required to produce a specified output, to the desired signal level required to produce the same output. This applies to superheterodyne receivers. For example, if a receiver has a sensitivity of -100 dBm and could receive an image signal with a maximum power of -20 dBm without causing the standard response, then the receive image rejection would be 80 dB.

@param value the ImageRejection value in a {@link TRejection_DB1} data type
@since 3.1.0
*/
public void setImageRejection(Rejection_dB1 value) {
        this.imageRejection = value;
    }

/**
Determine if the ImageRejection is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetImageRejection() {
        return (this.imageRejection!= null);
    }

/**
Get the rejection of spurious emissions involving the mixing of two or more signals. Spurious emissions are emissions on a frequency or frequencies that are outside the necessary bandwidth and the level of which may be reduced without affecting the related transmission of information.

@return the IntermodRejection value in a {@link TRejection_DB2} data type
@since 3.1.0
*/
public Rejection_dB2 getIntermodRejection() {
        return intermodRejection;
    }

/**
Set the rejection of spurious emissions involving the mixing of two or more signals. Spurious emissions are emissions on a frequency or frequencies that are outside the necessary bandwidth and the level of which may be reduced without affecting the related transmission of information.

@param value the IntermodRejection value in a {@link TRejection_DB2} data type
@since 3.1.0
*/
public void setIntermodRejection(Rejection_dB2 value) {
        this.intermodRejection = value;
    }

/**
Determine if the IntermodRejection is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIntermodRejection() {
        return (this.intermodRejection!= null);
    }

/**
Get the ratio in dB between the wanted signal and the maximum level of an unwanted signal in the adjacent channel which still allows correct reception of the wanted signal.

@return the AdjacentChannelSelectivity value in a {@link TdB} data type
@since 3.1.0
*/
public dB getAdjacentChannelSelectivity() {
        return adjacentChannelSelectivity;
    }

/**
Set the ratio in dB between the wanted signal and the maximum level of an unwanted signal in the adjacent channel which still allows correct reception of the wanted signal.

@param value the AdjacentChannelSelectivity value in a {@link TdB} data type
@since 3.1.0
*/
public void setAdjacentChannelSelectivity(dB value) {
        this.adjacentChannelSelectivity = value;
    }

/**
Determine if the AdjacentChannelSelectivity is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAdjacentChannelSelectivity() {
        return (this.adjacentChannelSelectivity!= null);
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
Get the RxSignalTuning

Complex element RxSignalTuning indicates the tuning capabilities, the specific frequency or range of frequencies within which the equipment may tune, and the tuning increments of the equipment.

@return  a {@link RxSignalTuning} instance
@since 3.1.0
*/
    public Set<RxSignalTuning> getRxSignalTuning() {
        if (rxSignalTuning == null) {
            rxSignalTuning = new HashSet<RxSignalTuning>();
        }
        return this.rxSignalTuning;
    }

/**
Determine if the RxSignalTuning is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRxSignalTuning() {
        return ((this.rxSignalTuning!= null)&&(!this.rxSignalTuning.isEmpty()));
    }

/**
  Clear the RxSignalTuning field. This sets the field to null.
 */
    public void unsetRxSignalTuning() {
        this.rxSignalTuning = null;
    }

/**
Get the RxModulation

Complex element RxModulation contains the detailed characteristics of the modulation on the receiver side.

@return  a {@link RxModulation} instance
@since 3.1.0
*/
    public Set<RxModulation> getRxModulation() {
        if (rxModulation == null) {
            rxModulation = new HashSet<RxModulation>();
        }
        return this.rxModulation;
    }

/**
Determine if the RxModulation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRxModulation() {
        return ((this.rxModulation!= null)&&(!this.rxModulation.isEmpty()));
    }

/**
  Clear the RxModulation field. This sets the field to null.
 */
    public void unsetRxModulation() {
        this.rxModulation = null;
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
Get the FreqConversion

Complex element FreqConversion contains the characteristics of a frequency conversion stage: intermediate frequency (IF) and local oscillator (LO) parameters.

@return  a {@link FreqConversion} instance
@since 3.1.0
*/
    public Set<FreqConversion> getFreqConversion() {
        if (freqConversion == null) {
            freqConversion = new HashSet<FreqConversion>();
        }
        return this.freqConversion;
    }

/**
Determine if the FreqConversion is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqConversion() {
        return ((this.freqConversion!= null)&&(!this.freqConversion.isEmpty()));
    }

/**
  Clear the FreqConversion field. This sets the field to null.
 */
    public void unsetFreqConversion() {
        this.freqConversion = null;
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
Set a short name for the mode; this name should be a meaningful identification of the mode, but it can also be automatically generated. The Name MUST be unique within the dataset and SHOULD NOT be modified during the lifetime of the Dataset.

@param value  An instances of type {@link TS20}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withModeID(TS20 value) {
        return this;
    }

/**
Set a description of the operational mode; this description should be a meaningful explanation of the mode main characteristics.

@param value  An instances of type {@link String}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withDescription(String value) {
           setDescription(new S100(value));
        return this;
    }

/**
Set the type of receiver. If there is no suitable entry in the code list, use Other and indicate the type in a Remark.

@param value  An instances of type {@link ListCRT}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withRxType(ListCRT value) {
           setRxType(new TString(value.value()));
        return this;
    }

/**
Set the necessary bandwidth which is defined as the minimum width of the frequency band sufficient to ensure the transmission of information at the required rate and quality. This is approximately at the -20 dB level on an emission curve.

@param value  An instances of type {@link Double}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withNecessaryBw(Double value) {
           setNecessaryBw(new FreqM(value));
        return this;
    }

/**
Set the tuning capability.

@param value  An instances of type {@link ListCTU}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withTunability(ListCTU value) {
           setTunability(new TString(value.value()));
        return this;
    }

/**
Set the device or process used to tune the equipment through the RF spectrum.

@param value  An instances of type {@link ListCTN}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withTuningMethod(ListCTN value) {
           setTuningMethod(new TString(value.value()));
        return this;
    }

/**
Set 

@param value  An instances of type {@link Double}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withIntermodPct(Double value) {
           setIntermodPct(new Percent(value));
        return this;
    }

/**
Set 

@param value  An instances of type {@link String}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withIntermodEffect(String value) {
           setIntermodEffect(new MEMO(value));
        return this;
    }

/**
Set the minimum RF signal power level as it relates to one of the four Sensitivity Criteria Types: PWOP, SINAD, S/N or S+N/N indicated in item SensitivityCriteriaType. Note, for MDS and MTR criteria, the RF signal power level is zero and this item may be left blank in those instances.

@param value  An instances of type {@link Double}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withSensitivityLevel(Double value) {
           setSensitivityLevel(new dBm(value));
        return this;
    }

/**
Set the ratio of the output noise power to the portion of noise power attributable to thermal noise in the input termination at 290 Kelvins. Noise Figure is related to Noise Temperature by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).

@param value  An instances of type {@link Double}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withNoiseFigure(Double value) {
           setNoiseFigure(new dB(value));
        return this;
    }

/**
Set the absolute temperature of a passive system having an available noise power per unit bandwidth at a specified frequency equal to that of the actual terminals of a network. Noise Figure is related to Noise Temperature by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).

@param value  An instances of type {@link Double}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withNoiseTemp(Double value) {
           setNoiseTemp(new Kelvins(value));
        return this;
    }

/**
Set the criteria used to determine the minimum RF signal power present at the input terminals that ensures acceptable detection and demodulation of the desired signal.

@param value  An instances of type {@link ListCSE}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withSensitivityCriteriaType(ListCSE value) {
           setSensitivityCriteriaType(new TString(value.value()));
        return this;
    }

/**
Set the value of the criteria; the meaning and unit of this value depends on the Sensitivity Criteria Type selected.

@param value  An instances of type {@link Double}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withSensitivityCriteriaLevel(Double value) {
           setSensitivityCriteriaLevel(new SCLevel(value));
        return this;
    }

/**
Set the value of the criteria when it cannot be expressed as a number.

@param value  An instances of type {@link String}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withSensitivityCriteriaText(String value) {
           setSensitivityCriteriaText(new S50(value));
        return this;
    }

/**
Set the maximum post detection frequency at the baseband half-power point.

@param value  An instances of type {@link Double}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withPostDetectionFreqMin(Double value) {
           setPostDetectionFreqMin(new FreqM(value));
        return this;
    }

/**
Set the maximum post detection frequency at the baseband half-power point.

[XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than PostDetectionFreqMin.

@param value  An instances of type {@link Double}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withPostDetectionFreqMax(Double value) {
           setPostDetectionFreqMax(new FreqM(value));
        return this;
    }

/**
Set the minimum ratio of the post processing signal-to-noise ratio to the received signal-to-noise ratio.

@param value  An instances of type {@link Double}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withProcessingGainMin(Double value) {
           setProcessingGainMin(new dB(value));
        return this;
    }

/**
Set the maximum ratio of the post processing signal-to-noise ratio to the received signal-to-noise ratio.

[XSL ERR MINMAX] If ProcessingGainMax is used, it MUST be greater than ProcessingGainMin.

@param value  An instances of type {@link Double}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withProcessingGainMax(Double value) {
           setProcessingGainMax(new dB(value));
        return this;
    }

/**
Set the spurious receiver responses that arise when strong undesired signals and the receiver local oscillator (LO) combine in the mixer to produce a frequency on or near the intermediate frequency. The rejection is the ratio in dB of a particular out-of-band frequency (outside the fundamental IF bandwidth) signal level required to produce a specified output, to the signal level required to produce the same output.

@param value  An instances of type {@link Double}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withSpuriousRejection(Double value) {
           setSpuriousRejection(new Rejection_dB1(value));
        return this;
    }

/**
Set the ratio of the image frequency signal level required to produce a specified output, to the desired signal level required to produce the same output. This applies to superheterodyne receivers. For example, if a receiver has a sensitivity of -100 dBm and could receive an image signal with a maximum power of -20 dBm without causing the standard response, then the receive image rejection would be 80 dB.

@param value  An instances of type {@link Double}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withImageRejection(Double value) {
           setImageRejection(new Rejection_dB1(value));
        return this;
    }

/**
Set the rejection of spurious emissions involving the mixing of two or more signals. Spurious emissions are emissions on a frequency or frequencies that are outside the necessary bandwidth and the level of which may be reduced without affecting the related transmission of information.

@param value  An instances of type {@link Double}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withIntermodRejection(Double value) {
           setIntermodRejection(new Rejection_dB2(value));
        return this;
    }

/**
Set the ratio in dB between the wanted signal and the maximum level of an unwanted signal in the adjacent channel which still allows correct reception of the wanted signal.

@param value  An instances of type {@link Double}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withAdjacentChannelSelectivity(Double value) {
           setAdjacentChannelSelectivity(new dB(value));
        return this;
    }

/**
Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm) = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm) in FreqToleranceUnit.

@param value  An instances of type {@link TUN18_6}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withFreqTolerance(TUN18_6 value) {
        return this;
    }

/**
Set the units in which the Frequency Tolerance is expressed.

@param value  An instances of type {@link ListCFO}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withFreqToleranceUnit(ListCFO value) {
        setFreqToleranceUnit(new TString(value.value()));
        return this;
    }

/**
Set a short name for the mode.

@param value  An instances of type {@link String}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withModeName(String value) {
           setModeName(new S40(value));
        return this;
    }

/**
Set the EmsClass

Complex element EmsClass identifies the emission classification symbols that define the baseband modulating characteristics of the emission designator. The emission classification consists of the three required symbols and the two optional symbols.

@param values  One or more instances of type {@link EmsClass...}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withEmsClass(EmsClass... values) {
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
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withEmsClass(Collection<EmsClass> values) {
        if (values!= null) {
            getEmsClass().addAll(values);
        }
        return this;
    }

/**
Set the RxSignalTuning

Complex element RxSignalTuning indicates the tuning capabilities, the specific frequency or range of frequencies within which the equipment may tune, and the tuning increments of the equipment.

@param values  One or more instances of type {@link RxSignalTuning...}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withRxSignalTuning(RxSignalTuning... values) {
        if (values!= null) {
            for (RxSignalTuning value: values) {
                getRxSignalTuning().add(value);
            }
        }
        return this;
    }

/**
Set the RxSignalTuning

Complex element RxSignalTuning indicates the tuning capabilities, the specific frequency or range of frequencies within which the equipment may tune, and the tuning increments of the equipment.

@param values  A collection of {@link RxSignalTuning} instances
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withRxSignalTuning(Collection<RxSignalTuning> values) {
        if (values!= null) {
            getRxSignalTuning().addAll(values);
        }
        return this;
    }

/**
Set the RxModulation

Complex element RxModulation contains the detailed characteristics of the modulation on the receiver side.

@param values  One or more instances of type {@link RxModulation...}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withRxModulation(RxModulation... values) {
        if (values!= null) {
            for (RxModulation value: values) {
                getRxModulation().add(value);
            }
        }
        return this;
    }

/**
Set the RxModulation

Complex element RxModulation contains the detailed characteristics of the modulation on the receiver side.

@param values  A collection of {@link RxModulation} instances
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withRxModulation(Collection<RxModulation> values) {
        if (values!= null) {
            getRxModulation().addAll(values);
        }
        return this;
    }

/**
Set the Baseband

Complex element Baseband defines the parameters of the modulating or received signal.

@param values  One or more instances of type {@link Baseband...}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withBaseband(Baseband... values) {
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
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withBaseband(Collection<Baseband> values) {
        if (values!= null) {
            getBaseband().addAll(values);
        }
        return this;
    }

/**
Set the FreqConversion

Complex element FreqConversion contains the characteristics of a frequency conversion stage: intermediate frequency (IF) and local oscillator (LO) parameters.

@param values  One or more instances of type {@link FreqConversion...}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withFreqConversion(FreqConversion... values) {
        if (values!= null) {
            for (FreqConversion value: values) {
                getFreqConversion().add(value);
            }
        }
        return this;
    }

/**
Set the FreqConversion

Complex element FreqConversion contains the characteristics of a frequency conversion stage: intermediate frequency (IF) and local oscillator (LO) parameters.

@param values  A collection of {@link FreqConversion} instances
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withFreqConversion(Collection<FreqConversion> values) {
        if (values!= null) {
            getFreqConversion().addAll(values);
        }
        return this;
    }

/**
Set the Spread Spectrum

Complex element SpreadSpectrum contains characteristics of systems using spread spectrum techniques.

@param value  An instances of type {@link SpreadSpectrum}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withSpreadSpectrum(SpreadSpectrum value) {
        return this;
    }

/**
Set the list of indices referring to Curves applicable to the data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withCurves(BigInteger... values) {
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
@return The current RxMode object instance
@since 3.1.0
*/
    public RxMode withCurves(Collection<BigInteger> values) {
        if (values!= null) {
            getCurves().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this RxMode instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "RxMode {"
 + (adjacentChannelSelectivity !=null? " adjacentChannelSelectivity [" + adjacentChannelSelectivity +"]" : "") 
 + (baseband !=null? " baseband [" + baseband +"]" : "") 
 + (curves !=null? " curves [" + curves +"]" : "") 
 + (description !=null? " description [" + description +"]" : "") 
 + (emsClass !=null? " emsClass [" + emsClass +"]" : "") 
 + (freqConversion !=null? " freqConversion [" + freqConversion +"]" : "") 
 + (freqTolerance !=null? " freqTolerance [" + freqTolerance +"]" : "") 
 + (freqToleranceUnit !=null? " freqToleranceUnit [" + freqToleranceUnit +"]" : "") 
 + (imageRejection !=null? " imageRejection [" + imageRejection +"]" : "") 
 + (intermodEffect !=null? " intermodEffect [" + intermodEffect +"]" : "") 
 + (intermodPct !=null? " intermodPct [" + intermodPct +"]" : "") 
 + (intermodRejection !=null? " intermodRejection [" + intermodRejection +"]" : "") 
 + (modeID !=null? " modeID [" + modeID +"]" : "") 
 + (modeName !=null? " modeName [" + modeName +"]" : "") 
 + (necessaryBw !=null? " necessaryBw [" + necessaryBw +"]" : "") 
 + (noiseFigure !=null? " noiseFigure [" + noiseFigure +"]" : "") 
 + (noiseTemp !=null? " noiseTemp [" + noiseTemp +"]" : "") 
 + (postDetectionFreqMax !=null? " postDetectionFreqMax [" + postDetectionFreqMax +"]" : "") 
 + (postDetectionFreqMin !=null? " postDetectionFreqMin [" + postDetectionFreqMin +"]" : "") 
 + (processingGainMax !=null? " processingGainMax [" + processingGainMax +"]" : "") 
 + (processingGainMin !=null? " processingGainMin [" + processingGainMin +"]" : "") 
 + (rxModulation !=null? " rxModulation [" + rxModulation +"]" : "") 
 + (rxSignalTuning !=null? " rxSignalTuning [" + rxSignalTuning +"]" : "") 
 + (rxType !=null? " rxType [" + rxType +"]" : "") 
 + (sensitivityCriteriaLevel !=null? " sensitivityCriteriaLevel [" + sensitivityCriteriaLevel +"]" : "") 
 + (sensitivityCriteriaText !=null? " sensitivityCriteriaText [" + sensitivityCriteriaText +"]" : "") 
 + (sensitivityCriteriaType !=null? " sensitivityCriteriaType [" + sensitivityCriteriaType +"]" : "") 
 + (sensitivityLevel !=null? " sensitivityLevel [" + sensitivityLevel +"]" : "") 
 + (spreadSpectrum !=null? " spreadSpectrum [" + spreadSpectrum +"]" : "") 
 + (spuriousRejection !=null? " spuriousRejection [" + spuriousRejection +"]" : "") 
 + (tunability !=null? " tunability [" + tunability +"]" : "") 
 + (tuningMethod !=null? " tuningMethod [" + tuningMethod +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link RxMode} requires {@link S20 ModeID}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetModeID();
}

}
