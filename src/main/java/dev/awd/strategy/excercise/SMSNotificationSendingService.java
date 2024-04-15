package dev.awd.strategy.excercise;

public class SMSNotificationSendingService implements NotificationSendingService {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Sending SMS: " + message + " to " + user.getEmail());
    }
}
