package com.lee.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayInner implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplayInner(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplayInner{" +
                "observable=" + observable +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataInner){
            WeatherDataInner weatherDataInner = (WeatherDataInner) o;
            this.temperature = weatherDataInner.getTemperature();
            this.humidity = weatherDataInner.getHumidity();
            display();
        }
    }
}
