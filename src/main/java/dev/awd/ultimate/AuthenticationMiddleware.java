package dev.awd.ultimate;


public class AuthenticationMiddleware extends AbstractMiddlewareHandler {
    @Override
    public HttpResponse handle(HttpRequest request) {
        System.out.println("Checking Authentication......");
        if (!request.getUser().isAuthenticated()) {
            return new HttpResponse.HttpResponseBuilder().setBody(request.getUser().username() + " Not Authenticated").setHasError().build();
        }
        return super.handle(request);
    }
}
