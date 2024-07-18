package dev.awd;


import dev.awd.structural.composite.exercise.Bundle;
import dev.awd.structural.composite.exercise.Product;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 15000.0);
        Product mobile = new Product("Iphone11", 25000.0);
        Product bag = new Product("Bag", 10000.0);
        Product airConditioner = new Product("AirConditioner", 50000.0);

        Bundle bundle = new Bundle();

        bundle.addItem(laptop);
        bundle.addItem(mobile);

        System.out.println(bundle.calcTotalPrice());
        System.out.println(bag.calcTotalPrice());
        System.out.println(airConditioner.calcTotalPrice());
    }
}