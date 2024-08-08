package dev.awd.creational.singleton.exercise;

import java.util.HashMap;
import java.util.Map;

public class SessionManager {
    private static SessionManager instance;
    private static Map<String, Session> userSessions;

    private SessionManager() {
        userSessions = new HashMap<>();
    }

    public static SessionManager getInstance() {
        if (instance == null) {
            synchronized (SessionManager.class) {
                if (instance == null) {
                    instance = new SessionManager();
                }
            }
        }
        return instance;
    }

    public Session createSession(String userId) {
        String sessionId = genSessionId(userId);
        Session session = new Session(sessionId);
        userSessions.put(userId, session);
        return session;
    }

    private String genSessionId(String userId) {
        return userId + "_" + System.currentTimeMillis();
    }

}
