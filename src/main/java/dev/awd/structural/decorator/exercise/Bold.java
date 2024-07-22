package dev.awd.structural.decorator.exercise;

public class Bold extends TextDecorator {
    public Bold(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<b>" + text.format() + "</b>";
    }

}
