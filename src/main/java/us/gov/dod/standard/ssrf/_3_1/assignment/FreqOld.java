package us.gov.dod.standard.ssrf._3_1.assignment;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
FreqOld indicates a previously assigned single frequency or range of frequencies.

Element of {@link Assigned}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreqOld")
public class FreqOld
    extends AsgnFreqBase
{

    @Override
/**
Set the nominal frequency or minimum value of the frequency range.

@param value  An instances of type {@link TFreqM}
@return The current FreqOld object instance
@since 3.1.0
*/
    public FreqOld withFreqMin(TFreqM value) {
        return this;
    }

    @Override
/**
Set the maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

@param value  An instances of type {@link Double}
@return The current FreqOld object instance
@since 3.1.0
*/
    public FreqOld withFreqMax(Double value) {
           setFreqMax(new FreqM(value));
        return this;
    }

    @Override
/**
Set the reference frequency of a suppressed or reduced carrier sideband. This item only applies to a single frequency and should not be used with a range.

@param value  An instances of type {@link Double}
@return The current FreqOld object instance
@since 3.1.0
*/
    public FreqOld withRefFreq(Double value) {
           setRefFreq(new FreqM(value));
        return this;
    }

    @Override
/**
Set the intended usage of the frequency: transmit, receive or both.

@param value  An instances of type {@link ListCAU}
@return The current FreqOld object instance
@since 3.1.0
*/
    public FreqOld withFreqUse(ListCAU value) {
           setFreqUse(new TString(value.value()));
        return this;
    }

/**
 Get a string representation of this FreqOld instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "FreqOld {"+
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link FreqOld} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
