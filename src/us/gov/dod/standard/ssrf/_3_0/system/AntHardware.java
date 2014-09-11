/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
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
package us.gov.dod.standard.ssrf._3_0.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * Java class for AntHardware complex type.
 * <p>
 * This element contains the physical parameters related to the antenna feed and
 * lead.
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
   * FeedType: Use one of the codes describing the element used to "illuminate"
   * the reflector for an antenna unit.
   * <p>
   * Recommend values from Code List CAF
   */
  @XmlElement(name = "FeedType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString feedType;
  /**
   * LeadType: Use one of the codes the device used for conducting or guiding
   * the radio-frequency energy from the transmitter or receiver to the antenna
   * (e.g., continuous waveguide).
   * <p>
   * Recommend values from Code List CAL
   */
  @XmlElement(name = "LeadType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString leadType;
  /**
   * ConnectorType: Enter the type of connector used to attach the antenna to
   * the equipment or the antenna to the transmission media that attaches the
   * equipment to the antenna.
   * <p>
   * Recommend values from Code List CCN
   */
  @XmlElement(name = "ConnectorType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString connectorType;
  /**
   * FeedOrientation: Enter the orientation of the feed when looking in the
   * direction of the boresight.
   * <p>
   * Examples of orientations are right, left, center, up, down, up-left,
   * up-right, down-left, down-right.
   */
  @XmlElement(name = "FeedOrientation", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString feedOrientation;

  /**
   * Gets the value of the feedType property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getFeedType() {
    return feedType;
  }

  /**
   * Sets the value of the feedType property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setFeedType(TString value) {
    this.feedType = value;
  }

  public boolean isSetFeedType() {
    return (this.feedType != null);
  }

  /**
   * Gets the value of the leadType property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getLeadType() {
    return leadType;
  }

  /**
   * Sets the value of the leadType property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setLeadType(TString value) {
    this.leadType = value;
  }

  public boolean isSetLeadType() {
    return (this.leadType != null);
  }

  /**
   * Gets the value of the connectorType property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getConnectorType() {
    return connectorType;
  }

  /**
   * Sets the value of the connectorType property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setConnectorType(TString value) {
    this.connectorType = value;
  }

  public boolean isSetConnectorType() {
    return (this.connectorType != null);
  }

  /**
   * Gets the value of the feedOrientation property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getFeedOrientation() {
    return feedOrientation;
  }

  /**
   * Sets the value of the feedOrientation property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setFeedOrientation(TString value) {
    this.feedOrientation = value;
  }

  public boolean isSetFeedOrientation() {
    return (this.feedOrientation != null);
  }

  public AntHardware withFeedType(String value) {
    setFeedType(new TString(value));
    return this;
  }

  public AntHardware withLeadType(String value) {
    setLeadType(new TString(value));
    return this;
  }

  public AntHardware withConnectorType(String value) {
    setConnectorType(new TString(value));
    return this;
  }

  public AntHardware withFeedOrientation(String value) {
    setFeedOrientation(new TString(value));
    return this;
  }

}
