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
 * AntEfficiency describes the antenna efficiency at various frequencies within
 * the frequency range of the antenna.
 * <p>
 * Java class for AntEfficiency complex type.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntEfficiency", propOrder = {
  "freqMin",
  "freqMax",
  "efficiency"
})
public class AntEfficiency {

  /**
   * FreqMin: Enter the nominal frequency or minimum value of the frequency
   * range.
   */
  @XmlElement(name = "FreqMin")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * FreqMax: Enter the maximum value of the frequencies in the range.
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * Efficiency: Enter the efficiency of the antenna within the frequency range
   * which is being reported.
   * <p>
   * Notes: The efficiency should always be less than 100%. For example, the
   * best case for a half-wave dipole is 96.8%.
   */
  @XmlElement(name = "Efficiency", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterPERCENT.class)
  private TDecimal efficiency;

  /**
   * Gets the value of the freqMin property.
   * <p>
   * @return
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Sets the value of the freqMin property.
   * <p>
   * @param value
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  public boolean isSetFreqMin() {
    return (this.freqMin != null);
  }

  /**
   * Gets the value of the freqMax property.
   * <p>
   * @return
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Sets the value of the freqMax property.
   * <p>
   * @param value   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  public boolean isSetFreqMax() {
    return (this.freqMax != null);
  }

  /**
   * Gets the value of the efficiency property.
   * <p>
   * @return
   */
  public TDecimal getEfficiency() {
    return efficiency;
  }

  /**
   * Sets the value of the efficiency property.
   * <p>
   * @param value
   */
  public void setEfficiency(TDecimal value) {
    this.efficiency = value;
  }

  public boolean isSetEfficiency() {
    return (this.efficiency != null);
  }

  public AntEfficiency withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  public AntEfficiency withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  public AntEfficiency withEfficiency(Double value) {
    setEfficiency(new TDecimal(value));
    return this;
  }

}
