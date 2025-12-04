package com.codeswallah.dessignpatterns.factorymethod.fixed.crtr;

import com.codeswallah.designpatterns.factorymethod.fixed.notif.Notification;

public abstract class NotificationCreator {
    public abstract Notification createNotification();

    public void sendNotification(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}
