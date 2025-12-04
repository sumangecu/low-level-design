package com.codeswallah.designpatterns.factorymethod.fixed.crtr;

import com.codeswallah.designpatterns.factorymethod.fixed.notif.Notification;
import com.codeswallah.designpatterns.factorymethod.fixed.notif.SlackNotification;

public class SlackNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SlackNotification();
    }
}
