package dev.awd.ultimate;

import java.util.Map;

public class MessageController {
    private final MiddlewareHandler middlewareHandler;
    private final MessageServiceFacade messageServiceFacade;
    private final static Logger logger = Logger.getLogger(MessageController.class.getName());

    public MessageController(MiddlewareHandler middlewareHandler, MessageServiceFacade messageServiceFacade) {
        this.middlewareHandler = middlewareHandler;
        this.messageServiceFacade = messageServiceFacade;
    }

    public HttpResponse handleMessage(HttpRequest message) {
        HttpResponse middlewareResponse = middlewareHandler.handle(message);

        if (middlewareResponse.isHasError()) {
            logger.error("an error occurred while handling message");
            return new HttpResponse.HttpResponseBuilder()
                    .setHasError()
                    .setErrorMessage("Request Failed")
                    .setStatusCode(404)
                    .setHeadersMap(Map.of("content-type", "application/json"))
                    .build();
        }
        String handlerResponse = messageServiceFacade.handle(message.getBody());
        logger.info("Message handled: " + handlerResponse);
        return new HttpResponse.HttpResponseBuilder()
                .setStatusCode(200)
                .setBody(handlerResponse)
                .build();
    }
}
