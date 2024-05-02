package dev.awd.ultimate;

public class User {
    private String username;
    private boolean isAuthenticated;
    private boolean isAuthorized;
    private boolean hasPassedSecurityChecks;

    public User(String username, boolean isAuthenticated, boolean isAuthorized, boolean hasPassedSecurityChecks) {
        this.username = username;
        this.isAuthenticated = isAuthenticated;
        this.isAuthorized = isAuthorized;
        this.hasPassedSecurityChecks = hasPassedSecurityChecks;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public boolean isHasPassedSecurityChecks() {
        return hasPassedSecurityChecks;
    }
}
