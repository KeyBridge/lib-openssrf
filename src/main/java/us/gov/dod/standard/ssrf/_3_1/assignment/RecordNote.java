package us.gov.dod.standard.ssrf._3_1.assignment;

import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
RecordNote (US) contains a reference to a formal host nation "note" and specific comments.

Element of {@link Assignment}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordNote", propOrder = {
    "noteRef",
    "comments"
})
public class RecordNote {

/**
US:NoteRef  - Note Reference (Required) 

A reference to the Note dataset that describes the note identified in NoteCode.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "NoteRef", required = true)
      private  Serial noteRef;
/**
US:Comments  - Comments (Optional) 

The Amplifying conditional comments for the note as agreed to by the Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment Subcommittee (FAS).

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "Comments", required = false)
    private MEMO comments;

/**
Get a reference to the Note dataset that describes the note identified in NoteCode.

@return the NoteRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getNote()} instead.
*/
@Deprecated
public Serial getNoteRef() {
        return noteRef;
    }

/**
Set a reference to the Note dataset that describes the note identified in NoteCode.

@param value the NoteRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setNote(Note)} instead.
*/
@Deprecated
public void setNoteRef(Serial value) {
        this.noteRef = value;
    }

/**
Determine if the NoteRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNoteRef() {
        return (this.noteRef!= null);
    }

/**
Get the Amplifying conditional comments for the note as agreed to by the Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment Subcommittee (FAS).

@return the Comments value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getComments() {
        return comments;
    }

/**
Set the Amplifying conditional comments for the note as agreed to by the Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment Subcommittee (FAS).

@param value the Comments value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setComments(MEMO value) {
        this.comments = value;
    }

/**
Determine if the Comments is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetComments() {
        return (this.comments!= null);
    }

/**
Set a reference to the Note dataset that describes the note identified in NoteCode.

@param value  An instances of type {@link Serial}
@return The current RecordNote object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withNote(Note)} instead.
*/
@Deprecated
    public RecordNote withNoteRef(TSerial value) {
        return this;
    }

/**
Set the Amplifying conditional comments for the note as agreed to by the Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment Subcommittee (FAS).

@param value  An instances of type {@link String}
@return The current RecordNote object instance
@since 3.1.0
*/
    public RecordNote withComments(String value) {
           setComments(new MEMO(value));
        return this;
    }

/**
 Get a string representation of this RecordNote instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "RecordNote {"
 + (comments !=null? " comments [" + comments +"]" : "") 
 + (noteRef !=null? " noteRef [" + noteRef +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link RecordNote} requires {@link Serial NoteRef}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetNoteRef();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
US:NoteRef  - Note Reference (Required) 

A reference to the Note dataset that describes the note identified in NoteCode.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Note note;

/**
Get a reference to the Note dataset that describes the note identified in NoteCode.

@return  a {@link Note} instance
@since 3.1.0
*/
public Note getNote(){
return note;
}
/**
 Determine if the note field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetNote() {
    return this.note != null ;
}

/**
Set a reference to the Note dataset that describes the note identified in NoteCode.

@param value  An instances of type {@link Note}
@return The current RecordNote object instance
@since 3.1.0
*/
public RecordNote withNote(Note value) {
this.note = value;
return this;
}

  /**
   * Update the SSRF data type references in this RecordNote record.
   * <p>
 */
public void prepare() {
this.noteRef = note !=null? note.getSerial() : null;
}

/**
   * Update the SSRF data type references in this RecordNote record after loading from XML.

   * This method builds the transient {@link #note} with values
   * from the imported {@link #noteRef} field. This method should
   * typically be called after the RecordNote is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (noteRef==null || !noteRef.isSetValue() ) {return;}
for(Note instance : root.getNote()) {
if(noteRef.equals(instance.getSerial())){
note = instance;
return;}
}}//</editor-fold>

}
