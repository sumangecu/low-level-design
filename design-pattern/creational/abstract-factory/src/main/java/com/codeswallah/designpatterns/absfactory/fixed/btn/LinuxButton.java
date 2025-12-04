package com.codeswallah.designpatterns.absfactory.fixed.btn;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("Linux button is being rendered !!");
    }

    @Override
    public void onClick() {
        System.out.println("Linux button is clicked !!");
    }
}
