package dev.awd.ultimate;

public class HttpResponse {
    private final String body;
    private final boolean isSucceeded;

    public HttpResponse(String body, boolean isSucceeded) {
        this.body = body;
        this.isSucceeded = isSucceeded;
    }

    public String getBody() {
        return body;
    }

    public boolean isSucceeded() {
        return isSucceeded;
    }
}
