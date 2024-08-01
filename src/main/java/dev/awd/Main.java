package dev.awd;


import dev.awd.structural.flyweight.exercise.Color;
import dev.awd.structural.flyweight.exercise.Font;
import dev.awd.structural.flyweight.exercise.WordProcessor;

public class Main {
    public static void main(String[] args) {

        new WordProcessor().renderText("Hello world", new Font("Arial", 18), new Color("blue"), 100, 100);
    }
}