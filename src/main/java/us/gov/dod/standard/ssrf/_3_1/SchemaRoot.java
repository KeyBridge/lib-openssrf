package us.gov.dod.standard.ssrf._3_1;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
SchemaRoot is the root element for any SSRF-XML message. It contains attributes defining the namespace used. Any SSRF-XML message may contain any number of datasets.

Example: <pre>
* &lt;SSRF&gt;
*   &lt;Datasets_here/&gt;
*   &lt;/SSRF&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchemaRoot", propOrder = {
    "contact",
    "role",
    "organisation",
    "externalReference",
    "administrative",
    "location",
    "channelPlan",
    "toa",
    "transmitter",
    "receiver",
    "antenna",
    "rfSystem",
    "ssRequest",
    "ssReply",
    "allotment",
    "assignment",
    "satellite",
    "intfReport",
    "jrfl",
    "forceElement",
    "feDeployment",
    "message",
    "note",
    "loadset",
    "radiationPlan"
})
public class SchemaRoot {

    @XmlElement(name = "Contact")
      private  Set<Contact> contact;

    @XmlElement(name = "Role")
      private  Set<Role> role;

    @XmlElement(name = "Organisation")
      private  Set<Organisation> organisation;

    @XmlElement(name = "ExternalReference")
      private  Set<ExternalReference> externalReference;

    @XmlElement(name = "Administrative")
      private  Set<Administrative> administrative;

    @XmlElement(name = "Location")
      private  Set<Location> location;

    @XmlElement(name = "ChannelPlan")
      private  Set<ChannelPlan> channelPlan;

    @XmlElement(name = "TOA")
      private  Set<TOA> toa;

    @XmlElement(name = "Transmitter")
      private  Set<Transmitter> transmitter;

    @XmlElement(name = "Receiver")
      private  Set<Receiver> receiver;

    @XmlElement(name = "Antenna")
      private  Set<Antenna> antenna;

    @XmlElement(name = "RFSystem")
      private  Set<RFSystem> rfSystem;

    @XmlElement(name = "SSRequest")
      private  Set<SSRequest> ssRequest;

    @XmlElement(name = "SSReply")
      private  Set<SSReply> ssReply;

    @XmlElement(name = "Allotment")
      private  Set<Allotment> allotment;

    @XmlElement(name = "Assignment")
      private  Set<Assignment> assignment;

    @XmlElement(name = "Satellite")
      private  Set<Satellite> satellite;

    @XmlElement(name = "IntfReport")
      private  Set<IntfReport> intfReport;

    @XmlElement(name = "JRFL")
      private  Set<JRFL> jrfl;

    @XmlElement(name = "ForceElement")
      private  Set<ForceElement> forceElement;

    @XmlElement(name = "FEDeployment")
      private  Set<FEDeployment> feDeployment;

    @XmlElement(name = "Message")
      private  Set<Message> message;

    @XmlElement(name = "Note")
      private  Set<Note> note;

    @XmlElement(name = "Loadset")
      private  Set<Loadset> loadset;

    @XmlElement(name = "RadiationPlan")
      private  Set<RadiationPlan> radiationPlan;

/**
Get 

@return  a {@link Contact} instance
@since 3.1.0
*/
    public Set<Contact> getContact() {
        if (contact == null) {
            contact = new HashSet<Contact>();
        }
        return this.contact;
    }

/**
Determine if the Contact is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetContact() {
        return ((this.contact!= null)&&(!this.contact.isEmpty()));
    }

/**
  Clear the Contact field. This sets the field to null.
 */
    public void unsetContact() {
        this.contact = null;
    }

/**
Get 

@return  a {@link Role} instance
@since 3.1.0
*/
    public Set<Role> getRole() {
        if (role == null) {
            role = new HashSet<Role>();
        }
        return this.role;
    }

/**
Determine if the Role is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRole() {
        return ((this.role!= null)&&(!this.role.isEmpty()));
    }

/**
  Clear the Role field. This sets the field to null.
 */
    public void unsetRole() {
        this.role = null;
    }

/**
Get 

@return  a {@link Organisation} instance
@since 3.1.0
*/
    public Set<Organisation> getOrganisation() {
        if (organisation == null) {
            organisation = new HashSet<Organisation>();
        }
        return this.organisation;
    }

/**
Determine if the Organisation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOrganisation() {
        return ((this.organisation!= null)&&(!this.organisation.isEmpty()));
    }

/**
  Clear the Organisation field. This sets the field to null.
 */
    public void unsetOrganisation() {
        this.organisation = null;
    }

/**
Get 

@return  a {@link ExternalReference} instance
@since 3.1.0
*/
    public Set<ExternalReference> getExternalReference() {
        if (externalReference == null) {
            externalReference = new HashSet<ExternalReference>();
        }
        return this.externalReference;
    }

/**
Determine if the ExternalReference is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetExternalReference() {
        return ((this.externalReference!= null)&&(!this.externalReference.isEmpty()));
    }

/**
  Clear the ExternalReference field. This sets the field to null.
 */
    public void unsetExternalReference() {
        this.externalReference = null;
    }

/**
Get 

@return  a {@link Administrative} instance
@since 3.1.0
*/
    public Set<Administrative> getAdministrative() {
        if (administrative == null) {
            administrative = new HashSet<Administrative>();
        }
        return this.administrative;
    }

/**
Determine if the Administrative is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAdministrative() {
        return ((this.administrative!= null)&&(!this.administrative.isEmpty()));
    }

/**
  Clear the Administrative field. This sets the field to null.
 */
    public void unsetAdministrative() {
        this.administrative = null;
    }

/**
Get 

@return  a {@link Location} instance
@since 3.1.0
*/
    public Set<Location> getLocation() {
        if (location == null) {
            location = new HashSet<Location>();
        }
        return this.location;
    }

/**
Determine if the Location is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLocation() {
        return ((this.location!= null)&&(!this.location.isEmpty()));
    }

/**
  Clear the Location field. This sets the field to null.
 */
    public void unsetLocation() {
        this.location = null;
    }

/**
Get 

@return  a {@link ChannelPlan} instance
@since 3.1.0
*/
    public Set<ChannelPlan> getChannelPlan() {
        if (channelPlan == null) {
            channelPlan = new HashSet<ChannelPlan>();
        }
        return this.channelPlan;
    }

/**
Determine if the ChannelPlan is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetChannelPlan() {
        return ((this.channelPlan!= null)&&(!this.channelPlan.isEmpty()));
    }

/**
  Clear the ChannelPlan field. This sets the field to null.
 */
    public void unsetChannelPlan() {
        this.channelPlan = null;
    }

/**
Get 

@return  a {@link TOA} instance
@since 3.1.0
*/
    public Set<TOA> getTOA() {
        if (toa == null) {
            toa = new HashSet<TOA>();
        }
        return this.toa;
    }

/**
Determine if the TOA is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTOA() {
        return ((this.toa!= null)&&(!this.toa.isEmpty()));
    }

/**
  Clear the TOA field. This sets the field to null.
 */
    public void unsetTOA() {
        this.toa = null;
    }

/**
Get 

@return  a {@link Transmitter} instance
@since 3.1.0
*/
    public Set<Transmitter> getTransmitter() {
        if (transmitter == null) {
            transmitter = new HashSet<Transmitter>();
        }
        return this.transmitter;
    }

/**
Determine if the Transmitter is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTransmitter() {
        return ((this.transmitter!= null)&&(!this.transmitter.isEmpty()));
    }

/**
  Clear the Transmitter field. This sets the field to null.
 */
    public void unsetTransmitter() {
        this.transmitter = null;
    }

/**
Get 

@return  a {@link Receiver} instance
@since 3.1.0
*/
    public Set<Receiver> getReceiver() {
        if (receiver == null) {
            receiver = new HashSet<Receiver>();
        }
        return this.receiver;
    }

/**
Determine if the Receiver is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetReceiver() {
        return ((this.receiver!= null)&&(!this.receiver.isEmpty()));
    }

/**
  Clear the Receiver field. This sets the field to null.
 */
    public void unsetReceiver() {
        this.receiver = null;
    }

/**
Get 

@return  a {@link Antenna} instance
@since 3.1.0
*/
    public Set<Antenna> getAntenna() {
        if (antenna == null) {
            antenna = new HashSet<Antenna>();
        }
        return this.antenna;
    }

/**
Determine if the Antenna is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAntenna() {
        return ((this.antenna!= null)&&(!this.antenna.isEmpty()));
    }

/**
  Clear the Antenna field. This sets the field to null.
 */
    public void unsetAntenna() {
        this.antenna = null;
    }

/**
Get 

@return  a {@link RFSystem} instance
@since 3.1.0
*/
    public Set<RFSystem> getRFSystem() {
        if (rfSystem == null) {
            rfSystem = new HashSet<RFSystem>();
        }
        return this.rfSystem;
    }

/**
Determine if the RFSystem is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRFSystem() {
        return ((this.rfSystem!= null)&&(!this.rfSystem.isEmpty()));
    }

/**
  Clear the RFSystem field. This sets the field to null.
 */
    public void unsetRFSystem() {
        this.rfSystem = null;
    }

/**
Get 

@return  a {@link SSRequest} instance
@since 3.1.0
*/
    public Set<SSRequest> getSSRequest() {
        if (ssRequest == null) {
            ssRequest = new HashSet<SSRequest>();
        }
        return this.ssRequest;
    }

/**
Determine if the SSRequest is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSSRequest() {
        return ((this.ssRequest!= null)&&(!this.ssRequest.isEmpty()));
    }

/**
  Clear the SSRequest field. This sets the field to null.
 */
    public void unsetSSRequest() {
        this.ssRequest = null;
    }

/**
Get 

@return  a {@link SSReply} instance
@since 3.1.0
*/
    public Set<SSReply> getSSReply() {
        if (ssReply == null) {
            ssReply = new HashSet<SSReply>();
        }
        return this.ssReply;
    }

/**
Determine if the SSReply is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSSReply() {
        return ((this.ssReply!= null)&&(!this.ssReply.isEmpty()));
    }

/**
  Clear the SSReply field. This sets the field to null.
 */
    public void unsetSSReply() {
        this.ssReply = null;
    }

/**
Get 

@return  a {@link Allotment} instance
@since 3.1.0
*/
    public Set<Allotment> getAllotment() {
        if (allotment == null) {
            allotment = new HashSet<Allotment>();
        }
        return this.allotment;
    }

/**
Determine if the Allotment is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAllotment() {
        return ((this.allotment!= null)&&(!this.allotment.isEmpty()));
    }

/**
  Clear the Allotment field. This sets the field to null.
 */
    public void unsetAllotment() {
        this.allotment = null;
    }

/**
Get 

@return  a {@link Assignment} instance
@since 3.1.0
*/
    public Set<Assignment> getAssignment() {
        if (assignment == null) {
            assignment = new HashSet<Assignment>();
        }
        return this.assignment;
    }

/**
Determine if the Assignment is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAssignment() {
        return ((this.assignment!= null)&&(!this.assignment.isEmpty()));
    }

/**
  Clear the Assignment field. This sets the field to null.
 */
    public void unsetAssignment() {
        this.assignment = null;
    }

/**
Get 

@return  a {@link Satellite} instance
@since 3.1.0
*/
    public Set<Satellite> getSatellite() {
        if (satellite == null) {
            satellite = new HashSet<Satellite>();
        }
        return this.satellite;
    }

/**
Determine if the Satellite is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSatellite() {
        return ((this.satellite!= null)&&(!this.satellite.isEmpty()));
    }

/**
  Clear the Satellite field. This sets the field to null.
 */
    public void unsetSatellite() {
        this.satellite = null;
    }

/**
Get 

@return  a {@link IntfReport} instance
@since 3.1.0
*/
    public Set<IntfReport> getIntfReport() {
        if (intfReport == null) {
            intfReport = new HashSet<IntfReport>();
        }
        return this.intfReport;
    }

/**
Determine if the IntfReport is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIntfReport() {
        return ((this.intfReport!= null)&&(!this.intfReport.isEmpty()));
    }

/**
  Clear the IntfReport field. This sets the field to null.
 */
    public void unsetIntfReport() {
        this.intfReport = null;
    }

/**
Get 

@return  a {@link JRFL} instance
@since 3.1.0
*/
    public Set<JRFL> getJRFL() {
        if (jrfl == null) {
            jrfl = new HashSet<JRFL>();
        }
        return this.jrfl;
    }

/**
Determine if the JRFL is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetJRFL() {
        return ((this.jrfl!= null)&&(!this.jrfl.isEmpty()));
    }

/**
  Clear the JRFL field. This sets the field to null.
 */
    public void unsetJRFL() {
        this.jrfl = null;
    }

/**
Get 

@return  a {@link ForceElement} instance
@since 3.1.0
*/
    public Set<ForceElement> getForceElement() {
        if (forceElement == null) {
            forceElement = new HashSet<ForceElement>();
        }
        return this.forceElement;
    }

/**
Determine if the ForceElement is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetForceElement() {
        return ((this.forceElement!= null)&&(!this.forceElement.isEmpty()));
    }

/**
  Clear the ForceElement field. This sets the field to null.
 */
    public void unsetForceElement() {
        this.forceElement = null;
    }

/**
Get 

@return  a {@link FEDeployment} instance
@since 3.1.0
*/
    public Set<FEDeployment> getFEDeployment() {
        if (feDeployment == null) {
            feDeployment = new HashSet<FEDeployment>();
        }
        return this.feDeployment;
    }

/**
Determine if the FEDeployment is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFEDeployment() {
        return ((this.feDeployment!= null)&&(!this.feDeployment.isEmpty()));
    }

/**
  Clear the FEDeployment field. This sets the field to null.
 */
    public void unsetFEDeployment() {
        this.feDeployment = null;
    }

/**
Get 

@return  a {@link Message} instance
@since 3.1.0
*/
    public Set<Message> getMessage() {
        if (message == null) {
            message = new HashSet<Message>();
        }
        return this.message;
    }

/**
Determine if the Message is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMessage() {
        return ((this.message!= null)&&(!this.message.isEmpty()));
    }

/**
  Clear the Message field. This sets the field to null.
 */
    public void unsetMessage() {
        this.message = null;
    }

/**
Get 

@return  a {@link Note} instance
@since 3.1.0
*/
    public Set<Note> getNote() {
        if (note == null) {
            note = new HashSet<Note>();
        }
        return this.note;
    }

/**
Determine if the Note is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNote() {
        return ((this.note!= null)&&(!this.note.isEmpty()));
    }

/**
  Clear the Note field. This sets the field to null.
 */
    public void unsetNote() {
        this.note = null;
    }

/**
Get 

@return  a {@link Loadset} instance
@since 3.1.0
*/
    public Set<Loadset> getLoadset() {
        if (loadset == null) {
            loadset = new HashSet<Loadset>();
        }
        return this.loadset;
    }

/**
Determine if the Loadset is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLoadset() {
        return ((this.loadset!= null)&&(!this.loadset.isEmpty()));
    }

/**
  Clear the Loadset field. This sets the field to null.
 */
    public void unsetLoadset() {
        this.loadset = null;
    }

/**
Get 

@return  a {@link RadiationPlan} instance
@since 3.1.0
*/
    public Set<RadiationPlan> getRadiationPlan() {
        if (radiationPlan == null) {
            radiationPlan = new HashSet<RadiationPlan>();
        }
        return this.radiationPlan;
    }

/**
Determine if the RadiationPlan is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRadiationPlan() {
        return ((this.radiationPlan!= null)&&(!this.radiationPlan.isEmpty()));
    }

/**
  Clear the RadiationPlan field. This sets the field to null.
 */
    public void unsetRadiationPlan() {
        this.radiationPlan = null;
    }

/**
Set 

@param values  One or more instances of type {@link Contact...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withContact(Contact... values) {
        if (values!= null) {
            for (Contact value: values) {
                getContact().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link Contact} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withContact(Collection<Contact> values) {
        if (values!= null) {
            getContact().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link Role...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withRole(Role... values) {
        if (values!= null) {
            for (Role value: values) {
                getRole().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link Role} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withRole(Collection<Role> values) {
        if (values!= null) {
            getRole().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link Organisation...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withOrganisation(Organisation... values) {
        if (values!= null) {
            for (Organisation value: values) {
                getOrganisation().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link Organisation} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withOrganisation(Collection<Organisation> values) {
        if (values!= null) {
            getOrganisation().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link ExternalReference...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withExternalReference(ExternalReference... values) {
        if (values!= null) {
            for (ExternalReference value: values) {
                getExternalReference().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link ExternalReference} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withExternalReference(Collection<ExternalReference> values) {
        if (values!= null) {
            getExternalReference().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link Administrative...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withAdministrative(Administrative... values) {
        if (values!= null) {
            for (Administrative value: values) {
                getAdministrative().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link Administrative} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withAdministrative(Collection<Administrative> values) {
        if (values!= null) {
            getAdministrative().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link Location...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withLocation(Location... values) {
        if (values!= null) {
            for (Location value: values) {
                getLocation().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link Location} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withLocation(Collection<Location> values) {
        if (values!= null) {
            getLocation().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link ChannelPlan...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withChannelPlan(ChannelPlan... values) {
        if (values!= null) {
            for (ChannelPlan value: values) {
                getChannelPlan().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link ChannelPlan} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withChannelPlan(Collection<ChannelPlan> values) {
        if (values!= null) {
            getChannelPlan().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link TOA...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withTOA(TOA... values) {
        if (values!= null) {
            for (TOA value: values) {
                getTOA().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link TOA} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withTOA(Collection<TOA> values) {
        if (values!= null) {
            getTOA().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link Transmitter...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withTransmitter(Transmitter... values) {
        if (values!= null) {
            for (Transmitter value: values) {
                getTransmitter().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link Transmitter} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withTransmitter(Collection<Transmitter> values) {
        if (values!= null) {
            getTransmitter().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link Receiver...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withReceiver(Receiver... values) {
        if (values!= null) {
            for (Receiver value: values) {
                getReceiver().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link Receiver} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withReceiver(Collection<Receiver> values) {
        if (values!= null) {
            getReceiver().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link Antenna...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withAntenna(Antenna... values) {
        if (values!= null) {
            for (Antenna value: values) {
                getAntenna().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link Antenna} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withAntenna(Collection<Antenna> values) {
        if (values!= null) {
            getAntenna().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link RFSystem...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withRFSystem(RFSystem... values) {
        if (values!= null) {
            for (RFSystem value: values) {
                getRFSystem().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link RFSystem} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withRFSystem(Collection<RFSystem> values) {
        if (values!= null) {
            getRFSystem().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link SSRequest...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withSSRequest(SSRequest... values) {
        if (values!= null) {
            for (SSRequest value: values) {
                getSSRequest().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link SSRequest} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withSSRequest(Collection<SSRequest> values) {
        if (values!= null) {
            getSSRequest().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link SSReply...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withSSReply(SSReply... values) {
        if (values!= null) {
            for (SSReply value: values) {
                getSSReply().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link SSReply} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withSSReply(Collection<SSReply> values) {
        if (values!= null) {
            getSSReply().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link Allotment...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withAllotment(Allotment... values) {
        if (values!= null) {
            for (Allotment value: values) {
                getAllotment().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link Allotment} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withAllotment(Collection<Allotment> values) {
        if (values!= null) {
            getAllotment().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link Assignment...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withAssignment(Assignment... values) {
        if (values!= null) {
            for (Assignment value: values) {
                getAssignment().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link Assignment} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withAssignment(Collection<Assignment> values) {
        if (values!= null) {
            getAssignment().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link Satellite...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withSatellite(Satellite... values) {
        if (values!= null) {
            for (Satellite value: values) {
                getSatellite().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link Satellite} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withSatellite(Collection<Satellite> values) {
        if (values!= null) {
            getSatellite().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link IntfReport...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withIntfReport(IntfReport... values) {
        if (values!= null) {
            for (IntfReport value: values) {
                getIntfReport().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link IntfReport} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withIntfReport(Collection<IntfReport> values) {
        if (values!= null) {
            getIntfReport().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link JRFL...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withJRFL(JRFL... values) {
        if (values!= null) {
            for (JRFL value: values) {
                getJRFL().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link JRFL} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withJRFL(Collection<JRFL> values) {
        if (values!= null) {
            getJRFL().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link ForceElement...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withForceElement(ForceElement... values) {
        if (values!= null) {
            for (ForceElement value: values) {
                getForceElement().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link ForceElement} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withForceElement(Collection<ForceElement> values) {
        if (values!= null) {
            getForceElement().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link FEDeployment...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withFEDeployment(FEDeployment... values) {
        if (values!= null) {
            for (FEDeployment value: values) {
                getFEDeployment().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link FEDeployment} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withFEDeployment(Collection<FEDeployment> values) {
        if (values!= null) {
            getFEDeployment().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link Message...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withMessage(Message... values) {
        if (values!= null) {
            for (Message value: values) {
                getMessage().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link Message} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withMessage(Collection<Message> values) {
        if (values!= null) {
            getMessage().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link Note...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withNote(Note... values) {
        if (values!= null) {
            for (Note value: values) {
                getNote().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link Note} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withNote(Collection<Note> values) {
        if (values!= null) {
            getNote().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link Loadset...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withLoadset(Loadset... values) {
        if (values!= null) {
            for (Loadset value: values) {
                getLoadset().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link Loadset} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withLoadset(Collection<Loadset> values) {
        if (values!= null) {
            getLoadset().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link RadiationPlan...}
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withRadiationPlan(RadiationPlan... values) {
        if (values!= null) {
            for (RadiationPlan value: values) {
                getRadiationPlan().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link RadiationPlan} instances
@return The current SchemaRoot object instance
@since 3.1.0
*/
    public SchemaRoot withRadiationPlan(Collection<RadiationPlan> values) {
        if (values!= null) {
            getRadiationPlan().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this SchemaRoot instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "SchemaRoot {"
 + (administrative !=null? " administrative [" + administrative +"]" : "") 
 + (allotment !=null? " allotment [" + allotment +"]" : "") 
 + (antenna !=null? " antenna [" + antenna +"]" : "") 
 + (assignment !=null? " assignment [" + assignment +"]" : "") 
 + (channelPlan !=null? " channelPlan [" + channelPlan +"]" : "") 
 + (contact !=null? " contact [" + contact +"]" : "") 
 + (externalReference !=null? " externalReference [" + externalReference +"]" : "") 
 + (feDeployment !=null? " feDeployment [" + feDeployment +"]" : "") 
 + (forceElement !=null? " forceElement [" + forceElement +"]" : "") 
 + (intfReport !=null? " intfReport [" + intfReport +"]" : "") 
 + (jrfl !=null? " jrfl [" + jrfl +"]" : "") 
 + (loadset !=null? " loadset [" + loadset +"]" : "") 
 + (location !=null? " location [" + location +"]" : "") 
 + (message !=null? " message [" + message +"]" : "") 
 + (note !=null? " note [" + note +"]" : "") 
 + (organisation !=null? " organisation [" + organisation +"]" : "") 
 + (radiationPlan !=null? " radiationPlan [" + radiationPlan +"]" : "") 
 + (receiver !=null? " receiver [" + receiver +"]" : "") 
 + (rfSystem !=null? " rfSystem [" + rfSystem +"]" : "") 
 + (role !=null? " role [" + role +"]" : "") 
 + (satellite !=null? " satellite [" + satellite +"]" : "") 
 + (ssReply !=null? " ssReply [" + ssReply +"]" : "") 
 + (ssRequest !=null? " ssRequest [" + ssRequest +"]" : "") 
 + (toa !=null? " toa [" + toa +"]" : "") 
 + (transmitter !=null? " transmitter [" + transmitter +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link SchemaRoot} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
