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
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.Note;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * RecordNote (US) contains a reference to a formal host nation "note" and
 * specific comments.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordNote", propOrder = {
  "noteRef",
  "comments"
})
public class RecordNote {

  /**
   * US:NoteRef - Note Reference (Required)
   * <p>
   * A reference to the Note dataset that describes the note identified in
   * NoteCode.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "NoteRef", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString noteRef;
  /**
   * US:Comments - Comments (Optional)
   * <p>
   * The Amplifying conditional comments for the note as agreed to by the
   * Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment
   * Subcommittee (FAS).
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "Comments", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString comments;

  /**
   * Get a reference to the Note dataset that describes the note identified in
   * NoteCode.
   * <p>
   * @return the NoteRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getNote()} instead.
   */
  @Deprecated
  public TString getNoteRef() {
    return noteRef;
  }

  /**
   * Set a reference to the Note dataset that describes the note identified in
   * NoteCode.
   * <p>
   * @param value the NoteRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setNote(Note)} instead.
   */
  @Deprecated
  public void setNoteRef(TString value) {
    this.noteRef = value;
  }

  /**
   * Determine if the NoteRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNoteRef() {
    return (this.noteRef != null ? this.noteRef.isSetValue() : false);
  }

  /**
   * Get the Amplifying conditional comments for the note as agreed to by the
   * Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment
   * Subcommittee (FAS).
   * <p>
   * @return the Comments value in a {@link TString} data type
   */
  public TString getComments() {
    return comments;
  }

  /**
   * Set the Amplifying conditional comments for the note as agreed to by the
   * Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment
   * Subcommittee (FAS).
   * <p>
   * @param value the Comments value in a {@link TString} data type
   */
  public void setComments(TString value) {
    this.comments = value;
  }

  /**
   * Determine if the Comments is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetComments() {
    return (this.comments != null ? this.comments.isSetValue() : false);
  }

  /**
   * Set a reference to the Note dataset that describes the note identified in
   * NoteCode.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RecordNote object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withNote(Note)} instead.
   */
  @Deprecated
  public RecordNote withNoteRef(String value) {
    setNoteRef(new TString(value));
    return this;
  }

  /**
   * Set the Amplifying conditional comments for the note as agreed to by the
   * Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment
   * Subcommittee (FAS).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RecordNote object instance
   */
  public RecordNote withComments(String value) {
    setComments(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this RecordNote instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RecordNote {"
      + (noteRef != null ? " noteRef [" + noteRef + "]" : "")
      + (comments != null ? " comments [" + comments + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RecordNote} requires {@link TString NoteRef}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetNoteRef();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * US:NoteRef - Note Reference (Required)
   * <p>
   * A reference to the Note dataset that describes the note identified in
   * NoteCode.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Note note;

  /**
   * Get a reference to the Note dataset that describes the note identified in
   * NoteCode.
   * <p>
   * @return a {@link Note} instance
   * @since 3.1.0
   */
  public Note getNote() {
    return note;
  }

  /**
   * Determine if the note field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNote() {
    return this.note != null;
  }

  /**
   * Set a reference to the Note dataset that describes the note identified in
   * NoteCode.
   * <p>
   * @param value An instances of type {@link Note}
   * @return The current RecordNote object instance
   * @since 3.1.0
   */
  public RecordNote withNote(Note value) {
    this.note = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this RecordNote record.
   * <p>
   * This method builds the exported {@link #noteRef} field with values from the
   * transient {@link #note} field. This method should typically be called after
   * the RecordNote is configured and (optionally) before exporting an SSRF
   * message.
   */
  public void prepare() {
    this.noteRef = note != null ? note.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this RecordNote record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #note} with values from the
   * imported {@link #noteRef} field. This method should typically be called
   * after the RecordNote is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (noteRef == null || !noteRef.isSetValue()) {
      return;
    }
    for (Note instance : root.getNote()) {
      if (noteRef.equals(instance.getSerial())) {
        note = instance;
        return;
      }
    }
  }//</editor-fold>

}
