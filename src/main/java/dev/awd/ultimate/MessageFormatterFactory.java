package dev.awd.ultimate;

public class MessageFormatterFactory {
    public static MessageFormatter getMessageFormatter(String message) {

        if (message.contains(MessageFormat.PLAIN_TEXT)) {
            return new PlainTextMessageFormatter();
        } else if (message.contains(MessageFormat.XML)) {
            return new XMLMessageFormatter();
        } else if (message.contains(MessageFormat.JSON)) {
            return new JsonMessageFormatter();
        }
        throw new IllegalArgumentException("Unknown message: " + message);
    }
}
