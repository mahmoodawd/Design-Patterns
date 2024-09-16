package dev.awd.creational.prototype;

public class Flayer extends MarketingMaterial {
    public Flayer(String content, String layout, String color) {
        super(content, layout, color);
    }

    @Override
    public Flayer clone() {
        return new Flayer(this.content, this.layout, this.color);
    }

}
