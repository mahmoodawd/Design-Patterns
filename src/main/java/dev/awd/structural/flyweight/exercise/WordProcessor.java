package dev.awd.structural.flyweight.exercise;

public class WordProcessor {
    public void renderText(String text, Font font, Color color, int x, int y) {

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            TextElement element = TextElementFactory.getTextElement(c, font, color);
            element.render(x + i * font.size(), y);
        }
    }

}
