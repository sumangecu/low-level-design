package com.codeswallah.absfactory.fixed.btn;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering MacOS button !!");
    }

    @Override
    public void onClick() {
        System.out.println("MacOS button clicked !!");
    }
}
