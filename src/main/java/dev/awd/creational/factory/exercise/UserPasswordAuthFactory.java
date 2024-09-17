package dev.awd.creational.factory.exercise;

public class UserPasswordAuthFactory implements AuthenticationFactory {
    @Override
    public Authentication createAuthentication() {
        return new UserPasswordAuthentication();
    }
}
