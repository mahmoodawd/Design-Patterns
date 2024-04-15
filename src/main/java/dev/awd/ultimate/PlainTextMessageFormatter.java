package dev.awd.ultimate;

public class PlainTextMessageFormatter extends AbstractMessageFormatter {
    @Override
    public String format(String messageToFormat) {
        return "Formatting Plain Text: " + messageToFormat;
    }

    @Override
    public String getType() {
        return "PlainText-Type";
    }
}
