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
RxRef contains the reference of a Receiver, and optionnally some of its RxModes and the associated Antennas and AntMode.

Element of {@link Configuration}

Sub-Elements are {@link RxAntModeRef}, {@link RxModeRef}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxRef", propOrder = {
    "serial",
    "rxModeRef",
    "rxAntModeRef"
})
public class RxRef {

/**
Serial  - Receiver Serial (Required) 

The identifier of the related Receiver used in this configuration. The same receiver can be referenced in different RxRef elements in order to properly group receiver modes with antenna modes.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "Serial", required = true)
      private  Serial serial;
/**
RxModeRef (Optional)

RxModeRef references a RxMode of the receiver used in a specific configuration.
@since 3.1.0
*/
    @XmlElement(name = "RxModeRef", nillable = true)
      private  Set<RxModeRef> rxModeRef;
/**
RxAntModeRef (Optional)

RxAntModeRef contains references to the Antenna and its AntMode, used to construct a Receiver Configuration.
@since 3.1.0
*/
    @XmlElement(name = "RxAntModeRef")
      private  Set<RxAntModeRef> rxAntModeRef;

/**
Get the identifier of the related Receiver used in this configuration. The same receiver can be referenced in different RxRef elements in order to properly group receiver modes with antenna modes.

@return the Serial value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getReceiver()} instead.
*/
@Deprecated
public Serial getSerial() {
        return serial;
    }

/**
Set the identifier of the related Receiver used in this configuration. The same receiver can be referenced in different RxRef elements in order to properly group receiver modes with antenna modes.

@param value the Serial value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setReceiver(Receiver)} instead.
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
Get the RxModeRef

Complex element RxModeRef references a RxMode of the receiver used in a specific configuration.

@return  a {@link RxModeRef} instance
@since 3.1.0
*/
    public Set<RxModeRef> getRxModeRef() {
        if (rxModeRef == null) {
            rxModeRef = new HashSet<RxModeRef>();
        }
        return this.rxModeRef;
    }

/**
Determine if the RxModeRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRxModeRef() {
        return ((this.rxModeRef!= null)&&(!this.rxModeRef.isEmpty()));
    }

/**
  Clear the RxModeRef field. This sets the field to null.
 */
    public void unsetRxModeRef() {
        this.rxModeRef = null;
    }

/**
Get the RxAntModeRef

Complex element RxAntModeRef contains references to the Antenna and its AntMode, used to construct a Receiver Configuration.

@return  a {@link RxAntModeRef} instance
@since 3.1.0
*/
    public Set<RxAntModeRef> getRxAntModeRef() {
        if (rxAntModeRef == null) {
            rxAntModeRef = new HashSet<RxAntModeRef>();
        }
        return this.rxAntModeRef;
    }

/**
Determine if the RxAntModeRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRxAntModeRef() {
        return ((this.rxAntModeRef!= null)&&(!this.rxAntModeRef.isEmpty()));
    }

/**
  Clear the RxAntModeRef field. This sets the field to null.
 */
    public void unsetRxAntModeRef() {
        this.rxAntModeRef = null;
    }

/**
Set the identifier of the related Receiver used in this configuration. The same receiver can be referenced in different RxRef elements in order to properly group receiver modes with antenna modes.

@param value  An instances of type {@link Serial}
@return The current RxRef object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withReceiver(Receiver)} instead.
*/
@Deprecated
    public RxRef withSerial(Serial value) {
        setSerial(value);
        return this;
    }

/**
Set the RxModeRef

Complex element RxModeRef references a RxMode of the receiver used in a specific configuration.

@param values  One or more instances of type {@link RxModeRef...}
@return The current RxRef object instance
@since 3.1.0
*/
    public RxRef withRxModeRef(RxModeRef... values) {
        if (values!= null) {
            for (RxModeRef value: values) {
                getRxModeRef().add(value);
            }
        }
        return this;
    }

/**
Set the RxModeRef

Complex element RxModeRef references a RxMode of the receiver used in a specific configuration.

@param values  A collection of {@link RxModeRef} instances
@return The current RxRef object instance
@since 3.1.0
*/
    public RxRef withRxModeRef(Collection<RxModeRef> values) {
        if (values!= null) {
            getRxModeRef().addAll(values);
        }
        return this;
    }

/**
Set the RxAntModeRef

Complex element RxAntModeRef contains references to the Antenna and its AntMode, used to construct a Receiver Configuration.

@param values  One or more instances of type {@link RxAntModeRef...}
@return The current RxRef object instance
@since 3.1.0
*/
    public RxRef withRxAntModeRef(RxAntModeRef... values) {
        if (values!= null) {
            for (RxAntModeRef value: values) {
                getRxAntModeRef().add(value);
            }
        }
        return this;
    }

/**
Set the RxAntModeRef

Complex element RxAntModeRef contains references to the Antenna and its AntMode, used to construct a Receiver Configuration.

@param values  A collection of {@link RxAntModeRef} instances
@return The current RxRef object instance
@since 3.1.0
*/
    public RxRef withRxAntModeRef(Collection<RxAntModeRef> values) {
        if (values!= null) {
            getRxAntModeRef().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this RxRef instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "RxRef {"
 + (rxAntModeRef !=null? " rxAntModeRef [" + rxAntModeRef +"]" : "") 
 + (rxModeRef !=null? " rxModeRef [" + rxModeRef +"]" : "") 
 + (serial !=null? " serial [" + serial +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link RxRef} requires {@link Serial Serial}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetSerial();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
Serial  - Receiver Serial (Required) 

The identifier of the related Receiver used in this configuration. The same receiver can be referenced in different RxRef elements in order to properly group receiver modes with antenna modes.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Receiver receiver;

/**
Get the identifier of the related Receiver used in this configuration. The same receiver can be referenced in different RxRef elements in order to properly group receiver modes with antenna modes.

@return  a {@link Receiver} instance
@since 3.1.0
*/
public Receiver getReceiver(){
return receiver;
}
/**
 Determine if the receiver field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetReceiver() {
    return this.receiver != null ;
}

/**
Set the identifier of the related Receiver used in this configuration. The same receiver can be referenced in different RxRef elements in order to properly group receiver modes with antenna modes.

@param value  An instances of type {@link Receiver}
@return The current RxRef object instance
@since 3.1.0
*/
public RxRef withReceiver(Receiver value) {
this.receiver = value;
return this;
}

  /**
   * Update the SSRF data type references in this RxRef record.
   * <p>
 */
public void prepare() {
this.serial = receiver !=null? receiver.getSerial() : null;
}

/**
   * Update the SSRF data type references in this RxRef record after loading from XML.

   * This method builds the transient {@link #receiver} with values
   * from the imported {@link #serial} field. This method should
   * typically be called after the RxRef is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (serial==null || !serial.isSetValue() ) {return;}
for(Receiver instance : root.getReceiver()) {
if(serial.equals(instance.getSerial())){
receiver = instance;
return;}
}}//</editor-fold>

}
