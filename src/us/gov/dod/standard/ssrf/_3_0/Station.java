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

import us.gov.dod.standard.ssrf._3_0.datatype.TS100;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN9;
import us.gov.dod.standard.ssrf._3_0.datatype.TTSDFValue;
import us.gov.dod.standard.ssrf._3_0.datatype.TFreqM;
import us.gov.dod.standard.ssrf._3_0.datatype.TMEMO;
import us.gov.dod.standard.ssrf._3_0.datatype.TS6;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN3;
import us.gov.dod.standard.ssrf._3_0.datatype.TS18;
import us.gov.dod.standard.ssrf._3_0.datatype.TS20;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for Station complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Station">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StationID" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 *         &lt;element name="CallSign" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/>
 *         &lt;element name="CositeSep" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="CositeSepDescription" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}NumUnits" minOccurs="0"/>
 *         &lt;element name="TSDF" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TTSDFValue" minOccurs="0"/>
 *         &lt;element name="UserCode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS6" minOccurs="0"/>
 *         &lt;element name="AntStructureHeight" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN3" minOccurs="0"/>
 *         &lt;element name="StationName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/>
 *         &lt;element name="StationControl" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS18" minOccurs="0"/>
 *         &lt;element name="POCInformation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StationLoc" type="{urn:us:gov:dod:standard:ssrf:3.0.0}StationLoc" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Station", propOrder = {
  "stationID",
  "callSign",
  "cositeSep",
  "cositeSepDescription",
  "numMobileUnits",
  "numAreaUnits",
  "numCositedUnits",
  "tsdf",
  "userCode",
  "antStructureHeight",
  "stationName",
  "stationControl",
  "pocInformation",
  "stationLoc"
})
public class Station {

  @XmlElement(name = "StationID", required = true)
  protected TS100 stationID;
  @XmlElementRef(name = "CallSign", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS20> callSign;
  @XmlElementRef(name = "CositeSep", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> cositeSep;
  @XmlElementRef(name = "CositeSepDescription", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> cositeSepDescription;
  @XmlElementRef(name = "NumMobileUnits", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN9> numMobileUnits;
  @XmlElementRef(name = "NumAreaUnits", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN9> numAreaUnits;
  @XmlElementRef(name = "NumCositedUnits", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN9> numCositedUnits;
  @XmlElementRef(name = "TSDF", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TTSDFValue> tsdf;
  @XmlElementRef(name = "UserCode", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS6> userCode;
  @XmlElementRef(name = "AntStructureHeight", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN3> antStructureHeight;
  @XmlElementRef(name = "StationName", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS100> stationName;
  @XmlElementRef(name = "StationControl", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS18> stationControl;
  @XmlElement(name = "POCInformation")
  protected List<POCInformation> pocInformation;
  @XmlElement(name = "StationLoc", required = true)
  protected List<StationLoc> stationLoc;

  /**
   * Gets the value of the stationID property.
   * <p>
   * @return possible object is {@link TS100 }
   * <p>
   */
  public TS100 getStationID() {
    return stationID;
  }

  /**
   * Sets the value of the stationID property.
   * <p>
   * @param value allowed object is {@link TS100 }
   * <p>
   */
  public void setStationID(TS100 value) {
    this.stationID = value;
  }

  /**
   * Gets the value of the callSign property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public JAXBElement<TS20> getCallSign() {
    return callSign;
  }

  /**
   * Sets the value of the callSign property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public void setCallSign(JAXBElement<TS20> value) {
    this.callSign = value;
  }

  /**
   * Gets the value of the cositeSep property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getCositeSep() {
    return cositeSep;
  }

  /**
   * Sets the value of the cositeSep property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setCositeSep(JAXBElement<TFreqM> value) {
    this.cositeSep = value;
  }

  /**
   * Gets the value of the cositeSepDescription property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getCositeSepDescription() {
    return cositeSepDescription;
  }

  /**
   * Sets the value of the cositeSepDescription property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setCositeSepDescription(JAXBElement<TMEMO> value) {
    this.cositeSepDescription = value;
  }

  /**
   * Gets the value of the numMobileUnits property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public JAXBElement<TUN9> getNumMobileUnits() {
    return numMobileUnits;
  }

  /**
   * Sets the value of the numMobileUnits property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public void setNumMobileUnits(JAXBElement<TUN9> value) {
    this.numMobileUnits = value;
  }

  /**
   * Gets the value of the numAreaUnits property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public JAXBElement<TUN9> getNumAreaUnits() {
    return numAreaUnits;
  }

  /**
   * Sets the value of the numAreaUnits property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public void setNumAreaUnits(JAXBElement<TUN9> value) {
    this.numAreaUnits = value;
  }

  /**
   * Gets the value of the numCositedUnits property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public JAXBElement<TUN9> getNumCositedUnits() {
    return numCositedUnits;
  }

  /**
   * Sets the value of the numCositedUnits property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public void setNumCositedUnits(JAXBElement<TUN9> value) {
    this.numCositedUnits = value;
  }

  /**
   * Gets the value of the tsdf property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TTSDFValue }{@code >}
   * <p>
   */
  public JAXBElement<TTSDFValue> getTSDF() {
    return tsdf;
  }

  /**
   * Sets the value of the tsdf property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TTSDFValue }{@code >}
   * <p>
   */
  public void setTSDF(JAXBElement<TTSDFValue> value) {
    this.tsdf = value;
  }

  /**
   * Gets the value of the userCode property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS6 }{@code >}
   * <p>
   */
  public JAXBElement<TS6> getUserCode() {
    return userCode;
  }

  /**
   * Sets the value of the userCode property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS6 }{@code >}
   * <p>
   */
  public void setUserCode(JAXBElement<TS6> value) {
    this.userCode = value;
  }

  /**
   * Gets the value of the antStructureHeight property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN3 }{@code >}
   * <p>
   */
  public JAXBElement<TUN3> getAntStructureHeight() {
    return antStructureHeight;
  }

  /**
   * Sets the value of the antStructureHeight property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN3 }{@code >}
   * <p>
   */
  public void setAntStructureHeight(JAXBElement<TUN3> value) {
    this.antStructureHeight = value;
  }

  /**
   * Gets the value of the stationName property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public JAXBElement<TS100> getStationName() {
    return stationName;
  }

  /**
   * Sets the value of the stationName property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public void setStationName(JAXBElement<TS100> value) {
    this.stationName = value;
  }

  /**
   * Gets the value of the stationControl property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS18 }{@code >}
   * <p>
   */
  public JAXBElement<TS18> getStationControl() {
    return stationControl;
  }

  /**
   * Sets the value of the stationControl property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS18 }{@code >}
   * <p>
   */
  public void setStationControl(JAXBElement<TS18> value) {
    this.stationControl = value;
  }

  /**
   * Gets the value of the pocInformation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pocInformation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPOCInformation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link POCInformation }
   * <p>
   * <p>
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
  }

  /**
   * Gets the value of the stationLoc property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the stationLoc property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStationLoc().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link StationLoc }
   * <p>
   * <p>
   */
  public List<StationLoc> getStationLoc() {
    if (stationLoc == null) {
      stationLoc = new ArrayList<>();
    }
    return this.stationLoc;
  }

}
