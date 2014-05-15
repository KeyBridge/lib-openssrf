/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
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
  protected List<Contact> contact;
  @XmlElement(name = "Role")
  protected List<Role> role;
  @XmlElement(name = "Organisation")
  protected List<Organisation> organisation;
  @XmlElement(name = "ExternalReference")
  protected List<ExternalReference> externalReference;
  @XmlElement(name = "Administrative")
  protected List<Administrative> administrative;
  @XmlElement(name = "Location")
  protected List<Location> location;
  @XmlElement(name = "ChannelPlan")
  protected List<ChannelPlan> channelPlan;
  @XmlElement(name = "TOA")
  protected List<TOA> toa;
  @XmlElement(name = "Transmitter")
  protected List<Transmitter> transmitter;
  @XmlElement(name = "Receiver")
  protected List<Receiver> receiver;
  @XmlElement(name = "Antenna")
  protected List<Antenna> antenna;
  @XmlElement(name = "RFSystem")
  protected List<RFSystem> rfSystem;
  @XmlElement(name = "SSRequest")
  protected List<SSRequest> ssRequest;
  @XmlElement(name = "SSReply")
  protected List<SSReply> ssReply;
  @XmlElement(name = "Allotment")
  protected List<Allotment> allotment;
  @XmlElement(name = "Assignment")
  protected List<Assignment> assignment;
  @XmlElement(name = "Satellite")
  protected List<Satellite> satellite;
  @XmlElement(name = "IntfReport")
  protected List<IntfReport> intfReport;
  @XmlElement(name = "JRFL")
  protected List<JRFL> jrfl;
  @XmlElement(name = "ForceElement")
  protected List<ForceElement> forceElement;
  @XmlElement(name = "FEDeployment")
  protected List<FEDeployment> feDeployment;
  @XmlElement(name = "Note")
  protected List<Note> note;

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
   */
  public List<Contact> getContact() {
    if (contact == null) {
      contact = new ArrayList<>();
    }
    return this.contact;
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
   */
  public List<Role> getRole() {
    if (role == null) {
      role = new ArrayList<>();
    }
    return this.role;
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
   */
  public List<Organisation> getOrganisation() {
    if (organisation == null) {
      organisation = new ArrayList<>();
    }
    return this.organisation;
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
   */
  public List<ExternalReference> getExternalReference() {
    if (externalReference == null) {
      externalReference = new ArrayList<>();
    }
    return this.externalReference;
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
   */
  public List<Administrative> getAdministrative() {
    if (administrative == null) {
      administrative = new ArrayList<>();
    }
    return this.administrative;
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
   */
  public List<Location> getLocation() {
    if (location == null) {
      location = new ArrayList<>();
    }
    return this.location;
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
   */
  public List<ChannelPlan> getChannelPlan() {
    if (channelPlan == null) {
      channelPlan = new ArrayList<>();
    }
    return this.channelPlan;
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
   */
  public List<TOA> getTOA() {
    if (toa == null) {
      toa = new ArrayList<>();
    }
    return this.toa;
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
   */
  public List<Transmitter> getTransmitter() {
    if (transmitter == null) {
      transmitter = new ArrayList<>();
    }
    return this.transmitter;
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
   */
  public List<Receiver> getReceiver() {
    if (receiver == null) {
      receiver = new ArrayList<>();
    }
    return this.receiver;
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
   */
  public List<Antenna> getAntenna() {
    if (antenna == null) {
      antenna = new ArrayList<>();
    }
    return this.antenna;
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
   */
  public List<RFSystem> getRFSystem() {
    if (rfSystem == null) {
      rfSystem = new ArrayList<>();
    }
    return this.rfSystem;
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
   */
  public List<SSRequest> getSSRequest() {
    if (ssRequest == null) {
      ssRequest = new ArrayList<>();
    }
    return this.ssRequest;
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
   */
  public List<SSReply> getSSReply() {
    if (ssReply == null) {
      ssReply = new ArrayList<>();
    }
    return this.ssReply;
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
   */
  public List<Allotment> getAllotment() {
    if (allotment == null) {
      allotment = new ArrayList<>();
    }
    return this.allotment;
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
   */
  public List<Assignment> getAssignment() {
    if (assignment == null) {
      assignment = new ArrayList<>();
    }
    return this.assignment;
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
   */
  public List<Satellite> getSatellite() {
    if (satellite == null) {
      satellite = new ArrayList<>();
    }
    return this.satellite;
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
   */
  public List<IntfReport> getIntfReport() {
    if (intfReport == null) {
      intfReport = new ArrayList<>();
    }
    return this.intfReport;
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
   */
  public List<JRFL> getJRFL() {
    if (jrfl == null) {
      jrfl = new ArrayList<>();
    }
    return this.jrfl;
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
   */
  public List<ForceElement> getForceElement() {
    if (forceElement == null) {
      forceElement = new ArrayList<>();
    }
    return this.forceElement;
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
   */
  public List<FEDeployment> getFEDeployment() {
    if (feDeployment == null) {
      feDeployment = new ArrayList<>();
    }
    return this.feDeployment;
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
   */
  public List<Note> getNote() {
    if (note == null) {
      note = new ArrayList<>();
    }
    return this.note;
  }

}
