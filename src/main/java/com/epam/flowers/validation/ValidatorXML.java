package com.epam.flowers.validation;

import java.io.*;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

public class ValidatorXML {
    public static final String LANGUAGE = XMLConstants.W3C_XML_SCHEMA_NS_URI;
    private final static Logger LOGGER = LogManager.getLogger(ValidatorXML.class);

    public ValidatorXML(){
    }

    public boolean checkByXML(String fileName, String schemaName){
        SchemaFactory factory = SchemaFactory.newInstance(LANGUAGE);
        File schemaLocation = new File(schemaName);
        try {
            Schema schema = factory.newSchema(schemaLocation);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(fileName);
            validator.validate(source);
            LOGGER.info(String.format("%s is valid.\n", fileName));
        } catch (SAXException e) {
            LOGGER.error(String.format("%s is not valid because %s\n", fileName, e.getMessage()));
            return false;
        } catch (IOException e) {
            LOGGER.error(String.format("%s is not valid because %s\n", fileName, e.getMessage()));
            return false;
        }
        return true;
    }
}