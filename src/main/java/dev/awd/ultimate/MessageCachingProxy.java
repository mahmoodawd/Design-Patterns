package dev.awd.ultimate;

import java.util.HashMap;
import java.util.Map;

public class MessageCachingProxy implements MessageHandlerApi {
    private final MessageHandlerApi api;
    private Map<String, String> cache;

    public MessageCachingProxy() {
        api = new ThirdPartyMessageHandlerAPI();
        cache = new HashMap<>();
    }


    @Override
    public String handleMessage(String message) {
        if (cache.containsKey(message)) {
            return cache.get(message);
        }
        String handleMessage = api.handleMessage(message);
        cache.put(message, handleMessage);
        return handleMessage;
    }
}

