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
package us.gov.dod.standard.ssrf._3_1.radiationplan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.RadiationPlan;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
   * In Data Item JCACallSign (US), enter the unique net identifier for the JCA.
   * If an active JCEOI is in effect, it SHOULD take precedence.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JCACallSign", required = false)
  private S10 jcaCallSign;
  /**
   * In Data Item JCAFreq (US), enter the frequency assigned to the JCA. If an
   * active JCEOI is in effect, it SHOULD take precedence.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JCAFreq", required = false)
  private FreqM jcaFreq;
  /**
   * In Data Item JCALevel (US), enter the required level of authorisation for
   * the jamming plan.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JCALevel", required = true)
  private UN2 jcaLevel;
  /**
   * US:JCAState - Authorisation State (Required)    * <p>
   * An indication of the authorization condition for radiation of a jamming
   * plan.
   * <p>
   * Format is L:UWC
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JCAState", required = true)
  private TString jcaState;

  /**
   * Get In Data Item JCACallSign (US), enter the unique net identifier for the
   * JCA. If an active JCEOI is in effect, it SHOULD take precedence..
   * <p>
   * @return a {@link S10} instance
   * @since 3.1.0
   */
  public S10 getJCACallSign() {
    return jcaCallSign;
  }

  /**
   * Set In Data Item JCACallSign (US), enter the unique net identifier for the
   * JCA. If an active JCEOI is in effect, it SHOULD take precedence..
   * <p>
   * @param value a {@link S10} instance
   * @since 3.1.0
   */
  public void setJCACallSign(S10 value) {
    this.jcaCallSign = value;
  }

  /**
   * Determine if the JCACallSign is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJCACallSign() {
    return (this.jcaCallSign != null ? this.jcaCallSign.isSetValue() : false);
  }

  /**
   * Get In Data Item JCAFreq (US), enter the frequency assigned to the JCA. If
   * an active JCEOI is in effect, it SHOULD take precedence..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getJCAFreq() {
    return jcaFreq;
  }

  /**
   * Set In Data Item JCAFreq (US), enter the frequency assigned to the JCA. If
   * an active JCEOI is in effect, it SHOULD take precedence..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setJCAFreq(FreqM value) {
    this.jcaFreq = value;
  }

  /**
   * Determine if the JCAFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJCAFreq() {
    return (this.jcaFreq != null ? this.jcaFreq.isSetValue() : false);
  }

  /**
   * Get In Data Item JCALevel (US), enter the required level of authorisation
   * for the jamming plan..
   * <p>
   * @return a {@link UN2} instance
   * @since 3.1.0
   */
  public UN2 getJCALevel() {
    return jcaLevel;
  }

  /**
   * Set In Data Item JCALevel (US), enter the required level of authorisation
   * for the jamming plan..
   * <p>
   * @param value a {@link UN2} instance
   * @since 3.1.0
   */
  public void setJCALevel(UN2 value) {
    this.jcaLevel = value;
  }

  /**
   * Determine if the JCALevel is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJCALevel() {
    return (this.jcaLevel != null ? this.jcaLevel.isSetValue() : false);
  }

  /**
   * Get an indication of the authorization condition for radiation of a jamming
   * plan..
   * <p>
   * @return the JCAState value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getJCAState() {
    return jcaState;
  }

  /**
   * Set an indication of the authorization condition for radiation of a jamming
   * plan..
   * <p>
   * @param value the JCAState value in a {@link TString} data type
   * @since 3.1.0
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
   * Set In Data Item JCACallSign (US), enter the unique net identifier for the
   * JCA. If an active JCEOI is in effect, it SHOULD take precedence.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JammingAuthority object instance.
   * @since 3.1.0
   */
  public JammingAuthority withJCACallSign(String value) {
    setJCACallSign(new S10(value));
    return this;
  }

  /**
   * Set In Data Item JCAFreq (US), enter the frequency assigned to the JCA. If
   * an active JCEOI is in effect, it SHOULD take precedence.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JammingAuthority object instance.
   * @since 3.1.0
   */
  public JammingAuthority withJCAFreq(Double value) {
    setJCAFreq(new FreqM(value));
    return this;
  }

  /**
   * Set In Data Item JCALevel (US), enter the required level of authorisation
   * for the jamming plan.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current JammingAuthority object instance.
   * @since 3.1.0
   */
  public JammingAuthority withJCALevel(Integer value) {
    setJCALevel(new UN2(value));
    return this;
  }

  /**
   * Set an indication of the authorization condition for radiation of a jamming
   * plan.
   * <p>
   * @param value An instances of type {@link ListUWC}.
   * @return The current JammingAuthority object instance.
   * @since 3.1.0
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
           + (jcaCallSign != null ? " jcaCallSign [" + jcaCallSign + "]" : "")
           + (jcaFreq != null ? " jcaFreq [" + jcaFreq + "]" : "")
           + (jcaLevel != null ? " jcaLevel [" + jcaLevel + "]" : "")
           + (jcaState != null ? " jcaState [" + jcaState + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JammingAuthority} requires
   * {@link UN2 JCALevel}, {@link TString JCAState}.
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
