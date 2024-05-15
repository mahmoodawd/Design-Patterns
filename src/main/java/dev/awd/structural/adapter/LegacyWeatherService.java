package dev.awd.structural.adapter;

public class LegacyWeatherService {
    ThirdPartyWeatherService api;

    public LegacyWeatherService(ThirdPartyWeatherService api) {
        this.api = api;
    }

    public String getTemperature(String city, String country) {
        return api.getTemperature(city, country);
    }

}