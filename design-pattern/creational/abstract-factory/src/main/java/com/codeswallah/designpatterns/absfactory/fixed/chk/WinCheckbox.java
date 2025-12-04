package com.codeswallah.designpatterns.absfactory.fixed.chk;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering Windows checkbox !!");
    }

    @Override
    public void onSelect() {
        System.out.println("Windows checkbox is selected !!");
    }
}
