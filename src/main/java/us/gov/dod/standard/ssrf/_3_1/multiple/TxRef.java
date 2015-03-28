package us.gov.dod.standard.ssrf._3_1.multiple;

import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
TxRef contains the reference of a Transmitter, and optionnally some of its TxModes and the associated Antennas and AntMode.

Element of {@link Configuration}

Sub-Elements are {@link TxAntModeRef}, {@link TxModeRef}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxRef", propOrder = {
    "serial",
    "txModeRef",
    "txAntModeRef"
})
public class TxRef {

/**
Serial  - Transmitter Serial (Required) 

The serial of a Transmitter in this configuration. The same transmitter can be referenced in different TxRef elements in order to properly group transmitter modes with antenna modes.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "Serial", required = true)
      private  Serial serial;
/**
TxModeRef (Optional)

TxModeRef contains references to the Transmitter and its modes, used to construct a Configuration.

Notes: TxModeRef specifies a transmitter mode that i
@since 3.1.0
*/
    @XmlElement(name = "TxModeRef")
      private  Set<TxModeRef> txModeRef;
/**
TxAntModeRef (Optional)

TxAntModeRef contains references to the Antenna and its AntMode, used to construct a Transmitter Configuration.

Notes: AntModeRef specifies an antenna mode that is 
@since 3.1.0
*/
    @XmlElement(name = "TxAntModeRef")
      private  Set<TxAntModeRef> txAntModeRef;

/**
Get the serial of a Transmitter in this configuration. The same transmitter can be referenced in different TxRef elements in order to properly group transmitter modes with antenna modes.

@return the Serial value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getTransmitter()} instead.
*/
@Deprecated
public Serial getSerial() {
        return serial;
    }

/**
Set the serial of a Transmitter in this configuration. The same transmitter can be referenced in different TxRef elements in order to properly group transmitter modes with antenna modes.

@param value the Serial value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setTransmitter(Transmitter)} instead.
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
Get the TxModeRef

Complex element TxModeRef contains references to the Transmitter and its modes, used to construct a Configuration.

@return  a {@link TxModeRef} instance
@since 3.1.0
*/
    public Set<TxModeRef> getTxModeRef() {
        if (txModeRef == null) {
            txModeRef = new HashSet<TxModeRef>();
        }
        return this.txModeRef;
    }

/**
Determine if the TxModeRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTxModeRef() {
        return ((this.txModeRef!= null)&&(!this.txModeRef.isEmpty()));
    }

/**
  Clear the TxModeRef field. This sets the field to null.
 */
    public void unsetTxModeRef() {
        this.txModeRef = null;
    }

/**
Get the TxAntModeRef

Complex element TxAntModeRef contains references to the Antenna and its AntMode, used to construct a Transmitter Configuration.

@return  a {@link TxAntModeRef} instance
@since 3.1.0
*/
    public Set<TxAntModeRef> getTxAntModeRef() {
        if (txAntModeRef == null) {
            txAntModeRef = new HashSet<TxAntModeRef>();
        }
        return this.txAntModeRef;
    }

/**
Determine if the TxAntModeRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTxAntModeRef() {
        return ((this.txAntModeRef!= null)&&(!this.txAntModeRef.isEmpty()));
    }

/**
  Clear the TxAntModeRef field. This sets the field to null.
 */
    public void unsetTxAntModeRef() {
        this.txAntModeRef = null;
    }

/**
Set the serial of a Transmitter in this configuration. The same transmitter can be referenced in different TxRef elements in order to properly group transmitter modes with antenna modes.

@param value  An instances of type {@link Serial}
@return The current TxRef object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withTransmitter(Transmitter)} instead.
*/
@Deprecated
    public TxRef withSerial(Serial value) {
        setSerial(value);
        return this;
    }

/**
Set the TxModeRef

Complex element TxModeRef contains references to the Transmitter and its modes, used to construct a Configuration.

@param values  One or more instances of type {@link TxModeRef...}
@return The current TxRef object instance
@since 3.1.0
*/
    public TxRef withTxModeRef(TxModeRef... values) {
        if (values!= null) {
            for (TxModeRef value: values) {
                getTxModeRef().add(value);
            }
        }
        return this;
    }

/**
Set the TxModeRef

Complex element TxModeRef contains references to the Transmitter and its modes, used to construct a Configuration.

@param values  A collection of {@link TxModeRef} instances
@return The current TxRef object instance
@since 3.1.0
*/
    public TxRef withTxModeRef(Collection<TxModeRef> values) {
        if (values!= null) {
            getTxModeRef().addAll(values);
        }
        return this;
    }

/**
Set the TxAntModeRef

Complex element TxAntModeRef contains references to the Antenna and its AntMode, used to construct a Transmitter Configuration.

@param values  One or more instances of type {@link TxAntModeRef...}
@return The current TxRef object instance
@since 3.1.0
*/
    public TxRef withTxAntModeRef(TxAntModeRef... values) {
        if (values!= null) {
            for (TxAntModeRef value: values) {
                getTxAntModeRef().add(value);
            }
        }
        return this;
    }

/**
Set the TxAntModeRef

Complex element TxAntModeRef contains references to the Antenna and its AntMode, used to construct a Transmitter Configuration.

@param values  A collection of {@link TxAntModeRef} instances
@return The current TxRef object instance
@since 3.1.0
*/
    public TxRef withTxAntModeRef(Collection<TxAntModeRef> values) {
        if (values!= null) {
            getTxAntModeRef().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this TxRef instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "TxRef {"
 + (serial !=null? " serial [" + serial +"]" : "") 
 + (txAntModeRef !=null? " txAntModeRef [" + txAntModeRef +"]" : "") 
 + (txModeRef !=null? " txModeRef [" + txModeRef +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link TxRef} requires {@link Serial Serial}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetSerial();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
Serial  - Transmitter Serial (Required) 

The serial of a Transmitter in this configuration. The same transmitter can be referenced in different TxRef elements in order to properly group transmitter modes with antenna modes.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Transmitter transmitter;

/**
Get the serial of a Transmitter in this configuration. The same transmitter can be referenced in different TxRef elements in order to properly group transmitter modes with antenna modes.

@return the serial value in a {@link Transmitter} data type
@since 3.1.0
*/
public Transmitter getTransmitter(){
return transmitter;
}
/**
 Determine if the transmitter field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetTransmitter() {
    return this.transmitter != null ;
}

/**
Set the serial of a Transmitter in this configuration. The same transmitter can be referenced in different TxRef elements in order to properly group transmitter modes with antenna modes.

@param value  An instances of type {@link Transmitter}
@return The current TxRef object instance
@since 3.1.0
*/
public TxRef withTransmitter(Transmitter value) {
this.transmitter = value;
return this;
}

  /**
   * Update the SSRF data type references in this TxRef record.
   * <p>
 */
public void prepare() {
this.serial = transmitter !=null? transmitter.getSerial() : null;
}

/**
   * Update the SSRF data type references in this TxRef record after loading from XML.

   * This method builds the transient {@link #transmitter} with values
   * from the imported {@link #serial} field. This method should
   * typically be called after the TxRef is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (serial==null || !serial.isSetValue() ) {return;}
for(Transmitter instance : root.getTransmitter()) {
if(serial.equals(instance.getSerial())){
transmitter = instance;
return;}
}}//</editor-fold>

}
