package com.epam.flowers.validation;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorXMLTest {
    private static final String VALID_XML = "src/test/java/com/epam/flowers/datatest/flowers.xml";
    private static final String INVALID_XML = "src/test/java/com/epam/flowers/datatest/flowersInvalid.xml";
    private static final String XSD = "src/test/java/com/epam/flowers/datatest/flowers.xsd";
    private static ValidatorXML validatorXML = new ValidatorXML();

    @Test
    public void testValidatorByXmlPositive(){
        boolean actual = validatorXML.checkByXML(VALID_XML, XSD);
        Assert.assertTrue(actual);
    }

    @Test
    public void testValidatorByXmlNegativeWithMissAttribute(){
        boolean actual = validatorXML.checkByXML(INVALID_XML, XSD);
        Assert.assertFalse(actual);
    }
}
