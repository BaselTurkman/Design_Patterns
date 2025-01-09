package com.mycompany.templatemethodpattern.GameExercise;

public class Football extends Game {

    @Override
    public void startPlay() {
        System.out.println("Football game Started...");
    }

    @Override
    public void endPlay() {
        System.out.println("Football game Finished!!!");
    }

}
