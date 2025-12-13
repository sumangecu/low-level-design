package com.codeswallah.designpatterns;

import com.codeswallah.designpatterns.componentss.*;
import com.codeswallah.designpatterns.mediator.Editor;
import com.codeswallah.designpatterns.mediator.Mediator;

import javax.swing.*;

public class DemoApp {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
