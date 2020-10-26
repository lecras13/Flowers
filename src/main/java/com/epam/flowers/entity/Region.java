
package com.epam.flowers.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Region.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Region">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="meadow"/>
 *     &lt;enumeration value="field"/>
 *     &lt;enumeration value="forest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Region")
@XmlEnum
public enum Region {

    @XmlEnumValue("meadow")
    MEADOW("meadow"),
    @XmlEnumValue("field")
    FIELD("field"),
    @XmlEnumValue("forest")
    FOREST("forest");
    private final String value;

    Region(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Region fromValue(String v) {
        for (Region c: Region.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
