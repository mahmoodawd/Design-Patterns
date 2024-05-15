package dev.awd.behavioral.mediator;

public interface ChatMediator {

    void sendDirectMessage(String message, User fromUser, User toUser);

    void sendGroupMessage(String message, User user, String groupName);

    void registerUserToGroup(User user, String groupName);
}
