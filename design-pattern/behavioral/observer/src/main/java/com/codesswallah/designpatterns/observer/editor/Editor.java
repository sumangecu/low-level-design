package com.codesswallah.designpatterns.observer.editor;

import com.codesswallah.designpatterns.observer.listeners.EventListener;
import com.codesswallah.designpatterns.observer.publisher.EventManager;

import java.io.File;

public class Editor {
    private EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Open a file first.");
        }
    }

    public EventManager getEvents() {
        return this.events;
    }
}
