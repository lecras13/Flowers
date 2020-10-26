
package com.epam.flowers.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Soil.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Soil">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="podzolic"/>
 *     &lt;enumeration value="unpaved"/>
 *     &lt;enumeration value="sod_podzolic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Soil")
@XmlEnum
public enum Soil {

    @XmlEnumValue("podzolic")
    PODZOLIC("podzolic"),
    @XmlEnumValue("unpaved")
    UNPAVED("unpaved"),
    @XmlEnumValue("sod_podzolic")
    SOD_PODZOLIC("sod_podzolic");
    private final String value;

    Soil(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Soil fromValue(String v) {
        for (Soil c: Soil.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
