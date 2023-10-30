//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.09 at 02:13:47 PM UTC 
//


package tech.inceptive.ai4czc.entsoedataretrieval.fetcher.xjc.statusrequest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardClassificationTypeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StandardClassificationTypeList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="A01"/&gt;
 *     &lt;enumeration value="A02"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StandardClassificationTypeList", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum StandardClassificationTypeList {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;Title&gt;Detail type &lt;/Title&gt;&lt;Definition&gt;The Time Series content provides detailed information.&lt;/Definition&gt;&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("A01")
    A_01("A01"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;Title&gt;Summary type &lt;/Title&gt;&lt;Definition&gt;The Time Series content provides aggregated information.&lt;/Definition&gt;&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("A02")
    A_02("A02");
    private final String value;

    StandardClassificationTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StandardClassificationTypeList fromValue(String v) {
        for (StandardClassificationTypeList c: StandardClassificationTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
