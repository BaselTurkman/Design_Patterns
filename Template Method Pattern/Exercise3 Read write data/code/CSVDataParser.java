package com.mycompany.templatemethodpattern.ReadWriteData;

public class CSVDataParser extends DataParser{

    @Override
    public void readData() {
        System.out.println("Reading data from csv file....");
    }

    @Override
    public void processData() {
        System.out.println("Looping through loaded csv file");
    }

}
