package com.codeswallah.designpatterns.factorymethod.raw;

public class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending an email notification. : " + message);
    }
}
