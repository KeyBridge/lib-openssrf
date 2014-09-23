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
package us.gov.dod.standard.ssrf._3_0.system;

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
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCNU;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCTO;

/**
 * Java class for Nomenclature complex type.
 * <p>
 * Data element Nomenclature identifies either the standard military
 * nomenclature or the commercial model number of an antenna, equipment or
 * system. Each antenna, equipment or system may have several types of
 * nomenclature, e.g. both a military nomenclature and a commercial model
 * number.
 * <p>
 * If available, the system nomenclature is preferred rather than the component
 * nomenclature; however, either is acceptable.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nomenclature", propOrder = {
  "type",
  "level",
  "name",
  "manufacturer"
})
public class Nomenclature {

  /**
   * Type: Enter the type of nomenclature (commercial, military, etc).
   * <p>
   * Recommend values from Code List CTO
   */
  @XmlElement(name = "Type", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString type;
  /**
   * Level: Enter the level of nomenclature (primary, nickname, etc).
   * <p>
   * Recommend values from Code List CNU
   */
  @XmlElement(name = "Level", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString level;
  /**
   * Name: Enter the nomenclature subject to the following:
   * <ul>
   * <li> For a government equipment nomenclature, enter the standard military
   * or government nomenclature.</li>
   * <li> If only a commercial model number is available, enter the complete
   * model number and indicate the manufacturer of the equipment in data element
   * Manufacturer.</li>
   * <li> If the nomenclature includes a modification, insert MOD and a number,
   * if applicable, immediately following the nomenclature. For the word MARK,
   * insert MK as the first part of the nomenclature e.g. "MK 53 MOD 1".</li>
   * <li> If the equipment does not have an assigned government nomenclature or
   * commercial model number, enter a general description in this item
   * (mandatory item), and enter the manufacturer name with a brief description
   * of the equipment in a data element Remarks.</li>
   * <li> If the equipment is being submitted to ITU the maximum number of
   * characters is 20.</li>
   * </ul>
   */
  @XmlElement(name = "Name", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
  /**
   *
   */
  @XmlElement(name = "Manufacturer")
  private List<Manufacturer> manufacturer;

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
   * Gets the value of the level property.
   * <p>
   * @return
   */
  public TString getLevel() {
    return level;
  }

  /**
   * Sets the value of the level property.
   * <p>
   * @param value
   */
  public void setLevel(TString value) {
    this.level = value;
  }

  public boolean isSetLevel() {
    return (this.level != null);
  }

  /**
   * Gets the value of the name property.
   * <p>
   * @return
   */
  public TString getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * <p>
   * @param value
   */
  public void setName(TString value) {
    this.name = value;
  }

  public boolean isSetName() {
    return (this.name != null);
  }

  /**
   * Gets the value of the manufacturer property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the manufacturer property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getManufacturer().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Manufacturer> getManufacturer() {
    if (manufacturer == null) {
      manufacturer = new ArrayList<>();
    }
    return this.manufacturer;
  }

  public boolean isSetManufacturer() {
    return ((this.manufacturer != null) && (!this.manufacturer.isEmpty()));
  }

  public void unsetManufacturer() {
    this.manufacturer = null;
  }

  public Nomenclature withType(String value) {
    setType(new TString(value));
    return this;
  }

  public Nomenclature withType(ListCTO value) {
    setType(new TString(value.value()));
    return this;
  }

  public Nomenclature withLevel(String value) {
    setLevel(new TString(value));
    return this;
  }

  public Nomenclature withLevel(ListCNU value) {
    setLevel(new TString(value.value()));
    return this;
  }

  public Nomenclature withName(String value) {
    setName(new TString(value));
    return this;
  }

  public Nomenclature withManufacturer(Manufacturer... values) {
    if (values != null) {
      getManufacturer().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Nomenclature withManufacturer(Collection<Manufacturer> values) {
    if (values != null) {
      getManufacturer().addAll(values);
    }
    return this;
  }

}