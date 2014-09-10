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
 * Java class for CoordinationData complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="CoordinationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoordIndicator" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"/>
 *         &lt;element name="HostComments" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinationData", propOrder = {
  "coordIndicator",
  "hostComments"
})
public class CoordinationData {

  @XmlElement(name = "CoordIndicator", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString coordIndicator;
  @XmlElement(name = "HostComments", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString hostComments;

  /**
   * Gets the value of the coordIndicator property.
   * <p>
   * @return possible object is {@link TS50 }
   * <p>
   */
  public TString getCoordIndicator() {
    return coordIndicator;
  }

  /**
   * Sets the value of the coordIndicator property.
   * <p>
   * @param value allowed object is {@link TS50 }
   * <p>
   */
  public void setCoordIndicator(TString value) {
    this.coordIndicator = value;
  }

  public boolean isSetCoordIndicator() {
    return (this.coordIndicator != null);
  }

  /**
   * Gets the value of the hostComments property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public TString getHostComments() {
    return hostComments;
  }

  /**
   * Sets the value of the hostComments property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setHostComments(TString value) {
    this.hostComments = value;
  }

  public boolean isSetHostComments() {
    return (this.hostComments != null);
  }

  public CoordinationData withCoordIndicator(String value) {
    setCoordIndicator(new TString(value));
    return this;
  }

  public CoordinationData withHostComments(String value) {
    setHostComments(new TString(value));
    return this;
  }

}
