package com.mycompany.templatemethodpattern;

public class WoodenHouse extends BuildingHouse {

    @Override
    public void buildingPillars() {
        System.out.println("Building Pillars with Wood coating");
    }

    @Override
    public void buildingWalls() {
        System.out.println("Building Wooden Walls");
    }

}
