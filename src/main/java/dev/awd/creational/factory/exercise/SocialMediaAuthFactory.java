package dev.awd.creational.factory.exercise;

public class SocialMediaAuthFactory implements AuthenticationFactory {
    @Override
    public Authentication createAuthentication() {
        return new SocialMediaAuthentication();
    }
}
