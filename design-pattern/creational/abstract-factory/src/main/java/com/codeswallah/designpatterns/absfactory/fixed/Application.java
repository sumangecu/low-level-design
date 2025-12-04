package com.codeswallah.absfactory.fixed;

import com.codeswallah.designpatterns.absfactory.fixed.btn.Button;
import com.codeswallah.designpatterns.absfactory.fixed.chk.Checkbox;
import com.codeswallah.designpatterns.absfactory.fixed.fctry.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.paint();
        checkbox.paint();
    }
}
