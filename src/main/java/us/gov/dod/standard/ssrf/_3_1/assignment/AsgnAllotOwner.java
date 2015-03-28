package us.gov.dod.standard.ssrf._3_1.assignment;

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
AsgnAllotOwner (US) contains the serial of the owning, or originating, organisation.

Element of {@link Assignment}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsgnAllotOwner", propOrder = {
    "description",
    "ownerType",
    "ownerOrgRef"
})
public class AsgnAllotOwner {

    @XmlElement(name = "Description ", required = false)
    private S18 description;
    @XmlElement(name = "OwnerType ", required = true)
      private  TString ownerType;
/**
US:OwnerOrgRef - Owner Organisation Serial (Optional) 

The serial of the owning, or originating, organisation. This definitively identifies the owning agency when there is a possibility that multiple entities are listed in a text string name. This identifier can be unambiguously linked to an internal directory of organizations.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "OwnerOrgRef", required = false)
    private Serial ownerOrgRef;

/**
Get the name of an individual or organization related to the frequency assignment.

@return the Description value in a {@link TS18} data type
@since 3.1.0
*/
public S18 getDescription() {
        return description;
    }

/**
Set the name of an individual or organization related to the frequency assignment.

@param value the Description value in a {@link TS18} data type
@since 3.1.0
*/
public void setDescription(S18 value) {
        this.description = value;
    }

/**
Determine if the Description is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDescription() {
        return (this.description != null);
    }

/**
Get the relationship of an individual or organization to the frequency assignment.

@return the OwnerType value in a {@link TString} data type
@since 3.1.0
*/
public TString getOwnerType() {
        return ownerType;
    }

/**
Set the relationship of an individual or organization to the frequency assignment.

@param value the OwnerType value in a {@link TString} data type
@since 3.1.0
*/
public void setOwnerType(TString value) {
        this.ownerType = value;
    }

/**
Determine if the OwnerType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOwnerType() {
return (this.ownerType!= null ? this.ownerType.isSetValue() : false);
    }

/**
Get the serial of the owning, or originating, organisation. This definitively identifies the owning agency when there is a possibility that multiple entities are listed in a text string name. This identifier can be unambiguously linked to an internal directory of organizations.

@return the OwnerOrgRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getOwnerOrg()} instead.
*/
@Deprecated
public Serial getOwnerOrgRef() {
        return ownerOrgRef;
    }

/**
Set the serial of the owning, or originating, organisation. This definitively identifies the owning agency when there is a possibility that multiple entities are listed in a text string name. This identifier can be unambiguously linked to an internal directory of organizations.

@param value the OwnerOrgRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setOwnerOrg(Organisation)} instead.
*/
@Deprecated
public void setOwnerOrgRef(Serial value) {
        this.ownerOrgRef = value;
    }

/**
Determine if the OwnerOrgRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOwnerOrgRef() {
        return (this.ownerOrgRef!= null);
    }

/**
Set the name of an individual or organization related to the frequency assignment.

@param value  An instances of type {@link String}
@return The current AsgnAllotOwner object instance
@since 3.1.0
*/
    public AsgnAllotOwner withDescription(String value) {
           setDescription(new S18(value));
        return this;
    }

/**
Set the relationship of an individual or organization to the frequency assignment.

@param value  An instances of type {@link ListUOW}
@return The current AsgnAllotOwner object instance
@since 3.1.0
*/
    public AsgnAllotOwner withOwnerType(ListUOW value) {
        setOwnerType(new TString(value.value()));
        return this;
    }

/**
Set the serial of the owning, or originating, organisation. This definitively identifies the owning agency when there is a possibility that multiple entities are listed in a text string name. This identifier can be unambiguously linked to an internal directory of organizations.

@param value  An instances of type {@link Serial}
@return The current AsgnAllotOwner object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withOwnerOrg(Organisation)} instead.
*/
@Deprecated
    public AsgnAllotOwner withOwnerOrgRef(Serial value) {
           setOwnerOrgRef(value);
        return this;
    }

/**
 Get a string representation of this AsgnAllotOwner instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "AsgnAllotOwner {"
 + (description !=null? " description [" + description +"]" : "") 
 + (ownerOrgRef !=null? " ownerOrgRef [" + ownerOrgRef +"]" : "") 
 + (ownerType !=null? " ownerType [" + ownerType +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link AsgnAllotOwner} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
US:OwnerOrgRef - Owner Organisation Serial (Optional) 

The serial of the owning, or originating, organisation. This definitively identifies the owning agency when there is a possibility that multiple entities are listed in a text string name. This identifier can be unambiguously linked to an internal directory of organizations.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Organisation ownerOrg;

/**
Get the serial of the owning, or originating, organisation. This definitively identifies the owning agency when there is a possibility that multiple entities are listed in a text string name. This identifier can be unambiguously linked to an internal directory of organizations.

@return  a {@link Organisation} instance
@since 3.1.0
*/
public Organisation getOwnerOrg(){
return ownerOrg;
}
/**
 Determine if the ownerOrg field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetOwnerOrg() {
    return this.ownerOrg != null ;
}

/**
Set the serial of the owning, or originating, organisation. This definitively identifies the owning agency when there is a possibility that multiple entities are listed in a text string name. This identifier can be unambiguously linked to an internal directory of organizations.

@param value  An instances of type {@link Organisation}
@return The current AsgnAllotOwner object instance
@since 3.1.0
*/
public AsgnAllotOwner withOwnerOrg(Organisation value) {
this.ownerOrg = value;
return this;
}

  /**
   * Update the SSRF data type references in this AsgnAllotOwner record.
   * <p>
 */
public void prepare() {
this.ownerOrgRef = ownerOrg !=null? ownerOrg.getSerial() : null;
}

/**
   * Update the SSRF data type references in this AsgnAllotOwner record after loading from XML.

   * This method builds the transient {@link #ownerOrg} with values
   * from the imported {@link #ownerOrgRef} field. This method should
   * typically be called after the AsgnAllotOwner is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (ownerOrgRef==null || !ownerOrgRef.isSetValue() ) {return;}
for(Organisation instance : root.getOrganisation()) {
if(ownerOrgRef.equals(instance.getSerial())){
ownerOrg = instance;
return;}
}}//</editor-fold>

}
