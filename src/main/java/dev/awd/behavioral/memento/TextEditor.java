package dev.awd.behavioral.memento;

public class TextEditor {

    private String content;


    public TextEditor() {
        this.content = "";

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public TextEditorState save() {
        return new TextEditorState(content);
    }

    public void restore(TextEditorState textEditorState) {
        content = textEditorState.getContent();
    }


}
