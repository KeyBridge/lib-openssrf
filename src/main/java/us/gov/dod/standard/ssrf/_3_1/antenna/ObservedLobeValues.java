/* 
 * Copyright 2014 Key Bridge Global LLC.
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "HorzBwMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEGREES.class)
  private TDecimal horzBwMax;
  /**
   * US:HorzBwMin - Minimum Horizontal Beamwidth (Optional)
   * <p>
   * The minimum angle of the horizontal component of the antenna mainbeam
   * measured at the half-power (-3 dB) point of its maximum horizontal width.
   * <p>
   * Format is UN(5,2) (deg)
   */
  @XmlElement(name = "HorzBwMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEGREES.class)
  private TDecimal horzBwMin;
  /**
   * US:LobeValueAngleAccuracy - Lobe Measurement Angle Accuracy (Optional)
   * <p>
   * The measurement accuracy of the LobeValueAngle(s) in degrees. Expressed as
   * a (+/-) value.
   * <p>
   * Format is SN(5,2) [0-90] (deg)
   */
  @XmlElement(name = "LobeValueAngleAccuracy", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEGREES90.class)
  private TDecimal lobeValueAngleAccuracy;
  /**
   * US:LobeValueAngleHorz - Lobe Measurement Horizontal Angle (Optional)
   * <p>
   * The azimuth angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level.
   * <p>
   * Format is SN(5,2) [0-180] (deg)
   */
  @XmlElement(name = "LobeValueAngleHorz", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ180.class)
  private TDecimal lobeValueAngleHorz;
  /**
   * US:LobeValueAngleVert - Lobe Measurement Vertical Angle (Optional)
   * <p>
   * The vertical angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level.
   * <p>
   * Format is SN(5,2) [0-180] (deg)
   */
  @XmlElement(name = "LobeValueAngleVert", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ180.class)
  private TDecimal lobeValueAngleVert;
  /**
   * US:LobeValueID - Lobe Measurement Identifier (Required)
   * <p>
   * A unique (within the AntLobe) identifier for the Antenna lobe measurement.
   * <p>
   * Format is S10
   */
  @XmlElement(name = "LobeValueID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString lobeValueID;
  /**
   * US:LobeValueLevel - Lobe Measurement Power Level (Optional)
   * <p>
   * The ratio of the mainbeam power level to the sidelobe power level,
   * expressed as a positive value in dB.
   * <p>
   * Format is UN(5,2) [0-150] (dB)
   */
  @XmlElement(name = "LobeValueLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DB150.class)
  private TDecimal lobeValueLevel;
  /**
   * US:LobeValueLevelAccuracy - Lobe Measurement Level Accuracy (Optional)
   * <p>
   * The measurement accuracy of the LobeValueLevel value in dB. Expressed as a
   * (+/-) value.
   * <p>
   * Format is SN(4,2) [0-75] (dB)
   */
  @XmlElement(name = "LobeValueLevelAccuracy", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DB90.class)
  private TDecimal lobeValueLevelAccuracy;
  /**
   * US:LobeValueName - Lobe Measurement Name (Optional)
   * <p>
   * A name for the Antenna lobe measurement.
   * <p>
   * Format is S25
   */
  @XmlElement(name = "LobeValueName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString lobeValueName;
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
   */
  @XmlElement(name = "VertBwMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEGREES.class)
  private TDecimal vertBwMax;
  /**
   * US:VertBwMin - Minimum Vertical Beamwidth (Optional)
   * <p>
   * The minimum angle of the vertical component of the antenna mainbeam
   * measured at the half-power (-3 dB) points of its maximum vertical width.
   * <p>
   * Format is UN(5,2) (deg)
   */
  @XmlElement(name = "VertBwMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEGREES.class)
  private TDecimal vertBwMin;

  /**
   * Get the maximum angle of the horizontal component of the antenna mainbeam
   * measured at the half-power (-3 dB) point of its maximum horizontal width.
   * <p>
   * [XSL ERR MINMAX] If US:HorBwMax is used, it MUST be greater than
   * US:HorBwMin.
   * <p>
   * @return the HorzBwMax value in a {@link TDecimal} data type
   */
  public TDecimal getHorzBwMax() {
    return horzBwMax;
  }

  /**
   * Set the maximum angle of the horizontal component of the antenna mainbeam
   * measured at the half-power (-3 dB) point of its maximum horizontal width.
   * <p>
   * [XSL ERR MINMAX] If US:HorBwMax is used, it MUST be greater than
   * US:HorBwMin.
   * <p>
   * @param value the HorzBwMax value in a {@link TDecimal} data type
   */
  public void setHorzBwMax(TDecimal value) {
    this.horzBwMax = value;
  }

  /**
   * Determine if the HorzBwMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzBwMax() {
    return (this.horzBwMax != null ? this.horzBwMax.isSetValue() : false);
  }

  /**
   * Get the minimum angle of the horizontal component of the antenna mainbeam
   * measured at the half-power (-3 dB) point of its maximum horizontal width.
   * <p>
   * @return the HorzBwMin value in a {@link TDecimal} data type
   */
  public TDecimal getHorzBwMin() {
    return horzBwMin;
  }

  /**
   * Set the minimum angle of the horizontal component of the antenna mainbeam
   * measured at the half-power (-3 dB) point of its maximum horizontal width.
   * <p>
   * @param value the HorzBwMin value in a {@link TDecimal} data type
   */
  public void setHorzBwMin(TDecimal value) {
    this.horzBwMin = value;
  }

  /**
   * Determine if the HorzBwMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzBwMin() {
    return (this.horzBwMin != null ? this.horzBwMin.isSetValue() : false);
  }

  /**
   * Get the measurement accuracy of the LobeValueAngle(s) in degrees. Expressed
   * as a (+/-) value.
   * <p>
   * @return the LobeValueAngleAccuracy value in a {@link TDecimal} data type
   */
  public TDecimal getLobeValueAngleAccuracy() {
    return lobeValueAngleAccuracy;
  }

  /**
   * Set the measurement accuracy of the LobeValueAngle(s) in degrees. Expressed
   * as a (+/-) value.
   * <p>
   * @param value the LobeValueAngleAccuracy value in a {@link TDecimal} data
   *              type
   */
  public void setLobeValueAngleAccuracy(TDecimal value) {
    this.lobeValueAngleAccuracy = value;
  }

  /**
   * Determine if the LobeValueAngleAccuracy is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeValueAngleAccuracy() {
    return (this.lobeValueAngleAccuracy != null ? this.lobeValueAngleAccuracy.isSetValue() : false);
  }

  /**
   * Get the azimuth angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level.
   * <p>
   * @return the LobeValueAngleHorz value in a {@link TDecimal} data type
   */
  public TDecimal getLobeValueAngleHorz() {
    return lobeValueAngleHorz;
  }

  /**
   * Set the azimuth angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level.
   * <p>
   * @param value the LobeValueAngleHorz value in a {@link TDecimal} data type
   */
  public void setLobeValueAngleHorz(TDecimal value) {
    this.lobeValueAngleHorz = value;
  }

  /**
   * Determine if the LobeValueAngleHorz is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeValueAngleHorz() {
    return (this.lobeValueAngleHorz != null ? this.lobeValueAngleHorz.isSetValue() : false);
  }

  /**
   * Get the vertical angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level.
   * <p>
   * @return the LobeValueAngleVert value in a {@link TDecimal} data type
   */
  public TDecimal getLobeValueAngleVert() {
    return lobeValueAngleVert;
  }

  /**
   * Set the vertical angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level.
   * <p>
   * @param value the LobeValueAngleVert value in a {@link TDecimal} data type
   */
  public void setLobeValueAngleVert(TDecimal value) {
    this.lobeValueAngleVert = value;
  }

  /**
   * Determine if the LobeValueAngleVert is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeValueAngleVert() {
    return (this.lobeValueAngleVert != null ? this.lobeValueAngleVert.isSetValue() : false);
  }

  /**
   * Get a unique (within the AntLobe) identifier for the Antenna lobe
   * measurement.
   * <p>
   * @return the LobeValueID value in a {@link TString} data type
   */
  public TString getLobeValueID() {
    return lobeValueID;
  }

  /**
   * Set a unique (within the AntLobe) identifier for the Antenna lobe
   * measurement.
   * <p>
   * @param value the LobeValueID value in a {@link TString} data type
   */
  public void setLobeValueID(TString value) {
    this.lobeValueID = value;
  }

  /**
   * Determine if the LobeValueID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeValueID() {
    return (this.lobeValueID != null ? this.lobeValueID.isSetValue() : false);
  }

  /**
   * Get the ratio of the mainbeam power level to the sidelobe power level,
   * expressed as a positive value in dB.
   * <p>
   * @return the LobeValueLevel value in a {@link TDecimal} data type
   */
  public TDecimal getLobeValueLevel() {
    return lobeValueLevel;
  }

  /**
   * Set the ratio of the mainbeam power level to the sidelobe power level,
   * expressed as a positive value in dB.
   * <p>
   * @param value the LobeValueLevel value in a {@link TDecimal} data type
   */
  public void setLobeValueLevel(TDecimal value) {
    this.lobeValueLevel = value;
  }

  /**
   * Determine if the LobeValueLevel is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeValueLevel() {
    return (this.lobeValueLevel != null ? this.lobeValueLevel.isSetValue() : false);
  }

  /**
   * Get the measurement accuracy of the LobeValueLevel value in dB. Expressed
   * as a (+/-) value.
   * <p>
   * @return the LobeValueLevelAccuracy value in a {@link TDecimal} data type
   */
  public TDecimal getLobeValueLevelAccuracy() {
    return lobeValueLevelAccuracy;
  }

  /**
   * Set the measurement accuracy of the LobeValueLevel value in dB. Expressed
   * as a (+/-) value.
   * <p>
   * @param value the LobeValueLevelAccuracy value in a {@link TDecimal} data
   *              type
   */
  public void setLobeValueLevelAccuracy(TDecimal value) {
    this.lobeValueLevelAccuracy = value;
  }

  /**
   * Determine if the LobeValueLevelAccuracy is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLobeValueLevelAccuracy() {
    return (this.lobeValueLevelAccuracy != null ? this.lobeValueLevelAccuracy.isSetValue() : false);
  }

  /**
   * Get a name for the Antenna lobe measurement.
   * <p>
   * @return the LobeValueName value in a {@link TString} data type
   */
  public TString getLobeValueName() {
    return lobeValueName;
  }

  /**
   * Set a name for the Antenna lobe measurement.
   * <p>
   * @param value the LobeValueName value in a {@link TString} data type
   */
  public void setLobeValueName(TString value) {
    this.lobeValueName = value;
  }

  /**
   * Determine if the LobeValueName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
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
   * US:VertBwMin.
   * <p>
   * @return the VertBwMax value in a {@link TDecimal} data type
   */
  public TDecimal getVertBwMax() {
    return vertBwMax;
  }

  /**
   * Set the maximum angle of the vertical component of the antenna mainbeam
   * measured at the half-power (-3 dB) points of its maximum vertical width.
   * <p>
   * [XSL ERR MINMAX] If US:VertBwMax is used, it MUST be greater than
   * US:VertBwMin.
   * <p>
   * @param value the VertBwMax value in a {@link TDecimal} data type
   */
  public void setVertBwMax(TDecimal value) {
    this.vertBwMax = value;
  }

  /**
   * Determine if the VertBwMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertBwMax() {
    return (this.vertBwMax != null ? this.vertBwMax.isSetValue() : false);
  }

  /**
   * Get the minimum angle of the vertical component of the antenna mainbeam
   * measured at the half-power (-3 dB) points of its maximum vertical width.
   * <p>
   * @return the VertBwMin value in a {@link TDecimal} data type
   */
  public TDecimal getVertBwMin() {
    return vertBwMin;
  }

  /**
   * Set the minimum angle of the vertical component of the antenna mainbeam
   * measured at the half-power (-3 dB) points of its maximum vertical width.
   * <p>
   * @param value the VertBwMin value in a {@link TDecimal} data type
   */
  public void setVertBwMin(TDecimal value) {
    this.vertBwMin = value;
  }

  /**
   * Determine if the VertBwMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * @param value An instances of type {@link Double}
   * @return The current ObservedLobeValues object instance
   */
  public ObservedLobeValues withHorzBwMax(Double value) {
    setHorzBwMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum angle of the horizontal component of the antenna mainbeam
   * measured at the half-power (-3 dB) point of its maximum horizontal width.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedLobeValues object instance
   */
  public ObservedLobeValues withHorzBwMin(Double value) {
    setHorzBwMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the measurement accuracy of the LobeValueAngle(s) in degrees. Expressed
   * as a (+/-) value.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedLobeValues object instance
   */
  public ObservedLobeValues withLobeValueAngleAccuracy(Double value) {
    setLobeValueAngleAccuracy(new TDecimal(value));
    return this;
  }

  /**
   * Set the azimuth angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedLobeValues object instance
   */
  public ObservedLobeValues withLobeValueAngleHorz(Double value) {
    setLobeValueAngleHorz(new TDecimal(value));
    return this;
  }

  /**
   * Set the vertical angle between the sidelobe LobeValueLevel and the mainbeam
   * maximum power level.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedLobeValues object instance
   */
  public ObservedLobeValues withLobeValueAngleVert(Double value) {
    setLobeValueAngleVert(new TDecimal(value));
    return this;
  }

  /**
   * Set a unique (within the AntLobe) identifier for the Antenna lobe
   * measurement.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedLobeValues object instance
   */
  public ObservedLobeValues withLobeValueID(String value) {
    setLobeValueID(new TString(value));
    return this;
  }

  /**
   * Set the ratio of the mainbeam power level to the sidelobe power level,
   * expressed as a positive value in dB.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedLobeValues object instance
   */
  public ObservedLobeValues withLobeValueLevel(Double value) {
    setLobeValueLevel(new TDecimal(value));
    return this;
  }

  /**
   * Set the measurement accuracy of the LobeValueLevel value in dB. Expressed
   * as a (+/-) value.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedLobeValues object instance
   */
  public ObservedLobeValues withLobeValueLevelAccuracy(Double value) {
    setLobeValueLevelAccuracy(new TDecimal(value));
    return this;
  }

  /**
   * Set a name for the Antenna lobe measurement.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedLobeValues object instance
   */
  public ObservedLobeValues withLobeValueName(String value) {
    setLobeValueName(new TString(value));
    return this;
  }

  /**
   * Set the maximum angle of the vertical component of the antenna mainbeam
   * measured at the half-power (-3 dB) points of its maximum vertical width.
   * <p>
   * [XSL ERR MINMAX] If US:VertBwMax is used, it MUST be greater than
   * US:VertBwMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedLobeValues object instance
   */
  public ObservedLobeValues withVertBwMax(Double value) {
    setVertBwMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum angle of the vertical component of the antenna mainbeam
   * measured at the half-power (-3 dB) points of its maximum vertical width.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedLobeValues object instance
   */
  public ObservedLobeValues withVertBwMin(Double value) {
    setVertBwMin(new TDecimal(value));
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
    return "ObservedLobeValues {"
      + (lobeValueAngleVert != null ? " lobeValueAngleVert [" + lobeValueAngleVert + "]" : "")
      + (horzBwMin != null ? " horzBwMin [" + horzBwMin + "]" : "")
      + (horzBwMax != null ? " horzBwMax [" + horzBwMax + "]" : "")
      + (lobeValueLevelAccuracy != null ? " lobeValueLevelAccuracy [" + lobeValueLevelAccuracy + "]" : "")
      + (lobeValueAngleAccuracy != null ? " lobeValueAngleAccuracy [" + lobeValueAngleAccuracy + "]" : "")
      + (vertBwMax != null ? " vertBwMax [" + vertBwMax + "]" : "")
      + (vertBwMin != null ? " vertBwMin [" + vertBwMin + "]" : "")
      + (lobeValueAngleHorz != null ? " lobeValueAngleHorz [" + lobeValueAngleHorz + "]" : "")
      + (lobeValueName != null ? " lobeValueName [" + lobeValueName + "]" : "")
      + (lobeValueLevel != null ? " lobeValueLevel [" + lobeValueLevel + "]" : "")
      + (lobeValueID != null ? " lobeValueID [" + lobeValueID + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedLobeValues} requires {@link TString LobeValueID}.
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
