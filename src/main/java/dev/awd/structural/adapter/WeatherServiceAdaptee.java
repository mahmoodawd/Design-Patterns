package dev.awd.structural.adapter;

public class WeatherServiceAdaptee implements WeatherServiceAdapter{

    private final LegacyWeatherService legacyWeatherService;

    public WeatherServiceAdaptee(LegacyWeatherService legacyWeatherService) {
        this.legacyWeatherService = legacyWeatherService;
    }



    @Override
    public String getTemperature(double latitude, double longitude) {
        String city = getCity(latitude, longitude);
        String country = getCountry(latitude, longitude);
        return convertDataToJSON(legacyWeatherService.getTemperature(city, country));
    }

    private String getCity(double lat, double lon) {
        return "City of: " + lat + ", " + lon;
    }

    private String getCountry(double lat, double lon) {
        return "Country of: " + lat + ", " + lon;
    }

    private String convertDataToJSON(String data) {
        System.out.println("Converting " + data + " to JSON");
        return data;
    }
}
