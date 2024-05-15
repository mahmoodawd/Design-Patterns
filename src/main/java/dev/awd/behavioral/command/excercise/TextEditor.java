package dev.awd.behavioral.command.excercise;

import java.util.Stack;

public class TextEditor {
    private final Stack<TextEditorCommand> commandsHistory;

    public TextEditor() {
        commandsHistory = new Stack<>();
    }

    public void execute(TextEditorCommand command) {
        command.execute();
        commandsHistory.push(command);
    }
}
