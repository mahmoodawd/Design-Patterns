package dev.awd.structural.decorator;

public class MintDecorator extends CondimentDecorator {
    public MintDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String prepare() {
        return super.prepare()  + " With Mint";
    }
}
