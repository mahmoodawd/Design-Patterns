package dev.awd.structural.decorator;

public class MilkDecorator extends CondimentDecorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String prepare() {

        return super.prepare() + " With Milk";
    }
}
