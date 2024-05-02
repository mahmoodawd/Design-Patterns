package dev.awd.chainofresponsibility;

public class Request {
    private RequestType type;
    private String body;
    private boolean isAuthenticated;
    private boolean isAuthorized;
    private boolean hasPassedSecurityChecks;


    public Request(RequestType type, boolean isAuthenticated, boolean isAuthorized, boolean hasPassedSecurityChecks) {
        this.type = type;
        this.isAuthenticated = isAuthenticated;
        this.isAuthorized = isAuthorized;
        this.hasPassedSecurityChecks = hasPassedSecurityChecks;
    }

    public Request(String body) {
        this.type = RequestType.GET;
        this.body = body;
    }

    public Request(RequestType type, String body) {
        this.type = type;
        this.body = body;
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


    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public boolean isHasPassedSecurityChecks() {
        return hasPassedSecurityChecks;
    }
}


