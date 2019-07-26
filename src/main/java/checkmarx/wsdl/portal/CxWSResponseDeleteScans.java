//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.11.17 at 10:51:56 PM EST
//


package checkmarx.wsdl.portal;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CxWSResponseDeleteScans complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CxWSResponseDeleteScans">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="IsConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Flags" type="{http://Checkmarx.com}DeleteFlags"/>
 *         &lt;element name="UndeletedScans" type="{http://Checkmarx.com}ArrayOfUndeletedObject" minOccurs="0"/>
 *         &lt;element name="NumOfDeletedScans" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseDeleteScans", propOrder = {
    "isConfirmation",
    "flags",
    "undeletedScans",
    "numOfDeletedScans"
})
public class CxWSResponseDeleteScans
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "IsConfirmation")
    protected boolean isConfirmation;
    @XmlList
    @XmlElement(name = "Flags", required = true)
    protected List<String> flags;
    @XmlElement(name = "UndeletedScans")
    protected ArrayOfUndeletedObject undeletedScans;
    @XmlElement(name = "NumOfDeletedScans")
    protected int numOfDeletedScans;

    /**
     * Gets the value of the isConfirmation property.
     *
     */
    public boolean isIsConfirmation() {
        return isConfirmation;
    }

    /**
     * Sets the value of the isConfirmation property.
     *
     */
    public void setIsConfirmation(boolean value) {
        this.isConfirmation = value;
    }

    /**
     * Gets the value of the flags property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flags property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlags().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getFlags() {
        if (flags == null) {
            flags = new ArrayList<String>();
        }
        return this.flags;
    }

    /**
     * Gets the value of the undeletedScans property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfUndeletedObject }
     *
     */
    public ArrayOfUndeletedObject getUndeletedScans() {
        return undeletedScans;
    }

    /**
     * Sets the value of the undeletedScans property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfUndeletedObject }
     *
     */
    public void setUndeletedScans(ArrayOfUndeletedObject value) {
        this.undeletedScans = value;
    }

    /**
     * Gets the value of the numOfDeletedScans property.
     *
     */
    public int getNumOfDeletedScans() {
        return numOfDeletedScans;
    }

    /**
     * Sets the value of the numOfDeletedScans property.
     *
     */
    public void setNumOfDeletedScans(int value) {
        this.numOfDeletedScans = value;
    }

}
