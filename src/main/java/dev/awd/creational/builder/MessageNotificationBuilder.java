package dev.awd.creational.builder;

import java.util.List;

public class MessageNotificationBuilder implements NotificationBuilder {
    private String content;
    private String sender;
    private String recipient;
    private String timeStamp;
    private List<String> attachments;

    @Override
    public MessageNotificationBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public MessageNotificationBuilder setSender(String sender) {
        this.sender = sender;
        return this;
    }

    @Override
    public MessageNotificationBuilder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    @Override
    public MessageNotificationBuilder setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    public MessageNotificationBuilder setAttachments(List<String> attachments) {
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

    public MessageNotification build() {
        return new MessageNotification(this);
    }
}
