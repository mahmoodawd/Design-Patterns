package dev.awd.structural.decorator.exercise;

public class Italic extends TextDecorator {
    public Italic(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<i>" + text.format() + "</i>";
    }

}
