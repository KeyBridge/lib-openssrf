/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Blanking complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Blanking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AzStart" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAz" minOccurs="0"/>
 *         &lt;element name="AzStop" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAz" minOccurs="0"/>
 *         &lt;element name="ElevStart" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TElev" minOccurs="0"/>
 *         &lt;element name="ElevStop" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TElev" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Blanking", propOrder = {
  "azStart",
  "azStop",
  "elevStart",
  "elevStop"
})
public class Blanking {

  @XmlElementRef(name = "AzStart", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAz> azStart;
  @XmlElementRef(name = "AzStop", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAz> azStop;
  @XmlElementRef(name = "ElevStart", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TElev> elevStart;
  @XmlElementRef(name = "ElevStop", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TElev> elevStop;

  /**
   * Gets the value of the azStart property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public JAXBElement<TAz> getAzStart() {
    return azStart;
  }

  /**
   * Sets the value of the azStart property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public void setAzStart(JAXBElement<TAz> value) {
    this.azStart = value;
  }

  /**
   * Gets the value of the azStop property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public JAXBElement<TAz> getAzStop() {
    return azStop;
  }

  /**
   * Sets the value of the azStop property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public void setAzStop(JAXBElement<TAz> value) {
    this.azStop = value;
  }

  /**
   * Gets the value of the elevStart property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public JAXBElement<TElev> getElevStart() {
    return elevStart;
  }

  /**
   * Sets the value of the elevStart property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public void setElevStart(JAXBElement<TElev> value) {
    this.elevStart = value;
  }

  /**
   * Gets the value of the elevStop property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public JAXBElement<TElev> getElevStop() {
    return elevStop;
  }

  /**
   * Sets the value of the elevStop property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public void setElevStop(JAXBElement<TElev> value) {
    this.elevStop = value;
  }

}
