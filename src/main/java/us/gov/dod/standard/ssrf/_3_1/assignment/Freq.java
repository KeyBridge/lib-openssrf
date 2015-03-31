package us.gov.dod.standard.ssrf._3_1.assignment;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.AsgnFreqBase;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAU;

/**
 * Freq indicates a single assigned frequency or an assigned range of
 * frequencies.
 * <p>
 * Element of {@link Assigned}
 * <p>
 * Sub-Elements are {@link NarrowBandPlanning}, {@link PairedFreq}
 * <p>
 * Example:
 * <pre>
 * &lt;Freq&gt;
 *   &lt;FreqMin cls="U"&gt;351.125&lt;/FreqMin&gt;
 *   &lt;LegacyNum cls="U"&gt;USAF11012345&lt;/LegacyNum&gt;
 * &lt;/Freq&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Freq", propOrder = {
  "tad",
  "legacyNum",
  "pairedFreq",
  "narrowBandPlanning"
})
public class Freq extends AsgnFreqBase {

  /**
   * TAD - Tactical Air Designator (Optional)
   * <p>
   * The TAD associated to the assigned frequency. A Tactical Air Designator is
   * a series of alphanumeric characters that can be used to identify
   * air/ground/air or air/air frequency channels to prevent inadvertent
   * disclosure of classified information.
   * <p>
   * Format is US5
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TAD", required = false)
  private US5 tad;
  /**
   * LegacyNum - Legacy Number (Optional)
   * <p>
   * A legacy reference number associated with the assigned frequency.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LegacyNum", required = false)
  private S20 legacyNum;
  /**
   * PairedFreqMin - Paired Nominal or Minimum Frequency (Optional)
   * <p>
   * The nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PairedFreq")
  private Set<PairedFreq> pairedFreq;
  /**
   * US:NarrowBandPlanning (Optional)
   * <p>
   * NarrowBandPlanning (US) describes a reduced bandwidth assignment for a
   * single frequency or a range of frequencies.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NarrowBandPlanning")
  private Set<NarrowBandPlanning> narrowBandPlanning;

  /**
   * Get the TAD associated to the assigned frequency. A Tactical Air Designator
   * is a series of alphanumeric characters that can be used to identify
   * air/ground/air or air/air frequency channels to prevent inadvertent
   * disclosure of classified information..
   * <p>
   * @return a {@link US5} instance
   * @since 3.1.0
   */
  public US5 getTAD() {
    return tad;
  }

  /**
   * Set the TAD associated to the assigned frequency. A Tactical Air Designator
   * is a series of alphanumeric characters that can be used to identify
   * air/ground/air or air/air frequency channels to prevent inadvertent
   * disclosure of classified information..
   * <p>
   * @param value a {@link US5} instance
   * @since 3.1.0
   */
  public void setTAD(US5 value) {
    this.tad = value;
  }

  /**
   * Determine if the TAD is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTAD() {
    return (this.tad != null ? this.tad.isSetValue() : false);
  }

  /**
   * Get a legacy reference number associated with the assigned frequency..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getLegacyNum() {
    return legacyNum;
  }

  /**
   * Set a legacy reference number associated with the assigned frequency..
   * <p>
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setLegacyNum(S20 value) {
    this.legacyNum = value;
  }

  /**
   * Determine if the LegacyNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLegacyNum() {
    return (this.legacyNum != null ? this.legacyNum.isSetValue() : false);
  }

  /**
   * Get the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system..
   * <p>
   * @return a {@link PairedFreq} instance
   * @since 3.1.0
   */
  public Set<PairedFreq> getPairedFreq() {
    if (pairedFreq == null) {
      pairedFreq = new HashSet<>();
    }
    return this.pairedFreq;
  }

  /**
   * Determine if the PairedFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPairedFreq() {
    return ((this.pairedFreq != null) && (!this.pairedFreq.isEmpty()));
  }

  /**
   * Clear the PairedFreq field. This sets the field to null.
   */
  public void unsetPairedFreq() {
    this.pairedFreq = null;
  }

  /**
   * Get the US:NarrowBandPlanning
   * <p>
   * Complex element NarrowBandPlanning (US) describes a reduced bandwidth
   * assignment for a single frequency or a range of frequencies..
   * <p>
   * @return a {@link NarrowBandPlanning} instance
   * @since 3.1.0
   */
  public Set<NarrowBandPlanning> getNarrowBandPlanning() {
    if (narrowBandPlanning == null) {
      narrowBandPlanning = new HashSet<>();
    }
    return this.narrowBandPlanning;
  }

  /**
   * Determine if the NarrowBandPlanning is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNarrowBandPlanning() {
    return ((this.narrowBandPlanning != null) && (!this.narrowBandPlanning.isEmpty()));
  }

  /**
   * Clear the NarrowBandPlanning field. This sets the field to null.
   */
  public void unsetNarrowBandPlanning() {
    this.narrowBandPlanning = null;
  }

  /**
   * Set the TAD associated to the assigned frequency. A Tactical Air Designator
   * is a series of alphanumeric characters that can be used to identify
   * air/ground/air or air/air frequency channels to prevent inadvertent
   * disclosure of classified information.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Freq object instance.
   * @since 3.1.0
   */
  public Freq withTAD(String value) {
    setTAD(new US5(value));
    return this;
  }

  /**
   * Set a legacy reference number associated with the assigned frequency.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Freq object instance.
   * @since 3.1.0
   */
  public Freq withLegacyNum(String value) {
    setLegacyNum(new S20(value));
    return this;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @param values One or more instances of type {@link PairedFreq...}.
   * @return The current Freq object instance.
   * @since 3.1.0
   */
  public Freq withPairedFreq(PairedFreq... values) {
    if (values != null) {
      getPairedFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @param values A collection of {@link PairedFreq} instances
   * @return The current Freq object instance.
   * @since 3.1.0
   */
  public Freq withPairedFreq(Collection<PairedFreq> values) {
    if (values != null) {
      getPairedFreq().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:NarrowBandPlanning
   * <p>
   * Complex element NarrowBandPlanning (US) describes a reduced bandwidth
   * assignment for a single frequency or a range of frequencies.
   * <p>
   * @param values One or more instances of type {@link NarrowBandPlanning...}.
   * @return The current Freq object instance.
   * @since 3.1.0
   */
  public Freq withNarrowBandPlanning(NarrowBandPlanning... values) {
    if (values != null) {
      getNarrowBandPlanning().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:NarrowBandPlanning
   * <p>
   * Complex element NarrowBandPlanning (US) describes a reduced bandwidth
   * assignment for a single frequency or a range of frequencies.
   * <p>
   * @param values A collection of {@link NarrowBandPlanning} instances
   * @return The current Freq object instance.
   * @since 3.1.0
   */
  public Freq withNarrowBandPlanning(Collection<NarrowBandPlanning> values) {
    if (values != null) {
      getNarrowBandPlanning().addAll(values);
    }
    return this;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Freq object instance.
   * @since 3.1.0
   */
  @Override
  public Freq withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Freq object instance.
   * @since 3.1.0
   */
  @Override
  public Freq withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the reference frequency of a suppressed or reduced carrier sideband.
   * This item only applies to a single frequency and should not be used with a
   * range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Freq object instance.
   * @since 3.1.0
   */
  @Override
  public Freq withRefFreq(Double value) {
    setRefFreq(new FreqM(value));
    return this;
  }

  /**
   * Set if the frequency range is used for transmit, receive, or both transmit
   * and receive.
   * <p>
   * @param value An instances of type {@link ListCAU}.
   * @return The current Freq object instance.
   * @since 3.1.0
   */
  @Override
  public Freq withFreqUse(ListCAU value) {
    setFreqUse(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this Freq instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Freq {"
           + (legacyNum != null ? "\n legacyNum [" + legacyNum + "]" : "")
           + (narrowBandPlanning != null ? "\n narrowBandPlanning [" + narrowBandPlanning + "]" : "")
           + (pairedFreq != null ? "\n pairedFreq [" + pairedFreq + "]" : "")
           + (tad != null ? "\n tad [" + tad + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Freq} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  @Override
  public boolean isSet() {
    return true;
  }

}
