package dev.awd.structural.facade;

public class CarRental {
    public void rentCar(String location, String startDate, String endDate) {
        System.out.println("Rent Car " + location + " from " + startDate + " to " + endDate);
    }
}
