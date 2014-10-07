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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
  protected List<Administrative> administrative;
  @XmlElement(name = "Allotment")
  protected List<Allotment> allotment;
  @XmlElement(name = "Antenna")
  protected List<Antenna> antenna;
  @XmlElement(name = "Assignment")
  protected List<Assignment> assignment;
  @XmlElement(name = "ChannelPlan")
  protected List<ChannelPlan> channelPlan;
  @XmlElement(name = "Contact")
  protected List<Contact> contact;
  @XmlElement(name = "ExternalReference")
  protected List<ExternalReference> externalReference;
  @XmlElement(name = "FEDeployment")
  protected List<FEDeployment> feDeployment;
  @XmlElement(name = "ForceElement")
  protected List<ForceElement> forceElement;
  @XmlElement(name = "IntfReport")
  protected List<IntfReport> intfReport;
  @XmlElement(name = "JRFL")
  protected List<JRFL> jrfl;
  @XmlElement(name = "Loadset")
  protected List<Loadset> loadset;
  @XmlElement(name = "Location")
  protected List<Location> location;
  @XmlElement(name = "Message")
  protected List<Message> message;
  @XmlElement(name = "Note")
  protected List<Note> note;
  @XmlElement(name = "Organisation")
  protected List<Organisation> organisation;
  @XmlElement(name = "RFSystem")
  protected List<RFSystem> rfSystem;
  @XmlElement(name = "RadiationPlan")
  protected List<RadiationPlan> radiationPlan;
  @XmlElement(name = "Receiver")
  protected List<Receiver> receiver;
  @XmlElement(name = "Role")
  protected List<Role> role;
  @XmlElement(name = "SSReply")
  protected List<SSReply> ssReply;
  @XmlElement(name = "SSRequest")
  protected List<SSRequest> ssRequest;
  @XmlElement(name = "Satellite")
  protected List<Satellite> satellite;
  @XmlElement(name = "TOA")
  protected List<TOA> toa;
  @XmlElement(name = "Transmitter")
  protected List<Transmitter> transmitter;

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link Contact} instances
   */
  public List<Contact> getContact() {
    if (contact == null) {
      contact = new ArrayList<>();
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
  public List<Role> getRole() {
    if (role == null) {
      role = new ArrayList<>();
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
  public List<Organisation> getOrganisation() {
    if (organisation == null) {
      organisation = new ArrayList<>();
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
  public List<ExternalReference> getExternalReference() {
    if (externalReference == null) {
      externalReference = new ArrayList<>();
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
  public List<Administrative> getAdministrative() {
    if (administrative == null) {
      administrative = new ArrayList<>();
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
  public List<Location> getLocation() {
    if (location == null) {
      location = new ArrayList<>();
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
  public List<ChannelPlan> getChannelPlan() {
    if (channelPlan == null) {
      channelPlan = new ArrayList<>();
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
  public List<TOA> getTOA() {
    if (toa == null) {
      toa = new ArrayList<>();
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
  public List<Transmitter> getTransmitter() {
    if (transmitter == null) {
      transmitter = new ArrayList<>();
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
  public List<Receiver> getReceiver() {
    if (receiver == null) {
      receiver = new ArrayList<>();
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
  public List<Antenna> getAntenna() {
    if (antenna == null) {
      antenna = new ArrayList<>();
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
  public List<RFSystem> getRFSystem() {
    if (rfSystem == null) {
      rfSystem = new ArrayList<>();
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
  public List<SSRequest> getSSRequest() {
    if (ssRequest == null) {
      ssRequest = new ArrayList<>();
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
  public List<SSReply> getSSReply() {
    if (ssReply == null) {
      ssReply = new ArrayList<>();
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
  public List<Allotment> getAllotment() {
    if (allotment == null) {
      allotment = new ArrayList<>();
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
  public List<Assignment> getAssignment() {
    if (assignment == null) {
      assignment = new ArrayList<>();
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
  public List<Satellite> getSatellite() {
    if (satellite == null) {
      satellite = new ArrayList<>();
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
  public List<IntfReport> getIntfReport() {
    if (intfReport == null) {
      intfReport = new ArrayList<>();
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
  public List<JRFL> getJRFL() {
    if (jrfl == null) {
      jrfl = new ArrayList<>();
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
  public List<ForceElement> getForceElement() {
    if (forceElement == null) {
      forceElement = new ArrayList<>();
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
  public List<FEDeployment> getFEDeployment() {
    if (feDeployment == null) {
      feDeployment = new ArrayList<>();
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
  public List<Message> getMessage() {
    if (message == null) {
      message = new ArrayList<>();
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
  public List<Note> getNote() {
    if (note == null) {
      note = new ArrayList<>();
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
  public List<Loadset> getLoadset() {
    if (loadset == null) {
      loadset = new ArrayList<>();
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
  public List<RadiationPlan> getRadiationPlan() {
    if (radiationPlan == null) {
      radiationPlan = new ArrayList<>();
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
      getContact().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Contact} instances
   * @return The current SchemaRoot object instance
   */
  public T withContact(Collection<Contact> values) {
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
      getRole().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Role} instances
   * @return The current SchemaRoot object instance
   */
  public T withRole(Collection<Role> values) {
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
      getOrganisation().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Organisation} instances
   * @return The current SchemaRoot object instance
   */
  public T withOrganisation(Collection<Organisation> values) {
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
      getExternalReference().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ExternalReference} instances
   * @return The current SchemaRoot object instance
   */
  public T withExternalReference(Collection<ExternalReference> values) {
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
      getAdministrative().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Administrative} instances
   * @return The current SchemaRoot object instance
   */
  public T withAdministrative(Collection<Administrative> values) {
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
      getLocation().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Location} instances
   * @return The current SchemaRoot object instance
   */
  public T withLocation(Collection<Location> values) {
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
      getChannelPlan().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ChannelPlan} instances
   * @return The current SchemaRoot object instance
   */
  public T withChannelPlan(Collection<ChannelPlan> values) {
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
      getTOA().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link TOA} instances
   * @return The current SchemaRoot object instance
   */
  public T withTOA(Collection<TOA> values) {
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
      getTransmitter().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Transmitter} instances
   * @return The current SchemaRoot object instance
   */
  public T withTransmitter(Collection<Transmitter> values) {
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
      getReceiver().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Receiver} instances
   * @return The current SchemaRoot object instance
   */
  public T withReceiver(Collection<Receiver> values) {
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
      getAntenna().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Antenna} instances
   * @return The current SchemaRoot object instance
   */
  public T withAntenna(Collection<Antenna> values) {
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
      getRFSystem().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link RFSystem} instances
   * @return The current SchemaRoot object instance
   */
  public T withRFSystem(Collection<RFSystem> values) {
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
      getSSRequest().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SSRequest} instances
   * @return The current SchemaRoot object instance
   */
  public T withSSRequest(Collection<SSRequest> values) {
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
      getSSReply().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SSReply} instances
   * @return The current SchemaRoot object instance
   */
  public T withSSReply(Collection<SSReply> values) {
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
      getAllotment().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Allotment} instances
   * @return The current SchemaRoot object instance
   */
  public T withAllotment(Collection<Allotment> values) {
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
      getAssignment().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Assignment} instances
   * @return The current SchemaRoot object instance
   */
  public T withAssignment(Collection<Assignment> values) {
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
      getSatellite().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Satellite} instances
   * @return The current SchemaRoot object instance
   */
  public T withSatellite(Collection<Satellite> values) {
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
      getIntfReport().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link IntfReport} instances
   * @return The current SchemaRoot object instance
   */
  public T withIntfReport(Collection<IntfReport> values) {
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
      getJRFL().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link JRFL} instances
   * @return The current SchemaRoot object instance
   */
  public T withJRFL(Collection<JRFL> values) {
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
      getForceElement().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ForceElement} instances
   * @return The current SchemaRoot object instance
   */
  public T withForceElement(Collection<ForceElement> values) {
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
      getFEDeployment().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FEDeployment} instances
   * @return The current SchemaRoot object instance
   */
  public T withFEDeployment(Collection<FEDeployment> values) {
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
      getMessage().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Message} instances
   * @return The current SchemaRoot object instance
   */
  public T withMessage(Collection<Message> values) {
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
      getNote().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Note} instances
   * @return The current SchemaRoot object instance
   */
  public T withNote(Collection<Note> values) {
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
      getLoadset().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Loadset} instances
   * @return The current SchemaRoot object instance
   */
  public T withLoadset(Collection<Loadset> values) {
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
      getRadiationPlan().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link RadiationPlan} instances
   * @return The current SchemaRoot object instance
   */
  public T withRadiationPlan(Collection<RadiationPlan> values) {
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
