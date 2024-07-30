package dev.awd;


import dev.awd.structural.facade.TravelBookingFacade;
import dev.awd.structural.facade.Trip;

public class Main {
    public static void main(String[] args) {
        TravelBookingFacade travelBookingFacade = new TravelBookingFacade();
        Trip trip = new Trip("Amsterdam",
                "Madrid",
                "2024-08-01",
                "A50",
                "2024-08-01",
                "2024-08-05",
                "Airport",
                "2024-08-01",
                "2024-08-05",
                10000,
                "Cash");
        travelBookingFacade.bookTrip(trip);


    }
}