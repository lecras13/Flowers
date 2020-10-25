package com.epam.flowers.parsingsax;

public enum FlowerEnum {
    FLOWERS("flower"),
    GROWINGTIPS("growingTips"),

    SOIL("soil"),
    COLOR("color"),
    NAMEFLOWER("nameFlower"),
    ORIGIN("origin"),
    REPRODUCTION("reproduction"),
    REGION("region"),
    THORNSPRESENCE("thornsPresence"),
    OPTIMALHUMIDITY("optimalHumidity"),
    LEAFDISCHARGE("leafDischarge"),
    TEMPERATURE("temperature"),
    LIGHTLOVING("lightLoving"),
    WATERINGFORWEEK("wateringForWeek"),
    FRUITPRESENCE("fruitPresence");

    private String value;

    private FlowerEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
