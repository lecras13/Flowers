package com.epam.flowers.entity;

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
import java.util.Objects;


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
 *         &lt;element name="soil" type="{http://www.example.com/flowers}Soil"/>
 *         &lt;element name="color" type="{http://www.example.com/flowers}Color"/>
 *         &lt;element name="growingTips" type="{http://www.example.com/flowers}GrowingTips"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nameFlower" use="required" type="{http://www.example.com/flowers}NameFlower" />
 *       &lt;attribute name="origin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reproduction" type="{http://www.example.com/flowers}Reproduction" default="by_seed" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flower", propOrder = {
        "soil",
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
    protected Soil soil;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Color color;
    @XmlElement(required = true)
    protected GrowingTips growingTips;
    @XmlAttribute(name = "nameFlower", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String nameFlower;
    @XmlAttribute(name = "origin")
    protected String origin;
    @XmlAttribute(name = "reproduction")
    protected Reproduction reproduction;

    public Flower(){
    }

    public Flower(Soil soil, Color color, GrowingTips growingTips, String nameFlower, String origin, Reproduction reproduction){
        this.soil = soil;
        this.color = color;
        this.growingTips = growingTips;
        this.nameFlower = nameFlower;
        this.origin = origin;
        this.reproduction = reproduction;
    }

    /**
     * Gets the value of the soil property.
     *
     * @return possible object is
     * {@link Soil }
     */
    public Soil getSoil(){
        return soil;
    }

    /**
     * Sets the value of the soil property.
     *
     * @param value allowed object is
     *              {@link Soil }
     */
    public void setSoil(Soil value){
        this.soil = value;
    }

    /**
     * Gets the value of the color property.
     *
     * @return possible object is
     * {@link Color }
     */
    public Color getColor(){
        return color;
    }

    /**
     * Sets the value of the color property.
     *
     * @param value allowed object is
     *              {@link Color }
     */
    public void setColor(Color value){
        this.color = value;
    }

    /**
     * Gets the value of the growingTips property.
     *
     * @return possible object is
     * {@link GrowingTips }
     */
    public GrowingTips getGrowingTips(){
        return growingTips;
    }

    /**
     * Sets the value of the growingTips property.
     *
     * @param value allowed object is
     *              {@link GrowingTips }
     */
    public void setGrowingTips(GrowingTips value){
        this.growingTips = value;
    }

    /**
     * Gets the value of the nameFlower property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNameFlower(){
        return nameFlower;
    }

    /**
     * Sets the value of the nameFlower property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNameFlower(String value){
        this.nameFlower = value;
    }

    /**
     * Gets the value of the origin property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrigin(){
        return origin;
    }

    /**
     * Sets the value of the origin property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrigin(String value){
        this.origin = value;
    }

    /**
     * Gets the value of the reproduction property.
     *
     * @return possible object is
     * {@link Reproduction }
     */
    public Reproduction getReproduction(){
        if (reproduction == null) {
            return Reproduction.BY_SEED;
        } else {
            return reproduction;
        }
    }

    /**
     * Sets the value of the reproduction property.
     *
     * @param value allowed object is
     *              {@link Reproduction }
     */
    public void setReproduction(Reproduction value){
        this.reproduction = value;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Flower flower = (Flower) o;
        return soil == flower.soil &&
                color == flower.color &&
                Objects.equals(growingTips, flower.growingTips) &&
                Objects.equals(nameFlower, flower.nameFlower) &&
                Objects.equals(origin, flower.origin) &&
                reproduction == flower.reproduction;
    }

    @Override
    public int hashCode(){
        return Objects.hash(soil, color, growingTips, nameFlower, origin, reproduction);
    }

    @Override
    public String toString(){
        return "Flower{" +
                "soil=" + soil +
                ", color=" + color +
                ", growingTips=" + growingTips.temperature + ", "
                + growingTips.lightLoving + ", " + growingTips.wateringForWeek +
                ", nameFlower='" + nameFlower + '\'' +
                ", origin='" + origin + '\'' +
                ", reproduction=" + reproduction;
    }

}
