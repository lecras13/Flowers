package com.epam.flowers.parser;

import com.epam.flowers.entity.Flower;
import com.epam.flowers.parsingsax.FlowerHandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.List;

public class SaxParser implements Parser {
    private static SaxParser instance = new SaxParser();
    private static final Logger LOGGER = LogManager.getLogger(SaxParser.class);
    private FlowerHandler flowerHandler;
    private XMLReader reader;

    private SaxParser(){}

    public static SaxParser getInstance(){
        return instance;
    }

    @Override
    public List<Flower> parse(String file){
        flowerHandler = new FlowerHandler();
        try {
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(flowerHandler);
            reader.parse(file);
        } catch (SAXException e) {
            LOGGER.error("Exception Sax parses " + e);
        } catch (IOException e) {
            LOGGER.error("IOException" + e);
        }
        return flowerHandler.getFlowers();
    }
}
