package org.madrona.design.observer;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,5);
        weatherData.setMeasurements(81,64,1);


    }
}
