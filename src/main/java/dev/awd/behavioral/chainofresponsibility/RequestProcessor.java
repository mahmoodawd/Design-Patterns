package dev.awd.behavioral.chainofresponsibility;

public class RequestProcessor {
    private final MiddlewareHandler requestMiddlewareHandlerChain;

    public RequestProcessor(MiddlewareHandler requestMiddlewareHandlerChain) {
        this.requestMiddlewareHandlerChain = requestMiddlewareHandlerChain;
    }

    public Response processRequest(Request request) {
        return requestMiddlewareHandlerChain.handle(request);
    }

}
