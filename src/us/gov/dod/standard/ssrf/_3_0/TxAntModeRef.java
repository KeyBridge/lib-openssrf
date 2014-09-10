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
 * Java class for TxAntModeRef complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="TxAntModeRef"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}RxAntModeRef"> &lt;sequence>
 * &lt;element name="SpectralPowerDensity"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdBWHz" minOccurs="0"/>
 * &lt;/sequence> &lt;/extension> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxAntModeRef", propOrder = {
  "spectralPowerDensity"
})
public class TxAntModeRef extends RxAntModeRef {

  @XmlElement(name = "SpectralPowerDensity", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBWHZ.class)
  private TDecimal spectralPowerDensity;

  /**
   * Gets the value of the spectralPowerDensity property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdBWHz }{@code >}
   * <p>
   */
  public TDecimal getSpectralPowerDensity() {
    return spectralPowerDensity;
  }

  /**
   * Sets the value of the spectralPowerDensity property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdBWHz }{@code >}
   * <p>
   */
  public void setSpectralPowerDensity(TDecimal value) {
    this.spectralPowerDensity = value;
  }

  public boolean isSetSpectralPowerDensity() {
    return (this.spectralPowerDensity != null);
  }

  public TxAntModeRef withSpectralPowerDensity(Double value) {
    setSpectralPowerDensity(new TDecimal(value));
    return this;
  }

}
