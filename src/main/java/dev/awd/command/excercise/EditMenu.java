package dev.awd.command.excercise;

import java.util.HashMap;
import java.util.Map;

public class EditMenu {
    Map<String, TextEditorCommand> menuItemTitle;

    public EditMenu() {
        menuItemTitle = new HashMap<String, TextEditorCommand>();
    }

    public void setShortcut(String menuItem, TextEditorCommand command) {
        menuItemTitle.put(menuItem, command);
    }

    public void performClick(String shortcutKey) {
        menuItemTitle.get(shortcutKey).execute();
    }
}
