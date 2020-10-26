package com.epam.flowers.factory;

import com.epam.flowers.parser.DomParser;
import com.epam.flowers.parser.JaxbParser;
import com.epam.flowers.parser.Parser;
import com.epam.flowers.parser.SaxParser;

public class ParserFactory {
    public ParserFactory(){
    }

    public Parser createParser(ParserType typeParser){
        switch (typeParser) {
            case DOM:
                return DomParser.getInstance();
            case JAXB:
                return JaxbParser.getInstance();
            case SAX:
                return SaxParser.getInstance();
            default:
                throw new EnumConstantNotPresentException(typeParser.getDeclaringClass(), typeParser.name());
        }
    }
}