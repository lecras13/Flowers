
package mypackage;

import java.math.BigInteger;
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
    "lightLowing",
    "wateringForWeek"
})
public class GrowingTips {

    @XmlElement(required = true)
    protected BigInteger temperature;
    protected boolean lightLowing;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wateringForWeek;

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTemperature() {
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
    public void setTemperature(BigInteger value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the lightLowing property.
     * 
     */
    public boolean isLightLowing() {
        return lightLowing;
    }

    /**
     * Sets the value of the lightLowing property.
     * 
     */
    public void setLightLowing(boolean value) {
        this.lightLowing = value;
    }

    /**
     * Gets the value of the wateringForWeek property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWateringForWeek() {
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
    public void setWateringForWeek(BigInteger value) {
        this.wateringForWeek = value;
    }

}
