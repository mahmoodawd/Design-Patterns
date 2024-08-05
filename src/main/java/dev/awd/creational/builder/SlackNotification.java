package dev.awd.creational.builder;

import java.util.List;

public class SlackNotification {
    private final String content;
    private final String sender;
    private final String recipient;
    private final String timeStamp;
    private final List<String> attachments;

    SlackNotification(SlackNotificationBuilder builder) {
        this.content = builder.getContent();
        this.sender = builder.getSender();
        this.recipient = builder.getRecipient();
        this.timeStamp = builder.getTimeStamp();
        this.attachments = builder.getAttachments();
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public List<String> getAttachments() {
        return attachments;
    }
}
