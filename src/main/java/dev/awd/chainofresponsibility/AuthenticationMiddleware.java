package dev.awd.chainofresponsibility;

public class AuthenticationMiddleware extends AbstractMiddlewareHandler {
    @Override
    public Response handle(Request request) {
        System.out.println("Checking Authentication......");
        if (!request.isAuthenticated()) {
            return new Response("Not Authenticated", false);
        }
        return super.handle(request);
    }
}
