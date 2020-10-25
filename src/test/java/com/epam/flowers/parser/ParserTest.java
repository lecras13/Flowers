package com.epam.flowers.parser;

import com.epam.flowers.entity.*;
import com.epam.flowers.factory.ParserFactory;
import com.epam.flowers.factory.ParserType;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

@RunWith(DataProviderRunner.class)
public class ParserTest {
    private static final String VALID_XML = "src/test/java/com/epam/flowers/datatest/flowers.xml";

    @DataProvider
    public static Object[][] testProvider(){
        Flower flowerFirst = new WildFlower(Soil.SOD_PODZOLIC, Color.YELLOW,
                new GrowingTips(10, true, 1000),
                "Chelidonium", "Europe-Japan", Reproduction.BY_SEED,
                Region.MEADOW, false);
        Flower flowerSecond = new WildFlower(Soil.PODZOLIC, Color.BLUE,
                new GrowingTips(20, true, 1000),
                "Cornflower", "Europe-Asia", Reproduction.BY_SEED,
                Region.FIELD, false);
        Flower flowerThird = new HomeFlower(Soil.UNPAVED, Color.RED,
                new GrowingTips(25, true, 1500),
                "Abutilon", "Brazilia-South_America", Reproduction.BY_SEED,
                70, false, false);
        Flower flowerFourth = new HomeFlower(Soil.PODZOLIC, Color.GREEN,
                new GrowingTips(24, true, 400),
                "Gasteria", "South_America", Reproduction.BY_STALK,
                40, false, false);
        List<Flower> flowers = Arrays.asList(flowerFirst, flowerSecond, flowerThird, flowerFourth);
        return new Object[][]{
                {flowers}
        };
    }

    @Test
    @UseDataProvider("testProvider")
    public void testSaxParser(List<Flower> flowers){
        ParserFactory parserFactory = new ParserFactory();
        Parser saxParser = parserFactory.createParser(ParserType.SAX);
        List<Flower> actual = saxParser.parse(VALID_XML);

        boolean resultCompare = actual.equals(flowers);

        Assert.assertTrue(resultCompare);
    }

    @Test
    @UseDataProvider("testProvider")
    public void testDomParser(List<Flower> flowers){
        ParserFactory parserFactory = new ParserFactory();
        Parser domParser = parserFactory.createParser(ParserType.DOM);
        List<Flower> actual = domParser.parse(VALID_XML);

        boolean resultCompare = actual.equals(flowers);

        Assert.assertTrue(resultCompare);
    }

    @Test
    @UseDataProvider("testProvider")
    public void testJaxbParser(List<Flower> flowers){
        ParserFactory parserFactory = new ParserFactory();
        Parser jaxbParser = parserFactory.createParser(ParserType.JAXB);
        List<Flower> actual = jaxbParser.parse(VALID_XML);

        boolean resultCompare = actual.equals(flowers);

        Assert.assertTrue(resultCompare);
    }
}
