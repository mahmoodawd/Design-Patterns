package dev.awd.behavioral.command;

public class LockDoorCommand implements SmartCommand {
    private final Door door;

    public LockDoorCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.lock();
    }
}
