package dev.awd.behavioral.command;

public class TurnOnTvCommand implements SmartCommand {
    private final Tv tv;


    public TurnOnTvCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
