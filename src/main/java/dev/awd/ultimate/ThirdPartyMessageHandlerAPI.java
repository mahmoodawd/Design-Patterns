package dev.awd.ultimate;

public class ThirdPartyMessageHandlerAPI implements MessageHandlerApi {
    @Override
    public String handleMessage(String message) {
        Logger.getLogger().info(ThirdPartyMessageHandlerAPI.class.getName(), "processMessage: " + message);
        return message + " is processed Successfully";
    }


}
