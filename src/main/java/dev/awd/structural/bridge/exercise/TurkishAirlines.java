package dev.awd.structural.bridge.exercise;

public class TurkishAirlines implements AirlineProvider {

    LoyaltyProgram loyaltyProgram;

    public TurkishAirlines(LoyaltyProgram loyaltyProgram) {
        this.loyaltyProgram = loyaltyProgram;
    }

    @Override
    public void bookFlight() {
        System.out.println("Book Flight: Turkish Airlines");
    }
}
