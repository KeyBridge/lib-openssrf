package us.gov.dod.standard.ssrf._3_1;

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
Contact is the XML root for all parameters of a Contact. 

Sub-Elements are {@link Address}, {@link Email}, {@link TelephoneFax}

Example: <pre>
* &lt;Contact cls="U"&gt;
*   &lt;Serial cls="U"&gt;USA:AF:CN:123&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2004-05-20T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;FirstName cls="U"&gt;John&lt;/FirstName&gt;
*   &lt;LastName cls="U"&gt;Doe&lt;/LastName&gt;
*   &lt;TelephoneFax&gt;
*     &lt;Number cls="U"&gt;(123)456.789&lt;/Number&gt;
*   &lt;/TelephoneFax&gt;
* &lt;/Contact&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "effectiveDate",
    "expirationDate",
    "reviewDate",
    "titleRank",
    "firstName",
    "lastName",
    "address",
    "telephoneFax",
    "eMail"
})
public class Contact
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
TitleRank  - Title or Rank (Optional) 

The contact title or rank e.g.,  Ms, Col, etc.

Format is S10
@since 3.1.0
*/
    @XmlElement(name = "TitleRank", required = false)
    private S10 titleRank;
/**
FirstName  - First Name (Optional) 

The first name of the contact individual.

Format is S30
@since 3.1.0
*/
    @XmlElement(name = "FirstName", required = false)
    private S30 firstName;
/**
LastName  - Last Name (Optional) 

The last name of the contact individual.

Format is S30
@since 3.1.0
*/
    @XmlElement(name = "LastName", required = false)
    private S30 lastName;
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
Get the contact title or rank e.g.,  Ms, Col, etc.

@return the TitleRank value in a {@link TS10} data type
@since 3.1.0
*/
public S10 getTitleRank() {
        return titleRank;
    }

/**
Set the contact title or rank e.g.,  Ms, Col, etc.

@param value the TitleRank value in a {@link TS10} data type
@since 3.1.0
*/
public void setTitleRank(S10 value) {
        this.titleRank = value;
    }

/**
Determine if the TitleRank is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTitleRank() {
        return (this.titleRank!= null);
    }

/**
Get the first name of the contact individual.

@return the FirstName value in a {@link TS30} data type
@since 3.1.0
*/
public S30 getFirstName() {
        return firstName;
    }

/**
Set the first name of the contact individual.

@param value the FirstName value in a {@link TS30} data type
@since 3.1.0
*/
public void setFirstName(S30 value) {
        this.firstName = value;
    }

/**
Determine if the FirstName is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFirstName() {
        return (this.firstName!= null);
    }

/**
Get the last name of the contact individual.

@return the LastName value in a {@link TS30} data type
@since 3.1.0
*/
public S30 getLastName() {
        return lastName;
    }

/**
Set the last name of the contact individual.

@param value the LastName value in a {@link TS30} data type
@since 3.1.0
*/
public void setLastName(S30 value) {
        this.lastName = value;
    }

/**
Determine if the LastName is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLastName() {
        return (this.lastName!= null);
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
Set the date by which the dataset is to be operational or effective.

@param value  An instances of type {@link Calendar}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withEffectiveDate(Calendar value) {
           setEffectiveDate(new D(value));
        return this;
    }
/**
Set the date by which the dataset is to be operational or effective.

@param value  An instances of type {@link Date}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withEffectiveDate(Date value) {
           setEffectiveDate(new D(value));
        return this;
    }

/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value  An instances of type {@link Calendar}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withExpirationDate(Calendar value) {
           setExpirationDate(new D(value));
        return this;
    }
/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value  An instances of type {@link Date}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withExpirationDate(Date value) {
           setExpirationDate(new D(value));
        return this;
    }

/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Calendar}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withReviewDate(Calendar value) {
           setReviewDate(new D(value));
        return this;
    }
/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Date}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withReviewDate(Date value) {
           setReviewDate(new D(value));
        return this;
    }

/**
Set the contact title or rank e.g.,  Ms, Col, etc.

@param value  An instances of type {@link String}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withTitleRank(String value) {
           setTitleRank(new S10(value));
        return this;
    }

/**
Set the first name of the contact individual.

@param value  An instances of type {@link String}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withFirstName(String value) {
           setFirstName(new S30(value));
        return this;
    }

/**
Set the last name of the contact individual.

@param value  An instances of type {@link String}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withLastName(String value) {
           setLastName(new S30(value));
        return this;
    }

/**
Set the Address

Complex element Address contains the address of a Contact, Organisation or Role.

@param values  One or more instances of type {@link Address...}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withAddress(Address... values) {
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
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withAddress(Collection<Address> values) {
        if (values!= null) {
            getAddress().addAll(values);
        }
        return this;
    }

/**
Set the TelephoneFax

Complex element TelephoneFax reflects the telephone and/or telefax number(s) of the Contact, Organisation or Role.

@param values  One or more instances of type {@link TelephoneFax...}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withTelephoneFax(TelephoneFax... values) {
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
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withTelephoneFax(Collection<TelephoneFax> values) {
        if (values!= null) {
            getTelephoneFax().addAll(values);
        }
        return this;
    }

/**
Set the Email

Complex element Email contains the email address of the Contact or Role.

@param values  One or more instances of type {@link EMail...}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withEMail(EMail... values) {
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
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withEMail(Collection<EMail> values) {
        if (values!= null) {
            getEMail().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withCaseNum(CaseNum... values) {
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
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withRemarks(Remarks... values) {
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
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withReleasability(ListCCY... values) {
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
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withRemarkRef(BigInteger... values) {
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
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withExtReferences(BigInteger... values) {
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
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current Contact object instance
@since 3.1.0
*/
    public Contact withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this Contact instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Contact {"
 + (address !=null? " address [" + address +"]" : "") 
 + (eMail !=null? " eMail [" + eMail +"]" : "") 
 + (effectiveDate !=null? " effectiveDate [" + effectiveDate +"]" : "") 
 + (expirationDate !=null? " expirationDate [" + expirationDate +"]" : "") 
 + (firstName !=null? " firstName [" + firstName +"]" : "") 
 + (lastName !=null? " lastName [" + lastName +"]" : "") 
 + (reviewDate !=null? " reviewDate [" + reviewDate +"]" : "") 
 + (telephoneFax !=null? " telephoneFax [" + telephoneFax +"]" : "") 
 + (titleRank !=null? " titleRank [" + titleRank +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Contact} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return true;
}

}
