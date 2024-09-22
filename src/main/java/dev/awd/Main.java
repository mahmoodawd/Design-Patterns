package dev.awd;

import dev.awd.ultimate.*;

public class Main {
    private static final Logger logger = Logger.getLogger();

    public static void main(String[] args) {
        MiddlewareHandler authorizationMiddleware = new AuthorizationMiddleware();
        authorizationMiddleware.setNext(new AuthenticationMiddleware()).setNext(new SecurityChecksMiddleware());

        HttpResponse response = getHttpResponse(authorizationMiddleware);
        logger.info(Main.class.getName(), "=================RESPONSE=================");
        System.out.println(response.isHasError() ? response.getErrorMessage() : response.getBody());

    }

    private static HttpResponse getHttpResponse(MiddlewareHandler middleware) {
        MessageCachingProxy cachingProxy = new MessageCachingProxy();
        MessageRepository mongoRepo = new MongoDbMessageRepo();
        MessageAnalysisService analysisService = new MessageAnalysisService();

        MessageServiceFacade serviceFacade = new MessageServiceFacade(cachingProxy, mongoRepo, analysisService);
        MessageController messageController = new MessageController(middleware, serviceFacade);

        User mahmood = new User("mahmoud", true, true, true);
        HttpRequest request = new HttpRequest(RequestType.GET, "Dummy message body, PlainText-Type", mahmood);

        return messageController.handleMessage(request);
    }
}
