package com.codeswallah.designpatterns.factorymethod.fixed.crtr;

import com.codeswallah.designpatterns.factorymethod.fixed.notif.EmailNotification;
import com.codeswallah.designpatterns.factorymethod.fixed.notif.Notification;

public class EmailNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
