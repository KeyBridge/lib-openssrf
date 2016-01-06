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
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * ObservedLobeValues (US) contains azimuth and elevation angles, as well as
 * power density levels associated with observed Antenna sidelobes or backlobes.
 * Used to its full potential, a precise 3D picture of an Antenna sidelobe can
 * be represented.
 * <p>
 * Element of {@link ObservedLobeAnalysis}
 * <p>
 * Example: See {@link ObservedLobeAnalysis}.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedLobeValues", propOrder = {
  "horzBwMax",
  "horzBwMin",
  "lobeValueAngleAccuracy",
  "lobeValueAngleHorz",
  "lobeValueAngleVert",
  "lobeValueID",
  "lobeValueLevel",
  "lobeValueLevelAccuracy",
  "lobeValueName",
  "vertBwMax",
  "vertBwMin"
})
public class ObservedLobeValues {

  /**
   * US:HorzBwMax - Maximum Horizontal Beamwidth (Optional)
   * <p>
   * The maximum angle of the horizontal component of the antenna mainbeam
   * measured at the half-power (-3 dB) point of its maximum horizontal width.
   * <p>
   * [XSL ERR MINMAX] If US:HorBwMax is used, it MUST be greater than
   * US:HorBwMin.
   * <p>
   * Format is UN(5,2) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HorzBwMax", required = false)
  private US_Degrees horzBwMax;
  /**
   * US:HorzBwMin - Minimum Horizontal Beamwidth (Optional)
   * <p>
   * The minimum angle of the horizontal component of the antenna mainbeam
   * measured at the half-power (-3 dB) point of its maximum horizontal width.
   * <p>
   * Format is UN(5,2) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HorzBwMin", required = false)
  private US_Degrees horzBwMin;
  /**
   * US:LobeValueAngleAccuracy - Lobe Measurement Angle Accuracy (Optional)
   * <p>
   * The measurement accuracy of the LobeValueAngle(s) in degrees. Expressed as
   * a (+/-) value.
   * <p>
   * Format is SN(5,2) [0-90] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LobeValueAngleAccuracy", required = false)
  private US_Degrees90 lobeValueAngleAccuracy;
  /**
   * US:LobeValueAngleHorz - Lobe Measurement Horizontal Angle (Optional)
   * <p>
   * The azimuth angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level.
   * <p>
   * Format is SN(5,2) [0-180] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LobeValueAngleHorz", required = false)
  private Az180 lobeValueAngleHorz;
  /**
   * US:LobeValueAngleVert - Lobe Measurement Vertical Angle (Optional)
   * <p>
   * The vertical angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level.
   * <p>
   * Format is SN(5,2) [0-180] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LobeValueAngleVert", required = false)
  private Az180 lobeValueAngleVert;
  /**
   * US:LobeValueID - Lobe Measurement Identifier (Required)
   * <p>
   * A unique (within the AntLobe) identifier for the Antenna lobe measurement.
   * <p>
   * Format is S10
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LobeValueID", required = true)
  private S10 lobeValueID;
  /**
   * US:LobeValueLevel - Lobe Measurement Power Level (Optional)
   * <p>
   * The ratio of the mainbeam power level to the sidelobe power level,
   * expressed as a positive value in dB.
   * <p>
   * Format is UN(5,2) [0-150] (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LobeValueLevel", required = false)
  private US_DB150 lobeValueLevel;
  /**
   * US:LobeValueLevelAccuracy - Lobe Measurement Level Accuracy (Optional)
   * <p>
   * The measurement accuracy of the LobeValueLevel value in dB. Expressed as a
   * (+/-) value.
   * <p>
   * Format is SN(4,2) [0-75] (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LobeValueLevelAccuracy", required = false)
  private US_DB90 lobeValueLevelAccuracy;
  /**
   * US:LobeValueName - Lobe Measurement Name (Optional)
   * <p>
   * A name for the Antenna lobe measurement.
   * <p>
   * Format is S25
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LobeValueName", required = false)
  private S25 lobeValueName;
  /**
   * US:VertBwMax - Maximum Vertical Beamwidth (Optional)
   * <p>
   * The maximum angle of the vertical component of the antenna mainbeam
   * measured at the half-power (-3 dB) points of its maximum vertical width.
   * <p>
   * [XSL ERR MINMAX] If US:VertBwMax is used, it MUST be greater than
   * US:VertBwMin.
   * <p>
   * Format is UN(5,2) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VertBwMax", required = false)
  private US_Degrees vertBwMax;
  /**
   * US:VertBwMin - Minimum Vertical Beamwidth (Optional)
   * <p>
   * The minimum angle of the vertical component of the antenna mainbeam
   * measured at the half-power (-3 dB) points of its maximum vertical width.
   * <p>
   * Format is UN(5,2) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VertBwMin", required = false)
  private US_Degrees vertBwMin;

  /**
   * Get the maximum angle of the horizontal component of the antenna mainbeam
   * measured at the half-power (-3 dB) point of its maximum horizontal width.
   * <p>
   * [XSL ERR MINMAX] If US:HorBwMax is used, it MUST be greater than
   * US:HorBwMin..
   * <p>
   * @return a {@link US_Degrees} instance
   * @since 3.1.0
   */
  public US_Degrees getHorzBwMax() {
    return horzBwMax;
  }

  /**
   * Set the maximum angle of the horizontal component of the antenna mainbeam
   * measured at the half-power (-3 dB) point of its maximum horizontal width.
   * <p>
   * [XSL ERR MINMAX] If US:HorBwMax is used, it MUST be greater than
   * US:HorBwMin..
   * <p>
   * @param value a {@link US_Degrees} instance
   * @since 3.1.0
   */
  public void setHorzBwMax(US_Degrees value) {
    this.horzBwMax = value;
  }

  /**
   * Determine if the HorzBwMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzBwMax() {
    return (this.horzBwMax != null ? this.horzBwMax.isSetValue() : false);
  }

  /**
   * Get the minimum angle of the horizontal component of the antenna mainbeam
   * measured at the half-power (-3 dB) point of its maximum horizontal width..
   * <p>
   * @return a {@link US_Degrees} instance
   * @since 3.1.0
   */
  public US_Degrees getHorzBwMin() {
    return horzBwMin;
  }

  /**
   * Set the minimum angle of the horizontal component of the antenna mainbeam
   * measured at the half-power (-3 dB) point of its maximum horizontal width..
   * <p>
   * @param value a {@link US_Degrees} instance
   * @since 3.1.0
   */
  public void setHorzBwMin(US_Degrees value) {
    this.horzBwMin = value;
  }

  /**
   * Determine if the HorzBwMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzBwMin() {
    return (this.horzBwMin != null ? this.horzBwMin.isSetValue() : false);
  }

  /**
   * Get the measurement accuracy of the LobeValueAngle(s) in degrees. Expressed
   * as a (+/-) value..
   * <p>
   * @return a {@link US_Degrees90} instance
   * @since 3.1.0
   */
  public US_Degrees90 getLobeValueAngleAccuracy() {
    return lobeValueAngleAccuracy;
  }

  /**
   * Set the measurement accuracy of the LobeValueAngle(s) in degrees. Expressed
   * as a (+/-) value..
   * <p>
   * @param value a {@link US_Degrees90} instance
   * @since 3.1.0
   */
  public void setLobeValueAngleAccuracy(US_Degrees90 value) {
    this.lobeValueAngleAccuracy = value;
  }

  /**
   * Determine if the LobeValueAngleAccuracy is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeValueAngleAccuracy() {
    return (this.lobeValueAngleAccuracy != null ? this.lobeValueAngleAccuracy.isSetValue() : false);
  }

  /**
   * Get the azimuth angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level..
   * <p>
   * @return a {@link Az180} instance
   * @since 3.1.0
   */
  public Az180 getLobeValueAngleHorz() {
    return lobeValueAngleHorz;
  }

  /**
   * Set the azimuth angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level..
   * <p>
   * @param value a {@link Az180} instance
   * @since 3.1.0
   */
  public void setLobeValueAngleHorz(Az180 value) {
    this.lobeValueAngleHorz = value;
  }

  /**
   * Determine if the LobeValueAngleHorz is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeValueAngleHorz() {
    return (this.lobeValueAngleHorz != null ? this.lobeValueAngleHorz.isSetValue() : false);
  }

  /**
   * Get the vertical angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level..
   * <p>
   * @return a {@link Az180} instance
   * @since 3.1.0
   */
  public Az180 getLobeValueAngleVert() {
    return lobeValueAngleVert;
  }

  /**
   * Set the vertical angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level..
   * <p>
   * @param value a {@link Az180} instance
   * @since 3.1.0
   */
  public void setLobeValueAngleVert(Az180 value) {
    this.lobeValueAngleVert = value;
  }

  /**
   * Determine if the LobeValueAngleVert is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeValueAngleVert() {
    return (this.lobeValueAngleVert != null ? this.lobeValueAngleVert.isSetValue() : false);
  }

  /**
   * Get a unique (within the AntLobe) identifier for the Antenna lobe
   * measurement..
   * <p>
   * @return a {@link S10} instance
   * @since 3.1.0
   */
  public S10 getLobeValueID() {
    return lobeValueID;
  }

  /**
   * Set a unique (within the AntLobe) identifier for the Antenna lobe
   * measurement..
   * <p>
   * @param value a {@link S10} instance
   * @since 3.1.0
   */
  public void setLobeValueID(S10 value) {
    this.lobeValueID = value;
  }

  /**
   * Determine if the LobeValueID is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeValueID() {
    return (this.lobeValueID != null ? this.lobeValueID.isSetValue() : false);
  }

  /**
   * Get the ratio of the mainbeam power level to the sidelobe power level,
   * expressed as a positive value in dB..
   * <p>
   * @return a {@link US_DB150} instance
   * @since 3.1.0
   */
  public US_DB150 getLobeValueLevel() {
    return lobeValueLevel;
  }

  /**
   * Set the ratio of the mainbeam power level to the sidelobe power level,
   * expressed as a positive value in dB..
   * <p>
   * @param value a {@link US_DB150} instance
   * @since 3.1.0
   */
  public void setLobeValueLevel(US_DB150 value) {
    this.lobeValueLevel = value;
  }

  /**
   * Determine if the LobeValueLevel is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeValueLevel() {
    return (this.lobeValueLevel != null ? this.lobeValueLevel.isSetValue() : false);
  }

  /**
   * Get the measurement accuracy of the LobeValueLevel value in dB. Expressed
   * as a (+/-) value..
   * <p>
   * @return a {@link US_DB90} instance
   * @since 3.1.0
   */
  public US_DB90 getLobeValueLevelAccuracy() {
    return lobeValueLevelAccuracy;
  }

  /**
   * Set the measurement accuracy of the LobeValueLevel value in dB. Expressed
   * as a (+/-) value..
   * <p>
   * @param value a {@link US_DB90} instance
   * @since 3.1.0
   */
  public void setLobeValueLevelAccuracy(US_DB90 value) {
    this.lobeValueLevelAccuracy = value;
  }

  /**
   * Determine if the LobeValueLevelAccuracy is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeValueLevelAccuracy() {
    return (this.lobeValueLevelAccuracy != null ? this.lobeValueLevelAccuracy.isSetValue() : false);
  }

  /**
   * Get a name for the Antenna lobe measurement..
   * <p>
   * @return a {@link S25} instance
   * @since 3.1.0
   */
  public S25 getLobeValueName() {
    return lobeValueName;
  }

  /**
   * Set a name for the Antenna lobe measurement..
   * <p>
   * @param value a {@link S25} instance
   * @since 3.1.0
   */
  public void setLobeValueName(S25 value) {
    this.lobeValueName = value;
  }

  /**
   * Determine if the LobeValueName is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeValueName() {
    return (this.lobeValueName != null ? this.lobeValueName.isSetValue() : false);
  }

  /**
   * Get the maximum angle of the vertical component of the antenna mainbeam
   * measured at the half-power (-3 dB) points of its maximum vertical width.
   * <p>
   * [XSL ERR MINMAX] If US:VertBwMax is used, it MUST be greater than
   * US:VertBwMin..
   * <p>
   * @return a {@link US_Degrees} instance
   * @since 3.1.0
   */
  public US_Degrees getVertBwMax() {
    return vertBwMax;
  }

  /**
   * Set the maximum angle of the vertical component of the antenna mainbeam
   * measured at the half-power (-3 dB) points of its maximum vertical width.
   * <p>
   * [XSL ERR MINMAX] If US:VertBwMax is used, it MUST be greater than
   * US:VertBwMin..
   * <p>
   * @param value a {@link US_Degrees} instance
   * @since 3.1.0
   */
  public void setVertBwMax(US_Degrees value) {
    this.vertBwMax = value;
  }

  /**
   * Determine if the VertBwMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertBwMax() {
    return (this.vertBwMax != null ? this.vertBwMax.isSetValue() : false);
  }

  /**
   * Get the minimum angle of the vertical component of the antenna mainbeam
   * measured at the half-power (-3 dB) points of its maximum vertical width..
   * <p>
   * @return a {@link US_Degrees} instance
   * @since 3.1.0
   */
  public US_Degrees getVertBwMin() {
    return vertBwMin;
  }

  /**
   * Set the minimum angle of the vertical component of the antenna mainbeam
   * measured at the half-power (-3 dB) points of its maximum vertical width..
   * <p>
   * @param value a {@link US_Degrees} instance
   * @since 3.1.0
   */
  public void setVertBwMin(US_Degrees value) {
    this.vertBwMin = value;
  }

  /**
   * Determine if the VertBwMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertBwMin() {
    return (this.vertBwMin != null ? this.vertBwMin.isSetValue() : false);
  }

  /**
   * Set the maximum angle of the horizontal component of the antenna mainbeam
   * measured at the half-power (-3 dB) point of its maximum horizontal width.
   * <p>
   * [XSL ERR MINMAX] If US:HorBwMax is used, it MUST be greater than
   * US:HorBwMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedLobeValues object instance.
   * @since 3.1.0
   */
  public ObservedLobeValues withHorzBwMax(Double value) {
    setHorzBwMax(new US_Degrees(value));
    return this;
  }

  /**
   * Set the minimum angle of the horizontal component of the antenna mainbeam
   * measured at the half-power (-3 dB) point of its maximum horizontal width.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedLobeValues object instance.
   * @since 3.1.0
   */
  public ObservedLobeValues withHorzBwMin(Double value) {
    setHorzBwMin(new US_Degrees(value));
    return this;
  }

  /**
   * Set the measurement accuracy of the LobeValueAngle(s) in degrees. Expressed
   * as a (+/-) value.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedLobeValues object instance.
   * @since 3.1.0
   */
  public ObservedLobeValues withLobeValueAngleAccuracy(Double value) {
    setLobeValueAngleAccuracy(new US_Degrees90(value));
    return this;
  }

  /**
   * Set the azimuth angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedLobeValues object instance.
   * @since 3.1.0
   */
  public ObservedLobeValues withLobeValueAngleHorz(Double value) {
    setLobeValueAngleHorz(new Az180(value));
    return this;
  }

  /**
   * Set the vertical angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedLobeValues object instance.
   * @since 3.1.0
   */
  public ObservedLobeValues withLobeValueAngleVert(Double value) {
    setLobeValueAngleVert(new Az180(value));
    return this;
  }

  /**
   * Set a unique (within the AntLobe) identifier for the Antenna lobe
   * measurement.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedLobeValues object instance.
   * @since 3.1.0
   */
  public ObservedLobeValues withLobeValueID(String value) {
    setLobeValueID(new S10(value));
    return this;
  }

  /**
   * Set the ratio of the mainbeam power level to the sidelobe power level,
   * expressed as a positive value in dB.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedLobeValues object instance.
   * @since 3.1.0
   */
  public ObservedLobeValues withLobeValueLevel(Double value) {
    setLobeValueLevel(new US_DB150(value));
    return this;
  }

  /**
   * Set the measurement accuracy of the LobeValueLevel value in dB. Expressed
   * as a (+/-) value.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedLobeValues object instance.
   * @since 3.1.0
   */
  public ObservedLobeValues withLobeValueLevelAccuracy(Double value) {
    setLobeValueLevelAccuracy(new US_DB90(value));
    return this;
  }

  /**
   * Set a name for the Antenna lobe measurement.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedLobeValues object instance.
   * @since 3.1.0
   */
  public ObservedLobeValues withLobeValueName(String value) {
    setLobeValueName(new S25(value));
    return this;
  }

  /**
   * Set the maximum angle of the vertical component of the antenna mainbeam
   * measured at the half-power (-3 dB) points of its maximum vertical width.
   * <p>
   * [XSL ERR MINMAX] If US:VertBwMax is used, it MUST be greater than
   * US:VertBwMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedLobeValues object instance.
   * @since 3.1.0
   */
  public ObservedLobeValues withVertBwMax(Double value) {
    setVertBwMax(new US_Degrees(value));
    return this;
  }

  /**
   * Set the minimum angle of the vertical component of the antenna mainbeam
   * measured at the half-power (-3 dB) points of its maximum vertical width.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedLobeValues object instance.
   * @since 3.1.0
   */
  public ObservedLobeValues withVertBwMin(Double value) {
    setVertBwMin(new US_Degrees(value));
    return this;
  }

  /**
   * Get a string representation of this ObservedLobeValues instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  ObservedLobeValues {"
           + (horzBwMax != null ? " horzBwMax [" + horzBwMax + "]" : "")
           + (horzBwMin != null ? " horzBwMin [" + horzBwMin + "]" : "")
           + (lobeValueAngleAccuracy != null ? " lobeValueAngleAccuracy [" + lobeValueAngleAccuracy + "]" : "")
           + (lobeValueAngleHorz != null ? " lobeValueAngleHorz [" + lobeValueAngleHorz + "]" : "")
           + (lobeValueAngleVert != null ? " lobeValueAngleVert [" + lobeValueAngleVert + "]" : "")
           + (lobeValueID != null ? " lobeValueID [" + lobeValueID + "]" : "")
           + (lobeValueLevel != null ? " lobeValueLevel [" + lobeValueLevel + "]" : "")
           + (lobeValueLevelAccuracy != null ? " lobeValueLevelAccuracy [" + lobeValueLevelAccuracy + "]" : "")
           + (lobeValueName != null ? " lobeValueName [" + lobeValueName + "]" : "")
           + (vertBwMax != null ? " vertBwMax [" + vertBwMax + "]" : "")
           + (vertBwMin != null ? " vertBwMin [" + vertBwMin + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedLobeValues} requires {@link S10 LobeValueID}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetLobeValueID();
  }

}
