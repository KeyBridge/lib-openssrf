package us.gov.dod.standard.ssrf._3_1.ssrequest;

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
TrunkingAssignment (US) refers to the Agency Serial Number of the existing assignment to be relinquished or used in the trunked land mobile system.

Element of {@link Trunking}

Example: <pre>
* &lt;TrunkingAssignment&gt;
*   &lt;AgencySerialNum  cls="U"&gt;USA::AL:123&lt;/AgencySerialNum &gt;
*   &lt;FreqMax  cls="U"&gt;3350&lt;/FreqMax &gt;
*   &lt;FreqMin  cls="U"&gt;3150&lt;/FreqMin &gt;
*   &lt;IsRelinquished  cls="U"&gt;Yes&lt;/IsRelinquished &gt;
*   &lt;RelinquishmentDate  cls="U"&gt;2014-01-23&lt;/RelinquishmentDate &gt;
* &lt;/TrunkingAssignment&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrunkingAssignment", propOrder = {
    "isRelinquished",
    "agencySerialNum",
    "freqMax",
    "freqMin",
    "relinquishmentDate"
})
public class TrunkingAssignment {

/**
US:IsRelinquished  - Is Relinquished (Required) 

The Yes if this is an existing assignment to be relinquished by the trunked land mobile system. If No, the existing assignment will be used by (incorporated into) the system.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "IsRelinquished", required = true)
      private  TString isRelinquished;
/**
US:AgencySerialNum  - Agency Serial Number (Optional) 

The externally-assigned unique identifier of a frequency assignment.

Format is S12
@since 3.1.0
*/
    @XmlElement(name = "AgencySerialNum", required = false)
    private S12 agencySerialNum;
/**
US:FreqMax  - Frequency Maximum (Optional) 

The upper frequency of band.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "FreqMax", required = false)
    private FreqM freqMax;
/**
US:FreqMin  - Frequency Minimum (Optional) 

The lower frequency of band or discrete frequency.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "FreqMin", required = false)
    private FreqM freqMin;
/**
US:RelinquishmentDate  - Relinquishment Date (Optional) 

The expected date the existing assignment will be relinquished by the trunked land mobile system.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "RelinquishmentDate", required = false)
    private D relinquishmentDate;

/**
Get the Yes if this is an existing assignment to be relinquished by the trunked land mobile system. If No, the existing assignment will be used by (incorporated into) the system.

@return the IsRelinquished value in a {@link TString} data type
@since 3.1.0
*/
public TString getIsRelinquished() {
        return isRelinquished;
    }

/**
Set the Yes if this is an existing assignment to be relinquished by the trunked land mobile system. If No, the existing assignment will be used by (incorporated into) the system.

@param value the IsRelinquished value in a {@link TString} data type
@since 3.1.0
*/
public void setIsRelinquished(TString value) {
        this.isRelinquished = value;
    }

/**
Determine if the IsRelinquished is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIsRelinquished() {
return (this.isRelinquished!= null ? this.isRelinquished.isSetValue() : false);
    }

/**
Get the externally-assigned unique identifier of a frequency assignment.

@return the AgencySerialNum value in a {@link TS12} data type
@since 3.1.0
*/
public S12 getAgencySerialNum() {
        return agencySerialNum;
    }

/**
Set the externally-assigned unique identifier of a frequency assignment.

@param value the AgencySerialNum value in a {@link TS12} data type
@since 3.1.0
*/
public void setAgencySerialNum(S12 value) {
        this.agencySerialNum = value;
    }

/**
Determine if the AgencySerialNum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAgencySerialNum() {
        return (this.agencySerialNum!= null);
    }

/**
Get the upper frequency of band.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

@return the FreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMax() {
        return freqMax;
    }

/**
Set the upper frequency of band.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

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
Get the lower frequency of band or discrete frequency.

@return the FreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMin() {
        return freqMin;
    }

/**
Set the lower frequency of band or discrete frequency.

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
Get the expected date the existing assignment will be relinquished by the trunked land mobile system.

@return the RelinquishmentDate value in a {@link TD} data type
@since 3.1.0
*/
public D getRelinquishmentDate() {
        return relinquishmentDate;
    }

/**
Set the expected date the existing assignment will be relinquished by the trunked land mobile system.

@param value the RelinquishmentDate value in a {@link TD} data type
@since 3.1.0
*/
public void setRelinquishmentDate(D value) {
        this.relinquishmentDate = value;
    }

/**
Determine if the RelinquishmentDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRelinquishmentDate() {
        return (this.relinquishmentDate!= null);
    }

/**
Set the Yes if this is an existing assignment to be relinquished by the trunked land mobile system. If No, the existing assignment will be used by (incorporated into) the system.

@param value  An instances of type {@link ListCBO}
@return The current TrunkingAssignment object instance
@since 3.1.0
*/
    public TrunkingAssignment withIsRelinquished(ListCBO value) {
        setIsRelinquished(new TString(value.value()));
        return this;
    }

/**
Set the externally-assigned unique identifier of a frequency assignment.

@param value  An instances of type {@link String}
@return The current TrunkingAssignment object instance
@since 3.1.0
*/
    public TrunkingAssignment withAgencySerialNum(String value) {
           setAgencySerialNum(new S12(value));
        return this;
    }

/**
Set the upper frequency of band.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

@param value  An instances of type {@link Double}
@return The current TrunkingAssignment object instance
@since 3.1.0
*/
    public TrunkingAssignment withFreqMax(Double value) {
           setFreqMax(new FreqM(value));
        return this;
    }

/**
Set the lower frequency of band or discrete frequency.

@param value  An instances of type {@link Double}
@return The current TrunkingAssignment object instance
@since 3.1.0
*/
    public TrunkingAssignment withFreqMin(Double value) {
           setFreqMin(new FreqM(value));
        return this;
    }

/**
Set the expected date the existing assignment will be relinquished by the trunked land mobile system.

@param value  An instances of type {@link Calendar}
@return The current TrunkingAssignment object instance
@since 3.1.0
*/
    public TrunkingAssignment withRelinquishmentDate(Calendar value) {
           setRelinquishmentDate(new D(value));
        return this;
    }
/**
Set the expected date the existing assignment will be relinquished by the trunked land mobile system.

@param value  An instances of type {@link Date}
@return The current TrunkingAssignment object instance
@since 3.1.0
*/
    public TrunkingAssignment withRelinquishmentDate(Date value) {
           setRelinquishmentDate(new D(value));
        return this;
    }

/**
 Get a string representation of this TrunkingAssignment instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "TrunkingAssignment {"
 + (agencySerialNum !=null? " agencySerialNum [" + agencySerialNum +"]" : "") 
 + (freqMax !=null? " freqMax [" + freqMax +"]" : "") 
 + (freqMin !=null? " freqMin [" + freqMin +"]" : "") 
 + (isRelinquished !=null? " isRelinquished [" + isRelinquished +"]" : "") 
 + (relinquishmentDate !=null? " relinquishmentDate [" + relinquishmentDate +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link TrunkingAssignment} requires {@link TString IsRelinquished}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetIsRelinquished();
}

}
