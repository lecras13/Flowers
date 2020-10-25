package com.epam.flowers.parsingsax;

import com.epam.flowers.entity.*;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class FlowerHandler extends DefaultHandler {
    private List<Flower> flowers;
    private Flower flower = null;
    private GrowingTips growingTips = null;
    private FlowerEnum flowerEnum = null;
    private EnumSet<FlowerEnum> withText;

    public FlowerHandler(){
        flowers = new ArrayList<>();
        withText = EnumSet.range(FlowerEnum.SOIL, FlowerEnum.FRUITPRESENCE);
    }

    public List<Flower> getFlowers(){
        return flowers;
    }

    public void startElement(String uri, String localName, String qName, Attributes attrs){
        if ("wildFlower".equals(localName)) {
            flower = new WildFlower();
            growingTips = new GrowingTips();
            flower.setNameFlower(attrs.getValue(0));
            if (attrs.getLength() == 3) {
                flower.setOrigin(attrs.getValue(1));
                flower.setReproduction(Reproduction.fromValue(attrs.getValue(2)));
            }
        } else if ("homeFlower".equals(localName)) {
            flower = new HomeFlower();
            growingTips = new GrowingTips();
            flower.setNameFlower(attrs.getValue(0));
            if (attrs.getLength() == 3) {
                flower.setOrigin(attrs.getValue(1));
                flower.setReproduction(Reproduction.fromValue(attrs.getValue(2)));
            }
        } else {
            FlowerEnum temp = FlowerEnum.valueOf(localName.toUpperCase());
            if (withText.contains(temp)) {
                flowerEnum = temp;
            }
        }
    }

    public void endElement(String uri, String localName, String qName){
        if ("wildFlower".equals(localName) || "homeFlower".equals(localName)) {
            flowers.add(flower);
        }
    }

    public void characters(char[] ch, int start, int length){
        String s = new String(ch, start, length).trim();
        if (flowerEnum != null) {
            switch (flowerEnum) {
                case SOIL:
                    flower.setSoil(Soil.valueOf(s.toUpperCase()));
                    break;
                case COLOR:
                    flower.setColor(Color.valueOf(s.toUpperCase()));
                    break;
                case REGION:
                    WildFlower wildFlower = (WildFlower) flower;
                    wildFlower.setRegion(Region.valueOf(s.toUpperCase()));
                    flower = wildFlower;
                    break;
                case THORNSPRESENCE:
                    wildFlower = (WildFlower) flower;
                    wildFlower.setThornsPresence(Boolean.valueOf(s));
                    flower = wildFlower;
                    break;
                case OPTIMALHUMIDITY:
                    HomeFlower homeFlower = (HomeFlower) flower;
                    homeFlower.setOptimalHumidity(Integer.parseInt(s));
                    flower = homeFlower;
                    break;
                case LEAFDISCHARGE:
                    homeFlower = (HomeFlower) flower;
                    homeFlower.setLeafDischarge(Boolean.valueOf(s));
                    flower = homeFlower;
                    break;
                case FRUITPRESENCE:
                    homeFlower = (HomeFlower) flower;
                    homeFlower.setFruitPresence(Boolean.valueOf(s));
                    flower = homeFlower;
                    break;
                case TEMPERATURE:
                    growingTips.setTemperature(Integer.parseInt(s));
                    break;
                case LIGHTLOVING:
                    growingTips.setLightLowing(Boolean.valueOf(s));
                    break;
                case WATERINGFORWEEK:
                    growingTips.setWateringForWeek(Integer.parseInt(s));
                    flower.setGrowingTips(growingTips);
                    break;
                default:
                    throw new EnumConstantNotPresentException(
                            flowerEnum.getDeclaringClass(), flowerEnum.name());
            }
        }
        flowerEnum = null;
    }
}
