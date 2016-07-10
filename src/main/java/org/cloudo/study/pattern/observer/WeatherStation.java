package org.cloudo.study.pattern.observer;

/**
 * Created by cloudpj on 16/7/10.
 */
public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);


    }
}
