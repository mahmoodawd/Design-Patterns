package dev.awd;


import dev.awd.structural.decorator.exercise.Bold;
import dev.awd.structural.decorator.exercise.Italic;
import dev.awd.structural.decorator.exercise.PlainText;
import dev.awd.structural.decorator.exercise.Text;

public class Main {
    public static void main(String[] args) {
        Text boldItalicText = new Italic(new Bold(new PlainText("Some Text")));
        System.out.println(boldItalicText.format());
    }
}