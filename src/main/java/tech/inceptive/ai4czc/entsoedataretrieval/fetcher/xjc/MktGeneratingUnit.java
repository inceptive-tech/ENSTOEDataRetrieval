//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.21 at 09:42:42 AM UTC 
//


package tech.inceptive.ai4czc.entsoedataretrieval.fetcher.xjc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MktGeneratingUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MktGeneratingUnit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mRID" type="{urn:iec62325.351:tc57wg16:451-6:generationloaddocument:3:0}ResourceID_String" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nominalP" type="{urn:iec62325.351:tc57wg16:451-6:generationloaddocument:3:0}ESMP_ActivePower" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MktGeneratingUnit", propOrder = {
    "mrid",
    "name",
    "nominalP"
})
public class MktGeneratingUnit {

    @XmlElement(name = "mRID")
    protected ResourceIDString mrid;
    protected String name;
    protected ESMPActivePower nominalP;

    /**
     * Gets the value of the mrid property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceIDString }
     *     
     */
    public ResourceIDString getMRID() {
        return mrid;
    }

    /**
     * Sets the value of the mrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceIDString }
     *     
     */
    public void setMRID(ResourceIDString value) {
        this.mrid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nominalP property.
     * 
     * @return
     *     possible object is
     *     {@link ESMPActivePower }
     *     
     */
    public ESMPActivePower getNominalP() {
        return nominalP;
    }

    /**
     * Sets the value of the nominalP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESMPActivePower }
     *     
     */
    public void setNominalP(ESMPActivePower value) {
        this.nominalP = value;
    }

}
