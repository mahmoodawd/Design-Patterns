package dev.awd.chainofresponsibility;

public class Response {
    private final String body;
    private final boolean isSucceededABoolean;

    public Response(String body, boolean isSucceededABoolean) {
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
