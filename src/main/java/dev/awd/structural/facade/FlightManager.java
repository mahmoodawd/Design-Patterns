package dev.awd.structural.facade;

public class FlightManager {
    public void bookFlight(String departure, String destination, String date) {
        System.out.println("Booking flight " + departure + " " + destination + " at " + date);
    }
}
