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
import javax.xml.bind.annotation.XmlType;

/**
ChannelPlan describes the plan for the channel set.

Sub-Element is {@link Channel}

Example: <pre>
* &lt;ChannelPlan&gt;
*   &lt;Channel&gt;
*     &lt;Name cls="U"&gt;Channel Plan One&lt;/Name&gt;
*     &lt;User  cls="U"&gt;Channel Master&lt;/User &gt;
*     &lt;ChannelFreq cls="U"&gt;200&lt;/ChannelFreq&gt;
*   &lt;/Channel&gt;
*   &lt;Channel&gt;
*     &lt;Name cls="U"&gt;Channel Plan Seven&lt;/Name&gt;
*     &lt;User  cls="U"&gt;Channel Meister&lt;/User &gt;
*     &lt;ChannelFreq cls="U"&gt;400&lt;/ChannelFreq&gt;
*   &lt;/Channel&gt;
* &lt;/ChannelPlan&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelPlan", propOrder = {
    "name",
    "channel"
})
public class ChannelPlan
    extends Common
{

/**
Name - Channel Plan Name (Required) 

The name of this channel plan (e.g., "Plan for Wireless Microphones in the Band 162-174 MHz").

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Name", required = true)
      private  S100 name;
/**
ChannelPlanRef - Element Content (Required) 

The serial of the referenced ChannelPlan.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "Channel", required = true)
      private  Set<Channel> channel;

/**
Get the name of this channel plan (e.g., "Plan for Wireless Microphones in the Band 162-174 MHz").

@return the Name value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getName() {
        return name;
    }

/**
Set the name of this channel plan (e.g., "Plan for Wireless Microphones in the Band 162-174 MHz").

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
Get the serial of the referenced ChannelPlan.

@return  a {@link Channel} instance
@since 3.1.0
*/
    public Set<Channel> getChannel() {
        if (channel == null) {
            channel = new HashSet<Channel>();
        }
        return this.channel;
    }

/**
Determine if the Channel is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetChannel() {
        return ((this.channel!= null)&&(!this.channel.isEmpty()));
    }

/**
  Clear the Channel field. This sets the field to null.
 */
    public void unsetChannel() {
        this.channel = null;
    }

/**
Set the name of this channel plan (e.g., "Plan for Wireless Microphones in the Band 162-174 MHz").

@param value  An instances of type {@link TS100}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withName(TS100 value) {
        return this;
    }

/**
Set the serial of the referenced ChannelPlan.

@param values  One or more instances of type {@link Channel...}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withChannel(Channel... values) {
        if (values!= null) {
            for (Channel value: values) {
                getChannel().add(value);
            }
        }
        return this;
    }

/**
Set the serial of the referenced ChannelPlan.

@param values  A collection of {@link Channel} instances
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withChannel(Collection<Channel> values) {
        if (values!= null) {
            getChannel().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withCaseNum(CaseNum... values) {
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
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withRemarks(Remarks... values) {
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
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withReleasability(ListCCY... values) {
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
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withRemarkRef(BigInteger... values) {
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
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withExtReferences(BigInteger... values) {
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
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current ChannelPlan object instance
@since 3.1.0
*/
    public ChannelPlan withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this ChannelPlan instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ChannelPlan {"
 + (channel !=null? " channel [" + channel +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ChannelPlan} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link Set<Channel> Channel}, {@link S100 Name}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetChannel() &&  isSetName();
}

}
