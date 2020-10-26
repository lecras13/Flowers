
package com.epam.flowers.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;


/**
 * <p>Java class for WildFlower complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WildFlower">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.com/flowers}Flower">
 *       &lt;sequence>
 *         &lt;element name="region" type="{http://www.example.com/flowers}Region"/>
 *         &lt;element name="thornsPresence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WildFlower", propOrder = {
    "region",
    "thornsPresence"
})
public class WildFlower
    extends Flower
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Region region;
    protected boolean thornsPresence;

    public WildFlower(){
    }

    public WildFlower(Soil soil, Color color, GrowingTips growingTips, String nameFlower, String origin, Reproduction reproduction, Region region, boolean thornsPresence){
        super(soil, color, growingTips, nameFlower, origin, reproduction);
        this.region = region;
        this.thornsPresence = thornsPresence;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link Region }
     *     
     */
    public Region getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     *
     * @param value
     *     allowed object is
     *     {@link Region }
     *     
     */

    public void setRegion(Region value) {
        this.region = value;
    }


    public void setThornsPresence(Boolean valueOf){
        this.thornsPresence = valueOf  ;
    }


    /**
     * Gets the value of the thornsPresence property.
     * 
     */
    public boolean isThornsPresence() {
        return thornsPresence;
    }

    /**
     * Sets the value of the thornsPresence property.
     * 
     */

    public void setThornsPresence(boolean value) {
        this.thornsPresence = value;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        WildFlower that = (WildFlower) o;
        return thornsPresence == that.thornsPresence &&
                region == that.region;
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), region, thornsPresence);
    }

    @Override
    public String toString(){
        return super.toString() +
                "}WildFlower, region=" + region +
                ", thornsPresence=" + thornsPresence +
                '}';
    }
}
