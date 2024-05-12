package dev.awd;

import dev.awd.mediator.ChatManagement;
import dev.awd.mediator.ChatMediator;
import dev.awd.mediator.User;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatManagement = new ChatManagement();

        User mahmoud = new User("Mahmoud", chatManagement);
        User ali = new User("Ali", chatManagement);
        User khaled = new User("Khaled", chatManagement);

        chatManagement.registerUserToGroup(mahmoud, "Friends");
        chatManagement.registerUserToGroup(ali, "Friends");
        chatManagement.registerUserToGroup(khaled, "Friends");

        mahmoud.sendGroupMessage("Hello Everyone", "Friends");

    }
}