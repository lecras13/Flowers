
package com.epam.flowers.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.com/flowers}flower" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flower"
})
@XmlRootElement(name = "flowers")
public class Flowers {

    @XmlElementRef(name = "flower", namespace = "http://www.example.com/flowers", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends Flower>> flower;

    /**
     * Gets the value of the flower property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flower property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlower().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Flower }{@code >}
     * {@link JAXBElement }{@code <}{@link WildFlower }{@code >}
     * {@link JAXBElement }{@code <}{@link HomeFlower }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Flower>> getFlower() {
        if (flower == null) {
            flower = new ArrayList<>();
        }
        return this.flower;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Flowers flowers = (Flowers) o;
        return Objects.equals(flower, flowers.flower);
    }

    @Override
    public int hashCode(){
        return Objects.hash(flower);
    }
}
