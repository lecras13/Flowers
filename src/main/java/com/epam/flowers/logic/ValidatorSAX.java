package com.epam.flowers.logic;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import com.epam.flowers.exception.FlowerErrorHandler;
import org.xml.sax.SAXException;

public class ValidatorSAX {
    public static void main(String[] args){
        String filename = "Flowers.xml";
        String schemaName = "Flowers.xsd";
        String logName = "log.txt";
        Schema schema;
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(language);
        try {
            schema = factory.newSchema(new File(schemaName));
            SAXParserFactory spf = SAXParserFactory.newInstance();
            spf.setSchema(schema);

            SAXParser parser = spf.newSAXParser();

            parser.parse(filename, new FlowerErrorHandler(logName));
            System.out.println(filename + " is valid");

        } catch (ParserConfigurationException e) {
            System.err.println(filename + " config error: " + e.getMessage());

        } catch (SAXException e) {
            System.err.println(filename + " SAX error: " + e.getMessage());

        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}