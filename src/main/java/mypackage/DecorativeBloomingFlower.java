
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecorativeBloomingFlower complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecorativeBloomingFlower">
 *   &lt;complexContent>
 *     &lt;extension base="{}HomeFlower">
 *       &lt;sequence>
 *         &lt;element name="presenceOfFruit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecorativeBloomingFlower", propOrder = {
    "presenceOfFruit"
})
public class DecorativeBloomingFlower
    extends HomeFlower
{

    protected boolean presenceOfFruit;

    /**
     * Gets the value of the presenceOfFruit property.
     * 
     */
    public boolean isPresenceOfFruit() {
        return presenceOfFruit;
    }

    /**
     * Sets the value of the presenceOfFruit property.
     * 
     */
    public void setPresenceOfFruit(boolean value) {
        this.presenceOfFruit = value;
    }

}
