package com.codeswallah.designpatterns.bridge;

import com.codeswallah.designpatterns.bridge.devices.Device;
import com.codeswallah.designpatterns.bridge.devices.Radio;
import com.codeswallah.designpatterns.bridge.devices.TV;
import com.codeswallah.designpatterns.bridge.remotes.AdvancedRemote;
import com.codeswallah.designpatterns.bridge.remotes.BasicRemote;

public class DemoApp {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        basicRemote.volumeUp();
        device.printStatus();

        basicRemote.channelUp();
        basicRemote.channelUp();
        basicRemote.channelUp();
        basicRemote.channelUp();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        device.printStatus();

        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
