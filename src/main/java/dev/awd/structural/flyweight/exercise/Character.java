package dev.awd.structural.flyweight.exercise;

public class Character implements TextElement {
    char character;
    private Font font;
    private Color color;

    public Character(char character, Font font, Color color) {
        this.character = character;
        this.font = font;
        this.color = color;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void render(int x, int y) {
        System.out.println("Rendering Character at position: " + x + ", " + y);
    }
}
