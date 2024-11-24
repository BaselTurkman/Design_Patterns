package com.mycompany.observer;

import java.util.*;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    //create the constructor, make sure to initialize the obseervers collection
    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.indexOf(o) >= 0) {
            observers.remove(observers.indexOf(o));
        }
    }

    // notifyObservers using push Approach
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer o = (Observer) observers.get(i);
            o.update(temperature, humidity, pressure);
        }
    }
    // notifyObservers using pull Approach
//    @Override
//    public void notifyObservers(){
//        for (Observer observer : observers) {
//            observer.update();
//        }
//    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
