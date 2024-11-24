package com.mycompany.observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    //compose the Concrete subject (WeatherData) here , write necessary code
    private WeatherData weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = (WeatherData) weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }
    
    @Override
    public void update(){
        tempSum+= weatherData.getTemperature();
        numReadings++;
        if(weatherData.getTemperature() > maxTemp){
            maxTemp = weatherData.getTemperature();
        }
        if(weatherData.getTemperature() < minTemp){
            minTemp = weatherData.getTemperature();
        }
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
