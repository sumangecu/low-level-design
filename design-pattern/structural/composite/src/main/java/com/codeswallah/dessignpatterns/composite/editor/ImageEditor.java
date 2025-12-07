package com.codeswallah.dessignpatterns.composite.editor;

import com.codeswallah.dessignpatterns.composite.shapes.CompoundShape;
import com.codeswallah.dessignpatterns.composite.shapes.Shape;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;

public class ImageEditor {
    private EditorCanvas canvas;
    private CompoundShape allShapes = new CompoundShape();

    public ImageEditor() {
        canvas = new EditorCanvas();
    }

    public void loadShapes(Shape... shapes) {
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }

    private class EditorCanvas extends JPanel {
        JFrame frame;
        private static final int PADDING = 10;

        public EditorCanvas() {
            createFrame();
            refresh();
            addMouseListener(new MouseInputAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    allShapes.unSelect();
                    allShapes.selectChildAt(e.getX(), e.getY());
                    e.getComponent().repaint();
                }
            });
        }

        void createFrame() {
            Border padding = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
            this.setBorder(padding);
            this.setBackground(Color.LIGHT_GRAY);
            this.setPreferredSize(new Dimension(1000, 800));

            frame = new JFrame();
            frame.setContentPane(this);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }

        public int getWidth() {
            return allShapes.getX() + allShapes.getWidth() + PADDING;
        }

        public int getHeight() {
            return allShapes.getY() + allShapes.getHeight() + PADDING;
        }

        void refresh() {
            this.setSize(getWidth(), getHeight());
            frame.pack();
        }

        @Override
        public void paint(Graphics g) {
            allShapes.paint(g);
        }
    }
}
