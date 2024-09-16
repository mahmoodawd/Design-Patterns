package dev.awd.creational.prototype;

public class Poster extends MarketingMaterial {
    public Poster(String content, String layout, String color) {
        super(content, layout, color);
    }

    @Override
    public Poster clone() {
        return new Poster(this.content, this.layout, this.color);
    }
}
