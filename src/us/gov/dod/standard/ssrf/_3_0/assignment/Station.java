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
package us.gov.dod.standard.ssrf._3_0.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.contact.POCInformation;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * Java class for Station complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;complexType name="Station"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="StationID" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 * &lt;element name="CallSign" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20"
 * minOccurs="0"/> &lt;element name="CositeSep"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/> &lt;element
 * name="CositeSepDescription" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO"
 * minOccurs="0"/> &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}NumUnits"
 * minOccurs="0"/> &lt;element name="TSDF"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TTSDFValue" minOccurs="0"/>
 * &lt;element name="UserCode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS6"
 * minOccurs="0"/> &lt;element name="AntStructureHeight"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN3" minOccurs="0"/> &lt;element
 * name="StationName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"
 * minOccurs="0"/> &lt;element name="StationControl"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS18" minOccurs="0"/> &lt;element
 * name="POCInformation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="StationLoc"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}StationLoc" maxOccurs="unbounded"/>
 * &lt;/sequence> &lt;/restriction> &lt;/complexContent> &lt;/complexType>
 * </pre>
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
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString stationID;
  @XmlElement(name = "CallSign", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString callSign;
  @XmlElement(name = "CositeSep", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal cositeSep;
  @XmlElement(name = "CositeSepDescription", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString cositeSepDescription;
  @XmlElement(name = "NumMobileUnits", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numMobileUnits;
  @XmlElement(name = "NumAreaUnits", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numAreaUnits;
  @XmlElement(name = "NumCositedUnits", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numCositedUnits;
  @XmlElement(name = "TSDF", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterTSDFVALUE.class)
  private TString tsdf;
  @XmlElement(name = "UserCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS6.class)
  private TString userCode;
  @XmlElement(name = "AntStructureHeight", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN3.class)
  private TInteger antStructureHeight;
  @XmlElement(name = "StationName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString stationName;
  @XmlElement(name = "StationControl", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS18.class)
  private TString stationControl;
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  @XmlElement(name = "StationLoc", required = true)
  private List<StationLoc> stationLoc;

  /**
   * Gets the value of the stationID property.
   * <p>
   * @return
   */
  public TString getStationID() {
    return stationID;
  }

  /**
   * Sets the value of the stationID property.
   * <p>
   * @param value
   */
  public void setStationID(TString value) {
    this.stationID = value;
  }

  public boolean isSetStationID() {
    return (this.stationID != null);
  }

  /**
   * Gets the value of the callSign property.
   * <p>
   * @return 
   */
  public TString getCallSign() {
    return callSign;
  }

  /**
   * Sets the value of the callSign property.
   * <p>
   * @param value 
   */
  public void setCallSign(TString value) {
    this.callSign = value;
  }

  public boolean isSetCallSign() {
    return (this.callSign != null);
  }

  /**
   * Gets the value of the cositeSep property.
   * <p>
   * @return 
   */
  public TDecimal getCositeSep() {
    return cositeSep;
  }

  /**
   * Sets the value of the cositeSep property.
   * <p>
   * @param value 
   */
  public void setCositeSep(TDecimal value) {
    this.cositeSep = value;
  }

  public boolean isSetCositeSep() {
    return (this.cositeSep != null);
  }

  /**
   * Gets the value of the cositeSepDescription property.
   * <p>
   * @return 
   */
  public TString getCositeSepDescription() {
    return cositeSepDescription;
  }

  /**
   * Sets the value of the cositeSepDescription property.
   * <p>
   * @param value 
   */
  public void setCositeSepDescription(TString value) {
    this.cositeSepDescription = value;
  }

  public boolean isSetCositeSepDescription() {
    return (this.cositeSepDescription != null);
  }

  /**
   * Gets the value of the numMobileUnits property.
   * <p>
   * @return 
   */
  public TInteger getNumMobileUnits() {
    return numMobileUnits;
  }

  /**
   * Sets the value of the numMobileUnits property.
   * <p>
   * @param value 
   */
  public void setNumMobileUnits(TInteger value) {
    this.numMobileUnits = value;
  }

  public boolean isSetNumMobileUnits() {
    return (this.numMobileUnits != null);
  }

  /**
   * Gets the value of the numAreaUnits property.
   * <p>
   * @return 
   */
  public TInteger getNumAreaUnits() {
    return numAreaUnits;
  }

  /**
   * Sets the value of the numAreaUnits property.
   * <p>
   * @param value 
   */
  public void setNumAreaUnits(TInteger value) {
    this.numAreaUnits = value;
  }

  public boolean isSetNumAreaUnits() {
    return (this.numAreaUnits != null);
  }

  /**
   * Gets the value of the numCositedUnits property.
   * <p>
   * @return 
   */
  public TInteger getNumCositedUnits() {
    return numCositedUnits;
  }

  /**
   * Sets the value of the numCositedUnits property.
   * <p>
   * @param value 
   */
  public void setNumCositedUnits(TInteger value) {
    this.numCositedUnits = value;
  }

  public boolean isSetNumCositedUnits() {
    return (this.numCositedUnits != null);
  }

  /**
   * Gets the value of the tsdf property.
   * <p>
   * @return 
   */
  public TString getTSDF() {
    return tsdf;
  }

  /**
   * Sets the value of the tsdf property.
   * <p>
   * @param value 
   */
  public void setTSDF(TString value) {
    this.tsdf = value;
  }

  public boolean isSetTSDF() {
    return (this.tsdf != null);
  }

  /**
   * Gets the value of the userCode property.
   * <p>
   * @return 
   */
  public TString getUserCode() {
    return userCode;
  }

  /**
   * Sets the value of the userCode property.
   * <p>
   * @param value 
   */
  public void setUserCode(TString value) {
    this.userCode = value;
  }

  public boolean isSetUserCode() {
    return (this.userCode != null);
  }

  /**
   * Gets the value of the antStructureHeight property.
   * <p>
   * @return 
   */
  public TInteger getAntStructureHeight() {
    return antStructureHeight;
  }

  /**
   * Sets the value of the antStructureHeight property.
   * <p>
   * @param value 
   */
  public void setAntStructureHeight(TInteger value) {
    this.antStructureHeight = value;
  }

  public boolean isSetAntStructureHeight() {
    return (this.antStructureHeight != null);
  }

  /**
   * Gets the value of the stationName property.
   * <p>
   * @return 
   */
  public TString getStationName() {
    return stationName;
  }

  /**
   * Sets the value of the stationName property.
   * <p>
   * @param value 
   */
  public void setStationName(TString value) {
    this.stationName = value;
  }

  public boolean isSetStationName() {
    return (this.stationName != null);
  }

  /**
   * Gets the value of the stationControl property.
   * <p>
   * @return 
   */
  public TString getStationControl() {
    return stationControl;
  }

  /**
   * Sets the value of the stationControl property.
   * <p>
   * @param value 
   */
  public void setStationControl(TString value) {
    this.stationControl = value;
  }

  public boolean isSetStationControl() {
    return (this.stationControl != null);
  }

  /**
   * Gets the value of the pocInformation property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pocInformation property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPOCInformation().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
  }

  public boolean isSetPOCInformation() {
    return ((this.pocInformation != null) && (!this.pocInformation.isEmpty()));
  }

  public void unsetPOCInformation() {
    this.pocInformation = null;
  }

  /**
   * Gets the value of the stationLoc property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the stationLoc property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStationLoc().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<StationLoc> getStationLoc() {
    if (stationLoc == null) {
      stationLoc = new ArrayList<>();
    }
    return this.stationLoc;
  }

  public boolean isSetStationLoc() {
    return ((this.stationLoc != null) && (!this.stationLoc.isEmpty()));
  }

  public void unsetStationLoc() {
    this.stationLoc = null;
  }

  public Station withStationID(String value) {
    setStationID(new TString(value));
    return this;
  }

  public Station withCallSign(String value) {
    setCallSign(new TString(value));
    return this;
  }

  public Station withCositeSep(Double value) {
    setCositeSep(new TDecimal(value));
    return this;
  }

  public Station withCositeSepDescription(String value) {
    setCositeSepDescription(new TString(value));
    return this;
  }

  public Station withNumMobileUnits(Integer value) {
    setNumMobileUnits(new TInteger(value));
    return this;
  }

  public Station withNumAreaUnits(Integer value) {
    setNumAreaUnits(new TInteger(value));
    return this;
  }

  public Station withNumCositedUnits(Integer value) {
    setNumCositedUnits(new TInteger(value));
    return this;
  }

  public Station withTSDF(String value) {
    setTSDF(new TString(value));
    return this;
  }

  public Station withUserCode(String value) {
    setUserCode(new TString(value));
    return this;
  }

  public Station withAntStructureHeight(Integer value) {
    setAntStructureHeight(new TInteger(value));
    return this;
  }

  public Station withStationName(String value) {
    setStationName(new TString(value));
    return this;
  }

  public Station withStationControl(String value) {
    setStationControl(new TString(value));
    return this;
  }

  public Station withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Station withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  public Station withStationLoc(StationLoc... values) {
    if (values != null) {
      getStationLoc().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Station withStationLoc(Collection<StationLoc> values) {
    if (values != null) {
      getStationLoc().addAll(values);
    }
    return this;
  }

}
