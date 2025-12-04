package com.codeswallah.designpatterns.absfactory.fixed.fctry;

import com.codeswallah.designpatterns.absfactory.fixed.btn.Button;
import com.codeswallah.designpatterns.absfactory.fixed.btn.LinuxButton;
import com.codeswallah.designpatterns.absfactory.fixed.chk.Checkbox;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return null;
    }
}
