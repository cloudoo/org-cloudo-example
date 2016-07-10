package org.cloudo.study.pattern.observer2;

import org.cloudo.study.pattern.observer1.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by cloudpj on 16/7/10.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float currnetPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            lastPressure = currnetPressure;
            this.currnetPressure = ((WeatherData) o).getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("");
    }
}
