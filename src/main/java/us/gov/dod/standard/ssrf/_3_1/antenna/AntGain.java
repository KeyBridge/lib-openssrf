package us.gov.dod.standard.ssrf._3_1.antenna;

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
AntGain indicates the antenna gain, in decibels with reference to an isotropic source (dBi), in the direction of maximum radiation.

Element of {@link AntMode}

Example: A basic gain, regardless of the frequency:<pre>
* &lt;AntGain&gt;
*   &lt;Gain cls="U"&gt;0&lt;/Gain&gt;
* &lt;/AntGain&gt;
A complete entry:* &lt;AntGain&gt;
*   &lt;Gain cls="U"&gt;6.1&lt;/Gain&gt;
*   &lt;Freq cls="U"&gt;230.525&lt;/Freq&gt;
*   &lt;FrontToBackRatio cls="U"&gt;2&lt;/FrontToBackRatio&gt;
* &lt;/AntGain&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntGain", propOrder = {
    "calculated",
    "gain",
    "freq",
    "frontToBackRatio"
})
public class AntGain {

/**
Calculated  - Calculated Data Indicator (Optional) 

Yes to indicate that the data was calculated, or "No" if the data is issued from measurement. Leave blank if the origin of the data is not known.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Calculated", required = false)
    private TString calculated;
/**
Gain  - Gain (Required) 

The antenna gain (in dBi - dB with reference to an isotropic source) in the direction of maximum radiation. For a negative gain (earth and space stations only), enter a dash before the value of the gain.

Format is SN(6.3) (dBi)
@since 3.1.0
*/
    @XmlElement(name = "Gain", required = true)
      private  dBi gain;
/**
Freq  - Frequency (Optional) 

The frequency at which the gain is expressed.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "Freq", required = false)
    private FreqM freq;
/**
FrontToBackRatio  - Front-to-back Ratio (Optional) 

The front-to-back ratio of the main beam to the back lobe.

Format is UN(5,2) (dB)
@since 3.1.0
*/
    @XmlElement(name = "FrontToBackRatio", required = false)
    private Unsigned_dB_5_2 frontToBackRatio;

/**
Get Yes to indicate that the data was calculated, or "No" if the data is issued from measurement. Leave blank if the origin of the data is not known.

@return the Calculated value in a {@link TString} data type
@since 3.1.0
*/
public TString getCalculated() {
        return calculated;
    }

/**
Set Yes to indicate that the data was calculated, or "No" if the data is issued from measurement. Leave blank if the origin of the data is not known.

@param value the Calculated value in a {@link TString} data type
@since 3.1.0
*/
public void setCalculated(TString value) {
        this.calculated = value;
    }

/**
Determine if the Calculated is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCalculated() {
return (this.calculated!= null ? this.calculated.isSetValue() : false);
    }

/**
Get the antenna gain (in dBi - dB with reference to an isotropic source) in the direction of maximum radiation. For a negative gain (earth and space stations only), enter a dash before the value of the gain.

@return the Gain value in a {@link TdBi} data type
@since 3.1.0
*/
public dBi getGain() {
        return gain;
    }

/**
Set the antenna gain (in dBi - dB with reference to an isotropic source) in the direction of maximum radiation. For a negative gain (earth and space stations only), enter a dash before the value of the gain.

@param value the Gain value in a {@link TdBi} data type
@since 3.1.0
*/
public void setGain(dBi value) {
        this.gain = value;
    }

/**
Determine if the Gain is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetGain() {
        return (this.gain!= null);
    }

/**
Get the frequency at which the gain is expressed.

@return the Freq value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreq() {
        return freq;
    }

/**
Set the frequency at which the gain is expressed.

@param value the Freq value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setFreq(FreqM value) {
        this.freq = value;
    }

/**
Determine if the Freq is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreq() {
        return (this.freq!= null);
    }

/**
Get the front-to-back ratio of the main beam to the back lobe.

@return the FrontToBackRatio value in a {@link TUnsigned_DB_5_2} data type
@since 3.1.0
*/
public Unsigned_dB_5_2 getFrontToBackRatio() {
        return frontToBackRatio;
    }

/**
Set the front-to-back ratio of the main beam to the back lobe.

@param value the FrontToBackRatio value in a {@link TUnsigned_DB_5_2} data type
@since 3.1.0
*/
public void setFrontToBackRatio(Unsigned_dB_5_2 value) {
        this.frontToBackRatio = value;
    }

/**
Determine if the FrontToBackRatio is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFrontToBackRatio() {
        return (this.frontToBackRatio!= null);
    }

/**
Set Yes to indicate that the data was calculated, or "No" if the data is issued from measurement. Leave blank if the origin of the data is not known.

@param value  An instances of type {@link ListCBO}
@return The current AntGain object instance
@since 3.1.0
*/
    public AntGain withCalculated(ListCBO value) {
           setCalculated(new TString(value.value()));
        return this;
    }

/**
Set the antenna gain (in dBi - dB with reference to an isotropic source) in the direction of maximum radiation. For a negative gain (earth and space stations only), enter a dash before the value of the gain.

@param value  An instances of type {@link TdBi}
@return The current AntGain object instance
@since 3.1.0
*/
    public AntGain withGain(TdBi value) {
        return this;
    }

/**
Set the frequency at which the gain is expressed.

@param value  An instances of type {@link Double}
@return The current AntGain object instance
@since 3.1.0
*/
    public AntGain withFreq(Double value) {
           setFreq(new FreqM(value));
        return this;
    }

/**
Set the front-to-back ratio of the main beam to the back lobe.

@param value  An instances of type {@link Double}
@return The current AntGain object instance
@since 3.1.0
*/
    public AntGain withFrontToBackRatio(Double value) {
           setFrontToBackRatio(new Unsigned_dB_5_2(value));
        return this;
    }

/**
 Get a string representation of this AntGain instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "AntGain {"
 + (calculated !=null? " calculated [" + calculated +"]" : "") 
 + (freq !=null? " freq [" + freq +"]" : "") 
 + (frontToBackRatio !=null? " frontToBackRatio [" + frontToBackRatio +"]" : "") 
 + (gain !=null? " gain [" + gain +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link AntGain} requires {@link dBi Gain}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetGain();
}

}
