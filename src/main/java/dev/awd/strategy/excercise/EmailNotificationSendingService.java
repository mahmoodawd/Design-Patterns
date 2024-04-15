package dev.awd.strategy.excercise;

public class EmailNotificationSendingService implements NotificationSendingService {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Sending Email: " + message + " to " + user.getEmail());
    }
}
