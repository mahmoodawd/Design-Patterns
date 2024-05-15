package dev.awd.behavioral.command;

public class TurnOffTvCommand implements SmartCommand {
    private final Tv tv;


    public TurnOffTvCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
