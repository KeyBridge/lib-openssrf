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
package us.gov.dod.standard.ssrf._3_1.receiver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * CurvePoint contains the relative frequency to add to the curve origin to
 * obtain the absolute frequency point on the curve, and the value in dB
 * (relative to the carrier for a Tx characteristic, or relative to sensitivity
 * for a Rx characteristic).
 * <p>
 * Element of {@link Curve}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurvePoint", propOrder = {
  "offset",
  "level"
})
public class CurvePoint {

  /**
   * Offset - Point Frequency Offset (Required)    * <p>
   * A frequency difference (refer to data element Curve for use instructions).
   * If the curve being defined is symmetric, then enter only positive offsets.
   * If the curve is not symmetric (such as a SSB or vestigial sideband
   * modulation spectrum) then enter the full curve including negative offsets.
   * When defining the transmitter RF spectrum and the receiver RF and IF
   * selectivity curves, enter as a minimum the points corresponding to the -3,
   * -20, -40 and -60 dB values.
   * <p>
   * Format is SN(16,9) (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Offset", required = true)
  private FreqOffset offset;
  /**
   * Level - Level (Required)    * <p>
   * A dB value (refer to data element Curve for use instructions).
   * <p>
   * Format is SN(4,1) [-150..150] (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Level", required = true)
  private CurvePointLevel level;

  /**
   * Get a frequency difference (refer to data element Curve for use
   * instructions). If the curve being defined is symmetric, then enter only
   * positive offsets. If the curve is not symmetric (such as a SSB or vestigial
   * sideband modulation spectrum) then enter the full curve including negative
   * offsets. When defining the transmitter RF spectrum and the receiver RF and
   * IF selectivity curves, enter as a minimum the points corresponding to the
   * -3, -20, -40 and -60 dB values..
   * <p>
   * @return a {@link FreqOffset} instance
   * @since 3.1.0
   */
  public FreqOffset getOffset() {
    return offset;
  }

  /**
   * Set a frequency difference (refer to data element Curve for use
   * instructions). If the curve being defined is symmetric, then enter only
   * positive offsets. If the curve is not symmetric (such as a SSB or vestigial
   * sideband modulation spectrum) then enter the full curve including negative
   * offsets. When defining the transmitter RF spectrum and the receiver RF and
   * IF selectivity curves, enter as a minimum the points corresponding to the
   * -3, -20, -40 and -60 dB values..
   * <p>
   * @param value a {@link FreqOffset} instance
   * @since 3.1.0
   */
  public void setOffset(FreqOffset value) {
    this.offset = value;
  }

  /**
   * Determine if the Offset is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOffset() {
    return (this.offset != null ? this.offset.isSetValue() : false);
  }

  /**
   * Get a dB value (refer to data element Curve for use instructions)..
   * <p>
   * @return a {@link CurvePointLevel} instance
   * @since 3.1.0
   */
  public CurvePointLevel getLevel() {
    return level;
  }

  /**
   * Set a dB value (refer to data element Curve for use instructions)..
   * <p>
   * @param value a {@link CurvePointLevel} instance
   * @since 3.1.0
   */
  public void setLevel(CurvePointLevel value) {
    this.level = value;
  }

  /**
   * Determine if the Level is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLevel() {
    return (this.level != null ? this.level.isSetValue() : false);
  }

  /**
   * Set a frequency difference (refer to data element Curve for use
   * instructions). If the curve being defined is symmetric, then enter only
   * positive offsets. If the curve is not symmetric (such as a SSB or vestigial
   * sideband modulation spectrum) then enter the full curve including negative
   * offsets. When defining the transmitter RF spectrum and the receiver RF and
   * IF selectivity curves, enter as a minimum the points corresponding to the
   * -3, -20, -40 and -60 dB values.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current CurvePoint object instance.
   * @since 3.1.0
   */
  public CurvePoint withOffset(Double value) {
    setOffset(new FreqOffset(value));
    return this;
  }

  /**
   * Set a dB value (refer to data element Curve for use instructions).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current CurvePoint object instance.
   * @since 3.1.0
   */
  public CurvePoint withLevel(Double value) {
    setLevel(new CurvePointLevel(value));
    return this;
  }

  /**
   * Get a string representation of this CurvePoint instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "CurvePoint {"
           + (level != null ? " level [" + level + "]" : "")
           + (offset != null ? " offset [" + offset + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link CurvePoint} requires
   * {@link CurvePointLevel Level}, {@link FreqOffset Offset}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetLevel() && isSetOffset();
  }

}
