package dev.awd.ultimate;

public class SecurityChecksMiddleware extends AbstractMiddlewareHandler {
    @Override
    public MiddlewareHandlerResponse handle(HttpRequest request) {
        System.out.println("Security Checks......");
        if (!request.getUser().hasPassedSecurityChecks()) {
            return new MiddlewareHandlerResponse(" Failed To pass Security Checks", false);
        }
        return super.handle(request);
    }
}
