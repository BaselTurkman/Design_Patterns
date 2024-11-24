package com.mycompany.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    //compose the Concrete subject (WeatherData) here , write necessary code
    private WeatherData weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = (WeatherData) weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    // push Approach
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    // pull Approach
    @Override
    public void update() {
        // Pull approach
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
