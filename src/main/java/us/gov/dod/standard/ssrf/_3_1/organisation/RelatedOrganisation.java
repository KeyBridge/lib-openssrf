package us.gov.dod.standard.ssrf._3_1.organisation;

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
RelatedOrganisation identifies an Organisation linked to the current Organisation, the type of relation (reporting, budget, etc) and the relation (parent, child, sibling).

Element of {@link Organisation}

Example: <pre>
* &lt;RelatedOrganisation&gt;
*   &lt;Type cls="U"&gt;Reporting&lt;/Type&gt;
*   &lt;Relation cls="U"&gt;Child&lt;/Relation&gt;
*   &lt;Serial cls="U"&gt;USA:AR:OR:05008827&lt;/Serial&gt;
* &lt;/RelatedOrganisation&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedOrganisation", propOrder = {
    "type",
    "relation",
    "serial"
})
public class RelatedOrganisation {

/**
Type  - Type (Optional) 

The type of relationship.

Format is L:CFT
@since 3.1.0
*/
    @XmlElement(name = "Type", required = false)
    private TString type;
/**
Relation  - Relationship (Required) 

The relationship between the two organisations.

Format is L:CFR
@since 3.1.0
*/
    @XmlElement(name = "Relation", required = true)
      private  TString relation;
/**
Serial  - Organisation Serial (Required) 

The unique reference of the Organisation associated with the current Organisation.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "Serial", required = true)
      private  Serial serial;

/**
Get the type of relationship.

@return the Type value in a {@link TString} data type
@since 3.1.0
*/
public TString getType() {
        return type;
    }

/**
Set the type of relationship.

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
Get the relationship between the two organisations.

@return the Relation value in a {@link TString} data type
@since 3.1.0
*/
public TString getRelation() {
        return relation;
    }

/**
Set the relationship between the two organisations.

@param value the Relation value in a {@link TString} data type
@since 3.1.0
*/
public void setRelation(TString value) {
        this.relation = value;
    }

/**
Determine if the Relation is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRelation() {
return (this.relation!= null ? this.relation.isSetValue() : false);
    }

/**
Get the unique reference of the Organisation associated with the current Organisation.

@return the Serial value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getOrganisation()} instead.
*/
@Deprecated
public Serial getSerial() {
        return serial;
    }

/**
Set the unique reference of the Organisation associated with the current Organisation.

@param value the Serial value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setOrganisation(Organisation)} instead.
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
Set the type of relationship.

@param value  An instances of type {@link ListCFT}
@return The current RelatedOrganisation object instance
@since 3.1.0
*/
    public RelatedOrganisation withType(ListCFT value) {
           setType(new TString(value.value()));
        return this;
    }

/**
Set the relationship between the two organisations.

@param value  An instances of type {@link ListCFR}
@return The current RelatedOrganisation object instance
@since 3.1.0
*/
    public RelatedOrganisation withRelation(ListCFR value) {
        setRelation(new TString(value.value()));
        return this;
    }

/**
Set the unique reference of the Organisation associated with the current Organisation.

@param value  An instances of type {@link Serial}
@return The current RelatedOrganisation object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withOrganisation(Organisation)} instead.
*/
@Deprecated
    public RelatedOrganisation withSerial(Serial value) {
        setSerial(value);
        return this;
    }

/**
 Get a string representation of this RelatedOrganisation instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "RelatedOrganisation {"
 + (relation !=null? " relation [" + relation +"]" : "") 
 + (serial !=null? " serial [" + serial +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link RelatedOrganisation} requires {@link TString Relation}, {@link Serial Serial}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetRelation() &&  isSetSerial();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
Serial  - Organisation Serial (Required) 

The unique reference of the Organisation associated with the current Organisation.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Organisation organisation;

/**
Get the unique reference of the Organisation associated with the current Organisation.

@return  a {@link Organisation} instance
@since 3.1.0
*/
public Organisation getOrganisation(){
return organisation;
}
/**
 Determine if the organisation field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetOrganisation() {
    return this.organisation != null ;
}

/**
Set the unique reference of the Organisation associated with the current Organisation.

@param value  An instances of type {@link Organisation}
@return The current RelatedOrganisation object instance
@since 3.1.0
*/
public RelatedOrganisation withOrganisation(Organisation value) {
this.organisation = value;
return this;
}

  /**
   * Update the SSRF data type references in this RelatedOrganisation record.
   * <p>
 */
public void prepare() {
this.serial = organisation !=null? organisation.getSerial() : null;
}

/**
   * Update the SSRF data type references in this RelatedOrganisation record after loading from XML.

   * This method builds the transient {@link #organisation} with values
   * from the imported {@link #serial} field. This method should
   * typically be called after the RelatedOrganisation is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (serial==null || !serial.isSetValue() ) {return;}
for(Organisation instance : root.getOrganisation()) {
if(serial.equals(instance.getSerial())){
organisation = instance;
return;}
}}//</editor-fold>

}
