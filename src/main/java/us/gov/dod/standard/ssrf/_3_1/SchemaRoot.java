/*
 * Copyright 2015 Key Bridge LLC.
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

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf.SMADEF;
import us.gov.dod.standard.ssrf.SSRF;

/**
 * SchemaRoot is an abstract class extended by {@link SSRF} and {@link SMADEF}
 * containing common attributes for both types.
 *
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 * @param <T> The desired message class type implementation. Must be either
 *            {@link SSRF} or {@link SMADEF}.
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

  @XmlElement(name = "Contact")
  protected Set<Contact> contact;

  @XmlElement(name = "Role")
  protected Set<Role> role;

  @XmlElement(name = "Organisation")
  protected Set<Organisation> organisation;

  @XmlElement(name = "ExternalReference")
  protected Set<ExternalReference> externalReference;

  @XmlElement(name = "Administrative")
  protected Set<Administrative> administrative;

  @XmlElement(name = "Location")
  protected Set<Location> location;

  @XmlElement(name = "ChannelPlan")
  protected Set<ChannelPlan> channelPlan;

  @XmlElement(name = "TOA")
  protected Set<TOA> toa;

  @XmlElement(name = "Transmitter")
  protected Set<Transmitter> transmitter;

  @XmlElement(name = "Receiver")
  protected Set<Receiver> receiver;

  @XmlElement(name = "Antenna")
  protected Set<Antenna> antenna;

  @XmlElement(name = "RFSystem")
  protected Set<RFSystem> rfSystem;

  @XmlElement(name = "SSRequest")
  protected Set<SSRequest> ssRequest;

  @XmlElement(name = "SSReply")
  protected Set<SSReply> ssReply;

  @XmlElement(name = "Allotment")
  protected Set<Allotment> allotment;

  @XmlElement(name = "Assignment")
  protected Set<Assignment> assignment;

  @XmlElement(name = "Satellite")
  protected Set<Satellite> satellite;

  @XmlElement(name = "IntfReport")
  protected Set<IntfReport> intfReport;

  @XmlElement(name = "JRFL")
  protected Set<JRFL> jrfl;

  @XmlElement(name = "ForceElement")
  protected Set<ForceElement> forceElement;

  @XmlElement(name = "FEDeployment")
  protected Set<FEDeployment> feDeployment;

  @XmlElement(name = "Message")
  protected Set<Message> message;

  @XmlElement(name = "Note")
  protected Set<Note> note;

  @XmlElement(name = "Loadset")
  protected Set<Loadset> loadset;

  @XmlElement(name = "RadiationPlan")
  protected Set<RadiationPlan> radiationPlan;

  /**
   * Get
   *
   * @return a {@link Contact} instance
   * @since 3.1.0
   */
  public Set<Contact> getContact() {
    if (contact == null) {
      contact = new HashSet<>();
    }
    return this.contact;
  }

  /**
   * Determine if the Contact is configured.
   *
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
   *
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public Set<Role> getRole() {
    if (role == null) {
      role = new HashSet<>();
    }
    return this.role;
  }

  /**
   * Determine if the Role is configured.
   *
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
   *
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
   *
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
   *
   * @return a {@link ExternalReference} instance
   * @since 3.1.0
   */
  public Set<ExternalReference> getExternalReference() {
    if (externalReference == null) {
      externalReference = new HashSet<>();
    }
    return this.externalReference;
  }

  /**
   * Determine if the ExternalReference is configured.
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
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
   *
   * @param values One or more instances of type {@link Contact...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withContact(Contact... values) {
    if (values != null) {
      getContact().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link Contact} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withContact(Collection<Contact> values) {
    if (values != null) {
      getContact().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link Role...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withRole(Role... values) {
    if (values != null) {
      getRole().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link Role} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withRole(Collection<Role> values) {
    if (values != null) {
      getRole().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link Organisation...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withOrganisation(Organisation... values) {
    if (values != null) {
      getOrganisation().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link Organisation} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withOrganisation(Collection<Organisation> values) {
    if (values != null) {
      getOrganisation().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link ExternalReference...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withExternalReference(ExternalReference... values) {
    if (values != null) {
      getExternalReference().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link ExternalReference} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withExternalReference(Collection<ExternalReference> values) {
    if (values != null) {
      getExternalReference().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link Administrative...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withAdministrative(Administrative... values) {
    if (values != null) {
      getAdministrative().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link Administrative} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withAdministrative(Collection<Administrative> values) {
    if (values != null) {
      getAdministrative().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link Location...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withLocation(Location... values) {
    if (values != null) {
      getLocation().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link Location} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withLocation(Collection<Location> values) {
    if (values != null) {
      getLocation().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link ChannelPlan...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withChannelPlan(ChannelPlan... values) {
    if (values != null) {
      getChannelPlan().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link ChannelPlan} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withChannelPlan(Collection<ChannelPlan> values) {
    if (values != null) {
      getChannelPlan().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link TOA...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withTOA(TOA... values) {
    if (values != null) {
      getTOA().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link TOA} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withTOA(Collection<TOA> values) {
    if (values != null) {
      getTOA().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link Transmitter...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withTransmitter(Transmitter... values) {
    if (values != null) {
      getTransmitter().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link Transmitter} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withTransmitter(Collection<Transmitter> values) {
    if (values != null) {
      getTransmitter().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link Receiver...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withReceiver(Receiver... values) {
    if (values != null) {
      getReceiver().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link Receiver} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withReceiver(Collection<Receiver> values) {
    if (values != null) {
      getReceiver().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link Antenna...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withAntenna(Antenna... values) {
    if (values != null) {
      getAntenna().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link Antenna} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withAntenna(Collection<Antenna> values) {
    if (values != null) {
      getAntenna().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link RFSystem...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withRFSystem(RFSystem... values) {
    if (values != null) {
      getRFSystem().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link RFSystem} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withRFSystem(Collection<RFSystem> values) {
    if (values != null) {
      getRFSystem().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link SSRequest...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withSSRequest(SSRequest... values) {
    if (values != null) {
      getSSRequest().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link SSRequest} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withSSRequest(Collection<SSRequest> values) {
    if (values != null) {
      getSSRequest().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link SSReply...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withSSReply(SSReply... values) {
    if (values != null) {
      getSSReply().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link SSReply} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withSSReply(Collection<SSReply> values) {
    if (values != null) {
      getSSReply().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link Allotment...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withAllotment(Allotment... values) {
    if (values != null) {
      getAllotment().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link Allotment} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withAllotment(Collection<Allotment> values) {
    if (values != null) {
      getAllotment().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link Assignment...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withAssignment(Assignment... values) {
    if (values != null) {
      getAssignment().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link Assignment} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withAssignment(Collection<Assignment> values) {
    if (values != null) {
      getAssignment().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link Satellite...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withSatellite(Satellite... values) {
    if (values != null) {
      getSatellite().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link Satellite} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withSatellite(Collection<Satellite> values) {
    if (values != null) {
      getSatellite().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link IntfReport...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withIntfReport(IntfReport... values) {
    if (values != null) {
      getIntfReport().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link IntfReport} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withIntfReport(Collection<IntfReport> values) {
    if (values != null) {
      getIntfReport().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link JRFL...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withJRFL(JRFL... values) {
    if (values != null) {
      getJRFL().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link JRFL} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withJRFL(Collection<JRFL> values) {
    if (values != null) {
      getJRFL().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link ForceElement...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withForceElement(ForceElement... values) {
    if (values != null) {
      getForceElement().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link ForceElement} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withForceElement(Collection<ForceElement> values) {
    if (values != null) {
      getForceElement().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link FEDeployment...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withFEDeployment(FEDeployment... values) {
    if (values != null) {
      getFEDeployment().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link FEDeployment} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withFEDeployment(Collection<FEDeployment> values) {
    if (values != null) {
      getFEDeployment().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link Message...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withMessage(Message... values) {
    if (values != null) {
      getMessage().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link Message} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withMessage(Collection<Message> values) {
    if (values != null) {
      getMessage().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link Note...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withNote(Note... values) {
    if (values != null) {
      getNote().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link Note} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withNote(Collection<Note> values) {
    if (values != null) {
      getNote().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link Loadset...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withLoadset(Loadset... values) {
    if (values != null) {
      getLoadset().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link Loadset} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withLoadset(Collection<Loadset> values) {
    if (values != null) {
      getLoadset().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values One or more instances of type {@link RadiationPlan...}
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withRadiationPlan(RadiationPlan... values) {
    if (values != null) {
      getRadiationPlan().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   *
   * @param values A collection of {@link RadiationPlan} instances
   * @return The current SchemaRoot object instance
   * @since 3.1.0
   */
  public T withRadiationPlan(Collection<RadiationPlan> values) {
    if (values != null) {
      getRadiationPlan().addAll(values);
    }
    return (T) this;
  }

  /**
   * Get a string representation of this SchemaRoot instance configuration.
   *
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  SchemaRoot {"
           + (administrative != null ? " administrative [" + administrative + "]" : "")
           + (allotment != null ? " allotment [" + allotment + "]" : "")
           + (antenna != null ? " antenna [" + antenna + "]" : "")
           + (assignment != null ? " assignment [" + assignment + "]" : "")
           + (channelPlan != null ? " channelPlan [" + channelPlan + "]" : "")
           + (contact != null ? " contact [" + contact + "]" : "")
           + (externalReference != null ? " externalReference [" + externalReference + "]" : "")
           + (feDeployment != null ? " feDeployment [" + feDeployment + "]" : "")
           + (forceElement != null ? " forceElement [" + forceElement + "]" : "")
           + (intfReport != null ? " intfReport [" + intfReport + "]" : "")
           + (jrfl != null ? " jrfl [" + jrfl + "]" : "")
           + (loadset != null ? " loadset [" + loadset + "]" : "")
           + (location != null ? " location [" + location + "]" : "")
           + (message != null ? " message [" + message + "]" : "")
           + (note != null ? " note [" + note + "]" : "")
           + (organisation != null ? " organisation [" + organisation + "]" : "")
           + (radiationPlan != null ? " radiationPlan [" + radiationPlan + "]" : "")
           + (receiver != null ? " receiver [" + receiver + "]" : "")
           + (rfSystem != null ? " rfSystem [" + rfSystem + "]" : "")
           + (role != null ? " role [" + role + "]" : "")
           + (satellite != null ? " satellite [" + satellite + "]" : "")
           + (ssReply != null ? " ssReply [" + ssReply + "]" : "")
           + (ssRequest != null ? " ssRequest [" + ssRequest + "]" : "")
           + (toa != null ? " toa [" + toa + "]" : "")
           + (transmitter != null ? " transmitter [" + transmitter + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SchemaRoot} has no configuration requirements.
   *
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
