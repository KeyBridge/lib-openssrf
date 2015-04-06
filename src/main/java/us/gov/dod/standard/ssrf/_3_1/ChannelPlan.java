/* 
 * Copyright 2015 Key Bridge LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Name", required = true)
  private S100 name;
  /**
   * ChannelPlanRef - Element Content (Required)
   * <p>
   * The serial of the referenced ChannelPlan.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Channel", required = true)
  private Set<Channel> channel;

  /**
   * No arg constructor. Initializes the Common required fields.
   */
  public ChannelPlan() {
    super();
  }

  /**
   * Get the name of this channel plan (e.g., "Plan for Wireless Microphones in
   * the Band 162-174 MHz")..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getName() {
    return name;
  }

  /**
   * Set the name of this channel plan (e.g., "Plan for Wireless Microphones in
   * the Band 162-174 MHz")..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setName(S100 value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get the serial of the referenced ChannelPlan..
   * <p>
   * @return a {@link Channel} instance
   * @since 3.1.0
   */
  public Set<Channel> getChannel() {
    if (channel == null) {
      channel = new HashSet<>();
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
   * @param value An instances of type {@link String}.
   * @return The current ChannelPlan object instance.
   * @since 3.1.0
   */
  public ChannelPlan withName(String value) {
    setName(new S100(value));
    return this;
  }

  /**
   * Set the serial of the referenced ChannelPlan.
   * <p>
   * @param values One or more instances of type {@link Channel...}.
   * @return The current ChannelPlan object instance.
   * @since 3.1.0
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
   * @return The current ChannelPlan object instance.
   * @since 3.1.0
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
           + (channel != null ? " channel [" + channel + "]" : "")
           + (name != null ? " name [" + name + "]" : "")
           + "}\n  ChannelPlan." + super.toString() + "\n";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ChannelPlan} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link Set<Channel> Channel}, {@link S100 Name}.
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
