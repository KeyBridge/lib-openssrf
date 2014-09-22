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

/**
 * Java class for VSWR complex type.
 * <p>
 * Element VSWR stores the Voltage Standing Wave Ratio information for an
 * Antenna Mode; it may be used to describe the VSWR curve as a function of
 * frequency.
 * <p>
 * VSWR is a measure of how efficiently radio-frequency power is transmitted
 * from a power source, through a transmission line, into a load (for example,
 * from a power amplifier through a transmission line, to an antenna). In an
 * ideal system, 100% of the energy is transmitted. This requires an exact match
 * between the source impedance, the characteristic impedance of the
 * transmission line and all its connectors, and the load's impedance.
 * <p>
 * The signal's AC voltage will be the same from end to end since it runs
 * through without interference. In real systems, mismatched impedances cause
 * some of the power to be reflected back toward the source (like an echo).
 * Reflections cause destructive interference, leading to peaks and valleys in
 * the voltage at various times and distances along the line.
 * <p>
 * VSWR measures these voltage variances. It is the ratio of the highest voltage
 * anywhere along the transmission line to the lowest. Since the voltage doesn't
 * vary in an ideal system, its VSWR is 1:1. When reflections occur, the
 * voltages vary and VSWR is higher (1.2:1 or 2:1, for instance).
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VSWR", propOrder = {
  "freq",
  "ratio"
})
public class VSWR {

  /**
   * Freq: Enter the specific frequency the VSWR measurement was taken at. If
   * multiple points are described, freq MUST be filled in.
   */
  @XmlElement(name = "Freq", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freq;
  /**
   * Ratio: Enter the standing wave ratio referenced to the specific frequency,
   * as a number without unit (e.g enter "2" to represent a ratio of 2:1).
   */
  @XmlElement(name = "Ratio", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN2_1.class)
  private TDecimal ratio;

  /**
   * Gets the value of the freq property.
   * <p>
   * @return
   */
  public TDecimal getFreq() {
    return freq;
  }

  /**
   * Sets the value of the freq property.
   * <p>
   * @param value
   */
  public void setFreq(TDecimal value) {
    this.freq = value;
  }

  public boolean isSetFreq() {
    return (this.freq != null);
  }

  /**
   * Gets the value of the ratio property.
   * <p>
   * @return
   */
  public TDecimal getRatio() {
    return ratio;
  }

  /**
   * Sets the value of the ratio property.
   * <p>
   * @param value
   */
  public void setRatio(TDecimal value) {
    this.ratio = value;
  }

  public boolean isSetRatio() {
    return (this.ratio != null);
  }

  public VSWR withFreq(Double value) {
    setFreq(new TDecimal(value));
    return this;
  }

  public VSWR withRatio(Double value) {
    setRatio(new TDecimal(value));
    return this;
  }

}
