package us.gov.dod.standard.ssrf._3_1.radiationplan;

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
JammingPlan (US) describes the start and stop conditions, priorities, desired effect, and desired effectiveness.

Element of {@link RadiationPlan}

Sub-Element is {@link JammingTarget}

Example: See {@link RadiationPlan}.
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JammingPlan", propOrder = {
    "name",
    "numFreqs",
    "priority",
    "requiredEffect",
    "requiredPerformance",
    "startDateTime",
    "startLocationRef",
    "startTrigger",
    "stopDateTime",
    "stopLocationRef",
    "stopTrigger",
    "version",
    "level3Auth",
    "standOffDist",
    "jammingTarget"
})
public class JammingPlan {

/**
In Data Item Name  (US),  enter a unique name (within the parent RadiationPlan) for the Jamming Plan.
@since 3.1.0
*/
    @XmlElement(name = "Name", required = false)
    private S100 name;
/**
US:NumFreqs - Frequency Count (Optional) 

The number of discrete frequencies or frequency ranges associated with this Jamming Plan. There SHOULD be one JammingTarget sub-element for each discrete frequency or frequency range.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumFreqs", required = false)
    private UN6 numFreqs;
/**
US:Priority - Plan Priority (Required) 

The relative priority of the service request.

Format is L:UWE
@since 3.1.0
*/
    @XmlElement(name = "Priority", required = true)
      private  TString priority;
/**
US:RequiredEffect - Required Effect (Optional) 

The desired effect of this service request.

Format is L:UWA
@since 3.1.0
*/
    @XmlElement(name = "RequiredEffect", required = false)
    private TString requiredEffect;
/**
US:RequiredPerformance - Required Performance (Optional) 

The desired effectiveness of the service request. Example: the minimum percentage of known enemy command and control nodes that must be rendered inoperable for successful mission accomplishment.

Format is L:UWB
@since 3.1.0
*/
    @XmlElement(name = "RequiredPerformance", required = false)
    private TString requiredPerformance;
/**
US:StartDateTime - Start Timestamp (Optional) 

The date/time stamp when to initiate the jamming, if "Date/Time" is used in element StartTrigger. Entries must be equal to or later than RadiationPlan.StartDateTime, and less than RadiationPlan.StopDateTime.

Format is DateTime
@since 3.1.0
*/
    @XmlElement(name = "StartDateTime", required = false)
    private DT startDateTime;
/**
US:StartLocationRef - Start Location Serial (Optional) 

The Location serial indicating the region associated with "Troops in Region" or "Troops Not in Region", in attribute StartTrigger.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "StartLocationRef", required = false)
    private Serial startLocationRef;
/**
US:StartTrigger - Start Trigger (Required) 

The type of trigger that indicates when it is time to start jamming.

Format is L:UWF
@since 3.1.0
*/
    @XmlElement(name = "StartTrigger", required = true)
      private  TString startTrigger;
/**
US:StopDateTime - Stop Timestamp (Optional) 

The date/time stamp when to stop the jamming, if "Date/Time" is used in element StopTrigger. Entries must be after RadiationPlan.StartDateTime, and be equal to or less than RadiationPlan.StopDateTime.

Format is DateTime
@since 3.1.0
*/
    @XmlElement(name = "StopDateTime", required = false)
    private DT stopDateTime;
/**
US:StopLocationRef - Stop Location Serial (Optional) 

The Location serial indicating the region associated with "Troops in Region" or "Troops Not in Region", in attribute StopTrigger.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "StopLocationRef", required = false)
    private Serial stopLocationRef;
/**
US:StopTrigger - Stop Trigger (Required) 

The type of trigger that indicates when it is time to stop jamming.

Format is L:UWF
@since 3.1.0
*/
    @XmlElement(name = "StopTrigger", required = true)
      private  TString stopTrigger;
/**
US:Version - Plan Version (Optional) 

The current version of the Jamming Plan.

Format is S10
@since 3.1.0
*/
    @XmlElement(name = "Version", required = false)
    private S10 version;
/**
In Data Item Level3Auth (US), indicate if a request should go directly to third-level authorization. If "Yes" is entered, then for Radiation Plan approval, the JammingAuthority complex element MUST contain an entry.
@since 3.1.0
*/
    @XmlElement(name = "Level3Auth", required = true)
      private  TString level3Auth;
/**
US:StandOffDist - Stand Off Distance (Optional) 

The required distance from the jammer to non-threat equipment, in km.

Format is UN(9,4) (km)
@since 3.1.0
*/
    @XmlElement(name = "StandOffDist", required = false)
    private DistSpace standOffDist;
/**
US:JammingTarget (Required)

JammingTarget (US) describes the target location and identifies the jamming loadset to be used.
@since 3.1.0
*/
    @XmlElement(name = "JammingTarget", required = true)
      private  Set<JammingTarget> jammingTarget;

/**
Get In Data Item Name  (US),  enter a unique name (within the parent RadiationPlan) for the Jamming Plan.

@return the Name value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getName() {
        return name;
    }

/**
Set In Data Item Name  (US),  enter a unique name (within the parent RadiationPlan) for the Jamming Plan.

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
Get the number of discrete frequencies or frequency ranges associated with this Jamming Plan. There SHOULD be one JammingTarget sub-element for each discrete frequency or frequency range.

@return the NumFreqs value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumFreqs() {
        return numFreqs;
    }

/**
Set the number of discrete frequencies or frequency ranges associated with this Jamming Plan. There SHOULD be one JammingTarget sub-element for each discrete frequency or frequency range.

@param value the NumFreqs value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumFreqs(UN6 value) {
        this.numFreqs = value;
    }

/**
Determine if the NumFreqs is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumFreqs() {
        return (this.numFreqs!= null);
    }

/**
Get the relative priority of the service request.

@return the Priority value in a {@link TString} data type
@since 3.1.0
*/
public TString getPriority() {
        return priority;
    }

/**
Set the relative priority of the service request.

@param value the Priority value in a {@link TString} data type
@since 3.1.0
*/
public void setPriority(TString value) {
        this.priority = value;
    }

/**
Determine if the Priority is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPriority() {
return (this.priority!= null ? this.priority.isSetValue() : false);
    }

/**
Get the desired effect of this service request.

@return the RequiredEffect value in a {@link TString} data type
@since 3.1.0
*/
public TString getRequiredEffect() {
        return requiredEffect;
    }

/**
Set the desired effect of this service request.

@param value the RequiredEffect value in a {@link TString} data type
@since 3.1.0
*/
public void setRequiredEffect(TString value) {
        this.requiredEffect = value;
    }

/**
Determine if the RequiredEffect is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRequiredEffect() {
return (this.requiredEffect!= null ? this.requiredEffect.isSetValue() : false);
    }

/**
Get the desired effectiveness of the service request. Example: the minimum percentage of known enemy command and control nodes that must be rendered inoperable for successful mission accomplishment.

@return the RequiredPerformance value in a {@link TString} data type
@since 3.1.0
*/
public TString getRequiredPerformance() {
        return requiredPerformance;
    }

/**
Set the desired effectiveness of the service request. Example: the minimum percentage of known enemy command and control nodes that must be rendered inoperable for successful mission accomplishment.

@param value the RequiredPerformance value in a {@link TString} data type
@since 3.1.0
*/
public void setRequiredPerformance(TString value) {
        this.requiredPerformance = value;
    }

/**
Determine if the RequiredPerformance is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRequiredPerformance() {
return (this.requiredPerformance!= null ? this.requiredPerformance.isSetValue() : false);
    }

/**
Get the date/time stamp when to initiate the jamming, if "Date/Time" is used in element StartTrigger. Entries must be equal to or later than RadiationPlan.StartDateTime, and less than RadiationPlan.StopDateTime.

@return the StartDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public DT getStartDateTime() {
        return startDateTime;
    }

/**
Set the date/time stamp when to initiate the jamming, if "Date/Time" is used in element StartTrigger. Entries must be equal to or later than RadiationPlan.StartDateTime, and less than RadiationPlan.StopDateTime.

@param value the StartDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public void setStartDateTime(DT value) {
        this.startDateTime = value;
    }

/**
Determine if the StartDateTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStartDateTime() {
        return (this.startDateTime!= null);
    }

/**
Get the Location serial indicating the region associated with "Troops in Region" or "Troops Not in Region", in attribute StartTrigger.

@return the StartLocationRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getStartLocation()} instead.
*/
@Deprecated
public Serial getStartLocationRef() {
        return startLocationRef;
    }

/**
Set the Location serial indicating the region associated with "Troops in Region" or "Troops Not in Region", in attribute StartTrigger.

@param value the StartLocationRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setStartLocation(Location)} instead.
*/
@Deprecated
public void setStartLocationRef(Serial value) {
        this.startLocationRef = value;
    }

/**
Determine if the StartLocationRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStartLocationRef() {
        return (this.startLocationRef!= null);
    }

/**
Get the type of trigger that indicates when it is time to start jamming.

@return the StartTrigger value in a {@link TString} data type
@since 3.1.0
*/
public TString getStartTrigger() {
        return startTrigger;
    }

/**
Set the type of trigger that indicates when it is time to start jamming.

@param value the StartTrigger value in a {@link TString} data type
@since 3.1.0
*/
public void setStartTrigger(TString value) {
        this.startTrigger = value;
    }

/**
Determine if the StartTrigger is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStartTrigger() {
return (this.startTrigger!= null ? this.startTrigger.isSetValue() : false);
    }

/**
Get the date/time stamp when to stop the jamming, if "Date/Time" is used in element StopTrigger. Entries must be after RadiationPlan.StartDateTime, and be equal to or less than RadiationPlan.StopDateTime.

@return the StopDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public DT getStopDateTime() {
        return stopDateTime;
    }

/**
Set the date/time stamp when to stop the jamming, if "Date/Time" is used in element StopTrigger. Entries must be after RadiationPlan.StartDateTime, and be equal to or less than RadiationPlan.StopDateTime.

@param value the StopDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public void setStopDateTime(DT value) {
        this.stopDateTime = value;
    }

/**
Determine if the StopDateTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStopDateTime() {
        return (this.stopDateTime!= null);
    }

/**
Get the Location serial indicating the region associated with "Troops in Region" or "Troops Not in Region", in attribute StopTrigger.

@return the StopLocationRef value in a {@link Serial} data type
@since 3.1.0
*/
public Serial getStopLocationRef() {
        return stopLocationRef;
    }

/**
Set the Location serial indicating the region associated with "Troops in Region" or "Troops Not in Region", in attribute StopTrigger.

@param value the StopLocationRef value in a {@link Serial} data type
@since 3.1.0
*/
public void setStopLocationRef(Serial value) {
        this.stopLocationRef = value;
    }

/**
Determine if the StopLocationRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStopLocationRef() {
        return (this.stopLocationRef!= null);
    }

/**
Get the type of trigger that indicates when it is time to stop jamming.

@return the StopTrigger value in a {@link TString} data type
@since 3.1.0
*/
public TString getStopTrigger() {
        return stopTrigger;
    }

/**
Set the type of trigger that indicates when it is time to stop jamming.

@param value the StopTrigger value in a {@link TString} data type
@since 3.1.0
*/
public void setStopTrigger(TString value) {
        this.stopTrigger = value;
    }

/**
Determine if the StopTrigger is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStopTrigger() {
return (this.stopTrigger!= null ? this.stopTrigger.isSetValue() : false);
    }

/**
Get the current version of the Jamming Plan.

@return the Version value in a {@link TS10} data type
@since 3.1.0
*/
public S10 getVersion() {
        return version;
    }

/**
Set the current version of the Jamming Plan.

@param value the Version value in a {@link TS10} data type
@since 3.1.0
*/
public void setVersion(S10 value) {
        this.version = value;
    }

/**
Determine if the Version is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVersion() {
        return (this.version!= null);
    }

/**
Get In Data Item Level3Auth (US), indicate if a request should go directly to third-level authorization. If "Yes" is entered, then for Radiation Plan approval, the JammingAuthority complex element MUST contain an entry.

@return the Level3Auth value in a {@link TString} data type
@since 3.1.0
*/
public TString getLevel3Auth() {
        return level3Auth;
    }

/**
Set In Data Item Level3Auth (US), indicate if a request should go directly to third-level authorization. If "Yes" is entered, then for Radiation Plan approval, the JammingAuthority complex element MUST contain an entry.

@param value the Level3Auth value in a {@link TString} data type
@since 3.1.0
*/
public void setLevel3Auth(TString value) {
        this.level3Auth = value;
    }

/**
Determine if the Level3Auth is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLevel3Auth() {
return (this.level3Auth!= null ? this.level3Auth.isSetValue() : false);
    }

/**
Get the required distance from the jammer to non-threat equipment, in km.

@return the StandOffDist value in a {@link TDistSpace} data type
@since 3.1.0
*/
public DistSpace getStandOffDist() {
        return standOffDist;
    }

/**
Set the required distance from the jammer to non-threat equipment, in km.

@param value the StandOffDist value in a {@link TDistSpace} data type
@since 3.1.0
*/
public void setStandOffDist(DistSpace value) {
        this.standOffDist = value;
    }

/**
Determine if the StandOffDist is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStandOffDist() {
        return (this.standOffDist!= null);
    }

/**
Get the US:JammingTarget

Complex element JammingTarget (US) describes the target location and identifies the jamming loadset to be used.

@return  a {@link JammingTarget} instance
@since 3.1.0
*/
    public Set<JammingTarget> getJammingTarget() {
        if (jammingTarget == null) {
            jammingTarget = new HashSet<JammingTarget>();
        }
        return this.jammingTarget;
    }

/**
Determine if the JammingTarget is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetJammingTarget() {
        return ((this.jammingTarget!= null)&&(!this.jammingTarget.isEmpty()));
    }

/**
  Clear the JammingTarget field. This sets the field to null.
 */
    public void unsetJammingTarget() {
        this.jammingTarget = null;
    }

/**
Set In Data Item Name  (US),  enter a unique name (within the parent RadiationPlan) for the Jamming Plan.

@param value  An instances of type {@link String}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withName(String value) {
           setName(new S100(value));
        return this;
    }

/**
Set the number of discrete frequencies or frequency ranges associated with this Jamming Plan. There SHOULD be one JammingTarget sub-element for each discrete frequency or frequency range.

@param value  An instances of type {@link Integer}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withNumFreqs(Integer value) {
           setNumFreqs(new UN6(value));
        return this;
    }

/**
Set the relative priority of the service request.

@param value  An instances of type {@link ListUWE}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withPriority(ListUWE value) {
        setPriority(new TString(value.value()));
        return this;
    }

/**
Set the desired effect of this service request.

@param value  An instances of type {@link ListUWA}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withRequiredEffect(ListUWA value) {
           setRequiredEffect(new TString(value.value()));
        return this;
    }

/**
Set the desired effectiveness of the service request. Example: the minimum percentage of known enemy command and control nodes that must be rendered inoperable for successful mission accomplishment.

@param value  An instances of type {@link ListUWB}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withRequiredPerformance(ListUWB value) {
           setRequiredPerformance(new TString(value.value()));
        return this;
    }

/**
Set the date/time stamp when to initiate the jamming, if "Date/Time" is used in element StartTrigger. Entries must be equal to or later than RadiationPlan.StartDateTime, and less than RadiationPlan.StopDateTime.

@param value  An instances of type {@link Calendar}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withStartDateTime(Calendar value) {
           setStartDateTime(new DT(value));
        return this;
    }
/**
Set the date/time stamp when to initiate the jamming, if "Date/Time" is used in element StartTrigger. Entries must be equal to or later than RadiationPlan.StartDateTime, and less than RadiationPlan.StopDateTime.

@param value  An instances of type {@link Date}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withStartDateTime(Date value) {
           setStartDateTime(new DT(value));
        return this;
    }

/**
Set the Location serial indicating the region associated with "Troops in Region" or "Troops Not in Region", in attribute StartTrigger.

@param value  An instances of type {@link Serial}
@return The current JammingPlan object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withStartLocation(Location)} instead.
*/
@Deprecated
    public JammingPlan withStartLocationRef(Serial value) {
           setStartLocationRef(value);
        return this;
    }

/**
Set the type of trigger that indicates when it is time to start jamming.

@param value  An instances of type {@link ListUWF}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withStartTrigger(ListUWF value) {
        setStartTrigger(new TString(value.value()));
        return this;
    }

/**
Set the date/time stamp when to stop the jamming, if "Date/Time" is used in element StopTrigger. Entries must be after RadiationPlan.StartDateTime, and be equal to or less than RadiationPlan.StopDateTime.

@param value  An instances of type {@link Calendar}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withStopDateTime(Calendar value) {
           setStopDateTime(new DT(value));
        return this;
    }
/**
Set the date/time stamp when to stop the jamming, if "Date/Time" is used in element StopTrigger. Entries must be after RadiationPlan.StartDateTime, and be equal to or less than RadiationPlan.StopDateTime.

@param value  An instances of type {@link Date}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withStopDateTime(Date value) {
           setStopDateTime(new DT(value));
        return this;
    }

/**
Set the Location serial indicating the region associated with "Troops in Region" or "Troops Not in Region", in attribute StopTrigger.

@param value  An instances of type {@link Serial}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withStopLocationRef(Serial value) {
           setStopLocationRef(value);
        return this;
    }

/**
Set the type of trigger that indicates when it is time to stop jamming.

@param value  An instances of type {@link ListUWF}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withStopTrigger(ListUWF value) {
        setStopTrigger(new TString(value.value()));
        return this;
    }

/**
Set the current version of the Jamming Plan.

@param value  An instances of type {@link String}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withVersion(String value) {
           setVersion(new S10(value));
        return this;
    }

/**
Set In Data Item Level3Auth (US), indicate if a request should go directly to third-level authorization. If "Yes" is entered, then for Radiation Plan approval, the JammingAuthority complex element MUST contain an entry.

@param value  An instances of type {@link ListCBO}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withLevel3Auth(ListCBO value) {
        setLevel3Auth(new TString(value.value()));
        return this;
    }

/**
Set the required distance from the jammer to non-threat equipment, in km.

@param value  An instances of type {@link Double}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withStandOffDist(Double value) {
           setStandOffDist(new DistSpace(value));
        return this;
    }

/**
Set the US:JammingTarget

Complex element JammingTarget (US) describes the target location and identifies the jamming loadset to be used.

@param values  One or more instances of type {@link JammingTarget...}
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withJammingTarget(JammingTarget... values) {
        if (values!= null) {
            for (JammingTarget value: values) {
                getJammingTarget().add(value);
            }
        }
        return this;
    }

/**
Set the US:JammingTarget

Complex element JammingTarget (US) describes the target location and identifies the jamming loadset to be used.

@param values  A collection of {@link JammingTarget} instances
@return The current JammingPlan object instance
@since 3.1.0
*/
    public JammingPlan withJammingTarget(Collection<JammingTarget> values) {
        if (values!= null) {
            getJammingTarget().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this JammingPlan instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "JammingPlan {"
 + (jammingTarget !=null? " jammingTarget [" + jammingTarget +"]" : "") 
 + (level3Auth !=null? " level3Auth [" + level3Auth +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") 
 + (numFreqs !=null? " numFreqs [" + numFreqs +"]" : "") 
 + (priority !=null? " priority [" + priority +"]" : "") 
 + (requiredEffect !=null? " requiredEffect [" + requiredEffect +"]" : "") 
 + (requiredPerformance !=null? " requiredPerformance [" + requiredPerformance +"]" : "") 
 + (standOffDist !=null? " standOffDist [" + standOffDist +"]" : "") 
 + (startDateTime !=null? " startDateTime [" + startDateTime +"]" : "") 
 + (startLocationRef !=null? " startLocationRef [" + startLocationRef +"]" : "") 
 + (startTrigger !=null? " startTrigger [" + startTrigger +"]" : "") 
 + (stopDateTime !=null? " stopDateTime [" + stopDateTime +"]" : "") 
 + (stopLocationRef !=null? " stopLocationRef [" + stopLocationRef +"]" : "") 
 + (stopTrigger !=null? " stopTrigger [" + stopTrigger +"]" : "") 
 + (version !=null? " version [" + version +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link JammingPlan} requires {@link Set<JammingTarget> JammingTarget}, {@link TString Level3Auth}, {@link TString Priority}, {@link TString StartTrigger}, {@link TString StopTrigger}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetJammingTarget() &&  isSetLevel3Auth() &&  isSetPriority() &&  isSetStartTrigger() &&  isSetStopTrigger();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
US:StartLocationRef - Start Location Serial (Optional) 

The Location serial indicating the region associated with "Troops in Region" or "Troops Not in Region", in attribute StartTrigger.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Location startLocation;

/**
Get the Location serial indicating the region associated with "Troops in Region" or "Troops Not in Region", in attribute StartTrigger.

@return  a {@link Location} instance
@since 3.1.0
*/
public Location getStartLocation(){
return startLocation;
}
/**
 Determine if the startLocation field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetStartLocation() {
    return this.startLocation != null ;
}

/**
Set the Location serial indicating the region associated with "Troops in Region" or "Troops Not in Region", in attribute StartTrigger.

@param value  An instances of type {@link Location}
@return The current JammingPlan object instance
@since 3.1.0
*/
public JammingPlan withStartLocation(Location value) {
this.startLocation = value;
return this;
}

  /**
   * Update the SSRF data type references in this JammingPlan record.
   * <p>
 */
public void prepare() {
this.startLocationRef = startLocation !=null? startLocation.getSerial() : null;
}

/**
   * Update the SSRF data type references in this JammingPlan record after loading from XML.

   * This method builds the transient {@link #startLocation} with values
   * from the imported {@link #startLocationRef} field. This method should
   * typically be called after the JammingPlan is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (startLocationRef==null || !startLocationRef.isSetValue() ) {return;}
for(Location instance : root.getLocation()) {
if(startLocationRef.equals(instance.getSerial())){
startLocation = instance;
return;}
}}//</editor-fold>

}
