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
RFSystem describes the association of one or several Transmitters, Receivers and Antennas as they are assembled to form a system on a platform; it can also include the specific modes which are allowed or technically possible in this assembly.

Sub-Elements are {@link Configuration}, {@link Deployment}, {@link Nomenclature}, {@link POCInformation}, {@link RelatedSystem}, {@link StockNum}, {@link UsingCountries}

Example: <pre>
* &lt;RFSystem cls="U"&gt;
*   &lt;Serial cls="U"&gt;USA::TR:123&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;Deployment&gt;
*     &lt;Type cls="U"&gt;Land Mobile&lt;/Type&gt;
*   &lt;/Deployment&gt;
*   &lt;Configuration&gt;
*     &lt;ConfigID cls="U"&gt;CONFIG1&lt;/ConfigID&gt;
*     &lt;TxRef&gt;
*       &lt;Serial cls="U"&gt;USA::TX:1111&lt;/Serial&gt;
*       &lt;TxAntModeRef&gt;
*         &lt;Serial cls="U"&gt;USA::AN:2222&lt;/Serial&gt;
*       &lt;/TxAntModeRef&gt;
*     &lt;/TxRef&gt;
*     &lt;RxRef&gt;
*       &lt;Serial cls="U"&gt;USA::RX:3333&lt;/Serial&gt;
*     &lt;/RxRef&gt;
*   &lt;/Configuration&gt;
* &lt;/RFSystem&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFSystem", propOrder = {
    "fieldedStatus",
    "emergency",
    "initialCost",
    "pocInformation",
    "nomenclature",
    "deployment",
    "configuration",
    "relatedSystem",
    "stockNum",
    "usingCountries"
})
public class RFSystem
    extends Common
{

/**
FieldedStatus  - Fielded Status (Optional) 

The current stage of the RFSystem.

Format is L:CSG
@since 3.1.0
*/
    @XmlElement(name = "FieldedStatus", required = false)
    private TString fieldedStatus;
/**
Emergency  - Emergency Indicator (Optional) 

"Yes" if the system may be used in a case of emergency.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Emergency", required = false)
    private TString emergency;
/**
US:InitialCost - Initial Cost (Optional) 

The estimated initial cost, in US dollars, of the system/equipment.

Format is S70
@since 3.1.0
*/
    @XmlElement(name = "InitialCost", required = false)
    private S70 initialCost;
/**
POCInformation (Optional)

POCInformation contains a reference to a Contact, Organisation or Role dataset.
@since 3.1.0
*/
    @XmlElement(name = "POCInformation")
      private  Set<POCInformation> pocInformation;
/**
Nomenclature (Optional)

Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

Divergence from SMADEF: SMADEF requires (1..n) Nomenclatures
@since 3.1.0
*/
    @XmlElement(name = "Nomenclature")
      private  Set<Nomenclature> nomenclature;
/**
Deployment (Optional)

Deployment provides the general type of equipment deployment. For the detailed data, the appropriate force element and platforms elements should be referenced. Data element Deployment identifies the general category of how the equipment is deployed. For example an equipment may be deployed on an airborne platform, a ship or fixed land installation.
@since 3.1.0
*/
    @XmlElement(name = "Deployment")
      private  Set<Deployment> deployment;
/**
Configuration (Optional)

Configuration identifies each operational configuration that is required in a SSRequest, granted by a Host Nation in a SSReply, or authorised in a frequency Assignment or Allotment dataset. It also identifies the functional use of the assigned frequency at a particular transmitting station. Finally, it may indicate if the receiver station is used primarily as a repeater. A direct coupling between the station's receiver and the station's transmitter allows the incoming signal to be retransmitted exactly as received.
@since 3.1.0
*/
    @XmlElement(name = "Configuration")
      private  Set<Configuration> configuration;
/**
RelatedSystem (Optional)

RelatedSystem identifies a System linked to the current System, and the relation (parent, child, sibling).
@since 3.1.0
*/
    @XmlElement(name = "RelatedSystem")
      private  Set<RelatedSystem> relatedSystem;
/**
US:StockNum (Optional)

StockNum (US) provides the equipment stock number and indicates the type of stock number.
@since 3.1.0
*/
    @XmlElement(name = "StockNum")
      private  Set<StockNum> stockNum;
/**
US:UsingCountries (Optional)

UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the RFSystem.
@since 3.1.0
*/
    @XmlElement(name = "UsingCountries")
      private  Set<UsingCountries> usingCountries;

/**
Get the current stage of the RFSystem.

@return the FieldedStatus value in a {@link TString} data type
@since 3.1.0
*/
public TString getFieldedStatus() {
        return fieldedStatus;
    }

/**
Set the current stage of the RFSystem.

@param value the FieldedStatus value in a {@link TString} data type
@since 3.1.0
*/
public void setFieldedStatus(TString value) {
        this.fieldedStatus = value;
    }

/**
Determine if the FieldedStatus is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFieldedStatus() {
return (this.fieldedStatus!= null ? this.fieldedStatus.isSetValue() : false);
    }

/**
Get "Yes" if the system may be used in a case of emergency.

@return the Emergency value in a {@link TString} data type
@since 3.1.0
*/
public TString getEmergency() {
        return emergency;
    }

/**
Set "Yes" if the system may be used in a case of emergency.

@param value the Emergency value in a {@link TString} data type
@since 3.1.0
*/
public void setEmergency(TString value) {
        this.emergency = value;
    }

/**
Determine if the Emergency is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEmergency() {
return (this.emergency!= null ? this.emergency.isSetValue() : false);
    }

/**
Get the estimated initial cost, in US dollars, of the system/equipment.

@return the InitialCost value in a {@link TS70} data type
@since 3.1.0
*/
public S70 getInitialCost() {
        return initialCost;
    }

/**
Set the estimated initial cost, in US dollars, of the system/equipment.

@param value the InitialCost value in a {@link TS70} data type
@since 3.1.0
*/
public void setInitialCost(S70 value) {
        this.initialCost = value;
    }

/**
Determine if the InitialCost is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetInitialCost() {
        return (this.initialCost!= null);
    }

/**
Get the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@return  a {@link POCInformation} instance
@since 3.1.0
*/
    public Set<POCInformation> getPOCInformation() {
        if (pocInformation == null) {
            pocInformation = new HashSet<POCInformation>();
        }
        return this.pocInformation;
    }

/**
Determine if the POCInformation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPOCInformation() {
        return ((this.pocInformation!= null)&&(!this.pocInformation.isEmpty()));
    }

/**
  Clear the POCInformation field. This sets the field to null.
 */
    public void unsetPOCInformation() {
        this.pocInformation = null;
    }

/**
Get the Nomenclature

Complex element Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

@return  a {@link Nomenclature} instance
@since 3.1.0
*/
    public Set<Nomenclature> getNomenclature() {
        if (nomenclature == null) {
            nomenclature = new HashSet<Nomenclature>();
        }
        return this.nomenclature;
    }

/**
Determine if the Nomenclature is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNomenclature() {
        return ((this.nomenclature!= null)&&(!this.nomenclature.isEmpty()));
    }

/**
  Clear the Nomenclature field. This sets the field to null.
 */
    public void unsetNomenclature() {
        this.nomenclature = null;
    }

/**
Get the Deployment

Complex element Deployment provides the general type of equipment deployment. For the detailed data, the appropriate force element and platforms elements should be referenced. Data element Deployment identifies the general category of how the equipment is deployed. For example an equipment may be deployed on an airborne platform, a ship or fixed land installation.

@return  a {@link Deployment} instance
@since 3.1.0
*/
    public Set<Deployment> getDeployment() {
        if (deployment == null) {
            deployment = new HashSet<Deployment>();
        }
        return this.deployment;
    }

/**
Determine if the Deployment is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDeployment() {
        return ((this.deployment!= null)&&(!this.deployment.isEmpty()));
    }

/**
  Clear the Deployment field. This sets the field to null.
 */
    public void unsetDeployment() {
        this.deployment = null;
    }

/**
Get the Configuration

Complex element Configuration identifies each operational configuration that is required in a SSRequest, granted by a Host Nation in a SSReply, or authorised in a frequency Assignment or Allotment dataset. It also identifies the functional use of the assigned frequency at a particular transmitting station. Finally, it may indicate if the receiver station is used primarily as a repeater. A direct coupling between the station's receiver and the station's transmitter allows the incoming signal to be retransmitted exactly as received.

@return  a {@link Configuration} instance
@since 3.1.0
*/
    public Set<Configuration> getConfiguration() {
        if (configuration == null) {
            configuration = new HashSet<Configuration>();
        }
        return this.configuration;
    }

/**
Determine if the Configuration is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetConfiguration() {
        return ((this.configuration!= null)&&(!this.configuration.isEmpty()));
    }

/**
  Clear the Configuration field. This sets the field to null.
 */
    public void unsetConfiguration() {
        this.configuration = null;
    }

/**
Get the RelatedSystem

Complex element RelatedSystem identifies a System linked to the current System, and the relation (parent, child, sibling).

@return  a {@link RelatedSystem} instance
@since 3.1.0
*/
    public Set<RelatedSystem> getRelatedSystem() {
        if (relatedSystem == null) {
            relatedSystem = new HashSet<RelatedSystem>();
        }
        return this.relatedSystem;
    }

/**
Determine if the RelatedSystem is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRelatedSystem() {
        return ((this.relatedSystem!= null)&&(!this.relatedSystem.isEmpty()));
    }

/**
  Clear the RelatedSystem field. This sets the field to null.
 */
    public void unsetRelatedSystem() {
        this.relatedSystem = null;
    }

/**
Get the US:StockNum

Complex element StockNum (US) provides the equipment stock number and indicates the type of stock number.

@return  a {@link StockNum} instance
@since 3.1.0
*/
    public Set<StockNum> getStockNum() {
        if (stockNum == null) {
            stockNum = new HashSet<StockNum>();
        }
        return this.stockNum;
    }

/**
Determine if the StockNum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStockNum() {
        return ((this.stockNum!= null)&&(!this.stockNum.isEmpty()));
    }

/**
  Clear the StockNum field. This sets the field to null.
 */
    public void unsetStockNum() {
        this.stockNum = null;
    }

/**
Get the US:UsingCountries

Complex element UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the RFSystem.

@return  a {@link UsingCountries} instance
@since 3.1.0
*/
    public Set<UsingCountries> getUsingCountries() {
        if (usingCountries == null) {
            usingCountries = new HashSet<UsingCountries>();
        }
        return this.usingCountries;
    }

/**
Determine if the UsingCountries is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetUsingCountries() {
        return ((this.usingCountries!= null)&&(!this.usingCountries.isEmpty()));
    }

/**
  Clear the UsingCountries field. This sets the field to null.
 */
    public void unsetUsingCountries() {
        this.usingCountries = null;
    }

/**
Set the current stage of the RFSystem.

@param value  An instances of type {@link ListCSG}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withFieldedStatus(ListCSG value) {
           setFieldedStatus(new TString(value.value()));
        return this;
    }

/**
Set "Yes" if the system may be used in a case of emergency.

@param value  An instances of type {@link ListCBO}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withEmergency(ListCBO value) {
           setEmergency(new TString(value.value()));
        return this;
    }

/**
Set the estimated initial cost, in US dollars, of the system/equipment.

@param value  An instances of type {@link String}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withInitialCost(String value) {
           setInitialCost(new S70(value));
        return this;
    }

/**
Set the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@param values  One or more instances of type {@link POCInformation...}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withPOCInformation(POCInformation... values) {
        if (values!= null) {
            for (POCInformation value: values) {
                getPOCInformation().add(value);
            }
        }
        return this;
    }

/**
Set the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@param values  A collection of {@link POCInformation} instances
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withPOCInformation(Collection<POCInformation> values) {
        if (values!= null) {
            getPOCInformation().addAll(values);
        }
        return this;
    }

/**
Set the Nomenclature

Complex element Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

@param values  One or more instances of type {@link Nomenclature...}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withNomenclature(Nomenclature... values) {
        if (values!= null) {
            for (Nomenclature value: values) {
                getNomenclature().add(value);
            }
        }
        return this;
    }

/**
Set the Nomenclature

Complex element Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

@param values  A collection of {@link Nomenclature} instances
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withNomenclature(Collection<Nomenclature> values) {
        if (values!= null) {
            getNomenclature().addAll(values);
        }
        return this;
    }

/**
Set the Deployment

Complex element Deployment provides the general type of equipment deployment. For the detailed data, the appropriate force element and platforms elements should be referenced. Data element Deployment identifies the general category of how the equipment is deployed. For example an equipment may be deployed on an airborne platform, a ship or fixed land installation.

@param values  One or more instances of type {@link Deployment...}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withDeployment(Deployment... values) {
        if (values!= null) {
            for (Deployment value: values) {
                getDeployment().add(value);
            }
        }
        return this;
    }

/**
Set the Deployment

Complex element Deployment provides the general type of equipment deployment. For the detailed data, the appropriate force element and platforms elements should be referenced. Data element Deployment identifies the general category of how the equipment is deployed. For example an equipment may be deployed on an airborne platform, a ship or fixed land installation.

@param values  A collection of {@link Deployment} instances
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withDeployment(Collection<Deployment> values) {
        if (values!= null) {
            getDeployment().addAll(values);
        }
        return this;
    }

/**
Set the Configuration

Complex element Configuration identifies each operational configuration that is required in a SSRequest, granted by a Host Nation in a SSReply, or authorised in a frequency Assignment or Allotment dataset. It also identifies the functional use of the assigned frequency at a particular transmitting station. Finally, it may indicate if the receiver station is used primarily as a repeater. A direct coupling between the station's receiver and the station's transmitter allows the incoming signal to be retransmitted exactly as received.

@param values  One or more instances of type {@link Configuration...}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withConfiguration(Configuration... values) {
        if (values!= null) {
            for (Configuration value: values) {
                getConfiguration().add(value);
            }
        }
        return this;
    }

/**
Set the Configuration

Complex element Configuration identifies each operational configuration that is required in a SSRequest, granted by a Host Nation in a SSReply, or authorised in a frequency Assignment or Allotment dataset. It also identifies the functional use of the assigned frequency at a particular transmitting station. Finally, it may indicate if the receiver station is used primarily as a repeater. A direct coupling between the station's receiver and the station's transmitter allows the incoming signal to be retransmitted exactly as received.

@param values  A collection of {@link Configuration} instances
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withConfiguration(Collection<Configuration> values) {
        if (values!= null) {
            getConfiguration().addAll(values);
        }
        return this;
    }

/**
Set the RelatedSystem

Complex element RelatedSystem identifies a System linked to the current System, and the relation (parent, child, sibling).

@param values  One or more instances of type {@link RelatedSystem...}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withRelatedSystem(RelatedSystem... values) {
        if (values!= null) {
            for (RelatedSystem value: values) {
                getRelatedSystem().add(value);
            }
        }
        return this;
    }

/**
Set the RelatedSystem

Complex element RelatedSystem identifies a System linked to the current System, and the relation (parent, child, sibling).

@param values  A collection of {@link RelatedSystem} instances
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withRelatedSystem(Collection<RelatedSystem> values) {
        if (values!= null) {
            getRelatedSystem().addAll(values);
        }
        return this;
    }

/**
Set the US:StockNum

Complex element StockNum (US) provides the equipment stock number and indicates the type of stock number.

@param values  One or more instances of type {@link StockNum...}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withStockNum(StockNum... values) {
        if (values!= null) {
            for (StockNum value: values) {
                getStockNum().add(value);
            }
        }
        return this;
    }

/**
Set the US:StockNum

Complex element StockNum (US) provides the equipment stock number and indicates the type of stock number.

@param values  A collection of {@link StockNum} instances
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withStockNum(Collection<StockNum> values) {
        if (values!= null) {
            getStockNum().addAll(values);
        }
        return this;
    }

/**
Set the US:UsingCountries

Complex element UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the RFSystem.

@param values  One or more instances of type {@link UsingCountries...}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withUsingCountries(UsingCountries... values) {
        if (values!= null) {
            for (UsingCountries value: values) {
                getUsingCountries().add(value);
            }
        }
        return this;
    }

/**
Set the US:UsingCountries

Complex element UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the RFSystem.

@param values  A collection of {@link UsingCountries} instances
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withUsingCountries(Collection<UsingCountries> values) {
        if (values!= null) {
            getUsingCountries().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withCaseNum(CaseNum... values) {
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
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withRemarks(Remarks... values) {
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
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withReleasability(ListCCY... values) {
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
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withRemarkRef(BigInteger... values) {
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
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withExtReferences(BigInteger... values) {
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
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current RFSystem object instance
@since 3.1.0
*/
    public RFSystem withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this RFSystem instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "RFSystem {"
 + (configuration !=null? " configuration [" + configuration +"]" : "") 
 + (deployment !=null? " deployment [" + deployment +"]" : "") 
 + (emergency !=null? " emergency [" + emergency +"]" : "") 
 + (fieldedStatus !=null? " fieldedStatus [" + fieldedStatus +"]" : "") 
 + (initialCost !=null? " initialCost [" + initialCost +"]" : "") 
 + (nomenclature !=null? " nomenclature [" + nomenclature +"]" : "") 
 + (pocInformation !=null? " pocInformation [" + pocInformation +"]" : "") 
 + (relatedSystem !=null? " relatedSystem [" + relatedSystem +"]" : "") 
 + (stockNum !=null? " stockNum [" + stockNum +"]" : "") 
 + (usingCountries !=null? " usingCountries [" + usingCountries +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link RFSystem} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return true;
}

}
