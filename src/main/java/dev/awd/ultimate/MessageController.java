package dev.awd.ultimate;

import java.util.Map;

public class MessageController {
    private final MiddlewareHandler middlewareHandler;
    private final MessageServiceFacade messageServiceFacade;

    public MessageController(MiddlewareHandler middlewareHandler, MessageServiceFacade messageServiceFacade) {
        this.middlewareHandler = middlewareHandler;
        this.messageServiceFacade = messageServiceFacade;
    }

    public HttpResponse handleMessage(HttpRequest message) {
        HttpResponse middlewareResponse = middlewareHandler.handle(message);
        if (middlewareResponse.isHasError()) {
            return new HttpResponse.HttpResponseBuilder()
                    .setHasError()
                    .setErrorMessage("Request Failed")
                    .setStatusCode(404)
                    .setHeadersMap(Map.of("content-type", "application/json"))
                    .build();
        }
        String handlerResponse = messageServiceFacade.handle(message.getBody());
        return new HttpResponse.HttpResponseBuilder()
                .setStatusCode(200)
                .setBody(handlerResponse)
                .build();
    }
}
