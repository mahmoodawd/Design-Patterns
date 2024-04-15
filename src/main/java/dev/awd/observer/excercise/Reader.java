package dev.awd.observer.excercise;

public class Reader implements Subscriber {
    private String name;


    public Reader(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public void notify(String message) {
        System.out.println("Notifying " + name + " about: " + message);
    }
}
