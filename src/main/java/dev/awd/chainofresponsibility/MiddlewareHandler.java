package dev.awd.chainofresponsibility;

public interface MiddlewareHandler {

    MiddlewareHandler setNext(MiddlewareHandler middlewareHandler);

    Response handle(Request request);

}
