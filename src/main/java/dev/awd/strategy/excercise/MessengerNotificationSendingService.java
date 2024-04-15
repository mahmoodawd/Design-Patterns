package dev.awd.strategy.excercise;

public class MessengerNotificationSendingService implements NotificationSendingService {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Sending Messenger Message: " + message + "to " + user.getEmail());
    }
}
