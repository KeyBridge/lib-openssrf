package us.gov.dod.standard.ssrf._3_1.assignment;

import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
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
Configuration identifies each operational configuration that is required in a SSRequest, granted by a Host Nation in a SSReply, or authorised in a frequency Assignment or Allotment dataset.

Element of {@link Assignment}, {@link Multiple}, {@link RFSystem}, {@link SSReply}, {@link SSRequest}

Sub-Elements are {@link CaseNum}, {@link ConfigEmission}, {@link ConfigFreq}, {@link Notation}, {@link ObservedERPAnalysis}, {@link RxRef}, {@link TxRef}, {@link Usage}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Configuration", propOrder = {
    "configID",
    "description",
    "repeater",
    "numUsers",
    "eirpMin",
    "eirpMax",
    "oobJustification",
    "powerLimit",
    "powerType",
    "spectrumLink",
    "configApprovedBy",
    "configApprovedDateTime",
    "observedFirstDateTime",
    "observedLastDateTime",
    "lastObservedBy",
    "lastReviewedBy",
    "lastReviewedDateTime",
    "notation",
    "usage",
    "configFreq",
    "txRef",
    "rxRef",
    "caseNum",
    "configEmission",
    "loadsetRef",
    "observedERPAnalysis"
})
public class Configuration {

/**
ConfigID  - Configuration Identifier (Required) 

A short name for the configuration; this name should be a meaningful identification of the configuration, but it can also be automatically generated in some systems. The identifier MUST be unique within the dataset and SHOULD NOT be modified during the entire lifetime of the dataset.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "ConfigID", required = true)
      private  S100 configID;
/**
Description  - Configuration Description (Optional) 

A description of the operational configuration. This description should be a meaningful explanation of the configurations main characteristics.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Description", required = false)
    private S100 description;
/**
Repeater  - Repeater Indicator (Optional) 

"Yes" for each receiver location when a station in the fixed or mobile service is used primarily as a repeater.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Repeater", required = false)
    private TString repeater;
/**
NumUsers  - Number of Users (Optional) 

The number of users supported by the configuration. This data may be used to analyse spectrum usage.

Format is UN(9)
@since 3.1.0
*/
    @XmlElement(name = "NumUsers", required = false)
    private UN9 numUsers;
/**
EIRPMin  - Minimum or Nominal EIRP (Optional) 

The minimum or nominal effective isotropic radiated power (EIRP) radiated from the transmitter antenna. It is the sum of the power supplied to the antenna and the gain of the antenna, less the line loss.

Format is SN(10,7) (dBW)

Attribute group EIRP (Optional)
@since 3.1.0
*/
    @XmlElement(name = "EIRPMin", required = false)
    private dBW eirpMin;
/**
EIRPMax  - Maximum EIRP (Optional) 

The maximum effective isotropic radiated power (EIRP) radiated from the transmitter antenna. It is the sum of the power supplied to the antenna and the gain of the antenna, less the line loss.

[XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.

Format is SN(10,7) (dBW)

Attribute group EIRP (Optional)
@since 3.1.0
*/
    @XmlElement(name = "EIRPMax", required = false)
    private dBW eirpMax;
/**
OOBJustification  - Out-Of-Band Justification (Optional) 

The justification for out-of-band frequency use.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "OOBJustification", required = false)
    private MEMO oobJustification;
/**
US:PowerLimit - Power Limit (Optional) 

The power limit of the transmissions in this configuration.

Format is SN(10,7) (dBW)
@since 3.1.0
*/
    @XmlElement(name = "PowerLimit", required = false)
    private dBW powerLimit;
/**
US:PowerType - Power Type (Optional) 

The power type code for carrier, mean, or peak envelope power emitted. The power type code will depend on the type of emission of the transmitter equipment.

Format is L:CPT
@since 3.1.0
*/
    @XmlElement(name = "PowerType", required = false)
    private TString powerType;
/**
US:SpectrumLink - Spectrum Link (Optional) 

Whether the transmitter(s) communicate or interact with the receiver(s) in this Configuration, i.e. enters a link versus a box.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "SpectrumLink", required = false)
    private TString spectrumLink;

    @XmlElement(name = "ConfigApprovedBy", required = false)
    private S50 configApprovedBy;

    @XmlElement(name = "ConfigApprovedDateTime", required = false)
    private DT configApprovedDateTime;
/**
US:ObservedFirstDateTime - Initial Signal Detected Timestamp (Optional) 

The date and time, based on Greenwich Mean Time (GMT), the subject signal was first collected.

Format is DateTime
@since 3.1.0
*/
    @XmlElement(name = "ObservedFirstDateTime", required = false)
    private DT observedFirstDateTime;
/**
US:ObservedLastDateTime - Last Signal Detected Timestamp (Optional) 

The date and time, based on Greenwich Mean Time (GMT), the subject signal was last collected.

Format is DateTime
@since 3.1.0
*/
    @XmlElement(name = "ObservedLastDateTime", required = false)
    private DT observedLastDateTime;
/**
US:LastObservedBy - Last Observed By (Optional) 

The identifier of the person or entity who last observed this signal configuration.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "LastObservedBy", required = false)
    private S50 lastObservedBy;
/**
US:LastReviewedBy - Last Reviewed By (Optional) 

The identifier of the person who last reviewed this configuration.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "LastReviewedBy", required = false)
    private S50 lastReviewedBy;
/**
US:LastReviewedDateTime - Last ReviewedTimestamp (Optional) 

The date and time, based on Greenwich Mean Time (GMT), the configuration was thoroughly reviewed.

Format is DateTime
@since 3.1.0
*/
    @XmlElement(name = "LastReviewedDateTime", required = false)
    private DT lastReviewedDateTime;
/**
Notation (Optional)

Notation contains the electronic identification for a pulsed or non-pulsed electromagnetic emission. It includes but is not limited to Communications Emitter Notation (CENOT) and Electronic Intelligence Notation (ELNOT).
@since 3.1.0
*/
    @XmlElement(name = "Notation")
      private  Set<Notation> notation;
/**
Usage (Optional)

Usage identifies how an operational configuration can be used or will be used.
@since 3.1.0
*/
    @XmlElement(name = "Usage")
      private  Set<Usage> usage;
/**
ConfigFreq (Optional)

ConfigFreq indicates the set of frequencies that a configuration uses, which may be a subset of the frequencies that the linked components (Transmitter, Receiver, Antenna) are capable of.

Notes: When referenced by SSRequest, the Frequency i
@since 3.1.0
*/
    @XmlElement(name = "ConfigFreq")
      private  Set<ConfigFreq> configFreq;
/**
TxRef (Optional)

TxRef contains the reference of a Transmitter, and optionnally some of its TxModes and the associated Antennas and AntMode.
@since 3.1.0
*/
    @XmlElement(name = "TxRef")
      private  Set<TxRef> txRef;
/**
RxRef (Optional)

RxRef contains the reference of a Receiver, and optionnally some of its RxModes and the associated Antennas and AntMode.
@since 3.1.0
*/
    @XmlElement(name = "RxRef")
      private  Set<RxRef> rxRef;
/**
CaseNum (Optional)

CaseNum contains legacy and other identifiers associated with the Dataset.
@since 3.1.0
*/
    @XmlElement(name = "CaseNum")
      private  Set<CaseNum> caseNum;
/**
US:ConfigEmission (Optional)

ConfigEmission (US) specifies the emission bandwidths and classification symbols that a Configuration uses, which may be a subset of the linked components' capabilities.
@since 3.1.0
*/
    @XmlElement(name = "ConfigEmission")
      private  Set<ConfigEmission> configEmission;
/**
LoadsetRef (Optional)

LoadsetRef describes the jamming loadset to be used against a specific target or targets.
@since 3.1.0
*/
    @XmlElement(name = "LoadsetRef", nillable = true)
      private  Set<Serial> loadsetRef;
/**
US:ObservedERPAnalysis (Optional)

ObservedERPAnalysis (US) contains data describing Effective Radiated Power (ERP) associated with an emitter or Notation.
@since 3.1.0
*/
    @XmlElement(name = "ObservedERPAnalysis")
      private  Set<ObservedERPAnalysis> observedERPAnalysis;

/**
Get a short name for the configuration; this name should be a meaningful identification of the configuration, but it can also be automatically generated in some systems. The identifier MUST be unique within the dataset and SHOULD NOT be modified during the entire lifetime of the dataset.

@return the ConfigID value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getConfigID() {
        return configID;
    }

/**
Set a short name for the configuration; this name should be a meaningful identification of the configuration, but it can also be automatically generated in some systems. The identifier MUST be unique within the dataset and SHOULD NOT be modified during the entire lifetime of the dataset.

@param value the ConfigID value in a {@link TS100} data type
@since 3.1.0
*/
public void setConfigID(S100 value) {
        this.configID = value;
    }

/**
Determine if the ConfigID is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetConfigID() {
        return (this.configID!= null);
    }

/**
Get a description of the operational configuration. This description should be a meaningful explanation of the configurations main characteristics.

@return the Description value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getDescription() {
        return description;
    }

/**
Set a description of the operational configuration. This description should be a meaningful explanation of the configurations main characteristics.

@param value the Description value in a {@link TS100} data type
@since 3.1.0
*/
public void setDescription(S100 value) {
        this.description = value;
    }

/**
Determine if the Description is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDescription() {
        return (this.description!= null);
    }

/**
Get "Yes" for each receiver location when a station in the fixed or mobile service is used primarily as a repeater.

@return the Repeater value in a {@link TString} data type
@since 3.1.0
*/
public TString getRepeater() {
        return repeater;
    }

/**
Set "Yes" for each receiver location when a station in the fixed or mobile service is used primarily as a repeater.

@param value the Repeater value in a {@link TString} data type
@since 3.1.0
*/
public void setRepeater(TString value) {
        this.repeater = value;
    }

/**
Determine if the Repeater is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRepeater() {
return (this.repeater!= null ? this.repeater.isSetValue() : false);
    }

/**
Get the number of users supported by the configuration. This data may be used to analyse spectrum usage.

@return the NumUsers value in a {@link TUN9} data type
@since 3.1.0
*/
public UN9 getNumUsers() {
        return numUsers;
    }

/**
Set the number of users supported by the configuration. This data may be used to analyse spectrum usage.

@param value the NumUsers value in a {@link TUN9} data type
@since 3.1.0
*/
public void setNumUsers(UN9 value) {
        this.numUsers = value;
    }

/**
Determine if the NumUsers is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumUsers() {
        return (this.numUsers!= null);
    }

/**
Get the minimum or nominal effective isotropic radiated power (EIRP) radiated from the transmitter antenna. It is the sum of the power supplied to the antenna and the gain of the antenna, less the line loss.

@return the EIRPMin value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getEIRPMin() {
        return eirpMin;
    }

/**
Set the minimum or nominal effective isotropic radiated power (EIRP) radiated from the transmitter antenna. It is the sum of the power supplied to the antenna and the gain of the antenna, less the line loss.

@param value the EIRPMin value in a {@link TdBW} data type
@since 3.1.0
*/
public void setEIRPMin(dBW value) {
        this.eirpMin = value;
    }

/**
Determine if the EIRPMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEIRPMin() {
        return (this.eirpMin!= null);
    }

/**
Get the maximum effective isotropic radiated power (EIRP) radiated from the transmitter antenna. It is the sum of the power supplied to the antenna and the gain of the antenna, less the line loss.

[XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.

@return the EIRPMax value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getEIRPMax() {
        return eirpMax;
    }

/**
Set the maximum effective isotropic radiated power (EIRP) radiated from the transmitter antenna. It is the sum of the power supplied to the antenna and the gain of the antenna, less the line loss.

[XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.

@param value the EIRPMax value in a {@link TdBW} data type
@since 3.1.0
*/
public void setEIRPMax(dBW value) {
        this.eirpMax = value;
    }

/**
Determine if the EIRPMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEIRPMax() {
        return (this.eirpMax!= null);
    }

/**
Get the justification for out-of-band frequency use.

@return the OOBJustification value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getOOBJustification() {
        return oobJustification;
    }

/**
Set the justification for out-of-band frequency use.

@param value the OOBJustification value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setOOBJustification(MEMO value) {
        this.oobJustification = value;
    }

/**
Determine if the OOBJustification is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOOBJustification() {
        return (this.oobJustification!= null);
    }

/**
Get the power limit of the transmissions in this configuration.

@return the PowerLimit value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getPowerLimit() {
        return powerLimit;
    }

/**
Set the power limit of the transmissions in this configuration.

@param value the PowerLimit value in a {@link TdBW} data type
@since 3.1.0
*/
public void setPowerLimit(dBW value) {
        this.powerLimit = value;
    }

/**
Determine if the PowerLimit is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPowerLimit() {
        return (this.powerLimit!= null);
    }

/**
Get the power type code for carrier, mean, or peak envelope power emitted. The power type code will depend on the type of emission of the transmitter equipment.

@return the PowerType value in a {@link TString} data type
@since 3.1.0
*/
public TString getPowerType() {
        return powerType;
    }

/**
Set the power type code for carrier, mean, or peak envelope power emitted. The power type code will depend on the type of emission of the transmitter equipment.

@param value the PowerType value in a {@link TString} data type
@since 3.1.0
*/
public void setPowerType(TString value) {
        this.powerType = value;
    }

/**
Determine if the PowerType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPowerType() {
return (this.powerType!= null ? this.powerType.isSetValue() : false);
    }

/**
Get whether the transmitter(s) communicate or interact with the receiver(s) in this Configuration, i.e. enters a link versus a box.

@return the SpectrumLink value in a {@link TString} data type
@since 3.1.0
*/
public TString getSpectrumLink() {
        return spectrumLink;
    }

/**
Set whether the transmitter(s) communicate or interact with the receiver(s) in this Configuration, i.e. enters a link versus a box.

@param value the SpectrumLink value in a {@link TString} data type
@since 3.1.0
*/
public void setSpectrumLink(TString value) {
        this.spectrumLink = value;
    }

/**
Determine if the SpectrumLink is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSpectrumLink() {
return (this.spectrumLink!= null ? this.spectrumLink.isSetValue() : false);
    }

/**
Get 

@return the ConfigApprovedBy value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getConfigApprovedBy() {
        return configApprovedBy;
    }

/**
Set 

@param value the ConfigApprovedBy value in a {@link TS50} data type
@since 3.1.0
*/
public void setConfigApprovedBy(S50 value) {
        this.configApprovedBy = value;
    }

/**
Determine if the ConfigApprovedBy is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetConfigApprovedBy() {
        return (this.configApprovedBy!= null);
    }

/**
Get 

@return the ConfigApprovedDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public DT getConfigApprovedDateTime() {
        return configApprovedDateTime;
    }

/**
Set 

@param value the ConfigApprovedDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public void setConfigApprovedDateTime(DT value) {
        this.configApprovedDateTime = value;
    }

/**
Determine if the ConfigApprovedDateTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetConfigApprovedDateTime() {
        return (this.configApprovedDateTime!= null);
    }

/**
Get the date and time, based on Greenwich Mean Time (GMT), the subject signal was first collected.

@return the ObservedFirstDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public DT getObservedFirstDateTime() {
        return observedFirstDateTime;
    }

/**
Set the date and time, based on Greenwich Mean Time (GMT), the subject signal was first collected.

@param value the ObservedFirstDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public void setObservedFirstDateTime(DT value) {
        this.observedFirstDateTime = value;
    }

/**
Determine if the ObservedFirstDateTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetObservedFirstDateTime() {
        return (this.observedFirstDateTime!= null);
    }

/**
Get the date and time, based on Greenwich Mean Time (GMT), the subject signal was last collected.

@return the ObservedLastDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public DT getObservedLastDateTime() {
        return observedLastDateTime;
    }

/**
Set the date and time, based on Greenwich Mean Time (GMT), the subject signal was last collected.

@param value the ObservedLastDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public void setObservedLastDateTime(DT value) {
        this.observedLastDateTime = value;
    }

/**
Determine if the ObservedLastDateTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetObservedLastDateTime() {
        return (this.observedLastDateTime!= null);
    }

/**
Get the identifier of the person or entity who last observed this signal configuration.

@return the LastObservedBy value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getLastObservedBy() {
        return lastObservedBy;
    }

/**
Set the identifier of the person or entity who last observed this signal configuration.

@param value the LastObservedBy value in a {@link TS50} data type
@since 3.1.0
*/
public void setLastObservedBy(S50 value) {
        this.lastObservedBy = value;
    }

/**
Determine if the LastObservedBy is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLastObservedBy() {
        return (this.lastObservedBy!= null);
    }

/**
Get the identifier of the person who last reviewed this configuration.

@return the LastReviewedBy value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getLastReviewedBy() {
        return lastReviewedBy;
    }

/**
Set the identifier of the person who last reviewed this configuration.

@param value the LastReviewedBy value in a {@link TS50} data type
@since 3.1.0
*/
public void setLastReviewedBy(S50 value) {
        this.lastReviewedBy = value;
    }

/**
Determine if the LastReviewedBy is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLastReviewedBy() {
        return (this.lastReviewedBy!= null);
    }

/**
Get the date and time, based on Greenwich Mean Time (GMT), the configuration was thoroughly reviewed.

@return the LastReviewedDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public DT getLastReviewedDateTime() {
        return lastReviewedDateTime;
    }

/**
Set the date and time, based on Greenwich Mean Time (GMT), the configuration was thoroughly reviewed.

@param value the LastReviewedDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public void setLastReviewedDateTime(DT value) {
        this.lastReviewedDateTime = value;
    }

/**
Determine if the LastReviewedDateTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLastReviewedDateTime() {
        return (this.lastReviewedDateTime!= null);
    }

/**
Get the Notation

Complex element Notation contains the electronic identification for a pulsed or non-pulsed electromagnetic emission. It includes but is not limited to Communications Emitter Notation (CENOT) and Electronic Intelligence Notation (ELNOT).

@return  a {@link Notation} instance
@since 3.1.0
*/
    public Set<Notation> getNotation() {
        if (notation == null) {
            notation = new HashSet<Notation>();
        }
        return this.notation;
    }

/**
Determine if the Notation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNotation() {
        return ((this.notation!= null)&&(!this.notation.isEmpty()));
    }

/**
  Clear the Notation field. This sets the field to null.
 */
    public void unsetNotation() {
        this.notation = null;
    }

/**
Get the Usage

Complex element Usage identifies how an operational configuration can be used or will be used.

@return  a {@link Usage} instance
@since 3.1.0
*/
    public Set<Usage> getUsage() {
        if (usage == null) {
            usage = new HashSet<Usage>();
        }
        return this.usage;
    }

/**
Determine if the Usage is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetUsage() {
        return ((this.usage!= null)&&(!this.usage.isEmpty()));
    }

/**
  Clear the Usage field. This sets the field to null.
 */
    public void unsetUsage() {
        this.usage = null;
    }

/**
Get the ConfigFreq

Complex element ConfigFreq indicates the set of frequencies that a configuration uses, which may be a subset of the frequencies that the linked components (Transmitter, Receiver, Antenna) are capable of.

@return  a {@link ConfigFreq} instance
@since 3.1.0
*/
    public Set<ConfigFreq> getConfigFreq() {
        if (configFreq == null) {
            configFreq = new HashSet<ConfigFreq>();
        }
        return this.configFreq;
    }

/**
Determine if the ConfigFreq is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetConfigFreq() {
        return ((this.configFreq!= null)&&(!this.configFreq.isEmpty()));
    }

/**
  Clear the ConfigFreq field. This sets the field to null.
 */
    public void unsetConfigFreq() {
        this.configFreq = null;
    }

/**
Get the TxRef

Complex element TxRef contains the reference of a Transmitter, and optionnally some of its TxModes and the associated Antennas and AntMode.

@return  a {@link TxRef} instance
@since 3.1.0
*/
    public Set<TxRef> getTxRef() {
        if (txRef == null) {
            txRef = new HashSet<TxRef>();
        }
        return this.txRef;
    }

/**
Determine if the TxRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTxRef() {
        return ((this.txRef!= null)&&(!this.txRef.isEmpty()));
    }

/**
  Clear the TxRef field. This sets the field to null.
 */
    public void unsetTxRef() {
        this.txRef = null;
    }

/**
Get the RxRef

Complex element RxRef contains the reference of a Receiver, and optionnally some of its RxModes and the associated Antennas and AntMode.

@return  a {@link RxRef} instance
@since 3.1.0
*/
    public Set<RxRef> getRxRef() {
        if (rxRef == null) {
            rxRef = new HashSet<RxRef>();
        }
        return this.rxRef;
    }

/**
Determine if the RxRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRxRef() {
        return ((this.rxRef!= null)&&(!this.rxRef.isEmpty()));
    }

/**
  Clear the RxRef field. This sets the field to null.
 */
    public void unsetRxRef() {
        this.rxRef = null;
    }

/**
Get the CaseNum

Complex element CaseNum contains legacy and other identifiers associated with the Dataset.

@return  a {@link CaseNum} instance
@since 3.1.0
*/
    public Set<CaseNum> getCaseNum() {
        if (caseNum == null) {
            caseNum = new HashSet<CaseNum>();
        }
        return this.caseNum;
    }

/**
Determine if the CaseNum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCaseNum() {
        return ((this.caseNum!= null)&&(!this.caseNum.isEmpty()));
    }

/**
  Clear the CaseNum field. This sets the field to null.
 */
    public void unsetCaseNum() {
        this.caseNum = null;
    }

/**
Get the US:ConfigEmission

Complex element ConfigEmission (US) specifies the emission bandwidths and classification symbols that a Configuration uses, which may be a subset of the linked components' capabilities.

@return  a {@link ConfigEmission} instance
@since 3.1.0
*/
    public Set<ConfigEmission> getConfigEmission() {
        if (configEmission == null) {
            configEmission = new HashSet<ConfigEmission>();
        }
        return this.configEmission;
    }

/**
Determine if the ConfigEmission is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetConfigEmission() {
        return ((this.configEmission!= null)&&(!this.configEmission.isEmpty()));
    }

/**
  Clear the ConfigEmission field. This sets the field to null.
 */
    public void unsetConfigEmission() {
        this.configEmission = null;
    }

/**
Get the LoadsetRef

Complex element LoadsetRef describes the jamming loadset to be used against a specific target or targets.

@return  a {@link Serial} instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getLoadset()} instead.
*/
@Deprecated
    public Set<Serial> getLoadsetRef() {
        if (loadsetRef == null) {
            loadsetRef = new HashSet<Serial>();
        }
        return this.loadsetRef;
    }

/**
Determine if the LoadsetRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLoadsetRef() {
        return ((this.loadsetRef!= null)&&(!this.loadsetRef.isEmpty()));
    }

/**
  Clear the LoadsetRef field. This sets the field to null.
 */
    public void unsetLoadsetRef() {
        this.loadsetRef = null;
    }

/**
Get the US:ObservedERPAnalysis

Complex element ObservedERPAnalysis (US) contains data describing Effective Radiated Power (ERP) associated with an emitter or Notation.

@return  a {@link ObservedERPAnalysis} instance
@since 3.1.0
*/
    public Set<ObservedERPAnalysis> getObservedERPAnalysis() {
        if (observedERPAnalysis == null) {
            observedERPAnalysis = new HashSet<ObservedERPAnalysis>();
        }
        return this.observedERPAnalysis;
    }

/**
Determine if the ObservedERPAnalysis is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetObservedERPAnalysis() {
        return ((this.observedERPAnalysis!= null)&&(!this.observedERPAnalysis.isEmpty()));
    }

/**
  Clear the ObservedERPAnalysis field. This sets the field to null.
 */
    public void unsetObservedERPAnalysis() {
        this.observedERPAnalysis = null;
    }

/**
Set a short name for the configuration; this name should be a meaningful identification of the configuration, but it can also be automatically generated in some systems. The identifier MUST be unique within the dataset and SHOULD NOT be modified during the entire lifetime of the dataset.

@param value  An instances of type {@link TS100}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withConfigID(TS100 value) {
        return this;
    }

/**
Set a description of the operational configuration. This description should be a meaningful explanation of the configurations main characteristics.

@param value  An instances of type {@link String}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withDescription(String value) {
           setDescription(new S100(value));
        return this;
    }

/**
Set "Yes" for each receiver location when a station in the fixed or mobile service is used primarily as a repeater.

@param value  An instances of type {@link ListCBO}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withRepeater(ListCBO value) {
           setRepeater(new TString(value.value()));
        return this;
    }

/**
Set the number of users supported by the configuration. This data may be used to analyse spectrum usage.

@param value  An instances of type {@link Integer}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withNumUsers(Integer value) {
           setNumUsers(new UN9(value));
        return this;
    }

/**
Set the minimum or nominal effective isotropic radiated power (EIRP) radiated from the transmitter antenna. It is the sum of the power supplied to the antenna and the gain of the antenna, less the line loss.

@param value  An instances of type {@link Double}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withEIRPMin(Double value) {
           setEIRPMin(new dBW(value));
        return this;
    }

/**
Set the maximum effective isotropic radiated power (EIRP) radiated from the transmitter antenna. It is the sum of the power supplied to the antenna and the gain of the antenna, less the line loss.

[XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.

@param value  An instances of type {@link Double}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withEIRPMax(Double value) {
           setEIRPMax(new dBW(value));
        return this;
    }

/**
Set the justification for out-of-band frequency use.

@param value  An instances of type {@link String}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withOOBJustification(String value) {
           setOOBJustification(new MEMO(value));
        return this;
    }

/**
Set the power limit of the transmissions in this configuration.

@param value  An instances of type {@link Double}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withPowerLimit(Double value) {
           setPowerLimit(new dBW(value));
        return this;
    }

/**
Set the power type code for carrier, mean, or peak envelope power emitted. The power type code will depend on the type of emission of the transmitter equipment.

@param value  An instances of type {@link ListCPT}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withPowerType(ListCPT value) {
           setPowerType(new TString(value.value()));
        return this;
    }

/**
Set whether the transmitter(s) communicate or interact with the receiver(s) in this Configuration, i.e. enters a link versus a box.

@param value  An instances of type {@link ListCBO}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withSpectrumLink(ListCBO value) {
           setSpectrumLink(new TString(value.value()));
        return this;
    }

/**
Set 

@param value  An instances of type {@link String}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withConfigApprovedBy(String value) {
           setConfigApprovedBy(new S50(value));
        return this;
    }

/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withConfigApprovedDateTime(Calendar value) {
           setConfigApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withConfigApprovedDateTime(Date value) {
           setConfigApprovedDateTime(new DT(value));
        return this;
    }

/**
Set the date and time, based on Greenwich Mean Time (GMT), the subject signal was first collected.

@param value  An instances of type {@link Calendar}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set the date and time, based on Greenwich Mean Time (GMT), the subject signal was first collected.

@param value  An instances of type {@link Date}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

/**
Set the date and time, based on Greenwich Mean Time (GMT), the subject signal was last collected.

@param value  An instances of type {@link Calendar}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set the date and time, based on Greenwich Mean Time (GMT), the subject signal was last collected.

@param value  An instances of type {@link Date}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

/**
Set the identifier of the person or entity who last observed this signal configuration.

@param value  An instances of type {@link String}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

/**
Set the identifier of the person who last reviewed this configuration.

@param value  An instances of type {@link String}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withLastReviewedBy(String value) {
           setLastReviewedBy(new S50(value));
        return this;
    }

/**
Set the date and time, based on Greenwich Mean Time (GMT), the configuration was thoroughly reviewed.

@param value  An instances of type {@link Calendar}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withLastReviewedDateTime(Calendar value) {
           setLastReviewedDateTime(new DT(value));
        return this;
    }
/**
Set the date and time, based on Greenwich Mean Time (GMT), the configuration was thoroughly reviewed.

@param value  An instances of type {@link Date}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withLastReviewedDateTime(Date value) {
           setLastReviewedDateTime(new DT(value));
        return this;
    }

/**
Set the Notation

Complex element Notation contains the electronic identification for a pulsed or non-pulsed electromagnetic emission. It includes but is not limited to Communications Emitter Notation (CENOT) and Electronic Intelligence Notation (ELNOT).

@param values  One or more instances of type {@link Notation...}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withNotation(Notation... values) {
        if (values!= null) {
            for (Notation value: values) {
                getNotation().add(value);
            }
        }
        return this;
    }

/**
Set the Notation

Complex element Notation contains the electronic identification for a pulsed or non-pulsed electromagnetic emission. It includes but is not limited to Communications Emitter Notation (CENOT) and Electronic Intelligence Notation (ELNOT).

@param values  A collection of {@link Notation} instances
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withNotation(Collection<Notation> values) {
        if (values!= null) {
            getNotation().addAll(values);
        }
        return this;
    }

/**
Set the Usage

Complex element Usage identifies how an operational configuration can be used or will be used.

@param values  One or more instances of type {@link Usage...}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withUsage(Usage... values) {
        if (values!= null) {
            for (Usage value: values) {
                getUsage().add(value);
            }
        }
        return this;
    }

/**
Set the Usage

Complex element Usage identifies how an operational configuration can be used or will be used.

@param values  A collection of {@link Usage} instances
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withUsage(Collection<Usage> values) {
        if (values!= null) {
            getUsage().addAll(values);
        }
        return this;
    }

/**
Set the ConfigFreq

Complex element ConfigFreq indicates the set of frequencies that a configuration uses, which may be a subset of the frequencies that the linked components (Transmitter, Receiver, Antenna) are capable of.

@param values  One or more instances of type {@link ConfigFreq...}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withConfigFreq(ConfigFreq... values) {
        if (values!= null) {
            for (ConfigFreq value: values) {
                getConfigFreq().add(value);
            }
        }
        return this;
    }

/**
Set the ConfigFreq

Complex element ConfigFreq indicates the set of frequencies that a configuration uses, which may be a subset of the frequencies that the linked components (Transmitter, Receiver, Antenna) are capable of.

@param values  A collection of {@link ConfigFreq} instances
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withConfigFreq(Collection<ConfigFreq> values) {
        if (values!= null) {
            getConfigFreq().addAll(values);
        }
        return this;
    }

/**
Set the TxRef

Complex element TxRef contains the reference of a Transmitter, and optionnally some of its TxModes and the associated Antennas and AntMode.

@param values  One or more instances of type {@link TxRef...}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withTxRef(TxRef... values) {
        if (values!= null) {
            for (TxRef value: values) {
                getTxRef().add(value);
            }
        }
        return this;
    }

/**
Set the TxRef

Complex element TxRef contains the reference of a Transmitter, and optionnally some of its TxModes and the associated Antennas and AntMode.

@param values  A collection of {@link TxRef} instances
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withTxRef(Collection<TxRef> values) {
        if (values!= null) {
            getTxRef().addAll(values);
        }
        return this;
    }

/**
Set the RxRef

Complex element RxRef contains the reference of a Receiver, and optionnally some of its RxModes and the associated Antennas and AntMode.

@param values  One or more instances of type {@link RxRef...}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withRxRef(RxRef... values) {
        if (values!= null) {
            for (RxRef value: values) {
                getRxRef().add(value);
            }
        }
        return this;
    }

/**
Set the RxRef

Complex element RxRef contains the reference of a Receiver, and optionnally some of its RxModes and the associated Antennas and AntMode.

@param values  A collection of {@link RxRef} instances
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withRxRef(Collection<RxRef> values) {
        if (values!= null) {
            getRxRef().addAll(values);
        }
        return this;
    }

/**
Set the CaseNum

Complex element CaseNum contains legacy and other identifiers associated with the Dataset.

@param values  One or more instances of type {@link CaseNum...}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withCaseNum(CaseNum... values) {
        if (values!= null) {
            for (CaseNum value: values) {
                getCaseNum().add(value);
            }
        }
        return this;
    }

/**
Set the CaseNum

Complex element CaseNum contains legacy and other identifiers associated with the Dataset.

@param values  A collection of {@link CaseNum} instances
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

/**
Set the US:ConfigEmission

Complex element ConfigEmission (US) specifies the emission bandwidths and classification symbols that a Configuration uses, which may be a subset of the linked components' capabilities.

@param values  One or more instances of type {@link ConfigEmission...}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withConfigEmission(ConfigEmission... values) {
        if (values!= null) {
            for (ConfigEmission value: values) {
                getConfigEmission().add(value);
            }
        }
        return this;
    }

/**
Set the US:ConfigEmission

Complex element ConfigEmission (US) specifies the emission bandwidths and classification symbols that a Configuration uses, which may be a subset of the linked components' capabilities.

@param values  A collection of {@link ConfigEmission} instances
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withConfigEmission(Collection<ConfigEmission> values) {
        if (values!= null) {
            getConfigEmission().addAll(values);
        }
        return this;
    }

/**
Set the LoadsetRef

Complex element LoadsetRef describes the jamming loadset to be used against a specific target or targets.

@param values  One or more instances of type {@link LoadsetRef...}
@return The current Configuration object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withLoadset(Loadset...)} instead.
*/
@Deprecated
    public Configuration withLoadsetRef(Serial... values) {
        if (values!= null) {
            for (LoadsetRef value: values) {
                getLoadsetRef().add(value);
            }
        }
        return this;
    }

/**
Set the LoadsetRef

Complex element LoadsetRef describes the jamming loadset to be used against a specific target or targets.

@param values  A collection of {@link Serial} instances
@return The current Configuration object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withLoadset(Loadset...)} instead.
*/
@Deprecated
    public Configuration withLoadsetRef(Collection<Serial> values) {
        if (values!= null) {
            getLoadsetRef().addAll(values);
        }
        return this;
    }

/**
Set the US:ObservedERPAnalysis

Complex element ObservedERPAnalysis (US) contains data describing Effective Radiated Power (ERP) associated with an emitter or Notation.

@param values  One or more instances of type {@link ObservedERPAnalysis...}
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withObservedERPAnalysis(ObservedERPAnalysis... values) {
        if (values!= null) {
            for (ObservedERPAnalysis value: values) {
                getObservedERPAnalysis().add(value);
            }
        }
        return this;
    }

/**
Set the US:ObservedERPAnalysis

Complex element ObservedERPAnalysis (US) contains data describing Effective Radiated Power (ERP) associated with an emitter or Notation.

@param values  A collection of {@link ObservedERPAnalysis} instances
@return The current Configuration object instance
@since 3.1.0
*/
    public Configuration withObservedERPAnalysis(Collection<ObservedERPAnalysis> values) {
        if (values!= null) {
            getObservedERPAnalysis().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this Configuration instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Configuration {"
 + (caseNum !=null? " caseNum [" + caseNum +"]" : "") 
 + (configApprovedBy !=null? " configApprovedBy [" + configApprovedBy +"]" : "") 
 + (configApprovedDateTime !=null? " configApprovedDateTime [" + configApprovedDateTime +"]" : "") 
 + (configEmission !=null? " configEmission [" + configEmission +"]" : "") 
 + (configFreq !=null? " configFreq [" + configFreq +"]" : "") 
 + (configID !=null? " configID [" + configID +"]" : "") 
 + (description !=null? " description [" + description +"]" : "") 
 + (eirpMax !=null? " eirpMax [" + eirpMax +"]" : "") 
 + (eirpMin !=null? " eirpMin [" + eirpMin +"]" : "") 
 + (lastObservedBy !=null? " lastObservedBy [" + lastObservedBy +"]" : "") 
 + (lastReviewedBy !=null? " lastReviewedBy [" + lastReviewedBy +"]" : "") 
 + (lastReviewedDateTime !=null? " lastReviewedDateTime [" + lastReviewedDateTime +"]" : "") 
 + (loadsetRef !=null? " loadsetRef [" + loadsetRef +"]" : "") 
 + (notation !=null? " notation [" + notation +"]" : "") 
 + (numUsers !=null? " numUsers [" + numUsers +"]" : "") 
 + (observedERPAnalysis !=null? " observedERPAnalysis [" + observedERPAnalysis +"]" : "") 
 + (observedFirstDateTime !=null? " observedFirstDateTime [" + observedFirstDateTime +"]" : "") 
 + (observedLastDateTime !=null? " observedLastDateTime [" + observedLastDateTime +"]" : "") 
 + (oobJustification !=null? " oobJustification [" + oobJustification +"]" : "") 
 + (powerLimit !=null? " powerLimit [" + powerLimit +"]" : "") 
 + (powerType !=null? " powerType [" + powerType +"]" : "") 
 + (repeater !=null? " repeater [" + repeater +"]" : "") 
 + (rxRef !=null? " rxRef [" + rxRef +"]" : "") 
 + (spectrumLink !=null? " spectrumLink [" + spectrumLink +"]" : "") 
 + (txRef !=null? " txRef [" + txRef +"]" : "") 
 + (usage !=null? " usage [" + usage +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Configuration} requires {@link S100 ConfigID}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetConfigID();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
LoadsetRef (Optional)

LoadsetRef describes the jamming loadset to be used against a specific target or targets.
@since 3.1.0
*/
@XmlTransient
private Set<Loadset> loadset;

/**
Get the LoadsetRef

Complex element LoadsetRef describes the jamming loadset to be used against a specific target or targets.

@return  a {@link Loadset} instance
@since 3.1.0
*/
public Set<Loadset> getLoadset(){
if(loadset == null){
loadset = new HashSet<>();
}
 return loadset;
}
/**
 Determine if the loadset field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetLoadset() {
return this.loadset !=null  && !this.loadset.isEmpty();
}

/**
Set the LoadsetRef

Complex element LoadsetRef describes the jamming loadset to be used against a specific target or targets.

@param values  An instances of type {@link Loadset}
@return The current Configuration object instance
@since 3.1.0
*/
public Configuration withLoadset(Loadset... values) {
return  withLoadset(Arrays.asList(values));
}

/**
Set the LoadsetRef

Complex element LoadsetRef describes the jamming loadset to be used against a specific target or targets.

@param values  An instances of type {@link Loadset}
@return The current Configuration object instance
@since 3.1.0
*/
public Configuration withLoadset(Collection<Loadset> values) {
getLoadset().addAll(values);
return this;
}
  /**
   * Update the SSRF data type references in this Configuration record.
   * <p>
 @since 3.1.0 */
public void prepare() {
this.loadsetRef= new ArrayList<>();
for (Loadset instance :  getLoadset()) {
this.loadsetRef.add(instance.getSerial());
}

/**
   * Update the SSRF data type references in this Configuration record after loading from XML.

   * This method builds the transient {@link #loadset} with values
   * from the imported {@link #loadsetRef} field. This method should
   * typically be called after the Configuration is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (loadsetRef==null || loadsetRef.isEmpty() ) {return;}
for(Loadset instance : root.getLoadset()) {
if(loadsetRef.contains(instance.getSerial())){
loadset.add(instance);
}
}}//</editor-fold>

}
