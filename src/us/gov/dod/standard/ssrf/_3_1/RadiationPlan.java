/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * US:FreqMin - Minimum Frequency (Required)
   * <p>
   * The frequency range minimum value planned for denial of use.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMin", required = true)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * US:JCALevel - Authorisation Level (Optional)
   * <p>
   * The level of joint control authorization (JCA) required for the jamming
   * plan.
   * <p>
   * Format is UN(2)
   */
  @XmlElement(name = "JCALevel", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN2.class)
  private TInteger jcaLevel;
  /**
   * US:LocationRef - Plan Location Serial (Optional)
   * <p>
   * The unique reference serial of an existing Location dataset.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "LocationRef", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString locationRef;
  /**
   * Name (US), enter a descriptive name for the Radiation Plan.
   */
  @XmlElement(name = "Name", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
  /**
   * US:StartDateTime - Start Time (Optional)
   * <p>
   * The timestamp when the denial of spectrum use is planned to begin.
   * <p>
   * Format is DateTime
   */
  @XmlElement(name = "StartDateTime", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar startDateTime;
  /**
   * US:StopDateTime - Stop Time (Optional)
   * <p>
   * The timestamp when the denial of spectrum use is planned to be halted.
   * <p>
   * Format is DateTime
   */
  @XmlElement(name = "StopDateTime", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar stopDateTime;
  /**
   * US:Version - Radiation Plan Version (Optional)
   * <p>
   * The current version of the Radiation Plan.
   * <p>
   * Format is S10
   */
  @XmlElement(name = "Version", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS10.class)
  private TString version;
  /**
   * US:JammingAuthority (Optional)
   * <p>
   * JammingAuthority (US) describes the Jamming Control Authority (JCA)
   * authorisation information for the jamming plan and the controls affecting
   * the level of authorisation.
   */
  @XmlElement(name = "JammingAuthority")
  private List<JammingAuthority> jammingAuthority;
  /**
   * US:JammingPlan (Optional)
   * <p>
   * JammingPlan (US) describes the start and stop conditions, priorities,
   * desired effect, and desired effectiveness.
   */
  @XmlElement(name = "JammingPlan")
  private List<JammingPlan> jammingPlan;

  /**
   * Get the frequency range maximum value planned for denial of use.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @return the FreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Set the frequency range maximum value planned for denial of use.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @param value the FreqMax value in a {@link TDecimal} data type
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get the frequency range minimum value planned for denial of use.
   * <p>
   * @return the FreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Set the frequency range minimum value planned for denial of use.
   * <p>
   * @param value the FreqMin value in a {@link TDecimal} data type
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get the level of joint control authorization (JCA) required for the jamming
   * plan.
   * <p>
   * @return the JCALevel value in a {@link TInteger} data type
   */
  public TInteger getJCALevel() {
    return jcaLevel;
  }

  /**
   * Set the level of joint control authorization (JCA) required for the jamming
   * plan.
   * <p>
   * @param value the JCALevel value in a {@link TInteger} data type
   */
  public void setJCALevel(TInteger value) {
    this.jcaLevel = value;
  }

  /**
   * Determine if the JCALevel is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJCALevel() {
    return (this.jcaLevel != null ? this.jcaLevel.isSetValue() : false);
  }

  /**
   * Get the unique reference serial of an existing Location dataset.
   * <p>
   * @return the LocationRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLocation()} instead.
   */
  @Deprecated
  public TString getLocationRef() {
    return locationRef;
  }

  /**
   * Set the unique reference serial of an existing Location dataset.
   * <p>
   * @param value the LocationRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLocation(Location)} instead.
   */
  @Deprecated
  public void setLocationRef(TString value) {
    this.locationRef = value;
  }

  /**
   * Determine if the LocationRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocationRef() {
    return (this.locationRef != null ? this.locationRef.isSetValue() : false);
  }

  /**
   * Get Name (US), enter a descriptive name for the Radiation Plan.
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set Name (US), enter a descriptive name for the Radiation Plan.
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
   * Get the timestamp when the denial of spectrum use is planned to begin.
   * <p>
   * @return the StartDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getStartDateTime() {
    return startDateTime;
  }

  /**
   * Set the timestamp when the denial of spectrum use is planned to begin.
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
   * Get the timestamp when the denial of spectrum use is planned to be halted.
   * <p>
   * @return the StopDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getStopDateTime() {
    return stopDateTime;
  }

  /**
   * Set the timestamp when the denial of spectrum use is planned to be halted.
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
   * Get the current version of the Radiation Plan.
   * <p>
   * @return the Version value in a {@link TString} data type
   */
  public TString getVersion() {
    return version;
  }

  /**
   * Set the current version of the Radiation Plan.
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
   * Get the US:JammingAuthority
   * <p>
   * Complex element JammingAuthority (US) describes the Jamming Control
   * Authority (JCA) authorisation information for the jamming plan and the
   * controls affecting the level of authorisation.
   * <p>
   * @return a non-null but possibly empty list of {@link JammingAuthority}
   *         instances
   */
  public List<JammingAuthority> getJammingAuthority() {
    if (jammingAuthority == null) {
      jammingAuthority = new ArrayList<>();
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
   * priorities, desired effect, and desired effectiveness.
   * <p>
   * @return a non-null but possibly empty list of {@link JammingPlan} instances
   */
  public List<JammingPlan> getJammingPlan() {
    if (jammingPlan == null) {
      jammingPlan = new ArrayList<>();
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
   * @param value An instances of type {@link Double}
   * @return The current RadiationPlan object instance
   */
  public RadiationPlan withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the frequency range minimum value planned for denial of use.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RadiationPlan object instance
   */
  public RadiationPlan withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the level of joint control authorization (JCA) required for the jamming
   * plan.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current RadiationPlan object instance
   */
  public RadiationPlan withJCALevel(Integer value) {
    setJCALevel(new TInteger(value));
    return this;
  }

  /**
   * Set the unique reference serial of an existing Location dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RadiationPlan object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLocation(Location)} instead.
   */
  @Deprecated
  public RadiationPlan withLocationRef(String value) {
    setLocationRef(new TString(value));
    return this;
  }

  /**
   * Set Name (US), enter a descriptive name for the Radiation Plan.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RadiationPlan object instance
   */
  public RadiationPlan withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set the timestamp when the denial of spectrum use is planned to begin.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current RadiationPlan object instance
   */
  public RadiationPlan withStartDateTime(Calendar value) {
    setStartDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the timestamp when the denial of spectrum use is planned to begin.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current RadiationPlan object instance
   */
  public RadiationPlan withStartDateTime(Date value) {
    setStartDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the timestamp when the denial of spectrum use is planned to be halted.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current RadiationPlan object instance
   */
  public RadiationPlan withStopDateTime(Calendar value) {
    setStopDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the timestamp when the denial of spectrum use is planned to be halted.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current RadiationPlan object instance
   */
  public RadiationPlan withStopDateTime(Date value) {
    setStopDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the current version of the Radiation Plan.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RadiationPlan object instance
   */
  public RadiationPlan withVersion(String value) {
    setVersion(new TString(value));
    return this;
  }

  /**
   * Set the US:JammingAuthority
   * <p>
   * Complex element JammingAuthority (US) describes the Jamming Control
   * Authority (JCA) authorisation information for the jamming plan and the
   * controls affecting the level of authorisation.
   * <p>
   * @param values One or more instances of type {@link JammingAuthority}
   * @return The current RadiationPlan object instance
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
   * @return The current RadiationPlan object instance
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
   * @param values One or more instances of type {@link JammingPlan}
   * @return The current RadiationPlan object instance
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
   * @return The current RadiationPlan object instance
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
      + (locationRef != null ? " locationRef [" + locationRef + "]" : "")
      + (startDateTime != null ? " startDateTime [" + startDateTime + "]" : "")
      + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
      + (name != null ? " name [" + name + "]" : "")
      + (jcaLevel != null ? " jcaLevel [" + jcaLevel + "]" : "")
      + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
      + (jammingAuthority != null ? " jammingAuthority [" + jammingAuthority + "]" : "")
      + (jammingPlan != null ? " jammingPlan [" + jammingPlan + "]" : "")
      + (stopDateTime != null ? " stopDateTime [" + stopDateTime + "]" : "")
      + (version != null ? " version [" + version + "]" : "")
      + "\n  RadiationPlan." + super.toString() + "\n"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RadiationPlan} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link TDecimal FreqMin}.
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
   * Get the unique reference serial of an existing Location dataset.
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
   * @param value An instances of type {@link Location}
   * @return The current RadiationPlan object instance
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
   * @return The current RadiationPlan object instance
   */
  @Override
  public RadiationPlan build() {
    super.build();
    this.locationRef = location != null ? location.getSerial() : null;
    return this;
  }//</editor-fold>

}
