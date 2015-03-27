/* 
 * Copyright 2014 Key Bridge LLC.
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
package us.gov.dod.standard.ssrf._3_1.multiple;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCEN;

/**
 * PotentialVictims (US) contains the names of systems, or the Notations of
 * signals, which may be affected by the subject Notation/Signal.
 * <p>
 * Element of {@link Notation}
 * <p>
 * Example: See {@link Notation}.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PotentialVictims", propOrder = {
  "type",
  "victimName",
  "victimNotation"
})
public class PotentialVictims {

  /**
   * US:Type - Victim Notation Type (Optional)
   * <p>
   * The type of Notation.
   * <p>
   * Format is L:CEN
   */
  @XmlElement(name = "Type", required = false)
  private TString type;
  /**
   * US:VictimName - US:VictimName (Optional)
   * <p>
   * The name or nomenclature of a system that may be negatively impacted by the
   * subject Notation/Signal.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "VictimName", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString victimName;
  /**
   * US:VictimNotation - Victim Notation (Optional)
   * <p>
   * The designator for a specific emitter that may be negatively impacted by
   * the subject Notation/Signal.
   * <p>
   * Format is US(20)
   */
  @XmlElement(name = "VictimNotation", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterUS20.class)
  private TString victimNotation;

  /**
   * Get the type of Notation.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of Notation.
   * <p>
   * @param value the Type value in a {@link TString} data type
   */
  public void setType(TString value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

  /**
   * Get the name or nomenclature of a system that may be negatively impacted by
   * the subject Notation/Signal.
   * <p>
   * @return the VictimName value in a {@link TString} data type
   */
  public TString getVictimName() {
    return victimName;
  }

  /**
   * Set the name or nomenclature of a system that may be negatively impacted by
   * the subject Notation/Signal.
   * <p>
   * @param value the VictimName value in a {@link TString} data type
   */
  public void setVictimName(TString value) {
    this.victimName = value;
  }

  /**
   * Determine if the VictimName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimName() {
    return (this.victimName != null ? this.victimName.isSetValue() : false);
  }

  /**
   * Get the designator for a specific emitter that may be negatively impacted
   * by the subject Notation/Signal.
   * <p>
   * @return the VictimNotation value in a {@link TString} data type
   */
  public TString getVictimNotation() {
    return victimNotation;
  }

  /**
   * Set the designator for a specific emitter that may be negatively impacted
   * by the subject Notation/Signal.
   * <p>
   * @param value the VictimNotation value in a {@link TString} data type
   */
  public void setVictimNotation(TString value) {
    this.victimNotation = value;
  }

  /**
   * Determine if the VictimNotation is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimNotation() {
    return (this.victimNotation != null ? this.victimNotation.isSetValue() : false);
  }

  /**
   * Set the type of Notation.
   * <p>
   * @param value An instances of type {@link ListCEN}
   * @return The current PotentialVictims object instance
   */
  public PotentialVictims withType(ListCEN value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the name or nomenclature of a system that may be negatively impacted by
   * the subject Notation/Signal.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current PotentialVictims object instance
   */
  public PotentialVictims withVictimName(String value) {
    setVictimName(new TString(value));
    return this;
  }

  /**
   * Set the designator for a specific emitter that may be negatively impacted
   * by the subject Notation/Signal.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current PotentialVictims object instance
   */
  public PotentialVictims withVictimNotation(String value) {
    setVictimNotation(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this PotentialVictims instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "PotentialVictims {"
      + (victimNotation != null ? " victimNotation [" + victimNotation + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + (victimName != null ? " victimName [" + victimName + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link PotentialVictims} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
