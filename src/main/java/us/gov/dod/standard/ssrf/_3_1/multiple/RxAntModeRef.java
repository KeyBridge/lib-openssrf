package us.gov.dod.standard.ssrf._3_1.multiple;

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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
RxAntModeRef contains references to the Antenna and its AntMode, used to construct a Receiver Configuration.

Element of {@link RxRef}

Example: <pre>
* &lt;RxAntModeRef&gt;
*   &lt;Serial cls="U"&gt;USA:NTIA:AN:123&lt;/Serial&gt;
*   &lt;ModeID cls="U"&gt;TRACKING&lt;/ModeID&gt;
* &lt;/RxAntModeRef&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxAntModeRef", propOrder = {
    "serial",
    "modeID",
    "couplingLoss"
})
@XmlSeeAlso({
    TxAntModeRef.class
})
public class RxAntModeRef {

/**
Serial  - Antenna Identifier (Required) 

The reference to an Antenna in this configuration. This antenna is associated with the receiver specified in the Serial field of the parent RxRef element.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "Serial", required = true)
      private  Serial serial;
/**
ModeID  - Antenna Mode Identifier (Optional) 

The unique name of an AntMode of the Antenna specified in the corresponding Serial field. This antenna mode is grouped with the receiver modes specified in RxModeRef.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "ModeID", required = false)
    private S20 modeID;
/**
CouplingLoss  - Coupling Loss (Optional) 

The loss that occurs when energy is transferred between the transmitter/receiver and the antenna.

Format is SN(6,3) (dB)
@since 3.1.0
*/
    @XmlElement(name = "CouplingLoss", required = false)
    private dB couplingLoss;

/**
Get the reference to an Antenna in this configuration. This antenna is associated with the receiver specified in the Serial field of the parent RxRef element.

@return the Serial value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getAntenna()} instead.
*/
@Deprecated
public Serial getSerial() {
        return serial;
    }

/**
Set the reference to an Antenna in this configuration. This antenna is associated with the receiver specified in the Serial field of the parent RxRef element.

@param value the Serial value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setAntenna(Antenna)} instead.
*/
@Deprecated
public void setSerial(Serial value) {
        this.serial = value;
    }

/**
Determine if the Serial is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSerial() {
        return (this.serial!= null);
    }

/**
Get the unique name of an AntMode of the Antenna specified in the corresponding Serial field. This antenna mode is grouped with the receiver modes specified in RxModeRef.

@return the ModeID value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getModeID() {
        return modeID;
    }

/**
Set the unique name of an AntMode of the Antenna specified in the corresponding Serial field. This antenna mode is grouped with the receiver modes specified in RxModeRef.

@param value the ModeID value in a {@link TS20} data type
@since 3.1.0
*/
public void setModeID(S20 value) {
        this.modeID = value;
    }

/**
Determine if the ModeID is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetModeID() {
        return (this.modeID!= null);
    }

/**
Get the loss that occurs when energy is transferred between the transmitter/receiver and the antenna.

@return the CouplingLoss value in a {@link TdB} data type
@since 3.1.0
*/
public dB getCouplingLoss() {
        return couplingLoss;
    }

/**
Set the loss that occurs when energy is transferred between the transmitter/receiver and the antenna.

@param value the CouplingLoss value in a {@link TdB} data type
@since 3.1.0
*/
public void setCouplingLoss(dB value) {
        this.couplingLoss = value;
    }

/**
Determine if the CouplingLoss is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCouplingLoss() {
        return (this.couplingLoss!= null);
    }

/**
Set the reference to an Antenna in this configuration. This antenna is associated with the receiver specified in the Serial field of the parent RxRef element.

@param value  An instances of type {@link Serial}
@return The current RxAntModeRef object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withAntenna(Antenna)} instead.
*/
@Deprecated
    public RxAntModeRef withSerial(Serial value) {
        setSerial(value);
        return this;
    }

/**
Set the unique name of an AntMode of the Antenna specified in the corresponding Serial field. This antenna mode is grouped with the receiver modes specified in RxModeRef.

@param value  An instances of type {@link String}
@return The current RxAntModeRef object instance
@since 3.1.0
*/
    public RxAntModeRef withModeID(String value) {
           setModeID(new S20(value));
        return this;
    }

/**
Set the loss that occurs when energy is transferred between the transmitter/receiver and the antenna.

@param value  An instances of type {@link Double}
@return The current RxAntModeRef object instance
@since 3.1.0
*/
    public RxAntModeRef withCouplingLoss(Double value) {
           setCouplingLoss(new dB(value));
        return this;
    }

/**
 Get a string representation of this RxAntModeRef instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "RxAntModeRef {"
 + (couplingLoss !=null? " couplingLoss [" + couplingLoss +"]" : "") 
 + (modeID !=null? " modeID [" + modeID +"]" : "") 
 + (serial !=null? " serial [" + serial +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link RxAntModeRef} requires {@link Serial Serial}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetSerial();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
Serial  - Antenna Identifier (Required) 

The reference to an Antenna in this configuration. This antenna is associated with the receiver specified in the Serial field of the parent RxRef element.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Antenna antenna;

/**
Get the reference to an Antenna in this configuration. This antenna is associated with the receiver specified in the Serial field of the parent RxRef element.

@return  a {@link Antenna} instance
@since 3.1.0
*/
public Antenna getAntenna(){
return antenna;
}
/**
 Determine if the antenna field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetAntenna() {
    return this.antenna != null ;
}

/**
Set the reference to an Antenna in this configuration. This antenna is associated with the receiver specified in the Serial field of the parent RxRef element.

@param value  An instances of type {@link Antenna}
@return The current RxAntModeRef object instance
@since 3.1.0
*/
public RxAntModeRef withAntenna(Antenna value) {
this.antenna = value;
return this;
}

  /**
   * Update the SSRF data type references in this RxAntModeRef record.
   * <p>
 */
public void prepare() {
this.serial = antenna !=null? antenna.getSerial() : null;
}

/**
   * Update the SSRF data type references in this RxAntModeRef record after loading from XML.

   * This method builds the transient {@link #antenna} with values
   * from the imported {@link #serial} field. This method should
   * typically be called after the RxAntModeRef is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (serial==null || !serial.isSetValue() ) {return;}
for(Antenna instance : root.getAntenna()) {
if(serial.equals(instance.getSerial())){
antenna = instance;
return;}
}}//</editor-fold>

}
