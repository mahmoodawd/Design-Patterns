package dev.awd.strategy;

public class Product {
    private String name;
    private double price;
    private PricingStrategy pricingStrategy;

    public Product(String name, double price, PricingStrategy pricingStrategy) {
        this.name = name;
        this.price = price;
        this.pricingStrategy = pricingStrategy;
    }

    public String getName() {
        return name;
    }


    public double calculatePrice() {

        return pricingStrategy.calculatePrice(price);
    }
}