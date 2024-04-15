package dev.awd.ultimate;

public class JsonMessageFormatter extends AbstractMessageFormatter {
    @Override
    public String format(String messageToFormat) {
        return "Formatting JSON: " + messageToFormat;
    }

    @Override
    public String getType() {
        return "JSON-Type";
    }
}
