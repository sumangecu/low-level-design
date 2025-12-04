package com.codeswallah.designpatterns.absfactory.fixed.chk;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering MacOS checkbox !!");
    }

    @Override
    public void onSelect() {
        System.out.println("MacOS checkbox is selected !!");
    }
}
