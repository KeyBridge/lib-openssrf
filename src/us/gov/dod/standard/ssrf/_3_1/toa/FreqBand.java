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
package us.gov.dod.standard.ssrf._3_1.toa;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.TOA;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreqBand", propOrder = {
  "freqMin",
  "freqMax",
  "useIndicator",
  "allocation"
})
public class FreqBand {

  /**
   * FreqMin - Minimum Frequency (Required)
   * <p>
   * The nominal frequency or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMin", required = true)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
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
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
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
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS40.class)
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
      allocation = new HashSet<>();
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
    setUseIndicator(new TString(value));
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

}
