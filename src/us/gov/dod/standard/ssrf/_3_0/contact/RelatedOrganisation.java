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
package us.gov.dod.standard.ssrf._3_0.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCFR;

/**
 * Java class for RelatedOrganisation complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;complexType name="RelatedOrganisation"> &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence> &lt;element name="Type"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25" minOccurs="0"/> &lt;element
 * name="Relation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCFR"/>
 * &lt;element name="Serial"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial"/> &lt;/sequence>
 * &lt;/restriction> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedOrganisation", propOrder = {
  "type",
  "relation",
  "serial"
})
public class RelatedOrganisation {

  @XmlElement(name = "Type", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString type;
  @XmlElement(name = "Relation", required = true)
  private TString relation;
  @XmlElement(name = "Serial", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;

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
   * Gets the value of the relation property.
   * <p>
   * @return
   */
  public TString getRelation() {
    return relation;
  }

  /**
   * Sets the value of the relation property.
   * <p>
   * @param value
   */
  public void setRelation(TString value) {
    this.relation = value;
  }

  public boolean isSetRelation() {
    return (this.relation != null);
  }

  /**
   * Gets the value of the serial property.
   * <p>
   * @return
   */
  public TString getSerial() {
    return serial;
  }

  /**
   * Sets the value of the serial property.
   * <p>
   * @param value
   */
  public void setSerial(TString value) {
    this.serial = value;
  }

  public boolean isSetSerial() {
    return (this.serial != null);
  }

  public RelatedOrganisation withType(String value) {
    setType(new TString(value));
    return this;
  }

  public RelatedOrganisation withRelation(ListCFR value) {
    setRelation(new TString(value.value()));
    return this;
  }

  public RelatedOrganisation withSerial(TString value) {
    setSerial(value);
    return this;
  }

}
