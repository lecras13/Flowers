package com.epam.flowers;

import com.epam.flowers.factory.ParserFactory;
import com.epam.flowers.factory.ParserType;
import com.epam.flowers.parser.Parser;
import com.epam.flowers.validation.ValidatorSAX;
import com.epam.flowers.validation.ValidatorXML;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Director {

    private final static Logger LOGGER = LogManager.getLogger(Director.class);
    public static final String FILE_NAME = "src/main/java/com/epam/flowers/data/flowers.xml";
    public static final String SCHEMA_NAME = "src/main/java/com/epam/flowers/data/flowers.xsd";

    public static void main(String[] args){
        ValidatorXML validatorXML = new ValidatorXML();
        boolean validXML = validatorXML.checkByXML(FILE_NAME, SCHEMA_NAME);

        ValidatorSAX validatorSAX = new ValidatorSAX();
        boolean validSax = validatorSAX.checkBySax(FILE_NAME, SCHEMA_NAME);

        if (validSax && validXML) {
            ParserFactory parserFactory = new ParserFactory();

            LOGGER.info("SaxParser running");
            Parser saxParser = parserFactory.createParser(ParserType.SAX);
            LOGGER.info(saxParser.parse(FILE_NAME));

            LOGGER.info("DomParser running");
            Parser domParser = parserFactory.createParser(ParserType.DOM);
            LOGGER.info(domParser.parse(FILE_NAME));

            LOGGER.info("JaxbParser running");
            Parser jaxbParser = parserFactory.createParser(ParserType.JAXB);
            LOGGER.info(jaxbParser.parse(FILE_NAME));
        }
    }
}
