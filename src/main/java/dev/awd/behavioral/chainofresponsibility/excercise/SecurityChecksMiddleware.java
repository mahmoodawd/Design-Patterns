package dev.awd.behavioral.chainofresponsibility.excercise;

public class SecurityChecksMiddleware extends AbstractMiddlewareHandler {
    @Override
    public Response handle(Request request) {
        System.out.println("Security Check......");
        if (!request.isHasPassedSecurityChecks()) {
            return new Response("Failed to pass Security Checks", false);
        }
        return super.handle(request);
    }
}
