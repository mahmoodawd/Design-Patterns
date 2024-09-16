package dev.awd.creational.prototype;

public abstract class MarketingMaterial implements Cloneable{
    String content;
    String layout;
    String color;

    public MarketingMaterial(String content, String layout, String color) {
        this.content = content;
        this.layout = layout;
        this.color = color;
    }

    public void print() {
        System.out.println("Layout: " + layout + " Color: " + color + " Content: " + content);
    }

    public String getContent() {
        return content;
    }

    public String getLayout() {
        return layout;
    }

    public String getColor() {
        return color;
    }

    @Override
    public abstract MarketingMaterial clone();
}
