package com.mycompany.templatemethodpattern;

public class TemplateMethodPattern {

    public static void main(String[] args) {
        BuildingHouse wood = new WoodenHouse();
        wood.houseTemplate();
    }
}
