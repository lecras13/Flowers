
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Flower complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flower">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="soilType" type="{}SoilType"/>
 *         &lt;element name="color" type="{}ColorType"/>
 *         &lt;element name="growingTips" type="{}GrowingTips"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nameFlower" use="required" type="{}NameFlower" />
 *       &lt;attribute name="origin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reproductionType" type="{}ReproductionType" default="by_seed" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flower", propOrder = {
    "soilType",
    "color",
    "growingTips"
})
@XmlSeeAlso({
    WildFlower.class,
    HomeFlower.class
})
public abstract class Flower {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SoilType soilType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ColorType color;
    @XmlElement(required = true)
    protected GrowingTips growingTips;
    @XmlAttribute(name = "nameFlower", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String nameFlower;
    @XmlAttribute(name = "origin")
    protected String origin;
    @XmlAttribute(name = "reproductionType")
    protected ReproductionType reproductionType;

    /**
     * Gets the value of the soilType property.
     * 
     * @return
     *     possible object is
     *     {@link SoilType }
     *     
     */
    public SoilType getSoilType() {
        return soilType;
    }

    /**
     * Sets the value of the soilType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoilType }
     *     
     */
    public void setSoilType(SoilType value) {
        this.soilType = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link ColorType }
     *     
     */
    public ColorType getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorType }
     *     
     */
    public void setColor(ColorType value) {
        this.color = value;
    }

    /**
     * Gets the value of the growingTips property.
     * 
     * @return
     *     possible object is
     *     {@link GrowingTips }
     *     
     */
    public GrowingTips getGrowingTips() {
        return growingTips;
    }

    /**
     * Sets the value of the growingTips property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrowingTips }
     *     
     */
    public void setGrowingTips(GrowingTips value) {
        this.growingTips = value;
    }

    /**
     * Gets the value of the nameFlower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFlower() {
        return nameFlower;
    }

    /**
     * Sets the value of the nameFlower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFlower(String value) {
        this.nameFlower = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the reproductionType property.
     * 
     * @return
     *     possible object is
     *     {@link ReproductionType }
     *     
     */
    public ReproductionType getReproductionType() {
        if (reproductionType == null) {
            return ReproductionType.BY_SEED;
        } else {
            return reproductionType;
        }
    }

    /**
     * Sets the value of the reproductionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReproductionType }
     *     
     */
    public void setReproductionType(ReproductionType value) {
        this.reproductionType = value;
    }

}
