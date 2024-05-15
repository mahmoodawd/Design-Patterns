package dev.awd;

import dev.awd.behavioral.command.excercise.CopyCommand;
import dev.awd.behavioral.command.excercise.DeleteCommand;
import dev.awd.behavioral.command.excercise.TextEditor;

public class Main {
    public static void main(String[] args) {
        String fileContent = "This is the file content regarding the command design pattern exercise";

        TextEditor textEditor = new TextEditor();

        textEditor.execute(new CopyCommand(fileContent));
        textEditor.execute(new DeleteCommand(fileContent));

    }
}