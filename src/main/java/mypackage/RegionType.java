
package mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="meadow"/>
 *     &lt;enumeration value="field"/>
 *     &lt;enumeration value="forest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegionType")
@XmlEnum
public enum RegionType {

    @XmlEnumValue("meadow")
    MEADOW("meadow"),
    @XmlEnumValue("field")
    FIELD("field"),
    @XmlEnumValue("forest")
    FOREST("forest");
    private final String value;

    RegionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionType fromValue(String v) {
        for (RegionType c: RegionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
