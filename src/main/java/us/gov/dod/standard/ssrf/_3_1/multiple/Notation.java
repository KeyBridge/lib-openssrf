package us.gov.dod.standard.ssrf._3_1.multiple;

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
Notation contains the electronic identification for a pulsed or non-pulsed electromagnetic emission. It includes but is not limited to Communications Emitter Notation (CENOT) and Electronic Intelligence Notation (ELNOT).

Element of {@link Configuration}

Sub-Elements are {@link NotationTimeline}, {@link PotentialVictims}, {@link UsingCountries}

Example: <pre>
* &lt;Notation&gt;
*   &lt;Code cls="U"&gt;869812&lt;/Code&gt;
*   &lt;Type cls="U"&gt;ELNOT&lt;/Type&gt;
*   &lt;Status cls="U"&gt;Active&lt;/Status&gt;
*   &lt;NotationTimeline&gt;
*     &lt;Code cls="U"&gt;869812&lt;/Code&gt;
*     &lt;Status cls="U"&gt;Active&lt;/Status&gt;
*     &lt;StatusChangeDateTime cls="U"&gt;2014-12-25T01:23:001Z&lt;/StatusChangeDateTime&gt;
*     &lt;Type cls="U"&gt;ELNOT&lt;/Type&gt;
*   &lt;/NotationTimeline&gt;
*   &lt;PotentialVictims&gt;
*     &lt;Type cls="U"&gt;ELNOT&lt;/Type&gt;
*     &lt;VictimName cls="U"&gt;Target 478&lt;/VictimName&gt;
*     &lt;VictimNotation cls="U"&gt;B000Z&lt;/VictimNotation&gt;
*   &lt;/PotentialVictims&gt;
*   &lt;UsingCountries&gt;
*     &lt;CountryName cls="U"&gt;USA&lt;/CountryName&gt;
*     &lt;Role cls="U"&gt;Source&lt;/Role&gt;
*   &lt;/UsingCountries&gt;
* &lt;/Notation&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notation", propOrder = {
    "code",
    "type",
    "status",
    "notationTimeline",
    "potentialVictims",
    "usingCountries"
})
public class Notation {

/**
US:Code - Notation Code (Required) 

An alphanumeric combination that is used to identify a particular Notation/Signal.

Format is US(20)
@since 3.1.0
*/
    @XmlElement(name = "Code", required = true)
      private  US20 code;
/**
US:Type - Notation Type (Optional) 

The type of Notation.

Format is L:CEN
@since 3.1.0
*/
    @XmlElement(name = "Type", required = true)
      private  TString type;
/**
US:Status - Notation Status (Optional) 

The status of the future, prior, or associated, Notation.

Format is L:UNT
@since 3.1.0
*/
    @XmlElement(name = "Status", required = false)
    private TString status;
/**
US:NotationTimeline (Optional)

NotationTimeline (US) provides history information for a specific notation or signal.
@since 3.1.0
*/
    @XmlElement(name = "NotationTimeline")
      private  Set<NotationTimeline> notationTimeline;
/**
US:PotentialVictims (Optional)

PotentialVictims (US) contains the names of systems, or the Notations of signals, which may be affected by the subject Notation/Signal.
@since 3.1.0
*/
    @XmlElement(name = "PotentialVictims")
      private  Set<PotentialVictims> potentialVictims;
/**
US:UsingCountries (Optional)

UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the Notation.
@since 3.1.0
*/
    @XmlElement(name = "UsingCountries")
      private  Set<UsingCountries> usingCountries;

/**
Get an alphanumeric combination that is used to identify a particular Notation/Signal.

@return the Code value in a {@link TUS20} data type
@since 3.1.0
*/
public US20 getCode() {
        return code;
    }

/**
Set an alphanumeric combination that is used to identify a particular Notation/Signal.

@param value the Code value in a {@link TUS20} data type
@since 3.1.0
*/
public void setCode(US20 value) {
        this.code = value;
    }

/**
Determine if the Code is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCode() {
        return (this.code!= null);
    }

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
Get the status of the future, prior, or associated, Notation.

@return the Status value in a {@link TString} data type
@since 3.1.0
*/
public TString getStatus() {
        return status;
    }

/**
Set the status of the future, prior, or associated, Notation.

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
Get the US:NotationTimeline

Complex element NotationTimeline (US) provides history information for a specific notation or signal.

@return  a {@link NotationTimeline} instance
@since 3.1.0
*/
    public Set<NotationTimeline> getNotationTimeline() {
        if (notationTimeline == null) {
            notationTimeline = new HashSet<NotationTimeline>();
        }
        return this.notationTimeline;
    }

/**
Determine if the NotationTimeline is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNotationTimeline() {
        return ((this.notationTimeline!= null)&&(!this.notationTimeline.isEmpty()));
    }

/**
  Clear the NotationTimeline field. This sets the field to null.
 */
    public void unsetNotationTimeline() {
        this.notationTimeline = null;
    }

/**
Get the US:PotentialVictims

Complex element PotentialVictims (US) contains the names of systems, or the Notations of signals, which may be affected by the subject Notation/Signal.

@return  a {@link PotentialVictims} instance
@since 3.1.0
*/
    public Set<PotentialVictims> getPotentialVictims() {
        if (potentialVictims == null) {
            potentialVictims = new HashSet<PotentialVictims>();
        }
        return this.potentialVictims;
    }

/**
Determine if the PotentialVictims is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPotentialVictims() {
        return ((this.potentialVictims!= null)&&(!this.potentialVictims.isEmpty()));
    }

/**
  Clear the PotentialVictims field. This sets the field to null.
 */
    public void unsetPotentialVictims() {
        this.potentialVictims = null;
    }

/**
Get the US:UsingCountries

Complex element UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the Notation.

@return  a {@link UsingCountries} instance
@since 3.1.0
*/
    public Set<UsingCountries> getUsingCountries() {
        if (usingCountries == null) {
            usingCountries = new HashSet<UsingCountries>();
        }
        return this.usingCountries;
    }

/**
Determine if the UsingCountries is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetUsingCountries() {
        return ((this.usingCountries!= null)&&(!this.usingCountries.isEmpty()));
    }

/**
  Clear the UsingCountries field. This sets the field to null.
 */
    public void unsetUsingCountries() {
        this.usingCountries = null;
    }

/**
Set an alphanumeric combination that is used to identify a particular Notation/Signal.

@param value  An instances of type {@link TUS20}
@return The current Notation object instance
@since 3.1.0
*/
    public Notation withCode(TUS20 value) {
        return this;
    }

/**
Set the type of Notation.

@param value  An instances of type {@link ListCEN}
@return The current Notation object instance
@since 3.1.0
*/
    public Notation withType(ListCEN value) {
        setType(new TString(value.value()));
        return this;
    }

/**
Set the status of the future, prior, or associated, Notation.

@param value  An instances of type {@link ListUNT}
@return The current Notation object instance
@since 3.1.0
*/
    public Notation withStatus(ListUNT value) {
           setStatus(new TString(value.value()));
        return this;
    }

/**
Set the US:NotationTimeline

Complex element NotationTimeline (US) provides history information for a specific notation or signal.

@param values  One or more instances of type {@link NotationTimeline...}
@return The current Notation object instance
@since 3.1.0
*/
    public Notation withNotationTimeline(NotationTimeline... values) {
        if (values!= null) {
            for (NotationTimeline value: values) {
                getNotationTimeline().add(value);
            }
        }
        return this;
    }

/**
Set the US:NotationTimeline

Complex element NotationTimeline (US) provides history information for a specific notation or signal.

@param values  A collection of {@link NotationTimeline} instances
@return The current Notation object instance
@since 3.1.0
*/
    public Notation withNotationTimeline(Collection<NotationTimeline> values) {
        if (values!= null) {
            getNotationTimeline().addAll(values);
        }
        return this;
    }

/**
Set the US:PotentialVictims

Complex element PotentialVictims (US) contains the names of systems, or the Notations of signals, which may be affected by the subject Notation/Signal.

@param values  One or more instances of type {@link PotentialVictims...}
@return The current Notation object instance
@since 3.1.0
*/
    public Notation withPotentialVictims(PotentialVictims... values) {
        if (values!= null) {
            for (PotentialVictims value: values) {
                getPotentialVictims().add(value);
            }
        }
        return this;
    }

/**
Set the US:PotentialVictims

Complex element PotentialVictims (US) contains the names of systems, or the Notations of signals, which may be affected by the subject Notation/Signal.

@param values  A collection of {@link PotentialVictims} instances
@return The current Notation object instance
@since 3.1.0
*/
    public Notation withPotentialVictims(Collection<PotentialVictims> values) {
        if (values!= null) {
            getPotentialVictims().addAll(values);
        }
        return this;
    }

/**
Set the US:UsingCountries

Complex element UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the Notation.

@param values  One or more instances of type {@link UsingCountries...}
@return The current Notation object instance
@since 3.1.0
*/
    public Notation withUsingCountries(UsingCountries... values) {
        if (values!= null) {
            for (UsingCountries value: values) {
                getUsingCountries().add(value);
            }
        }
        return this;
    }

/**
Set the US:UsingCountries

Complex element UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the Notation.

@param values  A collection of {@link UsingCountries} instances
@return The current Notation object instance
@since 3.1.0
*/
    public Notation withUsingCountries(Collection<UsingCountries> values) {
        if (values!= null) {
            getUsingCountries().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this Notation instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Notation {"
 + (code !=null? " code [" + code +"]" : "") 
 + (notationTimeline !=null? " notationTimeline [" + notationTimeline +"]" : "") 
 + (potentialVictims !=null? " potentialVictims [" + potentialVictims +"]" : "") 
 + (status !=null? " status [" + status +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") 
 + (usingCountries !=null? " usingCountries [" + usingCountries +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Notation} requires {@link US20 Code}, {@link TString Type}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetCode() &&  isSetType();
}

}
