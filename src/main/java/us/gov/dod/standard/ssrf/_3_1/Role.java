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
Role is the XML root for all parameters of a Role (position or role representing an organisational user of the system; also known as Job Account in the USA).

Sub-Elements are {@link Address}, {@link Email}, {@link TelephoneFax}

Example: <pre>
* &lt;Role cls="U"&gt;
*   &lt;Serial cls="U"&gt;USA::JA:123&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-12T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;Name cls="U"&gt;EUCOM FMFO&lt;/Name&gt;
*   &lt;Country cls="U"&gt;USA&lt;/Country&gt;
*   &lt;ContactRef cls="U"&gt;USA:EU:CN:1&lt;/ContactRef&gt;
* &lt;/Role&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Role", propOrder = {
    "effectiveDate",
    "expirationDate",
    "reviewDate",
    "name",
    "country",
    "address",
    "telephoneFax",
    "eMail",
    "contactRef"
})
public class Role
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

The date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicates when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

Format is Date

Attribute group ExpireReview (Optional)
@since 3.1.0
*/
    @XmlElement(name = "ReviewDate", required = false)
    private D reviewDate;
/**
Name  - Role Name (Required) 

The name or function of the Role. The name SHOULD be unique within the agency.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "Name", required = true)
      private  S50 name;
/**
Country  - Country (Optional) 

The country to which the Role belongs. 
IMPORTANT NOTE: The Country is Optional in order to accommodate legacy data; however it SHOULD be filled in. The release of datasets to Roles is based upon matching nationalities; therefore a Role without a Country will not be able to receive datasets having a releasability caveat.

Format is L:CCY
@since 3.1.0
*/
    @XmlElement(name = "Country", required = false)
    private TString country;
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

Email contains the email address of the Contact or Role.
@since 3.1.0
*/
    @XmlElement(name = "EMail")
      private  Set<EMail> eMail;
/**
ContactRef (Optional)

ContactRef references a Contact.
@since 3.1.0
*/
    @XmlElement(name = "ContactRef", nillable = true)
      private  Set<Serial> contactRef;

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
Get the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicates when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@return the ReviewDate value in a {@link TD} data type
@since 3.1.0
*/
public D getReviewDate() {
        return reviewDate;
    }

/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicates when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

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
Get the name or function of the Role. The name SHOULD be unique within the agency.

@return the Name value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getName() {
        return name;
    }

/**
Set the name or function of the Role. The name SHOULD be unique within the agency.

@param value the Name value in a {@link TS50} data type
@since 3.1.0
*/
public void setName(S50 value) {
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
Get the country to which the Role belongs. 
IMPORTANT NOTE: The Country is Optional in order to accommodate legacy data; however it SHOULD be filled in. The release of datasets to Roles is based upon matching nationalities; therefore a Role without a Country will not be able to receive datasets having a releasability caveat.

@return the Country value in a {@link TString} data type
@since 3.1.0
*/
public TString getCountry() {
        return country;
    }

/**
Set the country to which the Role belongs. 
IMPORTANT NOTE: The Country is Optional in order to accommodate legacy data; however it SHOULD be filled in. The release of datasets to Roles is based upon matching nationalities; therefore a Role without a Country will not be able to receive datasets having a releasability caveat.

@param value the Country value in a {@link TString} data type
@since 3.1.0
*/
public void setCountry(TString value) {
        this.country = value;
    }

/**
Determine if the Country is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCountry() {
return (this.country!= null ? this.country.isSetValue() : false);
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

Complex element Email contains the email address of the Contact or Role.

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
Get the ContactRef

Complex element ContactRef references a Contact.

@return  a {@link Serial} instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getContact()} instead.
*/
@Deprecated
    public Set<Serial> getContactRef() {
        if (contactRef == null) {
            contactRef = new HashSet<Serial>();
        }
        return this.contactRef;
    }

/**
Determine if the ContactRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetContactRef() {
        return ((this.contactRef!= null)&&(!this.contactRef.isEmpty()));
    }

/**
  Clear the ContactRef field. This sets the field to null.
 */
    public void unsetContactRef() {
        this.contactRef = null;
    }

/**
Set the date by which the dataset is to be operational or effective.

@param value  An instances of type {@link Calendar}
@return The current Role object instance
@since 3.1.0
*/
    public Role withEffectiveDate(Calendar value) {
           setEffectiveDate(new D(value));
        return this;
    }
/**
Set the date by which the dataset is to be operational or effective.

@param value  An instances of type {@link Date}
@return The current Role object instance
@since 3.1.0
*/
    public Role withEffectiveDate(Date value) {
           setEffectiveDate(new D(value));
        return this;
    }

/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value  An instances of type {@link Calendar}
@return The current Role object instance
@since 3.1.0
*/
    public Role withExpirationDate(Calendar value) {
           setExpirationDate(new D(value));
        return this;
    }
/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value  An instances of type {@link Date}
@return The current Role object instance
@since 3.1.0
*/
    public Role withExpirationDate(Date value) {
           setExpirationDate(new D(value));
        return this;
    }

/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicates when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Calendar}
@return The current Role object instance
@since 3.1.0
*/
    public Role withReviewDate(Calendar value) {
           setReviewDate(new D(value));
        return this;
    }
/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicates when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Date}
@return The current Role object instance
@since 3.1.0
*/
    public Role withReviewDate(Date value) {
           setReviewDate(new D(value));
        return this;
    }

/**
Set the name or function of the Role. The name SHOULD be unique within the agency.

@param value  An instances of type {@link TS50}
@return The current Role object instance
@since 3.1.0
*/
    public Role withName(TS50 value) {
        return this;
    }

/**
Set the country to which the Role belongs. 
IMPORTANT NOTE: The Country is Optional in order to accommodate legacy data; however it SHOULD be filled in. The release of datasets to Roles is based upon matching nationalities; therefore a Role without a Country will not be able to receive datasets having a releasability caveat.

@param value  An instances of type {@link ListCCY}
@return The current Role object instance
@since 3.1.0
*/
    public Role withCountry(ListCCY value) {
           setCountry(new TString(value.value()));
        return this;
    }

/**
Set the Address

Complex element Address contains the address of a Contact, Organisation or Role.

@param values  One or more instances of type {@link Address...}
@return The current Role object instance
@since 3.1.0
*/
    public Role withAddress(Address... values) {
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
@return The current Role object instance
@since 3.1.0
*/
    public Role withAddress(Collection<Address> values) {
        if (values!= null) {
            getAddress().addAll(values);
        }
        return this;
    }

/**
Set the TelephoneFax

Complex element TelephoneFax reflects the telephone and/or telefax number(s) of the Contact, Organisation or Role.

@param values  One or more instances of type {@link TelephoneFax...}
@return The current Role object instance
@since 3.1.0
*/
    public Role withTelephoneFax(TelephoneFax... values) {
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
@return The current Role object instance
@since 3.1.0
*/
    public Role withTelephoneFax(Collection<TelephoneFax> values) {
        if (values!= null) {
            getTelephoneFax().addAll(values);
        }
        return this;
    }

/**
Set the Email

Complex element Email contains the email address of the Contact or Role.

@param values  One or more instances of type {@link EMail...}
@return The current Role object instance
@since 3.1.0
*/
    public Role withEMail(EMail... values) {
        if (values!= null) {
            for (EMail value: values) {
                getEMail().add(value);
            }
        }
        return this;
    }

/**
Set the Email

Complex element Email contains the email address of the Contact or Role.

@param values  A collection of {@link EMail} instances
@return The current Role object instance
@since 3.1.0
*/
    public Role withEMail(Collection<EMail> values) {
        if (values!= null) {
            getEMail().addAll(values);
        }
        return this;
    }

/**
Set the ContactRef

Complex element ContactRef references a Contact.

@param values  One or more instances of type {@link ContactRef...}
@return The current Role object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withContact(Contact...)} instead.
*/
@Deprecated
    public Role withContactRef(Serial... values) {
        if (values!= null) {
            for (ContactRef value: values) {
                getContactRef().add(value);
            }
        }
        return this;
    }

/**
Set the ContactRef

Complex element ContactRef references a Contact.

@param values  A collection of {@link Serial} instances
@return The current Role object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withContact(Contact...)} instead.
*/
@Deprecated
    public Role withContactRef(Collection<Serial> values) {
        if (values!= null) {
            getContactRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Role object instance
@since 3.1.0
*/
    public Role withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Role object instance
@since 3.1.0
*/
    public Role withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Role object instance
@since 3.1.0
*/
    public Role withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Role object instance
@since 3.1.0
*/
    public Role withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Role object instance
@since 3.1.0
*/
    public Role withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Role object instance
@since 3.1.0
*/
    public Role withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Role object instance
@since 3.1.0
*/
    public Role withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Role object instance
@since 3.1.0
*/
    public Role withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current Role object instance
@since 3.1.0
*/
    public Role withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Role object instance
@since 3.1.0
*/
    public Role withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current Role object instance
@since 3.1.0
*/
    public Role withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Role object instance
@since 3.1.0
*/
    public Role withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Role object instance
@since 3.1.0
*/
    public Role withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Role object instance
@since 3.1.0
*/
    public Role withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Role object instance
@since 3.1.0
*/
    public Role withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Role object instance
@since 3.1.0
*/
    public Role withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Role object instance
@since 3.1.0
*/
    public Role withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Role object instance
@since 3.1.0
*/
    public Role withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Role object instance
@since 3.1.0
*/
    public Role withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Role object instance
@since 3.1.0
*/
    public Role withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current Role object instance
@since 3.1.0
*/
    public Role withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Role object instance
@since 3.1.0
*/
    public Role withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current Role object instance
@since 3.1.0
*/
    public Role withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current Role object instance
@since 3.1.0
*/
    public Role withCaseNum(CaseNum... values) {
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
@return The current Role object instance
@since 3.1.0
*/
    public Role withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current Role object instance
@since 3.1.0
*/
    public Role withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current Role object instance
@since 3.1.0
*/
    public Role withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current Role object instance
@since 3.1.0
*/
    public Role withRemarks(Remarks... values) {
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
@return The current Role object instance
@since 3.1.0
*/
    public Role withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current Role object instance
@since 3.1.0
*/
    public Role withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current Role object instance
@since 3.1.0
*/
    public Role withReleasability(ListCCY... values) {
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
@return The current Role object instance
@since 3.1.0
*/
    public Role withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current Role object instance
@since 3.1.0
*/
    public Role withRemarkRef(BigInteger... values) {
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
@return The current Role object instance
@since 3.1.0
*/
    public Role withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current Role object instance
@since 3.1.0
*/
    public Role withExtReferences(BigInteger... values) {
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
@return The current Role object instance
@since 3.1.0
*/
    public Role withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current Role object instance
@since 3.1.0
*/
    public Role withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current Role object instance
@since 3.1.0
*/
    public Role withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current Role object instance
@since 3.1.0
*/
    public Role withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current Role object instance
@since 3.1.0
*/
    public Role withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this Role instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Role {"
 + (address !=null? " address [" + address +"]" : "") 
 + (contactRef !=null? " contactRef [" + contactRef +"]" : "") 
 + (country !=null? " country [" + country +"]" : "") 
 + (eMail !=null? " eMail [" + eMail +"]" : "") 
 + (effectiveDate !=null? " effectiveDate [" + effectiveDate +"]" : "") 
 + (expirationDate !=null? " expirationDate [" + expirationDate +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") 
 + (reviewDate !=null? " reviewDate [" + reviewDate +"]" : "") 
 + (telephoneFax !=null? " telephoneFax [" + telephoneFax +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Role} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link S50 Name}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetName();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
ContactRef (Optional)

ContactRef references a Contact.
@since 3.1.0
*/
@XmlTransient
private Set<Contact> contact;

/**
Get the ContactRef

Complex element ContactRef references a Contact.

@return  a {@link Contact} instance
@since 3.1.0
*/
public Set<Contact> getContact(){
if(contact == null){
contact = new HashSet<>();
}
 return contact;
}
/**
 Determine if the contact field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetContact() {
return this.contact !=null  && !this.contact.isEmpty();
}

/**
Set the ContactRef

Complex element ContactRef references a Contact.

@param values  An instances of type {@link Contact}
@return The current Role object instance
@since 3.1.0
*/
public Role withContact(Contact... values) {
return  withContact(Arrays.asList(values));
}

/**
Set the ContactRef

Complex element ContactRef references a Contact.

@param values  An instances of type {@link Contact}
@return The current Role object instance
@since 3.1.0
*/
public Role withContact(Collection<Contact> values) {
getContact().addAll(values);
return this;
}
  /**
   * Update the SSRF data type references in this Role record.
   * <p>
 @since 3.1.0 */
  @Override
public void prepare() {
super.prepare();
this.contactRef= new ArrayList<>();
for (Contact instance :  getContact()) {
this.contactRef.add(instance.getSerial());
}

/**
   * Update the SSRF data type references in this Role record after loading from XML.

   * This method builds the transient {@link #contact} with values
   * from the imported {@link #contactRef} field. This method should
   * typically be called after the Role is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (contactRef==null || contactRef.isEmpty() ) {return;}
for(Contact instance : root.getContact()) {
if(contactRef.contains(instance.getSerial())){
contact.add(instance);
}
}}//</editor-fold>

}
