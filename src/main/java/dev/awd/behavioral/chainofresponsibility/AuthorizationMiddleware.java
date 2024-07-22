package dev.awd.behavioral.chainofresponsibility;

public class AuthorizationMiddleware extends AbstractMiddlewareHandler {
    @Override
    public Response handle(Request request) {
        System.out.println("Checking Authorization......");
        if (!request.isAuthorized()) {
            return new Response("Not Authorized", false);        }
        return super.handle(request);
    }
}
