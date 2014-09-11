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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * <p>
 * Java class for SysOfStation complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="SysOfStation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SysName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS30" minOccurs="0"/>
 *         &lt;element name="NumStations" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SysOfStation", propOrder = {
  "sysName",
  "numStations"
})
public class SysOfStation {

  @XmlElement(name = "SysName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS30.class)
  private TString sysName;
  @XmlElement(name = "NumStations", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numStations;

  /**
   * Gets the value of the sysName property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getSysName() {
    return sysName;
  }

  /**
   * Sets the value of the sysName property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setSysName(TString value) {
    this.sysName = value;
  }

  public boolean isSetSysName() {
    return (this.sysName != null);
  }

  /**
   * Gets the value of the numStations property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TInteger getNumStations() {
    return numStations;
  }

  /**
   * Sets the value of the numStations property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setNumStations(TInteger value) {
    this.numStations = value;
  }

  public boolean isSetNumStations() {
    return (this.numStations != null);
  }

  public SysOfStation withSysName(String value) {
    setSysName(new TString(value));
    return this;
  }

  public SysOfStation withNumStations(Integer value) {
    setNumStations(new TInteger(value));
    return this;
  }

}
