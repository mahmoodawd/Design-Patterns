package dev.awd.structural.composite.extra;

public class Pound implements CurrencyUnit {
    double amount;

    public Pound(double amount) {
        this.amount = amount;
    }

    @Override
    public void getFakka() {
        System.out.println("Fakka for Pound");
    }
}
