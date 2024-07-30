package dev.awd.ultimate;

public class MessageController {
    private final MiddlewareHandler middlewareHandler;
    private final MessageServiceFacade messageServiceFacade;

    public MessageController(MiddlewareHandler middlewareHandler, MessageServiceFacade messageServiceFacade) {
        this.middlewareHandler = middlewareHandler;
        this.messageServiceFacade = messageServiceFacade;
    }

    public boolean handleMessage(HttpRequest message) {
        HttpResponse middlewareResponse = middlewareHandler.handle(message);
        if (!middlewareResponse.isSucceeded()) {
            return  false;
        }
        String handlerResponse = messageServiceFacade.handle(message.getBody());
        return true;
    }
}
