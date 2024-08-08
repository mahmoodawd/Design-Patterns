package dev.awd;


import dev.awd.creational.singleton.exercise.SessionManager;

public class Main {
    public static void main(String[] args) {
        SessionManager sessionManager = SessionManager.getInstance();
        System.out.println(sessionManager.createSession("Ahmed258").id());
        sessionManager.createSession("Ali558");
        sessionManager.createSession("Khalid093");

    }
}