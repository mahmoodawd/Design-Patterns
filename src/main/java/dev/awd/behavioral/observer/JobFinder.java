package dev.awd.behavioral.observer;

public class JobFinder implements Subscriber {

    private String name;

    public String getName() {
        return name;
    }

    public JobFinder(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println("Notifying " + name + " about: " + message);

    }
}
