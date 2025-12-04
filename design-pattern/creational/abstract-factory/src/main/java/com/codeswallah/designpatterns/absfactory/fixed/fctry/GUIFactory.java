package com.codeswallah.absfactory.fixed.fctry;

import com.codeswallah.designpatterns.absfactory.fixed.btn.Button;
import com.codeswallah.designpatterns.absfactory.fixed.chk.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
