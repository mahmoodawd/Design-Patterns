package dev.awd.ultimate;

import java.util.Map;

public final class HttpResponse {
    private final String body;
    private final String errorMessage;
    private final boolean hasError;
    private final int statusCode;
    private final Map<String, String> headers;

    public HttpResponse(HttpResponseBuilder builder) {
        this.body = builder.body;
        this.errorMessage = builder.errorMessage;
        this.hasError = builder.hasError;
        this.statusCode = builder.statusCode;
        this.headers = builder.headers;
    }

    public String getBody() {
        return body;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean isHasError() {
        return hasError;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public static class HttpResponseBuilder {
        private String body;
        private String errorMessage;
        private boolean hasError;
        private int statusCode;
        private Map<String, String> headers;

        public HttpResponseBuilder setBody(String errorMessage) {
            this.body = body;
            return this;
        }

        public HttpResponseBuilder setHasError() {
            this.hasError = true;
            return this;
        }

        public HttpResponseBuilder setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public HttpResponseBuilder setStatusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public HttpResponseBuilder setHeadersMap(Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        public HttpResponse build() {
            return new HttpResponse(this);
        }
    }
}
