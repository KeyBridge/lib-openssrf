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
package us.gov.dod.standard.ssrf._3_1.multiple;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.Antenna;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * TxAntModeRef contains references to the Antenna and its AntMode, used to
 * construct a Transmitter Configuration.
 * <p>
 * Element of {@link TxRef}
 * <p>
 * Example:
 * <pre>
 * &lt;TxAntModeRef&gt;
 *   &lt;Serial cls="U"&gt;USA:NTIA:AN:123&lt;/Serial&gt;
 *   &lt;ModeID cls="U"&gt;TRACKING&lt;/ModeID&gt;
 *   &lt;SpectralPowerDensity cls="U"&gt;15&lt;/SpectralPowerDensity&gt;
 * &lt;/TxAntModeRef&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxAntModeRef", propOrder = {
  "spectralPowerDensity"
})
public class TxAntModeRef extends RxAntModeRef {

  /**
   * SpectralPowerDensity - Spectral Power Density (Optional)
   * <p>
   * The maximum spectral power density supplied to the input of the antenna.
   * <p>
   * Format is SN(6,3) (dBW/Hz)
   */
  @XmlElement(name = "SpectralPowerDensity", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBWHZ.class)
  private TDecimal spectralPowerDensity;

  /**
   * Get the maximum spectral power density supplied to the input of the
   * antenna.
   * <p>
   * @return the SpectralPowerDensity value in a {@link TDecimal} data type
   */
  public TDecimal getSpectralPowerDensity() {
    return spectralPowerDensity;
  }

  /**
   * Set the maximum spectral power density supplied to the input of the
   * antenna.
   * <p>
   * @param value the SpectralPowerDensity value in a {@link TDecimal} data type
   */
  public void setSpectralPowerDensity(TDecimal value) {
    this.spectralPowerDensity = value;
  }

  /**
   * Determine if the SpectralPowerDensity is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSpectralPowerDensity() {
    return (this.spectralPowerDensity != null ? this.spectralPowerDensity.isSetValue() : false);
  }

  /**
   * Set the maximum spectral power density supplied to the input of the
   * antenna.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxAntModeRef object instance
   */
  public TxAntModeRef withSpectralPowerDensity(Double value) {
    setSpectralPowerDensity(new TDecimal(value));
    return this;
  }

  /**
   * Set the unique name of an AntMode of the Antenna specified in the
   * corresponding Serial field. This antenna mode is grouped with the receiver
   * modes specified in RxModeRef.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxAntModeRef object instance
   */
  @Override
  public TxAntModeRef withModeID(String value) {
    super.withModeID(value);
    return this;
  }

  /**
   * Set the loss that occurs when energy is transferred between the
   * transmitter/receiver and the antenna.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxAntModeRef object instance
   */
  @Override
  public TxAntModeRef withCouplingLoss(Double value) {
    super.withCouplingLoss(value);
    return this;
  }

  /**
   * Set the reference to an Antenna in this configuration. This antenna is
   * associated with the receiver specified in the Serial field of the parent
   * RxRef element.
   * <p>
   * @param value An instances of type {@link Antenna}
   * @return The current RxAntModeRef object instance
   * @since 3.1.0
   */
  @Override
  public TxAntModeRef withAntenna(Antenna value) {
    super.withAntenna(value);
    return this;
  }

  /**
   * Get a string representation of this TxAntModeRef instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TxAntModeRef {"
      + super.toString()
      + (spectralPowerDensity != null ? " spectralPowerDensity [" + spectralPowerDensity + "]" : "")
      + "}";
  }

}
