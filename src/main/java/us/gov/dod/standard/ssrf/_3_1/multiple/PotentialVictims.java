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
package us.gov.dod.standard.ssrf._3_1.multiple;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.S50;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.US20;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCEN;

/**
 * PotentialVictims (US) contains the names of systems, or the Notations of
 * signals, which may be affected by the subject Notation/Signal.
 * <p>
 * Element of {@link Notation}
 * <p>
 * Example: See {@link Notation}.
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
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
   * <p>
   * @since 3.1.0
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VictimName", required = false)
  private S50 victimName;
  /**
   * US:VictimNotation - Victim Notation (Optional)
   * <p>
   * The designator for a specific emitter that may be negatively impacted by
   * the subject Notation/Signal.
   * <p>
   * Format is US(20)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VictimNotation", required = false)
  private US20 victimNotation;

  /**
   * Get the type of Notation. .
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of Notation. .
   * <p>
   * @param value the Type value in a {@link TString} data type
   * @since 3.1.0
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
   * the subject Notation/Signal..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getVictimName() {
    return victimName;
  }

  /**
   * Set the name or nomenclature of a system that may be negatively impacted by
   * the subject Notation/Signal..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setVictimName(S50 value) {
    this.victimName = value;
  }

  /**
   * Determine if the VictimName is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimName() {
    return (this.victimName != null ? this.victimName.isSetValue() : false);
  }

  /**
   * Get the designator for a specific emitter that may be negatively impacted
   * by the subject Notation/Signal..
   * <p>
   * @return a {@link US20} instance
   * @since 3.1.0
   */
  public US20 getVictimNotation() {
    return victimNotation;
  }

  /**
   * Set the designator for a specific emitter that may be negatively impacted
   * by the subject Notation/Signal..
   * <p>
   * @param value a {@link US20} instance
   * @since 3.1.0
   */
  public void setVictimNotation(US20 value) {
    this.victimNotation = value;
  }

  /**
   * Determine if the VictimNotation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimNotation() {
    return (this.victimNotation != null ? this.victimNotation.isSetValue() : false);
  }

  /**
   * Set the type of Notation.
   * <p>
   * @param value An instances of type {@link ListCEN}.
   * @return The current PotentialVictims object instance.
   * @since 3.1.0
   */
  public PotentialVictims withType(ListCEN value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the name or nomenclature of a system that may be negatively impacted by
   * the subject Notation/Signal.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current PotentialVictims object instance.
   * @since 3.1.0
   */
  public PotentialVictims withVictimName(String value) {
    setVictimName(new S50(value));
    return this;
  }

  /**
   * Set the designator for a specific emitter that may be negatively impacted
   * by the subject Notation/Signal.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current PotentialVictims object instance.
   * @since 3.1.0
   */
  public PotentialVictims withVictimNotation(String value) {
    setVictimNotation(new US20(value));
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
    return "\n  PotentialVictims {"
           + (type != null ? " type [" + type + "]" : "")
           + (victimName != null ? " victimName [" + victimName + "]" : "")
           + (victimNotation != null ? " victimNotation [" + victimNotation + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link PotentialVictims} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
