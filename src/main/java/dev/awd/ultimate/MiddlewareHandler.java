package dev.awd.ultimate;


public interface MiddlewareHandler {

    MiddlewareHandler setNext(MiddlewareHandler middlewareHandler);

    MiddlewareHandlerResponse handle(HttpRequest request);

}
