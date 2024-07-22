package dev.awd.structural.decorator.exercise;

public class Underline extends TextDecorator {
    public Underline(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<u>" + text.format() + "</u>";
    }

}
