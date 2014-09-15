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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.administrative.CodeList;
import us.gov.dod.standard.ssrf._3_0.administrative.Dataset;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * Java class for Administrative complex type.
 * <p>
 * This element inherits attributes and sub-elements from element Common. Data
 * element Administrative has several usages:
 * <p>
 * It can be used to inform other data repositories that datasets have been
 * deleted from a data repository;
 * <p>
 * It can also be used to reject an incoming dataset which cannot be validated
 * against the local repository, for example is it refers to unknown datasets.
 * <p>
 * Automated local data repository changes are not permitted on US systems.
 * <p>
 * [XSL ERR DSTYPE] Part 3 of the Serial reference (dataset type) MUST be "DR".
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Administrative", propOrder = {
  "action",
  "dataset",
  "codeList"
})
public class Administrative extends Common<Administrative> {

  /**
   * Action: Indicate the action which triggered the transmission, or to be
   * performed upon reception, of this dataset.
   * <p>
   * Recommend values from Code List CDR.
   */
  @XmlElement(name = "Action", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString action;
  /**
   * Data element Dataset is used within an Administrative transaction to
   * specify the identifier of the datasets on which the action must apply.
   */
  @XmlElement(name = "Dataset")
  private List<Dataset> dataset;
  /**
   * Data element CodeList contains the information necessary to create or
   * delete a code entry in a given Code List.
   */
  @XmlElement(name = "CodeList")
  private List<CodeList> codeList;

  /**
   * Gets the value of the action property.
   * <p>
   * @return
   */
  public TString getAction() {
    return action;
  }

  /**
   * Sets the value of the action property.
   * <p>
   * @param value
   */
  public void setAction(TString value) {
    this.action = value;
  }

  public boolean isSetAction() {
    return (this.action != null);
  }

  /**
   * Gets the value of the dataset property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the dataset property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDataset().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Dataset> getDataset() {
    if (dataset == null) {
      dataset = new ArrayList<>();
    }
    return this.dataset;
  }

  public boolean isSetDataset() {
    return ((this.dataset != null) && (!this.dataset.isEmpty()));
  }

  public void unsetDataset() {
    this.dataset = null;
  }

  /**
   * Gets the value of the codeList property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the codeList property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCodeList().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<CodeList> getCodeList() {
    if (codeList == null) {
      codeList = new ArrayList<>();
    }
    return this.codeList;
  }

  public boolean isSetCodeList() {
    return ((this.codeList != null) && (!this.codeList.isEmpty()));
  }

  public void unsetCodeList() {
    this.codeList = null;
  }

  public Administrative withAction(String value) {
    setAction(new TString(value));
    return this;
  }

  public Administrative withDataset(Dataset... values) {
    if (values != null) {
      getDataset().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Administrative withDataset(Collection<Dataset> values) {
    if (values != null) {
      getDataset().addAll(values);
    }
    return this;
  }

  public Administrative withCodeList(CodeList... values) {
    if (values != null) {
      getCodeList().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Administrative withCodeList(Collection<CodeList> values) {
    if (values != null) {
      getCodeList().addAll(values);
    }
    return this;
  }

}
