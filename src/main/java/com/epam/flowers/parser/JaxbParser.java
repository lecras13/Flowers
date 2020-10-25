package com.epam.flowers.parser;

import com.epam.flowers.entity.Flower;
import com.epam.flowers.entity.Flowers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JaxbParser implements Parser {
    private static final JaxbParser instance = new JaxbParser();
    public static final String FILE_NAME = "src/main/java/com/epam/flowers/data/flowers.xml";

    private JaxbParser(){
    }

    public static JaxbParser getInstance(){
        return instance;
    }

    @Override
    public List<Flower> parse(String file){
        List<Flower> flowers = new ArrayList<>();

        try {
            JAXBContext jc = JAXBContext.newInstance(Flowers.class);
            Unmarshaller u = jc.createUnmarshaller();
            FileReader reader = new FileReader(FILE_NAME);
            Flowers flowersJaxb = (Flowers) u.unmarshal(reader);
            List<JAXBElement<? extends Flower>> fd = flowersJaxb.getFlower();
            for (JAXBElement c:fd) {

                Flower flower = (Flower) c.getValue();
                flowers.add(flower);
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return flowers;
    }
}
