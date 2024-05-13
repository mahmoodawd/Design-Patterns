package dev.awd.command.excercise;

import java.util.HashMap;
import java.util.Map;

public class KeyboardShortcut {
    Map<String, TextEditorCommand> shortcuts;

    public KeyboardShortcut() {
        shortcuts = new HashMap<String, TextEditorCommand>();
    }

    public void setShortcut(String shortcutKey, TextEditorCommand command) {
        shortcuts.put(shortcutKey, command);
    }

    public void fire(String shortcutKey) {
        shortcuts.get(shortcutKey).execute();
    }
}
