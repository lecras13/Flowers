
package com.epam.flowers.entity;


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.flowers.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Flower_QNAME = new QName("http://www.example.com/flowers", "flower");
    private final static QName _WildFlower_QNAME = new QName("http://www.example.com/flowers", "wildFlower");
    private final static QName _HomeFlower_QNAME = new QName("http://www.example.com/flowers", "homeFlower");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.flowers.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Flowers }
     * 
     */
    public Flowers createFlowers() {
        return new Flowers();
    }

    /**
     * Create an instance of {@link WildFlower }
     * 
     */
    public WildFlower createWildFlower() {
        return new WildFlower();
    }

    /**
     * Create an instance of {@link HomeFlower }
     * 
     */
    public HomeFlower createHomeFlower() {
        return new HomeFlower();
    }

    /**
     * Create an instance of {@link GrowingTips }
     * 
     */
    public GrowingTips createGrowingTips() {
        return new GrowingTips();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Flower }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.example.com/flowers", name = "flower")
    public JAXBElement<Flower> createFlower(Flower value) {
        return new JAXBElement<Flower>(_Flower_QNAME, Flower.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WildFlower }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/flowers", name = "wildFlower", substitutionHeadNamespace = "http://www.example.com/flowers", substitutionHeadName = "flower")
    public JAXBElement<WildFlower> createWildFlower(WildFlower value) {
        return new JAXBElement<WildFlower>(_WildFlower_QNAME, WildFlower.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HomeFlower }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/flowers", name = "homeFlower", substitutionHeadNamespace = "http://www.example.com/flowers", substitutionHeadName = "flower")
    public JAXBElement<HomeFlower> createHomeFlower(HomeFlower value) {
        return new JAXBElement<HomeFlower>(_HomeFlower_QNAME, HomeFlower.class, null, value);
    }

}
