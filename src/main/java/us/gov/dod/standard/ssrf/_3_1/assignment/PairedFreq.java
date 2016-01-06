/*
 * Copyright 2015 Key Bridge LLC.
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
package us.gov.dod.standard.ssrf._3_1.assignment;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.FreqM;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.S20;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.Serial;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.US12;

/**
 * PairedFreq (US) describes an associated frequency set for the repeater,
 * duplex link or frequency diversity capability.
 * <p>
 * Element of {@link Freq}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Freq", required = true)
  private FreqM freq;
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
  @XmlElement(name = "AssignmentRef", required = false)
  private Serial assignmentRef;
  /**
   * US:PairedASN - Paired Agency Serial Number (Optional)
   * <p>
   * The agency serial number of the assignment that is paired with this
   * Assignment in a repeater, duplex link or frequency diversity capability.
   * <p>
   * Format is S12
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PairedASN", required = false)
  private US12 pairedASN;
  /**
   * US:PairedType - Paired Type (Optional)
   * <p>
   * If the paired frequency is a transmitting repeater frequency, a receiving
   * repeater frequency, a duplex pairing, frequency diversity or space
   * diversity.
   * <p>
   * Format is L:UPU
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PairedType", required = false)
  private S20 pairedType;

  /**
   * Get the paired frequency for the repeater, duplex link or frequency
   * diversity capability..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreq() {
    return freq;
  }

  /**
   * Set the paired frequency for the repeater, duplex link or frequency
   * diversity capability..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreq(FreqM value) {
    this.freq = value;
  }

  /**
   * Determine if the Freq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreq() {
    return (this.freq != null ? this.freq.isSetValue() : false);
  }

  /**
   * Get a reference to an Assignment that is paired with this AsgnAllot in a
   * repeater, duplex link or frequency diversity capability..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getAssignment()} instead.
   */
  @Deprecated
  public Serial getAssignmentRef() {
    return assignmentRef;
  }

  /**
   * Set a reference to an Assignment that is paired with this AsgnAllot in a
   * repeater, duplex link or frequency diversity capability..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setAssignment(Assignment)} instead.
   */
  @Deprecated
  public void setAssignmentRef(Serial value) {
    this.assignmentRef = value;
  }

  /**
   * Determine if the AssignmentRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAssignmentRef() {
    return (this.assignmentRef != null ? this.assignmentRef.isSetValue() : false);
  }

  /**
   * Get the agency serial number of the assignment that is paired with this
   * Assignment in a repeater, duplex link or frequency diversity capability..
   * <p>
   * @return a {@link US12} instance
   * @since 3.1.0
   */
  public US12 getPairedASN() {
    return pairedASN;
  }

  /**
   * Set the agency serial number of the assignment that is paired with this
   * Assignment in a repeater, duplex link or frequency diversity capability..
   * <p>
   * @param value a {@link US12} instance
   * @since 3.1.0
   */
  public void setPairedASN(US12 value) {
    this.pairedASN = value;
  }

  /**
   * Determine if the PairedASN is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPairedASN() {
    return (this.pairedASN != null ? this.pairedASN.isSetValue() : false);
  }

  /**
   * Get if the paired frequency is a transmitting repeater frequency, a
   * receiving repeater frequency, a duplex pairing, frequency diversity or
   * space diversity..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getPairedType() {
    return pairedType;
  }

  /**
   * Set if the paired frequency is a transmitting repeater frequency, a
   * receiving repeater frequency, a duplex pairing, frequency diversity or
   * space diversity..
   * <p>
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setPairedType(S20 value) {
    this.pairedType = value;
  }

  /**
   * Determine if the PairedType is configured.
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
   * @param value An instances of type {@link Double}.
   * @return The current PairedFreq object instance.
   * @since 3.1.0
   */
  public PairedFreq withFreq(Double value) {
    setFreq(new FreqM(value));
    return this;
  }

  /**
   * Set a reference to an Assignment that is paired with this AsgnAllot in a
   * repeater, duplex link or frequency diversity capability.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current PairedFreq object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withAssignment(Assignment)} instead.
   */
  @Deprecated
  public PairedFreq withAssignmentRef(Serial value) {
    setAssignmentRef(value);
    return this;
  }

  /**
   * Set the agency serial number of the assignment that is paired with this
   * Assignment in a repeater, duplex link or frequency diversity capability.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current PairedFreq object instance.
   * @since 3.1.0
   */
  public PairedFreq withPairedASN(String value) {
    setPairedASN(new US12(value));
    return this;
  }

  /**
   * Set if the paired frequency is a transmitting repeater frequency, a
   * receiving repeater frequency, a duplex pairing, frequency diversity or
   * space diversity.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current PairedFreq object instance.
   * @since 3.1.0
   */
  public PairedFreq withPairedType(String value) {
    setPairedType(new S20(value));
    return this;
  }

  /**
   * Get a string representation of this PairedFreq instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  PairedFreq {"
           + (assignmentRef != null ? " assignmentRef [" + assignmentRef + "]" : "")
           + (freq != null ? " freq [" + freq + "]" : "")
           + (pairedASN != null ? " pairedASN [" + pairedASN + "]" : "")
           + (pairedType != null ? " pairedType [" + pairedType + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link PairedFreq} requires {@link FreqM Freq}.
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
   * repeater, duplex link or frequency diversity capability..
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
   * @param value An instances of type {@link Assignment}.
   * @return The current PairedFreq object instance.
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
   * @since 3.1.0
   */
  public void prepare() {
    this.assignmentRef = assignment != null ? assignment.getSerial() : this.assignmentRef;
  }

  /**
   * Update the SSRF data type references in this PairedFreq record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #assignment} with values from the
   * imported {@link #assignmentRef} field. This method should typically be
   * called after the PairedFreq is imported from XML. * @param root the SSRF
   * root instance.
   * <p>
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (assignmentRef == null || !assignmentRef.isSetValue()) {
      return;
    }
    for (Assignment instance : root.getAssignment()) {
      if (assignmentRef.equals(instance.getSerial())) {
        assignment = instance;
        return;
      }
    }
  }//</editor-fold>

}
