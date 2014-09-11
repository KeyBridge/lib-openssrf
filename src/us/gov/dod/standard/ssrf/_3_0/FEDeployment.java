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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.domains.TString;

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
public class FEDeployment extends Common {

  @XmlElement(name = "FERef", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString feRef;
  @XmlElement(name = "Type", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString type;
  @XmlElement(name = "Num", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger num;
  @XmlElement(name = "Seconds", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMINSEC.class)
  private TString seconds;
  @XmlElement(name = "Minutes", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMINSEC.class)
  private TString minutes;
  @XmlElement(name = "Hours", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterHOURS.class)
  private TString hours;
  @XmlElement(name = "DaysOfMonth", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterDAYSOFMONTH.class)
  private TString daysOfMonth;
  @XmlElement(name = "Months", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMONTHS.class)
  private TString months;
  @XmlElement(name = "DaysOfWeek", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterDAYSOFWEEK.class)
  private TString daysOfWeek;
  @XmlElement(name = "Years", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterYEARS.class)
  private TString years;
  @XmlElement(name = "Duration", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger duration;
  @XmlElement(name = "LocationRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString locationRef;
  @XmlElement(name = "Project")
  private List<Project> project;
  @XmlElement(name = "AtWaypoint")
  private List<AtWaypoint> atWaypoint;

  /**
   * Gets the value of the feRef property.
   * <p>
   * @return 
   */
  public TString getFERef() {
    return feRef;
  }

  /**
   * Sets the value of the feRef property.
   * <p>
   * @param value 
   */
  public void setFERef(TString value) {
    this.feRef = value;
  }

  public boolean isSetFERef() {
    return (this.feRef != null);
  }

  /**
   * Gets the value of the type property.
   * <p>
   * @return 
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value 
   */
  public void setType(TString value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Gets the value of the num property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TInteger getNum() {
    return num;
  }

  /**
   * Sets the value of the num property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setNum(TInteger value) {
    this.num = value;
  }

  public boolean isSetNum() {
    return (this.num != null);
  }

  /**
   * Gets the value of the seconds property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getSeconds() {
    return seconds;
  }

  /**
   * Sets the value of the seconds property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setSeconds(TString value) {
    this.seconds = value;
  }

  public boolean isSetSeconds() {
    return (this.seconds != null);
  }

  /**
   * Gets the value of the minutes property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getMinutes() {
    return minutes;
  }

  /**
   * Sets the value of the minutes property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setMinutes(TString value) {
    this.minutes = value;
  }

  public boolean isSetMinutes() {
    return (this.minutes != null);
  }

  /**
   * Gets the value of the hours property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getHours() {
    return hours;
  }

  /**
   * Sets the value of the hours property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setHours(TString value) {
    this.hours = value;
  }

  public boolean isSetHours() {
    return (this.hours != null);
  }

  /**
   * Gets the value of the daysOfMonth property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getDaysOfMonth() {
    return daysOfMonth;
  }

  /**
   * Sets the value of the daysOfMonth property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setDaysOfMonth(TString value) {
    this.daysOfMonth = value;
  }

  public boolean isSetDaysOfMonth() {
    return (this.daysOfMonth != null);
  }

  /**
   * Gets the value of the months property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getMonths() {
    return months;
  }

  /**
   * Sets the value of the months property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setMonths(TString value) {
    this.months = value;
  }

  public boolean isSetMonths() {
    return (this.months != null);
  }

  /**
   * Gets the value of the daysOfWeek property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getDaysOfWeek() {
    return daysOfWeek;
  }

  /**
   * Sets the value of the daysOfWeek property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setDaysOfWeek(TString value) {
    this.daysOfWeek = value;
  }

  public boolean isSetDaysOfWeek() {
    return (this.daysOfWeek != null);
  }

  /**
   * Gets the value of the years property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getYears() {
    return years;
  }

  /**
   * Sets the value of the years property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setYears(TString value) {
    this.years = value;
  }

  public boolean isSetYears() {
    return (this.years != null);
  }

  /**
   * Gets the value of the duration property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TInteger getDuration() {
    return duration;
  }

  /**
   * Sets the value of the duration property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setDuration(TInteger value) {
    this.duration = value;
  }

  public boolean isSetDuration() {
    return (this.duration != null);
  }

  /**
   * Gets the value of the locationRef property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getLocationRef() {
    return locationRef;
  }

  /**
   * Sets the value of the locationRef property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setLocationRef(TString value) {
    this.locationRef = value;
  }

  public boolean isSetLocationRef() {
    return (this.locationRef != null);
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
   * Objects of the following type(s) are allowed in the list 
   * <p>
   * <p>
   * @return
   */
  public List<Project> getProject() {
    if (project == null) {
      project = new ArrayList<>();
    }
    return this.project;
  }

  public boolean isSetProject() {
    return ((this.project != null) && (!this.project.isEmpty()));
  }

  public void unsetProject() {
    this.project = null;
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
     * 
   * <p>
   * <p>
   * @return
   */
  public List<AtWaypoint> getAtWaypoint() {
    if (atWaypoint == null) {
      atWaypoint = new ArrayList<>();
    }
    return this.atWaypoint;
  }

  public boolean isSetAtWaypoint() {
    return ((this.atWaypoint != null) && (!this.atWaypoint.isEmpty()));
  }

  public void unsetAtWaypoint() {
    this.atWaypoint = null;
  }

  public FEDeployment withFERef(String value) {
    setFERef(new TString(value));
    return this;
  }

  public FEDeployment withType(String value) {
    setType(new TString(value));
    return this;
  }

  public FEDeployment withNum(Integer value) {
    setNum(new TInteger(value));
    return this;
  }

  public FEDeployment withSeconds(String value) {
    setSeconds(new TString(value));
    return this;
  }

  public FEDeployment withMinutes(String value) {
    setMinutes(new TString(value));
    return this;
  }

  public FEDeployment withHours(String value) {
    setHours(new TString(value));
    return this;
  }

  public FEDeployment withDaysOfMonth(String value) {
    setDaysOfMonth(new TString(value));
    return this;
  }

  public FEDeployment withMonths(String value) {
    setMonths(new TString(value));
    return this;
  }

  public FEDeployment withDaysOfWeek(String value) {
    setDaysOfWeek(new TString(value));
    return this;
  }

  public FEDeployment withYears(String value) {
    setYears(new TString(value));
    return this;
  }

  public FEDeployment withDuration(Integer value) {
    setDuration(new TInteger(value));
    return this;
  }

  public FEDeployment withLocationRef(String value) {
    setLocationRef(new TString(value));
    return this;
  }

  public FEDeployment withProject(Project... values) {
    if (values != null) {
      getProject().addAll(Arrays.asList(values));
    }
    return this;
  }

  public FEDeployment withProject(Collection<Project> values) {
    if (values != null) {
      getProject().addAll(values);
    }
    return this;
  }

  public FEDeployment withAtWaypoint(AtWaypoint... values) {
    if (values != null) {
      getAtWaypoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  public FEDeployment withAtWaypoint(Collection<AtWaypoint> values) {
    if (values != null) {
      getAtWaypoint().addAll(values);
    }
    return this;
  }

}
