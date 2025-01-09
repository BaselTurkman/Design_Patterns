package com.mycompany.templatemethodpattern.GameExercise;

public class TestDrive {
    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();
        Game football = new Football();
        football.play();
    }

}
