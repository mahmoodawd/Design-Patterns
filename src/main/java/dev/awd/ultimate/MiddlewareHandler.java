package dev.awd.ultimate;


public interface MiddlewareHandler {

    MiddlewareHandler setNext(MiddlewareHandler middlewareHandler);

    HttpResponse handle(HttpRequest request);

}
