//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.11.17 at 10:51:56 PM EST
//


package checkmarx.wsdl.portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseLDAPServerGroups complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CxWSResponseLDAPServerGroups">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Groups" type="{http://Checkmarx.com}ArrayOfCxWSLdapGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseLDAPServerGroups", propOrder = {
    "groups"
})
public class CxWSResponseLDAPServerGroups
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Groups")
    protected ArrayOfCxWSLdapGroup groups;

    /**
     * Gets the value of the groups property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSLdapGroup }
     *
     */
    public ArrayOfCxWSLdapGroup getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSLdapGroup }
     *
     */
    public void setGroups(ArrayOfCxWSLdapGroup value) {
        this.groups = value;
    }

}
