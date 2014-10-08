/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.transmitter;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.XmlAdapterDBW;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCPT;

/**
 * Power identifies the transmitter RF power at the transmitter antenna port.
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;Power&gt;
 *   &lt;PowerMin cls="U"&gt;-3&lt;/PowerMin&gt;
 *   &lt;PowerMax cls="U"&gt;31.8&lt;/PowerMax&gt;
 *   &lt;PowerType cls="U"&gt;PEP&lt;/PowerType&gt;
 *   &lt;Calculated cls="U"&gt;No&lt;/Calculated&gt;
 * &lt;/Power&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Power", propOrder = {
  "powerMin",
  "powerMax",
  "powerType",
  "calculated"
})
public class Power {

  /**
   * PowerMin - Minimum or Nominal Power (Optional)
   * <p>
   * The nominal transmitter power, or the minimum power in case of a range of
   * values.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "PowerMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal powerMin;
  /**
   * PowerMax - Maximum Power (Optional)
   * <p>
   * The maximum transmitter power.
   * <p>
   * [XSL ERR MINMAX] If PowerMax is used, it MUST be greater than PowerMin.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "PowerMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal powerMax;
  /**
   * PowerType - Power Type (Optional)
   * <p>
   * The power type code for carrier, mean, or peak envelope power emitted. The
   * power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * Format is L:CPT
   */
  @XmlElement(name = "PowerType", required = false)
  private TString powerType;
  /**
   * Calculated - Calculated Data Indicator (Optional)
   * <p>
   * "Yes" if the power value(s) have been calculated, or "No" if they have been
   * measured.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Calculated", required = false)
  private TString calculated;

  /**
   * Get the nominal transmitter power, or the minimum power in case of a range
   * of values.
   * <p>
   * @return the PowerMin value in a {@link TDecimal} data type
   */
  public TDecimal getPowerMin() {
    return powerMin;
  }

  /**
   * Set the nominal transmitter power, or the minimum power in case of a range
   * of values.
   * <p>
   * @param value the PowerMin value in a {@link TDecimal} data type
   */
  public void setPowerMin(TDecimal value) {
    this.powerMin = value;
  }

  /**
   * Determine if the PowerMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPowerMin() {
    return (this.powerMin != null ? this.powerMin.isSetValue() : false);
  }

  /**
   * Get the maximum transmitter power.
   * <p>
   * [XSL ERR MINMAX] If PowerMax is used, it MUST be greater than PowerMin.
   * <p>
   * @return the PowerMax value in a {@link TDecimal} data type
   */
  public TDecimal getPowerMax() {
    return powerMax;
  }

  /**
   * Set the maximum transmitter power.
   * <p>
   * [XSL ERR MINMAX] If PowerMax is used, it MUST be greater than PowerMin.
   * <p>
   * @param value the PowerMax value in a {@link TDecimal} data type
   */
  public void setPowerMax(TDecimal value) {
    this.powerMax = value;
  }

  /**
   * Determine if the PowerMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPowerMax() {
    return (this.powerMax != null ? this.powerMax.isSetValue() : false);
  }

  /**
   * Get the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * @return the PowerType value in a {@link TString} data type
   */
  public TString getPowerType() {
    return powerType;
  }

  /**
   * Set the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * @param value the PowerType value in a {@link TString} data type
   */
  public void setPowerType(TString value) {
    this.powerType = value;
  }

  /**
   * Determine if the PowerType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPowerType() {
    return (this.powerType != null ? this.powerType.isSetValue() : false);
  }

  /**
   * Get "Yes" if the power value(s) have been calculated, or "No" if they have
   * been measured.
   * <p>
   * @return the Calculated value in a {@link TString} data type
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Set "Yes" if the power value(s) have been calculated, or "No" if they have
   * been measured.
   * <p>
   * @param value the Calculated value in a {@link TString} data type
   */
  public void setCalculated(TString value) {
    this.calculated = value;
  }

  /**
   * Determine if the Calculated is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCalculated() {
    return (this.calculated != null ? this.calculated.isSetValue() : false);
  }

  /**
   * Set the nominal transmitter power, or the minimum power in case of a range
   * of values.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Power object instance
   */
  public Power withPowerMin(Double value) {
    setPowerMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum transmitter power.
   * <p>
   * [XSL ERR MINMAX] If PowerMax is used, it MUST be greater than PowerMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Power object instance
   */
  public Power withPowerMax(Double value) {
    setPowerMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * @param value An instances of type {@link ListCPT}
   * @return The current Power object instance
   */
  public Power withPowerType(ListCPT value) {
    setPowerType(new TString(value.value()));
    return this;
  }

  /**
   * Set "Yes" if the power value(s) have been calculated, or "No" if they have
   * been measured.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Power object instance
   */
  public Power withCalculated(ListCBO value) {
    setCalculated(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this Power instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Power {"
      + (powerMax != null ? " powerMax [" + powerMax + "]" : "")
      + (powerMin != null ? " powerMin [" + powerMin + "]" : "")
      + (powerType != null ? " powerType [" + powerType + "]" : "")
      + (calculated != null ? " calculated [" + calculated + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Power} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
