package dev.awd.creational.factory.exercise;

public class AuthManager {
    private final AuthenticationFactory factory;

    public AuthManager(AuthenticationFactory factory) {
        this.factory = factory;
    }

    public Authentication getAuthentication() {
        return factory.createAuthentication();
    }
}
