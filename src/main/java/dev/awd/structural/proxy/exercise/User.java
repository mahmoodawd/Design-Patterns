package dev.awd.structural.proxy.exercise;

import java.util.HashSet;
import java.util.Set;

public class User {
    private final String name;
    private final Set<String> subscriptionList;

    public User(String name) {
        this.name = name;
        subscriptionList = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void subscribe(String mediaId) {
        subscriptionList.add(mediaId);
    }

    public boolean hasPermission(String mediaId) {
        return subscriptionList.contains(mediaId);
    }
}
