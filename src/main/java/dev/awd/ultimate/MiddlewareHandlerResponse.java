package dev.awd.ultimate;

public class MiddlewareHandlerResponse {
    private final String body;
    private final boolean isSucceededABoolean;

    public MiddlewareHandlerResponse(String body, boolean isSucceededABoolean) {
        this.body = body;
        this.isSucceededABoolean = isSucceededABoolean;
    }

    public String getBody() {
        return body;
    }

    public boolean isSucceeded() {
        return isSucceededABoolean;
    }
}
