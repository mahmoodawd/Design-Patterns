package dev.awd.structural.facade;

public class TravelBookingFacade {
    private final FlightManager flightManager;
    private final HotelReservation hotelReservation;
    private final CarRental carRental;
    private final PaymentProcessor paymentProcessor;

    public TravelBookingFacade() {
        flightManager = new FlightManager();
        hotelReservation = new HotelReservation();
        carRental = new CarRental();
        paymentProcessor = new PaymentProcessor();
    }

    public void bookTrip(Trip trip) {
        flightManager.bookFlight(trip.getDeparture(), trip.getDestination(), trip.getFlightDate());

        hotelReservation.reserveRoom(trip.getRoomId(), trip.getCheckInDate(), trip.getCheckOutDate());

        carRental.rentCar(trip.getCarRentalLocation(), trip.getCarRentalStartDate(), trip.getCarRentalEndDate());

        paymentProcessor.processPayment(trip.getPaymentAmount(), trip.getPaymentMethod());
    }
}
