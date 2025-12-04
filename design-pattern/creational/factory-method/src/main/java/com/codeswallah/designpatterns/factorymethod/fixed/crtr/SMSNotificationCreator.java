package com.codeswallah.designpatterns.factorymethod.fixed.crtr;

import com.codeswallah.designpatterns.factorymethod.fixed.notif.Notification;
import com.codeswallah.designpatterns.factorymethod.fixed.notif.SMSNotification;

public class SMSNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
