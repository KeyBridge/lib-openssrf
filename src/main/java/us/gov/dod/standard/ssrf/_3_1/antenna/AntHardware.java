package us.gov.dod.standard.ssrf._3_1.antenna;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
AntHardware contains the physical parameters related to the antenna feed and lead.

Element of {@link Antenna}

Example: <pre>
* &lt;Ant Hardware&gt;
*   &lt;ConnectorType  cls="U"&gt;Neill-Concelman Threaded&lt;/ConnectorType &gt;
*   &lt;FeedOrientation  cls="U"&gt;down-right&lt;/FeedOrientation &gt;
*   &lt;FeedType  cls="U"&gt;Eight Feed Horn Cluster&lt;/FeedType &gt;
*   &lt;LeadType  cls="U"&gt;Waveguide Semirigid&lt;/LeadType &gt;
* &lt;/Ant Hardware&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntHardware", propOrder = {
    "feedType",
    "leadType",
    "connectorType",
    "feedOrientation"
})
public class AntHardware {

/**
FeedType  - Antenna Feed Type (Optional) 

The element used to "illuminate" the reflector for an antenna unit.

Format is L:CAF
@since 3.1.0
*/
    @XmlElement(name = "FeedType", required = false)
    private TString feedType;
/**
LeadType  - Antenna Lead Type (Optional) 

The type of device used for conducting or guiding the radio-frequency energy from the transmitter or receiver to the antenna (e.g., continuous waveguide).

Format is L:CAL
@since 3.1.0
*/
    @XmlElement(name = "LeadType", required = false)
    private TString leadType;
/**
ConnectorType  - Antenna Connector Type (Optional) 

The type of connector used to attach the antenna to the equipment or the antenna to the transmission media that attaches the equipment to the antenna.

Format is L:CCN
@since 3.1.0
*/
    @XmlElement(name = "ConnectorType", required = false)
    private TString connectorType;
/**
FeedOrientation  - Antenna Feed Orientation (Optional) 

The orientation of the feed when looking in the direction of the boresight. Examples of orientations are right, left, center, up, down, up-left, up-right, down-left, down-right.

Format is S10
@since 3.1.0
*/
    @XmlElement(name = "FeedOrientation", required = false)
    private S10 feedOrientation;

/**
Get the element used to "illuminate" the reflector for an antenna unit.

@return the FeedType value in a {@link TString} data type
@since 3.1.0
*/
public TString getFeedType() {
        return feedType;
    }

/**
Set the element used to "illuminate" the reflector for an antenna unit.

@param value the FeedType value in a {@link TString} data type
@since 3.1.0
*/
public void setFeedType(TString value) {
        this.feedType = value;
    }

/**
Determine if the FeedType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFeedType() {
return (this.feedType!= null ? this.feedType.isSetValue() : false);
    }

/**
Get the type of device used for conducting or guiding the radio-frequency energy from the transmitter or receiver to the antenna (e.g., continuous waveguide).

@return the LeadType value in a {@link TString} data type
@since 3.1.0
*/
public TString getLeadType() {
        return leadType;
    }

/**
Set the type of device used for conducting or guiding the radio-frequency energy from the transmitter or receiver to the antenna (e.g., continuous waveguide).

@param value the LeadType value in a {@link TString} data type
@since 3.1.0
*/
public void setLeadType(TString value) {
        this.leadType = value;
    }

/**
Determine if the LeadType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLeadType() {
return (this.leadType!= null ? this.leadType.isSetValue() : false);
    }

/**
Get the type of connector used to attach the antenna to the equipment or the antenna to the transmission media that attaches the equipment to the antenna.

@return the ConnectorType value in a {@link TString} data type
@since 3.1.0
*/
public TString getConnectorType() {
        return connectorType;
    }

/**
Set the type of connector used to attach the antenna to the equipment or the antenna to the transmission media that attaches the equipment to the antenna.

@param value the ConnectorType value in a {@link TString} data type
@since 3.1.0
*/
public void setConnectorType(TString value) {
        this.connectorType = value;
    }

/**
Determine if the ConnectorType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetConnectorType() {
return (this.connectorType!= null ? this.connectorType.isSetValue() : false);
    }

/**
Get the orientation of the feed when looking in the direction of the boresight. Examples of orientations are right, left, center, up, down, up-left, up-right, down-left, down-right.

@return the FeedOrientation value in a {@link TS10} data type
@since 3.1.0
*/
public S10 getFeedOrientation() {
        return feedOrientation;
    }

/**
Set the orientation of the feed when looking in the direction of the boresight. Examples of orientations are right, left, center, up, down, up-left, up-right, down-left, down-right.

@param value the FeedOrientation value in a {@link TS10} data type
@since 3.1.0
*/
public void setFeedOrientation(S10 value) {
        this.feedOrientation = value;
    }

/**
Determine if the FeedOrientation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFeedOrientation() {
        return (this.feedOrientation!= null);
    }

/**
Set the element used to "illuminate" the reflector for an antenna unit.

@param value  An instances of type {@link ListCAF}
@return The current AntHardware object instance
@since 3.1.0
*/
    public AntHardware withFeedType(ListCAF value) {
           setFeedType(new TString(value.value()));
        return this;
    }

/**
Set the type of device used for conducting or guiding the radio-frequency energy from the transmitter or receiver to the antenna (e.g., continuous waveguide).

@param value  An instances of type {@link ListCAL}
@return The current AntHardware object instance
@since 3.1.0
*/
    public AntHardware withLeadType(ListCAL value) {
           setLeadType(new TString(value.value()));
        return this;
    }

/**
Set the type of connector used to attach the antenna to the equipment or the antenna to the transmission media that attaches the equipment to the antenna.

@param value  An instances of type {@link ListCCN}
@return The current AntHardware object instance
@since 3.1.0
*/
    public AntHardware withConnectorType(ListCCN value) {
           setConnectorType(new TString(value.value()));
        return this;
    }

/**
Set the orientation of the feed when looking in the direction of the boresight. Examples of orientations are right, left, center, up, down, up-left, up-right, down-left, down-right.

@param value  An instances of type {@link String}
@return The current AntHardware object instance
@since 3.1.0
*/
    public AntHardware withFeedOrientation(String value) {
           setFeedOrientation(new S10(value));
        return this;
    }

/**
 Get a string representation of this AntHardware instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "AntHardware {"
 + (connectorType !=null? " connectorType [" + connectorType +"]" : "") 
 + (feedOrientation !=null? " feedOrientation [" + feedOrientation +"]" : "") 
 + (feedType !=null? " feedType [" + feedType +"]" : "") 
 + (leadType !=null? " leadType [" + leadType +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link AntHardware} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
