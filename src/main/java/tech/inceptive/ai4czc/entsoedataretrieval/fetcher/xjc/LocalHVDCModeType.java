//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.21 at 09:42:42 AM UTC 
//


package tech.inceptive.ai4czc.entsoedataretrieval.fetcher.xjc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalHVDCModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalHVDCModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="A01"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalHVDCModeType", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum LocalHVDCModeType {

    @XmlEnumValue("A01")
    A_01("A01");
    private final String value;

    LocalHVDCModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocalHVDCModeType fromValue(String v) {
        for (LocalHVDCModeType c: LocalHVDCModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
