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
RadiationPlan (US) is used to describe the high level plans that can be directed at a specific target or the mission plan for a group of targets.

Sub-Elements are {@link JammingAuthority}, {@link JammingPlan}

Example: <pre>
* &lt;RadiationPlan cls="U"&gt;
*   &lt;Serial cls="U"&gt;USA::RP:123&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;FreqMax cls="U"&gt;3107.56&lt;/FreqMax&gt;
*   &lt;FreqMin cls="U"&gt;2999.753&lt;/FreqMin&gt;
*   &lt;JCALevel cls="U"&gt;3&lt;/JCALevel&gt;
*   &lt;LocationRef cls="U"&gt;D:AR:LO:123&lt;/LocationRef&gt;
*   &lt;Name cls="U"&gt;A37&lt;/Name&gt;
*   &lt;StartDateTime cls="U"&gt;2011-12-25T01:23:001Z&lt;/StartDateTime&gt;
*   &lt;StopDateTime cls="U"&gt;2011-12-25T01:29:013Z&lt;/StopDateTime&gt;
*   &lt;Version cls="U"&gt;1673&lt;/Version&gt;
*   &lt;JammingAuthority&gt;
*     &lt;JCACallSign cls="U"&gt;Checkmate 32&lt;/JCACallSign&gt;
*     &lt;JCAFreq cls="U"&gt;3002&lt;/JCAFreq&gt;
*     &lt;JCALevel cls="U"&gt;3&lt;/JCALevel&gt;
*     &lt;JCAState cls="U"&gt;Denied&lt;/JCAState&gt;
*   &lt;/JammingAuthority&gt;
*   &lt;JammingPlan&gt;
*     &lt;Name cls="U"&gt;A1370003&lt;/Name&gt;
*     &lt;NumFreqs cls="U"&gt;204&lt;/NumFreqs&gt;
*     &lt;Priority cls="U"&gt;High&lt;/Priority&gt;
*     &lt;RequiredEffect cls="U"&gt;Deception &lt;/RequiredEffect&gt;
*     &lt;RequiredPerformance cls="U"&gt;Partially Effective&lt;/RequiredPerformance&gt;
*     &lt;StartDateTime cls="U"&gt;2011-12-25T01:23:001Z&lt;/StartDateTime&gt;
*     &lt;StartLocationRef cls="U"&gt;D:AR:LO:123&lt;/StartLocationRef&gt;
*     &lt;StartTrigger cls="U"&gt;Troops in Contact&lt;/StartTrigger&gt;
*     &lt;StopDateTime cls="U"&gt;2011-12-25T01:29:013Z&lt;/StopDateTime&gt;
*     &lt;StopLocationRef cls="U"&gt;D:AR:LO:123&lt;/StopLocationRef&gt;
*     &lt;StopTrigger cls="U"&gt;Troops Not in Contact&lt;/StopTrigger&gt;
*     &lt;Version cls="U"&gt;1673&lt;/Version&gt;
*     &lt;Level3Auth cls="U"&gt;Yes&lt;/Level3Auth&gt;
*     &lt;StandOffDist cls="U"&gt;120&lt;/StandOffDist&gt;
*     &lt;JammingTarget &gt;
*       &lt;AntStabilisation cls="U"&gt;At Bearing&lt;/AntStabilisation&gt;
*       &lt;Bearing cls="U"&gt;271&lt;/Bearing&gt;
*       &lt;FreqMax cls="U"&gt;3107.56&lt;/FreqMax&gt;
*       &lt;FreqMin cls="U"&gt;2999.753&lt;/FreqMin&gt;
*       &lt;Lat cls="U"&gt;394217.12N&lt;/Lat&gt;
*       &lt;LoadsetRef cls="U"&gt;D:AR:LO:123&lt;/LoadsetRef&gt;
*       &lt;LocationRef cls="U"&gt;D:AR:LO:123&lt;/LocationRef&gt;
*       &lt;Lon cls="U"&gt;792823.5W&lt;/Lon&gt;
*       &lt;PolarisationType cls="U"&gt;Oblique, angled, crossed&lt;/PolarisationType&gt;
*       &lt;Power cls="U"&gt;100&lt;/Power&gt;
*       &lt;TargetID cls="U"&gt;67981&lt;/TargetID&gt;
*       &lt;JammingPerformance&gt;
*         &lt;ActualEffect cls="U"&gt;Deception &lt;/ActualEffect&gt;
*         &lt;ActualPerformance cls="U"&gt;Partially Effective&lt;/ActualPerformance&gt;
*         &lt;ContinuousUpdate cls="U"&gt;Yes&lt;/ContinuousUpdate&gt;
*         &lt;DesiredEffect cls="U"&gt;Deception &lt;/DesiredEffect&gt;
*         &lt;DesiredPerformance cls="U"&gt;Partially Effective&lt;/DesiredPerformance&gt;
*       &lt;/JammingPerformance&gt;
*     &lt;/JammingTarget &gt;
*   &lt;/JammingPlan&gt;
* &lt;/RadiationPlan&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadiationPlan", propOrder = {
    "freqMax",
    "freqMin",
    "jcaLevel",
    "locationRef",
    "name",
    "startDateTime",
    "stopDateTime",
    "version",
    "jammingAuthority",
    "jammingPlan"
})
public class RadiationPlan
    extends Common
{

/**
US:FreqMax - Maximum Frequency (Optional) 

The frequency range maximum value planned for denial of use.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "FreqMax", required = false)
    private FreqM freqMax;
/**
US:FreqMin - Minimum Frequency (Required) 

The frequency range minimum value planned for denial of use.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "FreqMin", required = true)
      private  FreqM freqMin;
/**
US:JCALevel - Authorisation Level (Optional) 

The level of joint control authorization (JCA) required for the jamming plan.

Format is UN(2)
@since 3.1.0
*/
    @XmlElement(name = "JCALevel", required = false)
    private UN2 jcaLevel;
/**
US:LocationRef - Plan Location Serial (Optional) 

The unique reference serial of an existing Location dataset.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "LocationRef", required = false)
    private Serial locationRef;
/**
In Data Item Name  (US),  enter a descriptive name for the Radiation Plan.
@since 3.1.0
*/
    @XmlElement(name = "Name", required = false)
    private S100 name;
/**
US:StartDateTime - Start Time (Optional) 

The timestamp when the denial of spectrum use is planned to begin.

Format is DateTime
@since 3.1.0
*/
    @XmlElement(name = "StartDateTime", required = false)
    private DT startDateTime;
/**
US:StopDateTime - Stop Time (Optional) 

The timestamp when the denial of spectrum use is planned to be halted.

Format is DateTime
@since 3.1.0
*/
    @XmlElement(name = "StopDateTime", required = false)
    private DT stopDateTime;
/**
US:Version - Radiation Plan Version (Optional) 

The current version of the Radiation Plan.

Format is S10
@since 3.1.0
*/
    @XmlElement(name = "Version", required = false)
    private S10 version;
/**
US:JammingAuthority (Optional)

JammingAuthority (US) describes the Jamming Control Authority (JCA) authorisation information for the jamming plan and the controls affecting the level of authorisation.
@since 3.1.0
*/
    @XmlElement(name = "JammingAuthority")
      private  Set<JammingAuthority> jammingAuthority;
/**
US:JammingPlan (Optional)

JammingPlan (US) describes the start and stop conditions, priorities, desired effect, and desired effectiveness.
@since 3.1.0
*/
    @XmlElement(name = "JammingPlan")
      private  Set<JammingPlan> jammingPlan;

/**
Get the frequency range maximum value planned for denial of use.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

@return the FreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMax() {
        return freqMax;
    }

/**
Set the frequency range maximum value planned for denial of use.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

@param value the FreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setFreqMax(FreqM value) {
        this.freqMax = value;
    }

/**
Determine if the FreqMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqMax() {
        return (this.freqMax!= null);
    }

/**
Get the frequency range minimum value planned for denial of use.

@return the FreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMin() {
        return freqMin;
    }

/**
Set the frequency range minimum value planned for denial of use.

@param value the FreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setFreqMin(FreqM value) {
        this.freqMin = value;
    }

/**
Determine if the FreqMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqMin() {
        return (this.freqMin!= null);
    }

/**
Get the level of joint control authorization (JCA) required for the jamming plan.

@return the JCALevel value in a {@link TUN2} data type
@since 3.1.0
*/
public UN2 getJCALevel() {
        return jcaLevel;
    }

/**
Set the level of joint control authorization (JCA) required for the jamming plan.

@param value the JCALevel value in a {@link TUN2} data type
@since 3.1.0
*/
public void setJCALevel(UN2 value) {
        this.jcaLevel = value;
    }

/**
Determine if the JCALevel is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetJCALevel() {
        return (this.jcaLevel!= null);
    }

/**
Get the unique reference serial of an existing Location dataset.

@return the LocationRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getLocation()} instead.
*/
@Deprecated
public Serial getLocationRef() {
        return locationRef;
    }

/**
Set the unique reference serial of an existing Location dataset.

@param value the LocationRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setLocation(Location)} instead.
*/
@Deprecated
public void setLocationRef(Serial value) {
        this.locationRef = value;
    }

/**
Determine if the LocationRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLocationRef() {
        return (this.locationRef!= null);
    }

/**
Get In Data Item Name  (US),  enter a descriptive name for the Radiation Plan.

@return the Name value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getName() {
        return name;
    }

/**
Set In Data Item Name  (US),  enter a descriptive name for the Radiation Plan.

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
Get the timestamp when the denial of spectrum use is planned to begin.

@return the StartDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public DT getStartDateTime() {
        return startDateTime;
    }

/**
Set the timestamp when the denial of spectrum use is planned to begin.

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
Get the timestamp when the denial of spectrum use is planned to be halted.

@return the StopDateTime value in a {@link TDT} data type
@since 3.1.0
*/
public DT getStopDateTime() {
        return stopDateTime;
    }

/**
Set the timestamp when the denial of spectrum use is planned to be halted.

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
Get the current version of the Radiation Plan.

@return the Version value in a {@link TS10} data type
@since 3.1.0
*/
public S10 getVersion() {
        return version;
    }

/**
Set the current version of the Radiation Plan.

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
Get the US:JammingAuthority

Complex element JammingAuthority (US) describes the Jamming Control Authority (JCA) authorisation information for the jamming plan and the controls affecting the level of authorisation.

@return  a {@link JammingAuthority} instance
@since 3.1.0
*/
    public Set<JammingAuthority> getJammingAuthority() {
        if (jammingAuthority == null) {
            jammingAuthority = new HashSet<JammingAuthority>();
        }
        return this.jammingAuthority;
    }

/**
Determine if the JammingAuthority is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetJammingAuthority() {
        return ((this.jammingAuthority!= null)&&(!this.jammingAuthority.isEmpty()));
    }

/**
  Clear the JammingAuthority field. This sets the field to null.
 */
    public void unsetJammingAuthority() {
        this.jammingAuthority = null;
    }

/**
Get the US:JammingPlan

Complex element JammingPlan (US) describes the start and stop conditions, priorities, desired effect, and desired effectiveness.

@return  a {@link JammingPlan} instance
@since 3.1.0
*/
    public Set<JammingPlan> getJammingPlan() {
        if (jammingPlan == null) {
            jammingPlan = new HashSet<JammingPlan>();
        }
        return this.jammingPlan;
    }

/**
Determine if the JammingPlan is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetJammingPlan() {
        return ((this.jammingPlan!= null)&&(!this.jammingPlan.isEmpty()));
    }

/**
  Clear the JammingPlan field. This sets the field to null.
 */
    public void unsetJammingPlan() {
        this.jammingPlan = null;
    }

/**
Set the frequency range maximum value planned for denial of use.

[XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.

@param value  An instances of type {@link Double}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withFreqMax(Double value) {
           setFreqMax(new FreqM(value));
        return this;
    }

/**
Set the frequency range minimum value planned for denial of use.

@param value  An instances of type {@link TFreqM}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withFreqMin(TFreqM value) {
        return this;
    }

/**
Set the level of joint control authorization (JCA) required for the jamming plan.

@param value  An instances of type {@link Integer}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withJCALevel(Integer value) {
           setJCALevel(new UN2(value));
        return this;
    }

/**
Set the unique reference serial of an existing Location dataset.

@param value  An instances of type {@link Serial}
@return The current RadiationPlan object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withLocation(Location)} instead.
*/
@Deprecated
    public RadiationPlan withLocationRef(Serial value) {
           setLocationRef(value);
        return this;
    }

/**
Set In Data Item Name  (US),  enter a descriptive name for the Radiation Plan.

@param value  An instances of type {@link String}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withName(String value) {
           setName(new S100(value));
        return this;
    }

/**
Set the timestamp when the denial of spectrum use is planned to begin.

@param value  An instances of type {@link Calendar}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withStartDateTime(Calendar value) {
           setStartDateTime(new DT(value));
        return this;
    }
/**
Set the timestamp when the denial of spectrum use is planned to begin.

@param value  An instances of type {@link Date}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withStartDateTime(Date value) {
           setStartDateTime(new DT(value));
        return this;
    }

/**
Set the timestamp when the denial of spectrum use is planned to be halted.

@param value  An instances of type {@link Calendar}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withStopDateTime(Calendar value) {
           setStopDateTime(new DT(value));
        return this;
    }
/**
Set the timestamp when the denial of spectrum use is planned to be halted.

@param value  An instances of type {@link Date}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withStopDateTime(Date value) {
           setStopDateTime(new DT(value));
        return this;
    }

/**
Set the current version of the Radiation Plan.

@param value  An instances of type {@link String}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withVersion(String value) {
           setVersion(new S10(value));
        return this;
    }

/**
Set the US:JammingAuthority

Complex element JammingAuthority (US) describes the Jamming Control Authority (JCA) authorisation information for the jamming plan and the controls affecting the level of authorisation.

@param values  One or more instances of type {@link JammingAuthority...}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withJammingAuthority(JammingAuthority... values) {
        if (values!= null) {
            for (JammingAuthority value: values) {
                getJammingAuthority().add(value);
            }
        }
        return this;
    }

/**
Set the US:JammingAuthority

Complex element JammingAuthority (US) describes the Jamming Control Authority (JCA) authorisation information for the jamming plan and the controls affecting the level of authorisation.

@param values  A collection of {@link JammingAuthority} instances
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withJammingAuthority(Collection<JammingAuthority> values) {
        if (values!= null) {
            getJammingAuthority().addAll(values);
        }
        return this;
    }

/**
Set the US:JammingPlan

Complex element JammingPlan (US) describes the start and stop conditions, priorities, desired effect, and desired effectiveness.

@param values  One or more instances of type {@link JammingPlan...}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withJammingPlan(JammingPlan... values) {
        if (values!= null) {
            for (JammingPlan value: values) {
                getJammingPlan().add(value);
            }
        }
        return this;
    }

/**
Set the US:JammingPlan

Complex element JammingPlan (US) describes the start and stop conditions, priorities, desired effect, and desired effectiveness.

@param values  A collection of {@link JammingPlan} instances
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withJammingPlan(Collection<JammingPlan> values) {
        if (values!= null) {
            getJammingPlan().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withCaseNum(CaseNum... values) {
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
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withRemarks(Remarks... values) {
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
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withReleasability(ListCCY... values) {
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
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withRemarkRef(BigInteger... values) {
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
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withExtReferences(BigInteger... values) {
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
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current RadiationPlan object instance
@since 3.1.0
*/
    public RadiationPlan withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this RadiationPlan instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "RadiationPlan {"
 + (freqMax !=null? " freqMax [" + freqMax +"]" : "") 
 + (freqMin !=null? " freqMin [" + freqMin +"]" : "") 
 + (jammingAuthority !=null? " jammingAuthority [" + jammingAuthority +"]" : "") 
 + (jammingPlan !=null? " jammingPlan [" + jammingPlan +"]" : "") 
 + (jcaLevel !=null? " jcaLevel [" + jcaLevel +"]" : "") 
 + (locationRef !=null? " locationRef [" + locationRef +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") 
 + (startDateTime !=null? " startDateTime [" + startDateTime +"]" : "") 
 + (stopDateTime !=null? " stopDateTime [" + stopDateTime +"]" : "") 
 + (version !=null? " version [" + version +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link RadiationPlan} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link FreqM FreqMin}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetFreqMin();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
US:LocationRef - Plan Location Serial (Optional) 

The unique reference serial of an existing Location dataset.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Location location;

/**
Get the unique reference serial of an existing Location dataset.

@return  a {@link Location} instance
@since 3.1.0
*/
public Location getLocation(){
return location;
}
/**
 Determine if the location field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetLocation() {
    return this.location != null ;
}

/**
Set the unique reference serial of an existing Location dataset.

@param value  An instances of type {@link Location}
@return The current RadiationPlan object instance
@since 3.1.0
*/
public RadiationPlan withLocation(Location value) {
this.location = value;
return this;
}

  /**
   * Update the SSRF data type references in this RadiationPlan record.
   * <p>
 */
  @Override
public void prepare() {
super.prepare();
this.locationRef = location !=null? location.getSerial() : null;
}

/**
   * Update the SSRF data type references in this RadiationPlan record after loading from XML.

   * This method builds the transient {@link #location} with values
   * from the imported {@link #locationRef} field. This method should
   * typically be called after the RadiationPlan is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (locationRef==null || !locationRef.isSetValue() ) {return;}
for(Location instance : root.getLocation()) {
if(locationRef.equals(instance.getSerial())){
location = instance;
return;}
}}//</editor-fold>

}
