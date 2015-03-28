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
ObservedMOPBits (US) describes the data format for the Amplitude (AM), Phase (PM), Frequency (FM) and/or Continuous Wave (CW) features of a signal impressed on a Pulse.

Element of {@link ObservedMOPSequence}

Sub-Element is {@link ObservedMOPValues}

Example: See {@link ObservedMOPAnalysis}.
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedMOPBits", propOrder = {
    "mopDutyCycle",
    "mopNumElements",
    "mopStepAM",
    "mopStepCW",
    "mopStepFM",
    "mopStepPM",
    "mopRepetionInterval",
    "bitRate",
    "bitDuration",
    "observedMOPValues"
})
public class ObservedMOPBits {

/**
In Data Item US:MOPDutyCycle (US), enter as a percentage, the minimum or nominal ratio of the pulse duration to the pulse period.
@since 3.1.0
*/
    @XmlElement(name = "MOPDutyCycle", required = false)
    private Percent mopDutyCycle;
/**
In Data Item US:MOPNumElements (US), enter the number of discrete FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any repeated values are counted each time)
@since 3.1.0
*/
    @XmlElement(name = "MOPNumElements", required = false)
    private UN6 mopNumElements;
/**
In Data Item US:MOPStepAM (US), enter the difference between adjacent amplitude discrete power values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPStepAM", required = false)
    private Unsigned_dB_5_2 mopStepAM;
/**
In Data Item US:MOPStepCW(US), enter the difference between adjacent continuous wave frequency discrete values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPStepCW", required = false)
    private US_MOPFm mopStepCW;
/**
In Data Item US:MOPStepFM (US), enter the difference between adjacent frequency discrete values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPStepFM", required = false)
    private US_MOPFm mopStepFM;
/**
In Data Item US:MOPStepPM (US), enter the difference between adjacent phase discrete values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPStepPM", required = false)
    private US_PhaseAngle mopStepPM;
/**
US:MOPRepetionInterval - MOP Repetion Interval (Optional) 

The overall interval which may include multiple Sweep Repetition Intervals (SRI). Fly-back times, and dead times.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "MOPRepetionInterval", required = false)
    private microsecs mopRepetionInterval;
/**
US:BitRate - Bit Rate (Optional) 

The rate at which the signal exhibits a change of FREQ/PHASE/AMP; inverse of the minimum bit duration (e.g., a signal that has a .977 usec minimum bit has a bit rate of 1024 kbit/sec).

Format is UN(10,3) (kbit/sec)
@since 3.1.0
*/
    @XmlElement(name = "BitRate", required = false)
    private BitRate bitRate;
/**
US:BitDuration - Bit Duration (Optional) 

The shortest time interval (within a pulse for pulsed signals) that a discrete frequency, phase, or amplitude value stays at its state before changing to a new one.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "BitDuration", required = false)
    private microsecs bitDuration;

    @XmlElement(name = "ObservedMOPValues")
      private  Set<ObservedMOPValues> observedMOPValues;

/**
Get In Data Item US:MOPDutyCycle (US), enter as a percentage, the minimum or nominal ratio of the pulse duration to the pulse period.

@return the MOPDutyCycle value in a {@link TPercent} data type
@since 3.1.0
*/
public Percent getMOPDutyCycle() {
        return mopDutyCycle;
    }

/**
Set In Data Item US:MOPDutyCycle (US), enter as a percentage, the minimum or nominal ratio of the pulse duration to the pulse period.

@param value the MOPDutyCycle value in a {@link TPercent} data type
@since 3.1.0
*/
public void setMOPDutyCycle(Percent value) {
        this.mopDutyCycle = value;
    }

/**
Determine if the MOPDutyCycle is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPDutyCycle() {
        return (this.mopDutyCycle!= null);
    }

/**
Get In Data Item US:MOPNumElements (US), enter the number of discrete FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any repeated values are counted each time)

@return the MOPNumElements value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getMOPNumElements() {
        return mopNumElements;
    }

/**
Set In Data Item US:MOPNumElements (US), enter the number of discrete FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any repeated values are counted each time)

@param value the MOPNumElements value in a {@link TUN6} data type
@since 3.1.0
*/
public void setMOPNumElements(UN6 value) {
        this.mopNumElements = value;
    }

/**
Determine if the MOPNumElements is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPNumElements() {
        return (this.mopNumElements!= null);
    }

/**
Get In Data Item US:MOPStepAM (US), enter the difference between adjacent amplitude discrete power values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPStepAM value in a {@link TUnsigned_DB_5_2} data type
@since 3.1.0
*/
public Unsigned_dB_5_2 getMOPStepAM() {
        return mopStepAM;
    }

/**
Set In Data Item US:MOPStepAM (US), enter the difference between adjacent amplitude discrete power values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPStepAM value in a {@link TUnsigned_DB_5_2} data type
@since 3.1.0
*/
public void setMOPStepAM(Unsigned_dB_5_2 value) {
        this.mopStepAM = value;
    }

/**
Determine if the MOPStepAM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPStepAM() {
        return (this.mopStepAM!= null);
    }

/**
Get In Data Item US:MOPStepCW(US), enter the difference between adjacent continuous wave frequency discrete values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPStepCW value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public US_MOPFm getMOPStepCW() {
        return mopStepCW;
    }

/**
Set In Data Item US:MOPStepCW(US), enter the difference between adjacent continuous wave frequency discrete values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPStepCW value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public void setMOPStepCW(US_MOPFm value) {
        this.mopStepCW = value;
    }

/**
Determine if the MOPStepCW is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPStepCW() {
        return (this.mopStepCW!= null);
    }

/**
Get In Data Item US:MOPStepFM (US), enter the difference between adjacent frequency discrete values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPStepFM value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public US_MOPFm getMOPStepFM() {
        return mopStepFM;
    }

/**
Set In Data Item US:MOPStepFM (US), enter the difference between adjacent frequency discrete values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPStepFM value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public void setMOPStepFM(US_MOPFm value) {
        this.mopStepFM = value;
    }

/**
Determine if the MOPStepFM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPStepFM() {
        return (this.mopStepFM!= null);
    }

/**
Get In Data Item US:MOPStepPM (US), enter the difference between adjacent phase discrete values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPStepPM value in a {@link TUS_PhaseAngle} data type
@since 3.1.0
*/
public US_PhaseAngle getMOPStepPM() {
        return mopStepPM;
    }

/**
Set In Data Item US:MOPStepPM (US), enter the difference between adjacent phase discrete values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPStepPM value in a {@link TUS_PhaseAngle} data type
@since 3.1.0
*/
public void setMOPStepPM(US_PhaseAngle value) {
        this.mopStepPM = value;
    }

/**
Determine if the MOPStepPM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPStepPM() {
        return (this.mopStepPM!= null);
    }

/**
Get the overall interval which may include multiple Sweep Repetition Intervals (SRI). Fly-back times, and dead times.

@return the MOPRepetionInterval value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getMOPRepetionInterval() {
        return mopRepetionInterval;
    }

/**
Set the overall interval which may include multiple Sweep Repetition Intervals (SRI). Fly-back times, and dead times.

@param value the MOPRepetionInterval value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setMOPRepetionInterval(microsecs value) {
        this.mopRepetionInterval = value;
    }

/**
Determine if the MOPRepetionInterval is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPRepetionInterval() {
        return (this.mopRepetionInterval!= null);
    }

/**
Get the rate at which the signal exhibits a change of FREQ/PHASE/AMP; inverse of the minimum bit duration (e.g., a signal that has a .977 usec minimum bit has a bit rate of 1024 kbit/sec).

@return the BitRate value in a {@link TBitRate} data type
@since 3.1.0
*/
public BitRate getBitRate() {
        return bitRate;
    }

/**
Set the rate at which the signal exhibits a change of FREQ/PHASE/AMP; inverse of the minimum bit duration (e.g., a signal that has a .977 usec minimum bit has a bit rate of 1024 kbit/sec).

@param value the BitRate value in a {@link TBitRate} data type
@since 3.1.0
*/
public void setBitRate(BitRate value) {
        this.bitRate = value;
    }

/**
Determine if the BitRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetBitRate() {
        return (this.bitRate!= null);
    }

/**
Get the shortest time interval (within a pulse for pulsed signals) that a discrete frequency, phase, or amplitude value stays at its state before changing to a new one.

@return the BitDuration value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getBitDuration() {
        return bitDuration;
    }

/**
Set the shortest time interval (within a pulse for pulsed signals) that a discrete frequency, phase, or amplitude value stays at its state before changing to a new one.

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
Get 

@return  a {@link ObservedMOPValues} instance
@since 3.1.0
*/
    public Set<ObservedMOPValues> getObservedMOPValues() {
        if (observedMOPValues == null) {
            observedMOPValues = new HashSet<ObservedMOPValues>();
        }
        return this.observedMOPValues;
    }

/**
Determine if the ObservedMOPValues is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetObservedMOPValues() {
        return ((this.observedMOPValues!= null)&&(!this.observedMOPValues.isEmpty()));
    }

/**
  Clear the ObservedMOPValues field. This sets the field to null.
 */
    public void unsetObservedMOPValues() {
        this.observedMOPValues = null;
    }

/**
Set In Data Item US:MOPDutyCycle (US), enter as a percentage, the minimum or nominal ratio of the pulse duration to the pulse period.

@param value  An instances of type {@link Double}
@return The current ObservedMOPBits object instance
@since 3.1.0
*/
    public ObservedMOPBits withMOPDutyCycle(Double value) {
           setMOPDutyCycle(new Percent(value));
        return this;
    }

/**
Set In Data Item US:MOPNumElements (US), enter the number of discrete FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any repeated values are counted each time)

@param value  An instances of type {@link Integer}
@return The current ObservedMOPBits object instance
@since 3.1.0
*/
    public ObservedMOPBits withMOPNumElements(Integer value) {
           setMOPNumElements(new UN6(value));
        return this;
    }

/**
Set In Data Item US:MOPStepAM (US), enter the difference between adjacent amplitude discrete power values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPBits object instance
@since 3.1.0
*/
    public ObservedMOPBits withMOPStepAM(Double value) {
           setMOPStepAM(new Unsigned_dB_5_2(value));
        return this;
    }

/**
Set In Data Item US:MOPStepCW(US), enter the difference between adjacent continuous wave frequency discrete values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPBits object instance
@since 3.1.0
*/
    public ObservedMOPBits withMOPStepCW(Double value) {
           setMOPStepCW(new US_MOPFm(value));
        return this;
    }

/**
Set In Data Item US:MOPStepFM (US), enter the difference between adjacent frequency discrete values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPBits object instance
@since 3.1.0
*/
    public ObservedMOPBits withMOPStepFM(Double value) {
           setMOPStepFM(new US_MOPFm(value));
        return this;
    }

/**
Set In Data Item US:MOPStepPM (US), enter the difference between adjacent phase discrete values, within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPBits object instance
@since 3.1.0
*/
    public ObservedMOPBits withMOPStepPM(Double value) {
           setMOPStepPM(new US_PhaseAngle(value));
        return this;
    }

/**
Set the overall interval which may include multiple Sweep Repetition Intervals (SRI). Fly-back times, and dead times.

@param value  An instances of type {@link Double}
@return The current ObservedMOPBits object instance
@since 3.1.0
*/
    public ObservedMOPBits withMOPRepetionInterval(Double value) {
           setMOPRepetionInterval(new microsecs(value));
        return this;
    }

/**
Set the rate at which the signal exhibits a change of FREQ/PHASE/AMP; inverse of the minimum bit duration (e.g., a signal that has a .977 usec minimum bit has a bit rate of 1024 kbit/sec).

@param value  An instances of type {@link Double}
@return The current ObservedMOPBits object instance
@since 3.1.0
*/
    public ObservedMOPBits withBitRate(Double value) {
           setBitRate(new BitRate(value));
        return this;
    }

/**
Set the shortest time interval (within a pulse for pulsed signals) that a discrete frequency, phase, or amplitude value stays at its state before changing to a new one.

@param value  An instances of type {@link Double}
@return The current ObservedMOPBits object instance
@since 3.1.0
*/
    public ObservedMOPBits withBitDuration(Double value) {
           setBitDuration(new microsecs(value));
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link ObservedMOPValues...}
@return The current ObservedMOPBits object instance
@since 3.1.0
*/
    public ObservedMOPBits withObservedMOPValues(ObservedMOPValues... values) {
        if (values!= null) {
            for (ObservedMOPValues value: values) {
                getObservedMOPValues().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link ObservedMOPValues} instances
@return The current ObservedMOPBits object instance
@since 3.1.0
*/
    public ObservedMOPBits withObservedMOPValues(Collection<ObservedMOPValues> values) {
        if (values!= null) {
            getObservedMOPValues().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this ObservedMOPBits instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ObservedMOPBits {"
 + (bitDuration !=null? " bitDuration [" + bitDuration +"]" : "") 
 + (bitRate !=null? " bitRate [" + bitRate +"]" : "") 
 + (mopDutyCycle !=null? " mopDutyCycle [" + mopDutyCycle +"]" : "") 
 + (mopNumElements !=null? " mopNumElements [" + mopNumElements +"]" : "") 
 + (mopRepetionInterval !=null? " mopRepetionInterval [" + mopRepetionInterval +"]" : "") 
 + (mopStepAM !=null? " mopStepAM [" + mopStepAM +"]" : "") 
 + (mopStepCW !=null? " mopStepCW [" + mopStepCW +"]" : "") 
 + (mopStepFM !=null? " mopStepFM [" + mopStepFM +"]" : "") 
 + (mopStepPM !=null? " mopStepPM [" + mopStepPM +"]" : "") 
 + (observedMOPValues !=null? " observedMOPValues [" + observedMOPValues +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ObservedMOPBits} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
