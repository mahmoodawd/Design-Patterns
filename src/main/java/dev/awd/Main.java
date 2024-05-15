package dev.awd;

import dev.awd.structural.adapter.LegacyWeatherService;
import dev.awd.structural.adapter.ThirdPartyWeatherService;
import dev.awd.structural.adapter.WeatherServiceAdaptee;
import dev.awd.structural.adapter.WeatherServiceAdapter;

public class Main {
    public static void main(String[] args) {
        ThirdPartyWeatherService api = new ThirdPartyWeatherService();
        WeatherServiceAdapter legacyWeatherService = new WeatherServiceAdaptee(new LegacyWeatherService(api));

        String data = legacyWeatherService.getTemperature(45.3, 412.3);
        System.out.println(data);

    }
}