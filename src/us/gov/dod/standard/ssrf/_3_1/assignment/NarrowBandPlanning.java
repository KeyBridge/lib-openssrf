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

import java.util.Calendar;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * NarrowBandPlanning (US) describes a reduced bandwidth assignment for a single
 * frequency or a range of frequencies.
 * <p>
 * Element of {@link Freq}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NarrowBandPlanning", propOrder = {
  "changeDate",
  "nbFreq"
})
public class NarrowBandPlanning {

  /**
   * US:ChangeDate - Change Date (Optional)
   * <p>
   * The date this record is expected to be updated to comply with narrow band
   * transition plans.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "ChangeDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar changeDate;
  /**
   * US:NBFreq - Narrow Band Frequency (Optional)
   * <p>
   * The transition frequency to comply with narrow band transition plans.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "NBFreq", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal nbFreq;

  /**
   * Get the date this record is expected to be updated to comply with narrow
   * band transition plans.
   * <p>
   * @return the ChangeDate value in a {@link TCalendar} data type
   */
  public TCalendar getChangeDate() {
    return changeDate;
  }

  /**
   * Set the date this record is expected to be updated to comply with narrow
   * band transition plans.
   * <p>
   * @param value the ChangeDate value in a {@link TCalendar} data type
   */
  public void setChangeDate(TCalendar value) {
    this.changeDate = value;
  }

  /**
   * Determine if the ChangeDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChangeDate() {
    return (this.changeDate != null ? this.changeDate.isSetValue() : false);
  }

  /**
   * Get the transition frequency to comply with narrow band transition plans.
   * <p>
   * @return the NBFreq value in a {@link TDecimal} data type
   */
  public TDecimal getNBFreq() {
    return nbFreq;
  }

  /**
   * Set the transition frequency to comply with narrow band transition plans.
   * <p>
   * @param value the NBFreq value in a {@link TDecimal} data type
   */
  public void setNBFreq(TDecimal value) {
    this.nbFreq = value;
  }

  /**
   * Determine if the NBFreq is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNBFreq() {
    return (this.nbFreq != null ? this.nbFreq.isSetValue() : false);
  }

  /**
   * Set the date this record is expected to be updated to comply with narrow
   * band transition plans.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current NarrowBandPlanning object instance
   */
  public NarrowBandPlanning withChangeDate(Calendar value) {
    setChangeDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the transition frequency to comply with narrow band transition plans.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current NarrowBandPlanning object instance
   */
  public NarrowBandPlanning withNBFreq(Double value) {
    setNBFreq(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this NarrowBandPlanning instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "NarrowBandPlanning {"
      + (changeDate != null ? " changeDate [" + changeDate + "]" : "")
      + (nbFreq != null ? " nbFreq [" + nbFreq + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link NarrowBandPlanning} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
