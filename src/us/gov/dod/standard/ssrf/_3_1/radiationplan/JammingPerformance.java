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
package us.gov.dod.standard.ssrf._3_1.radiationplan;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.RadiationPlan;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUWA;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUWB;

/**
 * JammingPerformance (US) describes Electronic Attack effectiveness and how
 * severely a target's use of the spectrum is expected to be impacted and/or how
 * well it actually was impacted, for a specific jamming mission.
 * <p>
 * Element of {@link JammingTarget}
 * <p>
 * Example: See {@link RadiationPlan}.
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JammingPerformance", propOrder = {
  "actualEffect",
  "actualPerformance",
  "continuousUpdate",
  "desiredEffect",
  "desiredPerformance"
})
public class JammingPerformance {

  /**
   * US:ActualEffect - Actual Effect (Optional)
   * <p>
   * The actual impact a jamming mission had on a specific target area.
   * <p>
   * Format is L:UWA
   */
  @XmlElement(name = "ActualEffect", required = false)
  private TString actualEffect;
  /**
   * US:ActualPerformance (US) - The assessed effectiveness of the service
   * request.
   */
  @XmlElement(name = "ActualPerformance", required = false)
  private TString actualPerformance;
  /**
   * US:ContinuousUpdate - Update Continuously (Optional)
   * <p>
   * If effectiveness data should be provided continually or just once.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "ContinuousUpdate", required = false)
  private TString continuousUpdate;
  /**
   * US:DesiredEffect - Desired Effect (Optional)
   * <p>
   * The expected impact a jamming mission will have on a specific target area.
   * <p>
   * Format is L:UWA
   */
  @XmlElement(name = "DesiredEffect", required = false)
  private TString desiredEffect;
  /**
   * US:DesiredPerformance - Desired Performance (Optional)
   * <p>
   * The desired effectiveness of the service request. Example: the minimum
   * percentage of known enemy command and control nodes that must be rendered
   * inoperable for successful mission accomplishment.
   * <p>
   * Format is L:UWB
   */
  @XmlElement(name = "DesiredPerformance", required = false)
  private TString desiredPerformance;

  /**
   * Get the actual impact a jamming mission had on a specific target area.
   * <p>
   * @return the ActualEffect value in a {@link TString} data type
   */
  public TString getActualEffect() {
    return actualEffect;
  }

  /**
   * Set the actual impact a jamming mission had on a specific target area.
   * <p>
   * @param value the ActualEffect value in a {@link TString} data type
   */
  public void setActualEffect(TString value) {
    this.actualEffect = value;
  }

  /**
   * Determine if the ActualEffect is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetActualEffect() {
    return (this.actualEffect != null ? this.actualEffect.isSetValue() : false);
  }

  /**
   * Get US:ActualPerformance (US) - The assessed effectiveness of the service
   * request.
   * <p>
   * @return the ActualPerformance value in a {@link TString} data type
   */
  public TString getActualPerformance() {
    return actualPerformance;
  }

  /**
   * Set US:ActualPerformance (US) - The assessed effectiveness of the service
   * request.
   * <p>
   * @param value the ActualPerformance value in a {@link TString} data type
   */
  public void setActualPerformance(TString value) {
    this.actualPerformance = value;
  }

  /**
   * Determine if the ActualPerformance is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetActualPerformance() {
    return (this.actualPerformance != null ? this.actualPerformance.isSetValue() : false);
  }

  /**
   * Get if effectiveness data should be provided continually or just once.
   * <p>
   * @return the ContinuousUpdate value in a {@link TString} data type
   */
  public TString getContinuousUpdate() {
    return continuousUpdate;
  }

  /**
   * Set if effectiveness data should be provided continually or just once.
   * <p>
   * @param value the ContinuousUpdate value in a {@link TString} data type
   */
  public void setContinuousUpdate(TString value) {
    this.continuousUpdate = value;
  }

  /**
   * Determine if the ContinuousUpdate is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetContinuousUpdate() {
    return (this.continuousUpdate != null ? this.continuousUpdate.isSetValue() : false);
  }

  /**
   * Get the expected impact a jamming mission will have on a specific target
   * area.
   * <p>
   * @return the DesiredEffect value in a {@link TString} data type
   */
  public TString getDesiredEffect() {
    return desiredEffect;
  }

  /**
   * Set the expected impact a jamming mission will have on a specific target
   * area.
   * <p>
   * @param value the DesiredEffect value in a {@link TString} data type
   */
  public void setDesiredEffect(TString value) {
    this.desiredEffect = value;
  }

  /**
   * Determine if the DesiredEffect is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDesiredEffect() {
    return (this.desiredEffect != null ? this.desiredEffect.isSetValue() : false);
  }

  /**
   * Get the desired effectiveness of the service request. Example: the minimum
   * percentage of known enemy command and control nodes that must be rendered
   * inoperable for successful mission accomplishment.
   * <p>
   * @return the DesiredPerformance value in a {@link TString} data type
   */
  public TString getDesiredPerformance() {
    return desiredPerformance;
  }

  /**
   * Set the desired effectiveness of the service request. Example: the minimum
   * percentage of known enemy command and control nodes that must be rendered
   * inoperable for successful mission accomplishment.
   * <p>
   * @param value the DesiredPerformance value in a {@link TString} data type
   */
  public void setDesiredPerformance(TString value) {
    this.desiredPerformance = value;
  }

  /**
   * Determine if the DesiredPerformance is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDesiredPerformance() {
    return (this.desiredPerformance != null ? this.desiredPerformance.isSetValue() : false);
  }

  /**
   * Set the actual impact a jamming mission had on a specific target area.
   * <p>
   * @param value An instances of type {@link ListUWA}
   * @return The current JammingPerformance object instance
   */
  public JammingPerformance withActualEffect(ListUWA value) {
    setActualEffect(new TString(value.value()));
    return this;
  }

  /**
   * Set US:ActualPerformance (US) - The assessed effectiveness of the service
   * request.
   * <p>
   * @param value An instances of type {@link ListUWB}
   * @return The current JammingPerformance object instance
   */
  public JammingPerformance withActualPerformance(ListUWB value) {
    setActualPerformance(new TString(value.value()));
    return this;
  }

  /**
   * Set if effectiveness data should be provided continually or just once.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current JammingPerformance object instance
   */
  public JammingPerformance withContinuousUpdate(ListCBO value) {
    setContinuousUpdate(new TString(value.value()));
    return this;
  }

  /**
   * Set the expected impact a jamming mission will have on a specific target
   * area.
   * <p>
   * @param value An instances of type {@link ListUWA}
   * @return The current JammingPerformance object instance
   */
  public JammingPerformance withDesiredEffect(ListUWA value) {
    setDesiredEffect(new TString(value.value()));
    return this;
  }

  /**
   * Set the desired effectiveness of the service request. Example: the minimum
   * percentage of known enemy command and control nodes that must be rendered
   * inoperable for successful mission accomplishment.
   * <p>
   * @param value An instances of type {@link ListUWB}
   * @return The current JammingPerformance object instance
   */
  public JammingPerformance withDesiredPerformance(ListUWB value) {
    setDesiredPerformance(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this JammingPerformance instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "JammingPerformance {"
      + (continuousUpdate != null ? " continuousUpdate [" + continuousUpdate + "]" : "")
      + (desiredPerformance != null ? " desiredPerformance [" + desiredPerformance + "]" : "")
      + (actualEffect != null ? " actualEffect [" + actualEffect + "]" : "")
      + (desiredEffect != null ? " desiredEffect [" + desiredEffect + "]" : "")
      + (actualPerformance != null ? " actualPerformance [" + actualPerformance + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JammingPerformance} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
