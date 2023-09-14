package org.example.callback.controller;

public class WeatherDto {
    private String weather;

    public WeatherDto(String weather) {
        this.weather = weather;
    }

    public String getWeather() {
        return weather;
    }
}
