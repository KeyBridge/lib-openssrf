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
package us.gov.dod.standard.ssrf._3_1.ssreply;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.SSReply;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * CommentSource is used to provide comments to a SSRequest. It can also be used
 * to certify supportability.
 * <p>
 * Notes (US)
 * <ul>
 * <li>The Date for a Source of "SPS" is also the date the SPS official signed
 * the Certification of Spectrum Support. The date for a Source of "NTIA" is the
 * date the NTIA Certifying Official signed the Certification of Spectrum
 * Support.</li>
 * <li>For NTIA and the Spectrum Planning Subcommittee (SPS), the first Comment
 * is the signing statement in the corresponding Section 4 or 5 respectively of
 * the Certification of Spectrum Support page.</li>
 * </ul>
 * <p>
 * Element of {@link SSReply}
 * <p>
 * Sub-Element is {@link Comment}
 * <p>
 * Example:
 * <pre>
 * &lt;Comment Source&gt;
 *   &lt;Author  cls="U"&gt;Barry Commenter&lt;/Author &gt;
 *   &lt;Date  cls="U"&gt;2014-01-01&lt;/Date &gt;
 *   &lt;JobTitle  cls="U"&gt;Big Kahuna&lt;/JobTitle &gt;
 *    &lt;Source cls=”U”&gt;NTIA Redbook page 235&lt;/Source&gt;
 *   &lt;Comment cls="U" idx="1"&gt;Assignments will be granted on case-by-case basis.&lt;/Comment&gt;
 * &lt;/Comment Source&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentSource", propOrder = {
  "source",
  "author",
  "jobTitle",
  "date",
  "comment"
})
public class CommentSource {

  /**
   * Source - Comment Source (Optional)
   * <p>
   * The name of the organisation or authority that is the source of the
   * comment. For example, MCEB, SPS or NTIA.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Source", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString source;
  /**
   * Author - Comment Author (Optional)
   * <p>
   * The title (e.g., Ms., Dr.) and name of the individual that is the source of
   * the comment.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Author", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString author;
  /**
   * JobTitle - Author Job Title (Optional)
   * <p>
   * The title or position of the comment author.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "JobTitle", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString jobTitle;
  /**
   * Date - Comment Date (Optional)
   * <p>
   * The date the comment was provided.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "Date", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar date;
  /**
   * Comment (Optional)
   * <p>
   * Comment contains the comment provided by the Host Nation or Administration
   * regarding an equipment supportability.
   */
  @XmlElement(name = "Comment", nillable = true)
  private List<Comment> comment;

  /**
   * Get the name of the organisation or authority that is the source of the
   * comment. For example, MCEB, SPS or NTIA.
   * <p>
   * @return the Source value in a {@link TString} data type
   */
  public TString getSource() {
    return source;
  }

  /**
   * Set the name of the organisation or authority that is the source of the
   * comment. For example, MCEB, SPS or NTIA.
   * <p>
   * @param value the Source value in a {@link TString} data type
   */
  public void setSource(TString value) {
    this.source = value;
  }

  /**
   * Determine if the Source is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSource() {
    return (this.source != null ? this.source.isSetValue() : false);
  }

  /**
   * Get the title (e.g., Ms., Dr.) and name of the individual that is the
   * source of the comment.
   * <p>
   * @return the Author value in a {@link TString} data type
   */
  public TString getAuthor() {
    return author;
  }

  /**
   * Set the title (e.g., Ms., Dr.) and name of the individual that is the
   * source of the comment.
   * <p>
   * @param value the Author value in a {@link TString} data type
   */
  public void setAuthor(TString value) {
    this.author = value;
  }

  /**
   * Determine if the Author is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAuthor() {
    return (this.author != null ? this.author.isSetValue() : false);
  }

  /**
   * Get the title or position of the comment author.
   * <p>
   * @return the JobTitle value in a {@link TString} data type
   */
  public TString getJobTitle() {
    return jobTitle;
  }

  /**
   * Set the title or position of the comment author.
   * <p>
   * @param value the JobTitle value in a {@link TString} data type
   */
  public void setJobTitle(TString value) {
    this.jobTitle = value;
  }

  /**
   * Determine if the JobTitle is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJobTitle() {
    return (this.jobTitle != null ? this.jobTitle.isSetValue() : false);
  }

  /**
   * Get the date the comment was provided.
   * <p>
   * @return the Date value in a {@link TCalendar} data type
   */
  public TCalendar getDate() {
    return date;
  }

  /**
   * Set the date the comment was provided.
   * <p>
   * @param value the Date value in a {@link TCalendar} data type
   */
  public void setDate(TCalendar value) {
    this.date = value;
  }

  /**
   * Determine if the Date is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDate() {
    return (this.date != null ? this.date.isSetValue() : false);
  }

  /**
   * Get the Comment
   * <p>
   * Complex element Comment contains the comment provided by the Host Nation or
   * Administration regarding an equipment supportability.
   * <p>
   * @return a non-null but possibly empty list of {@link Comment} instances
   */
  public List<Comment> getComment() {
    if (comment == null) {
      comment = new ArrayList<>();
    }
    return this.comment;
  }

  /**
   * Determine if the Comment is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetComment() {
    return ((this.comment != null) && (!this.comment.isEmpty()));
  }

  /**
   * Clear the Comment field. This sets the field to null.
   */
  public void unsetComment() {
    this.comment = null;
  }

  /**
   * Set the name of the organisation or authority that is the source of the
   * comment. For example, MCEB, SPS or NTIA.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CommentSource object instance
   */
  public CommentSource withSource(String value) {
    setSource(new TString(value));
    return this;
  }

  /**
   * Set the title (e.g., Ms., Dr.) and name of the individual that is the
   * source of the comment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CommentSource object instance
   */
  public CommentSource withAuthor(String value) {
    setAuthor(new TString(value));
    return this;
  }

  /**
   * Set the title or position of the comment author.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CommentSource object instance
   */
  public CommentSource withJobTitle(String value) {
    setJobTitle(new TString(value));
    return this;
  }

  /**
   * Set the date the comment was provided.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current CommentSource object instance
   */
  public CommentSource withDate(Calendar value) {
    setDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the Comment
   * <p>
   * Complex element Comment contains the comment provided by the Host Nation or
   * Administration regarding an equipment supportability.
   * <p>
   * @param values One or more instances of type {@link Comment...}
   * @return The current CommentSource object instance
   */
  public CommentSource withComment(Comment... values) {
    if (values != null) {
      getComment().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Comment
   * <p>
   * Complex element Comment contains the comment provided by the Host Nation or
   * Administration regarding an equipment supportability.
   * <p>
   * @param values A collection of {@link Comment} instances
   * @return The current CommentSource object instance
   */
  public CommentSource withComment(Collection<Comment> values) {
    if (values != null) {
      getComment().addAll(values);
    }
    return this;
  }

  /**
   * Get the string representation of this CommentSource instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "CommentSource {"
      + " author [" + author + "]"
      + " source [" + source + "]"
      + " comment [" + comment + "]"
      + " date [" + date + "]"
      + " jobTitle [" + jobTitle + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link CommentSource} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
