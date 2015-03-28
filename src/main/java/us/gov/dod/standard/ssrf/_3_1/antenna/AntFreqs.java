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
AntFreqs contains the antenna's designed tuning range, or the discrete operating frequency.

Element of {@link AntMode}

Example: Both examples reflect the same operating range:<pre>
* &lt;AntFreqs&gt;
*   &lt;FreqMin cls="U"&gt;30&lt;/FreqMin&gt;
*   &lt;FreqMax cls="U"&gt;90&lt;/FreqMax&gt;
* &lt;/AntFreqs&gt;
A bandwidth of 60 MHz is +/-30 MHz around FreqMin:* &lt;AntFreqs&gt;
*   &lt;FreqMin cls="U"&gt;60&lt;/FreqMin&gt;
*   &lt;Bandwidth cls="U"&gt;60&lt;/Bandwidth&gt;
* &lt;/AntFreqs&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntFreqs", propOrder = {
    "freqMin",
    "freqMax",
    "bandwidth",
    "freqUse"
})
public class AntFreqs {

/**
FreqMin  - Nominal or Minimum Frequency (Required) 

The nominal frequency or minimum value of the frequency range.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group FreqRangeGrp (Required)
@since 3.1.0
*/
    @XmlElement(name = "FreqMin", required = true)
      private  FreqM freqMin;
/**
FreqMax  - Maximum Frequency (Optional) 

The maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group FreqRangeGrp (Required)
@since 3.1.0
*/
    @XmlElement(name = "FreqMax", required = false)
    private FreqM freqMax;
/**
In Data Item Bandwidth, as an alternative to FreqMin/FreqMax, enter the total operating bandwidth of the Antenna centered around FreqMin.
@since 3.1.0
*/
    @XmlElement(name = "Bandwidth", required = false)
    private FreqM bandwidth;
/**
FreqUse  - Frequency Use (Optional) 

If the frequency range is used for transmit, receive, or both transmit and receive.

Format is L:CAU
@since 3.1.0
*/
    @XmlElement(name = "FreqUse", required = false)
    private TString freqUse;

/**
Get the nominal frequency or minimum value of the frequency range.

@return the FreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMin() {
        return freqMin;
    }

/**
Set the nominal frequency or minimum value of the frequency range.

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
Get the maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

@return the FreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMax() {
        return freqMax;
    }

/**
Set the maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

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
Get In Data Item Bandwidth, as an alternative to FreqMin/FreqMax, enter the total operating bandwidth of the Antenna centered around FreqMin.

@return the Bandwidth value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getBandwidth() {
        return bandwidth;
    }

/**
Set In Data Item Bandwidth, as an alternative to FreqMin/FreqMax, enter the total operating bandwidth of the Antenna centered around FreqMin.

@param value the Bandwidth value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setBandwidth(FreqM value) {
        this.bandwidth = value;
    }

/**
Determine if the Bandwidth is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetBandwidth() {
        return (this.bandwidth!= null);
    }

/**
Get if the frequency range is used for transmit, receive, or both transmit and receive.

@return the FreqUse value in a {@link TString} data type
@since 3.1.0
*/
public TString getFreqUse() {
        return freqUse;
    }

/**
Set if the frequency range is used for transmit, receive, or both transmit and receive.

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
Set the nominal frequency or minimum value of the frequency range.

@param value  An instances of type {@link TFreqM}
@return The current AntFreqs object instance
@since 3.1.0
*/
    public AntFreqs withFreqMin(TFreqM value) {
        return this;
    }

/**
Set the maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

@param value  An instances of type {@link Double}
@return The current AntFreqs object instance
@since 3.1.0
*/
    public AntFreqs withFreqMax(Double value) {
           setFreqMax(new FreqM(value));
        return this;
    }

/**
Set In Data Item Bandwidth, as an alternative to FreqMin/FreqMax, enter the total operating bandwidth of the Antenna centered around FreqMin.

@param value  An instances of type {@link Double}
@return The current AntFreqs object instance
@since 3.1.0
*/
    public AntFreqs withBandwidth(Double value) {
           setBandwidth(new FreqM(value));
        return this;
    }

/**
Set if the frequency range is used for transmit, receive, or both transmit and receive.

@param value  An instances of type {@link ListCAU}
@return The current AntFreqs object instance
@since 3.1.0
*/
    public AntFreqs withFreqUse(ListCAU value) {
           setFreqUse(new TString(value.value()));
        return this;
    }

/**
 Get a string representation of this AntFreqs instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "AntFreqs {"
 + (bandwidth !=null? " bandwidth [" + bandwidth +"]" : "") 
 + (freqMax !=null? " freqMax [" + freqMax +"]" : "") 
 + (freqMin !=null? " freqMin [" + freqMin +"]" : "") 
 + (freqUse !=null? " freqUse [" + freqUse +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link AntFreqs} requires {@link FreqM FreqMin}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetFreqMin();
}

}
