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
package us.gov.dod.standard.ssrf._3_1.receiver;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.AStandardMetadataAttributes;
import us.gov.dod.standard.ssrf._3_1.transmitter.TxMode;

/**
 * EmsClass identifies the emission classification symbols that define the
 * baseband modulating characteristics of the emission designator. The emission
 * classification consists of the three required symbols and the two optional
 * symbols.
 * <p>
 * Element of {@link RxMode}, {@link TxMode}
 * <p>
 * Example: Within an equipment mode:
 * <pre>
 * &lt;EmsClass&gt;J3E&lt;/EmsClass&gt;
 * &lt;EmsClass&gt;P0NAN&lt;/EmsClass&gt;
 * Within an interference Report:* &lt;SourceEmsClass&gt;A3E&lt;/SourceEmsClass&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmsClass", propOrder = {
  "value"
})
public class EmsClass extends AStandardMetadataAttributes<EmsClass> {

  @XmlValue
  private String value;
  /**
   * US:explainInformationTypeX - Explain Information Type X (Optional)
   * <p>
   * A reference to a Remark that describes the Type of Information. This is
   * required only when the 3rd symbol of the EmsClass is an "X" (Other).
   * <p>
   * Format is Memo
   */
  @XmlAttribute(name = "explainInformationTypeX")
  private String explainInformationTypeX;
  /**
   * US:explainModulationTypeX - Explain Modulation Type X (Optional)
   * <p>
   * A reference to a Remark that describes the Type of Modulation. This is
   * required only when the 1st symbol of the EmsClass is an "X" (Other).
   * <p>
   * Format is Memo
   */
  @XmlAttribute(name = "explainModulationTypeX")
  private String explainModulationTypeX;
  /**
   * US:explainNatureOfSignalX - Explain Nature Of Signal X (Optional)
   * <p>
   * A reference to a Remark that describes the Nature of Signal. This is
   * required only when the 2nd symbol of the EmsClass is an "X" (Other).
   * <p>
   * Format is Memo
   */
  @XmlAttribute(name = "explainNatureOfSignalX")
  private String explainNatureOfSignalX;

  /**
   * Get a value that is most probably correct.
   * <p>
   * @return a {@link String} instance
   */
  public String getValue() {
    return value;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value a {@link String} instance
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Determine if the Value is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Get a reference to a Remark that describes the Type of Information. This is
   * required only when the 3rd symbol of the EmsClass is an "X" (Other).
   * <p>
   * @return a {@link String} instance
   */
  public String getExplainInformationTypeX() {
    return explainInformationTypeX;
  }

  /**
   * Set a reference to a Remark that describes the Type of Information. This is
   * required only when the 3rd symbol of the EmsClass is an "X" (Other).
   * <p>
   * @param value a {@link String} instance
   */
  public void setExplainInformationTypeX(String value) {
    this.explainInformationTypeX = value;
  }

  /**
   * Determine if the ExplainInformationTypeX is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExplainInformationTypeX() {
    return (this.explainInformationTypeX != null);
  }

  /**
   * Get a reference to a Remark that describes the Type of Modulation. This is
   * required only when the 1st symbol of the EmsClass is an "X" (Other).
   * <p>
   * @return a {@link String} instance
   */
  public String getExplainModulationTypeX() {
    return explainModulationTypeX;
  }

  /**
   * Set a reference to a Remark that describes the Type of Modulation. This is
   * required only when the 1st symbol of the EmsClass is an "X" (Other).
   * <p>
   * @param value a {@link String} instance
   */
  public void setExplainModulationTypeX(String value) {
    this.explainModulationTypeX = value;
  }

  /**
   * Determine if the ExplainModulationTypeX is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExplainModulationTypeX() {
    return (this.explainModulationTypeX != null);
  }

  /**
   * Get a reference to a Remark that describes the Nature of Signal. This is
   * required only when the 2nd symbol of the EmsClass is an "X" (Other).
   * <p>
   * @return a {@link String} instance
   */
  public String getExplainNatureOfSignalX() {
    return explainNatureOfSignalX;
  }

  /**
   * Set a reference to a Remark that describes the Nature of Signal. This is
   * required only when the 2nd symbol of the EmsClass is an "X" (Other).
   * <p>
   * @param value a {@link String} instance
   */
  public void setExplainNatureOfSignalX(String value) {
    this.explainNatureOfSignalX = value;
  }

  /**
   * Determine if the ExplainNatureOfSignalX is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExplainNatureOfSignalX() {
    return (this.explainNatureOfSignalX != null);
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EmsClass object instance
   */
  public EmsClass withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Set a reference to a Remark that describes the Type of Information. This is
   * required only when the 3rd symbol of the EmsClass is an "X" (Other).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EmsClass object instance
   */
  public EmsClass withExplainInformationTypeX(String value) {
    setExplainInformationTypeX(value);
    return this;
  }

  /**
   * Set a reference to a Remark that describes the Type of Modulation. This is
   * required only when the 1st symbol of the EmsClass is an "X" (Other).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EmsClass object instance
   */
  public EmsClass withExplainModulationTypeX(String value) {
    setExplainModulationTypeX(value);
    return this;
  }

  /**
   * Set a reference to a Remark that describes the Nature of Signal. This is
   * required only when the 2nd symbol of the EmsClass is an "X" (Other).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EmsClass object instance
   */
  public EmsClass withExplainNatureOfSignalX(String value) {
    setExplainNatureOfSignalX(value);
    return this;
  }

  /**
   * Get a string representation of this EmsClass instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "EmsClass {"
      + " availability [" + availability + "]"
      + " cls [" + cls + "]"
      + " explainInformationTypeX [" + explainInformationTypeX + "]"
      + " explainModulationTypeX [" + explainModulationTypeX + "]"
      + " explainNatureOfSignalX [" + explainNatureOfSignalX + "]"
      + " extReferences [" + extReferences + "]"
      + " idref [" + idref + "]"
      + " legacyReleasability [" + legacyReleasability + "]"
      + " quality [" + quality + "]"
      + " recommendedValue [" + recommendedValue + "]"
      + " remarks [" + remarkRef + "]"
      + " value [" + value + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link EmsClass} requires {@link ListCCL cls} and {@link String value}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetValue();
  }

}
