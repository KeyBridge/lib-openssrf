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
package us.gov.dod.standard.ssrf._3_1.administrative;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Administrative;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  /**
   * RetireDate - Retire Date (Optional)
   * <p>
   * The date this Dataset goes out of force.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "RetireDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar retireDate;
  /**
   * Reason - Reason (Optional)
   * <p>
   * The reason linked to the Action performed on this dataset.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "Reason", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString reason;
  /**
   * MissingRef (Optional)
   * <p>
   * MissingRef allows the recipient of a message to signal the sender that a
   * dataset referenced in the message was not known by the recipient.
   */
  @XmlElement(name = "MissingRef", nillable = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private List<TString> missingRef;

  /**
   * Get the serial of the referenced Dataset.
   * <p>
   * @return the Serial value in a {@link TString} data type
   */
  public TString getSerial() {
    return serial;
  }

  /**
   * Set the serial of the referenced Dataset.
   * <p>
   * @param value the Serial value in a {@link TString} data type
   */
  public void setSerial(TString value) {
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
   * @return the RetireDate value in a {@link TCalendar} data type
   */
  public TCalendar getRetireDate() {
    return retireDate;
  }

  /**
   * Set the date this Dataset goes out of force.
   * <p>
   * @param value the RetireDate value in a {@link TCalendar} data type
   */
  public void setRetireDate(TCalendar value) {
    this.retireDate = value;
  }

  /**
   * Determine if the RetireDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
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
   */
  public List<TString> getMissingRef() {
    if (missingRef == null) {
      missingRef = new ArrayList<>();
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
  public Dataset withSerial(String value) {
    setSerial(new TString(value));
    return this;
  }

  /**
   * Set the date this Dataset goes out of force.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Dataset object instance
   */
  public Dataset withRetireDate(Calendar value) {
    setRetireDate(new TCalendar(value));
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
   */
  public Dataset withMissingRef(TString... values) {
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
   * @param values A collection of {@link TString} instances
   * @return The current Dataset object instance
   */
  public Dataset withMissingRef(Collection<TString> values) {
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

}
