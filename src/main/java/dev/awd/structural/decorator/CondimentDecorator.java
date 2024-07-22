package dev.awd.structural.decorator;

public class CondimentDecorator implements Beverage {
    protected Beverage beverage;


    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String prepare() {
        return beverage.prepare();
    }
}
