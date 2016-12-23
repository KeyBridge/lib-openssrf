/*
 * Copyright 2015 Key Bridge LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1.antenna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.Az;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.Signed_DB_5_2;

/**
 * AntPatternPoint contains a single point of the antenna radiation pattern,
 * defined by a direction and gain.
 * <p>
 * Element of {@link AntPattern}
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Dir", required = true)
  private Az dir;
  /**
   * Gain - Antenna Radiation Pattern Gain (Required)
   * <p>
   * The amount of gain for the direction relative to the main beam gain.
   * <p>
   * Format is SN(5,2) (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Gain", required = true)
  private Signed_DB_5_2 gain;

  /**
   * Get the direction in degrees in reference to the pointing angle of the
   * antenna set to zero..
   * <p>
   * @return a {@link Az} instance
   * @since 3.1.0
   */
  public Az getDir() {
    return dir;
  }

  /**
   * Set the direction in degrees in reference to the pointing angle of the
   * antenna set to zero..
   * <p>
   * @param value a {@link Az} instance
   * @since 3.1.0
   */
  public void setDir(Az value) {
    this.dir = value;
  }

  /**
   * Determine if the Dir is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDir() {
    return (this.dir != null ? this.dir.isSetValue() : false);
  }

  /**
   * Get the amount of gain for the direction relative to the main beam gain..
   * <p>
   * @return a {@link Signed_DB_5_2} instance
   * @since 3.1.0
   */
  public Signed_DB_5_2 getGain() {
    return gain;
  }

  /**
   * Set the amount of gain for the direction relative to the main beam gain..
   * <p>
   * @param value a {@link Signed_DB_5_2} instance
   * @since 3.1.0
   */
  public void setGain(Signed_DB_5_2 value) {
    this.gain = value;
  }

  /**
   * Determine if the Gain is configured.
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
   * @param value An instances of type {@link Double}.
   * @return The current AntPatternPoint object instance.
   * @since 3.1.0
   */
  public AntPatternPoint withDir(Double value) {
    setDir(new Az(value));
    return this;
  }

  /**
   * Set the amount of gain for the direction relative to the main beam gain.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current AntPatternPoint object instance.
   * @since 3.1.0
   */
  public AntPatternPoint withGain(Double value) {
    setGain(new Signed_DB_5_2(value));
    return this;
  }

  /**
   * Get a string representation of this AntPatternPoint instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  AntPatternPoint {"
           + (dir != null ? " dir [" + dir + "]" : "")
           + (gain != null ? " gain [" + gain + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntPatternPoint} requires
   * {@link Az Dir}, {@link Signed_DB_5_2 Gain}.
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
