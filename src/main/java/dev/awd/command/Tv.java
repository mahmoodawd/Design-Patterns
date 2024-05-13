package dev.awd.command;

public class Tv {
    private String name;

    public Tv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void turnOn() {
        System.out.println("Tv is turned on");
    }

    public void turnOff() {
        System.out.println("Tv is turned off");
    }
}
