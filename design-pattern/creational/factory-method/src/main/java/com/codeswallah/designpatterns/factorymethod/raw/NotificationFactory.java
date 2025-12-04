package com.codeswallah.dessignpatterns.factorymethod.raw;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        return switch (type) {
            case "EMAIL" -> new EmailNotification();
            case "SMS" -> new SMSNotification();
            case "SLACK" -> new SlackNotification();
            default -> throw new RuntimeException("Unsupported type.");
        };
    }
}
