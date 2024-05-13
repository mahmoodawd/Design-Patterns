package dev.awd.command;

import java.util.HashMap;
import java.util.Map;

public class SmartHomeShortcut {

    private final Map<String, SmartCommand> commands;

    public SmartHomeShortcut() {
        commands = new HashMap<String, SmartCommand>();
    }

    public void setCommand(String action, SmartCommand command) {
        commands.put(action, command);
    }

    public void openShortcut(String shortcut) {
        commands.get(shortcut).execute();
    }


}
