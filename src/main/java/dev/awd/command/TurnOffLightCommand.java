package dev.awd.command;

public class TurnOffLightCommand implements SmartCommand {
    private final Light light;


    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
