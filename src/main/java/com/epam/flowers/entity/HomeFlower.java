
package com.epam.flowers.entity;

import java.math.BigInteger;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HomeFlower complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HomeFlower">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.com/flowers}Flower">
 *       &lt;sequence>
 *         &lt;element name="optimalHumidity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="leafDischarge" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fruitPresence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HomeFlower", propOrder = {
    "optimalHumidity",
    "leafDischarge",
    "fruitPresence"
})
public class HomeFlower
    extends Flower
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected int optimalHumidity;
    protected boolean leafDischarge;
    protected boolean fruitPresence;

    public HomeFlower(){

    }

    public HomeFlower(Soil soil, Color color, GrowingTips growingTips, String nameFlower, String origin, Reproduction reproduction, int optimalHumidity, boolean leafDischarge, boolean fruitPresence){
        super(soil, color, growingTips, nameFlower, origin, reproduction);
        this.optimalHumidity = optimalHumidity;
        this.leafDischarge = leafDischarge;
        this.fruitPresence = fruitPresence;
    }

    /**
     * Gets the value of the optimalHumidity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public int getOptimalHumidity() {
        return optimalHumidity;
    }

    /**
     * Sets the value of the optimalHumidity property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOptimalHumidity(int value) {
        this.optimalHumidity = value;
    }

    /**
     * Gets the value of the leafDischarge property.
     * 
     */
    public boolean isLeafDischarge() {
        return leafDischarge;
    }

    /**
     * Sets the value of the leafDischarge property.
     * 
     */
    public void setLeafDischarge(boolean value) {
        this.leafDischarge = value;
    }

    /**
     * Gets the value of the fruitPresence property.
     * 
     */
    public boolean isFruitPresence() {
        return fruitPresence;
    }

    /**
     * Sets the value of the fruitPresence property.
     * 
     */
    public void setFruitPresence(boolean value) {
        this.fruitPresence = value;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        HomeFlower that = (HomeFlower) o;
        return optimalHumidity == that.optimalHumidity &&
                leafDischarge == that.leafDischarge &&
                fruitPresence == that.fruitPresence;
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), optimalHumidity, leafDischarge, fruitPresence);
    }

    @Override
    public String toString(){
        return super.toString() + "}HomeFlower{" +
                "optimalHumidity=" + optimalHumidity +
                ", leafDischarge=" + leafDischarge +
                ", fruitPresence=" + fruitPresence +
                '}';
    }
}
