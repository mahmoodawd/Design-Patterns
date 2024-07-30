package dev.awd.ultimate;

public record User(String username, boolean isAuthenticated, boolean isAuthorized, boolean hasPassedSecurityChecks) {
}
