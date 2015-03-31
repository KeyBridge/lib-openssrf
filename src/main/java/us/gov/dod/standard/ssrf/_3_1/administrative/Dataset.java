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
package us.gov.dod.standard.ssrf._3_1.administrative;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * Dataset is used within an Administrative transaction to specify the
 * identifier of the datasets on which the action must apply.
 * <p>
 * Element of {@link Administrative}
 * <p>
 * Sub-Element is
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dataset", propOrder = {
  "serial",
  "retireDate",
  "reason",
  "missingRef"
})
public class Dataset {

  /**
   * Serial - Serial (Required)
   * <p>
   * The serial of the referenced Dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Serial", required = true)
  private Serial serial;
  /**
   * RetireDate - Retire Date (Optional)
   * <p>
   * The date this Dataset goes out of force.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RetireDate", required = false)
  private D retireDate;
  /**
   * Reason - Reason (Optional)
   * <p>
   * The reason linked to the Action performed on this dataset.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Reason", required = false)
  private MEMO reason;
  /**
   * MissingRef (Optional)
   * <p>
   * MissingRef allows the recipient of a message to signal the sender that a
   * dataset referenced in the message was not known by the recipient.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MissingRef", nillable = true)
  private Set<Serial> missingRef;

  /**
   * Get the serial of the referenced Dataset..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   */
  public Serial getSerial() {
    return serial;
  }

  /**
   * Set the serial of the referenced Dataset..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   */
  public void setSerial(Serial value) {
    this.serial = value;
  }

  /**
   * Determine if the Serial is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSerial() {
    return (this.serial != null ? this.serial.isSetValue() : false);
  }

  /**
   * Get the date this Dataset goes out of force..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getRetireDate() {
    return retireDate;
  }

  /**
   * Set the date this Dataset goes out of force..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setRetireDate(D value) {
    this.retireDate = value;
  }

  /**
   * Determine if the RetireDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRetireDate() {
    return (this.retireDate != null ? this.retireDate.isSetValue() : false);
  }

  /**
   * Get the reason linked to the Action performed on this dataset..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getReason() {
    return reason;
  }

  /**
   * Set the reason linked to the Action performed on this dataset..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setReason(MEMO value) {
    this.reason = value;
  }

  /**
   * Determine if the Reason is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReason() {
    return (this.reason != null ? this.reason.isSetValue() : false);
  }

  /**
   * Get the MissingRef
   * <p>
   * Complex element MissingRef allows the recipient of a message to signal the
   * sender that a dataset referenced in the message was not known by the
   * recipient..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getMissing()} instead.
   */
  @Deprecated
  public Set<Serial> getMissingRef() {
    if (missingRef == null) {
      missingRef = new HashSet<>();
    }
    return this.missingRef;
  }

  /**
   * Determine if the MissingRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMissingRef() {
    return ((this.missingRef != null) && (!this.missingRef.isEmpty()));
  }

  /**
   * Clear the MissingRef field. This sets the field to null.
   */
  public void unsetMissingRef() {
    this.missingRef = null;
  }

  /**
   * Set the serial of the referenced Dataset.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current Dataset object instance.
   * @since 3.1.0
   */
  public Dataset withSerial(Serial value) {
    setSerial(value);
    return this;
  }

  /**
   * Set the date this Dataset goes out of force.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Dataset object instance.
   * @since 3.1.0
   */
  public Dataset withRetireDate(Calendar value) {
    setRetireDate(new D(value));
    return this;
  }

  /**
   * Set the date this Dataset goes out of force.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Dataset object instance.
   * @since 3.1.0
   */
  public Dataset withRetireDate(Date value) {
    setRetireDate(new D(value));
    return this;
  }

  /**
   * Set the reason linked to the Action performed on this dataset.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Dataset object instance.
   * @since 3.1.0
   */
  public Dataset withReason(String value) {
    setReason(new MEMO(value));
    return this;
  }

  /**
   * Set the MissingRef
   * <p>
   * Complex element MissingRef allows the recipient of a message to signal the
   * sender that a dataset referenced in the message was not known by the
   * recipient.
   * <p>
   * @param values One or more instances of type {@link MissingRef...}.
   * @return The current Dataset object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withMissing(Common...)} instead.
   */
  @Deprecated
  public Dataset withMissingRef(Serial... values) {
    if (values != null) {
      getMissingRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the MissingRef
   * <p>
   * Complex element MissingRef allows the recipient of a message to signal the
   * sender that a dataset referenced in the message was not known by the
   * recipient.
   * <p>
   * @param values A collection of {@link Serial} instances
   * @return The current Dataset object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withMissing(Common...)} instead.
   */
  @Deprecated
  public Dataset withMissingRef(Collection<Serial> values) {
    if (values != null) {
      getMissingRef().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Dataset instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Dataset {"
           + (missingRef != null ? "\n missingRef [" + missingRef + "]" : "")
           + (reason != null ? "\n reason [" + reason + "]" : "")
           + (retireDate != null ? "\n retireDate [" + retireDate + "]" : "")
           + (serial != null ? "\n serial [" + serial + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Dataset} requires {@link Serial Serial}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetSerial();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * MissingRef (Optional)
   * <p>
   * MissingRef allows the recipient of a message to signal the sender that a
   * dataset referenced in the message was not known by the recipient.
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Set<Common<?>> missing;

  /**
   * Get the MissingRef
   * <p>
   * Complex element MissingRef allows the recipient of a message to signal the
   * sender that a dataset referenced in the message was not known by the
   * recipient..
   * <p>
   * @return a {@link Common} instance
   * @since 3.1.0
   */
  public Set<Common<?>> getMissing() {
    if (missing == null) {
      missing = new HashSet<>();
    }
    return missing;
  }

  /**
   * Determine if the missing field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMissing() {
    return this.missing != null && !this.missing.isEmpty();
  }

  /**
   * Set the MissingRef
   * <p>
   * Complex element MissingRef allows the recipient of a message to signal the
   * sender that a dataset referenced in the message was not known by the
   * recipient.
   * <p>
   * @param values An instances of type {@link Common<?>}.
   * @return The current Dataset object instance.
   * @since 3.1.0
   */
  public Dataset withMissing(Common<?>... values) {
    return withMissing(Arrays.asList(values));
  }

  /**
   * Set the MissingRef
   * <p>
   * Complex element MissingRef allows the recipient of a message to signal the
   * sender that a dataset referenced in the message was not known by the
   * recipient.
   * <p>
   * @param values An instances of type {@link Common<?>}.
   * @return The current Dataset object instance.
   * @since 3.1.0
   */
  public Dataset withMissing(Collection<Common<?>> values) {
    getMissing().addAll(values);
    return this;
  }

  /**
   * Update the SSRF data type references in this Dataset record.
   * <p>
   * This method builds the exported {@link #missingRef} field with values from
   * the transient {@link #missing} field. This method should typically be
   * called after the Dataset is configured and (optionally) before exporting an
   * SSRF message.
   * <p>
   * @since 3.1.0
   */
  public void prepare() {
    this.missingRef = new HashSet<>();
    for (Common<?> instance : getMissing()) {
      this.missingRef.add(instance.getSerial());
    }
  }

  /**
   * Update the SSRF data type references in this Dataset record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #missing} with values from the
   * imported {@link #missingRef} field. This method should typically be called
   * after the Dataset is imported from XML.
   * <p>
   * @param root the SSRF root instance.
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (missingRef == null || missingRef.isEmpty()) {
      return;
    }
    /**
     * @TODO: Check ALL SSRF lists.
     */
//    for (Common<?> instance : root.getCommon < ?  > ()) {      if (missingRef.contains(instance.getSerial())) {        missing.add(instance);      }    }
  }//</editor-fold>

}
