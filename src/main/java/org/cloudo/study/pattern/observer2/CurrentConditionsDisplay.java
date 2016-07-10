package org.cloudo.study.pattern.observer2;

import org.cloudo.study.pattern.observer1.*;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by cloudpj on 16/7/10.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof org.cloudo.study.pattern.observer2.WeatherData) {
            WeatherData weatherData = (org.cloudo.study.pattern.observer2.WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("haha当前温度:" + temperature + "华氏度 " + humidity + "% 湿度");
    }
}
