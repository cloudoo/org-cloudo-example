package org.cloudo.study.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cloudpj on 16/7/10.
 */
public class WeatherData implements  Subject{
    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
         observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
         int i = observerList.indexOf(observer);
         if(i>=0)
         observerList.remove(i);
    }

    @Override
    public void notifyObserver() {
         for(Observer observer:observerList){
             observer.update(temperature,humidity,pressure);
         }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
