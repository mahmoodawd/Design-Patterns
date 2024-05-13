package dev.awd.command.excercise;

public class CutCommand implements TextEditorCommand {
    private String content;

    public CutCommand(String content) {
        this.content = content;
    }

    @Override
    public void execute() {

        System.out.println(content + " is being Cut");
    }
}
