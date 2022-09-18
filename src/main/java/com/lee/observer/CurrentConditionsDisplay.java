package com.lee.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    String name;
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData, String name) {
        this.name = name;
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
//        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + " % humidity and " + pressure + " pressure");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
