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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.datatype.*;

/**
 * <p>
 * Java class for RelatedSupportability complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="RelatedSupportability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10"/>
 *         &lt;element name="SSRequestRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/>
 *         &lt;element name="J12Number" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedSupportability", propOrder = {
  "type",
  "ssRequestRef",
  "j12Number"
})
public class RelatedSupportability {

  @XmlElement(name = "Type", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString type;
  @XmlElement(name = "SSRequestRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString ssRequestRef;
  @XmlElement(name = "J12Number", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS15.class)
  private TString j12Number;

  /**
   * Gets the value of the type property.
   * <p>
   * @return possible object is {@link TS10 }
   * <p>
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value allowed object is {@link TS10 }
   * <p>
   */
  public void setType(TString value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Gets the value of the ssRequestRef property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public TString getSSRequestRef() {
    return ssRequestRef;
  }

  /**
   * Sets the value of the ssRequestRef property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setSSRequestRef(TString value) {
    this.ssRequestRef = value;
  }

  public boolean isSetSSRequestRef() {
    return (this.ssRequestRef != null);
  }

  /**
   * Gets the value of the j12Number property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS15 }{@code >}
   * <p>
   */
  public TString getJ12Number() {
    return j12Number;
  }

  /**
   * Sets the value of the j12Number property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS15 }{@code >}
   * <p>
   */
  public void setJ12Number(TString value) {
    this.j12Number = value;
  }

  public boolean isSetJ12Number() {
    return (this.j12Number != null);
  }

  public RelatedSupportability withType(String value) {
    setType(new TString(value));
    return this;
  }

  public RelatedSupportability withSSRequestRef(String value) {
    setSSRequestRef(new TString(value));
    return this;
  }

  public RelatedSupportability withJ12Number(String value) {
    setJ12Number(new TString(value));
    return this;
  }

}
