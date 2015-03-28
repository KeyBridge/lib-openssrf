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
TOA is the XML root for all parameters of a Table of Allocations. It inherits attributes and sub-elements from element Common.

Sub-Elements are {@link Country}, {@link Footnote}, {@link FreqBand}

Example: <pre>
* &lt;TOA cls="U"&gt;
*   &lt;Serial cls="U"&gt;USA:NTIA:TA:1&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;Administration cls="U"&gt;NTIA&lt;/Administration&gt;
*   &lt;FreqBand&gt;
*     &lt;FreqMin cls="U"&gt;230&lt;/FreqMin&gt;
*     &lt;FreqMax cls="U"&gt;400&lt;/FreqMax&gt;
*     &lt;Allocation&gt;
*       &lt;AllocatedService cls="U"&gt;Mobile Service&lt;/AllocatedService&gt;
*       &lt;Priority cls="U"&gt;Primary&lt;/Priority&gt;
*     &lt;/Allocation&gt;
*   &lt;/FreqBand&gt;
* &lt;/TOA&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOA", propOrder = {
    "administration",
    "effectiveDate",
    "expirationDate",
    "title",
    "footnote",
    "channelPlanRef",
    "country",
    "freqBand"
})
public class TOA
    extends Common
{

/**
Administration  - Administration (Required) 

The nation or regulatory body that administers this Table of Allocations.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "Administration", required = true)
      private  S50 administration;
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
@since 3.1.0
*/
    @XmlElement(name = "ExpirationDate", required = false)
    private D expirationDate;
/**
Title  - Title (Optional) 

An identifying name for this Table of Allocations.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Title", required = false)
    private S100 title;
/**
Footnote (Optional)

Footnote contains the text and identifier of a Footnote, FCC Rule Part Number, Band User (e.g., "Military", "Civil Support Team"). or Band Application (e.g., "Wind Profiler").
@since 3.1.0
*/
    @XmlElement(name = "Footnote")
      private  Set<Footnote> footnote;
/**
ChannelPlanRef (Optional)

ChannelPlanRef refers to a ChannelPlan.
@since 3.1.0
*/
    @XmlElement(name = "ChannelPlanRef", nillable = true)
      private  Set<Serial> channelPlanRef;
/**
Country (Optional)

Country indicates the country or area for which this Table of Allocations is in force.
@since 3.1.0
*/
    @XmlElement(name = "Country", nillable = true)
      private  Set<Country> country;
/**
FreqBand (Required)

FreqBand contains the allocation of a specific frequency band to radiocommunication services. It may also provide additional information such as the specification of the rights and responsibilities of a user.
@since 3.1.0
*/
    @XmlElement(name = "FreqBand", required = true)
      private  Set<FreqBand> freqBand;

/**
Get the nation or regulatory body that administers this Table of Allocations.

@return the Administration value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getAdministration() {
        return administration;
    }

/**
Set the nation or regulatory body that administers this Table of Allocations.

@param value the Administration value in a {@link TS50} data type
@since 3.1.0
*/
public void setAdministration(S50 value) {
        this.administration = value;
    }

/**
Determine if the Administration is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAdministration() {
        return (this.administration!= null);
    }

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
Get an identifying name for this Table of Allocations.

@return the Title value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getTitle() {
        return title;
    }

/**
Set an identifying name for this Table of Allocations.

@param value the Title value in a {@link TS100} data type
@since 3.1.0
*/
public void setTitle(S100 value) {
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
Get the Footnote

Complex element Footnote contains the text and identifier of a Footnote, FCC Rule Part Number, Band User (e.g., "Military", "Civil Support Team"). or Band Application (e.g., "Wind Profiler").

@return  a {@link Footnote} instance
@since 3.1.0
*/
    public Set<Footnote> getFootnote() {
        if (footnote == null) {
            footnote = new HashSet<Footnote>();
        }
        return this.footnote;
    }

/**
Determine if the Footnote is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFootnote() {
        return ((this.footnote!= null)&&(!this.footnote.isEmpty()));
    }

/**
  Clear the Footnote field. This sets the field to null.
 */
    public void unsetFootnote() {
        this.footnote = null;
    }

/**
Get the ChannelPlanRef

Complex element ChannelPlanRef refers to a ChannelPlan.

@return  a {@link Serial} instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getChannelPlan()} instead.
*/
@Deprecated
    public Set<Serial> getChannelPlanRef() {
        if (channelPlanRef == null) {
            channelPlanRef = new HashSet<Serial>();
        }
        return this.channelPlanRef;
    }

/**
Determine if the ChannelPlanRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetChannelPlanRef() {
        return ((this.channelPlanRef!= null)&&(!this.channelPlanRef.isEmpty()));
    }

/**
  Clear the ChannelPlanRef field. This sets the field to null.
 */
    public void unsetChannelPlanRef() {
        this.channelPlanRef = null;
    }

/**
Get the Country

Complex element Country indicates the country or area for which this Table of Allocations is in force.

@return  a {@link Country} instance
@since 3.1.0
*/
    public Set<Country> getCountry() {
        if (country == null) {
            country = new HashSet<Country>();
        }
        return this.country;
    }

/**
Determine if the Country is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCountry() {
        return ((this.country!= null)&&(!this.country.isEmpty()));
    }

/**
  Clear the Country field. This sets the field to null.
 */
    public void unsetCountry() {
        this.country = null;
    }

/**
Get the FreqBand

Complex element FreqBand contains the allocation of a specific frequency band to radiocommunication services. It may also provide additional information such as the specification of the rights and responsibilities of a user.

@return  a {@link FreqBand} instance
@since 3.1.0
*/
    public Set<FreqBand> getFreqBand() {
        if (freqBand == null) {
            freqBand = new HashSet<FreqBand>();
        }
        return this.freqBand;
    }

/**
Determine if the FreqBand is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqBand() {
        return ((this.freqBand!= null)&&(!this.freqBand.isEmpty()));
    }

/**
  Clear the FreqBand field. This sets the field to null.
 */
    public void unsetFreqBand() {
        this.freqBand = null;
    }

/**
Set the nation or regulatory body that administers this Table of Allocations.

@param value  An instances of type {@link TS50}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withAdministration(TS50 value) {
        return this;
    }

/**
Set the date by which the dataset is to be operational or effective.

@param value  An instances of type {@link Calendar}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withEffectiveDate(Calendar value) {
           setEffectiveDate(new D(value));
        return this;
    }
/**
Set the date by which the dataset is to be operational or effective.

@param value  An instances of type {@link Date}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withEffectiveDate(Date value) {
           setEffectiveDate(new D(value));
        return this;
    }

/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value  An instances of type {@link Calendar}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withExpirationDate(Calendar value) {
           setExpirationDate(new D(value));
        return this;
    }
/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value  An instances of type {@link Date}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withExpirationDate(Date value) {
           setExpirationDate(new D(value));
        return this;
    }

/**
Set an identifying name for this Table of Allocations.

@param value  An instances of type {@link String}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withTitle(String value) {
           setTitle(new S100(value));
        return this;
    }

/**
Set the Footnote

Complex element Footnote contains the text and identifier of a Footnote, FCC Rule Part Number, Band User (e.g., "Military", "Civil Support Team"). or Band Application (e.g., "Wind Profiler").

@param values  One or more instances of type {@link Footnote...}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withFootnote(Footnote... values) {
        if (values!= null) {
            for (Footnote value: values) {
                getFootnote().add(value);
            }
        }
        return this;
    }

/**
Set the Footnote

Complex element Footnote contains the text and identifier of a Footnote, FCC Rule Part Number, Band User (e.g., "Military", "Civil Support Team"). or Band Application (e.g., "Wind Profiler").

@param values  A collection of {@link Footnote} instances
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withFootnote(Collection<Footnote> values) {
        if (values!= null) {
            getFootnote().addAll(values);
        }
        return this;
    }

/**
Set the ChannelPlanRef

Complex element ChannelPlanRef refers to a ChannelPlan.

@param values  One or more instances of type {@link ChannelPlanRef...}
@return The current TOA object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withChannelPlan(ChannelPlan...)} instead.
*/
@Deprecated
    public TOA withChannelPlanRef(Serial... values) {
        if (values!= null) {
            for (ChannelPlanRef value: values) {
                getChannelPlanRef().add(value);
            }
        }
        return this;
    }

/**
Set the ChannelPlanRef

Complex element ChannelPlanRef refers to a ChannelPlan.

@param values  A collection of {@link Serial} instances
@return The current TOA object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withChannelPlan(ChannelPlan...)} instead.
*/
@Deprecated
    public TOA withChannelPlanRef(Collection<Serial> values) {
        if (values!= null) {
            getChannelPlanRef().addAll(values);
        }
        return this;
    }

/**
Set the Country

Complex element Country indicates the country or area for which this Table of Allocations is in force.

@param values  One or more instances of type {@link Country...}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withCountry(Country... values) {
        if (values!= null) {
            for (Country value: values) {
                getCountry().add(value);
            }
        }
        return this;
    }

/**
Set the Country

Complex element Country indicates the country or area for which this Table of Allocations is in force.

@param values  A collection of {@link Country} instances
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withCountry(Collection<Country> values) {
        if (values!= null) {
            getCountry().addAll(values);
        }
        return this;
    }

/**
Set the FreqBand

Complex element FreqBand contains the allocation of a specific frequency band to radiocommunication services. It may also provide additional information such as the specification of the rights and responsibilities of a user.

@param values  One or more instances of type {@link FreqBand...}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withFreqBand(FreqBand... values) {
        if (values!= null) {
            for (FreqBand value: values) {
                getFreqBand().add(value);
            }
        }
        return this;
    }

/**
Set the FreqBand

Complex element FreqBand contains the allocation of a specific frequency band to radiocommunication services. It may also provide additional information such as the specification of the rights and responsibilities of a user.

@param values  A collection of {@link FreqBand} instances
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withFreqBand(Collection<FreqBand> values) {
        if (values!= null) {
            getFreqBand().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withCaseNum(CaseNum... values) {
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
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withRemarks(Remarks... values) {
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
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withReleasability(ListCCY... values) {
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
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withRemarkRef(BigInteger... values) {
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
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withExtReferences(BigInteger... values) {
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
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current TOA object instance
@since 3.1.0
*/
    public TOA withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this TOA instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "TOA {"
 + (administration !=null? " administration [" + administration +"]" : "") 
 + (channelPlanRef !=null? " channelPlanRef [" + channelPlanRef +"]" : "") 
 + (country !=null? " country [" + country +"]" : "") 
 + (effectiveDate !=null? " effectiveDate [" + effectiveDate +"]" : "") 
 + (expirationDate !=null? " expirationDate [" + expirationDate +"]" : "") 
 + (footnote !=null? " footnote [" + footnote +"]" : "") 
 + (freqBand !=null? " freqBand [" + freqBand +"]" : "") 
 + (title !=null? " title [" + title +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link TOA} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link S50 Administration}, {@link Set<FreqBand> FreqBand}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetAdministration() &&  isSetFreqBand();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
ChannelPlanRef (Optional)

ChannelPlanRef refers to a ChannelPlan.
@since 3.1.0
*/
@XmlTransient
private Set<ChannelPlan> channelPlan;

/**
Get the ChannelPlanRef

Complex element ChannelPlanRef refers to a ChannelPlan.

@return  a {@link ChannelPlan} instance
@since 3.1.0
*/
public Set<ChannelPlan> getChannelPlan(){
if(channelPlan == null){
channelPlan = new HashSet<>();
}
 return channelPlan;
}
/**
 Determine if the channelPlan field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetChannelPlan() {
return this.channelPlan !=null  && !this.channelPlan.isEmpty();
}

/**
Set the ChannelPlanRef

Complex element ChannelPlanRef refers to a ChannelPlan.

@param values  An instances of type {@link ChannelPlan}
@return The current TOA object instance
@since 3.1.0
*/
public TOA withChannelPlan(ChannelPlan... values) {
return  withChannelPlan(Arrays.asList(values));
}

/**
Set the ChannelPlanRef

Complex element ChannelPlanRef refers to a ChannelPlan.

@param values  An instances of type {@link ChannelPlan}
@return The current TOA object instance
@since 3.1.0
*/
public TOA withChannelPlan(Collection<ChannelPlan> values) {
getChannelPlan().addAll(values);
return this;
}
  /**
   * Update the SSRF data type references in this TOA record.
   * <p>
 @since 3.1.0 */
  @Override
public void prepare() {
super.prepare();
this.channelPlanRef= new ArrayList<>();
for (ChannelPlan instance :  getChannelPlan()) {
this.channelPlanRef.add(instance.getSerial());
}

/**
   * Update the SSRF data type references in this TOA record after loading from XML.

   * This method builds the transient {@link #channelPlan} with values
   * from the imported {@link #channelPlanRef} field. This method should
   * typically be called after the TOA is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (channelPlanRef==null || channelPlanRef.isEmpty() ) {return;}
for(ChannelPlan instance : root.getChannelPlan()) {
if(channelPlanRef.contains(instance.getSerial())){
channelPlan.add(instance);
}
}}//</editor-fold>

}
