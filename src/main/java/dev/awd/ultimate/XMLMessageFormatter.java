package dev.awd.ultimate;

public class XMLMessageFormatter extends AbstractMessageFormatter {
    @Override
    public String format(String messageToFormat) {
        return "Formatting XML: " + messageToFormat;
    }

    @Override
    public String getType() {
        return MessageFormat.XML;
    }
}
