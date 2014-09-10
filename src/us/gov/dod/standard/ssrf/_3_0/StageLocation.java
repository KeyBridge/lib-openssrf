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
import us.gov.dod.standard.ssrf._3_0.enumerate.*;

/**
 * <p>
 * Java class for StageLocation complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="StageLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocSatRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial"/>
 *         &lt;element name="Excluded" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StageLocation", propOrder = {
  "locSatRef",
  "excluded"
})
public class StageLocation {

  @XmlElement(name = "LocSatRef", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString locSatRef;
  @XmlElement(name = "Excluded", required = false)
  private TString excluded;

  /**
   * Gets the value of the locSatRef property.
   * <p>
   * @return possible object is {@link TSerial }
   * <p>
   */
  public TString getLocSatRef() {
    return locSatRef;
  }

  /**
   * Sets the value of the locSatRef property.
   * <p>
   * @param value allowed object is {@link TSerial }
   * <p>
   */
  public void setLocSatRef(TString value) {
    this.locSatRef = value;
  }

  public boolean isSetLocSatRef() {
    return (this.locSatRef != null);
  }

  /**
   * Gets the value of the excluded property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public TString getExcluded() {
    return excluded;
  }

  /**
   * Sets the value of the excluded property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setExcluded(TString value) {
    this.excluded = value;
  }

  public boolean isSetExcluded() {
    return (this.excluded != null);
  }

  public StageLocation withLocSatRef(String value) {
    setLocSatRef(new TString(value));
    return this;
  }

  public StageLocation withExcluded(ListCBO value) {
    setExcluded(new TString(value.value()));
    return this;
  }

}
