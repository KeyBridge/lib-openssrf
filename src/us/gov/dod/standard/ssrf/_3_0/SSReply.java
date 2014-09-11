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
package us.gov.dod.standard.ssrf._3_0;

import us.gov.dod.standard.ssrf._3_0.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.lists.ListCAO;
import java.util.*;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;

/**
 * <p>
 * Java class for SSReply complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="SSReply"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common"> &lt;sequence> &lt;element
 * name="SSRequestRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial"
 * minOccurs="0"/> &lt;element name="ReplyingCountry"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCAO"/> &lt;element
 * name="SupportabilityCode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"/>
 * &lt;element name="DateReceivedByCountry"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/> &lt;element
 * name="EffectiveDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"/>
 * &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ExpireReview"
 * minOccurs="0"/> &lt;element name="ApprovalSPSNum"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS11" minOccurs="0"/> &lt;element
 * name="ERPNumber" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;element name="FASNumber"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/> &lt;element
 * name="IRACNumber" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;element name="ReplyingAuthority"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/> &lt;element
 * name="CommentSource" type="{urn:us:gov:dod:standard:ssrf:3.0.0}CommentSource"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="StageLocation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}StageLocation"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="Configuration"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Configuration"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;/sequence> &lt;/extension>
 * &lt;/complexContent> &lt;/complexType>
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
public class SSReply extends Common {

  @XmlElement(name = "SSRequestRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString ssRequestRef;
  @XmlElement(name = "ReplyingCountry", required = true)
  private TString replyingCountry;
  @XmlElement(name = "SupportabilityCode", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString supportabilityCode;
  @XmlElement(name = "DateReceivedByCountry", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar dateReceivedByCountry;
  @XmlElement(name = "EffectiveDate", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  @XmlElement(name = "ApprovalSPSNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS11.class)
  private TString approvalSPSNum;
  @XmlElement(name = "ERPNumber", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString erpNumber;
  @XmlElement(name = "FASNumber", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString fasNumber;
  @XmlElement(name = "IRACNumber", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString iracNumber;
  @XmlElement(name = "ReplyingAuthority", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString replyingAuthority;
  @XmlElement(name = "CommentSource")
  private List<CommentSource> commentSource;
  @XmlElement(name = "StageLocation")
  private List<StageLocation> stageLocation;
  @XmlElement(name = "Configuration")
  private List<Configuration> configuration;

  /**
   * Gets the value of the ssRequestRef property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public TString getSSRequestRef() {
    return ssRequestRef;
  }

  /**
   * Sets the value of the ssRequestRef property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setSSRequestRef(TString value) {
    this.ssRequestRef = value;
  }

  public boolean isSetSSRequestRef() {
    return (this.ssRequestRef != null);
  }

  /**
   * Gets the value of the replyingCountry property.
   * <p>
   * @return possible object is {@link TListCAO }
   * <p>
   */
  public TString getReplyingCountry() {
    return replyingCountry;
  }

  /**
   * Sets the value of the replyingCountry property.
   * <p>
   * @param value allowed object is {@link TListCAO }
   * <p>
   */
  public void setReplyingCountry(TString value) {
    this.replyingCountry = value;
  }

  public boolean isSetReplyingCountry() {
    return (this.replyingCountry != null);
  }

  /**
   * Gets the value of the supportabilityCode property.
   * <p>
   * @return possible object is {@link TS50 }
   * <p>
   */
  public TString getSupportabilityCode() {
    return supportabilityCode;
  }

  /**
   * Sets the value of the supportabilityCode property.
   * <p>
   * @param value allowed object is {@link TS50 }
   * <p>
   */
  public void setSupportabilityCode(TString value) {
    this.supportabilityCode = value;
  }

  public boolean isSetSupportabilityCode() {
    return (this.supportabilityCode != null);
  }

  /**
   * Gets the value of the dateReceivedByCountry property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public TCalendar getDateReceivedByCountry() {
    return dateReceivedByCountry;
  }

  /**
   * Sets the value of the dateReceivedByCountry property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setDateReceivedByCountry(TCalendar value) {
    this.dateReceivedByCountry = value;
  }

  public boolean isSetDateReceivedByCountry() {
    return (this.dateReceivedByCountry != null);
  }

  /**
   * Gets the value of the effectiveDate property.
   * <p>
   * @return possible object is {@link TD }
   * <p>
   */
  public TCalendar getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the effectiveDate property.
   * <p>
   * @param value allowed object is {@link TD }
   * <p>
   */
  public void setEffectiveDate(TCalendar value) {
    this.effectiveDate = value;
  }

  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null);
  }

  /**
   * Gets the value of the expirationDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public TCalendar getExpirationDate() {
    return expirationDate;
  }

  /**
   * Sets the value of the expirationDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setExpirationDate(TCalendar value) {
    this.expirationDate = value;
  }

  public boolean isSetExpirationDate() {
    return (this.expirationDate != null);
  }

  /**
   * Gets the value of the reviewDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Sets the value of the reviewDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setReviewDate(TCalendar value) {
    this.reviewDate = value;
  }

  public boolean isSetReviewDate() {
    return (this.reviewDate != null);
  }

  /**
   * Gets the value of the approvalSPSNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS11 }{@code >}
   * <p>
   */
  public TString getApprovalSPSNum() {
    return approvalSPSNum;
  }

  /**
   * Sets the value of the approvalSPSNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS11 }{@code >}
   * <p>
   */
  public void setApprovalSPSNum(TString value) {
    this.approvalSPSNum = value;
  }

  public boolean isSetApprovalSPSNum() {
    return (this.approvalSPSNum != null);
  }

  /**
   * Gets the value of the erpNumber property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public TString getERPNumber() {
    return erpNumber;
  }

  /**
   * Sets the value of the erpNumber property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setERPNumber(TString value) {
    this.erpNumber = value;
  }

  public boolean isSetERPNumber() {
    return (this.erpNumber != null);
  }

  /**
   * Gets the value of the fasNumber property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public TString getFASNumber() {
    return fasNumber;
  }

  /**
   * Sets the value of the fasNumber property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setFASNumber(TString value) {
    this.fasNumber = value;
  }

  public boolean isSetFASNumber() {
    return (this.fasNumber != null);
  }

  /**
   * Gets the value of the iracNumber property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public TString getIRACNumber() {
    return iracNumber;
  }

  /**
   * Sets the value of the iracNumber property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setIRACNumber(TString value) {
    this.iracNumber = value;
  }

  public boolean isSetIRACNumber() {
    return (this.iracNumber != null);
  }

  /**
   * Gets the value of the replyingAuthority property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public TString getReplyingAuthority() {
    return replyingAuthority;
  }

  /**
   * Sets the value of the replyingAuthority property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public void setReplyingAuthority(TString value) {
    this.replyingAuthority = value;
  }

  public boolean isSetReplyingAuthority() {
    return (this.replyingAuthority != null);
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
   * @return
   */
  public List<CommentSource> getCommentSource() {
    if (commentSource == null) {
      commentSource = new ArrayList<>();
    }
    return this.commentSource;
  }

  public boolean isSetCommentSource() {
    return ((this.commentSource != null) && (!this.commentSource.isEmpty()));
  }

  public void unsetCommentSource() {
    this.commentSource = null;
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
   * @return
   */
  public List<StageLocation> getStageLocation() {
    if (stageLocation == null) {
      stageLocation = new ArrayList<>();
    }
    return this.stageLocation;
  }

  public boolean isSetStageLocation() {
    return ((this.stageLocation != null) && (!this.stageLocation.isEmpty()));
  }

  public void unsetStageLocation() {
    this.stageLocation = null;
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
   * @return
   */
  public List<Configuration> getConfiguration() {
    if (configuration == null) {
      configuration = new ArrayList<>();
    }
    return this.configuration;
  }

  public boolean isSetConfiguration() {
    return ((this.configuration != null) && (!this.configuration.isEmpty()));
  }

  public void unsetConfiguration() {
    this.configuration = null;
  }

  public SSReply withSSRequestRef(String value) {
    setSSRequestRef(new TString(value));
    return this;
  }

  public SSReply withReplyingCountry(ListCAO value) {
    setReplyingCountry(new TString(value.value()));
    return this;
  }

  public SSReply withSupportabilityCode(String value) {
    setSupportabilityCode(new TString(value));
    return this;
  }

  public SSReply withDateReceivedByCountry(Calendar value) {
    setDateReceivedByCountry(new TCalendar(value));
    return this;
  }

  public SSReply withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  public SSReply withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  public SSReply withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  public SSReply withApprovalSPSNum(String value) {
    setApprovalSPSNum(new TString(value));
    return this;
  }

  public SSReply withERPNumber(String value) {
    setERPNumber(new TString(value));
    return this;
  }

  public SSReply withFASNumber(String value) {
    setFASNumber(new TString(value));
    return this;
  }

  public SSReply withIRACNumber(String value) {
    setIRACNumber(new TString(value));
    return this;
  }

  public SSReply withReplyingAuthority(String value) {
    setReplyingAuthority(new TString(value));
    return this;
  }

  public SSReply withCommentSource(CommentSource... values) {
    if (values != null) {
      getCommentSource().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSReply withCommentSource(Collection<CommentSource> values) {
    if (values != null) {
      getCommentSource().addAll(values);
    }
    return this;
  }

  public SSReply withStageLocation(StageLocation... values) {
    if (values != null) {
      getStageLocation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSReply withStageLocation(Collection<StageLocation> values) {
    if (values != null) {
      getStageLocation().addAll(values);
    }
    return this;
  }

  public SSReply withConfiguration(Configuration... values) {
    if (values != null) {
      getConfiguration().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSReply withConfiguration(Collection<Configuration> values) {
    if (values != null) {
      getConfiguration().addAll(values);
    }
    return this;
  }

}
