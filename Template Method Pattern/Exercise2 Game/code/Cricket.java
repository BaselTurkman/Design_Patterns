
package com.mycompany.templatemethodpattern.GameExercise;


public class Cricket extends Game{

    @Override
    public void startPlay() {
        System.out.println("Start Play Cricket...");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket Game Finished!!!");
    }
    
}
