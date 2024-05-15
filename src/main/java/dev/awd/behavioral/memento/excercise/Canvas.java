package dev.awd.behavioral.memento.excercise;

public class Canvas {
    private String content;
    private String color;
    private String border;

    public void restore(CanvasState state) {
        content = state.getContent();
        color = state.getColor();
        border = state.getBorder();
    }

    public CanvasState save() {
        return new CanvasState(content, color, border);
    }

    public Canvas() {
        this.content = "";
        this.color = "";
        this.border = "";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }
}
