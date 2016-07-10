package org.cloudo.study.pattern.observer2;


/**
 * Created by cloudpj on 16/7/10.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(87, 63, 31.4f);


    }
}
