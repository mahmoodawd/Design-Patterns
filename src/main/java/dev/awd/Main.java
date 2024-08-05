package dev.awd;


import dev.awd.creational.builder.*;

public class Main {
    public static void main(String[] args) {

        SlackNotification slackNotification = new SlackNotificationBuilder()
                .setContent("This is a slack notification")
                .setSender("mahmoodawd@gmail.com")
                .setRecipient("mahmoodyousif@gmail.com")
                .setTimeStamp("2024-01-01 12:00:00")
                .build();
        MessageNotification messageNotification = new MessageNotificationBuilder()
                .setContent("This is a message notification")
                .setSender("me")
                .setRecipient("him")
                .build();

        //Using Nested Classes
        EmailNotification emailNotification = new EmailNotification.EmailNotificationBuilder()
                .setContent("This is an email notification")
                .setSender("me")
                .setRecipient("him")
                .build();


        System.out.println(slackNotification.getContent());
        System.out.println(messageNotification.getContent());
        System.out.println(emailNotification.getContent());
    }
}