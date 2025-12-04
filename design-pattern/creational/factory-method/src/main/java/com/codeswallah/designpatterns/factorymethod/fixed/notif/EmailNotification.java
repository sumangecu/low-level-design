package com.codeswallah.designpatterns.factorymethod.fixed.notif;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email notification : " + message);
    }
}
