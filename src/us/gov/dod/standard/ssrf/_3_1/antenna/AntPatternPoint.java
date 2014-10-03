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
package us.gov.dod.standard.ssrf._3_1.antenna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * AntPatternPoint contains a single point of the antenna radiation pattern,
 * defined by a direction and gain.
 * <p>
 * Element of {@link AntPattern}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntPatternPoint", propOrder = {
  "dir",
  "gain"
})
public class AntPatternPoint {

  /**
   * Dir - Antenna Radiation Pattern Direction (Required)
   * <p>
   * The direction in degrees in reference to the pointing angle of the antenna
   * set to zero.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   */
  @XmlElement(name = "Dir", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal dir;
  /**
   * Gain - Antenna Radiation Pattern Gain (Required)
   * <p>
   * The amount of gain for the direction relative to the main beam gain.
   * <p>
   * Format is SN(5,2) (dB)
   */
  @XmlElement(name = "Gain", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSIGNED_DB_5_2.class)
  private TDecimal gain;

  /**
   * Get the direction in degrees in reference to the pointing angle of the
   * antenna set to zero.
   * <p>
   * @return the Dir value in a {@link TDecimal} data type
   */
  public TDecimal getDir() {
    return dir;
  }

  /**
   * Set the direction in degrees in reference to the pointing angle of the
   * antenna set to zero.
   * <p>
   * @param value the Dir value in a {@link TDecimal} data type
   */
  public void setDir(TDecimal value) {
    this.dir = value;
  }

  /**
   * Determine if the Dir is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDir() {
    return (this.dir != null ? this.dir.isSetValue() : false);
  }

  /**
   * Get the amount of gain for the direction relative to the main beam gain.
   * <p>
   * @return the Gain value in a {@link TDecimal} data type
   */
  public TDecimal getGain() {
    return gain;
  }

  /**
   * Set the amount of gain for the direction relative to the main beam gain.
   * <p>
   * @param value the Gain value in a {@link TDecimal} data type
   */
  public void setGain(TDecimal value) {
    this.gain = value;
  }

  /**
   * Determine if the Gain is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGain() {
    return (this.gain != null ? this.gain.isSetValue() : false);
  }

  /**
   * Set the direction in degrees in reference to the pointing angle of the
   * antenna set to zero.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntPatternPoint object instance
   */
  public AntPatternPoint withDir(Double value) {
    setDir(new TDecimal(value));
    return this;
  }

  /**
   * Set the amount of gain for the direction relative to the main beam gain.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntPatternPoint object instance
   */
  public AntPatternPoint withGain(Double value) {
    setGain(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this AntPatternPoint instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AntPatternPoint {"
      + (dir != null ? " dir [" + dir + "]" : "")
      + (gain != null ? " gain [" + gain + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntPatternPoint} requires
   * {@link TDecimal Dir}, {@link TDecimal Gain}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDir() && isSetGain();
  }

}
