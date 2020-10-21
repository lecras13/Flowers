
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
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

    private final static QName _DecorativeLeafyFlower_QNAME = new QName("", "decorativeLeafyFlower");
    private final static QName _SucculentsFlower_QNAME = new QName("", "succulentsFlower");
    private final static QName _WildFlower_QNAME = new QName("", "wildFlower");
    private final static QName _DecorativeBloomingFlower_QNAME = new QName("", "decorativeBloomingFlower");
    private final static QName _Flower_QNAME = new QName("", "flower");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DecorativeLeafyFlower }
     * 
     */
    public DecorativeLeafyFlower createDecorativeLeafyFlower() {
        return new DecorativeLeafyFlower();
    }

    /**
     * Create an instance of {@link Flowers }
     * 
     */
    public Flowers createFlowers() {
        return new Flowers();
    }

    /**
     * Create an instance of {@link SucculentsFlower }
     * 
     */
    public SucculentsFlower createSucculentsFlower() {
        return new SucculentsFlower();
    }

    /**
     * Create an instance of {@link WildFlower }
     * 
     */
    public WildFlower createWildFlower() {
        return new WildFlower();
    }

    /**
     * Create an instance of {@link DecorativeBloomingFlower }
     * 
     */
    public DecorativeBloomingFlower createDecorativeBloomingFlower() {
        return new DecorativeBloomingFlower();
    }

    /**
     * Create an instance of {@link GrowingTips }
     * 
     */
    public GrowingTips createGrowingTips() {
        return new GrowingTips();
    }

    /**
     * Create an instance of {@link HomeFlower }
     * 
     */
    public HomeFlower createHomeFlower() {
        return new HomeFlower();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecorativeLeafyFlower }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "decorativeLeafyFlower", substitutionHeadNamespace = "", substitutionHeadName = "flower")
    public JAXBElement<DecorativeLeafyFlower> createDecorativeLeafyFlower(DecorativeLeafyFlower value) {
        return new JAXBElement<DecorativeLeafyFlower>(_DecorativeLeafyFlower_QNAME, DecorativeLeafyFlower.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SucculentsFlower }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "succulentsFlower", substitutionHeadNamespace = "", substitutionHeadName = "flower")
    public JAXBElement<SucculentsFlower> createSucculentsFlower(SucculentsFlower value) {
        return new JAXBElement<SucculentsFlower>(_SucculentsFlower_QNAME, SucculentsFlower.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WildFlower }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wildFlower", substitutionHeadNamespace = "", substitutionHeadName = "flower")
    public JAXBElement<WildFlower> createWildFlower(WildFlower value) {
        return new JAXBElement<WildFlower>(_WildFlower_QNAME, WildFlower.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecorativeBloomingFlower }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "decorativeBloomingFlower", substitutionHeadNamespace = "", substitutionHeadName = "flower")
    public JAXBElement<DecorativeBloomingFlower> createDecorativeBloomingFlower(DecorativeBloomingFlower value) {
        return new JAXBElement<DecorativeBloomingFlower>(_DecorativeBloomingFlower_QNAME, DecorativeBloomingFlower.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Flower }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flower")
    public JAXBElement<Flower> createFlower(Flower value) {
        return new JAXBElement<Flower>(_Flower_QNAME, Flower.class, null, value);
    }

}
