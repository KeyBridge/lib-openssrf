package us.gov.dod.standard.ssrf._3_1.assignment;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * RecordNote (US) contains a reference to a formal host nation "note" and
 * specific comments.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordNote", propOrder = {
  "noteRef",
  "comments"
})
public class RecordNote {

  /**
   * US:NoteRef - Note Reference (Required)    * <p>
   * A reference to the Note dataset that describes the note identified in
   * NoteCode.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NoteRef", required = true)
  private Serial noteRef;
  /**
   * US:Comments - Comments (Optional)    * <p>
   * The Amplifying conditional comments for the note as agreed to by the
   * Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment
   * Subcommittee (FAS).
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Comments", required = false)
  private MEMO comments;

  /**
   * Get a reference to the Note dataset that describes the note identified in
   * NoteCode..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getNote()} instead.
   */
  @Deprecated
  public Serial getNoteRef() {
    return noteRef;
  }

  /**
   * Set a reference to the Note dataset that describes the note identified in
   * NoteCode..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setNote(Note)} instead.
   */
  @Deprecated
  public void setNoteRef(Serial value) {
    this.noteRef = value;
  }

  /**
   * Determine if the NoteRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNoteRef() {
    return (this.noteRef != null ? this.noteRef.isSetValue() : false);
  }

  /**
   * Get the Amplifying conditional comments for the note as agreed to by the
   * Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment
   * Subcommittee (FAS)..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getComments() {
    return comments;
  }

  /**
   * Set the Amplifying conditional comments for the note as agreed to by the
   * Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment
   * Subcommittee (FAS)..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setComments(MEMO value) {
    this.comments = value;
  }

  /**
   * Determine if the Comments is configured.
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
   * @param value An instances of type {@link Serial}.
   * @return The current RecordNote object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withNote(Note)} instead.
   */
  @Deprecated
  public RecordNote withNoteRef(Serial value) {
    setNoteRef(value);
    return this;
  }

  /**
   * Set the Amplifying conditional comments for the note as agreed to by the
   * Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment
   * Subcommittee (FAS).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current RecordNote object instance.
   * @since 3.1.0
   */
  public RecordNote withComments(String value) {
    setComments(new MEMO(value));
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
           + (comments != null ? " comments [" + comments + "]" : "")
           + (noteRef != null ? " noteRef [" + noteRef + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RecordNote} requires {@link Serial NoteRef}.
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
   * US:NoteRef - Note Reference (Required)    * <p>
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
   * NoteCode..
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
   * @param value An instances of type {@link Note}.
   * @return The current RecordNote object instance.
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
   * <p>
   * @since 3.1.0
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
   * after the RecordNote is imported from XML. * @param root the SSRF root
   * instance.
   * <p>
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
