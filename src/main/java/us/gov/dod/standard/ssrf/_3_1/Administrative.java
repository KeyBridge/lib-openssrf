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
Data element Administrative has several usages:
* It can be used to inform other data repositories that datasets have been deleted from a data repository;
* It can also be used to reject an incoming dataset which cannot be validated against the local repository, for example if it refers to unknown datasets.
* Automated local data repository changes are not permitted on US systems.

Sub-Elements are {@link CodeList}, {@link Dataset}

Example: Rejecting an Assignment for which the recipient does not have the referenced Transmitter dataset:<pre>
* &lt;Administrative cls="U"&gt;
*   &lt;Serial cls="U"&gt;DEU:NFA:DR:123&lt;/Serial&gt;
*   &lt;MessageRef cls="U"&gt;DEU:NFA:MS:123&lt;/MessageRef&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;Action cls="U"&gt;Missing Refs&lt;/Action&gt;
*   &lt;Dataset&gt;
*     &lt;Serial cls="U"&gt;USA::AS:456&lt;/Serial&gt;
*     &lt;MissingRef cls="U"&gt;USA::TX:123&lt;/MissingRef&gt;
*   &lt;/Dataset&gt;
* &lt;/Administrative&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Administrative", propOrder = {
    "action",
    "messageRef",
    "dataset",
    "codeList"
})
public class Administrative
    extends Common
{

/**
Action - Action (Required) 

The action which triggered the transmission, or to be performed upon reception, of this dataset.

Format is L:CDR
@since 3.1.0
*/
    @XmlElement(name = "Action", required = true)
      private  TString action;
/**
MessageRef - Message Reference (Optional) 

The serial of the Message Dataset that is causing this response.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "MessageRef", required = false)
    private Serial messageRef;
/**
Dataset (Optional)

Dataset is used within an Administrative transaction to specify the identifier of the datasets on which the action must apply.
@since 3.1.0
*/
    @XmlElement(name = "Dataset")
      private  Set<Dataset> dataset;
/**
CodeList (Optional)

CodeList contains the actions necessary to create or delete a code entry in a given Code List.
@since 3.1.0
*/
    @XmlElement(name = "CodeList")
      private  Set<CodeList> codeList;

/**
Get the action which triggered the transmission, or to be performed upon reception, of this dataset.

@return the Action value in a {@link TString} data type
@since 3.1.0
*/
public TString getAction() {
        return action;
    }

/**
Set the action which triggered the transmission, or to be performed upon reception, of this dataset.

@param value the Action value in a {@link TString} data type
@since 3.1.0
*/
public void setAction(TString value) {
        this.action = value;
    }

/**
Determine if the Action is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAction() {
return (this.action!= null ? this.action.isSetValue() : false);
    }

/**
Get the serial of the Message Dataset that is causing this response.

@return the MessageRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getMessage()} instead.
*/
@Deprecated
public Serial getMessageRef() {
        return messageRef;
    }

/**
Set the serial of the Message Dataset that is causing this response.

@param value the MessageRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setMessage(Message)} instead.
*/
@Deprecated
public void setMessageRef(Serial value) {
        this.messageRef = value;
    }

/**
Determine if the MessageRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMessageRef() {
        return (this.messageRef!= null);
    }

/**
Get the Dataset

Complex element Dataset is used within an Administrative transaction to specify the identifier of the datasets on which the action must apply.

@return  a {@link Dataset} instance
@since 3.1.0
*/
    public Set<Dataset> getDataset() {
        if (dataset == null) {
            dataset = new HashSet<Dataset>();
        }
        return this.dataset;
    }

/**
Determine if the Dataset is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDataset() {
        return ((this.dataset!= null)&&(!this.dataset.isEmpty()));
    }

/**
  Clear the Dataset field. This sets the field to null.
 */
    public void unsetDataset() {
        this.dataset = null;
    }

/**
Get the CodeList

Complex element CodeList contains the actions necessary to create or delete a code entry in a given Code List.

@return  a {@link CodeList} instance
@since 3.1.0
*/
    public Set<CodeList> getCodeList() {
        if (codeList == null) {
            codeList = new HashSet<CodeList>();
        }
        return this.codeList;
    }

/**
Determine if the CodeList is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCodeList() {
        return ((this.codeList!= null)&&(!this.codeList.isEmpty()));
    }

/**
  Clear the CodeList field. This sets the field to null.
 */
    public void unsetCodeList() {
        this.codeList = null;
    }

/**
Set the action which triggered the transmission, or to be performed upon reception, of this dataset.

@param value  An instances of type {@link ListCDR}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withAction(ListCDR value) {
        setAction(new TString(value.value()));
        return this;
    }

/**
Set the serial of the Message Dataset that is causing this response.

@param value  An instances of type {@link Serial}
@return The current Administrative object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withMessage(Message)} instead.
*/
@Deprecated
    public Administrative withMessageRef(Serial value) {
           setMessageRef(value);
        return this;
    }

/**
Set the Dataset

Complex element Dataset is used within an Administrative transaction to specify the identifier of the datasets on which the action must apply.

@param values  One or more instances of type {@link Dataset...}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withDataset(Dataset... values) {
        if (values!= null) {
            for (Dataset value: values) {
                getDataset().add(value);
            }
        }
        return this;
    }

/**
Set the Dataset

Complex element Dataset is used within an Administrative transaction to specify the identifier of the datasets on which the action must apply.

@param values  A collection of {@link Dataset} instances
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withDataset(Collection<Dataset> values) {
        if (values!= null) {
            getDataset().addAll(values);
        }
        return this;
    }

/**
Set the CodeList

Complex element CodeList contains the actions necessary to create or delete a code entry in a given Code List.

@param values  One or more instances of type {@link CodeList...}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withCodeList(CodeList... values) {
        if (values!= null) {
            for (CodeList value: values) {
                getCodeList().add(value);
            }
        }
        return this;
    }

/**
Set the CodeList

Complex element CodeList contains the actions necessary to create or delete a code entry in a given Code List.

@param values  A collection of {@link CodeList} instances
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withCodeList(Collection<CodeList> values) {
        if (values!= null) {
            getCodeList().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withCaseNum(CaseNum... values) {
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
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withRemarks(Remarks... values) {
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
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withReleasability(ListCCY... values) {
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
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withRemarkRef(BigInteger... values) {
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
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withExtReferences(BigInteger... values) {
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
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current Administrative object instance
@since 3.1.0
*/
    public Administrative withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this Administrative instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Administrative {"
 + (action !=null? " action [" + action +"]" : "") 
 + (codeList !=null? " codeList [" + codeList +"]" : "") 
 + (dataset !=null? " dataset [" + dataset +"]" : "") 
 + (messageRef !=null? " messageRef [" + messageRef +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Administrative} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link TString Action}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetAction();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
MessageRef - Message Reference (Optional) 

The serial of the Message Dataset that is causing this response.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Message message;

/**
Get the serial of the Message Dataset that is causing this response.

@return  a {@link Message} instance
@since 3.1.0
*/
public Message getMessage(){
return message;
}
/**
 Determine if the message field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetMessage() {
    return this.message != null ;
}

/**
Set the serial of the Message Dataset that is causing this response.

@param value  An instances of type {@link Message}
@return The current Administrative object instance
@since 3.1.0
*/
public Administrative withMessage(Message value) {
this.message = value;
return this;
}

  /**
   * Update the SSRF data type references in this Administrative record.
   * <p>
 */
  @Override
public void prepare() {
super.prepare();
this.messageRef = message !=null? message.getSerial() : null;
}

/**
   * Update the SSRF data type references in this Administrative record after loading from XML.

   * This method builds the transient {@link #message} with values
   * from the imported {@link #messageRef} field. This method should
   * typically be called after the Administrative is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (messageRef==null || !messageRef.isSetValue() ) {return;}
for(Message instance : root.getMessage()) {
if(messageRef.equals(instance.getSerial())){
message = instance;
return;}
}}//</editor-fold>

}
