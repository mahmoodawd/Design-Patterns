package dev.awd.behavioral.strategy.excercise;

public class SlackNotificationService implements NotificationSendingService {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Sending Slack Message: " + message + "to " + user.getEmail());
    }
}
