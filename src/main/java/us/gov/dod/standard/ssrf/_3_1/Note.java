/*
 * Copyright 2014 Key Bridge LLC.
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
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "Administration", required = false)
  private TString administration;
  /**
   * US:EffectiveDate - Effective Date (Optional)
   * <p>
   * The date this note comes in force.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "EffectiveDate", required = false)
  private TDate effectiveDate;
  /**
   * US:ExpirationDate - Expiration Date (Optional)
   * <p>
   * The date this note goes out of force.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "ExpirationDate", required = false)
  private TDate expirationDate;
  /**
   * US:Name - Name (Optional)
   * <p>
   * The externally-assigned name of the note.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Name", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
  /**
   * US:Source - Source (Optional)
   * <p>
   * The source or creator of the note.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Source", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString source;

  /**
   * Get the nation or regulatory body that administers this note.
   * <p>
   * @return the Administration value in a {@link TString} data type
   */
  public TString getAdministration() {
    return administration;
  }

  /**
   * Set the nation or regulatory body that administers this note.
   * <p>
   * @param value the Administration value in a {@link TString} data type
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
   * Get the date this note comes in force.
   * <p>
   * @return the EffectiveDate value in a {@link TDate} data type
   */
  public TDate getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Set the date this note comes in force.
   * <p>
   * @param value the EffectiveDate value in a {@link TDate} data type
   */
  public void setEffectiveDate(TDate value) {
    this.effectiveDate = value;
  }

  /**
   * Determine if the EffectiveDate is configured.
   * <p>
   * If configured this method also inspects the {@link TDate} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null ? this.effectiveDate.isSetValue() : false);
  }

  /**
   * Get the date this note goes out of force.
   * <p>
   * @return the ExpirationDate value in a {@link TDate} data type
   */
  public TDate getExpirationDate() {
    return expirationDate;
  }

  /**
   * Set the date this note goes out of force.
   * <p>
   * @param value the ExpirationDate value in a {@link TDate} data type
   */
  public void setExpirationDate(TDate value) {
    this.expirationDate = value;
  }

  /**
   * Determine if the ExpirationDate is configured.
   * <p>
   * If configured this method also inspects the {@link TDate} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExpirationDate() {
    return (this.expirationDate != null ? this.expirationDate.isSetValue() : false);
  }

  /**
   * Get the externally-assigned name of the note.
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set the externally-assigned name of the note.
   * <p>
   * @param value the Name value in a {@link TString} data type
   */
  public void setName(TString value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get the source or creator of the note.
   * <p>
   * @return the Source value in a {@link TString} data type
   */
  public TString getSource() {
    return source;
  }

  /**
   * Set the source or creator of the note.
   * <p>
   * @param value the Source value in a {@link TString} data type
   */
  public void setSource(TString value) {
    this.source = value;
  }

  /**
   * Determine if the Source is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSource() {
    return (this.source != null ? this.source.isSetValue() : false);
  }

  /**
   * Set the nation or regulatory body that administers this note.
   * <p>
   * @param value An instances of type {@link ListCAO}
   * @return The current Note object instance
   */
  public Note withAdministration(ListCAO value) {
    setAdministration(new TString(value.value()));
    return this;
  }

  /**
   * Set the date this note comes in force.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Note object instance
   */
  public Note withEffectiveDate(Calendar value) {
    setEffectiveDate(new TDate(value));
    return this;
  }

  /**
   * Set the date this note comes in force.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Note object instance
   */
  public Note withEffectiveDate(Date value) {
    setEffectiveDate(new TDate(value));
    return this;
  }

  /**
   * Set the date this note goes out of force.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Note object instance
   */
  public Note withExpirationDate(Calendar value) {
    setExpirationDate(new TDate(value));
    return this;
  }

  /**
   * Set the date this note goes out of force.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Note object instance
   */
  public Note withExpirationDate(Date value) {
    setExpirationDate(new TDate(value));
    return this;
  }

  /**
   * Set the externally-assigned name of the note.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Note object instance
   */
  public Note withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set the source or creator of the note.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Note object instance
   */
  public Note withSource(String value) {
    setSource(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this Note instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Note {"
           + (expirationDate != null ? " expirationDate [" + expirationDate + "]" : "")
           + (source != null ? " source [" + source + "]" : "")
           + (name != null ? " name [" + name + "]" : "")
           + (effectiveDate != null ? " effectiveDate [" + effectiveDate + "]" : "")
           + (administration != null ? " administration [" + administration + "]" : "")
           + "\n  Note." + super.toString() + "\n"
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Note} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TDate EntryDateTime}.
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
