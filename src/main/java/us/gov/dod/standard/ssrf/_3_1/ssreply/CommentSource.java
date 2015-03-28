package us.gov.dod.standard.ssrf._3_1.ssreply;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
CommentSource is used to provide comments to a SSRequest. It can also be used to certify supportability.

Element of {@link SSReply}

Sub-Element is {@link Comment}

Example: <pre>
* &lt;Comment Source&gt;
*   &lt;Author  cls="U"&gt;Barry Commenter&lt;/Author &gt;
*   &lt;Date  cls="U"&gt;2014-01-01&lt;/Date &gt;
*   &lt;JobTitle  cls="U"&gt;Big Kahuna&lt;/JobTitle &gt;
*    &lt;Source cls=”U”&gt;NTIA Redbook page 235&lt;/Source&gt;
*   &lt;Comment cls="U" idx="1"&gt;Assignments will be granted on case-by-case basis.&lt;/Comment&gt;
* &lt;/Comment Source&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
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
Source  - Comment Source (Optional) 

The name of the organisation or authority that is the source of the comment. For example, MCEB, SPS or NTIA.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Source", required = false)
    private S100 source;
/**
Author  - Comment Author (Optional) 

The title (e.g., Ms., Dr.) and name of the individual that is the source of the comment.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Author", required = false)
    private S100 author;
/**
JobTitle  - Author Job Title (Optional) 

The title or position of the comment author.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "JobTitle", required = false)
    private S100 jobTitle;
/**
Date  - Comment Date (Optional) 

The date the comment was provided.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "Date", required = false)
    private D date;
/**
Comment (Optional)

Comment contains the comment provided by the Host Nation or Administration regarding an equipment supportability.
@since 3.1.0
*/
    @XmlElement(name = "Comment", nillable = true)
      private  Set<Comment> comment;

/**
Get the name of the organisation or authority that is the source of the comment. For example, MCEB, SPS or NTIA.

@return the Source value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getSource() {
        return source;
    }

/**
Set the name of the organisation or authority that is the source of the comment. For example, MCEB, SPS or NTIA.

@param value the Source value in a {@link TS100} data type
@since 3.1.0
*/
public void setSource(S100 value) {
        this.source = value;
    }

/**
Determine if the Source is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSource() {
        return (this.source!= null);
    }

/**
Get the title (e.g., Ms., Dr.) and name of the individual that is the source of the comment.

@return the Author value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getAuthor() {
        return author;
    }

/**
Set the title (e.g., Ms., Dr.) and name of the individual that is the source of the comment.

@param value the Author value in a {@link TS100} data type
@since 3.1.0
*/
public void setAuthor(S100 value) {
        this.author = value;
    }

/**
Determine if the Author is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAuthor() {
        return (this.author!= null);
    }

/**
Get the title or position of the comment author.

@return the JobTitle value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getJobTitle() {
        return jobTitle;
    }

/**
Set the title or position of the comment author.

@param value the JobTitle value in a {@link TS100} data type
@since 3.1.0
*/
public void setJobTitle(S100 value) {
        this.jobTitle = value;
    }

/**
Determine if the JobTitle is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetJobTitle() {
        return (this.jobTitle!= null);
    }

/**
Get the date the comment was provided.

@return the Date value in a {@link TD} data type
@since 3.1.0
*/
public D getDate() {
        return date;
    }

/**
Set the date the comment was provided.

@param value the Date value in a {@link TD} data type
@since 3.1.0
*/
public void setDate(D value) {
        this.date = value;
    }

/**
Determine if the Date is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDate() {
        return (this.date!= null);
    }

/**
Get the Comment

Complex element Comment contains the comment provided by the Host Nation or Administration regarding an equipment supportability.

@return  a {@link Comment} instance
@since 3.1.0
*/
    public Set<Comment> getComment() {
        if (comment == null) {
            comment = new HashSet<Comment>();
        }
        return this.comment;
    }

/**
Determine if the Comment is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetComment() {
        return ((this.comment!= null)&&(!this.comment.isEmpty()));
    }

/**
  Clear the Comment field. This sets the field to null.
 */
    public void unsetComment() {
        this.comment = null;
    }

/**
Set the name of the organisation or authority that is the source of the comment. For example, MCEB, SPS or NTIA.

@param value  An instances of type {@link String}
@return The current CommentSource object instance
@since 3.1.0
*/
    public CommentSource withSource(String value) {
           setSource(new S100(value));
        return this;
    }

/**
Set the title (e.g., Ms., Dr.) and name of the individual that is the source of the comment.

@param value  An instances of type {@link String}
@return The current CommentSource object instance
@since 3.1.0
*/
    public CommentSource withAuthor(String value) {
           setAuthor(new S100(value));
        return this;
    }

/**
Set the title or position of the comment author.

@param value  An instances of type {@link String}
@return The current CommentSource object instance
@since 3.1.0
*/
    public CommentSource withJobTitle(String value) {
           setJobTitle(new S100(value));
        return this;
    }

/**
Set the date the comment was provided.

@param value  An instances of type {@link Calendar}
@return The current CommentSource object instance
@since 3.1.0
*/
    public CommentSource withDate(Calendar value) {
           setDate(new D(value));
        return this;
    }
/**
Set the date the comment was provided.

@param value  An instances of type {@link Date}
@return The current CommentSource object instance
@since 3.1.0
*/
    public CommentSource withDate(Date value) {
           setDate(new D(value));
        return this;
    }

/**
Set the Comment

Complex element Comment contains the comment provided by the Host Nation or Administration regarding an equipment supportability.

@param values  One or more instances of type {@link Comment...}
@return The current CommentSource object instance
@since 3.1.0
*/
    public CommentSource withComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getComment().add(value);
            }
        }
        return this;
    }

/**
Set the Comment

Complex element Comment contains the comment provided by the Host Nation or Administration regarding an equipment supportability.

@param values  A collection of {@link Comment} instances
@return The current CommentSource object instance
@since 3.1.0
*/
    public CommentSource withComment(Collection<Comment> values) {
        if (values!= null) {
            getComment().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this CommentSource instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "CommentSource {"
 + (author !=null? " author [" + author +"]" : "") 
 + (comment !=null? " comment [" + comment +"]" : "") 
 + (date !=null? " date [" + date +"]" : "") 
 + (jobTitle !=null? " jobTitle [" + jobTitle +"]" : "") 
 + (source !=null? " source [" + source +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link CommentSource} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
