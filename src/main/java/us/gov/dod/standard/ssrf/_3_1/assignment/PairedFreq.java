package us.gov.dod.standard.ssrf._3_1.assignment;

import us.gov.dod.standard.ssrf._3_1.*;
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
PairedFreq (US) describes an associated frequency set for the repeater, duplex link or frequency diversity capability.

Element of {@link Freq}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairedFreq", propOrder = {
    "freq",
    "assignmentRef",
    "pairedASN",
    "pairedType"
})
public class PairedFreq {

/**
US:Freq  - Frequency (Required) 

The paired frequency for the repeater, duplex link or frequency diversity capability.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "Freq", required = true)
      private  FreqM freq;
/**
US:AssignmentRef - Assignment Reference (Optional) 

A reference to an Assignment that is paired with this AsgnAllot in a repeater, duplex link or frequency diversity capability.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "AssignmentRef", required = false)
    private Serial assignmentRef;
/**
US:PairedASN  - Paired Agency Serial Number (Optional) 

The agency serial number of the assignment that is paired with this Assignment in a repeater, duplex link or frequency diversity capability.

Format is S12
@since 3.1.0
*/
    @XmlElement(name = "PairedASN", required = false)
    private US12 pairedASN;
/**
US:PairedType - Paired Type (Optional) 

If the paired frequency is a transmitting repeater frequency, a receiving repeater frequency, a duplex pairing, frequency diversity or space diversity.

Format is L:UPU
@since 3.1.0
*/
    @XmlElement(name = "PairedType", required = false)
    private S20 pairedType;

/**
Get the paired frequency for the repeater, duplex link or frequency diversity capability.

@return the Freq value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreq() {
        return freq;
    }

/**
Set the paired frequency for the repeater, duplex link or frequency diversity capability.

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
Get a reference to an Assignment that is paired with this AsgnAllot in a repeater, duplex link or frequency diversity capability.

@return the AssignmentRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getAssignment()} instead.
*/
@Deprecated
public Serial getAssignmentRef() {
        return assignmentRef;
    }

/**
Set a reference to an Assignment that is paired with this AsgnAllot in a repeater, duplex link or frequency diversity capability.

@param value the AssignmentRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setAssignment(Assignment)} instead.
*/
@Deprecated
public void setAssignmentRef(Serial value) {
        this.assignmentRef = value;
    }

/**
Determine if the AssignmentRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAssignmentRef() {
        return (this.assignmentRef!= null);
    }

/**
Get the agency serial number of the assignment that is paired with this Assignment in a repeater, duplex link or frequency diversity capability.

@return the PairedASN value in a {@link TUS12} data type
@since 3.1.0
*/
public US12 getPairedASN() {
        return pairedASN;
    }

/**
Set the agency serial number of the assignment that is paired with this Assignment in a repeater, duplex link or frequency diversity capability.

@param value the PairedASN value in a {@link TUS12} data type
@since 3.1.0
*/
public void setPairedASN(US12 value) {
        this.pairedASN = value;
    }

/**
Determine if the PairedASN is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPairedASN() {
        return (this.pairedASN!= null);
    }

/**
Get if the paired frequency is a transmitting repeater frequency, a receiving repeater frequency, a duplex pairing, frequency diversity or space diversity.

@return the PairedType value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getPairedType() {
        return pairedType;
    }

/**
Set if the paired frequency is a transmitting repeater frequency, a receiving repeater frequency, a duplex pairing, frequency diversity or space diversity.

@param value the PairedType value in a {@link TS20} data type
@since 3.1.0
*/
public void setPairedType(S20 value) {
        this.pairedType = value;
    }

/**
Determine if the PairedType is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPairedType() {
        return (this.pairedType!= null);
    }

/**
Set the paired frequency for the repeater, duplex link or frequency diversity capability.

@param value  An instances of type {@link TFreqM}
@return The current PairedFreq object instance
@since 3.1.0
*/
    public PairedFreq withFreq(TFreqM value) {
        return this;
    }

/**
Set a reference to an Assignment that is paired with this AsgnAllot in a repeater, duplex link or frequency diversity capability.

@param value  An instances of type {@link Serial}
@return The current PairedFreq object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withAssignment(Assignment)} instead.
*/
@Deprecated
    public PairedFreq withAssignmentRef(Serial value) {
           setAssignmentRef(value);
        return this;
    }

/**
Set the agency serial number of the assignment that is paired with this Assignment in a repeater, duplex link or frequency diversity capability.

@param value  An instances of type {@link String}
@return The current PairedFreq object instance
@since 3.1.0
*/
    public PairedFreq withPairedASN(String value) {
           setPairedASN(new US12(value));
        return this;
    }

/**
Set if the paired frequency is a transmitting repeater frequency, a receiving repeater frequency, a duplex pairing, frequency diversity or space diversity.

@param value  An instances of type {@link String}
@return The current PairedFreq object instance
@since 3.1.0
*/
    public PairedFreq withPairedType(String value) {
           setPairedType(new S20(value));
        return this;
    }

/**
 Get a string representation of this PairedFreq instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "PairedFreq {"
 + (assignmentRef !=null? " assignmentRef [" + assignmentRef +"]" : "") 
 + (freq !=null? " freq [" + freq +"]" : "") 
 + (pairedASN !=null? " pairedASN [" + pairedASN +"]" : "") 
 + (pairedType !=null? " pairedType [" + pairedType +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link PairedFreq} requires {@link FreqM Freq}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetFreq();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
US:AssignmentRef - Assignment Reference (Optional) 

A reference to an Assignment that is paired with this AsgnAllot in a repeater, duplex link or frequency diversity capability.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Assignment assignment;

/**
Get a reference to an Assignment that is paired with this AsgnAllot in a repeater, duplex link or frequency diversity capability.

@return  a {@link Assignment} instance
@since 3.1.0
*/
public Assignment getAssignment(){
return assignment;
}
/**
 Determine if the assignment field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetAssignment() {
    return this.assignment != null ;
}

/**
Set a reference to an Assignment that is paired with this AsgnAllot in a repeater, duplex link or frequency diversity capability.

@param value  An instances of type {@link Assignment}
@return The current PairedFreq object instance
@since 3.1.0
*/
public PairedFreq withAssignment(Assignment value) {
this.assignment = value;
return this;
}

  /**
   * Update the SSRF data type references in this PairedFreq record.
   * <p>
 */
public void prepare() {
this.assignmentRef = assignment !=null? assignment.getSerial() : null;
}

/**
   * Update the SSRF data type references in this PairedFreq record after loading from XML.

   * This method builds the transient {@link #assignment} with values
   * from the imported {@link #assignmentRef} field. This method should
   * typically be called after the PairedFreq is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (assignmentRef==null || !assignmentRef.isSetValue() ) {return;}
for(Assignment instance : root.getAssignment()) {
if(assignmentRef.equals(instance.getSerial())){
assignment = instance;
return;}
}}//</editor-fold>

}
