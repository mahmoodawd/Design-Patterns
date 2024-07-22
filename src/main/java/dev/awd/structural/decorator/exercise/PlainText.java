package dev.awd.structural.decorator.exercise;

public class PlainText implements Text {

    String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String format() {
        return text;
    }
}
