package com.mycompany.chocolateboiler;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    //ii. Eager Instantiation
//    private static final ChocolateBoiler uniqueInstance = new ChocolateBoiler();
//
//    public static ChocolateBoiler getInstance() {
//        return uniqueInstance;
//    }
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    //a. Lazy Instantiation Singleton (Single-threaded)
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

//    //b. Thread-Safe Singleton Implementations
//    //i. Synchronization
//    public static synchronized ChocolateBoiler getInstance() {
//        if (uniqueInstance == null) {
//            uniqueInstance = new ChocolateBoiler();
//        }
//        return uniqueInstance;
//    }
    
    //iii. Double-Checked Locking
//    public static ChocolateBoiler getInstance() {
//        if (uniqueInstance == null) {
//            synchronized (ChocolateBoiler.class) {
//                if (uniqueInstance == null) {
//                    uniqueInstance = new ChocolateBoiler();
//                }
//            }
//        }
//        return uniqueInstance;
//    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
