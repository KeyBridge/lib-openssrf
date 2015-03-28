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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
RxModulation contains the detailed characteristics of the modulation on the receiver side.

Element of {@link RxMode}

Example: <pre>
* &lt;RxModulation&gt;
*   &lt;DigitalModType cls="U"&gt;ASK/OOK&lt;/DigitalModType&gt;
*   &lt;MaxBitRate cls="U"&gt;27000000&lt;/MaxBitRate&gt;
* &lt;/RxModulation&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxModulation", propOrder = {
    "digitalModType",
    "maxBitRate",
    "numStates",
    "lineCoding",
    "codeRate",
    "codePeriod"
})
@XmlSeeAlso({
    TxModulation.class
})
public class RxModulation {

/**
DigitalModType - Digital Modulaton Type (Optional) 

The type of digital modulation.

Format is L:CMO
@since 3.1.0
*/
    @XmlElement(name = "DigitalModType", required = false)
    private TString digitalModType;
/**
MaxBitRate - Maximum Bit Rate (Optional) 

The maximum bit rate in kilobits per second applicable to digital communications systems. For spread spectrum transmissions enter the bit rate after error-correction coding. Do not enter the spectrum-spreading clock or chip rate.

Format is UN(10,3) (kbit/sec)
@since 3.1.0
*/
    @XmlElement(name = "MaxBitRate", required = false)
    private BitRate maxBitRate;
/**
NumStates  - Number of Digital States (Optional) 

The total number of states, e.g., 4 for 4-ary Phase Shift-Keying, 64 for 64 level Quadrature AM.

Format is UN(5)

Attribute group DigitalFormat (Optional)
@since 3.1.0
*/
    @XmlElement(name = "NumStates", required = false)
    private UN5 numStates;
/**
LineCoding  - Line Coding (Optional) 

The format used to represent binary digit sequencing when digital modulation is used.

Format is L:CDF

Attribute group DigitalFormat (Optional)
@since 3.1.0
*/
    @XmlElement(name = "LineCoding", required = false)
    private TString lineCoding;
/**
CodeRate  - Pseudorandom Code Rate (Optional) 

The pseudorandom code rate.

Format is UN(10,3) (kbit/sec)

Attribute group DigitalFormat (Optional)
@since 3.1.0
*/
    @XmlElement(name = "CodeRate", required = false)
    private BitRate codeRate;
/**
CodePeriod  - Pseudorandom Code Repetition Period (Optional) 

The length of time of the pseudorandom code repetition period.

Format is UN(12,6) (μsec)

Attribute group DigitalFormat (Optional)
@since 3.1.0
*/
    @XmlElement(name = "CodePeriod", required = false)
    private microsecs codePeriod;

/**
Get the type of digital modulation.

@return the DigitalModType value in a {@link TString} data type
@since 3.1.0
*/
public TString getDigitalModType() {
        return digitalModType;
    }

/**
Set the type of digital modulation.

@param value the DigitalModType value in a {@link TString} data type
@since 3.1.0
*/
public void setDigitalModType(TString value) {
        this.digitalModType = value;
    }

/**
Determine if the DigitalModType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDigitalModType() {
return (this.digitalModType!= null ? this.digitalModType.isSetValue() : false);
    }

/**
Get the maximum bit rate in kilobits per second applicable to digital communications systems. For spread spectrum transmissions enter the bit rate after error-correction coding. Do not enter the spectrum-spreading clock or chip rate.

@return the MaxBitRate value in a {@link TBitRate} data type
@since 3.1.0
*/
public BitRate getMaxBitRate() {
        return maxBitRate;
    }

/**
Set the maximum bit rate in kilobits per second applicable to digital communications systems. For spread spectrum transmissions enter the bit rate after error-correction coding. Do not enter the spectrum-spreading clock or chip rate.

@param value the MaxBitRate value in a {@link TBitRate} data type
@since 3.1.0
*/
public void setMaxBitRate(BitRate value) {
        this.maxBitRate = value;
    }

/**
Determine if the MaxBitRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMaxBitRate() {
        return (this.maxBitRate!= null);
    }

/**
Get the total number of states, e.g., 4 for 4-ary Phase Shift-Keying, 64 for 64 level Quadrature AM.

@return the NumStates value in a {@link TUN5} data type
@since 3.1.0
*/
public UN5 getNumStates() {
        return numStates;
    }

/**
Set the total number of states, e.g., 4 for 4-ary Phase Shift-Keying, 64 for 64 level Quadrature AM.

@param value the NumStates value in a {@link TUN5} data type
@since 3.1.0
*/
public void setNumStates(UN5 value) {
        this.numStates = value;
    }

/**
Determine if the NumStates is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumStates() {
        return (this.numStates!= null);
    }

/**
Get the format used to represent binary digit sequencing when digital modulation is used.

@return the LineCoding value in a {@link TString} data type
@since 3.1.0
*/
public TString getLineCoding() {
        return lineCoding;
    }

/**
Set the format used to represent binary digit sequencing when digital modulation is used.

@param value the LineCoding value in a {@link TString} data type
@since 3.1.0
*/
public void setLineCoding(TString value) {
        this.lineCoding = value;
    }

/**
Determine if the LineCoding is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLineCoding() {
return (this.lineCoding!= null ? this.lineCoding.isSetValue() : false);
    }

/**
Get the pseudorandom code rate.

@return the CodeRate value in a {@link TBitRate} data type
@since 3.1.0
*/
public BitRate getCodeRate() {
        return codeRate;
    }

/**
Set the pseudorandom code rate.

@param value the CodeRate value in a {@link TBitRate} data type
@since 3.1.0
*/
public void setCodeRate(BitRate value) {
        this.codeRate = value;
    }

/**
Determine if the CodeRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCodeRate() {
        return (this.codeRate!= null);
    }

/**
Get the length of time of the pseudorandom code repetition period.

@return the CodePeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getCodePeriod() {
        return codePeriod;
    }

/**
Set the length of time of the pseudorandom code repetition period.

@param value the CodePeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setCodePeriod(microsecs value) {
        this.codePeriod = value;
    }

/**
Determine if the CodePeriod is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCodePeriod() {
        return (this.codePeriod!= null);
    }

/**
Set the type of digital modulation.

@param value  An instances of type {@link ListCMO}
@return The current RxModulation object instance
@since 3.1.0
*/
    public RxModulation withDigitalModType(ListCMO value) {
           setDigitalModType(new TString(value.value()));
        return this;
    }

/**
Set the maximum bit rate in kilobits per second applicable to digital communications systems. For spread spectrum transmissions enter the bit rate after error-correction coding. Do not enter the spectrum-spreading clock or chip rate.

@param value  An instances of type {@link Double}
@return The current RxModulation object instance
@since 3.1.0
*/
    public RxModulation withMaxBitRate(Double value) {
           setMaxBitRate(new BitRate(value));
        return this;
    }

/**
Set the total number of states, e.g., 4 for 4-ary Phase Shift-Keying, 64 for 64 level Quadrature AM.

@param value  An instances of type {@link Integer}
@return The current RxModulation object instance
@since 3.1.0
*/
    public RxModulation withNumStates(Integer value) {
           setNumStates(new UN5(value));
        return this;
    }

/**
Set the format used to represent binary digit sequencing when digital modulation is used.

@param value  An instances of type {@link ListCDF}
@return The current RxModulation object instance
@since 3.1.0
*/
    public RxModulation withLineCoding(ListCDF value) {
           setLineCoding(new TString(value.value()));
        return this;
    }

/**
Set the pseudorandom code rate.

@param value  An instances of type {@link Double}
@return The current RxModulation object instance
@since 3.1.0
*/
    public RxModulation withCodeRate(Double value) {
           setCodeRate(new BitRate(value));
        return this;
    }

/**
Set the length of time of the pseudorandom code repetition period.

@param value  An instances of type {@link Double}
@return The current RxModulation object instance
@since 3.1.0
*/
    public RxModulation withCodePeriod(Double value) {
           setCodePeriod(new microsecs(value));
        return this;
    }

/**
 Get a string representation of this RxModulation instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "RxModulation {"
 + (codePeriod !=null? " codePeriod [" + codePeriod +"]" : "") 
 + (codeRate !=null? " codeRate [" + codeRate +"]" : "") 
 + (digitalModType !=null? " digitalModType [" + digitalModType +"]" : "") 
 + (lineCoding !=null? " lineCoding [" + lineCoding +"]" : "") 
 + (maxBitRate !=null? " maxBitRate [" + maxBitRate +"]" : "") 
 + (numStates !=null? " numStates [" + numStates +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link RxModulation} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
