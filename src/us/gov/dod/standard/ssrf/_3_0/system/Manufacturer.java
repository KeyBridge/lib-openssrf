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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCAO;

/**
 * Java class for Manufacturer complex type.
 * <p>
 * Data element Manufacturer contains the manufacturer name of the equipment
 * listed in the corresponding data entry in data element Nomenclature.
 * Additionally the country in which the equipment is manufactured may be
 * included.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Manufacturer", propOrder = {
  "country",
  "name"
})
public class Manufacturer {

  /**
   * Country: Enter the country or area in which the Manufacturer has its
   * Headquarters.
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CAO
   */
  @XmlElement(name = "Country", required = false)
  private TString country;
  /**
   * Name: Enter the name of the company that manufactured the equipment.
   * <p>
   * The manufacturer's name should be obtained from data plates on equipment
   * whenever possible. This entry is optional when government nomenclature is
   * entered in element Nomenclature. Use the phrase "Intentionally not
   * disclosed" when the manufacturer is known but intentionally not listed (for
   * the issue of internal security of the manufacturer); in this case a Remarks
   * MAY be used to quantify the information to a level compatible with the
   * dataset intended classification.
   */
  @XmlElement(name = "Name", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString name;

  /**
   * Gets the value of the country property.
   * <p>
   * @return
   */
  public TString getCountry() {
    return country;
  }

  /**
   * Sets the value of the country property.
   * <p>
   * @param value
   */
  public void setCountry(TString value) {
    this.country = value;
  }

  public boolean isSetCountry() {
    return (this.country != null);
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

  public Manufacturer withCountry(ListCAO value) {
    setCountry(new TString(value.value()));
    return this;
  }

  public Manufacturer withName(String value) {
    setName(new TString(value));
    return this;
  }

}
