package dev.awd.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatManagement implements ChatMediator {
    private final Map<String, List<User>> groups;

    public ChatManagement() {
        this.groups = new HashMap<>();
    }

    @Override
    public void sendDirectMessage(String message, User fromUser, User toUser) {
        System.out.println(fromUser.getName() + " is sending: " + message + " to " + toUser.getName());
        toUser.receiveDirectMessage(message, fromUser);
    }

    @Override
    public void sendGroupMessage(String message, User fromUser, String groupName) {
        System.out.println(fromUser.getName() + " is sending: " + message + " to group: " + groupName);
        groups.get(groupName).forEach(user -> user.receiveGroupMessage(message, groupName, fromUser));
    }

    @Override
    public void registerUserToGroup(User user, String groupName) {
        if (!groups.containsKey(groupName)) {
            List<User> users = new ArrayList<>();
            groups.put(groupName, users);
        }
        groups.get(groupName).add(user);
        System.out.println("Group Size: " + groups.get(groupName).size());

    }
}
