package com.mycompany.observer;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        //write necessary code here to create instances of three observers displays: currentConditionDisplay, ForecastDisplay, StatisticsDisplay
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        //write code to update the displays for each of following measures
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("-------------------------------------------------------------");
//        currentConditionsDisplay.display();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("-------------------------------------------------------------");
//        currentConditionsDisplay.display();

        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println("-------------------------------------------------------------");
//        currentConditionsDisplay.display();
        //tempreture , humidity, pressure
        //80, 65, 30.4f
        //82, 70, 29.2f;
        //78, 90, 29.2f;
        // Remove an observer and update measurements
        System.out.println("delete currentConditionsDisplay observer");
        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.setMeasurements(20, 85, 1009);
    }
}
