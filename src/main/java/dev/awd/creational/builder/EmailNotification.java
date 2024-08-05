package dev.awd.creational.builder;

import java.util.List;

public class EmailNotification {
    private final String content;
    private final String sender;
    private final String recipient;
    private final String timeStamp;
    private final List<String> attachments;

    EmailNotification(EmailNotificationBuilder builder) {
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

    public static class EmailNotificationBuilder implements NotificationBuilder {
        private String content;
        private String sender;
        private String recipient;
        private String timeStamp;
        private List<String> attachments;

        @Override
        public EmailNotificationBuilder setContent(String content) {
            this.content = content;
            return this;
        }

        @Override
        public EmailNotificationBuilder setSender(String sender) {
            this.sender = sender;
            return this;
        }

        @Override
        public EmailNotificationBuilder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        @Override
        public EmailNotificationBuilder setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public EmailNotificationBuilder setAttachments(List<String> attachments) {
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

        public EmailNotification build() {
            return new EmailNotification(this);
        }
    }

}
