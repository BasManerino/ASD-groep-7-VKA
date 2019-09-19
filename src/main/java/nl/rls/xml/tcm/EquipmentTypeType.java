//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.02 at 11:36:00 AM CEST 
//


package nl.rls.xml.tcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="cn"/>
 *     &lt;enumeration value="sw"/>
 *     &lt;enumeration value="te"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EquipmentTypeType")
@XmlEnum
public enum EquipmentTypeType {


    /**
     * Container
     * 
     */
    @XmlEnumValue("cn")
    CN("cn"),

    /**
     * swap body
     * 
     */
    @XmlEnumValue("sw")
    SW("sw"),

    /**
     * Trailer (RollingRoad)
     * 
     */
    @XmlEnumValue("te")
    TE("te");
    private final String value;

    EquipmentTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentTypeType fromValue(String v) {
        for (EquipmentTypeType c: EquipmentTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
