//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.06.07 at 11:08:45 PM EST
//


package checkmarx.wsdl.portal;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateNewCompanyResult" type="{http://Checkmarx.com}CxWSBasicRepsonse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createNewCompanyResult"
})
@XmlRootElement(name = "CreateNewCompanyResponse")
public class CreateNewCompanyResponse {

    @XmlElement(name = "CreateNewCompanyResult")
    protected CxWSBasicRepsonse createNewCompanyResult;

    /**
     * Gets the value of the createNewCompanyResult property.
     *
     * @return
     *     possible object is
     *     {@link CxWSBasicRepsonse }
     *
     */
    public CxWSBasicRepsonse getCreateNewCompanyResult() {
        return createNewCompanyResult;
    }

    /**
     * Sets the value of the createNewCompanyResult property.
     *
     * @param value
     *     allowed object is
     *     {@link CxWSBasicRepsonse }
     *
     */
    public void setCreateNewCompanyResult(CxWSBasicRepsonse value) {
        this.createNewCompanyResult = value;
    }

}
