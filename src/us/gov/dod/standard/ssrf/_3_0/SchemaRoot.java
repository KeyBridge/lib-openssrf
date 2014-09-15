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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SMADEF;
import us.gov.dod.standard.ssrf.SSRF;

/**
 * Abstract Java class for SchemaRoot complex type.
 * <p>
 * This class is a generic container and the entry point for SSRF and
 * SMADEF-XML. Implementations of this class are {@link SSRF} and
 * {@link SMADEF};
 * <p>
 * Description Data element SMADEF is the root element for any SMADEF-XML
 * message. It contains attributes defining the namespace used. Any SMADEF-XML
 * message may contain any number of datasets.
 * <p>
 * All elements at this level must extend {@link Common}
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
  "note"
})
@XmlSeeAlso({SSRF.class, SMADEF.class})
public abstract class SchemaRoot {

  @XmlElement(name = "Contact")
  private List<Contact> contact;
  @XmlElement(name = "Role")
  private List<Role> role;
  @XmlElement(name = "Organisation")
  private List<Organisation> organisation;
  @XmlElement(name = "ExternalReference")
  private List<ExternalReference> externalReference;
  @XmlElement(name = "Administrative")
  private List<Administrative> administrative;
  @XmlElement(name = "Location")
  private List<Location> location;
  @XmlElement(name = "ChannelPlan")
  private List<ChannelPlan> channelPlan;
  @XmlElement(name = "TOA")
  private List<TOA> toa;
  @XmlElement(name = "Transmitter")
  private List<Transmitter> transmitter;
  @XmlElement(name = "Receiver")
  private List<Receiver> receiver;
  @XmlElement(name = "Antenna")
  private List<Antenna> antenna;
  @XmlElement(name = "RFSystem")
  private List<RFSystem> rfSystem;
  @XmlElement(name = "SSRequest")
  private List<SSRequest> ssRequest;
  @XmlElement(name = "SSReply")
  private List<SSReply> ssReply;
  @XmlElement(name = "Allotment")
  private List<Allotment> allotment;
  @XmlElement(name = "Assignment")
  private List<Assignment> assignment;
  @XmlElement(name = "Satellite")
  private List<Satellite> satellite;
  @XmlElement(name = "IntfReport")
  private List<IntfReport> intfReport;
  @XmlElement(name = "JRFL")
  private List<JRFL> jrfl;
  @XmlElement(name = "ForceElement")
  private List<ForceElement> forceElement;
  @XmlElement(name = "FEDeployment")
  private List<FEDeployment> feDeployment;
  @XmlElement(name = "Note")
  private List<Note> note;

  /**
   * Gets the value of the contact property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the contact property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getContact().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Contact> getContact() {
    if (contact == null) {
      contact = new ArrayList<>();
    }
    return this.contact;
  }

  public boolean isSetContact() {
    return ((this.contact != null) && (!this.contact.isEmpty()));
  }

  public void unsetContact() {
    this.contact = null;
  }

  /**
   * Gets the value of the role property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the role property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRole().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Role> getRole() {
    if (role == null) {
      role = new ArrayList<>();
    }
    return this.role;
  }

  public boolean isSetRole() {
    return ((this.role != null) && (!this.role.isEmpty()));
  }

  public void unsetRole() {
    this.role = null;
  }

  /**
   * Gets the value of the organisation property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the organisation property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getOrganisation().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Organisation> getOrganisation() {
    if (organisation == null) {
      organisation = new ArrayList<>();
    }
    return this.organisation;
  }

  public boolean isSetOrganisation() {
    return ((this.organisation != null) && (!this.organisation.isEmpty()));
  }

  public void unsetOrganisation() {
    this.organisation = null;
  }

  /**
   * Gets the value of the externalReference property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the externalReference property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getExternalReference().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<ExternalReference> getExternalReference() {
    if (externalReference == null) {
      externalReference = new ArrayList<>();
    }
    return this.externalReference;
  }

  public boolean isSetExternalReference() {
    return ((this.externalReference != null) && (!this.externalReference.isEmpty()));
  }

  public void unsetExternalReference() {
    this.externalReference = null;
  }

  /**
   * Gets the value of the administrative property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the administrative property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAdministrative().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Administrative> getAdministrative() {
    if (administrative == null) {
      administrative = new ArrayList<>();
    }
    return this.administrative;
  }

  public boolean isSetAdministrative() {
    return ((this.administrative != null) && (!this.administrative.isEmpty()));
  }

  public void unsetAdministrative() {
    this.administrative = null;
  }

  /**
   * Gets the value of the location property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the location property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLocation().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Location> getLocation() {
    if (location == null) {
      location = new ArrayList<>();
    }
    return this.location;
  }

  public boolean isSetLocation() {
    return ((this.location != null) && (!this.location.isEmpty()));
  }

  public void unsetLocation() {
    this.location = null;
  }

  /**
   * Gets the value of the channelPlan property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the channelPlan property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getChannelPlan().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<ChannelPlan> getChannelPlan() {
    if (channelPlan == null) {
      channelPlan = new ArrayList<>();
    }
    return this.channelPlan;
  }

  public boolean isSetChannelPlan() {
    return ((this.channelPlan != null) && (!this.channelPlan.isEmpty()));
  }

  public void unsetChannelPlan() {
    this.channelPlan = null;
  }

  /**
   * Gets the value of the toa property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the toa property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTOA().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<TOA> getTOA() {
    if (toa == null) {
      toa = new ArrayList<>();
    }
    return this.toa;
  }

  public boolean isSetTOA() {
    return ((this.toa != null) && (!this.toa.isEmpty()));
  }

  public void unsetTOA() {
    this.toa = null;
  }

  /**
   * Gets the value of the transmitter property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the transmitter property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTransmitter().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Transmitter> getTransmitter() {
    if (transmitter == null) {
      transmitter = new ArrayList<>();
    }
    return this.transmitter;
  }

  public boolean isSetTransmitter() {
    return ((this.transmitter != null) && (!this.transmitter.isEmpty()));
  }

  public void unsetTransmitter() {
    this.transmitter = null;
  }

  /**
   * Gets the value of the receiver property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the receiver property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getReceiver().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Receiver> getReceiver() {
    if (receiver == null) {
      receiver = new ArrayList<>();
    }
    return this.receiver;
  }

  public boolean isSetReceiver() {
    return ((this.receiver != null) && (!this.receiver.isEmpty()));
  }

  public void unsetReceiver() {
    this.receiver = null;
  }

  /**
   * Gets the value of the antenna property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the antenna property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAntenna().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Antenna> getAntenna() {
    if (antenna == null) {
      antenna = new ArrayList<>();
    }
    return this.antenna;
  }

  public boolean isSetAntenna() {
    return ((this.antenna != null) && (!this.antenna.isEmpty()));
  }

  public void unsetAntenna() {
    this.antenna = null;
  }

  /**
   * Gets the value of the rfSystem property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the rfSystem property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRFSystem().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<RFSystem> getRFSystem() {
    if (rfSystem == null) {
      rfSystem = new ArrayList<>();
    }
    return this.rfSystem;
  }

  public boolean isSetRFSystem() {
    return ((this.rfSystem != null) && (!this.rfSystem.isEmpty()));
  }

  public void unsetRFSystem() {
    this.rfSystem = null;
  }

  /**
   * Gets the value of the ssRequest property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the ssRequest property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSSRequest().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<SSRequest> getSSRequest() {
    if (ssRequest == null) {
      ssRequest = new ArrayList<>();
    }
    return this.ssRequest;
  }

  public boolean isSetSSRequest() {
    return ((this.ssRequest != null) && (!this.ssRequest.isEmpty()));
  }

  public void unsetSSRequest() {
    this.ssRequest = null;
  }

  /**
   * Gets the value of the ssReply property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the ssReply property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSSReply().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<SSReply> getSSReply() {
    if (ssReply == null) {
      ssReply = new ArrayList<>();
    }
    return this.ssReply;
  }

  public boolean isSetSSReply() {
    return ((this.ssReply != null) && (!this.ssReply.isEmpty()));
  }

  public void unsetSSReply() {
    this.ssReply = null;
  }

  /**
   * Gets the value of the allotment property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the allotment property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAllotment().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Allotment> getAllotment() {
    if (allotment == null) {
      allotment = new ArrayList<>();
    }
    return this.allotment;
  }

  public boolean isSetAllotment() {
    return ((this.allotment != null) && (!this.allotment.isEmpty()));
  }

  public void unsetAllotment() {
    this.allotment = null;
  }

  /**
   * Gets the value of the assignment property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the assignment property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAssignment().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Assignment> getAssignment() {
    if (assignment == null) {
      assignment = new ArrayList<>();
    }
    return this.assignment;
  }

  public boolean isSetAssignment() {
    return ((this.assignment != null) && (!this.assignment.isEmpty()));
  }

  public void unsetAssignment() {
    this.assignment = null;
  }

  /**
   * Gets the value of the satellite property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the satellite property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSatellite().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Satellite> getSatellite() {
    if (satellite == null) {
      satellite = new ArrayList<>();
    }
    return this.satellite;
  }

  public boolean isSetSatellite() {
    return ((this.satellite != null) && (!this.satellite.isEmpty()));
  }

  public void unsetSatellite() {
    this.satellite = null;
  }

  /**
   * Gets the value of the intfReport property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the intfReport property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getIntfReport().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<IntfReport> getIntfReport() {
    if (intfReport == null) {
      intfReport = new ArrayList<>();
    }
    return this.intfReport;
  }

  public boolean isSetIntfReport() {
    return ((this.intfReport != null) && (!this.intfReport.isEmpty()));
  }

  public void unsetIntfReport() {
    this.intfReport = null;
  }

  /**
   * Gets the value of the jrfl property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the jrfl property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getJRFL().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<JRFL> getJRFL() {
    if (jrfl == null) {
      jrfl = new ArrayList<>();
    }
    return this.jrfl;
  }

  public boolean isSetJRFL() {
    return ((this.jrfl != null) && (!this.jrfl.isEmpty()));
  }

  public void unsetJRFL() {
    this.jrfl = null;
  }

  /**
   * Gets the value of the forceElement property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the forceElement property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getForceElement().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<ForceElement> getForceElement() {
    if (forceElement == null) {
      forceElement = new ArrayList<>();
    }
    return this.forceElement;
  }

  public boolean isSetForceElement() {
    return ((this.forceElement != null) && (!this.forceElement.isEmpty()));
  }

  public void unsetForceElement() {
    this.forceElement = null;
  }

  /**
   * Gets the value of the feDeployment property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the feDeployment property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFEDeployment().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<FEDeployment> getFEDeployment() {
    if (feDeployment == null) {
      feDeployment = new ArrayList<>();
    }
    return this.feDeployment;
  }

  public boolean isSetFEDeployment() {
    return ((this.feDeployment != null) && (!this.feDeployment.isEmpty()));
  }

  public void unsetFEDeployment() {
    this.feDeployment = null;
  }

  /**
   * Gets the value of the note property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the note property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getNote().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Note> getNote() {
    if (note == null) {
      note = new ArrayList<>();
    }
    return this.note;
  }

  public boolean isSetNote() {
    return ((this.note != null) && (!this.note.isEmpty()));
  }

  public void unsetNote() {
    this.note = null;
  }
}
