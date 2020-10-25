package com.epam.flowers.exception;


import com.epam.flowers.validation.ValidatorXML;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;

public class FlowerErrorHandler extends DefaultHandler {
    private final static Logger LOGGER = LogManager.getLogger(FlowerErrorHandler.class);

    public FlowerErrorHandler() {
    }

    public void warning(SAXParseException e){
        LOGGER.warn(getLineAddress(e) + " - " + e.getMessage());
    }

    public void error(SAXParseException e){
        LOGGER.error(getLineAddress(e) + " - " + e.getMessage());
    }

    public void fatalError(SAXParseException e){
        LOGGER.fatal(getLineAddress(e) + " - " + e.getMessage());
    }

    private String getLineAddress(SAXParseException e){
        return e.getLineNumber() + " : " + e.getColumnNumber();
    }
}