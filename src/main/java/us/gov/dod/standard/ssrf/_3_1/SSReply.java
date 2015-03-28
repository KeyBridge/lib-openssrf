package us.gov.dod.standard.ssrf._3_1;

import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
SSReply is the XML root for all parameters of a Host Nation Declaration of Spectrum Supportability. It inherits attributes and sub-elements from element Common.

Sub-Elements are {@link CommentSource}, {@link Configuration}, {@link StageLocation}

Example: <pre>
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
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
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
public class SSReply
    extends Common
{

/**
SSRequestRef  - SSRequest Serial (Optional) 

The dataset identifier of the SSRequest being replied to.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "SSRequestRef", required = false)
    private Serial ssRequestRef;
/**
ReplyingCountry  - Replying Country (Required) 

The code of the country providing the reply.

Format is L:CAO
@since 3.1.0
*/
    @XmlElement(name = "ReplyingCountry", required = true)
      private  TString replyingCountry;
/**
SupportabilityCode  - Supportability Code (Required) 

The overall result of the national analysis. 
- If replying "Supported with Restrictions", use Comments for general restrictions only. Specific restrictions on authorised/excluded location should be expressed using the LocationRef. Specific restrictions on tuning ranges and power limits should be expressed using the Configuration.
- If replying "Supported with Recommendations", use Comments to express these recommendations.

Format is L:CCD
@since 3.1.0
*/
    @XmlElement(name = "SupportabilityCode", required = true)
      private  TString supportabilityCode;
/**
DateReceivedByCountry  - Date Request Received By Country (Optional) 

The date the request was received by the Host Nation Administration.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "DateReceivedByCountry", required = false)
    private D dateReceivedByCountry;
/**
EffectiveDate  - Effective Date (Required) 

The date by which the dataset is to be operational or effective.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "EffectiveDate", required = true)
      private  D effectiveDate;
/**
ExpirationDate  - Expiration Date (Optional) 

The date at which the dataset will expire. The Expiration date should be less than five years from current date.

Format is Date

Attribute group ExpireReview (Optional)
@since 3.1.0
*/
    @XmlElement(name = "ExpirationDate", required = false)
    private D expirationDate;
/**
ReviewDate  - Review Date (Optional) 

The date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicates when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

Format is Date

Attribute group ExpireReview (Optional)
@since 3.1.0
*/
    @XmlElement(name = "ReviewDate", required = false)
    private D reviewDate;
/**
US:ApprovalSPSNum  - Approval SPS Number (Optional) 

The Certification of Spectrum Support Spectrum Planning Subcommittee (SPS) document identifier assigned by NTIA. This is not the same as the application SPS number.

Format is S11
@since 3.1.0
*/
    @XmlElement(name = "ApprovalSPSNum", required = false)
    private S11 approvalSPSNum;
/**
US:ERPNumber  - ERP Number (Optional) 

The Emergency Readiness Plan (ERP) Number. Certification applications are assigned an ERP Number by the Emergency Planning Subcommittee (EPS) of the Interdepartment Radio Advisory Committee (IRAC) if the system involves national security and emergency preparedness (NSEP).

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "ERPNumber", required = false)
    private S50 erpNumber;
/**
US:FASNumber  - FAS Number (Optional) 

The Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment Subcommittee (FAS) identifier assigned by NTIA.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "FASNumber", required = false)
    private S50 fasNumber;
/**
US:IRACNumber  - IRAC Number (Optional) 

The Interdepartment Radio Advisory Committee (IRAC) document number of the NTIA Certification of Spectrum Support document. This number is assigned by NTIA.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "IRACNumber", required = false)
    private S50 iracNumber;
/**
US:ReplyingAuthority - Replying Authority (Optional) 

The name of the organization providing the reply.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "ReplyingAuthority", required = false)
    private S100 replyingAuthority;
/**
In Data Item DistributionGroups (US), identify to whom the signed certification should be distributed (e.g., "J-12 Holders").
@since 3.1.0
*/
    @XmlElement(name = "DistributionGroups", required = false)
    private S20 distributionGroups;
/**
US:CoordinationNum  - Coordination Number (Optional) 

The US Military Communications-Electronics Board (MCEB) identifier assigned to the equipment or system. (e.g., J/F  12/12345).  An SSRequest coordination number usually ends with an even digit (e.g., /2, /4), while an SSReply coordination number usually ends with an odd digit (e.g., /3, /5).  When certifying equipment, both SSRequest and SSReply SHOULD have a coordination number.

Format is S15
@since 3.1.0
*/
    @XmlElement(name = "CoordinationNum", required = false)
    private S15 coordinationNum;
/**
CommentSource (Optional)

CommentSource is used to provide comments to a SSRequest. It can also be used to certify supportability.
@since 3.1.0
*/
    @XmlElement(name = "CommentSource")
      private  Set<CommentSource> commentSource;
/**
StageLocation (Optional)

StageLocation defines locations where the equipment or system is allowed or forbidden from use.
@since 3.1.0
*/
    @XmlElement(name = "StageLocation")
      private  Set<StageLocation> stageLocation;
/**
Configuration (Optional)

Configuration identifies each operational configuration that is required in a SSRequest, granted by a Host Nation in a SSReply, or authorised in a frequency Assignment or Allotment dataset. It also identifies the functional use of the assigned frequency at a particular transmitting station. Finally, it may indicate if the receiver station is used primarily as a repeater. A direct coupling between the station's receiver and the station's transmitter allows the incoming signal to be retransmitted exactly as received.
@since 3.1.0
*/
    @XmlElement(name = "Configuration")
      private  Set<Configuration> configuration;

/**
Get the dataset identifier of the SSRequest being replied to.

@return the SSRequestRef value in a {@link Serial} data type
@since 3.1.0
*/
public Serial getSSRequestRef() {
        return ssRequestRef;
    }

/**
Set the dataset identifier of the SSRequest being replied to.

@param value the SSRequestRef value in a {@link Serial} data type
@since 3.1.0
*/
public void setSSRequestRef(Serial value) {
        this.ssRequestRef = value;
    }

/**
Determine if the SSRequestRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSSRequestRef() {
        return (this.ssRequestRef!= null);
    }

/**
Get the code of the country providing the reply.

@return the ReplyingCountry value in a {@link TString} data type
@since 3.1.0
*/
public TString getReplyingCountry() {
        return replyingCountry;
    }

/**
Set the code of the country providing the reply.

@param value the ReplyingCountry value in a {@link TString} data type
@since 3.1.0
*/
public void setReplyingCountry(TString value) {
        this.replyingCountry = value;
    }

/**
Determine if the ReplyingCountry is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetReplyingCountry() {
return (this.replyingCountry!= null ? this.replyingCountry.isSetValue() : false);
    }

/**
Get the overall result of the national analysis. 
- If replying "Supported with Restrictions", use Comments for general restrictions only. Specific restrictions on authorised/excluded location should be expressed using the LocationRef. Specific restrictions on tuning ranges and power limits should be expressed using the Configuration.
- If replying "Supported with Recommendations", use Comments to express these recommendations.

@return the SupportabilityCode value in a {@link TString} data type
@since 3.1.0
*/
public TString getSupportabilityCode() {
        return supportabilityCode;
    }

/**
Set the overall result of the national analysis. 
- If replying "Supported with Restrictions", use Comments for general restrictions only. Specific restrictions on authorised/excluded location should be expressed using the LocationRef. Specific restrictions on tuning ranges and power limits should be expressed using the Configuration.
- If replying "Supported with Recommendations", use Comments to express these recommendations.

@param value the SupportabilityCode value in a {@link TString} data type
@since 3.1.0
*/
public void setSupportabilityCode(TString value) {
        this.supportabilityCode = value;
    }

/**
Determine if the SupportabilityCode is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSupportabilityCode() {
return (this.supportabilityCode!= null ? this.supportabilityCode.isSetValue() : false);
    }

/**
Get the date the request was received by the Host Nation Administration.

@return the DateReceivedByCountry value in a {@link TD} data type
@since 3.1.0
*/
public D getDateReceivedByCountry() {
        return dateReceivedByCountry;
    }

/**
Set the date the request was received by the Host Nation Administration.

@param value the DateReceivedByCountry value in a {@link TD} data type
@since 3.1.0
*/
public void setDateReceivedByCountry(D value) {
        this.dateReceivedByCountry = value;
    }

/**
Determine if the DateReceivedByCountry is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDateReceivedByCountry() {
        return (this.dateReceivedByCountry!= null);
    }

/**
Get the date by which the dataset is to be operational or effective.

@return the EffectiveDate value in a {@link TD} data type
@since 3.1.0
*/
public D getEffectiveDate() {
        return effectiveDate;
    }

/**
Set the date by which the dataset is to be operational or effective.

@param value the EffectiveDate value in a {@link TD} data type
@since 3.1.0
*/
public void setEffectiveDate(D value) {
        this.effectiveDate = value;
    }

/**
Determine if the EffectiveDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEffectiveDate() {
        return (this.effectiveDate!= null);
    }

/**
Get the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@return the ExpirationDate value in a {@link TD} data type
@since 3.1.0
*/
public D getExpirationDate() {
        return expirationDate;
    }

/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value the ExpirationDate value in a {@link TD} data type
@since 3.1.0
*/
public void setExpirationDate(D value) {
        this.expirationDate = value;
    }

/**
Determine if the ExpirationDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetExpirationDate() {
        return (this.expirationDate!= null);
    }

/**
Get the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicates when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@return the ReviewDate value in a {@link TD} data type
@since 3.1.0
*/
public D getReviewDate() {
        return reviewDate;
    }

/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicates when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value the ReviewDate value in a {@link TD} data type
@since 3.1.0
*/
public void setReviewDate(D value) {
        this.reviewDate = value;
    }

/**
Determine if the ReviewDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetReviewDate() {
        return (this.reviewDate!= null);
    }

/**
Get the Certification of Spectrum Support Spectrum Planning Subcommittee (SPS) document identifier assigned by NTIA. This is not the same as the application SPS number.

@return the ApprovalSPSNum value in a {@link TS11} data type
@since 3.1.0
*/
public S11 getApprovalSPSNum() {
        return approvalSPSNum;
    }

/**
Set the Certification of Spectrum Support Spectrum Planning Subcommittee (SPS) document identifier assigned by NTIA. This is not the same as the application SPS number.

@param value the ApprovalSPSNum value in a {@link TS11} data type
@since 3.1.0
*/
public void setApprovalSPSNum(S11 value) {
        this.approvalSPSNum = value;
    }

/**
Determine if the ApprovalSPSNum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetApprovalSPSNum() {
        return (this.approvalSPSNum!= null);
    }

/**
Get the Emergency Readiness Plan (ERP) Number. Certification applications are assigned an ERP Number by the Emergency Planning Subcommittee (EPS) of the Interdepartment Radio Advisory Committee (IRAC) if the system involves national security and emergency preparedness (NSEP).

@return the ERPNumber value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getERPNumber() {
        return erpNumber;
    }

/**
Set the Emergency Readiness Plan (ERP) Number. Certification applications are assigned an ERP Number by the Emergency Planning Subcommittee (EPS) of the Interdepartment Radio Advisory Committee (IRAC) if the system involves national security and emergency preparedness (NSEP).

@param value the ERPNumber value in a {@link TS50} data type
@since 3.1.0
*/
public void setERPNumber(S50 value) {
        this.erpNumber = value;
    }

/**
Determine if the ERPNumber is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPNumber() {
        return (this.erpNumber!= null);
    }

/**
Get the Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment Subcommittee (FAS) identifier assigned by NTIA.

@return the FASNumber value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getFASNumber() {
        return fasNumber;
    }

/**
Set the Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment Subcommittee (FAS) identifier assigned by NTIA.

@param value the FASNumber value in a {@link TS50} data type
@since 3.1.0
*/
public void setFASNumber(S50 value) {
        this.fasNumber = value;
    }

/**
Determine if the FASNumber is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFASNumber() {
        return (this.fasNumber!= null);
    }

/**
Get the Interdepartment Radio Advisory Committee (IRAC) document number of the NTIA Certification of Spectrum Support document. This number is assigned by NTIA.

@return the IRACNumber value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getIRACNumber() {
        return iracNumber;
    }

/**
Set the Interdepartment Radio Advisory Committee (IRAC) document number of the NTIA Certification of Spectrum Support document. This number is assigned by NTIA.

@param value the IRACNumber value in a {@link TS50} data type
@since 3.1.0
*/
public void setIRACNumber(S50 value) {
        this.iracNumber = value;
    }

/**
Determine if the IRACNumber is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIRACNumber() {
        return (this.iracNumber!= null);
    }

/**
Get the name of the organization providing the reply.

@return the ReplyingAuthority value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getReplyingAuthority() {
        return replyingAuthority;
    }

/**
Set the name of the organization providing the reply.

@param value the ReplyingAuthority value in a {@link TS100} data type
@since 3.1.0
*/
public void setReplyingAuthority(S100 value) {
        this.replyingAuthority = value;
    }

/**
Determine if the ReplyingAuthority is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetReplyingAuthority() {
        return (this.replyingAuthority!= null);
    }

/**
Get In Data Item DistributionGroups (US), identify to whom the signed certification should be distributed (e.g., "J-12 Holders").

@return the DistributionGroups value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getDistributionGroups() {
        return distributionGroups;
    }

/**
Set In Data Item DistributionGroups (US), identify to whom the signed certification should be distributed (e.g., "J-12 Holders").

@param value the DistributionGroups value in a {@link TS20} data type
@since 3.1.0
*/
public void setDistributionGroups(S20 value) {
        this.distributionGroups = value;
    }

/**
Determine if the DistributionGroups is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDistributionGroups() {
        return (this.distributionGroups!= null);
    }

/**
Get the US Military Communications-Electronics Board (MCEB) identifier assigned to the equipment or system. (e.g., J/F  12/12345).  An SSRequest coordination number usually ends with an even digit (e.g., /2, /4), while an SSReply coordination number usually ends with an odd digit (e.g., /3, /5).  When certifying equipment, both SSRequest and SSReply SHOULD have a coordination number.

@return the CoordinationNum value in a {@link TS15} data type
@since 3.1.0
*/
public S15 getCoordinationNum() {
        return coordinationNum;
    }

/**
Set the US Military Communications-Electronics Board (MCEB) identifier assigned to the equipment or system. (e.g., J/F  12/12345).  An SSRequest coordination number usually ends with an even digit (e.g., /2, /4), while an SSReply coordination number usually ends with an odd digit (e.g., /3, /5).  When certifying equipment, both SSRequest and SSReply SHOULD have a coordination number.

@param value the CoordinationNum value in a {@link TS15} data type
@since 3.1.0
*/
public void setCoordinationNum(S15 value) {
        this.coordinationNum = value;
    }

/**
Determine if the CoordinationNum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCoordinationNum() {
        return (this.coordinationNum!= null);
    }

/**
Get the CommentSource

Complex element CommentSource is used to provide comments to a SSRequest. It can also be used to certify supportability.

@return  a {@link CommentSource} instance
@since 3.1.0
*/
    public Set<CommentSource> getCommentSource() {
        if (commentSource == null) {
            commentSource = new HashSet<CommentSource>();
        }
        return this.commentSource;
    }

/**
Determine if the CommentSource is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCommentSource() {
        return ((this.commentSource!= null)&&(!this.commentSource.isEmpty()));
    }

/**
  Clear the CommentSource field. This sets the field to null.
 */
    public void unsetCommentSource() {
        this.commentSource = null;
    }

/**
Get the StageLocation

Complex element StageLocation defines locations where the equipment or system is allowed or forbidden from use.

@return  a {@link StageLocation} instance
@since 3.1.0
*/
    public Set<StageLocation> getStageLocation() {
        if (stageLocation == null) {
            stageLocation = new HashSet<StageLocation>();
        }
        return this.stageLocation;
    }

/**
Determine if the StageLocation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStageLocation() {
        return ((this.stageLocation!= null)&&(!this.stageLocation.isEmpty()));
    }

/**
  Clear the StageLocation field. This sets the field to null.
 */
    public void unsetStageLocation() {
        this.stageLocation = null;
    }

/**
Get the Configuration

Complex element Configuration identifies each operational configuration that is required in a SSRequest, granted by a Host Nation in a SSReply, or authorised in a frequency Assignment or Allotment dataset. It also identifies the functional use of the assigned frequency at a particular transmitting station. Finally, it may indicate if the receiver station is used primarily as a repeater. A direct coupling between the station's receiver and the station's transmitter allows the incoming signal to be retransmitted exactly as received.

@return  a {@link Configuration} instance
@since 3.1.0
*/
    public Set<Configuration> getConfiguration() {
        if (configuration == null) {
            configuration = new HashSet<Configuration>();
        }
        return this.configuration;
    }

/**
Determine if the Configuration is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetConfiguration() {
        return ((this.configuration!= null)&&(!this.configuration.isEmpty()));
    }

/**
  Clear the Configuration field. This sets the field to null.
 */
    public void unsetConfiguration() {
        this.configuration = null;
    }

/**
Set the dataset identifier of the SSRequest being replied to.

@param value  An instances of type {@link Serial}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withSSRequestRef(Serial value) {
           setSSRequestRef(value);
        return this;
    }

/**
Set the code of the country providing the reply.

@param value  An instances of type {@link ListCAO}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withReplyingCountry(ListCAO value) {
        setReplyingCountry(new TString(value.value()));
        return this;
    }

/**
Set the overall result of the national analysis. 
- If replying "Supported with Restrictions", use Comments for general restrictions only. Specific restrictions on authorised/excluded location should be expressed using the LocationRef. Specific restrictions on tuning ranges and power limits should be expressed using the Configuration.
- If replying "Supported with Recommendations", use Comments to express these recommendations.

@param value  An instances of type {@link ListCCD}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withSupportabilityCode(ListCCD value) {
        setSupportabilityCode(new TString(value.value()));
        return this;
    }

/**
Set the date the request was received by the Host Nation Administration.

@param value  An instances of type {@link Calendar}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withDateReceivedByCountry(Calendar value) {
           setDateReceivedByCountry(new D(value));
        return this;
    }
/**
Set the date the request was received by the Host Nation Administration.

@param value  An instances of type {@link Date}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withDateReceivedByCountry(Date value) {
           setDateReceivedByCountry(new D(value));
        return this;
    }

/**
Set the date by which the dataset is to be operational or effective.

@param value  An instances of type {@link TD}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withEffectiveDate(TD value) {
        return this;
    }

/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value  An instances of type {@link Calendar}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withExpirationDate(Calendar value) {
           setExpirationDate(new D(value));
        return this;
    }
/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value  An instances of type {@link Date}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withExpirationDate(Date value) {
           setExpirationDate(new D(value));
        return this;
    }

/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicates when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Calendar}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withReviewDate(Calendar value) {
           setReviewDate(new D(value));
        return this;
    }
/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicates when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Date}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withReviewDate(Date value) {
           setReviewDate(new D(value));
        return this;
    }

/**
Set the Certification of Spectrum Support Spectrum Planning Subcommittee (SPS) document identifier assigned by NTIA. This is not the same as the application SPS number.

@param value  An instances of type {@link String}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withApprovalSPSNum(String value) {
           setApprovalSPSNum(new S11(value));
        return this;
    }

/**
Set the Emergency Readiness Plan (ERP) Number. Certification applications are assigned an ERP Number by the Emergency Planning Subcommittee (EPS) of the Interdepartment Radio Advisory Committee (IRAC) if the system involves national security and emergency preparedness (NSEP).

@param value  An instances of type {@link String}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withERPNumber(String value) {
           setERPNumber(new S50(value));
        return this;
    }

/**
Set the Interdepartment Radio Advisory Committee (IRAC) Frequency Assignment Subcommittee (FAS) identifier assigned by NTIA.

@param value  An instances of type {@link String}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withFASNumber(String value) {
           setFASNumber(new S50(value));
        return this;
    }

/**
Set the Interdepartment Radio Advisory Committee (IRAC) document number of the NTIA Certification of Spectrum Support document. This number is assigned by NTIA.

@param value  An instances of type {@link String}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withIRACNumber(String value) {
           setIRACNumber(new S50(value));
        return this;
    }

/**
Set the name of the organization providing the reply.

@param value  An instances of type {@link String}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withReplyingAuthority(String value) {
           setReplyingAuthority(new S100(value));
        return this;
    }

/**
Set In Data Item DistributionGroups (US), identify to whom the signed certification should be distributed (e.g., "J-12 Holders").

@param value  An instances of type {@link String}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withDistributionGroups(String value) {
           setDistributionGroups(new S20(value));
        return this;
    }

/**
Set the US Military Communications-Electronics Board (MCEB) identifier assigned to the equipment or system. (e.g., J/F  12/12345).  An SSRequest coordination number usually ends with an even digit (e.g., /2, /4), while an SSReply coordination number usually ends with an odd digit (e.g., /3, /5).  When certifying equipment, both SSRequest and SSReply SHOULD have a coordination number.

@param value  An instances of type {@link String}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withCoordinationNum(String value) {
           setCoordinationNum(new S15(value));
        return this;
    }

/**
Set the CommentSource

Complex element CommentSource is used to provide comments to a SSRequest. It can also be used to certify supportability.

@param values  One or more instances of type {@link CommentSource...}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withCommentSource(CommentSource... values) {
        if (values!= null) {
            for (CommentSource value: values) {
                getCommentSource().add(value);
            }
        }
        return this;
    }

/**
Set the CommentSource

Complex element CommentSource is used to provide comments to a SSRequest. It can also be used to certify supportability.

@param values  A collection of {@link CommentSource} instances
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withCommentSource(Collection<CommentSource> values) {
        if (values!= null) {
            getCommentSource().addAll(values);
        }
        return this;
    }

/**
Set the StageLocation

Complex element StageLocation defines locations where the equipment or system is allowed or forbidden from use.

@param values  One or more instances of type {@link StageLocation...}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withStageLocation(StageLocation... values) {
        if (values!= null) {
            for (StageLocation value: values) {
                getStageLocation().add(value);
            }
        }
        return this;
    }

/**
Set the StageLocation

Complex element StageLocation defines locations where the equipment or system is allowed or forbidden from use.

@param values  A collection of {@link StageLocation} instances
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withStageLocation(Collection<StageLocation> values) {
        if (values!= null) {
            getStageLocation().addAll(values);
        }
        return this;
    }

/**
Set the Configuration

Complex element Configuration identifies each operational configuration that is required in a SSRequest, granted by a Host Nation in a SSReply, or authorised in a frequency Assignment or Allotment dataset. It also identifies the functional use of the assigned frequency at a particular transmitting station. Finally, it may indicate if the receiver station is used primarily as a repeater. A direct coupling between the station's receiver and the station's transmitter allows the incoming signal to be retransmitted exactly as received.

@param values  One or more instances of type {@link Configuration...}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withConfiguration(Configuration... values) {
        if (values!= null) {
            for (Configuration value: values) {
                getConfiguration().add(value);
            }
        }
        return this;
    }

/**
Set the Configuration

Complex element Configuration identifies each operational configuration that is required in a SSRequest, granted by a Host Nation in a SSReply, or authorised in a frequency Assignment or Allotment dataset. It also identifies the functional use of the assigned frequency at a particular transmitting station. Finally, it may indicate if the receiver station is used primarily as a repeater. A direct coupling between the station's receiver and the station's transmitter allows the incoming signal to be retransmitted exactly as received.

@param values  A collection of {@link Configuration} instances
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withConfiguration(Collection<Configuration> values) {
        if (values!= null) {
            getConfiguration().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withCaseNum(CaseNum... values) {
        if (values!= null) {
            for (CaseNum value: values) {
                getCaseNum().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set 

@param values  A collection of {@link CaseNum} instances
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withExtReferenceRef(ExtReferenceRef... values) {
        if (values!= null) {
            for (ExtReferenceRef value: values) {
                getExtReferenceRef().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set 

@param values  A collection of {@link ExtReferenceRef} instances
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withRemarks(Remarks... values) {
        if (values!= null) {
            for (Remarks value: values) {
                getRemarks().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  A collection of {@link Remarks} instances
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withReleasability(ListCCY... values) {
        if (values!= null) {
            for (ListCCY value: values) {
                getReleasability().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  A collection of {@link Releasability} instances
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withRemarkRef(BigInteger... values) {
        if (values!= null) {
            for (BigInteger value: values) {
                getRemarkRef().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set 

@param values  A collection of {@link RemarkRef} instances
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withExtReferences(BigInteger... values) {
        if (values!= null) {
            for (BigInteger value: values) {
                getExtReferences().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  A collection of {@link ExtReferences} instances
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current SSReply object instance
@since 3.1.0
*/
    public SSReply withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this SSReply instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "SSReply {"
 + (approvalSPSNum !=null? " approvalSPSNum [" + approvalSPSNum +"]" : "") 
 + (commentSource !=null? " commentSource [" + commentSource +"]" : "") 
 + (configuration !=null? " configuration [" + configuration +"]" : "") 
 + (coordinationNum !=null? " coordinationNum [" + coordinationNum +"]" : "") 
 + (dateReceivedByCountry !=null? " dateReceivedByCountry [" + dateReceivedByCountry +"]" : "") 
 + (distributionGroups !=null? " distributionGroups [" + distributionGroups +"]" : "") 
 + (effectiveDate !=null? " effectiveDate [" + effectiveDate +"]" : "") 
 + (erpNumber !=null? " erpNumber [" + erpNumber +"]" : "") 
 + (expirationDate !=null? " expirationDate [" + expirationDate +"]" : "") 
 + (fasNumber !=null? " fasNumber [" + fasNumber +"]" : "") 
 + (iracNumber !=null? " iracNumber [" + iracNumber +"]" : "") 
 + (replyingAuthority !=null? " replyingAuthority [" + replyingAuthority +"]" : "") 
 + (replyingCountry !=null? " replyingCountry [" + replyingCountry +"]" : "") 
 + (reviewDate !=null? " reviewDate [" + reviewDate +"]" : "") 
 + (ssRequestRef !=null? " ssRequestRef [" + ssRequestRef +"]" : "") 
 + (stageLocation !=null? " stageLocation [" + stageLocation +"]" : "") 
 + (supportabilityCode !=null? " supportabilityCode [" + supportabilityCode +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link SSReply} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link D EffectiveDate}, {@link TString ReplyingCountry}, {@link TString SupportabilityCode}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetEffectiveDate() &&  isSetReplyingCountry() &&  isSetSupportabilityCode();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
SSRequestRef  - SSRequest Serial (Optional) 

The dataset identifier of the SSRequest being replied to.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private SSRequest ssRequest;

/**
Get the dataset identifier of the SSRequest being replied to.

@return  a {@link SSRequest} instance
@since 3.1.0
*/
public SSRequest getSsRequest(){
return ssRequest;
}
/**
 Determine if the ssRequest field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetSsRequest() {
    return this.ssRequest != null ;
}

/**
Set the dataset identifier of the SSRequest being replied to.

@param value  An instances of type {@link SSRequest}
@return The current SSReply object instance
@since 3.1.0
*/
public SSReply withSsRequest(SSRequest value) {
this.ssRequest = value;
return this;
}

  /**
   * Update the SSRF data type references in this SSReply record.
   * <p>
 */
  @Override
public void prepare() {
super.prepare();
this.ssRequestRef = ssRequest !=null? ssRequest.getSerial() : null;
}

/**
   * Update the SSRF data type references in this SSReply record after loading from XML.

   * This method builds the transient {@link #ssRequest} with values
   * from the imported {@link #ssRequestRef} field. This method should
   * typically be called after the SSReply is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (ssRequestRef==null || !ssRequestRef.isSetValue() ) {return;}
for(SSRequest instance : root.getSSRequest()) {
if(ssRequestRef.equals(instance.getSerial())){
ssRequest = instance;
return;}
}}//</editor-fold>

}
