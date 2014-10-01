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
package us.gov.dod.standard.ssrf._3_1.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.AsgnFreqBase;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "TAD", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterUS5.class)
  private TString tad;
  /**
   * LegacyNum - Legacy Number (Optional)
   * <p>
   * A legacy reference number associated with the assigned frequency.
   * <p>
   * Format is S20
   */
  @XmlElement(name = "LegacyNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString legacyNum;
  /**
   * PairedFreqMin - Paired Nominal or Minimum Frequency (Optional)
   * <p>
   * The nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "PairedFreq")
  private List<PairedFreq> pairedFreq;
  /**
   * US:NarrowBandPlanning (Optional)
   * <p>
   * NarrowBandPlanning (US) describes a reduced bandwidth assignment for a
   * single frequency or a range of frequencies.
   */
  @XmlElement(name = "NarrowBandPlanning")
  private List<NarrowBandPlanning> narrowBandPlanning;

  /**
   * Get the TAD associated to the assigned frequency. A Tactical Air Designator
   * is a series of alphanumeric characters that can be used to identify
   * air/ground/air or air/air frequency channels to prevent inadvertent
   * disclosure of classified information.
   * <p>
   * @return the TAD value in a {@link TString} data type
   */
  public TString getTAD() {
    return tad;
  }

  /**
   * Set the TAD associated to the assigned frequency. A Tactical Air Designator
   * is a series of alphanumeric characters that can be used to identify
   * air/ground/air or air/air frequency channels to prevent inadvertent
   * disclosure of classified information.
   * <p>
   * @param value the TAD value in a {@link TString} data type
   */
  public void setTAD(TString value) {
    this.tad = value;
  }

  /**
   * Determine if the TAD is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTAD() {
    return (this.tad != null ? this.tad.isSetValue() : false);
  }

  /**
   * Get a legacy reference number associated with the assigned frequency.
   * <p>
   * @return the LegacyNum value in a {@link TString} data type
   */
  public TString getLegacyNum() {
    return legacyNum;
  }

  /**
   * Set a legacy reference number associated with the assigned frequency.
   * <p>
   * @param value the LegacyNum value in a {@link TString} data type
   */
  public void setLegacyNum(TString value) {
    this.legacyNum = value;
  }

  /**
   * Determine if the LegacyNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLegacyNum() {
    return (this.legacyNum != null ? this.legacyNum.isSetValue() : false);
  }

  /**
   * Get the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @return a {@link List<PairedFreq>} instance
   */
  public List<PairedFreq> getPairedFreq() {
    if (pairedFreq == null) {
      pairedFreq = new ArrayList<>();
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
   * assignment for a single frequency or a range of frequencies.
   * <p>
   * @return a {@link List<NarrowBandPlanning>} instance
   */
  public List<NarrowBandPlanning> getNarrowBandPlanning() {
    if (narrowBandPlanning == null) {
      narrowBandPlanning = new ArrayList<>();
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
   * @param value An instances of type {@link String}
   * @return The current Freq object instance
   */
  public Freq withTAD(String value) {
    setTAD(new TString(value));
    return this;
  }

  /**
   * Set a legacy reference number associated with the assigned frequency.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Freq object instance
   */
  public Freq withLegacyNum(String value) {
    setLegacyNum(new TString(value));
    return this;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @param values One or more instances of type {@link PairedFreq...}
   * @return The current Freq object instance
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
   * @return The current Freq object instance
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
   * @param values One or more instances of type {@link NarrowBandPlanning...}
   * @return The current Freq object instance
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
   * @return The current Freq object instance
   */
  public Freq withNarrowBandPlanning(Collection<NarrowBandPlanning> values) {
    if (values != null) {
      getNarrowBandPlanning().addAll(values);
    }
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
      + " narrowBandPlanning [" + narrowBandPlanning + "]"
      + " legacyNum [" + legacyNum + "]"
      + " tad [" + tad + "]"
      + " pairedFreq [" + pairedFreq + "]"
      + super.toString()
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Freq} has no configuration requirement but extends
   * {@link AsgnFreqBase} which requires {@link TDecimal FreqMin}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet();
  }

}
