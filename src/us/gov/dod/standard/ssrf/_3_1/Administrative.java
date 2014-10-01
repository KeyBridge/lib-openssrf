/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.administrative.CodeList;
import us.gov.dod.standard.ssrf._3_1.administrative.Dataset;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCDR;

/**
 * Data element Administrative has several usages:
 * <ul>
 * <li>It can be used to inform other data repositories that datasets have been
 * deleted from a data repository;</li>
 * <li>It can also be used to reject an incoming dataset which cannot be
 * validated against the local repository, for example if it refers to unknown
 * datasets.</li>
 * <li>Automated local data repository changes are not permitted on US
 * systems.</li></ul>
 * <p>
 * Sub-Elements are {@link CodeList}, {@link Dataset}
 * <p>
 * Example: Rejecting an Assignment for which the recipient does not have the
 * referenced Transmitter dataset:
 * <pre>
 * &lt;Administrative cls="U"&gt;
 *   &lt;Serial cls="U"&gt;DEU:NFA:DR:123&lt;/Serial&gt;
 *   &lt;MessageRef cls="U"&gt;DEU:NFA:MS:123&lt;/MessageRef&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Action cls="U"&gt;Missing Refs&lt;/Action&gt;
 *   &lt;Dataset&gt;
 *     &lt;Serial cls="U"&gt;USA::AS:456&lt;/Serial&gt;
 *     &lt;MissingRef cls="U"&gt;USA::TX:123&lt;/MissingRef&gt;
 *   &lt;/Dataset&gt;
 * &lt;/Administrative&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Administrative", propOrder = {
  "action",
  "messageRef",
  "dataset",
  "codeList"
})
public class Administrative extends Common<Administrative> {

  /**
   * Action - Action (Required)
   * <p>
   * The action which triggered the transmission, or to be performed upon
   * reception, of this dataset.
   * <p>
   * Format is L:CDR
   */
  @XmlElement(name = "Action", required = true)
  private TString action;
  /**
   * MessageRef - Message Reference (Optional)
   * <p>
   * The serial of the Message Dataset that is causing this response.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "MessageRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString messageRef;
  /**
   * Dataset (Optional)
   * <p>
   * Dataset is used within an Administrative transaction to specify the
   * identifier of the datasets on which the action must apply.
   */
  @XmlElement(name = "Dataset")
  private List<Dataset> dataset;
  /**
   * CodeList (Optional)
   * <p>
   * CodeList contains the actions necessary to create or delete a code entry in
   * a given Code List.
   */
  @XmlElement(name = "CodeList")
  private List<CodeList> codeList;

  /**
   * Get the action which triggered the transmission, or to be performed upon
   * reception, of this dataset.
   * <p>
   * @return the Action value in a {@link TString} data type
   */
  public TString getAction() {
    return action;
  }

  /**
   * Set the action which triggered the transmission, or to be performed upon
   * reception, of this dataset.
   * <p>
   * @param value the Action value in a {@link TString} data type
   */
  public void setAction(TString value) {
    this.action = value;
  }

  /**
   * Determine if the Action is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAction() {
    return (this.action != null ? this.action.isSetValue() : false);
  }

  /**
   * Get the serial of the Message Dataset that is causing this response.
   * <p>
   * @return the MessageRef value in a {@link TString} data type
   */
  public TString getMessageRef() {
    return messageRef;
  }

  /**
   * Set the serial of the Message Dataset that is causing this response.
   * <p>
   * @param value the MessageRef value in a {@link TString} data type
   */
  public void setMessageRef(TString value) {
    this.messageRef = value;
  }

  /**
   * Determine if the MessageRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMessageRef() {
    return (this.messageRef != null ? this.messageRef.isSetValue() : false);
  }

  /**
   * Get the Dataset
   * <p>
   * Complex element Dataset is used within an Administrative transaction to
   * specify the identifier of the datasets on which the action must apply.
   * <p>
   * @return a {@link List<Dataset>} instance
   */
  public List<Dataset> getDataset() {
    if (dataset == null) {
      dataset = new ArrayList<>();
    }
    return this.dataset;
  }

  /**
   * Determine if the Dataset is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDataset() {
    return ((this.dataset != null) && (!this.dataset.isEmpty()));
  }

  /**
   * Clear the Dataset field. This sets the field to null.
   */
  public void unsetDataset() {
    this.dataset = null;
  }

  /**
   * Get the CodeList
   * <p>
   * Complex element CodeList contains the actions necessary to create or delete
   * a code entry in a given Code List.
   * <p>
   * @return a {@link List<CodeList>} instance
   */
  public List<CodeList> getCodeList() {
    if (codeList == null) {
      codeList = new ArrayList<>();
    }
    return this.codeList;
  }

  /**
   * Determine if the CodeList is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCodeList() {
    return ((this.codeList != null) && (!this.codeList.isEmpty()));
  }

  /**
   * Clear the CodeList field. This sets the field to null.
   */
  public void unsetCodeList() {
    this.codeList = null;
  }

  /**
   * Set the action which triggered the transmission, or to be performed upon
   * reception, of this dataset.
   * <p>
   * @param value An instances of type {@link ListCDR}
   * @return The current Administrative object instance
   */
  public Administrative withAction(ListCDR value) {
    setAction(new TString(value.value()));
    return this;
  }

  /**
   * Set the serial of the Message Dataset that is causing this response.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Administrative object instance
   */
  public Administrative withMessageRef(String value) {
    setMessageRef(new TString(value));
    return this;
  }

  /**
   * Set the Dataset
   * <p>
   * Complex element Dataset is used within an Administrative transaction to
   * specify the identifier of the datasets on which the action must apply.
   * <p>
   * @param values One or more instances of type {@link Dataset...}
   * @return The current Administrative object instance
   */
  public Administrative withDataset(Dataset... values) {
    if (values != null) {
      getDataset().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Dataset
   * <p>
   * Complex element Dataset is used within an Administrative transaction to
   * specify the identifier of the datasets on which the action must apply.
   * <p>
   * @param values A collection of {@link Dataset} instances
   * @return The current Administrative object instance
   */
  public Administrative withDataset(Collection<Dataset> values) {
    if (values != null) {
      getDataset().addAll(values);
    }
    return this;
  }

  /**
   * Set the CodeList
   * <p>
   * Complex element CodeList contains the actions necessary to create or delete
   * a code entry in a given Code List.
   * <p>
   * @param values One or more instances of type {@link CodeList...}
   * @return The current Administrative object instance
   */
  public Administrative withCodeList(CodeList... values) {
    if (values != null) {
      getCodeList().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the CodeList
   * <p>
   * Complex element CodeList contains the actions necessary to create or delete
   * a code entry in a given Code List.
   * <p>
   * @param values A collection of {@link CodeList} instances
   * @return The current Administrative object instance
   */
  public Administrative withCodeList(Collection<CodeList> values) {
    if (values != null) {
      getCodeList().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Administrative instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Administrative {"
      + " messageRef [" + messageRef + "]"
      + " dataset [" + dataset + "]"
      + " action [" + action + "]"
      + " codeList [" + codeList + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Administrative} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link TString Action}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetAction();
  }

}
