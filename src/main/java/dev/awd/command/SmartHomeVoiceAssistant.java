package dev.awd.command;

import java.util.HashMap;
import java.util.Map;

public class SmartHomeVoiceAssistant {
    private final Map<String, SmartCommand> commands;

    public SmartHomeVoiceAssistant() {
        commands = new HashMap<String, SmartCommand>();
    }

    public void setCommand(String action, SmartCommand command) {
        commands.put(action, command);
    }

    public void say(String message) {
        commands.get(message).execute();
    }
}


