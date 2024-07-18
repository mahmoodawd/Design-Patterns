package dev.awd.structural.composite.exercise;

public class Product implements CartItem {

    private final String title;
    private final double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public double calcTotalPrice() {
        return price;
    }
}
