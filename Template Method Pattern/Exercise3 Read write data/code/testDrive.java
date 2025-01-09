package com.mycompany.templatemethodpattern.ReadWriteData;

public class testDrive {
    public static void main(String[] args) {
        DataParser csv = new CSVDataParser();
        csv.parsDataAndGenerateOutput();
        
        DataParser db = new DatabaseDataParser();
        db.parsDataAndGenerateOutput();
    }

}
