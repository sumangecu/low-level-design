package com.codeswallah.designpatterns.absfactory.fixed.fctry;

import com.codeswallah.designpatterns.absfactory.fixed.btn.Button;
import com.codeswallah.designpatterns.absfactory.fixed.btn.MacButton;
import com.codeswallah.designpatterns.absfactory.fixed.chk.Checkbox;
import com.codeswallah.designpatterns.absfactory.fixed.chk.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
