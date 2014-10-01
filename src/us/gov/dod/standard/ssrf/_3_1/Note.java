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
package us.gov.dod.standard.ssrf._3_1;

import java.util.Calendar;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAO;

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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  /**
   * US:ExpirationDate - Expiration Date (Optional)
   * <p>
   * The date this note goes out of force.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  /**
   * US:Name - Name (Optional)
   * <p>
   * The externally-assigned name of the note.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Name", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
  /**
   * US:Source - Source (Optional)
   * <p>
   * The source or creator of the note.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Source", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
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
   * @return the EffectiveDate value in a {@link TCalendar} data type
   */
  public TCalendar getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Set the date this note comes in force.
   * <p>
   * @param value the EffectiveDate value in a {@link TCalendar} data type
   */
  public void setEffectiveDate(TCalendar value) {
    this.effectiveDate = value;
  }

  /**
   * Determine if the EffectiveDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null ? this.effectiveDate.isSetValue() : false);
  }

  /**
   * Get the date this note goes out of force.
   * <p>
   * @return the ExpirationDate value in a {@link TCalendar} data type
   */
  public TCalendar getExpirationDate() {
    return expirationDate;
  }

  /**
   * Set the date this note goes out of force.
   * <p>
   * @param value the ExpirationDate value in a {@link TCalendar} data type
   */
  public void setExpirationDate(TCalendar value) {
    this.expirationDate = value;
  }

  /**
   * Determine if the ExpirationDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
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
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date this note goes out of force.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Note object instance
   */
  public Note withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
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
      + " expirationDate [" + expirationDate + "]"
      + " source [" + source + "]"
      + " name [" + name + "]"
      + " effectiveDate [" + effectiveDate + "]"
      + " administration [" + administration + "]"
      + "}";
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
