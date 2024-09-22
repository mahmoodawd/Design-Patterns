package dev.awd.ultimate;


public class HttpRequest {
    private final User user;
    private RequestType type;
    private String body;


    public HttpRequest(RequestType type, String body, User user) {
        this.type = type;
        this.body = body;
        this.user = user;
    }

    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getUser() {
        return user;
    }
}


