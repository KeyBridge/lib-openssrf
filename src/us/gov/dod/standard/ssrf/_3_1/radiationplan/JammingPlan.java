/* 
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1.radiationplan;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.Location;
import us.gov.dod.standard.ssrf._3_1.RadiationPlan;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.*;

/**
 * JammingPlan (US) describes the start and stop conditions, priorities, desired
 * effect, and desired effectiveness.
 * <p>
 * Element of {@link RadiationPlan}
 * <p>
 * Sub-Element is {@link JammingTarget}
 * <p>
 * Example: See {@link RadiationPlan}.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
   * Name (US), enter a unique name (within the parent RadiationPlan) for the
   * Jamming Plan.
   */
  @XmlElement(name = "Name", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
  /**
   * US:NumFreqs - Frequency Count (Optional)
   * <p>
   * The number of discrete frequencies or frequency ranges associated with this
   * Jamming Plan. There SHOULD be one JammingTarget sub-element for each
   * discrete frequency or frequency range.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumFreqs", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numFreqs;
  /**
   * US:Priority - Plan Priority (Required)
   * <p>
   * The relative priority of the service request.
   * <p>
   * Format is L:UWE
   */
  @XmlElement(name = "Priority", required = true)
  private TString priority;
  /**
   * US:RequiredEffect - Required Effect (Optional)
   * <p>
   * The desired effect of this service request.
   * <p>
   * Format is L:UWA
   */
  @XmlElement(name = "RequiredEffect", required = false)
  private TString requiredEffect;
  /**
   * US:RequiredPerformance - Required Performance (Optional)
   * <p>
   * The desired effectiveness of the service request. Example: the minimum
   * percentage of known enemy command and control nodes that must be rendered
   * inoperable for successful mission accomplishment.
   * <p>
   * Format is L:UWB
   */
  @XmlElement(name = "RequiredPerformance", required = false)
  private TString requiredPerformance;
  /**
   * US:StartDateTime - Start Timestamp (Optional)
   * <p>
   * The date/time stamp when to initiate the jamming, if "Date/Time" is used in
   * element StartTrigger. Entries must be equal to or later than
   * RadiationPlan.StartDateTime, and less than RadiationPlan.StopDateTime.
   * <p>
   * Format is DateTime
   */
  @XmlElement(name = "StartDateTime", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar startDateTime;
  /**
   * US:StartLocationRef - Start Location Serial (Optional)
   * <p>
   * The Location serial indicating the region associated with "Troops in
   * Region" or "Troops Not in Region", in attribute StartTrigger.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "StartLocationRef", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private TSerial startLocationRef;
  /**
   * US:StartTrigger - Start Trigger (Required)
   * <p>
   * The type of trigger that indicates when it is time to start jamming.
   * <p>
   * Format is L:UWF
   */
  @XmlElement(name = "StartTrigger", required = true)
  private TString startTrigger;
  /**
   * US:StopDateTime - Stop Timestamp (Optional)
   * <p>
   * The date/time stamp when to stop the jamming, if "Date/Time" is used in
   * element StopTrigger. Entries must be after RadiationPlan.StartDateTime, and
   * be equal to or less than RadiationPlan.StopDateTime.
   * <p>
   * Format is DateTime
   */
  @XmlElement(name = "StopDateTime", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar stopDateTime;
  /**
   * US:StopLocationRef - Stop Location Serial (Optional)
   * <p>
   * The Location serial indicating the region associated with "Troops in
   * Region" or "Troops Not in Region", in attribute StopTrigger.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "StopLocationRef", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString stopLocationRef;
  /**
   * US:StopTrigger - Stop Trigger (Required)
   * <p>
   * The type of trigger that indicates when it is time to stop jamming.
   * <p>
   * Format is L:UWF
   */
  @XmlElement(name = "StopTrigger", required = true)
  private TString stopTrigger;
  /**
   * US:Version - Plan Version (Optional)
   * <p>
   * The current version of the Jamming Plan.
   * <p>
   * Format is S10
   */
  @XmlElement(name = "Version", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS10.class)
  private TString version;
  /**
   * Level3Auth (US), indicate if a request should go directly to third-level
   * authorization. If "Yes" is entered, then for Radiation Plan approval, the
   * JammingAuthority complex element MUST contain an entry.
   */
  @XmlElement(name = "Level3Auth", required = true)
  private TString level3Auth;
  /**
   * US:StandOffDist - Stand Off Distance (Optional)
   * <p>
   * The required distance from the jammer to non-threat equipment, in km.
   * <p>
   * Format is UN(9,4) (km)
   */
  @XmlElement(name = "StandOffDist", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDISTSPACE.class)
  private TDecimal standOffDist;
  /**
   * US:JammingTarget (Required)
   * <p>
   * JammingTarget (US) describes the target location and identifies the jamming
   * loadset to be used.
   */
  @XmlElement(name = "JammingTarget", required = true)
  private Set<JammingTarget> jammingTarget;

  /**
   * Get Name (US), enter a unique name (within the parent RadiationPlan) for
   * the Jamming Plan.
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set Name (US), enter a unique name (within the parent RadiationPlan) for
   * the Jamming Plan.
   * <p>
   * @param value the Name value in a {@link TString} data type
   */
  public void setName(TString value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get the number of discrete frequencies or frequency ranges associated with
   * this Jamming Plan. There SHOULD be one JammingTarget sub-element for each
   * discrete frequency or frequency range.
   * <p>
   * @return the NumFreqs value in a {@link TInteger} data type
   */
  public TInteger getNumFreqs() {
    return numFreqs;
  }

  /**
   * Set the number of discrete frequencies or frequency ranges associated with
   * this Jamming Plan. There SHOULD be one JammingTarget sub-element for each
   * discrete frequency or frequency range.
   * <p>
   * @param value the NumFreqs value in a {@link TInteger} data type
   */
  public void setNumFreqs(TInteger value) {
    this.numFreqs = value;
  }

  /**
   * Determine if the NumFreqs is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumFreqs() {
    return (this.numFreqs != null ? this.numFreqs.isSetValue() : false);
  }

  /**
   * Get the relative priority of the service request.
   * <p>
   * @return the Priority value in a {@link TString} data type
   */
  public TString getPriority() {
    return priority;
  }

  /**
   * Set the relative priority of the service request.
   * <p>
   * @param value the Priority value in a {@link TString} data type
   */
  public void setPriority(TString value) {
    this.priority = value;
  }

  /**
   * Determine if the Priority is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPriority() {
    return (this.priority != null ? this.priority.isSetValue() : false);
  }

  /**
   * Get the desired effect of this service request.
   * <p>
   * @return the RequiredEffect value in a {@link TString} data type
   */
  public TString getRequiredEffect() {
    return requiredEffect;
  }

  /**
   * Set the desired effect of this service request.
   * <p>
   * @param value the RequiredEffect value in a {@link TString} data type
   */
  public void setRequiredEffect(TString value) {
    this.requiredEffect = value;
  }

  /**
   * Determine if the RequiredEffect is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRequiredEffect() {
    return (this.requiredEffect != null ? this.requiredEffect.isSetValue() : false);
  }

  /**
   * Get the desired effectiveness of the service request. Example: the minimum
   * percentage of known enemy command and control nodes that must be rendered
   * inoperable for successful mission accomplishment.
   * <p>
   * @return the RequiredPerformance value in a {@link TString} data type
   */
  public TString getRequiredPerformance() {
    return requiredPerformance;
  }

  /**
   * Set the desired effectiveness of the service request. Example: the minimum
   * percentage of known enemy command and control nodes that must be rendered
   * inoperable for successful mission accomplishment.
   * <p>
   * @param value the RequiredPerformance value in a {@link TString} data type
   */
  public void setRequiredPerformance(TString value) {
    this.requiredPerformance = value;
  }

  /**
   * Determine if the RequiredPerformance is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRequiredPerformance() {
    return (this.requiredPerformance != null ? this.requiredPerformance.isSetValue() : false);
  }

  /**
   * Get the date/time stamp when to initiate the jamming, if "Date/Time" is
   * used in element StartTrigger. Entries must be equal to or later than
   * RadiationPlan.StartDateTime, and less than RadiationPlan.StopDateTime.
   * <p>
   * @return the StartDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getStartDateTime() {
    return startDateTime;
  }

  /**
   * Set the date/time stamp when to initiate the jamming, if "Date/Time" is
   * used in element StartTrigger. Entries must be equal to or later than
   * RadiationPlan.StartDateTime, and less than RadiationPlan.StopDateTime.
   * <p>
   * @param value the StartDateTime value in a {@link TCalendar} data type
   */
  public void setStartDateTime(TCalendar value) {
    this.startDateTime = value;
  }

  /**
   * Determine if the StartDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStartDateTime() {
    return (this.startDateTime != null ? this.startDateTime.isSetValue() : false);
  }

  /**
   * Get the Location serial indicating the region associated with "Troops in
   * Region" or "Troops Not in Region", in attribute StartTrigger.
   * <p>
   * @return the StartLocationRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getStartLocation()} instead.
   */
  @Deprecated
  public TSerial getStartLocationRef() {
    return startLocationRef;
  }

  /**
   * Set the Location serial indicating the region associated with "Troops in
   * Region" or "Troops Not in Region", in attribute StartTrigger.
   * <p>
   * @param value the StartLocationRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setStartLocation(Location)} instead.
   */
  @Deprecated
  public void setStartLocationRef(TSerial value) {
    this.startLocationRef = value;
  }

  /**
   * Determine if the StartLocationRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStartLocationRef() {
    return (this.startLocationRef != null ? this.startLocationRef.isSetValue() : false);
  }

  /**
   * Get the type of trigger that indicates when it is time to start jamming.
   * <p>
   * @return the StartTrigger value in a {@link TString} data type
   */
  public TString getStartTrigger() {
    return startTrigger;
  }

  /**
   * Set the type of trigger that indicates when it is time to start jamming.
   * <p>
   * @param value the StartTrigger value in a {@link TString} data type
   */
  public void setStartTrigger(TString value) {
    this.startTrigger = value;
  }

  /**
   * Determine if the StartTrigger is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStartTrigger() {
    return (this.startTrigger != null ? this.startTrigger.isSetValue() : false);
  }

  /**
   * Get the date/time stamp when to stop the jamming, if "Date/Time" is used in
   * element StopTrigger. Entries must be after RadiationPlan.StartDateTime, and
   * be equal to or less than RadiationPlan.StopDateTime.
   * <p>
   * @return the StopDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getStopDateTime() {
    return stopDateTime;
  }

  /**
   * Set the date/time stamp when to stop the jamming, if "Date/Time" is used in
   * element StopTrigger. Entries must be after RadiationPlan.StartDateTime, and
   * be equal to or less than RadiationPlan.StopDateTime.
   * <p>
   * @param value the StopDateTime value in a {@link TCalendar} data type
   */
  public void setStopDateTime(TCalendar value) {
    this.stopDateTime = value;
  }

  /**
   * Determine if the StopDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStopDateTime() {
    return (this.stopDateTime != null ? this.stopDateTime.isSetValue() : false);
  }

  /**
   * Get the Location serial indicating the region associated with "Troops in
   * Region" or "Troops Not in Region", in attribute StopTrigger.
   * <p>
   * @return the StopLocationRef value in a {@link TString} data type
   */
  public TString getStopLocationRef() {
    return stopLocationRef;
  }

  /**
   * Set the Location serial indicating the region associated with "Troops in
   * Region" or "Troops Not in Region", in attribute StopTrigger.
   * <p>
   * @param value the StopLocationRef value in a {@link TString} data type
   */
  public void setStopLocationRef(TString value) {
    this.stopLocationRef = value;
  }

  /**
   * Determine if the StopLocationRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStopLocationRef() {
    return (this.stopLocationRef != null ? this.stopLocationRef.isSetValue() : false);
  }

  /**
   * Get the type of trigger that indicates when it is time to stop jamming.
   * <p>
   * @return the StopTrigger value in a {@link TString} data type
   */
  public TString getStopTrigger() {
    return stopTrigger;
  }

  /**
   * Set the type of trigger that indicates when it is time to stop jamming.
   * <p>
   * @param value the StopTrigger value in a {@link TString} data type
   */
  public void setStopTrigger(TString value) {
    this.stopTrigger = value;
  }

  /**
   * Determine if the StopTrigger is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStopTrigger() {
    return (this.stopTrigger != null ? this.stopTrigger.isSetValue() : false);
  }

  /**
   * Get the current version of the Jamming Plan.
   * <p>
   * @return the Version value in a {@link TString} data type
   */
  public TString getVersion() {
    return version;
  }

  /**
   * Set the current version of the Jamming Plan.
   * <p>
   * @param value the Version value in a {@link TString} data type
   */
  public void setVersion(TString value) {
    this.version = value;
  }

  /**
   * Determine if the Version is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVersion() {
    return (this.version != null ? this.version.isSetValue() : false);
  }

  /**
   * Get Level3Auth (US), indicate if a request should go directly to
   * third-level authorization. If "Yes" is entered, then for Radiation Plan
   * approval, the JammingAuthority complex element MUST contain an entry.
   * <p>
   * @return the Level3Auth value in a {@link TString} data type
   */
  public TString getLevel3Auth() {
    return level3Auth;
  }

  /**
   * Set Level3Auth (US), indicate if a request should go directly to
   * third-level authorization. If "Yes" is entered, then for Radiation Plan
   * approval, the JammingAuthority complex element MUST contain an entry.
   * <p>
   * @param value the Level3Auth value in a {@link TString} data type
   */
  public void setLevel3Auth(TString value) {
    this.level3Auth = value;
  }

  /**
   * Determine if the Level3Auth is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLevel3Auth() {
    return (this.level3Auth != null ? this.level3Auth.isSetValue() : false);
  }

  /**
   * Get the required distance from the jammer to non-threat equipment, in km.
   * <p>
   * @return the StandOffDist value in a {@link TDecimal} data type
   */
  public TDecimal getStandOffDist() {
    return standOffDist;
  }

  /**
   * Set the required distance from the jammer to non-threat equipment, in km.
   * <p>
   * @param value the StandOffDist value in a {@link TDecimal} data type
   */
  public void setStandOffDist(TDecimal value) {
    this.standOffDist = value;
  }

  /**
   * Determine if the StandOffDist is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStandOffDist() {
    return (this.standOffDist != null ? this.standOffDist.isSetValue() : false);
  }

  /**
   * Get the US:JammingTarget
   * <p>
   * Complex element JammingTarget (US) describes the target location and
   * identifies the jamming loadset to be used.
   * <p>
   * @return a non-null but possibly empty list of {@link JammingTarget}
   *         instances
   */
  public Set<JammingTarget> getJammingTarget() {
    if (jammingTarget == null) {
      jammingTarget = new HashSet<>();
    }
    return this.jammingTarget;
  }

  /**
   * Determine if the JammingTarget is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJammingTarget() {
    return ((this.jammingTarget != null) && (!this.jammingTarget.isEmpty()));
  }

  /**
   * Clear the JammingTarget field. This sets the field to null.
   */
  public void unsetJammingTarget() {
    this.jammingTarget = null;
  }

  /**
   * Set Name (US), enter a unique name (within the parent RadiationPlan) for
   * the Jamming Plan.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set the number of discrete frequencies or frequency ranges associated with
   * this Jamming Plan. There SHOULD be one JammingTarget sub-element for each
   * discrete frequency or frequency range.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withNumFreqs(Integer value) {
    setNumFreqs(new TInteger(value));
    return this;
  }

  /**
   * Set the relative priority of the service request.
   * <p>
   * @param value An instances of type {@link ListUWE}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withPriority(ListUWE value) {
    setPriority(new TString(value.value()));
    return this;
  }

  /**
   * Set the desired effect of this service request.
   * <p>
   * @param value An instances of type {@link ListUWA}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withRequiredEffect(ListUWA value) {
    setRequiredEffect(new TString(value.value()));
    return this;
  }

  /**
   * Set the desired effectiveness of the service request. Example: the minimum
   * percentage of known enemy command and control nodes that must be rendered
   * inoperable for successful mission accomplishment.
   * <p>
   * @param value An instances of type {@link ListUWB}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withRequiredPerformance(ListUWB value) {
    setRequiredPerformance(new TString(value.value()));
    return this;
  }

  /**
   * Set the date/time stamp when to initiate the jamming, if "Date/Time" is
   * used in element StartTrigger. Entries must be equal to or later than
   * RadiationPlan.StartDateTime, and less than RadiationPlan.StopDateTime.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withStartDateTime(Calendar value) {
    setStartDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the date/time stamp when to initiate the jamming, if "Date/Time" is
   * used in element StartTrigger. Entries must be equal to or later than
   * RadiationPlan.StartDateTime, and less than RadiationPlan.StopDateTime.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withStartDateTime(Date value) {
    setStartDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the Location serial indicating the region associated with "Troops in
   * Region" or "Troops Not in Region", in attribute StartTrigger.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JammingPlan object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withStartLocation(Location)} instead.
   */
  @Deprecated
  public JammingPlan withStartLocationRef(TSerial value) {
    setStartLocationRef(value);
    return this;
  }

  /**
   * Set the type of trigger that indicates when it is time to start jamming.
   * <p>
   * @param value An instances of type {@link ListUWF}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withStartTrigger(ListUWF value) {
    setStartTrigger(new TString(value.value()));
    return this;
  }

  /**
   * Set the date/time stamp when to stop the jamming, if "Date/Time" is used in
   * element StopTrigger. Entries must be after RadiationPlan.StartDateTime, and
   * be equal to or less than RadiationPlan.StopDateTime.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withStopDateTime(Calendar value) {
    setStopDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the date/time stamp when to stop the jamming, if "Date/Time" is used in
   * element StopTrigger. Entries must be after RadiationPlan.StartDateTime, and
   * be equal to or less than RadiationPlan.StopDateTime.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withStopDateTime(Date value) {
    setStopDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the Location serial indicating the region associated with "Troops in
   * Region" or "Troops Not in Region", in attribute StopTrigger.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withStopLocationRef(String value) {
    setStopLocationRef(new TString(value));
    return this;
  }

  /**
   * Set the type of trigger that indicates when it is time to stop jamming.
   * <p>
   * @param value An instances of type {@link ListUWF}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withStopTrigger(ListUWF value) {
    setStopTrigger(new TString(value.value()));
    return this;
  }

  /**
   * Set the current version of the Jamming Plan.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withVersion(String value) {
    setVersion(new TString(value));
    return this;
  }

  /**
   * Set Level3Auth (US), indicate if a request should go directly to
   * third-level authorization. If "Yes" is entered, then for Radiation Plan
   * approval, the JammingAuthority complex element MUST contain an entry.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withLevel3Auth(ListCBO value) {
    setLevel3Auth(new TString(value.value()));
    return this;
  }

  /**
   * Set the required distance from the jammer to non-threat equipment, in km.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withStandOffDist(Double value) {
    setStandOffDist(new TDecimal(value));
    return this;
  }

  /**
   * Set the US:JammingTarget
   * <p>
   * Complex element JammingTarget (US) describes the target location and
   * identifies the jamming loadset to be used.
   * <p>
   * @param values One or more instances of type {@link JammingTarget}
   * @return The current JammingPlan object instance
   */
  public JammingPlan withJammingTarget(JammingTarget... values) {
    if (values != null) {
      getJammingTarget().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:JammingTarget
   * <p>
   * Complex element JammingTarget (US) describes the target location and
   * identifies the jamming loadset to be used.
   * <p>
   * @param values A collection of {@link JammingTarget} instances
   * @return The current JammingPlan object instance
   */
  public JammingPlan withJammingTarget(Set<JammingTarget> values) {
    if (values != null) {
      getJammingTarget().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this JammingPlan instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "JammingPlan {"
      + (stopLocationRef != null ? " stopLocationRef [" + stopLocationRef + "]" : "")
      + (startDateTime != null ? " startDateTime [" + startDateTime + "]" : "")
      + (standOffDist != null ? " standOffDist [" + standOffDist + "]" : "")
      + (stopDateTime != null ? " stopDateTime [" + stopDateTime + "]" : "")
      + (jammingTarget != null ? " jammingTarget [" + jammingTarget + "]" : "")
      + (requiredEffect != null ? " requiredEffect [" + requiredEffect + "]" : "")
      + (stopTrigger != null ? " stopTrigger [" + stopTrigger + "]" : "")
      + (version != null ? " version [" + version + "]" : "")
      + (numFreqs != null ? " numFreqs [" + numFreqs + "]" : "")
      + (priority != null ? " priority [" + priority + "]" : "")
      + (name != null ? " name [" + name + "]" : "")
      + (level3Auth != null ? " level3Auth [" + level3Auth + "]" : "")
      + (startLocationRef != null ? " startLocationRef [" + startLocationRef + "]" : "")
      + (requiredPerformance != null ? " requiredPerformance [" + requiredPerformance + "]" : "")
      + (startTrigger != null ? " startTrigger [" + startTrigger + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JammingPlan} requires
   * {@link JammingTarget JammingTarget}, {@link TString Level3Auth}, {@link TString Priority}, {@link TString StartTrigger}, {@link TString StopTrigger}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetJammingTarget() && isSetLevel3Auth() && isSetPriority() && isSetStartTrigger() && isSetStopTrigger();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * US:StartLocationRef - Start Location Serial (Optional)
   * <p>
   * The Location serial indicating the region associated with "Troops in
   * Region" or "Troops Not in Region", in attribute StartTrigger.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Location startLocation;

  /**
   * Get the Location serial indicating the region associated with "Troops in
   * Region" or "Troops Not in Region", in attribute StartTrigger.
   * <p>
   * @return a {@link Location} instance
   * @since 3.1.0
   */
  public Location getStartLocation() {
    return startLocation;
  }

  /**
   * Determine if the startLocation field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStartLocation() {
    return this.startLocation != null;
  }

  /**
   * Set the Location serial indicating the region associated with "Troops in
   * Region" or "Troops Not in Region", in attribute StartTrigger.
   * <p>
   * @param value An instances of type {@link Location}
   * @return The current JammingPlan object instance
   * @since 3.1.0
   */
  public JammingPlan withStartLocation(Location value) {
    this.startLocation = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this JammingPlan record.
   * <p>
   * This method builds the exported {@link #startLocationRef} field with values
   * from the transient {@link #startLocation} field. This method should
   * typically be called after the JammingPlan is configured and (optionally)
   * before exporting an SSRF message.
   */
  public void prepare() {
    this.startLocationRef = startLocation != null ? startLocation.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this JammingPlan record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #startLocation} with values from
   * the imported {@link #startLocationRef} field. This method should typically
   * be called after the JammingPlan is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (startLocationRef == null || !startLocationRef.isSetValue()) {
      return;
    }
    for (Location instance : root.getLocation()) {
      if (startLocationRef.equals(instance.getSerial())) {
        startLocation = instance;
        return;
      }
    }
  }//</editor-fold>

}
