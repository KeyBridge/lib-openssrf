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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
Note (US) is the XML root for all parameters of a Note.

Example: <pre>
* &lt;Note&gt;
*   &lt;Administration cls="U"&gt;USA&lt;/Administration&gt;
*   &lt;EffectiveDate cls="U"&gt;2014-01-23&lt;/EffectiveDate&gt;
*   &lt;ExpirationDate cls="U"&gt;2014-12-31&lt;/ExpirationDate&gt;
*   &lt;Name cls="U"&gt;Target 743&lt;/Name&gt;
*   &lt;Source cls="U"&gt;Joint Spectrum Center&lt;/Source&gt;
* &lt;/Note&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Note", propOrder = {
    "administration",
    "effectiveDate",
    "expirationDate",
    "name",
    "source"
})
public class Note
    extends Common
{

/**
US:Administration - Administration (Optional) 

The nation or regulatory body that administers this note.

Format is L:CAO
@since 3.1.0
*/
    @XmlElement(name = "Administration", required = false)
    private TString administration;
/**
US:EffectiveDate - Effective Date (Optional) 

The date this note comes in force.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "EffectiveDate", required = false)
    private D effectiveDate;
/**
US:ExpirationDate - Expiration Date (Optional) 

The date this note goes out of force.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "ExpirationDate", required = false)
    private D expirationDate;
/**
US:Name - Name (Optional) 

The externally-assigned name of the note.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Name", required = false)
    private S100 name;
/**
US:Source - Source (Optional) 

The source or creator of the note.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Source", required = false)
    private S100 source;

/**
Get the nation or regulatory body that administers this note.

@return the Administration value in a {@link TString} data type
@since 3.1.0
*/
public TString getAdministration() {
        return administration;
    }

/**
Set the nation or regulatory body that administers this note.

@param value the Administration value in a {@link TString} data type
@since 3.1.0
*/
public void setAdministration(TString value) {
        this.administration = value;
    }

/**
Determine if the Administration is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAdministration() {
return (this.administration!= null ? this.administration.isSetValue() : false);
    }

/**
Get the date this note comes in force.

@return the EffectiveDate value in a {@link TD} data type
@since 3.1.0
*/
public D getEffectiveDate() {
        return effectiveDate;
    }

/**
Set the date this note comes in force.

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
Get the date this note goes out of force.

@return the ExpirationDate value in a {@link TD} data type
@since 3.1.0
*/
public D getExpirationDate() {
        return expirationDate;
    }

/**
Set the date this note goes out of force.

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
Get the externally-assigned name of the note.

@return the Name value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getName() {
        return name;
    }

/**
Set the externally-assigned name of the note.

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
Get the source or creator of the note.

@return the Source value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getSource() {
        return source;
    }

/**
Set the source or creator of the note.

@param value the Source value in a {@link TS100} data type
@since 3.1.0
*/
public void setSource(S100 value) {
        this.source = value;
    }

/**
Determine if the Source is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSource() {
        return (this.source!= null);
    }

/**
Set the nation or regulatory body that administers this note.

@param value  An instances of type {@link ListCAO}
@return The current Note object instance
@since 3.1.0
*/
    public Note withAdministration(ListCAO value) {
           setAdministration(new TString(value.value()));
        return this;
    }

/**
Set the date this note comes in force.

@param value  An instances of type {@link Calendar}
@return The current Note object instance
@since 3.1.0
*/
    public Note withEffectiveDate(Calendar value) {
           setEffectiveDate(new D(value));
        return this;
    }
/**
Set the date this note comes in force.

@param value  An instances of type {@link Date}
@return The current Note object instance
@since 3.1.0
*/
    public Note withEffectiveDate(Date value) {
           setEffectiveDate(new D(value));
        return this;
    }

/**
Set the date this note goes out of force.

@param value  An instances of type {@link Calendar}
@return The current Note object instance
@since 3.1.0
*/
    public Note withExpirationDate(Calendar value) {
           setExpirationDate(new D(value));
        return this;
    }
/**
Set the date this note goes out of force.

@param value  An instances of type {@link Date}
@return The current Note object instance
@since 3.1.0
*/
    public Note withExpirationDate(Date value) {
           setExpirationDate(new D(value));
        return this;
    }

/**
Set the externally-assigned name of the note.

@param value  An instances of type {@link String}
@return The current Note object instance
@since 3.1.0
*/
    public Note withName(String value) {
           setName(new S100(value));
        return this;
    }

/**
Set the source or creator of the note.

@param value  An instances of type {@link String}
@return The current Note object instance
@since 3.1.0
*/
    public Note withSource(String value) {
           setSource(new S100(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Note object instance
@since 3.1.0
*/
    public Note withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Note object instance
@since 3.1.0
*/
    public Note withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Note object instance
@since 3.1.0
*/
    public Note withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Note object instance
@since 3.1.0
*/
    public Note withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Note object instance
@since 3.1.0
*/
    public Note withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Note object instance
@since 3.1.0
*/
    public Note withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Note object instance
@since 3.1.0
*/
    public Note withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Note object instance
@since 3.1.0
*/
    public Note withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current Note object instance
@since 3.1.0
*/
    public Note withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Note object instance
@since 3.1.0
*/
    public Note withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current Note object instance
@since 3.1.0
*/
    public Note withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Note object instance
@since 3.1.0
*/
    public Note withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Note object instance
@since 3.1.0
*/
    public Note withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Note object instance
@since 3.1.0
*/
    public Note withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Note object instance
@since 3.1.0
*/
    public Note withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Note object instance
@since 3.1.0
*/
    public Note withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Note object instance
@since 3.1.0
*/
    public Note withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Note object instance
@since 3.1.0
*/
    public Note withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Note object instance
@since 3.1.0
*/
    public Note withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Note object instance
@since 3.1.0
*/
    public Note withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current Note object instance
@since 3.1.0
*/
    public Note withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Note object instance
@since 3.1.0
*/
    public Note withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current Note object instance
@since 3.1.0
*/
    public Note withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current Note object instance
@since 3.1.0
*/
    public Note withCaseNum(CaseNum... values) {
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
@return The current Note object instance
@since 3.1.0
*/
    public Note withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current Note object instance
@since 3.1.0
*/
    public Note withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current Note object instance
@since 3.1.0
*/
    public Note withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current Note object instance
@since 3.1.0
*/
    public Note withRemarks(Remarks... values) {
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
@return The current Note object instance
@since 3.1.0
*/
    public Note withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current Note object instance
@since 3.1.0
*/
    public Note withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current Note object instance
@since 3.1.0
*/
    public Note withReleasability(ListCCY... values) {
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
@return The current Note object instance
@since 3.1.0
*/
    public Note withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current Note object instance
@since 3.1.0
*/
    public Note withRemarkRef(BigInteger... values) {
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
@return The current Note object instance
@since 3.1.0
*/
    public Note withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current Note object instance
@since 3.1.0
*/
    public Note withExtReferences(BigInteger... values) {
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
@return The current Note object instance
@since 3.1.0
*/
    public Note withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current Note object instance
@since 3.1.0
*/
    public Note withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current Note object instance
@since 3.1.0
*/
    public Note withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current Note object instance
@since 3.1.0
*/
    public Note withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current Note object instance
@since 3.1.0
*/
    public Note withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this Note instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Note {"
 + (administration !=null? " administration [" + administration +"]" : "") 
 + (effectiveDate !=null? " effectiveDate [" + effectiveDate +"]" : "") 
 + (expirationDate !=null? " expirationDate [" + expirationDate +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") 
 + (source !=null? " source [" + source +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Note} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return true;
}

}
