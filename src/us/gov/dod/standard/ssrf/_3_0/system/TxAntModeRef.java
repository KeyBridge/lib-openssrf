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
package us.gov.dod.standard.ssrf._3_0.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * Java class for TxAntModeRef complex type.
 * <p>
 * This element inherits attributes and sub-elements from element RxAntModeRef.
 * <p>
 * Data element TxAntModeRef contains references to the Antenna and its AntMode,
 * used to construct a Transmitter Configuration.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxAntModeRef", propOrder = {
  "spectralPowerDensity"
})
public class TxAntModeRef extends RxAntModeRef {

  /**
   * SpectralPowerDensity: Enter the maximum spectral power density supplied to
   * the input of the antenna.
   */
  @XmlElement(name = "SpectralPowerDensity", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBWHZ.class)
  private TDecimal spectralPowerDensity;

  /**
   * Gets the value of the spectralPowerDensity property.
   * <p>
   * @return
   */
  public TDecimal getSpectralPowerDensity() {
    return spectralPowerDensity;
  }

  /**
   * Sets the value of the spectralPowerDensity property.
   * <p>
   * @param value
   */
  public void setSpectralPowerDensity(TDecimal value) {
    this.spectralPowerDensity = value;
  }

  public boolean isSetSpectralPowerDensity() {
    return (this.spectralPowerDensity != null);
  }

  @Override
  public TxAntModeRef withSerial(TString value) {
    setSerial(value);
    return this;
  }

  @Override
  public TxAntModeRef withModeID(String value) {
    setModeID(new TString(value));
    return this;
  }

  @Override
  public TxAntModeRef withCouplingLoss(Double value) {
    setCouplingLoss(new TDecimal(value));
    return this;
  }

  public TxAntModeRef withSpectralPowerDensity(Double value) {
    setSpectralPowerDensity(new TDecimal(value));
    return this;
  }
}
