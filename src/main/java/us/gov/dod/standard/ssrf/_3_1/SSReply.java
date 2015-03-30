package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCD;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.ssreply.CommentSource;
import us.gov.dod.standard.ssrf._3_1.ssreply.StageLocation;

/**
 * SSReply is the XML root for all parameters of a Host Nation Declaration of
 * Spectrum Supportability. It inherits attributes and sub-elements from element
 * Common.
 * <p>
 * Sub-Elements are
 * {@link CommentSource}, {@link Configuration}, {@link StageLocation}
 * <p>
 * Example:
 * <pre>
 * &lt;SSReply cls="U"&gt;
 *   &lt;Serial cls="U"&gt;FRA::HD:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2012-02-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;SSRequestRef cls="U"&gt;USA::SR:123&lt;/SSRequestRef&gt;
 *   &lt;ReplyingCountry cls="U"&gt;FRA&lt;/ReplyingCountry&gt;
 *   &lt;SupportabilityCode cls="U"&gt;Supported with Restrictions&lt;/SupportabilityCode&gt;
 *   &lt;EffectiveDate cls="U"&gt;2012-02-25&lt;/EffectiveDate&gt;
 *   &lt;CommentSource&gt;
 *     &lt;Source cls="U"&gt;CAA&lt;/Source&gt;
 *     &lt;Comment idx="1" cls="U"&gt;IAW frequency clearance agreement FR MoD/FR CAA.&lt;/
 *     Comment&gt;
 *   &lt;/CommentSource&gt;
 * &lt;/SSReply&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
  "distributionGroups",
  "coordinationNum",
  "commentSource",
  "stageLocation",
  "configuration"
})
public class SSReply extends Common<SSReply> {

  /**
   * SSRequestRef - SSRequest Serial (Optional)    * <p>
   * The dataset identifier of the SSRequest being replied to.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SSRequestRef", required = false)
  private Serial ssRequestRef;
  /**
   * ReplyingCountry - Replying Country (Required)    * <p>
   * The code of the country providing the reply.
   * <p>
   * Format is L:CAO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ReplyingCountry", required = true)
  private TString replyingCountry;
  /**
   * SupportabilityCode - Supportability Code (Required)    * <p>
   * The overall result of the national analysis. - If replying "Supported with
   * Restrictions", use Comments for general restrictions only. Specific
   * restrictions on authorised/excluded location should be expressed using the
   * LocationRef. Specific restrictions on tuning ranges and power limits should
   * be expressed using the Configuration. - If replying "Supported with
   * Recommendations", use Comments to express these recommendations.
   * <p>
   * Format is L:CCD
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SupportabilityCode", required = true)
  private TString supportabilityCode;
  /**
   * DateReceivedByCountry - Date Request Received By Country (Optional)    * <p>
   * The date the request was received by the Host Nation Administration.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DateReceivedByCountry", required = false)
  private D dateReceivedByCountry;
  /**
   * EffectiveDate - Effective Date (Required)    * <p>
   * The date by which the dataset is to be operational or effective.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EffectiveDate", required = true)
  private D effectiveDate;
  /**
   * ExpirationDate - Expiration Date (Optional)    * <p>
   * The date at which the dataset will expire. The Expiration date should be
   * less than five years from current date.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReview (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ExpirationDate", required = false)
  private D expirationDate;
  /**
   * ReviewDate - Review Date (Optional)    * <p>
   * The date by which the dataset is to be reviewed. The Review date should be
   * less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReview (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ReviewDate", required = false)
  private D reviewDate;
  /**
   * US:ApprovalSPSNum - Approval SPS Number (Optional)    * <p>
   * The Certification of Spectrum Support Spectrum Planning Subcommittee (SPS)
   * document identifier assigned by NTIA. This is not the same as the
   * application SPS number.
   * <p>
   * Format is S11
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ApprovalSPSNum", required = false)
  private S11 approvalSPSNum;
  /**
   * US:ERPNumber - ERP Number (Optional)    * <p>
   * The Emergency Readiness Plan (ERP) Number. Certification applications are
   * assigned an ERP Number by the Emergency Planning Subcommittee (EPS) of the
   * Interdepartment Radio Advisory Committee (IRAC) if the system involves
   * national security and emergency preparedness (NSEP).
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ERPNumber", required = false)
  private S50 erpNumber;
  /**
   * US:FASNumber - FAS Number (Optional)    * <p>
   * The Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment
   * Subcommittee (FAS) identifier assigned by NTIA.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FASNumber", required = false)
  private S50 fasNumber;
  /**
   * US:IRACNumber - IRAC Number (Optional)    * <p>
   * The Interdepartment Radio Advisory Committee (IRAC) document number of the
   * NTIA Certification of Spectrum Support document. This number is assigned by
   * NTIA.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "IRACNumber", required = false)
  private S50 iracNumber;
  /**
   * US:ReplyingAuthority - Replying Authority (Optional)    * <p>
   * The name of the organization providing the reply.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ReplyingAuthority", required = false)
  private S100 replyingAuthority;
  /**
   * In Data Item DistributionGroups (US), identify to whom the signed
   * certification should be distributed (e.g., "J-12 Holders").
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DistributionGroups", required = false)
  private S20 distributionGroups;
  /**
   * US:CoordinationNum - Coordination Number (Optional)    * <p>
   * The US Military Communications-Electronics Board (MCEB) identifier assigned
   * to the equipment or system. (e.g., J/F 12/12345). An SSRequest coordination
   * number usually ends with an even digit (e.g., /2, /4), while an SSReply
   * coordination number usually ends with an odd digit (e.g., /3, /5). When
   * certifying equipment, both SSRequest and SSReply SHOULD have a coordination
   * number.
   * <p>
   * Format is S15
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CoordinationNum", required = false)
  private S15 coordinationNum;
  /**
   * CommentSource (Optional)
   * <p>
   * CommentSource is used to provide comments to a SSRequest. It can also be
   * used to certify supportability.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CommentSource")
  private Set<CommentSource> commentSource;
  /**
   * StageLocation (Optional)
   * <p>
   * StageLocation defines locations where the equipment or system is allowed or
   * forbidden from use.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StageLocation")
  private Set<StageLocation> stageLocation;
  /**
   * Configuration (Optional)
   * <p>
   * Configuration identifies each operational configuration that is required in
   * a SSRequest, granted by a Host Nation in a SSReply, or authorised in a
   * frequency Assignment or Allotment dataset. It also identifies the
   * functional use of the assigned frequency at a particular transmitting
   * station. Finally, it may indicate if the receiver station is used primarily
   * as a repeater. A direct coupling between the station's receiver and the
   * station's transmitter allows the incoming signal to be retransmitted
   * exactly as received.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Configuration")
  private Set<Configuration> configuration;

  /**
   * Get the dataset identifier of the SSRequest being replied to..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   */
  public Serial getSSRequestRef() {
    return ssRequestRef;
  }

  /**
   * Set the dataset identifier of the SSRequest being replied to..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   */
  public void setSSRequestRef(Serial value) {
    this.ssRequestRef = value;
  }

  /**
   * Determine if the SSRequestRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSSRequestRef() {
    return (this.ssRequestRef != null ? this.ssRequestRef.isSetValue() : false);
  }

  /**
   * Get the code of the country providing the reply..
   * <p>
   * @return the ReplyingCountry value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getReplyingCountry() {
    return replyingCountry;
  }

  /**
   * Set the code of the country providing the reply..
   * <p>
   * @param value the ReplyingCountry value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setReplyingCountry(TString value) {
    this.replyingCountry = value;
  }

  /**
   * Determine if the ReplyingCountry is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReplyingCountry() {
    return (this.replyingCountry != null ? this.replyingCountry.isSetValue() : false);
  }

  /**
   * Get the overall result of the national analysis. - If replying "Supported
   * with Restrictions", use Comments for general restrictions only. Specific
   * restrictions on authorised/excluded location should be expressed using the
   * LocationRef. Specific restrictions on tuning ranges and power limits should
   * be expressed using the Configuration. - If replying "Supported with
   * Recommendations", use Comments to express these recommendations..
   * <p>
   * @return the SupportabilityCode value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSupportabilityCode() {
    return supportabilityCode;
  }

  /**
   * Set the overall result of the national analysis. - If replying "Supported
   * with Restrictions", use Comments for general restrictions only. Specific
   * restrictions on authorised/excluded location should be expressed using the
   * LocationRef. Specific restrictions on tuning ranges and power limits should
   * be expressed using the Configuration. - If replying "Supported with
   * Recommendations", use Comments to express these recommendations..
   * <p>
   * @param value the SupportabilityCode value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSupportabilityCode(TString value) {
    this.supportabilityCode = value;
  }

  /**
   * Determine if the SupportabilityCode is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSupportabilityCode() {
    return (this.supportabilityCode != null ? this.supportabilityCode.isSetValue() : false);
  }

  /**
   * Get the date the request was received by the Host Nation Administration..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getDateReceivedByCountry() {
    return dateReceivedByCountry;
  }

  /**
   * Set the date the request was received by the Host Nation Administration..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setDateReceivedByCountry(D value) {
    this.dateReceivedByCountry = value;
  }

  /**
   * Determine if the DateReceivedByCountry is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDateReceivedByCountry() {
    return (this.dateReceivedByCountry != null ? this.dateReceivedByCountry.isSetValue() : false);
  }

  /**
   * Get the date by which the dataset is to be operational or effective..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Set the date by which the dataset is to be operational or effective..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setEffectiveDate(D value) {
    this.effectiveDate = value;
  }

  /**
   * Determine if the EffectiveDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null ? this.effectiveDate.isSetValue() : false);
  }

  /**
   * Get the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getExpirationDate() {
    return expirationDate;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setExpirationDate(D value) {
    this.expirationDate = value;
  }

  /**
   * Determine if the ExpirationDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExpirationDate() {
    return (this.expirationDate != null ? this.expirationDate.isSetValue() : false);
  }

  /**
   * Get the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getReviewDate() {
    return reviewDate;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setReviewDate(D value) {
    this.reviewDate = value;
  }

  /**
   * Determine if the ReviewDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReviewDate() {
    return (this.reviewDate != null ? this.reviewDate.isSetValue() : false);
  }

  /**
   * Get the Certification of Spectrum Support Spectrum Planning Subcommittee
   * (SPS) document identifier assigned by NTIA. This is not the same as the
   * application SPS number..
   * <p>
   * @return a {@link S11} instance
   * @since 3.1.0
   */
  public S11 getApprovalSPSNum() {
    return approvalSPSNum;
  }

  /**
   * Set the Certification of Spectrum Support Spectrum Planning Subcommittee
   * (SPS) document identifier assigned by NTIA. This is not the same as the
   * application SPS number..
   * <p>
   * @param value a {@link S11} instance
   * @since 3.1.0
   */
  public void setApprovalSPSNum(S11 value) {
    this.approvalSPSNum = value;
  }

  /**
   * Determine if the ApprovalSPSNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetApprovalSPSNum() {
    return (this.approvalSPSNum != null ? this.approvalSPSNum.isSetValue() : false);
  }

  /**
   * Get the Emergency Readiness Plan (ERP) Number. Certification applications
   * are assigned an ERP Number by the Emergency Planning Subcommittee (EPS) of
   * the Interdepartment Radio Advisory Committee (IRAC) if the system involves
   * national security and emergency preparedness (NSEP)..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getERPNumber() {
    return erpNumber;
  }

  /**
   * Set the Emergency Readiness Plan (ERP) Number. Certification applications
   * are assigned an ERP Number by the Emergency Planning Subcommittee (EPS) of
   * the Interdepartment Radio Advisory Committee (IRAC) if the system involves
   * national security and emergency preparedness (NSEP)..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setERPNumber(S50 value) {
    this.erpNumber = value;
  }

  /**
   * Determine if the ERPNumber is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPNumber() {
    return (this.erpNumber != null ? this.erpNumber.isSetValue() : false);
  }

  /**
   * Get the Interdepartment Radio Advisory Committee (IRAC) Frequency
   * Assignment Subcommittee (FAS) identifier assigned by NTIA..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getFASNumber() {
    return fasNumber;
  }

  /**
   * Set the Interdepartment Radio Advisory Committee (IRAC) Frequency
   * Assignment Subcommittee (FAS) identifier assigned by NTIA..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setFASNumber(S50 value) {
    this.fasNumber = value;
  }

  /**
   * Determine if the FASNumber is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFASNumber() {
    return (this.fasNumber != null ? this.fasNumber.isSetValue() : false);
  }

  /**
   * Get the Interdepartment Radio Advisory Committee (IRAC) document number of
   * the NTIA Certification of Spectrum Support document. This number is
   * assigned by NTIA..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getIRACNumber() {
    return iracNumber;
  }

  /**
   * Set the Interdepartment Radio Advisory Committee (IRAC) document number of
   * the NTIA Certification of Spectrum Support document. This number is
   * assigned by NTIA..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setIRACNumber(S50 value) {
    this.iracNumber = value;
  }

  /**
   * Determine if the IRACNumber is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIRACNumber() {
    return (this.iracNumber != null ? this.iracNumber.isSetValue() : false);
  }

  /**
   * Get the name of the organization providing the reply..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getReplyingAuthority() {
    return replyingAuthority;
  }

  /**
   * Set the name of the organization providing the reply..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setReplyingAuthority(S100 value) {
    this.replyingAuthority = value;
  }

  /**
   * Determine if the ReplyingAuthority is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReplyingAuthority() {
    return (this.replyingAuthority != null ? this.replyingAuthority.isSetValue() : false);
  }

  /**
   * Get In Data Item DistributionGroups (US), identify to whom the signed
   * certification should be distributed (e.g., "J-12 Holders")..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getDistributionGroups() {
    return distributionGroups;
  }

  /**
   * Set In Data Item DistributionGroups (US), identify to whom the signed
   * certification should be distributed (e.g., "J-12 Holders")..
   * <p>
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setDistributionGroups(S20 value) {
    this.distributionGroups = value;
  }

  /**
   * Determine if the DistributionGroups is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDistributionGroups() {
    return (this.distributionGroups != null ? this.distributionGroups.isSetValue() : false);
  }

  /**
   * Get the US Military Communications-Electronics Board (MCEB) identifier
   * assigned to the equipment or system. (e.g., J/F 12/12345). An SSRequest
   * coordination number usually ends with an even digit (e.g., /2, /4), while
   * an SSReply coordination number usually ends with an odd digit (e.g., /3,
   * /5). When certifying equipment, both SSRequest and SSReply SHOULD have a
   * coordination number..
   * <p>
   * @return a {@link S15} instance
   * @since 3.1.0
   */
  public S15 getCoordinationNum() {
    return coordinationNum;
  }

  /**
   * Set the US Military Communications-Electronics Board (MCEB) identifier
   * assigned to the equipment or system. (e.g., J/F 12/12345). An SSRequest
   * coordination number usually ends with an even digit (e.g., /2, /4), while
   * an SSReply coordination number usually ends with an odd digit (e.g., /3,
   * /5). When certifying equipment, both SSRequest and SSReply SHOULD have a
   * coordination number..
   * <p>
   * @param value a {@link S15} instance
   * @since 3.1.0
   */
  public void setCoordinationNum(S15 value) {
    this.coordinationNum = value;
  }

  /**
   * Determine if the CoordinationNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCoordinationNum() {
    return (this.coordinationNum != null ? this.coordinationNum.isSetValue() : false);
  }

  /**
   * Get the CommentSource
   * <p>
   * Complex element CommentSource is used to provide comments to a SSRequest.
   * It can also be used to certify supportability..
   * <p>
   * @return a {@link CommentSource} instance
   * @since 3.1.0
   */
  public Set<CommentSource> getCommentSource() {
    if (commentSource == null) {
      commentSource = new HashSet<>();
    }
    return this.commentSource;
  }

  /**
   * Determine if the CommentSource is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCommentSource() {
    return ((this.commentSource != null) && (!this.commentSource.isEmpty()));
  }

  /**
   * Clear the CommentSource field. This sets the field to null.
   */
  public void unsetCommentSource() {
    this.commentSource = null;
  }

  /**
   * Get the StageLocation
   * <p>
   * Complex element StageLocation defines locations where the equipment or
   * system is allowed or forbidden from use..
   * <p>
   * @return a {@link StageLocation} instance
   * @since 3.1.0
   */
  public Set<StageLocation> getStageLocation() {
    if (stageLocation == null) {
      stageLocation = new HashSet<>();
    }
    return this.stageLocation;
  }

  /**
   * Determine if the StageLocation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStageLocation() {
    return ((this.stageLocation != null) && (!this.stageLocation.isEmpty()));
  }

  /**
   * Clear the StageLocation field. This sets the field to null.
   */
  public void unsetStageLocation() {
    this.stageLocation = null;
  }

  /**
   * Get the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station. Finally, it may indicate if the receiver station is
   * used primarily as a repeater. A direct coupling between the station's
   * receiver and the station's transmitter allows the incoming signal to be
   * retransmitted exactly as received..
   * <p>
   * @return a {@link Configuration} instance
   * @since 3.1.0
   */
  public Set<Configuration> getConfiguration() {
    if (configuration == null) {
      configuration = new HashSet<>();
    }
    return this.configuration;
  }

  /**
   * Determine if the Configuration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfiguration() {
    return ((this.configuration != null) && (!this.configuration.isEmpty()));
  }

  /**
   * Clear the Configuration field. This sets the field to null.
   */
  public void unsetConfiguration() {
    this.configuration = null;
  }

  /**
   * Set the dataset identifier of the SSRequest being replied to.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withSSRequestRef(Serial value) {
    setSSRequestRef(value);
    return this;
  }

  /**
   * Set the code of the country providing the reply.
   * <p>
   * @param value An instances of type {@link ListCAO}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withReplyingCountry(ListCAO value) {
    setReplyingCountry(new TString(value.value()));
    return this;
  }

  /**
   * Set the overall result of the national analysis. - If replying "Supported
   * with Restrictions", use Comments for general restrictions only. Specific
   * restrictions on authorised/excluded location should be expressed using the
   * LocationRef. Specific restrictions on tuning ranges and power limits should
   * be expressed using the Configuration. - If replying "Supported with
   * Recommendations", use Comments to express these recommendations.
   * <p>
   * @param value An instances of type {@link ListCCD}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withSupportabilityCode(ListCCD value) {
    setSupportabilityCode(new TString(value.value()));
    return this;
  }

  /**
   * Set the date the request was received by the Host Nation Administration.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withDateReceivedByCountry(Calendar value) {
    setDateReceivedByCountry(new D(value));
    return this;
  }

  /**
   * Set the date the request was received by the Host Nation Administration.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withDateReceivedByCountry(Date value) {
    setDateReceivedByCountry(new D(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withEffectiveDate(Calendar value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withEffectiveDate(Date value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withExpirationDate(Calendar value) {
    setExpirationDate(new D(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withExpirationDate(Date value) {
    setExpirationDate(new D(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withReviewDate(Calendar value) {
    setReviewDate(new D(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withReviewDate(Date value) {
    setReviewDate(new D(value));
    return this;
  }

  /**
   * Set the Certification of Spectrum Support Spectrum Planning Subcommittee
   * (SPS) document identifier assigned by NTIA. This is not the same as the
   * application SPS number.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withApprovalSPSNum(String value) {
    setApprovalSPSNum(new S11(value));
    return this;
  }

  /**
   * Set the Emergency Readiness Plan (ERP) Number. Certification applications
   * are assigned an ERP Number by the Emergency Planning Subcommittee (EPS) of
   * the Interdepartment Radio Advisory Committee (IRAC) if the system involves
   * national security and emergency preparedness (NSEP).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withERPNumber(String value) {
    setERPNumber(new S50(value));
    return this;
  }

  /**
   * Set the Interdepartment Radio Advisory Committee (IRAC) Frequency
   * Assignment Subcommittee (FAS) identifier assigned by NTIA.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withFASNumber(String value) {
    setFASNumber(new S50(value));
    return this;
  }

  /**
   * Set the Interdepartment Radio Advisory Committee (IRAC) document number of
   * the NTIA Certification of Spectrum Support document. This number is
   * assigned by NTIA.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withIRACNumber(String value) {
    setIRACNumber(new S50(value));
    return this;
  }

  /**
   * Set the name of the organization providing the reply.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withReplyingAuthority(String value) {
    setReplyingAuthority(new S100(value));
    return this;
  }

  /**
   * Set In Data Item DistributionGroups (US), identify to whom the signed
   * certification should be distributed (e.g., "J-12 Holders").
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withDistributionGroups(String value) {
    setDistributionGroups(new S20(value));
    return this;
  }

  /**
   * Set the US Military Communications-Electronics Board (MCEB) identifier
   * assigned to the equipment or system. (e.g., J/F 12/12345). An SSRequest
   * coordination number usually ends with an even digit (e.g., /2, /4), while
   * an SSReply coordination number usually ends with an odd digit (e.g., /3,
   * /5). When certifying equipment, both SSRequest and SSReply SHOULD have a
   * coordination number.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withCoordinationNum(String value) {
    setCoordinationNum(new S15(value));
    return this;
  }

  /**
   * Set the CommentSource
   * <p>
   * Complex element CommentSource is used to provide comments to a SSRequest.
   * It can also be used to certify supportability.
   * <p>
   * @param values One or more instances of type {@link CommentSource...}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withCommentSource(CommentSource... values) {
    if (values != null) {
      getCommentSource().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the CommentSource
   * <p>
   * Complex element CommentSource is used to provide comments to a SSRequest.
   * It can also be used to certify supportability.
   * <p>
   * @param values A collection of {@link CommentSource} instances
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withCommentSource(Collection<CommentSource> values) {
    if (values != null) {
      getCommentSource().addAll(values);
    }
    return this;
  }

  /**
   * Set the StageLocation
   * <p>
   * Complex element StageLocation defines locations where the equipment or
   * system is allowed or forbidden from use.
   * <p>
   * @param values One or more instances of type {@link StageLocation...}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withStageLocation(StageLocation... values) {
    if (values != null) {
      getStageLocation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the StageLocation
   * <p>
   * Complex element StageLocation defines locations where the equipment or
   * system is allowed or forbidden from use.
   * <p>
   * @param values A collection of {@link StageLocation} instances
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withStageLocation(Collection<StageLocation> values) {
    if (values != null) {
      getStageLocation().addAll(values);
    }
    return this;
  }

  /**
   * Set the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station. Finally, it may indicate if the receiver station is
   * used primarily as a repeater. A direct coupling between the station's
   * receiver and the station's transmitter allows the incoming signal to be
   * retransmitted exactly as received.
   * <p>
   * @param values One or more instances of type {@link Configuration...}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withConfiguration(Configuration... values) {
    if (values != null) {
      getConfiguration().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station. Finally, it may indicate if the receiver station is
   * used primarily as a repeater. A direct coupling between the station's
   * receiver and the station's transmitter allows the incoming signal to be
   * retransmitted exactly as received.
   * <p>
   * @param values A collection of {@link Configuration} instances
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withConfiguration(Collection<Configuration> values) {
    if (values != null) {
      getConfiguration().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this SSReply instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SSReply {"
           + (approvalSPSNum != null ? " approvalSPSNum [" + approvalSPSNum + "]" : "")
           + (commentSource != null ? " commentSource [" + commentSource + "]" : "")
           + (configuration != null ? " configuration [" + configuration + "]" : "")
           + (coordinationNum != null ? " coordinationNum [" + coordinationNum + "]" : "")
           + (dateReceivedByCountry != null ? " dateReceivedByCountry [" + dateReceivedByCountry + "]" : "")
           + (distributionGroups != null ? " distributionGroups [" + distributionGroups + "]" : "")
           + (effectiveDate != null ? " effectiveDate [" + effectiveDate + "]" : "")
           + (erpNumber != null ? " erpNumber [" + erpNumber + "]" : "")
           + (expirationDate != null ? " expirationDate [" + expirationDate + "]" : "")
           + (fasNumber != null ? " fasNumber [" + fasNumber + "]" : "")
           + (iracNumber != null ? " iracNumber [" + iracNumber + "]" : "")
           + (replyingAuthority != null ? " replyingAuthority [" + replyingAuthority + "]" : "")
           + (replyingCountry != null ? " replyingCountry [" + replyingCountry + "]" : "")
           + (reviewDate != null ? " reviewDate [" + reviewDate + "]" : "")
           + (ssRequestRef != null ? " ssRequestRef [" + ssRequestRef + "]" : "")
           + (stageLocation != null ? " stageLocation [" + stageLocation + "]" : "")
           + (supportabilityCode != null ? " supportabilityCode [" + supportabilityCode + "]" : "")
           + "}\n  SSReply." + super.toString() + "\n";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SSReply} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and
   * {@link D EffectiveDate}, {@link TString ReplyingCountry}, {@link TString SupportabilityCode}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetEffectiveDate() && isSetReplyingCountry() && isSetSupportabilityCode();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * SSRequestRef - SSRequest Serial (Optional)    * <p>
   * The dataset identifier of the SSRequest being replied to.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private SSRequest ssRequest;

  /**
   * Get the dataset identifier of the SSRequest being replied to..
   * <p>
   * @return a {@link SSRequest} instance
   * @since 3.1.0
   */
  public SSRequest getSsRequest() {
    return ssRequest;
  }

  /**
   * Determine if the ssRequest field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSsRequest() {
    return this.ssRequest != null;
  }

  /**
   * Set the dataset identifier of the SSRequest being replied to.
   * <p>
   * @param value An instances of type {@link SSRequest}.
   * @return The current SSReply object instance.
   * @since 3.1.0
   */
  public SSReply withSsRequest(SSRequest value) {
    this.ssRequest = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this SSReply record.
   * <p>
   * This method builds the exported {@link #ssRequestRef} field with values
   * from the transient {@link #ssRequest} field. This method should typically
   * be called after the SSReply is configured and (optionally) before exporting
   * an SSRF message.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void prepare() {
    super.prepare();
    this.ssRequestRef = ssRequest != null ? ssRequest.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this SSReply record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #ssRequest} with values from the
   * imported {@link #ssRequestRef} field. This method should typically be
   * called after the SSReply is imported from XML. * @param root the SSRF root
   * instance.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (ssRequestRef == null || !ssRequestRef.isSetValue()) {
      return;
    }
    for (SSRequest instance : root.getSSRequest()) {
      if (ssRequestRef.equals(instance.getSerial())) {
        ssRequest = instance;
        return;
      }
    }
  }//</editor-fold>

}
