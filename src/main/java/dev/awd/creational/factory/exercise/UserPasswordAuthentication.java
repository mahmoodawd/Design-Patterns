package dev.awd.creational.factory.exercise;

public class UserPasswordAuthentication implements Authentication {
    @Override
    public void authenticate() {
        System.out.println("UserPassword Authentication");
    }
}
