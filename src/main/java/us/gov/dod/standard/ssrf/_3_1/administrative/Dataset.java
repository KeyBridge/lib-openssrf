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
package us.gov.dod.standard.ssrf._3_1.administrative;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.Administrative;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * Dataset is used within an Administrative transaction to specify the
 * identifier of the datasets on which the action must apply.
 * <p>
 * Element of {@link Administrative}
 * <p>
 * Sub-Element is
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "Serial", required = true)
  @XmlTypeValidator(type = TSerial.class, value = XmlAdapterSERIAL.class)
  private TSerial serial;
  /**
   * RetireDate - Retire Date (Optional)
   * <p>
   * The date this Dataset goes out of force.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "RetireDate", required = false)
  private TDate retireDate;
  /**
   * Reason - Reason (Optional)
   * <p>
   * The reason linked to the Action performed on this dataset.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "Reason", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString reason;
  /**
   * MissingRef (Optional)
   * <p>
   * MissingRef allows the recipient of a message to signal the sender that a
   * dataset referenced in the message was not known by the recipient.
   */
  @XmlElement(name = "MissingRef", nillable = true)
  @XmlTypeValidator(type = TSerial.class, value = XmlAdapterSERIAL.class)
  private Set<TSerial> missingRef;

  /**
   * Get the serial of the referenced Dataset.
   * <p>
   * @return the Serial value in a {@link TString} data type
   */
  public TSerial getSerial() {
    return serial;
  }

  /**
   * Set the serial of the referenced Dataset.
   * <p>
   * @param value the Serial value in a {@link TString} data type
   */
  public void setSerial(TSerial value) {
    this.serial = value;
  }

  /**
   * Determine if the Serial is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSerial() {
    return (this.serial != null ? this.serial.isSetValue() : false);
  }

  /**
   * Get the date this Dataset goes out of force.
   * <p>
   * @return the RetireDate value in a {@link TDate} data type
   */
  public TDate getRetireDate() {
    return retireDate;
  }

  /**
   * Set the date this Dataset goes out of force.
   * <p>
   * @param value the RetireDate value in a {@link TDate} data type
   */
  public void setRetireDate(TDate value) {
    this.retireDate = value;
  }

  /**
   * Determine if the RetireDate is configured.
   * <p>
   * If configured this method also inspects the {@link TDate} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRetireDate() {
    return (this.retireDate != null ? this.retireDate.isSetValue() : false);
  }

  /**
   * Get the reason linked to the Action performed on this dataset.
   * <p>
   * @return the Reason value in a {@link TString} data type
   */
  public TString getReason() {
    return reason;
  }

  /**
   * Set the reason linked to the Action performed on this dataset.
   * <p>
   * @param value the Reason value in a {@link TString} data type
   */
  public void setReason(TString value) {
    this.reason = value;
  }

  /**
   * Determine if the Reason is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
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
   * recipient.
   * <p>
   * @return a non-null but possibly empty list of {@link TString} instances
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getMissing()} instead.
   */
  @Deprecated
  public Set<TSerial> getMissingRef() {
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
   * @param value An instances of type {@link String}
   * @return The current Dataset object instance
   */
  public Dataset withSerial(TSerial value) {
    setSerial(value);
    return this;
  }

  /**
   * Set the date this Dataset goes out of force.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Dataset object instance
   */
  public Dataset withRetireDate(Calendar value) {
    setRetireDate(new TDate(value));
    return this;
  }

  /**
   * Set the date this Dataset goes out of force.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Dataset object instance
   */
  public Dataset withRetireDate(Date value) {
    setRetireDate(new TDate(value));
    return this;
  }

  /**
   * Set the reason linked to the Action performed on this dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Dataset object instance
   */
  public Dataset withReason(String value) {
    setReason(new TString(value));
    return this;
  }

  /**
   * Set the MissingRef
   * <p>
   * Complex element MissingRef allows the recipient of a message to signal the
   * sender that a dataset referenced in the message was not known by the
   * recipient.
   * <p>
   * @param values One or more instances of type {@link TString}
   * @return The current Dataset object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withMissing(Common...)} instead.
   */
  @Deprecated
  public Dataset withMissingRef(TSerial... values) {
    if (values != null) {
      getMissingRef().addAll(new HashSet<>(Arrays.asList(values)));
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
   * @param values A collection of {@link TString} instances
   * @return The current Dataset object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withMissing(Common...)} instead.
   */
  @Deprecated
  public Dataset withMissingRef(Set<TSerial> values) {
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
           + (reason != null ? " reason [" + reason + "]" : "")
           + (missingRef != null ? " missingRef [" + missingRef + "]" : "")
           + (retireDate != null ? " retireDate [" + retireDate + "]" : "")
           + (serial != null ? " serial [" + serial + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Dataset} requires {@link TString Serial}.
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
   * This may be any instance of type {@link Common}
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
   * recipient.
   * <p>
   * @return An instance of type {@link Common}
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
   * @param values Any instances of type {@link Common}
   * @return The current Dataset object instance
   * @since 3.1.0
   */
  public Dataset withMissing(Common<?>... values) {
    return withMissing(new HashSet<>(Arrays.asList(values)));
  }

  /**
   * Set the MissingRef
   * <p>
   * Complex element MissingRef allows the recipient of a message to signal the
   * sender that a dataset referenced in the message was not known by the
   * recipient.
   * <p>
   * @param values Any instances of type {@link Common}
   * @return The current Dataset object instance
   * @since 3.1.0
   */
  public Dataset withMissing(Set<Common<?>> values) {
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
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (missingRef == null || missingRef.isEmpty()) {
      return;
    }
    /**
     * @TODO: Check ALL SSRF lists.
     */
//    for (Common<?> instance : root.getCommon < ?  > ()) {
//      if (missingRef.contains(instance.getSerial())) {
//        missing.add(instance);
//      }
//    }
  }//</editor-fold>

}
