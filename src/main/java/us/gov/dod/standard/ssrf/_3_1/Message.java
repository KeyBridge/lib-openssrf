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
Message describes the receipt and disposition of a group of Datasets in a single transmittal. The receiving system SHOULD verify the correct datasets were received. If a dataset fails validation, a separate Administrative dataset SHOULD be returned to the sender informing them of the error.

Sub-Element is {@link DatasetRefs}

Example: <pre>
* &lt;Message cls="U"&gt;
*   &lt;Serial cls="U"&gt;TUR::MS:123&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;Name cls="U"&gt;Results of Your 2012-01-05 Data Request&lt;/Name&gt;
*   &lt;SecondaryDatasets cls="U"&gt;No&lt;/SecondaryDatasets&gt;
*   &lt;DatasetRef cls="U"&gt;POL::AN:456&lt;DatasetRef&gt;
*     &lt;DatasetRef cls="U"&gt;DEU::AL:456&lt;DatasetRef&gt;
*       &lt;DatasetRef cls="U"&gt;NED::TX:456&lt;DatasetRef&gt;
*         &lt;DatasetRef cls="U"&gt;USA::RX:456&lt;DatasetRef&gt;
*         &lt;/Message&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message", propOrder = {
    "name",
    "secondaryDatasets",
    "datasetRef"
})
public class Message
    extends Common
{

/**
Name - Message Name (Optional) 

A human-readable name for the message.

Format is S40
@since 3.1.0
*/
    @XmlElement(name = "Name", required = false)
    private S40 name;
/**
In Data Item SecondaryDatasets, indicate if datasets referenced by the primary dataset are included.
@since 3.1.0
*/
    @XmlElement(name = "SecondaryDatasets", required = false)
    private TString secondaryDatasets;

    @XmlElement(name = "DatasetRef", required = true, nillable = true)
      private  Set<Serial> datasetRef;

/**
Get a human-readable name for the message.

@return the Name value in a {@link TS40} data type
@since 3.1.0
*/
public S40 getName() {
        return name;
    }

/**
Set a human-readable name for the message.

@param value the Name value in a {@link TS40} data type
@since 3.1.0
*/
public void setName(S40 value) {
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
Get In Data Item SecondaryDatasets, indicate if datasets referenced by the primary dataset are included.

@return the SecondaryDatasets value in a {@link TString} data type
@since 3.1.0
*/
public TString getSecondaryDatasets() {
        return secondaryDatasets;
    }

/**
Set In Data Item SecondaryDatasets, indicate if datasets referenced by the primary dataset are included.

@param value the SecondaryDatasets value in a {@link TString} data type
@since 3.1.0
*/
public void setSecondaryDatasets(TString value) {
        this.secondaryDatasets = value;
    }

/**
Determine if the SecondaryDatasets is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSecondaryDatasets() {
return (this.secondaryDatasets!= null ? this.secondaryDatasets.isSetValue() : false);
    }

/**
Get 

@return  a {@link Serial} instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getData()} instead.
*/
@Deprecated
    public Set<Serial> getDatasetRef() {
        if (datasetRef == null) {
            datasetRef = new HashSet<Serial>();
        }
        return this.datasetRef;
    }

/**
Determine if the DatasetRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDatasetRef() {
        return ((this.datasetRef!= null)&&(!this.datasetRef.isEmpty()));
    }

/**
  Clear the DatasetRef field. This sets the field to null.
 */
    public void unsetDatasetRef() {
        this.datasetRef = null;
    }

/**
Set a human-readable name for the message.

@param value  An instances of type {@link String}
@return The current Message object instance
@since 3.1.0
*/
    public Message withName(String value) {
           setName(new S40(value));
        return this;
    }

/**
Set In Data Item SecondaryDatasets, indicate if datasets referenced by the primary dataset are included.

@param value  An instances of type {@link ListCBO}
@return The current Message object instance
@since 3.1.0
*/
    public Message withSecondaryDatasets(ListCBO value) {
           setSecondaryDatasets(new TString(value.value()));
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link DatasetRef...}
@return The current Message object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withData(Common...)} instead.
*/
@Deprecated
    public Message withDatasetRef(Serial... values) {
        if (values!= null) {
            for (DatasetRef value: values) {
                getDatasetRef().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link Serial} instances
@return The current Message object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withData(Common...)} instead.
*/
@Deprecated
    public Message withDatasetRef(Collection<Serial> values) {
        if (values!= null) {
            getDatasetRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Message object instance
@since 3.1.0
*/
    public Message withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Message object instance
@since 3.1.0
*/
    public Message withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Message object instance
@since 3.1.0
*/
    public Message withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Message object instance
@since 3.1.0
*/
    public Message withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Message object instance
@since 3.1.0
*/
    public Message withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Message object instance
@since 3.1.0
*/
    public Message withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Message object instance
@since 3.1.0
*/
    public Message withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Message object instance
@since 3.1.0
*/
    public Message withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current Message object instance
@since 3.1.0
*/
    public Message withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Message object instance
@since 3.1.0
*/
    public Message withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current Message object instance
@since 3.1.0
*/
    public Message withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Message object instance
@since 3.1.0
*/
    public Message withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Message object instance
@since 3.1.0
*/
    public Message withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Message object instance
@since 3.1.0
*/
    public Message withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Message object instance
@since 3.1.0
*/
    public Message withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Message object instance
@since 3.1.0
*/
    public Message withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Message object instance
@since 3.1.0
*/
    public Message withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Message object instance
@since 3.1.0
*/
    public Message withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Message object instance
@since 3.1.0
*/
    public Message withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Message object instance
@since 3.1.0
*/
    public Message withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current Message object instance
@since 3.1.0
*/
    public Message withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Message object instance
@since 3.1.0
*/
    public Message withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current Message object instance
@since 3.1.0
*/
    public Message withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current Message object instance
@since 3.1.0
*/
    public Message withCaseNum(CaseNum... values) {
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
@return The current Message object instance
@since 3.1.0
*/
    public Message withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current Message object instance
@since 3.1.0
*/
    public Message withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current Message object instance
@since 3.1.0
*/
    public Message withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current Message object instance
@since 3.1.0
*/
    public Message withRemarks(Remarks... values) {
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
@return The current Message object instance
@since 3.1.0
*/
    public Message withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current Message object instance
@since 3.1.0
*/
    public Message withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current Message object instance
@since 3.1.0
*/
    public Message withReleasability(ListCCY... values) {
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
@return The current Message object instance
@since 3.1.0
*/
    public Message withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current Message object instance
@since 3.1.0
*/
    public Message withRemarkRef(BigInteger... values) {
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
@return The current Message object instance
@since 3.1.0
*/
    public Message withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current Message object instance
@since 3.1.0
*/
    public Message withExtReferences(BigInteger... values) {
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
@return The current Message object instance
@since 3.1.0
*/
    public Message withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current Message object instance
@since 3.1.0
*/
    public Message withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current Message object instance
@since 3.1.0
*/
    public Message withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current Message object instance
@since 3.1.0
*/
    public Message withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current Message object instance
@since 3.1.0
*/
    public Message withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this Message instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Message {"
 + (datasetRef !=null? " datasetRef [" + datasetRef +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") 
 + (secondaryDatasets !=null? " secondaryDatasets [" + secondaryDatasets +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Message} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return true;
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">

@XmlTransient
private Set<Common<?>> data;

/**
Get 

@return  a {@link Common} instance
@since 3.1.0
*/
public Set<Common<?>> getData(){
if(data == null){
data = new HashSet<>();
}
 return data;
}
/**
 Determine if the data field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetData() {
return this.data !=null  && !this.data.isEmpty();
}

/**
Set 

@param values  An instances of type {@link Common<?>}
@return The current Message object instance
@since 3.1.0
*/
public Message withData(Common<?>... values) {
return  withData(Arrays.asList(values));
}

/**
Set 

@param values  An instances of type {@link Common<?>}
@return The current Message object instance
@since 3.1.0
*/
public Message withData(Collection<Common<?>> values) {
getData().addAll(values);
return this;
}
  /**
   * Update the SSRF data type references in this Message record.
   * <p>
 @since 3.1.0 */
  @Override
public void prepare() {
super.prepare();
this.datasetRef= new ArrayList<>();
for (Common<?> instance :  getData()) {
this.datasetRef.add(instance.getSerial());
}

/**
   * Update the SSRF data type references in this Message record after loading from XML.

   * This method builds the transient {@link #data} with values
   * from the imported {@link #datasetRef} field. This method should
   * typically be called after the Message is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (datasetRef==null || datasetRef.isEmpty() ) {return;}
for(Common<?> instance : root.getCommon<?>()) {
if(datasetRef.contains(instance.getSerial())){
data.add(instance);
}
}}//</editor-fold>

}
