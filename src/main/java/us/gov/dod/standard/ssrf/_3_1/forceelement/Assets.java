package us.gov.dod.standard.ssrf._3_1.forceelement;

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
Assets indicates the authorised and available quantity of the equipment, RF systems, or other Force Elements used or owned by the Force Element.

Element of {@link ForceElement}

Example: <pre>
* &lt;Assets&gt;
*   &lt;Serial cls="U"&gt;USA:AF:FE:123&lt;/Serial&gt;
*   &lt;Authorised cls="U"&gt;10&lt;/Authorised&gt;
*   &lt;Available cls="U"&gt;5&lt;/Available&gt;
* &lt;/Assets&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assets", propOrder = {
    "serial",
    "authorised",
    "available"
})
public class Assets {

/**
Serial  - Equipment/FE Reference (Required) 

A reference to a Transmitter, Receiver, Antenna, RFSystem used by this ForceElement, or to a ForceElement carried by or belonging to this ForceElement.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "Serial", required = true)
      private  Serial serial;
/**
Authorised  - Authorised Quantity (Optional) 

The authorised quantity of the referenced equipment or system.

Format is UN(9)
@since 3.1.0
*/
    @XmlElement(name = "Authorised", required = false)
    private UN9 authorised;
/**
Available  - Available Quantity (Optional) 

The available quantity of the referenced equipment or system.

Format is UN(9)
@since 3.1.0
*/
    @XmlElement(name = "Available", required = false)
    private UN9 available;

/**
Get a reference to a Transmitter, Receiver, Antenna, RFSystem used by this ForceElement, or to a ForceElement carried by or belonging to this ForceElement.

@return the Serial value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getAsset()} instead.
*/
@Deprecated
public Serial getSerial() {
        return serial;
    }

/**
Set a reference to a Transmitter, Receiver, Antenna, RFSystem used by this ForceElement, or to a ForceElement carried by or belonging to this ForceElement.

@param value the Serial value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setAsset(Common)} instead.
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
Get the authorised quantity of the referenced equipment or system.

@return the Authorised value in a {@link TUN9} data type
@since 3.1.0
*/
public UN9 getAuthorised() {
        return authorised;
    }

/**
Set the authorised quantity of the referenced equipment or system.

@param value the Authorised value in a {@link TUN9} data type
@since 3.1.0
*/
public void setAuthorised(UN9 value) {
        this.authorised = value;
    }

/**
Determine if the Authorised is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAuthorised() {
        return (this.authorised!= null);
    }

/**
Get the available quantity of the referenced equipment or system.

@return the Available value in a {@link TUN9} data type
@since 3.1.0
*/
public UN9 getAvailable() {
        return available;
    }

/**
Set the available quantity of the referenced equipment or system.

@param value the Available value in a {@link TUN9} data type
@since 3.1.0
*/
public void setAvailable(UN9 value) {
        this.available = value;
    }

/**
Determine if the Available is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAvailable() {
        return (this.available!= null);
    }

/**
Set a reference to a Transmitter, Receiver, Antenna, RFSystem used by this ForceElement, or to a ForceElement carried by or belonging to this ForceElement.

@param value  An instances of type {@link Serial}
@return The current Assets object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withAsset(Common)} instead.
*/
@Deprecated
    public Assets withSerial(Serial value) {
        setSerial(value);
        return this;
    }

/**
Set the authorised quantity of the referenced equipment or system.

@param value  An instances of type {@link Integer}
@return The current Assets object instance
@since 3.1.0
*/
    public Assets withAuthorised(Integer value) {
           setAuthorised(new UN9(value));
        return this;
    }

/**
Set the available quantity of the referenced equipment or system.

@param value  An instances of type {@link Integer}
@return The current Assets object instance
@since 3.1.0
*/
    public Assets withAvailable(Integer value) {
           setAvailable(new UN9(value));
        return this;
    }

/**
 Get a string representation of this Assets instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Assets {"
 + (authorised !=null? " authorised [" + authorised +"]" : "") 
 + (available !=null? " available [" + available +"]" : "") 
 + (serial !=null? " serial [" + serial +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Assets} requires {@link Serial Serial}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetSerial();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
Serial  - Equipment/FE Reference (Required) 

A reference to a Transmitter, Receiver, Antenna, RFSystem used by this ForceElement, or to a ForceElement carried by or belonging to this ForceElement.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Common<?> asset;

/**
Get a reference to a Transmitter, Receiver, Antenna, RFSystem used by this ForceElement, or to a ForceElement carried by or belonging to this ForceElement.

@return  a {@link Common} instance
@since 3.1.0
*/
public Common<?> getAsset(){
return asset;
}
/**
 Determine if the asset field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetAsset() {
    return this.asset != null ;
}

/**
Set a reference to a Transmitter, Receiver, Antenna, RFSystem used by this ForceElement, or to a ForceElement carried by or belonging to this ForceElement.

@param value  An instances of type {@link Common<?>}
@return The current Assets object instance
@since 3.1.0
*/
public Assets withAsset(Common<?> value) {
this.asset = value;
return this;
}

  /**
   * Update the SSRF data type references in this Assets record.
   * <p>
 */
public void prepare() {
this.serial = asset !=null? asset.getSerial() : null;
}

/**
   * Update the SSRF data type references in this Assets record after loading from XML.

   * This method builds the transient {@link #asset} with values
   * from the imported {@link #serial} field. This method should
   * typically be called after the Assets is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (serial==null || !serial.isSetValue() ) {return;}
for(Transmitter instance : root.getTransmitter()) {
if(serial.equals(instance.getSerial())){
asset = instance;
return;}
}for( Receiver instance : root.getReceiver()) {
if(serial.equals(instance.getSerial())){
asset = instance;
return;}
}for( Antenna instance : root.getAntenna()) {
if(serial.equals(instance.getSerial())){
asset = instance;
return;}
}for( RFSystem instance : root.getRFSystem()) {
if(serial.equals(instance.getSerial())){
asset = instance;
return;}
}}//</editor-fold>

}
