package dev.awd.creational.builder;

import java.util.List;

public class SlackNotificationBuilder implements NotificationBuilder {
    private String content;
    private String sender;
    private String recipient;
    private String timeStamp;
    private List<String> attachments;

    @Override
    public SlackNotificationBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public SlackNotificationBuilder setSender(String sender) {
        this.sender = sender;
        return this;
    }

    @Override
    public SlackNotificationBuilder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    @Override
    public SlackNotificationBuilder setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    public SlackNotificationBuilder setAttachments(List<String> attachments) {
        this.attachments = attachments;
        return this;
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

    public SlackNotification build() {
        return new SlackNotification(this);
    }
}
