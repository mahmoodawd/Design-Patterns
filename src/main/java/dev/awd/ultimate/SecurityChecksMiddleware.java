package dev.awd.ultimate;

public class SecurityChecksMiddleware extends AbstractMiddlewareHandler {
    @Override
    public HttpResponse handle(HttpRequest request) {
        System.out.println("Security Checks......");
        if (!request.getUser().hasPassedSecurityChecks()) {
            return new HttpResponse(request.getUser().username() + " Failed To pass Security Checks", false);
        }
        return super.handle(request);
    }
}
