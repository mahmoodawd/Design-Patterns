package dev.awd.structural.adapter;

public class ThirdPartyWeatherService {

    public String getTemperature(String city, String country) {

        System.out.println("Fetching weather data.........");
        return "Temperature of " + city + " in " + country;
    }
}
