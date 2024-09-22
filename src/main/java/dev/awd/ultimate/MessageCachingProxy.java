package dev.awd.ultimate;

import java.util.HashMap;
import java.util.Map;

public class MessageCachingProxy implements CachingProxy {
    private final MessageHandlerApi api;
    private final Map<String, String> cache;

    public MessageCachingProxy() {
        api = new ThirdPartyMessageHandlerAPI();
        cache = new HashMap<>();
    }


    @Override
    public String handleMessage(String message) {
        if (cache.containsKey(message)) {
            return cache.get(message);
        }
        String handledMessage = api.handleMessage(message);
        cache.put(message, handledMessage);
        return handledMessage;
    }
}

