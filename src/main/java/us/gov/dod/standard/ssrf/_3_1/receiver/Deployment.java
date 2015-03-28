package us.gov.dod.standard.ssrf._3_1.receiver;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
Deployment provides the general type of equipment deployment. For the detailed data, the appropriate force element and platforms elements should be referenced. Data element Deployment identifies the general category of how the equipment is deployed. For example an equipment may be deployed on an airborne platform, a ship or fixed land installation.

Element of {@link RFSystem}, {@link Receiver}, {@link Transmitter}

Sub-Element is {@link Installation}

Example: <pre>
* &lt;Deployment&gt;
*   &lt;Type cls="U"&gt;Air&lt;/Type&gt;
* &lt;/Deployment&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deployment", propOrder = {
    "type",
    "status",
    "installation"
})
public class Deployment {

/**
Type  - Deployment Type (Required) 

The type of deployment.

Format is L:CFD
@since 3.1.0
*/
    @XmlElement(name = "Type", required = true)
      private  TString type;
/**
Status  - Status  (Optional) 

The status of the Deployment.

Format is L:CSU
@since 3.1.0
*/
    @XmlElement(name = "Status", required = false)
    private TString status;
/**
Installation (Optional)

Installation identifies the specific platforms on which an equipment is installed, whether it is mounted at a fixed site atop a mountain, in a shelter, in a vehicle, aboard a helicopter, etc.
@since 3.1.0
*/
    @XmlElement(name = "Installation", nillable = true)
      private  Set<Installation> installation;

/**
Get the type of deployment.

@return the Type value in a {@link TString} data type
@since 3.1.0
*/
public TString getType() {
        return type;
    }

/**
Set the type of deployment.

@param value the Type value in a {@link TString} data type
@since 3.1.0
*/
public void setType(TString value) {
        this.type = value;
    }

/**
Determine if the Type is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetType() {
return (this.type!= null ? this.type.isSetValue() : false);
    }

/**
Get the status of the Deployment.

@return the Status value in a {@link TString} data type
@since 3.1.0
*/
public TString getStatus() {
        return status;
    }

/**
Set the status of the Deployment.

@param value the Status value in a {@link TString} data type
@since 3.1.0
*/
public void setStatus(TString value) {
        this.status = value;
    }

/**
Determine if the Status is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStatus() {
return (this.status!= null ? this.status.isSetValue() : false);
    }

/**
Get the Installation

Complex element Installation identifies the specific platforms on which an equipment is installed, whether it is mounted at a fixed site atop a mountain, in a shelter, in a vehicle, aboard a helicopter, etc.

@return  a {@link Installation} instance
@since 3.1.0
*/
    public Set<Installation> getInstallation() {
        if (installation == null) {
            installation = new HashSet<Installation>();
        }
        return this.installation;
    }

/**
Determine if the Installation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetInstallation() {
        return ((this.installation!= null)&&(!this.installation.isEmpty()));
    }

/**
  Clear the Installation field. This sets the field to null.
 */
    public void unsetInstallation() {
        this.installation = null;
    }

/**
Set the type of deployment.

@param value  An instances of type {@link ListCIN}
@return The current Deployment object instance
@since 3.1.0
*/
    public Deployment withType(ListCIN value) {
        setType(new TString(value.value()));
        return this;
    }

/**
Set the status of the Deployment.

@param value  An instances of type {@link ListCSU}
@return The current Deployment object instance
@since 3.1.0
*/
    public Deployment withStatus(ListCSU value) {
           setStatus(new TString(value.value()));
        return this;
    }

/**
Set the Installation

Complex element Installation identifies the specific platforms on which an equipment is installed, whether it is mounted at a fixed site atop a mountain, in a shelter, in a vehicle, aboard a helicopter, etc.

@param values  One or more instances of type {@link Installation...}
@return The current Deployment object instance
@since 3.1.0
*/
    public Deployment withInstallation(Installation... values) {
        if (values!= null) {
            for (Installation value: values) {
                getInstallation().add(value);
            }
        }
        return this;
    }

/**
Set the Installation

Complex element Installation identifies the specific platforms on which an equipment is installed, whether it is mounted at a fixed site atop a mountain, in a shelter, in a vehicle, aboard a helicopter, etc.

@param values  A collection of {@link Installation} instances
@return The current Deployment object instance
@since 3.1.0
*/
    public Deployment withInstallation(Collection<Installation> values) {
        if (values!= null) {
            getInstallation().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this Deployment instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Deployment {"
 + (installation !=null? " installation [" + installation +"]" : "") 
 + (status !=null? " status [" + status +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Deployment} requires {@link TString Type}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetType();
}

}
