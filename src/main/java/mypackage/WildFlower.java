
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WildFlower complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WildFlower">
 *   &lt;complexContent>
 *     &lt;extension base="{}Flower">
 *       &lt;sequence>
 *         &lt;element name="regionType" type="{}RegionType"/>
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
    "regionType"
})
public class WildFlower
    extends Flower
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RegionType regionType;

    /**
     * Gets the value of the regionType property.
     * 
     * @return
     *     possible object is
     *     {@link RegionType }
     *     
     */
    public RegionType getRegionType() {
        return regionType;
    }

    /**
     * Sets the value of the regionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionType }
     *     
     */
    public void setRegionType(RegionType value) {
        this.regionType = value;
    }

}
