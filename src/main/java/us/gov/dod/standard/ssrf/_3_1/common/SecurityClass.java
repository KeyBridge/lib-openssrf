package us.gov.dod.standard.ssrf._3_1.common;

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
SecurityClass (US) contains the security classification from one or more data information sources.

Element of {@link Common}

Sub-Elements are {@link ClsDerived}, {@link Downgrade}

Example: <pre>
* &lt;Security Class&gt;
*   &lt;ClsAuthority  cls="U"&gt;DOD Spectrum Data Admin&lt;/ClsAuthority &gt;
*   &lt;ClsOrg  cls="U"&gt;DSO&lt;/ClsOrg &gt;
*   &lt;ClsReason  cls="U"&gt;A G&lt;/ClsReason &gt;
*   &lt;DeclsDate  cls="U"&gt;2014-12-31&lt;/DeclsDate &gt;
*   &lt;DeclsEvent  cls="U"&gt;DECLASSIFY AFTER MISSILE LAUNCH&lt;/DeclsEvent &gt;
*   &lt;DeclsType  cls="U"&gt;DE25X2&lt;/DeclsType &gt;
*   &lt;SourceClsDate  cls="U"&gt;2011-10-19&lt;/SourceClsDate &gt;
* &lt;/Security Class&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityClass", propOrder = {
    "clsAuthority",
    "sourceClsDate",
    "clsOrg",
    "clsReason",
    "declsType",
    "declsDate",
    "declsEvent",
    "downgrade",
    "clsDerived"
})
public class SecurityClass {

/**
US:ClsAuthority  - Original Classification Authority (Optional) 

The identity, by name and position, or by personal identifier, of the original classification authority.

Format is S30
@since 3.1.0
*/
    @XmlElement(name = "ClsAuthority", required = false)
    private S30 clsAuthority;
/**
US:SourceClsDate  - Source Classification Date (Optional) 

The date this classified dataset was prepared, i.e., the Original Classification Date.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "SourceClsDate", required = false)
    private D sourceClsDate;
/**
US:ClsOrg  - Original Classification Authority Organizatio (Optional) 

The organization of the original classification authority.

Format is S30
@since 3.1.0
*/
    @XmlElement(name = "ClsOrg", required = false)
    private S30 clsOrg;
/**
US:ClsReason  - Reason for Classification (Optional) 

The reason(s) for the classification. This field contains one or more letters, separated by spaces, from the following list. (a) military plans, weapons systems, or operations; (b) foreign government information; (c) intelligence activities (including covert action), intelligence sources or methods, or cryptology; (d) foreign relations or foreign activities of the United States, including confidential sources; (e) scientific, technological, or economic matters relating to the national security; (f) United States Government programs for safeguarding nuclear materials or facilities; (g) vulnerabilities or capabilities of systems, installations, infrastructures, projects, plans, or protection services relating to the national security; or (h) the development, production, or use of weapons of mass destruction.

Format is S15
@since 3.1.0
*/
    @XmlElement(name = "ClsReason", required = false)
    private S15 clsReason;
/**
US:DeclsType  - Declassification Instructions (Optional) 

The declassification instructions of the dataset. Refer to the appropriate classification authority(s) for more information about this field.

Format is S10
@since 3.1.0
*/
    @XmlElement(name = "DeclsType", required = false)
    private S10 declsType;
/**
US:DeclsDate  - Declassification Date (Optional) 

The declassification date for DEDATE and DE25Xn-based declassification instructions.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "DeclsDate", required = false)
    private D declsDate;
/**
US:DeclsEvent  - Declassification Event (Optional) 

The declassification event, when necessary based on the declassification instructions.

Format is S200
@since 3.1.0
*/
    @XmlElement(name = "DeclsEvent", required = false)
    private S200 declsEvent;
/**
US:Downgrade (Optional)

Downgrade (US) contains the downgrade security classification from one or more data information sources.
@since 3.1.0
*/
    @XmlElement(name = "Downgrade")
      private  Set<Downgrade> downgrade;
/**
US:ClsDerived (Optional)

ClsDerived (US) contains the derived security classification from one or more data information sources.
@since 3.1.0
*/
    @XmlElement(name = "ClsDerived")
      private  Set<ClsDerived> clsDerived;

/**
Get the identity, by name and position, or by personal identifier, of the original classification authority.

@return the ClsAuthority value in a {@link TS30} data type
@since 3.1.0
*/
public S30 getClsAuthority() {
        return clsAuthority;
    }

/**
Set the identity, by name and position, or by personal identifier, of the original classification authority.

@param value the ClsAuthority value in a {@link TS30} data type
@since 3.1.0
*/
public void setClsAuthority(S30 value) {
        this.clsAuthority = value;
    }

/**
Determine if the ClsAuthority is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetClsAuthority() {
        return (this.clsAuthority!= null);
    }

/**
Get the date this classified dataset was prepared, i.e., the Original Classification Date.

@return the SourceClsDate value in a {@link TD} data type
@since 3.1.0
*/
public D getSourceClsDate() {
        return sourceClsDate;
    }

/**
Set the date this classified dataset was prepared, i.e., the Original Classification Date.

@param value the SourceClsDate value in a {@link TD} data type
@since 3.1.0
*/
public void setSourceClsDate(D value) {
        this.sourceClsDate = value;
    }

/**
Determine if the SourceClsDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSourceClsDate() {
        return (this.sourceClsDate!= null);
    }

/**
Get the organization of the original classification authority.

@return the ClsOrg value in a {@link TS30} data type
@since 3.1.0
*/
public S30 getClsOrg() {
        return clsOrg;
    }

/**
Set the organization of the original classification authority.

@param value the ClsOrg value in a {@link TS30} data type
@since 3.1.0
*/
public void setClsOrg(S30 value) {
        this.clsOrg = value;
    }

/**
Determine if the ClsOrg is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetClsOrg() {
        return (this.clsOrg!= null);
    }

/**
Get the reason(s) for the classification. This field contains one or more letters, separated by spaces, from the following list. (a) military plans, weapons systems, or operations; (b) foreign government information; (c) intelligence activities (including covert action), intelligence sources or methods, or cryptology; (d) foreign relations or foreign activities of the United States, including confidential sources; (e) scientific, technological, or economic matters relating to the national security; (f) United States Government programs for safeguarding nuclear materials or facilities; (g) vulnerabilities or capabilities of systems, installations, infrastructures, projects, plans, or protection services relating to the national security; or (h) the development, production, or use of weapons of mass destruction.

@return the ClsReason value in a {@link TS15} data type
@since 3.1.0
*/
public S15 getClsReason() {
        return clsReason;
    }

/**
Set the reason(s) for the classification. This field contains one or more letters, separated by spaces, from the following list. (a) military plans, weapons systems, or operations; (b) foreign government information; (c) intelligence activities (including covert action), intelligence sources or methods, or cryptology; (d) foreign relations or foreign activities of the United States, including confidential sources; (e) scientific, technological, or economic matters relating to the national security; (f) United States Government programs for safeguarding nuclear materials or facilities; (g) vulnerabilities or capabilities of systems, installations, infrastructures, projects, plans, or protection services relating to the national security; or (h) the development, production, or use of weapons of mass destruction.

@param value the ClsReason value in a {@link TS15} data type
@since 3.1.0
*/
public void setClsReason(S15 value) {
        this.clsReason = value;
    }

/**
Determine if the ClsReason is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetClsReason() {
        return (this.clsReason!= null);
    }

/**
Get the declassification instructions of the dataset. Refer to the appropriate classification authority(s) for more information about this field.

@return the DeclsType value in a {@link TS10} data type
@since 3.1.0
*/
public S10 getDeclsType() {
        return declsType;
    }

/**
Set the declassification instructions of the dataset. Refer to the appropriate classification authority(s) for more information about this field.

@param value the DeclsType value in a {@link TS10} data type
@since 3.1.0
*/
public void setDeclsType(S10 value) {
        this.declsType = value;
    }

/**
Determine if the DeclsType is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDeclsType() {
        return (this.declsType!= null);
    }

/**
Get the declassification date for DEDATE and DE25Xn-based declassification instructions.

@return the DeclsDate value in a {@link TD} data type
@since 3.1.0
*/
public D getDeclsDate() {
        return declsDate;
    }

/**
Set the declassification date for DEDATE and DE25Xn-based declassification instructions.

@param value the DeclsDate value in a {@link TD} data type
@since 3.1.0
*/
public void setDeclsDate(D value) {
        this.declsDate = value;
    }

/**
Determine if the DeclsDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDeclsDate() {
        return (this.declsDate!= null);
    }

/**
Get the declassification event, when necessary based on the declassification instructions.

@return the DeclsEvent value in a {@link TS200} data type
@since 3.1.0
*/
public S200 getDeclsEvent() {
        return declsEvent;
    }

/**
Set the declassification event, when necessary based on the declassification instructions.

@param value the DeclsEvent value in a {@link TS200} data type
@since 3.1.0
*/
public void setDeclsEvent(S200 value) {
        this.declsEvent = value;
    }

/**
Determine if the DeclsEvent is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDeclsEvent() {
        return (this.declsEvent!= null);
    }

/**
Get the US:Downgrade

Complex element Downgrade (US) contains the downgrade security classification from one or more data information sources.

@return  a {@link Downgrade} instance
@since 3.1.0
*/
    public Set<Downgrade> getDowngrade() {
        if (downgrade == null) {
            downgrade = new HashSet<Downgrade>();
        }
        return this.downgrade;
    }

/**
Determine if the Downgrade is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDowngrade() {
        return ((this.downgrade!= null)&&(!this.downgrade.isEmpty()));
    }

/**
  Clear the Downgrade field. This sets the field to null.
 */
    public void unsetDowngrade() {
        this.downgrade = null;
    }

/**
Get the US:ClsDerived

Complex element ClsDerived (US) contains the derived security classification from one or more data information sources.

@return  a {@link ClsDerived} instance
@since 3.1.0
*/
    public Set<ClsDerived> getClsDerived() {
        if (clsDerived == null) {
            clsDerived = new HashSet<ClsDerived>();
        }
        return this.clsDerived;
    }

/**
Determine if the ClsDerived is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetClsDerived() {
        return ((this.clsDerived!= null)&&(!this.clsDerived.isEmpty()));
    }

/**
  Clear the ClsDerived field. This sets the field to null.
 */
    public void unsetClsDerived() {
        this.clsDerived = null;
    }

/**
Set the identity, by name and position, or by personal identifier, of the original classification authority.

@param value  An instances of type {@link String}
@return The current SecurityClass object instance
@since 3.1.0
*/
    public SecurityClass withClsAuthority(String value) {
           setClsAuthority(new S30(value));
        return this;
    }

/**
Set the date this classified dataset was prepared, i.e., the Original Classification Date.

@param value  An instances of type {@link Calendar}
@return The current SecurityClass object instance
@since 3.1.0
*/
    public SecurityClass withSourceClsDate(Calendar value) {
           setSourceClsDate(new D(value));
        return this;
    }
/**
Set the date this classified dataset was prepared, i.e., the Original Classification Date.

@param value  An instances of type {@link Date}
@return The current SecurityClass object instance
@since 3.1.0
*/
    public SecurityClass withSourceClsDate(Date value) {
           setSourceClsDate(new D(value));
        return this;
    }

/**
Set the organization of the original classification authority.

@param value  An instances of type {@link String}
@return The current SecurityClass object instance
@since 3.1.0
*/
    public SecurityClass withClsOrg(String value) {
           setClsOrg(new S30(value));
        return this;
    }

/**
Set the reason(s) for the classification. This field contains one or more letters, separated by spaces, from the following list. (a) military plans, weapons systems, or operations; (b) foreign government information; (c) intelligence activities (including covert action), intelligence sources or methods, or cryptology; (d) foreign relations or foreign activities of the United States, including confidential sources; (e) scientific, technological, or economic matters relating to the national security; (f) United States Government programs for safeguarding nuclear materials or facilities; (g) vulnerabilities or capabilities of systems, installations, infrastructures, projects, plans, or protection services relating to the national security; or (h) the development, production, or use of weapons of mass destruction.

@param value  An instances of type {@link String}
@return The current SecurityClass object instance
@since 3.1.0
*/
    public SecurityClass withClsReason(String value) {
           setClsReason(new S15(value));
        return this;
    }

/**
Set the declassification instructions of the dataset. Refer to the appropriate classification authority(s) for more information about this field.

@param value  An instances of type {@link String}
@return The current SecurityClass object instance
@since 3.1.0
*/
    public SecurityClass withDeclsType(String value) {
           setDeclsType(new S10(value));
        return this;
    }

/**
Set the declassification date for DEDATE and DE25Xn-based declassification instructions.

@param value  An instances of type {@link Calendar}
@return The current SecurityClass object instance
@since 3.1.0
*/
    public SecurityClass withDeclsDate(Calendar value) {
           setDeclsDate(new D(value));
        return this;
    }
/**
Set the declassification date for DEDATE and DE25Xn-based declassification instructions.

@param value  An instances of type {@link Date}
@return The current SecurityClass object instance
@since 3.1.0
*/
    public SecurityClass withDeclsDate(Date value) {
           setDeclsDate(new D(value));
        return this;
    }

/**
Set the declassification event, when necessary based on the declassification instructions.

@param value  An instances of type {@link String}
@return The current SecurityClass object instance
@since 3.1.0
*/
    public SecurityClass withDeclsEvent(String value) {
           setDeclsEvent(new S200(value));
        return this;
    }

/**
Set the US:Downgrade

Complex element Downgrade (US) contains the downgrade security classification from one or more data information sources.

@param values  One or more instances of type {@link Downgrade...}
@return The current SecurityClass object instance
@since 3.1.0
*/
    public SecurityClass withDowngrade(Downgrade... values) {
        if (values!= null) {
            for (Downgrade value: values) {
                getDowngrade().add(value);
            }
        }
        return this;
    }

/**
Set the US:Downgrade

Complex element Downgrade (US) contains the downgrade security classification from one or more data information sources.

@param values  A collection of {@link Downgrade} instances
@return The current SecurityClass object instance
@since 3.1.0
*/
    public SecurityClass withDowngrade(Collection<Downgrade> values) {
        if (values!= null) {
            getDowngrade().addAll(values);
        }
        return this;
    }

/**
Set the US:ClsDerived

Complex element ClsDerived (US) contains the derived security classification from one or more data information sources.

@param values  One or more instances of type {@link ClsDerived...}
@return The current SecurityClass object instance
@since 3.1.0
*/
    public SecurityClass withClsDerived(ClsDerived... values) {
        if (values!= null) {
            for (ClsDerived value: values) {
                getClsDerived().add(value);
            }
        }
        return this;
    }

/**
Set the US:ClsDerived

Complex element ClsDerived (US) contains the derived security classification from one or more data information sources.

@param values  A collection of {@link ClsDerived} instances
@return The current SecurityClass object instance
@since 3.1.0
*/
    public SecurityClass withClsDerived(Collection<ClsDerived> values) {
        if (values!= null) {
            getClsDerived().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this SecurityClass instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "SecurityClass {"
 + (clsAuthority !=null? " clsAuthority [" + clsAuthority +"]" : "") 
 + (clsDerived !=null? " clsDerived [" + clsDerived +"]" : "") 
 + (clsOrg !=null? " clsOrg [" + clsOrg +"]" : "") 
 + (clsReason !=null? " clsReason [" + clsReason +"]" : "") 
 + (declsDate !=null? " declsDate [" + declsDate +"]" : "") 
 + (declsEvent !=null? " declsEvent [" + declsEvent +"]" : "") 
 + (declsType !=null? " declsType [" + declsType +"]" : "") 
 + (downgrade !=null? " downgrade [" + downgrade +"]" : "") 
 + (sourceClsDate !=null? " sourceClsDate [" + sourceClsDate +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link SecurityClass} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
