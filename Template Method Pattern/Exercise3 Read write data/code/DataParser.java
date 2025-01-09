package com.mycompany.templatemethodpattern.ReadWriteData;

public abstract class DataParser {

    public final void parsDataAndGenerateOutput() {
        readData();
        processData();
        writeData();
    }

    public abstract void readData();

    public abstract void processData();

    public final void writeData() {
        System.out.println("Output generated,writing to CSV");
    }

}
