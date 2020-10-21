
package mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReproductionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReproductionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="by_leave"/>
 *     &lt;enumeration value="by_stalk"/>
 *     &lt;enumeration value="by_seed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReproductionType")
@XmlEnum
public enum ReproductionType {

    @XmlEnumValue("by_leave")
    BY_LEAVE("by_leave"),
    @XmlEnumValue("by_stalk")
    BY_STALK("by_stalk"),
    @XmlEnumValue("by_seed")
    BY_SEED("by_seed");
    private final String value;

    ReproductionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReproductionType fromValue(String v) {
        for (ReproductionType c: ReproductionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
