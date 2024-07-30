package dev.awd.ultimate;

public class ThirdPartyMessageHandlerAPI {
    public String processMessage(String message) {
        System.out.println("processMessage: " + message);
        return message + "is processed Successfully";
    }
}
