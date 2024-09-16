package dev.awd;


import dev.awd.creational.prototype.Brochure;
import dev.awd.creational.prototype.Flayer;
import dev.awd.creational.prototype.Poster;

public class Main {
    public static void main(String[] args) {
        Flayer flayer = new Flayer("This is Flayer Content", "A4", "red");
        Poster poster = new Poster("This is Poster Content", "A3", "blue");
        Brochure brochure = new Brochure("This is Brochure Content", "Letter", "aqua");
        Flayer flayer2 = flayer.clone();
        flayer2.print();
    }
}