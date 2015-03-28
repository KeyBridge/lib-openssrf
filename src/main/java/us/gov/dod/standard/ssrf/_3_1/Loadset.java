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
LoadSet (US) describes the general system setup to be used under a specified set of conditions, typically related to jamming or frequency hopping.

Sub-Element is {@link JammingChannelProfile}

Example: <pre>
* &lt;Loadset cls="U"&gt;
*   &lt;Serial cls="U"&gt;USA::LS:123&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;KeyLoadProcedure cls="U"&gt;Sequential process using a permuter key unit &lt;/KeyLoadProcedure&gt;
*   &lt;MaxActiveFrames cls="U"&gt;5435&lt;/MaxActiveFrames&gt;
*   &lt;MaxReactiveFrames cls="U"&gt;3476&lt;/MaxReactiveFrames&gt;
*   &lt;Mission cls="U"&gt;Recurrent Dream&lt;/Mission&gt;
*   &lt;Name cls="U"&gt;Band K Set 0000134&lt;/Name&gt;
*   &lt;PrimaryFirmware cls="U"&gt;Barracuda Load Balancer&lt;/PrimaryFirmware&gt;
*   &lt;ResetProcedure cls="U"&gt;Reboot network resync permuter key with network&lt;/ResetProcedure&gt;
*   &lt;SecondaryFirmware cls="U"&gt;SRX5308 Version 3.0.8-12&lt;/SecondaryFirmware&gt;
*   &lt;Software cls="U"&gt;RBECS Version 2.8&lt;/Software&gt;
*   &lt;JammingChannelProfile&gt;
*     &lt;ActivationPower cls="U"&gt;-116&lt;/ActivationPower&gt;
*     &lt;ActivationTime cls="U"&gt;345.45&lt;/ActivationTime&gt;
*     &lt;CarrierWaveform cls="U"&gt; OQPSK signal 20 MHZ in bandwidth&lt;/CarrierWaveform&gt;
*     &lt;CenterFreq cls="U"&gt;387.54&lt;/CenterFreq&gt;
*     &lt;ChannelSpacing cls="U"&gt;0.025&lt;/ChannelSpacing&gt;
*     &lt;Direction cls="U"&gt;Positive&lt;/Direction&gt;
*     &lt;Dwell cls="U"&gt;76.43&lt;/Dwell&gt;
*     &lt;ExBlankingOn cls="U"&gt;Yes&lt;/ExBlankingOn&gt;
*     &lt;FFTType cls="U"&gt; Integral&lt;/FFTType&gt;
*     &lt;FreqMax cls="U"&gt;3107.56&lt;/FreqMax&gt;
*     &lt;FreqMin cls="U"&gt;2999.753&lt;/FreqMin&gt;
*     &lt;ObserveTime cls="U"&gt;012.45.6785&lt;/ObserveTime&gt;
*     &lt;OffsetFreq cls="U"&gt;0.00045&lt;/OffsetFreq&gt;
*     &lt;RxDuration cls="U"&gt;012.034.7643&lt;/RxDuration&gt;
*     &lt;Signal cls="U"&gt; OQPSK signal 20 MHZ in bandwidth&lt;/Signal&gt;
*     &lt;Techniques cls="U"&gt;2571&lt;/Techniques&gt;
*     &lt;Threat cls="U"&gt;Perceived Global Warming&lt;/Threat&gt;
*     &lt;TxDuration cls="U"&gt;001.24.4578&lt;/TxDuration&gt;
*     &lt;TimingDeconflictionProtocol&gt;
*       &lt;Description cls="U"&gt;Enter a description of the data.&lt;/Description&gt;
*       &lt;Name cls="U"&gt;AD67&lt;/Name&gt;
*       &lt;Period cls="U"&gt;0.000012&lt;/Period&gt;
*       &lt;Ranking cls="U"&gt;Primary&lt;/Ranking&gt;
*       &lt;Required cls="U"&gt;Yes&lt;/Required&gt;
*       &lt;SyncMethod cls="U"&gt;RFC Simple Network Timing Protocol&lt;/SyncMethod&gt;
*       &lt;TriggerOff cls="U"&gt;.0184&lt;/TriggerOff&gt;
*       &lt;TriggerOn cls="U"&gt;.0001&lt;/TriggerOn&gt;
*     &lt;/TimingDeconflictionProtocol&gt;
*   &lt;/JammingChannelProfile&gt;
* &lt;/Loadset&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Loadset", propOrder = {
    "keyLoadProcedure",
    "maxActiveFrames",
    "maxReactiveFrames",
    "mission",
    "name",
    "primaryFirmware",
    "resetProcedure",
    "secondaryFirmware",
    "software",
    "jammingChannelProfile"
})
public class Loadset
    extends Common
{

/**
US:KeyLoadProcedure -  Key Loading Procedure (Optional) 

The sequence pattern for initializing the jamming equipment.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "KeyLoadProcedure", required = false)
    private MEMO keyLoadProcedure;
/**
US:MaxActiveFrames - Maximum Active Frames  (Optional) 

The maximum number of active frames (data blocks currently in use directing equipment functionality) for a specific loadset.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "MaxActiveFrames", required = false)
    private UN6 maxActiveFrames;
/**
US:MaxReactiveFrames -  Maximum Reactive Frames  (Optional) 

The maximum number of reactive frames (data blocks planned to direct equipment functionality in response to a stimulus) for a specific loadset.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "MaxReactiveFrames", required = false)
    private UN6 maxReactiveFrames;
/**
US:Mission - Threat Load Mission  (Optional) 

The task expected to be accomplished by the loadset.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Mission", required = false)
    private S100 mission;
/**
US:Name - Loadset Name (Required) 

The name of the loadset.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "Name", required = true)
      private  S50 name;
/**
US:PrimaryFirmware - Primary Firmware  (Optional) 

The mission-independent software that is "burned" and which stays resident on the RF jamming hardware.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "PrimaryFirmware", required = false)
    private S50 primaryFirmware;
/**
US:ResetProcedure - Reset Procedure (Optional) 

The instructions for zeroing/sanitizing the jamming equipment to initial operating conditions.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "ResetProcedure", required = false)
    private MEMO resetProcedure;
/**
US:SecondaryFirmware -  Secondary Firmware (Optional) 

Alternate mission-independent software that is "burned" and which stays resident on the RF jamming hardware.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "SecondaryFirmware", required = false)
    private S50 secondaryFirmware;
/**
US:Software - Software (Optional) 

The mission-specific software that is loaded on the RF jamming hardware.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "Software", required = false)
    private S50 software;
/**
US:JammingChannelProfile (Required)

JammingChannelProfile (US) describes the specific Loadset parameters for jamming a discrete frequency or frequency range.

Divergence from SMADEF:  
@since 3.1.0
*/
    @XmlElement(name = "JammingChannelProfile", required = true)
      private  Set<JammingChannelProfile> jammingChannelProfile;

/**
Get the sequence pattern for initializing the jamming equipment.

@return the KeyLoadProcedure value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getKeyLoadProcedure() {
        return keyLoadProcedure;
    }

/**
Set the sequence pattern for initializing the jamming equipment.

@param value the KeyLoadProcedure value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setKeyLoadProcedure(MEMO value) {
        this.keyLoadProcedure = value;
    }

/**
Determine if the KeyLoadProcedure is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetKeyLoadProcedure() {
        return (this.keyLoadProcedure!= null);
    }

/**
Get the maximum number of active frames (data blocks currently in use directing equipment functionality) for a specific loadset.

@return the MaxActiveFrames value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getMaxActiveFrames() {
        return maxActiveFrames;
    }

/**
Set the maximum number of active frames (data blocks currently in use directing equipment functionality) for a specific loadset.

@param value the MaxActiveFrames value in a {@link TUN6} data type
@since 3.1.0
*/
public void setMaxActiveFrames(UN6 value) {
        this.maxActiveFrames = value;
    }

/**
Determine if the MaxActiveFrames is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMaxActiveFrames() {
        return (this.maxActiveFrames!= null);
    }

/**
Get the maximum number of reactive frames (data blocks planned to direct equipment functionality in response to a stimulus) for a specific loadset.

@return the MaxReactiveFrames value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getMaxReactiveFrames() {
        return maxReactiveFrames;
    }

/**
Set the maximum number of reactive frames (data blocks planned to direct equipment functionality in response to a stimulus) for a specific loadset.

@param value the MaxReactiveFrames value in a {@link TUN6} data type
@since 3.1.0
*/
public void setMaxReactiveFrames(UN6 value) {
        this.maxReactiveFrames = value;
    }

/**
Determine if the MaxReactiveFrames is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMaxReactiveFrames() {
        return (this.maxReactiveFrames!= null);
    }

/**
Get the task expected to be accomplished by the loadset.

@return the Mission value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getMission() {
        return mission;
    }

/**
Set the task expected to be accomplished by the loadset.

@param value the Mission value in a {@link TS100} data type
@since 3.1.0
*/
public void setMission(S100 value) {
        this.mission = value;
    }

/**
Determine if the Mission is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMission() {
        return (this.mission!= null);
    }

/**
Get the name of the loadset.

@return the Name value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getName() {
        return name;
    }

/**
Set the name of the loadset.

@param value the Name value in a {@link TS50} data type
@since 3.1.0
*/
public void setName(S50 value) {
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
Get the mission-independent software that is "burned" and which stays resident on the RF jamming hardware.

@return the PrimaryFirmware value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getPrimaryFirmware() {
        return primaryFirmware;
    }

/**
Set the mission-independent software that is "burned" and which stays resident on the RF jamming hardware.

@param value the PrimaryFirmware value in a {@link TS50} data type
@since 3.1.0
*/
public void setPrimaryFirmware(S50 value) {
        this.primaryFirmware = value;
    }

/**
Determine if the PrimaryFirmware is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPrimaryFirmware() {
        return (this.primaryFirmware!= null);
    }

/**
Get the instructions for zeroing/sanitizing the jamming equipment to initial operating conditions.

@return the ResetProcedure value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getResetProcedure() {
        return resetProcedure;
    }

/**
Set the instructions for zeroing/sanitizing the jamming equipment to initial operating conditions.

@param value the ResetProcedure value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setResetProcedure(MEMO value) {
        this.resetProcedure = value;
    }

/**
Determine if the ResetProcedure is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetResetProcedure() {
        return (this.resetProcedure!= null);
    }

/**
Get alternate mission-independent software that is "burned" and which stays resident on the RF jamming hardware.

@return the SecondaryFirmware value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getSecondaryFirmware() {
        return secondaryFirmware;
    }

/**
Set alternate mission-independent software that is "burned" and which stays resident on the RF jamming hardware.

@param value the SecondaryFirmware value in a {@link TS50} data type
@since 3.1.0
*/
public void setSecondaryFirmware(S50 value) {
        this.secondaryFirmware = value;
    }

/**
Determine if the SecondaryFirmware is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSecondaryFirmware() {
        return (this.secondaryFirmware!= null);
    }

/**
Get the mission-specific software that is loaded on the RF jamming hardware.

@return the Software value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getSoftware() {
        return software;
    }

/**
Set the mission-specific software that is loaded on the RF jamming hardware.

@param value the Software value in a {@link TS50} data type
@since 3.1.0
*/
public void setSoftware(S50 value) {
        this.software = value;
    }

/**
Determine if the Software is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSoftware() {
        return (this.software!= null);
    }

/**
Get the US:JammingChannelProfile

Complex element JammingChannelProfile (US) describes the specific Loadset parameters for jamming a discrete frequency or frequency range.

@return  a {@link JammingChannelProfile} instance
@since 3.1.0
*/
    public Set<JammingChannelProfile> getJammingChannelProfile() {
        if (jammingChannelProfile == null) {
            jammingChannelProfile = new HashSet<JammingChannelProfile>();
        }
        return this.jammingChannelProfile;
    }

/**
Determine if the JammingChannelProfile is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetJammingChannelProfile() {
        return ((this.jammingChannelProfile!= null)&&(!this.jammingChannelProfile.isEmpty()));
    }

/**
  Clear the JammingChannelProfile field. This sets the field to null.
 */
    public void unsetJammingChannelProfile() {
        this.jammingChannelProfile = null;
    }

/**
Set the sequence pattern for initializing the jamming equipment.

@param value  An instances of type {@link String}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withKeyLoadProcedure(String value) {
           setKeyLoadProcedure(new MEMO(value));
        return this;
    }

/**
Set the maximum number of active frames (data blocks currently in use directing equipment functionality) for a specific loadset.

@param value  An instances of type {@link Integer}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withMaxActiveFrames(Integer value) {
           setMaxActiveFrames(new UN6(value));
        return this;
    }

/**
Set the maximum number of reactive frames (data blocks planned to direct equipment functionality in response to a stimulus) for a specific loadset.

@param value  An instances of type {@link Integer}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withMaxReactiveFrames(Integer value) {
           setMaxReactiveFrames(new UN6(value));
        return this;
    }

/**
Set the task expected to be accomplished by the loadset.

@param value  An instances of type {@link String}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withMission(String value) {
           setMission(new S100(value));
        return this;
    }

/**
Set the name of the loadset.

@param value  An instances of type {@link TS50}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withName(S50 value) {
        return this;
    }

/**
Set the mission-independent software that is "burned" and which stays resident on the RF jamming hardware.

@param value  An instances of type {@link String}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withPrimaryFirmware(String value) {
           setPrimaryFirmware(new S50(value));
        return this;
    }

/**
Set the instructions for zeroing/sanitizing the jamming equipment to initial operating conditions.

@param value  An instances of type {@link String}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withResetProcedure(String value) {
           setResetProcedure(new MEMO(value));
        return this;
    }

/**
Set alternate mission-independent software that is "burned" and which stays resident on the RF jamming hardware.

@param value  An instances of type {@link String}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withSecondaryFirmware(String value) {
           setSecondaryFirmware(new S50(value));
        return this;
    }

/**
Set the mission-specific software that is loaded on the RF jamming hardware.

@param value  An instances of type {@link String}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withSoftware(String value) {
           setSoftware(new S50(value));
        return this;
    }

/**
Set the US:JammingChannelProfile

Complex element JammingChannelProfile (US) describes the specific Loadset parameters for jamming a discrete frequency or frequency range.

@param values  One or more instances of type {@link JammingChannelProfile...}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withJammingChannelProfile(JammingChannelProfile... values) {
        if (values!= null) {
            for (JammingChannelProfile value: values) {
                getJammingChannelProfile().add(value);
            }
        }
        return this;
    }

/**
Set the US:JammingChannelProfile

Complex element JammingChannelProfile (US) describes the specific Loadset parameters for jamming a discrete frequency or frequency range.

@param values  A collection of {@link JammingChannelProfile} instances
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withJammingChannelProfile(Collection<JammingChannelProfile> values) {
        if (values!= null) {
            getJammingChannelProfile().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withEntryDateTime(DT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withCaseNum(CaseNum... values) {
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
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withRemarks(Remarks... values) {
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
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withReleasability(ListCCY... values) {
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
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withRemarkRef(BigInteger... values) {
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
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withExtReferences(BigInteger... values) {
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
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current Loadset object instance
@since 3.1.0
*/
    public Loadset withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this Loadset instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Loadset {"
 + (jammingChannelProfile !=null? " jammingChannelProfile [" + jammingChannelProfile +"]" : "") 
 + (keyLoadProcedure !=null? " keyLoadProcedure [" + keyLoadProcedure +"]" : "") 
 + (maxActiveFrames !=null? " maxActiveFrames [" + maxActiveFrames +"]" : "") 
 + (maxReactiveFrames !=null? " maxReactiveFrames [" + maxReactiveFrames +"]" : "") 
 + (mission !=null? " mission [" + mission +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") 
 + (primaryFirmware !=null? " primaryFirmware [" + primaryFirmware +"]" : "") 
 + (resetProcedure !=null? " resetProcedure [" + resetProcedure +"]" : "") 
 + (secondaryFirmware !=null? " secondaryFirmware [" + secondaryFirmware +"]" : "") 
 + (software !=null? " software [" + software +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Loadset} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link Set<JammingChannelProfile> JammingChannelProfile}, {@link S50 Name}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetJammingChannelProfile() &&  isSetName();
}

}
