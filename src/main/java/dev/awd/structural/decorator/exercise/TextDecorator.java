package dev.awd.structural.decorator.exercise;

public abstract class TextDecorator implements Text {
    Text text;


    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String format() {
        return text.format();
    }
}
