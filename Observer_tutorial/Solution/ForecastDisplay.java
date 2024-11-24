package com.mycompany.observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;    
    private float lastPressure;

//compose the Concrete subject (WeatherData) here , write necessary code
    private WeatherData weatherData;
    
    public ForecastDisplay(Subject weatherData) {
        this.weatherData = (WeatherData) weatherData;
        weatherData.registerObserver(this);
    }
    // push Approach
    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
    // pull Approach
    @Override
    public void update(){
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
    }
    
    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
