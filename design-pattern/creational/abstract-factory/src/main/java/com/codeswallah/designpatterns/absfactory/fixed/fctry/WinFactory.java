package com.codeswallah.designpatterns.absfactory.fixed.fctry;

import com.codeswallah.designpatterns.absfactory.fixed.btn.Button;
import com.codeswallah.designpatterns.absfactory.fixed.btn.WinButton;
import com.codeswallah.designpatterns.absfactory.fixed.chk.Checkbox;
import com.codeswallah.designpatterns.absfactory.fixed.chk.WinCheckbox;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
