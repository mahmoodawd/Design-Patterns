package dev.awd.ultimate;

public class MessageController {
    private final MiddlewareHandler middlewareHandler;

    public MessageController(MiddlewareHandler middlewareHandler) {
        this.middlewareHandler = middlewareHandler;
    }

    public boolean handleMessage(HttpRequest message) {
        return middlewareHandler.handle(message).isSucceeded();
    }
}
