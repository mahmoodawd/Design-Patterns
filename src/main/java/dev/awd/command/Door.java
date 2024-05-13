package dev.awd.command;

public class Door {
    private String name;

    public Door(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void lock() {
        System.out.println("Door " + name + " is locked.");
    }

    public void unlock() {
        System.out.println("Door " + name + " is unlocked.");
    }
}
