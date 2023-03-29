package com.lee.observer;

public class WeatherStation {
    public static void main(String[] args) {
//        WeatherData weatherData = new WeatherData();
//        Observer currentConditionsDisplay1 =
//                new CurrentConditionsDisplay(weatherData, "s1");
//        Observer currentConditionsDisplay2 =
//                new CurrentConditionsDisplay(weatherData, "s2");
//        weatherData.setMeasurement(80, 65,30.4f);
//        weatherData.setMeasurement(82, 70,39.2f);
//        weatherData.setMeasurement(78, 90,29.2f);

        WeatherDataInner weatherDataInner = new WeatherDataInner();
        CurrentConditionsDisplayInner s1 = new CurrentConditionsDisplayInner(weatherDataInner);
        CurrentConditionsDisplayInner s2 = new CurrentConditionsDisplayInner(weatherDataInner);

        weatherDataInner.setMeasurements(80, 65,30.4f);
        weatherDataInner.setMeasurements(82, 70,39.2f);
        weatherDataInner.setMeasurements(78, 90,29.2f);

    }
}
