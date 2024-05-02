package dev.awd.ultimate;


public class AuthenticationMiddleware extends AbstractMiddlewareHandler {
    @Override
    public HttpResponse handle(HttpRequest request) {
        System.out.println("Checking Authentication......");
        if (!request.getUser().isAuthenticated()) {
            return new HttpResponse(request.getUser().getUsername() + " Not Authenticated", false);
        }
        return super.handle(request);
    }
}
