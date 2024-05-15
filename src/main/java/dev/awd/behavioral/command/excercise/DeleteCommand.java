package dev.awd.behavioral.command.excercise;

public class DeleteCommand implements TextEditorCommand {
    private String content;

    public DeleteCommand(String content) {
        this.content = content;
    }

    @Override
    public void execute() {

        System.out.println(content + " Deleted");
    }
}
