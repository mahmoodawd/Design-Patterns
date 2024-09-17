package dev.awd;

import dev.awd.creational.factory.exercise.AuthManager;
import dev.awd.creational.factory.exercise.Authentication;
import dev.awd.creational.factory.exercise.UserPasswordAuthFactory;

public class Main {
    public static void main(String[] args) {
        AuthManager authManager = new AuthManager(new UserPasswordAuthFactory());

        Authentication authentication = authManager.getAuthentication();
        authentication.authenticate();


    }
}
