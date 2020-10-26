package com.epam.flowers.validation;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorSaxTest {
    private static final String VALID_XML = "src/test/java/com/epam/flowers/datatest/flowers.xml";
    private static final String INVALID_XML = "src/test/java/com/epam/flowers/datatest/flowersInvalid.xml";
    private static final String XSD = "src/test/java/com/epam/flowers/datatest/flowers.xsd";
    private static ValidatorSAX validatorSAX = new ValidatorSAX();

    @Test
    public void testValidatorBySaxPositive(){
        boolean actual = validatorSAX.checkBySax(VALID_XML, XSD);
        Assert.assertTrue(actual);
    }

    @Test
    public void testValidatorBySaxNegativeWithMissAttribute(){
        boolean actual = validatorSAX.checkBySax(INVALID_XML, XSD);
        Assert.assertFalse(actual);
    }
}
