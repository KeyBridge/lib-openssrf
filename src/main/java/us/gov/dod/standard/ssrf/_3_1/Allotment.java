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
Allotment is a group of frequencies given to a subordinate organisation for local management, for specific types of emissions, at a certain location, and for a specified period of time.

Sub-Elements are {@link AllotFreq}, {@link Emission}, {@link POCInformation}, {@link Project}

Example: <pre>
* &lt;Allotment cls="U"&gt;
*   &lt;Serial cls="U"&gt;USA::AL:123&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;Title cls="U"&gt;Allotment Title Here&lt;/Title&gt;
*   &lt;UsageType cls="U"&gt;Request Permanent&lt;/UsageType&gt;
*   &lt;DateResponseRequired cls="U"&gt;2011-12-25&lt;/DateResponseRequired&gt;
*   &lt;EffectiveDate cls="U"&gt;2012-01-01&lt;/EffectiveDate&gt;
*   &lt;ExpirationDate cls="U"&gt;2106-01-01&lt;/ExpirationDate&gt;
*   &lt;ReviewDate cls="U"&gt;2104-01-01&lt;/ReviewDate&gt;
*   &lt;Requirement cls="U"&gt;Need reply ASAP&lt;/Requirement&gt;
*   &lt;AllotFreq&gt;
*     &lt;FreqMin cls="U"&gt;30&lt;/FreqMin&gt;
*     &lt;FreqMax cls="U"&gt;35&lt;/FreqMax&gt;
*     &lt;PairedFreqMin cls=”U”&gt;20.5&lt;/PairedFreqMin&gt;
*     &lt;TuningStep cls="U"&gt;0.050&lt;/TuningStep&gt;
*     &lt;LocationRestriction cls="U"&gt;DEU::LO:25001&lt;/LocationRestriction&gt;
*   &lt;/AllotFreq&gt;
*   &lt;Emission&gt;
*     &lt;EmsClass cls="U"&gt;G1D&lt;/EmsClass&gt;
*     &lt;NecessaryBw cls="U"&gt;2.5&lt;/NecessaryBw&gt;
*     &lt;Power cls="U"&gt;1.2&lt;/Power&gt;
*   &lt;/Emission&gt;
*   &lt;LocationRef cls="U"&gt;DEU::LO:25&lt;/LocationRef&gt;
* &lt;/Allotment&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Allotment", propOrder = {
    "title",
    "usageType",
    "dateResponseRequired",
    "effectiveDate",
    "expirationDate",
    "reviewDate",
    "requirement",
    "project",
    "pocInformation",
    "locationRef",
    "emission",
    "allotFreq"
})
public class Allotment
    extends Common
{

/**
Title - Title (Optional) 

An identifying name for this Allotment or Assignment.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Title", required = false)
    private S100 title;
/**
UsageType - Type of Usage (Optional) 

The type of assignment request or approved assignment/allotment. In Data Item case of a rejected or cancelled assignment/allotment, use an associated Remarks to indicate the reason.

Format is L:CUT
@since 3.1.0
*/
    @XmlElement(name = "UsageType", required = false)
    private TString usageType;
/**
DateResponseRequired - Date Response Required (Optional) 

The date by which the frequency assignment or Spectrum Supportability Reply is required by the user in order to complete necessary advanced operation coordination.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "DateResponseRequired", required = false)
    private D dateResponseRequired;
/**
EffectiveDate - Effective Date (Required) 

The date by which the dataset is to be operational or effective.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "EffectiveDate", required = true)
      private  D effectiveDate;
/**
ExpirationDate - Expiration Date (Optional) 

The date at which the dataset will expire. The Expiration date should be less than five years from current date.

Format is Date

Attribute group ExpireReview (Required)
@since 3.1.0
*/
    @XmlElement(name = "ExpirationDate", required = false)
    private D expirationDate;
/**
ReviewDate - Review Date (Optional) 

The date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

Format is Date

Attribute group ExpireReview (Required)
@since 3.1.0
*/
    @XmlElement(name = "ReviewDate", required = false)
    private D reviewDate;
/**
Requirement - Description of Requirement (Optional) 

Any amplifying information on the requirement.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "Requirement", required = false)
    private MEMO requirement;
/**
Project (Optional)

Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other project name associated to the dataset.
@since 3.1.0
*/
    @XmlElement(name = "Project")
      private  Set<Project> project;
/**
POCInformation (Optional)

POCInformation contains a reference to a Contact, Organisation or Role dataset.
@since 3.1.0
*/
    @XmlElement(name = "POCInformation")
      private  Set<POCInformation> pocInformation;
/**
LocationRef (Required)

LocationRef references a Location dataset.
@since 3.1.0
*/
    @XmlElement(name = "LocationRef", required = true, nillable = true)
      private  Set<Serial> locationRef;
/**
Emission (Optional)

Emission defines the limits of the authorized bandwidth and power within the allotment.
@since 3.1.0
*/
    @XmlElement(name = "Emission")
      private  Set<Emission> emission;
/**
AllotFreq (Required)

AllotFreq defines a frequency or range of frequencies belonging to the Allotment.
@since 3.1.0
*/
    @XmlElement(name = "AllotFreq", required = true)
      private  Set<AllotFreq> allotFreq;

/**
Get an identifying name for this Allotment or Assignment.

@return the Title value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getTitle() {
        return title;
    }

/**
Set an identifying name for this Allotment or Assignment.

@param value the Title value in a {@link TS100} data type
@since 3.1.0
*/
public void setTitle(S100 value) {
        this.title = value;
    }

/**
Determine if the Title is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTitle() {
        return (this.title!= null);
    }

/**
Get the type of assignment request or approved assignment/allotment. In Data Item case of a rejected or cancelled assignment/allotment, use an associated Remarks to indicate the reason.

@return the UsageType value in a {@link TString} data type
@since 3.1.0
*/
public TString getUsageType() {
        return usageType;
    }

/**
Set the type of assignment request or approved assignment/allotment. In Data Item case of a rejected or cancelled assignment/allotment, use an associated Remarks to indicate the reason.

@param value the UsageType value in a {@link TString} data type
@since 3.1.0
*/
public void setUsageType(TString value) {
        this.usageType = value;
    }

/**
Determine if the UsageType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetUsageType() {
return (this.usageType!= null ? this.usageType.isSetValue() : false);
    }

/**
Get the date by which the frequency assignment or Spectrum Supportability Reply is required by the user in order to complete necessary advanced operation coordination.

@return the DateResponseRequired value in a {@link TD} data type
@since 3.1.0
*/
public D getDateResponseRequired() {
        return dateResponseRequired;
    }

/**
Set the date by which the frequency assignment or Spectrum Supportability Reply is required by the user in order to complete necessary advanced operation coordination.

@param value the DateResponseRequired value in a {@link TD} data type
@since 3.1.0
*/
public void setDateResponseRequired(D value) {
        this.dateResponseRequired = value;
    }

/**
Determine if the DateResponseRequired is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDateResponseRequired() {
        return (this.dateResponseRequired!= null);
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
Get the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@return the ReviewDate value in a {@link TD} data type
@since 3.1.0
*/
public D getReviewDate() {
        return reviewDate;
    }

/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

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
Get any amplifying information on the requirement.

@return the Requirement value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getRequirement() {
        return requirement;
    }

/**
Set any amplifying information on the requirement.

@param value the Requirement value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setRequirement(MEMO value) {
        this.requirement = value;
    }

/**
Determine if the Requirement is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRequirement() {
        return (this.requirement!= null);
    }

/**
Get the Project

Complex element Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other project name associated to the dataset.

@return  a {@link Project} instance
@since 3.1.0
*/
    public Set<Project> getProject() {
        if (project == null) {
            project = new HashSet<Project>();
        }
        return this.project;
    }

/**
Determine if the Project is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetProject() {
        return ((this.project!= null)&&(!this.project.isEmpty()));
    }

/**
  Clear the Project field. This sets the field to null.
 */
    public void unsetProject() {
        this.project = null;
    }

/**
Get the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@return  a {@link POCInformation} instance
@since 3.1.0
*/
    public Set<POCInformation> getPOCInformation() {
        if (pocInformation == null) {
            pocInformation = new HashSet<POCInformation>();
        }
        return this.pocInformation;
    }

/**
Determine if the POCInformation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPOCInformation() {
        return ((this.pocInformation!= null)&&(!this.pocInformation.isEmpty()));
    }

/**
  Clear the POCInformation field. This sets the field to null.
 */
    public void unsetPOCInformation() {
        this.pocInformation = null;
    }

/**
Get the LocationRef

Complex element LocationRef references a Location dataset.

@return  a {@link Serial} instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getLocation()} instead.
*/
@Deprecated
    public Set<Serial> getLocationRef() {
        if (locationRef == null) {
            locationRef = new HashSet<Serial>();
        }
        return this.locationRef;
    }

/**
Determine if the LocationRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLocationRef() {
        return ((this.locationRef!= null)&&(!this.locationRef.isEmpty()));
    }

/**
  Clear the LocationRef field. This sets the field to null.
 */
    public void unsetLocationRef() {
        this.locationRef = null;
    }

/**
Get the Emission

Complex element Emission defines the limits of the authorized bandwidth and power within the allotment.

@return  a {@link Emission} instance
@since 3.1.0
*/
    public Set<Emission> getEmission() {
        if (emission == null) {
            emission = new HashSet<Emission>();
        }
        return this.emission;
    }

/**
Determine if the Emission is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEmission() {
        return ((this.emission!= null)&&(!this.emission.isEmpty()));
    }

/**
  Clear the Emission field. This sets the field to null.
 */
    public void unsetEmission() {
        this.emission = null;
    }

/**
Get the AllotFreq

Complex element AllotFreq defines a frequency or range of frequencies belonging to the Allotment.

@return  a {@link AllotFreq} instance
@since 3.1.0
*/
    public Set<AllotFreq> getAllotFreq() {
        if (allotFreq == null) {
            allotFreq = new HashSet<AllotFreq>();
        }
        return this.allotFreq;
    }

/**
Determine if the AllotFreq is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAllotFreq() {
        return ((this.allotFreq!= null)&&(!this.allotFreq.isEmpty()));
    }

/**
  Clear the AllotFreq field. This sets the field to null.
 */
    public void unsetAllotFreq() {
        this.allotFreq = null;
    }

/**
Set an identifying name for this Allotment or Assignment.

@param value  An instances of type {@link String}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withTitle(String value) {
           setTitle(new S100(value));
        return this;
    }

/**
Set the type of assignment request or approved assignment/allotment. In Data Item case of a rejected or cancelled assignment/allotment, use an associated Remarks to indicate the reason.

@param value  An instances of type {@link ListCUT}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withUsageType(ListCUT value) {
           setUsageType(new TString(value.value()));
        return this;
    }

/**
Set the date by which the frequency assignment or Spectrum Supportability Reply is required by the user in order to complete necessary advanced operation coordination.

@param value  An instances of type {@link Calendar}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withDateResponseRequired(Calendar value) {
           setDateResponseRequired(new D(value));
        return this;
    }
/**
Set the date by which the frequency assignment or Spectrum Supportability Reply is required by the user in order to complete necessary advanced operation coordination.

@param value  An instances of type {@link Date}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withDateResponseRequired(Date value) {
           setDateResponseRequired(new D(value));
        return this;
    }

/**
Set the date by which the dataset is to be operational or effective.

@param value  An instances of type {@link TD}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withEffectiveDate(TD value) {
        return this;
    }

/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value  An instances of type {@link Calendar}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withExpirationDate(Calendar value) {
           setExpirationDate(new D(value));
        return this;
    }
/**
Set the date at which the dataset will expire. The Expiration date should be less than five years from current date.

@param value  An instances of type {@link Date}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withExpirationDate(Date value) {
           setExpirationDate(new D(value));
        return this;
    }

/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Calendar}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withReviewDate(Calendar value) {
           setReviewDate(new D(value));
        return this;
    }
/**
Set the date by which the dataset is to be reviewed. The Review date should be less than five years from the effective date. In Data Item Spectrum Supportability datasets, this date indicate when the organisation responsible for re-initiating host coordination plans to resubmit a Spectrum Supportability request to the host nation for continued use of the equipment.

@param value  An instances of type {@link Date}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withReviewDate(Date value) {
           setReviewDate(new D(value));
        return this;
    }

/**
Set any amplifying information on the requirement.

@param value  An instances of type {@link String}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withRequirement(String value) {
           setRequirement(new MEMO(value));
        return this;
    }

/**
Set the Project

Complex element Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other project name associated to the dataset.

@param values  One or more instances of type {@link Project...}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withProject(Project... values) {
        if (values!= null) {
            for (Project value: values) {
                getProject().add(value);
            }
        }
        return this;
    }

/**
Set the Project

Complex element Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other project name associated to the dataset.

@param values  A collection of {@link Project} instances
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withProject(Collection<Project> values) {
        if (values!= null) {
            getProject().addAll(values);
        }
        return this;
    }

/**
Set the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@param values  One or more instances of type {@link POCInformation...}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withPOCInformation(POCInformation... values) {
        if (values!= null) {
            for (POCInformation value: values) {
                getPOCInformation().add(value);
            }
        }
        return this;
    }

/**
Set the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@param values  A collection of {@link POCInformation} instances
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withPOCInformation(Collection<POCInformation> values) {
        if (values!= null) {
            getPOCInformation().addAll(values);
        }
        return this;
    }

/**
Set the LocationRef

Complex element LocationRef references a Location dataset.

@param values  One or more instances of type {@link LocationRef...}
@return The current Allotment object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withLocation(Location...)} instead.
*/
@Deprecated
    public Allotment withLocationRef(Serial... values) {
        if (values!= null) {
            for (LocationRef value: values) {
                getLocationRef().add(value);
            }
        }
        return this;
    }

/**
Set the LocationRef

Complex element LocationRef references a Location dataset.

@param values  A collection of {@link Serial} instances
@return The current Allotment object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withLocation(Location...)} instead.
*/
@Deprecated
    public Allotment withLocationRef(Collection<Serial> values) {
        if (values!= null) {
            getLocationRef().addAll(values);
        }
        return this;
    }

/**
Set the Emission

Complex element Emission defines the limits of the authorized bandwidth and power within the allotment.

@param values  One or more instances of type {@link Emission...}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withEmission(Emission... values) {
        if (values!= null) {
            for (Emission value: values) {
                getEmission().add(value);
            }
        }
        return this;
    }

/**
Set the Emission

Complex element Emission defines the limits of the authorized bandwidth and power within the allotment.

@param values  A collection of {@link Emission} instances
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withEmission(Collection<Emission> values) {
        if (values!= null) {
            getEmission().addAll(values);
        }
        return this;
    }

/**
Set the AllotFreq

Complex element AllotFreq defines a frequency or range of frequencies belonging to the Allotment.

@param values  One or more instances of type {@link AllotFreq...}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withAllotFreq(AllotFreq... values) {
        if (values!= null) {
            for (AllotFreq value: values) {
                getAllotFreq().add(value);
            }
        }
        return this;
    }

/**
Set the AllotFreq

Complex element AllotFreq defines a frequency or range of frequencies belonging to the Allotment.

@param values  A collection of {@link AllotFreq} instances
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withAllotFreq(Collection<AllotFreq> values) {
        if (values!= null) {
            getAllotFreq().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withCaseNum(CaseNum... values) {
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
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withRemarks(Remarks... values) {
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
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withReleasability(ListCCY... values) {
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
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withRemarkRef(BigInteger... values) {
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
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withExtReferences(BigInteger... values) {
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
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current Allotment object instance
@since 3.1.0
*/
    public Allotment withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this Allotment instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Allotment {"
 + (allotFreq !=null? " allotFreq [" + allotFreq +"]" : "") 
 + (dateResponseRequired !=null? " dateResponseRequired [" + dateResponseRequired +"]" : "") 
 + (effectiveDate !=null? " effectiveDate [" + effectiveDate +"]" : "") 
 + (emission !=null? " emission [" + emission +"]" : "") 
 + (expirationDate !=null? " expirationDate [" + expirationDate +"]" : "") 
 + (locationRef !=null? " locationRef [" + locationRef +"]" : "") 
 + (pocInformation !=null? " pocInformation [" + pocInformation +"]" : "") 
 + (project !=null? " project [" + project +"]" : "") 
 + (requirement !=null? " requirement [" + requirement +"]" : "") 
 + (reviewDate !=null? " reviewDate [" + reviewDate +"]" : "") 
 + (title !=null? " title [" + title +"]" : "") 
 + (usageType !=null? " usageType [" + usageType +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Allotment} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link Set<AllotFreq> AllotFreq}, {@link D EffectiveDate}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetAllotFreq() &&  isSetEffectiveDate();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
LocationRef (Required)

LocationRef references a Location dataset.
@since 3.1.0
*/
@XmlTransient
private Set<Location> location;

/**
Get the LocationRef

Complex element LocationRef references a Location dataset.

@return  a {@link Location} instance
@since 3.1.0
*/
public Set<Location> getLocation(){
if(location == null){
location = new HashSet<>();
}
 return location;
}
/**
 Determine if the location field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetLocation() {
return this.location !=null  && !this.location.isEmpty();
}

/**
Set the LocationRef

Complex element LocationRef references a Location dataset.

@param values  An instances of type {@link Location}
@return The current Allotment object instance
@since 3.1.0
*/
public Allotment withLocation(Location... values) {
return  withLocation(Arrays.asList(values));
}

/**
Set the LocationRef

Complex element LocationRef references a Location dataset.

@param values  An instances of type {@link Location}
@return The current Allotment object instance
@since 3.1.0
*/
public Allotment withLocation(Collection<Location> values) {
getLocation().addAll(values);
return this;
}
  /**
   * Update the SSRF data type references in this Allotment record.
   * <p>
 @since 3.1.0 */
  @Override
public void prepare() {
super.prepare();
this.locationRef= new ArrayList<>();
for (Location instance :  getLocation()) {
this.locationRef.add(instance.getSerial());
}

/**
   * Update the SSRF data type references in this Allotment record after loading from XML.

   * This method builds the transient {@link #location} with values
   * from the imported {@link #locationRef} field. This method should
   * typically be called after the Allotment is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (locationRef==null || locationRef.isEmpty() ) {return;}
for(Location instance : root.getLocation()) {
if(locationRef.contains(instance.getSerial())){
location.add(instance);
}
}}//</editor-fold>

}
