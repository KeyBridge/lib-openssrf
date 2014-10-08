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
package us.gov.dod.standard.ssrf._3_1.assignment;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * SysOfStation defines the name of the system that this assignment belongs and
 * whether or not the assignment provides assets to or uses another assignment
 * resources. It also describes linkages to or from other datasets.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * Example:
 * <pre>
 * &lt;SysOfStation&gt;
 *   &lt;SysName cls="U"&gt;BALTIMORE LMR SYSTEM&lt;/SysName&gt;
 * &lt;/SysOfStation&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SysOfStation", propOrder = {
  "sysName",
  "numStations"
})
public class SysOfStation {

  /**
   * SysName - System Name (Optional)
   * <p>
   * The name of the system to which the frequency assignment belongs. A system
   * is considered two or more equipment having a common property, usually
   * geographic, administrative, functional, or operational in nature.
   * <p>
   * Format is S30
   */
  @XmlElement(name = "SysName", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS30.class)
  private TString sysName;
  /**
   * NumStations - Number of Stations (Optional)
   * <p>
   * The total number of stations associated with the Assignment.
   * <p>
   * Format is UN(9)
   */
  @XmlElement(name = "NumStations", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numStations;

  /**
   * Get the name of the system to which the frequency assignment belongs. A
   * system is considered two or more equipment having a common property,
   * usually geographic, administrative, functional, or operational in nature.
   * <p>
   * @return the SysName value in a {@link TString} data type
   */
  public TString getSysName() {
    return sysName;
  }

  /**
   * Set the name of the system to which the frequency assignment belongs. A
   * system is considered two or more equipment having a common property,
   * usually geographic, administrative, functional, or operational in nature.
   * <p>
   * @param value the SysName value in a {@link TString} data type
   */
  public void setSysName(TString value) {
    this.sysName = value;
  }

  /**
   * Determine if the SysName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSysName() {
    return (this.sysName != null ? this.sysName.isSetValue() : false);
  }

  /**
   * Get the total number of stations associated with the Assignment.
   * <p>
   * @return the NumStations value in a {@link TInteger} data type
   */
  public TInteger getNumStations() {
    return numStations;
  }

  /**
   * Set the total number of stations associated with the Assignment.
   * <p>
   * @param value the NumStations value in a {@link TInteger} data type
   */
  public void setNumStations(TInteger value) {
    this.numStations = value;
  }

  /**
   * Determine if the NumStations is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumStations() {
    return (this.numStations != null ? this.numStations.isSetValue() : false);
  }

  /**
   * Set the name of the system to which the frequency assignment belongs. A
   * system is considered two or more equipment having a common property,
   * usually geographic, administrative, functional, or operational in nature.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SysOfStation object instance
   */
  public SysOfStation withSysName(String value) {
    setSysName(new TString(value));
    return this;
  }

  /**
   * Set the total number of stations associated with the Assignment.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current SysOfStation object instance
   */
  public SysOfStation withNumStations(Integer value) {
    setNumStations(new TInteger(value));
    return this;
  }

  /**
   * Get a string representation of this SysOfStation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SysOfStation {"
      + (numStations != null ? " numStations [" + numStations + "]" : "")
      + (sysName != null ? " sysName [" + sysName + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SysOfStation} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
