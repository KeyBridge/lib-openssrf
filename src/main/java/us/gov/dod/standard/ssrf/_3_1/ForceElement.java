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
ForceElement is used to describe any Unit or Platform that has the ability to transmit or receive RF signals.

Sub-Elements are {@link Assets}, {@link Nomenclature}, {@link POCInformation}, {@link StockNum}

Example: <pre>
* &lt;ForceElement&gt;
*   &lt;Serial cls="U"&gt;USA:NA:FE:123&lt;/Serial&gt;
*   &lt;Type cls="U"&gt;PLatform&lt;/Type&gt;
*   &lt;OwningCountry cls="U"&gt;USA&lt;/OwningCountry&gt;
*   &lt;Identifier&gt;
*     &lt;Level cls="U"&gt;Primary&lt;/Level&gt;
*     &lt;Name cls="U"&gt;USS Nimitz&lt;/Name&gt;
*   &lt;/Identifier&gt;
*   &lt;Assets_etc/&gt;
*   &lt;/ForceElement&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForceElement", propOrder = {
    "reviewDate",
    "type",
    "uic",
    "owningCountry",
    "owningOrganisation",
    "role",
    "platform",
    "missionCode",
    "cmdLevel",
    "pocInformation",
    "assets",
    "nomenclature",
    "stockNum"
})
public class ForceElement
    extends Common
{

/**
ReviewDate  - Review Date (Optional) 

The date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "ReviewDate", required = false)
    private D reviewDate;
/**
Type  - Type (Required) 

If the Force Element is a Unit or a Platform.

Format is L:CFE
@since 3.1.0
*/
    @XmlElement(name = "Type", required = true)
      private  TString type;
/**
UIC  - Unit Identification Code (Optional) 

An organisational identifier that may be used to uniquely identify an organisation in operational planning systems and other non-spectrum information systems.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "UIC", required = false)
    private S20 uic;
/**
OwningCountry  - Owning Country/Body (Optional) 

The owning country or body of the ForceElement.

Format is L:CAO
@since 3.1.0
*/
    @XmlElement(name = "OwningCountry", required = false)
    private TString owningCountry;
/**
OwningOrganisation  - Owning Organisation (Optional) 

A reference to the organisation that owns the ForceElement.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "OwningOrganisation", required = false)
    private Serial owningOrganisation;
/**
Role  - Role (Optional) 

The code used to document the main role of the Force Element. This role may be used to derive what equipment (i.e., weapons systems, signal, platforms, etc.) the Force Element is authorised. Also referred to as the Table of Organisation and Equipment (TOE).

Format is L:CSR
@since 3.1.0
*/
    @XmlElement(name = "Role", required = false)
    private TString role;
/**
Platform  - Platform Type (Optional) 

The type of platform.

Format is L:CET
@since 3.1.0
*/
    @XmlElement(name = "Platform", required = false)
    private TString platform;
/**
MissionCode  - Mission Code (Optional) 

The mission code representing the primary mission of the Force Element (e.g.,Training, Finance, etc).

Format is L:CMC
@since 3.1.0
*/
    @XmlElement(name = "MissionCode", required = false)
    private TString missionCode;
/**
CmdLevel  - Command Level (Optional) 

The organisational level of the force element according to stratum, echelon or point at which authority or control is maintained.

Format is L:CLC
@since 3.1.0
*/
    @XmlElement(name = "CmdLevel", required = false)
    private TString cmdLevel;
/**
POCInformation (Optional)

POCInformation contains a reference to a Contact, Organisation or Role dataset.
@since 3.1.0
*/
    @XmlElement(name = "POCInformation")
      private  Set<POCInformation> pocInformation;
/**
Assets (Optional)

Assets indicates the authorised and available quantity of the equipment, RF systems, or other Force Elements used or owned by the Force Element.
@since 3.1.0
*/
    @XmlElement(name = "Assets")
      private  Set<Assets> assets;
/**
Nomenclature (Required)

Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

Divergence from SMADEF: SMADEF requires (1..n) Nomenclatures
@since 3.1.0
*/
    @XmlElement(name = "Nomenclature", required = true)
      private  Set<Nomenclature> nomenclature;
/**
US:StockNum (Optional)

StockNum (US) provides the equipment stock number and indicates the type of stock number.
@since 3.1.0
*/
    @XmlElement(name = "StockNum")
      private  Set<StockNum> stockNum;

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
Get if the Force Element is a Unit or a Platform.

@return the Type value in a {@link TString} data type
@since 3.1.0
*/
public TString getType() {
        return type;
    }

/**
Set if the Force Element is a Unit or a Platform.

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
Get an organisational identifier that may be used to uniquely identify an organisation in operational planning systems and other non-spectrum information systems.

@return the UIC value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getUIC() {
        return uic;
    }

/**
Set an organisational identifier that may be used to uniquely identify an organisation in operational planning systems and other non-spectrum information systems.

@param value the UIC value in a {@link TS20} data type
@since 3.1.0
*/
public void setUIC(S20 value) {
        this.uic = value;
    }

/**
Determine if the UIC is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetUIC() {
        return (this.uic!= null);
    }

/**
Get the owning country or body of the ForceElement.

@return the OwningCountry value in a {@link TString} data type
@since 3.1.0
*/
public TString getOwningCountry() {
        return owningCountry;
    }

/**
Set the owning country or body of the ForceElement.

@param value the OwningCountry value in a {@link TString} data type
@since 3.1.0
*/
public void setOwningCountry(TString value) {
        this.owningCountry = value;
    }

/**
Determine if the OwningCountry is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOwningCountry() {
return (this.owningCountry!= null ? this.owningCountry.isSetValue() : false);
    }

/**
Get a reference to the organisation that owns the ForceElement.

@return the OwningOrganisation value in a {@link Serial} data type
@since 3.1.0
*/
public Serial getOwningOrganisation() {
        return owningOrganisation;
    }

/**
Set a reference to the organisation that owns the ForceElement.

@param value the OwningOrganisation value in a {@link Serial} data type
@since 3.1.0
*/
public void setOwningOrganisation(Serial value) {
        this.owningOrganisation = value;
    }

/**
Determine if the OwningOrganisation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOwningOrganisation() {
        return (this.owningOrganisation!= null);
    }

/**
Get the code used to document the main role of the Force Element. This role may be used to derive what equipment (i.e., weapons systems, signal, platforms, etc.) the Force Element is authorised. Also referred to as the Table of Organisation and Equipment (TOE).

@return the Role value in a {@link TString} data type
@since 3.1.0
*/
public TString getRole() {
        return role;
    }

/**
Set the code used to document the main role of the Force Element. This role may be used to derive what equipment (i.e., weapons systems, signal, platforms, etc.) the Force Element is authorised. Also referred to as the Table of Organisation and Equipment (TOE).

@param value the Role value in a {@link TString} data type
@since 3.1.0
*/
public void setRole(TString value) {
        this.role = value;
    }

/**
Determine if the Role is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRole() {
return (this.role!= null ? this.role.isSetValue() : false);
    }

/**
Get the type of platform.

@return the Platform value in a {@link TString} data type
@since 3.1.0
*/
public TString getPlatform() {
        return platform;
    }

/**
Set the type of platform.

@param value the Platform value in a {@link TString} data type
@since 3.1.0
*/
public void setPlatform(TString value) {
        this.platform = value;
    }

/**
Determine if the Platform is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPlatform() {
return (this.platform!= null ? this.platform.isSetValue() : false);
    }

/**
Get the mission code representing the primary mission of the Force Element (e.g.,Training, Finance, etc).

@return the MissionCode value in a {@link TString} data type
@since 3.1.0
*/
public TString getMissionCode() {
        return missionCode;
    }

/**
Set the mission code representing the primary mission of the Force Element (e.g.,Training, Finance, etc).

@param value the MissionCode value in a {@link TString} data type
@since 3.1.0
*/
public void setMissionCode(TString value) {
        this.missionCode = value;
    }

/**
Determine if the MissionCode is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMissionCode() {
return (this.missionCode!= null ? this.missionCode.isSetValue() : false);
    }

/**
Get the organisational level of the force element according to stratum, echelon or point at which authority or control is maintained.

@return the CmdLevel value in a {@link TString} data type
@since 3.1.0
*/
public TString getCmdLevel() {
        return cmdLevel;
    }

/**
Set the organisational level of the force element according to stratum, echelon or point at which authority or control is maintained.

@param value the CmdLevel value in a {@link TString} data type
@since 3.1.0
*/
public void setCmdLevel(TString value) {
        this.cmdLevel = value;
    }

/**
Determine if the CmdLevel is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCmdLevel() {
return (this.cmdLevel!= null ? this.cmdLevel.isSetValue() : false);
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
Get the Assets

Complex element Assets indicates the authorised and available quantity of the equipment, RF systems, or other Force Elements used or owned by the Force Element.

@return  a {@link Assets} instance
@since 3.1.0
*/
    public Set<Assets> getAssets() {
        if (assets == null) {
            assets = new HashSet<Assets>();
        }
        return this.assets;
    }

/**
Determine if the Assets is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAssets() {
        return ((this.assets!= null)&&(!this.assets.isEmpty()));
    }

/**
  Clear the Assets field. This sets the field to null.
 */
    public void unsetAssets() {
        this.assets = null;
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
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Calendar}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withReviewDate(Calendar value) {
           setReviewDate(new D(value));
        return this;
    }
/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Date}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withReviewDate(Date value) {
           setReviewDate(new D(value));
        return this;
    }

/**
Set if the Force Element is a Unit or a Platform.

@param value  An instances of type {@link ListCFE}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withType(ListCFE value) {
        setType(new TString(value.value()));
        return this;
    }

/**
Set an organisational identifier that may be used to uniquely identify an organisation in operational planning systems and other non-spectrum information systems.

@param value  An instances of type {@link String}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withUIC(String value) {
           setUIC(new S20(value));
        return this;
    }

/**
Set the owning country or body of the ForceElement.

@param value  An instances of type {@link ListCAO}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withOwningCountry(ListCAO value) {
           setOwningCountry(new TString(value.value()));
        return this;
    }

/**
Set a reference to the organisation that owns the ForceElement.

@param value  An instances of type {@link Serial}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withOwningOrganisation(Serial value) {
           setOwningOrganisation(value);
        return this;
    }

/**
Set the code used to document the main role of the Force Element. This role may be used to derive what equipment (i.e., weapons systems, signal, platforms, etc.) the Force Element is authorised. Also referred to as the Table of Organisation and Equipment (TOE).

@param value  An instances of type {@link ListCSR}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withRole(ListCSR value) {
           setRole(new TString(value.value()));
        return this;
    }

/**
Set the type of platform.

@param value  An instances of type {@link ListCET}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withPlatform(ListCET value) {
           setPlatform(new TString(value.value()));
        return this;
    }

/**
Set the mission code representing the primary mission of the Force Element (e.g.,Training, Finance, etc).

@param value  An instances of type {@link ListCMC}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withMissionCode(ListCMC value) {
           setMissionCode(new TString(value.value()));
        return this;
    }

/**
Set the organisational level of the force element according to stratum, echelon or point at which authority or control is maintained.

@param value  An instances of type {@link ListCLC}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withCmdLevel(ListCLC value) {
           setCmdLevel(new TString(value.value()));
        return this;
    }

/**
Set the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@param values  One or more instances of type {@link POCInformation...}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withPOCInformation(POCInformation... values) {
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
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withPOCInformation(Collection<POCInformation> values) {
        if (values!= null) {
            getPOCInformation().addAll(values);
        }
        return this;
    }

/**
Set the Assets

Complex element Assets indicates the authorised and available quantity of the equipment, RF systems, or other Force Elements used or owned by the Force Element.

@param values  One or more instances of type {@link Assets...}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withAssets(Assets... values) {
        if (values!= null) {
            for (Assets value: values) {
                getAssets().add(value);
            }
        }
        return this;
    }

/**
Set the Assets

Complex element Assets indicates the authorised and available quantity of the equipment, RF systems, or other Force Elements used or owned by the Force Element.

@param values  A collection of {@link Assets} instances
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withAssets(Collection<Assets> values) {
        if (values!= null) {
            getAssets().addAll(values);
        }
        return this;
    }

/**
Set the Nomenclature

Complex element Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

@param values  One or more instances of type {@link Nomenclature...}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withNomenclature(Nomenclature... values) {
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
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withNomenclature(Collection<Nomenclature> values) {
        if (values!= null) {
            getNomenclature().addAll(values);
        }
        return this;
    }

/**
Set the US:StockNum

Complex element StockNum (US) provides the equipment stock number and indicates the type of stock number.

@param values  One or more instances of type {@link StockNum...}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withStockNum(StockNum... values) {
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
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withStockNum(Collection<StockNum> values) {
        if (values!= null) {
            getStockNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withCaseNum(CaseNum... values) {
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
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withRemarks(Remarks... values) {
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
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withReleasability(ListCCY... values) {
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
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withRemarkRef(BigInteger... values) {
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
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withExtReferences(BigInteger... values) {
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
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current ForceElement object instance
@since 3.1.0
*/
    public ForceElement withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this ForceElement instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ForceElement {"
 + (assets !=null? " assets [" + assets +"]" : "") 
 + (cmdLevel !=null? " cmdLevel [" + cmdLevel +"]" : "") 
 + (missionCode !=null? " missionCode [" + missionCode +"]" : "") 
 + (nomenclature !=null? " nomenclature [" + nomenclature +"]" : "") 
 + (owningCountry !=null? " owningCountry [" + owningCountry +"]" : "") 
 + (owningOrganisation !=null? " owningOrganisation [" + owningOrganisation +"]" : "") 
 + (platform !=null? " platform [" + platform +"]" : "") 
 + (pocInformation !=null? " pocInformation [" + pocInformation +"]" : "") 
 + (reviewDate !=null? " reviewDate [" + reviewDate +"]" : "") 
 + (role !=null? " role [" + role +"]" : "") 
 + (stockNum !=null? " stockNum [" + stockNum +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") 
 + (uic !=null? " uic [" + uic +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ForceElement} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link Set<Nomenclature> Nomenclature}, {@link TString Type}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetNomenclature() &&  isSetType();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">

@XmlTransient
private Organisation owningOrganisation;

/**
Get 

@return  a {@link Organisation} instance
@since 3.1.0
*/
public Organisation getOwningOrganisation(){
return owningOrganisation;
}
/**
 Determine if the owningOrganisation field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetOwningOrganisation() {
    return this.owningOrganisation != null ;
}

/**
Set 

@param value  An instances of type {@link Organisation}
@return The current ForceElement object instance
@since 3.1.0
*/
public ForceElement withOwningOrganisation(Organisation value) {
this.owningOrganisation = value;
return this;
}

  /**
   * Update the SSRF data type references in this ForceElement record.
   * <p>
 */
  @Override
public void prepare() {
super.prepare();
this.owningOrganisationRef = owningOrganisation !=null? owningOrganisation.getSerial() : null;
}

/**
   * Update the SSRF data type references in this ForceElement record after loading from XML.

   * This method builds the transient {@link #owningOrganisation} with values
   * from the imported {@link #owningOrganisationRef} field. This method should
   * typically be called after the ForceElement is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (owningOrganisationRef==null || !owningOrganisationRef.isSetValue() ) {return;}
for(Organisation instance : root.getOrganisation()) {
if(owningOrganisationRef.equals(instance.getSerial())){
owningOrganisation = instance;
return;}
}}//</editor-fold>

}
