package dev.awd;


import dev.awd.creational.builder.exercise.ConfigurationManager;

public class Main {
    public static void main(String[] args) {

        ConfigurationManager configurationManager = new ConfigurationManager.GameConfigurationBuilder()
                .enableSound()
                .enableNotification()
                .setControlScheme("JoyStick")
                .setDisplayMode("60 FPS")
                .build();

        System.out.println(configurationManager.getControlScheme());
    }
}