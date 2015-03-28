package us.gov.dod.standard.ssrf._3_1.allotment;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other project name associated to the dataset.

Element of {@link Allotment}, {@link Assignment}, {@link FEDeployment}, {@link JRFLEntry}, {@link SSRequest}

Example: <pre>
* &lt;Project&gt;
*   &lt;Type cls="U"&gt;Exercise&lt;/Type&gt;
*   &lt;Name cls="U"&gt;JWID 2002&lt;/Name&gt;
*   &lt;Description cls="U"&gt;This is a good project.&lt;/Description&gt;
* &lt;/Project&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Project", propOrder = {
    "type",
    "name",
    "description"
})
public class Project {

/**
Type - Project Type (Optional) 

The type of project.

Format is L:CPJ
@since 3.1.0
*/
    @XmlElement(name = "Type", required = false)
    private TString type;
/**
Name - Project Name (Required) 

The name of the project.

Format is S30
@since 3.1.0
*/
    @XmlElement(name = "Name", required = true)
      private  S30 name;
/**
Description - Description (Optional) 

Any additional amplifying information about the project.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "Description", required = false)
    private MEMO description;

/**
Get the type of project.

@return the Type value in a {@link TString} data type
@since 3.1.0
*/
public TString getType() {
        return type;
    }

/**
Set the type of project.

@param value the Type value in a {@link TString} data type
@since 3.1.0
*/
public void setType(TString value) {
        this.type = value;
    }

/**
Determine if the Type is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetType() {
return (this.type!= null ? this.type.isSetValue() : false);
    }

/**
Get the name of the project.

@return the Name value in a {@link TS30} data type
@since 3.1.0
*/
public S30 getName() {
        return name;
    }

/**
Set the name of the project.

@param value the Name value in a {@link TS30} data type
@since 3.1.0
*/
public void setName(S30 value) {
        this.name = value;
    }

/**
Determine if the Name is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetName() {
        return (this.name!= null);
    }

/**
Get any additional amplifying information about the project.

@return the Description value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getDescription() {
        return description;
    }

/**
Set any additional amplifying information about the project.

@param value the Description value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setDescription(MEMO value) {
        this.description = value;
    }

/**
Determine if the Description is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDescription() {
        return (this.description!= null);
    }

/**
Set the type of project.

@param value  An instances of type {@link ListCPJ}
@return The current Project object instance
@since 3.1.0
*/
    public Project withType(ListCPJ value) {
           setType(new TString(value.value()));
        return this;
    }

/**
Set the name of the project.

@param value  An instances of type {@link TS30}
@return The current Project object instance
@since 3.1.0
*/
    public Project withName(TS30 value) {
        return this;
    }

/**
Set any additional amplifying information about the project.

@param value  An instances of type {@link String}
@return The current Project object instance
@since 3.1.0
*/
    public Project withDescription(String value) {
           setDescription(new MEMO(value));
        return this;
    }

/**
 Get a string representation of this Project instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Project {"
 + (description !=null? " description [" + description +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Project} requires {@link S30 Name}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetName();
}

}
