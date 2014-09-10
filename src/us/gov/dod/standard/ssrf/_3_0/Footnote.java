/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
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
package us.gov.dod.standard.ssrf._3_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.datatype.*;

/**
 * <p>
 * Java class for Footnote complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Footnote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS255"/>
 *         &lt;element name="Text" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO"/>
 *       &lt;/sequence>
 *       &lt;attribute name="idx" use="required" type="{urn:us:gov:dod:standard:ssrf:3.0.0}UN6" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Footnote", propOrder = {
  "identifier",
  "text"
})
public class Footnote {

  @XmlElement(name = "Identifier", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString identifier;
  @XmlElement(name = "Text", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString text;
  @XmlAttribute(name = "idx", required = true)
  protected BigInteger idx;

  /**
   * Gets the value of the identifier property.
   * <p>
   * @return possible object is {@link TS255 }
   * <p>
   */
  public TString getIdentifier() {
    return identifier;
  }

  /**
   * Sets the value of the identifier property.
   * <p>
   * @param value allowed object is {@link TS255 }
   * <p>
   */
  public void setIdentifier(TString value) {
    this.identifier = value;
  }

  public boolean isSetIdentifier() {
    return (this.identifier != null);
  }

  /**
   * Gets the value of the text property.
   * <p>
   * @return possible object is {@link TMEMO }
   * <p>
   */
  public TString getText() {
    return text;
  }

  /**
   * Sets the value of the text property.
   * <p>
   * @param value allowed object is {@link TMEMO }
   * <p>
   */
  public void setText(TString value) {
    this.text = value;
  }

  public boolean isSetText() {
    return (this.text != null);
  }

  /**
   * Gets the value of the idx property.
   * <p>
   * @return possible object is {@link BigInteger }
   * <p>
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Sets the value of the idx property.
   * <p>
   * @param value allowed object is {@link BigInteger }
   * <p>
   */
  public void setIdx(BigInteger value) {
    this.idx = value;
  }

  public boolean isSetIdx() {
    return (this.idx != null);
  }

  public Footnote withIdentifier(String value) {
    setIdentifier(new TString(value));
    return this;
  }

  public Footnote withText(String value) {
    setText(new TString(value));
    return this;
  }

  public Footnote withIdx(BigInteger value) {
    setIdx(value);
    return this;
  }

}
