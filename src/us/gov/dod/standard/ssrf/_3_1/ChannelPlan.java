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
import us.gov.dod.standard.ssrf._3_1.channelplan.Channel;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * ChannelPlan describes the plan for the channel set.
 * <p>
 * Sub-Element is {@link Channel}
 * <p>
 * Example:
 * <pre>
 * &lt;ChannelPlan&gt;
 *   &lt;Channel&gt;
 *     &lt;Name cls="U"&gt;Channel Plan One&lt;/Name&gt;
 *     &lt;User  cls="U"&gt;Channel Master&lt;/User &gt;
 *     &lt;ChannelFreq cls="U"&gt;200&lt;/ChannelFreq&gt;
 *   &lt;/Channel&gt;
 *   &lt;Channel&gt;
 *     &lt;Name cls="U"&gt;Channel Plan Seven&lt;/Name&gt;
 *     &lt;User  cls="U"&gt;Channel Meister&lt;/User &gt;
 *     &lt;ChannelFreq cls="U"&gt;400&lt;/ChannelFreq&gt;
 *   &lt;/Channel&gt;
 * &lt;/ChannelPlan&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelPlan", propOrder = {
  "name",
  "channel"
})
public class ChannelPlan extends Common<ChannelPlan> {

  /**
   * Name - Channel Plan Name (Required)
   * <p>
   * The name of this channel plan (e.g., "Plan for Wireless Microphones in the
   * Band 162-174 MHz").
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Name", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
  /**
   * ChannelPlanRef - Element Content (Required)
   * <p>
   * The serial of the referenced ChannelPlan.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "Channel", required = true)
  private List<Channel> channel;

  /**
   * Get the name of this channel plan (e.g., "Plan for Wireless Microphones in
   * the Band 162-174 MHz").
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set the name of this channel plan (e.g., "Plan for Wireless Microphones in
   * the Band 162-174 MHz").
   * <p>
   * @param value the Name value in a {@link TString} data type
   */
  public void setName(TString value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get the serial of the referenced ChannelPlan.
   * <p>
   * @return a non-null but possibly empty list of {@link Channel} instances
   */
  public List<Channel> getChannel() {
    if (channel == null) {
      channel = new ArrayList<>();
    }
    return this.channel;
  }

  /**
   * Determine if the Channel is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChannel() {
    return ((this.channel != null) && (!this.channel.isEmpty()));
  }

  /**
   * Clear the Channel field. This sets the field to null.
   */
  public void unsetChannel() {
    this.channel = null;
  }

  /**
   * Set the name of this channel plan (e.g., "Plan for Wireless Microphones in
   * the Band 162-174 MHz").
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ChannelPlan object instance
   */
  public ChannelPlan withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set the serial of the referenced ChannelPlan.
   * <p>
   * @param values One or more instances of type {@link Channel}
   * @return The current ChannelPlan object instance
   */
  public ChannelPlan withChannel(Channel... values) {
    if (values != null) {
      getChannel().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the serial of the referenced ChannelPlan.
   * <p>
   * @param values A collection of {@link Channel} instances
   * @return The current ChannelPlan object instance
   */
  public ChannelPlan withChannel(Collection<Channel> values) {
    if (values != null) {
      getChannel().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this ChannelPlan instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ChannelPlan {"
      + (name != null ? " name [" + name + "]" : "")
      + (channel != null ? " channel [" + channel + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ChannelPlan} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link Channel Channel}, {@link TString Name}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetChannel() && isSetName();
  }

}
