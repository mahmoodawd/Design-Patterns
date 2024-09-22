package dev.awd.ultimate;


public abstract class AbstractMiddlewareHandler implements MiddlewareHandler {
    protected MiddlewareHandler next;


    @Override
    public MiddlewareHandler setNext(MiddlewareHandler handler) {
        this.next = handler;
        return next;
    }

    @Override
    public MiddlewareHandlerResponse handle(HttpRequest request) {
        if (next != null) {
            next.handle(request);
        }
        return new MiddlewareHandlerResponse("Request successfully passed all middlewares", true);
    }
}
