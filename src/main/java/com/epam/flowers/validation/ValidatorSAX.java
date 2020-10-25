package com.epam.flowers.validation;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import com.epam.flowers.exception.FlowerErrorHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

public class ValidatorSAX {
    public static final String LANGUAGE = XMLConstants.W3C_XML_SCHEMA_NS_URI;
    private final static Logger LOGGER = LogManager.getLogger(ValidatorSAX.class);

    public ValidatorSAX(){
    }

    public boolean checkBySax(String fileName, String schemaName){
        SchemaFactory factory = SchemaFactory.newInstance(LANGUAGE);
        try {
            Schema schema = factory.newSchema(new File(schemaName));
            SAXParserFactory spf = SAXParserFactory.newInstance();
            spf.setSchema(schema);
            spf.setNamespaceAware(true);

            SAXParser parser = spf.newSAXParser();
            parser.parse(fileName, new FlowerErrorHandler());
            LOGGER.info(String.format("%s is valid. \n", fileName));
        } catch (ParserConfigurationException e) {
            LOGGER.error(String.format("%s config error: %s\n", fileName, e.getMessage()));
            return false;
        } catch (SAXException e) {
            LOGGER.error(String.format("%s SAX error: %s\n",fileName, e.getMessage()));
            return false;
        } catch (IOException e) {
            LOGGER.error(String.format("I/O error: %s\n",e.getMessage()));
            return false;
        }
        return true;
    }
}