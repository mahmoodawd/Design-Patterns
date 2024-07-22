package dev.awd.structural.decorator;

public class LemonDecorator extends CondimentDecorator {

    public LemonDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String prepare() {

        return super.prepare() + " With Lemon";
    }
}
