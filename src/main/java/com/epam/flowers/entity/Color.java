package com.epam.flowers.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for Color.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Color">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="blue"/>
 *     &lt;enumeration value="green"/>
 *     &lt;enumeration value="lilac"/>
 *     &lt;enumeration value="pink"/>
 *     &lt;enumeration value="purple"/>
 *     &lt;enumeration value="red"/>
 *     &lt;enumeration value="white"/>
 *     &lt;enumeration value="yellow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Color")
@XmlEnum
public enum Color {

    @XmlEnumValue("blue")
    BLUE("blue"),
    @XmlEnumValue("green")
    GREEN("green"),
    @XmlEnumValue("lilac")
    LILAC("lilac"),
    @XmlEnumValue("pink")
    PINK("pink"),
    @XmlEnumValue("purple")
    PURPLE("purple"),
    @XmlEnumValue("red")
    RED("red"),
    @XmlEnumValue("white")
    WHITE("white"),
    @XmlEnumValue("yellow")
    YELLOW("yellow");
    private final String value;

    Color(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Color fromValue(String v) {
        for (Color c: Color.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
