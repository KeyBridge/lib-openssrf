package us.gov.dod.standard.ssrf._3_1.administrative;

import us.gov.dod.standard.ssrf._3_1.*;
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
Dataset is used within an Administrative transaction to specify the identifier of the datasets on which the action must apply.

Element of {@link Administrative}

Sub-Element is 
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dataset", propOrder = {
    "serial",
    "retireDate",
    "reason",
    "missingRef"
})
public class Dataset {

/**
Serial - Serial (Required) 

The serial of the referenced Dataset.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "Serial", required = true)
      private  Serial serial;
/**
RetireDate - Retire Date (Optional) 

The date this Dataset goes out of force.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "RetireDate", required = false)
    private D retireDate;
/**
Reason - Reason (Optional) 

The reason linked to the Action performed on this dataset.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "Reason", required = false)
    private MEMO reason;
/**
MissingRef (Optional)

MissingRef allows the recipient of a message to signal the sender that a dataset referenced in the message was not known by the recipient.
@since 3.1.0
*/
    @XmlElement(name = "MissingRef", nillable = true)
      private  Set<Serial> missingRef;

/**
Get the serial of the referenced Dataset.

@return the Serial value in a {@link Serial} data type
@since 3.1.0
*/
public Serial getSerial() {
        return serial;
    }

/**
Set the serial of the referenced Dataset.

@param value the Serial value in a {@link Serial} data type
@since 3.1.0
*/
public void setSerial(Serial value) {
        this.serial = value;
    }

/**
Determine if the Serial is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSerial() {
        return (this.serial!= null);
    }

/**
Get the date this Dataset goes out of force.

@return the RetireDate value in a {@link TD} data type
@since 3.1.0
*/
public D getRetireDate() {
        return retireDate;
    }

/**
Set the date this Dataset goes out of force.

@param value the RetireDate value in a {@link TD} data type
@since 3.1.0
*/
public void setRetireDate(D value) {
        this.retireDate = value;
    }

/**
Determine if the RetireDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRetireDate() {
        return (this.retireDate!= null);
    }

/**
Get the reason linked to the Action performed on this dataset.

@return the Reason value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getReason() {
        return reason;
    }

/**
Set the reason linked to the Action performed on this dataset.

@param value the Reason value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setReason(MEMO value) {
        this.reason = value;
    }

/**
Determine if the Reason is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetReason() {
        return (this.reason!= null);
    }

/**
Get the MissingRef

Complex element MissingRef allows the recipient of a message to signal the sender that a dataset referenced in the message was not known by the recipient.

@return  a {@link Serial} instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getMissing()} instead.
*/
@Deprecated
    public Set<Serial> getMissingRef() {
        if (missingRef == null) {
            missingRef = new HashSet<Serial>();
        }
        return this.missingRef;
    }

/**
Determine if the MissingRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMissingRef() {
        return ((this.missingRef!= null)&&(!this.missingRef.isEmpty()));
    }

/**
  Clear the MissingRef field. This sets the field to null.
 */
    public void unsetMissingRef() {
        this.missingRef = null;
    }

/**
Set the serial of the referenced Dataset.

@param value  An instances of type {@link Serial}
@return The current Dataset object instance
@since 3.1.0
*/
    public Dataset withSerial(Serial value) {
        setSerial(value);
        return this;
    }

/**
Set the date this Dataset goes out of force.

@param value  An instances of type {@link Calendar}
@return The current Dataset object instance
@since 3.1.0
*/
    public Dataset withRetireDate(Calendar value) {
           setRetireDate(new D(value));
        return this;
    }
/**
Set the date this Dataset goes out of force.

@param value  An instances of type {@link Date}
@return The current Dataset object instance
@since 3.1.0
*/
    public Dataset withRetireDate(Date value) {
           setRetireDate(new D(value));
        return this;
    }

/**
Set the reason linked to the Action performed on this dataset.

@param value  An instances of type {@link String}
@return The current Dataset object instance
@since 3.1.0
*/
    public Dataset withReason(String value) {
           setReason(new MEMO(value));
        return this;
    }

/**
Set the MissingRef

Complex element MissingRef allows the recipient of a message to signal the sender that a dataset referenced in the message was not known by the recipient.

@param values  One or more instances of type {@link MissingRef...}
@return The current Dataset object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withMissing(Common...)} instead.
*/
@Deprecated
    public Dataset withMissingRef(Serial... values) {
        if (values!= null) {
            for (MissingRef value: values) {
                getMissingRef().add(value);
            }
        }
        return this;
    }

/**
Set the MissingRef

Complex element MissingRef allows the recipient of a message to signal the sender that a dataset referenced in the message was not known by the recipient.

@param values  A collection of {@link Serial} instances
@return The current Dataset object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withMissing(Common...)} instead.
*/
@Deprecated
    public Dataset withMissingRef(Collection<Serial> values) {
        if (values!= null) {
            getMissingRef().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this Dataset instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Dataset {"
 + (missingRef !=null? " missingRef [" + missingRef +"]" : "") 
 + (reason !=null? " reason [" + reason +"]" : "") 
 + (retireDate !=null? " retireDate [" + retireDate +"]" : "") 
 + (serial !=null? " serial [" + serial +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Dataset} requires {@link Serial Serial}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetSerial();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
MissingRef (Optional)

MissingRef allows the recipient of a message to signal the sender that a dataset referenced in the message was not known by the recipient.
@since 3.1.0
*/
@XmlTransient
private Set<Common<?>> missing;

/**
Get the MissingRef

Complex element MissingRef allows the recipient of a message to signal the sender that a dataset referenced in the message was not known by the recipient.

@return  a {@link Common} instance
@since 3.1.0
*/
public Set<Common<?>> getMissing(){
if(missing == null){
missing = new HashSet<>();
}
 return missing;
}
/**
 Determine if the missing field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetMissing() {
return this.missing !=null  && !this.missing.isEmpty();
}

/**
Set the MissingRef

Complex element MissingRef allows the recipient of a message to signal the sender that a dataset referenced in the message was not known by the recipient.

@param values  An instances of type {@link Common<?>}
@return The current Dataset object instance
@since 3.1.0
*/
public Dataset withMissing(Common<?>... values) {
return  withMissing(Arrays.asList(values));
}

/**
Set the MissingRef

Complex element MissingRef allows the recipient of a message to signal the sender that a dataset referenced in the message was not known by the recipient.

@param values  An instances of type {@link Common<?>}
@return The current Dataset object instance
@since 3.1.0
*/
public Dataset withMissing(Collection<Common<?>> values) {
getMissing().addAll(values);
return this;
}
  /**
   * Update the SSRF data type references in this Dataset record.
   * <p>
 @since 3.1.0 */
public void prepare() {
this.missingRef= new ArrayList<>();
for (Common<?> instance :  getMissing()) {
this.missingRef.add(instance.getSerial());
}

/**
   * Update the SSRF data type references in this Dataset record after loading from XML.

   * This method builds the transient {@link #missing} with values
   * from the imported {@link #missingRef} field. This method should
   * typically be called after the Dataset is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (missingRef==null || missingRef.isEmpty() ) {return;}
for(Common<?> instance : root.getCommon<?>()) {
if(missingRef.contains(instance.getSerial())){
missing.add(instance);
}
}}//</editor-fold>

}
