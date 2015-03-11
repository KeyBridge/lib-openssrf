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
package us.gov.dod.standard.ssrf._3_1.toa;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.TOA;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * FreqBand contains the allocation of a specific frequency band to
 * radiocommunication services. It may also provide additional information such
 * as the specification of the rights and responsibilities of a user.
 * <p>
 * Element of {@link TOA}
 * <p>
 * Sub-Element is {@link Allocation}
 * <p>
 * Example:
 * <pre>
 * &lt;FreqBand&gt;
 *   &lt;FreqMin cls="U"&gt;960&lt;/FreqMin&gt;
 *   &lt;FreqMax cls="U"&gt;1164&lt;/FreqMax&gt;
 *   &lt;Allocation&gt;
 *     &lt;AllocatedService cls="U"&gt;Aeronautical Mobile Service&lt;/AllocatedService&gt;
 *     &lt;Priority cls="U"&gt;Primary&lt;/Priority&gt;
 *   &lt;/Allocation&gt;
 * &lt;/FreqBand&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreqBand", propOrder = {
  "freqMin",
  "freqMax",
  "useIndicator",
  "allocation"
})
public class FreqBand implements Comparable<FreqBand> {

  /**
   * FreqMin - Minimum Frequency (Required)
   * <p>
   * The nominal frequency or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMin", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * FreqMax - Maximum Frequency (Required)
   * <p>
   * The maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMax", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * UseIndicator - Use Indicator (Optional)
   * <p>
   * The permitted uses of this band (e.g., "Government", "Non-government",
   * etc).
   * <p>
   * Format is S40
   */
  @XmlElement(name = "UseIndicator", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS40.class)
  private TString useIndicator;
  /**
   * Allocation (Optional)
   * <p>
   * Allocation contains the allocation of a specific frequency band to a
   * specific radiocommunication service.
   */
  @XmlElement(name = "Allocation")
  private Set<Allocation> allocation;
  /**
   * footnotes - Link to band usage notes (Optional)
   * <p>
   * A list containing each Footnote index applicable to the current frequency
   * band. Each entry in the list should be separated by a blank space.
   * <p>
   * Format is List of UN(6)
   */
  @XmlAttribute(name = "footnotes")
  private Set<BigInteger> footnotes;

  /**
   * Get the nominal frequency or minimum value of the frequency range.
   * <p>
   * @return the FreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
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
   * Get the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @return the FreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
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
   * Get the permitted uses of this band (e.g., "Government", "Non-government",
   * etc).
   * <p>
   * @return the UseIndicator value in a {@link TString} data type
   */
  public TString getUseIndicator() {
    return useIndicator;
  }

  /**
   * Set the permitted uses of this band (e.g., "Government", "Non-government",
   * etc).
   * <p>
   * @param value the UseIndicator value in a {@link TString} data type
   */
  public void setUseIndicator(TString value) {
    this.useIndicator = value;
  }

  /**
   * Determine if the UseIndicator is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUseIndicator() {
    return (this.useIndicator != null ? this.useIndicator.isSetValue() : false);
  }

  /**
   * Get the Allocation
   * <p>
   * Complex element Allocation contains the allocation of a specific frequency
   * band to a specific radiocommunication service.
   * <p>
   * @return a non-null but possibly empty list of {@link Allocation} instances
   */
  public Set<Allocation> getAllocation() {
    if (allocation == null) {
      allocation = new TreeSet<>();
    }
    return this.allocation;
  }

  /**
   * Determine if the Allocation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAllocation() {
    return ((this.allocation != null) && (!this.allocation.isEmpty()));
  }

  /**
   * Clear the Allocation field. This sets the field to null.
   */
  public void unsetAllocation() {
    this.allocation = null;
  }

  /**
   * Get a list containing each Footnote index applicable to the current
   * frequency band. Each entry in the list should be separated by a blank
   * space.
   * <p>
   * @return a non-null but possibly empty list of {@link BigInteger} instances
   */
  public Set<BigInteger> getFootnotes() {
    if (footnotes == null) {
      footnotes = new HashSet<>();
    }
    return this.footnotes;
  }

  /**
   * Determine if the Footnotes is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFootnotes() {
    return ((this.footnotes != null) && (!this.footnotes.isEmpty()));
  }

  /**
   * Clear the Footnotes field. This sets the field to null.
   */
  public void unsetFootnotes() {
    this.footnotes = null;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current FreqBand object instance
   */
  public FreqBand withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current FreqBand object instance
   */
  public FreqBand withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the permitted uses of this band (e.g., "Government", "Non-government",
   * etc).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current FreqBand object instance
   */
  public FreqBand withUseIndicator(String value) {
    if (value != null && !value.isEmpty()) {
      setUseIndicator(new TString(value));
    }
    return this;
  }

  /**
   * Set the Allocation
   * <p>
   * Complex element Allocation contains the allocation of a specific frequency
   * band to a specific radiocommunication service.
   * <p>
   * @param values One or more instances of type {@link Allocation}
   * @return The current FreqBand object instance
   */
  public FreqBand withAllocation(Allocation... values) {
    if (values != null) {
      getAllocation().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the Allocation
   * <p>
   * Complex element Allocation contains the allocation of a specific frequency
   * band to a specific radiocommunication service.
   * <p>
   * @param values A collection of {@link Allocation} instances
   * @return The current FreqBand object instance
   */
  public FreqBand withAllocation(Set<Allocation> values) {
    if (values != null) {
      getAllocation().addAll(values);
    }
    return this;
  }

  /**
   * Set a list containing each Footnote index applicable to the current
   * frequency band. Each entry in the list should be separated by a blank
   * space.
   * <p>
   * @param values One or more instances of type {@link BigInteger}
   * @return The current FreqBand object instance
   */
  public FreqBand withFootnotes(BigInteger... values) {
    if (values != null) {
      getFootnotes().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set a list containing each Footnote index applicable to the current
   * frequency band. Each entry in the list should be separated by a blank
   * space.
   * <p>
   * @param values A collection of {@link BigInteger} instances
   * @return The current FreqBand object instance
   */
  public FreqBand withFootnotes(Set<BigInteger> values) {
    if (values != null) {
      getFootnotes().addAll(values);
    }
    return this;
  }

  /**
   * Test if this FreqBand record contains the indicated frequency.
   * <p>
   * @param frequency a frequency value (MHz)
   * @return TRUE if freqMin &lt;= frequency AND freqMax &gt; frequency
   */
  public boolean contains(Double frequency) {
    return this.freqMin.ltequal(frequency) && this.freqMax.gt(frequency);
  }

  /**
   * Test if this FreqBand intersects the indicated frequency range.
   * <p>
   * This tests if EITHER the freqMin OR freqMax lie within the frequency range.
   * <p>
   * Intersection may not be complete - e.g. this freqBand record may extend
   * beyond the Range.
   * <p>
   * @param rangeMin the range minimum frequency (MHz)
   * @param rangeMax the range maximum frequency (MHz)
   * @return TRUE if this frequency band intersects the range.
   */
  public boolean intersects(Double rangeMin, Double rangeMax) {
    return (freqMin.gtequal(rangeMin) && freqMin.ltequal(rangeMax))
      || (freqMax.gtequal(rangeMin) && freqMax.ltequal(rangeMax));
  }

  /**
   * Get a string representation of this FreqBand instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "FreqBand {"
      + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
      + (allocation != null ? " allocation [" + allocation + "]" : "")
      + (useIndicator != null ? " useIndicator [" + useIndicator + "]" : "")
      + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
      + (footnotes != null ? " footnotes [" + footnotes + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link FreqBand} requires
   * {@link TDecimal FreqMax}, {@link TDecimal FreqMin}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetFreqMax() && isSetFreqMin();
  }

  /**
   * Comparable interface allows numerical sorting based upon the FreqMin value.
   * <p>
   * @param o the other object
   * @return numerical sort order.
   */
  @Override
  public int compareTo(FreqBand o) {
    if (o == null) {
      return 1;
    }
    if (freqMin == null || !freqMin.isSetValue()) {
      return -1;
    }
    return freqMin.compareTo(o.getFreqMin());
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * Footnote (Optional)
   * <p>
   * Footnote contains the text and identifier of a Footnote, FCC Rule Part
   * Number, Band User (e.g., "Military", "Civil Support Team"). or Band
   * Application (e.g., "Wind Profiler").
   * <p>
   * @since 3.1.0rc2
   */
  @XmlTransient
  private Set<Footnote> footnote;

  /**
   * Get the Footnote
   * <p>
   * Complex element Footnote contains the text and identifier of a Footnote,
   * FCC Rule Part Number, Band User (e.g., "Military", "Civil Support Team").
   * or Band Application (e.g., "Wind Profiler").
   * <p>
   * @return a non-null but possibly empty list of {@link Footnote} instances
   */
  public Set<Footnote> getFootnote() {
    if (footnote == null) {
      footnote = new HashSet<>();
    }
    return this.footnote;
  }

  /**
   * Determine if the Footnote is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFootnote() {
    return ((this.footnote != null) && (!this.footnote.isEmpty()));
  }

  /**
   * Clear the Footnote field. This sets the field to null.
   */
  public void unsetFootnote() {
    this.footnote = null;
  }

  /**
   * Set the Footnote
   * <p>
   * Complex element Footnote contains the text and identifier of a Footnote,
   * FCC Rule Part Number, Band User (e.g., "Military", "Civil Support Team").
   * or Band Application (e.g., "Wind Profiler").
   * <p>
   * @param values One or more instances of type {@link Footnote}
   * @return The current TOA object instance
   */
  public FreqBand withFootnote(Footnote... values) {
    if (values != null) {
      getFootnote().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the Footnote
   * <p>
   * Complex element Footnote contains the text and identifier of a Footnote,
   * FCC Rule Part Number, Band User (e.g., "Military", "Civil Support Team").
   * or Band Application (e.g., "Wind Profiler").
   * <p>
   * @param values A collection of {@link Footnote} instances
   * @return The current TOA object instance
   */
  public FreqBand withFootnote(Set<Footnote> values) {
    if (values != null) {
      getFootnote().addAll(values);
    }
    return this;
  }

  /**
   * Update the Footnote data type references in this Freqband record.
   * <p>
   * This method builds the exported {@link #footnotes} field with values from
   * the transient {@link #footnote} field. This method should typically be
   * called after the SSRF is configured and (optionally) before exporting an
   * SSRF message.
   * <p>
   * @since 3.1.0rc2
   */
  public void prepare() {
    if (footnote != null && !footnote.isEmpty()) {
      footnotes = new HashSet<>();
      for (Footnote fn : getFootnote()) {
        footnotes.add(fn.getIdx());
      }
    }
  }

  /**
   * Update the Footnote data type references in this FreqBand record after
   * loading from XML.
   * <p>
   * This method copies the transient {@link #footnote} with values from the
   * imported {@link #footnotes} field. This method should typically be called
   * after a SSRF is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0rc2
   */
  public void postLoad(SSRF root) {
    if (footnotes == null || footnotes.isEmpty()) {
      return;
    }
    for (TOA toa : root.getTOA()) {
      for (Footnote fn : toa.getFootnote()) {
        if (footnotes.contains(fn.getIdx())) {
          getFootnote().add(fn);
        }
      }
    }
  }//</editor-fold>
}
