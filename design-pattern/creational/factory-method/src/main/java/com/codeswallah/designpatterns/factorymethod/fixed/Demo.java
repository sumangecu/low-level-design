package com.codeswallah.dessignpatterns.factorymethod.fixed;

import com.codeswallah.designpatterns.factorymethod.fixed.crtr.EmailNotificationCreator;
import com.codeswallah.designpatterns.factorymethod.fixed.crtr.NotificationCreator;
import com.codeswallah.designpatterns.factorymethod.fixed.crtr.SMSNotificationCreator;

public class Demo {
    public static void main(String[] args) {
        NotificationCreator creator;

        creator = new EmailNotificationCreator();
        creator.sendNotification("Welcome to Factory Method.");

        creator = new SMSNotificationCreator();
        creator.sendNotification("This is your bot.");


    }
}
