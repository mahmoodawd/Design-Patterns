package dev.awd.strategy.excercise;

public class NotificationManager implements NotificationSendingService {
    private NotificationSendingService notificationSendingService;

    public NotificationManager(NotificationSendingService notificationSendingService) {
        this.notificationSendingService = notificationSendingService;
    }

    @Override
    public void sendNotification(User user, String message) {
        notificationSendingService.sendNotification(user, message);
    }
}
