package com.codeswallah.dessignpatterns.factorymethod.raw;

public class SlackNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Slack notification being sent : " + message);
    }
}
