package dev.awd.mediator;

public class User {
    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendDirectMessage(String message, User user) {
        chatMediator.sendDirectMessage(message, this, user);
    }

    public void receiveDirectMessage(String message, User user) {
        System.out.println(name + " received: " + message + " from " + user.getName());
    }

    public void sendGroupMessage(String message, String groupName) {
        chatMediator.sendGroupMessage(message, this, groupName);
    }

    public void receiveGroupMessage(String message, String groupName, User user) {
        System.out.println(name + " received: " + message + " from " + user.getName() + " in " + groupName);
    }


}
