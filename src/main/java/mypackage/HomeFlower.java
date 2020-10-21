
package mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HomeFlower complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HomeFlower">
 *   &lt;complexContent>
 *     &lt;extension base="{}Flower">
 *       &lt;sequence>
 *         &lt;element name="recommendedAirHumidity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
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
    "recommendedAirHumidity"
})
@XmlSeeAlso({
    DecorativeLeafyFlower.class,
    SucculentsFlower.class,
    DecorativeBloomingFlower.class
})
public class HomeFlower
    extends Flower
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger recommendedAirHumidity;

    /**
     * Gets the value of the recommendedAirHumidity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecommendedAirHumidity() {
        return recommendedAirHumidity;
    }

    /**
     * Sets the value of the recommendedAirHumidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecommendedAirHumidity(BigInteger value) {
        this.recommendedAirHumidity = value;
    }

}
