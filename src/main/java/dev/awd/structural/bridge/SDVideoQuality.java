package dev.awd.structural.bridge;

public class SDVideoQuality implements VideoQuality {

    @Override
    public void render() {
        System.out.println("SD Video Quality");
    }
}
