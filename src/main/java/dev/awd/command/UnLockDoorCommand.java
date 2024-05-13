package dev.awd.command;

public class UnLockDoorCommand implements SmartCommand {
    private final Door door;

    public UnLockDoorCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.unlock();
    }
}
