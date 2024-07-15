package dev.awd.structural.bridge.exercise;

public class EgyptAir implements AirlineProvider {
    LoyaltyProgram loyaltyProgram;

    public EgyptAir(LoyaltyProgram loyaltyProgram) {
        this.loyaltyProgram = loyaltyProgram;
    }

    @Override
    public void bookFlight() {
        System.out.println("Book Flight: Egypt Airlines");
    }
}
