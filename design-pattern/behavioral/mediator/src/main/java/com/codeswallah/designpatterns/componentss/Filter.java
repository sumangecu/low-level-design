package com.codeswallah.designpatterns.componentss;

import com.codeswallah.designpatterns.mediator.Mediator;
import com.codeswallah.designpatterns.mediator.Note;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Filter extends JTextField implements Component {
    private Mediator mediator;

    /** Actual data to be searched into */
    private ListModel listModel;

    public Filter() {}

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        String start = getText();
        searchElements(start);
    }

    public void setList(ListModel listModel) {
        this.listModel = listModel;
    }

    private void searchElements(String s) {
        if (listModel == null) {
            return;
        }

        if (s.isEmpty()) {
            mediator.setElementsList(listModel);
            return;
        }

        ArrayList<Note> notes = new ArrayList<>();
        for (int i = 0; i < listModel.getSize(); ++i) {
            notes.add((Note) listModel.getElementAt(i));
        }

        DefaultListModel<Note> filteredList = new DefaultListModel<>();
        for (Note note : notes) {
            if (note.getName().contains(s)) {
                filteredList.addElement(note);
            }
        }
        mediator.setElementsList(filteredList);
    }

    @Override
    public String getName() {
        return "Filter";
    }
}
