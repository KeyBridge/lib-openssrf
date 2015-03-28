package us.gov.dod.standard.ssrf._3_1.toa;

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
Variance indicates if the local allocation deviates from an upper level allocation (e.g. a national allocation not aligned with the ITU RR).

Element of {@link Allocation}

Sub-Element is {@link Administration}

Example: <pre>
* &lt;Variance&gt;
*   &lt;Type cls="U"&gt;Additional&lt;/Type&gt;
*   &lt;AllocatedService cls="U"&gt;Aeronautical Mobile (Off Route) Service&lt;/
*   AllocatedService&gt;
*   &lt;Priority cls="U"&gt;Permitted&lt;/Priority&gt;
* &lt;/Variance&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variance", propOrder = {
    "type",
    "allocatedService",
    "priority",
    "administration"
})
public class Variance {

/**
Type  - Type (Required) 

The type of variance.

Format is L:CAV
@since 3.1.0
*/
    @XmlElement(name = "Type", required = true)
      private  TString type;
/**
AllocatedService  - Allocated Service (Required) 

A radiocommunication service recognized by an administration that is allocated to this frequency band (e.g., "Fixed Service").

Format is L:CSN
@since 3.1.0
*/
    @XmlElement(name = "AllocatedService", required = true)
      private  TString allocatedService;
/**
Priority  - Priority (Required) 

If this service is a primary or secondary use of this band. ("Permitted" SHOULD only be used if the priority is unknown.)

Format is L:CPS
@since 3.1.0
*/
    @XmlElement(name = "Priority", required = true)
      private  TString priority;
/**
Administration (Optional)

Administration contains the country for which this variance applies.
@since 3.1.0
*/
    @XmlElement(name = "Administration", nillable = true)
      private  Set<Administration> administration;

/**
Get the type of variance.

@return the Type value in a {@link TString} data type
@since 3.1.0
*/
public TString getType() {
        return type;
    }

/**
Set the type of variance.

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
Get a radiocommunication service recognized by an administration that is allocated to this frequency band (e.g., "Fixed Service").

@return the AllocatedService value in a {@link TString} data type
@since 3.1.0
*/
public TString getAllocatedService() {
        return allocatedService;
    }

/**
Set a radiocommunication service recognized by an administration that is allocated to this frequency band (e.g., "Fixed Service").

@param value the AllocatedService value in a {@link TString} data type
@since 3.1.0
*/
public void setAllocatedService(TString value) {
        this.allocatedService = value;
    }

/**
Determine if the AllocatedService is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAllocatedService() {
return (this.allocatedService!= null ? this.allocatedService.isSetValue() : false);
    }

/**
Get if this service is a primary or secondary use of this band. ("Permitted" SHOULD only be used if the priority is unknown.)

@return the Priority value in a {@link TString} data type
@since 3.1.0
*/
public TString getPriority() {
        return priority;
    }

/**
Set if this service is a primary or secondary use of this band. ("Permitted" SHOULD only be used if the priority is unknown.)

@param value the Priority value in a {@link TString} data type
@since 3.1.0
*/
public void setPriority(TString value) {
        this.priority = value;
    }

/**
Determine if the Priority is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPriority() {
return (this.priority!= null ? this.priority.isSetValue() : false);
    }

/**
Get the Administration

Complex element Administration contains the country for which this variance applies.

@return  a {@link Administration} instance
@since 3.1.0
*/
    public Set<Administration> getAdministration() {
        if (administration == null) {
            administration = new HashSet<Administration>();
        }
        return this.administration;
    }

/**
Determine if the Administration is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAdministration() {
        return ((this.administration!= null)&&(!this.administration.isEmpty()));
    }

/**
  Clear the Administration field. This sets the field to null.
 */
    public void unsetAdministration() {
        this.administration = null;
    }

/**
Set the type of variance.

@param value  An instances of type {@link ListCAV}
@return The current Variance object instance
@since 3.1.0
*/
    public Variance withType(ListCAV value) {
        setType(new TString(value.value()));
        return this;
    }

/**
Set a radiocommunication service recognized by an administration that is allocated to this frequency band (e.g., "Fixed Service").

@param value  An instances of type {@link ListCSN}
@return The current Variance object instance
@since 3.1.0
*/
    public Variance withAllocatedService(ListCSN value) {
        setAllocatedService(new TString(value.value()));
        return this;
    }

/**
Set if this service is a primary or secondary use of this band. ("Permitted" SHOULD only be used if the priority is unknown.)

@param value  An instances of type {@link ListCPS}
@return The current Variance object instance
@since 3.1.0
*/
    public Variance withPriority(ListCPS value) {
        setPriority(new TString(value.value()));
        return this;
    }

/**
Set the Administration

Complex element Administration contains the country for which this variance applies.

@param values  One or more instances of type {@link Administration...}
@return The current Variance object instance
@since 3.1.0
*/
    public Variance withAdministration(Administration... values) {
        if (values!= null) {
            for (Administration value: values) {
                getAdministration().add(value);
            }
        }
        return this;
    }

/**
Set the Administration

Complex element Administration contains the country for which this variance applies.

@param values  A collection of {@link Administration} instances
@return The current Variance object instance
@since 3.1.0
*/
    public Variance withAdministration(Collection<Administration> values) {
        if (values!= null) {
            getAdministration().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this Variance instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Variance {"
 + (administration !=null? " administration [" + administration +"]" : "") 
 + (allocatedService !=null? " allocatedService [" + allocatedService +"]" : "") 
 + (priority !=null? " priority [" + priority +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Variance} requires {@link TString AllocatedService}, {@link TString Priority}, {@link TString Type}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetAllocatedService() &&  isSetPriority() &&  isSetType();
}

}
