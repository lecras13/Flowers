
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecorativeLeafyFlower complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecorativeLeafyFlower">
 *   &lt;complexContent>
 *     &lt;extension base="{}HomeFlower">
 *       &lt;sequence>
 *         &lt;element name="leafDischarge" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecorativeLeafyFlower", propOrder = {
    "leafDischarge"
})
public class DecorativeLeafyFlower
    extends HomeFlower
{

    protected boolean leafDischarge;

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

}
