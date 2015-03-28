package us.gov.dod.standard.ssrf._3_1.transmitter;

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
TxModulation contains the detailed characteristics of the modulation on the transmitter side.

Element of {@link TxMode}

Example: <pre>
* &lt;TxModulation&gt;
*   &lt;DigitalModType&gt;ASK/OOK&lt;/DigitalModType&gt;
*   &lt;MaxBitRate&gt;27000000&lt;/MaxBitRate&gt;
*   &lt;MaxDevRatio&gt;3&lt;/MaxDevRatio&gt;
* &lt;/TxModulation&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxModulation", propOrder = {
    "maxDevRatio",
    "amIdx",
    "amrmsIdx",
    "fmPeakFreqDev",
    "fmrmsFreqDev",
    "fmDeviationCode",
    "fmPeakModulationIdx",
    "carrierSuppression",
    "sidebandSuppression",
    "sidebandSuppressed",
    "keysAngle",
    "keysDesc",
    "muxLevel",
    "muxScheme",
    "symbolSize"
})
public class TxModulation
    extends RxModulation
{

/**
MaxDevRatio - Maximum Deviation Ratio (Optional) 

The deviation ratio data applicable to frequency- or phase-modulation equipment. For FM systems the deviation ratio is directly proportional to the frequency deviation of the variance of the modulator. In Data Item PM systems the deviation ratio is tied to both the amplitude of the modulating signal and phase deviation constant of the modulator. For example, for an FM system a deviation ratio of 1 indicates that a 3 kHz input frequency will cause a peak instantaneous frequency deviation of 3 kHz. a deviation ratio of 3 is the result of a 9 kHz deviation of the emission when modulated with a 3 kHz signal. Do not use this item for amplitude or pulse modulated systems.

Format is UN(5,3)
@since 3.1.0
*/
    @XmlElement(name = "MaxDevRatio", required = false)
    private UN5_3 maxDevRatio;
/**
AMIdx  - Amplitude Modulation Index (Optional) 

The amplitude modulation index, which is a unitless value for an amplitude modulation signal derived by dividing the peak modulating voltage by the peak carrier voltage. The modulation index should always be %gt; 0 and %lt; 1. If = 0, the resultant modulated waveform is a constant keyed carrier without a modulating signal. If %gt; 1, the envelope is over modulated and distorted. A typical value is 0.6

Format is UN(5,3)

Attribute group AM (Optional)
@since 3.1.0
*/
    @XmlElement(name = "AMIdx", required = false)
    private UN5_3 amIdx;
/**
AMRMSIdx  - RMS Amplitude Modulation Index (Optional) 

The RMS modulation index when analog or phase modulation is used and the baseband consists of FDM channels or multiple subcarrier signals. The RMS Amplitude Modulation Index is a unitless value for an amplitude modulation signal derived by dividing the RMS peak modulating voltage by the RMS peak carrier voltage.

Format is UN(5,3)

Attribute group AM (Optional)
@since 3.1.0
*/
    @XmlElement(name = "AMRMSIdx", required = false)
    private UN5_3 amrmsIdx;
/**
FMPeakFreqDev  - Peak Frequency Deviation (Optional) 

The peak frequency deviation when analog modulation is employed.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group FM (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FMPeakFreqDev", required = false)
    private FreqM fmPeakFreqDev;
/**
FMRmsFreqDev  - RMS Frequency Deviation (Optional) 

The Root Means Square (RMS) frequency deviation when frequency modulation (FM) is employed and the base band consists of frequency-division multiplexed (FDM) channels or multiple subcarrier signals.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group FM (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FMRMSFreqDev", required = false)
    private FreqM fmrmsFreqDev;
/**
FMDeviationCode  - Peak Frequency Deviation (Optional) 

The code that indicates the type of Root Mean Square (RMS) deviation (multichannel or per-channel).

Format is L:CFM

Attribute group FM (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FMDeviationCode", required = false)
    private TString fmDeviationCode;
/**
FMPeakModulationIdx  - FM Peak Modulation Index (Optional) 

The peak modulation index (deviation ratio) when using analog frequency or phase modulation.

Format is UN(5,3)

Attribute group FM (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FMPeakModulationIdx", required = false)
    private UN5_3 fmPeakModulationIdx;
/**
CarrierSuppression  - Level of Carrier Suppression (Optional) 

The amount of reduction of the signals carrier, as compared to a non attenuated signal carrier.

Format is UN(6,3) (dB)

Attribute group Suppression (Optional)
@since 3.1.0
*/
    @XmlElement(name = "CarrierSuppression", required = false)
    private dB carrierSuppression;
/**
SidebandSuppression  - Level of Sideband Suppression (Optional) 

The amount that one or both of the sidebands of a signal are reduced prior to transmission. “One or both" is determined by evaluation of the emission designator.

Format is UN(6,3) (dB)

Attribute group Suppression (Optional)
@since 3.1.0
*/
    @XmlElement(name = "SidebandSuppression", required = false)
    private dB sidebandSuppression;
/**
SidebandSuppressed  - Sideband Suppressed (Optional) 

The sideband that is suppressed in a single sideband signal.

Format is L:CSI

Attribute group Suppression (Optional)
@since 3.1.0
*/
    @XmlElement(name = "SidebandSuppressed", required = false)
    private TString sidebandSuppressed;
/**
US:KeysAngle - Keying Angle (Optional) 

The keying angle for the digital/analog/hybrid data stream.

Format is UN(5,2)
[0-180] (deg)
@since 3.1.0
*/
    @XmlElement(name = "KeysAngle", required = false)
    private Az180 keysAngle;
/**
US:KeysDesc - Keying Format (Optional) 

A text description of the keying format for the digital/analog/hybrid data stream.

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "KeysDesc", required = false)
    private S500 keysDesc;
/**
In Data Item US:MUXLevel (US), enter the signal power in dB referenced to the baseband carrier for the companding of the multiplexed signal.
@since 3.1.0
*/
    @XmlElement(name = "MUXLevel", required = false)
    private Signed_dB_5_2 muxLevel;
/**
In Data Item US:MUXScheme (US), enter a freetext description of the multiplexing algorithm.
@since 3.1.0
*/
    @XmlElement(name = "MUXScheme", required = false)
    private S100 muxScheme;
/**
US:SymbolSize - Symbol Size (Optional) 

The number of bits in the symbols being generated. For example, if this is a binary stream made up of bytes then the symbolSize would be 8. For Link-16 the symbolSize would be 70 since that link uses 70-bit words.

Format is UN(3) (bits)
@since 3.1.0
*/
    @XmlElement(name = "SymbolSize", required = false)
    private US_Bits symbolSize;

/**
Get the deviation ratio data applicable to frequency- or phase-modulation equipment. For FM systems the deviation ratio is directly proportional to the frequency deviation of the variance of the modulator. In Data Item PM systems the deviation ratio is tied to both the amplitude of the modulating signal and phase deviation constant of the modulator. For example, for an FM system a deviation ratio of 1 indicates that a 3 kHz input frequency will cause a peak instantaneous frequency deviation of 3 kHz. a deviation ratio of 3 is the result of a 9 kHz deviation of the emission when modulated with a 3 kHz signal. Do not use this item for amplitude or pulse modulated systems.

@return the MaxDevRatio value in a {@link TUN5_3} data type
@since 3.1.0
*/
public UN5_3 getMaxDevRatio() {
        return maxDevRatio;
    }

/**
Set the deviation ratio data applicable to frequency- or phase-modulation equipment. For FM systems the deviation ratio is directly proportional to the frequency deviation of the variance of the modulator. In Data Item PM systems the deviation ratio is tied to both the amplitude of the modulating signal and phase deviation constant of the modulator. For example, for an FM system a deviation ratio of 1 indicates that a 3 kHz input frequency will cause a peak instantaneous frequency deviation of 3 kHz. a deviation ratio of 3 is the result of a 9 kHz deviation of the emission when modulated with a 3 kHz signal. Do not use this item for amplitude or pulse modulated systems.

@param value the MaxDevRatio value in a {@link TUN5_3} data type
@since 3.1.0
*/
public void setMaxDevRatio(UN5_3 value) {
        this.maxDevRatio = value;
    }

/**
Determine if the MaxDevRatio is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMaxDevRatio() {
        return (this.maxDevRatio!= null);
    }

/**
Get the amplitude modulation index, which is a unitless value for an amplitude modulation signal derived by dividing the peak modulating voltage by the peak carrier voltage. The modulation index should always be > 0 and < 1. If = 0, the resultant modulated waveform is a constant keyed carrier without a modulating signal. If > 1, the envelope is over modulated and distorted. A typical value is 0.6

@return the AMIdx value in a {@link TUN5_3} data type
@since 3.1.0
*/
public UN5_3 getAMIdx() {
        return amIdx;
    }

/**
Set the amplitude modulation index, which is a unitless value for an amplitude modulation signal derived by dividing the peak modulating voltage by the peak carrier voltage. The modulation index should always be > 0 and < 1. If = 0, the resultant modulated waveform is a constant keyed carrier without a modulating signal. If > 1, the envelope is over modulated and distorted. A typical value is 0.6

@param value the AMIdx value in a {@link TUN5_3} data type
@since 3.1.0
*/
public void setAMIdx(UN5_3 value) {
        this.amIdx = value;
    }

/**
Determine if the AMIdx is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAMIdx() {
        return (this.amIdx!= null);
    }

/**
Get the RMS modulation index when analog or phase modulation is used and the baseband consists of FDM channels or multiple subcarrier signals. The RMS Amplitude Modulation Index is a unitless value for an amplitude modulation signal derived by dividing the RMS peak modulating voltage by the RMS peak carrier voltage.

@return the AMRMSIdx value in a {@link TUN5_3} data type
@since 3.1.0
*/
public UN5_3 getAMRMSIdx() {
        return amrmsIdx;
    }

/**
Set the RMS modulation index when analog or phase modulation is used and the baseband consists of FDM channels or multiple subcarrier signals. The RMS Amplitude Modulation Index is a unitless value for an amplitude modulation signal derived by dividing the RMS peak modulating voltage by the RMS peak carrier voltage.

@param value the AMRMSIdx value in a {@link TUN5_3} data type
@since 3.1.0
*/
public void setAMRMSIdx(UN5_3 value) {
        this.amrmsIdx = value;
    }

/**
Determine if the AMRMSIdx is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAMRMSIdx() {
        return (this.amrmsIdx!= null);
    }

/**
Get the peak frequency deviation when analog modulation is employed.

@return the FMPeakFreqDev value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFMPeakFreqDev() {
        return fmPeakFreqDev;
    }

/**
Set the peak frequency deviation when analog modulation is employed.

@param value the FMPeakFreqDev value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setFMPeakFreqDev(FreqM value) {
        this.fmPeakFreqDev = value;
    }

/**
Determine if the FMPeakFreqDev is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFMPeakFreqDev() {
        return (this.fmPeakFreqDev!= null);
    }

/**
Get the Root Means Square (RMS) frequency deviation when frequency modulation (FM) is employed and the base band consists of frequency-division multiplexed (FDM) channels or multiple subcarrier signals.

@return the FMRMSFreqDev value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFMRMSFreqDev() {
        return fmrmsFreqDev;
    }

/**
Set the Root Means Square (RMS) frequency deviation when frequency modulation (FM) is employed and the base band consists of frequency-division multiplexed (FDM) channels or multiple subcarrier signals.

@param value the FMRMSFreqDev value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setFMRMSFreqDev(FreqM value) {
        this.fmrmsFreqDev = value;
    }

/**
Determine if the FMRMSFreqDev is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFMRMSFreqDev() {
        return (this.fmrmsFreqDev!= null);
    }

/**
Get the code that indicates the type of Root Mean Square (RMS) deviation (multichannel or per-channel).

@return the FMDeviationCode value in a {@link TString} data type
@since 3.1.0
*/
public TString getFMDeviationCode() {
        return fmDeviationCode;
    }

/**
Set the code that indicates the type of Root Mean Square (RMS) deviation (multichannel or per-channel).

@param value the FMDeviationCode value in a {@link TString} data type
@since 3.1.0
*/
public void setFMDeviationCode(TString value) {
        this.fmDeviationCode = value;
    }

/**
Determine if the FMDeviationCode is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFMDeviationCode() {
return (this.fmDeviationCode!= null ? this.fmDeviationCode.isSetValue() : false);
    }

/**
Get the peak modulation index (deviation ratio) when using analog frequency or phase modulation.

@return the FMPeakModulationIdx value in a {@link TUN5_3} data type
@since 3.1.0
*/
public UN5_3 getFMPeakModulationIdx() {
        return fmPeakModulationIdx;
    }

/**
Set the peak modulation index (deviation ratio) when using analog frequency or phase modulation.

@param value the FMPeakModulationIdx value in a {@link TUN5_3} data type
@since 3.1.0
*/
public void setFMPeakModulationIdx(UN5_3 value) {
        this.fmPeakModulationIdx = value;
    }

/**
Determine if the FMPeakModulationIdx is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFMPeakModulationIdx() {
        return (this.fmPeakModulationIdx!= null);
    }

/**
Get the amount of reduction of the signals carrier, as compared to a non attenuated signal carrier.

@return the CarrierSuppression value in a {@link TdB} data type
@since 3.1.0
*/
public dB getCarrierSuppression() {
        return carrierSuppression;
    }

/**
Set the amount of reduction of the signals carrier, as compared to a non attenuated signal carrier.

@param value the CarrierSuppression value in a {@link TdB} data type
@since 3.1.0
*/
public void setCarrierSuppression(dB value) {
        this.carrierSuppression = value;
    }

/**
Determine if the CarrierSuppression is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCarrierSuppression() {
        return (this.carrierSuppression!= null);
    }

/**
Get the amount that one or both of the sidebands of a signal are reduced prior to transmission. “One or both" is determined by evaluation of the emission designator.

@return the SidebandSuppression value in a {@link TdB} data type
@since 3.1.0
*/
public dB getSidebandSuppression() {
        return sidebandSuppression;
    }

/**
Set the amount that one or both of the sidebands of a signal are reduced prior to transmission. “One or both" is determined by evaluation of the emission designator.

@param value the SidebandSuppression value in a {@link TdB} data type
@since 3.1.0
*/
public void setSidebandSuppression(dB value) {
        this.sidebandSuppression = value;
    }

/**
Determine if the SidebandSuppression is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSidebandSuppression() {
        return (this.sidebandSuppression!= null);
    }

/**
Get the sideband that is suppressed in a single sideband signal.

@return the SidebandSuppressed value in a {@link TString} data type
@since 3.1.0
*/
public TString getSidebandSuppressed() {
        return sidebandSuppressed;
    }

/**
Set the sideband that is suppressed in a single sideband signal.

@param value the SidebandSuppressed value in a {@link TString} data type
@since 3.1.0
*/
public void setSidebandSuppressed(TString value) {
        this.sidebandSuppressed = value;
    }

/**
Determine if the SidebandSuppressed is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSidebandSuppressed() {
return (this.sidebandSuppressed!= null ? this.sidebandSuppressed.isSetValue() : false);
    }

/**
Get the keying angle for the digital/analog/hybrid data stream.

@return the KeysAngle value in a {@link TAz180} data type
@since 3.1.0
*/
public Az180 getKeysAngle() {
        return keysAngle;
    }

/**
Set the keying angle for the digital/analog/hybrid data stream.

@param value the KeysAngle value in a {@link TAz180} data type
@since 3.1.0
*/
public void setKeysAngle(Az180 value) {
        this.keysAngle = value;
    }

/**
Determine if the KeysAngle is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetKeysAngle() {
        return (this.keysAngle!= null);
    }

/**
Get a text description of the keying format for the digital/analog/hybrid data stream.

@return the KeysDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getKeysDesc() {
        return keysDesc;
    }

/**
Set a text description of the keying format for the digital/analog/hybrid data stream.

@param value the KeysDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setKeysDesc(S500 value) {
        this.keysDesc = value;
    }

/**
Determine if the KeysDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetKeysDesc() {
        return (this.keysDesc!= null);
    }

/**
Get In Data Item US:MUXLevel (US), enter the signal power in dB referenced to the baseband carrier for the companding of the multiplexed signal.

@return the MUXLevel value in a {@link TSigned_DB_5_2} data type
@since 3.1.0
*/
public Signed_dB_5_2 getMUXLevel() {
        return muxLevel;
    }

/**
Set In Data Item US:MUXLevel (US), enter the signal power in dB referenced to the baseband carrier for the companding of the multiplexed signal.

@param value the MUXLevel value in a {@link TSigned_DB_5_2} data type
@since 3.1.0
*/
public void setMUXLevel(Signed_dB_5_2 value) {
        this.muxLevel = value;
    }

/**
Determine if the MUXLevel is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMUXLevel() {
        return (this.muxLevel!= null);
    }

/**
Get In Data Item US:MUXScheme (US), enter a freetext description of the multiplexing algorithm.

@return the MUXScheme value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getMUXScheme() {
        return muxScheme;
    }

/**
Set In Data Item US:MUXScheme (US), enter a freetext description of the multiplexing algorithm.

@param value the MUXScheme value in a {@link TS100} data type
@since 3.1.0
*/
public void setMUXScheme(S100 value) {
        this.muxScheme = value;
    }

/**
Determine if the MUXScheme is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMUXScheme() {
        return (this.muxScheme!= null);
    }

/**
Get the number of bits in the symbols being generated. For example, if this is a binary stream made up of bytes then the symbolSize would be 8. For Link-16 the symbolSize would be 70 since that link uses 70-bit words.

@return the SymbolSize value in a {@link TUS_Bits} data type
@since 3.1.0
*/
public US_Bits getSymbolSize() {
        return symbolSize;
    }

/**
Set the number of bits in the symbols being generated. For example, if this is a binary stream made up of bytes then the symbolSize would be 8. For Link-16 the symbolSize would be 70 since that link uses 70-bit words.

@param value the SymbolSize value in a {@link TUS_Bits} data type
@since 3.1.0
*/
public void setSymbolSize(US_Bits value) {
        this.symbolSize = value;
    }

/**
Determine if the SymbolSize is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSymbolSize() {
        return (this.symbolSize!= null);
    }

/**
Set the deviation ratio data applicable to frequency- or phase-modulation equipment. For FM systems the deviation ratio is directly proportional to the frequency deviation of the variance of the modulator. In Data Item PM systems the deviation ratio is tied to both the amplitude of the modulating signal and phase deviation constant of the modulator. For example, for an FM system a deviation ratio of 1 indicates that a 3 kHz input frequency will cause a peak instantaneous frequency deviation of 3 kHz. a deviation ratio of 3 is the result of a 9 kHz deviation of the emission when modulated with a 3 kHz signal. Do not use this item for amplitude or pulse modulated systems.

@param value  An instances of type {@link Double}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withMaxDevRatio(Double value) {
           setMaxDevRatio(new UN5_3(value));
        return this;
    }

/**
Set the amplitude modulation index, which is a unitless value for an amplitude modulation signal derived by dividing the peak modulating voltage by the peak carrier voltage. The modulation index should always be > 0 and < 1. If = 0, the resultant modulated waveform is a constant keyed carrier without a modulating signal. If > 1, the envelope is over modulated and distorted. A typical value is 0.6

@param value  An instances of type {@link Double}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withAMIdx(Double value) {
           setAMIdx(new UN5_3(value));
        return this;
    }

/**
Set the RMS modulation index when analog or phase modulation is used and the baseband consists of FDM channels or multiple subcarrier signals. The RMS Amplitude Modulation Index is a unitless value for an amplitude modulation signal derived by dividing the RMS peak modulating voltage by the RMS peak carrier voltage.

@param value  An instances of type {@link Double}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withAMRMSIdx(Double value) {
           setAMRMSIdx(new UN5_3(value));
        return this;
    }

/**
Set the peak frequency deviation when analog modulation is employed.

@param value  An instances of type {@link Double}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withFMPeakFreqDev(Double value) {
           setFMPeakFreqDev(new FreqM(value));
        return this;
    }

/**
Set the Root Means Square (RMS) frequency deviation when frequency modulation (FM) is employed and the base band consists of frequency-division multiplexed (FDM) channels or multiple subcarrier signals.

@param value  An instances of type {@link Double}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withFMRMSFreqDev(Double value) {
           setFMRMSFreqDev(new FreqM(value));
        return this;
    }

/**
Set the code that indicates the type of Root Mean Square (RMS) deviation (multichannel or per-channel).

@param value  An instances of type {@link ListCFM}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withFMDeviationCode(ListCFM value) {
           setFMDeviationCode(new TString(value.value()));
        return this;
    }

/**
Set the peak modulation index (deviation ratio) when using analog frequency or phase modulation.

@param value  An instances of type {@link Double}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withFMPeakModulationIdx(Double value) {
           setFMPeakModulationIdx(new UN5_3(value));
        return this;
    }

/**
Set the amount of reduction of the signals carrier, as compared to a non attenuated signal carrier.

@param value  An instances of type {@link Double}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withCarrierSuppression(Double value) {
           setCarrierSuppression(new dB(value));
        return this;
    }

/**
Set the amount that one or both of the sidebands of a signal are reduced prior to transmission. “One or both" is determined by evaluation of the emission designator.

@param value  An instances of type {@link Double}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withSidebandSuppression(Double value) {
           setSidebandSuppression(new dB(value));
        return this;
    }

/**
Set the sideband that is suppressed in a single sideband signal.

@param value  An instances of type {@link ListCSI}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withSidebandSuppressed(ListCSI value) {
           setSidebandSuppressed(new TString(value.value()));
        return this;
    }

/**
Set the keying angle for the digital/analog/hybrid data stream.

@param value  An instances of type {@link Double}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withKeysAngle(Double value) {
           setKeysAngle(new Az180(value));
        return this;
    }

/**
Set a text description of the keying format for the digital/analog/hybrid data stream.

@param value  An instances of type {@link String}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withKeysDesc(String value) {
           setKeysDesc(new S500(value));
        return this;
    }

/**
Set In Data Item US:MUXLevel (US), enter the signal power in dB referenced to the baseband carrier for the companding of the multiplexed signal.

@param value  An instances of type {@link Double}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withMUXLevel(Double value) {
           setMUXLevel(new Signed_dB_5_2(value));
        return this;
    }

/**
Set In Data Item US:MUXScheme (US), enter a freetext description of the multiplexing algorithm.

@param value  An instances of type {@link String}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withMUXScheme(String value) {
           setMUXScheme(new S100(value));
        return this;
    }

/**
Set the number of bits in the symbols being generated. For example, if this is a binary stream made up of bytes then the symbolSize would be 8. For Link-16 the symbolSize would be 70 since that link uses 70-bit words.

@param value  An instances of type {@link Double}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withSymbolSize(Double value) {
           setSymbolSize(new US_Bits(value));
        return this;
    }

    @Override
/**
Set the type of digital modulation.

@param value  An instances of type {@link ListCMO}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withDigitalModType(ListCMO value) {
           setDigitalModType(new TString(value.value()));
        return this;
    }

    @Override
/**
Set the maximum bit rate in kilobits per second applicable to digital communications systems. For spread spectrum transmissions enter the bit rate after error-correction coding. Do not enter the spectrum-spreading clock or chip rate.

@param value  An instances of type {@link Double}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withMaxBitRate(Double value) {
           setMaxBitRate(new BitRate(value));
        return this;
    }

    @Override
/**
Set the total number of states, e.g., 4 for 4-ary Phase Shift-Keying, 64 for 64 level Quadrature AM.

@param value  An instances of type {@link Integer}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withNumStates(Integer value) {
           setNumStates(new UN5(value));
        return this;
    }

    @Override
/**
Set the format used to represent binary digit sequencing when digital modulation is used.

@param value  An instances of type {@link ListCDF}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withLineCoding(ListCDF value) {
           setLineCoding(new TString(value.value()));
        return this;
    }

    @Override
/**
Set the pseudorandom code rate.

@param value  An instances of type {@link Double}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withCodeRate(Double value) {
           setCodeRate(new BitRate(value));
        return this;
    }

    @Override
/**
Set the length of time of the pseudorandom code repetition period.

@param value  An instances of type {@link Double}
@return The current TxModulation object instance
@since 3.1.0
*/
    public TxModulation withCodePeriod(Double value) {
           setCodePeriod(new microsecs(value));
        return this;
    }

/**
 Get a string representation of this TxModulation instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "TxModulation {"
 + (amIdx !=null? " amIdx [" + amIdx +"]" : "") 
 + (amrmsIdx !=null? " amrmsIdx [" + amrmsIdx +"]" : "") 
 + (carrierSuppression !=null? " carrierSuppression [" + carrierSuppression +"]" : "") 
 + (fmDeviationCode !=null? " fmDeviationCode [" + fmDeviationCode +"]" : "") 
 + (fmPeakFreqDev !=null? " fmPeakFreqDev [" + fmPeakFreqDev +"]" : "") 
 + (fmPeakModulationIdx !=null? " fmPeakModulationIdx [" + fmPeakModulationIdx +"]" : "") 
 + (fmrmsFreqDev !=null? " fmrmsFreqDev [" + fmrmsFreqDev +"]" : "") 
 + (keysAngle !=null? " keysAngle [" + keysAngle +"]" : "") 
 + (keysDesc !=null? " keysDesc [" + keysDesc +"]" : "") 
 + (maxDevRatio !=null? " maxDevRatio [" + maxDevRatio +"]" : "") 
 + (muxLevel !=null? " muxLevel [" + muxLevel +"]" : "") 
 + (muxScheme !=null? " muxScheme [" + muxScheme +"]" : "") 
 + (sidebandSuppressed !=null? " sidebandSuppressed [" + sidebandSuppressed +"]" : "") 
 + (sidebandSuppression !=null? " sidebandSuppression [" + sidebandSuppression +"]" : "") 
 + (symbolSize !=null? " symbolSize [" + symbolSize +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link TxModulation} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
