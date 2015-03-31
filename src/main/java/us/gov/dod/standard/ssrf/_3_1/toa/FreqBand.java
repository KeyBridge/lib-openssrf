package us.gov.dod.standard.ssrf._3_1.toa;

import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.TOA;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
   * FreqMin - Minimum Frequency (Required)    * <p>
   * The nominal frequency or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMin", required = true)
  private FreqM freqMin;
  /**
   * FreqMax - Maximum Frequency (Required)    * <p>
   * The maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMax", required = true)
  private FreqM freqMax;
  /**
   * UseIndicator - Use Indicator (Optional)    * <p>
   * The permitted uses of this band (e.g., "Government", "Non-government",
   * etc).
   * <p>
   * Format is S40
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "UseIndicator", required = false)
  private S40 useIndicator;
  /**
   * Allocation (Optional)
   * <p>
   * Allocation contains the allocation of a specific frequency band to a
   * specific radiocommunication service.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Allocation")
  private Set<Allocation> allocation;
  /**
   * footnotes - Link to band usage notes (Optional)    * <p>
   * A list containing each Footnote index applicable to the current frequency
   * band. Each entry in the list should be separated by a blank space.
   * <p>
   * Format is List of UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "footnotes")
  private Set<BigInteger> footnotes;

  /**
   * Get the nominal frequency or minimum value of the frequency range..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMin() {
    return freqMin;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range..
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
   * Get the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMax() {
    return freqMax;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin..
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
   * Get the permitted uses of this band (e.g., "Government", "Non-government",
   * etc)..
   * <p>
   * @return a {@link S40} instance
   * @since 3.1.0
   */
  public S40 getUseIndicator() {
    return useIndicator;
  }

  /**
   * Set the permitted uses of this band (e.g., "Government", "Non-government",
   * etc)..
   * <p>
   * @param value a {@link S40} instance
   * @since 3.1.0
   */
  public void setUseIndicator(S40 value) {
    this.useIndicator = value;
  }

  /**
   * Determine if the UseIndicator is configured.
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
   * band to a specific radiocommunication service..
   * <p>
   * @return a {@link Allocation} instance
   * @since 3.1.0
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
   * space..
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
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
   * @param value An instances of type {@link Double}.
   * @return The current FreqBand object instance.
   * @since 3.1.0
   */
  public FreqBand withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current FreqBand object instance.
   * @since 3.1.0
   */
  public FreqBand withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the permitted uses of this band (e.g., "Government", "Non-government",
   * etc).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current FreqBand object instance.
   * @since 3.1.0
   */
  public FreqBand withUseIndicator(String value) {
    setUseIndicator(new S40(value));
    return this;
  }

  /**
   * Set the Allocation
   * <p>
   * Complex element Allocation contains the allocation of a specific frequency
   * band to a specific radiocommunication service.
   * <p>
   * @param values One or more instances of type {@link Allocation...}.
   * @return The current FreqBand object instance.
   * @since 3.1.0
   */
  public FreqBand withAllocation(Allocation... values) {
    if (values != null) {
      getAllocation().addAll(Arrays.asList(values));
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
   * @return The current FreqBand object instance.
   * @since 3.1.0
   */
  public FreqBand withAllocation(Collection<Allocation> values) {
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
   * @param values One or more instances of type {@link BigInteger...}.
   * @return The current FreqBand object instance.
   * @since 3.1.0
   */
  public FreqBand withFootnotes(BigInteger... values) {
    if (values != null) {
      getFootnotes().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set a list containing each Footnote index applicable to the current
   * frequency band. Each entry in the list should be separated by a blank
   * space.
   * <p>
   * @param values A collection of {@link Footnotes} instances
   * @return The current FreqBand object instance.
   * @since 3.1.0
   */
  public FreqBand withFootnotes(Collection<BigInteger> values) {
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
           + (allocation != null ? "\n allocation [" + allocation + "]" : "")
           + (footnotes != null ? "\n footnotes [" + footnotes + "]" : "")
           + (freqMax != null ? "\n freqMax [" + freqMax + "]" : "")
           + (freqMin != null ? "\n freqMin [" + freqMin + "]" : "")
           + (useIndicator != null ? "\n useIndicator [" + useIndicator + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link FreqBand} requires {@link FreqM FreqMax}, {@link FreqM FreqMin}.
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
