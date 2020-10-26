package com.epam.flowers.parser;

import com.epam.flowers.entity.*;
import com.epam.flowers.entity.ObjectFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DomParser implements Parser {
    private static final DomParser instance = new DomParser();
    private static final String WILDFLOWER = "wildFlower";
    private static final String HOMEFLOWER = "homeFlower";

    private DomParser(){
    }

    public static DomParser getInstance(){
        return instance;
    }

    @Override
    public List<Flower> parse(String file){
        DocumentBuilder docBuilder;
        List<Flower> flowers = new ArrayList<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document doc;

        try {
            docBuilder = factory.newDocumentBuilder();
            doc = docBuilder.parse(file);
            Element root = doc.getDocumentElement();

            NodeList flowersList = root.getElementsByTagName(WILDFLOWER);
            for (int i = 0; i < flowersList.getLength(); i++) {
                Element flowerElement = (Element) flowersList.item(i);
                Flower flower = buildFlower(flowerElement, WILDFLOWER);
                flowers.add(flower);
            }

            NodeList flowersList1 = root.getElementsByTagName(HOMEFLOWER);
            for (int i = 0; i < flowersList1.getLength(); i++) {
                Element flowerElement = (Element) flowersList1.item(i);
                Flower flower = buildFlower(flowerElement, HOMEFLOWER);
                flowers.add(flower);
            }
        } catch (IOException e) {
            System.err.println("File error or I/O error: " + e);
        } catch (SAXException e) {
            System.err.println("Parsing failure: " + e);
        } catch (ParserConfigurationException e) {
            System.err.println("Exception configurations of parser: " + e);
        }
        return flowers;
    }

    private Flower buildFlower(Element flowerElement, String type){
        ObjectFactory objectFactory = new ObjectFactory();
        Flower flower = null;
        if (type.equals(WILDFLOWER)) {
            flower = objectFactory.createWildFlower();
            WildFlower wildFlower = (WildFlower) flower;
            wildFlower.setRegion(Region.fromValue(getElementTextContent(flowerElement, FlowerEnum.REGION.getValue())));
            Boolean thornsPresence = Boolean.valueOf(getElementTextContent(flowerElement, FlowerEnum.THORNSPRESENCE.getValue()));
            wildFlower.setThornsPresence(thornsPresence);
            flower = wildFlower;
        } else if (type.equals(HOMEFLOWER)) {
            flower = objectFactory.createHomeFlower();
            HomeFlower homeFlower = (HomeFlower) flower;
            Integer optimalHumidity = Integer.parseInt(getElementTextContent(flowerElement, FlowerEnum.OPTIMALHUMIDITY.getValue()));
            homeFlower.setOptimalHumidity(optimalHumidity);
            Boolean leafDischarge = Boolean.valueOf(getElementTextContent(flowerElement, FlowerEnum.LEAFDISCHARGE.getValue()));
            homeFlower.setLeafDischarge(leafDischarge);
            Boolean fruitPresence = Boolean.valueOf(getElementTextContent(flowerElement, FlowerEnum.FRUITPRESENCE.getValue()));
            homeFlower.setLeafDischarge(fruitPresence);
            flower = homeFlower;
        }
        flower.setNameFlower(flowerElement.getAttribute(FlowerEnum.NAMEFLOWER.getValue()));
        flower.setOrigin(flowerElement.getAttribute(FlowerEnum.ORIGIN.getValue()));
        flower.setReproduction(Reproduction.fromValue(flowerElement.getAttribute(FlowerEnum.REPRODUCTION.getValue())));

        flower.setSoil(Soil.fromValue(getElementTextContent(flowerElement, FlowerEnum.SOIL.getValue())));
        flower.setColor(Color.fromValue(getElementTextContent(flowerElement, FlowerEnum.COLOR.getValue())));

        GrowingTips growingTips = objectFactory.createGrowingTips();
        Integer temperature = Integer.parseInt(getElementTextContent(flowerElement, FlowerEnum.TEMPERATURE.getValue()));
        growingTips.setTemperature(temperature);
        Boolean lightLoving = Boolean.valueOf(getElementTextContent(flowerElement, FlowerEnum.LIGHTLOVING.getValue()));
        growingTips.setLightLowing(lightLoving);
        Integer wateringForWeek = Integer.parseInt(getElementTextContent(flowerElement, FlowerEnum.WATERINGFORWEEK.getValue()));
        growingTips.setWateringForWeek(wateringForWeek);
        flower.setGrowingTips(growingTips);
        return flower;
    }

    private static String getElementTextContent(Element element, String elementName){
        NodeList nList = element.getElementsByTagName(elementName);
        Node node = nList.item(0);
        String text = node.getTextContent();
        return text;
    }
}
