package dev.awd.strategy;

public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double price) {
        return price;
    }
}
