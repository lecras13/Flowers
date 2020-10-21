
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SucculentsFlower complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SucculentsFlower">
 *   &lt;complexContent>
 *     &lt;extension base="{}HomeFlower">
 *       &lt;sequence>
 *         &lt;element name="presenceOfThorns" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SucculentsFlower", propOrder = {
    "presenceOfThorns"
})
public class SucculentsFlower
    extends HomeFlower
{

    protected boolean presenceOfThorns;

    /**
     * Gets the value of the presenceOfThorns property.
     * 
     */
    public boolean isPresenceOfThorns() {
        return presenceOfThorns;
    }

    /**
     * Sets the value of the presenceOfThorns property.
     * 
     */
    public void setPresenceOfThorns(boolean value) {
        this.presenceOfThorns = value;
    }

}
