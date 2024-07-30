package dev.awd.structural.facade;

public class HotelReservation {
    public void reserveRoom(String roomId, String checkInDate, String checkOutDate) {
        System.out.println("Reserving room " + roomId + " in " + checkInDate + " to " + checkOutDate);
    }
}
