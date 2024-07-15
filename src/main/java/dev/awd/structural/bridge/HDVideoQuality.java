package dev.awd.structural.bridge;

public class HDVideoQuality implements VideoQuality {
    @Override
    public void render() {
        System.out.println("HD Video Quality");
    }
}
