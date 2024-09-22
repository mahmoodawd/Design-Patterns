package dev.awd.ultimate;

import java.util.Map;

public class MessageController {
    private final static Logger logger = Logger.getLogger();
    private final static String TAG = MessageController.class.getName();
    private final MiddlewareHandler middlewareHandler;
    private final MessageServiceFacade messageServiceFacade;

    public MessageController(MiddlewareHandler middlewareHandler, MessageServiceFacade messageServiceFacade) {
        this.middlewareHandler = middlewareHandler;
        this.messageServiceFacade = messageServiceFacade;
    }

    public HttpResponse handleMessage(HttpRequest request) {
        MiddlewareHandlerResponse middlewareResponse = middlewareHandler.handle(request);
        logger.info(TAG, middlewareResponse.getBody());
        if (!middlewareResponse.isSucceeded()) {
            logger.error(MessageController.class.getName(), "An error occurred while handling request using middleware: " + middlewareResponse.getBody());
            return new HttpResponse.HttpResponseBuilder()
                    .setHasError()
                    .setErrorMessage("Couldn't proceed: " + middlewareResponse.getBody())
                    .setStatusCode(404)
                    .setHeadersMap(Map.of("content-type", "application/json"))
                    .build();
        }
        String handlerResponse = messageServiceFacade.handle(request.getBody());

        logger.info(TAG, "Message handled successfully: " + handlerResponse);
        return new HttpResponse.HttpResponseBuilder()
                .setStatusCode(200)
                .setHeadersMap(Map.of("content-type", "application/json"))
                .setBody(handlerResponse)
                .build();
    }
}
