package us.gov.dod.standard.ssrf._3_1;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.math.BigInteger;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
ExternalReference contains bibliographic or any other references applicable to the dataset except those placed in Derivative Classification Authority (Data element ClsDerived).

Example: <pre>
* &lt;ExternalReference cls="U"&gt;
*   &lt;Serial cls="U"&gt;USA:AF:EX:123&lt;/Serial&gt;
*   &lt;Type cls="U"&gt;Document&lt;/Type&gt;
*   &lt;Title cls="U"&gt;plan 5027&lt;/Title&gt;
*   &lt;Organisation cls="U"&gt;PACOM&lt;/Organisation&gt;
*   &lt;Date cls="U"&gt;2000-04-27&lt;/Date&gt;
*   &lt;ResourceLocator cls="U"&gt;USA-AF-EX-123.PDF&lt;/ResourceLocator&gt;
* &lt;/ExternalReference&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalReference", propOrder = {
    "type",
    "date",
    "identifier",
    "alternateIdentifier",
    "title",
    "author",
    "organisation",
    "documentCls",
    "resourceLocator",
    "isAttached",
    "isClassified",
    "referencedStage",
    "repeat"
})
public class ExternalReference
    extends Common
{

/**
Type  - Type of Reference (Optional) 

The type of information referenced by this external reference.

Format is L:CRE
@since 3.1.0
*/
    @XmlElement(name = "Type", required = false)
    private TString type;
/**
Date  - Date of Reference (Optional) 

The publication date of the external reference

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "Date", required = false)
    private D date;
/**
AlternateIdentifier  - Alternate Identifier (Optional) 

Any alternate identifier for the document as needed.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "Identifier", required = false)
    private S50 identifier;
/**
AlternateIdentifier  - Alternate Identifier (Optional) 

Any alternate identifier for the document as needed.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "AlternateIdentifier", required = false)
    private S50 alternateIdentifier;
/**
Title  - Full Title (Optional) 

The full title of the document.

Format is S255
@since 3.1.0
*/
    @XmlElement(name = "Title", required = false)
    private S255 title;
/**
Author  - Author of the Reference (Optional) 

The name of the author of the reference, if it cannot be covered by a ContactRef.

Format is S255
@since 3.1.0
*/
    @XmlElement(name = "Author", required = false)
    private S255 author;
/**
Organisation  - Organisation that published the Reference (Optional) 

The name of the Organisation that published the Reference, if it cannot be covered by a OrganisationRef

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "Organisation", required = false)
    private S50 organisation;
/**
DocumentCls  - Document Classification (Optional) 

The classification level of the Reference.

Format is L:CCL
@since 3.1.0
*/
    @XmlElement(name = "DocumentCls", required = false)
    private TString documentCls;
/**
ResourceLocator - Attached File Name or URL (Optional) 

Either the file name (including the extension) of the reference document when it is attached to the dataset, or an URL (Uniform Resource Locator) to find the document.

Format is S255
@since 3.1.0
*/
    @XmlElement(name = "ResourceLocator", required = false)
    private S255 resourceLocator;
/**
US:IsAttached  - Is Attached (Required) 

If the document, file or other "external" information is stored in attachment to this message.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "IsAttached", required = true)
      private  TString isAttached;
/**
US:IsClassified  - Is Classified (Optional) 

If the referenced information contains any classified data.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "IsClassified", required = false)
    private TString isClassified;
/**
US:ReferencedStage  - Referenced Stage (Optional) 

The spectrum certification stage associated with this information.

Format is L:CSG
@since 3.1.0
*/
    @XmlElement(name = "ReferencedStage", required = false)
    private TString referencedStage;
/**
In Data Item Repeat (US), indicate if the attached file should be repeatedly viewed / listened to.
@since 3.1.0
*/
    @XmlElement(name = "Repeat", required = false)
    private TString repeat;

/**
Get the type of information referenced by this external reference.

@return the Type value in a {@link TString} data type
@since 3.1.0
*/
public TString getType() {
        return type;
    }

/**
Set the type of information referenced by this external reference.

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
Get the publication date of the external reference

@return the Date value in a {@link TD} data type
@since 3.1.0
*/
public D getDate() {
        return date;
    }

/**
Set the publication date of the external reference

@param value the Date value in a {@link TD} data type
@since 3.1.0
*/
public void setDate(D value) {
        this.date = value;
    }

/**
Determine if the Date is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDate() {
        return (this.date!= null);
    }

/**
Get any alternate identifier for the document as needed.

@return the Identifier value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getIdentifier() {
        return identifier;
    }

/**
Set any alternate identifier for the document as needed.

@param value the Identifier value in a {@link TS50} data type
@since 3.1.0
*/
public void setIdentifier(S50 value) {
        this.identifier = value;
    }

/**
Determine if the Identifier is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIdentifier() {
        return (this.identifier!= null);
    }

/**
Get any alternate identifier for the document as needed.

@return the AlternateIdentifier value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getAlternateIdentifier() {
        return alternateIdentifier;
    }

/**
Set any alternate identifier for the document as needed.

@param value the AlternateIdentifier value in a {@link TS50} data type
@since 3.1.0
*/
public void setAlternateIdentifier(S50 value) {
        this.alternateIdentifier = value;
    }

/**
Determine if the AlternateIdentifier is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAlternateIdentifier() {
        return (this.alternateIdentifier!= null);
    }

/**
Get the full title of the document.

@return the Title value in a {@link TS255} data type
@since 3.1.0
*/
public S255 getTitle() {
        return title;
    }

/**
Set the full title of the document.

@param value the Title value in a {@link TS255} data type
@since 3.1.0
*/
public void setTitle(S255 value) {
        this.title = value;
    }

/**
Determine if the Title is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTitle() {
        return (this.title!= null);
    }

/**
Get the name of the author of the reference, if it cannot be covered by a ContactRef.

@return the Author value in a {@link TS255} data type
@since 3.1.0
*/
public S255 getAuthor() {
        return author;
    }

/**
Set the name of the author of the reference, if it cannot be covered by a ContactRef.

@param value the Author value in a {@link TS255} data type
@since 3.1.0
*/
public void setAuthor(S255 value) {
        this.author = value;
    }

/**
Determine if the Author is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAuthor() {
        return (this.author!= null);
    }

/**
Get the name of the Organisation that published the Reference, if it cannot be covered by a OrganisationRef

@return the Organisation value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getOrganisation() {
        return organisation;
    }

/**
Set the name of the Organisation that published the Reference, if it cannot be covered by a OrganisationRef

@param value the Organisation value in a {@link TS50} data type
@since 3.1.0
*/
public void setOrganisation(S50 value) {
        this.organisation = value;
    }

/**
Determine if the Organisation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOrganisation() {
        return (this.organisation!= null);
    }

/**
Get the classification level of the Reference.

@return the DocumentCls value in a {@link TString} data type
@since 3.1.0
*/
public TString getDocumentCls() {
        return documentCls;
    }

/**
Set the classification level of the Reference.

@param value the DocumentCls value in a {@link TString} data type
@since 3.1.0
*/
public void setDocumentCls(TString value) {
        this.documentCls = value;
    }

/**
Determine if the DocumentCls is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDocumentCls() {
return (this.documentCls!= null ? this.documentCls.isSetValue() : false);
    }

/**
Get either the file name (including the extension) of the reference document when it is attached to the dataset, or an URL (Uniform Resource Locator) to find the document.

@return the ResourceLocator value in a {@link TS255} data type
@since 3.1.0
*/
public S255 getResourceLocator() {
        return resourceLocator;
    }

/**
Set either the file name (including the extension) of the reference document when it is attached to the dataset, or an URL (Uniform Resource Locator) to find the document.

@param value the ResourceLocator value in a {@link TS255} data type
@since 3.1.0
*/
public void setResourceLocator(S255 value) {
        this.resourceLocator = value;
    }

/**
Determine if the ResourceLocator is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetResourceLocator() {
        return (this.resourceLocator!= null);
    }

/**
Get if the document, file or other "external" information is stored in attachment to this message.

@return the IsAttached value in a {@link TString} data type
@since 3.1.0
*/
public TString getIsAttached() {
        return isAttached;
    }

/**
Set if the document, file or other "external" information is stored in attachment to this message.

@param value the IsAttached value in a {@link TString} data type
@since 3.1.0
*/
public void setIsAttached(TString value) {
        this.isAttached = value;
    }

/**
Determine if the IsAttached is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIsAttached() {
return (this.isAttached!= null ? this.isAttached.isSetValue() : false);
    }

/**
Get if the referenced information contains any classified data.

@return the IsClassified value in a {@link TString} data type
@since 3.1.0
*/
public TString getIsClassified() {
        return isClassified;
    }

/**
Set if the referenced information contains any classified data.

@param value the IsClassified value in a {@link TString} data type
@since 3.1.0
*/
public void setIsClassified(TString value) {
        this.isClassified = value;
    }

/**
Determine if the IsClassified is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIsClassified() {
return (this.isClassified!= null ? this.isClassified.isSetValue() : false);
    }

/**
Get the spectrum certification stage associated with this information.

@return the ReferencedStage value in a {@link TString} data type
@since 3.1.0
*/
public TString getReferencedStage() {
        return referencedStage;
    }

/**
Set the spectrum certification stage associated with this information.

@param value the ReferencedStage value in a {@link TString} data type
@since 3.1.0
*/
public void setReferencedStage(TString value) {
        this.referencedStage = value;
    }

/**
Determine if the ReferencedStage is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetReferencedStage() {
return (this.referencedStage!= null ? this.referencedStage.isSetValue() : false);
    }

/**
Get In Data Item Repeat (US), indicate if the attached file should be repeatedly viewed / listened to.

@return the Repeat value in a {@link TString} data type
@since 3.1.0
*/
public TString getRepeat() {
        return repeat;
    }

/**
Set In Data Item Repeat (US), indicate if the attached file should be repeatedly viewed / listened to.

@param value the Repeat value in a {@link TString} data type
@since 3.1.0
*/
public void setRepeat(TString value) {
        this.repeat = value;
    }

/**
Determine if the Repeat is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRepeat() {
return (this.repeat!= null ? this.repeat.isSetValue() : false);
    }

/**
Set the type of information referenced by this external reference.

@param value  An instances of type {@link ListCRE}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withType(ListCRE value) {
           setType(new TString(value.value()));
        return this;
    }

/**
Set the publication date of the external reference

@param value  An instances of type {@link Calendar}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withDate(Calendar value) {
           setDate(new D(value));
        return this;
    }
/**
Set the publication date of the external reference

@param value  An instances of type {@link Date}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withDate(Date value) {
           setDate(new D(value));
        return this;
    }

/**
Set any alternate identifier for the document as needed.

@param value  An instances of type {@link String}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withIdentifier(String value) {
           setIdentifier(new S50(value));
        return this;
    }

/**
Set any alternate identifier for the document as needed.

@param value  An instances of type {@link String}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withAlternateIdentifier(String value) {
           setAlternateIdentifier(new S50(value));
        return this;
    }

/**
Set the full title of the document.

@param value  An instances of type {@link String}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withTitle(String value) {
           setTitle(new S255(value));
        return this;
    }

/**
Set the name of the author of the reference, if it cannot be covered by a ContactRef.

@param value  An instances of type {@link String}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withAuthor(String value) {
           setAuthor(new S255(value));
        return this;
    }

/**
Set the name of the Organisation that published the Reference, if it cannot be covered by a OrganisationRef

@param value  An instances of type {@link String}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withOrganisation(String value) {
           setOrganisation(new S50(value));
        return this;
    }

/**
Set the classification level of the Reference.

@param value  An instances of type {@link ListCCL}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withDocumentCls(ListCCL value) {
           setDocumentCls(new TString(value.value()));
        return this;
    }

/**
Set either the file name (including the extension) of the reference document when it is attached to the dataset, or an URL (Uniform Resource Locator) to find the document.

@param value  An instances of type {@link String}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withResourceLocator(String value) {
           setResourceLocator(new S255(value));
        return this;
    }

/**
Set if the document, file or other "external" information is stored in attachment to this message.

@param value  An instances of type {@link ListCBO}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withIsAttached(ListCBO value) {
        setIsAttached(new TString(value.value()));
        return this;
    }

/**
Set if the referenced information contains any classified data.

@param value  An instances of type {@link ListCBO}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withIsClassified(ListCBO value) {
           setIsClassified(new TString(value.value()));
        return this;
    }

/**
Set the spectrum certification stage associated with this information.

@param value  An instances of type {@link ListCSG}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withReferencedStage(ListCSG value) {
           setReferencedStage(new TString(value.value()));
        return this;
    }

/**
Set In Data Item Repeat (US), indicate if the attached file should be repeatedly viewed / listened to.

@param value  An instances of type {@link ListCBO}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withRepeat(ListCBO value) {
           setRepeat(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withCaseNum(CaseNum... values) {
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
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withRemarks(Remarks... values) {
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
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification level of the Reference.

@param value  An instances of type {@link ListCCL}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withReleasability(ListCCY... values) {
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
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withRemarkRef(BigInteger... values) {
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
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withExtReferences(BigInteger... values) {
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
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current ExternalReference object instance
@since 3.1.0
*/
    public ExternalReference withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this ExternalReference instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ExternalReference {"
 + (alternateIdentifier !=null? " alternateIdentifier [" + alternateIdentifier +"]" : "") 
 + (author !=null? " author [" + author +"]" : "") 
 + (date !=null? " date [" + date +"]" : "") 
 + (documentCls !=null? " documentCls [" + documentCls +"]" : "") 
 + (identifier !=null? " identifier [" + identifier +"]" : "") 
 + (isAttached !=null? " isAttached [" + isAttached +"]" : "") 
 + (isClassified !=null? " isClassified [" + isClassified +"]" : "") 
 + (organisation !=null? " organisation [" + organisation +"]" : "") 
 + (referencedStage !=null? " referencedStage [" + referencedStage +"]" : "") 
 + (repeat !=null? " repeat [" + repeat +"]" : "") 
 + (resourceLocator !=null? " resourceLocator [" + resourceLocator +"]" : "") 
 + (title !=null? " title [" + title +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ExternalReference} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link TString IsAttached}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetIsAttached();
}

}
