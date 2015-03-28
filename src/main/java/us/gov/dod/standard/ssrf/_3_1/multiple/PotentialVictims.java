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
PotentialVictims (US) contains the names of systems, or the Notations of signals, which may be affected by the subject Notation/Signal.

Element of {@link Notation}

Example: See {@link Notation}.
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PotentialVictims", propOrder = {
    "type",
    "victimName",
    "victimNotation"
})
public class PotentialVictims {

/**
US:Type - Victim Notation Type (Optional) 

The type of Notation. 

Format is L:CEN
@since 3.1.0
*/
    @XmlElement(name = "Type", required = false)
    private TString type;
/**
US:VictimName - US:VictimName (Optional) 

The name or nomenclature of a system that may be negatively impacted by the subject Notation/Signal.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "VictimName", required = false)
    private S50 victimName;
/**
US:VictimNotation - Victim Notation (Optional) 

The designator for a specific emitter that may be negatively impacted by the subject Notation/Signal.

Format is US(20)
@since 3.1.0
*/
    @XmlElement(name = "VictimNotation", required = false)
    private US20 victimNotation;

/**
Get the type of Notation. 

@return the Type value in a {@link TString} data type
@since 3.1.0
*/
public TString getType() {
        return type;
    }

/**
Set the type of Notation. 

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
Get the name or nomenclature of a system that may be negatively impacted by the subject Notation/Signal.

@return the VictimName value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getVictimName() {
        return victimName;
    }

/**
Set the name or nomenclature of a system that may be negatively impacted by the subject Notation/Signal.

@param value the VictimName value in a {@link TS50} data type
@since 3.1.0
*/
public void setVictimName(S50 value) {
        this.victimName = value;
    }

/**
Determine if the VictimName is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVictimName() {
        return (this.victimName!= null);
    }

/**
Get the designator for a specific emitter that may be negatively impacted by the subject Notation/Signal.

@return the VictimNotation value in a {@link TUS20} data type
@since 3.1.0
*/
public US20 getVictimNotation() {
        return victimNotation;
    }

/**
Set the designator for a specific emitter that may be negatively impacted by the subject Notation/Signal.

@param value the VictimNotation value in a {@link TUS20} data type
@since 3.1.0
*/
public void setVictimNotation(US20 value) {
        this.victimNotation = value;
    }

/**
Determine if the VictimNotation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVictimNotation() {
        return (this.victimNotation!= null);
    }

/**
Set the type of Notation. 

@param value  An instances of type {@link ListCEN}
@return The current PotentialVictims object instance
@since 3.1.0
*/
    public PotentialVictims withType(ListCEN value) {
           setType(new TString(value.value()));
        return this;
    }

/**
Set the name or nomenclature of a system that may be negatively impacted by the subject Notation/Signal.

@param value  An instances of type {@link String}
@return The current PotentialVictims object instance
@since 3.1.0
*/
    public PotentialVictims withVictimName(String value) {
           setVictimName(new S50(value));
        return this;
    }

/**
Set the designator for a specific emitter that may be negatively impacted by the subject Notation/Signal.

@param value  An instances of type {@link String}
@return The current PotentialVictims object instance
@since 3.1.0
*/
    public PotentialVictims withVictimNotation(String value) {
           setVictimNotation(new US20(value));
        return this;
    }

/**
 Get a string representation of this PotentialVictims instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "PotentialVictims {"
 + (type !=null? " type [" + type +"]" : "") 
 + (victimName !=null? " victimName [" + victimName +"]" : "") 
 + (victimNotation !=null? " victimNotation [" + victimNotation +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link PotentialVictims} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
