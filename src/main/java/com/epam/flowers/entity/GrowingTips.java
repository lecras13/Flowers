
package com.epam.flowers.entity;

import java.math.BigInteger;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrowingTips complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrowingTips">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="lightLowing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="wateringForWeek" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrowingTips", propOrder = {
    "temperature",
    "lightLoving",
    "wateringForWeek"
})
public class GrowingTips {

    @XmlElement(required = true)
    protected int temperature;
    protected boolean lightLoving;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected int wateringForWeek;

    public GrowingTips(){}

    public GrowingTips(int temperature, boolean lightLoving, int wateringForWeek){
        this.temperature = temperature;
        this.lightLoving = lightLoving;
        this.wateringForWeek = wateringForWeek;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTemperature(int value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the lightLowing property.
     * 
     */
    public boolean isLightLowing() {
        return lightLoving;
    }

    /**
     * Sets the value of the lightLowing property.
     * 
     */
    public void setLightLowing(boolean value) {
        this.lightLoving = value;
    }

    /**
     * Gets the value of the wateringForWeek property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public int getWateringForWeek() {
        return wateringForWeek;
    }

    /**
     * Sets the value of the wateringForWeek property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWateringForWeek(int value) {
        this.wateringForWeek = value;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GrowingTips that = (GrowingTips) o;
        return temperature == that.temperature &&
                lightLoving == that.lightLoving &&
                wateringForWeek == that.wateringForWeek;
    }

    @Override
    public int hashCode(){
        return Objects.hash(temperature, lightLoving, wateringForWeek);
    }

    @Override
    public String toString(){
        return "GrowingTips{" +
                "temperature=" + temperature +
                ", lightLoving=" + lightLoving +
                ", wateringForWeek=" + wateringForWeek +
                '}';
    }
}
