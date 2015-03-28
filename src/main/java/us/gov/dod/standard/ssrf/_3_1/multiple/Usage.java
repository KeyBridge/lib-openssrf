package us.gov.dod.standard.ssrf._3_1.multiple;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
Usage identifies how an operational configuration can be used or will be used.

Element of {@link Configuration}

Example: <pre>
* &lt;Usage&gt;
*   &lt;EqpFnct  cls="U"&gt;EW-Jamming-Sweep&lt;/EqpFnct &gt;
*   &lt;RadioService  cls="U"&gt;Special Service&lt;/RadioService &gt;
*   &lt;StnClass  cls="U"&gt;MAP&lt;/StnClass &gt;
* &lt;/Usage&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Usage", propOrder = {
    "eqpFnct",
    "stnClass",
    "radioService"
})
public class Usage {

/**
EqpFnct  - Equipment Function (Optional) 

The equipment function.

Format is L:CEF
@since 3.1.0
*/
    @XmlElement(name = "EqpFnct", required = false)
    private TString eqpFnct;
/**
StnClass  - Class of Station (Optional) 

The station class, as defined by the appropriate Administration.

Format is L:USC

Divergence from SMADEF: Suppress non-ITU USC codes (see suffix on code definition) for StnClass when exchanging with NATO.
@since 3.1.0
*/
    @XmlElement(name = "StnClass", required = false)
    private TString stnClass;
/**
RadioService  - Radiocommunication Service (Optional) 

The Radiocommunication Service associated with the frequency usage in this configuration. Allowable values are defined by the appropriate Administration.

Format is L:CSN
@since 3.1.0
*/
    @XmlElement(name = "RadioService", required = false)
    private TString radioService;

/**
Get the equipment function.

@return the EqpFnct value in a {@link TString} data type
@since 3.1.0
*/
public TString getEqpFnct() {
        return eqpFnct;
    }

/**
Set the equipment function.

@param value the EqpFnct value in a {@link TString} data type
@since 3.1.0
*/
public void setEqpFnct(TString value) {
        this.eqpFnct = value;
    }

/**
Determine if the EqpFnct is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEqpFnct() {
return (this.eqpFnct!= null ? this.eqpFnct.isSetValue() : false);
    }

/**
Get the station class, as defined by the appropriate Administration.

@return the StnClass value in a {@link TString} data type
@since 3.1.0
*/
public TString getStnClass() {
        return stnClass;
    }

/**
Set the station class, as defined by the appropriate Administration.

@param value the StnClass value in a {@link TString} data type
@since 3.1.0
*/
public void setStnClass(TString value) {
        this.stnClass = value;
    }

/**
Determine if the StnClass is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStnClass() {
return (this.stnClass!= null ? this.stnClass.isSetValue() : false);
    }

/**
Get the Radiocommunication Service associated with the frequency usage in this configuration. Allowable values are defined by the appropriate Administration.

@return the RadioService value in a {@link TString} data type
@since 3.1.0
*/
public TString getRadioService() {
        return radioService;
    }

/**
Set the Radiocommunication Service associated with the frequency usage in this configuration. Allowable values are defined by the appropriate Administration.

@param value the RadioService value in a {@link TString} data type
@since 3.1.0
*/
public void setRadioService(TString value) {
        this.radioService = value;
    }

/**
Determine if the RadioService is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRadioService() {
return (this.radioService!= null ? this.radioService.isSetValue() : false);
    }

/**
Set the equipment function.

@param value  An instances of type {@link ListCEF}
@return The current Usage object instance
@since 3.1.0
*/
    public Usage withEqpFnct(ListCEF value) {
           setEqpFnct(new TString(value.value()));
        return this;
    }

/**
Set the station class, as defined by the appropriate Administration.

@param value  An instances of type {@link ListUSC}
@return The current Usage object instance
@since 3.1.0
*/
    public Usage withStnClass(ListUSC value) {
           setStnClass(new TString(value.value()));
        return this;
    }

/**
Set the Radiocommunication Service associated with the frequency usage in this configuration. Allowable values are defined by the appropriate Administration.

@param value  An instances of type {@link ListCSN}
@return The current Usage object instance
@since 3.1.0
*/
    public Usage withRadioService(ListCSN value) {
           setRadioService(new TString(value.value()));
        return this;
    }

/**
 Get a string representation of this Usage instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Usage {"
 + (eqpFnct !=null? " eqpFnct [" + eqpFnct +"]" : "") 
 + (radioService !=null? " radioService [" + radioService +"]" : "") 
 + (stnClass !=null? " stnClass [" + stnClass +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Usage} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
