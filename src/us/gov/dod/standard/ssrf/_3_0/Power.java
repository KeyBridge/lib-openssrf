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
 * Java class for Power complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Power">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PowerMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdBW" minOccurs="0"/>
 *         &lt;element name="PowerMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdBW" minOccurs="0"/>
 *         &lt;element name="PowerType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10" minOccurs="0"/>
 *         &lt;element name="Calculated" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Power", propOrder = {
  "powerMin",
  "powerMax",
  "powerType",
  "calculated"
})
public class Power {

  @XmlElement(name = "PowerMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal powerMin;
  @XmlElement(name = "PowerMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal powerMax;
  @XmlElement(name = "PowerType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString powerType;
  @XmlElement(name = "Calculated", required = false)
  private TString calculated;

  /**
   * Gets the value of the powerMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public TDecimal getPowerMin() {
    return powerMin;
  }

  /**
   * Sets the value of the powerMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public void setPowerMin(TDecimal value) {
    this.powerMin = value;
  }

  public boolean isSetPowerMin() {
    return (this.powerMin != null);
  }

  /**
   * Gets the value of the powerMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public TDecimal getPowerMax() {
    return powerMax;
  }

  /**
   * Sets the value of the powerMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public void setPowerMax(TDecimal value) {
    this.powerMax = value;
  }

  public boolean isSetPowerMax() {
    return (this.powerMax != null);
  }

  /**
   * Gets the value of the powerType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public TString getPowerType() {
    return powerType;
  }

  /**
   * Sets the value of the powerType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public void setPowerType(TString value) {
    this.powerType = value;
  }

  public boolean isSetPowerType() {
    return (this.powerType != null);
  }

  /**
   * Gets the value of the calculated property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Sets the value of the calculated property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setCalculated(TString value) {
    this.calculated = value;
  }

  public boolean isSetCalculated() {
    return (this.calculated != null);
  }

  public Power withPowerMin(Double value) {
    setPowerMin(new TDecimal(value));
    return this;
  }

  public Power withPowerMax(Double value) {
    setPowerMax(new TDecimal(value));
    return this;
  }

  public Power withPowerType(String value) {
    setPowerType(new TString(value));
    return this;
  }

  public Power withCalculated(ListCBO value) {
    setCalculated(new TString(value.value()));
    return this;
  }

}
