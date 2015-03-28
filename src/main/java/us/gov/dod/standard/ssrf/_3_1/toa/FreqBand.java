package us.gov.dod.standard.ssrf._3_1.toa;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
FreqBand contains the allocation of a specific frequency band to radiocommunication services. It may also provide additional information such as the specification of the rights and responsibilities of a user.

Element of {@link TOA}

Sub-Element is {@link Allocation}

Example: <pre>
* &lt;FreqBand&gt;
*   &lt;FreqMin cls="U"&gt;960&lt;/FreqMin&gt;
*   &lt;FreqMax cls="U"&gt;1164&lt;/FreqMax&gt;
*   &lt;Allocation&gt;
*     &lt;AllocatedService cls="U"&gt;Aeronautical Mobile Service&lt;/AllocatedService&gt;
*     &lt;Priority cls="U"&gt;Primary&lt;/Priority&gt;
*   &lt;/Allocation&gt;
* &lt;/FreqBand&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreqBand", propOrder = {
    "freqMin",
    "freqMax",
    "useIndicator",
    "allocation"
})
public class FreqBand {

/**
FreqMin  - Minimum Frequency (Required) 

The nominal frequency or minimum value of the frequency range.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "FreqMin", required = true)
      private  FreqM freqMin;
/**
FreqMax  - Maximum Frequency (Required) 

The maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "FreqMax", required = true)
      private  FreqM freqMax;
/**
UseIndicator  - Use Indicator (Optional) 

The permitted uses of this band (e.g., "Government", "Non-government", etc).

Format is S40
@since 3.1.0
*/
    @XmlElement(name = "UseIndicator", required = false)
    private S40 useIndicator;
/**
Allocation (Optional)

Allocation contains the allocation of a specific frequency band to a specific radiocommunication service.
@since 3.1.0
*/
    @XmlElement(name = "Allocation")
      private  Set<Allocation> allocation;
/**
footnotes - Link to band usage notes (Optional) 

A list containing each Footnote index applicable to the current frequency band.  Each entry in the list should be separated by a blank space.

Format is List of UN(6)
@since 3.1.0
*/
    @XmlAttribute(name = "footnotes")
      private  Set<BigInteger> footnotes;

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
Get the permitted uses of this band (e.g., "Government", "Non-government", etc).

@return the UseIndicator value in a {@link TS40} data type
@since 3.1.0
*/
public S40 getUseIndicator() {
        return useIndicator;
    }

/**
Set the permitted uses of this band (e.g., "Government", "Non-government", etc).

@param value the UseIndicator value in a {@link TS40} data type
@since 3.1.0
*/
public void setUseIndicator(S40 value) {
        this.useIndicator = value;
    }

/**
Determine if the UseIndicator is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetUseIndicator() {
        return (this.useIndicator!= null);
    }

/**
Get the Allocation

Complex element Allocation contains the allocation of a specific frequency band to a specific radiocommunication service.

@return  a {@link Allocation} instance
@since 3.1.0
*/
    public Set<Allocation> getAllocation() {
        if (allocation == null) {
            allocation = new HashSet<Allocation>();
        }
        return this.allocation;
    }

/**
Determine if the Allocation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAllocation() {
        return ((this.allocation!= null)&&(!this.allocation.isEmpty()));
    }

/**
  Clear the Allocation field. This sets the field to null.
 */
    public void unsetAllocation() {
        this.allocation = null;
    }

/**
Get a list containing each Footnote index applicable to the current frequency band.  Each entry in the list should be separated by a blank space.

@return  a {@link BigInteger} instance
@since 3.1.0
*/
    public Set<BigInteger> getFootnotes() {
        if (footnotes == null) {
            footnotes = new HashSet<BigInteger>();
        }
        return this.footnotes;
    }

/**
Determine if the Footnotes is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFootnotes() {
        return ((this.footnotes!= null)&&(!this.footnotes.isEmpty()));
    }

/**
  Clear the Footnotes field. This sets the field to null.
 */
    public void unsetFootnotes() {
        this.footnotes = null;
    }

/**
Set the nominal frequency or minimum value of the frequency range.

@param value  An instances of type {@link TFreqM}
@return The current FreqBand object instance
@since 3.1.0
*/
    public FreqBand withFreqMin(TFreqM value) {
        return this;
    }

/**
Set the maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

@param value  An instances of type {@link TFreqM}
@return The current FreqBand object instance
@since 3.1.0
*/
    public FreqBand withFreqMax(TFreqM value) {
        return this;
    }

/**
Set the permitted uses of this band (e.g., "Government", "Non-government", etc).

@param value  An instances of type {@link String}
@return The current FreqBand object instance
@since 3.1.0
*/
    public FreqBand withUseIndicator(String value) {
           setUseIndicator(new S40(value));
        return this;
    }

/**
Set the Allocation

Complex element Allocation contains the allocation of a specific frequency band to a specific radiocommunication service.

@param values  One or more instances of type {@link Allocation...}
@return The current FreqBand object instance
@since 3.1.0
*/
    public FreqBand withAllocation(Allocation... values) {
        if (values!= null) {
            for (Allocation value: values) {
                getAllocation().add(value);
            }
        }
        return this;
    }

/**
Set the Allocation

Complex element Allocation contains the allocation of a specific frequency band to a specific radiocommunication service.

@param values  A collection of {@link Allocation} instances
@return The current FreqBand object instance
@since 3.1.0
*/
    public FreqBand withAllocation(Collection<Allocation> values) {
        if (values!= null) {
            getAllocation().addAll(values);
        }
        return this;
    }

/**
Set a list containing each Footnote index applicable to the current frequency band.  Each entry in the list should be separated by a blank space.

@param values  One or more instances of type {@link BigInteger...}
@return The current FreqBand object instance
@since 3.1.0
*/
    public FreqBand withFootnotes(BigInteger... values) {
        if (values!= null) {
            for (BigInteger value: values) {
                getFootnotes().add(value);
            }
        }
        return this;
    }

/**
Set a list containing each Footnote index applicable to the current frequency band.  Each entry in the list should be separated by a blank space.

@param values  A collection of {@link Footnotes} instances
@return The current FreqBand object instance
@since 3.1.0
*/
    public FreqBand withFootnotes(Collection<BigInteger> values) {
        if (values!= null) {
            getFootnotes().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this FreqBand instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "FreqBand {"
 + (allocation !=null? " allocation [" + allocation +"]" : "") 
 + (footnotes !=null? " footnotes [" + footnotes +"]" : "") 
 + (freqMax !=null? " freqMax [" + freqMax +"]" : "") 
 + (freqMin !=null? " freqMin [" + freqMin +"]" : "") 
 + (useIndicator !=null? " useIndicator [" + useIndicator +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link FreqBand} requires {@link FreqM FreqMax}, {@link FreqM FreqMin}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetFreqMax() &&  isSetFreqMin();
}

}
