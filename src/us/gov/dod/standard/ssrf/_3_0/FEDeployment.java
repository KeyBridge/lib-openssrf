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

import us.gov.dod.standard.ssrf._3_0.datatype.TUN4;
import us.gov.dod.standard.ssrf._3_0.datatype.TDaysOfMonth;
import us.gov.dod.standard.ssrf._3_0.datatype.TMinSec;
import us.gov.dod.standard.ssrf._3_0.datatype.TYears;
import us.gov.dod.standard.ssrf._3_0.datatype.TSerial;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN6;
import us.gov.dod.standard.ssrf._3_0.datatype.TS25;
import us.gov.dod.standard.ssrf._3_0.datatype.TDaysOfWeek;
import us.gov.dod.standard.ssrf._3_0.datatype.TMonths;
import us.gov.dod.standard.ssrf._3_0.datatype.THours;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for FEDeployment complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="FEDeployment">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common">
 *       &lt;sequence>
 *         &lt;element name="FERef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial"/>
 *         &lt;element name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25"/>
 *         &lt;element name="Num" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN6" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}TimeFrame" minOccurs="0"/>
 *         &lt;element name="LocationRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/>
 *         &lt;element name="Project" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Project" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AtWaypoint" type="{urn:us:gov:dod:standard:ssrf:3.0.0}AtWaypoint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEDeployment", propOrder = {
  "feRef",
  "type",
  "num",
  "seconds",
  "minutes",
  "hours",
  "daysOfMonth",
  "months",
  "daysOfWeek",
  "years",
  "duration",
  "locationRef",
  "project",
  "atWaypoint"
})
public class FEDeployment
  extends Common {

  @XmlElement(name = "FERef", required = true)
  protected TSerial feRef;
  @XmlElement(name = "Type", required = true)
  protected TS25 type;
  @XmlElementRef(name = "Num", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN6> num;
  @XmlElementRef(name = "Seconds", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMinSec> seconds;
  @XmlElementRef(name = "Minutes", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMinSec> minutes;
  @XmlElementRef(name = "Hours", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<THours> hours;
  @XmlElementRef(name = "DaysOfMonth", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDaysOfMonth> daysOfMonth;
  @XmlElementRef(name = "Months", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMonths> months;
  @XmlElementRef(name = "DaysOfWeek", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDaysOfWeek> daysOfWeek;
  @XmlElementRef(name = "Years", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TYears> years;
  @XmlElementRef(name = "Duration", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN4> duration;
  @XmlElementRef(name = "LocationRef", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TSerial> locationRef;
  @XmlElement(name = "Project")
  protected List<Project> project;
  @XmlElement(name = "AtWaypoint")
  protected List<AtWaypoint> atWaypoint;

  /**
   * Gets the value of the feRef property.
   * <p>
   * @return possible object is {@link TSerial }
   * <p>
   */
  public TSerial getFERef() {
    return feRef;
  }

  /**
   * Sets the value of the feRef property.
   * <p>
   * @param value allowed object is {@link TSerial }
   * <p>
   */
  public void setFERef(TSerial value) {
    this.feRef = value;
  }

  /**
   * Gets the value of the type property.
   * <p>
   * @return possible object is {@link TS25 }
   * <p>
   */
  public TS25 getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value allowed object is {@link TS25 }
   * <p>
   */
  public void setType(TS25 value) {
    this.type = value;
  }

  /**
   * Gets the value of the num property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6 }{@code >}
   * <p>
   */
  public JAXBElement<TUN6> getNum() {
    return num;
  }

  /**
   * Sets the value of the num property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6 }{@code >}
   * <p>
   */
  public void setNum(JAXBElement<TUN6> value) {
    this.num = value;
  }

  /**
   * Gets the value of the seconds property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public JAXBElement<TMinSec> getSeconds() {
    return seconds;
  }

  /**
   * Sets the value of the seconds property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public void setSeconds(JAXBElement<TMinSec> value) {
    this.seconds = value;
  }

  /**
   * Gets the value of the minutes property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public JAXBElement<TMinSec> getMinutes() {
    return minutes;
  }

  /**
   * Sets the value of the minutes property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public void setMinutes(JAXBElement<TMinSec> value) {
    this.minutes = value;
  }

  /**
   * Gets the value of the hours property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link THours }{@code >}
   * <p>
   */
  public JAXBElement<THours> getHours() {
    return hours;
  }

  /**
   * Sets the value of the hours property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link THours }{@code >}
   * <p>
   */
  public void setHours(JAXBElement<THours> value) {
    this.hours = value;
  }

  /**
   * Gets the value of the daysOfMonth property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDaysOfMonth }{@code >}
   * <p>
   */
  public JAXBElement<TDaysOfMonth> getDaysOfMonth() {
    return daysOfMonth;
  }

  /**
   * Sets the value of the daysOfMonth property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDaysOfMonth }{@code >}
   * <p>
   */
  public void setDaysOfMonth(JAXBElement<TDaysOfMonth> value) {
    this.daysOfMonth = value;
  }

  /**
   * Gets the value of the months property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMonths }{@code >}
   * <p>
   */
  public JAXBElement<TMonths> getMonths() {
    return months;
  }

  /**
   * Sets the value of the months property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMonths }{@code >}
   * <p>
   */
  public void setMonths(JAXBElement<TMonths> value) {
    this.months = value;
  }

  /**
   * Gets the value of the daysOfWeek property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDaysOfWeek }{@code >}
   * <p>
   */
  public JAXBElement<TDaysOfWeek> getDaysOfWeek() {
    return daysOfWeek;
  }

  /**
   * Sets the value of the daysOfWeek property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDaysOfWeek }{@code >}
   * <p>
   */
  public void setDaysOfWeek(JAXBElement<TDaysOfWeek> value) {
    this.daysOfWeek = value;
  }

  /**
   * Gets the value of the years property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TYears }{@code >}
   * <p>
   */
  public JAXBElement<TYears> getYears() {
    return years;
  }

  /**
   * Sets the value of the years property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TYears }{@code >}
   * <p>
   */
  public void setYears(JAXBElement<TYears> value) {
    this.years = value;
  }

  /**
   * Gets the value of the duration property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public JAXBElement<TUN4> getDuration() {
    return duration;
  }

  /**
   * Sets the value of the duration property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public void setDuration(JAXBElement<TUN4> value) {
    this.duration = value;
  }

  /**
   * Gets the value of the locationRef property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public JAXBElement<TSerial> getLocationRef() {
    return locationRef;
  }

  /**
   * Sets the value of the locationRef property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setLocationRef(JAXBElement<TSerial> value) {
    this.locationRef = value;
  }

  /**
   * Gets the value of the project property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the project property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getProject().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Project }
   * <p>
   * <p>
   */
  public List<Project> getProject() {
    if (project == null) {
      project = new ArrayList<>();
    }
    return this.project;
  }

  /**
   * Gets the value of the atWaypoint property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the atWaypoint property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAtWaypoint().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link AtWaypoint }
   * <p>
   * <p>
   */
  public List<AtWaypoint> getAtWaypoint() {
    if (atWaypoint == null) {
      atWaypoint = new ArrayList<>();
    }
    return this.atWaypoint;
  }

}
