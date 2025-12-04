package com.codeswallah.dessignpatterns.factorymethod.fixed.notif;

public class SlackNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SLACK notification : " + message);
    }
}
