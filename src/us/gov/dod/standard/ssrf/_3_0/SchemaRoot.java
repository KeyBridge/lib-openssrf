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
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SchemaRoot complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="SchemaRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contact" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Role" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Role" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Organisation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Organisation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExternalReference" type="{urn:us:gov:dod:standard:ssrf:3.0.0}ExternalReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Administrative" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Administrative" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Location" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChannelPlan" type="{urn:us:gov:dod:standard:ssrf:3.0.0}ChannelPlan" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TOA" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TOA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Transmitter" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Transmitter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Receiver" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Receiver" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Antenna" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Antenna" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RFSystem" type="{urn:us:gov:dod:standard:ssrf:3.0.0}RFSystem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SSRequest" type="{urn:us:gov:dod:standard:ssrf:3.0.0}SSRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SSReply" type="{urn:us:gov:dod:standard:ssrf:3.0.0}SSReply" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Allotment" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Allotment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Assignment" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Assignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Satellite" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Satellite" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IntfReport" type="{urn:us:gov:dod:standard:ssrf:3.0.0}IntfReport" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JRFL" type="{urn:us:gov:dod:standard:ssrf:3.0.0}JRFL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ForceElement" type="{urn:us:gov:dod:standard:ssrf:3.0.0}ForceElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FEDeployment" type="{urn:us:gov:dod:standard:ssrf:3.0.0}FEDeployment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Note" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Note" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
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
public class SchemaRoot {

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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the contact property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getContact().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Contact }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the role property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRole().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Role }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the organisation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getOrganisation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link Organisation }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the externalReference property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getExternalReference().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link ExternalReference }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the administrative property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAdministrative().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link Administrative }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the location property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLocation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Location }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the channelPlan property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getChannelPlan().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link ChannelPlan }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the toa property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTOA().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link TOA }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the transmitter property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTransmitter().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link Transmitter }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the receiver property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getReceiver().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Receiver }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the antenna property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAntenna().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Antenna }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the rfSystem property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRFSystem().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link RFSystem }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the ssRequest property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSSRequest().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link SSRequest }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the ssReply property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSSReply().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link SSReply }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the allotment property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAllotment().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Allotment }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the assignment property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAssignment().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link Assignment }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the satellite property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSatellite().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Satellite }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the intfReport property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getIntfReport().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link IntfReport }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the jrfl property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getJRFL().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link JRFL }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the forceElement property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getForceElement().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link ForceElement }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the feDeployment property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFEDeployment().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link FEDeployment }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the note property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getNote().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Note }
   * <p>
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

  public SchemaRoot withContact(Contact... values) {
    if (values != null) {
      getContact().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withContact(Collection<Contact> values) {
    if (values != null) {
      getContact().addAll(values);
    }
    return this;
  }

  public SchemaRoot withRole(Role... values) {
    if (values != null) {
      getRole().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withRole(Collection<Role> values) {
    if (values != null) {
      getRole().addAll(values);
    }
    return this;
  }

  public SchemaRoot withOrganisation(Organisation... values) {
    if (values != null) {
      getOrganisation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withOrganisation(Collection<Organisation> values) {
    if (values != null) {
      getOrganisation().addAll(values);
    }
    return this;
  }

  public SchemaRoot withExternalReference(ExternalReference... values) {
    if (values != null) {
      getExternalReference().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withExternalReference(Collection<ExternalReference> values) {
    if (values != null) {
      getExternalReference().addAll(values);
    }
    return this;
  }

  public SchemaRoot withAdministrative(Administrative... values) {
    if (values != null) {
      getAdministrative().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withAdministrative(Collection<Administrative> values) {
    if (values != null) {
      getAdministrative().addAll(values);
    }
    return this;
  }

  public SchemaRoot withLocation(Location... values) {
    if (values != null) {
      getLocation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withLocation(Collection<Location> values) {
    if (values != null) {
      getLocation().addAll(values);
    }
    return this;
  }

  public SchemaRoot withChannelPlan(ChannelPlan... values) {
    if (values != null) {
      getChannelPlan().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withChannelPlan(Collection<ChannelPlan> values) {
    if (values != null) {
      getChannelPlan().addAll(values);
    }
    return this;
  }

  public SchemaRoot withTOA(TOA... values) {
    if (values != null) {
      getTOA().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withTOA(Collection<TOA> values) {
    if (values != null) {
      getTOA().addAll(values);
    }
    return this;
  }

  public SchemaRoot withTransmitter(Transmitter... values) {
    if (values != null) {
      getTransmitter().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withTransmitter(Collection<Transmitter> values) {
    if (values != null) {
      getTransmitter().addAll(values);
    }
    return this;
  }

  public SchemaRoot withReceiver(Receiver... values) {
    if (values != null) {
      getReceiver().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withReceiver(Collection<Receiver> values) {
    if (values != null) {
      getReceiver().addAll(values);
    }
    return this;
  }

  public SchemaRoot withAntenna(Antenna... values) {
    if (values != null) {
      getAntenna().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withAntenna(Collection<Antenna> values) {
    if (values != null) {
      getAntenna().addAll(values);
    }
    return this;
  }

  public SchemaRoot withRFSystem(RFSystem... values) {
    if (values != null) {
      getRFSystem().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withRFSystem(Collection<RFSystem> values) {
    if (values != null) {
      getRFSystem().addAll(values);
    }
    return this;
  }

  public SchemaRoot withSSRequest(SSRequest... values) {
    if (values != null) {
      getSSRequest().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withSSRequest(Collection<SSRequest> values) {
    if (values != null) {
      getSSRequest().addAll(values);
    }
    return this;
  }

  public SchemaRoot withSSReply(SSReply... values) {
    if (values != null) {
      getSSReply().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withSSReply(Collection<SSReply> values) {
    if (values != null) {
      getSSReply().addAll(values);
    }
    return this;
  }

  public SchemaRoot withAllotment(Allotment... values) {
    if (values != null) {
      getAllotment().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withAllotment(Collection<Allotment> values) {
    if (values != null) {
      getAllotment().addAll(values);
    }
    return this;
  }

  public SchemaRoot withAssignment(Assignment... values) {
    if (values != null) {
      getAssignment().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withAssignment(Collection<Assignment> values) {
    if (values != null) {
      getAssignment().addAll(values);
    }
    return this;
  }

  public SchemaRoot withSatellite(Satellite... values) {
    if (values != null) {
      getSatellite().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withSatellite(Collection<Satellite> values) {
    if (values != null) {
      getSatellite().addAll(values);
    }
    return this;
  }

  public SchemaRoot withIntfReport(IntfReport... values) {
    if (values != null) {
      getIntfReport().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withIntfReport(Collection<IntfReport> values) {
    if (values != null) {
      getIntfReport().addAll(values);
    }
    return this;
  }

  public SchemaRoot withJRFL(JRFL... values) {
    if (values != null) {
      getJRFL().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withJRFL(Collection<JRFL> values) {
    if (values != null) {
      getJRFL().addAll(values);
    }
    return this;
  }

  public SchemaRoot withForceElement(ForceElement... values) {
    if (values != null) {
      getForceElement().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withForceElement(Collection<ForceElement> values) {
    if (values != null) {
      getForceElement().addAll(values);
    }
    return this;
  }

  public SchemaRoot withFEDeployment(FEDeployment... values) {
    if (values != null) {
      getFEDeployment().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withFEDeployment(Collection<FEDeployment> values) {
    if (values != null) {
      getFEDeployment().addAll(values);
    }
    return this;
  }

  public SchemaRoot withNote(Note... values) {
    if (values != null) {
      getNote().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SchemaRoot withNote(Collection<Note> values) {
    if (values != null) {
      getNote().addAll(values);
    }
    return this;
  }

}
