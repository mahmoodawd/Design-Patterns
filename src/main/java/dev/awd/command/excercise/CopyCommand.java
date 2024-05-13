package dev.awd.command.excercise;

public class CopyCommand implements TextEditorCommand {
    private String content;

    public CopyCommand(String content) {
        this.content = content;
    }

    @Override
    public void execute() {

        System.out.println(content + " Copied to Clipboard");
    }
}
