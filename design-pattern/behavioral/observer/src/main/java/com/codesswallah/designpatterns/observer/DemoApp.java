package com.codesswallah.designpatterns.observer;

import com.codesswallah.designpatterns.observer.editor.Editor;
import com.codesswallah.designpatterns.observer.listeners.EmailNotificationListener;
import com.codesswallah.designpatterns.observer.listeners.LogOpenListener;

public class DemoApp {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.getEvents().subscribe("open", new LogOpenListener("dummy.txt"));
        editor.getEvents().subscribe("save", new EmailNotificationListener("admin@codeswallah.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
            editor.openFile("test2.txt");
            editor.saveFile();
            editor.saveFile();
        } catch (Exception ex) {
            System.out.println("Error while opening file : " + ex);
        }
    }
}
