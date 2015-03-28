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
DiagramLine defines a line between two endpoints on the diagram.

Element of {@link SSRequest}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagramLine", propOrder = {
    "txEndpointID",
    "rxEndpointID",
    "configID"
})
public class DiagramLine {

/**
TxEndpointID - Tx Endpoint ID (Required) 

The Endpoint ID at the originating (transmitting) endpoint of a line on the diagram. There must be a corresponding DiagramEndpoint element with this name. Note there may be more than one line with the same originating and terminating endpoints if those lines reference different Configurations.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "TxEndpointID", required = true)
      private  S20 txEndpointID;
/**
RxEndpointID - Rx Endpoint ID (Required) 

The Endpoint ID at the terminating (receiving) endpoint of a line on the diagram. There must be a corresponding DiagramEndpoint element with this name. Note there may be more than one line with the same originating and terminating endpoints if those lines reference different Configurations.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "RxEndpointID", required = true)
      private  S20 rxEndpointID;
/**
ConfigID  - Configuration ID (Optional) 

A reference to a Configuration associated with this line on the diagram.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "ConfigID", required = false)
    private S100 configID;

/**
Get the Endpoint ID at the originating (transmitting) endpoint of a line on the diagram. There must be a corresponding DiagramEndpoint element with this name. Note there may be more than one line with the same originating and terminating endpoints if those lines reference different Configurations.

@return the TxEndpointID value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getTxEndpointID() {
        return txEndpointID;
    }

/**
Set the Endpoint ID at the originating (transmitting) endpoint of a line on the diagram. There must be a corresponding DiagramEndpoint element with this name. Note there may be more than one line with the same originating and terminating endpoints if those lines reference different Configurations.

@param value the TxEndpointID value in a {@link TS20} data type
@since 3.1.0
*/
public void setTxEndpointID(S20 value) {
        this.txEndpointID = value;
    }

/**
Determine if the TxEndpointID is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTxEndpointID() {
        return (this.txEndpointID!= null);
    }

/**
Get the Endpoint ID at the terminating (receiving) endpoint of a line on the diagram. There must be a corresponding DiagramEndpoint element with this name. Note there may be more than one line with the same originating and terminating endpoints if those lines reference different Configurations.

@return the RxEndpointID value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getRxEndpointID() {
        return rxEndpointID;
    }

/**
Set the Endpoint ID at the terminating (receiving) endpoint of a line on the diagram. There must be a corresponding DiagramEndpoint element with this name. Note there may be more than one line with the same originating and terminating endpoints if those lines reference different Configurations.

@param value the RxEndpointID value in a {@link TS20} data type
@since 3.1.0
*/
public void setRxEndpointID(S20 value) {
        this.rxEndpointID = value;
    }

/**
Determine if the RxEndpointID is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRxEndpointID() {
        return (this.rxEndpointID!= null);
    }

/**
Get a reference to a Configuration associated with this line on the diagram.

@return the ConfigID value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getConfigID() {
        return configID;
    }

/**
Set a reference to a Configuration associated with this line on the diagram.

@param value the ConfigID value in a {@link TS100} data type
@since 3.1.0
*/
public void setConfigID(S100 value) {
        this.configID = value;
    }

/**
Determine if the ConfigID is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetConfigID() {
        return (this.configID!= null);
    }

/**
Set the Endpoint ID at the originating (transmitting) endpoint of a line on the diagram. There must be a corresponding DiagramEndpoint element with this name. Note there may be more than one line with the same originating and terminating endpoints if those lines reference different Configurations.

@param value  An instances of type {@link TS20}
@return The current DiagramLine object instance
@since 3.1.0
*/
    public DiagramLine withTxEndpointID(TS20 value) {
        return this;
    }

/**
Set the Endpoint ID at the terminating (receiving) endpoint of a line on the diagram. There must be a corresponding DiagramEndpoint element with this name. Note there may be more than one line with the same originating and terminating endpoints if those lines reference different Configurations.

@param value  An instances of type {@link TS20}
@return The current DiagramLine object instance
@since 3.1.0
*/
    public DiagramLine withRxEndpointID(TS20 value) {
        return this;
    }

/**
Set a reference to a Configuration associated with this line on the diagram.

@param value  An instances of type {@link String}
@return The current DiagramLine object instance
@since 3.1.0
*/
    public DiagramLine withConfigID(String value) {
           setConfigID(new S100(value));
        return this;
    }

/**
 Get a string representation of this DiagramLine instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "DiagramLine {"
 + (configID !=null? " configID [" + configID +"]" : "") 
 + (rxEndpointID !=null? " rxEndpointID [" + rxEndpointID +"]" : "") 
 + (txEndpointID !=null? " txEndpointID [" + txEndpointID +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link DiagramLine} requires {@link S20 RxEndpointID}, {@link S20 TxEndpointID}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetRxEndpointID() &&  isSetTxEndpointID();
}

}
