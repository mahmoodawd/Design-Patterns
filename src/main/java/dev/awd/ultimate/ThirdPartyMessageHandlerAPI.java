package dev.awd.ultimate;

public class ThirdPartyMessageHandlerAPI implements MessageHandlerApi {
    @Override
    public String handleMessage(String message) {
        System.out.println("processMessage: " + message);
        return message + "is processed Successfully";
    }


}
