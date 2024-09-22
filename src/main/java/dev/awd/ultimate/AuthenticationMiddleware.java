package dev.awd.ultimate;


public class AuthenticationMiddleware extends AbstractMiddlewareHandler {
    @Override
    public MiddlewareHandlerResponse handle(HttpRequest request) {
        System.out.println("Checking Authentication......");
        if (!request.getUser().isAuthenticated()) {
            return new MiddlewareHandlerResponse(" Not Authenticated", false);
        }
        return super.handle(request);
    }
}
