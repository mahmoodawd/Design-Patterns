package dev.awd.behavioral.chainofresponsibility.excercise;

public abstract class AbstractMiddlewareHandler implements MiddlewareHandler {
    protected MiddlewareHandler next;


    @Override
    public MiddlewareHandler setNext(MiddlewareHandler handler) {
        this.next = handler;
        return handler;
    }

    @Override
    public Response handle(Request request) {
        if (next != null) {
            return next.handle(request);
        }
        return new Response("Passed", true);
    }
}
