package us.gov.dod.standard.ssrf._3_1;

import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.math.BigInteger;
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
Organisation is the XML root for all parameters of an Organisation (service, agency, manufacturer, etc).

Sub-Elements are {@link Address}, {@link Email}, {@link RelatedOrganisation}, {@link TelephoneFax}

Example: <pre>
* &lt;Organisation cls="U"&gt;
*   &lt;Serial cls="U"&gt;DEU:AF:OR:123&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-12T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;Name cls="U"&gt;LUFTWAFFE&lt;/Name&gt;
*   &lt;Address&gt;
*     &lt;CityArea cls="U"&gt;Berlin&lt;/CityArea&gt;
*     &lt;Country cls="U"&gt;DEU&lt;/Country&gt;
*   &lt;/Address&gt;
* &lt;/Organisation&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation", propOrder = {
    "effectiveDate",
    "expirationDate",
    "reviewDate",
    "name",
    "alternateName",
    "type",
    "uic",
    "address",
    "telephoneFax",
    "eMail",
    "roleRef",
    "relatedOrganisation"
})
public class Organisation
    extends Common
{

/**
EffectiveDate  - Effective Date (Optional) 

The date by which the dataset is to be operational or effective.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "EffectiveDate", required = false)
    private D effectiveDate;
/**
ExpirationDate  - Expiration Date (Optional) 

The date at which the dataset will expire. The Expiration date should be less than five years from current date.

Format is Date

Attribute group ExpireReview (Optional)
@since 3.1.0
*/
    @XmlElement(name = "ExpirationDate", required = false)
    private D expirationDate;
/**
ReviewDate  - Review Date (Optional) 

The date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

Format is Date

Attribute group ExpireReview (Optional)
@since 3.1.0
*/
    @XmlElement(name = "ReviewDate", required = false)
    private D reviewDate;
/**
AlternateName - Alternate Name (Optional) 

An alternate name or nickname for the organisation.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Name", required = false)
    private S100 name;
/**
AlternateName - Alternate Name (Optional) 

An alternate name or nickname for the organisation.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "AlternateName", required = false)
    private S100 alternateName;
/**
Type  - Type (Optional) 

The type of relationship.

Format is L:CFT
@since 3.1.0
*/
    @XmlElement(name = "Type", required = false)
    private TString type;
/**
US:UIC  - Unit Identification Code (Optional) 

An organisational identifier that may be used to uniquely identify an organisation in operational planning systems and other non-spectrum information systems.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "UIC", required = false)
    private S20 uic;
/**
Address (Optional)

Address contains the address of a Contact, Organisation or Role.
@since 3.1.0
*/
    @XmlElement(name = "Address")
      private  Set<Address> address;
/**
TelephoneFax (Optional)

TelephoneFax reflects the telephone and/or telefax number(s) of the Contact, Organisation or Role.
@since 3.1.0
*/
    @XmlElement(name = "TelephoneFax")
      private  Set<TelephoneFax> telephoneFax;
/**
Email (Optional)

Email contains the email address of a Contact or Role.

Notes: Will add Organisation to text in next release
@since 3.1.0
*/
    @XmlElement(name = "EMail")
      private  Set<EMail> eMail;
/**
RoleRef (Optional)

RoleRef contains the serial of a referenced Role.
@since 3.1.0
*/
    @XmlElement(name = "RoleRef", nillable = true)
      private  Set<Serial> roleRef;
/**
RelatedOrganisation (Optional)

RelatedOrganisation identifies an Organisation linked to the current Organisation, the type of relation (reporting, budget, etc) and the relation (parent, child, sibling).
@since 3.1.0
*/
    @XmlElement(name = "RelatedOrganisation")
      private  Set<RelatedOrganisation> relatedOrganisation;

/**
Get the date by which the dataset is to be operational or effective.

@return the EffectiveDate value in a {@link TD} data type
@since 3.1.0
*/
public D getEffectiveDate() {
        return effectiveDate;
    }

/**
Set the date by which the dataset is to be operational or effective.

@param value the EffectiveDate value in a {@link TD} data type
@since 3.1.0
*/
public void setEffectiveDate(D value) {
        this.effectiveDate = value;
    }

/**
Determine if the EffectiveDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEffectiveDate() {
        return (this.effectiveDate!= null);
    }

/**
Get the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@return the ExpirationDate value in a {@link TD} data type
@since 3.1.0
*/
public D getExpirationDate() {
        return expirationDate;
    }

/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value the ExpirationDate value in a {@link TD} data type
@since 3.1.0
*/
public void setExpirationDate(D value) {
        this.expirationDate = value;
    }

/**
Determine if the ExpirationDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetExpirationDate() {
        return (this.expirationDate!= null);
    }

/**
Get the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@return the ReviewDate value in a {@link TD} data type
@since 3.1.0
*/
public D getReviewDate() {
        return reviewDate;
    }

/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value the ReviewDate value in a {@link TD} data type
@since 3.1.0
*/
public void setReviewDate(D value) {
        this.reviewDate = value;
    }

/**
Determine if the ReviewDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetReviewDate() {
        return (this.reviewDate!= null);
    }

/**
Get an alternate name or nickname for the organisation.

@return the Name value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getName() {
        return name;
    }

/**
Set an alternate name or nickname for the organisation.

@param value the Name value in a {@link TS100} data type
@since 3.1.0
*/
public void setName(S100 value) {
        this.name = value;
    }

/**
Determine if the Name is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetName() {
        return (this.name!= null);
    }

/**
Get an alternate name or nickname for the organisation.

@return the AlternateName value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getAlternateName() {
        return alternateName;
    }

/**
Set an alternate name or nickname for the organisation.

@param value the AlternateName value in a {@link TS100} data type
@since 3.1.0
*/
public void setAlternateName(S100 value) {
        this.alternateName = value;
    }

/**
Determine if the AlternateName is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAlternateName() {
        return (this.alternateName!= null);
    }

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
Get an organisational identifier that may be used to uniquely identify an organisation in operational planning systems and other non-spectrum information systems.

@return the UIC value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getUIC() {
        return uic;
    }

/**
Set an organisational identifier that may be used to uniquely identify an organisation in operational planning systems and other non-spectrum information systems.

@param value the UIC value in a {@link TS20} data type
@since 3.1.0
*/
public void setUIC(S20 value) {
        this.uic = value;
    }

/**
Determine if the UIC is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetUIC() {
        return (this.uic!= null);
    }

/**
Get the Address

Complex element Address contains the address of a Contact, Organisation or Role.

@return  a {@link Address} instance
@since 3.1.0
*/
    public Set<Address> getAddress() {
        if (address == null) {
            address = new HashSet<Address>();
        }
        return this.address;
    }

/**
Determine if the Address is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAddress() {
        return ((this.address!= null)&&(!this.address.isEmpty()));
    }

/**
  Clear the Address field. This sets the field to null.
 */
    public void unsetAddress() {
        this.address = null;
    }

/**
Get the TelephoneFax

Complex element TelephoneFax reflects the telephone and/or telefax number(s) of the Contact, Organisation or Role.

@return  a {@link TelephoneFax} instance
@since 3.1.0
*/
    public Set<TelephoneFax> getTelephoneFax() {
        if (telephoneFax == null) {
            telephoneFax = new HashSet<TelephoneFax>();
        }
        return this.telephoneFax;
    }

/**
Determine if the TelephoneFax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTelephoneFax() {
        return ((this.telephoneFax!= null)&&(!this.telephoneFax.isEmpty()));
    }

/**
  Clear the TelephoneFax field. This sets the field to null.
 */
    public void unsetTelephoneFax() {
        this.telephoneFax = null;
    }

/**
Get the Email

Complex element Email contains the email address of a Contact or Role.

@return  a {@link EMail} instance
@since 3.1.0
*/
    public Set<EMail> getEMail() {
        if (eMail == null) {
            eMail = new HashSet<EMail>();
        }
        return this.eMail;
    }

/**
Determine if the EMail is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEMail() {
        return ((this.eMail!= null)&&(!this.eMail.isEmpty()));
    }

/**
  Clear the EMail field. This sets the field to null.
 */
    public void unsetEMail() {
        this.eMail = null;
    }

/**
Get the RoleRef

Complex element RoleRef contains the serial of a referenced Role.

@return  a {@link Serial} instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getRole()} instead.
*/
@Deprecated
    public Set<Serial> getRoleRef() {
        if (roleRef == null) {
            roleRef = new HashSet<Serial>();
        }
        return this.roleRef;
    }

/**
Determine if the RoleRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRoleRef() {
        return ((this.roleRef!= null)&&(!this.roleRef.isEmpty()));
    }

/**
  Clear the RoleRef field. This sets the field to null.
 */
    public void unsetRoleRef() {
        this.roleRef = null;
    }

/**
Get the RelatedOrganisation

Complex element RelatedOrganisation identifies an Organisation linked to the current Organisation, the type of relation (reporting, budget, etc) and the relation (parent, child, sibling).

@return  a {@link RelatedOrganisation} instance
@since 3.1.0
*/
    public Set<RelatedOrganisation> getRelatedOrganisation() {
        if (relatedOrganisation == null) {
            relatedOrganisation = new HashSet<RelatedOrganisation>();
        }
        return this.relatedOrganisation;
    }

/**
Determine if the RelatedOrganisation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRelatedOrganisation() {
        return ((this.relatedOrganisation!= null)&&(!this.relatedOrganisation.isEmpty()));
    }

/**
  Clear the RelatedOrganisation field. This sets the field to null.
 */
    public void unsetRelatedOrganisation() {
        this.relatedOrganisation = null;
    }

/**
Set the date by which the dataset is to be operational or effective.

@param value  An instances of type {@link Calendar}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withEffectiveDate(Calendar value) {
           setEffectiveDate(new D(value));
        return this;
    }
/**
Set the date by which the dataset is to be operational or effective.

@param value  An instances of type {@link Date}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withEffectiveDate(Date value) {
           setEffectiveDate(new D(value));
        return this;
    }

/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value  An instances of type {@link Calendar}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withExpirationDate(Calendar value) {
           setExpirationDate(new D(value));
        return this;
    }
/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value  An instances of type {@link Date}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withExpirationDate(Date value) {
           setExpirationDate(new D(value));
        return this;
    }

/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Calendar}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withReviewDate(Calendar value) {
           setReviewDate(new D(value));
        return this;
    }
/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Date}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withReviewDate(Date value) {
           setReviewDate(new D(value));
        return this;
    }

/**
Set an alternate name or nickname for the organisation.

@param value  An instances of type {@link String}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withName(String value) {
           setName(new S100(value));
        return this;
    }

/**
Set an alternate name or nickname for the organisation.

@param value  An instances of type {@link String}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withAlternateName(String value) {
           setAlternateName(new S100(value));
        return this;
    }

/**
Set the type of relationship.

@param value  An instances of type {@link ListCTO}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withType(ListCTO value) {
           setType(new TString(value.value()));
        return this;
    }

/**
Set an organisational identifier that may be used to uniquely identify an organisation in operational planning systems and other non-spectrum information systems.

@param value  An instances of type {@link String}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withUIC(String value) {
           setUIC(new S20(value));
        return this;
    }

/**
Set the Address

Complex element Address contains the address of a Contact, Organisation or Role.

@param values  One or more instances of type {@link Address...}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withAddress(Address... values) {
        if (values!= null) {
            for (Address value: values) {
                getAddress().add(value);
            }
        }
        return this;
    }

/**
Set the Address

Complex element Address contains the address of a Contact, Organisation or Role.

@param values  A collection of {@link Address} instances
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withAddress(Collection<Address> values) {
        if (values!= null) {
            getAddress().addAll(values);
        }
        return this;
    }

/**
Set the TelephoneFax

Complex element TelephoneFax reflects the telephone and/or telefax number(s) of the Contact, Organisation or Role.

@param values  One or more instances of type {@link TelephoneFax...}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withTelephoneFax(TelephoneFax... values) {
        if (values!= null) {
            for (TelephoneFax value: values) {
                getTelephoneFax().add(value);
            }
        }
        return this;
    }

/**
Set the TelephoneFax

Complex element TelephoneFax reflects the telephone and/or telefax number(s) of the Contact, Organisation or Role.

@param values  A collection of {@link TelephoneFax} instances
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withTelephoneFax(Collection<TelephoneFax> values) {
        if (values!= null) {
            getTelephoneFax().addAll(values);
        }
        return this;
    }

/**
Set the Email

Complex element Email contains the email address of a Contact or Role.

@param values  One or more instances of type {@link EMail...}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withEMail(EMail... values) {
        if (values!= null) {
            for (EMail value: values) {
                getEMail().add(value);
            }
        }
        return this;
    }

/**
Set the Email

Complex element Email contains the email address of a Contact or Role.

@param values  A collection of {@link EMail} instances
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withEMail(Collection<EMail> values) {
        if (values!= null) {
            getEMail().addAll(values);
        }
        return this;
    }

/**
Set the RoleRef

Complex element RoleRef contains the serial of a referenced Role.

@param values  One or more instances of type {@link RoleRef...}
@return The current Organisation object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withRole(Role...)} instead.
*/
@Deprecated
    public Organisation withRoleRef(Serial... values) {
        if (values!= null) {
            for (RoleRef value: values) {
                getRoleRef().add(value);
            }
        }
        return this;
    }

/**
Set the RoleRef

Complex element RoleRef contains the serial of a referenced Role.

@param values  A collection of {@link Serial} instances
@return The current Organisation object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withRole(Role...)} instead.
*/
@Deprecated
    public Organisation withRoleRef(Collection<Serial> values) {
        if (values!= null) {
            getRoleRef().addAll(values);
        }
        return this;
    }

/**
Set the RelatedOrganisation

Complex element RelatedOrganisation identifies an Organisation linked to the current Organisation, the type of relation (reporting, budget, etc) and the relation (parent, child, sibling).

@param values  One or more instances of type {@link RelatedOrganisation...}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withRelatedOrganisation(RelatedOrganisation... values) {
        if (values!= null) {
            for (RelatedOrganisation value: values) {
                getRelatedOrganisation().add(value);
            }
        }
        return this;
    }

/**
Set the RelatedOrganisation

Complex element RelatedOrganisation identifies an Organisation linked to the current Organisation, the type of relation (reporting, budget, etc) and the relation (parent, child, sibling).

@param values  A collection of {@link RelatedOrganisation} instances
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withRelatedOrganisation(Collection<RelatedOrganisation> values) {
        if (values!= null) {
            getRelatedOrganisation().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set the unique reference of the Organisation associated with the current Organisation.

@param value  An instances of type {@link Serial}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withCaseNum(CaseNum... values) {
        if (values!= null) {
            for (CaseNum value: values) {
                getCaseNum().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set 

@param values  A collection of {@link CaseNum} instances
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withExtReferenceRef(ExtReferenceRef... values) {
        if (values!= null) {
            for (ExtReferenceRef value: values) {
                getExtReferenceRef().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set 

@param values  A collection of {@link ExtReferenceRef} instances
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withRemarks(Remarks... values) {
        if (values!= null) {
            for (Remarks value: values) {
                getRemarks().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  A collection of {@link Remarks} instances
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withReleasability(ListCCY... values) {
        if (values!= null) {
            for (ListCCY value: values) {
                getReleasability().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  A collection of {@link Releasability} instances
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withRemarkRef(BigInteger... values) {
        if (values!= null) {
            for (BigInteger value: values) {
                getRemarkRef().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set 

@param values  A collection of {@link RemarkRef} instances
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withExtReferences(BigInteger... values) {
        if (values!= null) {
            for (BigInteger value: values) {
                getExtReferences().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  A collection of {@link ExtReferences} instances
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current Organisation object instance
@since 3.1.0
*/
    public Organisation withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this Organisation instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Organisation {"
 + (address !=null? " address [" + address +"]" : "") 
 + (alternateName !=null? " alternateName [" + alternateName +"]" : "") 
 + (eMail !=null? " eMail [" + eMail +"]" : "") 
 + (effectiveDate !=null? " effectiveDate [" + effectiveDate +"]" : "") 
 + (expirationDate !=null? " expirationDate [" + expirationDate +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") 
 + (relatedOrganisation !=null? " relatedOrganisation [" + relatedOrganisation +"]" : "") 
 + (reviewDate !=null? " reviewDate [" + reviewDate +"]" : "") 
 + (roleRef !=null? " roleRef [" + roleRef +"]" : "") 
 + (telephoneFax !=null? " telephoneFax [" + telephoneFax +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") 
 + (uic !=null? " uic [" + uic +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Organisation} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return true;
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
RoleRef (Optional)

RoleRef contains the serial of a referenced Role.
@since 3.1.0
*/
@XmlTransient
private Set<Role> role;

/**
Get the RoleRef

Complex element RoleRef contains the serial of a referenced Role.

@return  a {@link Role} instance
@since 3.1.0
*/
public Set<Role> getRole(){
if(role == null){
role = new HashSet<>();
}
 return role;
}
/**
 Determine if the role field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetRole() {
return this.role !=null  && !this.role.isEmpty();
}

/**
Set the RoleRef

Complex element RoleRef contains the serial of a referenced Role.

@param values  An instances of type {@link Role}
@return The current Organisation object instance
@since 3.1.0
*/
public Organisation withRole(Role... values) {
return  withRole(Arrays.asList(values));
}

/**
Set the RoleRef

Complex element RoleRef contains the serial of a referenced Role.

@param values  An instances of type {@link Role}
@return The current Organisation object instance
@since 3.1.0
*/
public Organisation withRole(Collection<Role> values) {
getRole().addAll(values);
return this;
}
  /**
   * Update the SSRF data type references in this Organisation record.
   * <p>
 @since 3.1.0 */
  @Override
public void prepare() {
super.prepare();
this.roleRef= new ArrayList<>();
for (Role instance :  getRole()) {
this.roleRef.add(instance.getSerial());
}

/**
   * Update the SSRF data type references in this Organisation record after loading from XML.

   * This method builds the transient {@link #role} with values
   * from the imported {@link #roleRef} field. This method should
   * typically be called after the Organisation is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (roleRef==null || roleRef.isEmpty() ) {return;}
for(Role instance : root.getRole()) {
if(roleRef.contains(instance.getSerial())){
role.add(instance);
}
}}//</editor-fold>

}
