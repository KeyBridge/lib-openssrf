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
package us.gov.dod.standard.ssrf._3_1.radiationplan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.RadiationPlan;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUWC;

/**
 * JammingAuthority (US) describes the Jamming Control Authority (JCA)
 * authorisation information for the jamming plan and the controls affecting the
 * level of authorisation.
 * <p>
 * Element of {@link RadiationPlan}
 * <p>
 * Example: See {@link RadiationPlan}.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JammingAuthority", propOrder = {
  "jcaCallSign",
  "jcaFreq",
  "jcaLevel",
  "jcaState"
})
public class JammingAuthority {

  /**
   * JCACallSign (US) - The unique net identifier for the JCA. If an active
   * JCEOI is in effect, it SHOULD take precedence.
   */
  @XmlElement(name = "JCACallSign", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString jcaCallSign;
  /**
   * JCAFreq (US) - The frequency assigned to the JCA. If an active JCEOI is in
   * effect, it SHOULD take precedence.
   */
  @XmlElement(name = "JCAFreq", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal jcaFreq;
  /**
   * JCALevel (US) - The required level of authorisation for the jamming plan.
   */
  @XmlElement(name = "JCALevel", required = true)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN2.class)
  private TInteger jcaLevel;
  /**
   * US:JCAState - Authorisation State (Required)
   * <p>
   * An indication of the authorization condition for radiation of a jamming
   * plan.
   * <p>
   * Format is L:UWC
   */
  @XmlElement(name = "JCAState", required = true)
  private TString jcaState;

  /**
   * Get JCACallSign (US) - The unique net identifier for the JCA. If an active
   * JCEOI is in effect, it SHOULD take precedence.
   * <p>
   * @return the JCACallSign value in a {@link TString} data type
   */
  public TString getJCACallSign() {
    return jcaCallSign;
  }

  /**
   * Set JCACallSign (US) - The unique net identifier for the JCA. If an active
   * JCEOI is in effect, it SHOULD take precedence.
   * <p>
   * @param value the JCACallSign value in a {@link TString} data type
   */
  public void setJCACallSign(TString value) {
    this.jcaCallSign = value;
  }

  /**
   * Determine if the JCACallSign is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJCACallSign() {
    return (this.jcaCallSign != null ? this.jcaCallSign.isSetValue() : false);
  }

  /**
   * Get JCAFreq (US) - The frequency assigned to the JCA. If an active JCEOI is
   * in effect, it SHOULD take precedence.
   * <p>
   * @return the JCAFreq value in a {@link TDecimal} data type
   */
  public TDecimal getJCAFreq() {
    return jcaFreq;
  }

  /**
   * Set JCAFreq (US) - The frequency assigned to the JCA. If an active JCEOI is
   * in effect, it SHOULD take precedence.
   * <p>
   * @param value the JCAFreq value in a {@link TDecimal} data type
   */
  public void setJCAFreq(TDecimal value) {
    this.jcaFreq = value;
  }

  /**
   * Determine if the JCAFreq is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJCAFreq() {
    return (this.jcaFreq != null ? this.jcaFreq.isSetValue() : false);
  }

  /**
   * Get JCALevel (US) - The required level of authorisation for the jamming
   * plan.
   * <p>
   * @return the JCALevel value in a {@link TInteger} data type
   */
  public TInteger getJCALevel() {
    return jcaLevel;
  }

  /**
   * Set JCALevel (US) - The required level of authorisation for the jamming
   * plan.
   * <p>
   * @param value the JCALevel value in a {@link TInteger} data type
   */
  public void setJCALevel(TInteger value) {
    this.jcaLevel = value;
  }

  /**
   * Determine if the JCALevel is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJCALevel() {
    return (this.jcaLevel != null ? this.jcaLevel.isSetValue() : false);
  }

  /**
   * Get an indication of the authorization condition for radiation of a jamming
   * plan.
   * <p>
   * @return the JCAState value in a {@link TString} data type
   */
  public TString getJCAState() {
    return jcaState;
  }

  /**
   * Set an indication of the authorization condition for radiation of a jamming
   * plan.
   * <p>
   * @param value the JCAState value in a {@link TString} data type
   */
  public void setJCAState(TString value) {
    this.jcaState = value;
  }

  /**
   * Determine if the JCAState is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJCAState() {
    return (this.jcaState != null ? this.jcaState.isSetValue() : false);
  }

  /**
   * Set JCACallSign (US) - The unique net identifier for the JCA. If an active
   * JCEOI is in effect, it SHOULD take precedence.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JammingAuthority object instance
   */
  public JammingAuthority withJCACallSign(String value) {
    setJCACallSign(new TString(value));
    return this;
  }

  /**
   * Set JCAFreq (US) - The frequency assigned to the JCA. If an active JCEOI is
   * in effect, it SHOULD take precedence.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current JammingAuthority object instance
   */
  public JammingAuthority withJCAFreq(Double value) {
    setJCAFreq(new TDecimal(value));
    return this;
  }

  /**
   * Set JCALevel (US) - The required level of authorisation for the jamming
   * plan.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current JammingAuthority object instance
   */
  public JammingAuthority withJCALevel(Integer value) {
    setJCALevel(new TInteger(value));
    return this;
  }

  /**
   * Set an indication of the authorization condition for radiation of a jamming
   * plan.
   * <p>
   * @param value An instances of type {@link ListUWC}
   * @return The current JammingAuthority object instance
   */
  public JammingAuthority withJCAState(ListUWC value) {
    setJCAState(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this JammingAuthority instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "JammingAuthority {"
      + (jcaFreq != null ? " jcaFreq [" + jcaFreq + "]" : "")
      + (jcaCallSign != null ? " jcaCallSign [" + jcaCallSign + "]" : "")
      + (jcaLevel != null ? " jcaLevel [" + jcaLevel + "]" : "")
      + (jcaState != null ? " jcaState [" + jcaState + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JammingAuthority} requires
   * {@link TInteger JCALevel}, {@link TString JCAState}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetJCALevel() && isSetJCAState();
  }

}
