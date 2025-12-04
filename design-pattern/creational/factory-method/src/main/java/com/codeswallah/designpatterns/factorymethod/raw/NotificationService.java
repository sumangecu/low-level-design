package com.codeswallah.designpatterns.factorymethod.raw;

public class NotificationService {
    public void sendNotification(String message) {
        EmailNotification email = new EmailNotification();
        email.send(message);

        SMSNotification sms = new SMSNotification();
        sms.send(message);
    }

    public void sendNotification(String type, String message) {

//        if ("EMAIL".equals(type)) {
//            EmailNotification email = new EmailNotification();
//            email.send(message);
//        } else if ("SMS".equals(type)) {
//            SMSNotification sms = new SMSNotification();
//            sms.send(message);
//        }

        Notification notification = NotificationFactory.createNotification(type);
        notification.send(message);
    }

}
