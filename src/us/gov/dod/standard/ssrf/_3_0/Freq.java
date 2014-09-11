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
import us.gov.dod.standard.ssrf._3_0.domains.TString;

/**
 * <p>
 * Java class for Freq complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Freq"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}AsgnFreqBase"> &lt;sequence>
 * &lt;element name="TAD" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS5"
 * minOccurs="0"/> &lt;element name="LegacyNum"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/> &lt;element
 * name="PairedFreq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}PairedFreq"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="NarrowBandPlanning"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}NarrowBandPlanning"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;/sequence> &lt;/extension>
 * &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Freq", propOrder = {
  "tad",
  "legacyNum",
  "pairedFreq",
  "narrowBandPlanning"
})
public class Freq extends AsgnFreqBase {

  @XmlElement(name = "TAD", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterUS5.class)
  private TString tad;
  @XmlElement(name = "LegacyNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString legacyNum;
  @XmlElement(name = "PairedFreq")
  private List<PairedFreq> pairedFreq;
  @XmlElement(name = "NarrowBandPlanning")
  private List<NarrowBandPlanning> narrowBandPlanning;

  /**
   * Gets the value of the tad property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getTAD() {
    return tad;
  }

  /**
   * Sets the value of the tad property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setTAD(TString value) {
    this.tad = value;
  }

  public boolean isSetTAD() {
    return (this.tad != null);
  }

  /**
   * Gets the value of the legacyNum property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getLegacyNum() {
    return legacyNum;
  }

  /**
   * Sets the value of the legacyNum property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setLegacyNum(TString value) {
    this.legacyNum = value;
  }

  public boolean isSetLegacyNum() {
    return (this.legacyNum != null);
  }

  /**
   * Gets the value of the pairedFreq property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pairedFreq property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPairedFreq().add(newItem);
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
  public List<PairedFreq> getPairedFreq() {
    if (pairedFreq == null) {
      pairedFreq = new ArrayList<>();
    }
    return this.pairedFreq;
  }

  public boolean isSetPairedFreq() {
    return ((this.pairedFreq != null) && (!this.pairedFreq.isEmpty()));
  }

  public void unsetPairedFreq() {
    this.pairedFreq = null;
  }

  /**
   * Gets the value of the narrowBandPlanning property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the narrowBandPlanning property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getNarrowBandPlanning().add(newItem);
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
  public List<NarrowBandPlanning> getNarrowBandPlanning() {
    if (narrowBandPlanning == null) {
      narrowBandPlanning = new ArrayList<>();
    }
    return this.narrowBandPlanning;
  }

  public boolean isSetNarrowBandPlanning() {
    return ((this.narrowBandPlanning != null) && (!this.narrowBandPlanning.isEmpty()));
  }

  public void unsetNarrowBandPlanning() {
    this.narrowBandPlanning = null;
  }

  public Freq withTAD(String value) {
    setTAD(new TString(value));
    return this;
  }

  public Freq withLegacyNum(String value) {
    setLegacyNum(new TString(value));
    return this;
  }

  public Freq withPairedFreq(PairedFreq... values) {
    if (values != null) {
      getPairedFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Freq withPairedFreq(Collection<PairedFreq> values) {
    if (values != null) {
      getPairedFreq().addAll(values);
    }
    return this;
  }

  public Freq withNarrowBandPlanning(NarrowBandPlanning... values) {
    if (values != null) {
      getNarrowBandPlanning().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Freq withNarrowBandPlanning(Collection<NarrowBandPlanning> values) {
    if (values != null) {
      getNarrowBandPlanning().addAll(values);
    }
    return this;
  }

}
