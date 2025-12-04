package com.codeswallah.absfactory.fixed;

import com.codeswallah.designpatterns.absfactory.fixed.fctry.GUIFactory;
import com.codeswallah.designpatterns.absfactory.fixed.fctry.MacFactory;
import com.codeswallah.designpatterns.absfactory.fixed.fctry.WinFactory;

public class AppLauncher {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");

        GUIFactory factory;
        System.out.println("Detected system : " + os);
        if (os.contains("Windows")) {
            factory = new WinFactory();
        } else if (os.contains("Mac")) {
            factory = new MacFactory();
        } else {
            throw new RuntimeException("Unsupported OS !!");
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
