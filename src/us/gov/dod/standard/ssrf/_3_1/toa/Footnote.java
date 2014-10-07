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
package us.gov.dod.standard.ssrf._3_1.toa;

import java.math.BigInteger;
import java.util.Objects;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf.SSRFUtility;
import us.gov.dod.standard.ssrf._3_1.TOA;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterNumberUN6;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCTA;

/**
 * Footnote contains the text and identifier of a Footnote, FCC Rule Part
 * Number, Band User (e.g., "Military", "Civil Support Team"). or Band
 * Application (e.g., "Wind Profiler").
 * <p>
 * Element of {@link TOA}
 * <p>
 * Example:
 * <pre>
 * &lt; Footnote cls="U" idx="007"&gt;
 *        &lt;NoteType&gt;Band Application&lt;/NoteType&gt;
 *        &lt;Identifier&gt;&lt;/Identifier&gt;
 *        &lt;Text&gt;Sprocket 77&lt;/Text&gt;
 * &lt;/Footnote &gt;
 * &lt; Footnote cls="U" idx="117"&gt;
 *        &lt;NoteType&gt;Footnote-National&lt;/NoteType&gt;
 *        &lt;Identifier&gt;US251&lt;/Identifier&gt;
 *        &lt;Text&gt;The band 12.75-13.25 GHz is also allocated to the space research (deep space) (space-to-Earth) service for reception only at Goldstone, CA (35° 20' N, 116° 53' W).
 *        &lt;/Text&gt;
 * &lt;/Footnote &gt;
 * &lt; Footnote cls="U" idx="572"&gt;
 *        &lt;NoteType&gt;Footnote-ITU&lt;/NoteType&gt;
 *        &lt;Identifier&gt;5.54&lt;/Identifier&gt;
 *        &lt;Text&gt;Administrations conducting scientific research using frequencies below 9 kHz are urged to advise other administrations that may be concerned in order that such research may be afforded all practicable protection from harmful interference.
 *        &lt;/Text&gt;
 * &lt;/Footnote &gt;
 * &lt; Footnote cls="U" idx="4545"&gt;
 *        &lt;NoteType&gt;FCC Part&lt;/NoteType&gt;
 *        &lt;Identifier&gt;(90)&lt;/Identifier&gt;
 *        &lt;Text&gt;Private Land Mobile&lt;/Text&gt;
 *    &lt;/Footnote &gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Footnote", propOrder = {
  "footnoteType",
  "identifier",
  "text"
})
public class Footnote implements Comparable<Footnote> {

  /**
   * FootnoteType - Footnote Type (Required)
   * <p>
   * The type or source of the Footnote.
   * <p>
   * Format is L:CTA
   */
  @XmlElement(name = "FootnoteType", required = true)
  private TString footnoteType;
  /**
   * Identifier - Name (Required)
   * <p>
   * An identifier for this Footnote (e.g., US2, 5.441). This Data Item is
   * optional if NoteType is Band User or Band Application.
   * <p>
   * Format is S255
   */
  @XmlElement(name = "Identifier", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString identifier;
  /**
   * Text - Footnote Text (Required)
   * <p>
   * The textual specification of the footnote, band user or band application.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "Text", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString text;
  /**
   * idx - Index (Required)
   * <p>
   * A unique index for each Footnote used by this Dataset. Once an idx is used
   * it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * Format is UN(6)
   */
  @XmlAttribute(name = "idx", required = true)
  @XmlJavaTypeAdapter(type = String.class, value = XmlAdapterNumberUN6.class)
  private BigInteger idx;

  /**
   * Footnote constructor. Automatically sets the {@link #idx} value.
   */
  public Footnote() {
    this.idx = SSRFUtility.nextIndex();
  }

  /**
   * Get the type or source of the Footnote.
   * <p>
   * @return the FootnoteType value in a {@link TString} data type
   */
  public TString getFootnoteType() {
    return footnoteType;
  }

  /**
   * Set the type or source of the Footnote.
   * <p>
   * @param value the FootnoteType value in a {@link TString} data type
   */
  public void setFootnoteType(TString value) {
    this.footnoteType = value;
  }

  /**
   * Determine if the FootnoteType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFootnoteType() {
    return (this.footnoteType != null ? this.footnoteType.isSetValue() : false);
  }

  /**
   * Get an identifier for this Footnote (e.g., US2, 5.441). This Data Item is
   * optional if NoteType is Band User or Band Application.
   * <p>
   * @return the Identifier value in a {@link TString} data type
   */
  public TString getIdentifier() {
    return identifier;
  }

  /**
   * Set an identifier for this Footnote (e.g., US2, 5.441). This Data Item is
   * optional if NoteType is Band User or Band Application.
   * <p>
   * @param value the Identifier value in a {@link TString} data type
   */
  public void setIdentifier(TString value) {
    this.identifier = value;
  }

  /**
   * Determine if the Identifier is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdentifier() {
    return (this.identifier != null ? this.identifier.isSetValue() : false);
  }

  /**
   * Get the textual specification of the footnote, band user or band
   * application.
   * <p>
   * @return the Text value in a {@link TString} data type
   */
  public TString getText() {
    return text;
  }

  /**
   * Set the textual specification of the footnote, band user or band
   * application.
   * <p>
   * @param value the Text value in a {@link TString} data type
   */
  public void setText(TString value) {
    this.text = value;
  }

  /**
   * Determine if the Text is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetText() {
    return (this.text != null ? this.text.isSetValue() : false);
  }

  /**
   * Get a unique index for each Footnote used by this Dataset. Once an idx is
   * used it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * @return a {@link BigInteger} instance
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set a unique index for each Footnote used by this Dataset. Once an idx is
   * used it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * @param value a {@link BigInteger} instance
   */
  public void setIdx(BigInteger value) {
    this.idx = value;
  }

  /**
   * Determine if the Idx is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdx() {
    return (this.idx != null);
  }

  /**
   * Set the type or source of the Footnote.
   * <p>
   * @param value An instances of type {@link ListCTA}
   * @return The current Footnote object instance
   */
  public Footnote withFootnoteType(ListCTA value) {
    setFootnoteType(new TString(value.value()));
    return this;
  }

  /**
   * Set an identifier for this Footnote (e.g., US2, 5.441). This Data Item is
   * optional if NoteType is Band User or Band Application.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Footnote object instance
   */
  public Footnote withIdentifier(String value) {
    setIdentifier(new TString(value));
    return this;
  }

  /**
   * Set the textual specification of the footnote, band user or band
   * application.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Footnote object instance
   */
  public Footnote withText(String value) {
    setText(new TString(value));
    return this;
  }

  /**
   * Set a unique index for each Footnote used by this Dataset. Once an idx is
   * used it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Footnote object instance
   */
  public Footnote withIdx(BigInteger value) {
    setIdx(value);
    return this;
  }

  /**
   * Get a string representation of this Footnote instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Footnote {"
      + (text != null ? " text [" + text + "]" : "")
      + (idx != null ? " idx [" + idx + "]" : "")
      + (footnoteType != null ? " footnoteType [" + footnoteType + "]" : "")
      + (identifier != null ? " identifier [" + identifier + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Footnote} requires
   * {@link TString FootnoteType}, {@link TString Identifier}, {@link TString Text}, {@link BigInteger idx}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetFootnoteType() && isSetIdentifier() && isSetText() && isSetIdx();
  }

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the index "idx" number.
   * <p>
   * @return an object hash code value
   */
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 83 * hash + Objects.hashCode(this.idx);
    return hash;
  }

  /**
   * Equality is based upon the index "idx" number.
   * <p>
   * @param obj the other object
   * @return TRUE if the objects are the same class and have a matching index
   *         value
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.idx, ((Footnote) obj).getIdx());
  }

  /**
   * Comparison and sorting are based upon the index "idx" number.
   * <p>
   * @param o the other object
   * @return the object order
   */
  @Override
  public int compareTo(Footnote o) {
    return idx.compareTo(o.getIdx());
  }//</editor-fold>

}
