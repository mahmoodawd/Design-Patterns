package dev.awd.ultimate;

import dev.awd.behavioral.chainofresponsibility.RequestType;

public class HttpRequest {
    private RequestType type;
    private String body;
    private User user;


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


