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
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCPT;

/**
 * Java class for Power complex type.
 * <p>
 * Data element Power identifies the transmitter power.
 * <p>
 * Notes:
 * <p>
 * The value must always be transmitted in dBW. Some software tools may
 * translate the value in watts for display only; in this case it is recommended
 * to precede the value with the unit designator as follows:
 * <ul>
 * <li>W - If power is less than 1000 watts</li>
 * <li>K - If power is at least 1 kW but less than 1000 kW</li>
 * <li>M - If power is at least 1 MW but less than 1000 MW</li>
 * <li>G - If power is 1 GW or greater</li></ul>
 * <p>
 * In order to be able to accommodate legacy data, a value of "-9999.99" MAY be
 * used in attribute minPower as a gap filler, but only for legacy data which do
 * not contain this information. The real value SHOULD always be used for new
 * datasets and during the review of old datasets.
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
   * @return
   */
  public TDecimal getPowerMin() {
    return powerMin;
  }

  /**
   * Sets the value of the powerMin property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getPowerMax() {
    return powerMax;
  }

  /**
   * Sets the value of the powerMax property.
   * <p>
   * @param value
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
   * @return
   */
  public TString getPowerType() {
    return powerType;
  }

  /**
   * Sets the value of the powerType property.
   * <p>
   * @param value
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
   * @return
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Sets the value of the calculated property.
   * <p>
   * @param value
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

  public Power withPowerType(ListCPT value) {
    setPowerType(new TString(value.value()));
    return this;
  }

  public Power withCalculated(ListCBO value) {
    setCalculated(new TString(value.value()));
    return this;
  }

}
