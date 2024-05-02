package dev.awd;

import dev.awd.chainofresponsibility.*;

public class Main {
    public static void main(String[] args) {

        MiddlewareHandler authentication = new AuthenticationMiddleware();
        MiddlewareHandler authorization = new AuthorizationMiddleware();
        MiddlewareHandler securityChecks = new SecurityChecksMiddleware();

        authentication.setNext(authorization).setNext(securityChecks);

        RequestProcessor requestProcessor = new RequestProcessor(authentication);
        Request request = new Request(RequestType.GET, false, true, false);
        Response response = requestProcessor.processRequest(request);
        System.out.println(response.isSucceeded() + ": " + response.getBody());
    }
}