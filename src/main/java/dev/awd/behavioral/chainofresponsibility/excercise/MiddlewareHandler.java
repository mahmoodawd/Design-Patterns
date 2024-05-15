package dev.awd.behavioral.chainofresponsibility.excercise;

public interface MiddlewareHandler {

    MiddlewareHandler setNext(MiddlewareHandler middlewareHandler);

    Response handle(Request request);

}
