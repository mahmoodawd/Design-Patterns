package dev.awd.behavioral.chainofresponsibility;

public interface MiddlewareHandler {

    MiddlewareHandler setNext(MiddlewareHandler middlewareHandler);

    Response handle(Request request);

}
