package dev.awd.ultimate;


public abstract class AbstractMiddlewareHandler implements MiddlewareHandler {
    protected MiddlewareHandler next;


    @Override
    public MiddlewareHandler setNext(MiddlewareHandler handler) {
        this.next = handler;
        return handler;
    }

    @Override
    public HttpResponse handle(HttpRequest request) {
        if (next != null) {
            return next.handle(request);
        }
        return new HttpResponse.HttpResponseBuilder().setBody("Passed").setStatusCode(200).build();
    }
}
