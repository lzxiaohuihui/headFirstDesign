package com.lee.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observeres;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        this.observeres = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observeres.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observeres.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observeres){
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurement(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
