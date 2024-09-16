package dev.awd.creational.prototype;

public class Brochure extends MarketingMaterial {
    public Brochure(String content, String layout, String color) {
        super(content, layout, color);
    }

    @Override
    public Brochure clone() {
        return new Brochure(this.content, this.layout, this.color);
    }
}


