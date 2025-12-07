package com.codeswallah.dessignpatterns.composite;

import com.codeswallah.dessignpatterns.composite.editor.ImageEditor;
import com.codeswallah.dessignpatterns.composite.shapes.Circle;
import com.codeswallah.dessignpatterns.composite.shapes.CompoundShape;
import com.codeswallah.dessignpatterns.composite.shapes.Dot;
import com.codeswallah.dessignpatterns.composite.shapes.Rectangle;

import java.awt.*;

public class DemoApp {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),
                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
