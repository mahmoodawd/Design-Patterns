package dev.awd.structural.decorator;

public class Coffee implements Beverage {

    @Override
    public String prepare() {

        return "Preparing Coffee";
    }
}
