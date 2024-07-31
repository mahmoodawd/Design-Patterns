package dev.awd;


import dev.awd.structural.proxy.exercise.StreamingService;
import dev.awd.structural.proxy.exercise.User;
import dev.awd.structural.proxy.exercise.VideoStreamingProxy;

public class Main {
    public static void main(String[] args) {
        User user = new User("Mahmood");
        user.subscribe("DP101");
        StreamingService streamingService = new VideoStreamingProxy(user);

        streamingService.startStream("Java202");

    }
}