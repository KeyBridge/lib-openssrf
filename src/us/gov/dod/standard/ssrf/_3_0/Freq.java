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

import us.gov.dod.standard.ssrf._3_0.datatype.TUS5;
import us.gov.dod.standard.ssrf._3_0.datatype.TS20;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for Freq complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="Freq">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}AsgnFreqBase">
 *       &lt;sequence>
 *         &lt;element name="TAD" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS5" minOccurs="0"/>
 *         &lt;element name="LegacyNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/>
 *         &lt;element name="PairedFreq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}PairedFreq" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NarrowBandPlanning" type="{urn:us:gov:dod:standard:ssrf:3.0.0}NarrowBandPlanning" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
public class Freq
  extends AsgnFreqBase {

  @XmlElementRef(name = "TAD", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUS5> tad;
  @XmlElementRef(name = "LegacyNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS20> legacyNum;
  @XmlElement(name = "PairedFreq")
  protected List<PairedFreq> pairedFreq;
  @XmlElement(name = "NarrowBandPlanning")
  protected List<NarrowBandPlanning> narrowBandPlanning;

  /**
   * Gets the value of the tad property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUS5 }{@code >}
   * <p>
   */
  public JAXBElement<TUS5> getTAD() {
    return tad;
  }

  /**
   * Sets the value of the tad property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUS5 }{@code >}
   * <p>
   */
  public void setTAD(JAXBElement<TUS5> value) {
    this.tad = value;
  }

  /**
   * Gets the value of the legacyNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public JAXBElement<TS20> getLegacyNum() {
    return legacyNum;
  }

  /**
   * Sets the value of the legacyNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public void setLegacyNum(JAXBElement<TS20> value) {
    this.legacyNum = value;
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
     * {@link PairedFreq }
   * <p>
   * <p>
   */
  public List<PairedFreq> getPairedFreq() {
    if (pairedFreq == null) {
      pairedFreq = new ArrayList<>();
    }
    return this.pairedFreq;
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
     * {@link NarrowBandPlanning }
   * <p>
   * <p>
   */
  public List<NarrowBandPlanning> getNarrowBandPlanning() {
    if (narrowBandPlanning == null) {
      narrowBandPlanning = new ArrayList<>();
    }
    return this.narrowBandPlanning;
  }

}
