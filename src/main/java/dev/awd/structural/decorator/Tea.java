package dev.awd.structural.decorator;

public class Tea implements Beverage {


    @Override
    public String prepare() {
        return "Preparing Tea";
    }
}
