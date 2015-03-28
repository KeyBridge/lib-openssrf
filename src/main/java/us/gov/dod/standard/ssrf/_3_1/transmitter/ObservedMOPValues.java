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
ObservedMOPValues (US) contains specific data artifacts that describe the Amplitude (AM), Phase (PM), Frequency (FM) and/or Continuous Wave (CW) features of a signal impressed on a Pulse.

Element of {@link ObservedMOPBits}

Example: See {@link ObservedMOPAnalysis}.
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedMOPValues", propOrder = {
    "mopValueAM",
    "mopValueCW",
    "mopValueFM",
    "mopValuePM",
    "statisticalIndicator"
})
public class ObservedMOPValues {

/**
In Data Item US:MOPValueAM (US), enter specific data that describes the Amplitude (AM) features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPValueAM", required = false)
    private Signed_dB_5_2 mopValueAM;
/**
In Data Item US:MOPValueCW (US), enter specific data that describes the Continuous Wave (CW) features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPValueCW", required = false)
    private FreqM mopValueCW;
/**
In Data Item US:MOPValueFM (US), enter specific data that describes the Frequency (FM) features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPValueFM", required = false)
    private FreqM mopValueFM;
/**
In Data Item US:MOPValuePM (US), enter specific data that describes the Phase (PM)features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPValuePM", required = false)
    private US_Degrees mopValuePM;
/**
In Data Item StatisticalIndicator (US), indicate how this specific data observation was collected (e.g., 95% of the observed values). If this element is empty, then the value is assumed to be part of the 100% sample.
@since 3.1.0
*/
    @XmlElement(name = "StatisticalIndicator", required = false)
    private US_Percent3 statisticalIndicator;

/**
Get In Data Item US:MOPValueAM (US), enter specific data that describes the Amplitude (AM) features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPValueAM value in a {@link TSigned_DB_5_2} data type
@since 3.1.0
*/
public Signed_dB_5_2 getMOPValueAM() {
        return mopValueAM;
    }

/**
Set In Data Item US:MOPValueAM (US), enter specific data that describes the Amplitude (AM) features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPValueAM value in a {@link TSigned_DB_5_2} data type
@since 3.1.0
*/
public void setMOPValueAM(Signed_dB_5_2 value) {
        this.mopValueAM = value;
    }

/**
Determine if the MOPValueAM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPValueAM() {
        return (this.mopValueAM!= null);
    }

/**
Get In Data Item US:MOPValueCW (US), enter specific data that describes the Continuous Wave (CW) features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPValueCW value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getMOPValueCW() {
        return mopValueCW;
    }

/**
Set In Data Item US:MOPValueCW (US), enter specific data that describes the Continuous Wave (CW) features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPValueCW value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setMOPValueCW(FreqM value) {
        this.mopValueCW = value;
    }

/**
Determine if the MOPValueCW is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPValueCW() {
        return (this.mopValueCW!= null);
    }

/**
Get In Data Item US:MOPValueFM (US), enter specific data that describes the Frequency (FM) features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPValueFM value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getMOPValueFM() {
        return mopValueFM;
    }

/**
Set In Data Item US:MOPValueFM (US), enter specific data that describes the Frequency (FM) features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPValueFM value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setMOPValueFM(FreqM value) {
        this.mopValueFM = value;
    }

/**
Determine if the MOPValueFM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPValueFM() {
        return (this.mopValueFM!= null);
    }

/**
Get In Data Item US:MOPValuePM (US), enter specific data that describes the Phase (PM)features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPValuePM value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public US_Degrees getMOPValuePM() {
        return mopValuePM;
    }

/**
Set In Data Item US:MOPValuePM (US), enter specific data that describes the Phase (PM)features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPValuePM value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public void setMOPValuePM(US_Degrees value) {
        this.mopValuePM = value;
    }

/**
Determine if the MOPValuePM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPValuePM() {
        return (this.mopValuePM!= null);
    }

/**
Get In Data Item StatisticalIndicator (US), indicate how this specific data observation was collected (e.g., 95% of the observed values). If this element is empty, then the value is assumed to be part of the 100% sample.

@return the StatisticalIndicator value in a {@link TUS_Percent3} data type
@since 3.1.0
*/
public US_Percent3 getStatisticalIndicator() {
        return statisticalIndicator;
    }

/**
Set In Data Item StatisticalIndicator (US), indicate how this specific data observation was collected (e.g., 95% of the observed values). If this element is empty, then the value is assumed to be part of the 100% sample.

@param value the StatisticalIndicator value in a {@link TUS_Percent3} data type
@since 3.1.0
*/
public void setStatisticalIndicator(US_Percent3 value) {
        this.statisticalIndicator = value;
    }

/**
Determine if the StatisticalIndicator is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStatisticalIndicator() {
        return (this.statisticalIndicator!= null);
    }

/**
Set In Data Item US:MOPValueAM (US), enter specific data that describes the Amplitude (AM) features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPValues object instance
@since 3.1.0
*/
    public ObservedMOPValues withMOPValueAM(Double value) {
           setMOPValueAM(new Signed_dB_5_2(value));
        return this;
    }

/**
Set In Data Item US:MOPValueCW (US), enter specific data that describes the Continuous Wave (CW) features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPValues object instance
@since 3.1.0
*/
    public ObservedMOPValues withMOPValueCW(Double value) {
           setMOPValueCW(new FreqM(value));
        return this;
    }

/**
Set In Data Item US:MOPValueFM (US), enter specific data that describes the Frequency (FM) features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPValues object instance
@since 3.1.0
*/
    public ObservedMOPValues withMOPValueFM(Double value) {
           setMOPValueFM(new FreqM(value));
        return this;
    }

/**
Set In Data Item US:MOPValuePM (US), enter specific data that describes the Phase (PM)features of a signal impressed on a Pulse. Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPValues object instance
@since 3.1.0
*/
    public ObservedMOPValues withMOPValuePM(Double value) {
           setMOPValuePM(new US_Degrees(value));
        return this;
    }

/**
Set In Data Item StatisticalIndicator (US), indicate how this specific data observation was collected (e.g., 95% of the observed values). If this element is empty, then the value is assumed to be part of the 100% sample.

@param value  An instances of type {@link Double}
@return The current ObservedMOPValues object instance
@since 3.1.0
*/
    public ObservedMOPValues withStatisticalIndicator(Double value) {
           setStatisticalIndicator(new US_Percent3(value));
        return this;
    }

/**
 Get a string representation of this ObservedMOPValues instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ObservedMOPValues {"
 + (mopValueAM !=null? " mopValueAM [" + mopValueAM +"]" : "") 
 + (mopValueCW !=null? " mopValueCW [" + mopValueCW +"]" : "") 
 + (mopValueFM !=null? " mopValueFM [" + mopValueFM +"]" : "") 
 + (mopValuePM !=null? " mopValuePM [" + mopValuePM +"]" : "") 
 + (statisticalIndicator !=null? " statisticalIndicator [" + statisticalIndicator +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ObservedMOPValues} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
