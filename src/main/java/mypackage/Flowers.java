
package mypackage;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}flower" maxOccurs="unbounded" minOccurs="0"/>
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

    @XmlElementRef(name = "flower", type = JAXBElement.class, required = false)
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
     * {@link JAXBElement }{@code <}{@link WildFlower }{@code >}
     * {@link JAXBElement }{@code <}{@link DecorativeLeafyFlower }{@code >}
     * {@link JAXBElement }{@code <}{@link SucculentsFlower }{@code >}
     * {@link JAXBElement }{@code <}{@link DecorativeBloomingFlower }{@code >}
     * {@link JAXBElement }{@code <}{@link Flower }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Flower>> getFlower() {
        if (flower == null) {
            flower = new ArrayList<JAXBElement<? extends Flower>>();
        }
        return this.flower;
    }

}
