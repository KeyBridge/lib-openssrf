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
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;

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

  @XmlElement(name = "AzStart", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal azStart;
  @XmlElement(name = "AzStop", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal azStop;
  @XmlElement(name = "ElevStart", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal elevStart;
  @XmlElement(name = "ElevStop", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal elevStop;

  /**
   * Gets the value of the azStart property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getAzStart() {
    return azStart;
  }

  /**
   * Sets the value of the azStart property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setAzStart(TDecimal value) {
    this.azStart = value;
  }

  public boolean isSetAzStart() {
    return (this.azStart != null);
  }

  /**
   * Gets the value of the azStop property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getAzStop() {
    return azStop;
  }

  /**
   * Sets the value of the azStop property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setAzStop(TDecimal value) {
    this.azStop = value;
  }

  public boolean isSetAzStop() {
    return (this.azStop != null);
  }

  /**
   * Gets the value of the elevStart property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getElevStart() {
    return elevStart;
  }

  /**
   * Sets the value of the elevStart property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setElevStart(TDecimal value) {
    this.elevStart = value;
  }

  public boolean isSetElevStart() {
    return (this.elevStart != null);
  }

  /**
   * Gets the value of the elevStop property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getElevStop() {
    return elevStop;
  }

  /**
   * Sets the value of the elevStop property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setElevStop(TDecimal value) {
    this.elevStop = value;
  }

  public boolean isSetElevStop() {
    return (this.elevStop != null);
  }

  public Blanking withAzStart(Double value) {
    setAzStart(new TDecimal(value));
    return this;
  }

  public Blanking withAzStop(Double value) {
    setAzStop(new TDecimal(value));
    return this;
  }

  public Blanking withElevStart(Double value) {
    setElevStart(new TDecimal(value));
    return this;
  }

  public Blanking withElevStop(Double value) {
    setElevStop(new TDecimal(value));
    return this;
  }

}
