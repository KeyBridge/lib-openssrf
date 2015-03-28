package us.gov.dod.standard.ssrf._3_1.multiple;

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
TxModeRef contains references to the Transmitter and its modes, used to construct a Configuration.

Element of {@link TxRef}

Example: <pre>
* &lt;TxModeRef&gt;
*   &lt;Serial cls="U"&gt;USA:NTIA:TX:123&lt;/Serial&gt;
*   &lt;ModeID cls="U"&gt;CLEAR VOICE H. POWER&lt;/ModeID&gt;
* &lt;/TxModeRef&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxModeRef", propOrder = {
    "modeID",
    "powerLimit"
})
public class TxModeRef {

/**
ModeID  - Mode Identifier (Required) 

The unique identifier of a TxMode of the transmitter in this configuration. This mode is from the transmitter specified in the Serial field of the parent TxRef element.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "ModeID", required = true)
      private  S20 modeID;
/**
PowerLimit  - Power Limit (Optional) 

The power limit of this transmitter mode when in this configuration.

Format is SN(10,7) (dBW)
@since 3.1.0
*/
    @XmlElement(name = "PowerLimit", required = false)
    private dBW powerLimit;

/**
Get the unique identifier of a TxMode of the transmitter in this configuration. This mode is from the transmitter specified in the Serial field of the parent TxRef element.

@return the ModeID value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getModeID() {
        return modeID;
    }

/**
Set the unique identifier of a TxMode of the transmitter in this configuration. This mode is from the transmitter specified in the Serial field of the parent TxRef element.

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
Get the power limit of this transmitter mode when in this configuration.

@return the PowerLimit value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getPowerLimit() {
        return powerLimit;
    }

/**
Set the power limit of this transmitter mode when in this configuration.

@param value the PowerLimit value in a {@link TdBW} data type
@since 3.1.0
*/
public void setPowerLimit(dBW value) {
        this.powerLimit = value;
    }

/**
Determine if the PowerLimit is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPowerLimit() {
        return (this.powerLimit!= null);
    }

/**
Set the unique identifier of a TxMode of the transmitter in this configuration. This mode is from the transmitter specified in the Serial field of the parent TxRef element.

@param value  An instances of type {@link TS20}
@return The current TxModeRef object instance
@since 3.1.0
*/
    public TxModeRef withModeID(TS20 value) {
        return this;
    }

/**
Set the power limit of this transmitter mode when in this configuration.

@param value  An instances of type {@link Double}
@return The current TxModeRef object instance
@since 3.1.0
*/
    public TxModeRef withPowerLimit(Double value) {
           setPowerLimit(new dBW(value));
        return this;
    }

/**
 Get a string representation of this TxModeRef instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "TxModeRef {"
 + (modeID !=null? " modeID [" + modeID +"]" : "") 
 + (powerLimit !=null? " powerLimit [" + powerLimit +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link TxModeRef} requires {@link S20 ModeID}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetModeID();
}

}
