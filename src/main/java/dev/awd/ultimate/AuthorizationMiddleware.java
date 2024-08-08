package dev.awd.ultimate;

public class AuthorizationMiddleware extends AbstractMiddlewareHandler {
    @Override
    public HttpResponse handle(HttpRequest request) {
        System.out.println("Checking Authorization......");
        if (!request.getUser().isAuthenticated()) {
            return new HttpResponse.HttpResponseBuilder()
                    .setBody(request.getUser().username() + " Not Authorized")
                    .setHasError()
                    .build();
        }
        return super.handle(request);
    }
}
