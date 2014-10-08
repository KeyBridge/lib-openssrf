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
package us.gov.dod.standard.ssrf._3_1.antenna;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.Antenna;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAF;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCN;

/**
 * AntHardware contains the physical parameters related to the antenna feed and
 * lead.
 * <p>
 * Element of {@link Antenna}
 * <p>
 * Example:
 * <pre>
 * &lt;Ant Hardware&gt;
 *   &lt;ConnectorType  cls="U"&gt;Neill-Concelman Threaded&lt;/ConnectorType &gt;
 *   &lt;FeedOrientation  cls="U"&gt;down-right&lt;/FeedOrientation &gt;
 *   &lt;FeedType  cls="U"&gt;Eight Feed Horn Cluster&lt;/FeedType &gt;
 *   &lt;LeadType  cls="U"&gt;Waveguide Semirigid&lt;/LeadType &gt;
 * &lt;/Ant Hardware&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntHardware", propOrder = {
  "feedType",
  "leadType",
  "connectorType",
  "feedOrientation"
})
public class AntHardware {

  /**
   * FeedType - Antenna Feed Type (Optional)
   * <p>
   * The element used to "illuminate" the reflector for an antenna unit.
   * <p>
   * Format is L:CAF
   */
  @XmlElement(name = "FeedType", required = false)
  private TString feedType;
  /**
   * LeadType - Antenna Lead Type (Optional)
   * <p>
   * The type of device used for conducting or guiding the radio-frequency
   * energy from the transmitter or receiver to the antenna (e.g., continuous
   * waveguide).
   * <p>
   * Format is L:CAL
   */
  @XmlElement(name = "LeadType", required = false)
  private TString leadType;
  /**
   * ConnectorType - Antenna Connector Type (Optional)
   * <p>
   * The type of connector used to attach the antenna to the equipment or the
   * antenna to the transmission media that attaches the equipment to the
   * antenna.
   * <p>
   * Format is L:CCN
   */
  @XmlElement(name = "ConnectorType", required = false)
  private TString connectorType;
  /**
   * FeedOrientation - Antenna Feed Orientation (Optional)
   * <p>
   * The orientation of the feed when looking in the direction of the boresight.
   * Examples of orientations are right, left, center, up, down, up-left,
   * up-right, down-left, down-right.
   * <p>
   * Format is S10
   */
  @XmlElement(name = "FeedOrientation", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS10.class)
  private TString feedOrientation;

  /**
   * Get the element used to "illuminate" the reflector for an antenna unit.
   * <p>
   * @return the FeedType value in a {@link TString} data type
   */
  public TString getFeedType() {
    return feedType;
  }

  /**
   * Set the element used to "illuminate" the reflector for an antenna unit.
   * <p>
   * @param value the FeedType value in a {@link TString} data type
   */
  public void setFeedType(TString value) {
    this.feedType = value;
  }

  /**
   * Determine if the FeedType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFeedType() {
    return (this.feedType != null ? this.feedType.isSetValue() : false);
  }

  /**
   * Get the type of device used for conducting or guiding the radio-frequency
   * energy from the transmitter or receiver to the antenna (e.g., continuous
   * waveguide).
   * <p>
   * @return the LeadType value in a {@link TString} data type
   */
  public TString getLeadType() {
    return leadType;
  }

  /**
   * Set the type of device used for conducting or guiding the radio-frequency
   * energy from the transmitter or receiver to the antenna (e.g., continuous
   * waveguide).
   * <p>
   * @param value the LeadType value in a {@link TString} data type
   */
  public void setLeadType(TString value) {
    this.leadType = value;
  }

  /**
   * Determine if the LeadType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLeadType() {
    return (this.leadType != null ? this.leadType.isSetValue() : false);
  }

  /**
   * Get the type of connector used to attach the antenna to the equipment or
   * the antenna to the transmission media that attaches the equipment to the
   * antenna.
   * <p>
   * @return the ConnectorType value in a {@link TString} data type
   */
  public TString getConnectorType() {
    return connectorType;
  }

  /**
   * Set the type of connector used to attach the antenna to the equipment or
   * the antenna to the transmission media that attaches the equipment to the
   * antenna.
   * <p>
   * @param value the ConnectorType value in a {@link TString} data type
   */
  public void setConnectorType(TString value) {
    this.connectorType = value;
  }

  /**
   * Determine if the ConnectorType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConnectorType() {
    return (this.connectorType != null ? this.connectorType.isSetValue() : false);
  }

  /**
   * Get the orientation of the feed when looking in the direction of the
   * boresight. Examples of orientations are right, left, center, up, down,
   * up-left, up-right, down-left, down-right.
   * <p>
   * @return the FeedOrientation value in a {@link TString} data type
   */
  public TString getFeedOrientation() {
    return feedOrientation;
  }

  /**
   * Set the orientation of the feed when looking in the direction of the
   * boresight. Examples of orientations are right, left, center, up, down,
   * up-left, up-right, down-left, down-right.
   * <p>
   * @param value the FeedOrientation value in a {@link TString} data type
   */
  public void setFeedOrientation(TString value) {
    this.feedOrientation = value;
  }

  /**
   * Determine if the FeedOrientation is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFeedOrientation() {
    return (this.feedOrientation != null ? this.feedOrientation.isSetValue() : false);
  }

  /**
   * Set the element used to "illuminate" the reflector for an antenna unit.
   * <p>
   * @param value An instances of type {@link ListCAF}
   * @return The current AntHardware object instance
   */
  public AntHardware withFeedType(ListCAF value) {
    setFeedType(new TString(value.value()));
    return this;
  }

  /**
   * Set the type of device used for conducting or guiding the radio-frequency
   * energy from the transmitter or receiver to the antenna (e.g., continuous
   * waveguide).
   * <p>
   * @param value An instances of type {@link ListCAL}
   * @return The current AntHardware object instance
   */
  public AntHardware withLeadType(ListCAL value) {
    setLeadType(new TString(value.value()));
    return this;
  }

  /**
   * Set the type of connector used to attach the antenna to the equipment or
   * the antenna to the transmission media that attaches the equipment to the
   * antenna.
   * <p>
   * @param value An instances of type {@link ListCCN}
   * @return The current AntHardware object instance
   */
  public AntHardware withConnectorType(ListCCN value) {
    setConnectorType(new TString(value.value()));
    return this;
  }

  /**
   * Set the orientation of the feed when looking in the direction of the
   * boresight. Examples of orientations are right, left, center, up, down,
   * up-left, up-right, down-left, down-right.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntHardware object instance
   */
  public AntHardware withFeedOrientation(String value) {
    setFeedOrientation(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this AntHardware instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AntHardware {"
      + (connectorType != null ? " connectorType [" + connectorType + "]" : "")
      + (feedType != null ? " feedType [" + feedType + "]" : "")
      + (leadType != null ? " leadType [" + leadType + "]" : "")
      + (feedOrientation != null ? " feedOrientation [" + feedOrientation + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntHardware} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
