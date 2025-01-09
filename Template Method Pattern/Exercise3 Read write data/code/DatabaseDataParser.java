package com.mycompany.templatemethodpattern.ReadWriteData;

public class DatabaseDataParser extends DataParser{

    @Override
    public void readData() {
        System.out.println("Reading data from database....");
    }

    @Override
    public void processData() {
        System.out.println("Looping through datasets");
    }

}
