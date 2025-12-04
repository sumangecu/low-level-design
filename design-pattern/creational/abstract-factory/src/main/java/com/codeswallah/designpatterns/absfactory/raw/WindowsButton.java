package com.codeswallah.designpatterns.absfactory.raw;

public class WindowsButton {
    public void paint() {
        System.out.println("Rendering a Windows button !!");
    }

    public void onClick() {
        System.out.println("Windows button clicked !!");
    }
}
