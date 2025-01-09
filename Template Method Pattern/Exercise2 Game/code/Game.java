package com.mycompany.templatemethodpattern.GameExercise;

public abstract class Game {
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
    
    public final void initialize(){
        System.out.println("Game Start....");
    }
    
    public abstract void startPlay();
    
    public abstract void endPlay();

}
