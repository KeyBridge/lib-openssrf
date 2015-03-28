package us.gov.dod.standard.ssrf._3_1.rfsystem;

import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
RelatedSystem identifies a System linked to the current System, and the relation (parent, child, sibling).

Element of {@link RFSystem}

Example: <pre>
* &lt;RelatedSystem&gt;
*   &lt;Relation cls="U"&gt;HasChild&lt;/Relation&gt;
*   &lt;Serial cls="U"&gt;USA:AR:TR:05008827&lt;/Serial&gt;
* &lt;/RelatedSystem&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedSystem", propOrder = {
    "relation",
    "serial"
})
public class RelatedSystem {

/**
Relation - Relation Type (Required) 

The relationship between the two systems.

Format is L:CFR
@since 3.1.0
*/
    @XmlElement(name = "Relation", required = true)
      private  TString relation;
/**
Serial  - Related System Serial (Required) 

The reference of the System associated with the current System.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "Serial", required = true)
      private  Serial serial;

/**
Get the relationship between the two systems.

@return the Relation value in a {@link TString} data type
@since 3.1.0
*/
public TString getRelation() {
        return relation;
    }

/**
Set the relationship between the two systems.

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
Get the reference of the System associated with the current System.

@return the Serial value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getRfSystem()} instead.
*/
@Deprecated
public Serial getSerial() {
        return serial;
    }

/**
Set the reference of the System associated with the current System.

@param value the Serial value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setRfSystem(RFSystem)} instead.
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
Set the relationship between the two systems.

@param value  An instances of type {@link ListCFR}
@return The current RelatedSystem object instance
@since 3.1.0
*/
    public RelatedSystem withRelation(ListCFR value) {
        setRelation(new TString(value.value()));
        return this;
    }

/**
Set the reference of the System associated with the current System.

@param value  An instances of type {@link Serial}
@return The current RelatedSystem object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withRfSystem(RFSystem)} instead.
*/
@Deprecated
    public RelatedSystem withSerial(Serial value) {
        setSerial(value);
        return this;
    }

/**
 Get a string representation of this RelatedSystem instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "RelatedSystem {"
 + (relation !=null? " relation [" + relation +"]" : "") 
 + (serial !=null? " serial [" + serial +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link RelatedSystem} requires {@link TString Relation}, {@link Serial Serial}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetRelation() &&  isSetSerial();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
Serial  - Related System Serial (Required) 

The reference of the System associated with the current System.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private RFSystem rfSystem;

/**
Get the reference of the System associated with the current System.

@return  a {@link RFSystem} instance
@since 3.1.0
*/
public RFSystem getRfSystem(){
return rfSystem;
}
/**
 Determine if the rfSystem field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetRfSystem() {
    return this.rfSystem != null ;
}

/**
Set the reference of the System associated with the current System.

@param value  An instances of type {@link RFSystem}
@return The current RelatedSystem object instance
@since 3.1.0
*/
public RelatedSystem withRfSystem(RFSystem value) {
this.rfSystem = value;
return this;
}

  /**
   * Update the SSRF data type references in this RelatedSystem record.
   * <p>
 */
public void prepare() {
this.serial = rfSystem !=null? rfSystem.getSerial() : null;
}

/**
   * Update the SSRF data type references in this RelatedSystem record after loading from XML.

   * This method builds the transient {@link #rfSystem} with values
   * from the imported {@link #serial} field. This method should
   * typically be called after the RelatedSystem is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (serial==null || !serial.isSetValue() ) {return;}
for(RFSystem instance : root.getRFSystem()) {
if(serial.equals(instance.getSerial())){
rfSystem = instance;
return;}
}}//</editor-fold>

}
