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
Complex Element VSWR stores the Voltage Standing Wave Ratio information for an Antenna Mode; it may be used to describe the VSWR curve as a function of frequency.

Element of {@link AntMode}

Example: <pre>
* &lt;VSWR&gt;
*   &lt;Freq cls="U"&gt;225&lt;/Freq&gt;
*   &lt;Ratio cls="U"&gt;1.2&lt;/Ratio&gt;
* &lt;/VSWR&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VSWR", propOrder = {
    "freq",
    "ratio"
})
public class VSWR {

/**
Freq  - Frequency (Optional) 

The specific frequency at which the VSWR measurement was taken. If multiple points are described, Freq MUST be filled in.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "Freq", required = false)
    private FreqM freq;
/**
Ratio  - Ratio  (Required) 

The standing wave ratio referenced to the specific frequency, as a number without unit (e.g., enter "2" to represent a ratio of 2:1).

Format is UN(2,1)
@since 3.1.0
*/
    @XmlElement(name = "Ratio", required = true)
      private  UN2_1 ratio;

/**
Get the specific frequency at which the VSWR measurement was taken. If multiple points are described, Freq MUST be filled in.

@return the Freq value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreq() {
        return freq;
    }

/**
Set the specific frequency at which the VSWR measurement was taken. If multiple points are described, Freq MUST be filled in.

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
Get the standing wave ratio referenced to the specific frequency, as a number without unit (e.g., enter "2" to represent a ratio of 2:1).

@return the Ratio value in a {@link TUN2_1} data type
@since 3.1.0
*/
public UN2_1 getRatio() {
        return ratio;
    }

/**
Set the standing wave ratio referenced to the specific frequency, as a number without unit (e.g., enter "2" to represent a ratio of 2:1).

@param value the Ratio value in a {@link TUN2_1} data type
@since 3.1.0
*/
public void setRatio(UN2_1 value) {
        this.ratio = value;
    }

/**
Determine if the Ratio is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRatio() {
        return (this.ratio!= null);
    }

/**
Set the specific frequency at which the VSWR measurement was taken. If multiple points are described, Freq MUST be filled in.

@param value  An instances of type {@link Double}
@return The current VSWR object instance
@since 3.1.0
*/
    public VSWR withFreq(Double value) {
           setFreq(new FreqM(value));
        return this;
    }

/**
Set the standing wave ratio referenced to the specific frequency, as a number without unit (e.g., enter "2" to represent a ratio of 2:1).

@param value  An instances of type {@link TUN2_1}
@return The current VSWR object instance
@since 3.1.0
*/
    public VSWR withRatio(TUN2_1 value) {
        return this;
    }

/**
 Get a string representation of this VSWR instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "VSWR {"
 + (freq !=null? " freq [" + freq +"]" : "") 
 + (ratio !=null? " ratio [" + ratio +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link VSWR} requires {@link UN2_1 Ratio}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetRatio();
}

}
