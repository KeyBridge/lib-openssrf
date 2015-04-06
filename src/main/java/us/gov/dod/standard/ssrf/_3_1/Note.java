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
package us.gov.dod.standard.ssrf._3_1;

import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * Note (US) is the XML root for all parameters of a Note.
 * <p>
 * Example:
 * <pre>
 * &lt;Note&gt;
 *   &lt;Administration cls="U"&gt;USA&lt;/Administration&gt;
 *   &lt;EffectiveDate cls="U"&gt;2014-01-23&lt;/EffectiveDate&gt;
 *   &lt;ExpirationDate cls="U"&gt;2014-12-31&lt;/ExpirationDate&gt;
 *   &lt;Name cls="U"&gt;Target 743&lt;/Name&gt;
 *   &lt;Source cls="U"&gt;Joint Spectrum Center&lt;/Source&gt;
 * &lt;/Note&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Note", propOrder = {
  "administration",
  "effectiveDate",
  "expirationDate",
  "name",
  "source"
})
public class Note extends Common<Note> {

  /**
   * US:Administration - Administration (Optional)
   * <p>
   * The nation or regulatory body that administers this note.
   * <p>
   * Format is L:CAO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Administration", required = false)
  private TString administration;
  /**
   * US:EffectiveDate - Effective Date (Optional)
   * <p>
   * The date this note comes in force.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EffectiveDate", required = false)
  private D effectiveDate;
  /**
   * US:ExpirationDate - Expiration Date (Optional)
   * <p>
   * The date this note goes out of force.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ExpirationDate", required = false)
  private D expirationDate;
  /**
   * US:Name - Name (Optional)
   * <p>
   * The externally-assigned name of the note.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Name", required = false)
  private S100 name;
  /**
   * US:Source - Source (Optional)
   * <p>
   * The source or creator of the note.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Source", required = false)
  private S100 source;

  /**
   * No arg constructor. Initializes the Common required fields.
   */
  public Note() {
    super();
  }

  /**
   * Get the nation or regulatory body that administers this note..
   * <p>
   * @return the Administration value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAdministration() {
    return administration;
  }

  /**
   * Set the nation or regulatory body that administers this note..
   * <p>
   * @param value the Administration value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setAdministration(TString value) {
    this.administration = value;
  }

  /**
   * Determine if the Administration is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAdministration() {
    return (this.administration != null ? this.administration.isSetValue() : false);
  }

  /**
   * Get the date this note comes in force..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Set the date this note comes in force..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setEffectiveDate(D value) {
    this.effectiveDate = value;
  }

  /**
   * Determine if the EffectiveDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null ? this.effectiveDate.isSetValue() : false);
  }

  /**
   * Get the date this note goes out of force..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getExpirationDate() {
    return expirationDate;
  }

  /**
   * Set the date this note goes out of force..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setExpirationDate(D value) {
    this.expirationDate = value;
  }

  /**
   * Determine if the ExpirationDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExpirationDate() {
    return (this.expirationDate != null ? this.expirationDate.isSetValue() : false);
  }

  /**
   * Get the externally-assigned name of the note..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getName() {
    return name;
  }

  /**
   * Set the externally-assigned name of the note..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setName(S100 value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get the source or creator of the note..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getSource() {
    return source;
  }

  /**
   * Set the source or creator of the note..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setSource(S100 value) {
    this.source = value;
  }

  /**
   * Determine if the Source is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSource() {
    return (this.source != null ? this.source.isSetValue() : false);
  }

  /**
   * Set the nation or regulatory body that administers this note.
   * <p>
   * @param value An instances of type {@link ListCAO}.
   * @return The current Note object instance.
   * @since 3.1.0
   */
  public Note withAdministration(ListCAO value) {
    setAdministration(new TString(value.value()));
    return this;
  }

  /**
   * Set the date this note comes in force.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Note object instance.
   * @since 3.1.0
   */
  public Note withEffectiveDate(Calendar value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the date this note comes in force.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Note object instance.
   * @since 3.1.0
   */
  public Note withEffectiveDate(Date value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the date this note goes out of force.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Note object instance.
   * @since 3.1.0
   */
  public Note withExpirationDate(Calendar value) {
    setExpirationDate(new D(value));
    return this;
  }

  /**
   * Set the date this note goes out of force.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Note object instance.
   * @since 3.1.0
   */
  public Note withExpirationDate(Date value) {
    setExpirationDate(new D(value));
    return this;
  }

  /**
   * Set the externally-assigned name of the note.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Note object instance.
   * @since 3.1.0
   */
  public Note withName(String value) {
    setName(new S100(value));
    return this;
  }

  /**
   * Set the source or creator of the note.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Note object instance.
   * @since 3.1.0
   */
  public Note withSource(String value) {
    setSource(new S100(value));
    return this;
  }

  /**
   * Get a string representation of this Note instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  Note {"
           + (administration != null ? " administration [" + administration + "]" : "")
           + (effectiveDate != null ? " effectiveDate [" + effectiveDate + "]" : "")
           + (expirationDate != null ? " expirationDate [" + expirationDate + "]" : "")
           + (name != null ? " name [" + name + "]" : "")
           + (source != null ? " source [" + source + "]" : "")
           + super.toString();
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Note} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return true;
  }

}
