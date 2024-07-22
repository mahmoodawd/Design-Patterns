package dev.awd.structural.decorator;

public class SugarDecorator extends CondimentDecorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String prepare() {
        return super.prepare() + " With Sugar";
    }
}
