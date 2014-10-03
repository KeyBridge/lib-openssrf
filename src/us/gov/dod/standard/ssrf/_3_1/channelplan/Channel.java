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
package us.gov.dod.standard.ssrf._3_1.channelplan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.ChannelPlan;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * Channel provides the frequency, and optionally the name or number, of a
 * channel within a channel plan.
 * <p>
 * Element of {@link ChannelPlan}
 * <p>
 * Sub-Element is {@link ChannelFreq}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Channel", propOrder = {
  "name",
  "user",
  "channelFreq"
})
public class Channel {

  /**
   * Name - Channel Name (Optional)
   * <p>
   * The name of this channel (e.g., "Video carrier, Sound carrier, Nicam Sound
   * carrier").
   * <p>
   * Format is S50
   */
  @XmlElement(name = "Name", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString name;
  /**
   * User - Channel User (Optional)
   * <p>
   * A specific user of this channel in the channel plan.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "User", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString user;
  /**
   * ChannelFreq - Element Content (Required)
   * <p>
   * One frequency in the channel plan.
   * <p>
   * Format is UN(16,9) [0..1E9] (same as FREQM) (MHz)
   */
  @XmlElement(name = "ChannelFreq", required = true, nillable = true)
  private List<ChannelFreq> channelFreq;

  /**
   * Get the name of this channel (e.g., "Video carrier, Sound carrier, Nicam
   * Sound carrier").
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set the name of this channel (e.g., "Video carrier, Sound carrier, Nicam
   * Sound carrier").
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
   * Get a specific user of this channel in the channel plan.
   * <p>
   * @return the User value in a {@link TString} data type
   */
  public TString getUser() {
    return user;
  }

  /**
   * Set a specific user of this channel in the channel plan.
   * <p>
   * @param value the User value in a {@link TString} data type
   */
  public void setUser(TString value) {
    this.user = value;
  }

  /**
   * Determine if the User is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUser() {
    return (this.user != null ? this.user.isSetValue() : false);
  }

  /**
   * Get one frequency in the channel plan.
   * <p>
   * @return a non-null but possibly empty list of {@link ChannelFreq} instances
   */
  public List<ChannelFreq> getChannelFreq() {
    if (channelFreq == null) {
      channelFreq = new ArrayList<>();
    }
    return this.channelFreq;
  }

  /**
   * Determine if the ChannelFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChannelFreq() {
    return ((this.channelFreq != null) && (!this.channelFreq.isEmpty()));
  }

  /**
   * Clear the ChannelFreq field. This sets the field to null.
   */
  public void unsetChannelFreq() {
    this.channelFreq = null;
  }

  /**
   * Set the name of this channel (e.g., "Video carrier, Sound carrier, Nicam
   * Sound carrier").
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Channel object instance
   */
  public Channel withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set a specific user of this channel in the channel plan.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Channel object instance
   */
  public Channel withUser(String value) {
    setUser(new TString(value));
    return this;
  }

  /**
   * Set one frequency in the channel plan.
   * <p>
   * @param values One or more instances of type {@link ChannelFreq}
   * @return The current Channel object instance
   */
  public Channel withChannelFreq(ChannelFreq... values) {
    if (values != null) {
      getChannelFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set one frequency in the channel plan.
   * <p>
   * @param values A collection of {@link ChannelFreq} instances
   * @return The current Channel object instance
   */
  public Channel withChannelFreq(Collection<ChannelFreq> values) {
    if (values != null) {
      getChannelFreq().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Channel instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Channel {"
      + (channelFreq != null ? " channelFreq [" + channelFreq + "]" : "")
      + (name != null ? " name [" + name + "]" : "")
      + (user != null ? " user [" + user + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Channel} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
