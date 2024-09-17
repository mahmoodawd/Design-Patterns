package dev.awd.creational.factory.exercise;

public class TwoFactorAuthentication implements Authentication {
    @Override
    public void authenticate() {
        System.out.println("Two-Factor Authentication");
    }
}
