package us.gov.dod.standard.ssrf._3_1;

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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
The SSRF AsgnFreqBase data type.

@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsgnFreqBase", propOrder = {
    "freqMin",
    "freqMax",
    "refFreq",
    "freqUse"
})
@XmlSeeAlso({
    FreqOld.class,
    Freq.class
})
public class AsgnFreqBase {

    @XmlElement(name = "FreqMin", required = true)
      private  FreqM freqMin;

    @XmlElement(name = "FreqMax", required = false)
    private FreqM freqMax;

    @XmlElement(name = "RefFreq", required = false)
    private FreqM refFreq;

    @XmlElement(name = "FreqUse", required = false)
    private TString freqUse;

/**
Get 

@return the FreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMin() {
        return freqMin;
    }

/**
Set 

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
Get 

@return the FreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMax() {
        return freqMax;
    }

/**
Set 

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
Get 

@return the RefFreq value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getRefFreq() {
        return refFreq;
    }

/**
Set 

@param value the RefFreq value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setRefFreq(FreqM value) {
        this.refFreq = value;
    }

/**
Determine if the RefFreq is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRefFreq() {
        return (this.refFreq!= null);
    }

/**
Get 

@return the FreqUse value in a {@link TString} data type
@since 3.1.0
*/
public TString getFreqUse() {
        return freqUse;
    }

/**
Set 

@param value the FreqUse value in a {@link TString} data type
@since 3.1.0
*/
public void setFreqUse(TString value) {
        this.freqUse = value;
    }

/**
Determine if the FreqUse is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqUse() {
return (this.freqUse!= null ? this.freqUse.isSetValue() : false);
    }

/**
Set 

@param value  An instances of type {@link TFreqM}
@return The current AsgnFreqBase object instance
@since 3.1.0
*/
    public AsgnFreqBase withFreqMin(TFreqM value) {
        return this;
    }

/**
Set 

@param value  An instances of type {@link Double}
@return The current AsgnFreqBase object instance
@since 3.1.0
*/
    public AsgnFreqBase withFreqMax(Double value) {
           setFreqMax(new FreqM(value));
        return this;
    }

/**
Set 

@param value  An instances of type {@link Double}
@return The current AsgnFreqBase object instance
@since 3.1.0
*/
    public AsgnFreqBase withRefFreq(Double value) {
           setRefFreq(new FreqM(value));
        return this;
    }

/**
Set 

@param value  An instances of type {@link ListCAU}
@return The current AsgnFreqBase object instance
@since 3.1.0
*/
    public AsgnFreqBase withFreqUse(ListCAU value) {
           setFreqUse(new TString(value.value()));
        return this;
    }

/**
 Get a string representation of this AsgnFreqBase instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "AsgnFreqBase {"
 + (freqMax !=null? " freqMax [" + freqMax +"]" : "") 
 + (freqMin !=null? " freqMin [" + freqMin +"]" : "") 
 + (freqUse !=null? " freqUse [" + freqUse +"]" : "") 
 + (refFreq !=null? " refFreq [" + refFreq +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link AsgnFreqBase} requires {@link FreqM FreqMin}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetFreqMin();
}

}
