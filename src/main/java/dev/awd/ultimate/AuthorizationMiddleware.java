package dev.awd.ultimate;

public class AuthorizationMiddleware extends AbstractMiddlewareHandler {
    @Override
    public MiddlewareHandlerResponse handle(HttpRequest request) {
        System.out.println("Checking Authorization......");
        if (!request.getUser().isAuthorized()) {
            return new MiddlewareHandlerResponse(" Not Authorized", false);
        }
        return super.handle(request);
    }
}
