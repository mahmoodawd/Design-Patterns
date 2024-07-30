package dev.awd.structural.facade;

public class Trip {
    private String departure;
    private String destination;
    private String flightDate;
    private String roomId;
    private String checkInDate;
    private String checkOutDate;
    private String carRentalLocation;
    private String carRentalStartDate;
    private String carRentalEndDate;
    private double paymentAmount;
    private String paymentMethod;

    public Trip(String departure,
                String destination,
                String flightDate,
                String roomId,
                String checkInDate,
                String checkOutDate,
                String carRentalLocation,
                String carRentalStartDate,
                String carRentalEndDate,
                double paymentAmount,
                String paymentMethod) {
        this.departure = departure;
        this.destination = destination;
        this.flightDate = flightDate;
        this.roomId = roomId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.carRentalLocation = carRentalLocation;
        this.carRentalStartDate = carRentalStartDate;
        this.carRentalEndDate = carRentalEndDate;
        this.paymentAmount = paymentAmount;
        this.paymentMethod = paymentMethod;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getCarRentalLocation() {
        return carRentalLocation;
    }

    public void setCarRentalLocation(String carRentalLocation) {
        this.carRentalLocation = carRentalLocation;
    }

    public String getCarRentalStartDate() {
        return carRentalStartDate;
    }

    public void setCarRentalStartDate(String carRentalStartDate) {
        this.carRentalStartDate = carRentalStartDate;
    }

    public String getCarRentalEndDate() {
        return carRentalEndDate;
    }

    public void setCarRentalEndDate(String carRentalEndDate) {
        this.carRentalEndDate = carRentalEndDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
