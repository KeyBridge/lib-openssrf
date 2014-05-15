/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
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
package us.gov.dod.standard.ssrf._3_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for SSReply complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="SSReply">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common">
 *       &lt;sequence>
 *         &lt;element name="SSRequestRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/>
 *         &lt;element name="ReplyingCountry" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCAO"/>
 *         &lt;element name="SupportabilityCode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"/>
 *         &lt;element name="DateReceivedByCountry" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ExpireReview" minOccurs="0"/>
 *         &lt;element name="ApprovalSPSNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS11" minOccurs="0"/>
 *         &lt;element name="ERPNumber" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="FASNumber" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="IRACNumber" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="ReplyingAuthority" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/>
 *         &lt;element name="CommentSource" type="{urn:us:gov:dod:standard:ssrf:3.0.0}CommentSource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StageLocation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}StageLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Configuration" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Configuration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSReply", propOrder = {
  "ssRequestRef",
  "replyingCountry",
  "supportabilityCode",
  "dateReceivedByCountry",
  "effectiveDate",
  "expirationDate",
  "reviewDate",
  "approvalSPSNum",
  "erpNumber",
  "fasNumber",
  "iracNumber",
  "replyingAuthority",
  "commentSource",
  "stageLocation",
  "configuration"
})
public class SSReply
  extends Common {

  @XmlElementRef(name = "SSRequestRef", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TSerial> ssRequestRef;
  @XmlElement(name = "ReplyingCountry", required = true)
  protected TListCAO replyingCountry;
  @XmlElement(name = "SupportabilityCode", required = true)
  protected TS50 supportabilityCode;
  @XmlElementRef(name = "DateReceivedByCountry", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> dateReceivedByCountry;
  @XmlElement(name = "EffectiveDate", required = true)
  protected TD effectiveDate;
  @XmlElementRef(name = "ExpirationDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> expirationDate;
  @XmlElementRef(name = "ReviewDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> reviewDate;
  @XmlElementRef(name = "ApprovalSPSNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS11> approvalSPSNum;
  @XmlElementRef(name = "ERPNumber", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> erpNumber;
  @XmlElementRef(name = "FASNumber", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> fasNumber;
  @XmlElementRef(name = "IRACNumber", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> iracNumber;
  @XmlElementRef(name = "ReplyingAuthority", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS100> replyingAuthority;
  @XmlElement(name = "CommentSource")
  protected List<CommentSource> commentSource;
  @XmlElement(name = "StageLocation")
  protected List<StageLocation> stageLocation;
  @XmlElement(name = "Configuration")
  protected List<Configuration> configuration;

  /**
   * Gets the value of the ssRequestRef property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public JAXBElement<TSerial> getSSRequestRef() {
    return ssRequestRef;
  }

  /**
   * Sets the value of the ssRequestRef property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setSSRequestRef(JAXBElement<TSerial> value) {
    this.ssRequestRef = value;
  }

  /**
   * Gets the value of the replyingCountry property.
   * <p>
   * @return possible object is {@link TListCAO }
   * <p>
   */
  public TListCAO getReplyingCountry() {
    return replyingCountry;
  }

  /**
   * Sets the value of the replyingCountry property.
   * <p>
   * @param value allowed object is {@link TListCAO }
   * <p>
   */
  public void setReplyingCountry(TListCAO value) {
    this.replyingCountry = value;
  }

  /**
   * Gets the value of the supportabilityCode property.
   * <p>
   * @return possible object is {@link TS50 }
   * <p>
   */
  public TS50 getSupportabilityCode() {
    return supportabilityCode;
  }

  /**
   * Sets the value of the supportabilityCode property.
   * <p>
   * @param value allowed object is {@link TS50 }
   * <p>
   */
  public void setSupportabilityCode(TS50 value) {
    this.supportabilityCode = value;
  }

  /**
   * Gets the value of the dateReceivedByCountry property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getDateReceivedByCountry() {
    return dateReceivedByCountry;
  }

  /**
   * Sets the value of the dateReceivedByCountry property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setDateReceivedByCountry(JAXBElement<TD> value) {
    this.dateReceivedByCountry = value;
  }

  /**
   * Gets the value of the effectiveDate property.
   * <p>
   * @return possible object is {@link TD }
   * <p>
   */
  public TD getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the effectiveDate property.
   * <p>
   * @param value allowed object is {@link TD }
   * <p>
   */
  public void setEffectiveDate(TD value) {
    this.effectiveDate = value;
  }

  /**
   * Gets the value of the expirationDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getExpirationDate() {
    return expirationDate;
  }

  /**
   * Sets the value of the expirationDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setExpirationDate(JAXBElement<TD> value) {
    this.expirationDate = value;
  }

  /**
   * Gets the value of the reviewDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getReviewDate() {
    return reviewDate;
  }

  /**
   * Sets the value of the reviewDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setReviewDate(JAXBElement<TD> value) {
    this.reviewDate = value;
  }

  /**
   * Gets the value of the approvalSPSNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS11 }{@code >}
   * <p>
   */
  public JAXBElement<TS11> getApprovalSPSNum() {
    return approvalSPSNum;
  }

  /**
   * Sets the value of the approvalSPSNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS11 }{@code >}
   * <p>
   */
  public void setApprovalSPSNum(JAXBElement<TS11> value) {
    this.approvalSPSNum = value;
  }

  /**
   * Gets the value of the erpNumber property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getERPNumber() {
    return erpNumber;
  }

  /**
   * Sets the value of the erpNumber property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setERPNumber(JAXBElement<TS50> value) {
    this.erpNumber = value;
  }

  /**
   * Gets the value of the fasNumber property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getFASNumber() {
    return fasNumber;
  }

  /**
   * Sets the value of the fasNumber property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setFASNumber(JAXBElement<TS50> value) {
    this.fasNumber = value;
  }

  /**
   * Gets the value of the iracNumber property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getIRACNumber() {
    return iracNumber;
  }

  /**
   * Sets the value of the iracNumber property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setIRACNumber(JAXBElement<TS50> value) {
    this.iracNumber = value;
  }

  /**
   * Gets the value of the replyingAuthority property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public JAXBElement<TS100> getReplyingAuthority() {
    return replyingAuthority;
  }

  /**
   * Sets the value of the replyingAuthority property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public void setReplyingAuthority(JAXBElement<TS100> value) {
    this.replyingAuthority = value;
  }

  /**
   * Gets the value of the commentSource property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the commentSource property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCommentSource().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link CommentSource }
   * <p>
   * <p>
   */
  public List<CommentSource> getCommentSource() {
    if (commentSource == null) {
      commentSource = new ArrayList<>();
    }
    return this.commentSource;
  }

  /**
   * Gets the value of the stageLocation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the stageLocation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStageLocation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link StageLocation }
   * <p>
   * <p>
   */
  public List<StageLocation> getStageLocation() {
    if (stageLocation == null) {
      stageLocation = new ArrayList<>();
    }
    return this.stageLocation;
  }

  /**
   * Gets the value of the configuration property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the configuration property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getConfiguration().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link Configuration }
   * <p>
   * <p>
   */
  public List<Configuration> getConfiguration() {
    if (configuration == null) {
      configuration = new ArrayList<>();
    }
    return this.configuration;
  }

}
