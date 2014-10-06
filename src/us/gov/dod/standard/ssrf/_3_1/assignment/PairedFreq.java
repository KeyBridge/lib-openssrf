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

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * PairedFreq (US) describes an associated frequency set for the repeater,
 * duplex link or frequency diversity capability.
 * <p>
 * Element of {@link Freq}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairedFreq", propOrder = {
  "freq",
  "assignmentRef",
  "pairedASN",
  "pairedType"
})
public class PairedFreq {

  /**
   * US:Freq - Frequency (Required)
   * <p>
   * The paired frequency for the repeater, duplex link or frequency diversity
   * capability.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "Freq", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freq;
  /**
   * US:AssignmentRef - Assignment Reference (Optional)
   * <p>
   * A reference to an Assignment that is paired with this AsgnAllot in a
   * repeater, duplex link or frequency diversity capability.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "AssignmentRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString assignmentRef;
  /**
   * US:PairedASN - Paired Agency Serial Number (Optional)
   * <p>
   * The agency serial number of the assignment that is paired with this
   * Assignment in a repeater, duplex link or frequency diversity capability.
   * <p>
   * Format is S12
   */
  @XmlElement(name = "PairedASN", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterUS12.class)
  private TString pairedASN;
  /**
   * US:PairedType - Paired Type (Optional)
   * <p>
   * If the paired frequency is a transmitting repeater frequency, a receiving
   * repeater frequency, a duplex pairing, frequency diversity or space
   * diversity.
   * <p>
   * Format is L:UPU
   */
  @XmlElement(name = "PairedType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString pairedType;

  /**
   * Get the paired frequency for the repeater, duplex link or frequency
   * diversity capability.
   * <p>
   * @return the Freq value in a {@link TDecimal} data type
   */
  public TDecimal getFreq() {
    return freq;
  }

  /**
   * Set the paired frequency for the repeater, duplex link or frequency
   * diversity capability.
   * <p>
   * @param value the Freq value in a {@link TDecimal} data type
   */
  public void setFreq(TDecimal value) {
    this.freq = value;
  }

  /**
   * Determine if the Freq is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreq() {
    return (this.freq != null ? this.freq.isSetValue() : false);
  }

  /**
   * Get a reference to an Assignment that is paired with this AsgnAllot in a
   * repeater, duplex link or frequency diversity capability.
   * <p>
   * @return the AssignmentRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getAssignment()} instead.
   */
  @Deprecated
  public TString getAssignmentRef() {
    return assignmentRef;
  }

  /**
   * Set a reference to an Assignment that is paired with this AsgnAllot in a
   * repeater, duplex link or frequency diversity capability.
   * <p>
   * @param value the AssignmentRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setAssignment(Assignment)} instead.
   */
  @Deprecated
  public void setAssignmentRef(TString value) {
    this.assignmentRef = value;
  }

  /**
   * Determine if the AssignmentRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAssignmentRef() {
    return (this.assignmentRef != null ? this.assignmentRef.isSetValue() : false);
  }

  /**
   * Get the agency serial number of the assignment that is paired with this
   * Assignment in a repeater, duplex link or frequency diversity capability.
   * <p>
   * @return the PairedASN value in a {@link TString} data type
   */
  public TString getPairedASN() {
    return pairedASN;
  }

  /**
   * Set the agency serial number of the assignment that is paired with this
   * Assignment in a repeater, duplex link or frequency diversity capability.
   * <p>
   * @param value the PairedASN value in a {@link TString} data type
   */
  public void setPairedASN(TString value) {
    this.pairedASN = value;
  }

  /**
   * Determine if the PairedASN is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPairedASN() {
    return (this.pairedASN != null ? this.pairedASN.isSetValue() : false);
  }

  /**
   * Get if the paired frequency is a transmitting repeater frequency, a
   * receiving repeater frequency, a duplex pairing, frequency diversity or
   * space diversity.
   * <p>
   * @return the PairedType value in a {@link TString} data type
   */
  public TString getPairedType() {
    return pairedType;
  }

  /**
   * Set if the paired frequency is a transmitting repeater frequency, a
   * receiving repeater frequency, a duplex pairing, frequency diversity or
   * space diversity.
   * <p>
   * @param value the PairedType value in a {@link TString} data type
   */
  public void setPairedType(TString value) {
    this.pairedType = value;
  }

  /**
   * Determine if the PairedType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPairedType() {
    return (this.pairedType != null ? this.pairedType.isSetValue() : false);
  }

  /**
   * Set the paired frequency for the repeater, duplex link or frequency
   * diversity capability.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current PairedFreq object instance
   */
  public PairedFreq withFreq(Double value) {
    setFreq(new TDecimal(value));
    return this;
  }

  /**
   * Set a reference to an Assignment that is paired with this AsgnAllot in a
   * repeater, duplex link or frequency diversity capability.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current PairedFreq object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withAssignment(Assignment)} instead.
   */
  @Deprecated
  public PairedFreq withAssignmentRef(String value) {
    setAssignmentRef(new TString(value));
    return this;
  }

  /**
   * Set the agency serial number of the assignment that is paired with this
   * Assignment in a repeater, duplex link or frequency diversity capability.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current PairedFreq object instance
   */
  public PairedFreq withPairedASN(String value) {
    setPairedASN(new TString(value));
    return this;
  }

  /**
   * Set if the paired frequency is a transmitting repeater frequency, a
   * receiving repeater frequency, a duplex pairing, frequency diversity or
   * space diversity.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current PairedFreq object instance
   */
  public PairedFreq withPairedType(String value) {
    setPairedType(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this PairedFreq instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "PairedFreq {"
      + (assignmentRef != null ? " assignmentRef [" + assignmentRef + "]" : "")
      + (pairedASN != null ? " pairedASN [" + pairedASN + "]" : "")
      + (freq != null ? " freq [" + freq + "]" : "")
      + (pairedType != null ? " pairedType [" + pairedType + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link PairedFreq} requires {@link TDecimal Freq}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetFreq();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * US:AssignmentRef - Assignment Reference (Optional)
   * <p>
   * A reference to an Assignment that is paired with this AsgnAllot in a
   * repeater, duplex link or frequency diversity capability.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Assignment assignment;

  /**
   * Get a reference to an Assignment that is paired with this AsgnAllot in a
   * repeater, duplex link or frequency diversity capability.
   * <p>
   * @return a {@link Assignment} instance
   * @since 3.1.0
   */
  public Assignment getAssignment() {
    return assignment;
  }

  /**
   * Determine if the assignment field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAssignment() {
    return this.assignment != null;
  }

  /**
   * Set a reference to an Assignment that is paired with this AsgnAllot in a
   * repeater, duplex link or frequency diversity capability.
   * <p>
   * @param value An instances of type {@link Assignment}
   * @return The current PairedFreq object instance
   * @since 3.1.0
   */
  public PairedFreq withAssignment(Assignment value) {
    this.assignment = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this PairedFreq record.
   * <p>
   * This method builds the exported {@link #assignmentRef} field with values
   * from the transient {@link #assignment} field. This method should typically
   * be called after the PairedFreq is configured and (optionally) before
   * exporting an SSRF message.
   * <p>
   * @return The current PairedFreq object instance
   */
  public PairedFreq build() {
    this.assignmentRef = assignment != null ? assignment.getSerial() : null;
    return this;
  }//</editor-fold>

}
