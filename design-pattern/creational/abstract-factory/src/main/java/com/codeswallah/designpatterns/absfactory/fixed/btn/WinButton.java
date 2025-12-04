package com.codeswallah.designpatterns.absfactory.fixed.btn;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering Windows button !!");
    }

    @Override
    public void onClick() {
        System.out.println("Windows button clicked !!");
    }
}
