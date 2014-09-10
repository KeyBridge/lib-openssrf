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
 * Java class for JRFLEntryLocation complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="JRFLEntryLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Serial" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial"/>
 *         &lt;element name="AntFeedpointHeight" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAltitude" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JRFLEntryLocation", propOrder = {
  "serial",
  "antFeedpointHeight"
})
public class JRFLEntryLocation {

  @XmlElement(name = "Serial", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  @XmlElement(name = "AntFeedpointHeight", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal antFeedpointHeight;

  /**
   * Gets the value of the serial property.
   * <p>
   * @return possible object is {@link TSerial }
   * <p>
   */
  public TString getSerial() {
    return serial;
  }

  /**
   * Sets the value of the serial property.
   * <p>
   * @param value allowed object is {@link TSerial }
   * <p>
   */
  public void setSerial(TString value) {
    this.serial = value;
  }

  public boolean isSetSerial() {
    return (this.serial != null);
  }

  /**
   * Gets the value of the antFeedpointHeight property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public TDecimal getAntFeedpointHeight() {
    return antFeedpointHeight;
  }

  /**
   * Sets the value of the antFeedpointHeight property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public void setAntFeedpointHeight(TDecimal value) {
    this.antFeedpointHeight = value;
  }

  public boolean isSetAntFeedpointHeight() {
    return (this.antFeedpointHeight != null);
  }

  public JRFLEntryLocation withSerial(String value) {
    setSerial(new TString(value));
    return this;
  }

  public JRFLEntryLocation withAntFeedpointHeight(Double value) {
    setAntFeedpointHeight(new TDecimal(value));
    return this;
  }

}
