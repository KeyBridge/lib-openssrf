package us.gov.dod.standard.ssrf._3_1.receiver;

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
FreqConversion contains the characteristics of a frequency conversion stage: intermediate frequency (IF) and local oscillator (LO) parameters.

Element of {@link RxMode}

Example: <pre>
* &lt;FreqConversion&gt;
*   &lt;StageNum cls="U"&gt;3&lt;/StageNum&gt;
*   &lt;OscillatorTuning cls="U"&gt;LO below RF&lt;/OscillatorTuning&gt;
*   &lt;LOFreqMin cls="U"&gt;20&lt;/LOFreqMin&gt;
*   &lt;IFMin cls="U"&gt;21.4&lt;/IFMin&gt;
*   &lt;IFMax cls="U"&gt;70&lt;/IFMax&gt;
* &lt;/FreqConversion&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreqConversion", propOrder = {
    "stageNum",
    "oscillatorTuning",
    "loFreqMin",
    "loFreqMax",
    "ifMin",
    "ifMax"
})
public class FreqConversion {

/**
StageNum  - Conversion Stage Number (Optional) 

The position of the IF stage being described.

Format is UN(1) [1..5]
@since 3.1.0
*/
    @XmlElement(name = "StageNum", required = false)
    private IFNum stageNum;
/**
OscillatorTuning  - Oscillator Tuning (Optional) 

The relationship between the local oscillator frequency and the RF centre frequency.

Format is L:CLO
@since 3.1.0
*/
    @XmlElement(name = "OscillatorTuning", required = false)
    private TString oscillatorTuning;
/**
LOFreqMin  - Minimum or Nominal LO Frequency (Optional) 

The nominal LO frequency or minimum value of the LO frequency range.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "LOFreqMin", required = false)
    private FreqM loFreqMin;
/**
LOFreqMax  - Maximum LO Frequency (Optional) 

The maximum value of the LO frequencies.

[XSL ERR MINMAX] If LOFreqMax is used, it MUST be greater than LOFreqMin.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "LOFreqMax", required = false)
    private FreqM loFreqMax;
/**
IFMin  - Nominal/Minimum Intermediate Frequency (Optional) 

The nominal intermediate frequency or minimum value of the intermediate frequency range.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "IFMin", required = false)
    private FreqM ifMin;
/**
IFMax  - Maximum Intermediate Frequency (Optional) 

The maximum value of the intermediate frequencies.

[XSL ERR MINMAX] If IFMax is used, it MUST be greater than IFMin.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "IFMax", required = false)
    private FreqM ifMax;

/**
Get the position of the IF stage being described.

@return the StageNum value in a {@link TIFNum} data type
@since 3.1.0
*/
public IFNum getStageNum() {
        return stageNum;
    }

/**
Set the position of the IF stage being described.

@param value the StageNum value in a {@link TIFNum} data type
@since 3.1.0
*/
public void setStageNum(IFNum value) {
        this.stageNum = value;
    }

/**
Determine if the StageNum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStageNum() {
        return (this.stageNum!= null);
    }

/**
Get the relationship between the local oscillator frequency and the RF centre frequency.

@return the OscillatorTuning value in a {@link TString} data type
@since 3.1.0
*/
public TString getOscillatorTuning() {
        return oscillatorTuning;
    }

/**
Set the relationship between the local oscillator frequency and the RF centre frequency.

@param value the OscillatorTuning value in a {@link TString} data type
@since 3.1.0
*/
public void setOscillatorTuning(TString value) {
        this.oscillatorTuning = value;
    }

/**
Determine if the OscillatorTuning is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOscillatorTuning() {
return (this.oscillatorTuning!= null ? this.oscillatorTuning.isSetValue() : false);
    }

/**
Get the nominal LO frequency or minimum value of the LO frequency range.

@return the LOFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getLOFreqMin() {
        return loFreqMin;
    }

/**
Set the nominal LO frequency or minimum value of the LO frequency range.

@param value the LOFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setLOFreqMin(FreqM value) {
        this.loFreqMin = value;
    }

/**
Determine if the LOFreqMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLOFreqMin() {
        return (this.loFreqMin!= null);
    }

/**
Get the maximum value of the LO frequencies.

[XSL ERR MINMAX] If LOFreqMax is used, it MUST be greater than LOFreqMin.

@return the LOFreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getLOFreqMax() {
        return loFreqMax;
    }

/**
Set the maximum value of the LO frequencies.

[XSL ERR MINMAX] If LOFreqMax is used, it MUST be greater than LOFreqMin.

@param value the LOFreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setLOFreqMax(FreqM value) {
        this.loFreqMax = value;
    }

/**
Determine if the LOFreqMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLOFreqMax() {
        return (this.loFreqMax!= null);
    }

/**
Get the nominal intermediate frequency or minimum value of the intermediate frequency range.

@return the IFMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getIFMin() {
        return ifMin;
    }

/**
Set the nominal intermediate frequency or minimum value of the intermediate frequency range.

@param value the IFMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setIFMin(FreqM value) {
        this.ifMin = value;
    }

/**
Determine if the IFMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIFMin() {
        return (this.ifMin!= null);
    }

/**
Get the maximum value of the intermediate frequencies.

[XSL ERR MINMAX] If IFMax is used, it MUST be greater than IFMin.

@return the IFMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getIFMax() {
        return ifMax;
    }

/**
Set the maximum value of the intermediate frequencies.

[XSL ERR MINMAX] If IFMax is used, it MUST be greater than IFMin.

@param value the IFMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setIFMax(FreqM value) {
        this.ifMax = value;
    }

/**
Determine if the IFMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIFMax() {
        return (this.ifMax!= null);
    }

/**
Set the position of the IF stage being described.

@param value  An instances of type {@link Integer}
@return The current FreqConversion object instance
@since 3.1.0
*/
    public FreqConversion withStageNum(Integer value) {
           setStageNum(new IFNum(value));
        return this;
    }

/**
Set the relationship between the local oscillator frequency and the RF centre frequency.

@param value  An instances of type {@link ListCLO}
@return The current FreqConversion object instance
@since 3.1.0
*/
    public FreqConversion withOscillatorTuning(ListCLO value) {
           setOscillatorTuning(new TString(value.value()));
        return this;
    }

/**
Set the nominal LO frequency or minimum value of the LO frequency range.

@param value  An instances of type {@link Double}
@return The current FreqConversion object instance
@since 3.1.0
*/
    public FreqConversion withLOFreqMin(Double value) {
           setLOFreqMin(new FreqM(value));
        return this;
    }

/**
Set the maximum value of the LO frequencies.

[XSL ERR MINMAX] If LOFreqMax is used, it MUST be greater than LOFreqMin.

@param value  An instances of type {@link Double}
@return The current FreqConversion object instance
@since 3.1.0
*/
    public FreqConversion withLOFreqMax(Double value) {
           setLOFreqMax(new FreqM(value));
        return this;
    }

/**
Set the nominal intermediate frequency or minimum value of the intermediate frequency range.

@param value  An instances of type {@link Double}
@return The current FreqConversion object instance
@since 3.1.0
*/
    public FreqConversion withIFMin(Double value) {
           setIFMin(new FreqM(value));
        return this;
    }

/**
Set the maximum value of the intermediate frequencies.

[XSL ERR MINMAX] If IFMax is used, it MUST be greater than IFMin.

@param value  An instances of type {@link Double}
@return The current FreqConversion object instance
@since 3.1.0
*/
    public FreqConversion withIFMax(Double value) {
           setIFMax(new FreqM(value));
        return this;
    }

/**
 Get a string representation of this FreqConversion instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "FreqConversion {"
 + (ifMax !=null? " ifMax [" + ifMax +"]" : "") 
 + (ifMin !=null? " ifMin [" + ifMin +"]" : "") 
 + (loFreqMax !=null? " loFreqMax [" + loFreqMax +"]" : "") 
 + (loFreqMin !=null? " loFreqMin [" + loFreqMin +"]" : "") 
 + (oscillatorTuning !=null? " oscillatorTuning [" + oscillatorTuning +"]" : "") 
 + (stageNum !=null? " stageNum [" + stageNum +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link FreqConversion} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
