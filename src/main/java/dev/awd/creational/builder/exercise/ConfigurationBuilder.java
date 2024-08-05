package dev.awd.creational.builder.exercise;

public interface ConfigurationBuilder {

    ConfigurationBuilder setGraphicsQuality(int graphicsQuality);

    ConfigurationBuilder setDisplayMode(String displayMode);

    ConfigurationBuilder enableSound();

    ConfigurationBuilder enableNotification();

    ConfigurationBuilder setControlScheme(String colorScheme);
}
