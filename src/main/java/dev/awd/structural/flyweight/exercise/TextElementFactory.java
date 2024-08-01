package dev.awd.structural.flyweight.exercise;

import java.util.HashMap;
import java.util.Map;

public class TextElementFactory {
    private static final Map<String, TextElement> cachedTextElements = new HashMap<String, TextElement>();


    private TextElementFactory() {

    }

    public static TextElement getTextElement(char character, Font font, Color color) {
        String key = character + "_" + font.toString() + "_" + color.name();

        if (!cachedTextElements.containsKey(key)) {
            cachedTextElements.put(key, new Character(character, font, color));
        }
        return cachedTextElements.get(key);
    }
}
