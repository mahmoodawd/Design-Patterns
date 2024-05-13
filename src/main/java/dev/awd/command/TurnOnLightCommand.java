package dev.awd.command;

public class TurnOnLightCommand implements SmartCommand {
    private final Light light;


    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
