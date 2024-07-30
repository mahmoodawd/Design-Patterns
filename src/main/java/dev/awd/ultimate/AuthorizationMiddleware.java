package dev.awd.ultimate;

public class AuthorizationMiddleware extends AbstractMiddlewareHandler {
    @Override
    public HttpResponse handle(HttpRequest request) {
        System.out.println("Checking Authorization......");
        if (!request.getUser().isAuthenticated()) {
            return new HttpResponse(request.getUser().username() + " Not Authorized", false);
        }
        return super.handle(request);
    }
}
