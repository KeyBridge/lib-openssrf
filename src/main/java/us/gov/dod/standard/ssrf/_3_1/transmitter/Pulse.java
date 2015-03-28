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
Pulse contains the pulse characteristics for equipments using a pulsed emission. It includes the parameters of the pulse time cycle and the pulse shape.

Element of {@link TxMode}

Example: <pre>
* &lt;Pulse&gt;
*   &lt;PRRMin cls="U"&gt;300&lt;/PRRMin&gt;
*   &lt;PDMin cls="U"&gt;12&lt;/PDMin&gt;
*   &lt;DutyCycleMax cls="U"&gt;50&lt;/DutyCycleMax&gt;
*   &lt;AvgPowerMin cls="U"&gt;20&lt;/AvgPowerMin&gt;
* &lt;/Pulse&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pulse", propOrder = {
    "prrMin",
    "prrMax",
    "pdMin",
    "pdMax",
    "dutyCycleMin",
    "dutyCycleMax",
    "avgPowerMin",
    "avgPowerMax",
    "compRatio",
    "compMethod",
    "riseTime",
    "fallTime",
    "justifyShortRiseTime",
    "radarProcessingGainMax",
    "numSubpulses"
})
public class Pulse {

/**
PRRMin  - Minimum or Nominal Pulse
Repetition Rate (Optional) 

The numeric value for the pulse repetition rate (PRR) of the equipment. For equipment having a capability for continuously variable PRR over a wide range(s), insert the minimum value in this attribute and the maximum value in maxPRR.

Format is UN(9,3) (pulses/sec)

Attribute group PulseCycle (Optional)
@since 3.1.0
*/
    @XmlElement(name = "PRRMin", required = false)
    private PulseRate prrMin;
/**
PRRMax  - Maximum Pulse Repetition Rate (Optional) 

For equipment having a capability for continuously variable PRR over a wide range.

[XSL ERR MINMAX] If PRRMax is used, it MUST be greater than PRRMin.

Format is UN(9,3) (pulses/sec)

Attribute group PulseCycle (Optional)
@since 3.1.0
*/
    @XmlElement(name = "PRRMax", required = false)
    private PulseRate prrMax;
/**
PDMin  - Minimum or Nominal Pulse
Duration (Optional) 

A numeric value indicating the characteristic pulse duration of the equipment at the half-power (-3 dB) points.  For equipment having a capability for continuously variable PDs over a wide range, insert the minimum value in this attribute and the maximum value in maxPD.

Format is UN(12,6) (μsec)

Attribute group PulseCycle (Optional)
@since 3.1.0
*/
    @XmlElement(name = "PDMin", required = false)
    private microsecs pdMin;
/**
PDMax  - Maximum Pulse Duration (Optional) 

For equipment having a capability for continuously variable PD over a wide range.

[XSL ERR MINMAX] If PDMax is used, it MUST be greater than PDMin.

Format is UN(12,6) (μsec)

Attribute group PulseCycle (Optional)
@since 3.1.0
*/
    @XmlElement(name = "PDMax", required = false)
    private microsecs pdMax;
/**
DutyCycleMin  - Minimum/Nominal Duty Cycle Ratio (Optional) 

As a percentage, the minimum or nominal ratio of the pulse duration to the pulse period.

Format is UN(4,2) [0..100] (%)

Attribute group PulseAvgCycle (Optional)
@since 3.1.0
*/
    @XmlElement(name = "DutyCycleMin", required = false)
    private Percent dutyCycleMin;
/**
DutyCycleMax - Maximum Duty Cycle Ratio (Optional) 

As a percentage, the maximum ratio of the pulse duration to the pulse period.

[XSL ERR MINMAX] If DutyCycleMax is used, it MUST be greater than DutyCycleMin.

Format is UN(4,2) [0..100] (%)

Attribute group PulseAvgCycle (Optional)
@since 3.1.0
*/
    @XmlElement(name = "DutyCycleMax", required = false)
    private Percent dutyCycleMax;
/**
AvgPowerMin - Minimum/Nominal Average Power (Optional) 

The minimum or nominal average power.

Format is SN(10,7) (dBW)

Attribute group PulseAvgCycle (Optional)
@since 3.1.0
*/
    @XmlElement(name = "AvgPowerMin", required = false)
    private dBW avgPowerMin;
/**
AvgPowerMax - Maximum Average Power (Optional) 

 the maximum average power.

[XSL ERR MINMAX] If AvgPowerMax is used, it MUST be greater than AvgPowerMin.

Format is SN(10,7) (dBW)

Attribute group PulseAvgCycle (Optional)
@since 3.1.0
*/
    @XmlElement(name = "AvgPowerMax", required = false)
    private dBW avgPowerMax;
/**
CompRatio - Pulse Compression Ratio (Optional) 

The ratio of the uncompressed pulse width to the compressed pulse width measured at the 50% amplitude (-3 dB) points.

Format is UN(8,4)

Attribute group PulseComp (Optional)
@since 3.1.0
*/
    @XmlElement(name = "CompRatio", required = false)
    private UN8_4 compRatio;
/**
CompMethod  - Pulse Compression Method (Optional) 

The method employed to reduce the period of the pulse.

Format is S40

Attribute group PulseComp (Optional)
@since 3.1.0
*/
    @XmlElement(name = "CompMethod", required = false)
    private S40 compMethod;
/**
JustifyShortRiseTime  - Justification for Short Rise Time (Optional) 

An operational justification for short pulse rise time. This is required if the transmitter is a pulsed Group B, C, or radar, and either: (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1 microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall Time is less than 0.01 microseconds.

Format is Memo

Attribute group PulseForm (Optional)
@since 3.1.0
*/
    @XmlElement(name = "RiseTime", required = false)
    private microsecs riseTime;
/**
FallTime - Fall Time (Optional) 

The pulse fall time from 90 to 10 percent of the pulse.

Format is UN(12,6) (μsec)

Attribute group PulseForm (Optional)
@since 3.1.0
*/
    @XmlElement(name = "FallTime", required = false)
    private microsecs fallTime;
/**
JustifyShortRiseTime  - Justification for Short Rise Time (Optional) 

An operational justification for short pulse rise time. This is required if the transmitter is a pulsed Group B, C, or radar, and either: (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1 microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall Time is less than 0.01 microseconds.

Format is Memo

Attribute group PulseForm (Optional)
@since 3.1.0
*/
    @XmlElement(name = "JustifyShortRiseTime", required = false)
    private MEMO justifyShortRiseTime;
/**
RadarProcessingGainMax - Maximum Radar Processing Gain (Optional) 

The maximum ratio of the post-processing signal-to-noise ratio to the received signal-to-noise ratio. This only applies when the Radar Type is "FM Pulse".

Format is SN(6,3) (dB)
@since 3.1.0
*/
    @XmlElement(name = "RadarProcessingGainMax", required = false)
    private dB radarProcessingGainMax;
/**
NumSubpulses  - Number of Subpulses (Optional) 

The total number of subpulses (chips) contained in a radar coded pulse. This only applies when the Radar Type is "FM Pulse" or "Coded Pulse".

Format is UN(10)
@since 3.1.0
*/
    @XmlElement(name = "NumSubpulses", required = false)
    private UN10 numSubpulses;

/**
Get the numeric value for the pulse repetition rate (PRR) of the equipment. For equipment having a capability for continuously variable PRR over a wide range(s), insert the minimum value in this attribute and the maximum value in maxPRR.

@return the PRRMin value in a {@link PulseRate} data type
@since 3.1.0
*/
public PulseRate getPRRMin() {
        return prrMin;
    }

/**
Set the numeric value for the pulse repetition rate (PRR) of the equipment. For equipment having a capability for continuously variable PRR over a wide range(s), insert the minimum value in this attribute and the maximum value in maxPRR.

@param value the PRRMin value in a {@link PulseRate} data type
@since 3.1.0
*/
public void setPRRMin(PulseRate value) {
        this.prrMin = value;
    }

/**
Determine if the PRRMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRRMin() {
        return (this.prrMin!= null);
    }

/**
Get for equipment having a capability for continuously variable PRR over a wide range.

[XSL ERR MINMAX] If PRRMax is used, it MUST be greater than PRRMin.

@return the PRRMax value in a {@link PulseRate} data type
@since 3.1.0
*/
public PulseRate getPRRMax() {
        return prrMax;
    }

/**
Set for equipment having a capability for continuously variable PRR over a wide range.

[XSL ERR MINMAX] If PRRMax is used, it MUST be greater than PRRMin.

@param value the PRRMax value in a {@link PulseRate} data type
@since 3.1.0
*/
public void setPRRMax(PulseRate value) {
        this.prrMax = value;
    }

/**
Determine if the PRRMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRRMax() {
        return (this.prrMax!= null);
    }

/**
Get a numeric value indicating the characteristic pulse duration of the equipment at the half-power (-3 dB) points.  For equipment having a capability for continuously variable PDs over a wide range, insert the minimum value in this attribute and the maximum value in maxPD.

@return the PDMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPDMin() {
        return pdMin;
    }

/**
Set a numeric value indicating the characteristic pulse duration of the equipment at the half-power (-3 dB) points.  For equipment having a capability for continuously variable PDs over a wide range, insert the minimum value in this attribute and the maximum value in maxPD.

@param value the PDMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPDMin(microsecs value) {
        this.pdMin = value;
    }

/**
Determine if the PDMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDMin() {
        return (this.pdMin!= null);
    }

/**
Get for equipment having a capability for continuously variable PD over a wide range.

[XSL ERR MINMAX] If PDMax is used, it MUST be greater than PDMin.

@return the PDMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPDMax() {
        return pdMax;
    }

/**
Set for equipment having a capability for continuously variable PD over a wide range.

[XSL ERR MINMAX] If PDMax is used, it MUST be greater than PDMin.

@param value the PDMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPDMax(microsecs value) {
        this.pdMax = value;
    }

/**
Determine if the PDMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDMax() {
        return (this.pdMax!= null);
    }

/**
Get as a percentage, the minimum or nominal ratio of the pulse duration to the pulse period.

@return the DutyCycleMin value in a {@link TPercent} data type
@since 3.1.0
*/
public Percent getDutyCycleMin() {
        return dutyCycleMin;
    }

/**
Set as a percentage, the minimum or nominal ratio of the pulse duration to the pulse period.

@param value the DutyCycleMin value in a {@link TPercent} data type
@since 3.1.0
*/
public void setDutyCycleMin(Percent value) {
        this.dutyCycleMin = value;
    }

/**
Determine if the DutyCycleMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDutyCycleMin() {
        return (this.dutyCycleMin!= null);
    }

/**
Get as a percentage, the maximum ratio of the pulse duration to the pulse period.

[XSL ERR MINMAX] If DutyCycleMax is used, it MUST be greater than DutyCycleMin.

@return the DutyCycleMax value in a {@link TPercent} data type
@since 3.1.0
*/
public Percent getDutyCycleMax() {
        return dutyCycleMax;
    }

/**
Set as a percentage, the maximum ratio of the pulse duration to the pulse period.

[XSL ERR MINMAX] If DutyCycleMax is used, it MUST be greater than DutyCycleMin.

@param value the DutyCycleMax value in a {@link TPercent} data type
@since 3.1.0
*/
public void setDutyCycleMax(Percent value) {
        this.dutyCycleMax = value;
    }

/**
Determine if the DutyCycleMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDutyCycleMax() {
        return (this.dutyCycleMax!= null);
    }

/**
Get the minimum or nominal average power.

@return the AvgPowerMin value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getAvgPowerMin() {
        return avgPowerMin;
    }

/**
Set the minimum or nominal average power.

@param value the AvgPowerMin value in a {@link TdBW} data type
@since 3.1.0
*/
public void setAvgPowerMin(dBW value) {
        this.avgPowerMin = value;
    }

/**
Determine if the AvgPowerMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAvgPowerMin() {
        return (this.avgPowerMin!= null);
    }

/**
Get  the maximum average power.

[XSL ERR MINMAX] If AvgPowerMax is used, it MUST be greater than AvgPowerMin.

@return the AvgPowerMax value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getAvgPowerMax() {
        return avgPowerMax;
    }

/**
Set  the maximum average power.

[XSL ERR MINMAX] If AvgPowerMax is used, it MUST be greater than AvgPowerMin.

@param value the AvgPowerMax value in a {@link TdBW} data type
@since 3.1.0
*/
public void setAvgPowerMax(dBW value) {
        this.avgPowerMax = value;
    }

/**
Determine if the AvgPowerMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAvgPowerMax() {
        return (this.avgPowerMax!= null);
    }

/**
Get the ratio of the uncompressed pulse width to the compressed pulse width measured at the 50% amplitude (-3 dB) points.

@return the CompRatio value in a {@link TUN8_4} data type
@since 3.1.0
*/
public UN8_4 getCompRatio() {
        return compRatio;
    }

/**
Set the ratio of the uncompressed pulse width to the compressed pulse width measured at the 50% amplitude (-3 dB) points.

@param value the CompRatio value in a {@link TUN8_4} data type
@since 3.1.0
*/
public void setCompRatio(UN8_4 value) {
        this.compRatio = value;
    }

/**
Determine if the CompRatio is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCompRatio() {
        return (this.compRatio!= null);
    }

/**
Get the method employed to reduce the period of the pulse.

@return the CompMethod value in a {@link TS40} data type
@since 3.1.0
*/
public S40 getCompMethod() {
        return compMethod;
    }

/**
Set the method employed to reduce the period of the pulse.

@param value the CompMethod value in a {@link TS40} data type
@since 3.1.0
*/
public void setCompMethod(S40 value) {
        this.compMethod = value;
    }

/**
Determine if the CompMethod is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCompMethod() {
        return (this.compMethod!= null);
    }

/**
Get an operational justification for short pulse rise time. This is required if the transmitter is a pulsed Group B, C, or radar, and either: (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1 microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall Time is less than 0.01 microseconds.

@return the RiseTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getRiseTime() {
        return riseTime;
    }

/**
Set an operational justification for short pulse rise time. This is required if the transmitter is a pulsed Group B, C, or radar, and either: (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1 microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall Time is less than 0.01 microseconds.

@param value the RiseTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setRiseTime(microsecs value) {
        this.riseTime = value;
    }

/**
Determine if the RiseTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRiseTime() {
        return (this.riseTime!= null);
    }

/**
Get the pulse fall time from 90 to 10 percent of the pulse.

@return the FallTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getFallTime() {
        return fallTime;
    }

/**
Set the pulse fall time from 90 to 10 percent of the pulse.

@param value the FallTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setFallTime(microsecs value) {
        this.fallTime = value;
    }

/**
Determine if the FallTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFallTime() {
        return (this.fallTime!= null);
    }

/**
Get an operational justification for short pulse rise time. This is required if the transmitter is a pulsed Group B, C, or radar, and either: (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1 microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall Time is less than 0.01 microseconds.

@return the JustifyShortRiseTime value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getJustifyShortRiseTime() {
        return justifyShortRiseTime;
    }

/**
Set an operational justification for short pulse rise time. This is required if the transmitter is a pulsed Group B, C, or radar, and either: (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1 microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall Time is less than 0.01 microseconds.

@param value the JustifyShortRiseTime value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setJustifyShortRiseTime(MEMO value) {
        this.justifyShortRiseTime = value;
    }

/**
Determine if the JustifyShortRiseTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetJustifyShortRiseTime() {
        return (this.justifyShortRiseTime!= null);
    }

/**
Get the maximum ratio of the post-processing signal-to-noise ratio to the received signal-to-noise ratio. This only applies when the Radar Type is "FM Pulse".

@return the RadarProcessingGainMax value in a {@link TdB} data type
@since 3.1.0
*/
public dB getRadarProcessingGainMax() {
        return radarProcessingGainMax;
    }

/**
Set the maximum ratio of the post-processing signal-to-noise ratio to the received signal-to-noise ratio. This only applies when the Radar Type is "FM Pulse".

@param value the RadarProcessingGainMax value in a {@link TdB} data type
@since 3.1.0
*/
public void setRadarProcessingGainMax(dB value) {
        this.radarProcessingGainMax = value;
    }

/**
Determine if the RadarProcessingGainMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRadarProcessingGainMax() {
        return (this.radarProcessingGainMax!= null);
    }

/**
Get the total number of subpulses (chips) contained in a radar coded pulse. This only applies when the Radar Type is "FM Pulse" or "Coded Pulse".

@return the NumSubpulses value in a {@link TUN10} data type
@since 3.1.0
*/
public UN10 getNumSubpulses() {
        return numSubpulses;
    }

/**
Set the total number of subpulses (chips) contained in a radar coded pulse. This only applies when the Radar Type is "FM Pulse" or "Coded Pulse".

@param value the NumSubpulses value in a {@link TUN10} data type
@since 3.1.0
*/
public void setNumSubpulses(UN10 value) {
        this.numSubpulses = value;
    }

/**
Determine if the NumSubpulses is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumSubpulses() {
        return (this.numSubpulses!= null);
    }

/**
Set the numeric value for the pulse repetition rate (PRR) of the equipment. For equipment having a capability for continuously variable PRR over a wide range(s), insert the minimum value in this attribute and the maximum value in maxPRR.

@param value  An instances of type {@link Double}
@return The current Pulse object instance
@since 3.1.0
*/
    public Pulse withPRRMin(Double value) {
           setPRRMin(new PulseRate(value));
        return this;
    }

/**
Set for equipment having a capability for continuously variable PRR over a wide range.

[XSL ERR MINMAX] If PRRMax is used, it MUST be greater than PRRMin.

@param value  An instances of type {@link Double}
@return The current Pulse object instance
@since 3.1.0
*/
    public Pulse withPRRMax(Double value) {
           setPRRMax(new PulseRate(value));
        return this;
    }

/**
Set a numeric value indicating the characteristic pulse duration of the equipment at the half-power (-3 dB) points.  For equipment having a capability for continuously variable PDs over a wide range, insert the minimum value in this attribute and the maximum value in maxPD.

@param value  An instances of type {@link Double}
@return The current Pulse object instance
@since 3.1.0
*/
    public Pulse withPDMin(Double value) {
           setPDMin(new microsecs(value));
        return this;
    }

/**
Set for equipment having a capability for continuously variable PD over a wide range.

[XSL ERR MINMAX] If PDMax is used, it MUST be greater than PDMin.

@param value  An instances of type {@link Double}
@return The current Pulse object instance
@since 3.1.0
*/
    public Pulse withPDMax(Double value) {
           setPDMax(new microsecs(value));
        return this;
    }

/**
Set as a percentage, the minimum or nominal ratio of the pulse duration to the pulse period.

@param value  An instances of type {@link Double}
@return The current Pulse object instance
@since 3.1.0
*/
    public Pulse withDutyCycleMin(Double value) {
           setDutyCycleMin(new Percent(value));
        return this;
    }

/**
Set as a percentage, the maximum ratio of the pulse duration to the pulse period.

[XSL ERR MINMAX] If DutyCycleMax is used, it MUST be greater than DutyCycleMin.

@param value  An instances of type {@link Double}
@return The current Pulse object instance
@since 3.1.0
*/
    public Pulse withDutyCycleMax(Double value) {
           setDutyCycleMax(new Percent(value));
        return this;
    }

/**
Set the minimum or nominal average power.

@param value  An instances of type {@link Double}
@return The current Pulse object instance
@since 3.1.0
*/
    public Pulse withAvgPowerMin(Double value) {
           setAvgPowerMin(new dBW(value));
        return this;
    }

/**
Set  the maximum average power.

[XSL ERR MINMAX] If AvgPowerMax is used, it MUST be greater than AvgPowerMin.

@param value  An instances of type {@link Double}
@return The current Pulse object instance
@since 3.1.0
*/
    public Pulse withAvgPowerMax(Double value) {
           setAvgPowerMax(new dBW(value));
        return this;
    }

/**
Set the ratio of the uncompressed pulse width to the compressed pulse width measured at the 50% amplitude (-3 dB) points.

@param value  An instances of type {@link Double}
@return The current Pulse object instance
@since 3.1.0
*/
    public Pulse withCompRatio(Double value) {
           setCompRatio(new UN8_4(value));
        return this;
    }

/**
Set the method employed to reduce the period of the pulse.

@param value  An instances of type {@link String}
@return The current Pulse object instance
@since 3.1.0
*/
    public Pulse withCompMethod(String value) {
           setCompMethod(new S40(value));
        return this;
    }

/**
Set an operational justification for short pulse rise time. This is required if the transmitter is a pulsed Group B, C, or radar, and either: (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1 microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall Time is less than 0.01 microseconds.

@param value  An instances of type {@link Double}
@return The current Pulse object instance
@since 3.1.0
*/
    public Pulse withRiseTime(Double value) {
           setRiseTime(new microsecs(value));
        return this;
    }

/**
Set the pulse fall time from 90 to 10 percent of the pulse.

@param value  An instances of type {@link Double}
@return The current Pulse object instance
@since 3.1.0
*/
    public Pulse withFallTime(Double value) {
           setFallTime(new microsecs(value));
        return this;
    }

/**
Set an operational justification for short pulse rise time. This is required if the transmitter is a pulsed Group B, C, or radar, and either: (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1 microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall Time is less than 0.01 microseconds.

@param value  An instances of type {@link String}
@return The current Pulse object instance
@since 3.1.0
*/
    public Pulse withJustifyShortRiseTime(String value) {
           setJustifyShortRiseTime(new MEMO(value));
        return this;
    }

/**
Set the maximum ratio of the post-processing signal-to-noise ratio to the received signal-to-noise ratio. This only applies when the Radar Type is "FM Pulse".

@param value  An instances of type {@link Double}
@return The current Pulse object instance
@since 3.1.0
*/
    public Pulse withRadarProcessingGainMax(Double value) {
           setRadarProcessingGainMax(new dB(value));
        return this;
    }

/**
Set the total number of subpulses (chips) contained in a radar coded pulse. This only applies when the Radar Type is "FM Pulse" or "Coded Pulse".

@param value  An instances of type {@link Integer}
@return The current Pulse object instance
@since 3.1.0
*/
    public Pulse withNumSubpulses(Integer value) {
           setNumSubpulses(new UN10(value));
        return this;
    }

/**
 Get a string representation of this Pulse instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Pulse {"
 + (avgPowerMax !=null? " avgPowerMax [" + avgPowerMax +"]" : "") 
 + (avgPowerMin !=null? " avgPowerMin [" + avgPowerMin +"]" : "") 
 + (compMethod !=null? " compMethod [" + compMethod +"]" : "") 
 + (compRatio !=null? " compRatio [" + compRatio +"]" : "") 
 + (dutyCycleMax !=null? " dutyCycleMax [" + dutyCycleMax +"]" : "") 
 + (dutyCycleMin !=null? " dutyCycleMin [" + dutyCycleMin +"]" : "") 
 + (fallTime !=null? " fallTime [" + fallTime +"]" : "") 
 + (justifyShortRiseTime !=null? " justifyShortRiseTime [" + justifyShortRiseTime +"]" : "") 
 + (numSubpulses !=null? " numSubpulses [" + numSubpulses +"]" : "") 
 + (pdMax !=null? " pdMax [" + pdMax +"]" : "") 
 + (pdMin !=null? " pdMin [" + pdMin +"]" : "") 
 + (prrMax !=null? " prrMax [" + prrMax +"]" : "") 
 + (prrMin !=null? " prrMin [" + prrMin +"]" : "") 
 + (radarProcessingGainMax !=null? " radarProcessingGainMax [" + radarProcessingGainMax +"]" : "") 
 + (riseTime !=null? " riseTime [" + riseTime +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Pulse} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
