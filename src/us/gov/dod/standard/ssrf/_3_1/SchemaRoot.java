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
package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * SchemaRoot is the root element for any SSRF-XML message. It contains
 * attributes defining the namespace used. Any SSRF-XML message may contain any
 * number of datasets.
 * <p>
 * Example:
 * <pre>
 * &lt;SSRF&gt;
 *   &lt;Datasets_here/&gt;
 *   &lt;/SSRF&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 * @param <T> the root class type implementing this schema
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
@SuppressWarnings("unchecked")
public abstract class SchemaRoot<T> {

  @XmlElement(name = "Administrative")
  protected Set<Administrative> administrative;
  @XmlElement(name = "Allotment")
  protected Set<Allotment> allotment;
  @XmlElement(name = "Antenna")
  protected Set<Antenna> antenna;
  @XmlElement(name = "Assignment")
  protected Set<Assignment> assignment;
  @XmlElement(name = "ChannelPlan")
  protected Set<ChannelPlan> channelPlan;
  @XmlElement(name = "Contact")
  protected Set<Contact> contact;
  @XmlElement(name = "ExternalReference")
  protected Set<ExternalReference> externalReference;
  @XmlElement(name = "FEDeployment")
  protected Set<FEDeployment> feDeployment;
  @XmlElement(name = "ForceElement")
  protected Set<ForceElement> forceElement;
  @XmlElement(name = "IntfReport")
  protected Set<IntfReport> intfReport;
  @XmlElement(name = "JRFL")
  protected Set<JRFL> jrfl;
  @XmlElement(name = "Loadset")
  protected Set<Loadset> loadset;
  @XmlElement(name = "Location")
  protected Set<Location> location;
  @XmlElement(name = "Message")
  protected Set<Message> message;
  @XmlElement(name = "Note")
  protected Set<Note> note;
  @XmlElement(name = "Organisation")
  protected Set<Organisation> organisation;
  @XmlElement(name = "RFSystem")
  protected Set<RFSystem> rfSystem;
  @XmlElement(name = "RadiationPlan")
  protected Set<RadiationPlan> radiationPlan;
  @XmlElement(name = "Receiver")
  protected Set<Receiver> receiver;
  @XmlElement(name = "Role")
  protected Set<Role> role;
  @XmlElement(name = "SSReply")
  protected Set<SSReply> ssReply;
  @XmlElement(name = "SSRequest")
  protected Set<SSRequest> ssRequest;
  @XmlElement(name = "Satellite")
  protected Set<Satellite> satellite;
  @XmlElement(name = "TOA")
  protected Set<TOA> toa;
  @XmlElement(name = "Transmitter")
  protected Set<Transmitter> transmitter;

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link Contact} instances
   */
  public Set<Contact> getContact() {
    if (contact == null) {
      contact = new HashSet<>();
    }
    return this.contact;
  }

  /**
   * Determine if the Contact is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetContact() {
    return ((this.contact != null) && (!this.contact.isEmpty()));
  }

  /**
   * Clear the Contact field. This sets the field to null.
   */
  public void unsetContact() {
    this.contact = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link Role} instances
   */
  public Set<Role> getRole() {
    if (role == null) {
      role = new HashSet<>();
    }
    return this.role;
  }

  /**
   * Determine if the Role is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRole() {
    return ((this.role != null) && (!this.role.isEmpty()));
  }

  /**
   * Clear the Role field. This sets the field to null.
   */
  public void unsetRole() {
    this.role = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link Organisation}
   *         instances
   */
  public Set<Organisation> getOrganisation() {
    if (organisation == null) {
      organisation = new HashSet<>();
    }
    return this.organisation;
  }

  /**
   * Determine if the Organisation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOrganisation() {
    return ((this.organisation != null) && (!this.organisation.isEmpty()));
  }

  /**
   * Clear the Organisation field. This sets the field to null.
   */
  public void unsetOrganisation() {
    this.organisation = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link ExternalReference}
   *         instances
   */
  public Set<ExternalReference> getExternalReference() {
    if (externalReference == null) {
      externalReference = new HashSet<>();
    }
    return this.externalReference;
  }

  /**
   * Determine if the ExternalReference is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExternalReference() {
    return ((this.externalReference != null) && (!this.externalReference.isEmpty()));
  }

  /**
   * Clear the ExternalReference field. This sets the field to null.
   */
  public void unsetExternalReference() {
    this.externalReference = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link Administrative}
   *         instances
   */
  public Set<Administrative> getAdministrative() {
    if (administrative == null) {
      administrative = new HashSet<>();
    }
    return this.administrative;
  }

  /**
   * Determine if the Administrative is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAdministrative() {
    return ((this.administrative != null) && (!this.administrative.isEmpty()));
  }

  /**
   * Clear the Administrative field. This sets the field to null.
   */
  public void unsetAdministrative() {
    this.administrative = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link Location} instances
   */
  public Set<Location> getLocation() {
    if (location == null) {
      location = new HashSet<>();
    }
    return this.location;
  }

  /**
   * Determine if the Location is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocation() {
    return ((this.location != null) && (!this.location.isEmpty()));
  }

  /**
   * Clear the Location field. This sets the field to null.
   */
  public void unsetLocation() {
    this.location = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link ChannelPlan} instances
   */
  public Set<ChannelPlan> getChannelPlan() {
    if (channelPlan == null) {
      channelPlan = new HashSet<>();
    }
    return this.channelPlan;
  }

  /**
   * Determine if the ChannelPlan is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChannelPlan() {
    return ((this.channelPlan != null) && (!this.channelPlan.isEmpty()));
  }

  /**
   * Clear the ChannelPlan field. This sets the field to null.
   */
  public void unsetChannelPlan() {
    this.channelPlan = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link TOA} instances
   */
  public Set<TOA> getTOA() {
    if (toa == null) {
      toa = new HashSet<>();
    }
    return this.toa;
  }

  /**
   * Determine if the TOA is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTOA() {
    return ((this.toa != null) && (!this.toa.isEmpty()));
  }

  /**
   * Clear the TOA field. This sets the field to null.
   */
  public void unsetTOA() {
    this.toa = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link Transmitter} instances
   */
  public Set<Transmitter> getTransmitter() {
    if (transmitter == null) {
      transmitter = new HashSet<>();
    }
    return this.transmitter;
  }

  /**
   * Determine if the Transmitter is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTransmitter() {
    return ((this.transmitter != null) && (!this.transmitter.isEmpty()));
  }

  /**
   * Clear the Transmitter field. This sets the field to null.
   */
  public void unsetTransmitter() {
    this.transmitter = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link Receiver} instances
   */
  public Set<Receiver> getReceiver() {
    if (receiver == null) {
      receiver = new HashSet<>();
    }
    return this.receiver;
  }

  /**
   * Determine if the Receiver is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReceiver() {
    return ((this.receiver != null) && (!this.receiver.isEmpty()));
  }

  /**
   * Clear the Receiver field. This sets the field to null.
   */
  public void unsetReceiver() {
    this.receiver = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link Antenna} instances
   */
  public Set<Antenna> getAntenna() {
    if (antenna == null) {
      antenna = new HashSet<>();
    }
    return this.antenna;
  }

  /**
   * Determine if the Antenna is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntenna() {
    return ((this.antenna != null) && (!this.antenna.isEmpty()));
  }

  /**
   * Clear the Antenna field. This sets the field to null.
   */
  public void unsetAntenna() {
    this.antenna = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link RFSystem} instances
   */
  public Set<RFSystem> getRFSystem() {
    if (rfSystem == null) {
      rfSystem = new HashSet<>();
    }
    return this.rfSystem;
  }

  /**
   * Determine if the RFSystem is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFSystem() {
    return ((this.rfSystem != null) && (!this.rfSystem.isEmpty()));
  }

  /**
   * Clear the RFSystem field. This sets the field to null.
   */
  public void unsetRFSystem() {
    this.rfSystem = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link SSRequest} instances
   */
  public Set<SSRequest> getSSRequest() {
    if (ssRequest == null) {
      ssRequest = new HashSet<>();
    }
    return this.ssRequest;
  }

  /**
   * Determine if the SSRequest is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSSRequest() {
    return ((this.ssRequest != null) && (!this.ssRequest.isEmpty()));
  }

  /**
   * Clear the SSRequest field. This sets the field to null.
   */
  public void unsetSSRequest() {
    this.ssRequest = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link SSReply} instances
   */
  public Set<SSReply> getSSReply() {
    if (ssReply == null) {
      ssReply = new HashSet<>();
    }
    return this.ssReply;
  }

  /**
   * Determine if the SSReply is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSSReply() {
    return ((this.ssReply != null) && (!this.ssReply.isEmpty()));
  }

  /**
   * Clear the SSReply field. This sets the field to null.
   */
  public void unsetSSReply() {
    this.ssReply = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link Allotment} instances
   */
  public Set<Allotment> getAllotment() {
    if (allotment == null) {
      allotment = new HashSet<>();
    }
    return this.allotment;
  }

  /**
   * Determine if the Allotment is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAllotment() {
    return ((this.allotment != null) && (!this.allotment.isEmpty()));
  }

  /**
   * Clear the Allotment field. This sets the field to null.
   */
  public void unsetAllotment() {
    this.allotment = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link Assignment} instances
   */
  public Set<Assignment> getAssignment() {
    if (assignment == null) {
      assignment = new HashSet<>();
    }
    return this.assignment;
  }

  /**
   * Determine if the Assignment is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAssignment() {
    return ((this.assignment != null) && (!this.assignment.isEmpty()));
  }

  /**
   * Clear the Assignment field. This sets the field to null.
   */
  public void unsetAssignment() {
    this.assignment = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link Satellite} instances
   */
  public Set<Satellite> getSatellite() {
    if (satellite == null) {
      satellite = new HashSet<>();
    }
    return this.satellite;
  }

  /**
   * Determine if the Satellite is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSatellite() {
    return ((this.satellite != null) && (!this.satellite.isEmpty()));
  }

  /**
   * Clear the Satellite field. This sets the field to null.
   */
  public void unsetSatellite() {
    this.satellite = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link IntfReport} instances
   */
  public Set<IntfReport> getIntfReport() {
    if (intfReport == null) {
      intfReport = new HashSet<>();
    }
    return this.intfReport;
  }

  /**
   * Determine if the IntfReport is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntfReport() {
    return ((this.intfReport != null) && (!this.intfReport.isEmpty()));
  }

  /**
   * Clear the IntfReport field. This sets the field to null.
   */
  public void unsetIntfReport() {
    this.intfReport = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link JRFL} instances
   */
  public Set<JRFL> getJRFL() {
    if (jrfl == null) {
      jrfl = new HashSet<>();
    }
    return this.jrfl;
  }

  /**
   * Determine if the JRFL is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJRFL() {
    return ((this.jrfl != null) && (!this.jrfl.isEmpty()));
  }

  /**
   * Clear the JRFL field. This sets the field to null.
   */
  public void unsetJRFL() {
    this.jrfl = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link ForceElement}
   *         instances
   */
  public Set<ForceElement> getForceElement() {
    if (forceElement == null) {
      forceElement = new HashSet<>();
    }
    return this.forceElement;
  }

  /**
   * Determine if the ForceElement is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetForceElement() {
    return ((this.forceElement != null) && (!this.forceElement.isEmpty()));
  }

  /**
   * Clear the ForceElement field. This sets the field to null.
   */
  public void unsetForceElement() {
    this.forceElement = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link FEDeployment}
   *         instances
   */
  public Set<FEDeployment> getFEDeployment() {
    if (feDeployment == null) {
      feDeployment = new HashSet<>();
    }
    return this.feDeployment;
  }

  /**
   * Determine if the FEDeployment is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFEDeployment() {
    return ((this.feDeployment != null) && (!this.feDeployment.isEmpty()));
  }

  /**
   * Clear the FEDeployment field. This sets the field to null.
   */
  public void unsetFEDeployment() {
    this.feDeployment = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link Message} instances
   */
  public Set<Message> getMessage() {
    if (message == null) {
      message = new HashSet<>();
    }
    return this.message;
  }

  /**
   * Determine if the Message is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMessage() {
    return ((this.message != null) && (!this.message.isEmpty()));
  }

  /**
   * Clear the Message field. This sets the field to null.
   */
  public void unsetMessage() {
    this.message = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link Note} instances
   */
  public Set<Note> getNote() {
    if (note == null) {
      note = new HashSet<>();
    }
    return this.note;
  }

  /**
   * Determine if the Note is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNote() {
    return ((this.note != null) && (!this.note.isEmpty()));
  }

  /**
   * Clear the Note field. This sets the field to null.
   */
  public void unsetNote() {
    this.note = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link Loadset} instances
   */
  public Set<Loadset> getLoadset() {
    if (loadset == null) {
      loadset = new HashSet<>();
    }
    return this.loadset;
  }

  /**
   * Determine if the Loadset is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLoadset() {
    return ((this.loadset != null) && (!this.loadset.isEmpty()));
  }

  /**
   * Clear the Loadset field. This sets the field to null.
   */
  public void unsetLoadset() {
    this.loadset = null;
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link RadiationPlan}
   *         instances
   */
  public Set<RadiationPlan> getRadiationPlan() {
    if (radiationPlan == null) {
      radiationPlan = new HashSet<>();
    }
    return this.radiationPlan;
  }

  /**
   * Determine if the RadiationPlan is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRadiationPlan() {
    return ((this.radiationPlan != null) && (!this.radiationPlan.isEmpty()));
  }

  /**
   * Clear the RadiationPlan field. This sets the field to null.
   */
  public void unsetRadiationPlan() {
    this.radiationPlan = null;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Contact}
   * @return The current SchemaRoot object instance
   */
  public T withContact(Contact... values) {
    if (values != null) {
      getContact().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Contact} instances
   * @return The current SchemaRoot object instance
   */
  public T withContact(Set<Contact> values) {
    if (values != null) {
      getContact().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Role}
   * @return The current SchemaRoot object instance
   */
  public T withRole(Role... values) {
    if (values != null) {
      getRole().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Role} instances
   * @return The current SchemaRoot object instance
   */
  public T withRole(Set<Role> values) {
    if (values != null) {
      getRole().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Organisation}
   * @return The current SchemaRoot object instance
   */
  public T withOrganisation(Organisation... values) {
    if (values != null) {
      getOrganisation().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Organisation} instances
   * @return The current SchemaRoot object instance
   */
  public T withOrganisation(Set<Organisation> values) {
    if (values != null) {
      getOrganisation().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ExternalReference}
   * @return The current SchemaRoot object instance
   */
  public T withExternalReference(ExternalReference... values) {
    if (values != null) {
      getExternalReference().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ExternalReference} instances
   * @return The current SchemaRoot object instance
   */
  public T withExternalReference(Set<ExternalReference> values) {
    if (values != null) {
      getExternalReference().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Administrative}
   * @return The current SchemaRoot object instance
   */
  public T withAdministrative(Administrative... values) {
    if (values != null) {
      getAdministrative().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Administrative} instances
   * @return The current SchemaRoot object instance
   */
  public T withAdministrative(Set<Administrative> values) {
    if (values != null) {
      getAdministrative().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Location}
   * @return The current SchemaRoot object instance
   */
  public T withLocation(Location... values) {
    if (values != null) {
      getLocation().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Location} instances
   * @return The current SchemaRoot object instance
   */
  public T withLocation(Set<Location> values) {
    if (values != null) {
      getLocation().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ChannelPlan}
   * @return The current SchemaRoot object instance
   */
  public T withChannelPlan(ChannelPlan... values) {
    if (values != null) {
      getChannelPlan().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ChannelPlan} instances
   * @return The current SchemaRoot object instance
   */
  public T withChannelPlan(Set<ChannelPlan> values) {
    if (values != null) {
      getChannelPlan().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link TOA}
   * @return The current SchemaRoot object instance
   */
  public T withTOA(TOA... values) {
    if (values != null) {
      getTOA().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link TOA} instances
   * @return The current SchemaRoot object instance
   */
  public T withTOA(Set<TOA> values) {
    if (values != null) {
      getTOA().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Transmitter}
   * @return The current SchemaRoot object instance
   */
  public T withTransmitter(Transmitter... values) {
    if (values != null) {
      getTransmitter().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Transmitter} instances
   * @return The current SchemaRoot object instance
   */
  public T withTransmitter(Set<Transmitter> values) {
    if (values != null) {
      getTransmitter().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Receiver}
   * @return The current SchemaRoot object instance
   */
  public T withReceiver(Receiver... values) {
    if (values != null) {
      getReceiver().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Receiver} instances
   * @return The current SchemaRoot object instance
   */
  public T withReceiver(Set<Receiver> values) {
    if (values != null) {
      getReceiver().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Antenna}
   * @return The current SchemaRoot object instance
   */
  public T withAntenna(Antenna... values) {
    if (values != null) {
      getAntenna().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Antenna} instances
   * @return The current SchemaRoot object instance
   */
  public T withAntenna(Set<Antenna> values) {
    if (values != null) {
      getAntenna().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link RFSystem}
   * @return The current SchemaRoot object instance
   */
  public T withRFSystem(RFSystem... values) {
    if (values != null) {
      getRFSystem().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link RFSystem} instances
   * @return The current SchemaRoot object instance
   */
  public T withRFSystem(Set<RFSystem> values) {
    if (values != null) {
      getRFSystem().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link SSRequest}
   * @return The current SchemaRoot object instance
   */
  public T withSSRequest(SSRequest... values) {
    if (values != null) {
      getSSRequest().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SSRequest} instances
   * @return The current SchemaRoot object instance
   */
  public T withSSRequest(Set<SSRequest> values) {
    if (values != null) {
      getSSRequest().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link SSReply}
   * @return The current SchemaRoot object instance
   */
  public T withSSReply(SSReply... values) {
    if (values != null) {
      getSSReply().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SSReply} instances
   * @return The current SchemaRoot object instance
   */
  public T withSSReply(Set<SSReply> values) {
    if (values != null) {
      getSSReply().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Allotment}
   * @return The current SchemaRoot object instance
   */
  public T withAllotment(Allotment... values) {
    if (values != null) {
      getAllotment().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Allotment} instances
   * @return The current SchemaRoot object instance
   */
  public T withAllotment(Set<Allotment> values) {
    if (values != null) {
      getAllotment().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Assignment}
   * @return The current SchemaRoot object instance
   */
  public T withAssignment(Assignment... values) {
    if (values != null) {
      getAssignment().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Assignment} instances
   * @return The current SchemaRoot object instance
   */
  public T withAssignment(Set<Assignment> values) {
    if (values != null) {
      getAssignment().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Satellite}
   * @return The current SchemaRoot object instance
   */
  public T withSatellite(Satellite... values) {
    if (values != null) {
      getSatellite().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Satellite} instances
   * @return The current SchemaRoot object instance
   */
  public T withSatellite(Set<Satellite> values) {
    if (values != null) {
      getSatellite().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link IntfReport}
   * @return The current SchemaRoot object instance
   */
  public T withIntfReport(IntfReport... values) {
    if (values != null) {
      getIntfReport().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link IntfReport} instances
   * @return The current SchemaRoot object instance
   */
  public T withIntfReport(Set<IntfReport> values) {
    if (values != null) {
      getIntfReport().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link JRFL}
   * @return The current SchemaRoot object instance
   */
  public T withJRFL(JRFL... values) {
    if (values != null) {
      getJRFL().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link JRFL} instances
   * @return The current SchemaRoot object instance
   */
  public T withJRFL(Set<JRFL> values) {
    if (values != null) {
      getJRFL().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ForceElement}
   * @return The current SchemaRoot object instance
   */
  public T withForceElement(ForceElement... values) {
    if (values != null) {
      getForceElement().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ForceElement} instances
   * @return The current SchemaRoot object instance
   */
  public T withForceElement(Set<ForceElement> values) {
    if (values != null) {
      getForceElement().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link FEDeployment}
   * @return The current SchemaRoot object instance
   */
  public T withFEDeployment(FEDeployment... values) {
    if (values != null) {
      getFEDeployment().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FEDeployment} instances
   * @return The current SchemaRoot object instance
   */
  public T withFEDeployment(Set<FEDeployment> values) {
    if (values != null) {
      getFEDeployment().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Message}
   * @return The current SchemaRoot object instance
   */
  public T withMessage(Message... values) {
    if (values != null) {
      getMessage().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Message} instances
   * @return The current SchemaRoot object instance
   */
  public T withMessage(Set<Message> values) {
    if (values != null) {
      getMessage().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Note}
   * @return The current SchemaRoot object instance
   */
  public T withNote(Note... values) {
    if (values != null) {
      getNote().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Note} instances
   * @return The current SchemaRoot object instance
   */
  public T withNote(Set<Note> values) {
    if (values != null) {
      getNote().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Loadset}
   * @return The current SchemaRoot object instance
   */
  public T withLoadset(Loadset... values) {
    if (values != null) {
      getLoadset().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Loadset} instances
   * @return The current SchemaRoot object instance
   */
  public T withLoadset(Set<Loadset> values) {
    if (values != null) {
      getLoadset().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link RadiationPlan}
   * @return The current SchemaRoot object instance
   */
  public T withRadiationPlan(RadiationPlan... values) {
    if (values != null) {
      getRadiationPlan().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link RadiationPlan} instances
   * @return The current SchemaRoot object instance
   */
  public T withRadiationPlan(Set<RadiationPlan> values) {
    if (values != null) {
      getRadiationPlan().addAll(values);
    }
    return (T) this;
  }

  /**
   * Get a string representation of this SchemaRoot instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SchemaRoot {"
      + (transmitter != null ? " transmitter [" + transmitter + "]" : "")
      + (feDeployment != null ? " feDeployment [" + feDeployment + "]" : "")
      + (satellite != null ? " satellite [" + satellite + "]" : "")
      + (receiver != null ? " receiver [" + receiver + "]" : "")
      + (ssRequest != null ? " ssRequest [" + ssRequest + "]" : "")
      + (location != null ? " location [" + location + "]" : "")
      + (organisation != null ? " organisation [" + organisation + "]" : "")
      + (externalReference != null ? " externalReference [" + externalReference + "]" : "")
      + (contact != null ? " contact [" + contact + "]" : "")
      + (toa != null ? " toa [" + toa + "]" : "")
      + (antenna != null ? " antenna [" + antenna + "]" : "")
      + (message != null ? " message [" + message + "]" : "")
      + (forceElement != null ? " forceElement [" + forceElement + "]" : "")
      + (assignment != null ? " assignment [" + assignment + "]" : "")
      + (rfSystem != null ? " rfSystem [" + rfSystem + "]" : "")
      + (ssReply != null ? " ssReply [" + ssReply + "]" : "")
      + (jrfl != null ? " jrfl [" + jrfl + "]" : "")
      + (radiationPlan != null ? " radiationPlan [" + radiationPlan + "]" : "")
      + (allotment != null ? " allotment [" + allotment + "]" : "")
      + (loadset != null ? " loadset [" + loadset + "]" : "")
      + (role != null ? " role [" + role + "]" : "")
      + (channelPlan != null ? " channelPlan [" + channelPlan + "]" : "")
      + (administrative != null ? " administrative [" + administrative + "]" : "")
      + (intfReport != null ? " intfReport [" + intfReport + "]" : "")
      + (note != null ? " note [" + note + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SchemaRoot} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
