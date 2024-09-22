package dev.awd.ultimate;

public abstract class AbstractMessageFormatter implements MessageFormatter {

    @Override
    public String formatMessage(String messageToFormat) {
        validateMessage();
        checkMessageSize();
        return this.format(messageToFormat);
    }


    private void validateMessage() {
        System.out.println("Validating Message....");
    }

    private void checkMessageSize() {
        System.out.println("Checking Message Size....");
    }

    protected abstract String format(String messageToFormat);
}
