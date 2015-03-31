package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.radiationplan.JammingAuthority;
import us.gov.dod.standard.ssrf._3_1.radiationplan.JammingPlan;

/**
 * RadiationPlan (US) is used to describe the high level plans that can be
 * directed at a specific target or the mission plan for a group of targets.
 * <p>
 * Sub-Elements are {@link JammingAuthority}, {@link JammingPlan}
 * <p>
 * Example:
 * <pre>
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
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
public class RadiationPlan extends Common<RadiationPlan> {

  /**
   * US:FreqMax - Maximum Frequency (Optional)
   * <p>
   * The frequency range maximum value planned for denial of use.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMax", required = false)
  private FreqM freqMax;
  /**
   * US:FreqMin - Minimum Frequency (Required)
   * <p>
   * The frequency range minimum value planned for denial of use.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMin", required = true)
  private FreqM freqMin;
  /**
   * US:JCALevel - Authorisation Level (Optional)
   * <p>
   * The level of joint control authorization (JCA) required for the jamming
   * plan.
   * <p>
   * Format is UN(2)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JCALevel", required = false)
  private UN2 jcaLevel;
  /**
   * US:LocationRef - Plan Location Serial (Optional)
   * <p>
   * The unique reference serial of an existing Location dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LocationRef", required = false)
  private Serial locationRef;
  /**
   * In Data Item Name (US), enter a descriptive name for the Radiation Plan.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Name", required = false)
  private S100 name;
  /**
   * US:StartDateTime - Start Time (Optional)
   * <p>
   * The timestamp when the denial of spectrum use is planned to begin.
   * <p>
   * Format is DateTime
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StartDateTime", required = false)
  private DT startDateTime;
  /**
   * US:StopDateTime - Stop Time (Optional)
   * <p>
   * The timestamp when the denial of spectrum use is planned to be halted.
   * <p>
   * Format is DateTime
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StopDateTime", required = false)
  private DT stopDateTime;
  /**
   * US:Version - Radiation Plan Version (Optional)
   * <p>
   * The current version of the Radiation Plan.
   * <p>
   * Format is S10
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Version", required = false)
  private S10 version;
  /**
   * US:JammingAuthority (Optional)
   * <p>
   * JammingAuthority (US) describes the Jamming Control Authority (JCA)
   * authorisation information for the jamming plan and the controls affecting
   * the level of authorisation.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JammingAuthority")
  private Set<JammingAuthority> jammingAuthority;
  /**
   * US:JammingPlan (Optional)
   * <p>
   * JammingPlan (US) describes the start and stop conditions, priorities,
   * desired effect, and desired effectiveness.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JammingPlan")
  private Set<JammingPlan> jammingPlan;

  /**
   * No arg constructor. Initializes the Common required fields.
   */
  public RadiationPlan() {
    super();
  }

  /**
   * Get the frequency range maximum value planned for denial of use.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than
   * US:FreqMin..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMax() {
    return freqMax;
  }

  /**
   * Set the frequency range maximum value planned for denial of use.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than
   * US:FreqMin..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMax(FreqM value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get the frequency range minimum value planned for denial of use..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMin() {
    return freqMin;
  }

  /**
   * Set the frequency range minimum value planned for denial of use..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMin(FreqM value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get the level of joint control authorization (JCA) required for the jamming
   * plan..
   * <p>
   * @return a {@link UN2} instance
   * @since 3.1.0
   */
  public UN2 getJCALevel() {
    return jcaLevel;
  }

  /**
   * Set the level of joint control authorization (JCA) required for the jamming
   * plan..
   * <p>
   * @param value a {@link UN2} instance
   * @since 3.1.0
   */
  public void setJCALevel(UN2 value) {
    this.jcaLevel = value;
  }

  /**
   * Determine if the JCALevel is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJCALevel() {
    return (this.jcaLevel != null ? this.jcaLevel.isSetValue() : false);
  }

  /**
   * Get the unique reference serial of an existing Location dataset..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLocation()} instead.
   */
  @Deprecated
  public Serial getLocationRef() {
    return locationRef;
  }

  /**
   * Set the unique reference serial of an existing Location dataset..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLocation(Location)} instead.
   */
  @Deprecated
  public void setLocationRef(Serial value) {
    this.locationRef = value;
  }

  /**
   * Determine if the LocationRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocationRef() {
    return (this.locationRef != null ? this.locationRef.isSetValue() : false);
  }

  /**
   * Get In Data Item Name (US), enter a descriptive name for the Radiation
   * Plan..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getName() {
    return name;
  }

  /**
   * Set In Data Item Name (US), enter a descriptive name for the Radiation
   * Plan..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setName(S100 value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get the timestamp when the denial of spectrum use is planned to begin..
   * <p>
   * @return a {@link DT} instance
   * @since 3.1.0
   */
  public DT getStartDateTime() {
    return startDateTime;
  }

  /**
   * Set the timestamp when the denial of spectrum use is planned to begin..
   * <p>
   * @param value a {@link DT} instance
   * @since 3.1.0
   */
  public void setStartDateTime(DT value) {
    this.startDateTime = value;
  }

  /**
   * Determine if the StartDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStartDateTime() {
    return (this.startDateTime != null ? this.startDateTime.isSetValue() : false);
  }

  /**
   * Get the timestamp when the denial of spectrum use is planned to be halted..
   * <p>
   * @return a {@link DT} instance
   * @since 3.1.0
   */
  public DT getStopDateTime() {
    return stopDateTime;
  }

  /**
   * Set the timestamp when the denial of spectrum use is planned to be halted..
   * <p>
   * @param value a {@link DT} instance
   * @since 3.1.0
   */
  public void setStopDateTime(DT value) {
    this.stopDateTime = value;
  }

  /**
   * Determine if the StopDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStopDateTime() {
    return (this.stopDateTime != null ? this.stopDateTime.isSetValue() : false);
  }

  /**
   * Get the current version of the Radiation Plan..
   * <p>
   * @return a {@link S10} instance
   * @since 3.1.0
   */
  public S10 getVersion() {
    return version;
  }

  /**
   * Set the current version of the Radiation Plan..
   * <p>
   * @param value a {@link S10} instance
   * @since 3.1.0
   */
  public void setVersion(S10 value) {
    this.version = value;
  }

  /**
   * Determine if the Version is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVersion() {
    return (this.version != null ? this.version.isSetValue() : false);
  }

  /**
   * Get the US:JammingAuthority
   * <p>
   * Complex element JammingAuthority (US) describes the Jamming Control
   * Authority (JCA) authorisation information for the jamming plan and the
   * controls affecting the level of authorisation..
   * <p>
   * @return a {@link JammingAuthority} instance
   * @since 3.1.0
   */
  public Set<JammingAuthority> getJammingAuthority() {
    if (jammingAuthority == null) {
      jammingAuthority = new HashSet<>();
    }
    return this.jammingAuthority;
  }

  /**
   * Determine if the JammingAuthority is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJammingAuthority() {
    return ((this.jammingAuthority != null) && (!this.jammingAuthority.isEmpty()));
  }

  /**
   * Clear the JammingAuthority field. This sets the field to null.
   */
  public void unsetJammingAuthority() {
    this.jammingAuthority = null;
  }

  /**
   * Get the US:JammingPlan
   * <p>
   * Complex element JammingPlan (US) describes the start and stop conditions,
   * priorities, desired effect, and desired effectiveness..
   * <p>
   * @return a {@link JammingPlan} instance
   * @since 3.1.0
   */
  public Set<JammingPlan> getJammingPlan() {
    if (jammingPlan == null) {
      jammingPlan = new HashSet<>();
    }
    return this.jammingPlan;
  }

  /**
   * Determine if the JammingPlan is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJammingPlan() {
    return ((this.jammingPlan != null) && (!this.jammingPlan.isEmpty()));
  }

  /**
   * Clear the JammingPlan field. This sets the field to null.
   */
  public void unsetJammingPlan() {
    this.jammingPlan = null;
  }

  /**
   * Set the frequency range maximum value planned for denial of use.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RadiationPlan object instance.
   * @since 3.1.0
   */
  public RadiationPlan withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the frequency range minimum value planned for denial of use.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RadiationPlan object instance.
   * @since 3.1.0
   */
  public RadiationPlan withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the level of joint control authorization (JCA) required for the jamming
   * plan.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current RadiationPlan object instance.
   * @since 3.1.0
   */
  public RadiationPlan withJCALevel(Integer value) {
    setJCALevel(new UN2(value));
    return this;
  }

  /**
   * Set the unique reference serial of an existing Location dataset.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current RadiationPlan object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLocation(Location)} instead.
   */
  @Deprecated
  public RadiationPlan withLocationRef(Serial value) {
    setLocationRef(value);
    return this;
  }

  /**
   * Set In Data Item Name (US), enter a descriptive name for the Radiation
   * Plan.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current RadiationPlan object instance.
   * @since 3.1.0
   */
  public RadiationPlan withName(String value) {
    setName(new S100(value));
    return this;
  }

  /**
   * Set the timestamp when the denial of spectrum use is planned to begin.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current RadiationPlan object instance.
   * @since 3.1.0
   */
  public RadiationPlan withStartDateTime(Calendar value) {
    setStartDateTime(new DT(value));
    return this;
  }

  /**
   * Set the timestamp when the denial of spectrum use is planned to begin.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current RadiationPlan object instance.
   * @since 3.1.0
   */
  public RadiationPlan withStartDateTime(Date value) {
    setStartDateTime(new DT(value));
    return this;
  }

  /**
   * Set the timestamp when the denial of spectrum use is planned to be halted.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current RadiationPlan object instance.
   * @since 3.1.0
   */
  public RadiationPlan withStopDateTime(Calendar value) {
    setStopDateTime(new DT(value));
    return this;
  }

  /**
   * Set the timestamp when the denial of spectrum use is planned to be halted.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current RadiationPlan object instance.
   * @since 3.1.0
   */
  public RadiationPlan withStopDateTime(Date value) {
    setStopDateTime(new DT(value));
    return this;
  }

  /**
   * Set the current version of the Radiation Plan.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current RadiationPlan object instance.
   * @since 3.1.0
   */
  public RadiationPlan withVersion(String value) {
    setVersion(new S10(value));
    return this;
  }

  /**
   * Set the US:JammingAuthority
   * <p>
   * Complex element JammingAuthority (US) describes the Jamming Control
   * Authority (JCA) authorisation information for the jamming plan and the
   * controls affecting the level of authorisation.
   * <p>
   * @param values One or more instances of type {@link JammingAuthority...}.
   * @return The current RadiationPlan object instance.
   * @since 3.1.0
   */
  public RadiationPlan withJammingAuthority(JammingAuthority... values) {
    if (values != null) {
      getJammingAuthority().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:JammingAuthority
   * <p>
   * Complex element JammingAuthority (US) describes the Jamming Control
   * Authority (JCA) authorisation information for the jamming plan and the
   * controls affecting the level of authorisation.
   * <p>
   * @param values A collection of {@link JammingAuthority} instances
   * @return The current RadiationPlan object instance.
   * @since 3.1.0
   */
  public RadiationPlan withJammingAuthority(Collection<JammingAuthority> values) {
    if (values != null) {
      getJammingAuthority().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:JammingPlan
   * <p>
   * Complex element JammingPlan (US) describes the start and stop conditions,
   * priorities, desired effect, and desired effectiveness.
   * <p>
   * @param values One or more instances of type {@link JammingPlan...}.
   * @return The current RadiationPlan object instance.
   * @since 3.1.0
   */
  public RadiationPlan withJammingPlan(JammingPlan... values) {
    if (values != null) {
      getJammingPlan().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:JammingPlan
   * <p>
   * Complex element JammingPlan (US) describes the start and stop conditions,
   * priorities, desired effect, and desired effectiveness.
   * <p>
   * @param values A collection of {@link JammingPlan} instances
   * @return The current RadiationPlan object instance.
   * @since 3.1.0
   */
  public RadiationPlan withJammingPlan(Collection<JammingPlan> values) {
    if (values != null) {
      getJammingPlan().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this RadiationPlan instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RadiationPlan {"
           + (freqMax != null ? "\n freqMax [" + freqMax + "]" : "")
           + (freqMin != null ? "\n freqMin [" + freqMin + "]" : "")
           + (jammingAuthority != null ? "\n jammingAuthority [" + jammingAuthority + "]" : "")
           + (jammingPlan != null ? "\n jammingPlan [" + jammingPlan + "]" : "")
           + (jcaLevel != null ? "\n jcaLevel [" + jcaLevel + "]" : "")
           + (locationRef != null ? "\n locationRef [" + locationRef + "]" : "")
           + (name != null ? "\n name [" + name + "]" : "")
           + (startDateTime != null ? "\n startDateTime [" + startDateTime + "]" : "")
           + (stopDateTime != null ? "\n stopDateTime [" + stopDateTime + "]" : "")
           + (version != null ? "\n version [" + version + "]" : "")
           + "}\n  RadiationPlan." + super.toString() + "\n";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RadiationPlan} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link FreqM FreqMin}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetFreqMin();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * US:LocationRef - Plan Location Serial (Optional)
   * <p>
   * The unique reference serial of an existing Location dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Location location;

  /**
   * Get the unique reference serial of an existing Location dataset..
   * <p>
   * @return a {@link Location} instance
   * @since 3.1.0
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Determine if the location field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocation() {
    return this.location != null;
  }

  /**
   * Set the unique reference serial of an existing Location dataset.
   * <p>
   * @param value An instances of type {@link Location}.
   * @return The current RadiationPlan object instance.
   * @since 3.1.0
   */
  public RadiationPlan withLocation(Location value) {
    this.location = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this RadiationPlan record.
   * <p>
   * This method builds the exported {@link #locationRef} field with values from
   * the transient {@link #location} field. This method should typically be
   * called after the RadiationPlan is configured and (optionally) before
   * exporting an SSRF message.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void prepare() {
    super.prepare();
    this.locationRef = location != null ? location.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this RadiationPlan record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #location} with values from the
   * imported {@link #locationRef} field. This method should typically be called
   * after the RadiationPlan is imported from XML. * @param root the SSRF root
   * instance.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (locationRef == null || !locationRef.isSetValue()) {
      return;
    }
    for (Location instance : root.getLocation()) {
      if (locationRef.equals(instance.getSerial())) {
        location = instance;
        return;
      }
    }
  }//</editor-fold>

}
