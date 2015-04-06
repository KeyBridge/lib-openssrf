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
package us.gov.dod.standard.ssrf._3_1.ssreply;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.SSReply;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * CommentSource is used to provide comments to a SSRequest. It can also be used
 * to certify supportability.
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
   * Source - Comment Source (Optional)    * <p>
   * The name of the organisation or authority that is the source of the
   * comment. For example, MCEB, SPS or NTIA.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Source", required = false)
  private S100 source;
  /**
   * Author - Comment Author (Optional)    * <p>
   * The title (e.g., Ms., Dr.) and name of the individual that is the source of
   * the comment.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Author", required = false)
  private S100 author;
  /**
   * JobTitle - Author Job Title (Optional)    * <p>
   * The title or position of the comment author.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JobTitle", required = false)
  private S100 jobTitle;
  /**
   * Date - Comment Date (Optional)    * <p>
   * The date the comment was provided.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Date", required = false)
  private D date;
  /**
   * Comment (Optional)
   * <p>
   * Comment contains the comment provided by the Host Nation or Administration
   * regarding an equipment supportability.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Comment", nillable = true)
  private Set<Comment> comment;

  /**
   * Get the name of the organisation or authority that is the source of the
   * comment. For example, MCEB, SPS or NTIA..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getSource() {
    return source;
  }

  /**
   * Set the name of the organisation or authority that is the source of the
   * comment. For example, MCEB, SPS or NTIA..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setSource(S100 value) {
    this.source = value;
  }

  /**
   * Determine if the Source is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSource() {
    return (this.source != null ? this.source.isSetValue() : false);
  }

  /**
   * Get the title (e.g., Ms., Dr.) and name of the individual that is the
   * source of the comment..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getAuthor() {
    return author;
  }

  /**
   * Set the title (e.g., Ms., Dr.) and name of the individual that is the
   * source of the comment..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setAuthor(S100 value) {
    this.author = value;
  }

  /**
   * Determine if the Author is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAuthor() {
    return (this.author != null ? this.author.isSetValue() : false);
  }

  /**
   * Get the title or position of the comment author..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getJobTitle() {
    return jobTitle;
  }

  /**
   * Set the title or position of the comment author..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setJobTitle(S100 value) {
    this.jobTitle = value;
  }

  /**
   * Determine if the JobTitle is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJobTitle() {
    return (this.jobTitle != null ? this.jobTitle.isSetValue() : false);
  }

  /**
   * Get the date the comment was provided..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getDate() {
    return date;
  }

  /**
   * Set the date the comment was provided..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setDate(D value) {
    this.date = value;
  }

  /**
   * Determine if the Date is configured.
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
   * Administration regarding an equipment supportability..
   * <p>
   * @return a {@link Comment} instance
   * @since 3.1.0
   */
  public Set<Comment> getComment() {
    if (comment == null) {
      comment = new HashSet<>();
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
   * @param value An instances of type {@link String}.
   * @return The current CommentSource object instance.
   * @since 3.1.0
   */
  public CommentSource withSource(String value) {
    setSource(new S100(value));
    return this;
  }

  /**
   * Set the title (e.g., Ms., Dr.) and name of the individual that is the
   * source of the comment.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current CommentSource object instance.
   * @since 3.1.0
   */
  public CommentSource withAuthor(String value) {
    setAuthor(new S100(value));
    return this;
  }

  /**
   * Set the title or position of the comment author.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current CommentSource object instance.
   * @since 3.1.0
   */
  public CommentSource withJobTitle(String value) {
    setJobTitle(new S100(value));
    return this;
  }

  /**
   * Set the date the comment was provided.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current CommentSource object instance.
   * @since 3.1.0
   */
  public CommentSource withDate(Calendar value) {
    setDate(new D(value));
    return this;
  }

  /**
   * Set the date the comment was provided.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current CommentSource object instance.
   * @since 3.1.0
   */
  public CommentSource withDate(Date value) {
    setDate(new D(value));
    return this;
  }

  /**
   * Set the Comment
   * <p>
   * Complex element Comment contains the comment provided by the Host Nation or
   * Administration regarding an equipment supportability.
   * <p>
   * @param values One or more instances of type {@link Comment...}.
   * @return The current CommentSource object instance.
   * @since 3.1.0
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
   * @return The current CommentSource object instance.
   * @since 3.1.0
   */
  public CommentSource withComment(Collection<Comment> values) {
    if (values != null) {
      getComment().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this CommentSource instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  CommentSource {"
           + (author != null ? " author [" + author + "]" : "")
           + (comment != null ? " comment [" + comment + "]" : "")
           + (date != null ? " date [" + date + "]" : "")
           + (jobTitle != null ? " jobTitle [" + jobTitle + "]" : "")
           + (source != null ? " source [" + source + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link CommentSource} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
