package us.gov.dod.standard.ssrf._3_1.assignment;

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
SysOfStation defines the name of the system that this assignment belongs and whether or not the assignment provides assets to or uses another assignment resources. It also describes linkages to or from other datasets.

Element of {@link Assignment}

Example: <pre>
* &lt;SysOfStation&gt;
*   &lt;SysName cls="U"&gt;BALTIMORE LMR SYSTEM&lt;/SysName&gt;
* &lt;/SysOfStation&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SysOfStation", propOrder = {
    "sysName",
    "numStations"
})
public class SysOfStation {

/**
SysName  - System Name (Optional) 

The name of the system to which the frequency assignment belongs. A system is considered two or more equipment having a common property, usually geographic, administrative, functional, or operational in nature.

Format is S30
@since 3.1.0
*/
    @XmlElement(name = "SysName", required = false)
    private S30 sysName;
/**
NumStations  - Number of Stations (Optional) 

The total number of stations associated with the Assignment. 

Format is UN(9)
@since 3.1.0
*/
    @XmlElement(name = "NumStations", required = false)
    private UN9 numStations;

/**
Get the name of the system to which the frequency assignment belongs. A system is considered two or more equipment having a common property, usually geographic, administrative, functional, or operational in nature.

@return the SysName value in a {@link TS30} data type
@since 3.1.0
*/
public S30 getSysName() {
        return sysName;
    }

/**
Set the name of the system to which the frequency assignment belongs. A system is considered two or more equipment having a common property, usually geographic, administrative, functional, or operational in nature.

@param value the SysName value in a {@link TS30} data type
@since 3.1.0
*/
public void setSysName(S30 value) {
        this.sysName = value;
    }

/**
Determine if the SysName is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSysName() {
        return (this.sysName!= null);
    }

/**
Get the total number of stations associated with the Assignment. 

@return the NumStations value in a {@link TUN9} data type
@since 3.1.0
*/
public UN9 getNumStations() {
        return numStations;
    }

/**
Set the total number of stations associated with the Assignment. 

@param value the NumStations value in a {@link TUN9} data type
@since 3.1.0
*/
public void setNumStations(UN9 value) {
        this.numStations = value;
    }

/**
Determine if the NumStations is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumStations() {
        return (this.numStations!= null);
    }

/**
Set the name of the system to which the frequency assignment belongs. A system is considered two or more equipment having a common property, usually geographic, administrative, functional, or operational in nature.

@param value  An instances of type {@link String}
@return The current SysOfStation object instance
@since 3.1.0
*/
    public SysOfStation withSysName(String value) {
           setSysName(new S30(value));
        return this;
    }

/**
Set the total number of stations associated with the Assignment. 

@param value  An instances of type {@link Integer}
@return The current SysOfStation object instance
@since 3.1.0
*/
    public SysOfStation withNumStations(Integer value) {
           setNumStations(new UN9(value));
        return this;
    }

/**
 Get a string representation of this SysOfStation instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "SysOfStation {"
 + (numStations !=null? " numStations [" + numStations +"]" : "") 
 + (sysName !=null? " sysName [" + sysName +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link SysOfStation} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
