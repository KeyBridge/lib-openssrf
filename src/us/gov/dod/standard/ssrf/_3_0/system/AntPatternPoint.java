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
 * Java class for AntPatternPoint complex type.
 * <p>
 * Data element AntPatternPoint contains one point of the antenna radiation
 * pattern, defined by a direction and gain.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntPatternPoint", propOrder = {
  "dir",
  "gain"
})
public class AntPatternPoint {

  /**
   * Dir: Enter the direction in degrees in reference to the pointing angle of
   * the antenna set to zero.
   */
  @XmlElement(name = "Dir", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal dir;
  /**
   * Gain: Enter the amount of dB gain for the direction relative to the main
   * beam gain.
   */
  @XmlElement(name = "Gain", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSN5_2.class)
  private TDecimal gain;

  /**
   * Gets the value of the dir property.
   * <p>
   * @return
   */
  public TDecimal getDir() {
    return dir;
  }

  /**
   * Sets the value of the dir property.
   * <p>
   * @param value
   */
  public void setDir(TDecimal value) {
    this.dir = value;
  }

  public boolean isSetDir() {
    return (this.dir != null);
  }

  /**
   * Gets the value of the gain property.
   * <p>
   * @return
   */
  public TDecimal getGain() {
    return gain;
  }

  /**
   * Sets the value of the gain property.
   * <p>
   * @param value
   */
  public void setGain(TDecimal value) {
    this.gain = value;
  }

  public boolean isSetGain() {
    return (this.gain != null);
  }

  public AntPatternPoint withDir(Double value) {
    setDir(new TDecimal(value));
    return this;
  }

  public AntPatternPoint withGain(Double value) {
    setGain(new TDecimal(value));
    return this;
  }

}
