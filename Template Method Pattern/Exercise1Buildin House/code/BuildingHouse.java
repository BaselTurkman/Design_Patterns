package com.mycompany.templatemethodpattern;

public abstract class BuildingHouse {

    public final void houseTemplate() {
        buildingFoundation();
        buildingPillars();
        buildingWalls();
        buildingWindows();
    }

    public final void buildingFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }

    public abstract void buildingPillars();

    public abstract void buildingWalls();

    public void buildingWindows() {
        System.out.println("Building Glass Windows");

    }

}
