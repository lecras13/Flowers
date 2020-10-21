
package mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoilType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SoilType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="podzolic"/>
 *     &lt;enumeration value="unpaved"/>
 *     &lt;enumeration value="sod_podzolic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SoilType")
@XmlEnum
public enum SoilType {

    @XmlEnumValue("podzolic")
    PODZOLIC("podzolic"),
    @XmlEnumValue("unpaved")
    UNPAVED("unpaved"),
    @XmlEnumValue("sod_podzolic")
    SOD_PODZOLIC("sod_podzolic");
    private final String value;

    SoilType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoilType fromValue(String v) {
        for (SoilType c: SoilType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
