package com.codeswallah.dessignpatterns.factorymethod.raw;

public class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending SMS notification : " + message);
    }
}
