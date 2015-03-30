package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.loadset.JammingChannelProfile;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * LoadSet (US) describes the general system setup to be used under a specified
 * set of conditions, typically related to jamming or frequency hopping.
 * <p>
 * Sub-Element is {@link JammingChannelProfile}
 * <p>
 * Example:
 * <pre>
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
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
public class Loadset extends Common<Loadset> {

  /**
   * US:KeyLoadProcedure - Key Loading Procedure (Optional)    * <p>
   * The sequence pattern for initializing the jamming equipment.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "KeyLoadProcedure", required = false)
  private MEMO keyLoadProcedure;
  /**
   * US:MaxActiveFrames - Maximum Active Frames (Optional)    * <p>
   * The maximum number of active frames (data blocks currently in use directing
   * equipment functionality) for a specific loadset.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MaxActiveFrames", required = false)
  private UN6 maxActiveFrames;
  /**
   * US:MaxReactiveFrames - Maximum Reactive Frames (Optional)    * <p>
   * The maximum number of reactive frames (data blocks planned to direct
   * equipment functionality in response to a stimulus) for a specific loadset.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MaxReactiveFrames", required = false)
  private UN6 maxReactiveFrames;
  /**
   * US:Mission - Threat Load Mission (Optional)    * <p>
   * The task expected to be accomplished by the loadset.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Mission", required = false)
  private S100 mission;
  /**
   * US:Name - Loadset Name (Required)    * <p>
   * The name of the loadset.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Name", required = true)
  private S50 name;
  /**
   * US:PrimaryFirmware - Primary Firmware (Optional)    * <p>
   * The mission-independent software that is "burned" and which stays resident
   * on the RF jamming hardware.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PrimaryFirmware", required = false)
  private S50 primaryFirmware;
  /**
   * US:ResetProcedure - Reset Procedure (Optional)    * <p>
   * The instructions for zeroing/sanitizing the jamming equipment to initial
   * operating conditions.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ResetProcedure", required = false)
  private MEMO resetProcedure;
  /**
   * US:SecondaryFirmware - Secondary Firmware (Optional)    * <p>
   * Alternate mission-independent software that is "burned" and which stays
   * resident on the RF jamming hardware.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SecondaryFirmware", required = false)
  private S50 secondaryFirmware;
  /**
   * US:Software - Software (Optional)    * <p>
   * The mission-specific software that is loaded on the RF jamming hardware.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Software", required = false)
  private S50 software;
  /**
   * US:JammingChannelProfile (Required)
   * <p>
   * JammingChannelProfile (US) describes the specific Loadset parameters for
   * jamming a discrete frequency or frequency range.
   * <p>
   * Divergence from SMADEF:
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JammingChannelProfile", required = true)
  private Set<JammingChannelProfile> jammingChannelProfile;

  /**
   * Get the sequence pattern for initializing the jamming equipment..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getKeyLoadProcedure() {
    return keyLoadProcedure;
  }

  /**
   * Set the sequence pattern for initializing the jamming equipment..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setKeyLoadProcedure(MEMO value) {
    this.keyLoadProcedure = value;
  }

  /**
   * Determine if the KeyLoadProcedure is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetKeyLoadProcedure() {
    return (this.keyLoadProcedure != null ? this.keyLoadProcedure.isSetValue() : false);
  }

  /**
   * Get the maximum number of active frames (data blocks currently in use
   * directing equipment functionality) for a specific loadset..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getMaxActiveFrames() {
    return maxActiveFrames;
  }

  /**
   * Set the maximum number of active frames (data blocks currently in use
   * directing equipment functionality) for a specific loadset..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setMaxActiveFrames(UN6 value) {
    this.maxActiveFrames = value;
  }

  /**
   * Determine if the MaxActiveFrames is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMaxActiveFrames() {
    return (this.maxActiveFrames != null ? this.maxActiveFrames.isSetValue() : false);
  }

  /**
   * Get the maximum number of reactive frames (data blocks planned to direct
   * equipment functionality in response to a stimulus) for a specific loadset..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getMaxReactiveFrames() {
    return maxReactiveFrames;
  }

  /**
   * Set the maximum number of reactive frames (data blocks planned to direct
   * equipment functionality in response to a stimulus) for a specific loadset..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setMaxReactiveFrames(UN6 value) {
    this.maxReactiveFrames = value;
  }

  /**
   * Determine if the MaxReactiveFrames is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMaxReactiveFrames() {
    return (this.maxReactiveFrames != null ? this.maxReactiveFrames.isSetValue() : false);
  }

  /**
   * Get the task expected to be accomplished by the loadset..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getMission() {
    return mission;
  }

  /**
   * Set the task expected to be accomplished by the loadset..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setMission(S100 value) {
    this.mission = value;
  }

  /**
   * Determine if the Mission is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMission() {
    return (this.mission != null ? this.mission.isSetValue() : false);
  }

  /**
   * Get the name of the loadset..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getName() {
    return name;
  }

  /**
   * Set the name of the loadset..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setName(S50 value) {
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
   * Get the mission-independent software that is "burned" and which stays
   * resident on the RF jamming hardware..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getPrimaryFirmware() {
    return primaryFirmware;
  }

  /**
   * Set the mission-independent software that is "burned" and which stays
   * resident on the RF jamming hardware..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setPrimaryFirmware(S50 value) {
    this.primaryFirmware = value;
  }

  /**
   * Determine if the PrimaryFirmware is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPrimaryFirmware() {
    return (this.primaryFirmware != null ? this.primaryFirmware.isSetValue() : false);
  }

  /**
   * Get the instructions for zeroing/sanitizing the jamming equipment to
   * initial operating conditions..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getResetProcedure() {
    return resetProcedure;
  }

  /**
   * Set the instructions for zeroing/sanitizing the jamming equipment to
   * initial operating conditions..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setResetProcedure(MEMO value) {
    this.resetProcedure = value;
  }

  /**
   * Determine if the ResetProcedure is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetResetProcedure() {
    return (this.resetProcedure != null ? this.resetProcedure.isSetValue() : false);
  }

  /**
   * Get alternate mission-independent software that is "burned" and which stays
   * resident on the RF jamming hardware..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getSecondaryFirmware() {
    return secondaryFirmware;
  }

  /**
   * Set alternate mission-independent software that is "burned" and which stays
   * resident on the RF jamming hardware..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setSecondaryFirmware(S50 value) {
    this.secondaryFirmware = value;
  }

  /**
   * Determine if the SecondaryFirmware is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSecondaryFirmware() {
    return (this.secondaryFirmware != null ? this.secondaryFirmware.isSetValue() : false);
  }

  /**
   * Get the mission-specific software that is loaded on the RF jamming
   * hardware..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getSoftware() {
    return software;
  }

  /**
   * Set the mission-specific software that is loaded on the RF jamming
   * hardware..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setSoftware(S50 value) {
    this.software = value;
  }

  /**
   * Determine if the Software is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSoftware() {
    return (this.software != null ? this.software.isSetValue() : false);
  }

  /**
   * Get the US:JammingChannelProfile
   * <p>
   * Complex element JammingChannelProfile (US) describes the specific Loadset
   * parameters for jamming a discrete frequency or frequency range..
   * <p>
   * @return a {@link JammingChannelProfile} instance
   * @since 3.1.0
   */
  public Set<JammingChannelProfile> getJammingChannelProfile() {
    if (jammingChannelProfile == null) {
      jammingChannelProfile = new HashSet<>();
    }
    return this.jammingChannelProfile;
  }

  /**
   * Determine if the JammingChannelProfile is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJammingChannelProfile() {
    return ((this.jammingChannelProfile != null) && (!this.jammingChannelProfile.isEmpty()));
  }

  /**
   * Clear the JammingChannelProfile field. This sets the field to null.
   */
  public void unsetJammingChannelProfile() {
    this.jammingChannelProfile = null;
  }

  /**
   * Set the sequence pattern for initializing the jamming equipment.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Loadset object instance.
   * @since 3.1.0
   */
  public Loadset withKeyLoadProcedure(String value) {
    setKeyLoadProcedure(new MEMO(value));
    return this;
  }

  /**
   * Set the maximum number of active frames (data blocks currently in use
   * directing equipment functionality) for a specific loadset.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current Loadset object instance.
   * @since 3.1.0
   */
  public Loadset withMaxActiveFrames(Integer value) {
    setMaxActiveFrames(new UN6(value));
    return this;
  }

  /**
   * Set the maximum number of reactive frames (data blocks planned to direct
   * equipment functionality in response to a stimulus) for a specific loadset.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current Loadset object instance.
   * @since 3.1.0
   */
  public Loadset withMaxReactiveFrames(Integer value) {
    setMaxReactiveFrames(new UN6(value));
    return this;
  }

  /**
   * Set the task expected to be accomplished by the loadset.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Loadset object instance.
   * @since 3.1.0
   */
  public Loadset withMission(String value) {
    setMission(new S100(value));
    return this;
  }

  /**
   * Set the name of the loadset.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Loadset object instance.
   * @since 3.1.0
   */
  public Loadset withName(String value) {
    setName(new S50(value));
    return this;
  }

  /**
   * Set the mission-independent software that is "burned" and which stays
   * resident on the RF jamming hardware.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Loadset object instance.
   * @since 3.1.0
   */
  public Loadset withPrimaryFirmware(String value) {
    setPrimaryFirmware(new S50(value));
    return this;
  }

  /**
   * Set the instructions for zeroing/sanitizing the jamming equipment to
   * initial operating conditions.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Loadset object instance.
   * @since 3.1.0
   */
  public Loadset withResetProcedure(String value) {
    setResetProcedure(new MEMO(value));
    return this;
  }

  /**
   * Set alternate mission-independent software that is "burned" and which stays
   * resident on the RF jamming hardware.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Loadset object instance.
   * @since 3.1.0
   */
  public Loadset withSecondaryFirmware(String value) {
    setSecondaryFirmware(new S50(value));
    return this;
  }

  /**
   * Set the mission-specific software that is loaded on the RF jamming
   * hardware.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Loadset object instance.
   * @since 3.1.0
   */
  public Loadset withSoftware(String value) {
    setSoftware(new S50(value));
    return this;
  }

  /**
   * Set the US:JammingChannelProfile
   * <p>
   * Complex element JammingChannelProfile (US) describes the specific Loadset
   * parameters for jamming a discrete frequency or frequency range.
   * <p>
   * @param values One or more instances of type
   *               {@link JammingChannelProfile...}.
   * @return The current Loadset object instance.
   * @since 3.1.0
   */
  public Loadset withJammingChannelProfile(JammingChannelProfile... values) {
    if (values != null) {
      getJammingChannelProfile().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:JammingChannelProfile
   * <p>
   * Complex element JammingChannelProfile (US) describes the specific Loadset
   * parameters for jamming a discrete frequency or frequency range.
   * <p>
   * @param values A collection of {@link JammingChannelProfile} instances
   * @return The current Loadset object instance.
   * @since 3.1.0
   */
  public Loadset withJammingChannelProfile(Collection<JammingChannelProfile> values) {
    if (values != null) {
      getJammingChannelProfile().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Loadset instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Loadset {"
           + (jammingChannelProfile != null ? " jammingChannelProfile [" + jammingChannelProfile + "]" : "")
           + (keyLoadProcedure != null ? " keyLoadProcedure [" + keyLoadProcedure + "]" : "")
           + (maxActiveFrames != null ? " maxActiveFrames [" + maxActiveFrames + "]" : "")
           + (maxReactiveFrames != null ? " maxReactiveFrames [" + maxReactiveFrames + "]" : "")
           + (mission != null ? " mission [" + mission + "]" : "")
           + (name != null ? " name [" + name + "]" : "")
           + (primaryFirmware != null ? " primaryFirmware [" + primaryFirmware + "]" : "")
           + (resetProcedure != null ? " resetProcedure [" + resetProcedure + "]" : "")
           + (secondaryFirmware != null ? " secondaryFirmware [" + secondaryFirmware + "]" : "")
           + (software != null ? " software [" + software + "]" : "")
           + "}\n  Loadset." + super.toString() + "\n";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Loadset} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link Set<JammingChannelProfile> JammingChannelProfile},
   * {@link S50 Name}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetJammingChannelProfile() && isSetName();
  }

}
